package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class m0 extends com.truecaller.ui.n0 {
    public final pt2.qux a;

    public m0(pt2.qux quxVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "dialogResolver");
        this.a = quxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.ui.m0) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.ui.m0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ShowDialog(dialogResolver=" + this.a + ")";
    }
}
