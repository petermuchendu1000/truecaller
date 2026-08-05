package com.truecaller.account.network;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux extends ff3.qux {
    public final /* synthetic */ com.truecaller.account.network.b A;
    public int B;
    public java.lang.Object x;
    public int y;
    public /* synthetic */ java.lang.Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qux(com.truecaller.account.network.b bVar, ff3.qux quxVar) {
        super(quxVar);
        this.A = bVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(null, this);
    }
}
