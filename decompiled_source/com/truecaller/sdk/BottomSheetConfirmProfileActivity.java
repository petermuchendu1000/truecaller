package com.truecaller.sdk;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/sdk/BottomSheetConfirmProfileActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lip2/bar;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class BottomSheetConfirmProfileActivity extends com.truecaller.sdk.Hilt_BottomSheetConfirmProfileActivity implements ip2.bar, android.view.View.OnClickListener {
    public static final /* synthetic */ int j0 = 0;
    public com.truecaller.sdk.f d0;
    public final kotlin.Lazy e0 = kotlin.LazyKt.lazy(kotlin.k.c, new com.truecaller.sdk.c(this, 0));
    public u03.g0 f0;
    public boolean g0;
    public boolean h0;
    public android.os.CountDownTimer i0;

    @Override // ip2.baz
    public final void M0() {
        u0().f2();
    }

    @Override // ip2.baz
    public final void N0(android.text.SpannableStringBuilder spannableStringBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "brandingText");
        ((android.widget.TextView) t0().b.p).setText(spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ip2.baz
    public final java.lang.String O0(int i) {
        java.lang.String string = getString(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // ip2.baz
    public final void P0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "avatarUrl");
    }

    @Override // ip2.baz
    public final void Q0() {
        t0().b.c.setEnabled(true);
        t0().b.c.setOnClickListener(this);
        ((android.widget.ImageView) t0().b.t).setOnClickListener(this);
        com.google.android.material.bottomsheet.BottomSheetBehavior G = com.google.android.material.bottomsheet.BottomSheetBehavior.G((android.widget.LinearLayout) t0().b.k);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(G, "from(...)");
        G.A(new az1.i(this, 1));
    }

    @Override // ip2.baz
    public final void R0() {
        u0().h2();
    }

    @Override // ip2.baz
    public final void S0(boolean z) {
        int i;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) t0().b.h;
        zc.t tVar = new zc.t();
        zc.n nVar = new zc.n();
        nVar.f.add((android.widget.LinearLayout) t0().b.j);
        nVar.a(new com.truecaller.sdk.a(this, z, 0));
        tVar.T(nVar);
        tVar.V(300L);
        zc.r.a(linearLayout, tVar);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) t0().b.j;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout2.setVisibility(i);
    }

    @Override // ip2.baz
    public final void T0(com.truecaller.android.sdk.common.models.TrueProfile trueProfile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trueProfile, "trueProfile");
        u0().c2(trueProfile);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ip2.baz
    public final void U0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "partnerAppName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "fullName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "partnerIntentText");
        android.widget.TextView textView = (android.widget.TextView) t0().b.n;
        java.lang.String string = getString(2132018904);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{str2}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textView.setText(format);
        android.widget.TextView textView2 = t0().b.c;
        java.lang.String str5 = getResources().getStringArray(2130903046)[0];
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str5, "get(...)");
        java.lang.String format2 = java.lang.String.format(str5, java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        textView2.setText(format2);
        t0().b.d.setText(getString(2132018878));
        android.widget.TextView textView3 = (android.widget.TextView) t0().b.q;
        java.lang.String string2 = getString(2132018901);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        java.lang.String format3 = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{str3}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
        textView3.setText(format3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ip2.baz
    public final boolean V0() {
        if (g6.b.b(this, "android.permission.READ_PHONE_STATE") == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ip2.baz
    public final void h0() {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) t0().b.h;
        zc.bar barVar = new zc.bar();
        barVar.S(new com.truecaller.sdk.b(this, 0));
        zc.r.a(linearLayout, barVar);
        t0().b.c.setText(getString(2132018868));
        t0().b.c.setEnabled(false);
        t0().b.c.setOnClickListener(null);
        ((android.widget.TextView) t0().b.o).setVisibility(8);
        ((android.widget.ProgressBar) t0().b.r).setVisibility(0);
        ((android.widget.LinearLayout) t0().b.i).setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ip2.baz
    public final void j0() {
        finish();
        overridePendingTransition(0, 0);
    }

    public final void onBackPressed() {
        ((com.truecaller.sdk.g) u0()).n2().t(2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@org.jetbrains.annotations.NotNull android.view.View v) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "v");
        if (kotlin.jvm.internal.Intrinsics.b(v, t0().b.c)) {
            ((com.truecaller.sdk.g) u0()).n2().w();
        } else if (kotlin.jvm.internal.Intrinsics.b(v, t0().b.d)) {
            ((com.truecaller.sdk.g) u0()).n2().u();
        } else if (kotlin.jvm.internal.Intrinsics.b(v, (android.widget.ImageView) t0().b.t)) {
            u0().e2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.sdk.Hilt_BottomSheetConfirmProfileActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        setContentView(t0().a);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) t0().b.k;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "rootView");
        ak.r0.i(linearLayout, com.truecaller.common.ui.insets.InsetType.NavigationBar);
        if (u0().d2(bundle)) {
            u0().u0(this);
        } else {
            finish();
        }
    }

    @Override // com.truecaller.sdk.Hilt_BottomSheetConfirmProfileActivity
    public final void onDestroy() {
        super.onDestroy();
        u0().m1();
        android.os.CountDownTimer countDownTimer = this.i0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "outState");
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        u0().g2(bundle);
    }

    public final void onStop() {
        super.onStop();
        com.truecaller.sdk.g gVar = (com.truecaller.sdk.g) u0();
        java.util.Locale locale = gVar.u;
        if (locale != null) {
            gVar.l.s(locale);
        }
    }

    public final mo2.baz t0() {
        return (mo2.baz) this.e0.getValue();
    }

    @Override // ip2.baz
    public final void u(java.lang.String str) {
        t0().b.s.setVisibility(0);
        t0().b.d.setText(str);
        t0().b.d.setVisibility(0);
        t0().b.d.setOnClickListener(this);
    }

    public final com.truecaller.sdk.f u0() {
        com.truecaller.sdk.f fVar = this.d0;
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.Intrinsics.n("mPresenter");
        throw null;
    }

    public final void v0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "imageUrl");
        com.bumptech.glide.baz.e(t0().a.getContext()).q(str).q(t41.i.b(360.0f, t0().a.getContext()), t41.i.b(80.0f, t0().a.getContext())).c().R(new com.truecaller.sdk.qux(this)).P(t0().b.u);
    }

    public final void w0(long j) {
        if (this.g0) {
            androidx.appcompat.widget.AppCompatImageView appCompatImageView = t0().b.u;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatImageView, "ivBanner");
            gj.m.j0(appCompatImageView);
            android.widget.Space space = (android.widget.Space) t0().b.l;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(space, "bannerDivider");
            gj.m.j0(space);
            com.truecaller.sdk.g gVar = (com.truecaller.sdk.g) u0();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("shown", "status");
            gVar.n2().s("shown");
            return;
        }
        this.i0 = new com.truecaller.sdk.d(j, this, 0).start();
    }
}
