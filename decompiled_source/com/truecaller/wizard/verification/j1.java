package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class j1 implements ig3.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ j1(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01eb -> B:83:0x01ee). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(ig3.j jVar, df3.bar barVar) {
        ig3.k kVar;
        int i;
        ig3.j jVar2;
        java.util.Iterator it;
        ig3.l lVar;
        int i2;
        ig3.j jVar3;
        java.util.Iterator it3;
        ig3.m mVar;
        int i3;
        int i4;
        ig3.j jVar4;
        int length;
        com.truecaller.wizard.verification.j1 j1Var;
        switch (this.a) {
            case 0:
                java.lang.Object collect = ((a61.b) this.b).collect(new a63.g0(jVar, 15), barVar);
                if (collect != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect;
            case 1:
                java.lang.Object collect2 = ((com.truecaller.wizard.verification.h1) this.b).collect(new a63.g0(jVar, 16), barVar);
                if (collect2 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect2;
            case 2:
                java.lang.Object collect3 = ((com.truecaller.wizard.verification.j1) this.b).collect(new a63.g0(jVar, 17), barVar);
                if (collect3 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect3;
            case 3:
                java.lang.Object collect4 = ((ig3.qux) this.b).collect(new a63.g0(jVar, 19), barVar);
                if (collect4 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect4;
            case 4:
                java.lang.Object collect5 = ((a63.h0) this.b).collect(new a63.g0(jVar, 24), barVar);
                if (collect5 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect5;
            case 5:
                ig3.p1 p1Var = (ig3.p1) this.b;
                java.lang.Object collect6 = p1Var.a.collect(new g93.b0(jVar, 18), barVar);
                if (collect6 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect6;
            case 6:
                if (barVar instanceof ig3.k) {
                    kVar = (ig3.k) barVar;
                    int i5 = kVar.y;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        kVar.y = i5 - Integer.MIN_VALUE;
                        java.lang.Object obj = kVar.x;
                        ef3.bar barVar2 = ef3.bar.a;
                        i = kVar.y;
                        if (i == 0) {
                            if (i == 1) {
                                it = kVar.B;
                                ig3.j jVar5 = kVar.A;
                                od.p.E(obj);
                                jVar2 = jVar5;
                            } else {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            od.p.E(obj);
                            jVar2 = jVar;
                            it = ((java.lang.Iterable) this.b).iterator();
                        }
                        while (it.hasNext()) {
                            java.lang.Object next = it.next();
                            kVar.A = jVar2;
                            kVar.B = it;
                            kVar.y = 1;
                            if (jVar2.emit(next, kVar) == barVar2) {
                                return barVar2;
                            }
                        }
                        return kotlin.Unit.a;
                    }
                }
                kVar = new ig3.k(this, barVar);
                java.lang.Object obj2 = kVar.x;
                ef3.bar barVar22 = ef3.bar.a;
                i = kVar.y;
                if (i == 0) {
                }
                while (it.hasNext()) {
                }
                return kotlin.Unit.a;
            case 7:
                if (barVar instanceof ig3.l) {
                    lVar = (ig3.l) barVar;
                    int i6 = lVar.y;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        lVar.y = i6 - Integer.MIN_VALUE;
                        java.lang.Object obj3 = lVar.x;
                        ef3.bar barVar3 = ef3.bar.a;
                        i2 = lVar.y;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                it3 = lVar.B;
                                ig3.j jVar6 = lVar.A;
                                od.p.E(obj3);
                                jVar3 = jVar6;
                            } else {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            od.p.E(obj3);
                            jVar3 = jVar;
                            it3 = ((vf3.bar) this.b).iterator();
                        }
                        while (it3.hasNext()) {
                            java.lang.Object next2 = it3.next();
                            lVar.A = jVar3;
                            lVar.B = it3;
                            lVar.y = 1;
                            if (jVar3.emit(next2, lVar) == barVar3) {
                                return barVar3;
                            }
                        }
                        return kotlin.Unit.a;
                    }
                }
                lVar = new ig3.l(this, barVar);
                java.lang.Object obj32 = lVar.x;
                ef3.bar barVar32 = ef3.bar.a;
                i2 = lVar.y;
                if (i2 == 0) {
                }
                while (it3.hasNext()) {
                }
                return kotlin.Unit.a;
            case 8:
                if (barVar instanceof ig3.m) {
                    mVar = (ig3.m) barVar;
                    int i7 = mVar.y;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        mVar.y = i7 - Integer.MIN_VALUE;
                        java.lang.Object obj4 = mVar.x;
                        ef3.bar barVar4 = ef3.bar.a;
                        i3 = mVar.y;
                        if (i3 == 0) {
                            if (i3 == 1) {
                                length = mVar.D;
                                i4 = mVar.C;
                                ig3.j jVar7 = mVar.B;
                                j1Var = mVar.A;
                                od.p.E(obj4);
                                jVar4 = jVar7;
                                i4++;
                                if (i4 < length) {
                                    java.lang.Object obj5 = ((java.lang.Object[]) j1Var.b)[i4];
                                    mVar.A = j1Var;
                                    mVar.B = jVar4;
                                    mVar.C = i4;
                                    mVar.D = length;
                                    mVar.y = 1;
                                    if (jVar4.emit(obj5, mVar) == barVar4) {
                                        return barVar4;
                                    }
                                    i4++;
                                    if (i4 < length) {
                                        return kotlin.Unit.a;
                                    }
                                }
                            } else {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            od.p.E(obj4);
                            i4 = 0;
                            jVar4 = jVar;
                            length = ((java.lang.Object[]) this.b).length;
                            j1Var = this;
                            if (i4 < length) {
                            }
                        }
                    }
                }
                mVar = new ig3.m(this, barVar);
                java.lang.Object obj42 = mVar.x;
                ef3.bar barVar42 = ef3.bar.a;
                i3 = mVar.y;
                if (i3 == 0) {
                }
            case 9:
                java.lang.Object emit = jVar.emit(this.b, barVar);
                if (emit != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return emit;
            case 10:
                java.lang.Object collect7 = ((ig3.e) this.b).collect(new g93.b0(jVar, 29), barVar);
                if (collect7 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect7;
            case 11:
                jd3.qux quxVar = new jd3.qux((ig3.q) this.b, jVar, (df3.bar) null, 4);
                fg3.l2 l2Var = new fg3.l2(barVar.getContext(), barVar, 1);
                java.lang.Object A = kk3.m.A(l2Var, l2Var, quxVar);
                ef3.bar barVar5 = ef3.bar.a;
                if (A == barVar5) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "frame");
                }
                if (A != barVar5) {
                    return kotlin.Unit.a;
                }
                return A;
            case 12:
                java.lang.Object collect8 = ((com.truecaller.wizard.verification.j1) this.b).collect(new iv2.baz(jVar, 4), barVar);
                if (collect8 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect8;
            case 13:
                java.lang.Object collect9 = ((a63.h0) this.b).collect(new iv2.baz(jVar, 5), barVar);
                if (collect9 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect9;
            case 14:
                java.lang.Object collect10 = ((i02.c) this.b).collect(new iv2.baz(jVar, 8), barVar);
                if (collect10 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect10;
            case 15:
                java.lang.Object collect11 = ((i02.c) this.b).collect(new iv2.baz(jVar, 9), barVar);
                if (collect11 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect11;
            case 16:
                java.lang.Object collect12 = ((kl1.g) this.b).collect(new iv2.baz(jVar, 29), barVar);
                if (collect12 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect12;
            case 17:
                java.lang.Object collect13 = ((ig3.x) this.b).collect(new nm1.m2(jVar, 27), barVar);
                if (collect13 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect13;
            case 18:
                java.lang.Object collect14 = ((com.truecaller.wizard.verification.j1) this.b).collect(new nm1.m2(jVar, 29), barVar);
                if (collect14 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect14;
            case 19:
                java.lang.Object collect15 = ((ig3.v) this.b).collect(new tx0.u(jVar, 14), barVar);
                if (collect15 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect15;
            case 20:
                java.lang.Object collect16 = ((wh2.baz) this.b).collect(new tx0.u(jVar, 23), barVar);
                if (collect16 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect16;
            case 21:
                java.lang.Object collect17 = ((ig3.d) this.b).collect(new tx0.u(jVar, 28), barVar);
                if (collect17 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect17;
            case 22:
                java.lang.Object collect18 = ((com.truecaller.wizard.verification.j1) this.b).collect(new tx0.u(jVar, 29), barVar);
                if (collect18 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect18;
            case 23:
                java.lang.Object collect19 = ((wh2.baz) this.b).collect(new yd.b(jVar, 4), barVar);
                if (collect19 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect19;
            case 24:
                java.lang.Object collect20 = ((jg3.h) this.b).collect(new yd.b(jVar, 7), barVar);
                if (collect20 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect20;
            default:
                java.lang.Object collect21 = ((ig3.g) this.b).collect(new yd.b(jVar, 10), barVar);
                if (collect21 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect21;
        }
    }
}
