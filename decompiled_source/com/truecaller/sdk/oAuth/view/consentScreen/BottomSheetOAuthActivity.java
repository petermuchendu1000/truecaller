package com.truecaller.sdk.oAuth.view.consentScreen;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u00020\b*\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/truecaller/sdk/oAuth/view/consentScreen/BottomSheetOAuthActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lyo2/baz;", "Landroid/view/View$OnClickListener;", "Lap2/baz;", "<init>", "()V", "Landroid/view/View;", "", "enable", "(Landroid/view/View;)V", "disable", "view", "onClick", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class BottomSheetOAuthActivity extends com.truecaller.sdk.oAuth.view.consentScreen.Hilt_BottomSheetOAuthActivity implements yo2.baz, android.view.View.OnClickListener, ap2.baz {
    public static final /* synthetic */ int l0 = 0;
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 20));
    public yo2.qux e0;
    public w31.c f0;
    public android.widget.ListPopupWindow g0;
    public boolean h0;
    public boolean i0;
    public android.os.CountDownTimer j0;
    public com.google.android.material.bottomsheet.BottomSheetBehavior k0;

    @Override // yo2.a
    public final void C1(int i) {
        t0().m = java.lang.Integer.valueOf(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yo2.a
    public final void C4() {
        ak.r0.k0(this, 2132018889, (java.lang.String) null, 0, 6);
    }

    @Override // yo2.a
    public final void F4() {
        yo2.qux quxVar = this.e0;
        if (quxVar != null) {
            quxVar.v2();
        }
    }

    @Override // yo2.a
    public final void G1(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "fullName");
        u0().c.v.setText(str);
    }

    @Override // yo2.a
    public final void H4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "partnerIntentText");
        u0().c.t.setText(str);
    }

    @Override // yo2.a
    public final void I1(boolean z) {
        int i;
        int i2;
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) u0().c.q;
        int i3 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = u0().c.o;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        constraintLayout.setVisibility(i2);
        android.view.View view = u0().c.c;
        if (!z) {
            i3 = 0;
        }
        view.setVisibility(i3);
    }

    @Override // yo2.a
    public final void L4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "partnerAvatarLetter");
        t0().C2(new com.truecaller.common.ui.avatar.AvatarXConfig((android.net.Uri) null, (java.lang.String) null, str, false, false, false, false, false, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, -9), false);
    }

    @Override // yo2.a
    public final void M(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "termsOfServiceUrl");
        yo2.qux quxVar = this.e0;
        if (quxVar != null) {
            quxVar.u2("tos_clicked", str);
        }
    }

    @Override // yo2.a
    public final void M0() {
        yo2.qux quxVar = this.e0;
        if (quxVar != null) {
            quxVar.p2();
        }
    }

    @Override // yo2.a
    public final void M4(android.text.SpannableStringBuilder spannableStringBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "legalText");
        u0().c.u.setText(spannableStringBuilder);
        u0().c.u.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    @Override // yo2.a
    public final void R1() {
        android.widget.ListPopupWindow listPopupWindow = this.g0;
        if (listPopupWindow != null) {
            if (listPopupWindow != null) {
                listPopupWindow.setAnchorView((android.widget.LinearLayout) ((d91.c) u0().c.n).c);
            } else {
                kotlin.jvm.internal.Intrinsics.n("languageSelectorPopupWindow");
                throw null;
            }
        }
    }

    @Override // yo2.a
    public final void U1(com.truecaller.sdk.oAuth.networking.data.PartnerDetailsResponse partnerDetailsResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerDetailsResponse, "partnerDetails");
        yo2.qux quxVar = this.e0;
        if (quxVar != null) {
            quxVar.j2(partnerDetailsResponse);
        }
    }

    @Override // yo2.a
    public final void V1(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "languageName");
        ((androidx.appcompat.widget.AppCompatTextView) ((d91.c) u0().c.m).d).setText(str);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((d91.c) u0().c.m).c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "llLanguage");
        gj.m.j0(linearLayout);
    }

    @Override // ap2.baz
    public final void Y2() {
        yo2.qux quxVar = this.e0;
        if (quxVar != null) {
            ((ro2.c) quxVar.e2()).b().a("popup_dismissed");
        }
    }

    @Override // ap2.baz
    public final void a(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "interactionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "url");
        yo2.qux quxVar = this.e0;
        if (quxVar != null) {
            quxVar.u2(str, str2);
        }
    }

    @Override // yo2.a
    public final void c3(int i) {
        u0().c.e.setBackgroundResource(i);
    }

    public final void disable(@org.jetbrains.annotations.NotNull android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        view.setAlpha(0.38f);
        view.setClickable(false);
    }

    @Override // yo2.a
    public final void e3(int i) {
        t0().n2(java.lang.Integer.valueOf(i));
    }

    public final void enable(@org.jetbrains.annotations.NotNull android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
        view.setAlpha(1.0f);
        view.setClickable(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yo2.a
    public final void h0() {
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = u0().c.k;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivDropDownIcon");
        gj.m.f0(appCompatImageView);
        androidx.appcompat.widget.AppCompatImageView appCompatImageView2 = u0().c.j;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "ivCancelVariant");
        gj.m.f0(appCompatImageView2);
        androidx.appcompat.widget.AppCompatImageView appCompatImageView3 = u0().c.i;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "ivCancelFillVariant");
        gj.m.f0(appCompatImageView3);
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = u0().c.r;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatTextView, "tvConfirm");
        gj.m.j0(appCompatTextView);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = u0().c.f;
        zc.bar barVar = new zc.bar();
        barVar.S(new com.truecaller.sdk.b(this, 2));
        zc.r.a(constraintLayout, barVar);
        u0().c.r.setText(getString(2132018868));
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = u0().c.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout2, "clPrimaryCta");
        disable(constraintLayout2);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) u0().c.p;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(progressBar, "pbConfirm");
        gj.m.j0(progressBar);
        androidx.appcompat.widget.AppCompatTextView appCompatTextView2 = u0().c.s;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "tvContinueWithDifferentNumber");
        gj.m.f0(appCompatTextView2);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((d91.c) u0().c.m).c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "llLanguage");
        gj.m.f0(linearLayout);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ((d91.c) u0().c.n).c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout2, "llLanguage");
        gj.m.f0(linearLayout2);
        android.view.View view = u0().c.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "legalTextDivider");
        gj.m.f0(view);
        androidx.appcompat.widget.AppCompatTextView appCompatTextView3 = u0().c.u;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "tvTermsPrivacy");
        gj.m.f0(appCompatTextView3);
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = u0().c.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "animConfirm");
        gj.m.f0(lottieAnimationView);
    }

    @Override // yo2.a
    public final void h3(int i, int i2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "buttonText");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = u0().c.e;
        android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(i);
        java.util.WeakHashMap weakHashMap = u6.t0.a;
        u6.k0.i(constraintLayout, valueOf);
        u0().c.r.setTextColor(i2);
        u0().c.r.setText(str);
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = u0().c.r;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatTextView, "tvConfirm");
        gj.m.j0(appCompatTextView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yo2.a
    public final void j0() {
        finish();
        t41.p.d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yo2.a
    public final void o2(boolean z) {
        u0().c.l.setPresenter(t0());
        int i = 1;
        t0().D2(true);
        u0().c.e.setOnClickListener(this);
        ((android.widget.LinearLayout) ((d91.c) u0().c.m).c).setOnClickListener(this);
        ((android.widget.LinearLayout) ((d91.c) u0().c.n).c).setOnClickListener(this);
        u0().c.s.setOnClickListener(this);
        u0().c.h.setOnClickListener(this);
        com.google.android.material.bottomsheet.BottomSheetBehavior G = com.google.android.material.bottomsheet.BottomSheetBehavior.G(u0().c.f);
        if (z) {
            G.N(3);
            G.J = true;
            G.K = false;
            G.L(false);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(G, "apply(...)");
        this.k0 = G;
        u0().b.setOnClickListener(this);
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.k0;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A(new az1.i(this, 6));
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior2 = this.k0;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.N(3);
                android.widget.ListPopupWindow listPopupWindow = new android.widget.ListPopupWindow(this, null, android.R.attr.listPopupWindowStyle);
                this.g0 = listPopupWindow;
                listPopupWindow.setAnchorView((android.widget.LinearLayout) ((d91.c) u0().c.m).c);
                java.util.List list = ro2.bar.b;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((rz1.baz) it.next()).a);
                }
                android.widget.ArrayAdapter arrayAdapter = new android.widget.ArrayAdapter((android.content.Context) this, 2131559803, (java.util.List) arrayList);
                android.widget.ListPopupWindow listPopupWindow2 = this.g0;
                if (listPopupWindow2 != null) {
                    listPopupWindow2.setAdapter(arrayAdapter);
                    android.widget.ListPopupWindow listPopupWindow3 = this.g0;
                    if (listPopupWindow3 != null) {
                        listPopupWindow3.setContentWidth(getResources().getDimensionPixelSize(2131166736));
                        android.widget.ListPopupWindow listPopupWindow4 = this.g0;
                        if (listPopupWindow4 != null) {
                            listPopupWindow4.setOnItemClickListener(new com.truecaller.search.global.h(this, i));
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("languageSelectorPopupWindow");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.Intrinsics.n("languageSelectorPopupWindow");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("languageSelectorPopupWindow");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("bottomSheetBehavior");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("bottomSheetBehavior");
        throw null;
    }

    @Override // yo2.a
    public final void o3(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "privacyPolicyUrl");
        yo2.qux quxVar = this.e0;
        if (quxVar != null) {
            quxVar.u2("pp_clicked", str);
        }
    }

    public final void onBackPressed() {
        boolean z;
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.k0;
        if (bottomSheetBehavior != null && bottomSheetBehavior.L != 5) {
            yo2.qux quxVar = this.e0;
            if (quxVar != null) {
                z = quxVar.l2();
            } else {
                z = false;
            }
            if (z) {
                return;
            }
        }
        yo2.qux quxVar2 = this.e0;
        if (quxVar2 != null) {
            quxVar2.m2(2);
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [yo2.a, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public void onClick(@org.jetbrains.annotations.NotNull android.view.View view) {
        yo2.qux quxVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        if (kotlin.jvm.internal.Intrinsics.b(view, u0().c.e)) {
            yo2.qux quxVar2 = this.e0;
            if (quxVar2 != null) {
                quxVar2.q2();
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.b(view, u0().c.s)) {
            yo2.qux quxVar3 = this.e0;
            if (quxVar3 != null) {
                quxVar3.o2();
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.b(view, u0().c.h) && !kotlin.jvm.internal.Intrinsics.b(view, u0().c.j) && !kotlin.jvm.internal.Intrinsics.b(view, u0().c.i)) {
            if (!kotlin.jvm.internal.Intrinsics.b(view, (android.widget.LinearLayout) ((d91.c) u0().c.m).c) && !kotlin.jvm.internal.Intrinsics.b(view, (android.widget.LinearLayout) ((d91.c) u0().c.n).c)) {
                if ((kotlin.jvm.internal.Intrinsics.b(view, u0().c.k) || kotlin.jvm.internal.Intrinsics.b(view, u0().b)) && (quxVar = this.e0) != null) {
                    quxVar.l2();
                    return;
                }
                return;
            }
            android.widget.ListPopupWindow listPopupWindow = this.g0;
            if (listPopupWindow != null) {
                listPopupWindow.show();
                return;
            }
            return;
        }
        yo2.qux quxVar4 = this.e0;
        if (quxVar4 != null) {
            ro2.c cVar = (ro2.c) quxVar4.e2();
            cVar.e(com.truecaller.sdk.oAuth.networking.data.RejectionReason.REJECTED.getValue());
            com.truecaller.android.sdk.oAuth.TcOAuthError.UserDeniedError userDeniedError = com.truecaller.android.sdk.oAuth.TcOAuthError.UserDeniedError.INSTANCE;
            cVar.k(new com.truecaller.android.sdk.oAuth.OAuthResponse.FailureResponse(userDeniedError), new com.truecaller.sdk.oAuth.WrapperExtras("22 : User denied by clicking on cross button of consent screen"));
            userDeniedError.getErrorCode();
            cVar.f(0, false);
            ?? r5 = cVar.e;
            if (r5 != 0) {
                r5.j0();
            }
        }
    }

    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        yo2.qux quxVar = this.e0;
        if (quxVar != null) {
            ((ro2.e) quxVar.e2()).a.putInt("tc_oauth_extras_orientation", configuration.orientation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.sdk.oAuth.view.consentScreen.Hilt_BottomSheetOAuthActivity
    public final void onCreate(android.os.Bundle bundle) {
        boolean z;
        int i;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        int i2 = getResources().getConfiguration().orientation;
        if (android.os.Build.VERSION.SDK_INT != 26) {
            if (i2 == 2) {
                i = 6;
            } else {
                i = 1;
            }
            setRequestedOrientation(i);
        }
        yo2.qux quxVar = this.e0;
        if (quxVar != null) {
            z = quxVar.n2(bundle);
        } else {
            z = false;
        }
        if (z) {
            yo2.qux quxVar2 = this.e0;
            if (quxVar2 != null) {
                quxVar2.u0(this);
                return;
            }
            return;
        }
        finish();
    }

    @Override // com.truecaller.sdk.oAuth.view.consentScreen.Hilt_BottomSheetOAuthActivity
    public final void onDestroy() {
        super.onDestroy();
        yo2.qux quxVar = this.e0;
        if (quxVar != null) {
            quxVar.m1();
        }
        android.os.CountDownTimer countDownTimer = this.j0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "outState");
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        yo2.qux quxVar = this.e0;
        if (quxVar != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "outState");
            ro2.e eVar = (ro2.e) quxVar.e2();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "outState");
            bundle.putBundle("sdkKeySaveInstance", eVar.a);
        }
    }

    public final void onStart() {
        super.onStart();
        yo2.qux quxVar = this.e0;
        if (quxVar != null) {
            quxVar.r2();
        }
    }

    public final void onStop() {
        java.util.Locale locale;
        super.onStop();
        yo2.qux quxVar = this.e0;
        if (quxVar != null && (locale = quxVar.v) != null) {
            quxVar.f.s(locale);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yo2.a
    public final void openUrl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "url");
        t41.p.n(this, str);
    }

    @Override // yo2.a
    public final void p1(int i) {
        t0().n = java.lang.Integer.valueOf(i);
    }

    @Override // yo2.a
    public final void p3(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "logoUri");
        com.truecaller.common.ui.avatar.AvatarXView avatarXView = u0().c.l;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(avatarXView, "ivPartner");
        avatarXView.e(false, uri);
    }

    public final w31.c t0() {
        w31.c cVar = this.f0;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.Intrinsics.n("avatarXPresenter");
        throw null;
    }

    @Override // yo2.a
    public final void t4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "numberWithoutExtension");
        u0().c.w.setText(str);
    }

    @Override // yo2.a
    public final void u(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        u0().c.s.setText(str);
    }

    public final mo2.bar u0() {
        return (mo2.bar) this.d0.getValue();
    }

    @Override // yo2.a
    public final void u3(com.truecaller.sdk.oAuth.view.dialog.AdditionalPartnerInfo additionalPartnerInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalPartnerInfo, "additionalPartnerInfo");
        java.lang.String str = ap2.b.p;
        p40.l.u(additionalPartnerInfo, this).show(getSupportFragmentManager(), ap2.b.p);
    }

    @Override // yo2.a
    public final void u4() {
        u0().c.l.postDelayed(new y.g(this, 5), 1500L);
    }

    @Override // yo2.a
    public final void v4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "languageName");
        ((androidx.appcompat.widget.AppCompatTextView) ((d91.c) u0().c.n).d).setText(str);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((d91.c) u0().c.n).c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "llLanguage");
        gj.m.j0(linearLayout);
    }
}
