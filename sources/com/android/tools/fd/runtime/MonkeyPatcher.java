package com.android.tools.fd.runtime;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.util.ArrayMap;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MonkeyPatcher {
    public static void monkeyPatchApplication(Context context, Application bootstrap, Application realApplication, String externalResourceFile) {
        Class<?> activityThread;
        Object currentActivityThread;
        Class<?> loadedApkClass;
        try {
            activityThread = Class.forName("android.app.ActivityThread");
            currentActivityThread = getActivityThread(context, activityThread);
            Field mInitialApplication = activityThread.getDeclaredField("mInitialApplication");
            mInitialApplication.setAccessible(true);
            Application initialApplication = (Application) mInitialApplication.get(currentActivityThread);
            if (realApplication != null && initialApplication == bootstrap) {
                mInitialApplication.set(currentActivityThread, realApplication);
            }
            if (realApplication != null) {
                Field mAllApplications = activityThread.getDeclaredField("mAllApplications");
                mAllApplications.setAccessible(true);
                List<Application> allApplications = (List) mAllApplications.get(currentActivityThread);
                for (int i = 0; i < allApplications.size(); i++) {
                    if (allApplications.get(i) == bootstrap) {
                        allApplications.set(i, realApplication);
                    }
                }
            }
            loadedApkClass = Class.forName("android.app.LoadedApk");
        } catch (ClassNotFoundException e) {
            loadedApkClass = Class.forName("android.app.ActivityThread$PackageInfo");
        } catch (Throwable e2) {
            IllegalStateException illegalStateException = new IllegalStateException(e2);
            throw illegalStateException;
        }
        Field mApplication = loadedApkClass.getDeclaredField("mApplication");
        mApplication.setAccessible(true);
        Field mResDir = loadedApkClass.getDeclaredField("mResDir");
        mResDir.setAccessible(true);
        Field mLoadedApk = null;
        try {
            mLoadedApk = Application.class.getDeclaredField("mLoadedApk");
        } catch (NoSuchFieldException e3) {
        }
        for (String fieldName : new String[]{"mPackages", "mResourcePackages"}) {
            Field field = activityThread.getDeclaredField(fieldName);
            field.setAccessible(true);
            for (Entry<String, WeakReference<?>> entry : ((Map) field.get(currentActivityThread)).entrySet()) {
                Object loadedApk = ((WeakReference) entry.getValue()).get();
                if (loadedApk != null && mApplication.get(loadedApk) == bootstrap) {
                    if (realApplication != null) {
                        mApplication.set(loadedApk, realApplication);
                    }
                    if (externalResourceFile != null) {
                        mResDir.set(loadedApk, externalResourceFile);
                    }
                    if (!(realApplication == null || mLoadedApk == null)) {
                        mLoadedApk.set(realApplication, loadedApk);
                    }
                }
            }
        }
    }

    public static Object getActivityThread(Context context, Class<?> activityThread) {
        if (activityThread == null) {
            try {
                activityThread = Class.forName("android.app.ActivityThread");
            } catch (Throwable th) {
                return null;
            }
        }
        Method m = activityThread.getMethod("currentActivityThread", new Class[0]);
        m.setAccessible(true);
        Object currentActivityThread = m.invoke(null, new Object[0]);
        if (currentActivityThread != null || context == null) {
            return currentActivityThread;
        }
        Field mLoadedApk = context.getClass().getField("mLoadedApk");
        mLoadedApk.setAccessible(true);
        Object apk = mLoadedApk.get(context);
        Field mActivityThreadField = apk.getClass().getDeclaredField("mActivityThread");
        mActivityThreadField.setAccessible(true);
        return mActivityThreadField.get(apk);
    }

    public static void monkeyPatchExistingResources(Context context, String externalResourceFile, Collection<Activity> activities) {
        Collection<WeakReference<Resources>> references;
        if (externalResourceFile != null) {
            AssetManager newAssetManager = (AssetManager) AssetManager.class.getConstructor(new Class[0]).newInstance(new Object[0]);
            Method mAddAssetPath = AssetManager.class.getDeclaredMethod("addAssetPath", new Class[]{String.class});
            mAddAssetPath.setAccessible(true);
            if (((Integer) mAddAssetPath.invoke(newAssetManager, new Object[]{externalResourceFile})).intValue() == 0) {
                throw new IllegalStateException("Could not create new AssetManager");
            }
            Method mEnsureStringBlocks = AssetManager.class.getDeclaredMethod("ensureStringBlocks", new Class[0]);
            mEnsureStringBlocks.setAccessible(true);
            mEnsureStringBlocks.invoke(newAssetManager, new Object[0]);
            if (activities != null) {
                for (Activity activity : activities) {
                    Resources resources = activity.getResources();
                    try {
                        Field mAssets = Resources.class.getDeclaredField("mAssets");
                        mAssets.setAccessible(true);
                        mAssets.set(resources, newAssetManager);
                    } catch (Throwable e) {
                        IllegalStateException illegalStateException = new IllegalStateException(e);
                        throw illegalStateException;
                    }
                    Theme theme = activity.getTheme();
                    try {
                        Field ma = Theme.class.getDeclaredField("mAssets");
                        ma.setAccessible(true);
                        ma.set(theme, newAssetManager);
                    } catch (NoSuchFieldException e2) {
                        Field themeField = Theme.class.getDeclaredField("mThemeImpl");
                        themeField.setAccessible(true);
                        Object impl = themeField.get(theme);
                        Field ma2 = impl.getClass().getDeclaredField("mAssets");
                        ma2.setAccessible(true);
                        ma2.set(impl, newAssetManager);
                    } catch (Throwable e3) {
                        Log.e(BootstrapApplication.LOG_TAG, "Failed to update existing theme for activity " + activity, e3);
                    }
                    Field mt = ContextThemeWrapper.class.getDeclaredField("mTheme");
                    mt.setAccessible(true);
                    mt.set(activity, null);
                    Method mtm = ContextThemeWrapper.class.getDeclaredMethod("initializeTheme", new Class[0]);
                    mtm.setAccessible(true);
                    mtm.invoke(activity, new Object[0]);
                    Method mCreateTheme = AssetManager.class.getDeclaredMethod("createTheme", new Class[0]);
                    mCreateTheme.setAccessible(true);
                    Object internalTheme = mCreateTheme.invoke(newAssetManager, new Object[0]);
                    Field mTheme = Theme.class.getDeclaredField("mTheme");
                    mTheme.setAccessible(true);
                    mTheme.set(theme, internalTheme);
                    pruneResourceCaches(resources);
                }
            }
            if (VERSION.SDK_INT >= 19) {
                Class<?> resourcesManagerClass = Class.forName("android.app.ResourcesManager");
                Method mGetInstance = resourcesManagerClass.getDeclaredMethod("getInstance", new Class[0]);
                mGetInstance.setAccessible(true);
                Object resourcesManager = mGetInstance.invoke(null, new Object[0]);
                try {
                    Field fMActiveResources = resourcesManagerClass.getDeclaredField("mActiveResources");
                    fMActiveResources.setAccessible(true);
                    references = ((ArrayMap) fMActiveResources.get(resourcesManager)).values();
                } catch (NoSuchFieldException e4) {
                    Field mResourceReferences = resourcesManagerClass.getDeclaredField("mResourceReferences");
                    mResourceReferences.setAccessible(true);
                    references = (Collection) mResourceReferences.get(resourcesManager);
                }
            } else {
                Class<?> activityThread = Class.forName("android.app.ActivityThread");
                Field fMActiveResources2 = activityThread.getDeclaredField("mActiveResources");
                fMActiveResources2.setAccessible(true);
                references = ((HashMap) fMActiveResources2.get(getActivityThread(context, activityThread))).values();
            }
            for (WeakReference<Resources> wr : references) {
                Resources resources2 = (Resources) wr.get();
                if (resources2 != null) {
                    try {
                        Field mAssets2 = Resources.class.getDeclaredField("mAssets");
                        mAssets2.setAccessible(true);
                        mAssets2.set(resources2, newAssetManager);
                    } catch (Throwable th) {
                        Field mResourcesImpl = Resources.class.getDeclaredField("mResourcesImpl");
                        mResourcesImpl.setAccessible(true);
                        Object resourceImpl = mResourcesImpl.get(resources2);
                        Field implAssets = resourceImpl.getClass().getDeclaredField("mAssets");
                        implAssets.setAccessible(true);
                        implAssets.set(resourceImpl, newAssetManager);
                    }
                    resources2.updateConfiguration(resources2.getConfiguration(), resources2.getDisplayMetrics());
                }
            }
        }
    }

    private static void pruneResourceCaches(Object resources) {
        if (VERSION.SDK_INT >= 21) {
            try {
                Field typedArrayPoolField = Resources.class.getDeclaredField("mTypedArrayPool");
                typedArrayPoolField.setAccessible(true);
                Object pool = typedArrayPoolField.get(resources);
                Method acquireMethod = pool.getClass().getDeclaredMethod("acquire", new Class[0]);
                acquireMethod.setAccessible(true);
                do {
                } while (acquireMethod.invoke(pool, new Object[0]) != null);
            } catch (Throwable th) {
            }
        }
        if (VERSION.SDK_INT >= 23) {
            try {
                Field mResourcesImpl = Resources.class.getDeclaredField("mResourcesImpl");
                mResourcesImpl.setAccessible(true);
                resources = mResourcesImpl.get(resources);
            } catch (Throwable th2) {
            }
        }
        Object lock = null;
        if (VERSION.SDK_INT >= 18) {
            try {
                Field field = resources.getClass().getDeclaredField("mAccessLock");
                field.setAccessible(true);
                lock = field.get(resources);
            } catch (Throwable th3) {
            }
        } else {
            try {
                Field field2 = Resources.class.getDeclaredField("mTmpValue");
                field2.setAccessible(true);
                lock = field2.get(resources);
            } catch (Throwable th4) {
            }
        }
        if (lock == null) {
            lock = MonkeyPatcher.class;
        }
        synchronized (lock) {
            pruneResourceCache(resources, "mDrawableCache");
            pruneResourceCache(resources, "mColorDrawableCache");
            pruneResourceCache(resources, "mColorStateListCache");
            if (VERSION.SDK_INT >= 23) {
                pruneResourceCache(resources, "mAnimatorCache");
                pruneResourceCache(resources, "mStateListAnimatorCache");
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    private static boolean pruneResourceCache(Object resources, String fieldName) {
        Field cacheField;
        try {
            cacheField = resources.getClass().getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            cacheField = Resources.class.getDeclaredField(fieldName);
        } catch (Throwable th) {
        }
        cacheField.setAccessible(true);
        Object cache = cacheField.get(resources);
        Class<?> type = cacheField.getType();
        if (VERSION.SDK_INT < 16) {
            if (cache instanceof SparseArray) {
                ((SparseArray) cache).clear();
                return true;
            } else if (VERSION.SDK_INT >= 14 && (cache instanceof LongSparseArray)) {
                ((LongSparseArray) cache).clear();
                return true;
            }
        } else if (VERSION.SDK_INT >= 23) {
            while (type != null) {
                try {
                    Method configChangeMethod = type.getDeclaredMethod("onConfigurationChange", new Class[]{Integer.TYPE});
                    configChangeMethod.setAccessible(true);
                    configChangeMethod.invoke(cache, new Object[]{Integer.valueOf(-1)});
                    return true;
                } catch (Throwable th2) {
                    type = type.getSuperclass();
                }
            }
        } else if ("mColorStateListCache".equals(fieldName)) {
            if (cache instanceof LongSparseArray) {
                ((LongSparseArray) cache).clear();
            }
        } else if (type.isAssignableFrom(ArrayMap.class)) {
            Method clearArrayMap = Resources.class.getDeclaredMethod("clearDrawableCachesLocked", new Class[]{ArrayMap.class, Integer.TYPE});
            clearArrayMap.setAccessible(true);
            clearArrayMap.invoke(resources, new Object[]{cache, Integer.valueOf(-1)});
            return true;
        } else if (type.isAssignableFrom(LongSparseArray.class)) {
            Method clearSparseMap = Resources.class.getDeclaredMethod("clearDrawableCachesLocked", new Class[]{LongSparseArray.class, Integer.TYPE});
            clearSparseMap.setAccessible(true);
            clearSparseMap.invoke(resources, new Object[]{cache, Integer.valueOf(-1)});
            return true;
        }
        return false;
    }
}
