package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class k0 implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.details_view.ui.DetailsViewActivityLegacy b;

    public /* synthetic */ k0(com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy, int i) {
        this.a = i;
        this.b = detailsViewActivityLegacy;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z;
        boolean z2;
        int i = this.a;
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                v2.n nVar = (v2.n) obj;
                int intValue = ((java.lang.Integer) obj2).intValue();
                int i3 = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (nVar.P(intValue & 1, z)) {
                    yp.d0.o(false, d3.a.d(-2618494, new com.truecaller.details_view.ui.k0(detailsViewActivityLegacy, i2), nVar), nVar, 48, 1);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
            default:
                v2.n nVar2 = (v2.n) obj;
                int intValue2 = ((java.lang.Integer) obj2).intValue();
                int i4 = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (nVar2.P(intValue2 & 1, z2)) {
                    boolean h = nVar2.h(detailsViewActivityLegacy);
                    java.lang.Object M = nVar2.M();
                    if (h || M == v2.k.a) {
                        M = new com.truecaller.details_view.ui.l0(detailsViewActivityLegacy, 0);
                        nVar2.k0(M);
                    }
                    je0.d.f((pv0.f) null, (kotlin.jvm.functions.Function0) null, (kotlin.jvm.functions.Function1) M, nVar2, 0, 3);
                } else {
                    nVar2.S();
                }
                return kotlin.Unit.a;
        }
    }
}
