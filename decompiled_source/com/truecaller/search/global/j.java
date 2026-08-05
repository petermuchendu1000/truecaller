package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class j implements ig3.j {
    public final /* synthetic */ com.truecaller.search.global.m a;

    public j(com.truecaller.search.global.m mVar) {
        this.a = mVar;
    }

    public final java.lang.Object emit(java.lang.Object obj, df3.bar barVar) {
        if (kotlin.jvm.internal.Intrinsics.b((rp2.b) obj, rp2.a.a)) {
            com.truecaller.search.global.m mVar = this.a;
            if (mVar.w) {
                com.truecaller.search.global.a0 a0Var = mVar.i;
                if (a0Var != null) {
                    com.truecaller.search.global.h0 h0Var = (com.truecaller.search.global.h0) a0Var;
                    if (!kotlin.text.StringsKt.X(h0Var.e0)) {
                        d62.bar barVar2 = (d62.bar) h0Var.T.get();
                        barVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("globalSearch", "context");
                        barVar2.a("globalSearch", "SearchTriggered");
                        h0Var.x2(false);
                    }
                    mVar.w = false;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
                    throw null;
                }
            }
        }
        return kotlin.Unit.a;
    }
}
