package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class f2 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.ui.TruecallerInit z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(com.truecaller.ui.TruecallerInit truecallerInit, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = truecallerInit;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.ui.f2(this.z, barVar, 0);
            case 1:
                return new com.truecaller.ui.f2(this.z, barVar, 1);
            case 2:
                return new com.truecaller.ui.f2(this.z, barVar, 2);
            case 3:
                return new com.truecaller.ui.f2(this.z, barVar, 3);
            case 4:
                return new com.truecaller.ui.f2(this.z, barVar, 4);
            case 5:
                return new com.truecaller.ui.f2(this.z, barVar, 5);
            case 6:
                return new com.truecaller.ui.f2(this.z, barVar, 6);
            case 7:
                return new com.truecaller.ui.f2(this.z, barVar, 7);
            case 8:
                return new com.truecaller.ui.f2(this.z, barVar, 8);
            case 9:
                return new com.truecaller.ui.f2(this.z, barVar, 9);
            case 10:
                return new com.truecaller.ui.f2(this.z, barVar, 10);
            default:
                return new com.truecaller.ui.f2(this.z, barVar, 11);
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
            case 5:
                create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
                return ef3.bar.a;
            case 6:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 7:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 8:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 9:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 10:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        df3.bar barVar = null;
        com.truecaller.ui.TruecallerInit truecallerInit = this.z;
        switch (i) {
            case 0:
                ef3.bar barVar2 = ef3.bar.a;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (com.truecaller.ui.TruecallerInit.x0(truecallerInit, this) == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
            case 1:
                ef3.bar barVar3 = ef3.bar.a;
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    obj = truecallerInit.X0(this);
                    if (obj == barVar3) {
                        return barVar3;
                    }
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    ig3.h2 h2Var = truecallerInit.n1;
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    h2Var.getClass();
                    h2Var.p((java.lang.Object) null, bool);
                }
                return kotlin.Unit.a;
            case 2:
                ig3.h2 h2Var2 = truecallerInit.n1;
                ef3.bar barVar4 = ef3.bar.a;
                int i4 = this.y;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            od.p.E(obj);
                            if (((java.lang.Boolean) obj).booleanValue() && !((java.lang.Boolean) h2Var2.getValue()).booleanValue()) {
                                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                                h2Var2.getClass();
                                h2Var2.p((java.lang.Object) null, bool2);
                            }
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    obj = truecallerInit.X0(this);
                    if (obj == barVar4) {
                        return barVar4;
                    }
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    this.y = 2;
                    int i5 = com.truecaller.ui.TruecallerInit.y1;
                    qc3.bar barVar5 = truecallerInit.Q0;
                    if (barVar5 != null) {
                        obj = ((pj1.bar) barVar5.get()).h(this);
                        if (obj == barVar4) {
                            return barVar4;
                        }
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            java.lang.Boolean bool22 = java.lang.Boolean.TRUE;
                            h2Var2.getClass();
                            h2Var2.p((java.lang.Object) null, bool22);
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("familyGroupApi");
                        throw null;
                    }
                }
                return kotlin.Unit.a;
            case 3:
                ef3.bar barVar6 = ef3.bar.a;
                int i6 = this.y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    qc3.bar barVar7 = truecallerInit.a1;
                    if (barVar7 != null) {
                        hf1.bar barVar8 = (hf1.bar) barVar7.get();
                        this.y = 1;
                        java.lang.Object W = fg3.h0.W(barVar8.b, new go2.c1(barVar8, null, 24), this);
                        if (W != barVar6) {
                            W = kotlin.Unit.a;
                        }
                        if (W == barVar6) {
                            return barVar6;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("defaultDialerPermissionSettings");
                        throw null;
                    }
                }
                return kotlin.Unit.a;
            case 4:
                ef3.bar barVar9 = ef3.bar.a;
                int i7 = this.y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if1.bar barVar10 = truecallerInit.W0;
                    if (barVar10 != null) {
                        ig3.q1 q1Var = barVar10.b;
                        com.truecaller.ui.j2 j2Var = new com.truecaller.ui.j2(truecallerInit, 0);
                        this.y = 1;
                        java.lang.Object collect = q1Var.a.collect(new g93.b0(j2Var, 26), this);
                        if (collect != barVar9) {
                            collect = kotlin.Unit.a;
                        }
                        if (collect == barVar9) {
                            return barVar9;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("floatingToolbarDeeplinkHandler");
                        throw null;
                    }
                }
                return kotlin.Unit.a;
            case 5:
                ef3.bar barVar11 = ef3.bar.a;
                int i8 = this.y;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    int i9 = com.truecaller.ui.TruecallerInit.y1;
                    ig3.p1 p1Var = ((com.truecaller.ui.q0) truecallerInit.h1.getValue()).e;
                    com.truecaller.ui.j2 j2Var2 = new com.truecaller.ui.j2(truecallerInit, 1);
                    this.y = 1;
                    if (p1Var.a.collect(j2Var2, this) == barVar11) {
                        return barVar11;
                    }
                }
                throw new java.lang.RuntimeException();
            case 6:
                ef3.bar barVar12 = ef3.bar.a;
                int i10 = this.y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    androidx.lifecycle.s sVar = androidx.lifecycle.s.c;
                    com.truecaller.ui.f2 f2Var = new com.truecaller.ui.f2(truecallerInit, barVar, 5);
                    this.y = 1;
                    if (androidx.lifecycle.g1.n(truecallerInit, sVar, f2Var, this) == barVar12) {
                        return barVar12;
                    }
                }
                return kotlin.Unit.a;
            case 7:
                ef3.bar barVar13 = ef3.bar.a;
                int i11 = this.y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (com.truecaller.ui.TruecallerInit.w0(truecallerInit, this) == barVar13) {
                        return barVar13;
                    }
                }
                return kotlin.Unit.a;
            case 8:
                ef3.bar barVar14 = ef3.bar.a;
                int i12 = this.y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.ui.l2 l2Var = new com.truecaller.ui.l2(ig3.w1.t(((ef1.bar) truecallerInit.T0.getValue()).c));
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c(truecallerInit, (df3.bar) null, 6);
                    this.y = 1;
                    if (ig3.w1.m(l2Var, cVar, this) == barVar14) {
                        return barVar14;
                    }
                }
                return kotlin.Unit.a;
            case 9:
                ef3.bar barVar15 = ef3.bar.a;
                int i14 = this.y;
                if (i14 != 0) {
                    if (i14 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    androidx.lifecycle.s sVar2 = androidx.lifecycle.s.c;
                    com.truecaller.ui.f2 f2Var2 = new com.truecaller.ui.f2(truecallerInit, barVar, 8);
                    this.y = 1;
                    if (androidx.lifecycle.g1.n(truecallerInit, sVar2, f2Var2, this) == barVar15) {
                        return barVar15;
                    }
                }
                return kotlin.Unit.a;
            case 10:
                ef3.bar barVar16 = ef3.bar.a;
                int i15 = this.y;
                if (i15 != 0) {
                    if (i15 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ah.f H0 = truecallerInit.H0();
                    this.y = 1;
                    java.lang.Object e = ((ty2.c) ((qc3.bar) H0.a).get()).e(this);
                    if (e != barVar16) {
                        e = kotlin.Unit.a;
                    }
                    if (e == barVar16) {
                        return barVar16;
                    }
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar17 = ef3.bar.a;
                int i16 = this.y;
                if (i16 != 0) {
                    if (i16 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    qc3.bar barVar18 = truecallerInit.G0;
                    if (barVar18 != null) {
                        cu0.b bVar = (cu0.b) barVar18.get();
                        this.y = 1;
                        if (bVar.b(this) == barVar17) {
                            return barVar17;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("callNotificationManager");
                        throw null;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
