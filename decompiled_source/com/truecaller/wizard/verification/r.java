package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class r implements com.truecaller.wizard.verification.s {
    public final java.lang.String a;
    public final long b;
    public final java.lang.String c;

    public r(long j, java.lang.String str, java.lang.String str2) {
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
        if (!(obj instanceof com.truecaller.wizard.verification.r)) {
            return false;
        }
        com.truecaller.wizard.verification.r rVar = (com.truecaller.wizard.verification.r) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, rVar.a) && this.b == rVar.b && kotlin.jvm.internal.Intrinsics.b(this.c, rVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final java.lang.String toString() {
        return y.o.f(", otp=", this.c, ")", com.appsflyer.internal.e.q("SmsOtp(phoneNumber=", this.a, ", deadline=", this.b));
    }
}
