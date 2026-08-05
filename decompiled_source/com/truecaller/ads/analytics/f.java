package com.truecaller.ads.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class f {
    public static final kotlin.Lazy a = kotlin.LazyKt.lazy(new com.truecaller.ads.analytics.d(0));

    public static boolean a() {
        java.lang.Boolean bool;
        com.truecaller.ads.analytics.AdsEventStatusConfig adsEventStatusConfig = (com.truecaller.ads.analytics.AdsEventStatusConfig) a.getValue();
        if (adsEventStatusConfig != null) {
            bool = java.lang.Boolean.valueOf(adsEventStatusConfig.getAdAcsEvent());
        } else {
            bool = null;
        }
        return yp.d0.D(bool);
    }

    public static boolean b() {
        java.lang.Boolean bool;
        com.truecaller.ads.analytics.AdsEventStatusConfig adsEventStatusConfig = (com.truecaller.ads.analytics.AdsEventStatusConfig) a.getValue();
        if (adsEventStatusConfig != null) {
            bool = java.lang.Boolean.valueOf(adsEventStatusConfig.getAdFunnelEvent());
        } else {
            bool = null;
        }
        return yp.d0.D(bool);
    }

    public static boolean c() {
        java.lang.Boolean bool;
        com.truecaller.ads.analytics.AdsEventStatusConfig adsEventStatusConfig = (com.truecaller.ads.analytics.AdsEventStatusConfig) a.getValue();
        if (adsEventStatusConfig != null) {
            bool = java.lang.Boolean.valueOf(adsEventStatusConfig.getAdRequestEvent());
        } else {
            bool = null;
        }
        return yp.d0.D(bool);
    }
}
