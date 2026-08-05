package com.truecaller.profile.impl.remote;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class l extends ff3.qux {
    public /* synthetic */ java.lang.Object x;
    public final /* synthetic */ com.truecaller.profile.impl.remote.p y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.truecaller.profile.impl.remote.p pVar, ff3.qux quxVar) {
        super(quxVar);
        this.y = pVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        java.lang.Object e = this.y.e(false, this);
        if (e == ef3.bar.a) {
            return e;
        }
        return new kotlin.q(e);
    }
}
