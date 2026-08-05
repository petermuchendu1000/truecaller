package com.truecaller.calling.missedcallreminder;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class MissedCallReminderNotificationReceiver extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int n = 0;
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public kotlin.coroutines.CoroutineContext c;
    public kotlin.coroutines.CoroutineContext d;
    public android.content.Context e;
    public qc3.bar f;
    public qc3.bar g;
    public qc3.bar h;
    public s62.g i;
    public qc3.bar j;
    public hw0.a k;
    public nd1.bar l;
    public jw0.bar m;

    public final android.content.Context a() {
        android.content.Context context = this.e;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.Intrinsics.n("context");
        throw null;
    }

    public final s62.g b() {
        s62.g gVar = this.i;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.Intrinsics.n("pendingIntentFactory");
        throw null;
    }

    public final kotlin.coroutines.CoroutineContext c() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.c;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        kotlin.jvm.internal.Intrinsics.n("uiContext");
        throw null;
    }

    public final void d(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        ((tx.w) ((com.truecaller.calling.missedcallreminder.c) o40.bar.k(context))).g2(this);
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
        d(context, intent);
        if (context != null && intent != null) {
            android.content.BroadcastReceiver.PendingResult goAsync = goAsync();
            fg3.h0.J(fg3.f1.a, c(), (fg3.f0) null, new by1.b(this, intent, goAsync, (df3.bar) null, 27), 2);
        }
    }
}
