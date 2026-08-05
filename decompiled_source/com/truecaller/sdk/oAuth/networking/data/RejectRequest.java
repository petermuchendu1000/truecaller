package com.truecaller.sdk.oAuth.networking.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/truecaller/sdk/oAuth/networking/data/RejectRequest;", "", "requestId", "", "clientId", "rejectionReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getClientId", "getRejectionReason", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class RejectRequest {
    public static final int $stable = 0;

    @bw.qux("client_id")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String clientId;

    @bw.qux("rejection_reason")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String rejectionReason;

    @bw.qux("request_id")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String requestId;

    public RejectRequest(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "clientId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "rejectionReason");
        this.requestId = str;
        this.clientId = str2;
        this.rejectionReason = str3;
    }

    public static /* synthetic */ com.truecaller.sdk.oAuth.networking.data.RejectRequest copy$default(com.truecaller.sdk.oAuth.networking.data.RejectRequest rejectRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = rejectRequest.requestId;
        }
        if ((i & 2) != 0) {
            str2 = rejectRequest.clientId;
        }
        if ((i & 4) != 0) {
            str3 = rejectRequest.rejectionReason;
        }
        return rejectRequest.copy(str, str2, str3);
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
    public final java.lang.String getRejectionReason() {
        return this.rejectionReason;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.oAuth.networking.data.RejectRequest copy(@org.jetbrains.annotations.NotNull java.lang.String requestId, @org.jetbrains.annotations.NotNull java.lang.String clientId, @org.jetbrains.annotations.NotNull java.lang.String rejectionReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "clientId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rejectionReason, "rejectionReason");
        return new com.truecaller.sdk.oAuth.networking.data.RejectRequest(requestId, clientId, rejectionReason);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.sdk.oAuth.networking.data.RejectRequest)) {
            return false;
        }
        com.truecaller.sdk.oAuth.networking.data.RejectRequest rejectRequest = (com.truecaller.sdk.oAuth.networking.data.RejectRequest) other;
        return kotlin.jvm.internal.Intrinsics.b(this.requestId, rejectRequest.requestId) && kotlin.jvm.internal.Intrinsics.b(this.clientId, rejectRequest.clientId) && kotlin.jvm.internal.Intrinsics.b(this.rejectionReason, rejectRequest.rejectionReason);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getClientId() {
        return this.clientId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRejectionReason() {
        return this.rejectionReason;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.rejectionReason.hashCode() + ax1.bar.e(this.requestId.hashCode() * 31, 31, this.clientId);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.rejectionReason, ")", ro0.f.E("RejectRequest(requestId=", this.requestId, ", clientId=", this.clientId, ", rejectionReason="));
    }
}
