package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class o1 {
    public final java.lang.String a;
    public final long b;
    public final long c;

    public o1(java.lang.String str, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "token");
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.account.domain.auth.o1)) {
            return false;
        }
        com.truecaller.account.domain.auth.o1 o1Var = (com.truecaller.account.domain.auth.o1) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, o1Var.a) && this.b == o1Var.b && this.c == o1Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final java.lang.String toString() {
        return d4.t.o(com.appsflyer.internal.e.q("Token(token=", this.a, ", expiresAt=", this.b), this.c, ", createdAt=", ")");
    }
}
