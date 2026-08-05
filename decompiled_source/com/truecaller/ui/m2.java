package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class m2 implements androidx.lifecycle.r0, kotlin.jvm.internal.i {
    public final /* synthetic */ com.truecaller.ui.c2 a;

    public m2(com.truecaller.ui.c2 c2Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c2Var, "function");
        this.a = c2Var;
    }

    public final /* synthetic */ void a(java.lang.Object obj) {
        this.a.invoke(obj);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.lifecycle.r0) && (obj instanceof kotlin.jvm.internal.i)) {
            return kotlin.jvm.internal.Intrinsics.b(getFunctionDelegate(), ((kotlin.jvm.internal.i) obj).getFunctionDelegate());
        }
        return false;
    }

    public final kotlin.d getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
