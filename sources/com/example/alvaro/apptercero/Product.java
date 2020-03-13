package com.example.alvaro.apptercero;

import com.android.tools.fd.runtime.IncrementalChange;
import com.android.tools.fd.runtime.InstantReloadException;

public class Product {
    public static volatile transient /* synthetic */ IncrementalChange $change;
    private String codigo;
    private String cost;
    private String descrip;
    private String name;

    Product(Object[] objArr, InstantReloadException instantReloadException) {
        String str = objArr[0];
        switch (str.hashCode()) {
            case -1968665286:
                return;
            case 1511915949:
                this(objArr[1], objArr[2], objArr[3]);
                return;
            case 2011757111:
                this(objArr[1], objArr[2], objArr[3], objArr[4]);
                return;
            case 2049114383:
                this();
                return;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/alvaro/apptercero/Product"}));
        }
    }

    public static /* synthetic */ Object access$super(Product product, String str, Object... objArr) {
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
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/alvaro/apptercero/Product"}));
        }
    }

    public String getCost() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange == null) {
            return this.cost;
        }
        return (String) incrementalChange.access$dispatch("getCost.()Ljava/lang/String;", this);
    }

    public String getDescrip() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange == null) {
            return this.descrip;
        }
        return (String) incrementalChange.access$dispatch("getDescrip.()Ljava/lang/String;", this);
    }

    public String getName() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange == null) {
            return this.name;
        }
        return (String) incrementalChange.access$dispatch("getName.()Ljava/lang/String;", this);
    }

    public void setCost(String cost2) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("setCost.(Ljava/lang/String;)V", this, cost2);
            return;
        }
        this.cost = cost2;
    }

    public void setDescrip(String descrip2) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("setDescrip.(Ljava/lang/String;)V", this, descrip2);
            return;
        }
        this.descrip = descrip2;
    }

    public void setName(String name2) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("setName.(Ljava/lang/String;)V", this, name2);
            return;
        }
        this.name = name2;
    }

    public Product() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = {objArr};
            this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;)Ljava/lang/Object;", objArr), null);
        }
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("init$body.(Lcom/example/alvaro/apptercero/Product;)V", this);
        }
    }

    public Product(String name2, String descrip2, String cost2) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = new Object[4];
            objArr[0] = objArr;
            objArr[1] = name2;
            objArr[2] = descrip2;
            objArr[3] = cost2;
            name2 = (String) objArr[1];
            descrip2 = (String) objArr[2];
            cost2 = (String) objArr[3];
            this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", objArr), null);
        }
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("init$body.(Lcom/example/alvaro/apptercero/Product;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", this, name2, descrip2, cost2);
            return;
        }
        this.name = name2;
        this.descrip = descrip2;
        this.cost = cost2;
    }

    public Product(String codigo2, String name2, String descrip2, String cost2) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = new Object[5];
            objArr[0] = objArr;
            objArr[1] = codigo2;
            objArr[2] = name2;
            objArr[3] = descrip2;
            objArr[4] = cost2;
            codigo2 = (String) objArr[1];
            name2 = (String) objArr[2];
            descrip2 = (String) objArr[3];
            cost2 = (String) objArr[4];
            this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", objArr), null);
        }
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("init$body.(Lcom/example/alvaro/apptercero/Product;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", this, codigo2, name2, descrip2, cost2);
            return;
        }
        this.name = name2;
        this.descrip = descrip2;
        this.codigo = codigo2;
        this.cost = cost2;
    }
}
