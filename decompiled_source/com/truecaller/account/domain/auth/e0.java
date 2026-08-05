package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class e0 extends ff3.qux {
    public com.truecaller.account.domain.auth.z0 A;
    public int B;
    public int C;
    public int D;
    public /* synthetic */ java.lang.Object E;
    public final /* synthetic */ com.truecaller.account.domain.auth.v0 F;
    public int G;
    public java.lang.String x;
    public pg3.bar y;
    public com.truecaller.account.domain.auth.z0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.truecaller.account.domain.auth.v0 v0Var, ff3.qux quxVar) {
        super(quxVar);
        this.F = v0Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return com.truecaller.account.domain.auth.v0.c(this.F, null, this);
    }
}
