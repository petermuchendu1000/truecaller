package com.truecaller.messaging.messaginglist.v2.threelevelspam;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/messaging/messaginglist/v2/threelevelspam/MessagingLevelLottieAnimation;", "", "<init>", "(Ljava/lang/String;I)V", "LOW_TO_MEDIUM", "LOW_TO_HIGH", "MEDIUM_TO_LOW", "MEDIUM_TO_HIGH", "HIGH_TO_LOW", "HIGH_TO_MEDIUM", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessagingLevelLottieAnimation {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation[] $VALUES;
    public static final com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation LOW_TO_MEDIUM = new com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation("LOW_TO_MEDIUM", 0);
    public static final com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation LOW_TO_HIGH = new com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation("LOW_TO_HIGH", 1);
    public static final com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation MEDIUM_TO_LOW = new com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation("MEDIUM_TO_LOW", 2);
    public static final com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation MEDIUM_TO_HIGH = new com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation("MEDIUM_TO_HIGH", 3);
    public static final com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation HIGH_TO_LOW = new com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation("HIGH_TO_LOW", 4);
    public static final com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation HIGH_TO_MEDIUM = new com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation("HIGH_TO_MEDIUM", 5);

    private static final /* synthetic */ com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation[] $values() {
        return new com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation[]{LOW_TO_MEDIUM, LOW_TO_HIGH, MEDIUM_TO_LOW, MEDIUM_TO_HIGH, HIGH_TO_LOW, HIGH_TO_MEDIUM};
    }

    static {
        com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MessagingLevelLottieAnimation(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation valueOf(java.lang.String str) {
        return (com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation) java.lang.Enum.valueOf(com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation.class, str);
    }

    public static com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation[] values() {
        return (com.truecaller.messaging.messaginglist.v2.threelevelspam.MessagingLevelLottieAnimation[]) $VALUES.clone();
    }
}
