package com.truecaller.ads.adsrouter.ui.suggestedapps;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdRouterSuggestedAppsView extends android.widget.FrameLayout implements o10.i {
    public static final /* synthetic */ int j = 0;
    public java.util.ArrayList a;
    public iy.bar b;
    public com.truecaller.ads.adsrouter.ui.offers.OfferConfig c;
    public java.util.ArrayList d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;
    public final kotlin.Lazy h;
    public final kotlin.Lazy i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdRouterSuggestedAppsView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.TextView getOffersText() {
        return (android.widget.TextView) this.f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.truecaller.common.ui.TcxPagerIndicator getPageIndicator() {
        return (com.truecaller.common.ui.TcxPagerIndicator) this.g.getValue();
    }

    private final o10.b getPageScrollListener() {
        return (o10.b) this.i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.recyclerview.widget.RecyclerView getSuggestedAppsRecyclerView() {
        return (androidx.recyclerview.widget.RecyclerView) this.e.getValue();
    }

    private final android.widget.TextView getSuggestedAppsTitle() {
        return (android.widget.TextView) this.h.getValue();
    }

    private final void setOffersText(com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig) {
        int i;
        java.lang.String str;
        if (!offerConfig.getAds().isEmpty()) {
            com.truecaller.ads.adsrouter.model.AdOffersTemplate offersTemplate = offerConfig.getOffers().getOffersTemplate();
            int i2 = -1;
            if (offersTemplate == null) {
                i = -1;
            } else {
                i = o10.a.a[offersTemplate.ordinal()];
            }
            if (i != 1 && i != 2) {
                android.widget.TextView offersText = getOffersText();
                if (offersText != null) {
                    gj.m.f0(offersText);
                    return;
                }
                return;
            }
            android.widget.TextView offersText2 = getOffersText();
            if (offersText2 != null) {
                gj.m.j0(offersText2);
                com.truecaller.ads.adsrouter.model.AdOffersTemplate offersTemplate2 = offerConfig.getOffers().getOffersTemplate();
                if (offersTemplate2 != null) {
                    i2 = m10.e.a[offersTemplate2.ordinal()];
                }
                if (i2 == 1) {
                    str = "View More";
                } else {
                    str = "View All";
                }
                offersText2.setText(str);
                offersText2.setOnClickListener(new o10.qux(0, this, offerConfig));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupNudgeTemplate$lambda$0(com.truecaller.ads.adsrouter.ui.suggestedapps.AdRouterSuggestedAppsView adRouterSuggestedAppsView) {
        adRouterSuggestedAppsView.getSuggestedAppsRecyclerView().smoothScrollBy(300, 0, (android.view.animation.Interpolator) null, 1500);
    }

    @Override // o10.i
    public final void b(int i) {
        iy.bar barVar = this.b;
        if (barVar != null) {
            if (g()) {
                i = f(i);
            }
            barVar.b(i);
        }
    }

    @Override // o10.i
    public final void c(int i) {
        iy.bar barVar;
        if (!g() && (barVar = this.b) != null) {
            barVar.c(i);
        }
    }

    public final int f(int i) {
        androidx.recyclerview.widget.RecyclerView suggestedAppsRecyclerView = getSuggestedAppsRecyclerView();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(suggestedAppsRecyclerView, "<get-suggestedAppsRecyclerView>(...)");
        androidx.recyclerview.widget.LinearLayoutManager layoutManager = suggestedAppsRecyclerView.getLayoutManager();
        kotlin.jvm.internal.Intrinsics.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return (layoutManager.Y0() * 8) + i;
    }

    public final boolean g() {
        com.truecaller.ads.adsrouter.model.AdOffersTemplate adOffersTemplate;
        com.truecaller.ads.adsrouter.model.AdOffers offers;
        com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig = this.c;
        if (offerConfig != null && (offers = offerConfig.getOffers()) != null) {
            adOffersTemplate = offers.getOffersTemplate();
        } else {
            adOffersTemplate = null;
        }
        if (adOffersTemplate == com.truecaller.ads.adsrouter.model.AdOffersTemplate.NUDGE) {
            return true;
        }
        return false;
    }

    public final void h(java.util.ArrayList arrayList, com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig, iy.bar barVar) {
        com.truecaller.ads.adsrouter.model.AdOffers offers;
        java.util.ArrayList arrayList2;
        int i;
        com.truecaller.ads.adsrouter.model.AdOffers offers2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "apps");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "callback");
        this.a = arrayList;
        this.c = offerConfig;
        this.b = barVar;
        if (offerConfig != null) {
            setOffersText(offerConfig);
        }
        com.truecaller.ads.adsrouter.model.AdOffersTemplate adOffersTemplate = null;
        if (g()) {
            java.util.ArrayList arrayList3 = this.a;
            if (arrayList3 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList3, "<this>");
                arrayList2 = kotlin.collections.CollectionsKt.M0(arrayList3, 8, 8, true);
            } else {
                arrayList2 = null;
            }
            this.d = arrayList2;
            getSuggestedAppsRecyclerView().setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false));
            getSuggestedAppsRecyclerView().addOnScrollListener(getPageScrollListener());
            new androidx.recyclerview.widget.o2().a(getSuggestedAppsRecyclerView());
            androidx.recyclerview.widget.RecyclerView suggestedAppsRecyclerView = getSuggestedAppsRecyclerView();
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            kotlin.collections.h0 h0Var = this.d;
            if (h0Var == null) {
                h0Var = kotlin.collections.h0.a;
            }
            com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig2 = this.c;
            if (offerConfig2 != null && (offers2 = offerConfig2.getOffers()) != null) {
                adOffersTemplate = offers2.getOffersTemplate();
            }
            suggestedAppsRecyclerView.setAdapter(new ao.q(context, this, h0Var, adOffersTemplate));
            com.truecaller.common.ui.TcxPagerIndicator pageIndicator = getPageIndicator();
            java.util.ArrayList arrayList4 = this.d;
            if (arrayList4 != null) {
                i = arrayList4.size();
            } else {
                i = 0;
            }
            pageIndicator.setNumberOfPages(i);
            getPageIndicator().setFirstPage(0);
            com.truecaller.common.ui.TcxPagerIndicator pageIndicator2 = getPageIndicator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pageIndicator2, "<get-pageIndicator>(...)");
            gj.m.j0(pageIndicator2);
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new hm.e(this, 29), 1000L);
            return;
        }
        com.google.android.flexbox.FlexboxLayoutManager flexboxLayoutManager = new com.google.android.flexbox.FlexboxLayoutManager(getContext());
        if (flexboxLayoutManager.r != 5) {
            flexboxLayoutManager.r = 5;
            flexboxLayoutManager.B0();
        }
        flexboxLayoutManager.g1(2);
        flexboxLayoutManager.h1(0);
        flexboxLayoutManager.i1(1);
        getSuggestedAppsRecyclerView().setLayoutManager(flexboxLayoutManager);
        androidx.recyclerview.widget.RecyclerView suggestedAppsRecyclerView2 = getSuggestedAppsRecyclerView();
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (offerConfig != null && (offers = offerConfig.getOffers()) != null) {
            adOffersTemplate = offers.getOffersTemplate();
        }
        suggestedAppsRecyclerView2.setAdapter(new j23.i(context2, this, arrayList, adOffersTemplate));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdRouterSuggestedAppsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdRouterSuggestedAppsView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.e = gj.m.I(2131366713, this);
        this.f = gj.m.I(2131365557, this);
        this.g = gj.m.I(2131365630, this);
        this.h = gj.m.I(2131366714, this);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        yy.qux.F(from, true).inflate(2131560915, this);
        android.widget.TextView offersText = getOffersText();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(offersText, "<get-offersText>(...)");
        android.widget.TextView suggestedAppsTitle = getSuggestedAppsTitle();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(suggestedAppsTitle, "<get-suggestedAppsTitle>(...)");
        java.util.Iterator it = kotlin.collections.y.j(new android.widget.TextView[]{offersText, suggestedAppsTitle}).iterator();
        while (it.hasNext()) {
            ge0.i.R((android.widget.TextView) it.next(), 1.2f);
        }
        this.i = kotlin.LazyKt.lazy(new n11.m(this, 20));
    }

    public /* synthetic */ AdRouterSuggestedAppsView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
