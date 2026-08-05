package com.truecaller.premium.premiumusertab.compose.paywall;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/premium/premiumusertab/compose/paywall/PremiumUserTabPaywallViewModel;", "Landroidx/lifecycle/n1;", "tx/k0", "cc2/o", "cc2/k", "cc2/g", "PaywallError", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumUserTabPaywallViewModel extends androidx.lifecycle.n1 {
    public final df2.h A;
    public final ff2.h B;
    public final qc3.bar C;
    public final df2.b D;
    public final qo1.o E;
    public final u92.e F;
    public final android.content.Context G;
    public final kotlin.coroutines.CoroutineContext H;
    public final kotlin.coroutines.CoroutineContext I;
    public final ig3.h2 J;
    public final ig3.q1 K;
    public final ig3.h2 L;
    public final ig3.q1 M;
    public final ig3.h2 N;
    public final ig3.q1 O;
    public final ig3.h2 P;
    public final ig3.q1 Q;
    public final ig3.v1 R;
    public final ig3.p1 S;
    public final ig3.p1 T;
    public final w82.h1 U;
    public boolean V;
    public com.truecaller.premium.PurchaseButtonContext W;
    public java.lang.String X;
    public final kotlin.Lazy Y;
    public final java.util.LinkedHashSet Z;
    public final i82.r b;
    public final p.c3 c;
    public final w82.p3 d;
    public final java.util.List e;
    public final u03.c0 f;
    public final wb2.b g;
    public final u03.c0 h;
    public final u03.c0 i;
    public final w82.q1 j;
    public final i82.v k;
    public final jq2.qux l;
    public final r31.bar m;
    public final wj2.g n;
    public final ah.n o;
    public final m92.d p;
    public final f2.y q;
    public final cc2.b r;
    public final pr0.g0 s;
    public final u03.b0 t;
    public final tf2.z0 u;
    public final op2.baz v;
    public final tf2.w0 w;
    public final sb2.bar x;
    public final p.c3 y;
    public final qc3.bar z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/premium/premiumusertab/compose/paywall/PremiumUserTabPaywallViewModel$PaywallError;", "", "<init>", "(Ljava/lang/String;I)V", "NO_PREMIUM_TIERS", "UNKNOWN_ERROR", "SEND_LOGS_TO_SUPPORT_ERROR", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final class PaywallError {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError[] $VALUES;
        public static final com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError NO_PREMIUM_TIERS = new com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError("NO_PREMIUM_TIERS", 0);
        public static final com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError UNKNOWN_ERROR = new com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError("UNKNOWN_ERROR", 1);
        public static final com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError SEND_LOGS_TO_SUPPORT_ERROR = new com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError("SEND_LOGS_TO_SUPPORT_ERROR", 2);

        private static final /* synthetic */ com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError[] $values() {
            return new com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError[]{NO_PREMIUM_TIERS, UNKNOWN_ERROR, SEND_LOGS_TO_SUPPORT_ERROR};
        }

        static {
            com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private PaywallError(java.lang.String str, int i) {
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError valueOf(java.lang.String str) {
            return (com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError) java.lang.Enum.valueOf(com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError.class, str);
        }

        public static com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError[] values() {
            return (com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError[]) $VALUES.clone();
        }
    }

    public PremiumUserTabPaywallViewModel(i82.r rVar, gf2.d dVar, p.c3 c3Var, w82.p3 p3Var, java.util.List list, u03.c0 c0Var, wb2.b bVar, u03.c0 c0Var2, u03.c0 c0Var3, w82.q1 q1Var, i82.v vVar, jq2.qux quxVar, r31.bar barVar, wj2.g gVar, ah.n nVar, m92.d dVar2, f2.y yVar, cc2.b bVar2, pr0.g0 g0Var, u03.b0 b0Var, tf2.z0 z0Var, op2.baz bazVar, tf2.w0 w0Var, sb2.bar barVar2, p.c3 c3Var2, qc3.bar barVar3, df2.h hVar, ff2.h hVar2, qc3.bar barVar4, df2.b bVar3, qo1.o oVar, u92.e eVar, tx.b0 b0Var2, android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "premiumLaunchContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "activityProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3Var, "premiumEventsLoggingHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0Var, "onErrorParentCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "requestRefreshFromParent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0Var2, "requestNavigationFromParent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0Var3, "onShowToast");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(q1Var, "premiumStateSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "premiumSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "generalSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "coreSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "premiumConfigsInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "tierPlansCardCreator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar2, "premiumTabDeeplinkHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yVar, "premiumScreenDeeplinkResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar2, "featureListItemPayloadCreator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "resourceProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(z0Var, "termsAndPrivacyPolicyGenerator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "subscriptionListUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(w0Var, "subscriptionPurchaseEligibilityHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "premiumNoConnectionManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3Var2, "consumablePurchaseLostNotifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "abandonedCartHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "subscriptionButtonBuilder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar2, "subscriptionButtonDataMapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "premiumVariantProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar3, "skuLevelEventHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "premiumFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "catalogApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var2, "premiumPurchaseHelperFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "applicationContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "asyncContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "asyncIoContext");
        this.b = rVar;
        this.c = c3Var;
        this.d = p3Var;
        this.e = list;
        this.f = c0Var;
        this.g = bVar;
        this.h = c0Var2;
        this.i = c0Var3;
        this.j = q1Var;
        this.k = vVar;
        this.l = quxVar;
        this.m = barVar;
        this.n = gVar;
        this.o = nVar;
        this.p = dVar2;
        this.q = yVar;
        this.r = bVar2;
        this.s = g0Var;
        this.t = b0Var;
        this.u = z0Var;
        this.v = bazVar;
        this.w = w0Var;
        this.x = barVar2;
        this.y = c3Var2;
        this.z = barVar3;
        this.A = hVar;
        this.B = hVar2;
        this.C = barVar4;
        this.D = bVar3;
        this.E = oVar;
        this.F = eVar;
        this.G = context;
        this.H = coroutineContext;
        this.I = coroutineContext2;
        ig3.h2 c = ig3.w1.c(new java.lang.Object());
        this.J = c;
        this.K = new ig3.q1(c);
        ig3.h2 c2 = ig3.w1.c(new cc2.g(7));
        this.L = c2;
        this.M = new ig3.q1(c2);
        ig3.h2 c3 = ig3.w1.c(new xb2.f());
        this.N = c3;
        this.O = new ig3.q1(c3);
        ig3.h2 c4 = ig3.w1.c(new yb2.e());
        this.P = c4;
        this.Q = new ig3.q1(c4);
        ig3.v1 b = ig3.w1.b(0, 1, (hg3.bar) null, 5);
        this.R = b;
        this.S = new ig3.p1(b);
        this.T = dVar2.e;
        this.U = b0Var2.a(dVar);
        this.Y = kotlin.LazyKt.lazy(new cc2.e(this, 2));
        this.Z = new java.util.LinkedHashSet();
        fg3.h0.J(androidx.lifecycle.g1.l(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new cc2.f(this, null, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object o(com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel premiumUserTabPaywallViewModel, java.util.List list, ff3.qux quxVar) {
        cc2.r rVar;
        int i;
        try {
            if (quxVar instanceof cc2.r) {
                rVar = (cc2.r) quxVar;
                int i2 = rVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rVar.z = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = rVar.x;
                    java.lang.Object obj2 = ef3.bar.a;
                    i = rVar.z;
                    if (i == 0) {
                        if (i == 1) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        if (!list.isEmpty()) {
                            u92.e eVar = premiumUserTabPaywallViewModel.F;
                            java.util.List list2 = list;
                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list2, 10));
                            java.util.Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((m82.n) it.next()).a);
                            }
                            rVar.z = 1;
                            obj = eVar.h(arrayList, true, rVar);
                            if (obj == obj2) {
                                return obj2;
                            }
                        } else {
                            return null;
                        }
                    }
                    return (java.util.Map) obj;
                }
            }
            if (i == 0) {
            }
            return (java.util.Map) obj;
        } catch (java.lang.Exception e) {
            if (!(e instanceof java.util.concurrent.CancellationException)) {
                return null;
            }
            throw e;
        }
        rVar = new cc2.r(premiumUserTabPaywallViewModel, quxVar);
        java.lang.Object obj3 = rVar.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = rVar.z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|(1:19)|22|(1:24))|11|12|13))|27|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        r5.f.invoke(com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError.UNKNOWN_ERROR);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object p(com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel premiumUserTabPaywallViewModel, ff3.qux quxVar) {
        cc2.s sVar;
        int i;
        java.lang.Object value;
        if (quxVar instanceof cc2.s) {
            sVar = (cc2.s) quxVar;
            int i2 = sVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = sVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = sVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                        premiumUserTabPaywallViewModel = premiumUserTabPaywallViewModel;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ig3.h2 h2Var = premiumUserTabPaywallViewModel.J;
                    do {
                        value = h2Var.getValue();
                    } while (!h2Var.n(value, new java.lang.Object()));
                    sVar.z = 1;
                    java.lang.Object q = premiumUserTabPaywallViewModel.q(sVar);
                    premiumUserTabPaywallViewModel = q;
                    if (q == barVar) {
                        return barVar;
                    }
                }
                return kotlin.Unit.a;
            }
        }
        sVar = new cc2.s(premiumUserTabPaywallViewModel, quxVar);
        java.lang.Object obj2 = sVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = sVar.z;
        if (i == 0) {
        }
        return kotlin.Unit.a;
    }

    public static java.lang.Object s(com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel premiumUserTabPaywallViewModel, gc2.z2 z2Var, ff3.qux quxVar) {
        java.lang.Object value;
        java.lang.Object value2;
        int i = cc2.p.a[t.c.g(premiumUserTabPaywallViewModel.w, z2Var.a, premiumUserTabPaywallViewModel.r(), false).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ig3.h2 h2Var = premiumUserTabPaywallViewModel.N;
                    do {
                        value2 = h2Var.getValue();
                    } while (!h2Var.n(value2, new xb2.f(true, new by2.a(3, premiumUserTabPaywallViewModel, z2Var))));
                } else {
                    throw new java.lang.RuntimeException();
                }
            } else {
                ig3.h2 h2Var2 = premiumUserTabPaywallViewModel.P;
                do {
                    value = h2Var2.getValue();
                } while (!h2Var2.n(value, new yb2.e(true, com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType.CARRIER_NON_SUPPORT_BUT_OTHER_OPTIONS, new cc2.e(premiumUserTabPaywallViewModel, 0))));
            }
        } else {
            java.lang.Object t = premiumUserTabPaywallViewModel.t(z2Var, quxVar);
            if (t == ef3.bar.a) {
                return t;
            }
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object q(ff3.qux quxVar) {
        cc2.q qVar;
        int i;
        r82.u uVar;
        com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel premiumUserTabPaywallViewModel;
        cc2.n nVar;
        ig3.h2 h2Var;
        java.lang.Object value;
        if (quxVar instanceof cc2.q) {
            qVar = (cc2.q) quxVar;
            int i2 = qVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = qVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = qVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                        premiumUserTabPaywallViewModel = this;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    hb2.bar barVar2 = null;
                    w82.p3 p3Var = this.d;
                    if (p3Var != null) {
                        uVar = p3Var.b;
                    } else {
                        uVar = null;
                    }
                    if (p3Var != null) {
                        barVar2 = p3Var.g;
                    }
                    hb2.bar barVar3 = barVar2;
                    java.util.List r = r();
                    if (r != null) {
                        premiumUserTabPaywallViewModel = this;
                        a93.t tVar = new a93.t(premiumUserTabPaywallViewModel, r, uVar, barVar3, (df3.bar) null, 9);
                        qVar.z = 1;
                        obj = fg3.h0.W(premiumUserTabPaywallViewModel.I, tVar, qVar);
                        if (obj == barVar) {
                            return barVar;
                        }
                    } else {
                        this.f.invoke(com.truecaller.premium.premiumusertab.compose.paywall.PremiumUserTabPaywallViewModel.PaywallError.NO_PREMIUM_TIERS);
                        return kotlin.Unit.a;
                    }
                }
                nVar = (cc2.n) obj;
                do {
                    h2Var = premiumUserTabPaywallViewModel.J;
                    value = h2Var.getValue();
                } while (!h2Var.n(value, nVar));
                return kotlin.Unit.a;
            }
        }
        qVar = new cc2.q(this, quxVar);
        java.lang.Object obj2 = qVar.x;
        ef3.bar barVar4 = ef3.bar.a;
        i = qVar.z;
        if (i == 0) {
        }
        nVar = (cc2.n) obj2;
        do {
            h2Var = premiumUserTabPaywallViewModel.J;
            value = h2Var.getValue();
        } while (!h2Var.n(value, nVar));
        return kotlin.Unit.a;
    }

    public final java.util.List r() {
        java.util.List list;
        w82.p3 p3Var = this.d;
        if (p3Var != null && (list = p3Var.f) != null) {
            return list;
        }
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object t(gc2.z2 z2Var, ff3.qux quxVar) {
        cc2.w wVar;
        int i;
        com.truecaller.premium.data.tier.PremiumTierType B;
        java.lang.String str;
        gc2.z2 z2Var2;
        w82.p3 p3Var;
        if (quxVar instanceof cc2.w) {
            wVar = (cc2.w) quxVar;
            int i2 = wVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.C = i2 - Integer.MIN_VALUE;
                cc2.w wVar2 = wVar;
                java.lang.Object obj = wVar2.A;
                ef3.bar barVar = ef3.bar.a;
                i = wVar2.C;
                java.lang.String str2 = null;
                if (i == 0) {
                    if (i == 1) {
                        java.lang.String str3 = wVar2.z;
                        B = wVar2.y;
                        gc2.z2 z2Var3 = wVar2.x;
                        od.p.E(obj);
                        str = str3;
                        z2Var2 = z2Var3;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.lang.String str4 = z2Var.d;
                    if (str4 == null) {
                        str4 = this.X;
                    }
                    java.lang.String str5 = str4;
                    this.X = null;
                    B = ((w82.r1) this.j).B();
                    if (z2Var.c == null) {
                        this.x.a();
                        r82.w wVar3 = z2Var.a;
                        fg3.h0.J(androidx.lifecycle.g1.l(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new a63.w(this, wVar3, B, wVar3.a, str5, (df3.bar) null, 10), 3);
                    }
                    this.W = z2Var.b;
                    dd2.h hVar = (dd2.h) this.C.get();
                    com.truecaller.premium.provider.Variant variant = com.truecaller.premium.provider.Variant.PRICING;
                    wVar2.x = z2Var;
                    wVar2.y = B;
                    wVar2.z = str5;
                    wVar2.C = 1;
                    obj = hVar.g(variant, wVar2);
                    if (obj == barVar) {
                        return barVar;
                    }
                    str = str5;
                    z2Var2 = z2Var;
                }
                java.lang.String str6 = (java.lang.String) obj;
                r82.w wVar4 = z2Var2.a;
                p3Var = this.d;
                if (p3Var != null) {
                    str2 = p3Var.d;
                }
                cc2.e eVar = new cc2.e(this, 1);
                kotlin.jvm.functions.Function1 qVar = new a63.q(this, z2Var2, B, str, str6, 3);
                this.U.b0(this.H, wVar4, this.b, str2, str6, eVar, qVar);
                return kotlin.Unit.a;
            }
        }
        wVar = new cc2.w(this, quxVar);
        cc2.w wVar22 = wVar;
        java.lang.Object obj2 = wVar22.A;
        ef3.bar barVar2 = ef3.bar.a;
        i = wVar22.C;
        java.lang.String str22 = null;
        if (i == 0) {
        }
        java.lang.String str62 = (java.lang.String) obj2;
        r82.w wVar42 = z2Var2.a;
        p3Var = this.d;
        if (p3Var != null) {
        }
        cc2.e eVar2 = new cc2.e(this, 1);
        kotlin.jvm.functions.Function1 qVar2 = new a63.q(this, z2Var2, B, str, str62, 3);
        this.U.b0(this.H, wVar42, this.b, str22, str62, eVar2, qVar2);
        return kotlin.Unit.a;
    }

    public final void u() {
        ig3.h2 h2Var;
        java.lang.Object value;
        do {
            h2Var = this.P;
            value = h2Var.getValue();
        } while (!h2Var.n(value, new yb2.e(false, com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType.UNKNOWN, new c90.bar(3))));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086 A[LOOP:0: B:11:0x0080->B:13:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2 A[LOOP:1: B:16:0x009c->B:18:0x00a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object v(java.lang.String str, java.util.List list, com.truecaller.premium.data.tier.PremiumTierType premiumTierType, r82.u uVar, ff3.qux quxVar) {
        cc2.x xVar;
        int i;
        r82.w wVar;
        java.util.List list2;
        java.util.List list3;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.util.Iterator it2;
        ig3.h2 h2Var;
        java.lang.Object value;
        if (quxVar instanceof cc2.x) {
            xVar = (cc2.x) quxVar;
            int i2 = xVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = xVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = xVar.A;
                if (i == 0) {
                    if (i == 1) {
                        list2 = xVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.X = str;
                    com.truecaller.premium.PremiumLaunchContext.Static r8 = i82.r.U7;
                    if (uVar != null) {
                        wVar = uVar.a;
                    } else {
                        wVar = null;
                    }
                    df2.o0 o0Var = new df2.o0(r8, list, premiumTierType, true, null, null, wVar, null, 176);
                    xVar.x = list;
                    xVar.A = 1;
                    obj = this.A.b(o0Var, xVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                    list2 = list;
                }
                list3 = (java.util.List) obj;
                java.util.List list4 = list3;
                arrayList = new java.util.ArrayList(kotlin.collections.z.q(list4, 10));
                it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.B.a((xe2.s) it.next()));
                }
                it2 = list2.iterator();
                while (it2.hasNext()) {
                    d4.t.y(this.D, (r82.w) it2.next(), this.b);
                }
                do {
                    h2Var = this.L;
                    value = h2Var.getValue();
                } while (!h2Var.n(value, new cc2.g(r2.e6.b, list3, arrayList)));
                return kotlin.Unit.a;
            }
        }
        xVar = new cc2.x(this, quxVar);
        java.lang.Object obj2 = xVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = xVar.A;
        if (i == 0) {
        }
        list3 = (java.util.List) obj2;
        java.util.List list42 = list3;
        arrayList = new java.util.ArrayList(kotlin.collections.z.q(list42, 10));
        it = list42.iterator();
        while (it.hasNext()) {
        }
        it2 = list2.iterator();
        while (it2.hasNext()) {
        }
        do {
            h2Var = this.L;
            value = h2Var.getValue();
        } while (!h2Var.n(value, new cc2.g(r2.e6.b, list3, arrayList)));
        return kotlin.Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        if (v(r13, r1, r12, r5, r6) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
    
        if (s(r11, r4, r6) == r0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object w(com.truecaller.premium.data.tier.PremiumTierType premiumTierType, java.lang.String str, ff3.qux quxVar) {
        cc2.y yVar;
        int i;
        k92.c cVar;
        r82.u uVar;
        com.truecaller.premium.data.tier.PremiumTierType premiumTierType2;
        r82.u uVar2;
        java.lang.Object obj;
        if (quxVar instanceof cc2.y) {
            yVar = (cc2.y) quxVar;
            int i2 = yVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.z = i2 - Integer.MIN_VALUE;
                cc2.y yVar2 = yVar;
                java.lang.Object obj2 = yVar2.x;
                java.lang.Object obj3 = ef3.bar.a;
                i = yVar2.z;
                if (i == 0) {
                    if (i == 1 || i == 2) {
                        od.p.E(obj2);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj2);
                    java.util.List r = r();
                    java.util.List list = null;
                    if (r != null) {
                        java.util.Iterator it = r.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((k92.c) obj).a == premiumTierType) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        cVar = (k92.c) obj;
                    } else {
                        cVar = null;
                    }
                    w82.p3 p3Var = this.d;
                    if (p3Var != null) {
                        uVar = p3Var.b;
                    } else {
                        uVar = null;
                    }
                    if (uVar != null) {
                        premiumTierType2 = uVar.b;
                    } else {
                        premiumTierType2 = null;
                    }
                    if (premiumTierType2 == premiumTierType) {
                        uVar2 = uVar;
                    } else {
                        uVar2 = null;
                    }
                    if (cVar != null) {
                        op2.baz bazVar = this.v;
                        list = bazVar.w(bazVar.v(cVar, 3, false), cVar.a, uVar2);
                    }
                    if (list != null) {
                        int size = list.size();
                        if (size != 0) {
                            if (size != 1) {
                                yVar2.z = 2;
                            } else {
                                gc2.z2 z2Var = new gc2.z2((r82.w) kotlin.collections.CollectionsKt.V(list), (i82.r) null, str, (com.truecaller.premium.data.ConfigComponent) null, (java.lang.String) null, 54);
                                yVar2.z = 1;
                            }
                        } else {
                            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("Tier subscriptions empty");
                        }
                    } else {
                        com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("Tier subscriptions null");
                    }
                }
                return kotlin.Unit.a;
            }
        }
        yVar = new cc2.y(this, quxVar);
        cc2.y yVar22 = yVar;
        java.lang.Object obj22 = yVar22.x;
        java.lang.Object obj32 = ef3.bar.a;
        i = yVar22.z;
        if (i == 0) {
        }
        return kotlin.Unit.a;
    }

    public final void x(java.lang.Object obj) {
        fg3.h0.J(androidx.lifecycle.g1.l(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new c73.z(obj, this, (df3.bar) null, 7), 3);
    }
}
