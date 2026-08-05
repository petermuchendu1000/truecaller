package com.truecaller.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/stats/StatsPeriod;", "", "<init>", "(Ljava/lang/String;I)V", "LAST_30_DAYS", "LAST_3_MONTH", "LAST_6_MONTH", "THIS_YEAR", "ALL_TIME", "stats_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class StatsPeriod {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.stats.StatsPeriod[] $VALUES;
    public static final com.truecaller.stats.StatsPeriod LAST_30_DAYS = new com.truecaller.stats.StatsPeriod("LAST_30_DAYS", 0);
    public static final com.truecaller.stats.StatsPeriod LAST_3_MONTH = new com.truecaller.stats.StatsPeriod("LAST_3_MONTH", 1);
    public static final com.truecaller.stats.StatsPeriod LAST_6_MONTH = new com.truecaller.stats.StatsPeriod("LAST_6_MONTH", 2);
    public static final com.truecaller.stats.StatsPeriod THIS_YEAR = new com.truecaller.stats.StatsPeriod("THIS_YEAR", 3);
    public static final com.truecaller.stats.StatsPeriod ALL_TIME = new com.truecaller.stats.StatsPeriod("ALL_TIME", 4);

    private static final /* synthetic */ com.truecaller.stats.StatsPeriod[] $values() {
        return new com.truecaller.stats.StatsPeriod[]{LAST_30_DAYS, LAST_3_MONTH, LAST_6_MONTH, THIS_YEAR, ALL_TIME};
    }

    static {
        com.truecaller.stats.StatsPeriod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private StatsPeriod(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.stats.StatsPeriod valueOf(java.lang.String str) {
        return (com.truecaller.stats.StatsPeriod) java.lang.Enum.valueOf(com.truecaller.stats.StatsPeriod.class, str);
    }

    public static com.truecaller.stats.StatsPeriod[] values() {
        return (com.truecaller.stats.StatsPeriod[]) $VALUES.clone();
    }
}
