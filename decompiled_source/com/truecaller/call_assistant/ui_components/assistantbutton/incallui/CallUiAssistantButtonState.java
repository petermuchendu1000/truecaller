package com.truecaller.call_assistant.ui_components.assistantbutton.incallui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/call_assistant/ui_components/assistantbutton/incallui/CallUiAssistantButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "HIDDEN", "LOADING", "REGULAR", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallUiAssistantButtonState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState[] $VALUES;
    public static final com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState HIDDEN = new com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState("HIDDEN", 0);
    public static final com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState LOADING = new com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState("LOADING", 1);
    public static final com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState REGULAR = new com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState("REGULAR", 2);

    private static final /* synthetic */ com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState[] $values() {
        return new com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState[]{HIDDEN, LOADING, REGULAR};
    }

    static {
        com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallUiAssistantButtonState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState) java.lang.Enum.valueOf(com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState.class, str);
    }

    public static com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState[] values() {
        return (com.truecaller.call_assistant.ui_components.assistantbutton.incallui.CallUiAssistantButtonState[]) $VALUES.clone();
    }
}
