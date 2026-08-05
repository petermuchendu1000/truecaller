package com.truecaller.google_login;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class d extends ff3.qux {
    public final /* synthetic */ com.truecaller.google_login.f A;
    public int B;
    public com.google.android.gms.internal.auth-api.zbad x;
    public com.google.android.gms.auth.api.identity.bar y;
    public /* synthetic */ java.lang.Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.truecaller.google_login.f fVar, ff3.qux quxVar) {
        super(quxVar);
        this.A = fVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.b(this);
    }
}
