package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class y extends ff3.qux {
    public /* synthetic */ java.lang.Object A;
    public final /* synthetic */ com.truecaller.account.domain.auth.a0 B;
    public int C;
    public java.lang.String x;
    public java.lang.String y;
    public com.truecaller.account.domain.auth.a1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.truecaller.account.domain.auth.a0 a0Var, ff3.qux quxVar) {
        super(quxVar);
        this.B = a0Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, this);
    }
}
