package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class a extends ff3.qux {
    public int A;
    public com.truecaller.remoteconfig.experiment.ExperimentActivationStatus x;
    public /* synthetic */ java.lang.Object y;
    public final /* synthetic */ com.truecaller.remoteconfig.experiment.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.truecaller.remoteconfig.experiment.c cVar, ff3.qux quxVar) {
        super(quxVar);
        this.z = cVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
