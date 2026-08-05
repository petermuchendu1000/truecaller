package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class q2 extends ff3.qux {
    public final /* synthetic */ com.truecaller.ui.TruecallerInit A;
    public int B;
    public com.truecaller.bottombar.BottomBarButtonType x;
    public com.truecaller.floatingtoolbar.api.CallHistoryTab.Type y;
    public /* synthetic */ java.lang.Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.truecaller.ui.TruecallerInit truecallerInit, ff3.qux quxVar) {
        super(quxVar);
        this.A = truecallerInit;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return com.truecaller.ui.TruecallerInit.y0(this.A, null, null, this);
    }
}
