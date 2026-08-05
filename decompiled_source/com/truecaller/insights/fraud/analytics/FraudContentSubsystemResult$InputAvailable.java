package com.truecaller.insights.fraud.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/insights/fraud/analytics/FraudContentSubsystemResult$InputAvailable", "", "Lcom/truecaller/insights/fraud/analytics/FraudContentSubsystemResult$InputAvailable;", "<init>", "(Ljava/lang/String;I)V", "TEXT_PRESENT", "TEXT_ABSENT", "TEXT_GUARDRAIL_FILTERED", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudContentSubsystemResult$InputAvailable {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable[] $VALUES;
    public static final com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable TEXT_PRESENT = new com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable("TEXT_PRESENT", 0);
    public static final com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable TEXT_ABSENT = new com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable("TEXT_ABSENT", 1);
    public static final com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable TEXT_GUARDRAIL_FILTERED = new com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable("TEXT_GUARDRAIL_FILTERED", 2);

    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable[] $values() {
        return new com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable[]{TEXT_PRESENT, TEXT_ABSENT, TEXT_GUARDRAIL_FILTERED};
    }

    static {
        com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FraudContentSubsystemResult$InputAvailable(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable) java.lang.Enum.valueOf(com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable.class, str);
    }

    public static com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable[] values() {
        return (com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$InputAvailable[]) $VALUES.clone();
    }
}
