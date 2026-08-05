package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class n0 extends ff3.qux {
    public int A;
    public long x;
    public /* synthetic */ java.lang.Object y;
    public final /* synthetic */ com.truecaller.account.domain.auth.v0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.truecaller.account.domain.auth.v0 v0Var, ff3.qux quxVar) {
        super(quxVar);
        this.z = v0Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.j(0L, this);
    }
}
