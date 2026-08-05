package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class p {
    public static final kotlin.Lazy a = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a(24));

    public static java.lang.String a(java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "partnerName");
        java.util.List list = (java.util.List) a.getValue();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.text.StringsKt.N(str, ((com.truecaller.ads.util.AdPartnerNameIndicatorConfig) obj).getName(), true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.truecaller.ads.util.AdPartnerNameIndicatorConfig adPartnerNameIndicatorConfig = (com.truecaller.ads.util.AdPartnerNameIndicatorConfig) obj;
            if (adPartnerNameIndicatorConfig != null) {
                return adPartnerNameIndicatorConfig.getIndicator();
            }
        }
        return null;
    }
}
