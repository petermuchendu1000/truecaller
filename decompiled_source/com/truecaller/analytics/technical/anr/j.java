package com.truecaller.analytics.technical.anr;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class j extends ff3.qux {
    public int A;
    public /* synthetic */ java.lang.Object B;
    public final /* synthetic */ com.truecaller.analytics.technical.anr.k C;
    public int D;
    public long x;
    public kotlin.jvm.internal.i0 y;
    public java.util.Iterator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.truecaller.analytics.technical.anr.k kVar, ff3.qux quxVar) {
        super(quxVar);
        this.C = kVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(this);
    }
}
