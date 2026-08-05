package com.truecaller.account.domain.attestation.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/truecaller/account/domain/attestation/data/AttestationSuccessResponseDto;", "Lcom/truecaller/account/domain/attestation/data/a;", "", "ttl", "<init>", "(J)V", "J", "getTtl", "()J", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AttestationSuccessResponseDto extends com.truecaller.account.domain.attestation.data.a {
    private final long ttl;

    public AttestationSuccessResponseDto(long j) {
        this.ttl = j;
    }

    public final long getTtl() {
        return this.ttl;
    }
}
