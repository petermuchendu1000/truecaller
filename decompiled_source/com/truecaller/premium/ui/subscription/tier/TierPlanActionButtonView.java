package com.truecaller.premium.ui.subscription.tier;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TierPlanActionButtonView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final kotlin.Lazy A;
    public final u03.g0 s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public final kotlin.Lazy y;
    public final kotlin.Lazy z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TierPlanActionButtonView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final com.airbnb.lottie.LottieAnimationView getAnimationBackground() {
        return (com.airbnb.lottie.LottieAnimationView) this.u.getValue();
    }

    private final android.view.View getButtonBackground() {
        return (android.view.View) this.t.getValue();
    }

    private final android.widget.TextView getDisclaimerBottomTv() {
        return (android.widget.TextView) this.A.getValue();
    }

    private final android.widget.TextView getDisclaimerTopTv() {
        return (android.widget.TextView) this.z.getValue();
    }

    private final android.widget.TextView getPriceTv() {
        return (android.widget.TextView) this.w.getValue();
    }

    private final android.widget.TextView getSavingsTv() {
        return (android.widget.TextView) this.x.getValue();
    }

    private final android.widget.TextView getStruckPriceTv() {
        return (android.widget.TextView) this.y.getValue();
    }

    private final android.widget.TextView getTitleTv() {
        return (android.widget.TextView) this.v.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBackground$lambda$0$0(java.lang.Throwable th) {
    }

    private final void setPrice(java.lang.String str) {
        boolean z;
        android.widget.TextView priceTv = getPriceTv();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(priceTv, "<get-priceTv>(...)");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.k0(priceTv, true ^ z);
        android.widget.TextView priceTv2 = getPriceTv();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(priceTv2, "<get-priceTv>(...)");
        lf.bar.y(priceTv2, 10, 14);
        getPriceTv().setText(str);
    }

    private final void setTextColor(java.lang.Integer num) {
        if (num != null) {
            getTitleTv().setTextColor(num.intValue());
            getPriceTv().setTextColor(num.intValue());
        }
    }

    public final void setButtonConfig(@org.jetbrains.annotations.NotNull xe2.s sVar) {
        boolean z;
        com.truecaller.common.ui.f d;
        boolean z2;
        boolean z3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "buttonConfig");
        xe2.h hVar = sVar.a;
        hf2.j jVar = sVar.b;
        java.lang.String str = hVar.a;
        boolean z4 = hVar.e;
        android.widget.TextView titleTv = getTitleTv();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(titleTv, "<get-titleTv>(...)");
        boolean z5 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.k0(titleTv, !z);
        android.widget.TextView titleTv2 = getTitleTv();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(titleTv2, "<get-titleTv>(...)");
        lf.bar.y(titleTv2, 10, 14);
        getTitleTv().setText(str);
        getTitleTv().setAllCaps(z4);
        setPrice(hVar.b);
        if (hVar.b.length() > 0 && hVar.h) {
            java.lang.String str2 = hVar.f;
            java.lang.Integer num = jVar.d;
            android.widget.TextView savingsTv = getSavingsTv();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(savingsTv, "<get-savingsTv>(...)");
            if (str2 != null && str2.length() != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            gj.m.k0(savingsTv, !z3);
            android.widget.TextView savingsTv2 = getSavingsTv();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(savingsTv2, "<get-savingsTv>(...)");
            lf.bar.y(savingsTv2, 10, 14);
            getSavingsTv().setText(str2);
            if (num != null) {
                getSavingsTv().setTextColor(num.intValue());
            }
        }
        java.lang.Integer num2 = jVar.g;
        java.lang.Integer num3 = jVar.f;
        java.lang.String str3 = jVar.j;
        u03.g0 g0Var = this.s;
        if (str3 != null) {
            com.airbnb.lottie.LottieAnimationView animationBackground = getAnimationBackground();
            animationBackground.setOutlineProvider(new lf2.i(bd.bar.q(4)));
            animationBackground.setClipToOutline(true);
            animationBackground.setFailureListener(new i10.bar(3));
            animationBackground.setAnimationFromUrl(str3);
            animationBackground.k();
            gj.m.j0(animationBackground);
        } else if (num3 != null) {
            android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) g0Var.d(2131234394);
            gradientDrawable.setColor(num3.intValue());
            getButtonBackground().setBackground(gradientDrawable);
        } else if (num2 != null) {
            getButtonBackground().setBackgroundResource(num2.intValue());
        }
        java.lang.Boolean bool = jVar.i;
        java.lang.Integer num4 = jVar.h;
        android.widget.TextView savingsTv3 = getSavingsTv();
        if (kotlin.jvm.internal.Intrinsics.b(bool, java.lang.Boolean.TRUE)) {
            d = new com.truecaller.common.ui.f(g0Var);
            d.setCornerRadius(bd.bar.q(4));
        } else if (num4 != null) {
            float c = g0Var.c(2131166788);
            d = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RoundRectShape(new float[]{c, c, c, c, c, c, c, c}, null, null));
            d.getPaint().setColor(num4.intValue());
        } else {
            d = g0Var.d(2131231337);
        }
        savingsTv3.setBackground(d);
        java.lang.String str4 = hVar.c;
        java.lang.Integer num5 = jVar.c;
        android.widget.TextView disclaimerTopTv = getDisclaimerTopTv();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(disclaimerTopTv, "<get-disclaimerTopTv>(...)");
        if (str4 != null && str4.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        gj.m.k0(disclaimerTopTv, !z2);
        if (num5 != null) {
            getDisclaimerTopTv().setTextColor(num5.intValue());
        }
        getDisclaimerTopTv().setText(str4);
        java.lang.String str5 = hVar.d;
        java.lang.Integer num6 = jVar.c;
        android.widget.TextView disclaimerBottomTv = getDisclaimerBottomTv();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(disclaimerBottomTv, "<get-disclaimerBottomTv>(...)");
        if (str5 == null || str5.length() == 0) {
            z5 = true;
        }
        gj.m.k0(disclaimerBottomTv, !z5);
        if (num6 != null) {
            getDisclaimerBottomTv().setTextColor(num6.intValue());
        }
        getDisclaimerBottomTv().setText(str5);
        setTextColor(jVar.a);
        java.lang.String str6 = hVar.g;
        java.lang.Integer num7 = jVar.e;
        if (str6 != null) {
            getStruckPriceTv().setText(str6);
            android.widget.TextView struckPriceTv = getStruckPriceTv();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(struckPriceTv, "<get-struckPriceTv>(...)");
            gj.m.j0(struckPriceTv);
            android.widget.TextView struckPriceTv2 = getStruckPriceTv();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(struckPriceTv2, "<get-struckPriceTv>(...)");
            lf.bar.y(struckPriceTv2, 10, 14);
            android.widget.TextView struckPriceTv3 = getStruckPriceTv();
            struckPriceTv3.setPaintFlags(struckPriceTv3.getPaintFlags() | 16);
        }
        if (num7 != null) {
            getStruckPriceTv().setTextColor(num7.intValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TierPlanActionButtonView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TierPlanActionButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = new u03.g0(context);
        this.t = gj.m.I(2131362636, this);
        this.u = gj.m.I(2131362257, this);
        this.v = gj.m.I(2131367033, this);
        this.w = gj.m.I(2131365809, this);
        this.x = gj.m.I(2131366237, this);
        this.y = gj.m.I(2131366674, this);
        this.z = gj.m.I(2131363528, this);
        this.A = gj.m.I(2131363522, this);
        yy.qux.z(this, 2131561129, true);
    }

    public /* synthetic */ TierPlanActionButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
