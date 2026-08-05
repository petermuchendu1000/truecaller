package com.truecaller.call_assistant.core.callui.v2.chat;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/v2/chat/MessageType;", "", "", "code", "<init>", "(Ljava/lang/String;II)V", "I", "getCode", "()I", "Companion", "ro0/u", "ASSISTANT", "CALLER", "ALERT", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class MessageType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.callui.v2.chat.MessageType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ro0.u Companion;
    private final int code;
    public static final com.truecaller.call_assistant.core.callui.v2.chat.MessageType ASSISTANT = new com.truecaller.call_assistant.core.callui.v2.chat.MessageType("ASSISTANT", 0, 0);
    public static final com.truecaller.call_assistant.core.callui.v2.chat.MessageType CALLER = new com.truecaller.call_assistant.core.callui.v2.chat.MessageType("CALLER", 1, 1);
    public static final com.truecaller.call_assistant.core.callui.v2.chat.MessageType ALERT = new com.truecaller.call_assistant.core.callui.v2.chat.MessageType("ALERT", 2, 4);

    private static final /* synthetic */ com.truecaller.call_assistant.core.callui.v2.chat.MessageType[] $values() {
        return new com.truecaller.call_assistant.core.callui.v2.chat.MessageType[]{ASSISTANT, CALLER, ALERT};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ro0.u, java.lang.Object] */
    static {
        com.truecaller.call_assistant.core.callui.v2.chat.MessageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private MessageType(java.lang.String str, int i, int i2) {
        this.code = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.callui.v2.chat.MessageType valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.callui.v2.chat.MessageType) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.callui.v2.chat.MessageType.class, str);
    }

    public static com.truecaller.call_assistant.core.callui.v2.chat.MessageType[] values() {
        return (com.truecaller.call_assistant.core.callui.v2.chat.MessageType[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
