package com.truecaller.sdk.oAuth.networking.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/truecaller/sdk/oAuth/networking/data/AuthCodeResponse;", "", "code", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "fingerprint", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getPackageName", "getFingerprint", "getState", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class AuthCodeResponse {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String code;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String fingerprint;

    @bw.qux("package_name")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String packageName;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String state;

    public AuthCodeResponse(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "code");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "fingerprint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "state");
        this.code = str;
        this.packageName = str2;
        this.fingerprint = str3;
        this.state = str4;
    }

    public static /* synthetic */ com.truecaller.sdk.oAuth.networking.data.AuthCodeResponse copy$default(com.truecaller.sdk.oAuth.networking.data.AuthCodeResponse authCodeResponse, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = authCodeResponse.code;
        }
        if ((i & 2) != 0) {
            str2 = authCodeResponse.packageName;
        }
        if ((i & 4) != 0) {
            str3 = authCodeResponse.fingerprint;
        }
        if ((i & 8) != 0) {
            str4 = authCodeResponse.state;
        }
        return authCodeResponse.copy(str, str2, str3, str4);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFingerprint() {
        return this.fingerprint;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getState() {
        return this.state;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.oAuth.networking.data.AuthCodeResponse copy(@org.jetbrains.annotations.NotNull java.lang.String code, @org.jetbrains.annotations.NotNull java.lang.String packageName, @org.jetbrains.annotations.NotNull java.lang.String fingerprint, @org.jetbrains.annotations.NotNull java.lang.String state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "code");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        return new com.truecaller.sdk.oAuth.networking.data.AuthCodeResponse(code, packageName, fingerprint, state);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.sdk.oAuth.networking.data.AuthCodeResponse)) {
            return false;
        }
        com.truecaller.sdk.oAuth.networking.data.AuthCodeResponse authCodeResponse = (com.truecaller.sdk.oAuth.networking.data.AuthCodeResponse) other;
        return kotlin.jvm.internal.Intrinsics.b(this.code, authCodeResponse.code) && kotlin.jvm.internal.Intrinsics.b(this.packageName, authCodeResponse.packageName) && kotlin.jvm.internal.Intrinsics.b(this.fingerprint, authCodeResponse.fingerprint) && kotlin.jvm.internal.Intrinsics.b(this.state, authCodeResponse.state);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCode() {
        return this.code;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFingerprint() {
        return this.fingerprint;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode() + ax1.bar.e(ax1.bar.e(this.code.hashCode() * 31, 31, this.packageName), 31, this.fingerprint);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.code;
        java.lang.String str2 = this.packageName;
        return bar.x(ro0.f.E("AuthCodeResponse(code=", str, ", packageName=", str2, ", fingerprint="), this.fingerprint, ", state=", this.state, ")");
    }
}
