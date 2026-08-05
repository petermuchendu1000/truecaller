package com.truecaller.account.domain.attestation.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/account/domain/attestation/data/VerificationAttestationErrorResponseDto;", "Lcom/truecaller/account/domain/attestation/data/e;", "", "status", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, "<init>", "(ILjava/lang/String;)V", "I", "getStatus", "()I", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class VerificationAttestationErrorResponseDto extends com.truecaller.account.domain.attestation.data.e {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String message;
    private final int status;

    public VerificationAttestationErrorResponseDto(int i, @org.jetbrains.annotations.Nullable java.lang.String str) {
        this.status = i;
        this.message = str;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final int getStatus() {
        return this.status;
    }
}
