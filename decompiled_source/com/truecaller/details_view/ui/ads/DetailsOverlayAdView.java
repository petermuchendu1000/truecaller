package com.truecaller.details_view.ui.ads;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DetailsOverlayAdView extends android.widget.FrameLayout {
    public static final /* synthetic */ int m = 0;
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public android.animation.ValueAnimator f;
    public android.os.CountDownTimer g;
    public long h;
    public long i;
    public boolean j;
    public boolean k;
    public kotlin.jvm.functions.Function0 l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DetailsOverlayAdView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(com.truecaller.details_view.ui.ads.DetailsOverlayAdView detailsOverlayAdView, android.animation.ValueAnimator valueAnimator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueAnimator, "animation");
        android.view.View progressBar = detailsOverlayAdView.getProgressBar();
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        kotlin.jvm.internal.Intrinsics.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        progressBar.setScaleX(((java.lang.Float) animatedValue).floatValue());
    }

    public static void b(com.truecaller.details_view.ui.ads.DetailsOverlayAdView detailsOverlayAdView, long j) {
        detailsOverlayAdView.i = j;
        int i = (int) (j / 1000);
        android.animation.ValueAnimator valueAnimator = detailsOverlayAdView.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.os.CountDownTimer countDownTimer = detailsOverlayAdView.g;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        detailsOverlayAdView.getProgressBar().setScaleX(0.0f);
        detailsOverlayAdView.getTvCountdown().setVisibility(0);
        detailsOverlayAdView.getTvCountdown().setText(java.lang.String.valueOf(i));
        detailsOverlayAdView.getBtnClose().setVisibility(8);
        detailsOverlayAdView.getProgressBar().setLayerType(2, null);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.addUpdateListener(new ao.c(detailsOverlayAdView, 6));
        ofFloat.addListener(new da0.a(detailsOverlayAdView, 1));
        ofFloat.start();
        detailsOverlayAdView.f = ofFloat;
        android.os.CountDownTimer countDownTimer2 = detailsOverlayAdView.g;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
        detailsOverlayAdView.g = new com.truecaller.sdk.d(j, detailsOverlayAdView, 5).start();
    }

    public static void c(com.truecaller.details_view.ui.ads.DetailsOverlayAdView detailsOverlayAdView, android.view.View view, u6.z1 z1Var) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(z1Var, "insets");
        detailsOverlayAdView.getClass();
        u6.w1 w1Var = z1Var.a;
        if (!w1Var.q(2)) {
            i = 0;
        } else {
            i = w1Var.g(2).d;
        }
        detailsOverlayAdView.setAdsContainerBottomMargin(i);
        java.util.WeakHashMap weakHashMap = u6.t0.a;
        u6.k0.m(detailsOverlayAdView, (u6.v) null);
    }

    private final com.truecaller.ads.ui.AdsContainer getAdsContainer() {
        java.lang.Object value = this.a.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (com.truecaller.ads.ui.AdsContainer) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View getBtnClose() {
        java.lang.Object value = this.c.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final androidx.constraintlayout.widget.ConstraintLayout getOverlayRoot() {
        java.lang.Object value = this.b.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (androidx.constraintlayout.widget.ConstraintLayout) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View getProgressBar() {
        java.lang.Object value = this.e.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (android.view.View) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.TextView getTvCountdown() {
        java.lang.Object value = this.d.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    private final void setAdsContainerBottomMargin(int i) {
        d6.a aVar;
        d6.a layoutParams = getAdsContainer().getLayoutParams();
        if (layoutParams instanceof d6.a) {
            aVar = layoutParams;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            ((android.view.ViewGroup.MarginLayoutParams) aVar).bottomMargin = i;
            getAdsContainer().setLayoutParams(aVar);
        }
    }

    public final void g() {
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.animation.ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        d6.a aVar = null;
        this.f = null;
        android.os.CountDownTimer countDownTimer = this.g;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.g = null;
        this.h = 0L;
        this.i = 0L;
        this.j = false;
        this.k = false;
        getAdsContainer().setOnHierarchyChangeListener(null);
        java.util.WeakHashMap weakHashMap = u6.t0.a;
        u6.k0.m(this, (u6.v) null);
        getAdsContainer().removeAllViews();
        getAdsContainer().removeAllViews();
        gj.m.f0(getBtnClose());
        gj.m.f0(getTvCountdown());
        getProgressBar().setLayerType(0, null);
        gj.m.f0(getProgressBar());
        com.truecaller.ads.ui.AdsContainer adsContainer = getAdsContainer();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        adsContainer.setRadius(ak.r0.s(r3, 12));
        getOverlayRoot().setBackgroundResource(2131231462);
        android.view.ViewGroup.LayoutParams layoutParams2 = getOverlayRoot().getLayoutParams();
        if (layoutParams2 instanceof android.widget.FrameLayout.LayoutParams) {
            layoutParams = (android.widget.FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.topMargin = 0;
            getOverlayRoot().setLayoutParams(layoutParams);
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = getAdsContainer().getLayoutParams();
        if (layoutParams3 instanceof d6.a) {
            aVar = (d6.a) layoutParams3;
        }
        if (aVar != null) {
            aVar.h = -1;
            aVar.k = -1;
            ((android.view.ViewGroup.MarginLayoutParams) aVar).width = -1;
            ((android.view.ViewGroup.MarginLayoutParams) aVar).height = -2;
            aVar.setMarginStart(0);
            aVar.setMarginEnd(0);
            ((android.view.ViewGroup.MarginLayoutParams) aVar).topMargin = 0;
            ((android.view.ViewGroup.MarginLayoutParams) aVar).bottomMargin = 0;
            getAdsContainer().setLayoutParams(aVar);
        }
    }

    public final boolean getCanClose() {
        if (!this.j && getBtnClose().getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnDismissListener() {
        return this.l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x017e, code lost:
    
        if (r9 == r6.getHeightPx()) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(h10.b bVar, com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig detailsOverlayAdConfig) {
        h10.h hVar;
        h10.a aVar;
        h10.e eVar;
        com.truecaller.ads.adsrouter.model.AdRenderStyle adRenderStyle;
        boolean z;
        h10.i iVar;
        h10.a aVar2;
        h10.g0 g0Var;
        d6.a aVar3;
        kotlin.Pair pair;
        android.widget.FrameLayout.LayoutParams layoutParams;
        com.truecaller.ads.adsrouter.model.Size size;
        com.truecaller.ads.adsrouter.model.Size size2;
        com.truecaller.ads.adsrouter.model.CreativeBehaviour l;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsOverlayAdConfig, "config");
        if (bVar instanceof h10.h) {
            hVar = (h10.h) bVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            aVar = ((h10.i) hVar).a;
        } else {
            aVar = null;
        }
        if (aVar instanceof h10.e) {
            eVar = (h10.e) aVar;
        } else {
            eVar = null;
        }
        if (eVar != null && (l = eVar.l()) != null) {
            adRenderStyle = l.getRenderStyle();
        } else {
            adRenderStyle = null;
        }
        int i = 0;
        if (adRenderStyle == com.truecaller.ads.adsrouter.model.AdRenderStyle.TRANSPARENT) {
            z = true;
        } else {
            z = false;
        }
        g();
        this.j = z;
        if (bVar instanceof h10.i) {
            iVar = (h10.i) bVar;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            aVar2 = iVar.a;
        } else {
            aVar2 = null;
        }
        if (aVar2 instanceof h10.g0) {
            g0Var = (h10.g0) aVar2;
        } else {
            g0Var = null;
        }
        com.truecaller.ads.adsrouter.model.Size o = bVar.o();
        if (o == null) {
            if (g0Var != null) {
                java.lang.Integer t = g0Var.t();
                if (t != null) {
                    int intValue = t.intValue();
                    java.lang.Integer h = g0Var.h();
                    if (h != null) {
                        size2 = new com.truecaller.ads.adsrouter.model.Size(h.intValue(), intValue);
                        o = size2;
                    }
                }
                size2 = null;
                o = size2;
            } else {
                o = null;
            }
            if (o == null) {
                if (eVar != null) {
                    java.lang.Integer p = eVar.p();
                    if (p != null) {
                        int intValue2 = p.intValue();
                        java.lang.Integer h2 = eVar.h();
                        if (h2 != null) {
                            size = new com.truecaller.ads.adsrouter.model.Size(h2.intValue(), intValue2);
                            o = size;
                        }
                    }
                    size = null;
                    o = size;
                } else {
                    o = null;
                }
                if (o == null) {
                    o = new com.truecaller.ads.adsrouter.model.Size(1280, 720);
                }
            }
        }
        int i2 = getResources().getDisplayMetrics().widthPixels;
        int i3 = -2;
        int i4 = -1;
        if (z) {
            setBackgroundColor(0);
            getOverlayRoot().setBackgroundColor(0);
            getAdsContainer().setCardBackgroundColor(0);
            getAdsContainer().setRadius(0.0f);
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int s = ak.r0.s(context, 50);
            android.view.ViewGroup.LayoutParams layoutParams2 = getOverlayRoot().getLayoutParams();
            if (layoutParams2 instanceof android.widget.FrameLayout.LayoutParams) {
                layoutParams = (android.widget.FrameLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.topMargin = s;
                getOverlayRoot().setLayoutParams(layoutParams);
            }
            i(-1, -1, -2);
            java.util.WeakHashMap weakHashMap = u6.t0.a;
            u6.z1 a = u6.l0.a(this);
            if (a != null) {
                u6.w1 w1Var = a.a;
                if (w1Var.q(2)) {
                    i = w1Var.g(2).d;
                }
                setAdsContainerBottomMargin(i);
            } else {
                u6.k0.m(this, new jc3.bar(this, 15));
            }
        } else {
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int s2 = ak.r0.s(context2, 10);
            d6.a layoutParams3 = getAdsContainer().getLayoutParams();
            if (layoutParams3 instanceof d6.a) {
                aVar3 = layoutParams3;
            } else {
                aVar3 = null;
            }
            if (aVar3 != null) {
                aVar3.setMarginStart(s2);
                aVar3.setMarginEnd(s2);
                ((android.view.ViewGroup.MarginLayoutParams) aVar3).topMargin = s2;
                ((android.view.ViewGroup.MarginLayoutParams) aVar3).bottomMargin = s2;
                getAdsContainer().setLayoutParams(aVar3);
            }
            int i5 = i2 - (s2 * 2);
            int width = o.getWidth();
            int height = o.getHeight();
            if (width > 0 && height > 0) {
                if (g0Var == null) {
                    if (bVar.o() != null) {
                        com.truecaller.details_view.ui.ads.OverlayAdSize overlayAdSize = com.truecaller.details_view.ui.ads.OverlayAdSize.SMALL;
                        if (width == overlayAdSize.getWidthPx()) {
                        }
                    }
                    android.content.Context context3 = getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    int s3 = ak.r0.s(context3, width);
                    android.content.Context context4 = getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    int s4 = ak.r0.s(context4, height);
                    if (s3 > i5) {
                        pair = new kotlin.Pair(java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf((int) ((s4 / s3) * i5)));
                    } else {
                        pair = new kotlin.Pair(java.lang.Integer.valueOf(s3), java.lang.Integer.valueOf(s4));
                    }
                }
                pair = new kotlin.Pair(java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf((int) ((height / width) * i5)));
            } else {
                pair = null;
            }
            if (pair != null) {
                i4 = ((java.lang.Number) pair.a).intValue();
            }
            if (pair != null) {
                i3 = ((java.lang.Number) pair.b).intValue();
            }
            i(0, i4, i3);
        }
        getAdsContainer().setOnHierarchyChangeListener(new ma1.e(z, this));
        gj.m.j0(this);
        getAdsContainer().r(bVar, com.truecaller.ads.AdLayoutTypeX.DETAILS, new ah3.i(this, z), true);
        if (z) {
            gj.m.f0(getProgressBar());
            gj.m.f0(getTvCountdown());
            gj.m.f0(getBtnClose());
            return;
        }
        long timer = detailsOverlayAdConfig.getTimer() * 1000;
        if (detailsOverlayAdConfig.getTimer() > 0) {
            gj.m.k0(getProgressBar(), true);
            gj.m.k0(getTvCountdown(), true);
            post(new com.ironsource.jh(this, timer, 1));
        } else {
            gj.m.f0(getProgressBar());
            gj.m.f0(getTvCountdown());
            gj.m.j0(getBtnClose());
        }
    }

    public final void i(int i, int i2, int i3) {
        d6.a aVar;
        d6.a layoutParams = getAdsContainer().getLayoutParams();
        if (layoutParams instanceof d6.a) {
            aVar = layoutParams;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.h = i;
            aVar.k = 0;
            ((android.view.ViewGroup.MarginLayoutParams) aVar).width = i2;
            ((android.view.ViewGroup.MarginLayoutParams) aVar).height = i3;
            getAdsContainer().setLayoutParams(aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    public final void setOnDismissListener(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.l = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DetailsOverlayAdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsOverlayAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 0;
        this.a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: ma1.d
            public final /* synthetic */ com.truecaller.details_view.ui.ads.DetailsOverlayAdView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i3 = i2;
                com.truecaller.details_view.ui.ads.DetailsOverlayAdView detailsOverlayAdView = this.b;
                switch (i3) {
                    case 0:
                        int i4 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131362202);
                    case 1:
                        int i5 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131365624);
                    case 2:
                        int i6 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131362553);
                    case 3:
                        int i7 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return (android.widget.TextView) detailsOverlayAdView.findViewById(2131367199);
                    default:
                        int i8 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131365848);
                }
            }
        });
        final int i3 = 1;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: ma1.d
            public final /* synthetic */ com.truecaller.details_view.ui.ads.DetailsOverlayAdView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i33 = i3;
                com.truecaller.details_view.ui.ads.DetailsOverlayAdView detailsOverlayAdView = this.b;
                switch (i33) {
                    case 0:
                        int i4 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131362202);
                    case 1:
                        int i5 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131365624);
                    case 2:
                        int i6 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131362553);
                    case 3:
                        int i7 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return (android.widget.TextView) detailsOverlayAdView.findViewById(2131367199);
                    default:
                        int i8 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131365848);
                }
            }
        });
        final int i4 = 2;
        this.c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: ma1.d
            public final /* synthetic */ com.truecaller.details_view.ui.ads.DetailsOverlayAdView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i33 = i4;
                com.truecaller.details_view.ui.ads.DetailsOverlayAdView detailsOverlayAdView = this.b;
                switch (i33) {
                    case 0:
                        int i43 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131362202);
                    case 1:
                        int i5 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131365624);
                    case 2:
                        int i6 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131362553);
                    case 3:
                        int i7 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return (android.widget.TextView) detailsOverlayAdView.findViewById(2131367199);
                    default:
                        int i8 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131365848);
                }
            }
        });
        final int i5 = 3;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: ma1.d
            public final /* synthetic */ com.truecaller.details_view.ui.ads.DetailsOverlayAdView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i33 = i5;
                com.truecaller.details_view.ui.ads.DetailsOverlayAdView detailsOverlayAdView = this.b;
                switch (i33) {
                    case 0:
                        int i43 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131362202);
                    case 1:
                        int i53 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131365624);
                    case 2:
                        int i6 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131362553);
                    case 3:
                        int i7 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return (android.widget.TextView) detailsOverlayAdView.findViewById(2131367199);
                    default:
                        int i8 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131365848);
                }
            }
        });
        final int i6 = 4;
        this.e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: ma1.d
            public final /* synthetic */ com.truecaller.details_view.ui.ads.DetailsOverlayAdView b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i33 = i6;
                com.truecaller.details_view.ui.ads.DetailsOverlayAdView detailsOverlayAdView = this.b;
                switch (i33) {
                    case 0:
                        int i43 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131362202);
                    case 1:
                        int i53 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131365624);
                    case 2:
                        int i63 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131362553);
                    case 3:
                        int i7 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return (android.widget.TextView) detailsOverlayAdView.findViewById(2131367199);
                    default:
                        int i8 = com.truecaller.details_view.ui.ads.DetailsOverlayAdView.m;
                        return detailsOverlayAdView.findViewById(2131365848);
                }
            }
        });
        android.view.LayoutInflater.from(context).inflate(2131559925, (android.view.ViewGroup) this, true);
        getBtnClose().setOnClickListener(new lb1.b(this, 9));
        gj.m.f0(this);
        getProgressBar().setPivotX(0.0f);
    }

    public /* synthetic */ DetailsOverlayAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
