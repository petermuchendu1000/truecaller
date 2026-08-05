package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class a0 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;

    public a0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "value");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.remoteconfig.experiment.a0)) {
            return false;
        }
        com.truecaller.remoteconfig.experiment.a0 a0Var = (com.truecaller.remoteconfig.experiment.a0) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, a0Var.a) && kotlin.jvm.internal.Intrinsics.b(this.b, a0Var.b) && kotlin.jvm.internal.Intrinsics.b(this.c, a0Var.c) && kotlin.jvm.internal.Intrinsics.b(this.d, a0Var.d);
    }

    public final int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        java.lang.String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        java.lang.String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final java.lang.String toString() {
        return bar.x(ro0.f.E("ExperimentFlag(name=", this.a, ", value=", this.b, ", resolveId="), this.c, ", token=", this.d, ")");
    }
}
