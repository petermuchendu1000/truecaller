package com.truecaller.insights.feedback.message;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/truecaller/insights/feedback/message/MessageFeedbackActionValues;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "REPORT", "THIS_IS_SPAM", "MUTE_SPAM", "SPAM", "FRAUD_BLOCK", "IMPORTANT", "NOT_IMPORTANT", "MARK_AS_SAFE", "NOT_SPAM", "THIS_IS_NOT_SPAM", "STOP_SPAM", "TRANSACTION", "BILL", "DELIVERY", "TRAVEL", "OTP", "OTHER", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageFeedbackActionValues {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.feedback.message.MessageFeedbackActionValues[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues REPORT = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("REPORT", 0, "report");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues THIS_IS_SPAM = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("THIS_IS_SPAM", 1, "this_is_spam");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues MUTE_SPAM = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("MUTE_SPAM", 2, "mute_spam");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues SPAM = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("SPAM", 3, "spam");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues FRAUD_BLOCK = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("FRAUD_BLOCK", 4, "fraud_block");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues IMPORTANT = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("IMPORTANT", 5, "important");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues NOT_IMPORTANT = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("NOT_IMPORTANT", 6, "not_important");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues MARK_AS_SAFE = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("MARK_AS_SAFE", 7, "mark_as_safe");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues NOT_SPAM = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("NOT_SPAM", 8, "not_spam");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues THIS_IS_NOT_SPAM = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("THIS_IS_NOT_SPAM", 9, "this_is_not_spam");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues STOP_SPAM = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("STOP_SPAM", 10, "stop_spam");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues TRANSACTION = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("TRANSACTION", 11, "transaction");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues BILL = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("BILL", 12, "bill");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues DELIVERY = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("DELIVERY", 13, "delivery");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues TRAVEL = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("TRAVEL", 14, "travel");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues OTP = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("OTP", 15, "otp");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackActionValues OTHER = new com.truecaller.insights.feedback.message.MessageFeedbackActionValues("OTHER", 16, "other");

    private static final /* synthetic */ com.truecaller.insights.feedback.message.MessageFeedbackActionValues[] $values() {
        return new com.truecaller.insights.feedback.message.MessageFeedbackActionValues[]{REPORT, THIS_IS_SPAM, MUTE_SPAM, SPAM, FRAUD_BLOCK, IMPORTANT, NOT_IMPORTANT, MARK_AS_SAFE, NOT_SPAM, THIS_IS_NOT_SPAM, STOP_SPAM, TRANSACTION, BILL, DELIVERY, TRAVEL, OTP, OTHER};
    }

    static {
        com.truecaller.insights.feedback.message.MessageFeedbackActionValues[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MessageFeedbackActionValues(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.feedback.message.MessageFeedbackActionValues valueOf(java.lang.String str) {
        return (com.truecaller.insights.feedback.message.MessageFeedbackActionValues) java.lang.Enum.valueOf(com.truecaller.insights.feedback.message.MessageFeedbackActionValues.class, str);
    }

    public static com.truecaller.insights.feedback.message.MessageFeedbackActionValues[] values() {
        return (com.truecaller.insights.feedback.message.MessageFeedbackActionValues[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
