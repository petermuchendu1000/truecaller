package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class q {
    public final java.util.List a;
    public final java.lang.String b;
    public final java.lang.String c;

    public q(java.util.List list, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "resolvedFlags");
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.remoteconfig.experiment.q)) {
            return false;
        }
        com.truecaller.remoteconfig.experiment.q qVar = (com.truecaller.remoteconfig.experiment.q) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, qVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, qVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, qVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExperimentConfigEntity(resolvedFlags=");
        sb.append(this.a);
        sb.append(", resolveId=");
        sb.append(this.b);
        sb.append(", resolveToken=");
        return bar.v(this.c, ")", sb);
    }
}
