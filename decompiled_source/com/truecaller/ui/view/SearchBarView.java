package com.truecaller.ui.view;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SearchBarView extends androidx.cardview.widget.CardView implements bd3.qux {
    public static final /* synthetic */ int q = 0;
    public yc3.d a;
    public final boolean c;
    public final d91.n0 d;
    public final z31.baz e;
    public boolean f;
    public qc3.bar g;
    public qc3.bar h;
    public qc3.bar i;
    public qc3.bar j;
    public qc3.bar k;
    public qc3.bar l;
    public kotlin.coroutines.CoroutineContext m;
    public kotlin.coroutines.CoroutineContext n;
    public final kotlin.Lazy o;
    public final com.google.android.material.appbar.MaterialToolbar p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchBarView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @javax.inject.Named("IO")
    public static /* synthetic */ void getIoContext$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lg2.baz getProfileViewModel() {
        return (lg2.baz) this.o.getValue();
    }

    @javax.inject.Named("UI")
    public static /* synthetic */ void getUiContext$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBadgeVisibility(lg2.c cVar) {
        boolean b = kotlin.jvm.internal.Intrinsics.b(cVar, lg2.qux.a);
        d91.n0 n0Var = this.d;
        if (b) {
            android.widget.ImageView imageView = (android.widget.ImageView) n0Var.b;
            android.widget.ImageView imageView2 = (android.widget.ImageView) n0Var.b;
            imageView.setImageResource(2131233134);
            imageView2.setVisibility(0);
            ((android.widget.ImageView) n0Var.e).setVisibility(8);
            if (!this.f) {
                u03.c cVar2 = (u03.c) ((u03.b) getDeviceInfoUtil().get());
                cVar2.getClass();
                android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
                java.lang.Object systemService = cVar2.a.getSystemService("activity");
                kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                ((android.app.ActivityManager) systemService).getMemoryInfo(memoryInfo);
                if (memoryInfo.availMem / 1048576 >= 512) {
                    imageView2.setScaleX(1.2f);
                    imageView2.setScaleY(1.2f);
                    imageView2.animate().scaleX(0.7f).scaleY(0.7f).translationX(32.0f).translationY(-18.0f).setStartDelay(com.unity3d.services.core.di.ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT).setDuration(500L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                    this.f = true;
                    return;
                }
            }
            imageView2.setScaleX(0.7f);
            imageView2.setScaleY(0.7f);
            imageView2.setTranslationX(32.0f);
            imageView2.setTranslationY(-18.0f);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.b(cVar, lg2.a.a)) {
            ((android.widget.ImageView) n0Var.b).setVisibility(8);
            ((android.widget.ImageView) n0Var.e).setVisibility(0);
        } else {
            if (kotlin.jvm.internal.Intrinsics.b(cVar, lg2.b.a)) {
                ((android.widget.ImageView) n0Var.b).setVisibility(8);
                ((android.widget.ImageView) n0Var.e).setVisibility(8);
                return;
            }
            throw new java.lang.RuntimeException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bd3.baz
    public final java.lang.Object X3() {
        if (this.a == null) {
            this.a = new yc3.d((android.view.View) this);
        }
        return this.a.X3();
    }

    @org.jetbrains.annotations.NotNull
    public final qc3.bar getAnalytics() {
        qc3.bar barVar = this.j;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("analytics");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final qc3.bar getCoreSettings() {
        qc3.bar barVar = this.l;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("coreSettings");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final qc3.bar getDeviceInfoUtil() {
        qc3.bar barVar = this.i;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("deviceInfoUtil");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.CoroutineContext getIoContext() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.m;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        kotlin.jvm.internal.Intrinsics.n("ioContext");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final qc3.bar getMessagingFeaturesInventory() {
        qc3.bar barVar = this.g;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("messagingFeaturesInventory");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final qc3.bar getPremiumSubscriptionProblemHelper() {
        qc3.bar barVar = this.k;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("premiumSubscriptionProblemHelper");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final qc3.bar getProfileRepository() {
        qc3.bar barVar = this.h;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("profileRepository");
        throw null;
    }

    @org.jetbrains.annotations.NotNull
    public final com.google.android.material.appbar.MaterialToolbar getToolbar() {
        return this.p;
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.CoroutineContext getUiContext() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.n;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        kotlin.jvm.internal.Intrinsics.n("uiContext");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.widget.FrameLayout*/.onAttachedToWindow();
        int i = 0;
        getProfileViewModel().h.e(gj.m.a0(this), new az1.qux(new qy2.e(1, this, com.truecaller.ui.view.SearchBarView.class, "loadAvatarImage", "loadAvatarImage(Lcom/truecaller/profile/ProfileAvatarUi;)V", i, 0)));
        getProfileViewModel().j.e(gj.m.a0(this), new az1.qux(new qy2.e(1, this, com.truecaller.ui.view.SearchBarView.class, "setBadgeVisibility", "setBadgeVisibility(Lcom/truecaller/profile/RewardsProgramBadgeUi;)V", i, 1)));
        gj.m.Y(this, new nm1.i2(this, (df3.bar) null, 28));
    }

    public final void setAnalytics(@org.jetbrains.annotations.NotNull qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.j = barVar;
    }

    public final void setAvatarClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onClick");
        d91.n0 n0Var = this.d;
        ((android.widget.ImageView) n0Var.d).setOnClickListener(new be2.bar(14, function0));
        ((android.widget.ImageView) n0Var.f).setOnClickListener(new be2.bar(15, function0));
    }

    public final void setBadgeCount(int i) {
        this.e.a(i);
    }

    public final void setCoreSettings(@org.jetbrains.annotations.NotNull qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.l = barVar;
    }

    public final void setDeviceInfoUtil(@org.jetbrains.annotations.NotNull qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.i = barVar;
    }

    public final void setIoContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "<set-?>");
        this.m = coroutineContext;
    }

    public final void setMessagingFeaturesInventory(@org.jetbrains.annotations.NotNull qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.g = barVar;
    }

    public final void setPremiumSubscriptionProblemHelper(@org.jetbrains.annotations.NotNull qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.k = barVar;
    }

    public final void setProfileRepository(@org.jetbrains.annotations.NotNull qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.h = barVar;
    }

    public final void setToolbarClickListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onClick");
        this.p.setOnClickListener(new be2.bar(13, function0));
    }

    public final void setUiContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "<set-?>");
        this.n = coroutineContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchBarView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.c) {
            this.c = true;
            tx.w wVar = ((qy2.f) X3()).c;
            this.g = cd3.baz.a(wVar.v0);
            this.h = cd3.baz.a(wVar.q4);
            this.i = cd3.baz.a(wVar.O);
            this.j = cd3.baz.a(wVar.Y);
            this.k = cd3.baz.a(wVar.Om);
            this.l = cd3.baz.a(wVar.q1);
            this.m = (kotlin.coroutines.CoroutineContext) wVar.P.get();
            this.n = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
        }
        android.view.LayoutInflater.from(context).inflate(2131560892, (android.view.ViewGroup) this);
        int i2 = 2131362251;
        android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131362251, this);
        if (imageView != null) {
            i2 = 2131362381;
            android.widget.ImageView imageView2 = (android.widget.ImageView) df0.qux.o(2131362381, this);
            if (imageView2 != null) {
                i2 = 2131362410;
                android.widget.ImageView imageView3 = (android.widget.ImageView) df0.qux.o(2131362410, this);
                if (imageView3 != null) {
                    i2 = 2131364736;
                    android.widget.ImageView imageView4 = (android.widget.ImageView) df0.qux.o(2131364736, this);
                    if (imageView4 != null) {
                        i2 = 2131365051;
                        com.google.android.material.appbar.MaterialToolbar o = df0.qux.o(2131365051, this);
                        if (o != null) {
                            i2 = 2131366266;
                            if (((android.widget.TextView) df0.qux.o(2131366266, this)) != null) {
                                d91.n0 n0Var = new d91.n0(this, imageView, imageView2, imageView3, imageView4, o);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n0Var, "inflate(...)");
                                this.d = n0Var;
                                int i3 = z31.baz.g;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                                z31.baz bazVar = new z31.baz(context, 6078);
                                this.e = bazVar;
                                this.o = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 2));
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(o, "mainHeaderView");
                                this.p = o;
                                imageView3.setImageDrawable(bazVar);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ SearchBarView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
