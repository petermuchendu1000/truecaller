package com.truecaller.call_assistant.core.onboarding.voice;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/call_assistant/core/onboarding/voice/OnboardingStepVoiceMvp$VoiceItemState", "", "Lcom/truecaller/call_assistant/core/onboarding/voice/OnboardingStepVoiceMvp$VoiceItemState;", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "HIGHLIGHTED", "DIMMED", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class OnboardingStepVoiceMvp$VoiceItemState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState[] $VALUES;
    public static final com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState DEFAULT = new com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState("DEFAULT", 0);
    public static final com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState HIGHLIGHTED = new com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState("HIGHLIGHTED", 1);
    public static final com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState DIMMED = new com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState("DIMMED", 2);

    private static final /* synthetic */ com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState[] $values() {
        return new com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState[]{DEFAULT, HIGHLIGHTED, DIMMED};
    }

    static {
        com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private OnboardingStepVoiceMvp$VoiceItemState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState.class, str);
    }

    public static com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState[] values() {
        return (com.truecaller.call_assistant.core.onboarding.voice.OnboardingStepVoiceMvp$VoiceItemState[]) $VALUES.clone();
    }
}
