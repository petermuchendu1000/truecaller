package com.truecaller.call_assistant.api.hint;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/call_assistant/api/hint/AssistantHintCallType;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "INCOMING_CALL", "ONGOING_CALL", "UNKNOWN", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantHintCallType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.api.hint.AssistantHintCallType[] $VALUES;
    public static final com.truecaller.call_assistant.api.hint.AssistantHintCallType INCOMING_CALL = new com.truecaller.call_assistant.api.hint.AssistantHintCallType("INCOMING_CALL", 0, "INCOMING_CALL");
    public static final com.truecaller.call_assistant.api.hint.AssistantHintCallType ONGOING_CALL = new com.truecaller.call_assistant.api.hint.AssistantHintCallType("ONGOING_CALL", 1, "ONGOING_CALL");
    public static final com.truecaller.call_assistant.api.hint.AssistantHintCallType UNKNOWN = new com.truecaller.call_assistant.api.hint.AssistantHintCallType("UNKNOWN", 2, "UNKNOWN");

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    private static final /* synthetic */ com.truecaller.call_assistant.api.hint.AssistantHintCallType[] $values() {
        return new com.truecaller.call_assistant.api.hint.AssistantHintCallType[]{INCOMING_CALL, ONGOING_CALL, UNKNOWN};
    }

    static {
        com.truecaller.call_assistant.api.hint.AssistantHintCallType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AssistantHintCallType(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.api.hint.AssistantHintCallType valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.api.hint.AssistantHintCallType) java.lang.Enum.valueOf(com.truecaller.call_assistant.api.hint.AssistantHintCallType.class, str);
    }

    public static com.truecaller.call_assistant.api.hint.AssistantHintCallType[] values() {
        return (com.truecaller.call_assistant.api.hint.AssistantHintCallType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
