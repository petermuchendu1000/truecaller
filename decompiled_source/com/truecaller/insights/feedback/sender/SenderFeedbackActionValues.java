package com.truecaller.insights.feedback.sender;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/insights/feedback/sender/SenderFeedbackActionValues;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "REPORT", "SPAM_MUTE", "FRAUD_BLOCK", "NOT_SPAM", "IMPORTANT", "NOT_IMPORTANT", "MARK_AS_SAFE", "BLOCK", "UNBLOCK", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SenderFeedbackActionValues {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.feedback.sender.SenderFeedbackActionValues[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackActionValues REPORT = new com.truecaller.insights.feedback.sender.SenderFeedbackActionValues("REPORT", 0, "report");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackActionValues SPAM_MUTE = new com.truecaller.insights.feedback.sender.SenderFeedbackActionValues("SPAM_MUTE", 1, "spam_mute");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackActionValues FRAUD_BLOCK = new com.truecaller.insights.feedback.sender.SenderFeedbackActionValues("FRAUD_BLOCK", 2, "fraud_block");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackActionValues NOT_SPAM = new com.truecaller.insights.feedback.sender.SenderFeedbackActionValues("NOT_SPAM", 3, "not_spam");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackActionValues IMPORTANT = new com.truecaller.insights.feedback.sender.SenderFeedbackActionValues("IMPORTANT", 4, "important");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackActionValues NOT_IMPORTANT = new com.truecaller.insights.feedback.sender.SenderFeedbackActionValues("NOT_IMPORTANT", 5, "not_important");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackActionValues MARK_AS_SAFE = new com.truecaller.insights.feedback.sender.SenderFeedbackActionValues("MARK_AS_SAFE", 6, "mark_as_safe");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackActionValues BLOCK = new com.truecaller.insights.feedback.sender.SenderFeedbackActionValues("BLOCK", 7, "block");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackActionValues UNBLOCK = new com.truecaller.insights.feedback.sender.SenderFeedbackActionValues("UNBLOCK", 8, "unblock");

    private static final /* synthetic */ com.truecaller.insights.feedback.sender.SenderFeedbackActionValues[] $values() {
        return new com.truecaller.insights.feedback.sender.SenderFeedbackActionValues[]{REPORT, SPAM_MUTE, FRAUD_BLOCK, NOT_SPAM, IMPORTANT, NOT_IMPORTANT, MARK_AS_SAFE, BLOCK, UNBLOCK};
    }

    static {
        com.truecaller.insights.feedback.sender.SenderFeedbackActionValues[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SenderFeedbackActionValues(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.feedback.sender.SenderFeedbackActionValues valueOf(java.lang.String str) {
        return (com.truecaller.insights.feedback.sender.SenderFeedbackActionValues) java.lang.Enum.valueOf(com.truecaller.insights.feedback.sender.SenderFeedbackActionValues.class, str);
    }

    public static com.truecaller.insights.feedback.sender.SenderFeedbackActionValues[] values() {
        return (com.truecaller.insights.feedback.sender.SenderFeedbackActionValues[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
