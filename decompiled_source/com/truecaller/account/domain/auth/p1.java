package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class p1 {
    public final java.lang.String a;
    public final com.truecaller.account.domain.auth.n1 b;

    public p1(java.lang.String str, com.truecaller.account.domain.auth.n1 n1Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "tokenId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n1Var, "path");
        this.a = str;
        this.b = n1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.account.domain.auth.p1)) {
            return false;
        }
        com.truecaller.account.domain.auth.p1 p1Var = (com.truecaller.account.domain.auth.p1) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, p1Var.a) && kotlin.jvm.internal.Intrinsics.b(this.b, p1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "TokenAndPath(tokenId=" + this.a + ", path=" + this.b + ")";
    }
}
