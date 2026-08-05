package com.truecaller.editprofile.impl.ui.legacy;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class s extends of0.baz implements com.truecaller.editprofile.impl.ui.legacy.g {
    public static final /* synthetic */ kotlin.reflect.KProperty[] D = {kotlin.jvm.internal.k0.a.mutableProperty1(new kotlin.jvm.internal.t("changedProfile", 0, "getChangedProfile()Lcom/truecaller/editprofile/impl/ui/legacy/EditProfilePresenter$TempProfile;", com.truecaller.editprofile.impl.ui.legacy.s.class))};
    public static final java.util.regex.Pattern E = java.util.regex.Pattern.compile("(http|https|rtsp)://.*");
    public boolean A;
    public final java.text.SimpleDateFormat B;
    public boolean C;
    public final kotlin.coroutines.CoroutineContext d;
    public final mg2.bar e;
    public final q6.baz f;
    public final u03.b0 g;
    public final u03.baz h;
    public final n11.g i;
    public final qk0.e j;
    public final com.google.firebase.messaging.o k;
    public final dh1.bar l;
    public final x42.a m;
    public final qg2.bar n;
    public final xg2.c o;
    public final com.truecaller.clevertap.CleverTapManager p;
    public final tg2.e q;
    public final nc0.bar r;
    public final uk2.g s;
    public final af.qux t;
    public com.truecaller.editprofile.impl.ui.legacy.i u;
    public final com.truecaller.editprofile.impl.ui.legacy.o v;
    public com.truecaller.editprofile.impl.ui.legacy.Gender w;
    public java.util.Date x;
    public java.lang.String y;
    public java.lang.String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kotlin.coroutines.CoroutineContext coroutineContext, mg2.bar barVar, q6.baz bazVar, u03.b0 b0Var, u03.baz bazVar2, n11.g gVar, qk0.e eVar, com.google.firebase.messaging.o oVar, dh1.bar barVar2, x42.a aVar, qg2.bar barVar3, xg2.c cVar, com.truecaller.clevertap.CleverTapManager cleverTapManager, tg2.e eVar2, nc0.bar barVar4, uk2.g gVar2, af.qux quxVar) {
        super(coroutineContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "profileRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "updateProfileUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "resourceProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "clock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "regionUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "businessCardRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "accountHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "countryHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "mobileServicesAvailabilityProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "avatarHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "profileErrorMessageHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cleverTapManager, "cleverTapManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar2, "profileCompletionHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar2, "claimRewardProgramPointsUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "editProfileNotificationHelper");
        this.d = coroutineContext;
        this.e = barVar;
        this.f = bazVar;
        this.g = b0Var;
        this.h = bazVar2;
        this.i = gVar;
        this.j = eVar;
        this.k = oVar;
        this.l = barVar2;
        this.m = aVar;
        this.n = barVar3;
        this.o = cVar;
        this.p = cleverTapManager;
        this.q = eVar2;
        this.r = barVar4;
        this.s = gVar2;
        this.t = quxVar;
        this.v = new com.truecaller.editprofile.impl.ui.legacy.o(0, this.u, this);
        this.w = com.truecaller.editprofile.impl.ui.legacy.Gender.N;
        this.y = "editProfile";
        this.B = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.ENGLISH);
    }

    public static final void c2(com.truecaller.editprofile.impl.ui.legacy.s sVar) {
        com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
        if (hVar != null) {
            com.truecaller.editprofile.impl.ui.legacy.d dVar = (com.truecaller.editprofile.impl.ui.legacy.d) hVar;
            if (dVar.getContext() != null) {
                android.view.View view = (android.view.View) dVar.e0.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "<get-savingLoadingLayer>(...)");
                gj.m.f0(view);
                dVar.e6().F(false);
                com.truecaller.common.ui.button.ProgressButton e6 = dVar.e6();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e6, "<get-saveLoaderButton>(...)");
                gj.m.f0(e6);
                java.lang.String string = dVar.getString(2132020774);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                dVar.p6(string, dVar.h0);
            }
        }
        sVar.A = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlin.jvm.internal.h0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object d2(com.truecaller.editprofile.impl.ui.legacy.s sVar, ff3.qux quxVar) {
        com.truecaller.editprofile.impl.ui.legacy.n nVar;
        int i;
        com.truecaller.editprofile.impl.ui.legacy.i iVar;
        if (quxVar instanceof com.truecaller.editprofile.impl.ui.legacy.n) {
            nVar = (com.truecaller.editprofile.impl.ui.legacy.n) quxVar;
            int i2 = nVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = nVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = nVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    rg2.m mVar = sVar.e;
                    nVar.z = 1;
                    obj = mVar.f(nVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                final java.lang.String verifiedName = ((pg2.m) obj).getVerifiedName();
                iVar = sVar.u;
                if (iVar == null) {
                    java.lang.String str = iVar.b;
                    java.lang.String str2 = iVar.a;
                    if (verifiedName == null || !(!kotlin.text.StringsKt.X(verifiedName))) {
                        if (str2.length() > 0 && str.length() > 0) {
                            verifiedName = h8.s0.q(str2, " ", str);
                        } else {
                            verifiedName = sVar.g.h(2132020782, new java.lang.Object[0]);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(verifiedName, "getString(...)");
                        }
                    }
                    com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                    if (hVar != null) {
                        final com.truecaller.editprofile.impl.ui.legacy.d dVar = (com.truecaller.editprofile.impl.ui.legacy.d) hVar;
                        kotlin.Lazy lazy = dVar.f0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifiedName, "toolbarTitle");
                        androidx.appcompat.app.AppCompatActivity activity = dVar.getActivity();
                        kotlin.jvm.internal.Intrinsics.e(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                        androidx.appcompat.app.AppCompatActivity appCompatActivity = activity;
                        appCompatActivity.setSupportActionBar((androidx.appcompat.widget.Toolbar) lazy.getValue());
                        i.baz supportActionBar = appCompatActivity.getSupportActionBar();
                        if (supportActionBar != null) {
                            supportActionBar.p(true);
                        }
                        i.baz supportActionBar2 = appCompatActivity.getSupportActionBar();
                        if (supportActionBar2 != null) {
                            supportActionBar2.s(true);
                        }
                        ((androidx.appcompat.widget.Toolbar) lazy.getValue()).setNavigationOnClickListener(new com.truecaller.editprofile.impl.ui.legacy.a(dVar, 1));
                        final ?? obj2 = new java.lang.Object();
                        ((kotlin.jvm.internal.h0) obj2).a = -1;
                        ((com.google.android.material.appbar.AppBarLayout) dVar.b0.getValue()).a(new qq.qux() { // from class: com.truecaller.editprofile.impl.ui.legacy.b
                            public final void a(com.google.android.material.appbar.AppBarLayout appBarLayout, int i3) {
                                kotlin.jvm.internal.h0 h0Var = obj2;
                                if (h0Var.a == -1) {
                                    h0Var.a = appBarLayout.getTotalScrollRange();
                                }
                                int i4 = h0Var.a + i3;
                                com.truecaller.editprofile.impl.ui.legacy.d dVar2 = dVar;
                                if (i4 == 0) {
                                    com.google.android.material.appbar.CollapsingToolbarLayout collapsingToolbarLayout = (com.google.android.material.appbar.CollapsingToolbarLayout) dVar2.c0.getValue();
                                    if (collapsingToolbarLayout != null) {
                                        collapsingToolbarLayout.setTitle(verifiedName);
                                        return;
                                    }
                                    return;
                                }
                                com.google.android.material.appbar.CollapsingToolbarLayout collapsingToolbarLayout2 = (com.google.android.material.appbar.CollapsingToolbarLayout) dVar2.c0.getValue();
                                if (collapsingToolbarLayout2 != null) {
                                    collapsingToolbarLayout2.setTitle("");
                                }
                            }
                        });
                    }
                    return kotlin.Unit.a;
                }
                throw new java.lang.IllegalStateException("No profile!");
            }
        }
        nVar = new com.truecaller.editprofile.impl.ui.legacy.n(sVar, quxVar);
        java.lang.Object obj3 = nVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = nVar.z;
        if (i == 0) {
        }
        final java.lang.String verifiedName2 = ((pg2.m) obj3).getVerifiedName();
        iVar = sVar.u;
        if (iVar == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if ((!kotlin.text.StringsKt.X(r5)) == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e2(com.truecaller.editprofile.impl.ui.legacy.s sVar, java.lang.String str) {
        boolean z;
        int i;
        int i2;
        int i3 = 0;
        if (str != null) {
            z = true;
        }
        z = false;
        com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
        if (hVar != null) {
            com.google.android.material.textfield.TextInputLayout textInputLayout = (com.google.android.material.textfield.TextInputLayout) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).D.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout, "<get-verifiedNameTextInputLayout>(...)");
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textInputLayout.setVisibility(i2);
        }
        com.truecaller.editprofile.impl.ui.legacy.h hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
        if (hVar2 != null) {
            com.google.android.material.textfield.TextInputLayout textInputLayout2 = (com.google.android.material.textfield.TextInputLayout) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar2).F.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout2, "<get-firstNameTextInputLayout>(...)");
            if (!z) {
                i = 0;
            } else {
                i = 8;
            }
            textInputLayout2.setVisibility(i);
        }
        com.truecaller.editprofile.impl.ui.legacy.h hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
        if (hVar3 != null) {
            com.google.android.material.textfield.TextInputLayout textInputLayout3 = (com.google.android.material.textfield.TextInputLayout) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar3).N.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout3, "<get-lastNameTextInputLayout>(...)");
            if (z) {
                i3 = 8;
            }
            textInputLayout3.setVisibility(i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x016c, code lost:
    
        if (r11 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0154, code lost:
    
        if (r1 == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0084, code lost:
    
        if (r1 == r4) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object f2(com.truecaller.editprofile.impl.ui.legacy.s sVar, pg2.i0 i0Var, ff3.qux quxVar) {
        com.truecaller.editprofile.impl.ui.legacy.r rVar;
        int i;
        pg2.c cVar;
        com.truecaller.rewardprogram.api.model.ProgressConfig[] progressConfigArr;
        java.lang.Object[] objArr;
        int i2;
        java.lang.Object[] objArr2;
        java.lang.Object[] objArr3;
        java.util.List C;
        com.truecaller.editprofile.impl.ui.legacy.h hVar;
        hk2.i iVar;
        com.truecaller.editprofile.impl.ui.legacy.h hVar2;
        rg2.m mVar = sVar.e;
        if (quxVar instanceof com.truecaller.editprofile.impl.ui.legacy.r) {
            rVar = (com.truecaller.editprofile.impl.ui.legacy.r) quxVar;
            int i3 = rVar.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rVar.C = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = rVar.A;
                java.lang.Object obj2 = ef3.bar.a;
                i = rVar.C;
                int i4 = 1;
                kotlin.Unit unit = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    od.p.E(obj);
                                    java.lang.String avatarUrl = ((pg2.m) obj).getAvatarUrl();
                                    if (avatarUrl != null) {
                                        com.truecaller.editprofile.impl.ui.legacy.h hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                                        if (hVar3 != null) {
                                            ((com.truecaller.editprofile.impl.ui.legacy.d) hVar3).l6(avatarUrl);
                                            unit = kotlin.Unit.a;
                                        }
                                    }
                                    com.truecaller.editprofile.impl.ui.legacy.h hVar4 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                                    if (hVar4 != null) {
                                        ((com.truecaller.editprofile.impl.ui.legacy.d) hVar4).o6();
                                        kotlin.Unit unit2 = kotlin.Unit.a;
                                    }
                                    hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                                    if (hVar2 != null) {
                                        android.view.View view = (android.view.View) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar2).e0.getValue();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "<get-savingLoadingLayer>(...)");
                                        gj.m.f0(view);
                                    }
                                    return kotlin.Unit.a;
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i4 = rVar.z;
                            java.lang.Object[] objArr4 = rVar.y;
                            objArr2 = rVar.x;
                            od.p.E(obj);
                            objArr3 = objArr4;
                            objArr3[i4] = obj;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr2, "elements");
                            C = kotlin.collections.v.C(objArr2);
                            if (C.isEmpty()) {
                                C = null;
                            }
                            if (C != null && (hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a) != null) {
                                com.truecaller.editprofile.impl.ui.legacy.d dVar = (com.truecaller.editprofile.impl.ui.legacy.d) hVar;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(C, "configs");
                                iVar = dVar.m;
                                if (iVar == null) {
                                    android.view.View requireView = dVar.requireView();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireView, "requireView(...)");
                                    iVar.L(requireView, new hk2.h(C), com.truecaller.rewardprogram.api.RewardProgramSource.EDIT_PROFILE);
                                    kotlin.Unit unit3 = kotlin.Unit.a;
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("rewardProgramMultipleProgressSnackbar");
                                    throw null;
                                }
                            }
                            hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                            if (hVar2 != null) {
                            }
                            return kotlin.Unit.a;
                        }
                        i2 = rVar.z;
                        java.lang.Object[] objArr5 = rVar.y;
                        com.truecaller.rewardprogram.api.model.ProgressConfig[] progressConfigArr2 = rVar.x;
                        od.p.E(obj);
                        objArr = objArr5;
                        progressConfigArr = progressConfigArr2;
                        objArr[i2] = obj;
                        rVar.x = progressConfigArr;
                        rVar.y = progressConfigArr;
                        rVar.z = 1;
                        rVar.C = 3;
                        obj = sVar.g2(rVar);
                        if (obj != obj2) {
                            java.lang.Object[] objArr6 = progressConfigArr;
                            objArr2 = objArr6;
                            objArr3 = objArr6;
                            objArr3[i4] = obj;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr2, "elements");
                            C = kotlin.collections.v.C(objArr2);
                            if (C.isEmpty()) {
                            }
                            if (C != null) {
                                com.truecaller.editprofile.impl.ui.legacy.d dVar2 = (com.truecaller.editprofile.impl.ui.legacy.d) hVar;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(C, "configs");
                                iVar = dVar2.m;
                                if (iVar == null) {
                                }
                            }
                            hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                            if (hVar2 != null) {
                            }
                            return kotlin.Unit.a;
                        }
                        return obj2;
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    com.truecaller.editprofile.impl.ui.legacy.h hVar5 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                    if (hVar5 != null) {
                        android.view.View view2 = (android.view.View) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar5).e0.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view2, "<get-savingLoadingLayer>(...)");
                        gj.m.j0(view2);
                    }
                    rVar.C = 1;
                    obj = mVar.l(i0Var, rVar);
                }
                cVar = (pg2.c) obj;
                if (!(cVar instanceof pg2.b)) {
                    sVar.z2();
                    progressConfigArr = new com.truecaller.rewardprogram.api.model.ProgressConfig[2];
                    uk2.g gVar = sVar.s;
                    com.truecaller.rewardprogram.api.model.BonusTaskType bonusTaskType = com.truecaller.rewardprogram.api.model.BonusTaskType.ADD_PICTURE;
                    rVar.x = progressConfigArr;
                    rVar.y = progressConfigArr;
                    rVar.z = 0;
                    rVar.C = 2;
                    obj = gVar.c(bonusTaskType, rVar);
                    if (obj != obj2) {
                        objArr = progressConfigArr;
                        i2 = 0;
                        objArr[i2] = obj;
                        rVar.x = progressConfigArr;
                        rVar.y = progressConfigArr;
                        rVar.z = 1;
                        rVar.C = 3;
                        obj = sVar.g2(rVar);
                        if (obj != obj2) {
                        }
                    }
                } else {
                    if (cVar instanceof pg2.qux) {
                        bd.bar.u(sVar.r, "InvalidImagePopup", "editProfile");
                        com.truecaller.editprofile.impl.ui.legacy.h hVar6 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                        if (hVar6 != null) {
                            androidx.fragment.app.g1 childFragmentManager = ((com.truecaller.editprofile.impl.ui.legacy.d) hVar6).getChildFragmentManager();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            com.truecaller.common.ui.dialogs.qux.a(childFragmentManager, "TAG_IMAGE_FORBIDDEN_DIALOG", 2132020750, 2132020749, 2131232202, 2132020748, 2132021588, true, com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation.VERTICAL);
                        }
                        sVar.z2();
                        kotlin.Unit unit4 = kotlin.Unit.a;
                    } else if (kotlin.jvm.internal.Intrinsics.b(cVar, pg2.baz.a)) {
                        rVar.C = 4;
                        obj = mVar.f(rVar);
                    } else {
                        com.truecaller.editprofile.impl.ui.legacy.h hVar7 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                        if (hVar7 != null) {
                            java.lang.String h = sVar.g.h(2132021592, new java.lang.Object[0]);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
                            ((com.truecaller.editprofile.impl.ui.legacy.d) hVar7).s6(h);
                            kotlin.Unit unit5 = kotlin.Unit.a;
                        }
                    }
                    hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                    if (hVar2 != null) {
                    }
                    return kotlin.Unit.a;
                }
                return obj2;
            }
        }
        rVar = new com.truecaller.editprofile.impl.ui.legacy.r(sVar, quxVar);
        java.lang.Object obj3 = rVar.A;
        java.lang.Object obj22 = ef3.bar.a;
        i = rVar.C;
        int i43 = 1;
        kotlin.Unit unit6 = null;
        if (i == 0) {
        }
        cVar = (pg2.c) obj3;
        if (!(cVar instanceof pg2.b)) {
        }
        return obj22;
    }

    public static java.lang.String h2(java.lang.String str) {
        boolean z;
        if (str != null) {
            z = !kotlin.text.StringsKt.X(str);
        } else {
            z = false;
        }
        if (!z) {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static boolean m2(java.lang.String str) {
        if (!kotlin.text.StringsKt.X(str) && t6.qux.a.matcher(str).matches()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object g2(ff3.qux quxVar) {
        com.truecaller.editprofile.impl.ui.legacy.k kVar;
        java.lang.Object obj;
        int i;
        if (quxVar instanceof com.truecaller.editprofile.impl.ui.legacy.k) {
            kVar = (com.truecaller.editprofile.impl.ui.legacy.k) quxVar;
            int i2 = kVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.z = i2 - Integer.MIN_VALUE;
                obj = kVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = kVar.z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return obj;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    kVar.z = 1;
                    obj = this.q.e(kVar);
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    com.truecaller.rewardprogram.api.model.BonusTaskType bonusTaskType = com.truecaller.rewardprogram.api.model.BonusTaskType.COMPLETE_PROFILE;
                    kVar.z = 2;
                    java.lang.Object c = this.s.c(bonusTaskType, kVar);
                    if (c == barVar) {
                        return barVar;
                    }
                    return c;
                }
                return null;
            }
        }
        kVar = new com.truecaller.editprofile.impl.ui.legacy.k(this, quxVar);
        obj = kVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = kVar.z;
        if (i == 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    public final com.truecaller.editprofile.impl.ui.legacy.i j2() {
        return (com.truecaller.editprofile.impl.ui.legacy.i) this.v.getValue(this, D[0]);
    }

    public final java.lang.String k2(com.truecaller.editprofile.impl.ui.legacy.Gender gender) {
        int i = com.truecaller.editprofile.impl.ui.legacy.j.a[gender.ordinal()];
        u03.g0 g0Var = this.g;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                java.lang.String h = g0Var.h(2132020771, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
                return h;
            }
            java.lang.String h2 = g0Var.h(2132020769, new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "getString(...)");
            return h2;
        }
        java.lang.String h3 = g0Var.h(2132020770, new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h3, "getString(...)");
        return h3;
    }

    public final java.lang.String l2() {
        java.lang.String str;
        zx.bar h = ((n11.l) this.k.b).h();
        if (h != null && (str = h.b) != null) {
            return str;
        }
        return "";
    }

    public final void m1() {
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.editprofile.impl.ui.legacy.l(this, null, 2), 3);
        super.m1();
    }

    public final void n2() {
        com.truecaller.editprofile.impl.ui.legacy.h hVar;
        if (l2().length() > 0 && (hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a) != null) {
            java.lang.String l2 = l2();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l2, "phoneNumber");
            ((android.widget.EditText) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).Q.getValue()).setText(t41.i.a(l2));
        }
    }

    public final void o2() {
        com.truecaller.editprofile.impl.ui.legacy.d dVar;
        android.content.Context context;
        this.h.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.add(1, -21);
        java.util.Date date = this.x;
        if (date != null) {
            calendar.setTime(date);
        }
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
        if (hVar != null) {
            ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).Z5();
        }
        com.truecaller.editprofile.impl.ui.legacy.h hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
        if (hVar2 != null && (context = (dVar = (com.truecaller.editprofile.impl.ui.legacy.d) hVar2).getContext()) != null) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131558584, (android.view.ViewGroup) null, false);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            dVar.p = inflate;
            android.app.DatePickerDialog datePickerDialog = new android.app.DatePickerDialog(context, 2132084733, dVar, i, i2, i3);
            android.view.Window window = datePickerDialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(context.getDrawable(2131231260));
            }
            if (((android.widget.LinearLayout) datePickerDialog.getDatePicker().findViewById(android.content.res.Resources.getSystem().getIdentifier("date_picker_header", "id", "android"))) == null) {
                android.view.View view = dVar.p;
                if (view != null) {
                    datePickerDialog.setCustomTitle(view);
                    kotlin.Unit unit = kotlin.Unit.a;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("birthdayPickerDialogTitleView");
                    throw null;
                }
            }
            datePickerDialog.setButton(-1, context.getString(2132021629), datePickerDialog);
            android.widget.DatePicker datePicker = datePickerDialog.getDatePicker();
            datePicker.init(i, i2, i3, new com.truecaller.editprofile.impl.ui.legacy.qux(dVar, 0));
            datePicker.setMaxDate(currentTimeMillis);
            datePickerDialog.show();
        }
        com.truecaller.editprofile.impl.ui.legacy.h hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
        if (hVar3 != null) {
            java.util.Date time = calendar.getTime();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
            ((com.truecaller.editprofile.impl.ui.legacy.d) hVar3).m6(time, this.B);
        }
    }

    public final void p2(boolean z) {
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ao1.a(z, this, (df3.bar) null, 5), 3);
    }

    public final void q2() {
        java.lang.String string;
        if (l2().length() > 0) {
            java.lang.String str = "editProfile";
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("editProfile", "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Click", "action");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("changeNumber", "subAction");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Click", "action");
            nc0.u1.e(new rc0.b("Click", "changeNumber", "editProfile"), this.r);
            com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
            if (hVar != null) {
                ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).Z5();
            }
            com.truecaller.editprofile.impl.ui.legacy.h hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
            if (hVar2 != null) {
                java.lang.String l2 = l2();
                com.truecaller.editprofile.impl.ui.legacy.d dVar = (com.truecaller.editprofile.impl.ui.legacy.d) hVar2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l2, "phoneNumber");
                android.os.Bundle arguments = dVar.getArguments();
                if (arguments != null && (string = arguments.getString("ARG_ANALYTICS_CONTEXT")) != null) {
                    str = string;
                }
                androidx.fragment.app.g1 childFragmentManager = dVar.getChildFragmentManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                childFragmentManager.getClass();
                androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(childFragmentManager);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l2, "phoneNumber");
                gh1.baz bazVar = new gh1.baz();
                bazVar.setArguments(ue0.i.t(new kotlin.Pair[]{new kotlin.Pair("analyticsContext", str), new kotlin.Pair("phoneNumber", l2)}));
                barVar.g(2131364006, bazVar, (java.lang.String) null);
                barVar.d((java.lang.String) null);
                barVar.l();
            }
        }
    }

    public final void r2() {
        com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
        if (hVar != null) {
            ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).Z5();
        }
        com.truecaller.editprofile.impl.ui.legacy.h hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
        if (hVar2 != null) {
            new com.truecaller.editprofile.impl.ui.legacy.v().show(((com.truecaller.editprofile.impl.ui.legacy.d) hVar2).getChildFragmentManager(), (java.lang.String) null);
        }
    }

    public final void u0(java.lang.Object obj) {
        com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "presenterView");
        ((com.truecaller.sdk.bar) this).a = hVar;
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new by1.b(this, null, 29), 3);
    }

    public final void u2() {
        java.lang.String str;
        if ((4 & 1) != 0) {
            str = null;
        } else {
            str = "editProfile";
        }
        nc0.u1.e(uf.qux.p("cancel", "action", "cancel", (java.lang.String) null, str), this.r);
    }

    public final void v2(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10) {
        com.truecaller.editprofile.impl.ui.legacy.ErrorField errorField;
        boolean z;
        boolean z2;
        com.truecaller.editprofile.impl.ui.legacy.ErrorField errorField2;
        com.truecaller.editprofile.impl.ui.legacy.ErrorField errorField3;
        boolean z3;
        com.truecaller.editprofile.impl.ui.legacy.h hVar;
        android.widget.EditText b6;
        java.lang.String str11 = str9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "firstName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "lastName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "streetAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "zipCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "city");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "company");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "jobTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "website");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "bio");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("editProfile", "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("save", "action");
        nc0.u1.e(new rc0.b("save", (java.lang.String) null, "editProfile"), this.r);
        int length = str.length();
        u03.g0 g0Var = this.g;
        if (length == 0) {
            com.truecaller.editprofile.impl.ui.legacy.h hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
            if (hVar2 != null) {
                java.lang.String h = g0Var.h(2132020765, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h, "error");
                com.google.android.material.textfield.TextInputLayout textInputLayout = (com.google.android.material.textfield.TextInputLayout) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar2).F.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout, "<get-firstNameTextInputLayout>(...)");
                textInputLayout.setErrorEnabled(true);
                textInputLayout.setError(h);
            }
            errorField = com.truecaller.editprofile.impl.ui.legacy.ErrorField.FIRST_NAME;
            z = false;
        } else {
            errorField = null;
            z = true;
        }
        if (str2.length() == 0) {
            com.truecaller.editprofile.impl.ui.legacy.h hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
            com.truecaller.editprofile.impl.ui.legacy.ErrorField errorField4 = errorField;
            if (hVar3 != null) {
                java.lang.String h2 = g0Var.h(2132020772, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "getString(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h2, "error");
                com.google.android.material.textfield.TextInputLayout textInputLayout2 = (com.google.android.material.textfield.TextInputLayout) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar3).N.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout2, "<get-lastNameTextInputLayout>(...)");
                textInputLayout2.setErrorEnabled(true);
                textInputLayout2.setError(h2);
            }
            if (errorField4 == null) {
                errorField = com.truecaller.editprofile.impl.ui.legacy.ErrorField.LAST_NAME;
            } else {
                errorField = errorField4;
            }
            z = false;
        }
        if (str3.length() > 0 && !fu.baz.B(str3)) {
            com.truecaller.editprofile.impl.ui.legacy.h hVar4 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
            com.truecaller.editprofile.impl.ui.legacy.ErrorField errorField5 = errorField;
            if (hVar4 != null) {
                java.lang.String h3 = g0Var.h(2132020762, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h3, "getString(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h3, "error");
                com.google.android.material.textfield.TextInputLayout textInputLayout3 = (com.google.android.material.textfield.TextInputLayout) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar4).B.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout3, "<get-emailTextInputLayout>(...)");
                textInputLayout3.setErrorEnabled(true);
                textInputLayout3.setError(h3);
            }
            if (errorField5 == null) {
                errorField2 = com.truecaller.editprofile.impl.ui.legacy.ErrorField.EMAIL;
            } else {
                errorField2 = errorField5;
            }
            z2 = false;
        } else {
            z2 = z;
            errorField2 = errorField;
        }
        if (str11.length() > 0 && !m2(str11)) {
            com.truecaller.editprofile.impl.ui.legacy.h hVar5 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
            com.truecaller.editprofile.impl.ui.legacy.ErrorField errorField6 = errorField2;
            if (hVar5 != null) {
                java.lang.String h4 = g0Var.h(2132020784, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h4, "getString(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h4, "error");
                com.google.android.material.textfield.TextInputLayout textInputLayout4 = (com.google.android.material.textfield.TextInputLayout) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar5).X.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout4, "<get-websiteEditTextInputLayout>(...)");
                textInputLayout4.setErrorEnabled(true);
                textInputLayout4.setError(h4);
            }
            if (errorField6 == null) {
                errorField3 = com.truecaller.editprofile.impl.ui.legacy.ErrorField.WEBSITE;
            } else {
                errorField3 = errorField6;
            }
            z2 = false;
        } else {
            errorField3 = errorField2;
        }
        if (errorField3 != null && (hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a) != null) {
            com.truecaller.editprofile.impl.ui.legacy.d dVar = (com.truecaller.editprofile.impl.ui.legacy.d) hVar;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorField3, "errorField");
            int i = com.truecaller.editprofile.impl.ui.legacy.c.b[errorField3.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            b6 = (android.widget.EditText) dVar.Y.getValue();
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    } else {
                        b6 = (android.widget.EditText) dVar.A.getValue();
                    }
                } else {
                    b6 = dVar.c6();
                }
            } else {
                b6 = dVar.b6();
            }
            dVar.Z5();
            ((android.view.View) dVar.O.getValue()).scrollTo(0, b6.getTop());
            b6.requestFocus();
        }
        if (!z2) {
            return;
        }
        if (m2(str11) && !E.matcher(str11).matches() && m2("http://".concat(str11))) {
            str11 = "http://".concat(str11);
        }
        java.lang.String obj = kotlin.text.StringsKt.u0(str11).toString();
        com.truecaller.editprofile.impl.ui.legacy.h hVar6 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
        if (hVar6 != null) {
            com.truecaller.editprofile.impl.ui.legacy.d dVar2 = (com.truecaller.editprofile.impl.ui.legacy.d) hVar6;
            z3 = true;
            dVar2.e6().F(true);
            android.view.View view = (android.view.View) dVar2.e0.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "<get-savingLoadingLayer>(...)");
            gj.m.j0(view);
        } else {
            z3 = true;
        }
        this.A = z3;
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.editprofile.impl.ui.legacy.p(this, str, str2, str3, str4, str6, str5, str7, str8, obj, str10, null), 3);
    }

    public final void w2() {
        com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
        if (hVar != null) {
            ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).Z5();
        }
        com.truecaller.editprofile.impl.ui.legacy.h hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
        if (hVar2 != null) {
            com.google.firebase.messaging.o oVar = this.k;
            android.content.Intent b = ((q83.a) oVar.d).b((android.content.Context) oVar.a);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "intent");
            ((com.truecaller.editprofile.impl.ui.legacy.d) hVar2).startActivity(b);
        }
    }

    public final void x2(com.truecaller.editprofile.impl.ui.legacy.i iVar) {
        this.v.setValue(this, D[0], iVar);
    }

    public final void y2() {
        java.lang.String str;
        int i;
        zx.bar i2 = ((n11.l) this.k.b).i();
        java.lang.String str2 = null;
        if (i2 != null) {
            str = i2.b;
        } else {
            str = null;
        }
        if (str == null) {
            i = 2132020752;
        } else {
            i = 2132020780;
        }
        java.lang.String h = this.g.h(i, new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
        com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) this).a;
        if (hVar != null) {
            if (str != null) {
                str2 = h2(str);
            }
            if (str2 == null) {
                str2 = "";
            }
            com.truecaller.editprofile.impl.ui.legacy.d dVar = (com.truecaller.editprofile.impl.ui.legacy.d) hVar;
            kotlin.Lazy lazy = dVar.T;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "secondaryPhoneNumber");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h, "secondaryNumberHint");
            android.widget.ImageView imageView = (android.widget.ImageView) dVar.S.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "<get-editSecondaryPhoneNumberButton>(...)");
            gj.m.k0(imageView, !kotlin.text.StringsKt.X(str2));
            ((com.google.android.material.textfield.TextInputLayout) dVar.U.getValue()).setHint(h);
            ((android.widget.EditText) lazy.getValue()).setText(t41.i.a(str2));
            ((android.widget.EditText) lazy.getValue()).setEnabled(kotlin.text.StringsKt.X(str2));
        }
    }

    public final void z2() {
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.editprofile.impl.ui.legacy.q(this, null, 0), 3);
    }
}
