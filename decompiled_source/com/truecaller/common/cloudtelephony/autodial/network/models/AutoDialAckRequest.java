package com.truecaller.common.cloudtelephony.autodial.network.models;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialAckRequest;", "", "activityId", "", "productType", "Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialProductType;", "payload", "Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialAckPayload;", "status", "Lcom/truecaller/common/cloudtelephony/autodial/network/models/AckStatus;", "reason", "<init>", "(Ljava/lang/String;Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialProductType;Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialAckPayload;Lcom/truecaller/common/cloudtelephony/autodial/network/models/AckStatus;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getProductType", "()Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialProductType;", "getPayload", "()Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialAckPayload;", "getStatus", "()Lcom/truecaller/common/cloudtelephony/autodial/network/models/AckStatus;", "getReason", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "common-cloud-telephony_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final /* data */ class AutoDialAckRequest {
    public static final int $stable = 8;

    @bw.qux("activityId")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String activityId;

    @bw.qux("payload")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload payload;

    @bw.qux("productType")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType productType;

    @bw.qux("reason")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String reason;

    @bw.qux("status")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.common.cloudtelephony.autodial.network.models.AckStatus status;

    public AutoDialAckRequest(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType autoDialProductType, @org.jetbrains.annotations.NotNull com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload autoDialAckPayload, @org.jetbrains.annotations.NotNull com.truecaller.common.cloudtelephony.autodial.network.models.AckStatus ackStatus, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "activityId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoDialProductType, "productType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoDialAckPayload, "payload");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ackStatus, "status");
        this.activityId = str;
        this.productType = autoDialProductType;
        this.payload = autoDialAckPayload;
        this.status = ackStatus;
        this.reason = str2;
    }

    public static /* synthetic */ com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckRequest copy$default(com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckRequest autoDialAckRequest, java.lang.String str, com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType autoDialProductType, com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload autoDialAckPayload, com.truecaller.common.cloudtelephony.autodial.network.models.AckStatus ackStatus, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = autoDialAckRequest.activityId;
        }
        if ((i & 2) != 0) {
            autoDialProductType = autoDialAckRequest.productType;
        }
        if ((i & 4) != 0) {
            autoDialAckPayload = autoDialAckRequest.payload;
        }
        if ((i & 8) != 0) {
            ackStatus = autoDialAckRequest.status;
        }
        if ((i & 16) != 0) {
            str2 = autoDialAckRequest.reason;
        }
        java.lang.String str3 = str2;
        com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload autoDialAckPayload2 = autoDialAckPayload;
        return autoDialAckRequest.copy(str, autoDialProductType, autoDialAckPayload2, ackStatus, str3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getActivityId() {
        return this.activityId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType getProductType() {
        return this.productType;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload getPayload() {
        return this.payload;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AckStatus getStatus() {
        return this.status;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getReason() {
        return this.reason;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckRequest copy(@org.jetbrains.annotations.NotNull java.lang.String activityId, @org.jetbrains.annotations.NotNull com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType productType, @org.jetbrains.annotations.NotNull com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload payload, @org.jetbrains.annotations.NotNull com.truecaller.common.cloudtelephony.autodial.network.models.AckStatus status, @org.jetbrains.annotations.Nullable java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityId, "activityId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        return new com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckRequest(activityId, productType, payload, status, reason);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckRequest)) {
            return false;
        }
        com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckRequest autoDialAckRequest = (com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckRequest) other;
        return kotlin.jvm.internal.Intrinsics.b(this.activityId, autoDialAckRequest.activityId) && this.productType == autoDialAckRequest.productType && kotlin.jvm.internal.Intrinsics.b(this.payload, autoDialAckRequest.payload) && this.status == autoDialAckRequest.status && kotlin.jvm.internal.Intrinsics.b(this.reason, autoDialAckRequest.reason);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActivityId() {
        return this.activityId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload getPayload() {
        return this.payload;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType getProductType() {
        return this.productType;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReason() {
        return this.reason;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AckStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + ((this.payload.hashCode() + ((this.productType.hashCode() + (this.activityId.hashCode() * 31)) * 31)) * 31)) * 31;
        java.lang.String str = this.reason;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.activityId;
        com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType autoDialProductType = this.productType;
        com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload autoDialAckPayload = this.payload;
        com.truecaller.common.cloudtelephony.autodial.network.models.AckStatus ackStatus = this.status;
        java.lang.String str2 = this.reason;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoDialAckRequest(activityId=");
        sb.append(str);
        sb.append(", productType=");
        sb.append(autoDialProductType);
        sb.append(", payload=");
        sb.append(autoDialAckPayload);
        sb.append(", status=");
        sb.append(ackStatus);
        sb.append(", reason=");
        return bar.v(str2, ")", sb);
    }
}
