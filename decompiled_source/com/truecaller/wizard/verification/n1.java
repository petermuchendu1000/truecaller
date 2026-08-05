package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class n1 extends ff3.qux {
    public /* synthetic */ java.lang.Object x;
    public int y;
    public final /* synthetic */ com.truecaller.wizard.verification.l1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.truecaller.wizard.verification.l1 l1Var, df3.bar barVar) {
        super(barVar);
        this.z = l1Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
