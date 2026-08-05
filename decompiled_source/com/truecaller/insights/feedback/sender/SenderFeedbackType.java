package com.truecaller.insights.feedback.sender;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/insights/feedback/sender/SenderFeedbackType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "REPORT", "BLOCK", "UNBLOCK", "SPAM", "NOT_SPAM", "FRAUD", "NOT_FRAUD", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SenderFeedbackType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.feedback.sender.SenderFeedbackType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackType REPORT = new com.truecaller.insights.feedback.sender.SenderFeedbackType("REPORT", 0, "report");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackType BLOCK = new com.truecaller.insights.feedback.sender.SenderFeedbackType("BLOCK", 1, "block");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackType UNBLOCK = new com.truecaller.insights.feedback.sender.SenderFeedbackType("UNBLOCK", 2, "unblock");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackType SPAM = new com.truecaller.insights.feedback.sender.SenderFeedbackType("SPAM", 3, "spam");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackType NOT_SPAM = new com.truecaller.insights.feedback.sender.SenderFeedbackType("NOT_SPAM", 4, "not_spam");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackType FRAUD = new com.truecaller.insights.feedback.sender.SenderFeedbackType("FRAUD", 5, "fraud");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackType NOT_FRAUD = new com.truecaller.insights.feedback.sender.SenderFeedbackType("NOT_FRAUD", 6, "not_fraud");

    private static final /* synthetic */ com.truecaller.insights.feedback.sender.SenderFeedbackType[] $values() {
        return new com.truecaller.insights.feedback.sender.SenderFeedbackType[]{REPORT, BLOCK, UNBLOCK, SPAM, NOT_SPAM, FRAUD, NOT_FRAUD};
    }

    static {
        com.truecaller.insights.feedback.sender.SenderFeedbackType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SenderFeedbackType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.feedback.sender.SenderFeedbackType valueOf(java.lang.String str) {
        return (com.truecaller.insights.feedback.sender.SenderFeedbackType) java.lang.Enum.valueOf(com.truecaller.insights.feedback.sender.SenderFeedbackType.class, str);
    }

    public static com.truecaller.insights.feedback.sender.SenderFeedbackType[] values() {
        return (com.truecaller.insights.feedback.sender.SenderFeedbackType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
