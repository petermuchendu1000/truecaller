package com.truecaller.ads.keywords.network;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class b extends ff3.g implements kotlin.jvm.functions.Function1 {
    public int x;
    public final /* synthetic */ com.truecaller.ads.keywords.network.c y;
    public final /* synthetic */ java.util.LinkedHashMap z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.truecaller.ads.keywords.network.c cVar, java.util.LinkedHashMap linkedHashMap, df3.bar barVar) {
        super(1, barVar);
        this.y = cVar;
        this.z = linkedHashMap;
    }

    public final df3.bar create(df3.bar barVar) {
        return new com.truecaller.ads.keywords.network.b(this.y, this.z, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        return create((df3.bar) obj).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ef3.bar barVar = ef3.bar.a;
        int i = this.x;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
                return obj;
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.p.E(obj);
        com.truecaller.ads.keywords.network.baz bazVar = (com.truecaller.ads.keywords.network.baz) this.y.a.get();
        this.x = 1;
        java.lang.Object a = ((com.truecaller.ads.keywords.network.qux) bazVar.a.getValue()).a(this.z, this);
        if (a == barVar) {
            return barVar;
        }
        return a;
    }
}
