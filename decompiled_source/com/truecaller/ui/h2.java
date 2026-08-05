package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class h2 extends ff3.qux {
    public final /* synthetic */ com.truecaller.ui.TruecallerInit A;
    public int B;
    public androidx.compose.ui.platform.ComposeView x;
    public int y;
    public /* synthetic */ java.lang.Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.truecaller.ui.TruecallerInit truecallerInit, ff3.qux quxVar) {
        super(quxVar);
        this.A = truecallerInit;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return com.truecaller.ui.TruecallerInit.w0(this.A, this);
    }
}
