package com.truecaller.call_assistant.presentation.onboarding;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep.values().length];
        try {
            iArr[com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep.CAROUSEL.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep.CARRIER_SELECTION.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep.ACTIVATE.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep.VERIFICATION.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep.RESULT.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr[com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep.EXIT.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr[com.truecaller.call_assistant.api.internal.onboarding.AssistantOnboardingStep.FINISH_SUCCESSFULLY.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
