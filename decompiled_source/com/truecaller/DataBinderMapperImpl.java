package com.truecaller;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class DataBinderMapperImpl extends q7.baz {
    public static final android.util.SparseIntArray a = new android.util.SparseIntArray(0);

    public final java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList(8);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.truecaller.ads.DataBinderMapperImpl());
        arrayList.add(new com.truecaller.bizmon.DataBinderMapperImpl());
        arrayList.add(new com.truecaller.bizmon_call_kit.DataBinderMapperImpl());
        arrayList.add(new com.truecaller.common.config.DataBinderMapperImpl());
        arrayList.add(new com.truecaller.featuretoggles.DataBinderMapperImpl());
        arrayList.add(new com.truecaller.personalsafety.DataBinderMapperImpl());
        arrayList.add(new com.truecaller.social_media.DataBinderMapperImpl());
        return arrayList;
    }

    public final q7.e b(int i, android.view.View view) {
        if (a.get(i) > 0 && view.getTag() == null) {
            throw new java.lang.RuntimeException("view must have a tag");
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
