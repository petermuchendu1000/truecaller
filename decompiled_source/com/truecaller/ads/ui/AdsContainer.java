package com.truecaller.ads.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdsContainer extends com.google.android.material.card.MaterialCardView implements fg3.e0 {
    public static final /* synthetic */ int z = 0;
    public final /* synthetic */ fe3.bar i;
    public com.truecaller.ads.adsrouter.model.ClickGuard j;
    public final float k;
    public final kotlin.Lazy l;
    public final kotlin.Lazy m;
    public final kotlin.Lazy n;
    public final kotlin.Lazy o;
    public final kotlin.Lazy p;
    public final kotlin.Lazy q;
    public final kotlin.Lazy r;
    public final kotlin.Lazy s;
    public android.os.Handler t;
    public final kotlin.Lazy u;
    public com.truecaller.ads.analytics.qux v;
    public final kotlin.Lazy w;
    public boolean x;
    public fg3.k2 y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsContainer(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.TextView getAdAttributionView() {
        return (android.widget.TextView) this.w.getValue();
    }

    private final com.truecaller.ads.analytics.bar getAdBounceBackManager() {
        return (com.truecaller.ads.analytics.bar) this.o.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f10.a getAdClickCoordinatesPixelUseCase() {
        return (f10.a) this.q.getValue();
    }

    private final com.truecaller.ads.util.d getAdClickGuardConfigManager() {
        return (com.truecaller.ads.util.d) this.s.getValue();
    }

    private final com.truecaller.ads.util.g getAdClickRestrictionOverlayManager() {
        return (com.truecaller.ads.util.g) this.r.getValue();
    }

    private final r90.bar getAdsAnalytics() {
        return (r90.bar) this.l.getValue();
    }

    private final qo1.bar getAdsFeaturesInventory() {
        return (qo1.bar) this.p.getValue();
    }

    private final u03.baz getClock() {
        return (u03.baz) this.m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.truecaller.ads.analytics.o getDeviceSize() {
        return (com.truecaller.ads.analytics.o) this.u.getValue();
    }

    private final u03.w getNetworkUtil() {
        return (u03.w) this.n.getValue();
    }

    public static java.lang.String o(o00.b0 b0Var) {
        o00.bar barVar;
        o00.bar barVar2;
        if (b0Var != null && (barVar2 = b0Var.n) != null && !barVar2.m) {
            return b0Var.a();
        }
        if (b0Var != null && (barVar = b0Var.n) != null) {
            return bar.l(barVar.l, b0Var.a(), "_");
        }
        if (b0Var != null) {
            return b0Var.a();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setAttributionText(java.lang.String str) {
        java.lang.String i = com.truecaller.ads.util.y0.i(str);
        if (i != null) {
            getAdAttributionView().setText(i);
            addView(getAdAttributionView());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "ev");
        com.truecaller.ads.analytics.qux quxVar = new com.truecaller.ads.analytics.qux(motionEvent.getX(), motionEvent.getY());
        this.v = quxVar;
        ((com.truecaller.ads.analytics.baz) getAdBounceBackManager()).a(quxVar, getDeviceSize());
        if (this.x && com.truecaller.ads.util.y0.q(this.j, motionEvent, this)) {
            return true;
        }
        return super/*android.widget.FrameLayout*/.dispatchTouchEvent(motionEvent);
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.i.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        long j;
        java.lang.Object obj;
        java.util.List list = (java.util.List) ((com.truecaller.ads.util.i) getAdClickRestrictionOverlayManager()).a.getValue();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    com.truecaller.ads.util.AdClickRestrictionOverlayConfig adClickRestrictionOverlayConfig = (com.truecaller.ads.util.AdClickRestrictionOverlayConfig) obj;
                    if (adClickRestrictionOverlayConfig.getEnable() && com.truecaller.ads.util.i.a(str, adClickRestrictionOverlayConfig.getPlacements()) && com.truecaller.ads.util.i.a(str3, adClickRestrictionOverlayConfig.getPartners()) && com.truecaller.ads.util.i.a(str2, adClickRestrictionOverlayConfig.getAdTypes())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.truecaller.ads.util.AdClickRestrictionOverlayConfig adClickRestrictionOverlayConfig2 = (com.truecaller.ads.util.AdClickRestrictionOverlayConfig) obj;
            if (adClickRestrictionOverlayConfig2 != null) {
                j = adClickRestrictionOverlayConfig2.getIntervalInMs();
                if (j > 0) {
                    return;
                }
                android.view.View view = new android.view.View(getContext());
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, 0));
                view.setTag("click_restriction_overlay");
                view.setClickable(true);
                android.os.Handler handler = this.t;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                android.view.View findViewWithTag = findViewWithTag("click_restriction_overlay");
                if (findViewWithTag != null) {
                    removeView(findViewWithTag);
                }
                if (this.t == null) {
                    this.t = new android.os.Handler(android.os.Looper.getMainLooper());
                }
                addView(view);
                view.post(new cx.bar(2, view, this));
                android.os.Handler handler2 = this.t;
                if (handler2 != null) {
                    handler2.postDelayed(new com.mbridge.msdk.config.component.common.network.connect.socket.bar(this, 22), j);
                    return;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("clickRestrictionOverlayHandler");
                    throw null;
                }
            }
        }
        j = 0;
        if (j > 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(android.view.View view, h10.b bVar) {
        com.truecaller.ads.adsrouter.ui.AdType type = bVar.getType();
        kotlin.Lazy lazy = com.truecaller.ads.util.y0.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        if (type != com.truecaller.ads.adsrouter.ui.AdType.NATIVE && type != com.truecaller.ads.adsrouter.ui.AdType.NATIVE_ANIMATED_ICON) {
            setStrokeWidth(0);
            setStrokeColor(0);
            setCardBackgroundColor(getResources().getColor(2131099722, null));
            setBackgroundColor(getResources().getColor(2131099722, null));
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int r = ak.r0.r(10.0f, context);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<this>");
            view.post(new bx.qux(view, r, 3));
            android.widget.TextView adAttributionView = getAdAttributionView();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adAttributionView, "<this>");
            adAttributionView.post(new com.truecaller.ads.util.t0(adAttributionView, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.widget.FrameLayout*/.onDetachedFromWindow();
        q();
        android.os.Handler handler = this.t;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void onMeasure(int i, int i2) {
        java.lang.Float valueOf = java.lang.Float.valueOf(this.k);
        if (valueOf.floatValue() <= 0.0f) {
            valueOf = null;
        }
        if (valueOf != null) {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec((int) valueOf.floatValue(), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.widget.FrameLayout*/.onSizeChanged(i, i2, i3, i4);
        android.view.View findViewWithTag = findViewWithTag("click_restriction_overlay");
        if (findViewWithTag == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = findViewWithTag.getLayoutParams();
        layoutParams.height = i2;
        findViewWithTag.setLayoutParams(layoutParams);
        findViewWithTag.requestLayout();
    }

    public final void p(java.lang.String str, java.lang.String str2, java.lang.String str3, com.truecaller.ads.analytics.AdRequestEventSSP adRequestEventSSP, com.truecaller.ads.analytics.AdRequestEventServedType adRequestEventServedType) {
        r90.bar adsAnalytics = getAdsAnalytics();
        int code = adRequestEventSSP.getCode();
        int code2 = adRequestEventServedType.getCode();
        getClock().getClass();
        ((r90.baz) adsAnalytics).a(new com.truecaller.ads.analytics.h(str2, str, null, null, null, null, code, code2, str3, java.lang.System.currentTimeMillis(), getNetworkUtil().c(), null, null, 6204));
    }

    public final void q() {
        this.x = false;
        this.j = null;
        fg3.c2 c2Var = this.y;
        if (c2Var != null) {
            if (!c2Var.isActive()) {
                c2Var = null;
            }
            if (c2Var != null) {
                c2Var.cancel((java.util.concurrent.CancellationException) null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(h10.b bVar, o00.baz bazVar, h10.l0 l0Var, boolean z2) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "layout");
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        android.view.View q = bVar.q(context, bazVar, new com.google.android.gms.internal.auth.e(28, l0Var, this), z2);
        if (q != null) {
            gj.m.S(q, new by2.a(29, this, bVar));
            h10.i iVar = (h10.i) bVar;
            java.lang.String str2 = iVar.b;
            java.lang.String lowerCase = bVar.getType().name().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            p("inflated", str2, lowerCase, bVar.j(), com.truecaller.ads.analytics.k.b(iVar.e));
            if (bVar.r()) {
                str = iVar.c;
            } else {
                str = null;
            }
            if (v(bVar, z2)) {
                n(q, bVar);
            }
            setVisibility(0);
            removeAllViews();
            addView(q);
            if (str != null) {
                setAttributionText(str);
            }
            if (bVar instanceof h10.l) {
                u90.baz bazVar2 = (u90.baz) ((h10.l) bVar).o.b;
                java.lang.String o = o(bazVar2.b.b);
                java.lang.String adType = bazVar2.getAdType();
                java.lang.String j = com.truecaller.ads.util.y0.j(bVar);
                u(o, adType, j);
                m(o, adType, j);
                return;
            }
            q();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(h10.b bVar, o00.baz bazVar, kotlin.jvm.functions.Function0 function0, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "layout");
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        android.view.View J = h0.b.J(bVar, context, bazVar, (f2.y) null, z2, 4);
        if (J != null) {
            q();
            gj.m.S(J, new a63.d(function0, this, bVar, 16));
            h10.i iVar = (h10.i) bVar;
            java.lang.String str = iVar.b;
            java.lang.String lowerCase = bVar.getType().name().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            p("inflated", str, lowerCase, bVar.j(), com.truecaller.ads.analytics.k.b(iVar.e));
            if (v(bVar, z2)) {
                n(J, bVar);
            }
            java.lang.String str2 = iVar.c;
            setVisibility(0);
            removeAllViews();
            addView(J);
            if (str2 != null) {
                setAttributionText(str2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(u90.a aVar, o00.baz bazVar, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "layout");
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        android.view.View i = aVar.i(context, bazVar, z2);
        if (i != null) {
            java.lang.String j = com.truecaller.ads.util.y0.j(aVar);
            setVisibility(0);
            removeAllViews();
            addView(i);
            if (j != null) {
                setAttributionText(j);
            }
            t90.f fVar = ((u90.baz) aVar).b;
            java.lang.String o = o(fVar.b);
            java.lang.String adType = aVar.getAdType();
            java.lang.String j2 = com.truecaller.ads.util.y0.j(aVar);
            u(o, adType, j2);
            m(o, adType, j2);
            gj.m.S(i, new by2.a(28, this, aVar));
            p("inflated", fVar.a, aVar.getAdType(), com.truecaller.ads.analytics.AdRequestEventSSP.GAM, com.truecaller.ads.analytics.AdRequestEventServedType.NETWORK);
        }
    }

    public final void u(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.truecaller.ads.util.AdClickGuardConfig adClickGuardConfig;
        java.lang.Object obj;
        q();
        java.util.List list = (java.util.List) ((com.truecaller.ads.util.f) getAdClickGuardConfigManager()).b.getValue();
        df3.bar barVar = null;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    com.truecaller.ads.util.AdClickGuardConfig adClickGuardConfig2 = (com.truecaller.ads.util.AdClickGuardConfig) obj;
                    if (adClickGuardConfig2.getEnable() && com.truecaller.ads.util.f.a(str, adClickGuardConfig2.getPlacements()) && com.truecaller.ads.util.f.a(str3, adClickGuardConfig2.getPartners()) && com.truecaller.ads.util.f.a(str2, adClickGuardConfig2.getAdTypes())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            adClickGuardConfig = (com.truecaller.ads.util.AdClickGuardConfig) obj;
        } else {
            adClickGuardConfig = null;
        }
        if (adClickGuardConfig == null) {
            return;
        }
        this.j = adClickGuardConfig.getClickGuard();
        this.x = true;
        this.y = fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.j(adClickGuardConfig.getIntervalInMs(), this, barVar, 12), 3);
    }

    public final boolean v(h10.b bVar, boolean z2) {
        if (getAdsFeaturesInventory().b.a("featureRoundBorderAdsForTAS", com.truecaller.featuretoggles.FeatureState.DISABLED) && com.truecaller.ads.util.y0.p(bVar) && com.truecaller.ads.util.y0.B(((h10.i) bVar).i) && !z2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.i = fg3.h0.d();
        this.l = kotlin.LazyKt.lazy(new d23.d(21));
        this.m = kotlin.LazyKt.lazy(new d23.d(22));
        this.n = kotlin.LazyKt.lazy(new d23.d(23));
        this.o = kotlin.LazyKt.lazy(new d23.d(24));
        this.p = kotlin.LazyKt.lazy(new d23.d(25));
        this.q = kotlin.LazyKt.lazy(new d23.d(26));
        this.r = kotlin.LazyKt.lazy(new d23.d(27));
        this.s = kotlin.LazyKt.lazy(new d23.d(28));
        this.u = kotlin.LazyKt.lazy(new cu0.h(this, 9));
        this.w = kotlin.LazyKt.lazy(new be.x(context, 5));
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.ads.R$styleable.a, 0, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                this.k = obtainStyledAttributes.getDimension(0, 0.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public /* synthetic */ AdsContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
