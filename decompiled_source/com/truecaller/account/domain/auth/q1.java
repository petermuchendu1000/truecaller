package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class q1 {
    public final java.lang.String a;
    public final com.truecaller.account.domain.auth.AuthTokensState b;
    public final int c;

    public q1(java.lang.String str, com.truecaller.account.domain.auth.AuthTokensState authTokensState, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authTokensState, "state");
        this.a = str;
        this.b = authTokensState;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.account.domain.auth.q1)) {
            return false;
        }
        com.truecaller.account.domain.auth.q1 q1Var = (com.truecaller.account.domain.auth.q1) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, q1Var.a) && this.b == q1Var.b && this.c == q1Var.c;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        return ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31) + this.c;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenData(token=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", unexpectedResponseCount=");
        return bar.m(this.c, ")", sb);
    }
}
