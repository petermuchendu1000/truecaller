package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class y implements com.truecaller.wizard.verification.f0 {
    public final com.truecaller.wizard.verification.u0 a;
    public final boolean b;

    public y(com.truecaller.wizard.verification.u0 u0Var, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u0Var, "message");
        this.a = u0Var;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.wizard.verification.y)) {
            return false;
        }
        com.truecaller.wizard.verification.y yVar = (com.truecaller.wizard.verification.y) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, yVar.a) && this.b == yVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "Message(message=" + this.a + ", contactSupportEnabled=" + this.b + ")";
    }
}
