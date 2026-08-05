package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class o extends ff3.qux {
    public /* synthetic */ java.lang.Object x;
    public final /* synthetic */ com.truecaller.remoteconfig.experiment.p y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.truecaller.remoteconfig.experiment.p pVar, ff3.qux quxVar) {
        super(quxVar);
        this.y = pVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.b(null, null, null, null, null, null, null, this);
    }
}
