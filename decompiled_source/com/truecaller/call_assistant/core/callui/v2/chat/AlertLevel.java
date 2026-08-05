package com.truecaller.call_assistant.core.callui.v2.chat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/v2/chat/AlertLevel;", "", "<init>", "(Ljava/lang/String;I)V", "", "toString", "()Ljava/lang/String;", "Companion", "ro0/bar", "NEUTRAL", "INFO", "SUCCESS", "WARNING", "ERROR", "NEGATIVE", "CRITICAL", "INSIGHT", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AlertLevel {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ro0.bar Companion;
    public static final com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel NEUTRAL = new com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel("NEUTRAL", 0);
    public static final com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel INFO = new com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel("INFO", 1);
    public static final com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel SUCCESS = new com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel("SUCCESS", 2);
    public static final com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel WARNING = new com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel("WARNING", 3);
    public static final com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel ERROR = new com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel("ERROR", 4);
    public static final com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel NEGATIVE = new com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel("NEGATIVE", 5);
    public static final com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel CRITICAL = new com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel("CRITICAL", 6);
    public static final com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel INSIGHT = new com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel("INSIGHT", 7);

    private static final /* synthetic */ com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel[] $values() {
        return new com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel[]{NEUTRAL, INFO, SUCCESS, WARNING, ERROR, NEGATIVE, CRITICAL, INSIGHT};
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [ro0.bar, java.lang.Object] */
    static {
        com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private AlertLevel(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel.class, str);
    }

    public static com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel[] values() {
        return (com.truecaller.call_assistant.core.callui.v2.chat.AlertLevel[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String lowerCase = name().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
