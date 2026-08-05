package com.truecaller.sdk.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/truecaller/sdk/data/HandshakeApiResponse;", "Landroid/os/Parcelable;", "bannerUrl", "", "<init>", "(Ljava/lang/String;)V", "getBannerUrl", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class HandshakeApiResponse implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.sdk.data.HandshakeApiResponse> CREATOR = new ks2.bar(13);

    @org.jetbrains.annotations.Nullable
    private final java.lang.String bannerUrl;

    public HandshakeApiResponse(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.bannerUrl = str;
    }

    public static /* synthetic */ com.truecaller.sdk.data.HandshakeApiResponse copy$default(com.truecaller.sdk.data.HandshakeApiResponse handshakeApiResponse, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = handshakeApiResponse.bannerUrl;
        }
        return handshakeApiResponse.copy(str);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBannerUrl() {
        return this.bannerUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.data.HandshakeApiResponse copy(@org.jetbrains.annotations.Nullable java.lang.String bannerUrl) {
        return new com.truecaller.sdk.data.HandshakeApiResponse(bannerUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.sdk.data.HandshakeApiResponse) && kotlin.jvm.internal.Intrinsics.b(this.bannerUrl, ((com.truecaller.sdk.data.HandshakeApiResponse) other).bannerUrl);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBannerUrl() {
        return this.bannerUrl;
    }

    public int hashCode() {
        java.lang.String str = this.bannerUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.t("HandshakeApiResponse(bannerUrl=", this.bannerUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.bannerUrl);
    }
}
