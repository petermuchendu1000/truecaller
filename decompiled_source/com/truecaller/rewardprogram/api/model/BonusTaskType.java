package com.truecaller.rewardprogram.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/rewardprogram/api/model/BonusTaskType;", "", "<init>", "(Ljava/lang/String;I)V", "WELCOME_GIFT", "ADD_PICTURE", "COMPLETE_PROFILE", "CLEAN_INBOX", "EXPLORE_BLOCK_SETTINGS", "BATTERY_OPTIMIZATION", "PHONE_APP", "MESSAGING_APP", "CALLER_ID", "CONNECT_GOOGLE_ACCOUNT", "ENABLE_BACKUP", "FEEDBACK_SURVEY", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class BonusTaskType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.rewardprogram.api.model.BonusTaskType[] $VALUES;
    public static final com.truecaller.rewardprogram.api.model.BonusTaskType WELCOME_GIFT = new com.truecaller.rewardprogram.api.model.BonusTaskType("WELCOME_GIFT", 0);
    public static final com.truecaller.rewardprogram.api.model.BonusTaskType ADD_PICTURE = new com.truecaller.rewardprogram.api.model.BonusTaskType("ADD_PICTURE", 1);
    public static final com.truecaller.rewardprogram.api.model.BonusTaskType COMPLETE_PROFILE = new com.truecaller.rewardprogram.api.model.BonusTaskType("COMPLETE_PROFILE", 2);
    public static final com.truecaller.rewardprogram.api.model.BonusTaskType CLEAN_INBOX = new com.truecaller.rewardprogram.api.model.BonusTaskType("CLEAN_INBOX", 3);
    public static final com.truecaller.rewardprogram.api.model.BonusTaskType EXPLORE_BLOCK_SETTINGS = new com.truecaller.rewardprogram.api.model.BonusTaskType("EXPLORE_BLOCK_SETTINGS", 4);
    public static final com.truecaller.rewardprogram.api.model.BonusTaskType BATTERY_OPTIMIZATION = new com.truecaller.rewardprogram.api.model.BonusTaskType("BATTERY_OPTIMIZATION", 5);
    public static final com.truecaller.rewardprogram.api.model.BonusTaskType PHONE_APP = new com.truecaller.rewardprogram.api.model.BonusTaskType("PHONE_APP", 6);
    public static final com.truecaller.rewardprogram.api.model.BonusTaskType MESSAGING_APP = new com.truecaller.rewardprogram.api.model.BonusTaskType("MESSAGING_APP", 7);
    public static final com.truecaller.rewardprogram.api.model.BonusTaskType CALLER_ID = new com.truecaller.rewardprogram.api.model.BonusTaskType("CALLER_ID", 8);
    public static final com.truecaller.rewardprogram.api.model.BonusTaskType CONNECT_GOOGLE_ACCOUNT = new com.truecaller.rewardprogram.api.model.BonusTaskType("CONNECT_GOOGLE_ACCOUNT", 9);
    public static final com.truecaller.rewardprogram.api.model.BonusTaskType ENABLE_BACKUP = new com.truecaller.rewardprogram.api.model.BonusTaskType("ENABLE_BACKUP", 10);
    public static final com.truecaller.rewardprogram.api.model.BonusTaskType FEEDBACK_SURVEY = new com.truecaller.rewardprogram.api.model.BonusTaskType("FEEDBACK_SURVEY", 11);

    private static final /* synthetic */ com.truecaller.rewardprogram.api.model.BonusTaskType[] $values() {
        return new com.truecaller.rewardprogram.api.model.BonusTaskType[]{WELCOME_GIFT, ADD_PICTURE, COMPLETE_PROFILE, CLEAN_INBOX, EXPLORE_BLOCK_SETTINGS, BATTERY_OPTIMIZATION, PHONE_APP, MESSAGING_APP, CALLER_ID, CONNECT_GOOGLE_ACCOUNT, ENABLE_BACKUP, FEEDBACK_SURVEY};
    }

    static {
        com.truecaller.rewardprogram.api.model.BonusTaskType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BonusTaskType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.rewardprogram.api.model.BonusTaskType valueOf(java.lang.String str) {
        return (com.truecaller.rewardprogram.api.model.BonusTaskType) java.lang.Enum.valueOf(com.truecaller.rewardprogram.api.model.BonusTaskType.class, str);
    }

    public static com.truecaller.rewardprogram.api.model.BonusTaskType[] values() {
        return (com.truecaller.rewardprogram.api.model.BonusTaskType[]) $VALUES.clone();
    }
}
