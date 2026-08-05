package com.truecaller.premium;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BU\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/truecaller/premium/PremiumSubscriptionStatusNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lr82/t;", "billing", "Luf2/c;", "premiumEventsLogger", "Lr31/bar;", "coreSettings", "Lw82/y1;", "subscriptionStatusRepository", "Ls62/d;", "notificationManager", "Lnc0/bar;", "analytics", "Lcom/truecaller/clevertap/CleverTapManager;", "cleverTapManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lr82/t;Luf2/c;Lr31/bar;Lw82/y1;Ls62/d;Lnc0/bar;Lcom/truecaller/clevertap/CleverTapManager;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final class PremiumSubscriptionStatusNotificationWorker extends androidx.work.CoroutineWorker {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4581a;
    public final r82.t b;

    /* renamed from: c, reason: collision with root package name */
    public final uf2.c f4582c;

    /* renamed from: d, reason: collision with root package name */
    public final r31.bar f4583d;

    /* renamed from: e, reason: collision with root package name */
    public final w82.y1 f4584e;

    /* renamed from: f, reason: collision with root package name */
    public final s62.d f4585f;

    /* renamed from: g, reason: collision with root package name */
    public final nc0.bar f4586g;

    /* renamed from: h, reason: collision with root package name */
    public final com.truecaller.clevertap.CleverTapManager f4587h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumSubscriptionStatusNotificationWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull r82.t tVar, @org.jetbrains.annotations.NotNull uf2.c cVar, @org.jetbrains.annotations.NotNull r31.bar barVar, @org.jetbrains.annotations.NotNull w82.y1 y1Var, @org.jetbrains.annotations.NotNull s62.d dVar, @org.jetbrains.annotations.NotNull nc0.bar barVar2, @org.jetbrains.annotations.NotNull com.truecaller.clevertap.CleverTapManager cleverTapManager) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "billing");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "premiumEventsLogger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "coreSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(y1Var, "subscriptionStatusRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "notificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cleverTapManager, "cleverTapManager");
        this.f4581a = context;
        this.b = tVar;
        this.f4582c = cVar;
        this.f4583d = barVar;
        this.f4584e = y1Var;
        this.f4585f = dVar;
        this.f4586g = barVar2;
        this.f4587h = cleverTapManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(ff3.qux quxVar) {
        i82.y yVar;
        ef3.bar barVar;
        int i10;
        com.truecaller.premium.data.SubscriptionStatusReason a10;
        java.lang.Object d5;
        com.truecaller.clevertap.CleverTapManager cleverTapManager;
        java.lang.String str;
        java.lang.String str2;
        kotlin.Pair[] pairArr;
        kotlin.Pair[] pairArr2;
        r82.w wVar;
        w82.l3 l3Var;
        java.util.List list;
        if (quxVar instanceof i82.y) {
            yVar = (i82.y) quxVar;
            int i11 = yVar.G;
            if ((i11 & androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION) != 0) {
                yVar.G = i11 - androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION;
                java.lang.Object obj = yVar.E;
                barVar = ef3.bar.a;
                i10 = yVar.G;
                r82.l lVar = this.b;
                int i12 = 1;
                java.lang.String str3 = null;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i12 = yVar.D;
                            str2 = yVar.C;
                            pairArr = yVar.B;
                            str = yVar.A;
                            cleverTapManager = yVar.f8709z;
                            pairArr2 = yVar.f8708y;
                            od.p.E(obj);
                            l3Var = (w82.l3) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) obj);
                            if (l3Var != null && (list = l3Var.a) != null) {
                                str3 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(list);
                            }
                            if (str3 == null) {
                                str3 = "";
                            }
                            pairArr[i12] = new kotlin.Pair(str2, str3);
                            cleverTapManager.push(str, kotlin.collections.r0.i(pairArr2));
                            nd.s a11 = nd.t.a();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a11, "success(...)");
                            return a11;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a10 = yVar.f8707x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    java.lang.String e10 = getInputData().e("PAGE_URL");
                    if (e10 == null) {
                        e10 = "https://play.google.com/store/account/subscriptions";
                    }
                    w82.o3 o3Var = com.truecaller.premium.data.SubscriptionStatusReason.Companion;
                    java.lang.String e11 = getInputData().e("REASON");
                    o3Var.getClass();
                    a10 = w82.o3.a(e11);
                    w82.z1 z1Var = this.f4584e;
                    z1Var.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a10, "reason");
                    z1Var.a.n("subscriptionStatusChangedReason", a10.name());
                    f13.b bVar = this.f4583d;
                    bVar.n("subscriptionErrorResolveUrl", e10);
                    bVar.p("subscriptionPaymentFailedViewShownOnce");
                    if (a10 == com.truecaller.premium.data.SubscriptionStatusReason.SUBSCRIPTION_RENEWED) {
                        yVar.f8707x = a10;
                        yVar.G = 1;
                        r82.l lVar2 = lVar;
                        lVar2.getClass();
                        obj = r82.l.d(lVar2, new r82.j(lVar2, (df3.bar) null), yVar);
                    }
                    kotlin.Pair[] pairArr3 = new kotlin.Pair[2];
                    pairArr3[0] = new kotlin.Pair("Status", a10.name());
                    yVar.f8707x = null;
                    yVar.f8708y = pairArr3;
                    com.truecaller.clevertap.CleverTapManager cleverTapManager2 = this.f4587h;
                    yVar.f8709z = cleverTapManager2;
                    yVar.A = "PremiumRTDNStatus";
                    yVar.B = pairArr3;
                    yVar.C = "SKU";
                    yVar.D = 1;
                    yVar.G = 2;
                    r82.l lVar3 = lVar;
                    lVar3.getClass();
                    d5 = r82.l.d(lVar3, new r82.k(lVar3, (df3.bar) null), yVar);
                    if (d5 != barVar) {
                        cleverTapManager = cleverTapManager2;
                        str = "PremiumRTDNStatus";
                        str2 = "SKU";
                        pairArr = pairArr3;
                        obj = d5;
                        pairArr2 = pairArr;
                        l3Var = (w82.l3) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) obj);
                        if (l3Var != null) {
                            str3 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(list);
                        }
                        if (str3 == null) {
                        }
                        pairArr[i12] = new kotlin.Pair(str2, str3);
                        cleverTapManager.push(str, kotlin.collections.r0.i(pairArr2));
                        nd.s a112 = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a112, "success(...)");
                        return a112;
                    }
                    return barVar;
                }
                wVar = (r82.w) obj;
                if (wVar != null) {
                    this.f4582c.e(wVar, getInputData().e("PURCHASE_TYPE"));
                }
                kotlin.Pair[] pairArr32 = new kotlin.Pair[2];
                pairArr32[0] = new kotlin.Pair("Status", a10.name());
                yVar.f8707x = null;
                yVar.f8708y = pairArr32;
                com.truecaller.clevertap.CleverTapManager cleverTapManager22 = this.f4587h;
                yVar.f8709z = cleverTapManager22;
                yVar.A = "PremiumRTDNStatus";
                yVar.B = pairArr32;
                yVar.C = "SKU";
                yVar.D = 1;
                yVar.G = 2;
                r82.l lVar32 = lVar;
                lVar32.getClass();
                d5 = r82.l.d(lVar32, new r82.k(lVar32, (df3.bar) null), yVar);
                if (d5 != barVar) {
                }
                return barVar;
            }
        }
        yVar = new i82.y(this, quxVar);
        java.lang.Object obj2 = yVar.E;
        barVar = ef3.bar.a;
        i10 = yVar.G;
        r82.l lVar4 = this.b;
        int i122 = 1;
        java.lang.String str32 = null;
        if (i10 == 0) {
        }
        wVar = (r82.w) obj2;
        if (wVar != null) {
        }
        kotlin.Pair[] pairArr322 = new kotlin.Pair[2];
        pairArr322[0] = new kotlin.Pair("Status", a10.name());
        yVar.f8707x = null;
        yVar.f8708y = pairArr322;
        com.truecaller.clevertap.CleverTapManager cleverTapManager222 = this.f4587h;
        yVar.f8709z = cleverTapManager222;
        yVar.A = "PremiumRTDNStatus";
        yVar.B = pairArr322;
        yVar.C = "SKU";
        yVar.D = 1;
        yVar.G = 2;
        r82.l lVar322 = lVar4;
        lVar322.getClass();
        d5 = r82.l.d(lVar322, new r82.k(lVar322, (df3.bar) null), yVar);
        if (d5 != barVar) {
        }
        return barVar;
    }

    @Override // androidx.work.CoroutineWorker
    public final java.lang.Object doWork(df3.bar barVar) {
        com.truecaller.network.notification.NotificationType notificationType;
        java.lang.Integer num = new java.lang.Integer(getInputData().b("TYPE", -1));
        if (num.intValue() == -1) {
            num = null;
        }
        if (num == null || (notificationType = com.truecaller.network.notification.NotificationType.valueOf(num.intValue())) == null) {
            try {
                notificationType = com.truecaller.network.notification.NotificationType.valueOf(getInputData().b("TYPE", -1));
                kotlin.jvm.internal.Intrinsics.d(notificationType);
            } catch (java.io.InvalidClassException e10) {
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e10);
                notificationType = com.truecaller.network.notification.NotificationType.SUBSCRIPTION_STATUS_CHANGED;
            }
        }
        java.util.Objects.toString(notificationType);
        int i10 = i82.x.f8706a[notificationType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                com.truecaller.log.AssertionUtil.shouldNeverHappen(new java.lang.IllegalArgumentException("Notification type : " + notificationType + " not handled"), new java.lang.String[0]);
                return wi0.bar.u("failure(...)");
            }
            android.net.Uri parse = android.net.Uri.parse(getInputData().e("PAGE_URL"));
            android.content.Context context = this.f4581a;
            java.lang.String string = context.getString(2132018677);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            java.lang.String string2 = context.getString(2132018676);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            if (parse != null && android.webkit.URLUtil.isValidUrl(parse.toString())) {
                s62.f fVar = this.f4585f;
                f6.f0 f0Var = new f6.f0(context, fVar.o("miscellaneous_channel"));
                f0Var.f6238e = f6.f0.e(string);
                f0Var.f6239f = f6.f0.e(string2);
                f6.y yVar = new f6.y(0);
                yVar.f6330f = f6.f0.e(string2);
                f0Var.t(yVar);
                f0Var.m(android.graphics.BitmapFactory.decodeResource(context.getResources(), 2131231962));
                f0Var.D = context.getColor(2131102024);
                f0Var.k(-1);
                f0Var.Q.icon = 2131232902;
                android.content.Intent data = new android.content.Intent().setAction("android.intent.action.VIEW").setData(parse);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                f0Var.f6240g = fVar.k(pushNotificationSource.getType(), 0, 201326592, this.f4581a, data, "notificationSubscriptionGrace");
                f0Var.l(16, true);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var, "setAutoCancel(...)");
                android.app.Notification d5 = f0Var.d();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d5, "build(...)");
                fVar.v(2131365798, d5, pushNotificationSource.getType(), "notificationSubscriptionGrace");
                bd.bar.u(this.f4586g, "notificationSubscriptionGrace", "notification");
                nd.s a10 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a10, "success(...)");
                return a10;
            }
            return wi0.bar.u("failure(...)");
        }
        return a((ff3.qux) barVar);
    }
}
