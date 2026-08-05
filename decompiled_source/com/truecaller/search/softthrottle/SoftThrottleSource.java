package com.truecaller.search.softthrottle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/search/softthrottle/SoftThrottleSource;", "", "<init>", "(Ljava/lang/String;I)V", "AFTER_CALL", "GLOBAL_SEARCH", "DIAL_PAD", "NOTIFICATION", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SoftThrottleSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.search.softthrottle.SoftThrottleSource[] $VALUES;
    public static final com.truecaller.search.softthrottle.SoftThrottleSource AFTER_CALL = new com.truecaller.search.softthrottle.SoftThrottleSource("AFTER_CALL", 0);
    public static final com.truecaller.search.softthrottle.SoftThrottleSource GLOBAL_SEARCH = new com.truecaller.search.softthrottle.SoftThrottleSource("GLOBAL_SEARCH", 1);
    public static final com.truecaller.search.softthrottle.SoftThrottleSource DIAL_PAD = new com.truecaller.search.softthrottle.SoftThrottleSource("DIAL_PAD", 2);
    public static final com.truecaller.search.softthrottle.SoftThrottleSource NOTIFICATION = new com.truecaller.search.softthrottle.SoftThrottleSource("NOTIFICATION", 3);

    private static final /* synthetic */ com.truecaller.search.softthrottle.SoftThrottleSource[] $values() {
        return new com.truecaller.search.softthrottle.SoftThrottleSource[]{AFTER_CALL, GLOBAL_SEARCH, DIAL_PAD, NOTIFICATION};
    }

    static {
        com.truecaller.search.softthrottle.SoftThrottleSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SoftThrottleSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.search.softthrottle.SoftThrottleSource valueOf(java.lang.String str) {
        return (com.truecaller.search.softthrottle.SoftThrottleSource) java.lang.Enum.valueOf(com.truecaller.search.softthrottle.SoftThrottleSource.class, str);
    }

    public static com.truecaller.search.softthrottle.SoftThrottleSource[] values() {
        return (com.truecaller.search.softthrottle.SoftThrottleSource[]) $VALUES.clone();
    }
}
