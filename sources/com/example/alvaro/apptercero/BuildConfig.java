package com.example.alvaro.apptercero;

import com.android.tools.fd.runtime.IncrementalChange;
import com.android.tools.fd.runtime.InstantReloadException;

public final class BuildConfig {
    public static volatile transient /* synthetic */ IncrementalChange $change = null;
    public static final String APPLICATION_ID = "com.example.alvaro.apptercero";
    public static final String BUILD_TYPE = "debug";
    public static final boolean DEBUG = Boolean.parseBoolean("true");
    public static final String FLAVOR = "";
    public static final int VERSION_CODE = 1;
    public static final String VERSION_NAME = "1.0";

    BuildConfig(Object[] objArr, InstantReloadException instantReloadException) {
        String str = objArr[0];
        switch (str.hashCode()) {
            case -1968665286:
                return;
            case 104272496:
                this();
                return;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/alvaro/apptercero/BuildConfig"}));
        }
    }

    public static /* synthetic */ Object access$super(BuildConfig buildConfig, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return super.toString();
            case -1600833221:
                super.wait(objArr[0].longValue(), objArr[1].intValue());
                return null;
            case -1554832987:
                super.finalize();
                return null;
            case -1166127280:
                super.notify();
                return null;
            case -1021472056:
                super.wait(objArr[0].longValue());
                return null;
            case -712101345:
                super.notifyAll();
                return null;
            case 201261558:
                return super.getClass();
            case 244142972:
                super.wait();
                return null;
            case 1403628309:
                return new Integer(super.hashCode());
            case 1814730534:
                return new Boolean(super.equals(objArr[0]));
            case 2025021518:
                return super.clone();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/alvaro/apptercero/BuildConfig"}));
        }
    }

    public BuildConfig() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = {objArr};
            this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
        }
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("init$body.(Lcom/example/alvaro/apptercero/BuildConfig;)V", this);
        }
    }
}
