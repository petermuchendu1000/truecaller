package com.truecaller.call_assistant.core.callui.v2.chat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/truecaller/call_assistant/core/callui/v2/chat/ChatMessage$TerminationReason", "", "Lcom/truecaller/call_assistant/core/callui/v2/chat/ChatMessage$TerminationReason;", "", "code", "<init>", "(Ljava/lang/String;II)V", "I", "getCode", "()I", "Companion", "ro0/p", "CALLER_HUNG_UP", "USER_HUNG_UP", "USER_TIMEOUT", "CALLER_TIMEOUT", "ANSWERED", "UNRECOGNIZED", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ChatMessage$TerminationReason {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ro0.p Companion;
    private final int code;
    public static final com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason CALLER_HUNG_UP = new com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason("CALLER_HUNG_UP", 0, 0);
    public static final com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason USER_HUNG_UP = new com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason("USER_HUNG_UP", 1, 1);
    public static final com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason USER_TIMEOUT = new com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason("USER_TIMEOUT", 2, 2);
    public static final com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason CALLER_TIMEOUT = new com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason("CALLER_TIMEOUT", 3, 3);
    public static final com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason ANSWERED = new com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason("ANSWERED", 4, 4);
    public static final com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason UNRECOGNIZED = new com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason("UNRECOGNIZED", 5, -1);

    private static final /* synthetic */ com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason[] $values() {
        return new com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason[]{CALLER_HUNG_UP, USER_HUNG_UP, USER_TIMEOUT, CALLER_TIMEOUT, ANSWERED, UNRECOGNIZED};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, ro0.p] */
    static {
        com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ChatMessage$TerminationReason(java.lang.String str, int i, int i2) {
        this.code = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason.class, str);
    }

    public static com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason[] values() {
        return (com.truecaller.call_assistant.core.callui.v2.chat.ChatMessage$TerminationReason[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
