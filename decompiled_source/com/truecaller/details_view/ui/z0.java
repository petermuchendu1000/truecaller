package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class z0 implements android.view.ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ com.truecaller.details_view.ui.DetailsViewActivityLegacy a;

    public z0(com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy) {
        this.a = detailsViewActivityLegacy;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        lb1.c y0;
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.a;
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
                barVar2.B.getViewTreeObserver().removeOnScrollChangedListener(this);
            } else {
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
            }
        }
    }
}
