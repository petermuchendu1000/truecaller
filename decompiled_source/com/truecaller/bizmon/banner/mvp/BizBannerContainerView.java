package com.truecaller.bizmon.banner.mvp;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class BizBannerContainerView extends android.widget.FrameLayout implements qg0.b {
    public static final /* synthetic */ int h = 0;
    public final dw2.qux a;
    public kotlin.jvm.functions.Function0 b;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizBannerContainerView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final com.truecaller.bizmon.banner.mvp.imageOnly.BizImageOnlyBannerView getItemBannerImageOnlyView() {
        return (com.truecaller.bizmon.banner.mvp.imageOnly.BizImageOnlyBannerView) this.d.getValue();
    }

    private final com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView getItemBannerLeftImageView() {
        return (com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView) this.e.getValue();
    }

    private final com.truecaller.bizmon.banner.mvp.imageWithText.BizRightImageWithTextBannerView getItemBannerRightImageView() {
        return (com.truecaller.bizmon.banner.mvp.imageWithText.BizRightImageWithTextBannerView) this.f.getValue();
    }

    private final com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView getItemBannerTextOnlyView() {
        return (com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.truecaller.bizmon.banner.mvp.imageOnly.BizImageOnlyBannerView, android.view.View] */
    public final void a(jg0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "bannerTemplateConfig");
        ?? itemBannerImageOnlyView = getItemBannerImageOnlyView();
        gj.m.j0((android.view.View) itemBannerImageOnlyView);
        kotlin.jvm.functions.Function0 function0 = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "bannerConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onBizBannerUrlActionInvoked");
        rg0.baz bazVar = itemBannerImageOnlyView.i;
        java.lang.String str = null;
        if (bazVar != null) {
            qg0.d dVar = bazVar.f;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "bannerConfig");
            bazVar.i = barVar;
            java.lang.String str2 = barVar.m;
            if (str2 != null) {
                if (str2.length() > 0) {
                    str = str2;
                }
                if (str != null) {
                    bazVar.c2(com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction.SHOWN);
                    rg0.bar barVar2 = (rg0.bar) ((com.truecaller.sdk.bar) bazVar).a;
                    if (barVar2 != null) {
                        com.truecaller.bizmon.banner.mvp.imageOnly.BizImageOnlyBannerView bizImageOnlyBannerView = (com.truecaller.bizmon.banner.mvp.imageOnly.BizImageOnlyBannerView) barVar2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "imageUrl");
                        android.widget.ImageView imageView = bizImageOnlyBannerView.getBinding().b;
                        gj.m.j0(imageView);
                        com.bumptech.glide.baz.e(imageView.getContext()).q(str).R(new kb2.baz(bizImageOnlyBannerView, 2)).P(imageView);
                    }
                    rg0.bar barVar3 = (rg0.bar) ((com.truecaller.sdk.bar) bazVar).a;
                    if (barVar3 != null) {
                        barVar3.setBannerClickListener(barVar.n);
                    }
                    if (dVar.c(barVar)) {
                        bazVar.g.getClass();
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        bazVar.h = currentTimeMillis;
                        dVar.b(currentTimeMillis, barVar);
                    }
                }
            }
            itemBannerImageOnlyView.j = function0;
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView, android.view.View] */
    public final void b(jg0.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "bannerTemplateConfig");
        ?? itemBannerLeftImageView = getItemBannerLeftImageView();
        gj.m.j0((android.view.View) itemBannerLeftImageView);
        kotlin.jvm.functions.Function0 function0 = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "bannerConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onBizBannerUrlActionInvoked");
        ((rg0.baz) itemBannerLeftImageView.getPresenter()).h2(bazVar);
        itemBannerLeftImageView.j = function0;
    }

    public final void c(jg0.qux quxVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "bannerTemplateConfig");
        gj.m.j0(getItemBannerRightImageView());
        com.truecaller.bizmon.banner.mvp.imageWithText.BizRightImageWithTextBannerView itemBannerRightImageView = getItemBannerRightImageView();
        kotlin.jvm.functions.Function0 function0 = this.b;
        itemBannerRightImageView.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "bannerConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onBizBannerUrlActionInvoked");
        ((rg0.baz) itemBannerRightImageView.getPresenter()).h2(quxVar);
        itemBannerRightImageView.k = function0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView, android.view.View] */
    public final void d(jg0.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "bannerTemplateConfig");
        ?? itemBannerTextOnlyView = getItemBannerTextOnlyView();
        gj.m.j0((android.view.View) itemBannerTextOnlyView);
        kotlin.jvm.functions.Function0 function0 = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "bannerConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onBizBannerUrlActionInvoked");
        rg0.baz bazVar = itemBannerTextOnlyView.j;
        java.lang.String str = null;
        if (bazVar != null) {
            qg0.d dVar = bazVar.f;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "bannerConfig");
            bazVar.i = aVar;
            bazVar.e2(com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction.SHOWN);
            tg0.bar barVar = (tg0.bar) ((com.truecaller.sdk.bar) bazVar).a;
            if (barVar != null) {
                java.lang.String str2 = aVar.m;
                java.lang.String str3 = aVar.n;
                barVar.setBannerBackgroundColor(str2);
                java.lang.String str4 = aVar.c;
                com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView bizTextOnlyBannerView = (com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView) barVar;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "title");
                android.widget.TextView textView = bizTextOnlyBannerView.getBinding().e;
                textView.setText(str4);
                textView.setTextColor(fu.baz.S(str3));
                com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType bizVerifiedCampaignDisplayType = aVar.g;
                if (bizVerifiedCampaignDisplayType != com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType.MID && bizVerifiedCampaignDisplayType != com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType.AI_MID && bizVerifiedCampaignDisplayType != com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignDisplayType.DETAILS_MID) {
                    java.lang.String str5 = aVar.d;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "title");
                    android.widget.TextView textView2 = bizTextOnlyBannerView.getBinding().d;
                    gj.m.j0(textView2);
                    textView2.setText(str5);
                    textView2.setTextColor(fu.baz.S(str3));
                }
                java.lang.String str6 = aVar.o;
                if (str6 != null) {
                    if (str6.length() > 0) {
                        str = str6;
                    }
                    if (str != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "callToAction");
                        androidx.appcompat.widget.AppCompatButton appCompatButton = bizTextOnlyBannerView.getBinding().b;
                        gj.m.j0(appCompatButton);
                        appCompatButton.setText(str);
                        appCompatButton.setTextColor(fu.baz.S(str3));
                        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                        gradientDrawable.setCornerRadius(10.0f);
                        gradientDrawable.setStroke(bd.bar.q(1), fu.baz.S(str3));
                        appCompatButton.setBackground(gradientDrawable);
                    }
                }
                tg0.bar barVar2 = (tg0.bar) ((com.truecaller.sdk.bar) bazVar).a;
                if (barVar2 != null) {
                    barVar2.setBannerClickListener(aVar.p);
                }
            }
            if (dVar.c(aVar)) {
                bazVar.g.getClass();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                bazVar.h = currentTimeMillis;
                dVar.b(currentTimeMillis, aVar);
            }
            itemBannerTextOnlyView.k = function0;
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final void e(com.truecaller.data.entity.Contact contact, og0.bar barVar, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "bannerData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onBizBannerUrlActionInvoked");
        dw2.qux quxVar = this.a;
        if (quxVar != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "bannerData");
            fg3.h0.J(quxVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new qg0.e(quxVar, contact, barVar, null, 1), 3);
            this.b = function0;
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.d getBinding() {
        return (fi0.d) this.g.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            dw2.qux quxVar = this.a;
            if (quxVar != null) {
                ((com.truecaller.sdk.bar) quxVar).a = this;
            } else {
                kotlin.jvm.internal.Intrinsics.n("presenter");
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dw2.qux quxVar = this.a;
        if (quxVar != null) {
            quxVar.m1();
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizBannerContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizBannerContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizBannerContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.b = new pr2.bar(22);
        final int i3 = 0;
        this.c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: qg0.c
            public final /* synthetic */ com.truecaller.bizmon.banner.mvp.BizBannerContainerView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i4 = i3;
                com.truecaller.bizmon.banner.mvp.BizBannerContainerView bizBannerContainerView = this.b;
                switch (i4) {
                    case 0:
                        int i5 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate = bizBannerContainerView.getBinding().e.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView");
                        return (com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView) inflate;
                    case 1:
                        int i6 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate2 = bizBannerContainerView.getBinding().b.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate2, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.imageOnly.BizImageOnlyBannerView");
                        return (com.truecaller.bizmon.banner.mvp.imageOnly.BizImageOnlyBannerView) inflate2;
                    case 2:
                        int i7 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate3 = bizBannerContainerView.getBinding().c.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate3, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView");
                        return (com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView) inflate3;
                    default:
                        int i8 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate4 = bizBannerContainerView.getBinding().d.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate4, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.imageWithText.BizRightImageWithTextBannerView");
                        return (com.truecaller.bizmon.banner.mvp.imageWithText.BizRightImageWithTextBannerView) inflate4;
                }
            }
        });
        final int i4 = 1;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: qg0.c
            public final /* synthetic */ com.truecaller.bizmon.banner.mvp.BizBannerContainerView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i42 = i4;
                com.truecaller.bizmon.banner.mvp.BizBannerContainerView bizBannerContainerView = this.b;
                switch (i42) {
                    case 0:
                        int i5 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate = bizBannerContainerView.getBinding().e.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView");
                        return (com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView) inflate;
                    case 1:
                        int i6 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate2 = bizBannerContainerView.getBinding().b.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate2, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.imageOnly.BizImageOnlyBannerView");
                        return (com.truecaller.bizmon.banner.mvp.imageOnly.BizImageOnlyBannerView) inflate2;
                    case 2:
                        int i7 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate3 = bizBannerContainerView.getBinding().c.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate3, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView");
                        return (com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView) inflate3;
                    default:
                        int i8 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate4 = bizBannerContainerView.getBinding().d.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate4, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.imageWithText.BizRightImageWithTextBannerView");
                        return (com.truecaller.bizmon.banner.mvp.imageWithText.BizRightImageWithTextBannerView) inflate4;
                }
            }
        });
        final int i5 = 2;
        this.e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: qg0.c
            public final /* synthetic */ com.truecaller.bizmon.banner.mvp.BizBannerContainerView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i42 = i5;
                com.truecaller.bizmon.banner.mvp.BizBannerContainerView bizBannerContainerView = this.b;
                switch (i42) {
                    case 0:
                        int i52 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate = bizBannerContainerView.getBinding().e.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView");
                        return (com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView) inflate;
                    case 1:
                        int i6 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate2 = bizBannerContainerView.getBinding().b.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate2, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.imageOnly.BizImageOnlyBannerView");
                        return (com.truecaller.bizmon.banner.mvp.imageOnly.BizImageOnlyBannerView) inflate2;
                    case 2:
                        int i7 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate3 = bizBannerContainerView.getBinding().c.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate3, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView");
                        return (com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView) inflate3;
                    default:
                        int i8 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate4 = bizBannerContainerView.getBinding().d.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate4, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.imageWithText.BizRightImageWithTextBannerView");
                        return (com.truecaller.bizmon.banner.mvp.imageWithText.BizRightImageWithTextBannerView) inflate4;
                }
            }
        });
        final int i6 = 3;
        this.f = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: qg0.c
            public final /* synthetic */ com.truecaller.bizmon.banner.mvp.BizBannerContainerView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i42 = i6;
                com.truecaller.bizmon.banner.mvp.BizBannerContainerView bizBannerContainerView = this.b;
                switch (i42) {
                    case 0:
                        int i52 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate = bizBannerContainerView.getBinding().e.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView");
                        return (com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView) inflate;
                    case 1:
                        int i62 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate2 = bizBannerContainerView.getBinding().b.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate2, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.imageOnly.BizImageOnlyBannerView");
                        return (com.truecaller.bizmon.banner.mvp.imageOnly.BizImageOnlyBannerView) inflate2;
                    case 2:
                        int i7 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate3 = bizBannerContainerView.getBinding().c.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate3, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView");
                        return (com.truecaller.bizmon.banner.mvp.imageWithText.BizLeftImageWithTextBannerView) inflate3;
                    default:
                        int i8 = com.truecaller.bizmon.banner.mvp.BizBannerContainerView.h;
                        java.lang.Object inflate4 = bizBannerContainerView.getBinding().d.inflate();
                        kotlin.jvm.internal.Intrinsics.e(inflate4, "null cannot be cast to non-null type com.truecaller.bizmon.banner.mvp.imageWithText.BizRightImageWithTextBannerView");
                        return (com.truecaller.bizmon.banner.mvp.imageWithText.BizRightImageWithTextBannerView) inflate4;
                }
            }
        });
        this.g = kotlin.LazyKt.lazy(new q52.l(4, context, this));
        if (isInEditMode()) {
            return;
        }
        gj.m.k0(this, false);
        tx.w wVar = ((tx.w) ((pg0.bar) j71.g.E(pg0.bar.class, context.getApplicationContext()))).H.b.a;
        this.a = new dw2.qux((kotlin.coroutines.CoroutineContext) wVar.V1.get(), (kotlin.coroutines.CoroutineContext) wVar.P.get(), cd3.baz.a(wVar.zf));
    }

    public /* synthetic */ BizBannerContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
