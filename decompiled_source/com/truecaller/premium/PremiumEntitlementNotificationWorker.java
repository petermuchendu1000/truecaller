package com.truecaller.premium;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bw\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0010\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00190\u0018j\u0002`\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/truecaller/premium/PremiumEntitlementNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lw82/l1;", "premiumRepository", "Ltf2/l0;", "premiumPurchaseSupportedCheck", "Lta2/k;", "familySharingUtil", "Ltf2/p;", "paidPremiumCheck", "Ltf2/n;", "goldGiftPromoUtils", "Lw82/q3;", "webBillingPurchaseStateManager", "Lw82/h3;", "purchaseSourceCache", "Lqb2/b;", "interstitialConfigProvider", "Lqb2/u;", "navControllerRegistry", "Lx82/w;", "Lcom/truecaller/premium/ui/bottomsheet/model/BottomSheetDTO;", "Lcom/truecaller/premium/data/component/BottomSheetConfigRepository;", "bottomSheetRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lw82/l1;Ltf2/l0;Lta2/k;Ltf2/p;Ltf2/n;Lw82/q3;Lw82/h3;Lqb2/b;Lqb2/u;Lx82/w;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final class PremiumEntitlementNotificationWorker extends androidx.work.CoroutineWorker {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4572a;
    public final w82.l1 b;

    /* renamed from: c, reason: collision with root package name */
    public final tf2.l0 f4573c;

    /* renamed from: d, reason: collision with root package name */
    public final ta2.k f4574d;

    /* renamed from: e, reason: collision with root package name */
    public final tf2.p f4575e;

    /* renamed from: f, reason: collision with root package name */
    public final tf2.n f4576f;

    /* renamed from: g, reason: collision with root package name */
    public final w82.q3 f4577g;

    /* renamed from: h, reason: collision with root package name */
    public final w82.h3 f4578h;

    /* renamed from: i, reason: collision with root package name */
    public final qb2.b f4579i;
    public final qb2.u j;

    /* renamed from: k, reason: collision with root package name */
    public final x82.w f4580k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumEntitlementNotificationWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull w82.l1 l1Var, @org.jetbrains.annotations.NotNull tf2.l0 l0Var, @org.jetbrains.annotations.NotNull ta2.k kVar, @org.jetbrains.annotations.NotNull tf2.p pVar, @org.jetbrains.annotations.NotNull tf2.n nVar, @org.jetbrains.annotations.NotNull w82.q3 q3Var, @org.jetbrains.annotations.NotNull w82.h3 h3Var, @org.jetbrains.annotations.NotNull qb2.b bVar, @org.jetbrains.annotations.NotNull qb2.u uVar, @org.jetbrains.annotations.NotNull x82.w wVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l1Var, "premiumRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l0Var, "premiumPurchaseSupportedCheck");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "familySharingUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "paidPremiumCheck");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "goldGiftPromoUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(q3Var, "webBillingPurchaseStateManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h3Var, "purchaseSourceCache");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "interstitialConfigProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uVar, "navControllerRegistry");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wVar, "bottomSheetRepository");
        this.f4572a = context;
        this.b = l1Var;
        this.f4573c = l0Var;
        this.f4574d = kVar;
        this.f4575e = pVar;
        this.f4576f = nVar;
        this.f4577g = q3Var;
        this.f4578h = h3Var;
        this.f4579i = bVar;
        this.j = uVar;
        this.f4580k = wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0058, code lost:
    
        if (r1 == r3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0187, code lost:
    
        if (r1 == r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        i82.n nVar;
        int i10;
        w82.t1 t1Var;
        w82.t1 t1Var2;
        com.truecaller.premium.provider.Store store;
        i82.r rVar;
        java.lang.String str;
        java.lang.Object obj;
        i82.r rVar2;
        boolean c10;
        i82.r rVar3;
        java.lang.Boolean bool;
        java.util.List list;
        java.lang.Object obj2;
        boolean z10;
        if (barVar instanceof i82.n) {
            nVar = (i82.n) barVar;
            int i11 = nVar.B;
            if ((i11 & androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION) != 0) {
                nVar.B = i11 - androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION;
                java.lang.Object obj3 = nVar.f8644z;
                ef3.bar barVar2 = ef3.bar.a;
                i10 = nVar.B;
                int i12 = 0;
                java.lang.Boolean bool2 = null;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                rVar3 = nVar.f8643y;
                                od.p.E(obj3);
                                list = (java.util.List) obj3;
                                if (list != null) {
                                    java.util.Iterator it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            java.util.List launchContexts = ((com.truecaller.premium.ui.bottomsheet.model.BottomSheetDTO) obj2).getLaunchContexts();
                                            if (launchContexts != null) {
                                                z10 = launchContexts.contains(rVar3.getName());
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                break;
                                            }
                                        } else {
                                            obj2 = null;
                                            break;
                                        }
                                    }
                                    com.truecaller.premium.ui.bottomsheet.model.BottomSheetDTO bottomSheetDTO = (com.truecaller.premium.ui.bottomsheet.model.BottomSheetDTO) obj2;
                                    if (bottomSheetDTO != null) {
                                        bool2 = bottomSheetDTO.getHideCongratulations();
                                    }
                                }
                                if (!kotlin.jvm.internal.Intrinsics.b(bool2, java.lang.Boolean.TRUE)) {
                                    return nd.t.a();
                                }
                                qb2.t.h(this.j.u, (g.baz) null, false, false, false, (java.lang.String) null, new i82.m(this, i12), 127);
                                return nd.t.a();
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rVar = nVar.f8642x;
                        od.p.E(obj3);
                        com.truecaller.premium.data.component.interstitial.InterstitialSpec interstitialSpec = (com.truecaller.premium.data.component.interstitial.InterstitialSpec) obj3;
                        if (interstitialSpec != null) {
                            bool = java.lang.Boolean.valueOf(interstitialSpec.getHideCongratulations());
                        } else {
                            bool = null;
                        }
                        if (bool != null) {
                            bool2 = bool;
                            if (!kotlin.jvm.internal.Intrinsics.b(bool2, java.lang.Boolean.TRUE)) {
                            }
                        }
                        if (rVar != null) {
                            nVar.f8642x = null;
                            nVar.f8643y = rVar;
                            nVar.B = 3;
                            x82.w wVar = this.f4580k;
                            wVar.getClass();
                            obj3 = x82.w.b(wVar, nVar);
                            if (obj3 != barVar2) {
                                rVar3 = rVar;
                                list = (java.util.List) obj3;
                                if (list != null) {
                                }
                            }
                            return barVar2;
                        }
                        if (!kotlin.jvm.internal.Intrinsics.b(bool2, java.lang.Boolean.TRUE)) {
                        }
                    } else {
                        od.p.E(obj3);
                    }
                } else {
                    od.p.E(obj3);
                    nVar.B = 1;
                    obj3 = this.b.b(nVar);
                }
                t1Var = (w82.u1) obj3;
                if (!(t1Var instanceof w82.t1)) {
                    t1Var2 = t1Var;
                } else {
                    t1Var2 = null;
                }
                if (t1Var2 == null) {
                    store = t1Var2.a.p;
                } else {
                    store = null;
                }
                if (store == com.truecaller.premium.provider.Store.WEB) {
                    w82.q3 q3Var = this.f4577g;
                    w82.r1 r1Var = q3Var.a;
                    r1Var.m("webPurchaseTimestamp", 0L);
                    r1Var.k("isWebPurchaseSuccessful", false);
                    q3Var.b.k("isWebPurchasePendingStateChanged", false);
                }
                if (!jj3.bar.v(getInputData().e("refreshOnlyKey"))) {
                    nd.s a10 = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a10, "success(...)");
                    return a10;
                }
                boolean M = this.f4576f.M();
                android.content.Context context = this.f4572a;
                if (M) {
                    int i13 = com.truecaller.premium.gift.GoldGiftDialogActivity.d0;
                    context.startActivity(fe0.m.o(context, "notification", false));
                    return nd.t.a();
                }
                ta2.k kVar = this.f4574d;
                if (kVar.b()) {
                    if (kVar.b()) {
                        c10 = ((e92.k) kVar.d).c(com.truecaller.premium.data.feature.PremiumFeature.CALL_ASSISTANT, false);
                        if (c10) {
                            java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                            android.content.Context context2 = this.f4572a;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y90.m6.o(context2, com.truecaller.bottombar.BottomBarButtonType.ASSISTANT, "assistant_interstitial", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 96).putExtra("KEY_ANALYTICS_CONTEXT", "premiumUserTab").putExtra("extra_should_show_onboarding", bool3), "putExtra(...)");
                            return nd.t.a();
                        }
                    }
                    int i14 = com.truecaller.premium.familysharing.FamilySharingDialogActivity.e0;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notification", "launchAnalyticsContext");
                    android.content.Intent putExtra = com.moloco.sdk.internal.publisher.b0.o(context, com.truecaller.premium.familysharing.FamilySharingDialogMvp.ScreenType.FAMILY_SHARING_PLAN_PURCHASED, "notification").putExtra("FamilySharingDialogFragment.LaunchAnalyticsContext", "notification");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                    context.startActivity(putExtra);
                    return nd.t.a();
                }
                w82.g3 g3Var = (w82.g3) kotlin.collections.CollectionsKt.firstOrNull(this.f4578h.a());
                if (g3Var != null && (str = g3Var.c) != null) {
                    com.truecaller.premium.PremiumLaunchContext$Static premiumLaunchContext$Static = i82.r.A7;
                    if (kotlin.text.StringsKt.X(str)) {
                        rVar2 = null;
                    } else {
                        com.truecaller.premium.PremiumLaunchContext$Static.Companion.getClass();
                        java.util.Iterator it2 = com.truecaller.premium.PremiumLaunchContext$Static.getEntries().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (kotlin.text.y.p(((com.truecaller.premium.PremiumLaunchContext$Static) obj).name(), str, true)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        rVar2 = (com.truecaller.premium.PremiumLaunchContext$Static) obj;
                        if (rVar2 == null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
                            rVar2 = new i82.p(str);
                        }
                    }
                    rVar = rVar2;
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    nVar.f8642x = rVar;
                    nVar.f8643y = null;
                    nVar.B = 2;
                    obj3 = this.f4579i.a(rVar, nVar);
                }
                if (rVar != null) {
                }
                if (!kotlin.jvm.internal.Intrinsics.b(bool2, java.lang.Boolean.TRUE)) {
                }
            }
        }
        nVar = new i82.n(this, (ff3.qux) barVar);
        java.lang.Object obj32 = nVar.f8644z;
        ef3.bar barVar22 = ef3.bar.a;
        i10 = nVar.B;
        int i122 = 0;
        java.lang.Boolean bool22 = null;
        if (i10 == 0) {
        }
        t1Var = (w82.u1) obj32;
        if (!(t1Var instanceof w82.t1)) {
        }
        if (t1Var2 == null) {
        }
        if (store == com.truecaller.premium.provider.Store.WEB) {
        }
        if (!jj3.bar.v(getInputData().e("refreshOnlyKey"))) {
        }
    }
}
