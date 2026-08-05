package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class i0 extends ff3.qux {
    public com.truecaller.account.domain.auth.AuthTokensState A;
    public /* synthetic */ java.lang.Object B;
    public final /* synthetic */ com.truecaller.account.domain.auth.v0 C;
    public int D;
    public java.lang.String x;
    public com.truecaller.account.domain.auth.o1 y;
    public java.lang.String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.truecaller.account.domain.auth.v0 v0Var, ff3.qux quxVar) {
        super(quxVar);
        this.C = v0Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.f(null, null, this);
    }
}
