package com.truecaller.account.domain.attestation.data;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0005J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\b\u0001\u0010\b\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\b\u0001\u0010\b\u001a\u00020\rH'¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/truecaller/account/domain/attestation/data/b;", "", "Lwj3/a;", "Lcom/truecaller/account/domain/attestation/data/AttestationNonceDto;", "a", "()Lwj3/a;", "d", "Lcom/truecaller/account/domain/attestation/data/AttestationRequestDto;", "requestDto", "Lcom/truecaller/account/domain/attestation/data/AttestationSuccessResponseDto;", "c", "(Lcom/truecaller/account/domain/attestation/data/AttestationRequestDto;)Lwj3/a;", "e", "Lcom/truecaller/account/domain/attestation/data/VerificationAttestationRequestDto;", "Lokhttp3/ResponseBody;", "b", "(Lcom/truecaller/account/domain/attestation/data/VerificationAttestationRequestDto;)Lwj3/a;", "f", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
interface b {
    @ak3.c("/v1/attestation/huawei/getNonce")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.account.domain.attestation.data.AttestationNonceDto> a();

    @ak3.l("/v1/prever/huawei/verify/")
    @org.jetbrains.annotations.NotNull
    wj3.a<okhttp3.ResponseBody> b(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.account.domain.attestation.data.VerificationAttestationRequestDto requestDto);

    @ak3.l("/v1/attestation/huawei/verify")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.account.domain.attestation.data.AttestationSuccessResponseDto> c(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.account.domain.attestation.data.AttestationRequestDto requestDto);

    @ak3.c("/v1/playintegrity/android/getNonce")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.account.domain.attestation.data.AttestationNonceDto> d();

    @ak3.l("/v1/playintegrity/android/verify")
    @org.jetbrains.annotations.NotNull
    wj3.a<com.truecaller.account.domain.attestation.data.AttestationSuccessResponseDto> e(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.account.domain.attestation.data.AttestationRequestDto requestDto);

    @ak3.l("/v1/prever/playintegrity/verify/")
    @org.jetbrains.annotations.NotNull
    wj3.a<okhttp3.ResponseBody> f(@ak3.bar @org.jetbrains.annotations.NotNull com.truecaller.account.domain.attestation.data.VerificationAttestationRequestDto requestDto);
}
