package com.truecaller.account.domain.attestation.data;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class d {
    public final int a;
    public final com.truecaller.account.domain.attestation.data.e b;

    public d(int i, com.truecaller.account.domain.attestation.data.e eVar) {
        this.a = i;
        this.b = eVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.account.domain.attestation.data.d)) {
            return false;
        }
        com.truecaller.account.domain.attestation.data.d dVar = (com.truecaller.account.domain.attestation.data.d) obj;
        return this.a == dVar.a && kotlin.jvm.internal.Intrinsics.b(this.b, dVar.b);
    }

    public final int hashCode() {
        int i = this.a * 31;
        com.truecaller.account.domain.attestation.data.e eVar = this.b;
        return i + (eVar == null ? 0 : eVar.hashCode());
    }

    public final java.lang.String toString() {
        return "VerificationAttestationResponse(code=" + this.a + ", dto=" + this.b + ")";
    }
}
