package com.truecaller.acs.ui.widgets.fullscreenbackground;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DismissibleConstraintsLayout extends qy2.a implements bd3.qux {
    public yc3.d C;
    public final boolean D;
    public uz.a E;
    public final kotlin.Lazy F;
    public boolean G;
    public fz.bar H;
    public qw2.a0 I;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DismissibleConstraintsLayout(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static kotlin.Unit H(com.truecaller.acs.ui.widgets.fullscreenbackground.DismissibleConstraintsLayout dismissibleConstraintsLayout) {
        uz.g viewModel = dismissibleConstraintsLayout.getViewModel();
        if (viewModel != null && !viewModel.k) {
            viewModel.k = true;
            fg3.h0.J(androidx.lifecycle.g1.l(viewModel), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uz.e(viewModel, null, 0), 3);
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(com.truecaller.acs.ui.widgets.fullscreenbackground.DismissibleConstraintsLayout dismissibleConstraintsLayout) {
        fg3.k2 k2Var;
        fg3.k2 k2Var2;
        android.content.Context context = dismissibleConstraintsLayout.getContext();
        if (context != null) {
            try {
                if (!dismissibleConstraintsLayout.getTcPermissionsUtil().k()) {
                    uz.g viewModel = dismissibleConstraintsLayout.getViewModel();
                    if (viewModel != null && (k2Var2 = viewModel.l) != null) {
                        k2Var2.cancel((java.util.concurrent.CancellationException) null);
                        return;
                    }
                    return;
                }
                android.graphics.drawable.Drawable drawable = android.app.WallpaperManager.getInstance(context).getDrawable();
                if (drawable == null) {
                    uz.g viewModel2 = dismissibleConstraintsLayout.getViewModel();
                    if (viewModel2 != null && (k2Var = viewModel2.l) != null) {
                        k2Var.cancel((java.util.concurrent.CancellationException) null);
                        return;
                    }
                    return;
                }
                android.content.Context context2 = dismissibleConstraintsLayout.getContext();
                if (context2 != null) {
                    uz.a aVar = dismissibleConstraintsLayout.E;
                    if (aVar != null) {
                        com.bumptech.glide.baz.b(context2).c(context2).l(aVar);
                    }
                    dismissibleConstraintsLayout.E = new uz.a(dismissibleConstraintsLayout, context2);
                }
                uz.a aVar2 = dismissibleConstraintsLayout.E;
                if (aVar2 != null) {
                    com.bumptech.glide.g n = com.bumptech.glide.baz.f(dismissibleConstraintsLayout).n(drawable);
                    com.bumptech.glide.k kVar = new com.bumptech.glide.k();
                    kVar.a = new i.d0((char) 0, 28);
                    com.bumptech.glide.g E = n.W(kVar).E(new uf.l[]{new java.lang.Object(), new up1.qux(context, 25.0f)});
                    E.Q(aVar2, (mg.b) null, E, qg.b.a);
                }
            } catch (java.lang.RuntimeException e) {
                if (!qk.b1.r()) {
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uz.g getViewModel() {
        return (uz.g) this.F.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.C == null) {
            this.C = new yc3.d(this);
        }
        return this.C.X3();
    }

    public final boolean getIgnoreLogDismiss() {
        return this.G;
    }

    @org.jetbrains.annotations.NotNull
    public final fz.bar getNavigator() {
        fz.bar barVar = this.H;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("navigator");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final qw2.a0 getTcPermissionsUtil() {
        qw2.a0 a0Var = this.I;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.Intrinsics.n("tcPermissionsUtil");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        uz.g viewModel = getViewModel();
        df3.bar barVar = null;
        if (viewModel != null) {
            viewModel.g = getTcPermissionsUtil().k();
            a71.a aVar = viewModel.d;
            com.truecaller.analytics.common.acs.AcsAnalyticsContext acsAnalyticsContext = com.truecaller.analytics.common.acs.AcsAnalyticsContext.FACS;
            aVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsAnalyticsContext, "analyticsContext");
            aVar.f = acsAnalyticsContext;
            ig3.w1.F(new androidx.room.o(25, (ig3.h2) viewModel.c.a, new uz.f(viewModel, barVar, 0)), androidx.lifecycle.g1.l(viewModel));
            ig3.w1.F(new androidx.room.o(25, (ig3.o1) viewModel.f.b, new uz.d(viewModel, barVar, 0)), androidx.lifecycle.g1.l(viewModel));
        }
        gj.m.Y(this, new uz.c(this, barVar, 0));
        gj.m.Y(this, new uz.c(this, barVar, 1));
        setOnDismissListener(new tr2.baz(this, 19));
    }

    public final void setIgnoreLogDismiss(boolean z) {
        this.G = z;
    }

    public final void setNavigator(@org.jetbrains.annotations.NotNull fz.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.H = barVar;
    }

    public final void setTcPermissionsUtil(@org.jetbrains.annotations.NotNull qw2.a0 a0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "<set-?>");
        this.I = a0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DismissibleConstraintsLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DismissibleConstraintsLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.D) {
            this.D = true;
            tx.d0 d0Var = (tx.d0) ((uz.h) X3());
            this.H = (fz.bar) d0Var.d.J.get();
            this.I = (qw2.a0) d0Var.c.x6.get();
        }
        this.F = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 10));
    }

    public /* synthetic */ DismissibleConstraintsLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
