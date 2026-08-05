package com.truecaller.verifiedcampaign.uicomponents.composables;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class VerifiedCampaignsCarouselViewGroup extends android.widget.FrameLayout {
    public static final /* synthetic */ int j = 0;
    public kotlin.jvm.functions.Function0 a;
    public kotlin.jvm.functions.Function0 b;
    public final androidx.lifecycle.t1 c;
    public q13.bar d;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p e;
    public androidx.lifecycle.t f;
    public final y10.qux g;
    public final kotlin.Lazy h;
    public final kotlin.Lazy i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerifiedCampaignsCarouselViewGroup(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public static kotlin.Unit a(final com.truecaller.verifiedcampaign.uicomponents.composables.VerifiedCampaignsCarouselViewGroup verifiedCampaignsCarouselViewGroup, v2.n nVar, int i) {
        boolean z;
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i & 1, z)) {
            y13.e viewModel = verifiedCampaignsCarouselViewGroup.getViewModel();
            boolean h = nVar.h(verifiedCampaignsCarouselViewGroup);
            java.lang.Object M = nVar.M();
            v2.c cVar = v2.k.a;
            java.lang.Object obj = M;
            if (h || M == cVar) {
                final int i2 = 0;
                kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0(verifiedCampaignsCarouselViewGroup) { // from class: z13.k
                    public final /* synthetic */ com.truecaller.verifiedcampaign.uicomponents.composables.VerifiedCampaignsCarouselViewGroup b;

                    {
                        this.b = verifiedCampaignsCarouselViewGroup;
                    }

                    public final java.lang.Object invoke() {
                        switch (i2) {
                            case 0:
                                kotlin.jvm.functions.Function0 function02 = this.b.a;
                                if (function02 != null) {
                                    function02.invoke();
                                }
                                return kotlin.Unit.a;
                            default:
                                kotlin.jvm.functions.Function0 function03 = this.b.b;
                                if (function03 != null) {
                                    function03.invoke();
                                }
                                return kotlin.Unit.a;
                        }
                    }
                };
                nVar.k0(function0);
                obj = function0;
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) obj;
            boolean h2 = nVar.h(verifiedCampaignsCarouselViewGroup);
            java.lang.Object M2 = nVar.M();
            java.lang.Object obj2 = M2;
            if (h2 || M2 == cVar) {
                final int i3 = 1;
                kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0(verifiedCampaignsCarouselViewGroup) { // from class: z13.k
                    public final /* synthetic */ com.truecaller.verifiedcampaign.uicomponents.composables.VerifiedCampaignsCarouselViewGroup b;

                    {
                        this.b = verifiedCampaignsCarouselViewGroup;
                    }

                    public final java.lang.Object invoke() {
                        switch (i3) {
                            case 0:
                                kotlin.jvm.functions.Function0 function022 = this.b.a;
                                if (function022 != null) {
                                    function022.invoke();
                                }
                                return kotlin.Unit.a;
                            default:
                                kotlin.jvm.functions.Function0 function032 = this.b.b;
                                if (function032 != null) {
                                    function032.invoke();
                                }
                                return kotlin.Unit.a;
                        }
                    }
                };
                nVar.k0(function03);
                obj2 = function03;
            }
            fj.a.c((q13.bar) null, (j3.q) null, function02, (kotlin.jvm.functions.Function0) obj2, viewModel, nVar, 0, 3);
        } else {
            nVar.S();
        }
        return kotlin.Unit.a;
    }

    public static void c(com.truecaller.verifiedcampaign.uicomponents.composables.VerifiedCampaignsCarouselViewGroup verifiedCampaignsCarouselViewGroup, com.truecaller.verifiedcampaign.api.VerifiedCampaignDisplayType verifiedCampaignDisplayType, java.lang.String str, boolean z, boolean z2, java.lang.String str2, int i) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        if ((i & 16) != 0) {
            str2 = null;
        }
        verifiedCampaignsCarouselViewGroup.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifiedCampaignDisplayType, "screenName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "businessNumber");
        verifiedCampaignsCarouselViewGroup.d = new q13.bar(verifiedCampaignDisplayType, str, z, z3, false, str2, 16);
        verifiedCampaignsCarouselViewGroup.getViewModel().r(verifiedCampaignsCarouselViewGroup.d);
    }

    private final androidx.compose.ui.platform.ComposeView getComposeView() {
        return (androidx.compose.ui.platform.ComposeView) this.i.getValue();
    }

    private final y13.e getViewModel() {
        return (y13.e) this.h.getValue();
    }

    public final void b() {
        getViewModel().r(this.d);
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnCampaignDeeplinkOpened() {
        return this.b;
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNoCampaignsFound() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.t lifecycle;
        androidx.lifecycle.t tVar;
        super.onAttachedToWindow();
        if (getComposeView().getParent() == null) {
            addView((android.view.View) getComposeView(), (android.view.ViewGroup.LayoutParams) new android.widget.FrameLayout.LayoutParams(-1, -2));
        }
        androidx.lifecycle.d0 g = androidx.lifecycle.g1.g(this);
        if (g != null && (lifecycle = g.getLifecycle()) != null && lifecycle != (tVar = this.f)) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p pVar = this.e;
            if (pVar != null && tVar != null) {
                tVar.c(pVar);
            }
            this.f = lifecycle;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p pVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p(this, 11);
            this.e = pVar2;
            lifecycle.a(pVar2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void setOnCampaignDeeplinkOpened(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.b = function0;
    }

    public final void setOnNoCampaignsFound(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.a = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerifiedCampaignsCarouselViewGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifiedCampaignsCarouselViewGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        setTag("VERIFIED_CAROUSEL_TAG");
        this.c = new androidx.lifecycle.t1();
        this.g = new y10.qux(this, 1);
        this.h = kotlin.LazyKt.lazy(new z13.i(this, context));
        this.i = kotlin.LazyKt.lazy(new z13.i(context, this));
    }

    public /* synthetic */ VerifiedCampaignsCarouselViewGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
