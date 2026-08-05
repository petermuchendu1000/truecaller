package com.truecaller.profile.impl.remote;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class n extends ff3.qux {
    public int A;
    public pg2.i0 x;
    public /* synthetic */ java.lang.Object y;
    public final /* synthetic */ com.truecaller.profile.impl.remote.p z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.truecaller.profile.impl.remote.p pVar, ff3.qux quxVar) {
        super(quxVar);
        this.z = pVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(null, this);
    }
}
