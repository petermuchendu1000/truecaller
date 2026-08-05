package com.truecaller.call_assistant.core.customvoice.createvoice;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/truecaller/call_assistant/core/customvoice/createvoice/CustomVoiceCreatePresenter$State", "", "Lcom/truecaller/call_assistant/core/customvoice/createvoice/CustomVoiceCreatePresenter$State;", "<init>", "(Ljava/lang/String;I)V", "TERMS", "CONSENT", "DYNAMIC", "RECORDING_CONSENT", "RECORDING_DYNAMIC", "UPLOADING", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CustomVoiceCreatePresenter$State {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State[] $VALUES;
    public static final com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State TERMS = new com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State("TERMS", 0);
    public static final com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State CONSENT = new com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State("CONSENT", 1);
    public static final com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State DYNAMIC = new com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State("DYNAMIC", 2);
    public static final com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State RECORDING_CONSENT = new com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State("RECORDING_CONSENT", 3);
    public static final com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State RECORDING_DYNAMIC = new com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State("RECORDING_DYNAMIC", 4);
    public static final com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State UPLOADING = new com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State("UPLOADING", 5);

    private static final /* synthetic */ com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State[] $values() {
        return new com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State[]{TERMS, CONSENT, DYNAMIC, RECORDING_CONSENT, RECORDING_DYNAMIC, UPLOADING};
    }

    static {
        com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CustomVoiceCreatePresenter$State(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State.class, str);
    }

    public static com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State[] values() {
        return (com.truecaller.call_assistant.core.customvoice.createvoice.CustomVoiceCreatePresenter$State[]) $VALUES.clone();
    }
}
