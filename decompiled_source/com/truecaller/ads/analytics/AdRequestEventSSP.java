package com.truecaller.ads.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/ads/analytics/AdRequestEventSSP;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "GAM", "AD_ROUTER_API", "AD_ROUTER_SDK", "AD_ROUTER_ON_GAM_API", "AD_ROUTER_ON_GAM_SDK", "GAM_S2S", "SERVER_UNIFIED_AUCTION_S2S", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdRequestEventSSP {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.analytics.AdRequestEventSSP[] $VALUES;
    private final int code;
    public static final com.truecaller.ads.analytics.AdRequestEventSSP GAM = new com.truecaller.ads.analytics.AdRequestEventSSP("GAM", 0, 1);
    public static final com.truecaller.ads.analytics.AdRequestEventSSP AD_ROUTER_API = new com.truecaller.ads.analytics.AdRequestEventSSP("AD_ROUTER_API", 1, 2);
    public static final com.truecaller.ads.analytics.AdRequestEventSSP AD_ROUTER_SDK = new com.truecaller.ads.analytics.AdRequestEventSSP("AD_ROUTER_SDK", 2, 3);
    public static final com.truecaller.ads.analytics.AdRequestEventSSP AD_ROUTER_ON_GAM_API = new com.truecaller.ads.analytics.AdRequestEventSSP("AD_ROUTER_ON_GAM_API", 3, 4);
    public static final com.truecaller.ads.analytics.AdRequestEventSSP AD_ROUTER_ON_GAM_SDK = new com.truecaller.ads.analytics.AdRequestEventSSP("AD_ROUTER_ON_GAM_SDK", 4, 5);
    public static final com.truecaller.ads.analytics.AdRequestEventSSP GAM_S2S = new com.truecaller.ads.analytics.AdRequestEventSSP("GAM_S2S", 5, 6);
    public static final com.truecaller.ads.analytics.AdRequestEventSSP SERVER_UNIFIED_AUCTION_S2S = new com.truecaller.ads.analytics.AdRequestEventSSP("SERVER_UNIFIED_AUCTION_S2S", 6, 7);

    private static final /* synthetic */ com.truecaller.ads.analytics.AdRequestEventSSP[] $values() {
        return new com.truecaller.ads.analytics.AdRequestEventSSP[]{GAM, AD_ROUTER_API, AD_ROUTER_SDK, AD_ROUTER_ON_GAM_API, AD_ROUTER_ON_GAM_SDK, GAM_S2S, SERVER_UNIFIED_AUCTION_S2S};
    }

    static {
        com.truecaller.ads.analytics.AdRequestEventSSP[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AdRequestEventSSP(java.lang.String str, int i, int i2) {
        this.code = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.analytics.AdRequestEventSSP valueOf(java.lang.String str) {
        return (com.truecaller.ads.analytics.AdRequestEventSSP) java.lang.Enum.valueOf(com.truecaller.ads.analytics.AdRequestEventSSP.class, str);
    }

    public static com.truecaller.ads.analytics.AdRequestEventSSP[] values() {
        return (com.truecaller.ads.analytics.AdRequestEventSSP[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
