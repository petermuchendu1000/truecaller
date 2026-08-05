package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class o1 extends ff3.qux {
    public /* synthetic */ java.lang.Object x;
    public int y;
    public final /* synthetic */ a63.g0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(a63.g0 g0Var, df3.bar barVar) {
        super(barVar);
        this.z = g0Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
