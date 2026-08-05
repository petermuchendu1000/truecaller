package com.truecaller.insights.feedback.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/insights/feedback/content/MessageContentFeedbackActionElements;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BUTTON", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageContentFeedbackActionElements {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.feedback.content.MessageContentFeedbackActionElements[] $VALUES;
    public static final com.truecaller.insights.feedback.content.MessageContentFeedbackActionElements BUTTON = new com.truecaller.insights.feedback.content.MessageContentFeedbackActionElements("BUTTON", 0, "button");

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    private static final /* synthetic */ com.truecaller.insights.feedback.content.MessageContentFeedbackActionElements[] $values() {
        return new com.truecaller.insights.feedback.content.MessageContentFeedbackActionElements[]{BUTTON};
    }

    static {
        com.truecaller.insights.feedback.content.MessageContentFeedbackActionElements[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MessageContentFeedbackActionElements(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.feedback.content.MessageContentFeedbackActionElements valueOf(java.lang.String str) {
        return (com.truecaller.insights.feedback.content.MessageContentFeedbackActionElements) java.lang.Enum.valueOf(com.truecaller.insights.feedback.content.MessageContentFeedbackActionElements.class, str);
    }

    public static com.truecaller.insights.feedback.content.MessageContentFeedbackActionElements[] values() {
        return (com.truecaller.insights.feedback.content.MessageContentFeedbackActionElements[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
