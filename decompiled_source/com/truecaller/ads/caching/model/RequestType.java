package com.truecaller.ads.caching.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/ads/caching/model/RequestType;", "", "<init>", "(Ljava/lang/String;I)V", "UNIFIED", "NATIVE", "BANNER", "CUSTOM", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class RequestType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.caching.model.RequestType[] $VALUES;

    @bw.qux("unified")
    public static final com.truecaller.ads.caching.model.RequestType UNIFIED = new com.truecaller.ads.caching.model.RequestType("UNIFIED", 0);

    @bw.qux("native")
    public static final com.truecaller.ads.caching.model.RequestType NATIVE = new com.truecaller.ads.caching.model.RequestType("NATIVE", 1);

    @bw.qux("banner")
    public static final com.truecaller.ads.caching.model.RequestType BANNER = new com.truecaller.ads.caching.model.RequestType("BANNER", 2);

    @bw.qux("custom")
    public static final com.truecaller.ads.caching.model.RequestType CUSTOM = new com.truecaller.ads.caching.model.RequestType("CUSTOM", 3);

    private static final /* synthetic */ com.truecaller.ads.caching.model.RequestType[] $values() {
        return new com.truecaller.ads.caching.model.RequestType[]{UNIFIED, NATIVE, BANNER, CUSTOM};
    }

    static {
        com.truecaller.ads.caching.model.RequestType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RequestType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.caching.model.RequestType valueOf(java.lang.String str) {
        return (com.truecaller.ads.caching.model.RequestType) java.lang.Enum.valueOf(com.truecaller.ads.caching.model.RequestType.class, str);
    }

    public static com.truecaller.ads.caching.model.RequestType[] values() {
        return (com.truecaller.ads.caching.model.RequestType[]) $VALUES.clone();
    }
}
