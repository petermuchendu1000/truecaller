package com.truecaller.messaging.messaginglist.v2.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/messaging/messaginglist/v2/model/BannerType;", "", "<init>", "(Ljava/lang/String;I)V", "NOTIFICATION_PERMISSION", "PASSCODE_LOCK", "URGENT_MESSAGE", "UPDATE_APP", "ADVANCED_BLOCK", "INBOX_CLEANER_OTP", "INBOX_CLEANER_OFFER", "INBOX_CLEANER_SPAM", "INBOX_CLEANER_FRAUD", "THREE_LEVEL_OF_SPAM_LOW", "THREE_LEVEL_OF_SPAM_HIGH_ENABLED", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BannerType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.messaginglist.v2.model.BannerType[] $VALUES;
    public static final com.truecaller.messaging.messaginglist.v2.model.BannerType NOTIFICATION_PERMISSION = new com.truecaller.messaging.messaginglist.v2.model.BannerType("NOTIFICATION_PERMISSION", 0);
    public static final com.truecaller.messaging.messaginglist.v2.model.BannerType PASSCODE_LOCK = new com.truecaller.messaging.messaginglist.v2.model.BannerType("PASSCODE_LOCK", 1);
    public static final com.truecaller.messaging.messaginglist.v2.model.BannerType URGENT_MESSAGE = new com.truecaller.messaging.messaginglist.v2.model.BannerType("URGENT_MESSAGE", 2);
    public static final com.truecaller.messaging.messaginglist.v2.model.BannerType UPDATE_APP = new com.truecaller.messaging.messaginglist.v2.model.BannerType("UPDATE_APP", 3);
    public static final com.truecaller.messaging.messaginglist.v2.model.BannerType ADVANCED_BLOCK = new com.truecaller.messaging.messaginglist.v2.model.BannerType("ADVANCED_BLOCK", 4);
    public static final com.truecaller.messaging.messaginglist.v2.model.BannerType INBOX_CLEANER_OTP = new com.truecaller.messaging.messaginglist.v2.model.BannerType("INBOX_CLEANER_OTP", 5);
    public static final com.truecaller.messaging.messaginglist.v2.model.BannerType INBOX_CLEANER_OFFER = new com.truecaller.messaging.messaginglist.v2.model.BannerType("INBOX_CLEANER_OFFER", 6);
    public static final com.truecaller.messaging.messaginglist.v2.model.BannerType INBOX_CLEANER_SPAM = new com.truecaller.messaging.messaginglist.v2.model.BannerType("INBOX_CLEANER_SPAM", 7);
    public static final com.truecaller.messaging.messaginglist.v2.model.BannerType INBOX_CLEANER_FRAUD = new com.truecaller.messaging.messaginglist.v2.model.BannerType("INBOX_CLEANER_FRAUD", 8);
    public static final com.truecaller.messaging.messaginglist.v2.model.BannerType THREE_LEVEL_OF_SPAM_LOW = new com.truecaller.messaging.messaginglist.v2.model.BannerType("THREE_LEVEL_OF_SPAM_LOW", 9);
    public static final com.truecaller.messaging.messaginglist.v2.model.BannerType THREE_LEVEL_OF_SPAM_HIGH_ENABLED = new com.truecaller.messaging.messaginglist.v2.model.BannerType("THREE_LEVEL_OF_SPAM_HIGH_ENABLED", 10);

    private static final /* synthetic */ com.truecaller.messaging.messaginglist.v2.model.BannerType[] $values() {
        return new com.truecaller.messaging.messaginglist.v2.model.BannerType[]{NOTIFICATION_PERMISSION, PASSCODE_LOCK, URGENT_MESSAGE, UPDATE_APP, ADVANCED_BLOCK, INBOX_CLEANER_OTP, INBOX_CLEANER_OFFER, INBOX_CLEANER_SPAM, INBOX_CLEANER_FRAUD, THREE_LEVEL_OF_SPAM_LOW, THREE_LEVEL_OF_SPAM_HIGH_ENABLED};
    }

    static {
        com.truecaller.messaging.messaginglist.v2.model.BannerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BannerType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.messaginglist.v2.model.BannerType valueOf(java.lang.String str) {
        return (com.truecaller.messaging.messaginglist.v2.model.BannerType) java.lang.Enum.valueOf(com.truecaller.messaging.messaginglist.v2.model.BannerType.class, str);
    }

    public static com.truecaller.messaging.messaginglist.v2.model.BannerType[] values() {
        return (com.truecaller.messaging.messaginglist.v2.model.BannerType[]) $VALUES.clone();
    }
}
