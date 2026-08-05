package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class d0 extends ff3.qux {
    public com.truecaller.account.domain.auth.z0 A;
    public java.util.LinkedHashMap B;
    public int C;
    public int D;
    public int E;
    public /* synthetic */ java.lang.Object F;
    public final /* synthetic */ com.truecaller.account.domain.auth.v0 G;
    public int H;
    public pg3.bar x;
    public com.truecaller.account.domain.auth.z0 y;
    public com.truecaller.account.network.m z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.truecaller.account.domain.auth.v0 v0Var, ff3.qux quxVar) {
        super(quxVar);
        this.G = v0Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return com.truecaller.account.domain.auth.v0.b(this.G, this);
    }
}
