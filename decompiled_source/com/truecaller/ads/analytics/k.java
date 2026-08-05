package com.truecaller.ads.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class k {
    public static final com.truecaller.ads.analytics.AdRequestEventSSP a(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return com.truecaller.ads.analytics.AdRequestEventSSP.AD_ROUTER_ON_GAM_API;
            }
            return com.truecaller.ads.analytics.AdRequestEventSSP.AD_ROUTER_API;
        }
        if (z2) {
            return com.truecaller.ads.analytics.AdRequestEventSSP.AD_ROUTER_ON_GAM_SDK;
        }
        return com.truecaller.ads.analytics.AdRequestEventSSP.AD_ROUTER_SDK;
    }

    public static final com.truecaller.ads.analytics.AdRequestEventServedType b(com.truecaller.ads.adsrouter.ui.AdSource adSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSource, "adSource");
        if (kotlin.jvm.internal.Intrinsics.b(adSource, com.truecaller.ads.adsrouter.ui.AdSource.NetworkCache.b)) {
            return com.truecaller.ads.analytics.AdRequestEventServedType.CACHED;
        }
        if (kotlin.jvm.internal.Intrinsics.b(adSource, com.truecaller.ads.adsrouter.ui.AdSource.Offline.b)) {
            return com.truecaller.ads.analytics.AdRequestEventServedType.OFFLINE;
        }
        return com.truecaller.ads.analytics.AdRequestEventServedType.NETWORK;
    }
}
