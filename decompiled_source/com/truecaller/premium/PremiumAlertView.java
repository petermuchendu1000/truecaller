package com.truecaller.premium;

/* loaded from: /home/user/tc_decoded/classes.dex */
public final class PremiumAlertView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final u03.g0 A;
    public kotlin.jvm.functions.Function0 B;
    public kotlin.jvm.functions.Function0 C;

    /* renamed from: s, reason: collision with root package name */
    public final kotlin.Lazy f4564s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlin.Lazy f4565t;

    /* renamed from: u, reason: collision with root package name */
    public final kotlin.Lazy f4566u;

    /* renamed from: v, reason: collision with root package name */
    public final kotlin.Lazy f4567v;

    /* renamed from: w, reason: collision with root package name */
    public final kotlin.Lazy f4568w;

    /* renamed from: x, reason: collision with root package name */
    public final kotlin.Lazy f4569x;

    /* renamed from: y, reason: collision with root package name */
    public final kotlin.Lazy f4570y;

    /* renamed from: z, reason: collision with root package name */
    public final kotlin.Lazy f4571z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PremiumAlertView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.TextView getActionNegativeView() {
        return (android.widget.TextView) this.f4570y.getValue();
    }

    private final android.widget.TextView getActionPositiveView() {
        return (android.widget.TextView) this.f4569x.getValue();
    }

    private final android.view.View getCardOverlay() {
        return (android.view.View) this.f4571z.getValue();
    }

    private final android.widget.TextView getDescriptionView() {
        return (android.widget.TextView) this.f4566u.getValue();
    }

    private final android.widget.ImageView getIconView() {
        return (android.widget.ImageView) this.f4564s.getValue();
    }

    private final androidx.constraintlayout.widget.ConstraintLayout getMainContainerView() {
        return (androidx.constraintlayout.widget.ConstraintLayout) this.f4567v.getValue();
    }

    private final android.widget.TextView getPromoView() {
        return (android.widget.TextView) this.f4568w.getValue();
    }

    private final android.widget.TextView getTitleView() {
        return (android.widget.TextView) this.f4565t.getValue();
    }

    public final void F(boolean z10) {
        android.view.View cardOverlay = getCardOverlay();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cardOverlay, "<get-cardOverlay>(...)");
        gj.m.k0(cardOverlay, z10);
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getNegativeListener() {
        return this.C;
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getPositiveListener() {
        return this.B;
    }

    public final void setAlert(@org.jetbrains.annotations.NotNull i82.i iVar) {
        boolean z10;
        int i10;
        boolean z11;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "alert");
        android.widget.ImageView iconView = getIconView();
        int i11 = iVar.f8634d;
        u03.g0 g0Var = this.A;
        iconView.setImageDrawable(bi3.a.u(i11, g0Var.a));
        getTitleView().setText(iVar.f8632a);
        getTitleView().setTextColor(bi3.a.s(g0Var.a, iVar.b));
        getDescriptionView().setText(iVar.f8633c);
        android.widget.TextView actionPositiveView = getActionPositiveView();
        java.lang.String str = iVar.f8637g;
        actionPositiveView.setText(str);
        getActionNegativeView().setText((java.lang.CharSequence) null);
        i82.j jVar = iVar.f8636f;
        if (jVar != null) {
            getPromoView().setText(jVar.f8638a);
            getPromoView().setTextColor(bi3.a.s(g0Var.a, jVar.b.intValue()));
            getPromoView().setCompoundDrawablesWithIntrinsicBounds(jVar.f8639c.intValue(), 0, 0, 0);
        }
        android.widget.TextView promoView = getPromoView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(promoView, "<get-promoView>(...)");
        if (jVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        gj.m.k0(promoView, z10);
        androidx.constraintlayout.widget.ConstraintLayout mainContainerView = getMainContainerView();
        java.lang.Integer num = iVar.f8635e;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 2131231306;
        }
        mainContainerView.setBackgroundResource(i10);
        android.widget.TextView actionPositiveView2 = getActionPositiveView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(actionPositiveView2, "<get-actionPositiveView>(...)");
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        gj.m.k0(actionPositiveView2, !z11);
        android.widget.TextView actionNegativeView = getActionNegativeView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(actionNegativeView, "<get-actionNegativeView>(...)");
        gj.m.k0(actionNegativeView, false);
    }

    public final void setNegativeListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.C = function0;
    }

    public final void setPositiveListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.B = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PremiumAlertView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumAlertView(android.content.Context context, android.util.AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f4564s = gj.m.I(2131364521, this);
        this.f4565t = gj.m.I(2131367033, this);
        this.f4566u = gj.m.I(2131363468, this);
        this.f4567v = gj.m.I(2131365039, this);
        this.f4568w = gj.m.I(2131365856, this);
        this.f4569x = gj.m.I(2131361946, this);
        this.f4570y = gj.m.I(2131361940, this);
        this.f4571z = gj.m.I(2131362839, this);
        this.A = new u03.g0(context);
        android.view.View.inflate(context, 2131561125, this);
        final int i11 = 0;
        getActionPositiveView().setOnClickListener(new android.view.View.OnClickListener(this) { // from class: i82.k
            public final /* synthetic */ com.truecaller.premium.PremiumAlertView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                switch (i11) {
                    case 0:
                        kotlin.jvm.functions.Function0 function0 = this.b.B;
                        if (function0 != null) {
                            function0.invoke();
                            return;
                        }
                        return;
                    default:
                        kotlin.jvm.functions.Function0 function02 = this.b.C;
                        if (function02 != null) {
                            function02.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        final int i12 = 1;
        getActionNegativeView().setOnClickListener(new android.view.View.OnClickListener(this) { // from class: i82.k
            public final /* synthetic */ com.truecaller.premium.PremiumAlertView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                switch (i12) {
                    case 0:
                        kotlin.jvm.functions.Function0 function0 = this.b.B;
                        if (function0 != null) {
                            function0.invoke();
                            return;
                        }
                        return;
                    default:
                        kotlin.jvm.functions.Function0 function02 = this.b.C;
                        if (function02 != null) {
                            function02.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        setClickable(true);
    }

    public /* synthetic */ PremiumAlertView(android.content.Context context, android.util.AttributeSet attributeSet, int i10, int i11, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
