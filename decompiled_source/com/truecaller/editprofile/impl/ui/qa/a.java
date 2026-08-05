package com.truecaller.editprofile.impl.ui.qa;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class a extends ff3.qux {
    public /* synthetic */ java.lang.Object x;
    public int y;
    public final /* synthetic */ com.truecaller.editprofile.impl.ui.qa.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.truecaller.editprofile.impl.ui.qa.b bVar, df3.bar barVar) {
        super(barVar);
        this.z = bVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
