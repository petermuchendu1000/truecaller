package com.truecaller.gov_services.ui.main.view;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RegionSelectionView extends bb1.bar {
    public static final /* synthetic */ kotlin.reflect.KProperty[] B = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("scope", 0, "getScope()Lkotlinx/coroutines/CoroutineScope;", com.truecaller.gov_services.ui.main.view.RegionSelectionView.class))};
    public kotlin.jvm.functions.Function1 A;
    public kotlin.coroutines.CoroutineContext v;
    public final kotlin.Lazy w;
    public final wm0.bar x;
    public final d41.a y;
    public final u03.g0 z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RegionSelectionView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final fg3.e0 getScope() {
        return this.x.B(this, B[0]);
    }

    @javax.inject.Named("UI")
    public static /* synthetic */ void getUiContext$gov_services_googlePlayRelease$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mq1.bar getViewModel() {
        return (mq1.bar) this.w.getValue();
    }

    public final void G(boolean z) {
        mq1.bar viewModel = getViewModel();
        if (viewModel.c.a()) {
            viewModel.f.cancel((java.util.concurrent.CancellationException) null);
            viewModel.f = fg3.h0.J(androidx.lifecycle.g1.l(viewModel), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new b63.b(1, viewModel, (df3.bar) null, z, false), 3);
        }
    }

    public final void H() {
        mq1.bar viewModel = getViewModel();
        viewModel.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(viewModel), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new lo1.bar(viewModel, (df3.bar) null, 15), 3);
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<com.google.android.gms.common.api.ResolvableApiException, kotlin.Unit> getOnLocationErrorCallback() {
        return this.A;
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.CoroutineContext getUiContext$gov_services_googlePlayRelease() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.v;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        kotlin.jvm.internal.Intrinsics.n("uiContext");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        setBackgroundResource(2131231270);
        if (isInEditMode()) {
            return;
        }
        ig3.w1.F(new androidx.room.o(25, getViewModel().h, new l40.a(this, (df3.bar) null, 16)), getScope());
    }

    public final void setOnLocationErrorCallback(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.google.android.gms.common.api.ResolvableApiException, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.A = function1;
    }

    public final void setUiContext$gov_services_googlePlayRelease(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "<set-?>");
        this.v = coroutineContext;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RegionSelectionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RegionSelectionView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.w = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 24));
        kotlin.coroutines.CoroutineContext uiContext$gov_services_googlePlayRelease = getUiContext$gov_services_googlePlayRelease();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiContext$gov_services_googlePlayRelease, "uiContext");
        this.x = new wm0.bar(uiContext$gov_services_googlePlayRelease);
        this.z = new u03.g0(context);
        this.A = new m1.q2(21);
        if (isInEditMode()) {
            gj.m.z(this, 2131561095, true);
            return;
        }
        android.view.LayoutInflater.from(context).inflate(2131561095, (android.view.ViewGroup) this);
        int i2 = 2131362434;
        if (df0.qux.o(2131362434, this) != null) {
            i2 = 2131364320;
            com.google.android.material.progressindicator.CircularProgressIndicator o = df0.qux.o(2131364320, this);
            if (o != null) {
                i2 = 2131365017;
                if (df0.qux.o(2131365017, this) != null) {
                    i2 = 2131365018;
                    androidx.appcompat.widget.AppCompatTextView o2 = df0.qux.o(2131365018, this);
                    if (o2 != null) {
                        i2 = 2131367330;
                        androidx.appcompat.widget.AppCompatTextView o3 = df0.qux.o(2131367330, this);
                        if (o3 != null) {
                            d41.a aVar = new d41.a(this, o, o2, o3, 13);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                            this.y = aVar;
                            return;
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
    }

    public /* synthetic */ RegionSelectionView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
