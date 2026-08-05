package com.truecaller.sdk.oAuth.networking.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/truecaller/sdk/oAuth/networking/data/AuthCodeRequest;", "", "requestId", "", "clientId", "responseType", "codeChallenge", "codeChallengeMethod", "scope", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getClientId", "getResponseType", "getCodeChallenge", "getCodeChallengeMethod", "getScope", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class AuthCodeRequest {
    public static final int $stable = 0;

    @bw.qux("client_id")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String clientId;

    @bw.qux("code_challenge")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String codeChallenge;

    @bw.qux("code_challenge_method")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String codeChallengeMethod;

    @bw.qux("request_id")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String requestId;

    @bw.qux("response_type")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String responseType;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String scope;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String state;

    public AuthCodeRequest(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.NotNull java.lang.String str5, @org.jetbrains.annotations.NotNull java.lang.String str6, @org.jetbrains.annotations.NotNull java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "clientId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "responseType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "codeChallenge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "codeChallengeMethod");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "state");
        this.requestId = str;
        this.clientId = str2;
        this.responseType = str3;
        this.codeChallenge = str4;
        this.codeChallengeMethod = str5;
        this.scope = str6;
        this.state = str7;
    }

    public static /* synthetic */ com.truecaller.sdk.oAuth.networking.data.AuthCodeRequest copy$default(com.truecaller.sdk.oAuth.networking.data.AuthCodeRequest authCodeRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = authCodeRequest.requestId;
        }
        if ((i & 2) != 0) {
            str2 = authCodeRequest.clientId;
        }
        if ((i & 4) != 0) {
            str3 = authCodeRequest.responseType;
        }
        if ((i & 8) != 0) {
            str4 = authCodeRequest.codeChallenge;
        }
        if ((i & 16) != 0) {
            str5 = authCodeRequest.codeChallengeMethod;
        }
        if ((i & 32) != 0) {
            str6 = authCodeRequest.scope;
        }
        if ((i & 64) != 0) {
            str7 = authCodeRequest.state;
        }
        java.lang.String str8 = str6;
        java.lang.String str9 = str7;
        java.lang.String str10 = str5;
        java.lang.String str11 = str3;
        return authCodeRequest.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getClientId() {
        return this.clientId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getResponseType() {
        return this.responseType;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCodeChallenge() {
        return this.codeChallenge;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getScope() {
        return this.scope;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component7, reason: from getter */
    public final java.lang.String getState() {
        return this.state;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.oAuth.networking.data.AuthCodeRequest copy(@org.jetbrains.annotations.NotNull java.lang.String requestId, @org.jetbrains.annotations.NotNull java.lang.String clientId, @org.jetbrains.annotations.NotNull java.lang.String responseType, @org.jetbrains.annotations.NotNull java.lang.String codeChallenge, @org.jetbrains.annotations.NotNull java.lang.String codeChallengeMethod, @org.jetbrains.annotations.NotNull java.lang.String scope, @org.jetbrains.annotations.NotNull java.lang.String state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "clientId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseType, "responseType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        return new com.truecaller.sdk.oAuth.networking.data.AuthCodeRequest(requestId, clientId, responseType, codeChallenge, codeChallengeMethod, scope, state);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.sdk.oAuth.networking.data.AuthCodeRequest)) {
            return false;
        }
        com.truecaller.sdk.oAuth.networking.data.AuthCodeRequest authCodeRequest = (com.truecaller.sdk.oAuth.networking.data.AuthCodeRequest) other;
        return kotlin.jvm.internal.Intrinsics.b(this.requestId, authCodeRequest.requestId) && kotlin.jvm.internal.Intrinsics.b(this.clientId, authCodeRequest.clientId) && kotlin.jvm.internal.Intrinsics.b(this.responseType, authCodeRequest.responseType) && kotlin.jvm.internal.Intrinsics.b(this.codeChallenge, authCodeRequest.codeChallenge) && kotlin.jvm.internal.Intrinsics.b(this.codeChallengeMethod, authCodeRequest.codeChallengeMethod) && kotlin.jvm.internal.Intrinsics.b(this.scope, authCodeRequest.scope) && kotlin.jvm.internal.Intrinsics.b(this.state, authCodeRequest.state);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getClientId() {
        return this.clientId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCodeChallenge() {
        return this.codeChallenge;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getResponseType() {
        return this.responseType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getScope() {
        return this.scope;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode() + ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(this.requestId.hashCode() * 31, 31, this.clientId), 31, this.responseType), 31, this.codeChallenge), 31, this.codeChallengeMethod), 31, this.scope);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.requestId;
        java.lang.String str2 = this.clientId;
        java.lang.String str3 = this.responseType;
        java.lang.String str4 = this.codeChallenge;
        java.lang.String str5 = this.codeChallengeMethod;
        java.lang.String str6 = this.scope;
        java.lang.String str7 = this.state;
        java.lang.StringBuilder E = ro0.f.E("AuthCodeRequest(requestId=", str, ", clientId=", str2, ", responseType=");
        bar.E(E, str3, ", codeChallenge=", str4, ", codeChallengeMethod=");
        bar.E(E, str5, ", scope=", str6, ", state=");
        return bar.v(str7, ")", E);
    }

    public /* synthetic */ AuthCodeRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "code" : str3, str4, (i & 16) != 0 ? "S256" : str5, str6, str7);
    }
}
