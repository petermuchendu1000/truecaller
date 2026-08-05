package com.truecaller.browser.extension.remote;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class baz extends ff3.qux {
    public /* synthetic */ java.lang.Object x;
    public final /* synthetic */ com.truecaller.browser.extension.remote.qux y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baz(com.truecaller.browser.extension.remote.qux quxVar, ff3.qux quxVar2) {
        super(quxVar2);
        this.y = quxVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(null, this);
    }
}
