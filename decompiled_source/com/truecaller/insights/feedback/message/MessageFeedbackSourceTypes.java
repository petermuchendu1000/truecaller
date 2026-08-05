package com.truecaller.insights.feedback.message;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/insights/feedback/message/MessageFeedbackSourceTypes;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INBOX", "SPAM", "REPORT_MESSAGE", "NOT_SPAM_MESSAGE", "BIZ_IM", "REGULAR_VERIFIED", "FRAUD", "MARK_AS_SAFE_MESSAGE", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageFeedbackSourceTypes {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes INBOX = new com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes("INBOX", 0, "inbox");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes SPAM = new com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes("SPAM", 1, "spam");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes REPORT_MESSAGE = new com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes("REPORT_MESSAGE", 2, "report_message");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes NOT_SPAM_MESSAGE = new com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes("NOT_SPAM_MESSAGE", 3, "not_spam_message");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes BIZ_IM = new com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes("BIZ_IM", 4, "biz_im");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes REGULAR_VERIFIED = new com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes("REGULAR_VERIFIED", 5, "regular_verified");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes FRAUD = new com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes("FRAUD", 6, "fraud");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes MARK_AS_SAFE_MESSAGE = new com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes("MARK_AS_SAFE_MESSAGE", 7, "mark_as_safe_message");

    private static final /* synthetic */ com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes[] $values() {
        return new com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes[]{INBOX, SPAM, REPORT_MESSAGE, NOT_SPAM_MESSAGE, BIZ_IM, REGULAR_VERIFIED, FRAUD, MARK_AS_SAFE_MESSAGE};
    }

    static {
        com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MessageFeedbackSourceTypes(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes valueOf(java.lang.String str) {
        return (com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes) java.lang.Enum.valueOf(com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes.class, str);
    }

    public static com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes[] values() {
        return (com.truecaller.insights.feedback.message.MessageFeedbackSourceTypes[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
