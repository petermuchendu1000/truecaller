package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class qux extends ff3.qux {
    public java.lang.String A;
    public /* synthetic */ java.lang.Object B;
    public final /* synthetic */ com.truecaller.wizard.verification.b C;
    public int D;
    public com.truecaller.account.network.TokenResponseDto x;
    public java.lang.Long y;
    public java.lang.String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qux(com.truecaller.wizard.verification.b bVar, ff3.qux quxVar) {
        super(quxVar);
        this.C = bVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(null, null, null, null, this);
    }
}
