package com.truecaller.service;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class Receiver extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int i = 0;
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public gu0.s c;
    public cu0.n0 d;
    public s62.d e;
    public nz1.b f;
    public to1.e g;
    public nc0.l1 h;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        ((dq2.k) o40.bar.k(context)).m2(this);
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
        java.lang.String action;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        if (context != null && intent != null && (action = intent.getAction()) != null) {
            if ("android.intent.action.PHONE_STATE".equals(action) || "android.intent.action.NEW_OUTGOING_CALL".equals(action)) {
                to1.e eVar = this.g;
                if (eVar != null) {
                    if (eVar.h()) {
                        return;
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.n("callerIdPermissionsHelper");
                    throw null;
                }
            }
            yy.baz.s(this, kotlin.coroutines.d.a, new com.truecaller.profile.impl.remote.e(action, this, context, intent, (df3.bar) null, 8));
        }
    }
}
