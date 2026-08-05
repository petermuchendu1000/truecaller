package com.truecaller.bizmon.banner.mvp.imageOnly;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizImageOnlyBannerView extends com.google.android.material.card.MaterialCardView implements rg0.bar {
    public static final /* synthetic */ int l = 0;
    public final rg0.baz i;
    public kotlin.jvm.functions.Function0 j;
    public final kotlin.Lazy k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizImageOnlyBannerView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qg0.a
    public final void c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "deeplink");
        this.j.invoke();
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean C = f0.qux.C(context, str);
        rg0.baz bazVar = this.i;
        if (bazVar != null) {
            if (!C) {
                bazVar.c2(com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction.CLICKED_NO_REDIRECTION);
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final fi0.h getBinding() {
        return (fi0.h) this.k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            rg0.baz bazVar = this.i;
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
        rg0.baz bazVar = this.i;
        if (bazVar != null) {
            bazVar.m1();
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }

    @Override // rg0.bar
    public void setBannerClickListener(@org.jetbrains.annotations.Nullable java.lang.String str) {
        getBinding().b.setOnClickListener(new o10.qux(20, this, str));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizImageOnlyBannerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BizImageOnlyBannerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.j = new r2.n(20);
        this.k = kotlin.LazyKt.lazy(new q52.l(17, context, this));
        setRadius(32.0f);
        setCardElevation(0.0f);
        if (isInEditMode()) {
            return;
        }
        tx.c0 c0Var = ((tx.w) ((pg0.bar) j71.g.E(pg0.bar.class, context.getApplicationContext()))).H.b;
        tx.w wVar = c0Var.a;
        this.i = new rg0.baz((kotlin.coroutines.CoroutineContext) wVar.V1.get(), (kg0.baz) c0Var.z0.get(), (qg0.d) c0Var.H1.get(), (u03.baz) wVar.W.get(), 0);
    }

    public /* synthetic */ BizImageOnlyBannerView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 2130969918 : i);
    }
}
