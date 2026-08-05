package com.truecaller.insights.repository.filters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/insights/repository/filters/SmartSmsFeature;", "", "<init>", "(Ljava/lang/String;I)V", "INFOCARD", "ALL", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SmartSmsFeature {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.repository.filters.SmartSmsFeature[] $VALUES;
    public static final com.truecaller.insights.repository.filters.SmartSmsFeature INFOCARD = new com.truecaller.insights.repository.filters.SmartSmsFeature("INFOCARD", 0);
    public static final com.truecaller.insights.repository.filters.SmartSmsFeature ALL = new com.truecaller.insights.repository.filters.SmartSmsFeature("ALL", 1);

    private static final /* synthetic */ com.truecaller.insights.repository.filters.SmartSmsFeature[] $values() {
        return new com.truecaller.insights.repository.filters.SmartSmsFeature[]{INFOCARD, ALL};
    }

    static {
        com.truecaller.insights.repository.filters.SmartSmsFeature[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SmartSmsFeature(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.repository.filters.SmartSmsFeature valueOf(java.lang.String str) {
        return (com.truecaller.insights.repository.filters.SmartSmsFeature) java.lang.Enum.valueOf(com.truecaller.insights.repository.filters.SmartSmsFeature.class, str);
    }

    public static com.truecaller.insights.repository.filters.SmartSmsFeature[] values() {
        return (com.truecaller.insights.repository.filters.SmartSmsFeature[]) $VALUES.clone();
    }
}
