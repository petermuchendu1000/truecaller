package com.truecaller.featuretoggles;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class DataBinderMapperImpl extends q7.baz {
    public static final android.util.SparseIntArray a;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray(1);
        a = sparseIntArray;
        sparseIntArray.put(2131558497, 1);
    }

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [po1.qux, q7.e, java.lang.Object, po1.bar] */
    public final q7.e b(int i, android.view.View view) {
        int i2 = a.get(i);
        if (i2 > 0) {
            java.lang.Object tag = view.getTag();
            if (tag != null) {
                if (i2 == 1) {
                    if ("layout/activity_qm_inventory_0".equals(tag)) {
                        java.lang.Object[] g = q7.e.g(view, 16, po1.qux.w);
                        androidx.appcompat.widget.AppCompatSpinner appCompatSpinner = (androidx.appcompat.widget.AppCompatSpinner) g[2];
                        com.google.android.material.textfield.TextInputEditText textInputEditText = (com.google.android.material.textfield.TextInputEditText) g[1];
                        ?? barVar = new po1.bar(view, appCompatSpinner, textInputEditText, (androidx.appcompat.widget.AppCompatSpinner) g[3]);
                        barVar.s = new po1.baz((java.lang.Object) barVar, 0);
                        barVar.t = new jz0.u((java.lang.Object) barVar, 27);
                        barVar.u = new ns.k((java.lang.Object) barVar);
                        barVar.v = -1L;
                        barVar.o.setTag(null);
                        ((androidx.constraintlayout.widget.ConstraintLayout) g[0]).setTag(null);
                        barVar.p.setTag(null);
                        barVar.q.setTag(null);
                        view.setTag(2131363269, barVar);
                        synchronized (barVar) {
                            barVar.v = 16L;
                        }
                        barVar.j();
                        return barVar;
                    }
                    throw new java.lang.IllegalArgumentException(uf.qux.l(tag, "The tag for activity_qm_inventory is invalid. Received: "));
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
