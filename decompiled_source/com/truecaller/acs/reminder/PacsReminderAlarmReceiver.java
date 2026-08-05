package com.truecaller.acs.reminder;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PacsReminderAlarmReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public ah.n c;
    public kotlin.coroutines.CoroutineContext d;
    public fg3.e0 e;

    public final void a(long j, java.lang.String str, java.lang.String str2) {
        android.content.BroadcastReceiver.PendingResult goAsync = goAsync();
        fg3.e0 e0Var = this.e;
        if (e0Var != null) {
            kotlin.coroutines.CoroutineContext coroutineContext = this.d;
            if (coroutineContext != null) {
                fg3.h0.J(e0Var, coroutineContext, (fg3.f0) null, new i1.y(goAsync, this, str, str2, j, (df3.bar) null), 2);
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("ioContext");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("appScope");
        throw null;
    }

    public final void b(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        tx.c0 c0Var = ((tx.w) ((iz.bar) o40.bar.k(context))).H.b;
                        this.c = c0Var.U2();
                        tx.w wVar = c0Var.a;
                        this.d = (kotlin.coroutines.CoroutineContext) wVar.P.get();
                        this.e = (fg3.e0) wVar.f0.get();
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
        b(context, intent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        if (!kotlin.jvm.internal.Intrinsics.b(intent.getAction(), "com.truecaller.acs.reminder.ACTION_SHOW_REMINDER")) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("com.truecaller.acs.reminder.EXTRA_TC_ID");
        java.lang.String stringExtra2 = intent.getStringExtra("com.truecaller.acs.reminder.EXTRA_PHONE_NUMBER");
        long longExtra = intent.getLongExtra("com.truecaller.acs.reminder.EXTRA_NOTIFICATION_TIME_MILLIS", -1L);
        if (stringExtra == null && stringExtra2 == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("[PacsReminderAlarmReceiver] Missing phone number and tcId", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
            o82.a.C(new com.criteo.publisher.k("[PacsReminderAlarmReceiver] Missing phone number and tcId", false, 5));
        } else if (longExtra <= 0) {
            a(java.lang.System.currentTimeMillis() - java.util.concurrent.TimeUnit.MINUTES.toMillis(1L), stringExtra, stringExtra2);
        } else {
            a(longExtra, stringExtra, stringExtra2);
        }
    }
}
