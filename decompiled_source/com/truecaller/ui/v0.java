package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class v0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.ui.b1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(com.truecaller.ui.b1 b1Var, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = b1Var;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.ui.v0(this.z, barVar, 0);
            case 1:
                return new com.truecaller.ui.v0(this.z, barVar, 1);
            case 2:
                return new com.truecaller.ui.v0(this.z, barVar, 2);
            case 3:
                return new com.truecaller.ui.v0(this.z, barVar, 3);
            case 4:
                return new com.truecaller.ui.v0(this.z, barVar, 4);
            case 5:
                return new com.truecaller.ui.v0(this.z, barVar, 5);
            case 6:
                return new com.truecaller.ui.v0(this.z, barVar, 6);
            case 7:
                return new com.truecaller.ui.v0(this.z, barVar, 7);
            case 8:
                return new com.truecaller.ui.v0(this.z, barVar, 8);
            default:
                return new com.truecaller.ui.v0(this.z, barVar, 9);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
                return ef3.bar.a;
            case 1:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 2:
                create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
                return ef3.bar.a;
            case 3:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 4:
                create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
                return ef3.bar.a;
            case 5:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 6:
                create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
                return ef3.bar.a;
            case 7:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 8:
                create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
                return ef3.bar.a;
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        int i2 = 0;
        int i3 = 2;
        df3.bar barVar = null;
        com.truecaller.ui.b1 b1Var = this.z;
        int i4 = 1;
        switch (i) {
            case 0:
                ef3.bar barVar2 = ef3.bar.a;
                int i5 = this.y;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    com.truecaller.ui.t0 t0Var = com.truecaller.ui.b1.n;
                    ig3.q1 q1Var = b1Var.a6().j;
                    com.truecaller.ui.u0 u0Var = new com.truecaller.ui.u0(b1Var);
                    this.y = 1;
                    if (q1Var.a.collect(u0Var, this) == barVar2) {
                        return barVar2;
                    }
                }
                throw new java.lang.RuntimeException();
            case 1:
                ef3.bar barVar3 = ef3.bar.a;
                int i6 = this.y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    androidx.lifecycle.d0 viewLifecycleOwner = b1Var.getViewLifecycleOwner();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.s sVar = androidx.lifecycle.s.d;
                    com.truecaller.ui.v0 v0Var = new com.truecaller.ui.v0(b1Var, barVar, i2);
                    this.y = 1;
                    if (androidx.lifecycle.g1.n(viewLifecycleOwner, sVar, v0Var, this) == barVar3) {
                        return barVar3;
                    }
                }
                return kotlin.Unit.a;
            case 2:
                ef3.bar barVar4 = ef3.bar.a;
                int i7 = this.y;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    com.truecaller.ui.t0 t0Var2 = com.truecaller.ui.b1.n;
                    ig3.p1 p1Var = b1Var.a6().l;
                    com.truecaller.ui.w0 w0Var = new com.truecaller.ui.w0(b1Var, i2);
                    this.y = 1;
                    if (p1Var.a.collect(w0Var, this) == barVar4) {
                        return barVar4;
                    }
                }
                throw new java.lang.RuntimeException();
            case 3:
                ef3.bar barVar5 = ef3.bar.a;
                int i8 = this.y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    androidx.lifecycle.d0 viewLifecycleOwner2 = b1Var.getViewLifecycleOwner();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.s sVar2 = androidx.lifecycle.s.d;
                    com.truecaller.ui.v0 v0Var2 = new com.truecaller.ui.v0(b1Var, barVar, i3);
                    this.y = 1;
                    if (androidx.lifecycle.g1.n(viewLifecycleOwner2, sVar2, v0Var2, this) == barVar5) {
                        return barVar5;
                    }
                }
                return kotlin.Unit.a;
            case 4:
                ef3.bar barVar6 = ef3.bar.a;
                int i9 = this.y;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    com.truecaller.ui.t0 t0Var3 = com.truecaller.ui.b1.n;
                    ig3.p1 p1Var2 = b1Var.a6().n;
                    com.truecaller.ui.w0 w0Var2 = new com.truecaller.ui.w0(b1Var, i4);
                    this.y = 1;
                    if (p1Var2.a.collect(w0Var2, this) == barVar6) {
                        return barVar6;
                    }
                }
                throw new java.lang.RuntimeException();
            case 5:
                ef3.bar barVar7 = ef3.bar.a;
                int i10 = this.y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    androidx.lifecycle.d0 viewLifecycleOwner3 = b1Var.getViewLifecycleOwner();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.s sVar3 = androidx.lifecycle.s.d;
                    com.truecaller.ui.v0 v0Var3 = new com.truecaller.ui.v0(b1Var, barVar, 4);
                    this.y = 1;
                    if (androidx.lifecycle.g1.n(viewLifecycleOwner3, sVar3, v0Var3, this) == barVar7) {
                        return barVar7;
                    }
                }
                return kotlin.Unit.a;
            case 6:
                ef3.bar barVar8 = ef3.bar.a;
                int i11 = this.y;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw d4.t.r(obj);
                }
                od.p.E(obj);
                com.truecaller.ui.t0 t0Var4 = com.truecaller.ui.b1.n;
                ig3.h2 h2Var = b1Var.a6().q;
                com.truecaller.ui.w0 w0Var3 = new com.truecaller.ui.w0(b1Var, i3);
                this.y = 1;
                h2Var.collect(w0Var3, this);
                return barVar8;
            case 7:
                ef3.bar barVar9 = ef3.bar.a;
                int i12 = this.y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    androidx.lifecycle.d0 viewLifecycleOwner4 = b1Var.getViewLifecycleOwner();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.s sVar4 = androidx.lifecycle.s.d;
                    com.truecaller.ui.v0 v0Var4 = new com.truecaller.ui.v0(b1Var, barVar, 6);
                    this.y = 1;
                    if (androidx.lifecycle.g1.n(viewLifecycleOwner4, sVar4, v0Var4, this) == barVar9) {
                        return barVar9;
                    }
                }
                return kotlin.Unit.a;
            case 8:
                ef3.bar barVar10 = ef3.bar.a;
                int i14 = this.y;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    com.truecaller.ui.t0 t0Var5 = com.truecaller.ui.b1.n;
                    ig3.p1 p1Var3 = b1Var.a6().s;
                    com.truecaller.ui.w0 w0Var4 = new com.truecaller.ui.w0(b1Var, 3);
                    this.y = 1;
                    if (p1Var3.a.collect(w0Var4, this) == barVar10) {
                        return barVar10;
                    }
                }
                throw new java.lang.RuntimeException();
            default:
                ef3.bar barVar11 = ef3.bar.a;
                int i15 = this.y;
                if (i15 != 0) {
                    if (i15 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    androidx.lifecycle.d0 viewLifecycleOwner5 = b1Var.getViewLifecycleOwner();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.s sVar5 = androidx.lifecycle.s.c;
                    com.truecaller.ui.v0 v0Var5 = new com.truecaller.ui.v0(b1Var, barVar, 8);
                    this.y = 1;
                    if (androidx.lifecycle.g1.n(viewLifecycleOwner5, sVar5, v0Var5, this) == barVar11) {
                        return barVar11;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
