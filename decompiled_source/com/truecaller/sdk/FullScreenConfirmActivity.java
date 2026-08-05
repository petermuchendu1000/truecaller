package com.truecaller.sdk;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/sdk/FullScreenConfirmActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lip2/qux;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class FullScreenConfirmActivity extends com.truecaller.sdk.Hilt_FullScreenConfirmActivity implements ip2.qux, android.view.View.OnClickListener {
    public com.truecaller.sdk.f d0;
    public final kotlin.Lazy e0 = kotlin.LazyKt.lazy(kotlin.k.c, new com.truecaller.sdk.c(this, 1));
    public w31.c f0;

    public final void I1(boolean z) {
        if (!z) {
            u0().f.setVisibility(8);
            u0().c.c.setVisibility(0);
        } else {
            u0().f.setVisibility(0);
            u0().c.c.setVisibility(4);
        }
    }

    @Override // ip2.baz
    public final void M0() {
        v0().f2();
    }

    @Override // ip2.baz
    public final void N0(android.text.SpannableStringBuilder spannableStringBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableStringBuilder, "brandingText");
        u0().g.setText(spannableStringBuilder);
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
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "avatarUrl");
        com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig = t0().h0;
        if (avatarXConfig != null) {
            str2 = avatarXConfig.d;
        } else {
            str2 = null;
        }
        t0().C2(new com.truecaller.common.ui.avatar.AvatarXConfig(str, str2), false);
    }

    @Override // ip2.baz
    public final void Q0() {
        u0().i.f.setPresenter(t0());
        u0().i.d.setOnClickListener(this);
        u0().c.d.setOnClickListener(this);
    }

    @Override // ip2.baz
    public final void R0() {
        v0().h2();
        u0().b.setVisibility(0);
    }

    @Override // ip2.baz
    public final void S0(boolean z) {
        int i;
        float f;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = u0().a;
        zc.t tVar = new zc.t();
        tVar.T(new zc.c(1));
        zc.c cVar = new zc.c(2);
        ((zc.n) cVar).c = 0L;
        tVar.T(cVar);
        tVar.T(new zc.n());
        zc.r.a(constraintLayout, tVar);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) u0().i.g;
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        recyclerView.setVisibility(i);
        android.view.View view = u0().i.b;
        if (z) {
            i2 = 0;
        }
        view.setVisibility(i2);
        androidx.appcompat.widget.AppCompatImageView appCompatImageView = u0().i.d;
        if (z) {
            f = 180.0f;
        } else {
            f = 0.0f;
        }
        appCompatImageView.setRotation(f);
    }

    @Override // ip2.baz
    public final void T0(com.truecaller.android.sdk.common.models.TrueProfile trueProfile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trueProfile, "trueProfile");
        v0().c2(trueProfile);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ip2.baz
    public final void U0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "partnerAppName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "fullName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "partnerIntentText");
        u0().d.setText(str4);
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = u0().e;
        java.lang.String string = getString(2132018912, str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        android.text.Spanned c = ug1.bar.c(string);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c, "fromHtml(...)");
        appCompatTextView.setText(c);
        u0().i.h.setText(str3);
        u0().i.i.setText(str);
        androidx.appcompat.widget.AppCompatTextView appCompatTextView2 = (androidx.appcompat.widget.AppCompatTextView) u0().c.e;
        java.lang.String string2 = getString(2132018904, str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        android.text.Spanned c2 = ug1.bar.c(string2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c2, "fromHtml(...)");
        appCompatTextView2.setText(c2);
        ((androidx.appcompat.widget.AppCompatTextView) u0().c.e).setCompoundDrawablesWithIntrinsicBounds(bi3.a.x(this, 2131233210, 2130970935, android.graphics.PorterDuff.Mode.SRC_IN), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ip2.baz
    public final boolean V0() {
        if (g6.b.b(this, "android.permission.READ_PHONE_STATE") == 0) {
            return true;
        }
        return false;
    }

    @Override // ip2.baz
    public final void h0() {
    }

    public final void onBackPressed() {
        ((com.truecaller.sdk.g) v0()).n2().t(2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@org.jetbrains.annotations.NotNull android.view.View v) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "v");
        if (kotlin.jvm.internal.Intrinsics.b(v, u0().c.d)) {
            ((com.truecaller.sdk.g) v0()).n2().w();
        } else if (kotlin.jvm.internal.Intrinsics.b(v, u0().i.d)) {
            v0().e2();
        } else if (kotlin.jvm.internal.Intrinsics.b(v, u0().c.b)) {
            ((com.truecaller.sdk.g) v0()).n2().u();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.sdk.Hilt_FullScreenConfirmActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (v0().d2(bundle)) {
            v0().u0(this);
        } else {
            finish();
        }
    }

    @Override // com.truecaller.sdk.Hilt_FullScreenConfirmActivity
    public final void onDestroy() {
        super.onDestroy();
        v0().m1();
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "outState");
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        v0().g2(bundle);
    }

    public final void onStop() {
        super.onStop();
        com.truecaller.sdk.g gVar = (com.truecaller.sdk.g) v0();
        java.util.Locale locale = gVar.u;
        if (locale != null) {
            gVar.l.s(locale);
        }
    }

    public final w31.c t0() {
        w31.c cVar = this.f0;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.Intrinsics.n("avatarXPresenter");
        throw null;
    }

    @Override // ip2.baz
    public final void u(java.lang.String str) {
        u0().c.b.setText(str);
        u0().c.b.setVisibility(0);
        u0().c.b.setOnClickListener(this);
    }

    public final mo2.qux u0() {
        return (mo2.qux) this.e0.getValue();
    }

    public final com.truecaller.sdk.f v0() {
        com.truecaller.sdk.f fVar = this.d0;
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }
}
