package com.truecaller.insights.fraud.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/insights/fraud/analytics/FraudUrlSubsystemResult$Verdict", "", "Lcom/truecaller/insights/fraud/analytics/FraudUrlSubsystemResult$Verdict;", "<init>", "(Ljava/lang/String;I)V", "FRAUD", "UNSPECIFIED", "NOT_APPLICABLE", "ERROR", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudUrlSubsystemResult$Verdict {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict[] $VALUES;
    public static final com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict FRAUD = new com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict("FRAUD", 0);
    public static final com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict UNSPECIFIED = new com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict("UNSPECIFIED", 1);
    public static final com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict NOT_APPLICABLE = new com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict("NOT_APPLICABLE", 2);
    public static final com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict ERROR = new com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict("ERROR", 3);

    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict[] $values() {
        return new com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict[]{FRAUD, UNSPECIFIED, NOT_APPLICABLE, ERROR};
    }

    static {
        com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FraudUrlSubsystemResult$Verdict(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict) java.lang.Enum.valueOf(com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict.class, str);
    }

    public static com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict[] values() {
        return (com.truecaller.insights.fraud.analytics.FraudUrlSubsystemResult$Verdict[]) $VALUES.clone();
    }
}
