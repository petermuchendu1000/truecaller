package com.truecaller.notificationchannels.tracking;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/notificationchannels/tracking/NotificationTrackingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NotificationTrackingActivity extends com.truecaller.notificationchannels.tracking.Hilt_NotificationTrackingActivity {
    public nc0.bar d0;
    public nc0.l1 e0;
    public qo1.m f0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.notificationchannels.tracking.Hilt_NotificationTrackingActivity
    public final void onCreate(android.os.Bundle bundle) {
        android.app.PendingIntent pendingIntent;
        kotlin.Unit o;
        java.lang.String stringExtra;
        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource;
        android.os.Bundle bundle2;
        java.lang.Object obj;
        java.lang.Object obj2;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("notification_analytics_context")) != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(getIntent().getIntExtra("notification_source", -1));
            qo1.m mVar = this.f0;
            if (mVar != null) {
                if (!((qo1.n) mVar).b.a("featureInternalNotificationsTracking", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    java.util.Iterator it = com.truecaller.analytics.common.event.PushNotificationSource.getEntries().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((com.truecaller.analytics.common.event.PushNotificationSource) obj2).getType() == intValue) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    pushNotificationSource = (com.truecaller.analytics.common.event.PushNotificationSource) obj2;
                } else {
                    pushNotificationSource = null;
                }
                if (pushNotificationSource != null) {
                    int intExtra = getIntent().getIntExtra("notification_action", -1);
                    java.util.Iterator it2 = com.truecaller.analytics.common.event.PushNotificationAction.getEntries().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (((com.truecaller.analytics.common.event.PushNotificationAction) obj).getType() == intExtra) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    com.truecaller.analytics.common.event.PushNotificationAction pushNotificationAction = (com.truecaller.analytics.common.event.PushNotificationAction) obj;
                    if (pushNotificationAction == null) {
                        return;
                    }
                    rc0.bar barVar = new rc0.bar(pushNotificationAction, pushNotificationSource, stringExtra);
                    nc0.bar barVar2 = this.d0;
                    if (barVar2 != null) {
                        nc0.u1.e(barVar, barVar2);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("analytics");
                        throw null;
                    }
                }
                android.content.Intent intent2 = getIntent();
                if (intent2 != null) {
                    bundle2 = intent2.getBundleExtra("notification_additional_bundle");
                } else {
                    bundle2 = null;
                }
                nc0.l1 l1Var = this.e0;
                if (l1Var != null) {
                    l1Var.b(stringExtra, "Opened", bundle2, (qx2.mi) null);
                } else {
                    kotlin.jvm.internal.Intrinsics.n("searchAnalyticsManager");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.Intrinsics.n("featureInventory");
                throw null;
            }
        }
        android.content.Intent intent3 = getIntent();
        if (intent3 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent3, "<this>");
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                pendingIntent = (android.app.PendingIntent) a0.baz.C(intent3);
            } else {
                pendingIntent = (android.app.PendingIntent) intent3.getParcelableExtra("notification_original_pending_intent");
            }
            if (pendingIntent != null) {
                try {
                    kotlin.o oVar = kotlin.q.b;
                    pendingIntent.send();
                    o = kotlin.Unit.a;
                } catch (java.lang.Throwable th) {
                    kotlin.o oVar2 = kotlin.q.b;
                    o = od.p.o(th);
                }
                java.lang.Throwable a = kotlin.q.a(o);
                if (a != null) {
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(a);
                }
            }
        }
        finishAndRemoveTask();
    }
}
