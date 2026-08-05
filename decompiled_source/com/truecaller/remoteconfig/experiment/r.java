package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class r {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public r(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "flag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "variant");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "value");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.remoteconfig.experiment.r)) {
            return false;
        }
        com.truecaller.remoteconfig.experiment.r rVar = (com.truecaller.remoteconfig.experiment.r) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, rVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, rVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ax1.bar.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final java.lang.String toString() {
        return bar.v(this.c, ")", ro0.f.E("ExperimentConfigEntityFlag(flag=", this.a, ", variant=", this.b, ", value="));
    }
}
