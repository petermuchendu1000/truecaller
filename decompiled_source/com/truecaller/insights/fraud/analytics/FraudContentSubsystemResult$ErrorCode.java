package com.truecaller.insights.fraud.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/truecaller/insights/fraud/analytics/FraudContentSubsystemResult$ErrorCode", "", "Lcom/truecaller/insights/fraud/analytics/FraudContentSubsystemResult$ErrorCode;", "<init>", "(Ljava/lang/String;I)V", "INVALID_OUTPUT", "TIMEOUT", "MODEL_NOT_AVAILABLE", "INVALID_INPUT", "QUEUE_FULL", "UNKNOWN_ERROR", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudContentSubsystemResult$ErrorCode {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode[] $VALUES;
    public static final com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode INVALID_OUTPUT = new com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode("INVALID_OUTPUT", 0);
    public static final com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode TIMEOUT = new com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode("TIMEOUT", 1);
    public static final com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode MODEL_NOT_AVAILABLE = new com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode("MODEL_NOT_AVAILABLE", 2);
    public static final com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode INVALID_INPUT = new com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode("INVALID_INPUT", 3);
    public static final com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode QUEUE_FULL = new com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode("QUEUE_FULL", 4);
    public static final com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode UNKNOWN_ERROR = new com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode("UNKNOWN_ERROR", 5);

    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode[] $values() {
        return new com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode[]{INVALID_OUTPUT, TIMEOUT, MODEL_NOT_AVAILABLE, INVALID_INPUT, QUEUE_FULL, UNKNOWN_ERROR};
    }

    static {
        com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FraudContentSubsystemResult$ErrorCode(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode) java.lang.Enum.valueOf(com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode.class, str);
    }

    public static com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode[] values() {
        return (com.truecaller.insights.fraud.analytics.FraudContentSubsystemResult$ErrorCode[]) $VALUES.clone();
    }
}
