package com.truecaller.insights.feedback.message;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/insights/feedback/message/MessageFeedbackSources;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CONVERSATION", "BOTTOM_SHEET", "CUSTOM_HEADS_UP_NOTIFICATION", "REGULAR_NOTIFICATION", "THREE_LEVEL_SPAM_SETTING", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageFeedbackSources {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.feedback.message.MessageFeedbackSources[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.insights.feedback.message.MessageFeedbackSources CONVERSATION = new com.truecaller.insights.feedback.message.MessageFeedbackSources("CONVERSATION", 0, "conversation");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackSources BOTTOM_SHEET = new com.truecaller.insights.feedback.message.MessageFeedbackSources("BOTTOM_SHEET", 1, "bottom_sheet");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackSources CUSTOM_HEADS_UP_NOTIFICATION = new com.truecaller.insights.feedback.message.MessageFeedbackSources("CUSTOM_HEADS_UP_NOTIFICATION", 2, "custom_heads_up_notification");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackSources REGULAR_NOTIFICATION = new com.truecaller.insights.feedback.message.MessageFeedbackSources("REGULAR_NOTIFICATION", 3, "regular_notification");
    public static final com.truecaller.insights.feedback.message.MessageFeedbackSources THREE_LEVEL_SPAM_SETTING = new com.truecaller.insights.feedback.message.MessageFeedbackSources("THREE_LEVEL_SPAM_SETTING", 4, "three_level_spam_setting");

    private static final /* synthetic */ com.truecaller.insights.feedback.message.MessageFeedbackSources[] $values() {
        return new com.truecaller.insights.feedback.message.MessageFeedbackSources[]{CONVERSATION, BOTTOM_SHEET, CUSTOM_HEADS_UP_NOTIFICATION, REGULAR_NOTIFICATION, THREE_LEVEL_SPAM_SETTING};
    }

    static {
        com.truecaller.insights.feedback.message.MessageFeedbackSources[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MessageFeedbackSources(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.feedback.message.MessageFeedbackSources valueOf(java.lang.String str) {
        return (com.truecaller.insights.feedback.message.MessageFeedbackSources) java.lang.Enum.valueOf(com.truecaller.insights.feedback.message.MessageFeedbackSources.class, str);
    }

    public static com.truecaller.insights.feedback.message.MessageFeedbackSources[] values() {
        return (com.truecaller.insights.feedback.message.MessageFeedbackSources[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
