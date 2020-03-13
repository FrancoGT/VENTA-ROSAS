package com.android.tools.fd.runtime;

import android.app.Activity;
import android.app.Application;
import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.util.Log;
import com.android.tools.fd.common.ProtocolConstants;
import dalvik.system.DexClassLoader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

public class Server {
    private static final boolean POST_ALIVE_STATUS = false;
    private static final boolean RESTART_LOCALLY = false;
    /* access modifiers changed from: private */
    public static int sWrongTokenCount;
    /* access modifiers changed from: private */
    public final Application mApplication;
    /* access modifiers changed from: private */
    public LocalServerSocket mServerSocket;

    private class SocketServerReplyThread extends Thread {
        private final LocalSocket mSocket;

        SocketServerReplyThread(LocalSocket socket) {
            this.mSocket = socket;
        }

        public void run() {
            DataInputStream input;
            DataOutputStream output;
            try {
                input = new DataInputStream(this.mSocket.getInputStream());
                output = new DataOutputStream(this.mSocket.getOutputStream());
                handle(input, output);
                try {
                    input.close();
                } catch (IOException e) {
                }
                try {
                    output.close();
                } catch (IOException e2) {
                }
            } catch (IOException e3) {
                if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                    Log.v(BootstrapApplication.LOG_TAG, "Fatal error receiving messages", e3);
                }
            } catch (Throwable th) {
                try {
                    input.close();
                } catch (IOException e4) {
                }
                try {
                    output.close();
                } catch (IOException e5) {
                }
                throw th;
            }
        }

