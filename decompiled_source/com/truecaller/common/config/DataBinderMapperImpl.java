package com.truecaller.common.config;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public class DataBinderMapperImpl extends q7.baz {
    public static final android.util.SparseIntArray a;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray(2);
        a = sparseIntArray;
        sparseIntArray.put(2131558496, 1);
        sparseIntArray.put(2131559215, 2);
    }

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [d31.qux, q7.e, java.lang.Object, d31.a] */
    public final q7.e b(int i, android.view.View view) {
        int i2 = a.get(i);
        if (i2 > 0) {
            java.lang.Object tag = view.getTag();
            if (tag != null) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        if ("layout/fragment_qm_config_inventory_edit_0".equals(tag)) {
                            java.lang.Object[] g = q7.e.g(view, 11, d31.a.y);
                            android.widget.TextView textView = (android.widget.TextView) g[5];
                            android.widget.TextView textView2 = (android.widget.TextView) g[4];
                            ?? quxVar = new d31.qux(view, textView, textView2, (androidx.appcompat.widget.AppCompatEditText) g[9], (android.widget.ProgressBar) g[10], (android.widget.TextView) g[6], (androidx.appcompat.widget.AppCompatEditText) g[8], (android.widget.TextView) g[7], (androidx.appcompat.widget.Toolbar) g[2]);
                            quxVar.x = -1L;
                            ((androidx.coordinatorlayout.widget.CoordinatorLayout) g[0]).setTag(null);
                            view.setTag(2131363269, quxVar);
                            synchronized (quxVar) {
                                quxVar.x = 1L;
                            }
                            quxVar.j();
                            return quxVar;
                        }
                        throw new java.lang.IllegalArgumentException(uf.qux.l(tag, "The tag for fragment_qm_config_inventory_edit is invalid. Received: "));
                    }
                } else {
                    if ("layout/activity_qm_config_inventory_0".equals(tag)) {
                        return new d31.baz(view);
                    }
                    throw new java.lang.IllegalArgumentException(uf.qux.l(tag, "The tag for activity_qm_config_inventory is invalid. Received: "));
                }
            } else {
                throw new java.lang.RuntimeException("view must have a tag");
            }
        }
        return null;
    }

    public final q7.e c(android.view.View[] viewArr, int i) {
        if (viewArr.length != 0 && a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new java.lang.RuntimeException("view must have a tag");
        }
        return null;
    }
}
