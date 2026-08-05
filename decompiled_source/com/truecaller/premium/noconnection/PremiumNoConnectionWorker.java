package com.truecaller.premium.noconnection;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/premium/noconnection/PremiumNoConnectionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumNoConnectionWorker extends androidx.work.CoroutineWorker {
    public u03.w a;
    public rq0.l b;
    public i82.v c;
    public nc0.bar d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumNoConnectionWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
    }

    public final java.lang.Object doWork(df3.bar barVar) {
        u03.x xVar = this.a;
        if (xVar != null) {
            if (xVar.e()) {
                rq0.l lVar = this.b;
                if (lVar != null) {
                    android.content.Intent c = h8.s0.c((i82.t) lVar.c, (android.content.Context) lVar.a, i82.r.N8, (com.truecaller.premium.data.SubscriptionPromoEventMetaData) null, (com.truecaller.premium.data.feature.PremiumFeature) null, false, (com.truecaller.premium.interstitial.InterstitialAnimation) null, 60);
                    s62.d dVar = (s62.d) lVar.b;
                    android.content.Context context = (android.content.Context) lVar.a;
                    com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                    s62.f fVar = (s62.f) dVar;
                    android.app.PendingIntent k = fVar.k(pushNotificationSource.getType(), 0, 201326592, context, c, "notificationInternetRestoredPremium");
                    android.content.Context context2 = (android.content.Context) lVar.a;
                    java.lang.String string = context2.getString(2132018624);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    f6.f0 f0Var = new f6.f0(context2, fVar.o("miscellaneous_channel"));
                    f0Var.e = f6.f0.e(context2.getString(2132018625));
                    f0Var.f = f6.f0.e(string);
                    f6.y yVar = new f6.y(0);
                    yVar.f = f6.f0.e(string);
                    f0Var.t(yVar);
                    f0Var.D = context2.getColor(2131102024);
                    f0Var.k(-1);
                    f0Var.Q.icon = 2131232902;
                    f0Var.g = k;
                    f0Var.l(16, true);
                    android.app.Notification d = f0Var.d();
                    kotlin.jvm.internal.Intrinsics.d(d);
                    fVar.v(2131365797, d, pushNotificationSource.getType(), "notificationInternetRestoredPremium");
                    i82.v vVar = this.c;
                    if (vVar != null) {
                        vVar.m("noConnectionNotificationLastShown", f63.qux.k());
                        nc0.bar barVar2 = this.d;
                        if (barVar2 != null) {
                            bd.bar.u(barVar2, "notificationInternetRestoredPremium", "notification");
                            return nd.t.a();
                        }
                        kotlin.jvm.internal.Intrinsics.n("analytics");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("premiumStateSettings");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("premiumNoConnectionNotificationHelper");
                throw null;
            }
            return new java.lang.Object();
        }
        kotlin.jvm.internal.Intrinsics.n("networkUtil");
        throw null;
    }
}
