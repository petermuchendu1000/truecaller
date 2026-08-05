package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class s2 extends ff3.qux {
    public int A;
    public java.lang.ref.WeakReference x;
    public /* synthetic */ java.lang.Object y;
    public final /* synthetic */ com.truecaller.ui.t2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(com.truecaller.ui.t2 t2Var, ff3.qux quxVar) {
        super(quxVar);
        this.z = t2Var;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return com.truecaller.ui.t2.a(this.z, null, this);
    }
}
