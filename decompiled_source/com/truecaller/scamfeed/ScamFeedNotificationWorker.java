package com.truecaller.scamfeed;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/scamfeed/ScamFeedNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lqo1/t;", "strategyFeaturesInventory", "Lqc3/bar;", "Ls62/d;", "notificationManager", "Lnc0/bar;", "analytics", "Lkl2/bar;", "scamFeedHelper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqo1/t;Lqc3/bar;Lnc0/bar;Lqc3/bar;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ScamFeedNotificationWorker extends androidx.work.CoroutineWorker {
    public final android.content.Context a;
    public final qo1.t b;
    public final qc3.bar c;
    public final nc0.bar d;
    public final qc3.bar e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScamFeedNotificationWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull qo1.t tVar, @org.jetbrains.annotations.NotNull qc3.bar barVar, @org.jetbrains.annotations.NotNull nc0.bar barVar2, @org.jetbrains.annotations.NotNull qc3.bar barVar3) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "strategyFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "scamFeedHelper");
        this.a = context;
        this.b = tVar;
        this.c = barVar;
        this.d = barVar2;
        this.e = barVar3;
    }

    public final java.lang.Object doWork(df3.bar barVar) {
        android.net.Uri uri;
        f6.k1 k1Var;
        if (!this.b.a.a("featureScamFeed", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
            nd.s a = nd.t.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
            return a;
        }
        com.truecaller.network.notification.NotificationType valueOf = com.truecaller.network.notification.NotificationType.valueOf(getInputData().b("EXTRA_NOTIFICATION_TYPE", -1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "let(...)");
        java.lang.String e = getInputData().e("EXTRA_TITLE");
        java.lang.String e2 = getInputData().e("EXTRA_BODY");
        java.lang.String e3 = getInputData().e("EXTRA_URI");
        if (e != null && e.length() != 0 && e2 != null && e2.length() != 0) {
            int[] iArr = kl2.baz.a;
            java.lang.String str = "notificationScamFeed";
            if (iArr[valueOf.ordinal()] == 1) {
                qc3.bar barVar2 = this.c;
                s62.f fVar = (s62.d) barVar2.get();
                com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                fVar.a(2131366240, pushNotificationSource.getType(), "notificationScamFeed");
                if (e3 != null) {
                    uri = android.net.Uri.parse(e3);
                } else {
                    uri = null;
                }
                if (((kl2.bar) this.e.get()).a()) {
                    k1Var = new f6.k1(getApplicationContext());
                    android.content.Context applicationContext = getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    android.content.Intent o = y90.m6.o(applicationContext, com.truecaller.bottombar.BottomBarButtonType.SCAM_FEED, "notification", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 120);
                    o.setData(uri);
                    k1Var.a.add(o);
                } else {
                    k1Var = new f6.k1(getApplicationContext());
                    android.content.Context applicationContext2 = getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                    android.content.Intent o2 = y90.m6.o(applicationContext2, (com.truecaller.bottombar.BottomBarButtonType) null, "notification", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                    java.util.ArrayList arrayList = k1Var.a;
                    arrayList.add(o2);
                    int i = com.truecaller.scamfeed.presentation.ui.ScamFeedActivity.d0;
                    android.content.Context applicationContext3 = getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext3, "context");
                    android.content.Intent intent = new android.content.Intent(applicationContext3, (java.lang.Class<?>) com.truecaller.scamfeed.presentation.ui.ScamFeedActivity.class);
                    if (uri != null) {
                        intent.setData(uri);
                    }
                    arrayList.add(intent);
                }
                f6.k1 k1Var2 = k1Var;
                java.lang.Object obj = barVar2.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                android.app.PendingIntent l = ((s62.d) obj).l(this.a, k1Var2, pushNotificationSource.getType(), "notificationScamFeed", 0, 201326592);
                java.lang.String o3 = ((s62.d) barVar2.get()).o("miscellaneous_channel");
                android.content.Context context = this.a;
                f6.f0 f0Var = new f6.f0(context, o3);
                f0Var.Q.icon = 2131232902;
                f0Var.D = context.getColor(2131102024);
                f0Var.e = f6.f0.e(e);
                f0Var.f = f6.f0.e(e2);
                f0Var.k(-1);
                f0Var.l = 1;
                f0Var.l(16, true);
                f0Var.g = l;
                android.app.Notification d = f0Var.d();
                s62.f fVar2 = (s62.d) barVar2.get();
                kotlin.jvm.internal.Intrinsics.d(d);
                fVar2.v(2131366240, d, pushNotificationSource.getType(), "notificationScamFeed");
            }
            if (iArr[valueOf.ordinal()] != 1) {
                str = "unknown";
            }
            bd.bar.u(this.d, str, "notification");
            nd.s a2 = nd.t.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
            return a2;
        }
        nd.s a3 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "success(...)");
        return a3;
    }
}
