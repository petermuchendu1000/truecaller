package com.truecaller.bizmon.callMeBack.mvp;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class BizCallMeBackWithSlotsView extends androidx.constraintlayout.widget.ConstraintLayout implements dh0.b, bd3.qux {
    public static final /* synthetic */ int F = 0;
    public eh0.baz A;
    public u03.b0 B;
    public wg0.g C;
    public dh0.bar D;
    public d91.c E;
    public yc3.d s;
    public boolean t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public wg0.i y;
    public dh0.a z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizCallMeBackWithSlotsView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void F() {
        androidx.constraintlayout.widget.Group group = getBinding().b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "groupCallMeBack");
        gj.m.f0(group);
        android.widget.TextView textView = getBinding().h;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "tvSubTitleCallMeBack");
        gj.m.f0(textView);
    }

    public final void G() {
        com.truecaller.common.ui.ShimmerLoadingView shimmerLoadingView = getBinding().e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(shimmerLoadingView, "loadingItem");
        gj.m.f0(shimmerLoadingView);
    }

    public void H() {
        if (!this.t) {
            this.t = true;
            tx.d0 d0Var = (tx.d0) ((dh0.q) X3());
            dh0.l b = d0Var.b();
            tx.w wVar = d0Var.c;
            this.z = b;
            this.A = new eh0.baz((u03.b0) wVar.v4.get());
            this.B = (u03.b0) wVar.v4.get();
        }
    }

    public final void I(com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig bizMultiViewConfig, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizMultiViewConfig, "config");
        if (obj instanceof dh0.bar) {
            this.D = (dh0.bar) obj;
        } else if (obj instanceof wg0.g) {
            this.C = (wg0.g) obj;
        }
        dh0.l lVar = (dh0.l) getPresenter();
        lVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizMultiViewConfig, "config");
        fg3.h0.J(lVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new dh0.k(lVar, bizMultiViewConfig, null), 3);
    }

    public final void J(d91.c cVar, boolean z) {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = cVar.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        gj.m.j0(constraintLayout);
        com.airbnb.lottie.LottieAnimationView lottieAnimationView = (com.airbnb.lottie.LottieAnimationView) cVar.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "ivTickCallMeBackDVSuccess");
        ye0.e0.L(lottieAnimationView, new a23.e(cVar, z, this, 4));
        lottieAnimationView.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.s == null) {
            this.s = new yc3.d(this);
        }
        return this.s.X3();
    }

    @org.jetbrains.annotations.NotNull
    public final eh0.baz getAdapter() {
        eh0.baz bazVar = this.A;
        if (bazVar != null) {
            return bazVar;
        }
        kotlin.jvm.internal.Intrinsics.n("adapter");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.j getBinding() {
        return (fi0.j) this.u.getValue();
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizAcsCallMeBackPickSlotView getCmbAcsPickSlotView() {
        return (com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizAcsCallMeBackPickSlotView) this.x.getValue();
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizDetailsCallMeBackPickSlotView getCmbDetailsPickSlotView() {
        return (com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizDetailsCallMeBackPickSlotView) this.w.getValue();
    }

    public final int getPadding() {
        return ((java.lang.Number) this.v.getValue()).intValue();
    }

    @org.jetbrains.annotations.NotNull
    public final dh0.a getPresenter() {
        dh0.a aVar = this.z;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final u03.b0 getResourceProvider() {
        u03.b0 b0Var = this.B;
        if (b0Var != null) {
            return b0Var;
        }
        kotlin.jvm.internal.Intrinsics.n("resourceProvider");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        if (!isInEditMode()) {
            ((dh0.l) getPresenter()).u0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        ((of0.baz) getPresenter()).m1();
    }

    public final void setAdapter(@org.jetbrains.annotations.NotNull eh0.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "<set-?>");
        this.A = bazVar;
    }

    @Override // dh0.b
    public void setCallMeBackTheme(int i) {
        getBinding().i.setTextColor(i);
        android.graphics.drawable.Drawable[] compoundDrawables = getBinding().i.getCompoundDrawables();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compoundDrawables, "getCompoundDrawables(...)");
        for (android.graphics.drawable.Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void setCmbDismissListener(@org.jetbrains.annotations.NotNull wg0.i iVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "listener");
        this.y = iVar;
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull dh0.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.z = aVar;
    }

    public final void setResourceProvider(@org.jetbrains.annotations.NotNull u03.b0 b0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.B = b0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizCallMeBackWithSlotsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizCallMeBackWithSlotsView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BizCallMeBackWithSlotsView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BizCallMeBackWithSlotsView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode()) {
            H();
        }
        this.u = kotlin.LazyKt.lazy(new da0.baz(3, context, this));
        final int i3 = 0;
        this.v = kotlin.LazyKt.lazy(kotlin.k.c, new kotlin.jvm.functions.Function0(this) { // from class: dh0.m
            public final /* synthetic */ com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView, android.view.View] */
            public final java.lang.Object invoke() {
                int i4 = i3;
                ?? r1 = this.b;
                switch (i4) {
                    case 0:
                        int i5 = com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView.F;
                        return java.lang.Integer.valueOf(r1.getResources().getDimensionPixelSize(2131165629));
                    case 1:
                        int i6 = com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView.F;
                        java.lang.Object inflate = r1.getBinding().l.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate, "null cannot be cast to non-null type com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizDetailsCallMeBackPickSlotView");
                        return (com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizDetailsCallMeBackPickSlotView) inflate;
                    default:
                        int i7 = com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView.F;
                        java.lang.Object inflate2 = r1.getBinding().k.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate2, "null cannot be cast to non-null type com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizAcsCallMeBackPickSlotView");
                        return (com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizAcsCallMeBackPickSlotView) inflate2;
                }
            }
        });
        final int i4 = 1;
        this.w = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: dh0.m
            public final /* synthetic */ com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView, android.view.View] */
            public final java.lang.Object invoke() {
                int i42 = i4;
                ?? r1 = this.b;
                switch (i42) {
                    case 0:
                        int i5 = com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView.F;
                        return java.lang.Integer.valueOf(r1.getResources().getDimensionPixelSize(2131165629));
                    case 1:
                        int i6 = com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView.F;
                        java.lang.Object inflate = r1.getBinding().l.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate, "null cannot be cast to non-null type com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizDetailsCallMeBackPickSlotView");
                        return (com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizDetailsCallMeBackPickSlotView) inflate;
                    default:
                        int i7 = com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView.F;
                        java.lang.Object inflate2 = r1.getBinding().k.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate2, "null cannot be cast to non-null type com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizAcsCallMeBackPickSlotView");
                        return (com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizAcsCallMeBackPickSlotView) inflate2;
                }
            }
        });
        final int i5 = 2;
        this.x = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: dh0.m
            public final /* synthetic */ com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView, android.view.View] */
            public final java.lang.Object invoke() {
                int i42 = i5;
                ?? r1 = this.b;
                switch (i42) {
                    case 0:
                        int i52 = com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView.F;
                        return java.lang.Integer.valueOf(r1.getResources().getDimensionPixelSize(2131165629));
                    case 1:
                        int i6 = com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView.F;
                        java.lang.Object inflate = r1.getBinding().l.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate, "null cannot be cast to non-null type com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizDetailsCallMeBackPickSlotView");
                        return (com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizDetailsCallMeBackPickSlotView) inflate;
                    default:
                        int i7 = com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView.F;
                        java.lang.Object inflate2 = r1.getBinding().k.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate2, "null cannot be cast to non-null type com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizAcsCallMeBackPickSlotView");
                        return (com.truecaller.bizmon.callMeBack.mvp.timeSlots.BizAcsCallMeBackPickSlotView) inflate2;
                }
            }
        });
    }
}
