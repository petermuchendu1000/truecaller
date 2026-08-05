package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class o2 extends ff3.qux {
    public /* synthetic */ java.lang.Object x;
    public final /* synthetic */ com.truecaller.ui.TruecallerInit y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.truecaller.ui.TruecallerInit truecallerInit, ff3.qux quxVar) {
        super(quxVar);
        this.y = truecallerInit;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return com.truecaller.ui.TruecallerInit.x0(this.y, this);
    }
}
