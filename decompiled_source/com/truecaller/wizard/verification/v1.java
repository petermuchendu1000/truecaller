package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class v1 {
    public final com.truecaller.wizard.verification.s a;
    public final com.truecaller.wizard.verification.f0 b;
    public final java.lang.Integer c;

    public v1(com.truecaller.wizard.verification.s sVar, com.truecaller.wizard.verification.f0 f0Var, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "view");
        this.a = sVar;
        this.b = f0Var;
        this.c = num;
    }

    public static com.truecaller.wizard.verification.v1 a(com.truecaller.wizard.verification.v1 v1Var, com.truecaller.wizard.verification.s sVar, com.truecaller.wizard.verification.f0 f0Var, java.lang.Integer num, int i) {
        if ((i & 1) != 0) {
            sVar = v1Var.a;
        }
        if ((i & 2) != 0) {
            f0Var = v1Var.b;
        }
        if ((i & 4) != 0) {
            num = v1Var.c;
        }
        v1Var.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "view");
        return new com.truecaller.wizard.verification.v1(sVar, f0Var, num);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.wizard.verification.v1)) {
            return false;
        }
        com.truecaller.wizard.verification.v1 v1Var = (com.truecaller.wizard.verification.v1) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, v1Var.a) && kotlin.jvm.internal.Intrinsics.b(this.b, v1Var.b) && kotlin.jvm.internal.Intrinsics.b(this.c, v1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.truecaller.wizard.verification.f0 f0Var = this.b;
        int hashCode2 = (hashCode + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        java.lang.Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VerificationUiState(view=");
        sb.append(this.a);
        sb.append(", dialog=");
        sb.append(this.b);
        sb.append(", toast=");
        return com.appsflyer.internal.e.m(sb, this.c, ")");
    }
}
