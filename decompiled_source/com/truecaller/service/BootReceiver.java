package com.truecaller.service;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class BootReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public cd3.bar c;
    public tx.v d;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        tx.w wVar = ((dq2.baz) o40.bar.k(context)).H.b.a;
                        this.c = wVar.T2;
                        this.d = wVar.M;
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
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            w91.a.a(new java.lang.Object[]{"Device boot"});
            com.truecaller.service.AlarmReceiver.e(context, true);
            if (((u03.z) this.d.get()).g("android.permission.READ_SMS")) {
                ((y12.v) ((xd0.qux) this.c.get()).a()).d0(true);
            }
        }
    }
}
