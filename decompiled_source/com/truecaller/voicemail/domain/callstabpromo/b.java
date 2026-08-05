package com.truecaller.voicemail.domain.callstabpromo;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class b extends ff3.qux {
    public /* synthetic */ java.lang.Object x;
    public final /* synthetic */ com.truecaller.voicemail.domain.callstabpromo.c y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.truecaller.voicemail.domain.callstabpromo.c cVar, ff3.qux quxVar) {
        super(quxVar);
        this.y = cVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(this);
    }
}
