package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class j {
    public static final java.util.List a = kotlin.collections.x.c(com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE);
    public static final java.util.List b;

    static {
        com.google.android.gms.ads.AdSize adSize = r90.h.a;
        b = kotlin.collections.y.j(new com.google.android.gms.ads.AdSize[]{com.google.android.gms.ads.AdSize.BANNER, com.google.android.gms.ads.AdSize.LARGE_BANNER, r90.h.a, r90.h.b});
    }

    public static com.google.android.gms.ads.AdSize[] a(com.google.android.gms.ads.AdSize adSize) {
        java.util.List list = a;
        java.util.List list2 = b;
        if (adSize != null) {
            java.util.ArrayList I0 = kotlin.collections.CollectionsKt.I0(kotlin.collections.CollectionsKt.l0(list2, list));
            I0.add(adSize);
            com.google.android.gms.ads.AdSize[] adSizeArr = (com.google.android.gms.ads.AdSize[]) I0.toArray(new com.google.android.gms.ads.AdSize[0]);
            if (adSizeArr != null) {
                return adSizeArr;
            }
        }
        return (com.google.android.gms.ads.AdSize[]) kotlin.collections.CollectionsKt.l0(list2, list).toArray(new com.google.android.gms.ads.AdSize[0]);
    }
}
