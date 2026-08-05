package com.truecaller.profile.impl.remote.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/truecaller/profile/impl/remote/model/EmailVerificationResponseDto;", "", "verified", "", "<init>", "(Z)V", "getVerified", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class EmailVerificationResponseDto {
    public static final int $stable = 0;
    private final boolean verified;

    public EmailVerificationResponseDto(boolean z) {
        this.verified = z;
    }

    public static /* synthetic */ com.truecaller.profile.impl.remote.model.EmailVerificationResponseDto copy$default(com.truecaller.profile.impl.remote.model.EmailVerificationResponseDto emailVerificationResponseDto, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = emailVerificationResponseDto.verified;
        }
        return emailVerificationResponseDto.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getVerified() {
        return this.verified;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.profile.impl.remote.model.EmailVerificationResponseDto copy(boolean verified) {
        return new com.truecaller.profile.impl.remote.model.EmailVerificationResponseDto(verified);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.profile.impl.remote.model.EmailVerificationResponseDto) && this.verified == ((com.truecaller.profile.impl.remote.model.EmailVerificationResponseDto) other).verified;
    }

    public final boolean getVerified() {
        return this.verified;
    }

    public int hashCode() {
        return this.verified ? 1231 : 1237;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.D("EmailVerificationResponseDto(verified=", ")", this.verified);
    }
}
