package com.truecaller.profile.impl.remote.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/truecaller/profile/impl/remote/model/OnlineIds;", "", "facebookId", "", "email", "url", "googleIdToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFacebookId", "()Ljava/lang/String;", "getEmail", "getUrl", "getGoogleIdToken", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class OnlineIds {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String email;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String facebookId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String googleIdToken;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String url;

    public OnlineIds(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4) {
        this.facebookId = str;
        this.email = str2;
        this.url = str3;
        this.googleIdToken = str4;
    }

    public static /* synthetic */ com.truecaller.profile.impl.remote.model.OnlineIds copy$default(com.truecaller.profile.impl.remote.model.OnlineIds onlineIds, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = onlineIds.facebookId;
        }
        if ((i & 2) != 0) {
            str2 = onlineIds.email;
        }
        if ((i & 4) != 0) {
            str3 = onlineIds.url;
        }
        if ((i & 8) != 0) {
            str4 = onlineIds.googleIdToken;
        }
        return onlineIds.copy(str, str2, str3, str4);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFacebookId() {
        return this.facebookId;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getGoogleIdToken() {
        return this.googleIdToken;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.profile.impl.remote.model.OnlineIds copy(@org.jetbrains.annotations.Nullable java.lang.String facebookId, @org.jetbrains.annotations.Nullable java.lang.String email, @org.jetbrains.annotations.Nullable java.lang.String url, @org.jetbrains.annotations.Nullable java.lang.String googleIdToken) {
        return new com.truecaller.profile.impl.remote.model.OnlineIds(facebookId, email, url, googleIdToken);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.profile.impl.remote.model.OnlineIds)) {
            return false;
        }
        com.truecaller.profile.impl.remote.model.OnlineIds onlineIds = (com.truecaller.profile.impl.remote.model.OnlineIds) other;
        return kotlin.jvm.internal.Intrinsics.b(this.facebookId, onlineIds.facebookId) && kotlin.jvm.internal.Intrinsics.b(this.email, onlineIds.email) && kotlin.jvm.internal.Intrinsics.b(this.url, onlineIds.url) && kotlin.jvm.internal.Intrinsics.b(this.googleIdToken, onlineIds.googleIdToken);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return this.email;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFacebookId() {
        return this.facebookId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGoogleIdToken() {
        return this.googleIdToken;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUrl() {
        return this.url;
    }

    public int hashCode() {
        java.lang.String str = this.facebookId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.email;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.googleIdToken;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.facebookId;
        java.lang.String str2 = this.email;
        return bar.x(ro0.f.E("OnlineIds(facebookId=", str, ", email=", str2, ", url="), this.url, ", googleIdToken=", this.googleIdToken, ")");
    }

    public /* synthetic */ OnlineIds(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
