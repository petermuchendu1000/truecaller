package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class f implements com.truecaller.ads.util.d {
    public final qc3.bar a;
    public final kotlin.Lazy b;

    public f(qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "adsConfigsInventory");
        this.a = barVar;
        this.b = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(this, 9));
    }

    public static boolean a(java.lang.String str, java.util.List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                java.util.List list2 = list;
                if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (kotlin.text.y.p((java.lang.String) it.next(), str, true)) {
                        }
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
