package com.truecaller.call_assistant.core.callmanager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/call_assistant/core/callmanager/AnswerState;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR", "ANSWERED", "CALLER_JOINED", "CONNECTION_INTERRUPTED", "CONNECTION_RESUMED", "CALLER_LEFT", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AnswerState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.callmanager.AnswerState[] $VALUES;
    public static final com.truecaller.call_assistant.core.callmanager.AnswerState ERROR = new com.truecaller.call_assistant.core.callmanager.AnswerState("ERROR", 0);
    public static final com.truecaller.call_assistant.core.callmanager.AnswerState ANSWERED = new com.truecaller.call_assistant.core.callmanager.AnswerState("ANSWERED", 1);
    public static final com.truecaller.call_assistant.core.callmanager.AnswerState CALLER_JOINED = new com.truecaller.call_assistant.core.callmanager.AnswerState("CALLER_JOINED", 2);
    public static final com.truecaller.call_assistant.core.callmanager.AnswerState CONNECTION_INTERRUPTED = new com.truecaller.call_assistant.core.callmanager.AnswerState("CONNECTION_INTERRUPTED", 3);
    public static final com.truecaller.call_assistant.core.callmanager.AnswerState CONNECTION_RESUMED = new com.truecaller.call_assistant.core.callmanager.AnswerState("CONNECTION_RESUMED", 4);
    public static final com.truecaller.call_assistant.core.callmanager.AnswerState CALLER_LEFT = new com.truecaller.call_assistant.core.callmanager.AnswerState("CALLER_LEFT", 5);

    private static final /* synthetic */ com.truecaller.call_assistant.core.callmanager.AnswerState[] $values() {
        return new com.truecaller.call_assistant.core.callmanager.AnswerState[]{ERROR, ANSWERED, CALLER_JOINED, CONNECTION_INTERRUPTED, CONNECTION_RESUMED, CALLER_LEFT};
    }

    static {
        com.truecaller.call_assistant.core.callmanager.AnswerState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AnswerState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.callmanager.AnswerState valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.callmanager.AnswerState) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.callmanager.AnswerState.class, str);
    }

    public static com.truecaller.call_assistant.core.callmanager.AnswerState[] values() {
        return (com.truecaller.call_assistant.core.callmanager.AnswerState[]) $VALUES.clone();
    }
}
