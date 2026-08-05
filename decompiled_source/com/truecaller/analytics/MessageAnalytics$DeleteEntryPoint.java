package com.truecaller.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/truecaller/analytics/MessageAnalytics$DeleteEntryPoint", "", "Lcom/truecaller/analytics/MessageAnalytics$DeleteEntryPoint;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "SWIPE_DELETE_DIALOG", "ROW_OVERFLOW_MENU", "CONVERSATION_OVERFLOW_MENU", "LONG_PRESS_CONTEXT_MENU", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class MessageAnalytics$DeleteEntryPoint {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint SWIPE_DELETE_DIALOG = new com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint("SWIPE_DELETE_DIALOG", 0, "swipe_delete_dialog");
    public static final com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint ROW_OVERFLOW_MENU = new com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint("ROW_OVERFLOW_MENU", 1, "row_overflow_menu");
    public static final com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint CONVERSATION_OVERFLOW_MENU = new com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint("CONVERSATION_OVERFLOW_MENU", 2, "conversation_overflow_menu");
    public static final com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint LONG_PRESS_CONTEXT_MENU = new com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint("LONG_PRESS_CONTEXT_MENU", 3, "long_press_context_menu");

    private static final /* synthetic */ com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint[] $values() {
        return new com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint[]{SWIPE_DELETE_DIALOG, ROW_OVERFLOW_MENU, CONVERSATION_OVERFLOW_MENU, LONG_PRESS_CONTEXT_MENU};
    }

    static {
        com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MessageAnalytics$DeleteEntryPoint(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint valueOf(java.lang.String str) {
        return (com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint) java.lang.Enum.valueOf(com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint.class, str);
    }

    public static com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint[] values() {
        return (com.truecaller.analytics.MessageAnalytics$DeleteEntryPoint[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
