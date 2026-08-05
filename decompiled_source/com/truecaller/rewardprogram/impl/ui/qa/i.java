package com.truecaller.rewardprogram.impl.ui.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class i extends ff3.g implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.rewardprogram.impl.ui.qa.j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.truecaller.rewardprogram.impl.ui.qa.j jVar, df3.bar barVar, int i) {
        super(1, barVar);
        this.x = i;
        this.z = jVar;
    }

    public final df3.bar create(df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.rewardprogram.impl.ui.qa.i(this.z, barVar, 0);
            case 1:
                return new com.truecaller.rewardprogram.impl.ui.qa.i(this.z, barVar, 1);
            case 2:
                return new com.truecaller.rewardprogram.impl.ui.qa.i(this.z, barVar, 2);
            case 3:
                return new com.truecaller.rewardprogram.impl.ui.qa.i(this.z, barVar, 3);
            case 4:
                return new com.truecaller.rewardprogram.impl.ui.qa.i(this.z, barVar, 4);
            case 5:
                return new com.truecaller.rewardprogram.impl.ui.qa.i(this.z, barVar, 5);
            case 6:
                return new com.truecaller.rewardprogram.impl.ui.qa.i(this.z, barVar, 6);
            case 7:
                return new com.truecaller.rewardprogram.impl.ui.qa.i(this.z, barVar, 7);
            case 8:
                return new com.truecaller.rewardprogram.impl.ui.qa.i(this.z, barVar, 8);
            default:
                return new com.truecaller.rewardprogram.impl.ui.qa.i(this.z, barVar, 9);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        df3.bar barVar = (df3.bar) obj;
        switch (this.x) {
            case 0:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 2:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 3:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 4:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 5:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 6:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 7:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 8:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
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
                    kr0.o oVar = this.z.h;
                    this.y = 1;
                    if (oVar.p(this) == barVar) {
                        return barVar;
                    }
                }
                return kotlin.Unit.a;
            case 1:
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
                    d3.g gVar = this.z.e;
                    this.y = 1;
                    java.lang.Object q = mc.f.q(((lk2.n) gVar.a).d.a, false, true, new m1.q2(16), this);
                    if (q != barVar2) {
                        q = kotlin.Unit.a;
                    }
                    if (q != barVar2) {
                        q = kotlin.Unit.a;
                    }
                    if (q != barVar2) {
                        q = kotlin.Unit.a;
                    }
                    if (q == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
            case 2:
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
                    dq1.h hVar = this.z.c;
                    this.y = 1;
                    java.lang.Object q2 = mc.f.q(((lk2.n) hVar.a).e.a, false, true, new m1.q2(18), this);
                    if (q2 != barVar3) {
                        q2 = kotlin.Unit.a;
                    }
                    if (q2 != barVar3) {
                        q2 = kotlin.Unit.a;
                    }
                    if (q2 != barVar3) {
                        q2 = kotlin.Unit.a;
                    }
                    if (q2 == barVar3) {
                        return barVar3;
                    }
                }
                return kotlin.Unit.a;
            case 3:
                ef3.bar barVar4 = ef3.bar.a;
                int i4 = this.y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    hx1.b bVar = this.z.i;
                    this.y = 1;
                    if (bVar.J(this) == barVar4) {
                        return barVar4;
                    }
                }
                return kotlin.Unit.a;
            case 4:
                ef3.bar barVar5 = ef3.bar.a;
                int i5 = this.y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    lk2.n nVar = this.z.b;
                    this.y = 1;
                    java.lang.Object Y = ef0.a.Y(nVar.a, lk2.n.p, 1L, this);
                    if (Y != barVar5) {
                        Y = kotlin.Unit.a;
                    }
                    if (Y == barVar5) {
                        return barVar5;
                    }
                }
                return kotlin.Unit.a;
            case 5:
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
                    wt.l lVar = this.z.d;
                    this.y = 1;
                    java.lang.Object q3 = mc.f.q(((lk2.n) lVar.a).f.a, false, true, new m1.q2(20), this);
                    if (q3 != barVar6) {
                        q3 = kotlin.Unit.a;
                    }
                    if (q3 != barVar6) {
                        q3 = kotlin.Unit.a;
                    }
                    if (q3 != barVar6) {
                        q3 = kotlin.Unit.a;
                    }
                    if (q3 == barVar6) {
                        return barVar6;
                    }
                }
                return kotlin.Unit.a;
            case 6:
                ef3.bar barVar7 = ef3.bar.a;
                int i7 = this.y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    lk2.n nVar2 = this.z.b;
                    this.y = 1;
                    java.lang.Object Y2 = ef0.a.Y(nVar2.a, lk2.n.o, -1L, this);
                    if (Y2 != barVar7) {
                        Y2 = kotlin.Unit.a;
                    }
                    if (Y2 == barVar7) {
                        return barVar7;
                    }
                }
                return kotlin.Unit.a;
            case 7:
                lk2.n nVar3 = this.z.b;
                ef3.bar barVar8 = ef3.bar.a;
                int i8 = this.y;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    java.lang.Object W = ef0.a.W(nVar3.a, lk2.n.l, false, this);
                    if (W != barVar8) {
                        W = kotlin.Unit.a;
                    }
                    if (W == barVar8) {
                        return barVar8;
                    }
                }
                this.y = 2;
                java.lang.Object Y3 = ef0.a.Y(nVar3.a, lk2.n.k, -1L, this);
                if (Y3 != barVar8) {
                    Y3 = kotlin.Unit.a;
                }
                if (Y3 == barVar8) {
                    return barVar8;
                }
                return kotlin.Unit.a;
            case 8:
                ef3.bar barVar9 = ef3.bar.a;
                int i9 = this.y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    lk2.n nVar4 = this.z.b;
                    this.y = 1;
                    java.lang.Object W2 = ef0.a.W(nVar4.a, lk2.n.n, false, this);
                    if (W2 != barVar9) {
                        W2 = kotlin.Unit.a;
                    }
                    if (W2 == barVar9) {
                        return barVar9;
                    }
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar10 = ef3.bar.a;
                int i10 = this.y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    lk2.n nVar5 = this.z.b;
                    this.y = 1;
                    java.lang.Object W3 = ef0.a.W(nVar5.a, lk2.n.m, false, this);
                    if (W3 != barVar10) {
                        W3 = kotlin.Unit.a;
                    }
                    if (W3 == barVar10) {
                        return barVar10;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
