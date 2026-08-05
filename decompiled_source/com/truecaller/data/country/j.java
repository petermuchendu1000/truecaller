package com.truecaller.data.country;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class j extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.truecaller.data.country.n x;
    public final /* synthetic */ java.lang.String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.truecaller.data.country.n nVar, java.lang.String str, df3.bar barVar) {
        super(2, barVar);
        this.x = nVar;
        this.y = str;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.data.country.j(this.x, this.y, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ef3.bar barVar = ef3.bar.a;
        od.p.E(obj);
        return this.x.b.a(this.y);
    }
}
