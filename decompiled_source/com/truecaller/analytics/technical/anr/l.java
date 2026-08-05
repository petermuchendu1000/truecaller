package com.truecaller.analytics.technical.anr;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class l extends ff3.qux {
    public /* synthetic */ java.lang.Object x;
    public final /* synthetic */ com.truecaller.analytics.technical.anr.m y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.truecaller.analytics.technical.anr.m mVar, ff3.qux quxVar) {
        super(quxVar);
        this.y = mVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(this);
    }
}
