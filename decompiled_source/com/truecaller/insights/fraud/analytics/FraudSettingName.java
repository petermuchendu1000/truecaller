package com.truecaller.insights.fraud.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/insights/fraud/analytics/FraudSettingName;", "", "message", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "FRAUD_WARNINGS", "MESSAGE_LOGGING_CONSENT", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudSettingName {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudSettingName[] $VALUES;
    public static final com.truecaller.insights.fraud.analytics.FraudSettingName FRAUD_WARNINGS = new com.truecaller.insights.fraud.analytics.FraudSettingName("FRAUD_WARNINGS", 0, "fraud_warnings");
    public static final com.truecaller.insights.fraud.analytics.FraudSettingName MESSAGE_LOGGING_CONSENT = new com.truecaller.insights.fraud.analytics.FraudSettingName("MESSAGE_LOGGING_CONSENT", 1, "message_logging_consent");

    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;

    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudSettingName[] $values() {
        return new com.truecaller.insights.fraud.analytics.FraudSettingName[]{FRAUD_WARNINGS, MESSAGE_LOGGING_CONSENT};
    }

    static {
        com.truecaller.insights.fraud.analytics.FraudSettingName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FraudSettingName(java.lang.String str, int i, java.lang.String str2) {
        this.message = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.analytics.FraudSettingName valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.analytics.FraudSettingName) java.lang.Enum.valueOf(com.truecaller.insights.fraud.analytics.FraudSettingName.class, str);
    }

    public static com.truecaller.insights.fraud.analytics.FraudSettingName[] values() {
        return (com.truecaller.insights.fraud.analytics.FraudSettingName[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }
}
