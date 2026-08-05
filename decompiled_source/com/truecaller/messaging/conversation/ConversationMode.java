package com.truecaller.messaging.conversation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/messaging/conversation/ConversationMode;", "", "context", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getContext", "()Ljava/lang/String;", "DEFAULT", "SCHEDULE", "IM", "SMS", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ConversationMode {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.conversation.ConversationMode[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String context;
    public static final com.truecaller.messaging.conversation.ConversationMode DEFAULT = new com.truecaller.messaging.conversation.ConversationMode("DEFAULT", 0, "conversation");
    public static final com.truecaller.messaging.conversation.ConversationMode SCHEDULE = new com.truecaller.messaging.conversation.ConversationMode("SCHEDULE", 1, "scheduledMessages");
    public static final com.truecaller.messaging.conversation.ConversationMode IM = new com.truecaller.messaging.conversation.ConversationMode("IM", 2, "conversation");
    public static final com.truecaller.messaging.conversation.ConversationMode SMS = new com.truecaller.messaging.conversation.ConversationMode("SMS", 3, "conversation");

    private static final /* synthetic */ com.truecaller.messaging.conversation.ConversationMode[] $values() {
        return new com.truecaller.messaging.conversation.ConversationMode[]{DEFAULT, SCHEDULE, IM, SMS};
    }

    static {
        com.truecaller.messaging.conversation.ConversationMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ConversationMode(java.lang.String str, int i, java.lang.String str2) {
        this.context = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.conversation.ConversationMode valueOf(java.lang.String str) {
        return (com.truecaller.messaging.conversation.ConversationMode) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.ConversationMode.class, str);
    }

    public static com.truecaller.messaging.conversation.ConversationMode[] values() {
        return (com.truecaller.messaging.conversation.ConversationMode[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContext() {
        return this.context;
    }
}
