package com.truecaller.editprofile.impl.ui.legacy;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class l extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.editprofile.impl.ui.legacy.s z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.truecaller.editprofile.impl.ui.legacy.s sVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = sVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.editprofile.impl.ui.legacy.l(this.z, barVar, 0);
            case 1:
                return new com.truecaller.editprofile.impl.ui.legacy.l(this.z, barVar, 1);
            case 2:
                return new com.truecaller.editprofile.impl.ui.legacy.l(this.z, barVar, 2);
            case 3:
                return new com.truecaller.editprofile.impl.ui.legacy.l(this.z, barVar, 3);
            case 4:
                return new com.truecaller.editprofile.impl.ui.legacy.l(this.z, barVar, 4);
            default:
                return new com.truecaller.editprofile.impl.ui.legacy.l(this.z, barVar, 5);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 2:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 3:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 4:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        java.lang.Object obj2 = null;
        com.truecaller.editprofile.impl.ui.legacy.s sVar = this.z;
        switch (i) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.google.firebase.messaging.o oVar = sVar.k;
                    this.y = 1;
                    if (((n11.l) oVar.b).i() == null) {
                        obj = java.lang.Boolean.FALSE;
                    } else {
                        obj = fg3.h0.W((kotlin.coroutines.CoroutineContext) oVar.c, new bh1.bar(oVar, null, 1), this);
                    }
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.editprofile.impl.ui.legacy.s.D;
                    sVar.n2();
                    sVar.y2();
                }
                return kotlin.Unit.a;
            case 1:
                ef3.bar barVar2 = ef3.bar.a;
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    qx2.d3 h = qx2.hg.h();
                    h.m("ChangeVerifiedNamePopup");
                    h.l("ConfirmChangeName");
                    qx2.hg h2 = h.h();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "build(...)");
                    j71.g.K(h2, sVar.r);
                    rg2.m mVar = sVar.e;
                    this.y = 1;
                    obj = mVar.q("", this);
                    if (obj == barVar2) {
                        return barVar2;
                    }
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    com.truecaller.editprofile.impl.ui.legacy.s.e2(sVar, null);
                } else {
                    kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.editprofile.impl.ui.legacy.s.D;
                    com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                    if (hVar != null) {
                        java.lang.String h3 = sVar.g.h(2132020747, new java.lang.Object[0]);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h3, "getString(...)");
                        ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).s6(h3);
                    }
                }
                return kotlin.Unit.a;
            case 2:
                ef3.bar barVar3 = ef3.bar.a;
                int i4 = this.y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    xg2.a aVar = sVar.n;
                    this.y = 1;
                    xg2.a aVar2 = aVar;
                    java.lang.Object W = fg3.h0.W(aVar2.b, new xg2.baz(aVar2, (df3.bar) null, 0), this);
                    if (W != barVar3) {
                        W = kotlin.Unit.a;
                    }
                    if (W == barVar3) {
                        return barVar3;
                    }
                }
                return kotlin.Unit.a;
            case 3:
                kotlin.Unit unit = ef3.bar.a;
                int i5 = this.y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.google.firebase.messaging.o oVar2 = sVar.k;
                    this.y = 1;
                    if (oVar2.V() == unit) {
                        return unit;
                    }
                }
                kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.editprofile.impl.ui.legacy.s.D;
                sVar.y2();
                return kotlin.Unit.a;
            case 4:
                ef3.bar barVar4 = ef3.bar.a;
                int i6 = this.y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    rg2.m mVar2 = sVar.e;
                    this.y = 1;
                    obj = ((vg2.bar) mVar2.b.get()).c(this);
                    if (obj == barVar4) {
                        return barVar4;
                    }
                }
                if (!((java.util.List) obj).isEmpty()) {
                    obj2 = obj;
                }
                java.util.List list = (java.util.List) obj2;
                if (list != null) {
                    sVar.C = true;
                    com.truecaller.editprofile.impl.ui.legacy.h hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                    if (hVar2 != null) {
                        ((com.truecaller.editprofile.impl.ui.legacy.d) hVar2).r6(sVar.o.e(list));
                    }
                    com.truecaller.editprofile.impl.ui.legacy.h hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                    if (hVar3 != null) {
                        java.lang.String h4 = sVar.g.h(2132020775, new java.lang.Object[0]);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h4, "getString(...)");
                        com.truecaller.editprofile.impl.ui.legacy.d dVar = (com.truecaller.editprofile.impl.ui.legacy.d) hVar3;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h4, "text");
                        dVar.p6(h4, dVar.h0);
                    }
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar5 = ef3.bar.a;
                int i7 = this.y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.editprofile.impl.ui.legacy.s.D;
                    com.truecaller.editprofile.impl.ui.legacy.h hVar4 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                    if (hVar4 != null) {
                        android.view.View view = (android.view.View) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar4).e0.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "<get-savingLoadingLayer>(...)");
                        gj.m.j0(view);
                    }
                    rg2.m mVar3 = sVar.e;
                    this.y = 1;
                    if (mVar3.i(this) == barVar5) {
                        return barVar5;
                    }
                }
                kotlin.reflect.KProperty[] kPropertyArr5 = com.truecaller.editprofile.impl.ui.legacy.s.D;
                sVar.z2();
                com.truecaller.editprofile.impl.ui.legacy.h hVar5 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar5 != null) {
                    android.view.View view2 = (android.view.View) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar5).e0.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view2, "<get-savingLoadingLayer>(...)");
                    gj.m.f0(view2);
                }
                return kotlin.Unit.a;
        }
    }
}