        /* JADX WARNING: CFG modification limit reached, blocks count: 161 */
        private void handle(DataInputStream input, DataOutputStream output) throws IOException {
            boolean active;
            long magic = input.readLong();
            if (magic != ProtocolConstants.PROTOCOL_IDENTIFIER) {
                Log.w(BootstrapApplication.LOG_TAG, "Unrecognized header format " + Long.toHexString(magic));
            } else {
                int version = input.readInt();
                output.writeInt(4);
                if (version != 4) {
                    Log.w(BootstrapApplication.LOG_TAG, "Mismatched protocol versions; app is using version 4 and tool is using version " + version);
                } else {
                    do {
                        int message = input.readInt();
                        switch (message) {
                            case 1:
                                if (authenticate(input)) {
                                    List<ApplicationPatch> changes = ApplicationPatch.read(input);
                                    if (changes != null) {
                                        boolean hasResources = Server.hasResources(changes);
                                        int updateMode = Server.this.handlePatches(changes, hasResources, input.readInt());
                                        boolean showToast = input.readBoolean();
                                        output.writeBoolean(true);
                                        Server.this.restart(updateMode, hasResources, showToast);
                                    }
                                }
                                break;
                            case 2:
                                active = Restarter.getForegroundActivity(Server.this.mApplication) != null;
                                output.writeBoolean(active);
                                break;
                            case 3:
                                String path = input.readUTF();
                                long size = FileManager.getFileSize(path);
                                output.writeLong(size);
                                if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                                    Log.v(BootstrapApplication.LOG_TAG, "Received path-exists(" + path + ") from the " + "IDE; returned size=" + size);
                                }
                            case 4:
                                long begin = System.currentTimeMillis();
                                String path2 = input.readUTF();
                                byte[] checksum = FileManager.getCheckSum(path2);
                                if (checksum != null) {
                                    output.writeInt(checksum.length);
                                    output.write(checksum);
                                    if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                                        long end = System.currentTimeMillis();
                                        BigInteger bigInteger = new BigInteger(1, checksum);
                                        Log.v(BootstrapApplication.LOG_TAG, "Received checksum(" + path2 + ") from the " + "IDE: took " + (end - begin) + "ms to compute " + bigInteger.toString(16));
                                    }
                                } else {
                                    output.writeInt(0);
                                    if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                                        Log.v(BootstrapApplication.LOG_TAG, "Received checksum(" + path2 + ") from the " + "IDE: returning <null>");
                                    }
                                }
                            case 5:
                                if (authenticate(input)) {
                                    Activity activity = Restarter.getForegroundActivity(Server.this.mApplication);
                                    if (activity != null) {
                                        if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                                            Log.v(BootstrapApplication.LOG_TAG, "Restarting activity per user request");
                                        }
                                        Restarter.restartActivityOnUiThread(activity);
                                    }
                                }
                                break;
                            case 6:
                                String text = input.readUTF();
                                Activity foreground = Restarter.getForegroundActivity(Server.this.mApplication);
                                if (foreground != null) {
                                    Restarter.showToast(foreground, text);
                                } else if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                                    Log.v(BootstrapApplication.LOG_TAG, "Couldn't show toast (no activity) : " + text);
                                }
                            case 7:
                                if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                                    Log.v(BootstrapApplication.LOG_TAG, "Received EOF from the IDE");
                                    break;
                                }
                                break;
                            default:
                                if (Log.isLoggable(BootstrapApplication.LOG_TAG, 6)) {
                                    Log.e(BootstrapApplication.LOG_TAG, "Unexpected message type: " + message);
                                    break;
                                }
                                break;
                        }
                    } while (!Log.isLoggable(BootstrapApplication.LOG_TAG, 2));
                    Log.v(BootstrapApplication.LOG_TAG, "Received Ping message from the IDE; returned active = " + active);
                }
            }
        }

        private boolean authenticate(DataInputStream input) throws IOException {
            long token = input.readLong();
            if (token == AppInfo.token) {
                return true;
            }
            Log.w(BootstrapApplication.LOG_TAG, "Mismatched identity token from client; received " + token + " and expected " + AppInfo.token);
            Server.access$208();
            return false;
        }
    }

    private class SocketServerThread extends Thread {
        private SocketServerThread() {
        }

        public void run() {
            while (true) {
                try {
                    LocalServerSocket serverSocket = Server.this.mServerSocket;
                    if (serverSocket != null) {
                        LocalSocket socket = serverSocket.accept();
                        if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                            Log.v(BootstrapApplication.LOG_TAG, "Received connection from IDE: spawning connection thread");
                        }
                        new SocketServerReplyThread(socket).run();
                        if (Server.sWrongTokenCount > 50) {
                            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                                Log.v(BootstrapApplication.LOG_TAG, "Stopping server: too many wrong token connections");
                            }
                            Server.this.mServerSocket.close();
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable e) {
                    if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                        Log.v(BootstrapApplication.LOG_TAG, "Fatal error accepting connection on local socket", e);
                    }
                }
            }
        }
    }

    static /* synthetic */ int access$208() {
        int i = sWrongTokenCount;
        sWrongTokenCount = i + 1;
        return i;
    }

    public static void create(String packageName, Application application) {
        new Server(packageName, application);
    }

    private Server(String packageName, Application application) {
        this.mApplication = application;
        try {
            this.mServerSocket = new LocalServerSocket(packageName);
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, "Starting server socket listening for package " + packageName + " on " + this.mServerSocket.getLocalSocketAddress());
            }
            startServer();
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, "Started server for package " + packageName);
            }
        } catch (IOException e) {
            Log.e(BootstrapApplication.LOG_TAG, "IO Error creating local socket at " + packageName, e);
        }
    }

    private void startServer() {
        try {
            new Thread(new SocketServerThread()).start();
        } catch (Throwable e) {
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 6)) {
                Log.e(BootstrapApplication.LOG_TAG, "Fatal error starting Instant Run server", e);
            }
        }
    }

    private static boolean isResourcePath(String path) {
        return path.equals(Paths.RESOURCE_FILE_NAME) || path.startsWith("res/");
    }

    /* access modifiers changed from: private */
    public static boolean hasResources(List<ApplicationPatch> changes) {
        for (ApplicationPatch change : changes) {
            if (isResourcePath(change.getPath())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public int handlePatches(List<ApplicationPatch> changes, boolean hasResources, int updateMode) {
        if (hasResources) {
            FileManager.startUpdate();
        }
        for (ApplicationPatch change : changes) {
            String path = change.getPath();
            if (path.endsWith(FileManager.CLASSES_DEX_SUFFIX)) {
                handleColdSwapPatch(change);
                boolean canHotSwap = false;
                Iterator i$ = changes.iterator();
                while (true) {
                    if (i$.hasNext()) {
                        if (((ApplicationPatch) i$.next()).getPath().equals(Paths.RELOAD_DEX_FILE_NAME)) {
                            canHotSwap = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!canHotSwap) {
                    updateMode = 3;
                }
            } else if (path.equals(Paths.RELOAD_DEX_FILE_NAME)) {
                updateMode = handleHotSwapPatch(updateMode, change);
            } else if (isResourcePath(path)) {
                updateMode = handleResourcePatch(updateMode, change, path);
            }
        }
        if (hasResources) {
            FileManager.finishUpdate(true);
        }
        return updateMode;
    }

    private static int handleResourcePatch(int updateMode, ApplicationPatch patch, String path) {
        if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
            Log.v(BootstrapApplication.LOG_TAG, "Received resource changes (" + path + ")");
        }
        FileManager.writeAaptResources(path, patch.getBytes());
        return Math.max(updateMode, 2);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    private int handleHotSwapPatch(int updateMode, ApplicationPatch patch) {
        if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
            Log.v(BootstrapApplication.LOG_TAG, "Received incremental code patch");
        }
        try {
            String dexFile = FileManager.writeTempDexFile(patch.getBytes());
            if (dexFile == null) {
                Log.e(BootstrapApplication.LOG_TAG, "No file to write the code to");
                return updateMode;
            }
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, "Reading live code from " + dexFile);
            }
            Class<?> aClass = Class.forName("com.android.tools.fd.runtime.AppPatchesLoaderImpl", true, new DexClassLoader(dexFile, this.mApplication.getCacheDir().getPath(), FileManager.getNativeLibraryFolder().getPath(), getClass().getClassLoader()));
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, "Got the patcher class " + aClass);
            }
            PatchesLoader loader = (PatchesLoader) aClass.newInstance();
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, "Got the patcher instance " + loader);
            }
            String[] getPatchedClasses = (String[]) aClass.getDeclaredMethod("getPatchedClasses", new Class[0]).invoke(loader, new Object[0]);
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, "Got the list of classes ");
                String[] arr$ = getPatchedClasses;
                int len$ = arr$.length;
                for (int i$ = 0; i$ < len$; i$++) {
                    Log.v(BootstrapApplication.LOG_TAG, "class " + arr$[i$]);
                }
            }
            if (!loader.load()) {
                updateMode = 3;
            }
            return updateMode;
        } catch (Exception e) {
            Log.e(BootstrapApplication.LOG_TAG, "Couldn't apply code changes", e);
            e.printStackTrace();
            updateMode = 3;
        } catch (Throwable e2) {
            Log.e(BootstrapApplication.LOG_TAG, "Couldn't apply code changes", e2);
            updateMode = 3;
        }
    }

    private static void handleColdSwapPatch(ApplicationPatch patch) {
        if (patch.path.startsWith(Paths.DEX_SLICE_PREFIX)) {
            File file = FileManager.writeDexShard(patch.getBytes(), patch.path);
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, "Received dex shard " + file);
            }
        }
    }

    /* access modifiers changed from: private */
    public void restart(int updateMode, boolean incrementalResources, boolean toast) {
        if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
            Log.v(BootstrapApplication.LOG_TAG, "Finished loading changes; update mode =" + updateMode);
        }
        if (updateMode == 0 || updateMode == 1) {
            if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, "Applying incremental code without restart");
            }
            if (toast) {
                Activity foreground = Restarter.getForegroundActivity(this.mApplication);
                if (foreground != null) {
                    Restarter.showToast(foreground, "Applied code changes without activity restart");
                } else if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                    Log.v(BootstrapApplication.LOG_TAG, "Couldn't show toast: no activity found");
                }
            }
        } else {
            List<Activity> activities = Restarter.getActivities(this.mApplication, false);
            if (incrementalResources && updateMode == 2) {
                File file = FileManager.getExternalResourceFile();
                if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                    Log.v(BootstrapApplication.LOG_TAG, "About to update resource file=" + file + ", activities=" + activities);
                }
                if (file != null) {
                    String resources = file.getPath();
                    MonkeyPatcher.monkeyPatchApplication(this.mApplication, null, null, resources);
                    MonkeyPatcher.monkeyPatchExistingResources(this.mApplication, resources, activities);
                } else {
                    Log.e(BootstrapApplication.LOG_TAG, "No resource file found to apply");
                    updateMode = 3;
                }
            }
            Activity activity = Restarter.getForegroundActivity(this.mApplication);
            if (updateMode == 2) {
                if (activity != null) {
                    if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                        Log.v(BootstrapApplication.LOG_TAG, "Restarting activity only!");
                    }
                    boolean handledRestart = false;
                    try {
                        Object result = activity.getClass().getMethod("onHandleCodeChange", new Class[]{Long.TYPE}).invoke(activity, new Object[]{Long.valueOf(0)});
                        if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                            Log.v(BootstrapApplication.LOG_TAG, "Activity " + activity + " provided manual restart method; return " + result);
                        }
                        if (Boolean.TRUE.equals(result)) {
                            handledRestart = true;
                            if (toast) {
                                Restarter.showToast(activity, "Applied changes");
                            }
                        }
                    } catch (Throwable th) {
                    }
                    if (!handledRestart) {
                        if (toast) {
                            Restarter.showToast(activity, "Applied changes, restarted activity");
                        }
                        Restarter.restartActivityOnUiThread(activity);
                        return;
                    }
                    return;
                }
                if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                    Log.v(BootstrapApplication.LOG_TAG, "No activity found, falling through to do a full app restart");
                }
                updateMode = 3;
            }
            if (updateMode != 3) {
                if (Log.isLoggable(BootstrapApplication.LOG_TAG, 6)) {
                    Log.e(BootstrapApplication.LOG_TAG, "Unexpected update mode: " + updateMode);
                }
            } else if (Log.isLoggable(BootstrapApplication.LOG_TAG, 2)) {
                Log.v(BootstrapApplication.LOG_TAG, "Waiting for app to be killed and restarted by the IDE...");
            }
        }
    }
}
