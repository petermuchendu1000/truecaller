package com.truecaller.call_assistant.presentation.disable;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.call_assistant.api.internal.disable.AssistantDeactivationStep.values().length];
        try {
            iArr[com.truecaller.call_assistant.api.internal.disable.AssistantDeactivationStep.CONFIRMATION.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.call_assistant.api.internal.disable.AssistantDeactivationStep.REASON_SELECTION.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.call_assistant.api.internal.disable.AssistantDeactivationStep.EXIT.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.call_assistant.api.internal.disable.AssistantDeactivationStep.EXIT_WITH_SUCCESS.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
