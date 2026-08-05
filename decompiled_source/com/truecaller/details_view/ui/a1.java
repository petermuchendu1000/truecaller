package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class a1 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.details_view.ui.DetailsViewActivityLegacy z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = detailsViewActivityLegacy;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.details_view.ui.a1(this.z, barVar, 0);
            default:
                return new com.truecaller.details_view.ui.a1(this.z, barVar, 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.x) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    oc1.bar barVar2 = this.z.B0;
                    if (barVar2 != null) {
                        this.y = 1;
                        java.lang.Object z = ig3.w1.z(((jd1.bar) barVar2).c, this);
                        if (z != barVar) {
                            z = kotlin.Unit.a;
                        }
                        if (z == barVar) {
                            return barVar;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewTTFDTracker");
                        throw null;
                    }
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar3 = ef3.bar.a;
                int i2 = this.y;
                com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.z;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.details_view.ui.a1 a1Var = new com.truecaller.details_view.ui.a1(detailsViewActivityLegacy, null, 0);
                    this.y = 1;
                    obj = fg3.h0.Y(10000L, a1Var, this);
                    if (obj == barVar3) {
                        return barVar3;
                    }
                }
                if (((kotlin.Unit) obj) == null) {
                    o82.a.D("[DetailsViewActivityLegacy]: TTFD performance timeout");
                }
                detailsViewActivityLegacy.reportFullyDrawn();
                return kotlin.Unit.a;
        }
    }
}
