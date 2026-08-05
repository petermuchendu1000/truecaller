package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class i0 extends of0.baz implements com.truecaller.details_view.ui.t {
    public final qc3.bar A;
    public final qc3.bar B;
    public final qc3.bar C;
    public final ej.b D;
    public final g11.p E;
    public final ac1.e F;
    public final jv1.d G;
    public final ax1.baz H;
    public final qo1.j I;
    public final qc3.bar J;
    public final tc1.bar K;
    public final qc3.bar L;
    public final o02.baz M;
    public final qc3.bar N;
    public final d3.g O;
    public final lb2.bar P;
    public final qc3.bar Q;
    public final qc3.bar R;
    public final ij0.e S;
    public final t41.t T;
    public final qo1.bar U;
    public final e70.c V;
    public final qc3.bar W;
    public final rh1.qux X;
    public final oc1.bar Y;
    public final wj2.bar Z;
    public final java.util.Set a0;
    public final java.util.Set b0;
    public final java.util.Set c0;
    public final kotlin.coroutines.CoroutineContext d;
    public com.truecaller.details_view.ui.d1 d0;
    public final dj0.j e;
    public java.lang.Integer e0;
    public final k92.j f;
    public java.lang.String f0;
    public final f43.baz g;
    public com.truecaller.details_view.analytics.SourceType g0;
    public final n11.l h;
    public fg3.k2 h0;
    public final android.content.ContentResolver i;
    public boolean i0;
    public final android.net.Uri j;
    public boolean j0;
    public final ga1.e k;
    public boolean k0;
    public final yd3.qux l;
    public final com.google.android.gms.internal.auth.c l0;
    public final t41.r0 m;
    public final com.truecaller.details_view.ui.x m0;
    public final ac1.baz n;
    public final o81.a o;
    public final vd.b p;
    public final qa1.baz q;
    public final j01.qux r;
    public final zb1.baz s;
    public final p.c3 t;
    public final u03.b0 u;
    public final u03.q v;
    public final android.net.Uri w;
    public final qc3.bar x;
    public final qc3.bar y;
    public final qc3.bar z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(kotlin.coroutines.CoroutineContext coroutineContext, dj0.j jVar, k92.j jVar2, f43.baz bazVar, n11.l lVar, android.content.ContentResolver contentResolver, android.net.Uri uri, android.os.Handler handler, ga1.e eVar, yd3.qux quxVar, t41.r0 r0Var, ac1.baz bazVar2, o81.a aVar, vd.b bVar, qa1.baz bazVar3, j01.qux quxVar2, zb1.baz bazVar4, p.c3 c3Var, u03.b0 b0Var, u03.q qVar, android.net.Uri uri2, qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3, qc3.bar barVar4, qc3.bar barVar5, qc3.bar barVar6, ej.b bVar2, g11.p pVar, ac1.e eVar2, jv1.d dVar, ax1.baz bazVar5, qo1.j jVar3, qc3.bar barVar7, tc1.bar barVar8, qc3.bar barVar9, o02.baz bazVar6, qc3.bar barVar10, d3.g gVar, lb2.bar barVar11, qc3.bar barVar12, qc3.bar barVar13, ij0.e eVar3, t41.t tVar, qo1.bar barVar14, e70.c cVar, qc3.bar barVar15, rh1.qux quxVar3, oc1.bar barVar16, wj2.bar barVar17) {
        super(coroutineContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "blockManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar2, "actionButtonProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "actionButtonHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "truecallerAccountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "aggregatedContactTableUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "detailsViewModelLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "searchHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0Var, "timestampUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "callHistoryManagerDelegate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "historyEventFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "detailsViewModelComparator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar3, "detailsViewAnalytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar2, "optionsMenuFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar4, "widgetProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3Var, "contactHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "resourceProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "gsonUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri2, "historyEventTableUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "dvAdLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "dvBottomAdLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "detailsAdsLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "detailsBottomAdsLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar5, "detailsHeaderAdsLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar6, "detailsOverlayAdsLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar2, "aggregatedContactLoader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "commentsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar2, "deeplinkActionProcessor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "fraudSearchWarningsConfigManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar5, "insightsSenderFeedbackManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar3, "insightsFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar7, "callingFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar8, "detailsViewStateEventAnalytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar9, "contactExtrasProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar6, "premiumContactFieldsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar10, "claimRewardProgramPointsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "rewardsProgramAnalytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar11, "premiumStatusFlowObserver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar12, "callAndRecordAnalytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar13, "callAndRecordButtonUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar3, "filterMatchCoordinator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "phoneNumberHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar14, "adsFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "adInterstitialManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar15, "deviceInfoUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar3, "configurableCallApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar16, "detailsViewTTFDTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar17, "adsConfigsInventory");
        this.d = coroutineContext;
        this.e = jVar;
        this.f = jVar2;
        this.g = bazVar;
        this.h = lVar;
        this.i = contentResolver;
        this.j = uri;
        this.k = eVar;
        this.l = quxVar;
        this.m = r0Var;
        this.n = bazVar2;
        this.o = aVar;
        this.p = bVar;
        this.q = bazVar3;
        this.r = quxVar2;
        this.s = bazVar4;
        this.t = c3Var;
        this.u = b0Var;
        this.v = qVar;
        this.w = uri2;
        this.x = barVar;
        this.y = barVar2;
        this.z = barVar3;
        this.A = barVar4;
        this.B = barVar5;
        this.C = barVar6;
        this.D = bVar2;
        this.E = pVar;
        this.F = eVar2;
        this.G = dVar;
        this.H = bazVar5;
        this.I = jVar3;
        this.J = barVar7;
        this.K = barVar8;
        this.L = barVar9;
        this.M = bazVar6;
        this.N = barVar10;
        this.O = gVar;
        this.P = barVar11;
        this.Q = barVar12;
        this.R = barVar13;
        this.S = eVar3;
        this.T = tVar;
        this.U = barVar14;
        this.V = cVar;
        this.W = barVar15;
        this.X = quxVar3;
        this.Y = barVar16;
        this.Z = barVar17;
        com.truecaller.details_view.analytics.SourceType sourceType = com.truecaller.details_view.analytics.SourceType.AfterInAppOutgoingCall;
        this.a0 = kotlin.collections.y0.b(sourceType);
        this.b0 = kotlin.collections.y0.b(sourceType);
        com.truecaller.detailsviewlegacy.api.DetailsViewOutgoingCallSource[] detailsViewOutgoingCallSourceArr = {com.truecaller.detailsviewlegacy.api.DetailsViewOutgoingCallSource.CALL_LOG, com.truecaller.detailsviewlegacy.api.DetailsViewOutgoingCallSource.DIALPAD, com.truecaller.detailsviewlegacy.api.DetailsViewOutgoingCallSource.T9_SEARCH};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsViewOutgoingCallSourceArr, "elements");
        this.c0 = kotlin.collections.v.l0(detailsViewOutgoingCallSourceArr);
        this.l0 = new com.google.android.gms.internal.auth.c(this, handler, 4);
        this.m0 = new com.truecaller.details_view.ui.x((fg3.e0) this, handler, 0);
    }

    public static final com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig c2(com.truecaller.details_view.ui.i0 i0Var) {
        com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig detailsOverlayAdConfig;
        java.lang.String d = i0Var.Z.a.d("detailsOverlayAdUiConfig_69359", "");
        if (kotlin.text.StringsKt.X(d)) {
            d = null;
        }
        if (d != null && (detailsOverlayAdConfig = (com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig) i0Var.v.a(d, com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig.class)) != null) {
            return detailsOverlayAdConfig;
        }
        return new com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig(0, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fa, code lost:
    
        if (r2 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010b, code lost:
    
        if (r9.o2(r0) == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007a, code lost:
    
        if (r10 != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x005f, code lost:
    
        if (r10 == r1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object d2(com.truecaller.details_view.ui.i0 i0Var, df3.bar barVar) {
        com.truecaller.details_view.ui.h0 h0Var;
        int i;
        com.truecaller.data.entity.Contact contact;
        boolean z;
        if (barVar instanceof com.truecaller.details_view.ui.h0) {
            h0Var = (com.truecaller.details_view.ui.h0) barVar;
            int i2 = h0Var.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0Var.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = h0Var.x;
                java.lang.Object obj2 = ef3.bar.a;
                i = h0Var.z;
                boolean z2 = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                od.p.E(obj);
                                return kotlin.Unit.a;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.p.E(obj);
                        com.truecaller.details_view.ui.d1 d1Var = (com.truecaller.details_view.ui.d1) obj;
                        vd.b bVar = i0Var.p;
                        com.truecaller.details_view.ui.d1 d1Var2 = i0Var.d0;
                        if (d1Var2 != null) {
                            bVar.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d1Var, "left");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d1Var2, "right");
                            if (kotlin.jvm.internal.Intrinsics.b(d1Var.b, d1Var2.b) && d1Var.g == d1Var2.g && kotlin.jvm.internal.Intrinsics.b(d1Var.l, d1Var2.l)) {
                                com.truecaller.data.entity.Contact contact2 = d1Var.a;
                                com.truecaller.data.entity.Contact contact3 = d1Var2.a;
                                if (contact2 == contact3) {
                                    z = true;
                                } else if (contact2 != null && contact3 != null) {
                                    android.os.Parcel obtain = android.os.Parcel.obtain();
                                    obtain.setDataPosition(0);
                                    contact2.writeToParcel(obtain, 0);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtain, "apply(...)");
                                    android.os.Parcel obtain2 = android.os.Parcel.obtain();
                                    obtain2.setDataPosition(0);
                                    contact3.writeToParcel(obtain2, 0);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtain2, "apply(...)");
                                    if (obtain.dataAvail() == obtain2.dataAvail() && java.util.Arrays.equals(obtain.marshall(), obtain2.marshall())) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    obtain.recycle();
                                    obtain2.recycle();
                                } else {
                                    z = false;
                                }
                            }
                            z2 = false;
                            if (z2) {
                                return kotlin.Unit.a;
                            }
                            i0Var.d0 = d1Var;
                            h0Var.z = 3;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                            throw null;
                        }
                    } else {
                        od.p.E(obj);
                    }
                } else {
                    od.p.E(obj);
                    fg3.k2 k2Var = i0Var.h0;
                    if (k2Var != null && k2Var.isActive()) {
                        return kotlin.Unit.a;
                    }
                    ej.b bVar2 = i0Var.D;
                    com.truecaller.details_view.ui.d1 d1Var3 = i0Var.d0;
                    if (d1Var3 != null) {
                        com.truecaller.data.entity.Contact contact4 = d1Var3.a;
                        h0Var.z = 1;
                        obj = bVar2.D(contact4, h0Var);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
                contact = (com.truecaller.data.entity.Contact) obj;
                if (contact == null) {
                    com.truecaller.details_view.ui.d1 d1Var4 = i0Var.d0;
                    if (d1Var4 != null) {
                        contact = d1Var4.a;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
                ga1.e eVar = i0Var.k;
                h0Var.z = 2;
                obj = eVar.h(contact, h0Var);
            }
        }
        h0Var = new com.truecaller.details_view.ui.h0(i0Var, barVar);
        java.lang.Object obj3 = h0Var.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = h0Var.z;
        boolean z23 = true;
        if (i == 0) {
        }
        contact = (com.truecaller.data.entity.Contact) obj3;
        if (contact == null) {
        }
        ga1.e eVar2 = i0Var.k;
        h0Var.z = 2;
        obj3 = eVar2.h(contact, h0Var);
    }

    public static final void e2(com.truecaller.details_view.ui.i0 i0Var, bk2.e eVar) {
        d3.g gVar = i0Var.O;
        if (kotlin.jvm.internal.Intrinsics.b(eVar, bk2.c.a)) {
            gVar.F("DetailsViewV2");
            com.truecaller.details_view.ui.u uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
            if (uVar != null) {
                com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = ((com.truecaller.details_view.ui.x0) uVar).b;
                gk2.n nVar = detailsViewActivityLegacy.r0;
                if (nVar != null) {
                    ea1.bar barVar = detailsViewActivityLegacy.C0;
                    if (barVar != null) {
                        com.truecaller.ui.view.ConstraintLayoutWithTouchInterceptor constraintLayoutWithTouchInterceptor = barVar.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayoutWithTouchInterceptor, "getRoot(...)");
                        nVar.K(constraintLayoutWithTouchInterceptor, com.truecaller.rewardprogram.api.RewardProgramSource.DETAILS_VIEW);
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("rewardProgramThankYouSnackbar");
                throw null;
            }
            return;
        }
        if (eVar instanceof bk2.a) {
            com.truecaller.rewardprogram.api.model.ProgressConfig progressConfig = ((bk2.a) eVar).a;
            gVar.E("DetailsViewV2");
            com.truecaller.details_view.ui.u uVar2 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
            if (uVar2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressConfig, "progressConfig");
                com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy2 = ((com.truecaller.details_view.ui.x0) uVar2).b;
                hk2.s sVar = detailsViewActivityLegacy2.s0;
                if (sVar != null) {
                    ea1.bar barVar2 = detailsViewActivityLegacy2.C0;
                    if (barVar2 != null) {
                        com.truecaller.ui.view.ConstraintLayoutWithTouchInterceptor constraintLayoutWithTouchInterceptor2 = barVar2.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayoutWithTouchInterceptor2, "getRoot(...)");
                        sVar.K(constraintLayoutWithTouchInterceptor2, new hk2.r(progressConfig), com.truecaller.rewardprogram.api.RewardProgramSource.DETAILS_VIEW);
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("rewardProgramProgressSnackbar");
                throw null;
            }
            return;
        }
        if (eVar instanceof bk2.b) {
            com.truecaller.details_view.ui.u uVar3 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
            if (uVar3 != null) {
                bk2.b bVar = (bk2.b) eVar;
                com.truecaller.rewardprogram.api.model.ProgressConfig progressConfig2 = bVar.a;
                com.truecaller.rewardprogram.api.model.ProgressConfig.ClaimableRewardConfig claimableRewardConfig = bVar.b;
                com.truecaller.details_view.ui.x0 x0Var = (com.truecaller.details_view.ui.x0) uVar3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressConfig2, "progressConfig");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimableRewardConfig, "claimRewardConfig");
                a93.c cVar = new a93.c(13, x0Var, claimableRewardConfig);
                com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy3 = x0Var.b;
                hk2.s sVar2 = detailsViewActivityLegacy3.s0;
                if (sVar2 != null) {
                    ea1.bar barVar3 = detailsViewActivityLegacy3.C0;
                    if (barVar3 != null) {
                        com.truecaller.ui.view.ConstraintLayoutWithTouchInterceptor constraintLayoutWithTouchInterceptor3 = barVar3.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayoutWithTouchInterceptor3, "getRoot(...)");
                        sVar2.L(constraintLayoutWithTouchInterceptor3, new hk2.r(progressConfig2), cVar, com.truecaller.rewardprogram.api.RewardProgramSource.DETAILS_VIEW);
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("rewardProgramProgressSnackbar");
                throw null;
            }
            return;
        }
        if (eVar instanceof bk2.qux) {
            int i = ((bk2.qux) eVar).a;
            gVar.D("DetailsViewV2");
            com.truecaller.details_view.ui.u uVar4 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
            if (uVar4 != null) {
                ((com.truecaller.details_view.ui.x0) uVar4).g(i);
                return;
            }
            return;
        }
        if (eVar instanceof bk2.d) {
        } else {
            throw new java.lang.RuntimeException();
        }
    }

    public static com.truecaller.enterpriseconfigurablecall.api.model.ContactType q2(com.truecaller.data.entity.Contact contact) {
        if (contact.U()) {
            return com.truecaller.enterpriseconfigurablecall.api.model.ContactType.Private;
        }
        if (contact.O()) {
            return com.truecaller.enterpriseconfigurablecall.api.model.ContactType.Gold;
        }
        if (contact.S()) {
            return com.truecaller.enterpriseconfigurablecall.api.model.ContactType.Priority;
        }
        if (contact.J(128)) {
            return com.truecaller.enterpriseconfigurablecall.api.model.ContactType.VerifiedBusiness;
        }
        if (contact.J(1024)) {
            return com.truecaller.enterpriseconfigurablecall.api.model.ContactType.SmallBusiness;
        }
        if (contact.R()) {
            return com.truecaller.enterpriseconfigurablecall.api.model.ContactType.Premium;
        }
        if (i71.g.F(contact)) {
            return com.truecaller.enterpriseconfigurablecall.api.model.ContactType.RCS;
        }
        return com.truecaller.enterpriseconfigurablecall.api.model.ContactType.Default;
    }

    public final boolean f2(com.truecaller.data.entity.Contact contact) {
        com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber;
        java.util.List C = contact.C();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "getNumbers(...)");
        java.util.List<com.truecaller.data.entity.Number> list = C;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return false;
        }
        for (com.truecaller.data.entity.Number number : list) {
            java.lang.String str = number.f;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "getNormalizedNumber(...)");
            t41.e0 e0Var = this.T;
            if (e0Var.p(str) == null) {
                java.lang.String str2 = number.h;
                if (str2 != null) {
                    phoneNumber = e0Var.p(str2);
                } else {
                    phoneNumber = null;
                }
                if (phoneNumber != null) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object g2(ff3.qux quxVar) {
        com.truecaller.details_view.ui.y yVar;
        int i;
        com.truecaller.details_view.ui.u uVar;
        if (quxVar instanceof com.truecaller.details_view.ui.y) {
            yVar = (com.truecaller.details_view.ui.y) quxVar;
            int i2 = yVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = yVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = yVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.details_view.ui.d1 d1Var = this.d0;
                    if (d1Var != null) {
                        com.truecaller.details_view.analytics.SourceType sourceType = this.g0;
                        yVar.z = 1;
                        obj = this.r.e(d1Var, sourceType, yVar);
                        if (obj == barVar) {
                            return barVar;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
                java.util.List list = (java.util.List) obj;
                uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
                if (uVar != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "optionsMenu");
                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = ((com.truecaller.details_view.ui.x0) uVar).b;
                    java.util.ArrayList arrayList = detailsViewActivityLegacy.M0;
                    arrayList.clear();
                    arrayList.addAll(list);
                    detailsViewActivityLegacy.invalidateOptionsMenu();
                }
                return kotlin.Unit.a;
            }
        }
        yVar = new com.truecaller.details_view.ui.y(this, quxVar);
        java.lang.Object obj2 = yVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = yVar.z;
        if (i == 0) {
        }
        java.util.List list2 = (java.util.List) obj2;
        uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
        if (uVar != null) {
        }
        return kotlin.Unit.a;
    }

    public final boolean h2() {
        com.truecaller.details_view.ui.d1 d1Var;
        if (this.I.b() && (d1Var = this.d0) != null) {
            if (d1Var != null) {
                if (this.G.a(d1Var.a)) {
                    return true;
                }
                return false;
            }
            kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
            throw null;
        }
        return false;
    }

    public final void j2(kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onComplete");
        if (!((qo1.baz) this.U).b.a("featureDetailsOverlayAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
            function0.invoke();
        } else {
            fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux(this, function0, (df3.bar) null, 12), 3);
        }
    }

    public final void k2(com.truecaller.details_view.analytics.SourceType sourceType) {
        java.lang.String str;
        if (sourceType == null) {
            return;
        }
        qa1.a aVar = (qa1.a) this.q;
        aVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        ra1.bar barVar = aVar.e;
        com.truecaller.details_view.analytics.SourceType sourceType2 = barVar.a;
        if ((com.truecaller.details_view.analytics.SourceType.AfterInAppOutgoingCall == sourceType || com.truecaller.details_view.analytics.SourceType.AfterOutgoingVoipCall == sourceType) && com.truecaller.details_view.analytics.SourceType.CallFromDV == sourceType2) {
            barVar.a = null;
            return;
        }
        barVar.a = sourceType;
        nc0.bar barVar2 = aVar.a;
        java.lang.String str2 = aVar.h;
        int i = qa1.qux.a[sourceType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = sourceType.name();
            } else {
                str = "callTab_recents";
            }
        } else {
            str = "callTab_contacts";
        }
        bd.bar.u(barVar2, str2, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l2(ff3.qux quxVar) {
        com.truecaller.details_view.ui.a0 a0Var;
        int i;
        com.truecaller.details_view.ui.u uVar;
        java.util.List list;
        java.util.Iterator it;
        java.util.Iterator it2;
        java.util.ArrayList arrayList;
        java.lang.String str;
        java.util.List alternatePhoneNumbers;
        com.truecaller.contact.entity.model.BusinessProfileEntity.AlternatePhoneNumber alternatePhoneNumber;
        java.util.List alternatePhoneNumbers2;
        com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType detailsViewStateEventProperty$ActionButtonType;
        if (quxVar instanceof com.truecaller.details_view.ui.a0) {
            a0Var = (com.truecaller.details_view.ui.a0) quxVar;
            int i2 = a0Var.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0Var.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = a0Var.x;
                java.lang.Object obj2 = ef3.bar.a;
                i = a0Var.z;
                oc1.bar barVar = this.Y;
                java.lang.String str2 = null;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.details_view.ui.d1 d1Var = this.d0;
                    if (d1Var != null) {
                        if (d1Var.b instanceof com.truecaller.details_view.ui.b) {
                            com.truecaller.details_view.ui.u uVar2 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
                            if (uVar2 != null) {
                                com.truecaller.details_view.ui.x0 x0Var = (com.truecaller.details_view.ui.x0) uVar2;
                                com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = x0Var.b;
                                ea1.bar barVar2 = detailsViewActivityLegacy.C0;
                                if (barVar2 != null) {
                                    barVar2.b.removeAllViews();
                                    ea1.bar barVar3 = detailsViewActivityLegacy.C0;
                                    if (barVar3 != null) {
                                        gj.m.f0(barVar3.b);
                                        x0Var.a(false);
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                    throw null;
                                }
                            }
                            ((jd1.bar) barVar).a(com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.ActionButtons);
                            return kotlin.Unit.a;
                        }
                        a0Var.z = 1;
                        obj = this.f.I(d1Var, this, a0Var);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
                java.util.List list2 = (java.util.List) obj;
                uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
                if (uVar != null) {
                    com.truecaller.details_view.ui.x0 x0Var2 = (com.truecaller.details_view.ui.x0) uVar;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "actionButtons");
                    ea1.bar barVar4 = x0Var2.b.C0;
                    if (barVar4 != null) {
                        com.truecaller.details_view.ui.actionbutton.ActionButtonBarView actionButtonBarView = barVar4.b;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "actionButtons");
                        gj.m.j0(actionButtonBarView);
                        actionButtonBarView.removeAllViews();
                        int size = list2.size();
                        if (size != 2 && size != 3) {
                            java.util.Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                actionButtonBarView.a((la1.baz) it3.next());
                            }
                        } else {
                            android.widget.Space space = new android.widget.Space(actionButtonBarView.getContext());
                            space.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -2, 0.5f));
                            actionButtonBarView.addView(space);
                            java.util.Iterator it4 = list2.iterator();
                            while (it4.hasNext()) {
                                actionButtonBarView.a((la1.baz) it4.next());
                            }
                            android.widget.Space space2 = new android.widget.Space(actionButtonBarView.getContext());
                            space2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -2, 0.5f));
                            actionButtonBarView.addView(space2);
                        }
                        x0Var2.a(true);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "<this>");
                list = list2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    switch (la1.g.a[((la1.baz) it.next()).f.ordinal()]) {
                        case 1:
                            detailsViewStateEventProperty$ActionButtonType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType.CALL;
                            break;
                        case 2:
                            detailsViewStateEventProperty$ActionButtonType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType.MESSAGE;
                            break;
                        case 3:
                            detailsViewStateEventProperty$ActionButtonType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType.SAVE;
                            break;
                        case 4:
                            detailsViewStateEventProperty$ActionButtonType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType.EDIT;
                            break;
                        case 5:
                            detailsViewStateEventProperty$ActionButtonType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType.UNBLOCK;
                            break;
                        case 6:
                            detailsViewStateEventProperty$ActionButtonType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType.BLOCK;
                            break;
                        case 7:
                            detailsViewStateEventProperty$ActionButtonType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType.NOT_SPAM;
                            break;
                        case 8:
                            detailsViewStateEventProperty$ActionButtonType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType.PAY;
                            break;
                        case 9:
                            detailsViewStateEventProperty$ActionButtonType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$ActionButtonType.WHATS_APP;
                            break;
                        default:
                            throw new java.lang.RuntimeException();
                    }
                    arrayList2.add(detailsViewStateEventProperty$ActionButtonType);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList2, "actionButtons");
                this.K.b(new dc1.d(arrayList2));
                if ((list instanceof java.util.Collection) || !list.isEmpty()) {
                    it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((la1.baz) it2.next()).f == com.truecaller.details_view.ui.actionbutton.ActionButton$Type.CALL) {
                                com.truecaller.details_view.ui.d1 d1Var2 = this.d0;
                                if (d1Var2 != null) {
                                    com.truecaller.data.entity.Contact contact = d1Var2.a;
                                    if (contact != null) {
                                        com.truecaller.contact.entity.model.BusinessProfileEntity businessProfileEntity = contact.w;
                                        if (businessProfileEntity != null && (alternatePhoneNumbers2 = businessProfileEntity.getAlternatePhoneNumbers()) != null) {
                                            java.util.List list3 = alternatePhoneNumbers2;
                                            arrayList = new java.util.ArrayList(kotlin.collections.z.q(list3, 10));
                                            java.util.Iterator it5 = list3.iterator();
                                            while (it5.hasNext()) {
                                                arrayList.add(((com.truecaller.contact.entity.model.BusinessProfileEntity.AlternatePhoneNumber) it5.next()).getNumber());
                                            }
                                        } else {
                                            arrayList = kotlin.collections.h0.a;
                                        }
                                        qh1.bar barVar5 = new qh1.bar(arrayList, q2(contact), com.truecaller.enterpriseconfigurablecall.api.model.ConfigurableCallContext.DETAIL_VIEW_LEGACY);
                                        rh1.qux quxVar2 = this.X;
                                        if (quxVar2.b(barVar5)) {
                                            com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext configurableCallAnalyticContext = com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticContext.DETAIL_VIEW_LEGACY;
                                            com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction configurableCallAction = com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAction.SHOWN;
                                            com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticView configurableCallAnalyticView = com.truecaller.enterpriseconfigurablecall.api.analytics.ConfigurableCallAnalyticView.CALL_ACTION_CTA;
                                            com.truecaller.enterpriseconfigurablecall.api.model.ContactType q2 = q2(contact);
                                            java.lang.String s = contact.s();
                                            java.util.List C = contact.C();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "getNumbers(...)");
                                            com.truecaller.data.entity.Number number = (com.truecaller.data.entity.Number) kotlin.collections.CollectionsKt.firstOrNull(C);
                                            if (number != null) {
                                                str = number.f;
                                            } else {
                                                str = null;
                                            }
                                            com.truecaller.contact.entity.model.BusinessProfileEntity businessProfileEntity2 = contact.w;
                                            if (businessProfileEntity2 != null && (alternatePhoneNumbers = businessProfileEntity2.getAlternatePhoneNumbers()) != null && (alternatePhoneNumber = (com.truecaller.contact.entity.model.BusinessProfileEntity.AlternatePhoneNumber) kotlin.collections.CollectionsKt.firstOrNull(alternatePhoneNumbers)) != null) {
                                                str2 = alternatePhoneNumber.getNumber();
                                            }
                                            quxVar2.d(configurableCallAnalyticContext, configurableCallAction, configurableCallAnalyticView, q2, s, str, str2, null);
                                        }
                                    }
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                                    throw null;
                                }
                            }
                        }
                    }
                }
                ((jd1.bar) barVar).a(com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.ActionButtons);
                return kotlin.Unit.a;
            }
        }
        a0Var = new com.truecaller.details_view.ui.a0(this, quxVar);
        java.lang.Object obj3 = a0Var.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = a0Var.z;
        oc1.bar barVar6 = this.Y;
        java.lang.String str22 = null;
        if (i == 0) {
        }
        java.util.List list22 = (java.util.List) obj3;
        uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
        if (uVar != null) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list22, "<this>");
        list = list22;
        java.util.ArrayList arrayList22 = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList22, "actionButtons");
        this.K.b(new dc1.d(arrayList22));
        if (list instanceof java.util.Collection) {
        }
        it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
            }
        }
        ((jd1.bar) barVar6).a(com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.ActionButtons);
        return kotlin.Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.app.Activity, com.truecaller.details_view.ui.DetailsViewActivityLegacy] */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.app.Activity, com.truecaller.details_view.ui.DetailsViewActivityLegacy] */
    public final void m1() {
        android.database.ContentObserver contentObserver = this.l0;
        android.content.ContentResolver contentResolver = this.i;
        contentResolver.unregisterContentObserver(contentObserver);
        contentResolver.unregisterContentObserver(this.m0);
        com.truecaller.details_view.ui.u uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
        if (uVar != null) {
            ?? r0 = ((com.truecaller.details_view.ui.x0) uVar).b;
            tf2.k kVar = r0.n0;
            if (kVar != 0) {
                kVar.c(r0);
            } else {
                kotlin.jvm.internal.Intrinsics.n("detailViewContactDetailsInterstitialLauncher");
                throw null;
            }
        }
        com.truecaller.details_view.ui.u uVar2 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
        if (uVar2 != null) {
            ?? r03 = ((com.truecaller.details_view.ui.x0) uVar2).b;
            tf2.l lVar = r03.o0;
            if (lVar != 0) {
                lVar.c(r03);
            } else {
                kotlin.jvm.internal.Intrinsics.n("detailViewDefaultDialerInterstitialLauncher");
                throw null;
            }
        }
        qo1.baz bazVar = (qo1.baz) this.U;
        so1.a aVar = bazVar.b;
        com.truecaller.featuretoggles.FeatureState featureState = com.truecaller.featuretoggles.FeatureState.DISABLED;
        if (aVar.a("featureMultiAd", featureState)) {
            ((j80.baz) this.x.get()).e();
        } else {
            ((ma1.c) this.z.get()).v();
        }
        if (bazVar.b.a("featureMultiAdOnDvBottom", featureState)) {
            ((j80.baz) this.y.get()).e();
        } else {
            ((ma1.c) this.A.get()).v();
        }
        if (bazVar.b.a("featureDetailsViewHeaderAd", featureState)) {
            ((ma1.c) this.B.get()).v();
        }
        ((ma1.c) this.C.get()).v();
        this.K.a();
        super.m1();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x02f7. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03a9  */
    /* JADX WARN: Type inference failed for: r2v27, types: [android.content.Context, com.truecaller.details_view.ui.DetailsViewActivityLegacy] */
    /* JADX WARN: Type inference failed for: r2v32, types: [android.content.Context, com.truecaller.details_view.ui.DetailsViewActivityLegacy] */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r31v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2(com.truecaller.details_view.ui.actionbutton.ActionButton$Type actionButton$Type) {
        java.lang.Integer num;
        boolean z;
        ?? r31;
        com.truecaller.blocking.api.model.TrackingType trackingType;
        java.lang.String value;
        com.truecaller.blocking.ui.BlockRequest.BlockPolicy.ImId imId;
        java.lang.String t;
        boolean z2;
        com.truecaller.data.entity.Contact contact;
        java.lang.String u;
        rc0.b bVar;
        rc0.b j;
        int i;
        java.lang.String value2;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButton$Type, "type");
        int i2 = com.truecaller.details_view.ui.v.a[actionButton$Type.ordinal()];
        final int i3 = 3;
        qa1.baz bazVar = this.q;
        final int i4 = 1;
        final int i5 = 0;
        df3.bar barVar = null;
        switch (i2) {
            case 1:
                this.i0 = true;
                com.truecaller.details_view.ui.u uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
                if (uVar != null) {
                    com.truecaller.details_view.ui.d1 d1Var = this.d0;
                    if (d1Var != null) {
                        com.truecaller.data.entity.Contact contact2 = d1Var.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact2, "contact");
                        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = ((com.truecaller.details_view.ui.x0) uVar).b;
                        ia1.a aVar = detailsViewActivityLegacy.h0;
                        if (aVar != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsViewActivityLegacy, "activity");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact2, "contact");
                            fg3.h0.J(aVar.l, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ia1.qux(contact2, aVar, detailsViewActivityLegacy, null), 3);
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("callingRouter");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
                java.lang.String str2 = this.f0;
                if (str2 != null) {
                    qa1.a aVar2 = (qa1.a) bazVar;
                    aVar2.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "action");
                    qx2.d3 h = qx2.hg.h();
                    h.m("callLog");
                    h.l(str2);
                    h.o("call");
                    qx2.hg h2 = h.h();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "build(...)");
                    j71.g.K(h2, aVar2.a);
                    break;
                }
                break;
            case 2:
                com.truecaller.details_view.ui.u uVar2 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
                if (uVar2 != null) {
                    com.truecaller.details_view.ui.d1 d1Var2 = this.d0;
                    if (d1Var2 != null) {
                        com.truecaller.data.entity.Contact contact3 = d1Var2.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "contact");
                        androidx.fragment.app.FragmentActivity fragmentActivity = ((com.truecaller.details_view.ui.x0) uVar2).b;
                        ia1.b bVar2 = fragmentActivity.i0;
                        if (bVar2 != null) {
                            bVar2.c(fragmentActivity, contact3, true, null);
                            break;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("conversationsRouter");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
                break;
            case 3:
                fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.w(this, barVar, 10), 3);
                com.truecaller.details_view.ui.d1 d1Var3 = this.d0;
                if (d1Var3 != null) {
                    com.truecaller.data.entity.Contact contact4 = d1Var3.a;
                    com.truecaller.contact.entity.model.SpamInfoEntity spamInfoEntity = contact4.x;
                    if (spamInfoEntity != null) {
                        num = spamInfoEntity.getSpamVersion();
                    } else {
                        num = null;
                    }
                    if (contact4.l0() && this.h.j() && !h2()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean f2 = f2(contact4);
                    com.truecaller.details_view.ui.d1 d1Var4 = this.d0;
                    if (d1Var4 != null) {
                        if (d1Var4.b instanceof com.truecaller.details_view.ui.c) {
                            imId = new com.truecaller.blocking.ui.BlockRequest.BlockPolicy.ImId(kotlin.collections.x.c(new kotlin.Pair(contact4.S, num)));
                            value = com.truecaller.blocking.api.model.TrackingType.IM_ID.getValue();
                            r31 = 0;
                        } else {
                            java.util.ArrayList R = gj.m.R(contact4);
                            r31 = 0;
                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(R, 10));
                            java.util.Iterator it = R.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new kotlin.Pair((java.lang.String) it.next(), num));
                            }
                            com.truecaller.blocking.ui.BlockRequest.BlockPolicy.ImId numbers = new com.truecaller.blocking.ui.BlockRequest.BlockPolicy.Numbers(arrayList);
                            if (f2) {
                                trackingType = com.truecaller.blocking.api.model.TrackingType.PHONE_NUMBER;
                            } else {
                                trackingType = com.truecaller.blocking.api.model.TrackingType.OTHER;
                            }
                            value = trackingType.getValue();
                            imId = numbers;
                        }
                        if (i71.g.F(contact4) && ((u = contact4.u()) == null || u.length() == 0)) {
                            t = this.u.h(2132020494, new java.lang.Object[0]);
                        } else {
                            t = contact4.t();
                        }
                        java.lang.String str3 = t;
                        kotlin.jvm.internal.Intrinsics.d(str3);
                        java.lang.String u2 = contact4.u();
                        if ((u2 != null && u2.length() != 0) || i71.g.F(contact4)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        java.util.List C = contact4.C();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "getNumbers(...)");
                        java.util.ArrayList N = i71.g.N(C);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(N, 10));
                        java.util.Iterator it2 = N.iterator();
                        while (it2.hasNext()) {
                            java.lang.String str4 = (java.lang.String) it2.next();
                            kotlin.jvm.internal.Intrinsics.d(str4);
                            arrayList2.add(new com.truecaller.commentfeedback.db.NumberAndType(str4));
                        }
                        com.truecaller.data.entity.FeedbackSource feedbackSource = com.truecaller.data.entity.FeedbackSource.BLOCK_FLOW;
                        boolean h23 = h2();
                        java.util.List c = kotlin.collections.x.c(imId);
                        com.truecaller.blocking.api.model.WildCardType wildCardType = com.truecaller.blocking.api.model.WildCardType.NONE;
                        java.lang.String str5 = contact4.H;
                        if (str5 == null) {
                            contact = contact4;
                        } else {
                            contact = r31;
                        }
                        com.truecaller.blocking.ui.BlockRequest blockRequest = new com.truecaller.blocking.ui.BlockRequest(str3, z2, z, arrayList2, feedbackSource, "DetailsViewV2", c, value, "detailsView", true, wildCardType, contact, h23, false, str5, 8192);
                        com.truecaller.details_view.ui.u uVar3 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
                        if (uVar3 != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockRequest, "blockRequest");
                            com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy2 = ((com.truecaller.details_view.ui.x0) uVar3).b;
                            zj0.baz bazVar2 = detailsViewActivityLegacy2.v0;
                            if (bazVar2 != null) {
                                detailsViewActivityLegacy2.startActivityForResult(bazVar2.a(blockRequest), 1);
                                break;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("blockingActivityRouter");
                                throw r31;
                            }
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                    throw null;
                }
                break;
            case 4:
                fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.c0(this, barVar, i5), 3);
                break;
            case 5:
                com.truecaller.details_view.ui.u uVar4 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
                if (uVar4 != null) {
                    com.truecaller.details_view.ui.d1 d1Var5 = this.d0;
                    if (d1Var5 != null) {
                        ((com.truecaller.details_view.ui.x0) uVar4).b(d1Var5.a);
                        break;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
                break;
            case 6:
                com.truecaller.details_view.ui.u uVar5 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
                if (uVar5 != null) {
                    final ?? r2 = ((com.truecaller.details_view.ui.x0) uVar5).b;
                    int i6 = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
                    r2.E0(false);
                    i.d dVar = new i.d((android.content.Context) r2, 2132083476);
                    dVar.e(2132020512);
                    dVar.setPositiveButton(2132020395, new android.content.DialogInterface.OnClickListener() { // from class: com.truecaller.details_view.ui.t0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i7) {
                            switch (i5) {
                                case 0:
                                    com.truecaller.details_view.ui.i0 i0Var = (com.truecaller.details_view.ui.i0) r2.B0();
                                    fg3.h0.J(i0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ag2.h(i0Var, com.truecaller.blocking.TrackingAction.UNBLOCK, true, (df3.bar) null, 7), 3);
                                    qa1.a aVar3 = (qa1.a) i0Var.q;
                                    java.lang.String str6 = aVar3.h;
                                    java.lang.String value3 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.UNBLOCK_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value3, "action", value3, "confirm", str6), aVar3.a);
                                    return;
                                case 1:
                                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy3 = r2;
                                    qa1.a aVar4 = (qa1.a) ((com.truecaller.details_view.ui.i0) detailsViewActivityLegacy3.B0()).q;
                                    java.lang.String str7 = aVar4.h;
                                    java.lang.String value4 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.UNBLOCK_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value4, "action", value4, "cancel", str7), aVar4.a);
                                    detailsViewActivityLegacy3.E0(true);
                                    return;
                                case 2:
                                    com.truecaller.details_view.ui.i0 i0Var2 = (com.truecaller.details_view.ui.i0) r2.B0();
                                    fg3.h0.J(i0Var2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ag2.h(i0Var2, com.truecaller.blocking.TrackingAction.NOT_SPAM, false, (df3.bar) null, 7), 3);
                                    qa1.a aVar5 = (qa1.a) i0Var2.q;
                                    java.lang.String str8 = aVar5.h;
                                    java.lang.String value5 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.NOT_SPAM_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value5, "action", value5, "confirm", str8), aVar5.a);
                                    return;
                                default:
                                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy4 = r2;
                                    qa1.a aVar6 = (qa1.a) ((com.truecaller.details_view.ui.i0) detailsViewActivityLegacy4.B0()).q;
                                    java.lang.String str9 = aVar6.h;
                                    java.lang.String value6 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.NOT_SPAM_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value6, "action", value6, "cancel", str9), aVar6.a);
                                    detailsViewActivityLegacy4.E0(true);
                                    return;
                            }
                        }
                    }).setNegativeButton(2132021579, new android.content.DialogInterface.OnClickListener() { // from class: com.truecaller.details_view.ui.t0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i7) {
                            switch (i4) {
                                case 0:
                                    com.truecaller.details_view.ui.i0 i0Var = (com.truecaller.details_view.ui.i0) r2.B0();
                                    fg3.h0.J(i0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ag2.h(i0Var, com.truecaller.blocking.TrackingAction.UNBLOCK, true, (df3.bar) null, 7), 3);
                                    qa1.a aVar3 = (qa1.a) i0Var.q;
                                    java.lang.String str6 = aVar3.h;
                                    java.lang.String value3 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.UNBLOCK_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value3, "action", value3, "confirm", str6), aVar3.a);
                                    return;
                                case 1:
                                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy3 = r2;
                                    qa1.a aVar4 = (qa1.a) ((com.truecaller.details_view.ui.i0) detailsViewActivityLegacy3.B0()).q;
                                    java.lang.String str7 = aVar4.h;
                                    java.lang.String value4 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.UNBLOCK_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value4, "action", value4, "cancel", str7), aVar4.a);
                                    detailsViewActivityLegacy3.E0(true);
                                    return;
                                case 2:
                                    com.truecaller.details_view.ui.i0 i0Var2 = (com.truecaller.details_view.ui.i0) r2.B0();
                                    fg3.h0.J(i0Var2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ag2.h(i0Var2, com.truecaller.blocking.TrackingAction.NOT_SPAM, false, (df3.bar) null, 7), 3);
                                    qa1.a aVar5 = (qa1.a) i0Var2.q;
                                    java.lang.String str8 = aVar5.h;
                                    java.lang.String value5 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.NOT_SPAM_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value5, "action", value5, "confirm", str8), aVar5.a);
                                    return;
                                default:
                                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy4 = r2;
                                    qa1.a aVar6 = (qa1.a) ((com.truecaller.details_view.ui.i0) detailsViewActivityLegacy4.B0()).q;
                                    java.lang.String str9 = aVar6.h;
                                    java.lang.String value6 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.NOT_SPAM_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value6, "action", value6, "cancel", str9), aVar6.a);
                                    detailsViewActivityLegacy4.E0(true);
                                    return;
                            }
                        }
                    }).g(new android.content.DialogInterface.OnCancelListener() { // from class: com.truecaller.details_view.ui.u0
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(android.content.DialogInterface dialogInterface) {
                            switch (i5) {
                                case 0:
                                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy3 = r2;
                                    qa1.a aVar3 = (qa1.a) ((com.truecaller.details_view.ui.i0) detailsViewActivityLegacy3.B0()).q;
                                    java.lang.String str6 = aVar3.h;
                                    java.lang.String value3 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.UNBLOCK_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value3, "action", value3, "dismiss", str6), aVar3.a);
                                    detailsViewActivityLegacy3.E0(true);
                                    return;
                                default:
                                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy4 = r2;
                                    qa1.a aVar4 = (qa1.a) ((com.truecaller.details_view.ui.i0) detailsViewActivityLegacy4.B0()).q;
                                    java.lang.String str7 = aVar4.h;
                                    java.lang.String value4 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.NOT_SPAM_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value4, "action", value4, "dismiss", str7), aVar4.a);
                                    detailsViewActivityLegacy4.E0(true);
                                    return;
                            }
                        }
                    }).m();
                    break;
                }
                break;
            case 7:
                com.truecaller.details_view.ui.u uVar6 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
                if (uVar6 != null) {
                    final ?? r23 = ((com.truecaller.details_view.ui.x0) uVar6).b;
                    int i7 = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
                    r23.E0(false);
                    i.d dVar2 = new i.d((android.content.Context) r23, 2132083476);
                    dVar2.e(2132020479);
                    final int i8 = 2;
                    dVar2.setPositiveButton(2132020393, new android.content.DialogInterface.OnClickListener() { // from class: com.truecaller.details_view.ui.t0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i72) {
                            switch (i8) {
                                case 0:
                                    com.truecaller.details_view.ui.i0 i0Var = (com.truecaller.details_view.ui.i0) r23.B0();
                                    fg3.h0.J(i0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ag2.h(i0Var, com.truecaller.blocking.TrackingAction.UNBLOCK, true, (df3.bar) null, 7), 3);
                                    qa1.a aVar3 = (qa1.a) i0Var.q;
                                    java.lang.String str6 = aVar3.h;
                                    java.lang.String value3 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.UNBLOCK_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value3, "action", value3, "confirm", str6), aVar3.a);
                                    return;
                                case 1:
                                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy3 = r23;
                                    qa1.a aVar4 = (qa1.a) ((com.truecaller.details_view.ui.i0) detailsViewActivityLegacy3.B0()).q;
                                    java.lang.String str7 = aVar4.h;
                                    java.lang.String value4 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.UNBLOCK_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value4, "action", value4, "cancel", str7), aVar4.a);
                                    detailsViewActivityLegacy3.E0(true);
                                    return;
                                case 2:
                                    com.truecaller.details_view.ui.i0 i0Var2 = (com.truecaller.details_view.ui.i0) r23.B0();
                                    fg3.h0.J(i0Var2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ag2.h(i0Var2, com.truecaller.blocking.TrackingAction.NOT_SPAM, false, (df3.bar) null, 7), 3);
                                    qa1.a aVar5 = (qa1.a) i0Var2.q;
                                    java.lang.String str8 = aVar5.h;
                                    java.lang.String value5 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.NOT_SPAM_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value5, "action", value5, "confirm", str8), aVar5.a);
                                    return;
                                default:
                                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy4 = r23;
                                    qa1.a aVar6 = (qa1.a) ((com.truecaller.details_view.ui.i0) detailsViewActivityLegacy4.B0()).q;
                                    java.lang.String str9 = aVar6.h;
                                    java.lang.String value6 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.NOT_SPAM_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value6, "action", value6, "cancel", str9), aVar6.a);
                                    detailsViewActivityLegacy4.E0(true);
                                    return;
                            }
                        }
                    }).setNegativeButton(2132021579, new android.content.DialogInterface.OnClickListener() { // from class: com.truecaller.details_view.ui.t0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i72) {
                            switch (i3) {
                                case 0:
                                    com.truecaller.details_view.ui.i0 i0Var = (com.truecaller.details_view.ui.i0) r23.B0();
                                    fg3.h0.J(i0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ag2.h(i0Var, com.truecaller.blocking.TrackingAction.UNBLOCK, true, (df3.bar) null, 7), 3);
                                    qa1.a aVar3 = (qa1.a) i0Var.q;
                                    java.lang.String str6 = aVar3.h;
                                    java.lang.String value3 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.UNBLOCK_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value3, "action", value3, "confirm", str6), aVar3.a);
                                    return;
                                case 1:
                                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy3 = r23;
                                    qa1.a aVar4 = (qa1.a) ((com.truecaller.details_view.ui.i0) detailsViewActivityLegacy3.B0()).q;
                                    java.lang.String str7 = aVar4.h;
                                    java.lang.String value4 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.UNBLOCK_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value4, "action", value4, "cancel", str7), aVar4.a);
                                    detailsViewActivityLegacy3.E0(true);
                                    return;
                                case 2:
                                    com.truecaller.details_view.ui.i0 i0Var2 = (com.truecaller.details_view.ui.i0) r23.B0();
                                    fg3.h0.J(i0Var2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ag2.h(i0Var2, com.truecaller.blocking.TrackingAction.NOT_SPAM, false, (df3.bar) null, 7), 3);
                                    qa1.a aVar5 = (qa1.a) i0Var2.q;
                                    java.lang.String str8 = aVar5.h;
                                    java.lang.String value5 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.NOT_SPAM_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value5, "action", value5, "confirm", str8), aVar5.a);
                                    return;
                                default:
                                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy4 = r23;
                                    qa1.a aVar6 = (qa1.a) ((com.truecaller.details_view.ui.i0) detailsViewActivityLegacy4.B0()).q;
                                    java.lang.String str9 = aVar6.h;
                                    java.lang.String value6 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.NOT_SPAM_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value6, "action", value6, "cancel", str9), aVar6.a);
                                    detailsViewActivityLegacy4.E0(true);
                                    return;
                            }
                        }
                    }).g(new android.content.DialogInterface.OnCancelListener() { // from class: com.truecaller.details_view.ui.u0
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(android.content.DialogInterface dialogInterface) {
                            switch (i4) {
                                case 0:
                                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy3 = r23;
                                    qa1.a aVar3 = (qa1.a) ((com.truecaller.details_view.ui.i0) detailsViewActivityLegacy3.B0()).q;
                                    java.lang.String str6 = aVar3.h;
                                    java.lang.String value3 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.UNBLOCK_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value3, "action", value3, "dismiss", str6), aVar3.a);
                                    detailsViewActivityLegacy3.E0(true);
                                    return;
                                default:
                                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy4 = r23;
                                    qa1.a aVar4 = (qa1.a) ((com.truecaller.details_view.ui.i0) detailsViewActivityLegacy4.B0()).q;
                                    java.lang.String str7 = aVar4.h;
                                    java.lang.String value4 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.NOT_SPAM_DIALOG.getValue();
                                    nc0.u1.e(uf.qux.p(value4, "action", value4, "dismiss", str7), aVar4.a);
                                    detailsViewActivityLegacy4.E0(true);
                                    return;
                            }
                        }
                    }).m();
                    break;
                }
                break;
            case 8:
                com.truecaller.details_view.ui.d1 d1Var6 = this.d0;
                if (d1Var6 != null) {
                    p2(d1Var6.a);
                    break;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                    throw null;
                }
            case 9:
                fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.c0(this, barVar, i4), 3);
                break;
            default:
                throw new java.lang.RuntimeException();
        }
        com.truecaller.details_view.ui.d1 d1Var7 = this.d0;
        if (d1Var7 != null) {
            com.truecaller.data.entity.Contact contact5 = d1Var7.a;
            qa1.a aVar3 = (qa1.a) bazVar;
            java.lang.String str6 = aVar3.h;
            java.lang.String str7 = aVar3.h;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionButton$Type, "actionButtonType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact5, "contact");
            int[] iArr = qa1.qux.b;
            switch (iArr[actionButton$Type.ordinal()]) {
                case 1:
                    java.lang.String value3 = com.truecaller.analytics.common.event.ViewActionEvent.DetailsWidget.ACTION_BUTTONS.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("call", "action");
                    bVar = new rc0.b("call", value3, str6);
                    j = bVar;
                    nc0.u1.e(j, aVar3.a);
                    i = iArr[actionButton$Type.ordinal()];
                    if (i != 5) {
                        if (i != 6) {
                            str = null;
                            if (str == null) {
                                h8.s0.g(aVar3.b, contact5, str, (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(i71.g.u(contact5)), (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, 1048568);
                                return;
                            }
                            return;
                        }
                        value2 = com.truecaller.bizmon.analytic.BizmonAnalyticContext.DETAILED_VIEW_BLOCK_CLICKED.getValue();
                    } else {
                        value2 = com.truecaller.bizmon.analytic.BizmonAnalyticContext.DETAILED_VIEW_UNBLOCK_CLICKED.getValue();
                    }
                    str = value2;
                    if (str == null) {
                    }
                case 2:
                    java.lang.String value4 = com.truecaller.analytics.common.event.ViewActionEvent.DetailsWidget.ACTION_BUTTONS.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("message", "action");
                    bVar = new rc0.b("message", value4, str6);
                    j = bVar;
                    nc0.u1.e(j, aVar3.a);
                    i = iArr[actionButton$Type.ordinal()];
                    if (i != 5) {
                    }
                    str = value2;
                    if (str == null) {
                    }
                    break;
                case 3:
                    java.lang.String value5 = com.truecaller.analytics.common.event.ViewActionEvent.DetailsWidget.ACTION_BUTTONS.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("save", "action");
                    bVar = new rc0.b("save", value5, str6);
                    j = bVar;
                    nc0.u1.e(j, aVar3.a);
                    i = iArr[actionButton$Type.ordinal()];
                    if (i != 5) {
                    }
                    str = value2;
                    if (str == null) {
                    }
                    break;
                case 4:
                    java.lang.String value6 = com.truecaller.analytics.common.event.ViewActionEvent.DetailsWidget.ACTION_BUTTONS.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("edit", "action");
                    bVar = new rc0.b("edit", value6, str6);
                    j = bVar;
                    nc0.u1.e(j, aVar3.a);
                    i = iArr[actionButton$Type.ordinal()];
                    if (i != 5) {
                    }
                    str = value2;
                    if (str == null) {
                    }
                    break;
                case 5:
                    j = p22.bar.j(str7, com.truecaller.analytics.common.event.ViewActionEvent.BlockingAction.UNBLOCK);
                    nc0.u1.e(j, aVar3.a);
                    i = iArr[actionButton$Type.ordinal()];
                    if (i != 5) {
                    }
                    str = value2;
                    if (str == null) {
                    }
                    break;
                case 6:
                    j = p22.bar.j(str7, com.truecaller.analytics.common.event.ViewActionEvent.BlockingAction.BLOCK);
                    nc0.u1.e(j, aVar3.a);
                    i = iArr[actionButton$Type.ordinal()];
                    if (i != 5) {
                    }
                    str = value2;
                    if (str == null) {
                    }
                    break;
                case 7:
                    j = p22.bar.j(str7, com.truecaller.analytics.common.event.ViewActionEvent.BlockingAction.NOTSPAM);
                    nc0.u1.e(j, aVar3.a);
                    i = iArr[actionButton$Type.ordinal()];
                    if (i != 5) {
                    }
                    str = value2;
                    if (str == null) {
                    }
                    break;
                case 8:
                    java.lang.String value7 = com.truecaller.analytics.common.event.ViewActionEvent.DetailsWidget.ACTION_BUTTONS.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("pay", "action");
                    bVar = new rc0.b("pay", value7, str6);
                    j = bVar;
                    nc0.u1.e(j, aVar3.a);
                    i = iArr[actionButton$Type.ordinal()];
                    if (i != 5) {
                    }
                    str = value2;
                    if (str == null) {
                    }
                    break;
                case 9:
                    com.truecaller.analytics.common.event.ViewActionEvent.WhatsAppSubAction whatsAppSubAction = com.truecaller.analytics.common.event.ViewActionEvent.WhatsAppSubAction.APP_OPEN;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whatsAppSubAction, "subAction");
                    j = uf.qux.p("WhatsApp", "action", "WhatsApp", whatsAppSubAction.getValue(), str6);
                    nc0.u1.e(j, aVar3.a);
                    i = iArr[actionButton$Type.ordinal()];
                    if (i != 5) {
                    }
                    str = value2;
                    if (str == null) {
                    }
                    break;
                default:
                    throw new java.lang.RuntimeException();
            }
        } else {
            kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.app.Activity, com.truecaller.details_view.ui.DetailsViewActivityLegacy] */
    /* JADX WARN: Type inference failed for: r3v17, types: [android.app.Activity, com.truecaller.details_view.ui.DetailsViewActivityLegacy] */
    public final void n2(ja1.qux quxVar) {
        com.truecaller.details_view.analytics.SourceType sourceType;
        com.truecaller.details_view.ui.u uVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "detailsViewParams");
        com.truecaller.details_view.routing.DetailsViewLaunchSourceLegacy detailsViewLaunchSourceLegacy = quxVar.h;
        df3.bar barVar = null;
        if (detailsViewLaunchSourceLegacy != null) {
            sourceType = detailsViewLaunchSourceLegacy.a;
        } else {
            sourceType = null;
        }
        com.truecaller.detailsviewlegacy.api.DetailsViewOutgoingCallSource detailsViewOutgoingCallSource = quxVar.l;
        com.truecaller.details_view.ui.u uVar2 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
        if (uVar2 != null) {
            ?? r3 = ((com.truecaller.details_view.ui.x0) uVar2).b;
            tf2.l lVar = r3.o0;
            if (lVar != 0) {
                lVar.c(r3);
            } else {
                kotlin.jvm.internal.Intrinsics.n("detailViewDefaultDialerInterstitialLauncher");
                throw null;
            }
        }
        com.truecaller.details_view.ui.u uVar3 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
        if (uVar3 != null) {
            ?? r33 = ((com.truecaller.details_view.ui.x0) uVar3).b;
            tf2.k kVar = r33.n0;
            if (kVar != 0) {
                kVar.c(r33);
            } else {
                kotlin.jvm.internal.Intrinsics.n("detailViewContactDetailsInterstitialLauncher");
                throw null;
            }
        }
        qc3.bar barVar2 = this.W;
        if (!((u03.b) barVar2.get()).o() && ((u03.b) barVar2.get()).b() && kotlin.collections.CollectionsKt.N(this.a0, sourceType) && kotlin.collections.CollectionsKt.N(this.c0, detailsViewOutgoingCallSource)) {
            com.truecaller.details_view.ui.u uVar4 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
            if (uVar4 != null) {
                com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = ((com.truecaller.details_view.ui.x0) uVar4).b;
                tf2.l lVar2 = detailsViewActivityLegacy.o0;
                if (lVar2 != null) {
                    lVar2.b(detailsViewActivityLegacy);
                } else {
                    kotlin.jvm.internal.Intrinsics.n("detailViewDefaultDialerInterstitialLauncher");
                    throw null;
                }
            }
        } else if (!kotlin.collections.CollectionsKt.N(this.b0, sourceType) && (uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a) != null) {
            com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy2 = ((com.truecaller.details_view.ui.x0) uVar).b;
            tf2.k kVar2 = detailsViewActivityLegacy2.n0;
            if (kVar2 != null) {
                kVar2.b(detailsViewActivityLegacy2);
            } else {
                kotlin.jvm.internal.Intrinsics.n("detailViewContactDetailsInterstitialLauncher");
                throw null;
            }
        }
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.w(this, barVar, 2), 3);
        this.h0 = fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.f0(quxVar, this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0d5b, code lost:
    
        if (r1.l2(r2) != r3) goto L646;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:539:0x0309. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0891 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x08a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04ce  */
    /* JADX WARN: Type inference failed for: r3v27, types: [android.content.Context, com.truecaller.details_view.ui.DetailsViewActivityLegacy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object o2(ff3.qux quxVar) {
        com.truecaller.details_view.ui.g0 g0Var;
        int i;
        com.truecaller.details_view.ui.g0 g0Var2;
        ef3.bar barVar;
        com.truecaller.details_view.ui.b bVar;
        java.lang.String str;
        java.lang.String str2;
        com.truecaller.details_view.ui.i0 i0Var;
        java.util.ArrayList<com.truecaller.details_view.ui.widget.WidgetType> arrayList;
        com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType detailsViewStateEventProperty$WidgetType;
        com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent detailsViewTTFDComponent;
        java.util.ArrayList arrayList2;
        com.truecaller.details_view.ui.widget.WidgetType widgetType;
        fg3.e0 e0Var;
        com.truecaller.data.entity.Contact contact;
        int i2;
        boolean z;
        com.truecaller.details_view.ui.b bVar2;
        java.lang.Throwable th;
        int i3;
        kotlin.Pair pair;
        kotlin.Pair pair2;
        java.lang.Integer num;
        com.truecaller.details_view.ui.d1 d1Var;
        java.lang.Throwable th2;
        int i4;
        java.lang.String string;
        kotlin.Pair pair3;
        java.lang.String s;
        java.lang.String Q;
        com.truecaller.details_view.ui.s0 s0Var;
        java.lang.String Q2;
        boolean z2;
        lf2.r rVar;
        kw2.bar a;
        fg3.f0 f0Var;
        zp2.a a2;
        rx2.c cVar;
        com.truecaller.details_view.ui.s0 s0Var2;
        com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$AltNameSource detailsViewStateEventProperty$AltNameSource;
        java.util.stream.IntStream chars;
        com.truecaller.details_view.ui.s0 s0Var3;
        int i5;
        if (quxVar instanceof com.truecaller.details_view.ui.g0) {
            g0Var = (com.truecaller.details_view.ui.g0) quxVar;
            int i6 = g0Var.z;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                g0Var.z = i6 - Integer.MIN_VALUE;
                java.lang.Object obj = g0Var.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = g0Var.z;
                if (i != 0) {
                    od.p.E(obj);
                    com.truecaller.details_view.ui.u uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
                    if (uVar != null) {
                        ((com.truecaller.details_view.ui.x0) uVar).b.z0().E = this.e0;
                    }
                    com.truecaller.details_view.ui.u uVar2 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
                    com.truecaller.details_view.ui.b bVar3 = com.truecaller.details_view.ui.b.m;
                    com.truecaller.details_view.ui.bar barVar3 = com.truecaller.details_view.ui.bar.m;
                    if (uVar2 != null) {
                        com.truecaller.details_view.ui.d1 d1Var2 = this.d0;
                        if (d1Var2 != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d1Var2, "detailsViewModel");
                            fg3.e0 z0 = ((com.truecaller.details_view.ui.x0) uVar2).b.z0();
                            kotlin.coroutines.CoroutineContext coroutineContext = z0.d;
                            qo1.qux quxVar2 = z0.q;
                            tc1.bar barVar4 = z0.x;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d1Var2, "detailsViewModel");
                            z0.D = d1Var2;
                            com.truecaller.data.entity.Contact contact2 = d1Var2.a;
                            boolean z3 = d1Var2.j;
                            ne0.baz bazVar = d1Var2.b;
                            xb1.c cVar2 = d1Var2.c.a;
                            boolean z4 = bazVar instanceof com.truecaller.details_view.ui.m;
                            boolean z5 = contact2.X() && !z3;
                            w31.g gVar = z0.f;
                            gVar.getClass();
                            com.truecaller.common.ui.avatar.AvatarXConfig a3 = gVar.a(contact2);
                            int i7 = cVar2.j;
                            int i8 = cVar2.c;
                            qo1.a aVar = (qo1.a) quxVar2;
                            com.truecaller.common.ui.avatar.AvatarXConfig a4 = com.truecaller.common.ui.avatar.AvatarXConfig.a(a3, (android.net.Uri) null, (java.lang.String) null, z5, false, false, false, java.lang.Integer.valueOf(i7), z4, false, false, aVar.h() && contact2.V(), false, (java.lang.String) null, false, false, -16826385);
                            z0.m.getClass();
                            z0.G = fg0.baz.a(contact2.t, 2) && !contact2.Q() && (contact2.W & 16) == 0;
                            com.truecaller.details_view.ui.s0 s0Var4 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) z0).a;
                            if (s0Var4 != null) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a4, "avatarXConfig");
                                com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = s0Var4.c;
                                ea1.bar barVar5 = detailsViewActivityLegacy.C0;
                                if (barVar5 != null) {
                                    com.truecaller.common.ui.avatar.AvatarXView avatarXView = barVar5.e;
                                    e0Var = z0;
                                    contact = contact2;
                                    i2 = i8;
                                    z = false;
                                    w31.c cVar3 = new w31.c(detailsViewActivityLegacy.D0(), 0);
                                    avatarXView.setPresenter(cVar3);
                                    cVar3.C2(a4, false);
                                    ea1.bar barVar6 = detailsViewActivityLegacy.C0;
                                    if (barVar6 == null) {
                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                        throw null;
                                    }
                                    barVar6.e.setOnClickListener(new ah1.bar(9, detailsViewActivityLegacy, a4));
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                    throw null;
                                }
                            } else {
                                e0Var = z0;
                                contact = contact2;
                                i2 = i8;
                                z = false;
                            }
                            android.net.Uri uri = a4.a;
                            barVar4.b(new dc1.e(uri != null ? uri.toString() : null));
                            fg3.e0 e0Var2 = e0Var;
                            boolean z6 = z;
                            com.truecaller.data.entity.Contact contact3 = contact;
                            int i9 = i2;
                            barVar = barVar2;
                            fg3.h0.J(e0Var2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new eo2.q(e0Var2, contact3, bazVar, (df3.bar) null, 21), 3);
                            com.truecaller.details_view.ui.s0 s0Var5 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                            if (s0Var5 != null) {
                                com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy2 = s0Var5.c;
                                th = null;
                                android.graphics.drawable.Drawable drawable = cVar2.h;
                                g0Var2 = g0Var;
                                int i10 = cVar2.g;
                                int i11 = cVar2.f;
                                bVar2 = bVar3;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "background");
                                ea1.bar barVar7 = detailsViewActivityLegacy2.C0;
                                if (barVar7 != null) {
                                    barVar7.I.setBackground(drawable);
                                    ea1.bar barVar8 = detailsViewActivityLegacy2.C0;
                                    if (barVar8 != null) {
                                        androidx.constraintlayout.motion.widget.MotionLayout motionLayout = barVar8.p;
                                        com.truecaller.details_view.ui.q0 q0Var = s0Var5.a;
                                        java.util.ArrayList arrayList3 = motionLayout.c0;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(q0Var);
                                        }
                                        com.truecaller.details_view.ui.q0 q0Var2 = new com.truecaller.details_view.ui.q0(i10, i11, s0Var5);
                                        s0Var5.a = q0Var2;
                                        ea1.bar barVar9 = detailsViewActivityLegacy2.C0;
                                        if (barVar9 != null) {
                                            barVar9.p.F(q0Var2);
                                            s0Var5.f(i11, i10);
                                            xb1.f fVar = cVar2.a;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "statusBarAppearance");
                                            ea1.bar barVar10 = detailsViewActivityLegacy2.C0;
                                            if (barVar10 != null) {
                                                androidx.constraintlayout.motion.widget.MotionLayout motionLayout2 = barVar10.p;
                                                com.truecaller.details_view.ui.s0.d(s0Var5, fVar, java.lang.Float.valueOf(motionLayout2.getProgress()), java.lang.Integer.valueOf(motionLayout2.getCurrentState()));
                                                ea1.bar barVar11 = detailsViewActivityLegacy2.C0;
                                                if (barVar11 != null) {
                                                    androidx.constraintlayout.motion.widget.MotionLayout motionLayout3 = barVar11.p;
                                                    com.truecaller.details_view.ui.r0 r0Var = s0Var5.b;
                                                    java.util.ArrayList arrayList4 = motionLayout3.c0;
                                                    if (arrayList4 != null) {
                                                        arrayList4.remove(r0Var);
                                                    }
                                                    com.truecaller.details_view.ui.r0 r0Var2 = new com.truecaller.details_view.ui.r0(s0Var5, fVar);
                                                    s0Var5.b = r0Var2;
                                                    ea1.bar barVar12 = detailsViewActivityLegacy2.C0;
                                                    if (barVar12 == null) {
                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                    barVar12.p.F(r0Var2);
                                                } else {
                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                    throw null;
                                                }
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                    throw null;
                                }
                            } else {
                                g0Var2 = g0Var;
                                bVar2 = bVar3;
                                th = null;
                            }
                            if (aVar.i() && i71.g.E(contact3)) {
                                com.truecaller.details_view.ui.s0 s0Var6 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                if (s0Var6 != null) {
                                    s0Var6.a();
                                }
                            } else {
                                if (contact3.Q()) {
                                    i3 = 2132020488;
                                } else {
                                    i3 = contact3.L() ? 2132020422 : cVar2.b;
                                }
                                java.lang.String s2 = contact3.s();
                                if (s2 == null || s2.length() == 0) {
                                    i3 = 2132020441;
                                }
                                com.truecaller.details_view.ui.s0 s0Var7 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                if (s0Var7 != null) {
                                    android.graphics.drawable.Drawable drawable2 = cVar2.d;
                                    java.lang.Integer num2 = cVar2.e;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(new gb1.f(i3, i9, drawable2, num2), "source");
                                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy3 = s0Var7.c;
                                    java.lang.String string2 = detailsViewActivityLegacy3.getResources().getString(i3);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                    ea1.bar barVar13 = detailsViewActivityLegacy3.C0;
                                    if (barVar13 != null) {
                                        android.widget.TextView textView = barVar13.v;
                                        gj.m.k0(textView, !kotlin.text.StringsKt.X(string2));
                                        textView.setText(string2);
                                        android.content.res.ColorStateList withAlpha = android.content.res.ColorStateList.valueOf(i9).withAlpha(180);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(withAlpha, "withAlpha(...)");
                                        textView.setTextColor(withAlpha);
                                        ea1.bar barVar14 = detailsViewActivityLegacy3.C0;
                                        if (barVar14 != null) {
                                            android.widget.ImageView imageView = barVar14.w;
                                            gj.m.k0(imageView, drawable2 != null ? true : z6 ? 1 : 0);
                                            if (drawable2 != null) {
                                                imageView.setImageDrawable(drawable2);
                                            }
                                            if (num2 != null) {
                                                imageView.setColorFilter(num2.intValue());
                                            }
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                            throw th;
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                        throw th;
                                    }
                                }
                            }
                            com.truecaller.blocking.FilterMatch filterMatch = d1Var2.n;
                            if (filterMatch == null) {
                                com.truecaller.details_view.ui.s0 s0Var8 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                if (s0Var8 != null) {
                                    ea1.bar barVar15 = s0Var8.c.C0;
                                    if (barVar15 == null) {
                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                        throw th;
                                    }
                                    android.widget.TextView textView2 = barVar15.l;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView2, "filterMatchReason");
                                    gj.m.f0(textView2);
                                }
                                d1Var = d1Var2;
                            } else {
                                com.truecaller.blocking.ActionSource actionSource = filterMatch.c;
                                java.lang.Long l = filterMatch.k;
                                switch (gb1.bar.c[actionSource.ordinal()]) {
                                    case 1:
                                        pair = new kotlin.Pair(2132020453, th);
                                        pair2 = pair;
                                        num = (java.lang.Integer) pair2.a;
                                        java.lang.Long l2 = (java.lang.Long) pair2.b;
                                        if (num == null) {
                                            com.truecaller.details_view.ui.s0 s0Var9 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                            if (s0Var9 != null) {
                                                int intValue = num.intValue();
                                                ?? r3 = s0Var9.c;
                                                ea1.bar barVar16 = r3.C0;
                                                if (barVar16 != null) {
                                                    android.widget.TextView textView3 = barVar16.l;
                                                    gj.m.j0(textView3);
                                                    if (l2 != null) {
                                                        if (l2.longValue() == -1) {
                                                            java.lang.Object[] objArr = new java.lang.Object[1];
                                                            objArr[z6 ? 1 : 0] = "";
                                                            string = r3.getString(intValue, objArr);
                                                            i4 = i9;
                                                            d1Var = d1Var2;
                                                        } else {
                                                            qz1.bar barVar17 = r3.p0;
                                                            if (barVar17 != 0) {
                                                                i4 = i9;
                                                                d1Var = d1Var2;
                                                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                                                objArr2[z6 ? 1 : 0] = barVar17.a(r3, l2.longValue());
                                                                string = r3.getString(intValue, objArr2);
                                                            } else {
                                                                kotlin.jvm.internal.Intrinsics.n("dateTimeUtil");
                                                                throw null;
                                                            }
                                                        }
                                                        th = null;
                                                    } else {
                                                        i4 = i9;
                                                        d1Var = d1Var2;
                                                        th = null;
                                                        string = r3.getString(intValue);
                                                    }
                                                    textView3.setText(string);
                                                    android.content.res.ColorStateList withAlpha2 = android.content.res.ColorStateList.valueOf(i4).withAlpha(180);
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(withAlpha2, "withAlpha(...)");
                                                    textView3.setTextColor(withAlpha2);
                                                    break;
                                                } else {
                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                    throw null;
                                                }
                                            } else {
                                                d1Var = d1Var2;
                                            }
                                        } else {
                                            d1Var = d1Var2;
                                            com.truecaller.details_view.ui.s0 s0Var10 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                            if (s0Var10 != null) {
                                                ea1.bar barVar18 = s0Var10.c.C0;
                                                if (barVar18 == null) {
                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                android.widget.TextView textView4 = barVar18.l;
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView4, "filterMatchReason");
                                                gj.m.f0(textView4);
                                            }
                                        }
                                        th2 = null;
                                        if (!e0Var2.F) {
                                            fg3.h0.J(e0Var2, coroutineContext, th2, new ag2.l(e0Var2, contact3, th2), 2);
                                        }
                                        s = contact3.s();
                                        if (s != null || kotlin.text.StringsKt.X(s) || contact3.G() == 20) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                            Q = gj.m.Q(contact3);
                                            if (!((Q != null || kotlin.text.StringsKt.X(Q)) ? true : z6 ? 1 : 0) && !i71.g.F(contact3)) {
                                                s0Var = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                if (s0Var != null) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "contact");
                                                    com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy4 = s0Var.c;
                                                    ea1.bar barVar19 = detailsViewActivityLegacy4.C0;
                                                    if (barVar19 != null) {
                                                        android.widget.TextView textView5 = barVar19.u;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView5, "searchWeb");
                                                        gj.m.k0(textView5, true);
                                                        ea1.bar barVar20 = detailsViewActivityLegacy4.C0;
                                                        if (barVar20 == null) {
                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        barVar20.u.setOnClickListener(new ah1.bar(10, detailsViewActivityLegacy4, contact3));
                                                    } else {
                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                        throw null;
                                                    }
                                                }
                                                java.util.ArrayList l0 = gj.m.l0(contact3.t);
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l0, "splitBadges(...)");
                                                barVar4.b(new dc1.i(l0));
                                                barVar4.b(new dc1.k(contact3.Q()));
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                                Q2 = gj.m.Q(contact3);
                                                if (Q2 != null) {
                                                    java.util.List list = t41.i0.a;
                                                    chars = Q2.chars();
                                                    z2 = chars.anyMatch(new t41.g0(0));
                                                } else {
                                                    z2 = false;
                                                }
                                                if (z2) {
                                                    barVar4.b(new dc1.n(gj.m.Q(contact3)));
                                                }
                                                if (bazVar instanceof com.truecaller.details_view.ui.b) {
                                                    com.truecaller.details_view.ui.s0 s0Var11 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                    if (s0Var11 != null) {
                                                        ea1.bar barVar21 = s0Var11.c.C0;
                                                        if (barVar21 == null) {
                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        android.widget.TextView textView6 = barVar21.t;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView6, "privateUserInformation");
                                                        gj.m.j0(textView6);
                                                    }
                                                    com.truecaller.details_view.ui.s0 s0Var12 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                    if (s0Var12 != null) {
                                                        ea1.bar barVar22 = s0Var12.c.C0;
                                                        if (barVar22 == null) {
                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        android.widget.TextView textView7 = barVar22.c;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView7, "altName");
                                                        gj.m.f0(textView7);
                                                    }
                                                    com.truecaller.details_view.ui.s0 s0Var13 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                    if (s0Var13 != null) {
                                                        s0Var13.a();
                                                    }
                                                    com.truecaller.details_view.ui.s0 s0Var14 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                    if (s0Var14 != null) {
                                                        s0Var14.b();
                                                    }
                                                    com.truecaller.details_view.ui.s0 s0Var15 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                    if (s0Var15 != null) {
                                                        ea1.bar barVar23 = s0Var15.c.C0;
                                                        if (barVar23 == null) {
                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        com.truecaller.common.ui.tag.TagXView tagXView = barVar23.C;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagXView, "tag");
                                                        gj.m.f0(tagXView);
                                                    }
                                                    com.truecaller.details_view.ui.s0 s0Var16 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                    if (s0Var16 != null) {
                                                        ea1.bar barVar24 = s0Var16.c.C0;
                                                        if (barVar24 == null) {
                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        com.truecaller.timezone.TimezoneView timezoneView = barVar24.D;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(timezoneView, "timezone");
                                                        gj.m.f0(timezoneView);
                                                    }
                                                    com.truecaller.details_view.ui.s0 s0Var17 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                    if (s0Var17 != null) {
                                                        ea1.bar barVar25 = s0Var17.c.C0;
                                                        if (barVar25 == null) {
                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        com.truecaller.truecontext.TrueContext trueContext = barVar25.F;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trueContext, "trueContext");
                                                        gj.m.f0(trueContext);
                                                    }
                                                    str = "<this>";
                                                    str2 = "detailsViewModel";
                                                } else {
                                                    com.truecaller.details_view.ui.s0 s0Var18 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                    if (s0Var18 != null) {
                                                        ea1.bar barVar26 = s0Var18.c.C0;
                                                        if (barVar26 == null) {
                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        android.widget.TextView textView8 = barVar26.t;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView8, "privateUserInformation");
                                                        gj.m.f0(textView8);
                                                    }
                                                    com.truecaller.details_view.ui.s0 s0Var19 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                    com.truecaller.details_view.ui.d1 d1Var3 = d1Var;
                                                    if (s0Var19 != null) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d1Var3, "detailsViewModel");
                                                        ea1.bar barVar27 = s0Var19.c.C0;
                                                        if (barVar27 == null) {
                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        barVar27.s.set(d1Var3);
                                                    }
                                                    boolean z7 = contact3.J(64) || contact3.J(128) || contact3.S() || (aVar.h() && contact3.J(1024));
                                                    if (contact3.Q() || z7) {
                                                        str = "<this>";
                                                    } else {
                                                        java.lang.String str3 = contact3.J;
                                                        if (str3 != null) {
                                                            int length = str3.length();
                                                            str = "<this>";
                                                            int i13 = 0;
                                                            while (i13 < length) {
                                                                int codePointAt = str3.codePointAt(i13);
                                                                if (!java.lang.Character.isWhitespace(codePointAt)) {
                                                                    rVar = new lf2.r(contact3.J, com.truecaller.data.entity.AltNameForDisplay$AltNameSource.TRANSLITERATED_NAME);
                                                                    if (rVar != null) {
                                                                        int i14 = gb1.bar.a[((com.truecaller.data.entity.AltNameForDisplay$AltNameSource) rVar.b).ordinal()];
                                                                        if (i14 == 1) {
                                                                            detailsViewStateEventProperty$AltNameSource = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$AltNameSource.ALT_NAME;
                                                                        } else if (i14 == 2) {
                                                                            detailsViewStateEventProperty$AltNameSource = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$AltNameSource.TRANSLITERATED_NAME;
                                                                        } else {
                                                                            throw new java.lang.RuntimeException();
                                                                        }
                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsViewStateEventProperty$AltNameSource, "altNameSource");
                                                                        barVar4.b(new dc1.f(detailsViewStateEventProperty$AltNameSource));
                                                                        com.truecaller.details_view.ui.s0 s0Var20 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                                        if (s0Var20 != null) {
                                                                            str2 = "detailsViewModel";
                                                                            java.lang.String str4 = "(" + ((java.lang.String) rVar.a) + ")";
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "altName");
                                                                            ea1.bar barVar28 = s0Var20.c.C0;
                                                                            if (barVar28 != null) {
                                                                                android.widget.TextView textView9 = barVar28.c;
                                                                                gj.m.j0(textView9);
                                                                                textView9.setText(str4);
                                                                            } else {
                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            str2 = "detailsViewModel";
                                                                        }
                                                                    } else {
                                                                        str2 = "detailsViewModel";
                                                                        barVar4.b(new dc1.f(null));
                                                                        com.truecaller.details_view.ui.s0 s0Var21 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                                        if (s0Var21 != null) {
                                                                            ea1.bar barVar29 = s0Var21.c.C0;
                                                                            if (barVar29 == null) {
                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                throw null;
                                                                            }
                                                                            android.widget.TextView textView10 = barVar29.c;
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView10, "altName");
                                                                            gj.m.f0(textView10);
                                                                        }
                                                                    }
                                                                    a = e0Var2.g.a(contact3);
                                                                    if (a != null) {
                                                                        java.lang.String str5 = a.b;
                                                                        java.lang.String str6 = a.e;
                                                                        xb1.d dVar = cVar2.i;
                                                                        gb1.h hVar = new gb1.h(str5, str6, dVar);
                                                                        com.truecaller.details_view.ui.s0 s0Var22 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                                        if (s0Var22 != null) {
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "tag");
                                                                            ea1.bar barVar30 = s0Var22.c.C0;
                                                                            if (barVar30 != null) {
                                                                                com.truecaller.common.ui.tag.TagXView tagXView2 = barVar30.C;
                                                                                gj.m.j0(tagXView2);
                                                                                tagXView2.setTitle(str5);
                                                                                tagXView2.setIcon(str6);
                                                                                dVar.d(tagXView2);
                                                                            } else {
                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        barVar4.b(new dc1.r(java.lang.Long.valueOf(a.a)));
                                                                        f0Var = null;
                                                                    } else {
                                                                        com.truecaller.details_view.ui.s0 s0Var23 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                                        if (s0Var23 != null) {
                                                                            ea1.bar barVar31 = s0Var23.c.C0;
                                                                            if (barVar31 == null) {
                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                throw null;
                                                                            }
                                                                            com.truecaller.common.ui.tag.TagXView tagXView3 = barVar31.C;
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagXView3, "tag");
                                                                            gj.m.f0(tagXView3);
                                                                        }
                                                                        f0Var = null;
                                                                        barVar4.b(new dc1.r(null));
                                                                    }
                                                                    fg3.h0.J(e0Var2, coroutineContext, f0Var, new g10.z0(e0Var2, contact3, f0Var, 6), 2);
                                                                    fg3.h0.J(e0Var2, coroutineContext, f0Var, new g10.z0(e0Var2, d1Var3, f0Var, 5), 2);
                                                                    ac1.f fVar2 = e0Var2.l;
                                                                    java.lang.Integer num3 = e0Var2.E;
                                                                    int intValue2 = num3 != null ? num3.intValue() : 999;
                                                                    fVar2.getClass();
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "contact");
                                                                    tp2.c cVar4 = fVar2.c;
                                                                    a2 = zp2.d.a(contact3);
                                                                    if (!((a2.b || a2.f || a2.e || a2.a.isEmpty()) ? false : true)) {
                                                                        java.lang.Object obj2 = fVar2.a.get();
                                                                        zp2.e eVar = (zp2.e) obj2;
                                                                        zp2.a a5 = zp2.d.a(contact3);
                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a5, "contactData");
                                                                        a8.d dVar2 = new a8.d(com.truecaller.searchwarnings.data.analytics.SearchWarningSource.DETAILS_VIEW, intValue2, a5);
                                                                        eVar.getClass();
                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar2, "config");
                                                                        eVar.h = dVar2;
                                                                        cVar = (rx2.c) obj2;
                                                                    } else if (cVar4.c(contact3)) {
                                                                        java.lang.Object obj3 = fVar2.b.get();
                                                                        ih0.d a6 = ih0.h.a(contact3);
                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a6, "contactData");
                                                                        ((ih0.g) obj3).d2(new f6.v0(com.truecaller.searchwarnings.data.analytics.BusinessCallReasonContext.DETAILS_VIEW, a6, (java.lang.Integer) null, 24));
                                                                        cVar = (rx2.c) obj3;
                                                                    } else {
                                                                        cVar = null;
                                                                    }
                                                                    boolean z8 = !e0Var2.v.f() && z3 && e0Var2.w.a(contact3);
                                                                    if (cVar == null && !z8) {
                                                                        com.truecaller.details_view.ui.s0 s0Var24 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                                        if (s0Var24 != null) {
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "presenter");
                                                                            ea1.bar barVar32 = s0Var24.c.C0;
                                                                            if (barVar32 != null) {
                                                                                com.truecaller.truecontext.TrueContext trueContext2 = barVar32.F;
                                                                                gj.m.j0(trueContext2);
                                                                                trueContext2.setPresenter(cVar);
                                                                            } else {
                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        barVar4.b(new dc1.m(true));
                                                                    } else {
                                                                        s0Var2 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                                        if (s0Var2 != null) {
                                                                            ea1.bar barVar33 = s0Var2.c.C0;
                                                                            if (barVar33 == null) {
                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                throw null;
                                                                            }
                                                                            com.truecaller.truecontext.TrueContext trueContext3 = barVar33.F;
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trueContext3, "trueContext");
                                                                            gj.m.f0(trueContext3);
                                                                        }
                                                                        barVar4.b(new dc1.m(false));
                                                                    }
                                                                } else {
                                                                    i13 = java.lang.Character.charCount(codePointAt) + i13;
                                                                }
                                                            }
                                                        } else {
                                                            str = "<this>";
                                                        }
                                                        java.lang.String str7 = contact3.L;
                                                        if (str7 != null) {
                                                            int length2 = str7.length();
                                                            int i15 = 0;
                                                            while (i15 < length2) {
                                                                int codePointAt2 = str7.codePointAt(i15);
                                                                if (!java.lang.Character.isWhitespace(codePointAt2)) {
                                                                    rVar = new lf2.r(contact3.L, com.truecaller.data.entity.AltNameForDisplay$AltNameSource.ALT_NAME);
                                                                    if (rVar != null) {
                                                                    }
                                                                    a = e0Var2.g.a(contact3);
                                                                    if (a != null) {
                                                                    }
                                                                    fg3.h0.J(e0Var2, coroutineContext, f0Var, new g10.z0(e0Var2, contact3, f0Var, 6), 2);
                                                                    fg3.h0.J(e0Var2, coroutineContext, f0Var, new g10.z0(e0Var2, d1Var3, f0Var, 5), 2);
                                                                    ac1.f fVar22 = e0Var2.l;
                                                                    java.lang.Integer num32 = e0Var2.E;
                                                                    if (num32 != null) {
                                                                    }
                                                                    fVar22.getClass();
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "contact");
                                                                    tp2.c cVar42 = fVar22.c;
                                                                    a2 = zp2.d.a(contact3);
                                                                    if (a2.b) {
                                                                        if (!((a2.b || a2.f || a2.e || a2.a.isEmpty()) ? false : true)) {
                                                                        }
                                                                        if (e0Var2.v.f()) {
                                                                        }
                                                                        if (cVar == null) {
                                                                        }
                                                                        s0Var2 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                                        if (s0Var2 != null) {
                                                                        }
                                                                        barVar4.b(new dc1.m(false));
                                                                    }
                                                                    if (!((a2.b || a2.f || a2.e || a2.a.isEmpty()) ? false : true)) {
                                                                    }
                                                                    if (e0Var2.v.f()) {
                                                                    }
                                                                    if (cVar == null) {
                                                                    }
                                                                    s0Var2 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                                    if (s0Var2 != null) {
                                                                    }
                                                                    barVar4.b(new dc1.m(false));
                                                                } else {
                                                                    i15 = java.lang.Character.charCount(codePointAt2) + i15;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    rVar = null;
                                                    if (rVar != null) {
                                                    }
                                                    a = e0Var2.g.a(contact3);
                                                    if (a != null) {
                                                    }
                                                    fg3.h0.J(e0Var2, coroutineContext, f0Var, new g10.z0(e0Var2, contact3, f0Var, 6), 2);
                                                    fg3.h0.J(e0Var2, coroutineContext, f0Var, new g10.z0(e0Var2, d1Var3, f0Var, 5), 2);
                                                    ac1.f fVar222 = e0Var2.l;
                                                    java.lang.Integer num322 = e0Var2.E;
                                                    if (num322 != null) {
                                                    }
                                                    fVar222.getClass();
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "contact");
                                                    tp2.c cVar422 = fVar222.c;
                                                    a2 = zp2.d.a(contact3);
                                                    if (!((a2.b || a2.f || a2.e || a2.a.isEmpty()) ? false : true)) {
                                                    }
                                                    if (e0Var2.v.f()) {
                                                    }
                                                    if (cVar == null) {
                                                    }
                                                    s0Var2 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                    if (s0Var2 != null) {
                                                    }
                                                    barVar4.b(new dc1.m(false));
                                                }
                                                if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                                    if (kotlin.jvm.internal.Intrinsics.b(bazVar, barVar3)) {
                                                        bVar = bVar2;
                                                    } else {
                                                        bVar = bVar2;
                                                        if (!kotlin.jvm.internal.Intrinsics.b(bazVar, bVar)) {
                                                            com.truecaller.details_view.ui.s0 s0Var25 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                            if (s0Var25 != null) {
                                                                com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy5 = s0Var25.c;
                                                                ea1.bar barVar34 = detailsViewActivityLegacy5.C0;
                                                                if (barVar34 != null) {
                                                                    barVar34.m.removeAllViews();
                                                                    ea1.bar barVar35 = detailsViewActivityLegacy5.C0;
                                                                    if (barVar35 == null) {
                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                        throw null;
                                                                    }
                                                                    android.widget.FrameLayout frameLayout = barVar35.m;
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "headerAdContainer");
                                                                    gj.m.f0(frameLayout);
                                                                } else {
                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    com.truecaller.details_view.ui.s0 s0Var26 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                    if (s0Var26 != null) {
                                                        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy6 = s0Var26.c;
                                                        int i16 = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
                                                        if (detailsViewActivityLegacy6.C0() == null) {
                                                            ea1.bar barVar36 = detailsViewActivityLegacy6.C0;
                                                            if (barVar36 != null) {
                                                                barVar36.m.removeAllViews();
                                                                ea1.bar barVar37 = detailsViewActivityLegacy6.C0;
                                                                if (barVar37 == null) {
                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                android.widget.FrameLayout frameLayout2 = barVar37.m;
                                                                ea1.bar barVar38 = detailsViewActivityLegacy6.C0;
                                                                if (barVar38 == null) {
                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                    throw null;
                                                                }
                                                                android.content.Context context = barVar38.m.getContext();
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                                                frameLayout2.addView(new oa1.bar(context));
                                                            } else {
                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                throw null;
                                                            }
                                                        }
                                                        ea1.bar barVar39 = detailsViewActivityLegacy6.C0;
                                                        if (barVar39 == null) {
                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        android.widget.FrameLayout frameLayout3 = barVar39.m;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout3, "headerAdContainer");
                                                        gj.m.j0(frameLayout3);
                                                        break;
                                                    }
                                                } else {
                                                    bVar = bVar2;
                                                }
                                                break;
                                            }
                                        }
                                        s0Var3 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                        if (s0Var3 != null) {
                                            ea1.bar barVar40 = s0Var3.c.C0;
                                            if (barVar40 == null) {
                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                throw null;
                                            }
                                            android.widget.TextView textView11 = barVar40.u;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView11, "searchWeb");
                                            gj.m.k0(textView11, z6);
                                        }
                                        java.util.ArrayList l03 = gj.m.l0(contact3.t);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l03, "splitBadges(...)");
                                        barVar4.b(new dc1.i(l03));
                                        barVar4.b(new dc1.k(contact3.Q()));
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q2 = gj.m.Q(contact3);
                                        if (Q2 != null) {
                                        }
                                        if (z2) {
                                        }
                                        if (bazVar instanceof com.truecaller.details_view.ui.b) {
                                        }
                                        if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                        }
                                        break;
                                    case 2:
                                        pair = new kotlin.Pair(2132020451, th);
                                        pair2 = pair;
                                        num = (java.lang.Integer) pair2.a;
                                        java.lang.Long l23 = (java.lang.Long) pair2.b;
                                        if (num == null) {
                                        }
                                        th2 = null;
                                        if (!e0Var2.F) {
                                        }
                                        s = contact3.s();
                                        if (s != null) {
                                            break;
                                        }
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q = gj.m.Q(contact3);
                                        if (Q != null) {
                                            break;
                                        }
                                        if (!((Q != null || kotlin.text.StringsKt.X(Q)) ? true : z6 ? 1 : 0)) {
                                            s0Var = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                            if (s0Var != null) {
                                            }
                                            java.util.ArrayList l032 = gj.m.l0(contact3.t);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l032, "splitBadges(...)");
                                            barVar4.b(new dc1.i(l032));
                                            barVar4.b(new dc1.k(contact3.Q()));
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                            Q2 = gj.m.Q(contact3);
                                            if (Q2 != null) {
                                            }
                                            if (z2) {
                                            }
                                            if (bazVar instanceof com.truecaller.details_view.ui.b) {
                                            }
                                            if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                            }
                                            break;
                                        }
                                        s0Var3 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                        if (s0Var3 != null) {
                                        }
                                        java.util.ArrayList l0322 = gj.m.l0(contact3.t);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l0322, "splitBadges(...)");
                                        barVar4.b(new dc1.i(l0322));
                                        barVar4.b(new dc1.k(contact3.Q()));
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q2 = gj.m.Q(contact3);
                                        if (Q2 != null) {
                                        }
                                        if (z2) {
                                        }
                                        if (bazVar instanceof com.truecaller.details_view.ui.b) {
                                        }
                                        if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                        }
                                        break;
                                    case 3:
                                        pair = new kotlin.Pair(2132020459, th);
                                        pair2 = pair;
                                        num = (java.lang.Integer) pair2.a;
                                        java.lang.Long l232 = (java.lang.Long) pair2.b;
                                        if (num == null) {
                                        }
                                        th2 = null;
                                        if (!e0Var2.F) {
                                        }
                                        s = contact3.s();
                                        if (s != null) {
                                        }
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q = gj.m.Q(contact3);
                                        if (!((Q != null || kotlin.text.StringsKt.X(Q)) ? true : z6 ? 1 : 0)) {
                                        }
                                        s0Var3 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                        if (s0Var3 != null) {
                                        }
                                        java.util.ArrayList l03222 = gj.m.l0(contact3.t);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l03222, "splitBadges(...)");
                                        barVar4.b(new dc1.i(l03222));
                                        barVar4.b(new dc1.k(contact3.Q()));
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q2 = gj.m.Q(contact3);
                                        if (Q2 != null) {
                                        }
                                        if (z2) {
                                        }
                                        if (bazVar instanceof com.truecaller.details_view.ui.b) {
                                        }
                                        if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                        }
                                        break;
                                    case 4:
                                        pair = new kotlin.Pair(2132020454, th);
                                        pair2 = pair;
                                        num = (java.lang.Integer) pair2.a;
                                        java.lang.Long l2322 = (java.lang.Long) pair2.b;
                                        if (num == null) {
                                        }
                                        th2 = null;
                                        if (!e0Var2.F) {
                                        }
                                        s = contact3.s();
                                        if (s != null) {
                                        }
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q = gj.m.Q(contact3);
                                        if (!((Q != null || kotlin.text.StringsKt.X(Q)) ? true : z6 ? 1 : 0)) {
                                        }
                                        s0Var3 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                        if (s0Var3 != null) {
                                        }
                                        java.util.ArrayList l032222 = gj.m.l0(contact3.t);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l032222, "splitBadges(...)");
                                        barVar4.b(new dc1.i(l032222));
                                        barVar4.b(new dc1.k(contact3.Q()));
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q2 = gj.m.Q(contact3);
                                        if (Q2 != null) {
                                        }
                                        if (z2) {
                                        }
                                        if (bazVar instanceof com.truecaller.details_view.ui.b) {
                                        }
                                        if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                        }
                                        break;
                                    case 5:
                                        pair = new kotlin.Pair(2132020461, th);
                                        pair2 = pair;
                                        num = (java.lang.Integer) pair2.a;
                                        java.lang.Long l23222 = (java.lang.Long) pair2.b;
                                        if (num == null) {
                                        }
                                        th2 = null;
                                        if (!e0Var2.F) {
                                        }
                                        s = contact3.s();
                                        if (s != null) {
                                        }
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q = gj.m.Q(contact3);
                                        if (!((Q != null || kotlin.text.StringsKt.X(Q)) ? true : z6 ? 1 : 0)) {
                                        }
                                        s0Var3 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                        if (s0Var3 != null) {
                                        }
                                        java.util.ArrayList l0322222 = gj.m.l0(contact3.t);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l0322222, "splitBadges(...)");
                                        barVar4.b(new dc1.i(l0322222));
                                        barVar4.b(new dc1.k(contact3.Q()));
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q2 = gj.m.Q(contact3);
                                        if (Q2 != null) {
                                        }
                                        if (z2) {
                                        }
                                        if (bazVar instanceof com.truecaller.details_view.ui.b) {
                                        }
                                        if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                        }
                                        break;
                                    case 6:
                                    case 7:
                                        java.lang.Throwable th3 = th;
                                        com.truecaller.details_view.ui.d1 d1Var4 = e0Var2.D;
                                        if (d1Var4 != null) {
                                            dj0.n nVar = d1Var4.o;
                                            if (kotlin.jvm.internal.Intrinsics.b(nVar, dj0.l.a)) {
                                                pair = new kotlin.Pair(2132020457, th3);
                                            } else if (kotlin.jvm.internal.Intrinsics.b(nVar, dj0.k.a)) {
                                                pair = new kotlin.Pair(2132020450, th3);
                                            } else {
                                                pair2 = new kotlin.Pair(th3, th3);
                                                num = (java.lang.Integer) pair2.a;
                                                java.lang.Long l232222 = (java.lang.Long) pair2.b;
                                                if (num == null) {
                                                }
                                                th2 = null;
                                                if (!e0Var2.F) {
                                                }
                                                s = contact3.s();
                                                if (s != null) {
                                                }
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                                Q = gj.m.Q(contact3);
                                                if (!((Q != null || kotlin.text.StringsKt.X(Q)) ? true : z6 ? 1 : 0)) {
                                                }
                                                s0Var3 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                                if (s0Var3 != null) {
                                                }
                                                java.util.ArrayList l03222222 = gj.m.l0(contact3.t);
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l03222222, "splitBadges(...)");
                                                barVar4.b(new dc1.i(l03222222));
                                                barVar4.b(new dc1.k(contact3.Q()));
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                                Q2 = gj.m.Q(contact3);
                                                if (Q2 != null) {
                                                }
                                                if (z2) {
                                                }
                                                if (bazVar instanceof com.truecaller.details_view.ui.b) {
                                                }
                                                if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                                }
                                                break;
                                            }
                                            pair2 = pair;
                                            num = (java.lang.Integer) pair2.a;
                                            java.lang.Long l2322222 = (java.lang.Long) pair2.b;
                                            if (num == null) {
                                            }
                                            th2 = null;
                                            if (!e0Var2.F) {
                                            }
                                            s = contact3.s();
                                            if (s != null) {
                                            }
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                            Q = gj.m.Q(contact3);
                                            if (!((Q != null || kotlin.text.StringsKt.X(Q)) ? true : z6 ? 1 : 0)) {
                                            }
                                            s0Var3 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                            if (s0Var3 != null) {
                                            }
                                            java.util.ArrayList l032222222 = gj.m.l0(contact3.t);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l032222222, "splitBadges(...)");
                                            barVar4.b(new dc1.i(l032222222));
                                            barVar4.b(new dc1.k(contact3.Q()));
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                            Q2 = gj.m.Q(contact3);
                                            if (Q2 != null) {
                                            }
                                            if (z2) {
                                            }
                                            if (bazVar instanceof com.truecaller.details_view.ui.b) {
                                            }
                                            if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                            }
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                                            throw th3;
                                        }
                                        break;
                                    case 8:
                                        pair = new kotlin.Pair(2132020452, th);
                                        pair2 = pair;
                                        num = (java.lang.Integer) pair2.a;
                                        java.lang.Long l23222222 = (java.lang.Long) pair2.b;
                                        if (num == null) {
                                        }
                                        th2 = null;
                                        if (!e0Var2.F) {
                                        }
                                        s = contact3.s();
                                        if (s != null) {
                                        }
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q = gj.m.Q(contact3);
                                        if (!((Q != null || kotlin.text.StringsKt.X(Q)) ? true : z6 ? 1 : 0)) {
                                        }
                                        s0Var3 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                        if (s0Var3 != null) {
                                        }
                                        java.util.ArrayList l0322222222 = gj.m.l0(contact3.t);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l0322222222, "splitBadges(...)");
                                        barVar4.b(new dc1.i(l0322222222));
                                        barVar4.b(new dc1.k(contact3.Q()));
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q2 = gj.m.Q(contact3);
                                        if (Q2 != null) {
                                        }
                                        if (z2) {
                                        }
                                        if (bazVar instanceof com.truecaller.details_view.ui.b) {
                                        }
                                        if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                        }
                                        break;
                                    case 9:
                                        pair = new kotlin.Pair(2132020458, th);
                                        pair2 = pair;
                                        num = (java.lang.Integer) pair2.a;
                                        java.lang.Long l232222222 = (java.lang.Long) pair2.b;
                                        if (num == null) {
                                        }
                                        th2 = null;
                                        if (!e0Var2.F) {
                                        }
                                        s = contact3.s();
                                        if (s != null) {
                                        }
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q = gj.m.Q(contact3);
                                        if (!((Q != null || kotlin.text.StringsKt.X(Q)) ? true : z6 ? 1 : 0)) {
                                        }
                                        s0Var3 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                        if (s0Var3 != null) {
                                        }
                                        java.util.ArrayList l03222222222 = gj.m.l0(contact3.t);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l03222222222, "splitBadges(...)");
                                        barVar4.b(new dc1.i(l03222222222));
                                        barVar4.b(new dc1.k(contact3.Q()));
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q2 = gj.m.Q(contact3);
                                        if (Q2 != null) {
                                        }
                                        if (z2) {
                                        }
                                        if (bazVar instanceof com.truecaller.details_view.ui.b) {
                                        }
                                        if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                        }
                                        break;
                                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                                        pair = new kotlin.Pair(2132020460, (java.lang.Object) null);
                                        pair2 = pair;
                                        num = (java.lang.Integer) pair2.a;
                                        java.lang.Long l2322222222 = (java.lang.Long) pair2.b;
                                        if (num == null) {
                                        }
                                        th2 = null;
                                        if (!e0Var2.F) {
                                        }
                                        s = contact3.s();
                                        if (s != null) {
                                        }
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q = gj.m.Q(contact3);
                                        if (!((Q != null || kotlin.text.StringsKt.X(Q)) ? true : z6 ? 1 : 0)) {
                                        }
                                        s0Var3 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                        if (s0Var3 != null) {
                                        }
                                        java.util.ArrayList l032222222222 = gj.m.l0(contact3.t);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l032222222222, "splitBadges(...)");
                                        barVar4.b(new dc1.i(l032222222222));
                                        barVar4.b(new dc1.k(contact3.Q()));
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q2 = gj.m.Q(contact3);
                                        if (Q2 != null) {
                                        }
                                        if (z2) {
                                        }
                                        if (bazVar instanceof com.truecaller.details_view.ui.b) {
                                        }
                                        if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                        }
                                        break;
                                    default:
                                        int i17 = gb1.bar.b[filterMatch.b.ordinal()];
                                        if (i17 == 1) {
                                            pair3 = new kotlin.Pair(2132020410, java.lang.Long.valueOf(l != null ? l.longValue() : -1L));
                                        } else if (i17 != 2) {
                                            java.lang.Throwable th4 = th;
                                            pair2 = new kotlin.Pair(th4, th4);
                                            num = (java.lang.Integer) pair2.a;
                                            java.lang.Long l23222222222 = (java.lang.Long) pair2.b;
                                            if (num == null) {
                                            }
                                            th2 = null;
                                            if (!e0Var2.F) {
                                            }
                                            s = contact3.s();
                                            if (s != null) {
                                            }
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                            Q = gj.m.Q(contact3);
                                            if (!((Q != null || kotlin.text.StringsKt.X(Q)) ? true : z6 ? 1 : 0)) {
                                            }
                                            s0Var3 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                            if (s0Var3 != null) {
                                            }
                                            java.util.ArrayList l0322222222222 = gj.m.l0(contact3.t);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l0322222222222, "splitBadges(...)");
                                            barVar4.b(new dc1.i(l0322222222222));
                                            barVar4.b(new dc1.k(contact3.Q()));
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                            Q2 = gj.m.Q(contact3);
                                            if (Q2 != null) {
                                            }
                                            if (z2) {
                                            }
                                            if (bazVar instanceof com.truecaller.details_view.ui.b) {
                                            }
                                            if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                            }
                                            break;
                                        } else {
                                            pair3 = new kotlin.Pair(2132020513, java.lang.Long.valueOf(l != null ? l.longValue() : -1L));
                                        }
                                        pair2 = pair3;
                                        num = (java.lang.Integer) pair2.a;
                                        java.lang.Long l232222222222 = (java.lang.Long) pair2.b;
                                        if (num == null) {
                                        }
                                        th2 = null;
                                        if (!e0Var2.F) {
                                        }
                                        s = contact3.s();
                                        if (s != null) {
                                        }
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q = gj.m.Q(contact3);
                                        if (!((Q != null || kotlin.text.StringsKt.X(Q)) ? true : z6 ? 1 : 0)) {
                                        }
                                        s0Var3 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                                        if (s0Var3 != null) {
                                        }
                                        java.util.ArrayList l03222222222222 = gj.m.l0(contact3.t);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l03222222222222, "splitBadges(...)");
                                        barVar4.b(new dc1.i(l03222222222222));
                                        barVar4.b(new dc1.k(contact3.Q()));
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                                        Q2 = gj.m.Q(contact3);
                                        if (Q2 != null) {
                                        }
                                        if (z2) {
                                        }
                                        if (bazVar instanceof com.truecaller.details_view.ui.b) {
                                        }
                                        if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                        }
                                        break;
                                }
                            }
                            th2 = th;
                            if (!e0Var2.F) {
                            }
                            s = contact3.s();
                            if (s != null) {
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                            Q = gj.m.Q(contact3);
                            if (!((Q != null || kotlin.text.StringsKt.X(Q)) ? true : z6 ? 1 : 0)) {
                            }
                            s0Var3 = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) e0Var2).a;
                            if (s0Var3 != null) {
                            }
                            java.util.ArrayList l032222222222222 = gj.m.l0(contact3.t);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l032222222222222, "splitBadges(...)");
                            barVar4.b(new dc1.i(l032222222222222));
                            barVar4.b(new dc1.k(contact3.Q()));
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "<this>");
                            Q2 = gj.m.Q(contact3);
                            if (Q2 != null) {
                            }
                            if (z2) {
                            }
                            if (bazVar instanceof com.truecaller.details_view.ui.b) {
                            }
                            if (((qo1.baz) ((qo1.bar) e0Var2.r.get())).b.a("featureDetailsViewHeaderAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                            throw null;
                        }
                    } else {
                        g0Var2 = g0Var;
                        barVar = barVar2;
                        bVar = bVar3;
                        str = "<this>";
                        str2 = "detailsViewModel";
                    }
                    i0Var = this;
                    com.truecaller.details_view.ui.d1 d1Var5 = i0Var.d0;
                    if (d1Var5 != null) {
                        com.truecaller.details_view.ui.d1 a7 = com.truecaller.details_view.ui.d1.a(d1Var5, i0Var.g0);
                        zb1.baz bazVar2 = i0Var.s;
                        bazVar2.getClass();
                        qo1.qux quxVar3 = (qo1.qux) bazVar2.b;
                        java.lang.String str8 = str2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a7, str8);
                        boolean Q3 = a7.a.Q();
                        ne0.baz bazVar3 = a7.b;
                        if (!kotlin.jvm.internal.Intrinsics.b(bazVar3, barVar3) && !kotlin.jvm.internal.Intrinsics.b(bazVar3, com.truecaller.details_view.ui.qux.m) && !kotlin.jvm.internal.Intrinsics.b(bazVar3, com.truecaller.details_view.ui.baz.m)) {
                            if (!kotlin.jvm.internal.Intrinsics.b(bazVar3, com.truecaller.details_view.ui.d.m) && !(bazVar3 instanceof com.truecaller.details_view.ui.k)) {
                                if (!kotlin.jvm.internal.Intrinsics.b(bazVar3, com.truecaller.details_view.ui.c.m) && !(bazVar3 instanceof com.truecaller.details_view.ui.j)) {
                                    if (kotlin.jvm.internal.Intrinsics.b(bazVar3, bVar)) {
                                        boolean z9 = a7.g;
                                        arrayList = new java.util.ArrayList();
                                        if (!z9) {
                                            widgetType = com.truecaller.details_view.ui.widget.WidgetType.PREMIUM;
                                        } else {
                                            widgetType = com.truecaller.details_view.ui.widget.WidgetType.REQUEST_CONTACT;
                                        }
                                        arrayList.add(widgetType);
                                        arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.PRIVATE_NUMBER);
                                        arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.AD);
                                        arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.CONTACT_INFO);
                                        arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.MODERATION_NOTICE);
                                    } else {
                                        if (!kotlin.jvm.internal.Intrinsics.b(bazVar3, com.truecaller.details_view.ui.a.m) && !(bazVar3 instanceof com.truecaller.details_view.ui.n)) {
                                            if (!kotlin.jvm.internal.Intrinsics.b(bazVar3, com.truecaller.details_view.ui.s.m) && !(bazVar3 instanceof com.truecaller.details_view.ui.q) && !(bazVar3 instanceof com.truecaller.details_view.ui.p)) {
                                                if (!kotlin.jvm.internal.Intrinsics.b(bazVar3, com.truecaller.details_view.ui.e.m) && !(bazVar3 instanceof com.truecaller.details_view.ui.l) && !(bazVar3 instanceof com.truecaller.details_view.ui.o)) {
                                                    if (!(bazVar3 instanceof com.truecaller.details_view.ui.g) && !(bazVar3 instanceof com.truecaller.details_view.ui.m) && !(bazVar3 instanceof com.truecaller.details_view.ui.f) && !(bazVar3 instanceof com.truecaller.details_view.ui.h) && !(bazVar3 instanceof com.truecaller.details_view.ui.i)) {
                                                        throw new java.lang.RuntimeException();
                                                    }
                                                    arrayList = new java.util.ArrayList();
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.COMMENTS_WITH_ADS);
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.NUMBERS);
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.SPAM_STATS);
                                                    bazVar2.d(arrayList);
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.FEEDBACK);
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.CONTACT_INFO);
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.ABOUT);
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.NOTES);
                                                    bazVar2.b(arrayList);
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.CALL_HISTORY_V2);
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.MODERATION_NOTICE);
                                                } else {
                                                    arrayList = new java.util.ArrayList();
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.SOCIAL_MEDIA);
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.AD);
                                                    bazVar2.c(arrayList);
                                                    bazVar2.d(arrayList);
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.NUMBERS);
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.CONTACT_INFO);
                                                    bazVar2.b(arrayList);
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.CALL_HISTORY_V2);
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.MODERATION_NOTICE);
                                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.LEARN_MORE);
                                                }
                                            } else {
                                                arrayList2 = new java.util.ArrayList();
                                                bazVar2.a(arrayList2, a7);
                                                arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.SOCIAL_MEDIA);
                                                arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.AD);
                                                qo1.a aVar2 = (qo1.a) quxVar3;
                                                so1.a aVar3 = aVar2.b;
                                                com.truecaller.featuretoggles.FeatureState featureState = com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG;
                                                boolean a8 = aVar3.a("featureBizVerifiedCampaignsCarouselDetailsView", featureState);
                                                if (aVar2.b.a("featureBizVerifiedCampaignsDetailsView", featureState) && !a8) {
                                                    arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.BIZ_VERIFIED_CAMPAIGN);
                                                }
                                                if (((qo1.a) quxVar3).b.a("featureBizVerifiedCampaignsCarouselDetailsView", featureState)) {
                                                    arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.BIZ_VERIFIED_CAMPAIGN_CAROUSEL);
                                                }
                                                bazVar2.c(arrayList2);
                                                bazVar2.d(arrayList2);
                                                arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.NUMBERS);
                                                arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.CONTACT_INFO);
                                                bazVar2.b(arrayList2);
                                                arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.CALL_HISTORY_V2);
                                                arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.MODERATION_NOTICE);
                                                arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.LEARN_MORE);
                                            }
                                        } else {
                                            arrayList2 = new java.util.ArrayList();
                                            bazVar2.a(arrayList2, a7);
                                            arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.SOCIAL_MEDIA);
                                            arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.AD);
                                            qo1.a aVar4 = (qo1.a) quxVar3;
                                            so1.a aVar5 = aVar4.b;
                                            com.truecaller.featuretoggles.FeatureState featureState2 = com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG;
                                            boolean a9 = aVar5.a("featureBizVerifiedCampaignsCarouselDetailsView", featureState2);
                                            if (aVar4.b.a("featureBizVerifiedCampaignsDetailsView", featureState2) && !a9) {
                                                arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.BIZ_VERIFIED_CAMPAIGN);
                                            }
                                            if (((qo1.a) quxVar3).b.a("featureBizVerifiedCampaignsCarouselDetailsView", featureState2)) {
                                                arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.BIZ_VERIFIED_CAMPAIGN_CAROUSEL);
                                            }
                                            bazVar2.c(arrayList2);
                                            bazVar2.d(arrayList2);
                                            arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.NUMBERS);
                                            arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.CONTACT_INFO);
                                            bazVar2.b(arrayList2);
                                            arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.CALL_HISTORY_V2);
                                            arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.MODERATION_NOTICE);
                                            arrayList2.add(com.truecaller.details_view.ui.widget.WidgetType.LEARN_MORE);
                                        }
                                        arrayList = arrayList2;
                                    }
                                } else {
                                    arrayList = new java.util.ArrayList();
                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.AD);
                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.CONTACT_INFO);
                                    arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.MODERATION_NOTICE);
                                }
                            } else {
                                arrayList = new java.util.ArrayList();
                                arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.AD);
                                arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.FEEDBACK);
                                bazVar2.b(arrayList);
                                arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.MODERATION_NOTICE);
                            }
                        } else {
                            arrayList = new java.util.ArrayList();
                            arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.COMMENTS_WITH_ADS);
                            arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.NUMBERS);
                            bazVar2.d(arrayList);
                            if (!Q3) {
                                arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.FEEDBACK);
                            }
                            arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.CONTACT_INFO);
                            arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.SWISH);
                            arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.ABOUT);
                            arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.NOTES);
                            bazVar2.b(arrayList);
                            arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.CALL_HISTORY_V2);
                            if (Q3) {
                                arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.FEEDBACK);
                            }
                            arrayList.add(com.truecaller.details_view.ui.widget.WidgetType.MODERATION_NOTICE);
                        }
                        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                        linkedHashSet.add(com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.Header);
                        linkedHashSet.add(com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.ActionButtons);
                        linkedHashSet.add(com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.BusinessAwareness);
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        for (com.truecaller.details_view.ui.widget.WidgetType widgetType2 : arrayList) {
                            java.lang.String str9 = str;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(widgetType2, str9);
                            switch (zb1.qux.a[widgetType2.ordinal()]) {
                                case 1:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.About;
                                    break;
                                case 2:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.Note;
                                    break;
                                case 3:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.CallHistory;
                                    break;
                                case 4:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.ContactInfo;
                                    break;
                                case 5:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.Comments;
                                    break;
                                case 6:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.Feedback;
                                    break;
                                case 7:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.PhoneNumbers;
                                    break;
                                case 8:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.PhoneNumbers;
                                    break;
                                case 9:
                                case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                                case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                                case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                                case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                                case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                                case 20:
                                    detailsViewTTFDComponent = null;
                                    break;
                                case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.ContactRequest;
                                    break;
                                case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.SpamStats;
                                    break;
                                case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.SocialMediaCarousel;
                                    break;
                                case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.BusinessDetails;
                                    break;
                                case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.ModerationNotice;
                                    break;
                                case 21:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.CallMeBack;
                                    break;
                                case 22:
                                case 23:
                                    detailsViewTTFDComponent = com.truecaller.detailsview.api.performance.DetailsViewTTFDComponent.VerifiedCampaigns;
                                    break;
                                default:
                                    throw new java.lang.RuntimeException();
                            }
                            if (detailsViewTTFDComponent != null) {
                                arrayList5.add(detailsViewTTFDComponent);
                            }
                            str = str9;
                        }
                        linkedHashSet.addAll(arrayList5);
                        ((jd1.bar) ((oc1.bar) bazVar2.d)).b(linkedHashSet);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, str);
                        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.z.q(arrayList, 10));
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            switch (zb1.qux.a[((com.truecaller.details_view.ui.widget.WidgetType) it.next()).ordinal()]) {
                                case 1:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.ABOUT;
                                    break;
                                case 2:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.NOTES;
                                    break;
                                case 3:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.CALL_HISTORY_V2;
                                    break;
                                case 4:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.CONTACT_INFO;
                                    break;
                                case 5:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.COMMENTS_WITH_ADS;
                                    break;
                                case 6:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.FEEDBACK;
                                    break;
                                case 7:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.NUMBERS;
                                    break;
                                case 8:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.PRIVATE_NUMBER;
                                    break;
                                case 9:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.PREMIUM;
                                    break;
                                case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.REQUEST_CONTACT;
                                    break;
                                case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.SWISH;
                                    break;
                                case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.SPAM_STATS;
                                    break;
                                case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.SOCIAL_MEDIA;
                                    break;
                                case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.BUSINESS_DETAILS;
                                    break;
                                case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.MODERATION_NOTICE;
                                    break;
                                case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.LEARN_MORE;
                                    break;
                                case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.AD;
                                    break;
                                case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                                case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.BOTTOM_AD;
                                    break;
                                case 20:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.SCREENED_CALLS;
                                    break;
                                case 21:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.BIZ_CALL_ME_BACK;
                                    break;
                                case 22:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.BIZ_VERIFIED_CAMPAIGN;
                                    break;
                                case 23:
                                    detailsViewStateEventProperty$WidgetType = com.truecaller.detailsview.api.analytics.DetailsViewStateEventProperty$WidgetType.BIZ_VERIFIED_CAMPAIGN_CAROUSEL;
                                    break;
                                default:
                                    throw new java.lang.RuntimeException();
                            }
                            arrayList6.add(detailsViewStateEventProperty$WidgetType);
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList6, "widgetTypes");
                        i0Var.K.b(new dc1.u(arrayList6));
                        com.truecaller.details_view.ui.u uVar3 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                        if (uVar3 != null) {
                            com.truecaller.details_view.ui.d1 d1Var6 = i0Var.d0;
                            if (d1Var6 == null) {
                                kotlin.jvm.internal.Intrinsics.n(str8);
                                throw null;
                            }
                            ((com.truecaller.details_view.ui.x0) uVar3).h(arrayList, com.truecaller.details_view.ui.d1.a(d1Var6, i0Var.g0));
                        }
                        g0Var = g0Var2;
                        g0Var.z = 1;
                        barVar2 = barVar;
                        i5 = i0Var.g2(g0Var) != barVar2 ? 2 : 2;
                        return barVar2;
                    }
                    kotlin.jvm.internal.Intrinsics.n(str2);
                    throw null;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    return kotlin.Unit.a;
                }
                od.p.E(obj);
                i0Var = this;
                g0Var.z = i5;
            }
        }
        g0Var = new com.truecaller.details_view.ui.g0(this, quxVar);
        java.lang.Object obj4 = g0Var.x;
        ef3.bar barVar210 = ef3.bar.a;
        i = g0Var.z;
        if (i != 0) {
        }
        g0Var.z = i5;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.content.Context, java.lang.Object, com.truecaller.details_view.ui.DetailsViewActivityLegacy] */
    public final void p2(com.truecaller.data.entity.Contact contact) {
        java.util.List C = contact.C();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "getNumbers(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = C.iterator();
        while (true) {
            java.lang.String str = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.truecaller.data.entity.Number number = (com.truecaller.data.entity.Number) next;
            kotlin.jvm.internal.Intrinsics.d(number);
            zx.bar h = this.h.h();
            if (h != null) {
                str = h.a;
            }
            if (ja1.e.a(number, str)) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        if (size != 0) {
            qa1.baz bazVar = this.q;
            if (size != 1) {
                qa1.a aVar = (qa1.a) bazVar;
                bd.bar.u(aVar.a, "PayDialogShown", aVar.h);
                com.truecaller.details_view.ui.u uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
                if (uVar != null) {
                    com.truecaller.details_view.ui.d1 d1Var = this.d0;
                    if (d1Var != null) {
                        com.truecaller.data.entity.Contact contact2 = d1Var.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact2, "contact");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "domesticNumbers");
                        p.c3 c3Var = ((com.truecaller.details_view.ui.x0) uVar).b.q0;
                        if (c3Var != null) {
                            contact2.s();
                            c3Var.G(arrayList, com.truecaller.details_view.routing.PayActionsManager$Source.DetailsView);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("payActionsManager");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                    throw null;
                }
                return;
            }
            qa1.a aVar2 = (qa1.a) bazVar;
            bd.bar.u(aVar2.a, "PayBottomSheet", aVar2.h);
            com.truecaller.details_view.ui.u uVar2 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this).a;
            if (uVar2 != null) {
                java.lang.String str2 = ((com.truecaller.data.entity.Number) kotlin.collections.CollectionsKt.V(arrayList)).f;
                java.lang.String s = contact.s();
                boolean X = contact.X();
                ?? r3 = ((com.truecaller.details_view.ui.x0) uVar2).b;
                kotlin.jvm.functions.Function0 fVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f((java.lang.Object) r3, str2, s, X, 2);
                e70.k u0 = r3.u0();
                com.truecaller.ads.interstitial.AdInterstitialSourceType adInterstitialSourceType = com.truecaller.ads.interstitial.AdInterstitialSourceType.DvPay;
                if (u0.n("C2P_OOP", adInterstitialSourceType.toString(), false, false)) {
                    r3.u0().k(ye0.k.O((android.content.Context) r3), "C2P_OOP", adInterstitialSourceType.toString(), new by2.a(19, (java.lang.Object) r3, fVar));
                    return;
                }
                ((com.truecaller.details_view.ui.i0) r3.B0()).j2(fVar);
            }
        }
    }

    public final void u0(java.lang.Object obj) {
        com.truecaller.details_view.ui.u uVar = (com.truecaller.details_view.ui.u) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uVar, "presenterView");
        ((com.truecaller.sdk.bar) this).a = uVar;
        android.database.ContentObserver contentObserver = this.l0;
        android.content.ContentResolver contentResolver = this.i;
        contentResolver.registerContentObserver(this.j, false, contentObserver);
        contentResolver.registerContentObserver(this.w, false, this.m0);
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.w(this, null, 3), 3);
    }
}
