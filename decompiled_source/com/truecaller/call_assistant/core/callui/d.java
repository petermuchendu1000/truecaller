package com.truecaller.call_assistant.core.callui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class d {
    public static final boolean a(com.truecaller.call_assistant.core.callui.AssistantCallState assistantCallState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assistantCallState, "<this>");
        if (!kotlin.jvm.internal.Intrinsics.b(assistantCallState, com.truecaller.call_assistant.core.callui.AssistantCallState.Ongoing.INSTANCE) && !kotlin.jvm.internal.Intrinsics.b(assistantCallState, com.truecaller.call_assistant.core.callui.AssistantCallState.Connecting.INSTANCE)) {
            return false;
        }
        return true;
    }
}
