package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class b0 implements com.truecaller.wizard.verification.e0 {
    public final java.lang.String a;

    public b0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.wizard.verification.b0) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.wizard.verification.b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return bar.t("NumberHint(phoneNumber=", this.a, ")");
    }
}
