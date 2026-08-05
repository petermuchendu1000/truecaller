package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class z extends o00.n {
    public final /* synthetic */ com.truecaller.details_view.ui.i0 a;
    public final /* synthetic */ com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig b;
    public final /* synthetic */ kotlin.jvm.functions.Function0 c;

    public z(com.truecaller.details_view.ui.i0 i0Var, com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig detailsOverlayAdConfig, kotlin.jvm.functions.Function0 function0) {
        this.a = i0Var;
        this.b = detailsOverlayAdConfig;
        this.c = function0;
    }

    public final void Q0(int i) {
        this.c.invoke();
    }

    public final void n(h10.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ad");
        com.truecaller.details_view.ui.u uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) this.a).a;
        kotlin.jvm.functions.Function0 function0 = this.c;
        if (uVar != null) {
            ((com.truecaller.details_view.ui.x0) uVar).f(bVar, this.b, function0);
        } else {
            function0.invoke();
        }
    }

    public final void x(z00.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "errorAdRouter");
        this.c.invoke();
    }
}
