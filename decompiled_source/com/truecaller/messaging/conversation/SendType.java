package com.truecaller.messaging.conversation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/messaging/conversation/SendType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "SMS", "IM", "URGENT_MESSAGE", "SCHEDULE_MESSAGE", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SendType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.conversation.SendType[] $VALUES;
    public static final com.truecaller.messaging.conversation.SendType DEFAULT = new com.truecaller.messaging.conversation.SendType("DEFAULT", 0);
    public static final com.truecaller.messaging.conversation.SendType SMS = new com.truecaller.messaging.conversation.SendType("SMS", 1);
    public static final com.truecaller.messaging.conversation.SendType IM = new com.truecaller.messaging.conversation.SendType("IM", 2);
    public static final com.truecaller.messaging.conversation.SendType URGENT_MESSAGE = new com.truecaller.messaging.conversation.SendType("URGENT_MESSAGE", 3);
    public static final com.truecaller.messaging.conversation.SendType SCHEDULE_MESSAGE = new com.truecaller.messaging.conversation.SendType("SCHEDULE_MESSAGE", 4);

    private static final /* synthetic */ com.truecaller.messaging.conversation.SendType[] $values() {
        return new com.truecaller.messaging.conversation.SendType[]{DEFAULT, SMS, IM, URGENT_MESSAGE, SCHEDULE_MESSAGE};
    }

    static {
        com.truecaller.messaging.conversation.SendType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SendType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.conversation.SendType valueOf(java.lang.String str) {
        return (com.truecaller.messaging.conversation.SendType) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.SendType.class, str);
    }

    public static com.truecaller.messaging.conversation.SendType[] values() {
        return (com.truecaller.messaging.conversation.SendType[]) $VALUES.clone();
    }
}
