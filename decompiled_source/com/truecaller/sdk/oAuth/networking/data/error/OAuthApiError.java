package com.truecaller.sdk.oAuth.networking.data.error;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lcom/truecaller/sdk/oAuth/networking/data/error/OAuthApiError;", "Lxo2/bar;", "", com.truecaller.suspension.data.UnSuspendAccountSuccessResponseDto.REASON_ERROR, "errorDescription", "errorReason", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "errorCode", "()I", "errorMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/truecaller/sdk/oAuth/networking/data/error/OAuthApiError;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getError", "getErrorDescription", "getErrorReason", "getState", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class OAuthApiError extends xo2.bar {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String error;

    @bw.qux("error_description")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String errorDescription;

    @bw.qux("error_reason")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String errorReason;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String state;

    public OAuthApiError(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.suspension.data.UnSuspendAccountSuccessResponseDto.REASON_ERROR);
        this.error = str;
        this.errorDescription = str2;
        this.errorReason = str3;
        this.state = str4;
    }

    public static /* synthetic */ com.truecaller.sdk.oAuth.networking.data.error.OAuthApiError copy$default(com.truecaller.sdk.oAuth.networking.data.error.OAuthApiError oAuthApiError, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = oAuthApiError.error;
        }
        if ((i & 2) != 0) {
            str2 = oAuthApiError.errorDescription;
        }
        if ((i & 4) != 0) {
            str3 = oAuthApiError.errorReason;
        }
        if ((i & 8) != 0) {
            str4 = oAuthApiError.state;
        }
        return oAuthApiError.copy(str, str2, str3, str4);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getError() {
        return this.error;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getErrorDescription() {
        return this.errorDescription;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getErrorReason() {
        return this.errorReason;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getState() {
        return this.state;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.oAuth.networking.data.error.OAuthApiError copy(@org.jetbrains.annotations.NotNull java.lang.String error, @org.jetbrains.annotations.Nullable java.lang.String errorDescription, @org.jetbrains.annotations.Nullable java.lang.String errorReason, @org.jetbrains.annotations.Nullable java.lang.String state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, com.truecaller.suspension.data.UnSuspendAccountSuccessResponseDto.REASON_ERROR);
        return new com.truecaller.sdk.oAuth.networking.data.error.OAuthApiError(error, errorDescription, errorReason, state);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.sdk.oAuth.networking.data.error.OAuthApiError)) {
            return false;
        }
        com.truecaller.sdk.oAuth.networking.data.error.OAuthApiError oAuthApiError = (com.truecaller.sdk.oAuth.networking.data.error.OAuthApiError) other;
        return kotlin.jvm.internal.Intrinsics.b(this.error, oAuthApiError.error) && kotlin.jvm.internal.Intrinsics.b(this.errorDescription, oAuthApiError.errorDescription) && kotlin.jvm.internal.Intrinsics.b(this.errorReason, oAuthApiError.errorReason) && kotlin.jvm.internal.Intrinsics.b(this.state, oAuthApiError.state);
    }

    @Override // xo2.bar
    public int errorCode() {
        return getCode();
    }

    @Override // xo2.bar
    @org.jetbrains.annotations.NotNull
    public java.lang.String errorMessage() {
        java.lang.String str = this.errorDescription;
        if (str == null) {
            java.lang.String str2 = this.errorReason;
            if (str2 == null) {
                return this.error;
            }
            return str2;
        }
        return str;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getError() {
        return this.error;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getErrorDescription() {
        return this.errorDescription;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getErrorReason() {
        return this.errorReason;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getState() {
        return this.state;
    }

    public int hashCode() {
        int hashCode = this.error.hashCode() * 31;
        java.lang.String str = this.errorDescription;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.errorReason;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.state;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.error;
        java.lang.String str2 = this.errorDescription;
        return bar.x(ro0.f.E("OAuthApiError(error=", str, ", errorDescription=", str2, ", errorReason="), this.errorReason, ", state=", this.state, ")");
    }
}
