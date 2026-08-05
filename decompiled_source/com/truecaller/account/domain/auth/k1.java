package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class k1 {
    public final java.lang.String a;
    public final long b;
    public final long c;

    public k1(java.lang.String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.account.domain.auth.k1)) {
            return false;
        }
        com.truecaller.account.domain.auth.k1 k1Var = (com.truecaller.account.domain.auth.k1) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, k1Var.a) && this.b == k1Var.b && this.c == k1Var.c;
    }

    public final int hashCode() {
        int hashCode;
        java.lang.String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.b;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final java.lang.String toString() {
        return d4.t.o(com.appsflyer.internal.e.q("InstallationId(installationId=", this.a, ", fetchTime=", this.b), this.c, ", ttlMillis=", ")");
    }
}
