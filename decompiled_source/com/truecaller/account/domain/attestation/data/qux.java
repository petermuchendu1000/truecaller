package com.truecaller.account.domain.attestation.data;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux {
    public final int a;
    public final com.truecaller.account.domain.attestation.data.a b;

    public qux(int i, com.truecaller.account.domain.attestation.data.a aVar) {
        this.a = i;
        this.b = aVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.account.domain.attestation.data.qux)) {
            return false;
        }
        com.truecaller.account.domain.attestation.data.qux quxVar = (com.truecaller.account.domain.attestation.data.qux) obj;
        return this.a == quxVar.a && kotlin.jvm.internal.Intrinsics.b(this.b, quxVar.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        com.truecaller.account.domain.attestation.data.a aVar = this.b;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final java.lang.String toString() {
        return "AttestationResponse(code=" + this.a + ", dto=" + this.b + ")";
    }
}
