package com.truecaller.messaging.inboxcleanup;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class c extends of0.baz implements m22.a0 {
    public final kotlin.coroutines.CoroutineContext d;
    public final kotlin.coroutines.CoroutineContext e;
    public final xz1.q f;
    public final m22.k g;
    public final com.truecaller.messaging.defaultsms.c h;
    public final m03.p i;
    public final nc0.bar j;
    public final u03.b k;
    public final t41.r0 l;
    public final gd0.c m;
    public final u03.b0 n;
    public final u6.i o;
    public int p;
    public int q;
    public int r;
    public boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, xz1.q qVar, m22.k kVar, com.truecaller.messaging.defaultsms.c cVar, m03.p pVar, nc0.bar barVar, u03.b bVar, t41.r0 r0Var, qo1.k kVar2, gd0.c cVar2, u03.b0 b0Var, u6.i iVar) {
        super(coroutineContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "asyncContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "messageSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "inboxCleaner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "defaultSmsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "dateHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "deviceInfoUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0Var, "timestampUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar2, "messagingFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar2, "firebaseAnalyticsWrapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "resourceProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "makeBonusTaskClaimableUseCase");
        this.d = coroutineContext;
        this.e = coroutineContext2;
        this.f = qVar;
        this.g = kVar;
        this.h = cVar;
        this.i = pVar;
        this.j = barVar;
        this.k = bVar;
        this.l = r0Var;
        this.m = cVar2;
        this.n = b0Var;
        this.o = iVar;
    }

    public final void c2() {
        m22.b0 b0Var = (m22.b0) ((com.truecaller.sdk.bar) this).a;
        if (b0Var != null) {
            ((m22.y) b0Var).a6().h.setEnabled(false);
        }
        m22.b0 b0Var2 = (m22.b0) ((com.truecaller.sdk.bar) this).a;
        if (b0Var2 != null) {
            m22.y yVar = (m22.y) b0Var2;
            android.widget.CheckBox checkBox = yVar.a6().i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(checkBox, "checkBoxOtp");
            gj.m.k0(checkBox, false);
            android.widget.CheckBox checkBox2 = yVar.a6().j;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(checkBox2, "checkBoxPromotional");
            gj.m.k0(checkBox2, false);
            android.widget.CheckBox checkBox3 = yVar.a6().k;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(checkBox3, "checkBoxSpam");
            gj.m.k0(checkBox3, false);
        }
    }

    public final void d2() {
        m22.b0 b0Var = (m22.b0) ((com.truecaller.sdk.bar) this).a;
        if (b0Var != null) {
            xz1.r rVar = (xz1.r) this.f;
            int C = rVar.C("allTimeCleanupStatsOtpCount", 0);
            int C2 = rVar.C("allTimeCleanupStatsPromotionalCount", 0);
            int o0 = rVar.o0();
            m22.y yVar = (m22.y) b0Var;
            m22.u0 b6 = yVar.b6();
            android.content.Context requireContext = yVar.requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requireContext, "context");
            fg3.h0.J(fg3.f1.a, b6.b, (fg3.f0) null, new m22.t0(b6, requireContext, C, C2, o0, null), 2);
        }
    }

    public final boolean e2() {
        xz1.r rVar = (xz1.r) this.f;
        if (!rVar.z0() && rVar.C("manualCleanupRunCount", 0) % 2 != 0) {
            if (new org.joda.time.DateTime(rVar.D("manualCleanupNextStepLastShownDate", 0L)).i() != 0) {
                long i = new org.joda.time.DateTime(rVar.D("manualCleanupNextStepLastShownDate", 0L)).i();
                if (this.l.a(java.util.concurrent.TimeUnit.DAYS, i, 7L)) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final void f2() {
        xz1.q qVar = this.f;
        boolean z = true;
        if ((!((xz1.r) qVar).z("isManualCleanupOtpEnabled", true) || this.p <= 0) && (!((xz1.r) qVar).z("isManualCleanupSpamEnabled", true) || this.r <= 0)) {
            ((xz1.r) qVar).z("isManualCleanupPromotionalEnabled", true);
            z = false;
        }
        m22.b0 b0Var = (m22.b0) ((com.truecaller.sdk.bar) this).a;
        if (b0Var != null) {
            ((m22.y) b0Var).a6().h.setEnabled(z);
        }
    }

    public final void g2() {
        m22.b0 b0Var = (m22.b0) ((com.truecaller.sdk.bar) this).a;
        if (b0Var != null) {
            xz1.r rVar = (xz1.r) this.f;
            m22.y yVar = (m22.y) b0Var;
            yVar.a6().i.setChecked(rVar.z("isManualCleanupOtpEnabled", true));
            int u0 = rVar.u0();
            android.widget.TextView textView = yVar.a6().J;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "txtOtpPeriod");
            cu0.j1.E(textView, u0);
            yVar.a6().j.setChecked(rVar.z("isManualCleanupPromotionalEnabled", true));
            int v0 = rVar.v0();
            android.widget.TextView textView2 = yVar.a6().K;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView2, "txtPromotionalPeriod");
            cu0.j1.E(textView2, v0);
            yVar.a6().k.setChecked(rVar.z("isManualCleanupSpamEnabled", true));
            int w0 = rVar.w0();
            android.widget.TextView textView3 = yVar.a6().M;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView3, "txtSpamPeriod");
            cu0.j1.E(textView3, w0);
        }
    }

    public final void h2() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        android.content.res.Resources resources3;
        android.content.res.Resources resources4;
        android.content.res.Resources resources5;
        android.content.res.Resources resources6;
        android.content.res.Resources resources7;
        m22.b0 b0Var = (m22.b0) ((com.truecaller.sdk.bar) this).a;
        if (b0Var != null) {
            xz1.r rVar = (xz1.r) this.f;
            boolean z = rVar.z("manualCleanupDone", false);
            m22.y yVar = (m22.y) b0Var;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = yVar.a6().p;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "manualCleanupStats");
            gj.m.k0(constraintLayout, z);
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = yVar.a6().b;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout2, "allTimeStats");
            gj.m.k0(constraintLayout2, z);
            java.lang.String f = this.i.f(new org.joda.time.DateTime(rVar.D("manualCleanupLastDate", 0L)).i());
            int C = rVar.C("manualCleanupStatsOtpCount", 0);
            int C2 = rVar.C("manualCleanupStatsPromotionalCount", 0);
            int C3 = rVar.C("manualCleanupStatsSpamCount", 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "relativeDate");
            yVar.a6().F.setText(yVar.getString(2132021744, new java.lang.Object[]{f}));
            android.widget.TextView textView = yVar.a6().G;
            android.content.Context context = yVar.getContext();
            java.lang.String str7 = null;
            if (context != null && (resources7 = context.getResources()) != null) {
                str = resources7.getQuantityString(2131886172, C, java.lang.Integer.valueOf(C));
            } else {
                str = null;
            }
            textView.setText(str);
            android.widget.TextView textView2 = yVar.a6().L;
            android.content.Context context2 = yVar.getContext();
            if (context2 != null && (resources6 = context2.getResources()) != null) {
                str2 = resources6.getString(2132021731);
            } else {
                str2 = null;
            }
            textView2.setText(str2);
            android.widget.TextView textView3 = yVar.a6().H;
            android.content.Context context3 = yVar.getContext();
            if (context3 != null && (resources5 = context3.getResources()) != null) {
                str3 = resources5.getQuantityString(2131886172, C2, java.lang.Integer.valueOf(C2));
            } else {
                str3 = null;
            }
            textView3.setText(str3);
            android.widget.TextView textView4 = yVar.a6().I;
            android.content.Context context4 = yVar.getContext();
            if (context4 != null && (resources4 = context4.getResources()) != null) {
                str4 = resources4.getQuantityString(2131886172, C3, java.lang.Integer.valueOf(C3));
            } else {
                str4 = null;
            }
            textView4.setText(str4);
            androidx.constraintlayout.widget.Group group = yVar.a6().n;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "groupPromotionalStats");
            yVar.c6();
            gj.m.k0(group, false);
            int C4 = rVar.C("allTimeCleanupStatsOtpCount", 0);
            int C5 = rVar.C("allTimeCleanupStatsPromotionalCount", 0);
            int o0 = rVar.o0();
            yVar.a6().z.setText(java.lang.String.valueOf(C4));
            android.widget.TextView textView5 = yVar.a6().y;
            android.content.Context context5 = yVar.getContext();
            if (context5 != null && (resources3 = context5.getResources()) != null) {
                str5 = resources3.getQuantityString(2131886165, o0);
            } else {
                str5 = null;
            }
            textView5.setText(str5);
            yVar.a6().B.setText(java.lang.String.valueOf(C5));
            android.widget.TextView textView6 = yVar.a6().A;
            android.content.Context context6 = yVar.getContext();
            if (context6 != null && (resources2 = context6.getResources()) != null) {
                str6 = resources2.getQuantityString(2131886166, C5);
            } else {
                str6 = null;
            }
            textView6.setText(str6);
            yVar.a6().D.setText(java.lang.String.valueOf(o0));
            android.widget.TextView textView7 = yVar.a6().C;
            android.content.Context context7 = yVar.getContext();
            if (context7 != null && (resources = context7.getResources()) != null) {
                str7 = resources.getQuantityString(2131886167, o0);
            }
            textView7.setText(str7);
            androidx.constraintlayout.widget.Group group2 = yVar.a6().m;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group2, "groupPromotionalAllTime");
            yVar.c6();
            gj.m.k0(group2, false);
        }
    }

    public final void u0(java.lang.Object obj) {
        m22.b0 b0Var = (m22.b0) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "presenterView");
        ((com.truecaller.sdk.bar) this).a = b0Var;
        xz1.r rVar = (xz1.r) this.f;
        rVar.c0("inboxCleanupShown", true);
        boolean z = rVar.z("inboxCleanupPromoShown", true);
        m22.y yVar = (m22.y) b0Var;
        com.truecaller.common.ui.banner.BannerViewX bannerViewX = yVar.a6().r;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bannerViewX, "promoBanner");
        gj.m.k0(bannerViewX, z);
        boolean z2 = rVar.z("manualCleanupDone", false);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = yVar.a6().c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "autoCleanupContainer");
        gj.m.k0(constraintLayout, z2);
        yVar.e6(rVar.z0());
        h2();
        g2();
    }
}
