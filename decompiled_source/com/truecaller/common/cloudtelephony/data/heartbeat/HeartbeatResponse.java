package com.truecaller.common.cloudtelephony.data.heartbeat;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/common/cloudtelephony/data/heartbeat/HeartbeatResponse;", "", "success", "", "message", "", "<init>", "(ZLjava/lang/String;)V", "getSuccess", "()Z", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "common-cloud-telephony_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final /* data */ class HeartbeatResponse {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String message;
    private final boolean success;

    public HeartbeatResponse(boolean z, @org.jetbrains.annotations.Nullable java.lang.String str) {
        this.success = z;
        this.message = str;
    }

    public static /* synthetic */ com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatResponse copy$default(com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatResponse heartbeatResponse, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = heartbeatResponse.success;
        }
        if ((i & 2) != 0) {
            str = heartbeatResponse.message;
        }
        return heartbeatResponse.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatResponse copy(boolean success, @org.jetbrains.annotations.Nullable java.lang.String message) {
        return new com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatResponse(success, message);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatResponse)) {
            return false;
        }
        com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatResponse heartbeatResponse = (com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatResponse) other;
        return this.success == heartbeatResponse.success && kotlin.jvm.internal.Intrinsics.b(this.message, heartbeatResponse.message);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int i;
        int hashCode;
        if (this.success) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i2 = i * 31;
        java.lang.String str = this.message;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i2 + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bx.e1.s("HeartbeatResponse(success=", this.success, ", message=", this.message, ")");
    }

    public /* synthetic */ HeartbeatResponse(boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str);
    }
}
