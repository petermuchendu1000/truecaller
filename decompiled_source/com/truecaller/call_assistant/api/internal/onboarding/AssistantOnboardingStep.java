package com.truecaller.call_assistant.api.internal.onboarding;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/call_assistant/api/internal/onboarding/AssistantOnboardingStep;", "", "<init>", "(Ljava/lang/String;I)V", "CAROUSEL", "CARRIER_SELECTION", "ACTIVATE", "VERIFICATION", "RESULT", "EXIT", "FINISH_SUCCESSFULLY", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AssistantOnboardingStep {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep[] $VALUES;
    public static final com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep CAROUSEL = new com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep("CAROUSEL", 0);
    public static final com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep CARRIER_SELECTION = new com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep("CARRIER_SELECTION", 1);
    public static final com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep ACTIVATE = new com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep("ACTIVATE", 2);
    public static final com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep VERIFICATION = new com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep("VERIFICATION", 3);
    public static final com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep RESULT = new com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep("RESULT", 4);
    public static final com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep EXIT = new com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep("EXIT", 5);
    public static final com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep FINISH_SUCCESSFULLY = new com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep("FINISH_SUCCESSFULLY", 6);

    private static final /* synthetic */ com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep[] $values() {
        return new com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep[]{CAROUSEL, CARRIER_SELECTION, ACTIVATE, VERIFICATION, RESULT, EXIT, FINISH_SUCCESSFULLY};
    }

    static {
        com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AssistantOnboardingStep(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep) java.lang.Enum.valueOf(com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep.class, str);
    }

    public static com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep[] values() {
        return (com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep[]) $VALUES.clone();
    }
}
