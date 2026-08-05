package com.truecaller.insights.fraud.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/truecaller/insights/fraud/analytics/FraudSenderSubsystemResult$InputAvailable", "", "Lcom/truecaller/insights/fraud/analytics/FraudSenderSubsystemResult$InputAvailable;", "<init>", "(Ljava/lang/String;I)V", "CONTACT_DATA_PRESENT", "CONTACT_DATA_ABSENT", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudSenderSubsystemResult$InputAvailable {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudSenderSubsystemResult$InputAvailable[] $VALUES;
    public static final com.truecaller.insights.fraud.analytics.FraudSenderSubsystemResult$InputAvailable CONTACT_DATA_PRESENT = new com.truecaller.insights.fraud.analytics.FraudSenderSubsystemResult$InputAvailable("CONTACT_DATA_PRESENT", 0);
    public static final com.truecaller.insights.fraud.analytics.FraudSenderSubsystemResult$InputAvailable CONTACT_DATA_ABSENT = new com.truecaller.insights.fraud.analytics.FraudSenderSubsystemResult$InputAvailable("CONTACT_DATA_ABSENT", 1);

    private static final /* synthetic */ com.truecaller.insights.fraud.analytics.FraudSenderSubsystemResult$InputAvailable[] $values() {
        return new com.truecaller.insights.fraud.analytics.FraudSenderSubsystemResult$InputAvailable[]{CONTACT_DATA_PRESENT, CONTACT_DATA_ABSENT};
    }

    static {
        com.truecaller.insights.fraud.analytics.FraudSenderSubsystemResult$InputAvailable[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FraudSenderSubsystemResult$InputAvailable(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.analytics.FraudSenderSubsystemResult$InputAvailable valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.analytics.FraudSenderSubsystemResult$InputAvailable) java.lang.Enum.valueOf(com.truecaller.insights.fraud.analytics.FraudSenderSubsystemResult$InputAvailable.class, str);
    }

    public static com.truecaller.insights.fraud.analytics.FraudSenderSubsystemResult$InputAvailable[] values() {
        return (com.truecaller.insights.fraud.analytics.FraudSenderSubsystemResult$InputAvailable[]) $VALUES.clone();
    }
}
