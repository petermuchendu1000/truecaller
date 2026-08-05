package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class e0 extends o00.n {
    public final /* synthetic */ com.truecaller.details_view.ui.i0 a;
    public final /* synthetic */ com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig b;

    public e0(com.truecaller.details_view.ui.i0 i0Var, com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig detailsOverlayAdConfig) {
        this.a = i0Var;
        this.b = detailsOverlayAdConfig;
    }

    public final void n(h10.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ad");
        com.truecaller.details_view.ui.u uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this.a).a;
        if (uVar != null) {
            ((com.truecaller.details_view.ui.x0) uVar).f(bVar, this.b, null);
        }
    }
}
