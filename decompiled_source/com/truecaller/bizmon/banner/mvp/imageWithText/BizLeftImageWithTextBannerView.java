package com.truecaller.bizmon.banner.mvp.imageWithText;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizLeftImageWithTextBannerView extends com.google.android.material.card.MaterialCardView implements sg0.baz {
    public static final /* synthetic */ int l = 0;
    public sg0.bar i;
    public kotlin.jvm.functions.Function0 j;
    public final kotlin.Lazy k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizLeftImageWithTextBannerView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // sg0.baz
    public final void b() {
        androidx.appcompat.widget.AppCompatButton appCompatButton = getBinding().b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appCompatButton, "btnBannerCta");
        gj.m.f0(appCompatButton);
        android.view.View view = getBinding().e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "paddingBottomView");
        gj.m.j0(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qg0.a
    public final void c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "deeplink");
        this.j.invoke();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean C = f0.qux.C(context, str);
        rg0.baz bazVar = (rg0.baz) getPresenter();
        bazVar.getClass();
        if (!C) {
            bazVar.d2(com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction.CLICKED_NO_REDIRECTION);
        }
    }

    @Override // sg0.baz
    public final void d(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "callToAction");
        androidx.appcompat.widget.AppCompatButton appCompatButton = getBinding().b;
        gj.m.j0(appCompatButton);
        appCompatButton.setText(str);
        appCompatButton.setTextColor(fu.baz.S(str2));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(10.0f);
        gradientDrawable.setStroke(bd.bar.q(1), fu.baz.S(str2));
        appCompatButton.setBackground(gradientDrawable);
    }

    @Override // sg0.baz
    public final void e(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        android.widget.TextView textView = getBinding().g;
        textView.setText(str);
        textView.setTextColor(fu.baz.S(str2));
    }

    @Override // sg0.baz
    public final void f(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        android.widget.TextView textView = getBinding().f;
        gj.m.j0(textView);
        textView.setText(str);
        textView.setTextColor(fu.baz.S(str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg0.baz
    public final void g(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "imageUrl");
        getBinding().d.getLayoutParams();
        com.bumptech.glide.baz.e(getContext()).q(str).R(new kb2.baz(this, 3)).P(getBinding().d);
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.i getBinding() {
        return (fi0.i) this.k.getValue();
    }

    @org.jetbrains.annotations.NotNull
    public final sg0.bar getPresenter() {
        sg0.bar barVar = this.i;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @Override // sg0.baz
    public final void h() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = getBinding().c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "clBannerImage");
        gj.m.j0(constraintLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            getPresenter().a = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.widget.FrameLayout*/.onDetachedFromWindow();
        ((of0.baz) getPresenter()).m1();
    }

    @Override // sg0.baz
    public void setBannerBackgroundColor(@org.jetbrains.annotations.Nullable java.lang.String str) {
        getBinding().c.setBackgroundColor(fu.baz.R(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg0.baz
    public void setBannerClickListener(@org.jetbrains.annotations.Nullable final java.lang.String str) {
        final int i = 0;
        setOnClickListener(new android.view.View.OnClickListener(this) { // from class: sg0.qux
            public final /* synthetic */ com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i2 = i;
                java.lang.String str2 = str;
                com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView bizLeftImageWithTextBannerView = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView.l;
                        ((rg0.baz) bizLeftImageWithTextBannerView.getPresenter()).f2(str2);
                        return;
                    default:
                        int i4 = com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView.l;
                        ((rg0.baz) bizLeftImageWithTextBannerView.getPresenter()).f2(str2);
                        return;
                }
            }
        });
        final int i2 = 1;
        getBinding().b.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: sg0.qux
            public final /* synthetic */ com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i2;
                java.lang.String str2 = str;
                com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView bizLeftImageWithTextBannerView = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView.l;
                        ((rg0.baz) bizLeftImageWithTextBannerView.getPresenter()).f2(str2);
                        return;
                    default:
                        int i4 = com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView.l;
                        ((rg0.baz) bizLeftImageWithTextBannerView.getPresenter()).f2(str2);
                        return;
                }
            }
        });
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull sg0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.i = barVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizLeftImageWithTextBannerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BizLeftImageWithTextBannerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.j = new s20.bar(9);
        this.k = kotlin.LazyKt.lazy(new sd.bar(1, context, this));
        setRadius(32.0f);
        setCardElevation(0.0f);
        if (isInEditMode()) {
            return;
        }
        setPresenter(((tx.w) ((pg0.bar) j71.g.E(pg0.bar.class, context.getApplicationContext()))).y0());
    }

    public /* synthetic */ BizLeftImageWithTextBannerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 2130969918 : i);
    }
}
