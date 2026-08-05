package com.truecaller.call_alert.receive_notification;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallSilenceBroadcastReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public zk0.m c;
    public sk0.bar d;
    public s62.d e;
    public com.moloco.sdk.internal.services.bidtoken.t f;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        ((tx.w) ((yk0.d) o40.bar.k(context))).e2(this);
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
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("extraCallSilenceTag");
            if (stringExtra != null) {
                s62.f fVar = this.e;
                if (fVar != null) {
                    int type = com.truecaller.analytics.common.event.PushNotificationSource.Firebase.getType();
                    if (this.f != null) {
                        fVar.b(2131367565, type, stringExtra, "notificationPushCallerId");
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("callAlertNotificationHelper");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.n("notificationManager");
                    throw null;
                }
            }
            zk0.m mVar = this.c;
            if (mVar != null && stringExtra != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "normalizedNumber");
                zk0.baz bazVar = mVar.c;
                bazVar.n("callSilenceNormalizedNumber", stringExtra);
                bazVar.m("callSilenceTimestamp", java.util.Calendar.getInstance().getTimeInMillis());
            }
            java.lang.String stringExtra2 = intent.getStringExtra("extraCallSilenceAnalyticsContext");
            if (stringExtra2 == null) {
                return;
            }
            sk0.bar barVar = this.d;
            if (barVar != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra2, "action");
                ((nc0.a) barVar.a).d(new rf0.bar(stringExtra2, 1));
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("callAlertAnalytics");
            throw null;
        }
    }
}
