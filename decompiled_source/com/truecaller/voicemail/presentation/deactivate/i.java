package com.truecaller.voicemail.presentation.deactivate;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class i implements nf3.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    private final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        boolean z2;
        int i;
        nm1.u0 u0Var = (nm1.v0) this.c;
        gm1.a aVar = (gm1.a) this.d;
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this.e;
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) this.b;
        m1.o1 o1Var = (m1.o1) obj;
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        j3.g gVar = j3.qux.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o1Var, "innerPadding");
        if ((intValue & 6) == 0) {
            if (nVar.f(o1Var)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(intValue & 1, z)) {
            if (kotlin.jvm.internal.Intrinsics.b(u0Var, nm1.t0.a)) {
                nVar.Z(-1706681986);
                j3.q d = m1.c2.d(m1.c.F(u51.e.d(3, (java.lang.String) null), o1Var), 1.0f);
                h4.a1 d2 = m1.n.d(gVar, false);
                long j = nVar.T;
                int i2 = (int) (j ^ (j >>> 32));
                v2.e1 l = nVar.l();
                j3.q c = j3.bar.c(d, nVar);
                j4.e.K9.getClass();
                j4.c cVar = j4.d.b;
                nVar.d0();
                if (nVar.S) {
                    nVar.k(cVar);
                } else {
                    nVar.n0();
                }
                v2.f.A(d2, j4.d.g, nVar);
                v2.f.A(l, j4.d.f, nVar);
                v2.f.t(nVar, java.lang.Integer.valueOf(i2), j4.d.j);
                v2.f.x(j4.d.k, nVar);
                v2.f.A(c, j4.d.d, nVar);
                r2.d5.a(m1.c2.o(u51.e.d(3, (java.lang.String) null), 48), q3.r.e, 0.0f, 0L, 0, 0.0f, nVar, 48, 60);
                nVar.p(true);
                nVar.p(false);
            } else if (kotlin.jvm.internal.Intrinsics.b(u0Var, nm1.t0.b)) {
                nVar.Z(-1706188435);
                if (aVar instanceof gm1.baz) {
                    nVar.Z(-1706087964);
                    j3.q d3 = m1.c2.d(m1.c.F(u51.e.d(3, (java.lang.String) null), o1Var), 1.0f);
                    h4.a1 d4 = m1.n.d(gVar, false);
                    long j2 = nVar.T;
                    int i3 = (int) (j2 ^ (j2 >>> 32));
                    v2.e1 l2 = nVar.l();
                    j3.q c2 = j3.bar.c(d3, nVar);
                    j4.e.K9.getClass();
                    j4.c cVar2 = j4.d.b;
                    nVar.d0();
                    if (nVar.S) {
                        nVar.k(cVar2);
                    } else {
                        nVar.n0();
                    }
                    v2.f.A(d4, j4.d.g, nVar);
                    v2.f.A(l2, j4.d.f, nVar);
                    v2.f.t(nVar, java.lang.Integer.valueOf(i3), j4.d.j);
                    v2.f.x(j4.d.k, nVar);
                    v2.f.A(c2, j4.d.d, nVar);
                    z2 = false;
                    j51.b.q.E("family_protection_invitation_error", (j3.q) null, qk.b1.u(2132021052, nVar), ((i51.a) nVar.j(i51.bar.a)).e, q3.r.e, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar, 24582, 0, 4066);
                    nVar = nVar;
                    nVar.p(true);
                } else {
                    z2 = false;
                    nVar.Z(-1711583086);
                }
                nVar.p(z2);
                nVar.p(z2);
            } else if (u0Var instanceof nm1.u0) {
                nVar.Z(-1705365819);
                nm1.g.a(o1Var, u0Var.a, aVar, function0, function02, nVar, intValue & 14);
                nVar.p(false);
            } else {
                throw ro0.f.G(1746060327, nVar, false);
            }
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object b(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        int i;
        wb.bar barVar = (wb.bar) this.c;
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) this.d;
        kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) this.e;
        kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) this.b;
        m1.o1 o1Var = (m1.o1) obj;
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o1Var, "innerPadding");
        if ((intValue & 6) == 0) {
            if (nVar.f(o1Var)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(intValue & 1, z)) {
            j3.q F = m1.c.F(u51.e.d(3, (java.lang.String) null), o1Var);
            h4.a1 d = m1.n.d(j3.qux.e, false);
            long j = nVar.T;
            int i2 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c = j3.bar.c(F, nVar);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar);
            } else {
                nVar.n0();
            }
            v2.f.A(d, j4.d.g, nVar);
            v2.f.A(l, j4.d.f, nVar);
            v2.f.t(nVar, java.lang.Integer.valueOf(i2), j4.d.j);
            v2.f.x(j4.d.k, nVar);
            v2.f.A(c, j4.d.d, nVar);
            vb.j0 j0Var = barVar.e().a;
            if (j0Var instanceof vb.h0) {
                nVar.Z(-1105613959);
                ps2.bar.f(null, nVar, 0);
                nVar.p(false);
            } else if (j0Var instanceof vb.g0) {
                nVar.Z(-1105517766);
                function2.invoke(com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewId.MANAGE_COMMENTS_ERROR_STATE, "ManageCommentsList");
                ps2.bar.e(null, nVar, 0);
                nVar.p(false);
            } else {
                nVar.Z(-1105299526);
                if (barVar.c() == 0) {
                    nVar.Z(-1105257490);
                    function2.invoke(com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewId.MANAGE_COMMENTS_EMPTY_STATE, "ManageCommentsList");
                    ps2.bar.d(null, nVar, 0);
                    nVar.p(false);
                } else {
                    nVar.Z(-1105055990);
                    ps2.bar.b(barVar, function22, function2, function23, nVar, 8);
                    nVar.p(false);
                }
                nVar.p(false);
            }
            nVar.p(true);
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object c(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        a9.qux quxVar;
        v2.c cVar;
        j51.i iVar = (j51.i) this.c;
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this.e;
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) this.d;
        ih1.j jVar = (ih1.j) this.b;
        v2.n nVar = (v2.n) obj2;
        ((java.lang.Integer) obj3).getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((rb.n) obj, "it");
        nVar.a0(1890788296);
        androidx.lifecycle.n a = b9.bar.a(nVar);
        if (a != null) {
            xc3.c t = com.bumptech.glide.qux.t(a, nVar);
            nVar.a0(1729797275);
            if (a instanceof androidx.lifecycle.n) {
                quxVar = a.getDefaultViewModelCreationExtras();
            } else {
                quxVar = a9.bar.b;
            }
            qm1.j K = df0.qux.K(qm1.j.class, a, (java.lang.String) null, t, quxVar, nVar);
            nVar.p(false);
            nVar.p(false);
            qm1.j jVar2 = K;
            v2.t0 r = mf0.o.r(jVar2.d, nVar, 0, 7);
            android.content.Context context = (android.content.Context) nVar.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.b);
            kotlin.Unit unit = kotlin.Unit.a;
            boolean h = nVar.h(jVar2) | nVar.f(iVar) | nVar.f(function0) | nVar.h(context) | nVar.f(function02);
            java.lang.Object M = nVar.M();
            v2.c cVar2 = v2.k.a;
            if (h || M == cVar2) {
                gh1.m mVar = new gh1.m(jVar2, iVar, function0, context, function02, (df3.bar) null, 25);
                nVar.k0(mVar);
                M = mVar;
            }
            v2.f.h(unit, (kotlin.jvm.functions.Function2) M, nVar);
            qm1.g gVar = (qm1.g) r.getValue();
            boolean h2 = nVar.h(jVar2);
            java.lang.Object M2 = nVar.M();
            if (h2 || M2 == cVar2) {
                cVar = cVar2;
                nn0.f fVar = new nn0.f(0, jVar2, qm1.j.class, "onAcceptInvitationClicked", "onAcceptInvitationClicked()V", 0, 29);
                nVar.k0(fVar);
                M2 = fVar;
            } else {
                cVar = cVar2;
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.reflect.KFunction) M2;
            boolean h3 = nVar.h(jVar2);
            java.lang.Object M3 = nVar.M();
            if (h3 || M3 == cVar) {
                qm1.c cVar3 = new qm1.c(0, jVar2, qm1.j.class, "onDeclineInvitationClicked", "onDeclineInvitationClicked()V", 0, 0);
                nVar.k0(cVar3);
                M3 = cVar3;
            }
            ge0.i.g(gVar, jVar, function03, (kotlin.reflect.KFunction) M3, nVar, 0);
            return unit;
        }
        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
    }

    private final java.lang.Object d(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        a9.qux quxVar;
        androidx.lifecycle.n1 n1Var;
        jl1.i iVar = (jl1.i) this.c;
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this.e;
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) this.d;
        ih1.j jVar = (ih1.j) this.b;
        v2.n nVar = (v2.n) obj2;
        ((java.lang.Integer) obj3).getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((rb.n) obj, "it");
        nVar.a0(1890788296);
        androidx.lifecycle.n a = b9.bar.a(nVar);
        if (a != null) {
            xc3.c t = com.bumptech.glide.qux.t(a, nVar);
            nVar.a0(1729797275);
            if (a instanceof androidx.lifecycle.n) {
                quxVar = a.getDefaultViewModelCreationExtras();
            } else {
                quxVar = a9.bar.b;
            }
            androidx.lifecycle.n1 K = df0.qux.K(rm1.k.class, a, (java.lang.String) null, t, quxVar, nVar);
            nVar.p(false);
            nVar.p(false);
            androidx.lifecycle.n1 n1Var2 = (rm1.k) K;
            v2.t0 r = mf0.o.r(((rm1.k) n1Var2).e, nVar, 0, 7);
            android.content.Context context = (android.content.Context) nVar.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.b);
            kotlin.Unit unit = kotlin.Unit.a;
            boolean h = nVar.h(n1Var2) | nVar.f(iVar) | nVar.f(function0) | nVar.h(context) | nVar.f(function02);
            java.lang.Object M = nVar.M();
            v2.c cVar = v2.k.a;
            if (!h && M != cVar) {
                n1Var = n1Var2;
            } else {
                n1Var = n1Var2;
                gh1.m mVar = new gh1.m(n1Var, iVar, function0, context, function02, (df3.bar) null, 27);
                nVar.k0(mVar);
                M = mVar;
            }
            v2.f.h(unit, (kotlin.jvm.functions.Function2) M, nVar);
            rm1.i iVar2 = (rm1.i) r.getValue();
            boolean h2 = nVar.h(n1Var);
            java.lang.Object M2 = nVar.M();
            if (h2 || M2 == cVar) {
                qm1.c cVar2 = new qm1.c(0, n1Var, rm1.k.class, "onAcceptInvitationClicked", "onAcceptInvitationClicked()V", 0, 6);
                nVar.k0(cVar2);
                M2 = cVar2;
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.reflect.KFunction) M2;
            boolean h3 = nVar.h(n1Var);
            java.lang.Object M3 = nVar.M();
            if (h3 || M3 == cVar) {
                qm1.c cVar3 = new qm1.c(0, n1Var, rm1.k.class, "onDeclineInvitationClicked", "onDeclineInvitationClicked()V", 0, 7);
                nVar.k0(cVar3);
                M3 = cVar3;
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.reflect.KFunction) M3;
            boolean h4 = nVar.h(n1Var);
            java.lang.Object M4 = nVar.M();
            if (h4 || M4 == cVar) {
                androidx.lifecycle.n1 n1Var3 = n1Var;
                qy2.e eVar = new qy2.e(1, n1Var3, rm1.k.class, "onInvitationOptionSelected", "onInvitationOptionSelected(Lcom/truecaller/familyprotect/presentation/screens/invitationresponse/premiumandprotection/InvitationOption;)V", 0, 3);
                nVar.k0(eVar);
                M4 = eVar;
            }
            ff0.g.m(iVar2, jVar, function03, function04, (kotlin.reflect.KFunction) M4, nVar, 0);
            return unit;
        }
        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
    }

    private final java.lang.Object e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        boolean z2;
        int i;
        rm1.g gVar = (rm1.i) this.c;
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this.e;
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) this.d;
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) this.b;
        m1.o1 o1Var = (m1.o1) obj;
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o1Var, "innerPadding");
        if ((intValue & 6) == 0) {
            if (nVar.f(o1Var)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(intValue & 1, z)) {
            j3.q k = uf.qux.k((java.lang.String) null, 3, 1.0f, o1Var);
            h4.a1 d = m1.n.d(j3.qux.e, false);
            long j = nVar.T;
            int i2 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c = j3.bar.c(k, nVar);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar);
            } else {
                nVar.n0();
            }
            v2.f.A(d, j4.d.g, nVar);
            v2.f.A(l, j4.d.f, nVar);
            v2.f.t(nVar, java.lang.Integer.valueOf(i2), j4.d.j);
            v2.f.x(j4.d.k, nVar);
            v2.f.A(c, j4.d.d, nVar);
            if (kotlin.jvm.internal.Intrinsics.b(gVar, rm1.f.a)) {
                nVar.Z(160961455);
                z2 = true;
                r2.d5.a(m1.c2.o(u51.e.d(3, (java.lang.String) null), 48), q3.r.e, 0.0f, 0L, 0, 0.0f, nVar, 48, 60);
                nVar.p(false);
            } else {
                z2 = true;
                if (gVar instanceof rm1.g) {
                    nVar.Z(-2073009167);
                    ff0.g.k(gVar, function0, function02, function1, nVar, 0);
                    nVar.p(false);
                } else if (gVar instanceof rm1.h) {
                    nVar.Z(161590662);
                    nVar.p(false);
                } else {
                    throw ro0.f.G(-2073019531, nVar, false);
                }
            }
            nVar.p(z2);
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object f(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        gm1.qux quxVar;
        int i;
        sm1.c cVar = (sm1.c) this.c;
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) this.d;
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this.e;
        v2.p2 p2Var = (v2.p2) this.b;
        m1.o1 o1Var = (m1.o1) obj;
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o1Var, "innerPadding");
        if ((intValue & 6) == 0) {
            if (nVar.f(o1Var)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(intValue & 1, z)) {
            float f = 24;
            j3.q e = m1.c2.e(e1.k.i(m1.c.F(u51.e.d(3, (java.lang.String) null), o1Var), ((y41.i) nVar.j(y41.j.a)).g().a, u1.b.d(f, f, 0.0f, 0.0f, 12)), 1.0f);
            m1.v a = m1.t.a(m1.h.c, j3.qux.n, nVar, 54);
            long j = nVar.T;
            int i2 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c = j3.bar.c(e, nVar);
            j4.e.K9.getClass();
            j4.c cVar2 = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar2);
            } else {
                nVar.n0();
            }
            v2.f.A(a, j4.d.g, nVar);
            v2.f.A(l, j4.d.f, nVar);
            v2.f.t(nVar, java.lang.Integer.valueOf(i2), j4.d.j);
            v2.f.x(j4.d.k, nVar);
            v2.f.A(c, j4.d.d, nVar);
            j3.q d = u51.e.d(3, (java.lang.String) null);
            if (1.0f <= 0.0d) {
                n1.bar.a("invalid weight; must be greater than zero");
            }
            gm1.f.i(function1, n3.d.b(os0.bar.s(1.0f, d, true), u1.b.d(f, f, 0.0f, 0.0f, 12)), cVar.b, cVar.c, cVar.a, m1.c.g(0.0f, 8, 0.0f, 0.0f, 13), cVar.e, nVar, 196608);
            j3.q f2 = m1.c2.f(m1.c.G(m1.c.K(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), 0.0f, 0.0f, 0.0f, ((h5.c) p2Var.getValue()).a, 7), 16), 56);
            if (cVar.d) {
                quxVar = gm1.qux.a;
            } else {
                quxVar = gm1.baz.a;
            }
            gm1.qux quxVar2 = quxVar;
            j3.q R = gm1.f.R(u51.e.d(3, (java.lang.String) null), nVar);
            boolean z2 = !cVar.a.isEmpty();
            java.lang.String u = qk.b1.u(2132021044, nVar);
            com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary buttonStylePrimary = com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary.PRIMARY;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(R, "modifier");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u, "text");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonStylePrimary, "buttonStyle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onClick");
            gm1.f.q(gm1.f.U(f2, quxVar2, new gm1.t(R, u, z2, buttonStylePrimary, function0)), nVar, 0);
            nVar.p(true);
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        float f;
        com.truecaller.calllog.presentation.ui.screen.model.DefaultDialerBannerState defaultDialerBannerState = (com.truecaller.calllog.presentation.ui.screen.model.DefaultDialerBannerState) this.c;
        com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState promoBannerVisibilityState = (com.truecaller.calllog.presentation.ui.screen.model.PromoBannerVisibilityState) this.d;
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) this.e;
        com.truecaller.premium.ui.banner.BannerFetchStrategy bannerFetchStrategy = (com.truecaller.premium.ui.banner.BannerFetchStrategy) this.b;
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((o1.qux) obj, "$this$item");
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(intValue & 1, z)) {
            if (defaultDialerBannerState != com.truecaller.calllog.presentation.ui.screen.model.DefaultDialerBannerState.HIDDEN) {
                f = 8;
            } else {
                f = 0;
            }
            j3.q I = m1.c.I(m1.c.K(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), 0.0f, f, 0.0f, 0.0f, 13), 16, 0.0f, 2);
            int i = tx0.f.a[promoBannerVisibilityState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    nVar.Z(395375389);
                    nVar.p(false);
                } else {
                    nVar.Z(-628384053);
                    j52.b.f(I, nVar, 0);
                    nVar.p(false);
                }
            } else {
                nVar.Z(-628826051);
                ce2.k.a.a(I, i82.r.c8, function1, bannerFetchStrategy, nVar, 0, 0);
                nVar.p(false);
            }
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object h(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        j3.q qVar;
        q3.s0 s0Var = (q3.n) this.c;
        v1.s0 s0Var2 = (v1.s0) this.d;
        z4.v vVar = (z4.v) this.e;
        z4.o oVar = (z4.o) this.b;
        j3.q qVar2 = (j3.q) obj;
        v2.n nVar = (v2.n) obj2;
        ((java.lang.Integer) obj3).getClass();
        nVar.Z(-84507373);
        boolean booleanValue = ((java.lang.Boolean) nVar.j(k4.g1.w)).booleanValue();
        boolean g = nVar.g(booleanValue);
        java.lang.Object M = nVar.M();
        v2.c cVar = v2.k.a;
        if (g || M == cVar) {
            M = new f2.n(booleanValue);
            nVar.k0(M);
        }
        f2.n nVar2 = (f2.n) M;
        if ((s0Var instanceof q3.s0) && s0Var.a == 16) {
            z = false;
        } else {
            z = true;
        }
        if (((k4.v2) nVar.j(k4.g1.t)).a() && s0Var2.b() && u4.u0.d(vVar.b) && z) {
            nVar.Z(-707487962);
            u4.d dVar = vVar.a;
            u4.u0 u0Var = new u4.u0(vVar.b);
            boolean h = nVar.h(nVar2);
            java.lang.Object M2 = nVar.M();
            if (h || M2 == cVar) {
                M2 = new uz.e(nVar2, (df3.bar) null, 2);
                nVar.k0(M2);
            }
            v2.f.g(dVar, u0Var, (kotlin.jvm.functions.Function2) M2, nVar);
            boolean h2 = nVar.h(nVar2) | nVar.h(oVar) | nVar.f(vVar) | nVar.h(s0Var2) | nVar.f(s0Var);
            java.lang.Object M3 = nVar.M();
            if (h2 || M3 == cVar) {
                a63.q qVar3 = new a63.q(nVar2, oVar, vVar, s0Var2, s0Var, 19);
                nVar.k0(qVar3);
                M3 = qVar3;
            }
            qVar = n3.d.f(qVar2, (kotlin.jvm.functions.Function1) M3);
            nVar.p(false);
        } else {
            nVar.Z(-705473241);
            nVar.p(false);
            qVar = j3.n.a;
        }
        nVar.p(false);
        return qVar;
    }

    private final java.lang.Object i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        v2.t0 t0Var;
        java.lang.Object obj4;
        ve2.r rVar = (ve2.r) this.c;
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this.e;
        v2.t0 t0Var2 = (v2.t0) this.d;
        v2.t0 t0Var3 = (v2.t0) this.b;
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.q) obj, "$this$Background");
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(intValue & 1, z)) {
            j3.q G = m1.c.G(m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f), 16);
            m1.y1 a = m1.x1.a(m1.h.f, j3.qux.j, nVar, 6);
            long j = nVar.T;
            int i = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c = j3.bar.c(G, nVar);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar);
            } else {
                nVar.n0();
            }
            v2.f.A(a, j4.d.g, nVar);
            v2.f.A(l, j4.d.f, nVar);
            v2.f.t(nVar, java.lang.Integer.valueOf(i), j4.d.j);
            v2.f.x(j4.d.k, nVar);
            v2.f.A(c, j4.d.d, nVar);
            j3.q c2 = m1.c2.c(u51.e.d(3, (java.lang.String) null), 1.0f);
            if (1.0f <= 0.0d) {
                n1.bar.a("invalid weight; must be greater than zero");
            }
            j3.q s = os0.bar.s(1.0f, c2, true);
            java.lang.String str = rVar.b;
            q3.r rVar2 = rVar.c;
            java.lang.String str2 = rVar.d;
            q3.r rVar3 = rVar.e;
            java.lang.String str3 = rVar.f;
            q3.r rVar4 = rVar.g;
            le2.c cVar2 = rVar.h;
            java.lang.Object M = nVar.M();
            v2.c cVar3 = v2.k.a;
            if (M == cVar3) {
                M = new j02.x(t0Var2, 20);
                nVar.k0(M);
            }
            ve2.m mVar = ve2.m.a;
            mVar.d(s, str, rVar2, str2, rVar3, str3, rVar4, cVar2, (kotlin.jvm.functions.Function1) M, function0, nVar, 100663296);
            j3.q c3 = m1.c2.c(m1.c2.t(u51.e.d(3, (java.lang.String) null), 96), 1.0f);
            fj.a aVar = rVar.j;
            java.lang.Object M2 = nVar.M();
            if (M2 == cVar3) {
                t0Var = t0Var3;
                p92.d dVar = new p92.d(t0Var, 14);
                nVar.k0(dVar);
                obj4 = dVar;
            } else {
                t0Var = t0Var3;
                obj4 = M2;
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) obj4;
            java.lang.Object M3 = nVar.M();
            java.lang.Object obj5 = M3;
            if (M3 == cVar3) {
                p92.d dVar2 = new p92.d(t0Var, 15);
                nVar.k0(dVar2);
                obj5 = dVar2;
            }
            mVar.f(c3, aVar, function02, (kotlin.jvm.functions.Function0) obj5, nVar, 28032);
            nVar.p(true);
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x01de, code lost:
    
        if (r1 == v2.k.a) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        kotlin.jvm.functions.Function2 function2;
        java.lang.String str;
        kotlin.jvm.functions.Function0 function0;
        int i;
        java.lang.String str2;
        j51.b bVar;
        kotlin.jvm.functions.Function2 function22;
        j4.a aVar;
        j4.b bVar2;
        kotlin.jvm.functions.Function0 function02;
        kotlin.jvm.functions.Function2 function23;
        boolean z2;
        java.lang.Object obj4;
        java.lang.String str3 = (java.lang.String) this.b;
        java.lang.String str4 = (java.lang.String) this.c;
        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) this.e;
        kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) this.d;
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        j51.b bVar3 = j51.b.q;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$Card");
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(intValue & 1, z)) {
            float f = 24;
            float f2 = 8;
            j3.q J = m1.c.J(u51.e.d(3, (java.lang.String) null), f, f, f, f2);
            m1.v a = m1.t.a(m1.h.c, j3.qux.m, nVar, 0);
            long j = nVar.T;
            int i2 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c = j3.bar.c(J, nVar);
            j4.e.K9.getClass();
            kotlin.jvm.functions.Function0 function05 = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(function05);
            } else {
                nVar.n0();
            }
            kotlin.jvm.functions.Function2 function24 = j4.d.g;
            v2.f.A(a, function24, nVar);
            kotlin.jvm.functions.Function2 function25 = j4.d.f;
            v2.f.A(l, function25, nVar);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
            j4.b bVar4 = j4.d.j;
            v2.f.t(nVar, valueOf, bVar4);
            j4.a aVar2 = j4.d.k;
            v2.f.x(aVar2, nVar);
            kotlin.jvm.functions.Function2 function26 = j4.d.d;
            v2.f.A(c, function26, nVar);
            if (str3.length() > 0) {
                function0 = function03;
                bVar = bVar3;
                function02 = function05;
                function2 = function26;
                str = str4;
                i = 3;
                bVar2 = bVar4;
                function22 = function24;
                aVar = aVar2;
                function23 = function25;
                str2 = null;
                bVar.E("confirm-dialog-title", os0.bar.u(nVar, -232002054, (java.lang.String) null, 3, 1.0f), str3, ((i51.a) nVar.j(i51.bar.a)).q, ((y41.i) nVar.j(y41.j.a)).m().a, (f5.i) null, 0, 0, 0, new f5.h(3), 0L, nVar, 6, 0, 3552);
                nVar = nVar;
                m1.c.h(m1.c2.f(u51.e.d(3, (java.lang.String) null), f2), nVar);
                z2 = false;
            } else {
                function2 = function26;
                str = str4;
                function0 = function03;
                i = 3;
                str2 = null;
                bVar = bVar3;
                function22 = function24;
                aVar = aVar2;
                bVar2 = bVar4;
                function02 = function05;
                function23 = function25;
                z2 = false;
                nVar.Z(-234115076);
            }
            nVar.p(z2);
            if (str.length() > 0) {
                v2.n nVar2 = nVar;
                j51.b bVar5 = bVar;
                bVar5.E("confirm-dialog-subtitle", os0.bar.u(nVar, -231486927, str2, i, 1.0f), str, ((i51.a) nVar.j(i51.bar.a)).i, ((y41.i) nVar.j(y41.j.a)).m().a, (f5.i) null, 0, 0, 0, (f5.h) null, 0L, nVar2, 6, 0, 4064);
                nVar = nVar2;
            } else {
                nVar.Z(-234115076);
            }
            nVar.p(z2);
            j3.q e = m1.c2.e(u51.e.d(i, str2), 1.0f);
            m1.y1 a2 = m1.x1.a(m1.h.b, j3.qux.j, nVar, 6);
            long j2 = nVar.T;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            v2.e1 l2 = nVar.l();
            j3.q c2 = j3.bar.c(e, nVar);
            nVar.d0();
            if (nVar.S) {
                nVar.k(function02);
            } else {
                nVar.n0();
            }
            v2.f.A(a2, function22, nVar);
            v2.f.A(l2, function23, nVar);
            h0.b.Y(i3, nVar, bVar2, nVar, aVar);
            v2.f.A(c2, function2, nVar);
            kotlin.jvm.functions.Function0 function06 = function0;
            boolean f3 = nVar.f(function06);
            java.lang.Object M = nVar.M();
            if (!f3) {
                obj4 = M;
            }
            ve2.h hVar = new ve2.h(9, function06);
            nVar.k0(hVar);
            obj4 = hVar;
            r2.h5.t((kotlin.jvm.functions.Function0) obj4, (j3.q) null, false, (q3.q0) null, (r2.l0) null, (r2.n0) null, (m1.o1) null, wo1.x.b, nVar, 805306368, 510);
            r2.h5.t(function04, (j3.q) null, false, (q3.q0) null, (r2.l0) null, (r2.n0) null, (m1.o1) null, wo1.x.c, nVar, 805306368, 510);
            nVar.p(true);
            nVar.p(true);
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object k(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        q3.q0 q0Var = (q3.q0) this.c;
        v2.t0 t0Var = (v2.t0) this.d;
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) this.e;
        wu2.q qVar = (wu2.q) this.b;
        v2.n nVar = (v2.n) obj2;
        ((java.lang.Integer) obj3).getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((b1.e0) obj, "$this$AnimatedVisibility");
        wu2.l.b(q0Var, ((wu2.m) t0Var.getValue()).a, m1.c.G(e1.k.i(u51.e.d(3, (java.lang.String) null), ((y41.i) nVar.j(y41.j.a)).g().a, q3.a0.b), 8), null, d3.a.d(273071824, new sz2.bar(t0Var, function1, qVar, 17), nVar), nVar, 24576);
        return kotlin.Unit.a;
    }

    private final java.lang.Object l(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        int i;
        wb.bar barVar = (wb.bar) this.c;
        t80.g gVar = (t80.g) this.d;
        v2.t0 t0Var = (v2.t0) this.e;
        go2.v0 v0Var = (go2.v0) this.b;
        o1.qux quxVar = (o1.qux) obj;
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "$this$item");
        if ((intValue & 6) == 0) {
            if (nVar.f(quxVar)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(intValue & 1, z)) {
            if (!barVar.e().f && barVar.c() <= 0) {
                nVar.Z(-2129361143);
            } else {
                nVar.Z(-2101636448);
                j3.q K = m1.c.K(o1.baz.d(quxVar, u51.e.d(3, (java.lang.String) null)), 0.0f, 0.0f, 0.0f, 8, 7);
                nn2.baz bazVar = ((nn2.o) gVar).g;
                boolean f = nVar.f(t0Var) | nVar.h(v0Var);
                java.lang.Object M = nVar.M();
                if (f || M == v2.k.a) {
                    M = new v2.o(21, v0Var, t0Var);
                    nVar.k0(M);
                }
                xn2.p0.b(K, bazVar, (kotlin.jvm.functions.Function2) M, nVar, 0);
            }
            nVar.p(false);
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object m(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        zf3.b bVar = (zf3.b) this.c;
        u4.v0 v0Var = (u4.v0) this.d;
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) this.e;
        v2.t0 t0Var = (v2.t0) this.b;
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$DropdownMenu");
        boolean z2 = true;
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(intValue & 1, z)) {
            int i = 0;
            for (java.lang.Object obj4 : bVar) {
                int i2 = i + 1;
                if (i >= 0) {
                    co2.d dVar = (co2.d) obj4;
                    j3.q e = m1.c2.e(m1.c2.z(u51.e.d(3, (java.lang.String) null)), 1.0f);
                    java.lang.String str = dVar.b;
                    java.lang.String str2 = dVar.c;
                    boolean f = nVar.f(function1) | nVar.h(dVar);
                    boolean z3 = z2;
                    java.lang.Object M = nVar.M();
                    if (f || M == v2.k.a) {
                        M = new rd.a(function1, dVar, t0Var, 22);
                        nVar.k0(M);
                    }
                    xn2.p0.j(e, str, str2, v0Var, (kotlin.jvm.functions.Function0) M, nVar, 0);
                    if (i < bVar.size() - 1) {
                        nVar.Z(1247362015);
                        ye0.k.h(20, nVar, 6);
                    } else {
                        nVar.Z(1237846751);
                    }
                    nVar.p(false);
                    z2 = z3;
                    i = i2;
                } else {
                    kotlin.collections.y.p();
                    throw null;
                }
            }
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0299, code lost:
    
        if (r3 == r12) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object n(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        java.lang.Object obj4;
        int i;
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this.e;
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) this.c;
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) this.d;
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) this.b;
        m1.w wVar = (m1.w) obj;
        v2.n nVar = (v2.n) obj2;
        int intValue = ((java.lang.Integer) obj3).intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wVar, "$this$CommonBottomSheet");
        if ((intValue & 6) == 0) {
            if (nVar.f(wVar)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(intValue & 1, z)) {
            float f = 16;
            float f2 = 24;
            j3.q J = m1.c.J(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), f, f, f, f2);
            j3.e eVar = j3.qux.n;
            j3.q a = wVar.a(eVar, J);
            h4.a1 d = m1.n.d(j3.qux.a, false);
            long j = nVar.T;
            int i2 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c = j3.bar.c(a, nVar);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar);
            } else {
                nVar.n0();
            }
            j4.b bVar = j4.d.g;
            v2.f.A(d, bVar, nVar);
            j4.b bVar2 = j4.d.f;
            v2.f.A(l, bVar2, nVar);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i2);
            j4.b bVar3 = j4.d.j;
            v2.f.t(nVar, valueOf, bVar3);
            j4.a aVar = j4.d.k;
            v2.f.x(aVar, nVar);
            j4.b bVar4 = j4.d.d;
            v2.f.A(c, bVar4, nVar);
            j3.q G = m1.c.G(m1.r.a.b(u51.e.d(3, (java.lang.String) null), j3.qux.c), 0);
            j3.q d2 = u51.e.d(3, (java.lang.String) null);
            boolean f3 = nVar.f(function0) | nVar.f(function02);
            java.lang.Object M = nVar.M();
            v2.c cVar2 = v2.k.a;
            java.lang.Object obj5 = M;
            if (f3 || M == cVar2) {
                en1.u uVar = new en1.u(function0, function02, 13);
                nVar.k0(uVar);
                obj5 = uVar;
            }
            j3.q o = G.o(e1.k.q(d2, false, (java.lang.String) null, (r4.g) null, (kotlin.jvm.functions.Function0) obj5, 15));
            w3.c C = com.moloco.sdk.internal.publisher.b0.C();
            v2.q2 q2Var = y41.j.a;
            r2.d3.b(C, "Close", o, ((y41.i) nVar.j(q2Var)).m().d, nVar, 48, 0);
            j3.q K = m1.c.K(u51.e.d(3, (java.lang.String) null), 0.0f, f2, 0.0f, 0.0f, 13);
            m1.v a2 = m1.t.a(m1.h.c, eVar, nVar, 48);
            long j2 = nVar.T;
            int i3 = (int) (j2 ^ (j2 >>> 32));
            v2.e1 l2 = nVar.l();
            j3.q c2 = j3.bar.c(K, nVar);
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar);
            } else {
                nVar.n0();
            }
            v2.f.A(a2, bVar, nVar);
            v2.f.A(l2, bVar2, nVar);
            h0.b.Y(i3, nVar, bVar3, nVar, aVar);
            v2.f.A(c2, bVar4, nVar);
            java.lang.String u = qk.b1.u(2132022775, nVar);
            f5.h hVar = new f5.h(3);
            v2.q2 q2Var2 = i51.bar.a;
            r2.l8.b(u, (j3.q) null, 0L, 0L, (y4.o) null, (y4.f) null, 0L, (f5.i) null, hVar, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, u4.v0.b(((i51.a) nVar.j(q2Var2)).m, ((y41.i) nVar.j(q2Var)).m().a, 0L, (y4.o) null, (y4.k) null, (y4.f) null, 0L, (s3.e) null, 0L, (u4.e0) null, (f5.f) null, 16777214), nVar, 0, 0, 130046);
            ye0.k.h(2, nVar, 6);
            r2.l8.b(qk.b1.u(2132022774, nVar), (j3.q) null, 0L, 0L, (y4.o) null, (y4.f) null, 0L, (f5.i) null, new f5.h(3), 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, u4.v0.b(((i51.a) nVar.j(q2Var2)).e, ((y41.i) nVar.j(q2Var)).m().b, 0L, (y4.o) null, (y4.k) null, (y4.f) null, 0L, (s3.e) null, 0L, (u4.e0) null, (f5.f) null, 16777214), nVar, 0, 0, 130046);
            ye0.k.h(f2, nVar, 6);
            yn2.m.d(snapshotStateList, nVar, 0);
            ye0.k.h(f2, nVar, 6);
            j51.b bVar5 = j51.b.e;
            j3.q e = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
            java.lang.String u2 = qk.b1.u(2132022834, nVar);
            y2.qux quxVar = h3.p.f(snapshotStateList).c;
            if (quxVar == null || !quxVar.isEmpty()) {
                java.util.Iterator it = quxVar.iterator();
                if (it.hasNext()) {
                    throw f63.qux.l(it);
                }
            }
            boolean f4 = nVar.f(function1) | nVar.f(snapshotStateList) | nVar.f(function0);
            java.lang.Object M2 = nVar.M();
            if (!f4) {
                obj4 = M2;
            }
            rd.a aVar2 = new rd.a(function1, snapshotStateList, function0, 23);
            nVar.k0(aVar2);
            obj4 = aVar2;
            bVar5.v("new_survey_submit_button", e, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, u2, (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) obj4, nVar, 6, 0, 924);
            nVar.p(true);
            nVar.p(true);
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        boolean z8;
        int i2;
        boolean z9;
        boolean z10;
        int i3;
        boolean z11;
        int i4;
        int i5;
        boolean z12;
        boolean z14;
        java.util.List list;
        int i6 = this.a;
        java.lang.Object obj4 = v2.k.a;
        int i7 = 2;
        java.lang.Object obj5 = this.b;
        java.lang.Object obj6 = this.e;
        java.lang.Object obj7 = this.d;
        java.lang.Object obj8 = this.c;
        boolean z15 = false;
        switch (i6) {
            case 0:
                com.truecaller.voicemail.presentation.deactivate.DeactivationState deactivationState = (com.truecaller.voicemail.presentation.deactivate.DeactivationState) obj8;
                p53.qux quxVar = (p53.qux) obj7;
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) obj6;
                java.lang.String str = (java.lang.String) obj5;
                v2.n nVar = (v2.n) obj2;
                int intValue = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$Card");
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (nVar.P(intValue & 1, z)) {
                    j3.q H = m1.c.H(u51.e.d(3, (java.lang.String) null), 16, 20);
                    m1.b bVar = m1.h.c;
                    j3.e eVar = j3.qux.m;
                    m1.v a = m1.t.a(bVar, eVar, nVar, 0);
                    long j = nVar.T;
                    int i8 = (int) (j ^ (j >>> 32));
                    v2.e1 l = nVar.l();
                    j3.q c = j3.bar.c(H, nVar);
                    j4.e.K9.getClass();
                    j4.c cVar = j4.d.b;
                    nVar.d0();
                    if (nVar.S) {
                        nVar.k(cVar);
                    } else {
                        nVar.n0();
                    }
                    j4.b bVar2 = j4.d.g;
                    v2.f.A(a, bVar2, nVar);
                    j4.b bVar3 = j4.d.f;
                    v2.f.A(l, bVar3, nVar);
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(i8);
                    j4.b bVar4 = j4.d.j;
                    v2.f.t(nVar, valueOf, bVar4);
                    j4.a aVar = j4.d.k;
                    v2.f.x(aVar, nVar);
                    j4.b bVar5 = j4.d.d;
                    v2.f.A(c, bVar5, nVar);
                    j3.f fVar = j3.qux.k;
                    j3.q e = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                    m1.y1 a2 = m1.x1.a(m1.h.a, fVar, nVar, 48);
                    long j2 = nVar.T;
                    int i9 = (int) (j2 ^ (j2 >>> 32));
                    v2.e1 l2 = nVar.l();
                    j3.q c2 = j3.bar.c(e, nVar);
                    nVar.d0();
                    if (nVar.S) {
                        nVar.k(cVar);
                    } else {
                        nVar.n0();
                    }
                    v2.f.A(a2, bVar2, nVar);
                    v2.f.A(l2, bVar3, nVar);
                    h0.b.Y(i9, nVar, bVar4, nVar, aVar);
                    v2.f.A(c2, bVar5, nVar);
                    m1.v a3 = m1.t.a(bVar, eVar, nVar, 0);
                    long j3 = nVar.T;
                    int i10 = (int) (j3 ^ (j3 >>> 32));
                    v2.e1 l3 = nVar.l();
                    j3.n nVar2 = j3.n.a;
                    j3.q c3 = j3.bar.c(nVar2, nVar);
                    nVar.d0();
                    if (nVar.S) {
                        nVar.k(cVar);
                    } else {
                        nVar.n0();
                    }
                    v2.f.A(a3, bVar2, nVar);
                    v2.f.A(l3, bVar3, nVar);
                    h0.b.Y(i10, nVar, bVar4, nVar, aVar);
                    v2.f.A(c3, bVar5, nVar);
                    j3.q b = u51.e.b(nVar2, "voicemail_deactivation_screen_card_title", true);
                    java.lang.String str2 = quxVar.a;
                    v2.q2 q2Var = i51.bar.a;
                    r2.l8.b(str2, b, quxVar.c, 0L, (y4.o) null, (y4.f) null, 0L, (f5.i) null, (f5.h) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, ((i51.a) nVar.j(q2Var)).e, nVar, 0, 0, 131064);
                    m1.c.h(m1.c2.f(u51.e.d(3, (java.lang.String) null), 8), nVar);
                    r2.l8.b(str, u51.e.b(nVar2, "voicemail_deactivation_screen_card_subtitle", true), quxVar.d, 0L, (y4.o) null, (y4.f) null, 0L, (f5.i) null, (f5.h) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, ((i51.a) nVar.j(q2Var)).e, nVar, 0, 0, 131064);
                    nVar.p(true);
                    j3.q d = u51.e.d(3, (java.lang.String) null);
                    if (1.0f <= 0.0d) {
                        n1.bar.a("invalid weight; must be greater than zero");
                    }
                    float f = Float.MAX_VALUE;
                    if (1.0f <= Float.MAX_VALUE) {
                        f = 1.0f;
                    }
                    m1.c.h(d.o(new m1.f1(f, true)), nVar);
                    b1.t1.f(quxVar.e, (j3.q) null, (b1.a1) null, (b1.b1) null, (java.lang.String) null, com.truecaller.voicemail.presentation.deactivate.bar.e, nVar, 1572870, 30);
                    com.truecaller.voicemail.presentation.deactivate.DeactivationState deactivationState2 = com.truecaller.voicemail.presentation.deactivate.DeactivationState.SUCCESS;
                    if (deactivationState == deactivationState2) {
                        nVar.Z(-1146199860);
                        j3.q b2 = n3.d.b(m1.c2.o(u51.e.d(3, (java.lang.String) null), 40), u1.b.a);
                        v2.q2 q2Var2 = y41.j.a;
                        j3.q i11 = e1.k.i(b2, ((y41.i) nVar.j(q2Var2)).g().n, q3.a0.b);
                        h4.a1 d2 = m1.n.d(j3.qux.e, false);
                        long j4 = nVar.T;
                        int i12 = (int) (j4 ^ (j4 >>> 32));
                        v2.e1 l4 = nVar.l();
                        j3.q c4 = j3.bar.c(i11, nVar);
                        nVar.d0();
                        if (nVar.S) {
                            nVar.k(cVar);
                        } else {
                            nVar.n0();
                        }
                        v2.f.A(d2, bVar2, nVar);
                        v2.f.A(l4, bVar3, nVar);
                        h0.b.Y(i12, nVar, bVar4, nVar, aVar);
                        v2.f.A(c4, bVar5, nVar);
                        r2.d3.a(qe0.i1.z(2131233353, 0, nVar), "Deactivation success icon", m1.c2.o(u51.e.b(nVar2, "voicemail_deactivation_screen_card_success_icon", true), 24), ((y41.i) nVar.j(q2Var2)).g().q, nVar, 56, 0);
                        z2 = true;
                        nVar.p(true);
                        z3 = false;
                    } else {
                        z2 = true;
                        z3 = false;
                        nVar.Z(-1159253774);
                    }
                    nVar.p(z3);
                    nVar.p(z2);
                    if (deactivationState != deactivationState2) {
                        nVar.Z(-956975447);
                        m1.c.h(m1.c2.f(u51.e.d(3, (java.lang.String) null), 12), nVar);
                        j51.b.e.v("voicemail_deactivation_screen_card_deactivate_button", m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, com.truecaller.compose.ui.components.TrueButton.ButtonSize.SMALL, (m1.o1) null, !quxVar.e, qk.b1.u(2132023760, nVar), (v3.baz) null, (r2.n0) null, false, function0, nVar, 3072, 0, 916);
                        z4 = false;
                    } else {
                        z4 = false;
                        nVar.Z(-970931058);
                    }
                    nVar.p(z4);
                    nVar.p(true);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
            case 1:
                rb.e0 e0Var = (rb.e0) obj8;
                java.lang.String str3 = (java.lang.String) obj5;
                java.lang.String str4 = (java.lang.String) obj7;
                r2.m6 m6Var = (r2.m6) obj6;
                m1.o1 o1Var = (m1.o1) obj;
                v2.n nVar3 = (v2.n) obj2;
                int intValue2 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o1Var, "paddingValues");
                if ((intValue2 & 6) == 0) {
                    if (nVar3.f(o1Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) != 18) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (nVar3.P(intValue2 & 1, z5)) {
                    j3.q K = m1.c.K(m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f), 0.0f, o1Var.d(), 0.0f, 0.0f, 13);
                    v2.q2 q2Var3 = y41.j.a;
                    j3.q K2 = m1.c.K(m1.c.I(m1.c.K(e1.k.h(K, p22.bar.y(kotlin.collections.y.j(new q3.r[]{new q3.r(((y41.i) nVar3.j(q2Var3)).c().a().a), new q3.r(((y41.i) nVar3.j(q2Var3)).g().a)}), 0.0f, 0.0f, 14), (q3.q0) null, 6), 0.0f, 0.0f, 0.0f, o1Var.a(), 7), 16, 0.0f, 2), 0.0f, 12, 0.0f, 0.0f, 13);
                    m1.v a4 = m1.t.a(m1.h.c, j3.qux.m, nVar3, 0);
                    long j5 = nVar3.T;
                    int i14 = (int) (j5 ^ (j5 >>> 32));
                    v2.e1 l5 = nVar3.l();
                    j3.q c5 = j3.bar.c(K2, nVar3);
                    j4.e.K9.getClass();
                    j4.c cVar2 = j4.d.b;
                    nVar3.d0();
                    if (nVar3.S) {
                        nVar3.k(cVar2);
                    } else {
                        nVar3.n0();
                    }
                    v2.f.A(a4, j4.d.g, nVar3);
                    v2.f.A(l5, j4.d.f, nVar3);
                    v2.f.t(nVar3, java.lang.Integer.valueOf(i14), j4.d.j);
                    v2.f.x(j4.d.k, nVar3);
                    v2.f.A(c5, j4.d.d, nVar3);
                    boolean f2 = nVar3.f(str4);
                    java.lang.Object M = nVar3.M();
                    if (f2 || M == obj4) {
                        M = new c80.p(14, str4, m6Var);
                        nVar3.k0(M);
                    }
                    if0.y1.i(e0Var, str3, (j3.q) null, (java.lang.String) null, (kotlin.jvm.functions.Function1) M, nVar3, 0, 12);
                    nVar3.p(true);
                } else {
                    nVar3.S();
                }
                return kotlin.Unit.a;
            case 2:
                java.util.List list2 = (java.util.List) obj8;
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) obj7;
                java.util.List list3 = (java.util.List) obj6;
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) obj5;
                v2.n nVar4 = (v2.n) obj2;
                int intValue3 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$CommonBottomSheet");
                if ((intValue3 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (nVar4.P(intValue3 & 1, z6)) {
                    float f3 = 16;
                    j3.q e2 = m1.c2.e(m1.c.K(u51.e.d(3, (java.lang.String) null), f3, 0.0f, f3, 8, 2), 1.0f);
                    m1.v a5 = m1.t.a(m1.h.g(12), j3.qux.m, nVar4, 6);
                    long j6 = nVar4.T;
                    int i15 = (int) (j6 ^ (j6 >>> 32));
                    v2.e1 l6 = nVar4.l();
                    j3.q c6 = j3.bar.c(e2, nVar4);
                    j4.e.K9.getClass();
                    j4.c cVar3 = j4.d.b;
                    nVar4.d0();
                    if (nVar4.S) {
                        nVar4.k(cVar3);
                    } else {
                        nVar4.n0();
                    }
                    v2.f.A(a5, j4.d.g, nVar4);
                    v2.f.A(l6, j4.d.f, nVar4);
                    v2.f.t(nVar4, java.lang.Integer.valueOf(i15), j4.d.j);
                    v2.f.x(j4.d.k, nVar4);
                    v2.f.A(c6, j4.d.d, nVar4);
                    nVar4.Z(-750785820);
                    int i16 = 0;
                    for (java.lang.Object obj9 : kotlin.collections.CollectionsKt.z0(list2, 3)) {
                        int i17 = i16 + 1;
                        if (i16 >= 0) {
                            ff2.g gVar = (ff2.g) obj9;
                            nVar4.Z(-750783137);
                            xe2.s sVar = (xe2.s) list3.get(i16);
                            ff2.b bVar6 = ff2.b.b;
                            j3.q e3 = m1.c2.e(u51.e.d(2, "PremiumPaywallPurchaseBottomSheet-SubscriptionButton-" + i16), 1.0f);
                            boolean f4 = nVar4.f(function12) | nVar4.h(sVar) | nVar4.f(function1);
                            java.lang.Object M2 = nVar4.M();
                            if (f4 || M2 == obj4) {
                                M2 = new a63.d(function12, sVar, function1, 17);
                                nVar4.k0(M2);
                            }
                            bVar6.c(e3, (com.truecaller.premium.ui.common.GeneralButton.Size) null, gVar, (kotlin.jvm.functions.Function0) null, (kotlin.jvm.functions.Function0) null, (kotlin.jvm.functions.Function0) M2, nVar4, 0, 26);
                            nVar4.p(false);
                            i16 = i17;
                        } else {
                            kotlin.collections.y.p();
                            throw null;
                        }
                    }
                    nVar4.p(false);
                    j3.q e4 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                    java.lang.String u = qk.b1.u(2132019016, nVar4);
                    long j7 = ((y41.i) nVar4.j(y41.j.a)).g().m;
                    com.truecaller.premium.ui.common.GeneralButton.Size size = com.truecaller.premium.ui.common.GeneralButton.Size.Small;
                    boolean f5 = nVar4.f(function1);
                    java.lang.Object M3 = nVar4.M();
                    if (f5 || M3 == obj4) {
                        M3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.baz(8, function1);
                        nVar4.k0(M3);
                    }
                    ff0.g.n("PremiumPaywallPurchaseBottomSheet-BackButton", e4, size, (le2.c) null, u, j7, (ye2.baz) null, (kotlin.jvm.functions.Function0) null, (kotlin.jvm.functions.Function0) null, (kotlin.jvm.functions.Function0) M3, (kotlin.jvm.functions.Function1) null, nVar4, 384, 0, 3016);
                    nVar4.p(true);
                } else {
                    nVar4.S();
                }
                return kotlin.Unit.a;
            case 3:
                e53.e eVar2 = (e53.e) obj8;
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) obj6;
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) obj7;
                kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) obj5;
                m1.o1 o1Var2 = (m1.o1) obj;
                v2.n nVar5 = (v2.n) obj2;
                int intValue4 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o1Var2, "paddingValues");
                if ((intValue4 & 6) == 0) {
                    if (nVar5.f(o1Var2)) {
                        i7 = 4;
                    }
                    intValue4 |= i7;
                }
                if ((intValue4 & 19) != 18) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (nVar5.P(intValue4 & 1, z7)) {
                    v2.f.a(r2.i5.a.a(yy.qux.r(0, 1, 0L, nVar5)), d3.a.d(1417821063, new a2.x(o1Var2, eVar2, function02, function03, function04), nVar5), nVar5, 56);
                } else {
                    nVar5.S();
                }
                return kotlin.Unit.a;
            case 4:
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) obj8;
                h1.b bVar7 = (h1.b) obj7;
                nf3.i iVar = (nf3.i) obj5;
                kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) obj6;
                h1.qux quxVar2 = (h1.qux) obj;
                v2.n nVar6 = (v2.n) obj2;
                int intValue5 = ((java.lang.Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    if (nVar6.f(quxVar2)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue5 |= i2;
                }
                if ((intValue5 & 19) != 18) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (nVar6.P(intValue5 & 1, z8)) {
                    java.lang.String str5 = (java.lang.String) function2.invoke(nVar6, 0);
                    if (kotlin.text.StringsKt.X(str5)) {
                        l1.bar.c("Label must not be blank");
                    }
                    bVar7.getClass();
                    h1.baz.a.invoke(j3.n.a, str5, java.lang.Boolean.TRUE, quxVar2, iVar, function05, nVar6, java.lang.Integer.valueOf((intValue5 << 9) & 7168));
                } else {
                    nVar6.S();
                }
                return kotlin.Unit.a;
            case 5:
                ea0.l lVar = (ea0.l) obj8;
                x30.b bVar8 = (x30.b) obj7;
                x30.a aVar2 = ((t30.qux) bVar8).a;
                kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) obj6;
                db0.e eVar3 = (db0.e) obj5;
                v2.n nVar7 = (v2.n) obj2;
                int intValue6 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((kotlin.jvm.functions.Function0) obj, "it");
                if ((intValue6 & 17) != 16) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (nVar7.P(intValue6 & 1, z9)) {
                    if (kotlin.jvm.internal.Intrinsics.b(lVar, ea0.i.a)) {
                        nVar7.Z(645799108);
                        j52.b.m(aVar2, (j3.q) null, function06, nVar7, 0);
                        nVar7.p(false);
                    } else if (kotlin.jvm.internal.Intrinsics.b(lVar, ea0.j.a)) {
                        nVar7.Z(-1454873139);
                        x30.a aVar3 = aVar2;
                        boolean h = nVar7.h(eVar3) | nVar7.h(bVar8);
                        java.lang.Object M4 = nVar7.M();
                        if (h || M4 == obj4) {
                            M4 = new hb0.baz(eVar3, bVar8, 0);
                            nVar7.k0(M4);
                        }
                        j71.g.i(0, (j3.q) null, function06, (kotlin.jvm.functions.Function1) M4, nVar7, aVar3);
                        nVar7.p(false);
                    } else {
                        nVar7.Z(645815382);
                        x30.a aVar4 = aVar2;
                        boolean h2 = nVar7.h(eVar3) | nVar7.h(bVar8);
                        java.lang.Object M5 = nVar7.M();
                        if (h2 || M5 == obj4) {
                            M5 = new hb0.baz(eVar3, bVar8, 1);
                            nVar7.k0(M5);
                        }
                        j0.b.g(0, (j3.q) null, function06, (kotlin.jvm.functions.Function1) M5, nVar7, aVar4);
                        nVar7.p(false);
                    }
                } else {
                    nVar7.S();
                }
                return kotlin.Unit.a;
            case 6:
                kotlin.jvm.functions.Function0 function07 = (kotlin.jvm.functions.Function0) obj6;
                ih1.t0 t0Var = (ih1.t0) obj8;
                kotlin.jvm.functions.Function0 function08 = (kotlin.jvm.functions.Function0) obj7;
                v2.t0 t0Var2 = (v2.t0) obj5;
                m1.o1 o1Var3 = (m1.o1) obj;
                v2.n nVar8 = (v2.n) obj2;
                int intValue7 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o1Var3, "innerPaddings");
                if ((intValue7 & 6) == 0) {
                    if (nVar8.f(o1Var3)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    intValue7 |= i3;
                }
                if ((intValue7 & 19) != 18) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (nVar8.P(intValue7 & 1, z10)) {
                    ih1.s sVar2 = (ih1.s) t0Var2.getValue();
                    boolean h3 = nVar8.h(t0Var);
                    java.lang.Object M6 = nVar8.M();
                    if (h3 || M6 == obj4) {
                        M6 = new ih1.l(t0Var, 0);
                        nVar8.k0(M6);
                    }
                    kotlin.jvm.functions.Function0 function09 = (kotlin.jvm.functions.Function0) M6;
                    boolean h4 = nVar8.h(t0Var);
                    java.lang.Object M7 = nVar8.M();
                    if (h4 || M7 == obj4) {
                        M7 = new ie3.h(t0Var, 1);
                        nVar8.k0(M7);
                    }
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) M7;
                    boolean h5 = nVar8.h(t0Var);
                    java.lang.Object M8 = nVar8.M();
                    if (h5 || M8 == obj4) {
                        M8 = new ib2.bar(t0Var, 3);
                        nVar8.k0(M8);
                    }
                    kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) M8;
                    boolean h6 = nVar8.h(t0Var);
                    java.lang.Object M9 = nVar8.M();
                    if (h6 || M9 == obj4) {
                        M9 = new ih1.l(t0Var, 1);
                        nVar8.k0(M9);
                    }
                    kotlin.jvm.functions.Function0 function010 = (kotlin.jvm.functions.Function0) M9;
                    boolean h7 = nVar8.h(t0Var);
                    java.lang.Object M10 = nVar8.M();
                    if (h7 || M10 == obj4) {
                        M10 = new ih1.l(t0Var, 2);
                        nVar8.k0(M10);
                    }
                    kotlin.jvm.functions.Function0 function011 = (kotlin.jvm.functions.Function0) M10;
                    boolean h8 = nVar8.h(t0Var);
                    java.lang.Object M11 = nVar8.M();
                    if (h8 || M11 == obj4) {
                        M11 = new ih1.l(t0Var, 3);
                        nVar8.k0(M11);
                    }
                    ih1.p.a(sVar2, function07, function09, function22, function13, function010, function08, function011, (kotlin.jvm.functions.Function0) M11, m1.c.F(u51.e.d(1, (java.lang.String) null), o1Var3), nVar8, 0);
                } else {
                    nVar8.S();
                }
                return kotlin.Unit.a;
            case 7:
                k4.k2 k2Var = (k4.k2) obj8;
                kotlin.jvm.functions.Function0 function012 = (kotlin.jvm.functions.Function0) obj6;
                v2.a2 a2Var = (v2.a2) obj7;
                v2.c2 c2Var = (v2.c2) obj5;
                v2.n nVar9 = (v2.n) obj2;
                ((java.lang.Integer) obj3).getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((b1.e0) obj, "$this$AnimatedVisibility");
                j51.b bVar9 = j51.b.e;
                java.lang.String u2 = qk.b1.u(2132020774, nVar9);
                j3.q z16 = ik3.s.z(u51.e.d(3, (java.lang.String) null), nVar9);
                java.lang.Object M12 = nVar9.M();
                if (M12 == obj4) {
                    M12 = new e93.y(a2Var, c2Var, 1);
                    nVar9.k0(M12);
                }
                j3.q e5 = m1.c2.e(m1.c.H(h4.d0.p(z16, (kotlin.jvm.functions.Function1) M12), 24, 16), 1.0f);
                boolean f6 = nVar9.f(k2Var) | nVar9.f(function012);
                java.lang.Object M13 = nVar9.M();
                if (f6 || M13 == obj4) {
                    M13 = new ih1.n(k2Var, function012, 0);
                    nVar9.k0(M13);
                }
                bVar9.v("btnSave", e5, (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, (com.truecaller.compose.ui.components.TrueButton.ButtonSize) null, (m1.o1) null, false, u2, (v3.baz) null, (r2.n0) null, false, (kotlin.jvm.functions.Function0) M13, nVar9, 6, 0, 956);
                return kotlin.Unit.a;
            case 8:
                kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) obj8;
                jt0.o oVar = (jt0.o) obj7;
                kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) obj6;
                v2.t0 t0Var3 = (v2.t0) obj5;
                v2.n nVar10 = (v2.n) obj2;
                int intValue8 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$DropdownMenu");
                if ((intValue8 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (nVar10.P(intValue8 & 1, z11)) {
                    d3.qux quxVar3 = jt0.bar.j;
                    boolean f7 = nVar10.f(function14) | nVar10.f(oVar);
                    java.lang.Object M14 = nVar10.M();
                    if (f7 || M14 == obj4) {
                        M14 = new jt0.n(function14, oVar, t0Var3, 0);
                        nVar10.k0(M14);
                    }
                    r2.j.b(quxVar3, (kotlin.jvm.functions.Function0) M14, (j3.q) null, jt0.bar.k, false, (r2.m3) null, (m1.o1) null, nVar10, 3078, 500);
                    d3.qux quxVar4 = jt0.bar.l;
                    boolean f8 = nVar10.f(function15) | nVar10.f(oVar);
                    java.lang.Object M15 = nVar10.M();
                    if (f8 || M15 == obj4) {
                        M15 = new jt0.n(function15, oVar, t0Var3, 1);
                        nVar10.k0(M15);
                    }
                    r2.j.b(quxVar4, (kotlin.jvm.functions.Function0) M15, (j3.q) null, jt0.bar.m, false, (r2.m3) null, (m1.o1) null, nVar10, 3078, 500);
                } else {
                    nVar10.S();
                }
                return kotlin.Unit.a;
            case 9:
                h62.d dVar = (h62.d) obj8;
                kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) obj7;
                kotlin.jvm.functions.Function2 function24 = (kotlin.jvm.functions.Function2) obj6;
                kotlin.jvm.functions.Function2 function25 = (kotlin.jvm.functions.Function2) obj5;
                m1.o1 o1Var4 = (m1.o1) obj;
                v2.n nVar11 = (v2.n) obj2;
                int intValue9 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o1Var4, "it");
                if ((intValue9 & 6) == 0) {
                    if (nVar11.f(o1Var4)) {
                        i4 = 4;
                    } else {
                        i4 = 2;
                    }
                    intValue9 |= i4;
                }
                if ((intValue9 & 19) != 18) {
                    z15 = true;
                }
                if (nVar11.P(intValue9 & 1, z15)) {
                    k62.bar.g(m1.c.F(u51.e.d(2, ((cf1.c) ak.e1.h0(j62.qux.b)).a), o1Var4), dVar, function23, function24, true, function25, nVar11, 24576);
                } else {
                    nVar11.S();
                }
                return kotlin.Unit.a;
            case 10:
                com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Extras extras = (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Extras) obj8;
                e1.f2 f2Var = (e1.f2) obj7;
                pd1.k kVar = (pd1.k) obj6;
                v2.t0 t0Var4 = (v2.t0) obj5;
                m1.o1 o1Var5 = (m1.o1) obj;
                v2.n nVar12 = (v2.n) obj2;
                int intValue10 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o1Var5, "paddingValues");
                if ((intValue10 & 6) == 0) {
                    if (nVar12.f(o1Var5)) {
                        i5 = 4;
                    } else {
                        i5 = 2;
                    }
                    intValue10 |= i5;
                }
                if ((intValue10 & 19) != 18) {
                    z15 = true;
                }
                if (nVar12.P(intValue10 & 1, z15)) {
                    com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.ContactData contactData = extras.getContactData();
                    com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.HistoryEventData historyEventData = extras.getHistoryEventData();
                    com.truecaller.detailsview.api.model.DetailsViewSource source = extras.getSource();
                    com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action action = extras.getAction();
                    int searchType = extras.getSearchType();
                    java.lang.Object M16 = nVar12.M();
                    if (M16 == obj4) {
                        M16 = new j02.x(t0Var4, 7);
                        nVar12.k0(M16);
                    }
                    ns.o.d(contactData, historyEventData, source, action, searchType, f2Var, (kotlin.jvm.functions.Function1) M16, 0.0f, m1.c.F(u51.e.d(3, (java.lang.String) null), o1Var5), kVar, nVar12, 1572864 | com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.ContactData.$stable | (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.HistoryEventData.$stable << 3), com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_TPAT_KEY_VALUE);
                } else {
                    nVar12.S();
                }
                return kotlin.Unit.a;
            case 11:
                kotlin.jvm.functions.Function0 function013 = (kotlin.jvm.functions.Function0) obj5;
                v2.n nVar13 = (v2.n) obj2;
                ((java.lang.Integer) obj3).getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((b1.e0) obj, "$this$AnimatedVisibility");
                lf.bar.g(((je1.n) obj8).d, ((me1.qux) obj7).b(nVar13), (kotlin.jvm.functions.Function0) obj6, function013, (j3.q) null, (u4.v0) null, nVar13, 0);
                return kotlin.Unit.a;
            case 12:
                v2.n nVar14 = (v2.n) obj2;
                ((java.lang.Integer) obj3).getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((b1.e0) obj, "$this$AnimatedVisibility");
                es.baz.b(nj1.b0.N(((je1.n) obj8).j.a, (android.content.Context) obj7), ((me1.qux) obj5).b(nVar14), (kotlin.jvm.functions.Function0) obj6, m1.c.K(u51.e.d(3, (java.lang.String) null), 0.0f, 2, 0.0f, 0.0f, 13), (u4.v0) null, (e1.y0) null, nVar14, 0, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_REQUEST_ERROR_VALUE);
                return kotlin.Unit.a;
            case 13:
                com.truecaller.callui.presentation.ui.ButtonState buttonState = (com.truecaller.callui.presentation.ui.ButtonState) obj8;
                b1.a2 a2Var2 = (b1.a2) obj7;
                b1.e0 e0Var2 = (b1.e0) obj5;
                kotlin.jvm.functions.Function0 function014 = (kotlin.jvm.functions.Function0) obj6;
                v2.n nVar15 = (v2.n) obj2;
                int intValue11 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((p1.g) obj, "$this$item");
                if ((intValue11 & 17) != 16) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (nVar15.P(intValue11 & 1, z12)) {
                    if (buttonState != com.truecaller.callui.presentation.ui.ButtonState.HIDDEN) {
                        nVar15.Z(1891796216);
                        my0.c.h(u51.f.a(u51.e.b(j3.n.a, "EndCallButton", true), a2Var2, e0Var2, "call_ui_details_view_end_call_button", false, nVar15, 3072, 8), buttonState, function014, nVar15, 0);
                        nVar15.p(false);
                    } else {
                        nVar15.Z(1892324301);
                        my0.c.G(u51.e.d(3, (java.lang.String) null), nVar15, 0);
                        nVar15.p(false);
                    }
                } else {
                    nVar15.S();
                }
                return kotlin.Unit.a;
            case 14:
                return a(obj, obj2, obj3);
            case 15:
                java.util.List list4 = (java.util.List) obj8;
                v2.t0 t0Var5 = (v2.t0) obj7;
                v2.t0 t0Var6 = (v2.t0) obj6;
                v2.c2 c2Var2 = (v2.c2) obj5;
                v2.n nVar16 = (v2.n) obj2;
                int intValue12 = ((java.lang.Integer) obj3).intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((m1.w) obj, "$this$DropdownMenu");
                if ((intValue12 & 17) != 16) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (nVar16.P(intValue12 & 1, z14)) {
                    int i18 = 0;
                    for (java.lang.Object obj10 : list4) {
                        int i19 = i18 + 1;
                        if (i18 >= 0) {
                            j3.q e6 = m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f);
                            float f9 = 16;
                            float f10 = 8;
                            m1.s1 s1Var = new m1.s1(f9, f10, f9, f10);
                            d3.qux d3 = d3.a.d(1373848203, new an1.j(i18, (java.lang.String) obj10, 3, (byte) 0), nVar16);
                            boolean h9 = nVar16.h(list4) | nVar16.d(i18);
                            java.lang.Object M17 = nVar16.M();
                            if (!h9 && M17 != obj4) {
                                list = list4;
                            } else {
                                list = list4;
                                M17 = new ee2.baz(list, i18, t0Var5, t0Var6, c2Var2, 1);
                                nVar16.k0(M17);
                            }
                            r2.j.b(d3, (kotlin.jvm.functions.Function0) M17, e6, (kotlin.jvm.functions.Function2) null, false, (r2.m3) null, s1Var, nVar16, 12582918, 376);
                            i18 = i19;
                            list4 = list;
                        } else {
                            kotlin.collections.y.p();
                            throw null;
                        }
                    }
                } else {
                    nVar16.S();
                }
                return kotlin.Unit.a;
            case 16:
                return b(obj, obj2, obj3);
            case 17:
                return c(obj, obj2, obj3);
            case 18:
                return d(obj, obj2, obj3);
            case 19:
                return e(obj, obj2, obj3);
            case 20:
                return f(obj, obj2, obj3);
            case 21:
                return g(obj, obj2, obj3);
            case 22:
                return h(obj, obj2, obj3);
            case 23:
                return i(obj, obj2, obj3);
            case 24:
                return j(obj, obj2, obj3);
            case 25:
                return k(obj, obj2, obj3);
            case 26:
                return l(obj, obj2, obj3);
            case 27:
                return m(obj, obj2, obj3);
            case 28:
                return n(obj, obj2, obj3);
            default:
                kotlin.jvm.functions.Function1 function16 = (kotlin.jvm.functions.Function1) obj7;
                kotlin.jvm.functions.Function1 function17 = (kotlin.jvm.functions.Function1) obj6;
                v2.c2 c2Var3 = (v2.c2) obj5;
                v2.n nVar17 = (v2.n) obj2;
                ((java.lang.Integer) obj3).getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((b1.e0) obj, "$this$AnimatedVisibility");
                kotlin.Pair pair = ((zb2.v) obj8).d;
                if (pair == null) {
                    nVar17.Z(1893126084);
                    nVar17.p(false);
                } else {
                    nVar17.Z(1893126085);
                    j3.q K3 = m1.c.K(u51.e.d(3, (java.lang.String) null), 0.0f, 20, 0.0f, 0.0f, 13);
                    java.lang.Object M18 = nVar17.M();
                    if (M18 == obj4) {
                        M18 = new cc2.z(c2Var3, 12);
                        nVar17.k0(M18);
                    }
                    j3.q p = h4.d0.p(K3, (kotlin.jvm.functions.Function1) M18);
                    zf3.b bVar10 = (zf3.b) pair.a;
                    zf3.b bVar11 = (zf3.b) pair.b;
                    boolean f11 = nVar17.f(function16);
                    java.lang.Object M19 = nVar17.M();
                    if (f11 || M19 == obj4) {
                        M19 = new xq0.baz(2, function16);
                        nVar17.k0(M19);
                    }
                    kotlin.jvm.functions.Function1 function18 = (kotlin.jvm.functions.Function1) M19;
                    boolean f12 = nVar17.f(function17);
                    java.lang.Object M20 = nVar17.M();
                    if (f12 || M20 == obj4) {
                        M20 = new xq0.baz(3, function17);
                        nVar17.k0(M20);
                    }
                    ve2.m.a.e(p, bVar11, bVar10, function18, (kotlin.jvm.functions.Function1) M20, nVar17, 512);
                    nVar17.p(false);
                }
                return kotlin.Unit.a;
        }
    }

    public /* synthetic */ i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, kotlin.jvm.functions.Function0 function0, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = function0;
    }

    public /* synthetic */ i(java.lang.Object obj, kotlin.jvm.functions.Function0 function0, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.e = function0;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ i(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02) {
        this.a = 24;
        this.b = str;
        this.c = str2;
        this.e = function0;
        this.d = function02;
    }

    public /* synthetic */ i(kotlin.jvm.functions.Function0 function0, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.a = i;
        this.e = function0;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ i(rb.e0 e0Var, java.lang.String str, java.lang.String str2, r2.m6 m6Var) {
        this.a = 1;
        this.c = e0Var;
        this.b = str;
        this.d = str2;
        this.e = m6Var;
    }
}
