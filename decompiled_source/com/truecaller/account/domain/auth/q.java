package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class q extends ff3.qux {
    public int A;
    public com.truecaller.account.domain.auth.f x;
    public /* synthetic */ java.lang.Object y;
    public final /* synthetic */ com.truecaller.account.domain.auth.r z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.truecaller.account.domain.auth.r rVar, ff3.qux quxVar) {
        super(quxVar);
        this.z = rVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(null, this);
    }
}
