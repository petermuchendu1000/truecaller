package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class n {
    public static final kotlin.Lazy a = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a(22));
    public static final kotlin.Lazy b = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a(23));

    public static java.util.List a(java.lang.String str, java.lang.String str2) {
        java.util.List list;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "partnerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "placementName");
        if (((java.lang.Boolean) a.getValue()).booleanValue() && (list = (java.util.List) b.getValue()) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.text.StringsKt.N(str, ((com.truecaller.ads.util.AdClickRestrictedPartner) obj).getName(), true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.truecaller.ads.util.AdClickRestrictedPartner adClickRestrictedPartner = (com.truecaller.ads.util.AdClickRestrictedPartner) obj;
            if (adClickRestrictedPartner != null) {
                if (!adClickRestrictedPartner.getPlacements().contains(str2)) {
                    adClickRestrictedPartner = null;
                }
                if (adClickRestrictedPartner != null) {
                    return adClickRestrictedPartner.getViews();
                }
            }
        }
        return null;
    }
}
