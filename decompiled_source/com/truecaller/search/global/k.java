package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class k extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.search.global.m z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.truecaller.search.global.m mVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = mVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.search.global.k(this.z, barVar, 0);
            default:
                return new com.truecaller.search.global.k(this.z, barVar, 1);
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
                    com.truecaller.search.global.m mVar = this.z;
                    rp2.c cVar = mVar.s;
                    if (cVar != null) {
                        ig3.q1 q1Var = cVar.d;
                        com.truecaller.search.global.j jVar = new com.truecaller.search.global.j(mVar);
                        this.y = 1;
                        if (q1Var.a.collect(jVar, this) == barVar) {
                            return barVar;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("softThrottleStatusObserver");
                        throw null;
                    }
                }
                return kotlin.Unit.a;
            default:
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
                    com.truecaller.search.global.m mVar2 = this.z;
                    androidx.lifecycle.d0 viewLifecycleOwner = mVar2.getViewLifecycleOwner();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.s sVar = androidx.lifecycle.s.c;
                    com.truecaller.search.global.k kVar = new com.truecaller.search.global.k(mVar2, null, 0);
                    this.y = 1;
                    if (androidx.lifecycle.g1.n(viewLifecycleOwner, sVar, kVar, this) == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
