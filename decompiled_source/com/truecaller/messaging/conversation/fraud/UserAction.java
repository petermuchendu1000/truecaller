package com.truecaller.messaging.conversation.fraud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000f"}, d2 = {"Lcom/truecaller/messaging/conversation/fraud/UserAction;", "", "<init>", "(Ljava/lang/String;I)V", "REPORT_SENDER", "NOT_SPAM_SENDER", "SAFE_SENDER", "REPORT_MESSAGE", "SAFE_MESSAGE", "NOT_SPAM_MESSAGE", "isSenderLevelAction", "", "destination", "Lcom/truecaller/messaging/conversation/fraud/FraudFlowDestination;", "isSpamAction", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class UserAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.conversation.fraud.UserAction[] $VALUES;
    public static final com.truecaller.messaging.conversation.fraud.UserAction REPORT_SENDER = new com.truecaller.messaging.conversation.fraud.UserAction("REPORT_SENDER", 0);
    public static final com.truecaller.messaging.conversation.fraud.UserAction NOT_SPAM_SENDER = new com.truecaller.messaging.conversation.fraud.UserAction("NOT_SPAM_SENDER", 1);
    public static final com.truecaller.messaging.conversation.fraud.UserAction SAFE_SENDER = new com.truecaller.messaging.conversation.fraud.UserAction("SAFE_SENDER", 2);
    public static final com.truecaller.messaging.conversation.fraud.UserAction REPORT_MESSAGE = new com.truecaller.messaging.conversation.fraud.UserAction("REPORT_MESSAGE", 3);
    public static final com.truecaller.messaging.conversation.fraud.UserAction SAFE_MESSAGE = new com.truecaller.messaging.conversation.fraud.UserAction("SAFE_MESSAGE", 4);
    public static final com.truecaller.messaging.conversation.fraud.UserAction NOT_SPAM_MESSAGE = new com.truecaller.messaging.conversation.fraud.UserAction("NOT_SPAM_MESSAGE", 5);

    private static final /* synthetic */ com.truecaller.messaging.conversation.fraud.UserAction[] $values() {
        return new com.truecaller.messaging.conversation.fraud.UserAction[]{REPORT_SENDER, NOT_SPAM_SENDER, SAFE_SENDER, REPORT_MESSAGE, SAFE_MESSAGE, NOT_SPAM_MESSAGE};
    }

    static {
        com.truecaller.messaging.conversation.fraud.UserAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private UserAction(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.conversation.fraud.UserAction valueOf(java.lang.String str) {
        return (com.truecaller.messaging.conversation.fraud.UserAction) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.fraud.UserAction.class, str);
    }

    public static com.truecaller.messaging.conversation.fraud.UserAction[] values() {
        return (com.truecaller.messaging.conversation.fraud.UserAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.conversation.fraud.FraudFlowDestination destination() {
        switch (b12.d0.a[ordinal()]) {
            case 1:
                return com.truecaller.messaging.conversation.fraud.FraudFlowDestination.SPAM_SENDER_MAIN;
            case 2:
                return com.truecaller.messaging.conversation.fraud.FraudFlowDestination.NOT_SPAM_SENDER_MAIN;
            case 3:
                return com.truecaller.messaging.conversation.fraud.FraudFlowDestination.MARK_SENDER_AS_SAFE_MAIN;
            case 4:
                return com.truecaller.messaging.conversation.fraud.FraudFlowDestination.SPAM_MESSAGE_MAIN;
            case 5:
                return com.truecaller.messaging.conversation.fraud.FraudFlowDestination.MARK_MESSAGE_AS_SAFE;
            case 6:
                return com.truecaller.messaging.conversation.fraud.FraudFlowDestination.NOT_SPAM_MESSAGE_MAIN;
            default:
                throw new java.lang.RuntimeException();
        }
    }

    public final boolean isSenderLevelAction() {
        int i = b12.d0.a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public final boolean isSpamAction() {
        int i = b12.d0.a[ordinal()];
        if (i == 1 || i == 4) {
            return true;
        }
        return false;
    }
}
