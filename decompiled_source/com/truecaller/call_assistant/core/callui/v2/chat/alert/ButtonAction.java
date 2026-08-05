package com.truecaller.call_assistant.core.callui.v2.chat.alert;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/call_assistant/core/callui/v2/chat/alert/ButtonAction;", "", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "so0/b", "END_CALL", "BLOCK", "ANSWER", "IGNORE", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ButtonAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final so0.b Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction END_CALL = new com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction("END_CALL", 0, "endcall");
    public static final com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction BLOCK = new com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction("BLOCK", 1, "block");
    public static final com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction ANSWER = new com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction("ANSWER", 2, "answer");
    public static final com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction IGNORE = new com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction("IGNORE", 3, "ignore");

    private static final /* synthetic */ com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction[] $values() {
        return new com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction[]{END_CALL, BLOCK, ANSWER, IGNORE};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, so0.b] */
    static {
        com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ButtonAction(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction.class, str);
    }

    public static com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction[] values() {
        return (com.truecaller.call_assistant.core.callui.v2.chat.alert.ButtonAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
