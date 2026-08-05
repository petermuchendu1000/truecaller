package com.truecaller.call_assistant.core.assistantstatus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/call_assistant/core/assistantstatus/AssistantStatusItemViewState;", "", "<init>", "(Ljava/lang/String;I)V", "AVAILABLE", "UNAVAILABLE", "LOW_CONNECTIVITY", "LOADING", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantStatusItemViewState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState[] $VALUES;
    public static final com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState AVAILABLE = new com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState("AVAILABLE", 0);
    public static final com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState UNAVAILABLE = new com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState("UNAVAILABLE", 1);
    public static final com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState LOW_CONNECTIVITY = new com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState("LOW_CONNECTIVITY", 2);
    public static final com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState LOADING = new com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState("LOADING", 3);

    private static final /* synthetic */ com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState[] $values() {
        return new com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState[]{AVAILABLE, UNAVAILABLE, LOW_CONNECTIVITY, LOADING};
    }

    static {
        com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AssistantStatusItemViewState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState.class, str);
    }

    public static com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState[] values() {
        return (com.truecaller.call_assistant.core.assistantstatus.AssistantStatusItemViewState[]) $VALUES.clone();
    }
}
