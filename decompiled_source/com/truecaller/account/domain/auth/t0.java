package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class t0 extends ff3.qux {
    public java.util.Collection A;
    public int B;
    public int C;
    public /* synthetic */ java.lang.Object D;
    public final /* synthetic */ com.truecaller.account.domain.auth.v0 E;
    public int F;
    public java.util.Collection x;
    public java.util.Iterator y;
    public java.util.Map.Entry z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.truecaller.account.domain.auth.v0 v0Var, ff3.qux quxVar) {
        super(quxVar);
        this.E = v0Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.p(null, this);
    }
}
