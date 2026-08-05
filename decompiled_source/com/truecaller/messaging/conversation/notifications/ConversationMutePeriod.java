package com.truecaller.messaging.conversation.notifications;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/messaging/conversation/notifications/ConversationMutePeriod;", "", "stringResId", "", "<init>", "(Ljava/lang/String;II)V", "getStringResId", "()I", "ONE_HOUR", "TWENTY_FOUR_HOURS", "FOREVER", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ConversationMutePeriod {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.conversation.notifications.ConversationMutePeriod[] $VALUES;
    private final int stringResId;
    public static final com.truecaller.messaging.conversation.notifications.ConversationMutePeriod ONE_HOUR = new com.truecaller.messaging.conversation.notifications.ConversationMutePeriod("ONE_HOUR", 0, 2132020294);
    public static final com.truecaller.messaging.conversation.notifications.ConversationMutePeriod TWENTY_FOUR_HOURS = new com.truecaller.messaging.conversation.notifications.ConversationMutePeriod("TWENTY_FOUR_HOURS", 1, 2132020292);
    public static final com.truecaller.messaging.conversation.notifications.ConversationMutePeriod FOREVER = new com.truecaller.messaging.conversation.notifications.ConversationMutePeriod("FOREVER", 2, 2132020293);

    private static final /* synthetic */ com.truecaller.messaging.conversation.notifications.ConversationMutePeriod[] $values() {
        return new com.truecaller.messaging.conversation.notifications.ConversationMutePeriod[]{ONE_HOUR, TWENTY_FOUR_HOURS, FOREVER};
    }

    static {
        com.truecaller.messaging.conversation.notifications.ConversationMutePeriod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ConversationMutePeriod(java.lang.String str, int i, int i2) {
        this.stringResId = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.conversation.notifications.ConversationMutePeriod valueOf(java.lang.String str) {
        return (com.truecaller.messaging.conversation.notifications.ConversationMutePeriod) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.notifications.ConversationMutePeriod.class, str);
    }

    public static com.truecaller.messaging.conversation.notifications.ConversationMutePeriod[] values() {
        return (com.truecaller.messaging.conversation.notifications.ConversationMutePeriod[]) $VALUES.clone();
    }

    public final int getStringResId() {
        return this.stringResId;
    }
}
