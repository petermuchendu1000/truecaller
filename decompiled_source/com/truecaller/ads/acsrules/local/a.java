package com.truecaller.ads.acsrules.local;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class a extends ff3.qux {
    public /* synthetic */ java.lang.Object x;
    public final /* synthetic */ com.truecaller.ads.acsrules.local.b y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.truecaller.ads.acsrules.local.b bVar, ff3.qux quxVar) {
        super(quxVar);
        this.y = bVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(this);
    }
}
