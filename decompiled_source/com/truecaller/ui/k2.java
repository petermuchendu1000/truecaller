package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class k2 extends ff3.qux {
    public /* synthetic */ java.lang.Object x;
    public int y;
    public final /* synthetic */ com.truecaller.ui.j2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.truecaller.ui.j2 j2Var, df3.bar barVar) {
        super(barVar);
        this.z = j2Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
