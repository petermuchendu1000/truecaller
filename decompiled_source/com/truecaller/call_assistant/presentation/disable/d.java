package com.truecaller.call_assistant.presentation.disable;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class d extends ff3.qux {
    public /* synthetic */ java.lang.Object x;
    public int y;
    public final /* synthetic */ com.truecaller.call_assistant.presentation.disable.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.truecaller.call_assistant.presentation.disable.e eVar, df3.bar barVar) {
        super(barVar);
        this.z = eVar;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
