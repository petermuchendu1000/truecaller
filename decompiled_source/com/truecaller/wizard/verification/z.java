package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class z implements com.truecaller.wizard.verification.e0 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public z(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "action");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.wizard.verification.z)) {
            return false;
        }
        com.truecaller.wizard.verification.z zVar = (com.truecaller.wizard.verification.z) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, zVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, zVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, zVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ax1.bar.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final java.lang.String toString() {
        return bar.v(this.c, ")", ro0.f.E("Error(title=", this.a, ", text=", this.b, ", action="));
    }
}
