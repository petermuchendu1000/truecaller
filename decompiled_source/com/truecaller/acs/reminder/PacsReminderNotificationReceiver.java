package com.truecaller.acs.reminder;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PacsReminderNotificationReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public s62.d c;
    public iz.d d;
    public com.truecaller.acs.AfterCallScreen e;
    public qz1.bar f;
    public u03.baz g;
    public nc0.bar h;

    public final void a(int i) {
        s62.f fVar = this.c;
        if (fVar != null) {
            fVar.b(i, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), (java.lang.String) null, "notificationAcsReminder");
        } else {
            kotlin.jvm.internal.Intrinsics.n("notificationManager");
            throw null;
        }
    }

    public final void b(com.truecaller.analytics.common.event.PushNotificationAction pushNotificationAction) {
        nc0.bar barVar = this.h;
        if (barVar != null) {
            ((nc0.a) barVar).d(new rc0.bar(pushNotificationAction, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal, "notificationAcsReminder"));
        } else {
            kotlin.jvm.internal.Intrinsics.n("analytics");
            throw null;
        }
    }

    public final void c(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        ((tx.w) ((iz.c) o40.bar.k(context))).l2(this);
                        this.a = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.truecaller.acs.reminder.PacsReminderAction pacsReminderAction;
        java.lang.String stringExtra;
        int intExtra;
        int i;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        c(context, intent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        java.lang.String stringExtra2 = intent.getStringExtra("com.truecaller.acs.reminder.EXTRA_ACTION");
        if (stringExtra2 != null) {
            switch (stringExtra2.hashCode()) {
                case -1905312150:
                    if (stringExtra2.equals("DISMISS")) {
                        pacsReminderAction = com.truecaller.acs.reminder.PacsReminderAction.DISMISS;
                        break;
                    }
                    break;
                case -1844280858:
                    if (stringExtra2.equals("SNOOZE")) {
                        pacsReminderAction = com.truecaller.acs.reminder.PacsReminderAction.SNOOZE;
                        break;
                    }
                    break;
                case 79316762:
                    if (stringExtra2.equals("SWIPE")) {
                        pacsReminderAction = com.truecaller.acs.reminder.PacsReminderAction.SWIPE;
                        break;
                    }
                    break;
                case 279254268:
                    if (stringExtra2.equals("OPEN_ACS")) {
                        pacsReminderAction = com.truecaller.acs.reminder.PacsReminderAction.OPEN_ACS;
                        break;
                    }
                    break;
            }
            stringExtra = intent.getStringExtra("com.truecaller.acs.reminder.EXTRA_TC_ID");
            java.lang.String stringExtra3 = intent.getStringExtra("com.truecaller.acs.reminder.EXTRA_PHONE_NUMBER");
            intExtra = intent.getIntExtra("com.truecaller.acs.reminder.EXTRA_NOTIFICATION_ID", -1);
            if (stringExtra != null && stringExtra3 == null) {
                o82.a.C(new com.criteo.publisher.k(k9.d.q("[PacsReminderNotificationReceiver] tcId and phoneNumber are missing for actionType ", stringExtra2), 5));
                return;
            }
            if (intExtra != -1) {
                o82.a.C(new com.criteo.publisher.k(k9.d.q("[PacsReminderNotificationReceiver] notificationId is missing for actionType ", stringExtra2), 5));
                return;
            }
            if (pacsReminderAction == null) {
                i = -1;
            } else {
                i = iz.b.a[pacsReminderAction.ordinal()];
            }
            if (i != -1) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                b(com.truecaller.analytics.common.event.PushNotificationAction.Dismissed);
                                return;
                            }
                            throw new java.lang.RuntimeException();
                        }
                        b(com.truecaller.analytics.common.event.PushNotificationAction.Clicked);
                        com.truecaller.acs.AfterCallScreen afterCallScreen = this.e;
                        if (afterCallScreen != null) {
                            zy.c cVar = (zy.c) afterCallScreen;
                            fg3.h0.J(cVar.q, cVar.b, (fg3.f0) null, new yn2.t(cVar, stringExtra, stringExtra3, (df3.bar) null, 26), 2);
                            a(intExtra);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("afterCallScreen");
                        throw null;
                    }
                    b(com.truecaller.analytics.common.event.PushNotificationAction.LeftButton);
                    iz.d dVar = this.d;
                    if (dVar != null) {
                        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "unit");
                        dVar.b(timeUnit.toMillis(1L) + java.lang.System.currentTimeMillis(), stringExtra, stringExtra3);
                        qz1.bar barVar = this.f;
                        if (barVar != null) {
                            if (this.g != null) {
                                ak.r0.k0(context, 0, context.getString(2132019356, barVar.b(context, timeUnit.toMillis(1L) + android.os.SystemClock.elapsedRealtime())), 0, 5);
                                a(intExtra);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("clock");
                                throw null;
                            }
                        }
                        kotlin.jvm.internal.Intrinsics.n("dateTimeUtil");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("pacsReminderScheduler");
                    throw null;
                }
                b(com.truecaller.analytics.common.event.PushNotificationAction.RightButton);
                ak.r0.k0(context, 2132019365, (java.lang.String) null, 0, 6);
                a(intExtra);
                return;
            }
            java.lang.String str = "[PacsReminderNotificationReceiver] Unknown PacsReminderAction: " + stringExtra2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
            o82.a.C(new com.criteo.publisher.k(str, 6, false));
            return;
        }
        pacsReminderAction = null;
        stringExtra = intent.getStringExtra("com.truecaller.acs.reminder.EXTRA_TC_ID");
        java.lang.String stringExtra32 = intent.getStringExtra("com.truecaller.acs.reminder.EXTRA_PHONE_NUMBER");
        intExtra = intent.getIntExtra("com.truecaller.acs.reminder.EXTRA_NOTIFICATION_ID", -1);
        if (stringExtra != null) {
        }
        if (intExtra != -1) {
        }
    }
}
