package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class r {
    public final kotlin.Lazy a;

    public r(qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "adsConfigsInventory");
        this.a = kotlin.LazyKt.lazy(new com.truecaller.ads.util.a(barVar, 3));
    }

    public static boolean a(java.lang.Object obj, java.util.List list) {
        if (list == null) {
            return true;
        }
        if (list.isEmpty()) {
            return false;
        }
        return kotlin.collections.CollectionsKt.N(list, obj);
    }

    public final boolean b(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, java.lang.Integer num) {
        java.util.List list = (java.util.List) this.a.getValue();
        java.lang.Object obj = null;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                com.truecaller.ads.util.AdRequestEventRestrictionConfig adRequestEventRestrictionConfig = (com.truecaller.ads.util.AdRequestEventRestrictionConfig) next;
                if (adRequestEventRestrictionConfig.getEnabled() && a(java.lang.Integer.valueOf(i), adRequestEventRestrictionConfig.getSsp()) && a(str, adRequestEventRestrictionConfig.getPartnerNames()) && a(str2, adRequestEventRestrictionConfig.getPlacements()) && a(str3, adRequestEventRestrictionConfig.getAdUnits()) && a(str4, adRequestEventRestrictionConfig.getRequestSources()) && a(java.lang.Integer.valueOf(i2), adRequestEventRestrictionConfig.getResponseStatus()) && a(num, adRequestEventRestrictionConfig.getErrorCodes())) {
                    obj = next;
                    break;
                }
            }
            obj = (com.truecaller.ads.util.AdRequestEventRestrictionConfig) obj;
        }
        if (obj != null) {
            return true;
        }
        return false;
    }
}
