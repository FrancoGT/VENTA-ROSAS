package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private static HashMap<String, PathStrategy> sCache = new HashMap<>();
    private PathStrategy mStrategy;

    interface PathStrategy {
        File getFileForUri(Uri uri);

        Uri getUriForFile(File file);
    }

    static class SimplePathStrategy implements PathStrategy {
        private final String mAuthority;
        private final HashMap<String, File> mRoots = new HashMap<>();

        public SimplePathStrategy(String authority) {
            this.mAuthority = authority;
        }

        public void addRoot(String name, File root) {
            if (TextUtils.isEmpty(name)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.mRoots.put(name, root.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + root, e);
            }
        }

        public Uri getUriForFile(File file) {
            String path;
            try {
                String path2 = file.getCanonicalPath();
                Entry<String, File> mostSpecific = null;
                for (Entry<String, File> root : this.mRoots.entrySet()) {
                    String rootPath = ((File) root.getValue()).getPath();
                    if (path2.startsWith(rootPath) && (mostSpecific == null || rootPath.length() > ((File) mostSpecific.getValue()).getPath().length())) {
                        mostSpecific = root;
                    }
                }
                if (mostSpecific == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + path2);
                }
                String rootPath2 = ((File) mostSpecific.getValue()).getPath();
                if (rootPath2.endsWith("/")) {
                    path = path2.substring(rootPath2.length());
                } else {
                    path = path2.substring(rootPath2.length() + 1);
                }
                return new Builder().scheme("content").authority(this.mAuthority).encodedPath(Uri.encode((String) mostSpecific.getKey()) + '/' + Uri.encode(path, "/")).build();
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        public File getFileForUri(Uri uri) {
            String path = uri.getEncodedPath();
            int splitIndex = path.indexOf(47, 1);
            String tag = Uri.decode(path.substring(1, splitIndex));
            String path2 = Uri.decode(path.substring(splitIndex + 1));
            File root = (File) this.mRoots.get(tag);
            if (root == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file = new File(root, path2);
            try {
                File file2 = file.getCanonicalFile();
                if (file2.getPath().startsWith(root.getPath())) {
                    return file2;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }
    }

    public boolean onCreate() {
        return true;
    }

    public void attachInfo(Context context, ProviderInfo info) {
        super.attachInfo(context, info);
        if (info.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (!info.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        } else {
            this.mStrategy = getPathStrategy(context, info.authority);
        }
    }

    public static Uri getUriForFile(Context context, String authority, File file) {
        return getPathStrategy(context, authority).getUriForFile(file);
    }

    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        int i;
        File file = this.mStrategy.getFileForUri(uri);
        if (projection == null) {
            projection = COLUMNS;
        }
        String[] cols = new String[projection.length];
        Object[] values = new Object[projection.length];
        String[] arr$ = projection;
        int len$ = arr$.length;
        int i$ = 0;
        int i2 = 0;
        while (i$ < len$) {
            String col = arr$[i$];
            if ("_display_name".equals(col)) {
                cols[i2] = "_display_name";
                i = i2 + 1;
                values[i2] = file.getName();
            } else if ("_size".equals(col)) {
                cols[i2] = "_size";
                i = i2 + 1;
                values[i2] = Long.valueOf(file.length());
            } else {
                i = i2;
            }
            i$++;
            i2 = i;
        }
        String[] cols2 = copyOf(cols, i2);
        Object[] values2 = copyOf(values, i2);
        MatrixCursor cursor = new MatrixCursor(cols2, 1);
        cursor.addRow(values2);
        return cursor;
    }

    public String getType(Uri uri) {
        File file = this.mStrategy.getFileForUri(uri);
        int lastDot = file.getName().lastIndexOf(46);
        if (lastDot >= 0) {
            String mime = MimeTypeMap.getSingleton().getMimeTypeFromExtension(file.getName().substring(lastDot + 1));
            if (mime != null) {
                return mime;
            }
        }
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues values) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        throw new UnsupportedOperationException("No external updates");
    }

    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return this.mStrategy.getFileForUri(uri).delete() ? 1 : 0;
    }

    public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.mStrategy.getFileForUri(uri), modeToMode(mode));
    }

    private static PathStrategy getPathStrategy(Context context, String authority) {
        PathStrategy strat;
        synchronized (sCache) {
            strat = (PathStrategy) sCache.get(authority);
            if (strat == null) {
                try {
                    strat = parsePathStrategy(context, authority);
                    sCache.put(authority, strat);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return strat;
    }

    private static PathStrategy parsePathStrategy(Context context, String authority) throws IOException, XmlPullParserException {
        SimplePathStrategy strat = new SimplePathStrategy(authority);
        XmlResourceParser in = context.getPackageManager().resolveContentProvider(authority, 128).loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (in == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int type = in.next();
            if (type == 1) {
                return strat;
            }
            if (type == 2) {
                String tag = in.getName();
                String name = in.getAttributeValue(null, ATTR_NAME);
                String path = in.getAttributeValue(null, ATTR_PATH);
                File target = null;
                if (TAG_ROOT_PATH.equals(tag)) {
                    target = buildPath(DEVICE_ROOT, path);
                } else if (TAG_FILES_PATH.equals(tag)) {
                    target = buildPath(context.getFilesDir(), path);
                } else if (TAG_CACHE_PATH.equals(tag)) {
                    target = buildPath(context.getCacheDir(), path);
                } else if (TAG_EXTERNAL.equals(tag)) {
                    target = buildPath(Environment.getExternalStorageDirectory(), path);
                }
                if (target != null) {
                    strat.addRoot(name, target);
                }
            }
        }
    }

    private static int modeToMode(String mode) {
        if ("r".equals(mode)) {
            return 268435456;
        }
        if ("w".equals(mode) || "wt".equals(mode)) {
            return 738197504;
        }
        if ("wa".equals(mode)) {
            return 704643072;
        }
        if ("rw".equals(mode)) {
            return 939524096;
        }
        if ("rwt".equals(mode)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + mode);
    }

    private static File buildPath(File base, String... segments) {
        File cur;
        File cur2 = base;
        String[] arr$ = segments;
        int len$ = arr$.length;
        int i$ = 0;
        File cur3 = cur2;
        while (i$ < len$) {
            String segment = arr$[i$];
            if (segment != null) {
                cur = new File(cur3, segment);
            } else {
                cur = cur3;
            }
            i$++;
            cur3 = cur;
        }
        return cur3;
    }

    private static String[] copyOf(String[] original, int newLength) {
        String[] result = new String[newLength];
        System.arraycopy(original, 0, result, 0, newLength);
        return result;
    }

    private static Object[] copyOf(Object[] original, int newLength) {
        Object[] result = new Object[newLength];
        System.arraycopy(original, 0, result, 0, newLength);
        return result;
    }
}
