package com.truecaller.ads.adsrouter.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"com/truecaller/ads/adsrouter/ui/AdRouterNativeAd$VideoMetrics", "", "Lcom/truecaller/ads/adsrouter/ui/AdRouterNativeAd$VideoMetrics;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "START", "FIRST_QUARTILE", "MIDPOINT", "THIRD_QUARTILE", "COMPLETE", "MUTE", "UNMUTE", "REPLAY", "TAP_TO_REDIRECT", "TAP_TO_UNMUTE", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdRouterNativeAd$VideoMetrics {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics START = new com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics("START", 0, "start");
    public static final com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics FIRST_QUARTILE = new com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics("FIRST_QUARTILE", 1, "firstQuartile");
    public static final com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics MIDPOINT = new com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics("MIDPOINT", 2, "midpoint");
    public static final com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics THIRD_QUARTILE = new com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics("THIRD_QUARTILE", 3, "thirdQuartile");
    public static final com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics COMPLETE = new com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics("COMPLETE", 4, "complete");
    public static final com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics MUTE = new com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics("MUTE", 5, "mute");
    public static final com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics UNMUTE = new com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics("UNMUTE", 6, "unmute");
    public static final com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics REPLAY = new com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics("REPLAY", 7, "replay");
    public static final com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics TAP_TO_REDIRECT = new com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics("TAP_TO_REDIRECT", 8, "ttr");
    public static final com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics TAP_TO_UNMUTE = new com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics("TAP_TO_UNMUTE", 9, "ttum");

    private static final /* synthetic */ com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics[] $values() {
        return new com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics[]{START, FIRST_QUARTILE, MIDPOINT, THIRD_QUARTILE, COMPLETE, MUTE, UNMUTE, REPLAY, TAP_TO_REDIRECT, TAP_TO_UNMUTE};
    }

    static {
        com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AdRouterNativeAd$VideoMetrics(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics) java.lang.Enum.valueOf(com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics.class, str);
    }

    public static com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics[] values() {
        return (com.truecaller.ads.adsrouter.ui.AdRouterNativeAd$VideoMetrics[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
