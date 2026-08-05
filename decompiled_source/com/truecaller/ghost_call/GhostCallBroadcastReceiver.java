package com.truecaller.ghost_call;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GhostCallBroadcastReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public op1.e c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (op1.e) ((op1.b) o40.bar.k(context)).H.b.r4.get();
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
        op1.e eVar = this.c;
        if (eVar != null) {
            eVar.c();
        } else {
            kotlin.jvm.internal.Intrinsics.n("ghostCallManager");
            throw null;
        }
    }
}
