package com.truecaller.sdk.oAuth;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/truecaller/sdk/oAuth/OAuthResponseWrapper;", "", "oAuthResponse", "Lcom/truecaller/android/sdk/oAuth/OAuthResponse;", "wrapperExtras", "Lcom/truecaller/sdk/oAuth/WrapperExtras;", "<init>", "(Lcom/truecaller/android/sdk/oAuth/OAuthResponse;Lcom/truecaller/sdk/oAuth/WrapperExtras;)V", "getOAuthResponse", "()Lcom/truecaller/android/sdk/oAuth/OAuthResponse;", "getWrapperExtras", "()Lcom/truecaller/sdk/oAuth/WrapperExtras;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class OAuthResponseWrapper {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.android.sdk.oAuth.OAuthResponse oAuthResponse;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.sdk.oAuth.WrapperExtras wrapperExtras;

    public OAuthResponseWrapper(@org.jetbrains.annotations.NotNull com.truecaller.android.sdk.oAuth.OAuthResponse oAuthResponse, @org.jetbrains.annotations.Nullable com.truecaller.sdk.oAuth.WrapperExtras wrapperExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthResponse, "oAuthResponse");
        this.oAuthResponse = oAuthResponse;
        this.wrapperExtras = wrapperExtras;
    }

    public static /* synthetic */ com.truecaller.sdk.oAuth.OAuthResponseWrapper copy$default(com.truecaller.sdk.oAuth.OAuthResponseWrapper oAuthResponseWrapper, com.truecaller.android.sdk.oAuth.OAuthResponse oAuthResponse, com.truecaller.sdk.oAuth.WrapperExtras wrapperExtras, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            oAuthResponse = oAuthResponseWrapper.oAuthResponse;
        }
        if ((i & 2) != 0) {
            wrapperExtras = oAuthResponseWrapper.wrapperExtras;
        }
        return oAuthResponseWrapper.copy(oAuthResponse, wrapperExtras);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.android.sdk.oAuth.OAuthResponse getOAuthResponse() {
        return this.oAuthResponse;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.sdk.oAuth.WrapperExtras getWrapperExtras() {
        return this.wrapperExtras;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.oAuth.OAuthResponseWrapper copy(@org.jetbrains.annotations.NotNull com.truecaller.android.sdk.oAuth.OAuthResponse oAuthResponse, @org.jetbrains.annotations.Nullable com.truecaller.sdk.oAuth.WrapperExtras wrapperExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oAuthResponse, "oAuthResponse");
        return new com.truecaller.sdk.oAuth.OAuthResponseWrapper(oAuthResponse, wrapperExtras);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.sdk.oAuth.OAuthResponseWrapper)) {
            return false;
        }
        com.truecaller.sdk.oAuth.OAuthResponseWrapper oAuthResponseWrapper = (com.truecaller.sdk.oAuth.OAuthResponseWrapper) other;
        return kotlin.jvm.internal.Intrinsics.b(this.oAuthResponse, oAuthResponseWrapper.oAuthResponse) && kotlin.jvm.internal.Intrinsics.b(this.wrapperExtras, oAuthResponseWrapper.wrapperExtras);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.android.sdk.oAuth.OAuthResponse getOAuthResponse() {
        return this.oAuthResponse;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.sdk.oAuth.WrapperExtras getWrapperExtras() {
        return this.wrapperExtras;
    }

    public int hashCode() {
        int hashCode = this.oAuthResponse.hashCode() * 31;
        com.truecaller.sdk.oAuth.WrapperExtras wrapperExtras = this.wrapperExtras;
        return hashCode + (wrapperExtras == null ? 0 : wrapperExtras.hashCode());
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "OAuthResponseWrapper(oAuthResponse=" + this.oAuthResponse + ", wrapperExtras=" + this.wrapperExtras + ")";
    }
}
