package com.example.alvaro.apptercero;

import com.android.tools.fd.runtime.IncrementalChange;
import com.android.tools.fd.runtime.InstantReloadException;

public class User {
    public static volatile transient /* synthetic */ IncrementalChange $change;
    private int id;
    private String name;
    private String password;

    User(Object[] objArr, InstantReloadException instantReloadException) {
        String str = objArr[0];
        switch (str.hashCode()) {
            case -1968665286:
                return;
            case 720294489:
                this();
                return;
            case 996312030:
                this(objArr[1].intValue(), objArr[2], objArr[3]);
                return;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/alvaro/apptercero/User"}));
        }
    }

    public static /* synthetic */ Object access$super(User user, String str, Object... objArr) {
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
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/alvaro/apptercero/User"}));
        }
    }

    public int getId() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange == null) {
            return this.id;
        }
        return ((Number) incrementalChange.access$dispatch("getId.()I", this)).intValue();
    }

    public String getName() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange == null) {
            return this.name;
        }
        return (String) incrementalChange.access$dispatch("getName.()Ljava/lang/String;", this);
    }

    public String getPassword() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange == null) {
            return this.password;
        }
        return (String) incrementalChange.access$dispatch("getPassword.()Ljava/lang/String;", this);
    }

    public void setId(int id2) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("setId.(I)V", this, new Integer(id2));
            return;
        }
        this.id = id2;
    }

    public void setName(String name2) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("setName.(Ljava/lang/String;)V", this, name2);
            return;
        }
        this.name = name2;
    }

    public void setPassword(String password2) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("setPassword.(Ljava/lang/String;)V", this, password2);
            return;
        }
        this.password = password2;
    }

    public User() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = {objArr};
            this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
        }
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("init$body.(Lcom/example/alvaro/apptercero/User;)V", this);
        }
    }

    public User(int id2, String name2, String password2) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = new Object[4];
            objArr[0] = objArr;
            objArr[1] = new Integer(id2);
            objArr[2] = name2;
            objArr[3] = password2;
            Object[] objArr2 = (Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", objArr);
            id2 = ((Number) objArr[1]).intValue();
            name2 = (String) objArr[2];
            password2 = (String) objArr[3];
            this(objArr2, null);
        }
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("init$body.(Lcom/example/alvaro/apptercero/User;ILjava/lang/String;Ljava/lang/String;)V", this, new Integer(id2), name2, password2);
            return;
        }
        this.name = name2;
        this.id = id2;
        this.password = password2;
    }
}
