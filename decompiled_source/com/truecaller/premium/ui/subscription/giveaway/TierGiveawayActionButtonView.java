package com.truecaller.premium.ui.subscription.giveaway;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TierGiveawayActionButtonView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final u03.g0 s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TierGiveawayActionButtonView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final com.airbnb.lottie.LottieAnimationView getAnimationBackground() {
        return (com.airbnb.lottie.LottieAnimationView) this.v.getValue();
    }

    private final android.view.View getButtonBackground() {
        return (android.view.View) this.u.getValue();
    }

    private final com.truecaller.common.ui.ShineView getShineView() {
        return (com.truecaller.common.ui.ShineView) this.w.getValue();
    }

    private final android.widget.TextView getTitleTv() {
        return (android.widget.TextView) this.t.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBackground$lambda$0$0(java.lang.Throwable th) {
    }

    public final void G(boolean z) {
        com.truecaller.common.ui.ShineView shineView = getShineView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(shineView, "<get-shineView>(...)");
        gj.m.k0(shineView, z);
    }

    public final void setButtonBackground(int i) {
        getButtonBackground().setBackgroundResource(i);
    }

    public final void setTheme(@org.jetbrains.annotations.NotNull hf2.j jVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "themeConfig");
        java.lang.Integer num = jVar.a;
        if (num != null) {
            getTitleTv().setTextColor(num.intValue());
        }
        java.lang.Integer num2 = jVar.g;
        java.lang.Integer num3 = jVar.f;
        java.lang.String str = jVar.j;
        if (str != null) {
            com.airbnb.lottie.LottieAnimationView animationBackground = getAnimationBackground();
            animationBackground.setOutlineProvider(new lf2.i(bd.bar.q(4)));
            animationBackground.setClipToOutline(true);
            animationBackground.setFailureListener(new i10.bar(2));
            animationBackground.setAnimationFromUrl(str);
            animationBackground.k();
            gj.m.j0(animationBackground);
        } else if (num3 != null) {
            android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) this.s.d(2131234394);
            gradientDrawable.setColor(num3.intValue());
            getButtonBackground().setBackground(gradientDrawable);
        } else if (num2 != null) {
            getButtonBackground().setBackgroundResource(num2.intValue());
        }
        java.lang.Boolean bool = jVar.i;
        if (bool != null) {
            G(bool.booleanValue());
        }
    }

    public final void setTitle(@org.jetbrains.annotations.Nullable java.lang.String str) {
        getTitleTv().setText(str);
    }

    public final void setTitleTextColor(int i) {
        getTitleTv().setTextColor(this.s.b(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TierGiveawayActionButtonView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TierGiveawayActionButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = new u03.g0(context);
        this.t = gj.m.I(2131367033, this);
        this.u = gj.m.I(2131362636, this);
        this.v = gj.m.I(2131362257, this);
        this.w = gj.m.I(2131364300, this);
        yy.qux.z(this, 2131561028, true);
    }

    public /* synthetic */ TierGiveawayActionButtonView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
