package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class k implements com.truecaller.wizard.verification.s {
    public final java.lang.String a;
    public final boolean b;
    public final boolean c;
    public final com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement d;
    public final com.truecaller.wizard.verification.n e;
    public final long f;

    public k(java.lang.String str, boolean z, boolean z2, com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement reverseOtpChargesNotePlacement, com.truecaller.wizard.verification.n nVar, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reverseOtpChargesNotePlacement, "chargesNotePlacement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "countDownTimer");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = reverseOtpChargesNotePlacement;
        this.e = nVar;
        this.f = j;
    }

    public static com.truecaller.wizard.verification.k a(com.truecaller.wizard.verification.k kVar, boolean z, int i) {
        boolean z2;
        com.truecaller.wizard.verification.n nVar;
        java.lang.String str = kVar.a;
        if ((i & 2) != 0) {
            z = kVar.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = kVar.c;
        } else {
            z2 = false;
        }
        boolean z4 = z2;
        com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement reverseOtpChargesNotePlacement = kVar.d;
        if ((i & 16) != 0) {
            nVar = kVar.e;
        } else {
            nVar = com.truecaller.wizard.verification.l.b;
        }
        com.truecaller.wizard.verification.n nVar2 = nVar;
        long j = kVar.f;
        kVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reverseOtpChargesNotePlacement, "chargesNotePlacement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar2, "countDownTimer");
        return new com.truecaller.wizard.verification.k(str, z3, z4, reverseOtpChargesNotePlacement, nVar2, j);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.wizard.verification.k)) {
            return false;
        }
        com.truecaller.wizard.verification.k kVar = (com.truecaller.wizard.verification.k) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, kVar.a) && this.b == kVar.b && this.c == kVar.c && this.d == kVar.d && kotlin.jvm.internal.Intrinsics.b(this.e, kVar.e) && this.f == kVar.f;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        int i2 = 1237;
        if (this.b) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (hashCode + i) * 31;
        if (this.c) {
            i2 = 1231;
        }
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((i3 + i2) * 31)) * 31)) * 31;
        long j = this.f;
        return hashCode2 + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder t = ax1.bar.t("ReverseOtp(phoneNumber=", this.a, ", isSendSmsButtonEnabled=", ", isCancelButtonVisible=", this.b);
        t.append(this.c);
        t.append(", chargesNotePlacement=");
        t.append(this.d);
        t.append(", countDownTimer=");
        t.append(this.e);
        t.append(", deadline=");
        t.append(this.f);
        t.append(")");
        return t.toString();
    }
}
