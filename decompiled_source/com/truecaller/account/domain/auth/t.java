package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class t extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ kotlin.jvm.internal.j0 A;
    public int x;
    public final /* synthetic */ com.truecaller.account.domain.auth.u y;
    public final /* synthetic */ com.truecaller.common.network.util.KnownEndpoints z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.truecaller.account.domain.auth.u uVar, com.truecaller.common.network.util.KnownEndpoints knownEndpoints, kotlin.jvm.internal.j0 j0Var, df3.bar barVar) {
        super(2, barVar);
        this.y = uVar;
        this.z = knownEndpoints;
        this.A = j0Var;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.account.domain.auth.t(this.y, this.z, this.A, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
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
        com.truecaller.account.domain.auth.a0 a0Var = this.y.g;
        java.lang.String key = this.z.getKey();
        java.lang.String b = ((okhttp3.Request) this.A.a).a.b();
        this.x = 1;
        java.lang.Object a = a0Var.a(key, b, this);
        if (a == barVar) {
            return barVar;
        }
        return a;
    }
}
