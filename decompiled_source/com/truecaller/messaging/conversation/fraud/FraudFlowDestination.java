package com.truecaller.messaging.conversation.fraud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/truecaller/messaging/conversation/fraud/FraudFlowDestination;", "", "<init>", "(Ljava/lang/String;I)V", "SPAM_MESSAGE_MAIN", "SPAM_MESSAGE_SECONDARY", "SPAM_MESSAGE_SECONDARY_NON_DMA", "NOT_SPAM_MESSAGE_MAIN", "NOT_SPAM_MESSAGE_SECONDARY", "NOT_SPAM_MESSAGE_SECONDARY_NON_DMA", "SPAM_SENDER_MAIN", "SPAM_SENDER_SECONDARY", "BLOCK_FRAUD_SENDER_SECONDARY", "FRAUD_MESSAGE_REPORTED_SECONDARY", "NOT_SPAM_SENDER_MAIN", "NOT_SPAM_SENDER_SECONDARY", "MARK_SENDER_AS_SAFE_MAIN", "MARK_SENDER_AS_SAFE_SECONDARY", "MARK_MESSAGE_AS_SAFE", "MARK_MESSAGE_AS_SAFE_SECONDARY", "NONE", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudFlowDestination {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.conversation.fraud.FraudFlowDestination[] $VALUES;
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination SPAM_MESSAGE_MAIN = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("SPAM_MESSAGE_MAIN", 0);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination SPAM_MESSAGE_SECONDARY = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("SPAM_MESSAGE_SECONDARY", 1);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination SPAM_MESSAGE_SECONDARY_NON_DMA = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("SPAM_MESSAGE_SECONDARY_NON_DMA", 2);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination NOT_SPAM_MESSAGE_MAIN = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("NOT_SPAM_MESSAGE_MAIN", 3);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination NOT_SPAM_MESSAGE_SECONDARY = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("NOT_SPAM_MESSAGE_SECONDARY", 4);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination NOT_SPAM_MESSAGE_SECONDARY_NON_DMA = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("NOT_SPAM_MESSAGE_SECONDARY_NON_DMA", 5);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination SPAM_SENDER_MAIN = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("SPAM_SENDER_MAIN", 6);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination SPAM_SENDER_SECONDARY = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("SPAM_SENDER_SECONDARY", 7);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination BLOCK_FRAUD_SENDER_SECONDARY = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("BLOCK_FRAUD_SENDER_SECONDARY", 8);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination FRAUD_MESSAGE_REPORTED_SECONDARY = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("FRAUD_MESSAGE_REPORTED_SECONDARY", 9);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination NOT_SPAM_SENDER_MAIN = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("NOT_SPAM_SENDER_MAIN", 10);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination NOT_SPAM_SENDER_SECONDARY = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("NOT_SPAM_SENDER_SECONDARY", 11);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination MARK_SENDER_AS_SAFE_MAIN = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("MARK_SENDER_AS_SAFE_MAIN", 12);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination MARK_SENDER_AS_SAFE_SECONDARY = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("MARK_SENDER_AS_SAFE_SECONDARY", 13);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination MARK_MESSAGE_AS_SAFE = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("MARK_MESSAGE_AS_SAFE", 14);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination MARK_MESSAGE_AS_SAFE_SECONDARY = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("MARK_MESSAGE_AS_SAFE_SECONDARY", 15);
    public static final com.truecaller.messaging.conversation.fraud.FraudFlowDestination NONE = new com.truecaller.messaging.conversation.fraud.FraudFlowDestination("NONE", 16);

    private static final /* synthetic */ com.truecaller.messaging.conversation.fraud.FraudFlowDestination[] $values() {
        return new com.truecaller.messaging.conversation.fraud.FraudFlowDestination[]{SPAM_MESSAGE_MAIN, SPAM_MESSAGE_SECONDARY, SPAM_MESSAGE_SECONDARY_NON_DMA, NOT_SPAM_MESSAGE_MAIN, NOT_SPAM_MESSAGE_SECONDARY, NOT_SPAM_MESSAGE_SECONDARY_NON_DMA, SPAM_SENDER_MAIN, SPAM_SENDER_SECONDARY, BLOCK_FRAUD_SENDER_SECONDARY, FRAUD_MESSAGE_REPORTED_SECONDARY, NOT_SPAM_SENDER_MAIN, NOT_SPAM_SENDER_SECONDARY, MARK_SENDER_AS_SAFE_MAIN, MARK_SENDER_AS_SAFE_SECONDARY, MARK_MESSAGE_AS_SAFE, MARK_MESSAGE_AS_SAFE_SECONDARY, NONE};
    }

    static {
        com.truecaller.messaging.conversation.fraud.FraudFlowDestination[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FraudFlowDestination(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.conversation.fraud.FraudFlowDestination valueOf(java.lang.String str) {
        return (com.truecaller.messaging.conversation.fraud.FraudFlowDestination) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.fraud.FraudFlowDestination.class, str);
    }

    public static com.truecaller.messaging.conversation.fraud.FraudFlowDestination[] values() {
        return (com.truecaller.messaging.conversation.fraud.FraudFlowDestination[]) $VALUES.clone();
    }
}
