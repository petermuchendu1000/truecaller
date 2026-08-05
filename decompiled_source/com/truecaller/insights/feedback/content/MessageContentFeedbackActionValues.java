package com.truecaller.insights.feedback.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/insights/feedback/content/MessageContentFeedbackActionValues;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SPAM", "SPAM_MUTE", "FRAUD_BLOCK", "IMPORTANT", "NOT_IMPORTANT", "TRANSACTION", "BILL", "DELIVERY", "TRAVEL", "OTP", "OTHER", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageContentFeedbackActionValues {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues SPAM = new com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues("SPAM", 0, "spam");
    public static final com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues SPAM_MUTE = new com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues("SPAM_MUTE", 1, "spam_mute");
    public static final com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues FRAUD_BLOCK = new com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues("FRAUD_BLOCK", 2, "fraud_block");
    public static final com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues IMPORTANT = new com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues("IMPORTANT", 3, "important");
    public static final com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues NOT_IMPORTANT = new com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues("NOT_IMPORTANT", 4, "not_important");
    public static final com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues TRANSACTION = new com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues("TRANSACTION", 5, "transaction");
    public static final com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues BILL = new com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues("BILL", 6, "bill");
    public static final com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues DELIVERY = new com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues("DELIVERY", 7, "delivery");
    public static final com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues TRAVEL = new com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues("TRAVEL", 8, "travel");
    public static final com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues OTP = new com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues("OTP", 9, "otp");
    public static final com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues OTHER = new com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues("OTHER", 10, "other");

    private static final /* synthetic */ com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues[] $values() {
        return new com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues[]{SPAM, SPAM_MUTE, FRAUD_BLOCK, IMPORTANT, NOT_IMPORTANT, TRANSACTION, BILL, DELIVERY, TRAVEL, OTP, OTHER};
    }

    static {
        com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MessageContentFeedbackActionValues(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues valueOf(java.lang.String str) {
        return (com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues) java.lang.Enum.valueOf(com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues.class, str);
    }

    public static com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues[] values() {
        return (com.truecaller.insights.feedback.content.MessageContentFeedbackActionValues[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
