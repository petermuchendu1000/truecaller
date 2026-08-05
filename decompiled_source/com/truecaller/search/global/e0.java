package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class e0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ java.util.List A;
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.search.global.h0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(com.truecaller.search.global.h0 h0Var, java.util.List list, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = h0Var;
        this.A = list;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.search.global.e0(this.z, this.A, barVar, 0);
            case 1:
                return new com.truecaller.search.global.e0(this.z, this.A, barVar, 1);
            default:
                return new com.truecaller.search.global.e0(this.z, this.A, barVar, 2);
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.truecaller.search.global.i0 i0Var;
        switch (this.x) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i = this.y;
                ?? r2 = this.z;
                if (i != 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    p02.z3 z3Var = r2.C;
                    this.y = 1;
                    java.lang.Object W = fg3.h0.W(z3Var.b, new o32.d(this.A, z3Var, (df3.bar) null, 20), this);
                    if (W != barVar) {
                        W = kotlin.Unit.a;
                    }
                    if (W == barVar) {
                        return barVar;
                    }
                }
                com.truecaller.search.global.i0 i0Var2 = (com.truecaller.search.global.i0) r2.a;
                if (i0Var2 != null) {
                    ((com.truecaller.search.global.m) i0Var2).c6();
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
                    wt.l lVar = this.z.H;
                    java.util.List list = this.A;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ax1.bar.z(arrayList, ((com.truecaller.messaging.data.types.Message) it.next()).a);
                    }
                    this.y = 1;
                    if (lVar.P(arrayList, this) == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
            default:
                ?? r0 = this.z;
                kotlin.coroutines.CoroutineContext coroutineContext = r0.d;
                ef3.bar barVar3 = ef3.bar.a;
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            od.p.E(obj);
                            i0Var = (com.truecaller.search.global.i0) r0.a;
                            if (i0Var != null) {
                                ((com.truecaller.search.global.m) i0Var).c6();
                            }
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    hz1.h hVar = hz1.h.a;
                    com.truecaller.ads.util.u0 u0Var = new com.truecaller.ads.util.u0(19);
                    this.y = 1;
                    obj = hVar.i(coroutineContext, u0Var, this);
                    if (obj == barVar3) {
                        return barVar3;
                    }
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    com.truecaller.search.global.e0 e0Var = new com.truecaller.search.global.e0(r0, this.A, null, 1);
                    this.y = 2;
                    if (fg3.h0.W(coroutineContext, e0Var, this) == barVar3) {
                        return barVar3;
                    }
                }
                i0Var = (com.truecaller.search.global.i0) r0.a;
                if (i0Var != null) {
                }
                return kotlin.Unit.a;
        }
    }
}
