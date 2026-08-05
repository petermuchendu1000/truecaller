package com.truecaller.insights.feedback.sender;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/insights/feedback/sender/SenderFeedbackSourceTypes;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INBOX", "SPAM", "BLOCK_LIST", "REPORT_SENDER", "NOT_SPAM_SENDER", "MARK_AS_SAFE_SENDER", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SenderFeedbackSourceTypes {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes INBOX = new com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes("INBOX", 0, "inbox");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes SPAM = new com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes("SPAM", 1, "spam");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes BLOCK_LIST = new com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes("BLOCK_LIST", 2, "block_list");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes REPORT_SENDER = new com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes("REPORT_SENDER", 3, "report_sender");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes NOT_SPAM_SENDER = new com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes("NOT_SPAM_SENDER", 4, "not_spam_sender");
    public static final com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes MARK_AS_SAFE_SENDER = new com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes("MARK_AS_SAFE_SENDER", 5, "mark_as_safe_sender");

    private static final /* synthetic */ com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes[] $values() {
        return new com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes[]{INBOX, SPAM, BLOCK_LIST, REPORT_SENDER, NOT_SPAM_SENDER, MARK_AS_SAFE_SENDER};
    }

    static {
        com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SenderFeedbackSourceTypes(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes valueOf(java.lang.String str) {
        return (com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes) java.lang.Enum.valueOf(com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes.class, str);
    }

    public static com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes[] values() {
        return (com.truecaller.insights.feedback.sender.SenderFeedbackSourceTypes[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
