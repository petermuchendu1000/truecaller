package com.truecaller.rewardprogram.impl;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class BootBroadcastReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public ah.n c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = ((ik2.bar) o40.bar.k(context)).H.b.a.A3();
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
        java.lang.String str;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!kotlin.jvm.internal.Intrinsics.b(str, "android.intent.action.BOOT_COMPLETED")) {
            return;
        }
        yy.baz.s(this, kotlin.coroutines.d.a, new hu0.qux(this, (df3.bar) null, 15));
    }
}
