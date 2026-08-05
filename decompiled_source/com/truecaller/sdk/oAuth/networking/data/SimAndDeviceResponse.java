package com.truecaller.sdk.oAuth.networking.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/sdk/oAuth/networking/data/SimAndDeviceResponse;", "", "simStatus", "", "pseudoDeviceCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSimStatus", "()Ljava/lang/String;", "getPseudoDeviceCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class SimAndDeviceResponse {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String pseudoDeviceCode;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String simStatus;

    public SimAndDeviceResponse(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "simStatus");
        this.simStatus = str;
        this.pseudoDeviceCode = str2;
    }

    public static /* synthetic */ com.truecaller.sdk.oAuth.networking.data.SimAndDeviceResponse copy$default(com.truecaller.sdk.oAuth.networking.data.SimAndDeviceResponse simAndDeviceResponse, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = simAndDeviceResponse.simStatus;
        }
        if ((i & 2) != 0) {
            str2 = simAndDeviceResponse.pseudoDeviceCode;
        }
        return simAndDeviceResponse.copy(str, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSimStatus() {
        return this.simStatus;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPseudoDeviceCode() {
        return this.pseudoDeviceCode;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.oAuth.networking.data.SimAndDeviceResponse copy(@org.jetbrains.annotations.NotNull java.lang.String simStatus, @org.jetbrains.annotations.Nullable java.lang.String pseudoDeviceCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simStatus, "simStatus");
        return new com.truecaller.sdk.oAuth.networking.data.SimAndDeviceResponse(simStatus, pseudoDeviceCode);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.sdk.oAuth.networking.data.SimAndDeviceResponse)) {
            return false;
        }
        com.truecaller.sdk.oAuth.networking.data.SimAndDeviceResponse simAndDeviceResponse = (com.truecaller.sdk.oAuth.networking.data.SimAndDeviceResponse) other;
        return kotlin.jvm.internal.Intrinsics.b(this.simStatus, simAndDeviceResponse.simStatus) && kotlin.jvm.internal.Intrinsics.b(this.pseudoDeviceCode, simAndDeviceResponse.pseudoDeviceCode);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPseudoDeviceCode() {
        return this.pseudoDeviceCode;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSimStatus() {
        return this.simStatus;
    }

    public int hashCode() {
        int hashCode = this.simStatus.hashCode() * 31;
        java.lang.String str = this.pseudoDeviceCode;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("SimAndDeviceResponse(simStatus=", this.simStatus, ", pseudoDeviceCode=", this.pseudoDeviceCode, ")");
    }
}
