package com.truecaller.social_media;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class DataBinderMapperImpl extends q7.baz {
    public static final android.util.SparseIntArray a;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray(2);
        a = sparseIntArray;
        sparseIntArray.put(2131559232, 1);
        sparseIntArray.put(2131559988, 2);
    }

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.truecaller.featuretoggles.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [ft2.baz, q7.e, java.lang.Object, ft2.qux] */
    public final q7.e b(int i, android.view.View view) {
        int i2 = a.get(i);
        if (i2 > 0) {
            java.lang.Object tag = view.getTag();
            if (tag != null) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        if ("layout/layout_social_media_item_0".equals(tag)) {
                            return new ft2.bar(view);
                        }
                        throw new java.lang.IllegalArgumentException(uf.qux.l(tag, "The tag for layout_social_media_item is invalid. Received: "));
                    }
                } else {
                    if ("layout/fragment_social_media_links_0".equals(tag)) {
                        java.lang.Object[] g = q7.e.g(view, 3, ft2.qux.t);
                        ?? bazVar = new ft2.baz(view, (android.widget.ImageView) g[1], (androidx.recyclerview.widget.RecyclerView) g[2]);
                        bazVar.s = -1L;
                        bazVar.o.setTag(null);
                        ((androidx.constraintlayout.widget.ConstraintLayout) g[0]).setTag(null);
                        view.setTag(2131363269, bazVar);
                        synchronized (bazVar) {
                            bazVar.s = 2L;
                        }
                        bazVar.j();
                        return bazVar;
                    }
                    throw new java.lang.IllegalArgumentException(uf.qux.l(tag, "The tag for fragment_social_media_links is invalid. Received: "));
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
