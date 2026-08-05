package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class p0 extends ff3.qux {
    public int A;
    public /* synthetic */ java.lang.Object B;
    public final /* synthetic */ com.truecaller.account.domain.auth.v0 C;
    public int D;
    public cy.qux x;
    public pg3.bar y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.truecaller.account.domain.auth.v0 v0Var, ff3.qux quxVar) {
        super(quxVar);
        this.C = v0Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.l(null, this);
    }
}
