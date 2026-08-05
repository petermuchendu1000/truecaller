package com.truecaller.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AnalyticsNotificationReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public u62.l c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (u62.l) ((u62.bar) o40.bar.k(context)).H.b.a.t3.get();
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
        java.lang.String stringExtra;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (intent != null) {
            u62.l lVar = this.c;
            if (lVar != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                try {
                    android.app.PendingIntent pendingIntent = (android.app.PendingIntent) intent.getParcelableExtra("original_pending_intent");
                    if (pendingIntent != null) {
                        pendingIntent.send();
                    }
                } catch (android.app.PendingIntent.CanceledException unused) {
                }
                java.lang.String stringExtra2 = intent.getStringExtra("notification_analytics_context");
                if (stringExtra2 != null && (stringExtra = intent.getStringExtra("notification_activity_type")) != null) {
                    lVar.c.b(stringExtra2, stringExtra, (android.os.Bundle) intent.getParcelableExtra("additional_params"), ee0.l.t(intent, "notification_interaction", qx2.mi.class));
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("searchNotificationManager");
            throw null;
        }
    }
}
