package com.truecaller.personalsafety;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class DataBinderMapperImpl extends q7.baz {
    public static final android.util.SparseIntArray a;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray(1);
        a = sparseIntArray;
        sparseIntArray.put(2131558628, 1);
    }

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.truecaller.featuretoggles.DataBinderMapperImpl());
        return arrayList;
    }

    public final q7.e b(int i, android.view.View view) {
        int i2 = a.get(i);
        if (i2 > 0) {
            java.lang.Object tag = view.getTag();
            if (tag != null) {
                if (i2 == 1) {
                    if ("layout/bottomsheet_personal_safety_awareness_0".equals(tag)) {
                        java.lang.Object[] g = q7.e.g(view, 5, (android.util.SparseIntArray) null);
                        y72.bar barVar = new y72.bar(view, (com.google.android.material.button.MaterialButton) g[4], (android.widget.ImageView) g[1], (android.widget.TextView) g[3], (android.widget.TextView) g[2]);
                        barVar.x = -1L;
                        barVar.o.setTag(null);
                        barVar.p.setTag(null);
                        ((androidx.core.widget.NestedScrollView) g[0]).setTag(null);
                        barVar.q.setTag(null);
                        barVar.r.setTag(null);
                        view.setTag(2131363269, barVar);
                        synchronized (barVar) {
                            barVar.x = 64L;
                        }
                        barVar.j();
                        return barVar;
                    }
                    throw new java.lang.IllegalArgumentException(uf.qux.l(tag, "The tag for bottomsheet_personal_safety_awareness is invalid. Received: "));
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
