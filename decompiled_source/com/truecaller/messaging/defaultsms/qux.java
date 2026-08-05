package com.truecaller.messaging.defaultsms;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class qux extends ff3.qux {
    public final /* synthetic */ com.truecaller.messaging.defaultsms.c A;
    public int B;
    public int x;
    public boolean y;
    public /* synthetic */ java.lang.Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qux(com.truecaller.messaging.defaultsms.c cVar, ff3.qux quxVar) {
        super(quxVar);
        this.A = cVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, 0, false, null, this);
    }
}
