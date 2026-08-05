package com.truecaller.insights.models.senderinfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/insights/models/senderinfo/SmartSMSFeatureStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ALLOWED", "BLOCKED", "PRE_FILLED", "INCORRECT_DATA", "DEFAULT", "models_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SmartSMSFeatureStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus[] $VALUES;
    public static final com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus ALLOWED = new com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus("ALLOWED", 0);
    public static final com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus BLOCKED = new com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus("BLOCKED", 1);
    public static final com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus PRE_FILLED = new com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus("PRE_FILLED", 2);
    public static final com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus INCORRECT_DATA = new com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus("INCORRECT_DATA", 3);
    public static final com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus DEFAULT = new com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus("DEFAULT", 4);

    private static final /* synthetic */ com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus[] $values() {
        return new com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus[]{ALLOWED, BLOCKED, PRE_FILLED, INCORRECT_DATA, DEFAULT};
    }

    static {
        com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SmartSMSFeatureStatus(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus valueOf(java.lang.String str) {
        return (com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus) java.lang.Enum.valueOf(com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus.class, str);
    }

    public static com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus[] values() {
        return (com.truecaller.insights.models.senderinfo.SmartSMSFeatureStatus[]) $VALUES.clone();
    }
}
