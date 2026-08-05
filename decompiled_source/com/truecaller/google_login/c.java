package com.truecaller.google_login;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class c extends ff3.qux {
    public int A;
    public com.google.android.gms.auth.api.identity.AuthorizationResult x;
    public /* synthetic */ java.lang.Object y;
    public final /* synthetic */ com.truecaller.google_login.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.truecaller.google_login.f fVar, ff3.qux quxVar) {
        super(quxVar);
        this.z = fVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
