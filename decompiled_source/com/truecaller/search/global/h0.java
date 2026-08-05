package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class h0 extends of0.baz implements com.truecaller.search.global.a0, com.truecaller.search.global.y0 {
    public final fg0.bar A;
    public final nt2.h B;
    public final p02.z3 C;
    public final t41.t D;
    public final s42.baz E;
    public final nt2.k F;
    public final s32.d G;
    public final wt.l H;
    public final ix1.d I;
    public final vf2.bar J;
    public final qc3.bar K;
    public final qc3.bar L;
    public final qc3.bar M;
    public final a53.bar N;
    public final com.truecaller.search.global.SearchResultOrder O;
    public final w31.g P;
    public final qo1.qux Q;
    public final java.text.NumberFormat R;
    public final n11.g S;
    public final qc3.bar T;
    public final n32.bar U;
    public final qc3.bar V;
    public final com.truecaller.search.global.i1 W;
    public com.truecaller.search.global.GlobalSearchResultActivity X;
    public android.os.CancellationSignal Y;
    public boolean Z;
    public final java.util.ArrayList a0;
    public final java.util.ArrayList b0;
    public final java.util.ArrayList c0;
    public final kotlin.coroutines.CoroutineContext d;
    public final java.util.ArrayList d0;
    public final u03.b e;
    public java.lang.String e0;
    public final m03.s f;
    public java.lang.String f0;
    public final c62.q g;
    public com.truecaller.data.country.CountryListDto.bar g0;
    public final ah.n h;
    public java.lang.String h0;
    public final u03.f0 i;
    public java.lang.String i0;
    public final int j;
    public com.truecaller.data.country.CountryListDto.bar j0;
    public final lp2.b k;
    public c62.p k0;
    public final com.truecaller.search.global.d l;
    public boolean l0;
    public final com.truecaller.analytics.AppEvents.GlobalSearch.NavigationSource m;
    public boolean m0;
    public final xf2.baz n;
    public boolean n0;
    public final android.os.Handler o;
    public boolean o0;
    public final m03.l p;
    public boolean p0;
    public final nc0.bar q;
    public boolean q0;
    public final xz1.q r;
    public com.truecaller.search.global.b r0;
    public final com.truecaller.search.global.a1 s;
    public int s0;
    public final kp2.bar t;
    public fg3.k2 t0;
    public final r03.d u;
    public boolean u0;
    public final boolean v;
    public final m03.p w;
    public final q81.b x;
    public final e00.k y;
    public final java.lang.String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, u03.b bVar, m03.s sVar, c62.q qVar, ah.n nVar, u03.f0 f0Var, lp2.b bVar2, com.truecaller.search.global.d dVar, com.truecaller.analytics.AppEvents.GlobalSearch.NavigationSource navigationSource, xf2.baz bazVar, android.os.Handler handler, m03.l lVar, nc0.bar barVar, xz1.q qVar2, com.truecaller.search.global.a1 a1Var, to1.g gVar, kp2.bar barVar2, r03.d dVar2, boolean z, m03.p pVar, q81.b bVar3, e00.k kVar, java.lang.String str, fg0.bar barVar3, nt2.h hVar, p02.z3 z3Var, t41.t tVar, s42.baz bazVar2, nt2.k kVar2, s32.d dVar3, wt.l lVar2, ix1.d dVar4, vf2.bar barVar4, qc3.bar barVar5, qc3.bar barVar6, qc3.bar barVar7, a53.bar barVar8, com.truecaller.search.global.SearchResultOrder searchResultOrder, w31.g gVar2, qo1.qux quxVar, java.text.NumberFormat numberFormat, n11.g gVar3, qc3.bar barVar9, n32.bar barVar10, qc3.bar barVar11, com.truecaller.search.global.i1 i1Var) {
        super(coroutineContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "deviceInfoUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "searchManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "localContactsSearcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f0Var, "resourceProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar2, "searchMatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "adapterDelegate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "availabilityManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "countryManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar2, "settings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a1Var, "populateContactMetadataHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "filterSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "adsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar2, "partnerInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "dateHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar3, "numberProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "tagDisplayUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "badgeHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "spamCategoryFetcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(z3Var, "messageDetailsProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "phoneNumberHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "messageUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar2, "spamDetailsBuilder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar3, "securedMessagingTabManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar2, "searchSmartCardsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar4, "insightsStatusProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "whoSearchedForMeFeatureManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar5, "tcPermission");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar6, "messagingFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar7, "searchFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar8, "tamApiLoggingScheduler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchResultOrder, "searchResultOrder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar2, "contactAvatarXConfigProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "bizmonFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(numberFormat, "numberFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar3, "regionUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar9, "softThrottleAnalytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar10, "rcsMessageHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar11, "userGrowthFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i1Var, "searchPermissionUtil");
        this.d = coroutineContext2;
        this.e = bVar;
        this.f = sVar;
        this.g = qVar;
        this.h = nVar;
        this.i = f0Var;
        this.j = 3;
        this.k = bVar2;
        this.l = dVar;
        this.m = navigationSource;
        this.n = bazVar;
        this.o = handler;
        this.p = lVar;
        this.q = barVar;
        this.r = qVar2;
        this.s = a1Var;
        this.t = barVar2;
        this.u = dVar2;
        this.v = z;
        this.w = pVar;
        this.x = bVar3;
        this.y = kVar;
        this.z = str;
        this.A = barVar3;
        this.B = hVar;
        this.C = z3Var;
        this.D = tVar;
        this.E = bazVar2;
        this.F = kVar2;
        this.G = dVar3;
        this.H = lVar2;
        this.I = dVar4;
        this.J = barVar4;
        this.K = barVar5;
        this.L = barVar6;
        this.M = barVar7;
        this.N = barVar8;
        this.O = searchResultOrder;
        this.P = gVar2;
        this.Q = quxVar;
        this.R = numberFormat;
        this.S = gVar3;
        this.T = barVar9;
        this.U = barVar10;
        this.V = barVar11;
        this.W = i1Var;
        this.Y = new android.os.CancellationSignal();
        this.a0 = new java.util.ArrayList();
        this.b0 = new java.util.ArrayList();
        this.c0 = new java.util.ArrayList();
        this.d0 = new java.util.ArrayList();
        this.e0 = "";
        this.f0 = "";
        this.q0 = ((u03.c) bVar).p();
        com.truecaller.search.global.b bVar4 = dVar.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bVar4, "main(...)");
        this.r0 = bVar4;
        this.s0 = -1;
    }

    public static final c62.v c2(com.truecaller.search.global.h0 h0Var, c62.v vVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList(vVar.b.size());
        for (com.truecaller.data.entity.Contact contact : vVar.b) {
            nt2.h hVar = h0Var.B;
            kotlin.jvm.internal.Intrinsics.d(contact);
            hVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
            java.util.List list = (java.util.List) fg3.h0.O(kotlin.coroutines.d.a, new nh0.baz(hVar, contact, (df3.bar) null, 18));
            if (!list.isEmpty()) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "<this>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "categories");
                if (!list.isEmpty()) {
                    contact.C = list;
                }
            }
            arrayList.add(contact);
        }
        return new c62.v(vVar.c, vVar.a, java.util.Collections.unmodifiableList(arrayList));
    }

    public static final void p2(com.truecaller.search.global.h0 h0Var, com.truecaller.search.global.c1 c1Var, com.truecaller.search.global.e eVar, com.truecaller.data.entity.Contact contact, boolean z, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4 = null;
        if (z) {
            u03.f0 f0Var = h0Var.i;
            kotlin.jvm.internal.Intrinsics.e(c1Var, "null cannot be cast to non-null type com.truecaller.calling_common.TitleHighlightable");
            if (ne0.baz.m(c1Var, h0Var.k, h0Var.e0, str, str2, true)) {
                com.truecaller.contact.entity.model.AddressEntity m = contact.m();
                if (contact.Q()) {
                    if (m != null) {
                        str4 = m03.bar.b(m);
                    }
                    ((com.truecaller.search.global.n0) c1Var).q(str4);
                    return;
                } else if (eVar != null && eVar.d) {
                    ((com.truecaller.search.global.n0) c1Var).q(((u03.g0) f0Var).h(2132021616, new java.lang.Object[0]));
                    return;
                } else if (eVar != null && eVar.e) {
                    ((com.truecaller.search.global.n0) c1Var).q(((u03.g0) f0Var).h(2132021617, new java.lang.Object[0]));
                    return;
                } else {
                    if (m != null) {
                        str4 = m03.bar.b(m);
                    }
                    ((com.truecaller.search.global.n0) c1Var).q(str4);
                    return;
                }
            }
            if (eVar == null || (str3 = eVar.b) == null) {
                str3 = "";
            }
            java.lang.String str5 = str3;
            java.lang.String a = t41.i.a(str5);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "bidiFormat(...)");
            ((com.truecaller.search.global.n0) c1Var).q(a);
            ne0.baz.l(c1Var, h0Var.k, h0Var.e0, str5, a, true, true);
            return;
        }
        com.truecaller.contact.entity.model.AddressEntity m2 = contact.m();
        if (m2 != null) {
            str4 = m03.bar.b(m2);
        }
        com.truecaller.search.global.n0 n0Var = (com.truecaller.search.global.n0) c1Var;
        n0Var.q(str4);
        ne0.baz.m(n0Var, h0Var.k, h0Var.e0, str, str2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B2() {
        com.truecaller.search.global.h0 h0Var;
        java.lang.String str = this.e0;
        this.Y.cancel();
        if (str.length() == 0) {
            kotlin.collections.h0 h0Var2 = kotlin.collections.h0.a;
            if (this.a == null) {
                h0Var = this;
            } else {
                fg3.k2 k2Var = this.t0;
                if (k2Var != null) {
                    k2Var.cancel((java.util.concurrent.CancellationException) null);
                }
                h0Var = this;
                h0Var.t0 = fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ag2.k(false, h0Var, h0Var2, (df3.bar) null, 7), 3);
            }
        } else {
            h0Var = this;
            ah.n nVar = h0Var.h;
            nVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "filter");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "callback");
            android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
            fg3.h0.J(fg3.f1.a, (kotlin.coroutines.CoroutineContext) nVar.e, (fg3.f0) null, new ji1.b(str, nVar, cancellationSignal, h0Var, (df3.bar) null, 27), 2);
            h0Var.Y = cancellationSignal;
        }
        z2(h0Var.e0);
        C2(h0Var.e0);
    }

    public final void C2(java.lang.String str) {
        if (str.length() == 0) {
            o2(kotlin.collections.h0.a);
        } else {
            if (this.n0) {
                this.o0 = true;
                return;
            }
            this.n0 = true;
            fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.search.global.g0(this, str, null, 1), 3);
        }
    }

    public final void D2() {
        if (((qo1.k) this.L.get()).e()) {
            com.truecaller.search.global.d dVar = this.l;
            dVar.a().g = !g2();
            dVar.a().h = false;
            dVar.a().e = false;
            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = this.X;
            if (globalSearchResultActivity != null) {
                globalSearchResultActivity.A0(!g2());
            }
            r2(kotlin.collections.h0.a);
            F2(this.e0);
            B2();
            return;
        }
        B2();
        y2(1000L, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E2(com.truecaller.data.country.CountryListDto.bar barVar, boolean z) {
        java.lang.String str;
        if (this.a != null) {
            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = this.X;
            if (globalSearchResultActivity == null) {
                return;
            }
            if (z) {
                barVar = t41.f.a(((m03.m) this.p).a);
            }
            this.g0 = barVar;
            if (barVar != null) {
                str = barVar.c;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            java.lang.String upperCase = str.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            globalSearchResultActivity.w0.setText(upperCase);
            return;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    public final void F2(java.lang.String str) {
        com.truecaller.search.global.b a;
        this.D.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
        boolean d = t41.i0.d(str);
        boolean e = ((qo1.k) this.L.get()).e();
        com.truecaller.search.global.SearchResultOrder searchResultOrder = this.O;
        if (e) {
            if (d) {
                searchResultOrder = com.truecaller.search.global.SearchResultOrder.ORDER_TCMG;
            }
        } else if (d) {
            searchResultOrder = com.truecaller.search.global.SearchResultOrder.ORDER_CTGM;
        }
        com.truecaller.search.global.d dVar = this.l;
        dVar.g = searchResultOrder;
        com.truecaller.search.global.s0 s0Var = dVar.b;
        com.truecaller.search.global.x0 x0Var = dVar.c;
        com.truecaller.search.global.f fVar = dVar.a;
        int i = com.truecaller.search.global.c.a[searchResultOrder.ordinal()];
        if (i != 4 && i != 5) {
            if (i != 6) {
                if (i != 7) {
                    a = fVar;
                } else {
                    a = x0Var;
                }
            } else {
                a = s0Var;
            }
        } else {
            a = dVar.a();
        }
        dVar.h = a;
        fVar.f = null;
        x0Var.f = null;
        s0Var.f = null;
        dVar.d.f = null;
        dVar.f.f = null;
        dVar.e.f = null;
        com.truecaller.log.AssertionUtil.isNotNull(a, new java.lang.String[]{"Main Adapter is not assigned."});
        dVar.h.f = null;
        dVar.b();
        com.truecaller.search.global.b bVar = dVar.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bVar, "main(...)");
        this.r0 = bVar;
    }

    public final long H0(int i) {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y0(int i, java.lang.Exception exc) {
        e62.c cVar;
        com.truecaller.search.global.i0 i0Var;
        java.lang.Object obj = this.a;
        com.truecaller.search.global.d dVar = this.l;
        if (obj != null && this.k0 != null && exc != null) {
            java.lang.String str = null;
            this.h0 = null;
            dVar.a().h = false;
            u2(false);
            boolean z = exc instanceof e62.c;
            this.u0 = z;
            if (z) {
                cVar = (e62.c) exc;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                str = cVar.b;
            }
            if (str != null && (i0Var = (com.truecaller.search.global.i0) this.a) != null) {
                com.truecaller.search.global.m mVar = (com.truecaller.search.global.m) i0Var;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "token");
                if (cp1.bar.v(mVar) || !mVar.getChildFragmentManager().R()) {
                    mVar.getChildFragmentManager().h0("cancel_unlock_action", mVar, new com.truecaller.search.global.g(mVar, 3));
                    mVar.getChildFragmentManager().h0("request_unlock_action", mVar, new com.truecaller.search.global.g(mVar, 4));
                    androidx.fragment.app.g1 childFragmentManager = mVar.getChildFragmentManager();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childFragmentManager, "fragmentManager");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "token");
                    com.truecaller.search.global.q0 q0Var = new com.truecaller.search.global.q0();
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("softThrottleToken", str);
                    q0Var.setArguments(bundle);
                    q0Var.show(childFragmentManager, com.truecaller.search.global.q0.class.getSimpleName());
                    return;
                }
                return;
            }
            return;
        }
        if (obj != null) {
            dVar.a().h = false;
            u2(false);
            r2(kotlin.collections.h0.a);
        }
    }

    public final void a(java.lang.Object obj, int i) {
        com.truecaller.search.global.e1 e1Var = (com.truecaller.search.global.e1) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e1Var, "presenterView");
        this.r0.a(e1Var, i);
    }

    public final com.truecaller.data.entity.Contact d2(int i, int i2) {
        if (i2 < 0) {
            com.truecaller.search.global.d dVar = this.l;
            com.truecaller.log.AssertionUtil.shouldNeverHappen(new java.lang.IllegalStateException("Adapter position was -1 nesting order: " + dVar.g + " showing all results ? " + this.Z + " main adapter: " + dVar.h.getClass().getSimpleName()), new java.lang.String[0]);
            return null;
        }
        if (i == 2131364282) {
            return ((com.truecaller.search.global.e) this.a0.get(this.r0.e(i2))).a;
        }
        if (i != 2131364291) {
            return null;
        }
        return (com.truecaller.data.entity.Contact) this.d0.get(this.r0.e(i2));
    }

    public final boolean e2() {
        if (((qo1.v) this.V.get()).b()) {
            return this.W.c.a();
        }
        return ((qw2.b0) ((qw2.a0) this.K.get())).o();
    }

    public final boolean f2() {
        if (!g2()) {
            if (((qo1.k) this.L.get()).e() || this.e0.length() >= 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g2() {
        r03.d dVar = this.u;
        dVar.getClass();
        if (!(dVar instanceof r03.baz)) {
            if (((qo1.r) this.M.get()).b.a("featureDisableNameSearch", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                java.lang.String str = this.e0;
                this.D.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
                boolean d = t41.i0.d(str);
                if (this.S.f("tr") && !d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h2() {
        com.truecaller.log.AssertionUtil.isNotNull(this.a, new java.lang.String[0]);
        com.truecaller.log.AssertionUtil.isNotNull(this.X, new java.lang.String[0]);
        if (this.Z) {
            com.truecaller.search.global.d dVar = this.l;
            com.truecaller.search.global.b bVar = dVar.h;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bVar, "main(...)");
            this.r0 = bVar;
            com.truecaller.search.global.f fVar = dVar.a;
            int i = this.j;
            fVar.t(i);
            dVar.b.t(i);
            dVar.c.t(i);
            dVar.a().t(i);
            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = this.X;
            if (globalSearchResultActivity != null) {
                globalSearchResultActivity.z0(true);
            }
            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity2 = this.X;
            if (globalSearchResultActivity2 != null) {
                globalSearchResultActivity2.y0(false);
            }
            com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) this.a;
            if (i0Var != null) {
                androidx.recyclerview.widget.RecyclerView recyclerView = ((com.truecaller.search.global.m) i0Var).k;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(0);
                } else {
                    kotlin.jvm.internal.Intrinsics.n("mRecyclerView");
                    throw null;
                }
            }
            com.truecaller.search.global.i0 i0Var2 = (com.truecaller.search.global.i0) this.a;
            if (i0Var2 != null) {
                ((com.truecaller.search.global.m) i0Var2).c6();
            }
            this.Z = false;
            return;
        }
        com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity3 = this.X;
        if (globalSearchResultActivity3 != null && globalSearchResultActivity3.t0.getVisibility() == 0) {
            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity4 = this.X;
            if (globalSearchResultActivity4 != null) {
                globalSearchResultActivity4.x0();
            }
            com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity5 = this.X;
            if (globalSearchResultActivity5 != null) {
                globalSearchResultActivity5.w0();
            }
            com.truecaller.search.global.i0 i0Var3 = (com.truecaller.search.global.i0) this.a;
            if (i0Var3 != null) {
                ((com.truecaller.search.global.m) i0Var3).finish();
                return;
            }
            return;
        }
        w2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j2(com.truecaller.search.global.b1 b1Var, java.lang.String str, com.truecaller.messaging.data.types.Message message, boolean z, com.truecaller.search.global.b0 b0Var) {
        java.lang.String str2;
        android.widget.TextView textView;
        int i = this.s0;
        if (i == -1) {
            boolean M = a.bar.M(message);
            com.truecaller.search.global.c0 c0Var = new com.truecaller.search.global.c0(0, this, b0Var, str, b1Var, z);
            com.truecaller.search.global.n0 n0Var = (com.truecaller.search.global.n0) b1Var;
            n0Var.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0Var, "callback");
            if (str != null && M) {
                com.truecaller.common.ui.listitem.ListItemX listItemX = n0Var.d;
                java.util.List list = p12.b.a;
                com.truecaller.common.ui.listitem.ListItemX.K(listItemX, p12.b.c(n0Var.f, str, com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter.DelimiterVisibility.REMOVE), (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, 0, 0, false, (java.lang.Integer) null, (java.util.List) null, 4094);
            } else {
                com.truecaller.common.ui.listitem.ListItemX listItemX2 = n0Var.d;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                com.truecaller.common.ui.listitem.ListItemX.K(listItemX2, str2, (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (com.truecaller.common.ui.listitem.ListItemX.SubtitleColor) null, 0, 0, false, (java.lang.Integer) null, (java.util.List) null, 4094);
            }
            if (str != null && str.length() != 0 && (textView = (android.widget.TextView) n0Var.d.findViewById(2131366692)) != null) {
                textView.post(new com.amazon.aps.ads.util.adview.baz(21, textView, c0Var));
                return;
            }
            return;
        }
        kotlin.Pair n = pe0.j.n(i, this.e0, str, z);
        if (b0Var != null) {
            b0Var.invoke(java.lang.Integer.valueOf(this.s0));
        }
        ((com.truecaller.search.global.n0) b1Var).r((java.lang.String) n.a, (java.util.List) n.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k2(boolean z) {
        if (z) {
            this.N.f();
            com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) this.a;
            if (i0Var != null) {
                ((com.truecaller.search.global.m) i0Var).finish();
                return;
            }
            return;
        }
        com.truecaller.search.global.i0 i0Var2 = (com.truecaller.search.global.i0) this.a;
        if (i0Var2 != null) {
            com.truecaller.search.global.m mVar = (com.truecaller.search.global.m) i0Var2;
            android.content.Intent data = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(android.net.Uri.fromParts("package", mVar.requireContext().getPackageName(), null));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
            mVar.startActivity(data);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l2(java.lang.String str) {
        java.lang.String trim;
        com.truecaller.log.AssertionUtil.isNotNull(this.a, new java.lang.String[0]);
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trim, "trimToEmpty(...)");
        this.e0 = trim;
        if (trim.length() == 0) {
            w2();
        } else {
            com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) this.a;
            if (i0Var != null) {
                androidx.recyclerview.widget.RecyclerView recyclerView = ((com.truecaller.search.global.m) i0Var).k;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                } else {
                    kotlin.jvm.internal.Intrinsics.n("mRecyclerView");
                    throw null;
                }
            }
            com.truecaller.search.global.i0 i0Var2 = (com.truecaller.search.global.i0) this.a;
            if (i0Var2 != null) {
                ((com.truecaller.search.global.m) i0Var2).a6(false);
            }
        }
        D2();
    }

    public final void m1() {
        super.m1();
        c62.p pVar = this.k0;
        if (pVar != null) {
            pVar.cancel(true);
            this.k0 = null;
        }
        kp2.bar barVar = this.t;
        for (java.lang.String str : barVar.e) {
            barVar.a.l(barVar.b.i("SEARCHRESULTS", str), barVar);
        }
        java.util.Collection values = barVar.d.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            ((u90.a) it.next()).destroy();
        }
        barVar.f = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m2(com.truecaller.data.entity.Contact contact, com.truecaller.analytics.common.event.ViewActionEvent.DetailsSubAction detailsSubAction) {
        com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity;
        boolean z;
        com.truecaller.analytics.common.event.ViewActionEvent.DetailsSubAction detailsSubAction2;
        if (contact != null && this.a != null && (globalSearchResultActivity = this.X) != null) {
            if (detailsSubAction == com.truecaller.analytics.common.event.ViewActionEvent.DetailsSubAction.TRUECALLER) {
                z = true;
            } else {
                z = false;
            }
            globalSearchResultActivity.w0();
            if (contact.n0()) {
                com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) this.a;
                if (i0Var != null) {
                    com.truecaller.search.global.m mVar = (com.truecaller.search.global.m) i0Var;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
                    androidx.fragment.app.FragmentActivity requireActivity = mVar.requireActivity();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    nd1.bar barVar = mVar.r;
                    if (barVar != null) {
                        android.content.Context requireContext = mVar.requireContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        android.content.Intent a = barVar.a(requireContext, new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Extras(androidx.glance.appwidget.protobuf.d1.t(contact), com.truecaller.detailsview.api.model.DetailsViewSource.SearchResult, (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.HistoryEventData) null, 0, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action.SaveToHistory.INSTANCE, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                        e70.k kVar = mVar.q;
                        if (kVar != null) {
                            kVar.e(requireActivity, "SearchResult", contact.Q(), contact.J(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_TPAT_KEY_VALUE), new bf1.a(requireActivity, a, 1));
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("adInterstitialManager");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewIntentBuilder");
                        throw null;
                    }
                }
            } else {
                com.truecaller.search.global.i0 i0Var2 = (com.truecaller.search.global.i0) this.a;
                if (i0Var2 != null) {
                    com.truecaller.search.global.m mVar2 = (com.truecaller.search.global.m) i0Var2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
                    androidx.fragment.app.FragmentActivity requireActivity2 = mVar2.requireActivity();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                    nd1.bar barVar2 = mVar2.r;
                    if (barVar2 != null) {
                        android.content.Context requireContext2 = mVar2.requireContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                        android.content.Intent a2 = barVar2.a(requireContext2, new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Extras(androidx.glance.appwidget.protobuf.d1.t(contact), com.truecaller.detailsview.api.model.DetailsViewSource.SearchResult, (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.HistoryEventData) null, 0, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action.SaveToHistory.INSTANCE, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                        e70.k kVar2 = mVar2.q;
                        if (kVar2 != null) {
                            kVar2.e(requireActivity2, "SearchResult", contact.Q(), contact.J(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_TPAT_KEY_VALUE), new bf1.a(requireActivity2, a2, 2));
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("adInterstitialManager");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewIntentBuilder");
                        throw null;
                    }
                }
            }
            if (contact.k0 == 2) {
                detailsSubAction2 = com.truecaller.analytics.common.event.ViewActionEvent.DetailsSubAction.CLOUD_CONTACT;
            } else {
                detailsSubAction2 = detailsSubAction;
            }
            nc0.a aVar = this.q;
            if (z && !u03.e0.D(-1, this.e0)) {
                com.truecaller.analytics.common.event.ViewActionEvent.DetailsSubAction detailsSubAction3 = com.truecaller.analytics.common.event.ViewActionEvent.DetailsSubAction.NAME_CLICKED;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("searchResults", "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsSubAction3, "subAction");
                aVar.d(uf.qux.p("details", "action", "details", detailsSubAction3.getValue(), "searchResults"));
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("searchResults", "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsSubAction2, "subAction");
            aVar.d(uf.qux.p("details", "action", "details", detailsSubAction2.getValue(), "searchResults"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n2(java.util.List list) {
        if (this.a != null) {
            java.util.ArrayList arrayList = this.b0;
            arrayList.clear();
            if (!list.isEmpty() && this.p0) {
                list = kotlin.collections.x.c(kotlin.collections.CollectionsKt.V(list));
            }
            arrayList.addAll(list);
            this.l.b.r(arrayList.size());
            com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) this.a;
            if (i0Var != null) {
                ((com.truecaller.search.global.m) i0Var).c6();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o2(java.util.List list) {
        if (this.a != null) {
            java.util.ArrayList arrayList = this.c0;
            arrayList.clear();
            if (!list.isEmpty() && this.p0) {
                list = kotlin.collections.x.c(kotlin.collections.CollectionsKt.V(list));
            }
            arrayList.addAll(list);
            this.l.c.r(arrayList.size());
            com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) this.a;
            if (i0Var != null) {
                ((com.truecaller.search.global.m) i0Var).c6();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        if (vf2.bar.k(r1, r7) == false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResult(java.util.List list) {
        com.truecaller.data.entity.Contact contact;
        java.lang.Object obj;
        java.lang.String d;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "contacts");
        if (this.a != null || this.k0 == null) {
            if (this.u0) {
                com.truecaller.data.entity.Contact contact2 = (com.truecaller.data.entity.Contact) kotlin.collections.CollectionsKt.firstOrNull(list);
                if (contact2 != null && m03.r.q(contact2)) {
                    z = true;
                } else {
                    z = false;
                }
                ((d62.bar) this.T.get()).b("globalSearch", z);
            }
            this.u0 = false;
            java.lang.String str = this.e0;
            vf2.bar barVar = this.J;
            barVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "searchToken");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "contacts");
            kotlin.Pair pair = null;
            if (barVar.h() && (!barVar.i() || !barVar.c())) {
                if (!vf2.bar.k(str, barVar.f())) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        java.lang.String b = barVar.b((com.truecaller.data.entity.Contact) it.next());
                        if (b != null) {
                            arrayList.add(b);
                        }
                    }
                }
                java.util.Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj = it3.next();
                        com.truecaller.data.entity.Contact contact3 = (com.truecaller.data.entity.Contact) obj;
                        if (contact3.o() != null) {
                            java.lang.String d2 = barVar.d(str, barVar.b(contact3));
                            java.lang.String o = contact3.o();
                            kotlin.jvm.internal.Intrinsics.d(o);
                            if (t41.i0.a(d2, o, false)) {
                                break;
                            }
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                com.truecaller.data.entity.Contact contact4 = (com.truecaller.data.entity.Contact) obj;
                if (contact4 != null && (d = barVar.d(str, barVar.b(contact4))) != null && (!d.equals(barVar.l) || !kotlin.jvm.internal.Intrinsics.b(barVar.m, java.lang.Boolean.valueOf(contact4.Q())))) {
                    pair = new kotlin.Pair(contact4, d);
                }
            }
            if (pair != null) {
                java.lang.Object obj2 = pair.a;
                java.lang.Object obj3 = pair.b;
                com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) this.a;
                if (i0Var != null) {
                    ((com.truecaller.search.global.m) i0Var).Z5((java.lang.String) obj3, java.lang.Boolean.valueOf(((com.truecaller.data.entity.Contact) obj2).Q()));
                }
                java.lang.String str2 = (java.lang.String) obj3;
                com.truecaller.data.entity.Contact contact5 = (com.truecaller.data.entity.Contact) obj2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "searchToken");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact5, "matchedContact");
                barVar.l = barVar.d(str2, barVar.b(contact5));
                barVar.m = java.lang.Boolean.valueOf(contact5.Q());
            }
            this.l.a().h = false;
            u2(false);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list);
            xz1.r rVar = this.r;
            rVar.e0("counterFacebookInvite", rVar.D("counterFacebookInvite", 0L) + 1);
            r2(arrayList2);
            if (((qo1.k) this.L.get()).e() && list.size() == 1 && (contact = (com.truecaller.data.entity.Contact) list.get(0)) != null && !contact.U()) {
                m2((com.truecaller.data.entity.Contact) list.get(0), com.truecaller.analytics.common.event.ViewActionEvent.DetailsSubAction.TRUECALLER);
            }
        }
    }

    public final void q2(com.truecaller.search.global.c1 c1Var, com.truecaller.search.global.e eVar, com.truecaller.data.entity.Contact contact, boolean z, boolean z2, boolean z3) {
        boolean z4;
        com.truecaller.blocking.FilterMatch filterMatch;
        int i;
        java.lang.String str;
        nt2.j jVar;
        com.truecaller.search.global.h0 h0Var = this;
        com.truecaller.data.entity.Contact contact2 = contact;
        boolean z5 = false;
        if (eVar != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        java.lang.String t = contact2.t();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(t, "getDisplayNameOrNumber(...)");
        java.lang.String a = t41.i.a(t);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "bidiFormat(...)");
        kw2.bar a2 = h0Var.y.a(contact2);
        com.truecaller.search.global.n0 n0Var = (com.truecaller.search.global.n0) c1Var;
        n0Var.u(a);
        com.truecaller.common.ui.listitem.ListItemX listItemX = n0Var.d;
        fg0.baz bazVar = h0Var.A;
        if (bazVar.e(contact2)) {
            listItemX.T();
        } else {
            listItemX.S(bazVar.b(contact2));
        }
        java.lang.String str2 = null;
        com.truecaller.common.ui.listitem.ListItemX.M(listItemX, (android.graphics.drawable.Drawable) null);
        if (z) {
            if (eVar != null) {
                filterMatch = eVar.c;
            } else {
                filterMatch = null;
            }
            if (filterMatch != null) {
                i = filterMatch.g;
            } else {
                i = 0;
            }
            int max = java.lang.Math.max(i, contact2.A);
            mk.e eVar2 = h0Var.F.a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact2, "contact");
            if (contact2.J(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_TPAT_KEY_VALUE) && contact2.X()) {
                jVar = new nt2.j(eVar2.b((java.lang.String) null, max, 2132017225, true), null);
            } else {
                com.truecaller.data.entity.SpamCategoryModel O = yp.k.O(contact2);
                if (O != null) {
                    str = O.getLabel();
                } else {
                    str = null;
                }
                jVar = new nt2.j(eVar2.b(str, max, 2132017225, true), O);
            }
            n0Var.s(jVar.a, null, jVar.b);
        } else if (a2 != null) {
            p2(h0Var, n0Var, eVar, contact2, z4, t, a);
            n0Var.t(a2);
            h0Var = this;
            contact2 = contact;
        } else {
            p2(h0Var, n0Var, eVar, contact2, z4, t, a);
        }
        if (((qo1.r) h0Var.M.get()).e()) {
            n0Var.n(com.truecaller.common.ui.avatar.AvatarXConfig.a(h0Var.P.a(contact2), (android.net.Uri) null, (java.lang.String) null, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, Integer.MAX_VALUE));
        } else {
            if (z || z2) {
                z5 = true;
            }
            n0Var.n(com.truecaller.common.ui.avatar.AvatarXConfig.a(gf0.e.q(contact2, z5, z3, 22), (android.net.Uri) null, (java.lang.String) null, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, Integer.MAX_VALUE));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact2, "<this>");
        com.truecaller.data.entity.Number r = contact2.r();
        if (r != null) {
            str2 = r.f;
        }
        ((hg2.b) n0Var.h.getValue()).d2(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r2(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "results");
        if (this.a != null) {
            java.util.ArrayList arrayList = this.d0;
            arrayList.clear();
            arrayList.addAll(list);
            this.l.d.r(arrayList.size());
            com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) this.a;
            if (i0Var != null) {
                ((com.truecaller.search.global.m) i0Var).c6();
            }
        }
    }

    public final int s0(int i) {
        return this.r0.h(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(java.lang.Object obj) {
        java.lang.String str;
        boolean z;
        com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i0Var, "presenterView");
        this.a = i0Var;
        com.truecaller.search.global.d dVar = this.l;
        dVar.a.d = this;
        dVar.c.d = this;
        dVar.b.d = this;
        dVar.d.d = this;
        dVar.f.d = this;
        com.truecaller.analytics.AppEvents.GlobalSearch.NavigationSource navigationSource = this.m;
        if (navigationSource == null) {
            navigationSource = com.truecaller.analytics.AppEvents.GlobalSearch.NavigationSource.UNKNOWN;
        }
        switch (qc0.bar.b[navigationSource.ordinal()]) {
            case 1:
                str = "callTab_recents";
                break;
            case 2:
                str = "messages";
                break;
            case 3:
                str = "blocking";
                break;
            case 4:
                str = "FamilyProtectionTab";
                break;
            case 5:
                str = "premium";
                break;
            case 6:
                str = "assistant";
                break;
            case 7:
                str = "voicemail";
                break;
            case 8:
                str = "invite";
                break;
            case 9:
                str = "ScamFeed";
                break;
            case 10:
                str = "numberScanManual";
                break;
            case 11:
                str = "numberScanAutomatic";
                break;
            case 12:
                str = "copiedNumberPopup";
                break;
            case 13:
                str = "dialerClipboardSearch";
                break;
            case 14:
                str = "dialerSearchMore";
                break;
            case 15:
                str = "contactRequestNotification";
                break;
            case 16:
                str = "contactRequest";
                break;
            case 17:
                str = "searchNotification";
                break;
            case 18:
                str = "widget";
                break;
            case 19:
                str = "actionProcessText";
                break;
            case 20:
                str = "unknown";
                break;
            default:
                throw new java.lang.RuntimeException(null, null);
        }
        bd.bar.u(this.q, "globalSearch", str);
        kp2.bar barVar = this.t;
        barVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "adsHelperListener");
        barVar.f = this;
        boolean hasSystemFeature = ((u03.c) this.e).a.getPackageManager().hasSystemFeature("android.hardware.camera");
        com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = this.X;
        if (globalSearchResultActivity != null) {
            if (hasSystemFeature && this.v) {
                z = true;
            } else {
                z = false;
            }
            globalSearchResultActivity.C0 = z;
            m03.v.j(globalSearchResultActivity.z0, z, true);
        }
        java.lang.String str2 = this.z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "adId");
        barVar.a.k(barVar.b.i("SEARCHRESULTS", str2), barVar, (java.lang.String) null);
        barVar.e.add(str2);
        h40.n nVar = barVar.c;
        if (((qo1.bar) nVar.e.get()).b.a("featurePrefetchDvAdOnGlobalSearch", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
            nVar.a("dvPrefetchGlobalSearch", (o00.bar) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u2(boolean z) {
        if (this.Z || (this.e0.length() > 2 && this.d0.isEmpty())) {
            this.l.a().e = z;
            com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) this.a;
            if (i0Var != null) {
                ((com.truecaller.search.global.m) i0Var).c6();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v2(int i) {
        com.truecaller.log.AssertionUtil.isNotNull(this.a, new java.lang.String[0]);
        com.truecaller.log.AssertionUtil.isNotNull(this.X, new java.lang.String[0]);
        this.Z = true;
        com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = this.X;
        if (globalSearchResultActivity != null) {
            globalSearchResultActivity.w0();
            globalSearchResultActivity.y0(true);
            globalSearchResultActivity.z0(false);
            java.lang.Object[] objArr = {this.e0};
            u03.g0 g0Var = (u03.g0) this.i;
            globalSearchResultActivity.r0.setText(g0Var.h(2132021615, objArr));
            globalSearchResultActivity.s0.setText(g0Var.h(2132021614, g0Var.h(i, new java.lang.Object[0])));
        }
        com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) this.a;
        if (i0Var != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = ((com.truecaller.search.global.m) i0Var).k;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(0);
            } else {
                kotlin.jvm.internal.Intrinsics.n("mRecyclerView");
                throw null;
            }
        }
        com.truecaller.search.global.i0 i0Var2 = (com.truecaller.search.global.i0) this.a;
        if (i0Var2 != null) {
            ((com.truecaller.search.global.m) i0Var2).c6();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w2() {
        com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) this.a;
        if (i0Var != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = ((com.truecaller.search.global.m) i0Var).k;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            } else {
                kotlin.jvm.internal.Intrinsics.n("mRecyclerView");
                throw null;
            }
        }
        com.truecaller.search.global.i0 i0Var2 = (com.truecaller.search.global.i0) this.a;
        if (i0Var2 != null) {
            ((com.truecaller.search.global.m) i0Var2).a6(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x2(boolean z) {
        boolean z2;
        if (this.a != null) {
            qc3.bar barVar = this.L;
            boolean e = ((qo1.k) barVar.get()).e();
            com.truecaller.search.global.d dVar = this.l;
            if (!e) {
                if (kotlin.jvm.internal.Intrinsics.b(this.h0, this.e0) && kotlin.jvm.internal.Intrinsics.b(this.i0, this.f0) && kotlin.jvm.internal.Intrinsics.b(this.j0, this.g0)) {
                    com.truecaller.search.global.b bVar = dVar.h;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bVar, "main(...)");
                    this.r0 = bVar;
                    dVar.d.r(this.d0.size());
                    com.truecaller.search.global.i0 i0Var = (com.truecaller.search.global.i0) this.a;
                    if (i0Var != null) {
                        ((com.truecaller.search.global.m) i0Var).c6();
                        return;
                    }
                    return;
                }
                this.h0 = this.e0;
                this.i0 = this.f0;
                this.j0 = this.g0;
            }
            if (!((qo1.k) barVar.get()).e()) {
                boolean g = this.D.g(this.e0);
                java.lang.String str = this.e0;
                java.util.Set set = u03.e0.e;
                if (str != null && str.length() >= 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z) {
                    if (!z2 || !g) {
                        z2 = false;
                    }
                }
                F2(this.e0);
                java.lang.String str2 = null;
                if (!z2) {
                    java.util.UUID randomUUID = java.util.UUID.randomUUID();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
                    c62.o c = this.g.c(randomUUID, "globalSearch");
                    c.t = true;
                    c.u = false;
                    c.y = this.e0;
                    c.x = 4;
                    c.A = this.f0;
                    com.truecaller.data.country.CountryListDto.bar barVar2 = this.g0;
                    if (barVar2 != null) {
                        str2 = barVar2.c;
                    }
                    c.e(str2);
                    c.w = new com.truecaller.search.global.f0(this);
                    c62.p pVar = new c62.p(true, true, this, c);
                    pVar.executeOnExecutor(y62.bar.a, new java.lang.Void[0]);
                    this.k0 = pVar;
                    dVar.a().g = false;
                    com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = this.X;
                    if (globalSearchResultActivity != null) {
                        globalSearchResultActivity.A0(!g2());
                    }
                    u2(true);
                    return;
                }
                dVar.a().g = !g2();
                dVar.a().h = false;
                dVar.a().e = false;
                com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity2 = this.X;
                if (globalSearchResultActivity2 != null) {
                    globalSearchResultActivity2.A0(!g2());
                }
                r2(kotlin.collections.h0.a);
                this.h0 = null;
                return;
            }
            z2 = true;
            F2(this.e0);
            java.lang.String str22 = null;
            if (!z2) {
            }
        }
    }

    public final void y2(long j, boolean z) {
        com.truecaller.data.country.CountryListDto.bar barVar;
        if (!((qo1.r) this.M.get()).g()) {
            if (this.e0.length() == 0) {
                barVar = null;
            } else if (!z) {
                java.lang.String str = this.e0;
                ((m03.m) this.p).getClass();
                barVar = ((com.truecaller.data.country.g) t41.f.a.getValue()).b(str);
                if (barVar == null) {
                    barVar = this.g0;
                }
            } else {
                barVar = this.g0;
            }
            E2(barVar, false);
        }
        r03.d dVar = this.u;
        dVar.getClass();
        if (!(dVar instanceof r03.baz)) {
            c62.p pVar = this.k0;
            if (pVar != null) {
                pVar.cancel(true);
                this.k0 = null;
            }
            if (this.f.b()) {
                this.o.postDelayed(new ao.qux(this, z, 1), j);
            }
        }
    }

    public final int z0() {
        return this.r0.g();
    }

    public final void z2(java.lang.String str) {
        if (str.length() == 0) {
            n2(kotlin.collections.h0.a);
        } else {
            if (this.l0) {
                this.m0 = true;
                return;
            }
            this.l0 = true;
            fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.search.global.g0(this, str, null, 0), 3);
        }
    }
}
