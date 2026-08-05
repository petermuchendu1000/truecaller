package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class z extends ff3.qux {
    public final /* synthetic */ com.truecaller.account.domain.auth.a0 A;
    public int B;
    public cy.qux x;
    public long y;
    public /* synthetic */ java.lang.Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.truecaller.account.domain.auth.a0 a0Var, ff3.qux quxVar) {
        super(quxVar);
        this.A = a0Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, 0L, null, this);
    }
}
