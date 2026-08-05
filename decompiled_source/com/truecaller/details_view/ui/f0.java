package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class f0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public int A;
    public java.lang.Object B;
    public java.lang.Object C;
    public java.lang.Object D;
    public java.lang.Object E;
    public java.lang.Object F;
    public java.lang.Object G;
    public java.lang.Object H;
    public final /* synthetic */ int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(df3.bar barVar, ig3.j jVar, kotlin.jvm.functions.Function0 function0, nf3.i iVar, ig3.i[] iVarArr) {
        super(2, barVar);
        this.x = 2;
        this.E = iVarArr;
        this.F = function0;
        this.G = (ff3.g) iVar;
        this.H = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01e7, code lost:
    
        if (r0.o(r17, r31) == r2) goto L67;
     */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x004a: MOVE (r2 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:75), block:B:75:0x004a */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0188 A[Catch: all -> 0x0049, TryCatch #1 {all -> 0x0049, blocks: (B:23:0x0044, B:27:0x0170, B:29:0x0188, B:31:0x0194, B:33:0x01ac, B:34:0x01b5, B:40:0x0089, B:43:0x0097, B:44:0x00a1, B:46:0x00a7, B:51:0x00bf, B:53:0x00c3, B:55:0x00e2, B:57:0x00e8, B:59:0x00fa, B:60:0x0107, B:62:0x0129, B:63:0x0132, B:68:0x00d5), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0194 A[Catch: all -> 0x0049, TryCatch #1 {all -> 0x0049, blocks: (B:23:0x0044, B:27:0x0170, B:29:0x0188, B:31:0x0194, B:33:0x01ac, B:34:0x01b5, B:40:0x0089, B:43:0x0097, B:44:0x00a1, B:46:0x00a7, B:51:0x00bf, B:53:0x00c3, B:55:0x00e2, B:57:0x00e8, B:59:0x00fa, B:60:0x0107, B:62:0x0129, B:63:0x0132, B:68:0x00d5), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object c(java.lang.Object obj) {
        pg3.bar barVar;
        pg3.bar barVar2;
        pg3.bar barVar3;
        t90.q0 q0Var;
        t90.g1 g1Var;
        int i;
        com.truecaller.ads.caching.model.Config e;
        java.lang.Object obj2;
        com.truecaller.ads.caching.model.Actions actions;
        java.lang.Integer num;
        int i2;
        t90.q0 q0Var2;
        t90.g1 g1Var2;
        com.truecaller.ads.caching.model.Config config;
        t90.x xVar;
        o00.b0 b0Var;
        java.lang.Integer num2;
        fg3.e0 e0Var = (fg3.e0) this.F;
        ef3.bar barVar4 = ef3.bar.a;
        int i3 = this.A;
        int i4 = 0;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            barVar2 = (pg3.bar) this.B;
                            try {
                                od.p.E(obj);
                                kotlin.Unit unit = kotlin.Unit.a;
                                kotlin.Unit unit2 = kotlin.Unit.a;
                                barVar2.h((java.lang.Object) null);
                                return kotlin.Unit.a;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                barVar2.h((java.lang.Object) null);
                                throw th;
                            }
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = this.z;
                    i2 = this.y;
                    config = (com.truecaller.ads.caching.model.Config) this.E;
                    q0Var2 = (t90.q0) this.D;
                    g1Var2 = (t90.g1) this.C;
                    barVar3 = (pg3.bar) this.B;
                    od.p.E(obj);
                    e = config;
                    q0Var = q0Var2;
                    g1Var = g1Var2;
                    i = i2;
                    if (e != null) {
                        barVar2 = barVar3;
                        kotlin.Unit unit22 = kotlin.Unit.a;
                        barVar2.h((java.lang.Object) null);
                        return kotlin.Unit.a;
                    }
                    xVar = (t90.i) g1Var.n.get();
                    b0Var = q0Var.a;
                    o00.b0 b0Var2 = q0Var.a;
                    if (!xVar.n(b0Var.a())) {
                        g1Var.p.e(new t90.baz(b0Var2));
                    } else {
                        t90.x xVar2 = (t90.i) g1Var.n.get();
                        com.truecaller.ads.caching.model.RequestType requestType = com.truecaller.ads.caching.model.RequestType.UNIFIED;
                        java.lang.String a = b0Var2.a();
                        java.lang.String str = q0Var.c;
                        com.truecaller.ads.caching.model.CacheConfiguration d = g1Var.d();
                        if (d != null) {
                            num2 = d.getVersion();
                        } else {
                            num2 = null;
                        }
                        t90.g gVar = new t90.g(b0Var2, (java.lang.String) null, requestType, a, str, true, num2, (g10.m0) null, (java.util.List) null, false, (java.lang.String) null, 1922);
                        this.F = null;
                        this.B = barVar3;
                        this.C = null;
                        this.D = null;
                        this.E = null;
                        this.y = i;
                        this.z = i4;
                        this.A = 3;
                    }
                    barVar2 = barVar3;
                    kotlin.Unit unit3 = kotlin.Unit.a;
                    kotlin.Unit unit222 = kotlin.Unit.a;
                    barVar2.h((java.lang.Object) null);
                    return kotlin.Unit.a;
                }
                i = this.y;
                t90.q0 q0Var3 = (t90.q0) this.D;
                t90.g1 g1Var3 = (t90.g1) this.C;
                pg3.bar barVar5 = (pg3.bar) this.B;
                od.p.E(obj);
                q0Var = q0Var3;
                barVar3 = barVar5;
                g1Var = g1Var3;
            } else {
                od.p.E(obj);
                t90.g1 g1Var4 = (t90.g1) this.G;
                barVar3 = g1Var4.r;
                q0Var = (t90.q0) this.H;
                this.F = e0Var;
                this.B = barVar3;
                this.C = g1Var4;
                this.D = q0Var;
                this.y = 0;
                this.A = 1;
                if (barVar3.d(this) != barVar4) {
                    g1Var = g1Var4;
                    i = 0;
                }
                return barVar4;
            }
            e = g1Var.e(q0Var.a.a());
            qc3.bar barVar6 = g1Var.n;
            if (e != null) {
                java.util.Iterator it = e.getRequestSources().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (kotlin.jvm.internal.Intrinsics.b(((com.truecaller.ads.caching.model.RequestSource) obj2).getId(), q0Var.c)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                com.truecaller.ads.caching.model.RequestSource requestSource = (com.truecaller.ads.caching.model.RequestSource) obj2;
                if (requestSource == null || (actions = ((j40.baz) g1Var.m.get()).b(requestSource, g1Var.f(q0Var, e))) == null) {
                    actions = new com.truecaller.ads.caching.model.Actions(true, e.getAdUnitId(), e.getRequestType());
                }
                if (actions.getShouldCheckForCache()) {
                    if (((t90.i) barVar6.get()).n(t90.e.g(e))) {
                        g1Var.p.e(new t90.baz(q0Var.a));
                        if (e != null) {
                        }
                    }
                }
                t90.x xVar3 = (t90.i) barVar6.get();
                o00.b0 b0Var3 = q0Var.a;
                java.lang.String adUnitId = actions.getAdUnitId();
                com.truecaller.ads.caching.model.RequestType requestType2 = actions.getRequestType();
                java.lang.String g = t90.e.g(e);
                java.lang.String str2 = q0Var.c;
                boolean shouldCheckForCache = actions.getShouldCheckForCache();
                com.truecaller.ads.caching.model.CacheConfiguration d2 = g1Var.d();
                if (d2 != null) {
                    num = d2.getVersion();
                } else {
                    num = null;
                }
                t90.g gVar2 = new t90.g(b0Var3, adUnitId, requestType2, g, str2, shouldCheckForCache, num, (g10.m0) null, (java.util.List) null, false, (java.lang.String) null, 1920);
                this.F = e0Var;
                this.B = barVar3;
                this.C = g1Var;
                this.D = q0Var;
                this.E = e;
                this.y = i;
                this.z = 0;
                this.A = 2;
                if (xVar3.o(gVar2, this) != barVar4) {
                    i2 = i;
                    q0Var2 = q0Var;
                    g1Var2 = g1Var;
                    config = e;
                    e = config;
                    q0Var = q0Var2;
                    g1Var = g1Var2;
                    i = i2;
                    if (e != null) {
                    }
                } else {
                    return barVar4;
                }
            }
            xVar = (t90.i) g1Var.n.get();
            b0Var = q0Var.a;
            o00.b0 b0Var22 = q0Var.a;
            if (!xVar.n(b0Var.a())) {
            }
            barVar2 = barVar3;
            kotlin.Unit unit32 = kotlin.Unit.a;
            kotlin.Unit unit2222 = kotlin.Unit.a;
            barVar2.h((java.lang.Object) null);
            return kotlin.Unit.a;
        } catch (java.lang.Throwable th2) {
            th = th2;
            barVar2 = barVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x014d, code lost:
    
        if (r9 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x012b A[Catch: all -> 0x002d, TRY_ENTER, TryCatch #2 {all -> 0x002d, blocks: (B:8:0x0025, B:10:0x011f, B:13:0x012b, B:15:0x0147, B:20:0x0167, B:22:0x016d, B:24:0x01a0, B:31:0x014f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a0 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #2 {all -> 0x002d, blocks: (B:8:0x0025, B:10:0x011f, B:13:0x012b, B:15:0x0147, B:20:0x0167, B:22:0x016d, B:24:0x01a0, B:31:0x014f), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object f(java.lang.Object obj) {
        w82.bar barVar;
        w82.l3 l3Var;
        java.lang.String str;
        pg3.bar barVar2;
        int i;
        java.lang.Object W;
        int i2;
        w82.l3 l3Var2;
        int i3;
        w82.bar barVar3;
        pg3.bar barVar4;
        w82.k1 k1Var;
        int i4;
        java.lang.Object d;
        w82.k1 k1Var2;
        boolean booleanValue;
        java.lang.String str2;
        java.lang.String string;
        ef3.bar barVar5 = ef3.bar.a;
        int i5 = this.A;
        try {
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            k1Var2 = (w82.k1) this.E;
                            l3Var2 = (w82.l3) this.D;
                            w82.bar barVar6 = (w82.bar) this.C;
                            barVar4 = (pg3.bar) this.B;
                            try {
                                od.p.E(obj);
                                barVar3 = barVar6;
                                d = obj;
                                booleanValue = ((java.lang.Boolean) d).booleanValue();
                                str2 = l3Var2.h;
                                java.lang.String str3 = l3Var2.i;
                                if (str2 != null) {
                                    w82.j3 j3Var = (w82.j3) ((w82.h3) barVar3.d.get());
                                    j3Var.getClass();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "orderId");
                                    com.truecaller.premium.data.PurchaseSourceCache$SourceEntry purchaseSourceCache$SourceEntry = (com.truecaller.premium.data.PurchaseSourceCache$SourceEntry) j3Var.c.get(str2);
                                    if (purchaseSourceCache$SourceEntry != null) {
                                        string = purchaseSourceCache$SourceEntry.getSource();
                                    } else {
                                        string = null;
                                    }
                                }
                                string = ((w82.j3) ((w82.h3) barVar3.d.get())).a.getString("preliminary_purchase_source", null);
                                if (booleanValue && string == null && (str3 == null || str3.length() == 0)) {
                                    uf2.c cVar = barVar3.c;
                                    i82.r rVar = i82.r.E8;
                                    cVar.d(new uf2.b(rVar, (i82.r) null, (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(l3Var2.a), (java.util.List) null, (r82.w) null, false, (com.truecaller.premium.data.SubscriptionPromoEventMetaData) null, (com.truecaller.premium.PurchaseButtonContext) null, (com.truecaller.premium.data.tier.PremiumTierType) null, (com.truecaller.premium.data.tier.PremiumTierType) null, (com.truecaller.premium.data.tier.PromotionType) null, (java.lang.String) null, str2, (com.truecaller.premium.data.ConfigComponent) null, (java.lang.String) null, (java.lang.String) null, 122874));
                                    if (str2 != null) {
                                        ((w82.j3) ((w82.h3) barVar3.d.get())).b(rVar, str2);
                                    }
                                }
                                barVar2 = barVar4;
                                k1Var = k1Var2;
                                barVar2.h((java.lang.Object) null);
                                return k1Var;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                barVar4.h((java.lang.Object) null);
                                throw th;
                            }
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = this.z;
                    int i7 = this.y;
                    w82.l3 l3Var3 = (w82.l3) this.D;
                    barVar3 = (w82.bar) this.C;
                    pg3.bar barVar7 = (pg3.bar) this.B;
                    try {
                        od.p.E(obj);
                        barVar2 = barVar7;
                        i3 = i6;
                        i2 = i7;
                        l3Var2 = l3Var3;
                        W = obj;
                        k1Var = (w82.k1) W;
                        i4 = k1Var.a;
                        w82.f0 f0Var = k1Var.c;
                        boolean z = l3Var2.f;
                        if ((i4 != 0 || i4 == 3) && !f0Var.l) {
                            ((w82.r1) barVar3.e).n("purchaseToken", l3Var2.e);
                        }
                        if (!l3Var2.f && ((i4 == 0 || i4 == 3) && !f0Var.l)) {
                            r82.l lVar = barVar3.a;
                            this.B = barVar2;
                            this.C = barVar3;
                            this.D = l3Var2;
                            this.E = k1Var;
                            this.y = i2;
                            this.z = i3;
                            this.A = 3;
                            r82.l lVar2 = lVar;
                            lVar2.getClass();
                            d = r82.l.d(lVar2, new r82.baz((df3.bar) null, lVar2, l3Var2), this);
                            if (d != barVar5) {
                                k1Var2 = k1Var;
                                barVar4 = barVar2;
                                booleanValue = ((java.lang.Boolean) d).booleanValue();
                                str2 = l3Var2.h;
                                java.lang.String str32 = l3Var2.i;
                                if (str2 != null) {
                                }
                                string = ((w82.j3) ((w82.h3) barVar3.d.get())).a.getString("preliminary_purchase_source", null);
                                if (booleanValue) {
                                    uf2.c cVar2 = barVar3.c;
                                    i82.r rVar2 = i82.r.E8;
                                    cVar2.d(new uf2.b(rVar2, (i82.r) null, (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(l3Var2.a), (java.util.List) null, (r82.w) null, false, (com.truecaller.premium.data.SubscriptionPromoEventMetaData) null, (com.truecaller.premium.PurchaseButtonContext) null, (com.truecaller.premium.data.tier.PremiumTierType) null, (com.truecaller.premium.data.tier.PremiumTierType) null, (com.truecaller.premium.data.tier.PromotionType) null, (java.lang.String) null, str2, (com.truecaller.premium.data.ConfigComponent) null, (java.lang.String) null, (java.lang.String) null, 122874));
                                    if (str2 != null) {
                                    }
                                }
                                barVar2 = barVar4;
                                k1Var = k1Var2;
                            }
                            return barVar5;
                        }
                        barVar2.h((java.lang.Object) null);
                        return k1Var;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        barVar4 = barVar7;
                        barVar4.h((java.lang.Object) null);
                        throw th;
                    }
                }
                i = this.y;
                java.lang.String str4 = (java.lang.String) this.E;
                l3Var = (w82.l3) this.D;
                barVar = (w82.bar) this.C;
                barVar2 = (pg3.bar) this.B;
                od.p.E(obj);
                str = str4;
            } else {
                od.p.E(obj);
                barVar = (w82.bar) this.F;
                pg3.bar barVar8 = barVar.g;
                l3Var = (w82.l3) this.G;
                java.lang.String str5 = (java.lang.String) this.H;
                this.B = barVar8;
                this.C = barVar;
                this.D = l3Var;
                this.E = str5;
                this.y = 0;
                this.A = 1;
                if (barVar8.d(this) != barVar5) {
                    str = str5;
                    barVar2 = barVar8;
                    i = 0;
                }
                return barVar5;
            }
            w82.l1 l1Var = barVar.b;
            java.lang.String str6 = l3Var.b;
            java.lang.String str7 = l3Var.c;
            this.B = barVar2;
            this.C = barVar;
            this.D = l3Var;
            this.E = null;
            this.y = i;
            this.z = 0;
            this.A = 2;
            w82.n1 n1Var = (w82.n1) l1Var;
            W = fg3.h0.W(n1Var.g, new s42.d0(n1Var, str6, str7, str, (df3.bar) null, 17), this);
            if (W != barVar5) {
                i2 = i;
                l3Var2 = l3Var;
                i3 = 0;
                barVar3 = barVar;
                k1Var = (w82.k1) W;
                i4 = k1Var.a;
                w82.f0 f0Var2 = k1Var.c;
                boolean z2 = l3Var2.f;
                if (i4 != 0) {
                }
                ((w82.r1) barVar3.e).n("purchaseToken", l3Var2.e);
                if (!l3Var2.f) {
                    r82.l lVar3 = barVar3.a;
                    this.B = barVar2;
                    this.C = barVar3;
                    this.D = l3Var2;
                    this.E = k1Var;
                    this.y = i2;
                    this.z = i3;
                    this.A = 3;
                    r82.l lVar22 = lVar3;
                    lVar22.getClass();
                    d = r82.l.d(lVar22, new r82.baz((df3.bar) null, lVar22, l3Var2), this);
                    if (d != barVar5) {
                    }
                    return barVar5;
                }
                barVar2.h((java.lang.Object) null);
                return k1Var;
            }
            return barVar5;
        } catch (java.lang.Throwable th3) {
            th = th3;
            barVar4 = barVar2;
            barVar4.h((java.lang.Object) null);
            throw th;
        }
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.details_view.ui.f0((ja1.qux) this.G, (com.truecaller.details_view.ui.i0) this.D, barVar);
            case 1:
                return new com.truecaller.details_view.ui.f0((fl2.e) this.H, barVar);
            case 2:
                ig3.i[] iVarArr = (ig3.i[]) this.E;
                com.truecaller.details_view.ui.f0 f0Var = new com.truecaller.details_view.ui.f0(barVar, (ig3.j) this.H, (kotlin.jvm.functions.Function0) this.F, (nf3.i) this.G, iVarArr);
                f0Var.D = obj;
                return f0Var;
            case 3:
                com.truecaller.details_view.ui.f0 f0Var2 = new com.truecaller.details_view.ui.f0((t90.g1) this.G, (t90.q0) this.H, barVar, 3);
                f0Var2.F = obj;
                return f0Var2;
            case 4:
                return new com.truecaller.details_view.ui.f0((w00.r) this.G, (w00.b) this.H, barVar, 4);
            case 5:
                return new com.truecaller.details_view.ui.f0((w82.bar) this.F, (w82.l3) this.G, (java.lang.String) this.H, barVar, 5);
            default:
                com.truecaller.details_view.ui.f0 f0Var3 = new com.truecaller.details_view.ui.f0((v50.d) this.F, (y50.bar) this.G, (x20.a) this.H, barVar, 6);
                f0Var3.E = obj;
                return f0Var3;
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 2:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 3:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 4:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 5:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:347:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0659  */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v63, types: [android.content.Context, java.lang.Object, com.truecaller.details_view.ui.DetailsViewActivityLegacy] */
    /* JADX WARN: Type inference failed for: r2v95, types: [int] */
    /* JADX WARN: Type inference failed for: r2v97, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:132:0x037e -> B:116:0x0321). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x0397 -> B:116:0x0321). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x044e -> B:149:0x0452). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 2594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truecaller.details_view.ui.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(fg3.e0 e0Var, java.lang.Object obj, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.G = e0Var;
        this.H = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(fl2.e eVar, df3.bar barVar) {
        super(2, barVar);
        this.x = 1;
        this.H = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ja1.qux quxVar, com.truecaller.details_view.ui.i0 i0Var, df3.bar barVar) {
        super(2, barVar);
        this.x = 0;
        this.G = quxVar;
        this.D = i0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }
}
