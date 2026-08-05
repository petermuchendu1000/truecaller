package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class c {
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;

    public c(qc3.bar barVar, qc3.bar barVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "adsFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "adsConfigsInventory");
        this.a = kotlin.LazyKt.lazy(new com.truecaller.ads.util.a(barVar, 0));
        this.b = kotlin.LazyKt.lazy(new com.truecaller.ads.util.a(barVar2, 1));
    }

    public final boolean a(int i, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "adUnit");
        if (kotlin.collections.CollectionsKt.N((z0.c) w90.qux.b.getValue(), str2)) {
            if (((java.lang.Boolean) this.a.getValue()).booleanValue()) {
                java.util.List list = (java.util.List) this.b.getValue();
                java.lang.Object obj = null;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        com.truecaller.ads.util.AdAcsFallbackRequestConfig adAcsFallbackRequestConfig = (com.truecaller.ads.util.AdAcsFallbackRequestConfig) next;
                        if (adAcsFallbackRequestConfig.getAdUnits().contains(str) && kotlin.collections.CollectionsKt.N(adAcsFallbackRequestConfig.getRequestSources(), str2) && adAcsFallbackRequestConfig.getErrorCodes().contains(java.lang.Integer.valueOf(i))) {
                            obj = next;
                            break;
                        }
                    }
                    obj = (com.truecaller.ads.util.AdAcsFallbackRequestConfig) obj;
                }
                if (obj != null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
