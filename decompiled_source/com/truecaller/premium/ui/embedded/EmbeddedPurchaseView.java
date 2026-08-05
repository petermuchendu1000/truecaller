package com.truecaller.premium.ui.embedded;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EmbeddedPurchaseView extends android.widget.LinearLayout implements pe2.bar, androidx.lifecycle.d {
    public static final /* synthetic */ int i = 0;
    public final pe2.h a;
    public pe2.j b;
    public com.truecaller.premium.data.PremiumForcedTheme c;
    public final java.lang.String d;
    public final int e;
    public final int f;
    public kotlin.jvm.functions.Function0 g;
    public boolean h;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/premium/ui/embedded/EmbeddedPurchaseView$bar;", "", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface bar {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbeddedPurchaseView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static android.view.View b(com.truecaller.premium.ui.embedded.EmbeddedPurchaseView embeddedPurchaseView, int i2, boolean z) {
        int i3;
        android.view.ContextThemeWrapper v;
        com.truecaller.premium.data.PremiumForcedTheme premiumForcedTheme = embeddedPurchaseView.c;
        if (premiumForcedTheme == null) {
            i3 = -1;
        } else {
            i3 = pe2.i.a[premiumForcedTheme.ordinal()];
        }
        if (i3 != -1) {
            if (i3 != 1) {
                if (i3 == 2) {
                    android.content.Context context = embeddedPurchaseView.getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
                    v = new android.view.ContextThemeWrapper(context, 2132084053);
                } else {
                    throw new java.lang.RuntimeException();
                }
            } else {
                android.content.Context context2 = embeddedPurchaseView.getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                v = yy.qux.D(context2);
            }
        } else {
            android.content.Context context3 = embeddedPurchaseView.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            v = yy.qux.v(context3, true);
        }
        android.view.View inflate = android.view.LayoutInflater.from(v).inflate(i2, embeddedPurchaseView, z);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    public final android.app.Activity getActivity() {
        for (android.content.Context context = getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
        }
        throw new java.lang.IllegalStateException("Can't find activity");
    }

    @Override // pe2.j
    public final void B2(com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState embeddedPurchaseViewStateListener$EmbeddedPurchaseViewState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddedPurchaseViewStateListener$EmbeddedPurchaseViewState, "state");
        java.util.Objects.toString(embeddedPurchaseViewStateListener$EmbeddedPurchaseViewState);
        pe2.j jVar = this.b;
        if (jVar != null) {
            jVar.B2(embeddedPurchaseViewStateListener$EmbeddedPurchaseViewState);
        }
        switch (pe2.i.b[embeddedPurchaseViewStateListener$EmbeddedPurchaseViewState.ordinal()]) {
            case 1:
            case 2:
                removeAllViews();
                android.widget.ProgressBar progressBar = new android.widget.ProgressBar(getContext());
                progressBar.setIndeterminate(true);
                addView(progressBar);
                return;
            case 3:
            case 4:
            case 5:
                removeAllViews();
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
            case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
            case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                removeAllViews();
                removeAllViews();
                android.widget.TextView textView = (android.widget.TextView) b(this, 2131561037, true).findViewById(2131363811);
                java.lang.String str = this.d;
                if (str == null) {
                    str = textView.getResources().getString(2132018697);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                }
                textView.setText(str);
                textView.setOnClickListener(new op0.baz(this, 22));
                return;
            default:
                return;
        }
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "toggleActiveText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "toggleInActiveText");
        androidx.constraintlayout.widget.ConstraintLayout b = b(this, 2131561122, false);
        kotlin.jvm.internal.Intrinsics.e(b, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = b;
        android.widget.TextView textView = (android.widget.TextView) constraintLayout.findViewById(2131367101);
        com.google.android.material.materialswitch.MaterialSwitch findViewById = constraintLayout.findViewById(2131365834);
        findViewById.setChecked(this.h);
        if (this.h) {
            textView.setText(str);
        } else {
            textView.setText(str2);
        }
        findViewById.setOnCheckedChangeListener(new aq2.r(this, 20));
        addView((android.view.View) constraintLayout, 0);
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        android.view.View b = b(this, 2131561121, false);
        kotlin.jvm.internal.Intrinsics.e(b, "null cannot be cast to non-null type android.widget.Button");
        android.widget.Button button = (android.widget.Button) b;
        if (str != null) {
            button.setText(str);
        }
        mf0.o.F(button, 300L, new pd1.h(1, str2, this));
        addView(button);
    }

    @org.jetbrains.annotations.Nullable
    public final pe2.j getEmbeddedPurchaseViewStateListener() {
        return this.b;
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOpenConfirmationPopupToStopFamilySharingCallback() {
        return this.g;
    }

    public final /* bridge */ void k(androidx.lifecycle.d0 d0Var) {
        bar.d(d0Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.u0(this);
        androidx.lifecycle.t lifecycle = gj.m.a0(this).getLifecycle();
        if (lifecycle != null) {
            lifecycle.a(this);
        }
    }

    public final void onDestroy(androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.m1();
        androidx.lifecycle.t lifecycle = gj.m.a0(this).getLifecycle();
        if (lifecycle != null) {
            lifecycle.c(this);
        }
    }

    public final void onPause(androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
    }

    public final void onResume(androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
        bar.e(d0Var);
        pe2.h hVar = this.a;
        q82.baz bazVar = hVar.n;
        boolean z = bazVar.d;
        bazVar.d = false;
        if (z) {
            hVar.l2(com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState.DISMISS_SCREEN_REQUESTED);
        }
        if (hVar.A != null) {
            cd2.qux quxVar = (cd2.qux) hVar.u.get();
            i82.r rVar = hVar.B;
            if (rVar != null) {
                qc3.bar barVar = quxVar.a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "launchContext");
                if (rVar.equals(quxVar.f) && ((w82.r1) ((w82.q1) barVar.get())).d("isPurchasedFromAbandonedCartInterstitial", false)) {
                    ((w82.r1) ((w82.q1) barVar.get())).k("isPurchasedFromAbandonedCartInterstitial", false);
                    hVar.l2(com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState.DISMISS_SCREEN_REQUESTED);
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("viewLaunchContext");
            throw null;
        }
    }

    public final /* bridge */ void onStart(androidx.lifecycle.d0 d0Var) {
        bar.f(d0Var);
    }

    public final void onStop(androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
    }

    public void setComponentType(@org.jetbrains.annotations.NotNull com.truecaller.premium.data.ConfigComponent configComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configComponent, "configComponent");
        pe2.h hVar = this.a;
        hVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configComponent, "configComponent");
        hVar.E = configComponent;
    }

    public void setEmbeddedCtaConfig(@org.jetbrains.annotations.Nullable com.truecaller.premium.ui.embedded.EmbeddedCtaConfig embeddedCtaConfig) {
        this.a.C = embeddedCtaConfig;
    }

    public final void setEmbeddedPurchaseViewStateListener(@org.jetbrains.annotations.Nullable pe2.j jVar) {
        this.b = jVar;
    }

    public void setEmbeddedToggleConfig(@org.jetbrains.annotations.Nullable pe2.k kVar) {
        this.a.D = kVar;
    }

    public void setForcedTheme(@org.jetbrains.annotations.Nullable com.truecaller.premium.data.PremiumForcedTheme premiumForcedTheme) {
        this.c = premiumForcedTheme;
        this.a.N = premiumForcedTheme;
    }

    public void setLaunchContext(@org.jetbrains.annotations.NotNull i82.r rVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "launchContext");
        pe2.h hVar = this.a;
        hVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "launchContext");
        hVar.B = rVar;
        if (hVar.P == com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState.ERROR_EMPTY_LAUNCH_CONTEXT) {
            hVar.h2();
        }
    }

    public final void setOpenConfirmationPopupToStopFamilySharingCallback(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.g = function0;
    }

    public void setSubscriptionButtonConfig(@org.jetbrains.annotations.Nullable com.truecaller.premium.ui.subscription.buttons.SubscriptionButtonConfigDto subscriptionButtonConfigDto) {
        this.a.A = subscriptionButtonConfigDto;
    }

    public void setSubscriptionPromoMetaData(@org.jetbrains.annotations.Nullable com.truecaller.premium.data.SubscriptionPromoEventMetaData subscriptionPromoEventMetaData) {
        this.a.F = subscriptionPromoEventMetaData;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbeddedPurchaseView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmbeddedPurchaseView(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.e = -1;
        this.f = -1;
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        tx.w wVar = (com.truecaller.premium.ui.embedded.EmbeddedPurchaseView.bar) f40.d0.z(applicationContext, com.truecaller.premium.ui.embedded.EmbeddedPurchaseView.bar.class);
        tx.c0 c0Var = wVar.H.b;
        tx.w wVar2 = c0Var.a;
        tf2.l0 l0Var = (tf2.l0) wVar2.hi.get();
        w82.q1 q1Var = (w82.q1) wVar2.c4.get();
        h92.baz bazVar = (h92.baz) c0Var.D4.get();
        tx.b0 b0Var = (tx.b0) c0Var.E4.get();
        uf2.c cVar = (uf2.c) wVar2.Gm.get();
        i82.v vVar = (i82.v) wVar2.C6.get();
        r31.bar barVar = (r31.bar) wVar2.q1.get();
        jq2.qux quxVar = (jq2.qux) wVar2.M2.get();
        w82.b2 b2Var = (w82.b2) wVar2.Nm.get();
        b92.a aVar = (b92.a) wVar2.aq.get();
        q82.baz bazVar2 = (q82.baz) c0Var.F4.get();
        tf2.w0 w0Var = (tf2.w0) c0Var.G4.get();
        qb2.g gVar = (qb2.g) c0Var.f4.get();
        tf2.z0 z0Var = (tf2.z0) c0Var.H4.get();
        x82.w wVar3 = (x82.w) c0Var.I4.get();
        sb2.bar barVar2 = (sb2.bar) c0Var.J4.get();
        df2.h hVar = (df2.h) c0Var.O4.get();
        qc3.bar a = cd3.baz.a(c0Var.P4);
        qc3.bar a2 = cd3.baz.a(wVar2.e4);
        qc3.bar a3 = cd3.baz.a(wVar2.ti);
        ng3.a aVar2 = fg3.r0.b;
        es.baz.l(aVar2);
        pe2.h hVar2 = new pe2.h(l0Var, q1Var, bazVar, b0Var, cVar, vVar, barVar, quxVar, b2Var, aVar, bazVar2, w0Var, gVar, z0Var, wVar3, barVar2, hVar, a, a2, a3, aVar2, (kotlin.coroutines.CoroutineContext) wVar2.V1.get(), (fg3.e0) wVar2.f0.get());
        gf2.d dVar = new gf2.d(this, 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "activityProvider");
        hVar2.O = hVar2.g.a(dVar);
        this.a = hVar2;
        i82.r rVar = null;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.truecaller.premium.R.styleable.b, 0, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            str = obtainStyledAttributes.getString(1);
            this.d = obtainStyledAttributes.getString(2);
            this.e = obtainStyledAttributes.getColor(0, -1);
            this.f = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
        } else {
            str = null;
        }
        setOrientation(1);
        android.content.res.Resources resources = getResources();
        if (resources != null) {
            int dimensionPixelSize = resources.getDimensionPixelSize(2131166785);
            setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        }
        if (str != null) {
            com.truecaller.premium.PremiumLaunchContext.Static r1 = i82.r.A7;
            if (!kotlin.text.StringsKt.X(str)) {
                com.truecaller.premium.PremiumLaunchContext.Static.Companion.getClass();
                java.util.Iterator it = com.truecaller.premium.PremiumLaunchContext.Static.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (kotlin.text.y.p(((com.truecaller.premium.PremiumLaunchContext.Static) next).name(), str, true)) {
                        rVar = next;
                        break;
                    }
                }
                rVar = (com.truecaller.premium.PremiumLaunchContext.Static) rVar;
                if (rVar == null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
                    rVar = new i82.p(str);
                }
            }
            if (rVar != null) {
                setLaunchContext(rVar);
            } else {
                pe2.j jVar = this.b;
                if (jVar != null) {
                    jVar.B2(com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState.ERROR_EMPTY_LAUNCH_CONTEXT);
                }
            }
        }
        hVar2.G = this;
    }

    public /* synthetic */ EmbeddedPurchaseView(android.content.Context context, android.util.AttributeSet attributeSet, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
