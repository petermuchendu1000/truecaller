package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class c implements com.truecaller.wizard.verification.s {
    public final java.lang.String a;
    public final long b;

    public c(java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
        this.a = str;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.wizard.verification.c)) {
            return false;
        }
        com.truecaller.wizard.verification.c cVar = (com.truecaller.wizard.verification.c) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, cVar.a) && this.b == cVar.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder q = com.appsflyer.internal.e.q("DropCallOtp(phoneNumber=", this.a, ", deadline=", this.b);
        q.append(")");
        return q.toString();
    }
}
