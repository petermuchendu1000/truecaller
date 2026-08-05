package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class i extends ff3.qux {
    public /* synthetic */ java.lang.Object x;
    public final /* synthetic */ com.truecaller.wizard.verification.j y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.truecaller.wizard.verification.j jVar, ff3.qux quxVar) {
        super(quxVar);
        this.y = jVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.e(null, 0L, 0L, false, null, null, null, null, null, this);
    }
}
