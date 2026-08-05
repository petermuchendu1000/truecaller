package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class i implements com.truecaller.ads.util.g {
    public final kotlin.Lazy a;

    public i(qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "adsConfigsInventory");
        this.a = kotlin.LazyKt.lazy(new com.truecaller.ads.util.a(barVar, 2));
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
