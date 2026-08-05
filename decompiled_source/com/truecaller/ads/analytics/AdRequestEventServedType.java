package com.truecaller.ads.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/ads/analytics/AdRequestEventServedType;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "NETWORK", "CACHED", "OFFLINE", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdRequestEventServedType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.analytics.AdRequestEventServedType[] $VALUES;
    private final int code;
    public static final com.truecaller.ads.analytics.AdRequestEventServedType NETWORK = new com.truecaller.ads.analytics.AdRequestEventServedType("NETWORK", 0, 1);
    public static final com.truecaller.ads.analytics.AdRequestEventServedType CACHED = new com.truecaller.ads.analytics.AdRequestEventServedType("CACHED", 1, 2);
    public static final com.truecaller.ads.analytics.AdRequestEventServedType OFFLINE = new com.truecaller.ads.analytics.AdRequestEventServedType("OFFLINE", 2, 3);

    private static final /* synthetic */ com.truecaller.ads.analytics.AdRequestEventServedType[] $values() {
        return new com.truecaller.ads.analytics.AdRequestEventServedType[]{NETWORK, CACHED, OFFLINE};
    }

    static {
        com.truecaller.ads.analytics.AdRequestEventServedType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AdRequestEventServedType(java.lang.String str, int i, int i2) {
        this.code = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.analytics.AdRequestEventServedType valueOf(java.lang.String str) {
        return (com.truecaller.ads.analytics.AdRequestEventServedType) java.lang.Enum.valueOf(com.truecaller.ads.analytics.AdRequestEventServedType.class, str);
    }

    public static com.truecaller.ads.analytics.AdRequestEventServedType[] values() {
        return (com.truecaller.ads.analytics.AdRequestEventServedType[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
