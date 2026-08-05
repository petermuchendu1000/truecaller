package com.truecaller.details_view.ui.ads;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DetailsAdView extends o80.bar implements ma1.baz, zb1.bar, bd3.qux {
    public static final /* synthetic */ int f = 0;
    public yc3.d a;
    public boolean b;
    public ma1.bar c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DetailsAdView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.view.View getAdPlaceholder() {
        java.lang.Object value = this.d.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final com.truecaller.ads.ui.AdsContainerLight getAdsContainer() {
        java.lang.Object value = this.e.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (com.truecaller.ads.ui.AdsContainerLight) value;
    }

    @javax.inject.Named("details_ad_presenter")
    public static /* synthetic */ void getPresenter$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ma1.baz
    public final void Q0(u90.a aVar, com.truecaller.ads.AdLayoutTypeX adLayoutTypeX) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLayoutTypeX, "layout");
        gj.m.j0(this);
        setClipToOutline(true);
        gj.m.f0(getAdPlaceholder());
        com.truecaller.ads.ui.AdsContainerLight adsContainer = getAdsContainer();
        adsContainer.f(adLayoutTypeX, aVar);
        gj.m.j0(adsContainer);
        adsContainer.setClipToOutline(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.a == null) {
            this.a = new yc3.d(this);
        }
        return this.a.X3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ma1.baz
    public final void a() {
        gj.m.j0(this);
        setClipToOutline(true);
        android.view.View adPlaceholder = getAdPlaceholder();
        gj.m.j0(adPlaceholder);
        adPlaceholder.setClipToOutline(true);
        gj.m.f0(getAdsContainer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ma1.baz
    public final void c() {
        gj.m.f0(this);
    }

    @Override // zb1.bar
    public final void f(com.truecaller.details_view.ui.d1 d1Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d1Var, "detailsViewModel");
        ((ma1.qux) getPresenter()).d2(d1Var.a, d1Var.h);
    }

    public final void g() {
        ma1.qux quxVar = (ma1.qux) getPresenter();
        quxVar.k = false;
        quxVar.c2(false);
    }

    @org.jetbrains.annotations.NotNull
    public final ma1.bar getPresenter() {
        ma1.bar barVar = this.c;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final void h() {
        ma1.qux quxVar = (ma1.qux) getPresenter();
        quxVar.f2(false);
        quxVar.c2(true);
    }

    public final void i() {
        ma1.qux quxVar = (ma1.qux) getPresenter();
        quxVar.k = true;
        quxVar.R0(true);
    }

    public final void j(com.truecaller.data.entity.Contact contact, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        ((ma1.qux) getPresenter()).d2(contact, z);
    }

    public final void l(boolean z) {
        ((ma1.qux) getPresenter()).R0(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.widget.FrameLayout*/.onAttachedToWindow();
        ((ma1.qux) getPresenter()).u0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.widget.FrameLayout*/.onDetachedFromWindow();
        ((ma1.qux) getPresenter()).m1();
        getAdsContainer().removeAllViews();
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull ma1.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.c = barVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ma1.baz
    public final void v(h10.b bVar, o00.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "layout");
        gj.m.j0(this);
        setClipToOutline(true);
        gj.m.f0(getAdPlaceholder());
        com.truecaller.ads.ui.AdsContainerLight adsContainer = getAdsContainer();
        adsContainer.e(bVar, bazVar, new jz0.u(this, 11));
        gj.m.j0(adsContainer);
        adsContainer.setClipToOutline(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DetailsAdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DetailsAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 1;
        if (!isInEditMode() && !this.b) {
            this.b = true;
            this.c = (ma1.bar) ((ma1.b) X3()).e.X1.get();
        }
        final int i3 = 0;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: ma1.a
            public final /* synthetic */ com.truecaller.details_view.ui.ads.DetailsAdView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i4 = i3;
                o80.bar barVar = this.b;
                switch (i4) {
                    case 0:
                        int i5 = com.truecaller.details_view.ui.ads.DetailsAdView.f;
                        return barVar.findViewById(2131362131);
                    default:
                        int i6 = com.truecaller.details_view.ui.ads.DetailsAdView.f;
                        return barVar.findViewById(2131362202);
                }
            }
        });
        this.e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: ma1.a
            public final /* synthetic */ com.truecaller.details_view.ui.ads.DetailsAdView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i4 = i2;
                o80.bar barVar = this.b;
                switch (i4) {
                    case 0:
                        int i5 = com.truecaller.details_view.ui.ads.DetailsAdView.f;
                        return barVar.findViewById(2131362131);
                    default:
                        int i6 = com.truecaller.details_view.ui.ads.DetailsAdView.f;
                        return barVar.findViewById(2131362202);
                }
            }
        });
        li.qux.u(context, "from(...)", true).inflate(2131560936, (android.view.ViewGroup) this, true);
    }

    public /* synthetic */ DetailsAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
