package com.truecaller.ads.acsrules.network;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux extends ff3.g implements kotlin.jvm.functions.Function1 {
    public int x;
    public final /* synthetic */ com.truecaller.ads.acsrules.network.a y;
    public final /* synthetic */ java.lang.String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qux(com.truecaller.ads.acsrules.network.a aVar, java.lang.String str, df3.bar barVar) {
        super(1, barVar);
        this.y = aVar;
        this.z = str;
    }

    public final df3.bar create(df3.bar barVar) {
        return new com.truecaller.ads.acsrules.network.qux(this.y, this.z, barVar);
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
        com.truecaller.ads.acsrules.network.b bVar = (com.truecaller.ads.acsrules.network.b) this.y.a.getValue();
        java.util.Map<java.lang.String, java.lang.String> s = com.appsflyer.internal.e.s("v", this.z);
        this.x = 1;
        java.lang.Object a = bVar.a(s, this);
        if (a == barVar) {
            return barVar;
        }
        return a;
    }
}
