package com.example.alvaro.apptercero;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.tools.fd.runtime.IncrementalChange;
import com.android.tools.fd.runtime.InstantReloadException;
import java.util.List;

public class Product_Adapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IncrementalChange $change;
    private Context context;
    private List<Product> products;

    Product_Adapter(Object[] objArr, InstantReloadException instantReloadException) {
        String str = objArr[0];
        switch (str.hashCode()) {
            case -1811565958:
                return;
            case 1949192346:
                this(objArr[1], objArr[2]);
                return;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/alvaro/apptercero/Product_Adapter"}));
        }
    }

    public static /* synthetic */ Object access$super(Product_Adapter product_Adapter, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2137586239:
                super.notifyDataSetInvalidated();
                return null;
            case -2128160755:
                return super.toString();
            case -2028681463:
                return new Boolean(super.isEnabled(objArr[0].intValue()));
            case -1600833221:
                super.wait(objArr[0].longValue(), objArr[1].intValue());
                return null;
            case -1593347805:
                return super.getDropDownView(objArr[0].intValue(), objArr[1], objArr[2]);
            case -1554832987:
                super.finalize();
                return null;
            case -1427277676:
                return new Integer(super.getViewTypeCount());
            case -1166127280:
                super.notify();
                return null;
            case -1021472056:
                super.wait(objArr[0].longValue());
                return null;
            case -712101345:
                super.notifyAll();
                return null;
            case -286677780:
                super.notifyDataSetChanged();
                return null;
            case -242754226:
                return new Boolean(super.isEmpty());
            case 201261558:
                return super.getClass();
            case 244142972:
                super.wait();
                return null;
            case 892414734:
                return new Boolean(super.hasStableIds());
            case 1403628309:
                return new Integer(super.hashCode());
            case 1553707065:
                return new Boolean(super.areAllItemsEnabled());
            case 1668291879:
                super.registerDataSetObserver(objArr[0]);
                return null;
            case 1707705895:
                return new Integer(super.getItemViewType(objArr[0].intValue()));
            case 1725662510:
                super.unregisterDataSetObserver(objArr[0]);
                return null;
            case 1814730534:
                return new Boolean(super.equals(objArr[0]));
            case 2025021518:
                return super.clone();
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s' with hashcode %s in %s", new Object[]{str, Integer.valueOf(str.hashCode()), "com/example/alvaro/apptercero/Product_Adapter"}));
        }
    }

    public int getCount() {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange == null) {
            return this.products.size();
        }
        return ((Number) incrementalChange.access$dispatch("getCount.()I", this)).intValue();
    }

    public Object getItem(int position) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange == null) {
            return getItem(position);
        }
        return incrementalChange.access$dispatch("getItem.(I)Ljava/lang/Object;", this, new Integer(position));
    }

    public long getItemId(int position) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange == null) {
            return getItemId(position);
        }
        return ((Number) incrementalChange.access$dispatch("getItemId.(I)J", this, new Integer(position))).longValue();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            return (View) incrementalChange.access$dispatch("getView.(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", this, new Integer(position), convertView, parent);
        }
        View rowView = convertView;
        if (convertView == null) {
            rowView = ((LayoutInflater) this.context.getSystemService("layout_inflater")).inflate(R.layout.product_view, parent, false);
        }
        TextView description = (TextView) rowView.findViewById(R.id.description);
        TextView cost = (TextView) rowView.findViewById(R.id.cost);
        Product product = (Product) this.products.get(position);
        ((TextView) rowView.findViewById(R.id.name)).setText(product.getName());
        description.setText(product.getDescrip());
        cost.setText(product.getCost());
        return rowView;
    }

    public Product_Adapter(Context context2, List<Product> products2) {
        IncrementalChange incrementalChange = $change;
        if (incrementalChange != null) {
            Object[] objArr = new Object[3];
            objArr[0] = objArr;
            objArr[1] = context2;
            objArr[2] = products2;
            context2 = (Context) objArr[1];
            products2 = (List) objArr[2];
            this((Object[]) incrementalChange.access$dispatch("init$args.([Ljava/lang/Object;Landroid/content/Context;Ljava/util/List;)Ljava/lang/Object;", objArr), (InstantReloadException) null);
        }
        if (incrementalChange != null) {
            incrementalChange.access$dispatch("init$body.(Lcom/example/alvaro/apptercero/Product_Adapter;Landroid/content/Context;Ljava/util/List;)V", this, context2, products2);
            return;
        }
        this.context = context2;
        this.products = products2;
    }
}
