package com.truecaller.sdk.network.legacy;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/truecaller/sdk/network/legacy/UserProfileResponse;", "", "", com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE, "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/truecaller/sdk/network/legacy/UserProfileResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSignature", "getPayload", "Companion", "po2/qux", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class UserProfileResponse {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final po2.qux Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private final java.lang.String payload;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String signature;

    public UserProfileResponse(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "payload");
        this.signature = str;
        this.payload = str2;
    }

    public static /* synthetic */ com.truecaller.sdk.network.legacy.UserProfileResponse copy$default(com.truecaller.sdk.network.legacy.UserProfileResponse userProfileResponse, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = userProfileResponse.signature;
        }
        if ((i & 2) != 0) {
            str2 = userProfileResponse.payload;
        }
        return userProfileResponse.copy(str, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSignature() {
        return this.signature;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPayload() {
        return this.payload;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.network.legacy.UserProfileResponse copy(@org.jetbrains.annotations.NotNull java.lang.String signature, @org.jetbrains.annotations.NotNull java.lang.String payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signature, com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        return new com.truecaller.sdk.network.legacy.UserProfileResponse(signature, payload);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.sdk.network.legacy.UserProfileResponse)) {
            return false;
        }
        com.truecaller.sdk.network.legacy.UserProfileResponse userProfileResponse = (com.truecaller.sdk.network.legacy.UserProfileResponse) other;
        return kotlin.jvm.internal.Intrinsics.b(this.signature, userProfileResponse.signature) && kotlin.jvm.internal.Intrinsics.b(this.payload, userProfileResponse.payload);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPayload() {
        return this.payload;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return this.payload.hashCode() + (this.signature.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("UserProfileResponse(signature=", this.signature, ", payload=", this.payload, ")");
    }
}
