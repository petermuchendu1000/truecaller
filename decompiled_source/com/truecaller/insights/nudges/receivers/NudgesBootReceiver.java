package com.truecaller.insights.nudges.receivers;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NudgesBootReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public ix1.d c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (ix1.d) ((sw1.baz) o40.bar.k(context)).H.b.a.D3.get();
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
        android.content.Context context2;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (kotlin.jvm.internal.Intrinsics.b(str, "android.intent.action.BOOT_COMPLETED")) {
            if (context != null) {
                context2 = context.getApplicationContext();
            } else {
                context2 = null;
            }
            kotlin.jvm.internal.Intrinsics.e(context2, "null cannot be cast to non-null type com.truecaller.common.app.ApplicationBase");
            if (((r11.bar) context2).d()) {
                ix1.d dVar = this.c;
                if (dVar != null) {
                    if (((ix1.e) dVar).i()) {
                        fe0.m.D(os0.bar.z(context, "context", context, "getInstance(...)"), "InsightsNudgeWorkAction", context, (kotlin.Pair) null, (nd.g) null, 12);
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("statusProvider");
                throw null;
            }
        }
    }
}
