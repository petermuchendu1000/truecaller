package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class c0 extends ff3.qux {
    public com.truecaller.account.network.ExchangeCredentialsResponseDto A;
    public java.lang.String B;
    public com.truecaller.account.domain.auth.k C;
    public int D;
    public int E;
    public int F;
    public /* synthetic */ java.lang.Object G;
    public final /* synthetic */ com.truecaller.account.domain.auth.v0 H;
    public int I;
    public pg3.bar x;
    public com.truecaller.account.domain.auth.k1 y;
    public java.lang.String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.truecaller.account.domain.auth.v0 v0Var, ff3.qux quxVar) {
        super(quxVar);
        this.H = v0Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return com.truecaller.account.domain.auth.v0.a(this.H, this);
    }
}
