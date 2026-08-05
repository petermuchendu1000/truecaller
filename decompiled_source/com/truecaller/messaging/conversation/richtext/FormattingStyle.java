package com.truecaller.messaging.conversation.richtext;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/messaging/conversation/richtext/FormattingStyle;", "", "delimiter", "", "allowMultiline", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getDelimiter", "()Ljava/lang/String;", "getAllowMultiline", "()Z", "BOLD", "ITALIC", "UNDERLINE", "STRIKETHROUGH", "MONOSPACE_MULTILINE", "MONOSPACE", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FormattingStyle {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.conversation.richtext.FormattingStyle[] $VALUES;
    private final boolean allowMultiline;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String delimiter;
    public static final com.truecaller.messaging.conversation.richtext.FormattingStyle BOLD = new com.truecaller.messaging.conversation.richtext.FormattingStyle("BOLD", 0, "*", false);
    public static final com.truecaller.messaging.conversation.richtext.FormattingStyle ITALIC = new com.truecaller.messaging.conversation.richtext.FormattingStyle("ITALIC", 1, "_", false);
    public static final com.truecaller.messaging.conversation.richtext.FormattingStyle UNDERLINE = new com.truecaller.messaging.conversation.richtext.FormattingStyle("UNDERLINE", 2, "+", false);
    public static final com.truecaller.messaging.conversation.richtext.FormattingStyle STRIKETHROUGH = new com.truecaller.messaging.conversation.richtext.FormattingStyle("STRIKETHROUGH", 3, "~", false);
    public static final com.truecaller.messaging.conversation.richtext.FormattingStyle MONOSPACE_MULTILINE = new com.truecaller.messaging.conversation.richtext.FormattingStyle("MONOSPACE_MULTILINE", 4, "```", true);
    public static final com.truecaller.messaging.conversation.richtext.FormattingStyle MONOSPACE = new com.truecaller.messaging.conversation.richtext.FormattingStyle("MONOSPACE", 5, "`", false);

    private static final /* synthetic */ com.truecaller.messaging.conversation.richtext.FormattingStyle[] $values() {
        return new com.truecaller.messaging.conversation.richtext.FormattingStyle[]{BOLD, ITALIC, UNDERLINE, STRIKETHROUGH, MONOSPACE_MULTILINE, MONOSPACE};
    }

    static {
        com.truecaller.messaging.conversation.richtext.FormattingStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FormattingStyle(java.lang.String str, int i, java.lang.String str2, boolean z) {
        this.delimiter = str2;
        this.allowMultiline = z;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.conversation.richtext.FormattingStyle valueOf(java.lang.String str) {
        return (com.truecaller.messaging.conversation.richtext.FormattingStyle) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.richtext.FormattingStyle.class, str);
    }

    public static com.truecaller.messaging.conversation.richtext.FormattingStyle[] values() {
        return (com.truecaller.messaging.conversation.richtext.FormattingStyle[]) $VALUES.clone();
    }

    public final boolean getAllowMultiline() {
        return this.allowMultiline;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDelimiter() {
        return this.delimiter;
    }
}
