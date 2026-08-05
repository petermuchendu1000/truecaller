package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class c0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.truecaller.details_view.ui.i0 A;
    public final /* synthetic */ int x;
    public com.truecaller.details_view.ui.u y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(com.truecaller.details_view.ui.i0 i0Var, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.A = i0Var;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.details_view.ui.c0(this.A, barVar, 0);
            case 1:
                return new com.truecaller.details_view.ui.c0(this.A, barVar, 1);
            default:
                return new com.truecaller.details_view.ui.c0(this.A, barVar, 2);
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
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [android.content.Context, java.lang.Object, com.truecaller.details_view.ui.DetailsViewActivityLegacy] */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.truecaller.details_view.ui.u uVar;
        com.truecaller.details_view.ui.u uVar2;
        com.truecaller.details_view.ui.u uVar3;
        switch (this.x) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i = this.z;
                if (i != 0) {
                    if (i == 1) {
                        uVar = this.y;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.details_view.ui.i0 i0Var = this.A;
                    com.truecaller.details_view.ui.u uVar4 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                    if (uVar4 != null) {
                        y61.baz bazVar = (y61.baz) i0Var.L.get();
                        com.truecaller.details_view.ui.d1 d1Var = i0Var.d0;
                        if (d1Var != null) {
                            com.truecaller.data.entity.Contact contact = d1Var.a;
                            this.y = uVar4;
                            this.z = 1;
                            obj = ((c71.h) bazVar).c(contact, this);
                            if (obj != barVar) {
                                uVar = uVar4;
                            } else {
                                return barVar;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                            throw null;
                        }
                    }
                    return kotlin.Unit.a;
                }
                ((com.truecaller.details_view.ui.x0) uVar).c((com.truecaller.contacteditor.api.model.ContactExtras) obj);
                return kotlin.Unit.a;
            case 1:
                ef3.bar barVar2 = ef3.bar.a;
                int i2 = this.z;
                com.truecaller.details_view.ui.i0 i0Var2 = this.A;
                if (i2 != 0) {
                    if (i2 == 1) {
                        uVar2 = this.y;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.details_view.ui.u uVar5 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var2).a;
                    if (uVar5 != null) {
                        f43.baz bazVar2 = i0Var2.g;
                        com.truecaller.details_view.ui.d1 d1Var2 = i0Var2.d0;
                        if (d1Var2 != null) {
                            com.truecaller.data.entity.Contact contact2 = d1Var2.a;
                            this.y = uVar5;
                            this.z = 1;
                            java.lang.Object K = bazVar2.K(contact2, this);
                            if (K != barVar2) {
                                uVar2 = uVar5;
                                obj = K;
                            } else {
                                return barVar2;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                            throw null;
                        }
                    }
                    return kotlin.Unit.a;
                }
                q81.baz bazVar3 = (q81.baz) obj;
                com.truecaller.details_view.ui.d1 d1Var3 = i0Var2.d0;
                if (d1Var3 != null) {
                    boolean Q = d1Var3.a.Q();
                    com.truecaller.details_view.ui.x0 x0Var = (com.truecaller.details_view.ui.x0) uVar2;
                    x0Var.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar3, "action");
                    android.content.Intent intent = bazVar3.b;
                    intent.setFlags(268435456);
                    ?? r0 = x0Var.b;
                    kotlin.jvm.functions.Function0 aVar = new by2.a(17, (java.lang.Object) r0, intent);
                    e70.k u0 = r0.u0();
                    java.lang.String str = bazVar3.c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "packageName");
                    if (u0.n("C2W_OOP", str, Q, false)) {
                        e70.k u03 = r0.u0();
                        android.app.Activity O = ye0.k.O((android.content.Context) r0);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "packageName");
                        u03.k(O, "C2W_OOP", str, new by2.a(18, (java.lang.Object) r0, aVar));
                    } else {
                        ((com.truecaller.details_view.ui.i0) r0.B0()).j2(aVar);
                    }
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                throw null;
            default:
                ef3.bar barVar3 = ef3.bar.a;
                int i3 = this.z;
                if (i3 != 0) {
                    if (i3 == 1) {
                        uVar3 = this.y;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.details_view.ui.i0 i0Var3 = this.A;
                    com.truecaller.details_view.ui.u uVar6 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var3).a;
                    if (uVar6 != null) {
                        y61.baz bazVar4 = (y61.baz) i0Var3.L.get();
                        com.truecaller.details_view.ui.d1 d1Var4 = i0Var3.d0;
                        if (d1Var4 != null) {
                            com.truecaller.data.entity.Contact contact3 = d1Var4.a;
                            this.y = uVar6;
                            this.z = 1;
                            obj = ((c71.h) bazVar4).c(contact3, this);
                            if (obj != barVar3) {
                                uVar3 = uVar6;
                            } else {
                                return barVar3;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                            throw null;
                        }
                    }
                    return kotlin.Unit.a;
                }
                ((com.truecaller.details_view.ui.x0) uVar3).c((com.truecaller.contacteditor.api.model.ContactExtras) obj);
                return kotlin.Unit.a;
        }
    }
}
