package com.truecaller.call_assistant.core.callui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class f implements rn0.u, fg3.e0 {
    public final kotlin.coroutines.CoroutineContext a;
    public final rn0.t b;

    public f(kotlin.coroutines.CoroutineContext coroutineContext, rn0.t tVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "proximitySensor");
        this.a = coroutineContext;
        this.b = tVar;
    }

    public static final void a(com.truecaller.call_assistant.core.callui.f fVar, com.truecaller.call_assistant.core.callui.AssistantCallState assistantCallState, com.truecaller.call_assistant.core.callui.AssistantCallUiState assistantCallUiState) {
        rn0.t tVar = fVar.b;
        if (!kotlin.jvm.internal.Intrinsics.b(assistantCallState, com.truecaller.call_assistant.core.callui.AssistantCallState.None.INSTANCE) && assistantCallUiState != com.truecaller.call_assistant.core.callui.AssistantCallUiState.NOT_YET_OPENED) {
            if (com.truecaller.call_assistant.core.callui.d.a(assistantCallState) && assistantCallUiState == com.truecaller.call_assistant.core.callui.AssistantCallUiState.OPENED) {
                android.os.PowerManager.WakeLock wakeLock = tVar.a;
                if (wakeLock != null && !wakeLock.isHeld()) {
                    wakeLock.acquire(rn0.w.a);
                    return;
                }
                return;
            }
            android.os.PowerManager.WakeLock wakeLock2 = tVar.a;
            if (wakeLock2 != null && wakeLock2.isHeld()) {
                wakeLock2.release();
            }
        }
    }

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.a;
    }
}
