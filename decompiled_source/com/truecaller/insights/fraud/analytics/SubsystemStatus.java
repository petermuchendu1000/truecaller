package com.truecaller.insights.fraud.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/insights/fraud/analytics/SubsystemStatus;", "", "<init>", "(Ljava/lang/String;I)V", "RAN", "DISABLED_BY_FF", "NOT_REACHED", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SubsystemStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.SubsystemStatus[] $VALUES;
    public static final com.truecaller.insights.fraud.analytics.SubsystemStatus RAN = new com.truecaller.insights.fraud.analytics.SubsystemStatus("RAN", 0);
    public static final com.truecaller.insights.fraud.analytics.SubsystemStatus DISABLED_BY_FF = new com.truecaller.insights.fraud.analytics.SubsystemStatus("DISABLED_BY_FF", 1);
    public static final com.truecaller.insights.fraud.analytics.SubsystemStatus NOT_REACHED = new com.truecaller.insights.fraud.analytics.SubsystemStatus("NOT_REACHED", 2);

    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.SubsystemStatus[] $values() {
        return new com.truecaller.insights.fraud.analytics.SubsystemStatus[]{RAN, DISABLED_BY_FF, NOT_REACHED};
    }

    static {
        com.truecaller.insights.fraud.analytics.SubsystemStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SubsystemStatus(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.analytics.SubsystemStatus valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.analytics.SubsystemStatus) java.lang.Enum.valueOf(com.truecaller.insights.fraud.analytics.SubsystemStatus.class, str);
    }

    public static com.truecaller.insights.fraud.analytics.SubsystemStatus[] values() {
        return (com.truecaller.insights.fraud.analytics.SubsystemStatus[]) $VALUES.clone();
    }
}
