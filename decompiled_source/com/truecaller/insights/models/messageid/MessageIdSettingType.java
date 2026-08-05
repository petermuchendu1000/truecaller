package com.truecaller.insights.models.messageid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/insights/models/messageid/MessageIdSettingType;", "", "<init>", "(Ljava/lang/String;I)V", "OTP", "BANK", "BILL", "DELIVERY", "TRAVEL", "EVENT", "FRAUD", "GOV_UPDATE", "LLM_SUMMARY", "FEEDBACK", "models_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageIdSettingType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.models.messageid.MessageIdSettingType[] $VALUES;
    public static final com.truecaller.insights.models.messageid.MessageIdSettingType OTP = new com.truecaller.insights.models.messageid.MessageIdSettingType("OTP", 0);
    public static final com.truecaller.insights.models.messageid.MessageIdSettingType BANK = new com.truecaller.insights.models.messageid.MessageIdSettingType("BANK", 1);
    public static final com.truecaller.insights.models.messageid.MessageIdSettingType BILL = new com.truecaller.insights.models.messageid.MessageIdSettingType("BILL", 2);
    public static final com.truecaller.insights.models.messageid.MessageIdSettingType DELIVERY = new com.truecaller.insights.models.messageid.MessageIdSettingType("DELIVERY", 3);
    public static final com.truecaller.insights.models.messageid.MessageIdSettingType TRAVEL = new com.truecaller.insights.models.messageid.MessageIdSettingType("TRAVEL", 4);
    public static final com.truecaller.insights.models.messageid.MessageIdSettingType EVENT = new com.truecaller.insights.models.messageid.MessageIdSettingType("EVENT", 5);
    public static final com.truecaller.insights.models.messageid.MessageIdSettingType FRAUD = new com.truecaller.insights.models.messageid.MessageIdSettingType("FRAUD", 6);
    public static final com.truecaller.insights.models.messageid.MessageIdSettingType GOV_UPDATE = new com.truecaller.insights.models.messageid.MessageIdSettingType("GOV_UPDATE", 7);
    public static final com.truecaller.insights.models.messageid.MessageIdSettingType LLM_SUMMARY = new com.truecaller.insights.models.messageid.MessageIdSettingType("LLM_SUMMARY", 8);
    public static final com.truecaller.insights.models.messageid.MessageIdSettingType FEEDBACK = new com.truecaller.insights.models.messageid.MessageIdSettingType("FEEDBACK", 9);

    private static final /* synthetic */ com.truecaller.insights.models.messageid.MessageIdSettingType[] $values() {
        return new com.truecaller.insights.models.messageid.MessageIdSettingType[]{OTP, BANK, BILL, DELIVERY, TRAVEL, EVENT, FRAUD, GOV_UPDATE, LLM_SUMMARY, FEEDBACK};
    }

    static {
        com.truecaller.insights.models.messageid.MessageIdSettingType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MessageIdSettingType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.models.messageid.MessageIdSettingType valueOf(java.lang.String str) {
        return (com.truecaller.insights.models.messageid.MessageIdSettingType) java.lang.Enum.valueOf(com.truecaller.insights.models.messageid.MessageIdSettingType.class, str);
    }

    public static com.truecaller.insights.models.messageid.MessageIdSettingType[] values() {
        return (com.truecaller.insights.models.messageid.MessageIdSettingType[]) $VALUES.clone();
    }
}
