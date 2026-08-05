package com.truecaller.insights.fraud.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/insights/fraud/analytics/FraudUserActionType;", "", "message", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "MARK_MESSAGE_SAFE", "MARK_SENDER_SAFE", "REPORT_MESSAGE_FRAUD", "REPORT_SENDER_FRAUD", "BLOCK_SENDER", "OPEN_FAQ", "GO_TO_SETTINGS", "DISABLE_FRAUD_WARNINGS", "ENABLE_FRAUD_WARNINGS", "DISMISS", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudUserActionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudUserActionType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;
    public static final com.truecaller.insights.fraud.analytics.FraudUserActionType MARK_MESSAGE_SAFE = new com.truecaller.insights.fraud.analytics.FraudUserActionType("MARK_MESSAGE_SAFE", 0, "mark_message_safe");
    public static final com.truecaller.insights.fraud.analytics.FraudUserActionType MARK_SENDER_SAFE = new com.truecaller.insights.fraud.analytics.FraudUserActionType("MARK_SENDER_SAFE", 1, "mark_sender_safe");
    public static final com.truecaller.insights.fraud.analytics.FraudUserActionType REPORT_MESSAGE_FRAUD = new com.truecaller.insights.fraud.analytics.FraudUserActionType("REPORT_MESSAGE_FRAUD", 2, "report_message_fraud");
    public static final com.truecaller.insights.fraud.analytics.FraudUserActionType REPORT_SENDER_FRAUD = new com.truecaller.insights.fraud.analytics.FraudUserActionType("REPORT_SENDER_FRAUD", 3, "report_sender_fraud");
    public static final com.truecaller.insights.fraud.analytics.FraudUserActionType BLOCK_SENDER = new com.truecaller.insights.fraud.analytics.FraudUserActionType("BLOCK_SENDER", 4, "block_sender");
    public static final com.truecaller.insights.fraud.analytics.FraudUserActionType OPEN_FAQ = new com.truecaller.insights.fraud.analytics.FraudUserActionType("OPEN_FAQ", 5, "open_faq");
    public static final com.truecaller.insights.fraud.analytics.FraudUserActionType GO_TO_SETTINGS = new com.truecaller.insights.fraud.analytics.FraudUserActionType("GO_TO_SETTINGS", 6, "go_to_settings");
    public static final com.truecaller.insights.fraud.analytics.FraudUserActionType DISABLE_FRAUD_WARNINGS = new com.truecaller.insights.fraud.analytics.FraudUserActionType("DISABLE_FRAUD_WARNINGS", 7, "disable_fraud_warnings");
    public static final com.truecaller.insights.fraud.analytics.FraudUserActionType ENABLE_FRAUD_WARNINGS = new com.truecaller.insights.fraud.analytics.FraudUserActionType("ENABLE_FRAUD_WARNINGS", 8, "enable_fraud_warnings");
    public static final com.truecaller.insights.fraud.analytics.FraudUserActionType DISMISS = new com.truecaller.insights.fraud.analytics.FraudUserActionType("DISMISS", 9, "dismiss");

    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudUserActionType[] $values() {
        return new com.truecaller.insights.fraud.analytics.FraudUserActionType[]{MARK_MESSAGE_SAFE, MARK_SENDER_SAFE, REPORT_MESSAGE_FRAUD, REPORT_SENDER_FRAUD, BLOCK_SENDER, OPEN_FAQ, GO_TO_SETTINGS, DISABLE_FRAUD_WARNINGS, ENABLE_FRAUD_WARNINGS, DISMISS};
    }

    static {
        com.truecaller.insights.fraud.analytics.FraudUserActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FraudUserActionType(java.lang.String str, int i, java.lang.String str2) {
        this.message = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.analytics.FraudUserActionType valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.analytics.FraudUserActionType) java.lang.Enum.valueOf(com.truecaller.insights.fraud.analytics.FraudUserActionType.class, str);
    }

    public static com.truecaller.insights.fraud.analytics.FraudUserActionType[] values() {
        return (com.truecaller.insights.fraud.analytics.FraudUserActionType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }
}
