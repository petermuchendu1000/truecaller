package com.truecaller.ads.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdsContainerLight extends android.widget.FrameLayout {
    public static final /* synthetic */ int j = 0;
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;
    public com.truecaller.ads.analytics.qux g;
    public final kotlin.Lazy h;
    public final kotlin.Lazy i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsContainerLight(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.TextView getAdAttributionView() {
        return (android.widget.TextView) this.h.getValue();
    }

    private final com.truecaller.ads.analytics.bar getAdBounceBackManager() {
        return (com.truecaller.ads.analytics.bar) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f10.a getAdClickCoordinatesPixelUseCase() {
        return (f10.a) this.e.getValue();
    }

    private final r90.bar getAdsAnalytics() {
        return (r90.bar) this.a.getValue();
    }

    private final qo1.bar getAdsFeaturesInventory() {
        return (qo1.bar) this.i.getValue();
    }

    private final u03.baz getClock() {
        return (u03.baz) this.b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.truecaller.ads.analytics.o getDeviceSize() {
        return (com.truecaller.ads.analytics.o) this.f.getValue();
    }

    private final u03.w getNetworkUtil() {
        return (u03.w) this.c.getValue();
    }

    private final void setAttributionText(java.lang.String str) {
        java.lang.String i = com.truecaller.ads.util.y0.i(str);
        if (i != null) {
            getAdAttributionView().setText(i);
            addView(getAdAttributionView());
        }
    }

    public final void c(java.lang.String str, java.lang.String str2, java.lang.String str3, com.truecaller.ads.analytics.AdRequestEventSSP adRequestEventSSP, com.truecaller.ads.analytics.AdRequestEventServedType adRequestEventServedType) {
        r90.bar adsAnalytics = getAdsAnalytics();
        int code = adRequestEventSSP.getCode();
        int code2 = adRequestEventServedType.getCode();
        getClock().getClass();
        ((r90.baz) adsAnalytics).a(new com.truecaller.ads.analytics.h(str2, str, null, null, null, null, code, code2, str3, java.lang.System.currentTimeMillis(), getNetworkUtil().c(), null, null, 6204));
    }

    public final void d(h10.b bVar, o00.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "layout");
        e(bVar, bazVar, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "ev");
        com.truecaller.ads.analytics.qux quxVar = new com.truecaller.ads.analytics.qux(motionEvent.getX(), motionEvent.getY());
        this.g = quxVar;
        ((com.truecaller.ads.analytics.baz) getAdBounceBackManager()).a(quxVar, getDeviceSize());
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(h10.b bVar, o00.baz bazVar, h10.l0 l0Var) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "layout");
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        android.view.View J = h0.b.J(bVar, context, bazVar, new f2.y(28, l0Var, this), false, 8);
        if (J != null) {
            gj.m.S(J, new da0.baz(0, this, bVar));
            h10.i iVar = (h10.i) bVar;
            java.lang.String str2 = iVar.b;
            java.lang.String lowerCase = bVar.getType().name().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            c("inflated", str2, lowerCase, bVar.j(), com.truecaller.ads.analytics.k.b(iVar.e));
            if (bVar.r()) {
                str = iVar.c;
            } else {
                str = null;
            }
            if (getAdsFeaturesInventory().b.a("featureRoundBorderAdsForTAS", com.truecaller.featuretoggles.FeatureState.DISABLED) && com.truecaller.ads.util.y0.p(bVar) && com.truecaller.ads.util.y0.B(iVar.i)) {
                com.truecaller.ads.adsrouter.ui.AdType type = bVar.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
                if (type != com.truecaller.ads.adsrouter.ui.AdType.NATIVE && type != com.truecaller.ads.adsrouter.ui.AdType.NATIVE_ANIMATED_ICON) {
                    setBackgroundColor(getResources().getColor(2131099722, null));
                    android.content.Context context2 = getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    int s = ak.r0.s(context2, 10);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(J, "<this>");
                    J.post(new bx.qux(J, s, 3));
                    android.widget.TextView adAttributionView = getAdAttributionView();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adAttributionView, "<this>");
                    adAttributionView.post(new com.truecaller.ads.util.t0(adAttributionView, 0));
                }
            }
            setVisibility(0);
            removeAllViews();
            addView(J);
            if (str != null) {
                setAttributionText(str);
            }
        }
    }

    public final void f(o00.baz bazVar, u90.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "layout");
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        android.view.View i = aVar.i(context, bazVar, false);
        if (i != null) {
            gj.m.S(i, new da0.baz(1, this, aVar));
            c("inflated", ((u90.baz) aVar).b.a, aVar.getAdType(), com.truecaller.ads.analytics.AdRequestEventSSP.GAM, com.truecaller.ads.analytics.AdRequestEventServedType.NETWORK);
            java.lang.String j2 = com.truecaller.ads.util.y0.j(aVar);
            setVisibility(0);
            removeAllViews();
            addView(i);
            if (j2 != null) {
                setAttributionText(j2);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsContainerLight(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsContainerLight(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = kotlin.LazyKt.lazy(new d23.d(29));
        this.b = kotlin.LazyKt.lazy(new da0.bar(0));
        this.c = kotlin.LazyKt.lazy(new da0.bar(1));
        this.d = kotlin.LazyKt.lazy(new da0.bar(2));
        this.e = kotlin.LazyKt.lazy(new da0.bar(3));
        this.f = kotlin.LazyKt.lazy(new cu0.h(this, 10));
        this.h = kotlin.LazyKt.lazy(new be.x(context, 6));
        this.i = kotlin.LazyKt.lazy(new da0.bar(4));
    }

    public /* synthetic */ AdsContainerLight(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
