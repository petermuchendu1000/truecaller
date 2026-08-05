package com.truecaller.bizmon.banner.mvp.textOnly;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizTextOnlyBannerView extends com.google.android.material.card.MaterialCardView implements tg0.bar {
    public static final /* synthetic */ int l = 0;
    public final kotlin.Lazy i;
    public final rg0.baz j;
    public kotlin.jvm.functions.Function0 k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizTextOnlyBannerView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qg0.a
    public final void c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "deeplink");
        this.k.invoke();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean C = f0.qux.C(context, str);
        rg0.baz bazVar = this.j;
        if (bazVar != null) {
            if (!C) {
                bazVar.e2(com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction.CLICKED_NO_REDIRECTION);
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.l getBinding() {
        return (fi0.l) this.i.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            rg0.baz bazVar = this.j;
            if (bazVar != null) {
                ((com.truecaller.sdk.bar) bazVar).a = this;
            } else {
                kotlin.jvm.internal.Intrinsics.n("presenter");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.widget.FrameLayout*/.onDetachedFromWindow();
        rg0.baz bazVar = this.j;
        if (bazVar != null) {
            bazVar.m1();
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }

    @Override // tg0.bar
    public void setBannerBackgroundColor(@org.jetbrains.annotations.Nullable java.lang.String str) {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = getBinding().c;
        kotlin.jvm.internal.Intrinsics.d(constraintLayout);
        gj.m.j0(constraintLayout);
        constraintLayout.setBackgroundColor(fu.baz.R(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tg0.bar
    public void setBannerClickListener(@org.jetbrains.annotations.Nullable final java.lang.String str) {
        final int i = 0;
        setOnClickListener(new android.view.View.OnClickListener(this) { // from class: tg0.baz
            public final /* synthetic */ com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                switch (i) {
                    case 0:
                        rg0.baz bazVar = this.b.j;
                        if (bazVar != null) {
                            bazVar.g2(str);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("presenter");
                            throw null;
                        }
                    default:
                        rg0.baz bazVar2 = this.b.j;
                        if (bazVar2 != null) {
                            bazVar2.g2(str);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("presenter");
                            throw null;
                        }
                }
            }
        });
        final int i2 = 1;
        getBinding().b.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: tg0.baz
            public final /* synthetic */ com.truecaller.bizmon.banner.mvp.textOnly.BizTextOnlyBannerView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                switch (i2) {
                    case 0:
                        rg0.baz bazVar = this.b.j;
                        if (bazVar != null) {
                            bazVar.g2(str);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("presenter");
                            throw null;
                        }
                    default:
                        rg0.baz bazVar2 = this.b.j;
                        if (bazVar2 != null) {
                            bazVar2.g2(str);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("presenter");
                            throw null;
                        }
                }
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizTextOnlyBannerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BizTextOnlyBannerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.i = kotlin.LazyKt.lazy(new sd.bar(13, context, this));
        this.k = new t22.s0(23);
        if (!isInEditMode()) {
            gj.m.k0(this, false);
            tx.c0 c0Var = ((tx.w) ((pg0.bar) j71.g.E(pg0.bar.class, context.getApplicationContext()))).H.b;
            tx.w wVar = c0Var.a;
            this.j = new rg0.baz((kotlin.coroutines.CoroutineContext) wVar.V1.get(), (kg0.baz) c0Var.z0.get(), (qg0.d) c0Var.H1.get(), (u03.baz) wVar.W.get(), 2);
        }
        setRadius(32.0f);
        setCardElevation(0.0f);
    }

    public /* synthetic */ BizTextOnlyBannerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 2130969918 : i);
    }
}
