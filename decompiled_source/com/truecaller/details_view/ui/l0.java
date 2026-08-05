package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class l0 implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.details_view.ui.DetailsViewActivityLegacy b;

    public /* synthetic */ l0(com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy, int i) {
        this.a = i;
        this.b = detailsViewActivityLegacy;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.a;
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.b;
        switch (i) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                int i2 = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
                qc3.bar barVar = detailsViewActivityLegacy.z0;
                if (barVar != null) {
                    java.lang.Object obj2 = barVar.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                    os0.bar.F((pv0.bar) obj2, str);
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("limitCallSystemDialogEvaluator");
                throw null;
            default:
                d.y yVar = (d.y) obj;
                int i3 = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yVar, "$this$addCallback");
                ea1.bar barVar2 = detailsViewActivityLegacy.C0;
                if (barVar2 != null) {
                    if (barVar2.k.getVisibility() == 0) {
                        ea1.bar barVar3 = detailsViewActivityLegacy.C0;
                        if (barVar3 != null) {
                            if (barVar3.k.getCanClose()) {
                                ea1.bar barVar4 = detailsViewActivityLegacy.C0;
                                if (barVar4 != null) {
                                    com.truecaller.details_view.ui.ads.DetailsOverlayAdView detailsOverlayAdView = barVar4.k;
                                    detailsOverlayAdView.g();
                                    gj.m.f0(detailsOverlayAdView);
                                    detailsViewActivityLegacy.E0(true);
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                    throw null;
                                }
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("binding");
                            throw null;
                        }
                    } else {
                        yVar.f(false);
                        detailsViewActivityLegacy.getOnBackPressedDispatcher().d();
                        yVar.f(true);
                    }
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
        }
    }
}
