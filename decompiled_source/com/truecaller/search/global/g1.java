package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class g1 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public /* synthetic */ java.lang.Object y;
    public final /* synthetic */ com.truecaller.search.global.i1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(com.truecaller.search.global.i1 i1Var, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = i1Var;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                com.truecaller.search.global.g1 g1Var = new com.truecaller.search.global.g1(this.z, barVar, 0);
                g1Var.y = obj;
                return g1Var;
            default:
                com.truecaller.search.global.g1 g1Var2 = new com.truecaller.search.global.g1(this.z, barVar, 1);
                g1Var2.y = obj;
                return g1Var2;
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rw2.b bVar = (rw2.b) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(bVar, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(bVar, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.x) {
            case 0:
                rw2.b bVar = (rw2.b) this.y;
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                this.z.f = bVar;
                return kotlin.Unit.a;
            default:
                rw2.b bVar2 = (rw2.b) this.y;
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                this.z.c = bVar2;
                return kotlin.Unit.a;
        }
    }
}
