package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class a1 {
    public final com.truecaller.account.domain.auth.z0 a;
    public final com.truecaller.account.domain.auth.AuthTokensState b;
    public final int c;

    public a1(com.truecaller.account.domain.auth.z0 z0Var, com.truecaller.account.domain.auth.AuthTokensState authTokensState, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authTokensState, "state");
        this.a = z0Var;
        this.b = authTokensState;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.account.domain.auth.a1)) {
            return false;
        }
        com.truecaller.account.domain.auth.a1 a1Var = (com.truecaller.account.domain.auth.a1) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, a1Var.a) && this.b == a1Var.b && this.c == a1Var.c;
    }

    public final int hashCode() {
        com.truecaller.account.domain.auth.z0 z0Var = this.a;
        return ((this.b.hashCode() + ((z0Var == null ? 0 : z0Var.hashCode()) * 31)) * 31) + this.c;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfigData(config=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", unexpectedResponseCount=");
        return bar.m(this.c, ")", sb);
    }
}
