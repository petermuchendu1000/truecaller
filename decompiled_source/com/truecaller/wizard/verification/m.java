package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class m extends com.truecaller.wizard.verification.n {
    public final long b;

    public m(long j) {
        super(j);
        this.b = j;
    }

    @Override // com.truecaller.wizard.verification.n
    public final long a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.wizard.verification.m) && this.b == ((com.truecaller.wizard.verification.m) obj).b;
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return com.ironsource.adqualitysdk.sdk.i.bar.m(this.b, "Timer(deadline=", ")");
    }
}
