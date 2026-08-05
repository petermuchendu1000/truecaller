package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class y0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ y0(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        lb1.c y0;
        int i = this.a;
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = this.b;
        switch (i) {
            case 0:
                com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = (com.truecaller.details_view.ui.DetailsViewActivityLegacy) obj2;
                if (com.truecaller.details_view.ui.DetailsViewActivityLegacy.t0(detailsViewActivityLegacy)) {
                    cl0.bar barVar = (cl0.bar) ((com.truecaller.details_view.ui.i0) detailsViewActivityLegacy.B0()).Q.get();
                    barVar.getClass();
                    hi3.e eVar = new hi3.e(qx2.y2.e, qx2.y2.f);
                    bi3.j0[] j0VarArr = eVar.b;
                    bi3.j0 j0Var = j0VarArr[2];
                    ((qx2.p) eVar).e = "DetailsViewV2";
                    boolean[] zArr = eVar.c;
                    zArr[2] = true;
                    bi3.j0 j0Var2 = j0VarArr[3];
                    ((qx2.p) eVar).f = "CallAndRecord";
                    zArr[3] = true;
                    qx2.y2 f = eVar.f();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "build(...)");
                    j71.g.K(f, barVar.a);
                    g.baz bazVar = detailsViewActivityLegacy.N0;
                    if (bazVar != null && (y0 = detailsViewActivityLegacy.y0()) != null) {
                        y0.setPaywallResultLauncher(bazVar);
                    }
                    ea1.bar barVar2 = detailsViewActivityLegacy.C0;
                    if (barVar2 != null) {
                        barVar2.B.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        ea1.bar barVar3 = detailsViewActivityLegacy.C0;
                        if (barVar3 != null) {
                            barVar3.B.getViewTreeObserver().removeOnScrollChangedListener((com.truecaller.details_view.ui.z0) obj);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("binding");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
                return;
            case 1:
                ((d91.e) obj2).r.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int i2 = com.truecaller.ui.TruecallerInit.y1;
                ((com.truecaller.ui.TruecallerInit) obj).D0();
                return;
            default:
                ((android.view.View) obj2).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                qj0.o oVar = (qj0.o) obj;
                p22.b bVar = qj0.o.r;
                int height = oVar.X5().c.getHeight();
                int top = oVar.X5().t.getTop();
                vq.qux dialog = oVar.getDialog();
                kotlin.jvm.internal.Intrinsics.e(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                dialog.g().M(height + top);
                return;
        }
    }
}
