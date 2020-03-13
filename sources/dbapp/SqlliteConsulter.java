package dbapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.widget.Toast;
import com.android.tools.fd.runtime.IncrementalChange;
import com.android.tools.fd.runtime.InstantReloadException;
import com.example.alvaro.apptercero.Product;
import com.example.alvaro.apptercero.User;
import java.util.ArrayList;
import java.util.List;

public class SqlliteConsulter extends SQLiteOpenHelper {
    public static volatile transient /* synthetic */ IncrementalChange $change = null;
    private static final String NOMBRE_BD = "apptercero.db";
    private static final String TABLA_PRODUCTOS = "CREATE TABLE product(_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,description TEXT, cost TEXT)";
    private static final String TABLA_USUARIOS = "CREATE TABLE user(_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,password TEXT,superuser BOOLEAN)";
    private static final int VERSION_BASEDATOS = 1;
    private final Context context;

    SqlliteConsulter(Object[] objArr, InstantReloadException instantReloadException) {
        String str = objArr[0];
        switch (str.hashCode()) {
            case -1247877000:
                this(objArr[1]);
                return;
            case -376888114:
                super(objArr[1], objArr[2], objArr[3], objArr[4].intValue(), objArr[5]);
                return;
            case 1289736834:
                super(objArr[1], objArr[2], objArr[3], objArr[4].intValue());
                return;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "dbapp/SqlliteConsulter"}));
        }
    }

    public static /* synthetic */ Object access$super(SqlliteConsulter sqlliteConsulter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return super.toString();
            case -2000015223:
                super.onOpen(objArr[0]);
                return null;
            case -1600833221:
                super.wait(objArr[0].longValue(), objArr[1].intValue());
                return null;
            case -1554832987:
                super.finalize();
                return null;
            case -1166127280:
                super.notify();
                return null;
            case -1100993913:
                super.onConfigure(objArr[0]);
                return null;
            case -1021472056:
                super.wait(objArr[0].longValue());
                return null;
            case -712101345:
                super.notifyAll();
                return null;
            case -483678593:
                super.close();
                return null;
            case -241799050:
                super.onDowngrade(objArr[0], objArr[1].intValue(), objArr[2].intValue());
                return null;
            case 201261558:
                return super.getClass();
            case 244142972:
                super.wait();
                return null;
            case 305025623:
                return super.getWritableDatabase();
            case 342041543:
                super.setWriteAheadLoggingEnabled(objArr[0].booleanValue());
                return null;
            case 1403628309:
                return new Integer(super.hashCode());
            case 1452388359:
                return super.getReadableDatabase();
            case 1814730534:
                return new Boolean(super.equals(objArr[0]));
            case 2025021518:
                return super.clone();
            case 2084723549:
                return super.getDatabaseName();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "dbapp/SqlliteConsulter"}));
        }
    }

    public boolean AddProduct(String nameProduct, String descriProduct, String priceProduct) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            return ((Boolean) incrementalChange.access$dispatch("AddProduct.(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", this, nameProduct, descriProduct, priceProduct)).booleanValue();
        }
        SQLiteStatement stm = getWritableDatabase().compileStatement("INSERT INTO product(name,description,cost) VALUES(?1,?2,?3)");
        stm.bindString(1, "" + nameProduct);
        stm.bindString(2, "" + descriProduct);
        stm.bindString(3, "" + priceProduct);
        stm.execute();
        return true;
    }

    public User findUser(String name) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            return (User) incrementalChange.access$dispatch("findUser.(Ljava/lang/String;)Lcom/example/alvaro/apptercero/User;", this, name);
        }
        SQLiteDatabase db = getReadableDatabase();
        try {
            Cursor c = db.query("user", new String[]{"_id", "name", "password", "superuser"}, null, null, null, null, null);
            if (c != null) {
                c.moveToFirst();
                while (!c.getString(1).equals(name)) {
                    c.moveToNext();
                    if (c == null) {
                    }
                }
                return new User(c.getInt(0), c.getString(1), c.getString(2));
            }
            db.close();
            c.close();
            return null;
        } catch (SQLiteException e) {
            return null;
        }
    }

    public void insertUser(String name, String password, boolean superuser) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("insertUser.(Ljava/lang/String;Ljava/lang/String;Z)V", this, name, password, new Boolean(superuser));
            return;
        }
        SQLiteDatabase db = getWritableDatabase();
        if (db != null) {
            ContentValues values = new ContentValues();
            values.put("name", name);
            values.put("password", password);
            values.put("superuser", Boolean.valueOf(superuser));
            db.insert("user", null, values);
            db.close();
            Toast.makeText(this.context, "Se inserto", 0).show();
        }
    }

    public void onCreate(SQLiteDatabase db) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("onCreate.(Landroid/database/sqlite/SQLiteDatabase;)V", this, db);
            return;
        }
        db.execSQL(TABLA_USUARIOS);
        db.execSQL(TABLA_PRODUCTOS);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("onUpgrade.(Landroid/database/sqlite/SQLiteDatabase;II)V", this, db, new Integer(oldVersion), new Integer(newVersion));
            return;
        }
        db.execSQL("DROP TABLE IF EXISTS CREATE TABLE user(_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,password TEXT,superuser BOOLEAN)");
        onCreate(db);
    }

    public List<Product> showProduct() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            return (List) incrementalChange.access$dispatch("showProduct.()Ljava/util/List;", this);
        }
        SQLiteDatabase db = getReadableDatabase();
        ArrayList<Product> products = new ArrayList<>();
        try {
            Cursor c = db.rawQuery("SELECT * FROM product", null);
            if (c.getCount() <= 0) {
                return null;
            }
            c.moveToFirst();
            do {
                products.add(new Product(c.getString(0), c.getString(1), c.getString(2), c.getString(3)));
            } while (c.moveToNext());
            return products;
        } catch (SQLiteException e) {
            return null;
        }
    }

    public SqlliteConsulter(Context context2) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = new Object[2];
            objArr[0] = objArr;
            objArr[1] = context2;
            context2 = (Context) objArr[1];
            this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Object;", objArr), null);
        } else {
            super(context2, NOMBRE_BD, null, 1);
        }
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("init$body.(Ldbapp/SqlliteConsulter;Landroid/content/Context;)V", this, context2);
            return;
        }
        this.context = context2;
    }
}
