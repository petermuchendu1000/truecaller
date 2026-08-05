package com.truecaller.ads.adsrouter.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/ads/adsrouter/ui/AdNetwork;", "", "<init>", "(Ljava/lang/String;I)V", "GAM", "AD_ROUTER", "AD_ROUTER_OFFLINE", "AMAZON", "APPNEXT", "FACEBOOK", "NONE", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdNetwork {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrouter.ui.AdNetwork[] $VALUES;
    public static final com.truecaller.ads.adsrouter.ui.AdNetwork GAM = new com.truecaller.ads.adsrouter.ui.AdNetwork("GAM", 0);
    public static final com.truecaller.ads.adsrouter.ui.AdNetwork AD_ROUTER = new com.truecaller.ads.adsrouter.ui.AdNetwork("AD_ROUTER", 1);
    public static final com.truecaller.ads.adsrouter.ui.AdNetwork AD_ROUTER_OFFLINE = new com.truecaller.ads.adsrouter.ui.AdNetwork("AD_ROUTER_OFFLINE", 2);
    public static final com.truecaller.ads.adsrouter.ui.AdNetwork AMAZON = new com.truecaller.ads.adsrouter.ui.AdNetwork("AMAZON", 3);
    public static final com.truecaller.ads.adsrouter.ui.AdNetwork APPNEXT = new com.truecaller.ads.adsrouter.ui.AdNetwork("APPNEXT", 4);
    public static final com.truecaller.ads.adsrouter.ui.AdNetwork FACEBOOK = new com.truecaller.ads.adsrouter.ui.AdNetwork("FACEBOOK", 5);
    public static final com.truecaller.ads.adsrouter.ui.AdNetwork NONE = new com.truecaller.ads.adsrouter.ui.AdNetwork("NONE", 6);

    private static final /* synthetic */ com.truecaller.ads.adsrouter.ui.AdNetwork[] $values() {
        return new com.truecaller.ads.adsrouter.ui.AdNetwork[]{GAM, AD_ROUTER, AD_ROUTER_OFFLINE, AMAZON, APPNEXT, FACEBOOK, NONE};
    }

    static {
        com.truecaller.ads.adsrouter.ui.AdNetwork[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AdNetwork(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrouter.ui.AdNetwork valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrouter.ui.AdNetwork) java.lang.Enum.valueOf(com.truecaller.ads.adsrouter.ui.AdNetwork.class, str);
    }

    public static com.truecaller.ads.adsrouter.ui.AdNetwork[] values() {
        return (com.truecaller.ads.adsrouter.ui.AdNetwork[]) $VALUES.clone();
    }
}
