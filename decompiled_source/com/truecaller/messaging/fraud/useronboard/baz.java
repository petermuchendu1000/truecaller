package com.truecaller.messaging.fraud.useronboard;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class baz implements oo1.h {
    public final qc3.bar a;

    public baz(qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "fraudUserOnboardManager");
        this.a = barVar;
    }

    @Override // oo1.h
    public final void a(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        if (z) {
            ((rv1.bar) this.a.get()).d();
        }
    }
}
