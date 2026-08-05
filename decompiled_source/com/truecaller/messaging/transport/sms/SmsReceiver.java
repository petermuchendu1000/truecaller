package com.truecaller.messaging.transport.sms;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SmsReceiver extends android.content.BroadcastReceiver implements fg3.e0 {
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
                        tx.w wVar = ((m42.c) o40.bar.k(context)).H.b.a;
                        this.c = cd3.baz.a(wVar.y3);
                        this.d = (kotlin.coroutines.CoroutineContext) wVar.P.get();
                        this.a = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.d;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        kotlin.jvm.internal.Intrinsics.n("ioContext");
        throw null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (intent == null) {
            return;
        }
        kotlin.coroutines.CoroutineContext coroutineContext = this.d;
        if (coroutineContext != null) {
            fg3.h0.J(this, coroutineContext, (fg3.f0) null, new l40.a(this, intent, (df3.bar) null, 13), 2);
        } else {
            kotlin.jvm.internal.Intrinsics.n("ioContext");
            throw null;
        }
    }
}
