package com.truecaller.call_assistant.core.callrejection;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallAssistantRejectionReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public qc3.bar c;
    public kotlin.coroutines.CoroutineContext d;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        tx.c0 c0Var = ((tx.w) ((ln0.c) o40.bar.k(context))).H.b;
                        this.c = cd3.baz.a(c0Var.O1);
                        this.d = (kotlin.coroutines.CoroutineContext) c0Var.a.P.get();
                        this.a = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        if (!kotlin.jvm.internal.Intrinsics.b(intent.getAction(), "android.intent.action.PHONE_STATE")) {
            return;
        }
        kotlin.coroutines.CoroutineContext coroutineContext = this.d;
        if (coroutineContext != null) {
            fg3.h0.J(fg3.h0.b(coroutineContext), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new lj0.baz(this, intent, null, 8), 3);
        } else {
            kotlin.jvm.internal.Intrinsics.n("ioContext");
            throw null;
        }
    }
}
