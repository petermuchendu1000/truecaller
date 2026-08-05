package com.truecaller.messaging.defaultsms;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class g extends ff3.qux {
    public /* synthetic */ java.lang.Object x;
    public final /* synthetic */ com.truecaller.messaging.defaultsms.DmaAdsWorker y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.truecaller.messaging.defaultsms.DmaAdsWorker dmaAdsWorker, ff3.qux quxVar) {
        super(quxVar);
        this.y = dmaAdsWorker;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.doWork(this);
    }
}
