package com.android.tools.fd.runtime;

import android.content.Context;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FileManager {
    public static final String CLASSES_DEX_SUFFIX = ".dex";
    private static final String FILE_NAME_ACTIVE = "active";
    private static final String FOLDER_NAME_LEFT = "left";
    private static final String FOLDER_NAME_RIGHT = "right";
    private static final String RELOAD_DEX_PREFIX = "reload";
    private static final String RESOURCE_FILE_NAME = "resources.ap_";
    private static final String RESOURCE_FOLDER_NAME = "resources";
    private static final boolean USE_EXTRACTED_RESOURCES = false;
    private static boolean sHavePurgedTempDexFolder;

    private static File getDataFolder() {
        return new File(Paths.getDataDirectory(AppInfo.applicationId));
    }

    private static File getResourceFile(File base) {
        return new File(base, "resources.ap_");
    }

    private static File getDexFileFolder(File base, boolean createIfNecessary) {
        File file = new File(base, Paths.DEX_DIRECTORY_NAME);
        if (!createIfNecessary || file.isDirectory() || file.mkdirs()) {
            return file;
        }
        Log.e(BootstrapApplication.LOG_TAG, "Failed to create directory " + file);
        return null;
    }

    private static File getTempDexFileFolder(File base) {
        return new File(base, "dex-temp");
    }

    public static File getNativeLibraryFolder() {
        return new File(Paths.getMainApkDataDirectory(AppInfo.applicationId), "lib");
    }

    public static File getReadFolder() {
        return new File(getDataFolder(), leftIsActive() ? FOLDER_NAME_LEFT : FOLDER_NAME_RIGHT);
    }

    public static void swapFolders() {
        setLeftActive(!leftIsActive());
    }

    public static File getWriteFolder(boolean wipe) {
        File folder = new File(getDataFolder(), leftIsActive() ? FOLDER_NAME_RIGHT : FOLDER_NAME_LEFT);
        if (wipe && folder.exists()) {
            delete(folder);
            if (!folder.mkdirs()) {
                Log.e(BootstrapApplication.LOG_TAG, "Failed to create folder " + folder);
            }
        }
        return folder;
    }

    private static void delete(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File child : files) {
                    delete(child);
                }
            }
        }
        if (!file.delete()) {
            Log.e(BootstrapApplication.LOG_TAG, "Failed to delete file " + file);
        }
    }

    private static boolean leftIsActive() {
        BufferedReader reader;
        File pointer = new File(getDataFolder(), FILE_NAME_ACTIVE);
        if (!pointer.exists()) {
            return true;
        }
        try {
            reader = new BufferedReader(new FileReader(pointer));
            boolean equals = FOLDER_NAME_LEFT.equals(reader.readLine());
            reader.close();
            return equals;
        } catch (IOException e) {
            return true;
        } catch (Throwable th) {
            reader.close();
            throw th;
        }
    }

    private static void setLeftActive(boolean active) {
        Writer writer;
        File folder = getDataFolder();
        File pointer = new File(folder, FILE_NAME_ACTIVE);
        if (pointer.exists()) {
            if (!pointer.delete()) {
                Log.e(BootstrapApplication.LOG_TAG, "Failed to delete file " + pointer);
            }
        } else if (!folder.exists()) {
            if (!folder.mkdirs()) {
                Log.e(BootstrapApplication.LOG_TAG, "Failed to create directory " + folder);
                return;
            }
            return;
        }
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pointer), "UTF-8"));
            writer.write(active ? FOLDER_NAME_LEFT : FOLDER_NAME_RIGHT);
            writer.close();
        } catch (IOException e) {
        } catch (Throwable th) {
            writer.close();
            throw th;
        }
    }

    public static void checkInbox() {
        File inbox = new File(Paths.getInboxDirectory(AppInfo.applicationId));
        if (inbox.isDirectory()) {
            File resources = new File(inbox, "resources.ap_");
            if (resources.isFile()) {
                if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                    Log.v(BootstrapApplication.LOG_TAG, "Processing resource file from inbox (" + resources + ")");
                }
                byte[] bytes = readRawBytes(resources);
                if (bytes != null) {
                    startUpdate();
                    writeAaptResources("resources.ap_", bytes);
                    finishUpdate(true);
                    if (!resources.delete() && Log.isLoggable(BootstrapApplication.LOG_TAG, 6)) {
                        Log.e(BootstrapApplication.LOG_TAG, "Couldn't remove inbox resource file: " + resources);
                    }
                }
            }
        }
    }

    public static File getExternalResourceFile() {
        File file = getResourceFile(getReadFolder());
        if (file.exists()) {
            return file;
        }
        if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
            Log.v(BootstrapApplication.LOG_TAG, "Cannot find external resources, not patching them in");
        }
        return null;
    }

    public static List<String> getDexList(Context context, long apkModified) {
        File[] dexFiles;
        File[] arr$;
        File dataFolder = getDataFolder();
        long newestHotswapPatch = getMostRecentTempDexTime(dataFolder);
        File dexFolder = getDexFileFolder(dataFolder, false);
        boolean extractedSlices = false;
        if (dexFolder == null || !dexFolder.isDirectory()) {
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, "No local dex slice folder: First run since installation.");
            }
            dexFolder = getDexFileFolder(dataFolder, true);
            if (dexFolder == null) {
                Log.wtf(BootstrapApplication.LOG_TAG, "Couldn't create dex code folder");
                return Collections.emptyList();
            }
            dexFiles = extractSlices(dexFolder, null, -1);
            extractedSlices = dexFiles.length > 0;
        } else {
            dexFiles = dexFolder.listFiles();
        }
        if (dexFiles == null || dexFiles.length == 0) {
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, "Cannot find dex classes, not patching them in");
            }
            return Collections.emptyList();
        }
        long newestColdswapPatch = apkModified;
        if (!extractedSlices && dexFiles.length > 0) {
            long oldestColdSwapPatch = apkModified;
            for (File dex : dexFiles) {
                long dexModified = dex.lastModified();
                oldestColdSwapPatch = Math.min(dexModified, oldestColdSwapPatch);
                newestColdswapPatch = Math.max(dexModified, newestColdswapPatch);
            }
            if (oldestColdSwapPatch < apkModified) {
                if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                    Log.v(BootstrapApplication.LOG_TAG, "One or more slices were older than APK: extracting newer slices");
                }
                dexFiles = extractSlices(dexFolder, dexFiles, apkModified);
            }
        } else if (newestHotswapPatch > 0) {
            purgeTempDexFiles(dataFolder);
        }
        if (newestHotswapPatch > newestColdswapPatch) {
            String message = "Your app does not have the latest code changes because it was restarted manually. Please run from IDE instead.";
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, message);
            }
            Restarter.showToastWhenPossible(context, message);
        }
        List<String> list = new ArrayList<>(dexFiles.length);
        for (File dex2 : dexFiles) {
            if (dex2.getName().endsWith(CLASSES_DEX_SUFFIX)) {
                list.add(dex2.getPath());
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }

    private static File[] extractSlices(File dexFolder, File[] dexFolderFiles, long apkModified) {
        File[] arr$;
        BufferedOutputStream bufferedOutputStream;
        if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
            Log.v(BootstrapApplication.LOG_TAG, "Extracting slices into " + dexFolder);
        }
        InputStream stream = BootstrapApplication.class.getResourceAsStream("/instant-run.zip");
        if (stream == null) {
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 6)) {
                Log.e(BootstrapApplication.LOG_TAG, "Could not find slices in APK; aborting.");
            }
            return new File[0];
        }
        ArrayList arrayList = new ArrayList(30);
        HashSet hashSet = new HashSet(30);
        try {
            ZipInputStream zipInputStream = new ZipInputStream(stream);
            try {
                byte[] buffer = new byte[2000];
                for (ZipEntry entry = zipInputStream.getNextEntry(); entry != null; entry = zipInputStream.getNextEntry()) {
                    String name = entry.getName();
                    if (!name.startsWith("META-INF") && !entry.isDirectory() && name.indexOf(47) == -1 && name.endsWith(CLASSES_DEX_SUFFIX)) {
                        String sliceName = Paths.DEX_SLICE_PREFIX + name;
                        hashSet.add(sliceName);
                        File dest = new File(dexFolder, sliceName);
                        arrayList.add(dest);
                        if (apkModified <= 0 || dest.lastModified() <= apkModified) {
                            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                                Log.v(BootstrapApplication.LOG_TAG, "Extracting slice " + name + " into " + dest);
                            }
                            File parent = dest.getParentFile();
                            if (parent == null || parent.exists() || parent.mkdirs()) {
                                FileOutputStream fileOutputStream = new FileOutputStream(dest);
                                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                                while (true) {
                                    int bytesRead = zipInputStream.read(buffer);
                                    if (bytesRead == -1) {
                                        break;
                                    }
                                    bufferedOutputStream.write(buffer, 0, bytesRead);
                                }
                                bufferedOutputStream.close();
                                if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                                    Log.v(BootstrapApplication.LOG_TAG, "File written at " + System.currentTimeMillis());
                                    Log.v(BootstrapApplication.LOG_TAG, "File last modified reported : " + dest.lastModified());
                                }
                            } else {
                                Log.wtf(BootstrapApplication.LOG_TAG, "Failed to create directory " + dest);
                                File[] fileArr = new File[0];
                                try {
                                    zipInputStream.close();
                                } catch (IOException e) {
                                }
                                try {
                                    return fileArr;
                                } catch (IOException e2) {
                                    return fileArr;
                                }
                            }
                        } else if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                            Log.v(BootstrapApplication.LOG_TAG, "Ignoring slice " + name + ": newer on disk than in APK");
                        }
                    }
                }
                if (dexFolderFiles != null) {
                    for (File file : dexFolderFiles) {
                        if (!hashSet.contains(file.getName())) {
                            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                                Log.v(BootstrapApplication.LOG_TAG, "Removing old slice " + file);
                            }
                            if (!file.delete() && Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                                Log.v(BootstrapApplication.LOG_TAG, "Could not delete " + file);
                            }
                        }
                    }
                }
                File[] fileArr2 = (File[]) arrayList.toArray(new File[arrayList.size()]);
                try {
                    zipInputStream.close();
                } catch (IOException e3) {
                }
                try {
                    stream.close();
                    return fileArr2;
                } catch (IOException e4) {
                    return fileArr2;
                }
            } catch (IOException ioe) {
                Log.wtf(BootstrapApplication.LOG_TAG, "Failed to extract slices into directory " + dexFolder, ioe);
                File[] fileArr3 = new File[0];
                try {
                    zipInputStream.close();
                } catch (IOException e5) {
                }
                try {
                    stream.close();
                    return fileArr3;
                } catch (IOException e6) {
                    return fileArr3;
                }
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                } catch (IOException e7) {
                }
                throw th;
            }
        } finally {
            try {
                stream.close();
            } catch (IOException e8) {
            }
        }
    }

    public static File getTempDexFile() {
        File dataFolder = getDataFolder();
        File dexFolder = getTempDexFileFolder(dataFolder);
        if (!dexFolder.exists()) {
            if (!dexFolder.mkdirs()) {
                Log.e(BootstrapApplication.LOG_TAG, "Failed to create directory " + dexFolder);
                return null;
            }
        } else if (!sHavePurgedTempDexFolder) {
            purgeTempDexFiles(dataFolder);
        }
        File[] files = dexFolder.listFiles();
        int max = -1;
        if (files != null) {
            for (File file : files) {
                String name = file.getName();
                if (name.startsWith(RELOAD_DEX_PREFIX) && name.endsWith(CLASSES_DEX_SUFFIX)) {
                    try {
                        int version = Integer.decode(name.substring(RELOAD_DEX_PREFIX.length(), name.length() - CLASSES_DEX_SUFFIX.length())).intValue();
                        if (version > max) {
                            max = version;
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }
        }
        File file2 = new File(dexFolder, String.format("%s0x%04x%s", new Object[]{RELOAD_DEX_PREFIX, Integer.valueOf(max + 1), CLASSES_DEX_SUFFIX}));
        if (!Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
            return file2;
        }
        Log.v(BootstrapApplication.LOG_TAG, "Writing new dex file: " + file2);
        return file2;
    }

    public static boolean writeRawBytes(File destination, byte[] bytes) {
        BufferedOutputStream output;
        try {
            output = new BufferedOutputStream(new FileOutputStream(destination));
            output.write(bytes);
            output.flush();
            output.close();
            return true;
        } catch (IOException ioe) {
            Log.wtf(BootstrapApplication.LOG_TAG, "Failed to write file, clean project and rebuild " + destination, ioe);
            throw new RuntimeException(String.format("InstantRun could not write file %1$s, clean project and rebuild ", new Object[]{destination}));
        } catch (Throwable th) {
            output.close();
            throw th;
        }
    }

    public static boolean extractZip(File destination, byte[] zipBytes) {
        return extractZip(destination, new ByteArrayInputStream(zipBytes));
    }

    public static boolean extractZip(File destDir, InputStream inputStream) {
        OutputStream src;
        boolean z = false;
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        try {
            byte[] buffer = new byte[2000];
            ZipEntry entry = zipInputStream.getNextEntry();
            while (true) {
                if (entry != null) {
                    String name = entry.getName();
                    if (!name.startsWith("META-INF") && !entry.isDirectory()) {
                        File dest = new File(destDir, name);
                        File parent = dest.getParentFile();
                        if (parent == null || parent.exists() || parent.mkdirs()) {
                            src = new BufferedOutputStream(new FileOutputStream(dest));
                            while (true) {
                                int bytesRead = zipInputStream.read(buffer);
                                if (bytesRead == -1) {
                                    break;
                                }
                                src.write(buffer, 0, bytesRead);
                            }
                            src.close();
                        } else {
                            Log.e(BootstrapApplication.LOG_TAG, "Failed to create directory " + dest);
                            try {
                                zipInputStream.close();
                                break;
                            } catch (IOException e) {
                            }
                        }
                    }
                    entry = zipInputStream.getNextEntry();
                } else {
                    z = true;
                    try {
                        zipInputStream.close();
                        break;
                    } catch (IOException e2) {
                    }
                }
            }
        } catch (IOException ioe) {
            try {
                Log.e(BootstrapApplication.LOG_TAG, "Failed to extract zip contents into directory " + destDir, ioe);
            } finally {
                try {
                    zipInputStream.close();
                } catch (IOException e3) {
                }
            }
        } catch (Throwable th) {
            src.close();
            throw th;
        }
        return z;
    }

    public static void startUpdate() {
        getWriteFolder(true);
    }

    public static void finishUpdate(boolean wroteResources) {
        if (wroteResources) {
            swapFolders();
        }
    }

    public static File writeDexShard(byte[] bytes, String name) {
        File dexFolder = getDexFileFolder(getDataFolder(), true);
        if (dexFolder == null) {
            return null;
        }
        File file = new File(dexFolder, name);
        writeRawBytes(file, bytes);
        return file;
    }

    public static void writeAaptResources(String relativePath, byte[] bytes) {
        File file = getResourceFile(getWriteFolder(false));
        File folder = file.getParentFile();
        if (folder.isDirectory() || folder.mkdirs()) {
            if (relativePath.equals("resources.ap_")) {
                writeRawBytes(file, bytes);
            } else {
                writeRawBytes(file, bytes);
            }
        } else if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
            Log.v(BootstrapApplication.LOG_TAG, "Cannot create local resource file directory " + folder);
        }
    }

    public static String writeTempDexFile(byte[] bytes) {
        File file = getTempDexFile();
        if (file != null) {
            writeRawBytes(file, bytes);
            return file.getPath();
        }
        Log.e(BootstrapApplication.LOG_TAG, "No file to write temp dex content to");
        return null;
    }

    public static long getMostRecentTempDexTime(File dataFolder) {
        File[] arr$;
        long newest = 0;
        File dexFolder = getTempDexFileFolder(dataFolder);
        if (dexFolder.isDirectory()) {
            File[] files = dexFolder.listFiles();
            if (files != null) {
                newest = 0;
                for (File file : files) {
                    if (file.getPath().endsWith(CLASSES_DEX_SUFFIX)) {
                        newest = Math.max(newest, file.lastModified());
                    }
                }
            }
        }
        return newest;
    }

    public static void purgeTempDexFiles(File dataFolder) {
        File[] arr$;
        sHavePurgedTempDexFolder = true;
        File dexFolder = getTempDexFileFolder(dataFolder);
        if (dexFolder.isDirectory()) {
            File[] files = dexFolder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.getPath().endsWith(CLASSES_DEX_SUFFIX) && !file.delete()) {
                        Log.e(BootstrapApplication.LOG_TAG, "Could not delete temp dex file " + file);
                    }
                }
            }
        }
    }

    public static long getFileSize(String path) {
        if (path.equals("resources.ap_")) {
            File file = getExternalResourceFile();
            if (file != null) {
                return file.length();
            }
        }
        return -1;
    }

    public static byte[] getCheckSum(String path) {
        if (path.equals("resources.ap_")) {
            File file = getExternalResourceFile();
            if (file != null) {
                return getCheckSum(file);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return null;
     */
    public static byte[] getCheckSum(File file) {
        BufferedInputStream input;
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] buffer = new byte[4096];
            input = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int read = input.read(buffer);
                if (read == -1) {
                    byte[] digest2 = digest.digest();
                    input.close();
                    return digest2;
                }
                digest.update(buffer, 0, read);
            }
        } catch (NoSuchAlgorithmException e) {
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 6)) {
                Log.e(BootstrapApplication.LOG_TAG, "Couldn't look up message digest", e);
            }
        } catch (IOException ioe) {
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 6)) {
                Log.e(BootstrapApplication.LOG_TAG, "Failed to read file " + file, ioe);
            }
        } catch (Throwable t) {
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 6)) {
                Log.e(BootstrapApplication.LOG_TAG, "Unexpected checksum exception", t);
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public static byte[] readRawBytes(File source) {
        BufferedInputStream input;
        try {
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, "Reading the bytes for file " + source);
            }
            long length = source.length();
            if (length > 2147483647L) {
                if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                    Log.v(BootstrapApplication.LOG_TAG, "File too large (" + length + ")");
                }
                return null;
            }
            byte[] result = new byte[((int) length)];
            input = new BufferedInputStream(new FileInputStream(source));
            int index = 0;
            int remaining = result.length - 0;
            while (remaining > 0) {
                int numRead = input.read(result, index, remaining);
                if (numRead == -1) {
                    break;
                }
                index += numRead;
                remaining -= numRead;
            }
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, "Returning length " + result.length + " for file " + source);
            }
            input.close();
            return result;
        } catch (IOException ioe) {
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 6)) {
                Log.e(BootstrapApplication.LOG_TAG, "Failed to read file " + source, ioe);
            }
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, "I/O error, no bytes returned for " + source);
            }
            return null;
        } catch (Throwable th) {
            input.close();
            throw th;
        }
    }
}
