package com.truecaller.ads.adsrouter.network;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/truecaller/ads/adsrouter/network/NetworkTracker$HttpVersion", "", "Lcom/truecaller/ads/adsrouter/network/NetworkTracker$HttpVersion;", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "UNKNOWN", "HTTP_2", "CRONET_HTTP_2", "CRONET_QUIC", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class NetworkTracker$HttpVersion {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion[] $VALUES;
    private final int value;
    public static final com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion UNKNOWN = new com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion("UNKNOWN", 0, 0);
    public static final com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion HTTP_2 = new com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion("HTTP_2", 1, 1);
    public static final com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion CRONET_HTTP_2 = new com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion("CRONET_HTTP_2", 2, 2);
    public static final com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion CRONET_QUIC = new com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion("CRONET_QUIC", 3, 3);

    private static final /* synthetic */ com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion[] $values() {
        return new com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion[]{UNKNOWN, HTTP_2, CRONET_HTTP_2, CRONET_QUIC};
    }

    static {
        com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NetworkTracker$HttpVersion(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion) java.lang.Enum.valueOf(com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion.class, str);
    }

    public static com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion[] values() {
        return (com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
