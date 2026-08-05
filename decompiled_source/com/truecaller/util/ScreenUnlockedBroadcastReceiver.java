package com.truecaller.util;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ScreenUnlockedBroadcastReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public cd3.bar c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = ((m03.c1) o40.bar.k(context)).H.b.a.M1;
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
        if (!"android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            intent = null;
        }
        if (intent == null) {
            return;
        }
        cd3.bar barVar = this.c;
        if (barVar != null) {
            ag2.q qVar = (xf2.a) barVar.get();
            qVar.getClass();
            fg3.h0.J(qVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new a10.n(qVar, (df3.bar) null, 8), 3);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenceManager");
        throw null;
    }
}
