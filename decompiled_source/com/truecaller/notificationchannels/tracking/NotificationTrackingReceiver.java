package com.truecaller.notificationchannels.tracking;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NotificationTrackingReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public nc0.bar c;
    public nc0.l1 d;
    public qo1.m e;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        ((com.truecaller.notificationchannels.tracking.qux) o40.bar.k(context)).k2(this);
                        this.a = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0063  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.app.PendingIntent pendingIntent;
        kotlin.Unit o;
        java.lang.Throwable a;
        java.lang.Object obj;
        java.lang.String str;
        java.lang.Object obj2;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (intent != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "<this>");
            int i = android.os.Build.VERSION.SDK_INT;
            if (i >= 33) {
                pendingIntent = (android.app.PendingIntent) a0.baz.C(intent);
            } else {
                pendingIntent = (android.app.PendingIntent) intent.getParcelableExtra("notification_original_pending_intent");
            }
            if (pendingIntent != null) {
                try {
                    kotlin.o oVar = kotlin.q.b;
                } catch (java.lang.Throwable th) {
                    kotlin.o oVar2 = kotlin.q.b;
                    o = od.p.o(th);
                }
                if (i >= 31) {
                    if (!b0.qux.z(pendingIntent)) {
                    }
                    o = kotlin.Unit.a;
                    a = kotlin.q.a(o);
                    if (a != null) {
                        com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(a);
                    }
                }
                if (intent.getClipData() == null) {
                    pendingIntent.send();
                } else {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setClipData(intent.getClipData());
                    pendingIntent.send(context, 0, intent2);
                }
                o = kotlin.Unit.a;
                a = kotlin.q.a(o);
                if (a != null) {
                }
            }
            java.lang.String stringExtra = intent.getStringExtra("notification_analytics_context");
            if (stringExtra != null) {
                int intExtra = intent.getIntExtra("notification_action", -1);
                java.util.Iterator it = com.truecaller.analytics.common.event.PushNotificationAction.getEntries().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((com.truecaller.analytics.common.event.PushNotificationAction) obj).getType() == intExtra) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                com.truecaller.analytics.common.event.PushNotificationAction pushNotificationAction = (com.truecaller.analytics.common.event.PushNotificationAction) obj;
                if (pushNotificationAction != null) {
                    qo1.m mVar = this.e;
                    if (mVar != null) {
                        if (((qo1.n) mVar).b.a("featureInternalNotificationsTracking", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                            int intExtra2 = intent.getIntExtra("notification_source", -1);
                            java.util.Iterator it2 = com.truecaller.analytics.common.event.PushNotificationSource.getEntries().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    if (((com.truecaller.analytics.common.event.PushNotificationSource) obj2).getType() == intExtra2) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = (com.truecaller.analytics.common.event.PushNotificationSource) obj2;
                            if (pushNotificationSource == null) {
                                return;
                            }
                            rc0.bar barVar = new rc0.bar(pushNotificationAction, pushNotificationSource, stringExtra);
                            nc0.bar barVar2 = this.c;
                            if (barVar2 != null) {
                                nc0.u1.e(barVar, barVar2);
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("analytics");
                                throw null;
                            }
                        }
                        android.os.Bundle bundleExtra = intent.getBundleExtra("notification_additional_bundle");
                        nc0.l1 l1Var = this.d;
                        if (l1Var != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationAction, "<this>");
                            switch (com.truecaller.notificationchannels.tracking.a.a[pushNotificationAction.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    str = "Opened";
                                    break;
                                case 5:
                                case 6:
                                    str = "Dismissed";
                                    break;
                                default:
                                    throw new java.lang.RuntimeException();
                            }
                            l1Var.b(stringExtra, str, bundleExtra, (qx2.mi) null);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("searchAnalyticsManager");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("featureInventory");
                    throw null;
                }
            }
        }
    }
}
