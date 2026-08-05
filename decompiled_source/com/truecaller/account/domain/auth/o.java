package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class o {
    public long a = 0;
    public int b = 0;
    public int c = 0;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.account.domain.auth.o)) {
            return false;
        }
        com.truecaller.account.domain.auth.o oVar = (com.truecaller.account.domain.auth.o) obj;
        return this.a == oVar.a && this.b == oVar.b && this.c == oVar.c;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        long j = this.a;
        int i = this.b;
        return t.c.q(com.google.android.gms.internal.ads.yj.e(i, "RetryBackoffState(nextRetryTime=", ", unexpectedResponseCount=", j), ", unexpectedExceptionsCount=", this.c, ")");
    }
}
