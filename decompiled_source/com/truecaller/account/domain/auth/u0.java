package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class u0 extends ff3.qux {
    public com.truecaller.account.domain.auth.k A;
    public long B;
    public int C;
    public /* synthetic */ java.lang.Object D;
    public final /* synthetic */ com.truecaller.account.domain.auth.v0 E;
    public int F;
    public java.lang.String x;
    public pg3.bar y;
    public java.lang.String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.truecaller.account.domain.auth.v0 v0Var, ff3.qux quxVar) {
        super(quxVar);
        this.E = v0Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.q(0L, this, null);
    }
}
