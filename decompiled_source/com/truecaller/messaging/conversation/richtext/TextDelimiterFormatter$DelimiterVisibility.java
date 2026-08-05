package com.truecaller.messaging.conversation.richtext;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/messaging/conversation/richtext/TextDelimiterFormatter$DelimiterVisibility", "", "Lcom/truecaller/messaging/conversation/richtext/TextDelimiterFormatter$DelimiterVisibility;", "<init>", "(Ljava/lang/String;I)V", "SHOW", "HIDE", "REMOVE", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TextDelimiterFormatter$DelimiterVisibility {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility[] $VALUES;
    public static final com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility SHOW = new com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility("SHOW", 0);
    public static final com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility HIDE = new com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility("HIDE", 1);
    public static final com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility REMOVE = new com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility("REMOVE", 2);

    private static final /* synthetic */ com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility[] $values() {
        return new com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility[]{SHOW, HIDE, REMOVE};
    }

    static {
        com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TextDelimiterFormatter$DelimiterVisibility(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility valueOf(java.lang.String str) {
        return (com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility.class, str);
    }

    public static com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility[] values() {
        return (com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility[]) $VALUES.clone();
    }
}
