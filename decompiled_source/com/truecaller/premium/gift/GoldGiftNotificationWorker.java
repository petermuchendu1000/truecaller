package com.truecaller.premium.gift;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BM\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/premium/gift/GoldGiftNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lw82/l1;", "premiumRepository", "Ls62/d;", "notificationManager", "Ls62/g;", "pendingIntentFactory", "Ltf2/n;", "goldGiftPromoUtils", "Lt41/t;", "phoneNumberHelper", "Lnc0/bar;", "analytics", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lw82/l1;Ls62/d;Ls62/g;Ltf2/n;Lt41/t;Lnc0/bar;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GoldGiftNotificationWorker extends androidx.work.CoroutineWorker {
    public final android.content.Context a;
    public final w82.l1 b;
    public final s62.d c;
    public final s62.g d;
    public final tf2.n e;
    public final t41.t f;
    public final nc0.bar g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldGiftNotificationWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull w82.l1 l1Var, @org.jetbrains.annotations.NotNull s62.d dVar, @org.jetbrains.annotations.NotNull s62.g gVar, @org.jetbrains.annotations.NotNull tf2.n nVar, @org.jetbrains.annotations.NotNull t41.t tVar, @org.jetbrains.annotations.NotNull nc0.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l1Var, "premiumRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "notificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "pendingIntentFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "goldGiftPromoUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "phoneNumberHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        this.a = context;
        this.b = l1Var;
        this.c = dVar;
        this.d = gVar;
        this.e = nVar;
        this.f = tVar;
        this.g = barVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        bb2.n nVar;
        int i;
        java.lang.String e;
        java.lang.String k;
        if (barVar instanceof bb2.n) {
            nVar = (bb2.n) barVar;
            int i2 = nVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = nVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = nVar.z;
                tf2.n nVar2 = this.e;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (!((a71.a) nVar2).N()) {
                        nd.s a = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                        return a;
                    }
                    nVar.z = 1;
                    if (((w82.n1) this.b).b(nVar) == barVar2) {
                        return barVar2;
                    }
                }
                e = getInputData().e("fullNameKey");
                if (e != null) {
                    nd.s a2 = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                    return a2;
                }
                java.lang.String e2 = getInputData().e("numberKey");
                if (e2 != null && (k = this.f.k(e2)) != null) {
                    android.content.Context context = this.a;
                    java.lang.String string = context.getString(2132018057, e);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    f6.k1 k1Var = new f6.k1(context);
                    com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType = com.truecaller.bottombar.BottomBarButtonType.MESSAGES;
                    android.content.Intent o = y90.m6.o(this.a, bottomBarButtonType, "GoldGift", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 120);
                    java.util.ArrayList arrayList = k1Var.a;
                    arrayList.add(o);
                    int i3 = com.truecaller.premium.gift.GoldGiftDialogActivity.d0;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "name");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "number");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notification", "analyticsLaunchContext");
                    android.content.Intent putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.premium.gift.GoldGiftDialogActivity.class).addFlags(268435456).putExtra("EXTRA_SENDER_NAME", e).putExtra("EXTRA_ANALYTICS_CONTEXT_TYPE", "goldGiftReceiver_dialog").putExtra("EXTRA_ANALYTICS_LAUNCH_CONTEXT", "notification").putExtra("EXTRA_SENDER_NUMBER", k);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                    arrayList.add(putExtra);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var, "addNextIntent(...)");
                    s62.h hVar = (s62.h) this.d;
                    bo.p a3 = hVar.a();
                    a3.b = 2131364305;
                    com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                    android.app.PendingIntent f = a3.f(k1Var, pushNotificationSource.getType(), "GoldGift");
                    bo.p a4 = hVar.a();
                    a4.b = 2131364306;
                    a4.e = new java.lang.Integer(com.truecaller.analytics.common.event.PushNotificationAction.LeftButton.getType());
                    android.app.PendingIntent f2 = a4.f(k1Var, pushNotificationSource.getType(), "GoldGift");
                    f6.k1 k1Var2 = new f6.k1(context);
                    android.content.Intent o2 = y90.m6.o(this.a, bottomBarButtonType, "GoldGift", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 120);
                    java.util.ArrayList arrayList2 = k1Var2.a;
                    arrayList2.add(o2);
                    arrayList2.add(((a71.a) nVar2).k(context, k));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var2, "addNextIntent(...)");
                    bo.p a5 = hVar.a();
                    a5.b = 2131364307;
                    a5.e = new java.lang.Integer(com.truecaller.analytics.common.event.PushNotificationAction.RightButton.getType());
                    android.app.PendingIntent f3 = a5.f(k1Var2, pushNotificationSource.getType(), "GoldGift");
                    s62.f fVar = (s62.f) this.c;
                    f6.f0 f0Var = new f6.f0(context, fVar.o("miscellaneous_channel"));
                    f0Var.e = f6.f0.e(context.getString(2132018058));
                    f0Var.f = f6.f0.e(string);
                    f6.y yVar = new f6.y(0);
                    yVar.f = f6.f0.e(string);
                    f0Var.t(yVar);
                    f0Var.m(android.graphics.BitmapFactory.decodeResource(context.getResources(), 2131232687));
                    f0Var.D = context.getColor(2131102024);
                    f0Var.k(-1);
                    f0Var.Q.icon = 2131232902;
                    f0Var.g = f;
                    f0Var.l(16, true);
                    f0Var.a(0, f2, context.getString(2132019041));
                    f0Var.a(0, f3, context.getString(2132018059));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var, "addAction(...)");
                    android.app.Notification d = f0Var.d();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
                    fVar.v(2131365796, d, pushNotificationSource.getType(), "GoldGift");
                    bd.bar.u(this.g, "notificationGoldGift", "notification");
                    nd.s a6 = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a6, "success(...)");
                    return a6;
                }
                nd.s a7 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a7, "success(...)");
                return a7;
            }
        }
        nVar = new bb2.n(this, (ff3.qux) barVar);
        java.lang.Object obj2 = nVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = nVar.z;
        tf2.n nVar22 = this.e;
        if (i == 0) {
        }
        e = getInputData().e("fullNameKey");
        if (e != null) {
        }
    }
}
