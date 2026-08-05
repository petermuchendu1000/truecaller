package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class w1 implements com.truecaller.wizard.verification.s {
    public final java.lang.String a;
    public final long b;
    public final java.lang.String c;

    public w1(long j, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "otp");
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.wizard.verification.w1)) {
            return false;
        }
        com.truecaller.wizard.verification.w1 w1Var = (com.truecaller.wizard.verification.w1) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, w1Var.a) && this.b == w1Var.b && kotlin.jvm.internal.Intrinsics.b(this.c, w1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final java.lang.String toString() {
        return y.o.f(", otp=", this.c, ")", com.appsflyer.internal.e.q("WhatsAppOtp(phoneNumber=", this.a, ", deadline=", this.b));
    }
}
