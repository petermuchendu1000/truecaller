package com.truecaller.common.cloudtelephony.data.heartbeat;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/truecaller/common/cloudtelephony/data/heartbeat/HeartbeatRequest;", "", "productType", "Lcom/truecaller/common/cloudtelephony/data/heartbeat/HeartbeatProductType;", "<init>", "(Lcom/truecaller/common/cloudtelephony/data/heartbeat/HeartbeatProductType;)V", "getProductType", "()Lcom/truecaller/common/cloudtelephony/data/heartbeat/HeartbeatProductType;", "component1", "copy", "equals", "", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "common-cloud-telephony_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final /* data */ class HeartbeatRequest {
    public static final int $stable = 0;

    @bw.qux("productType")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatProductType productType;

    public HeartbeatRequest(@org.jetbrains.annotations.NotNull com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatProductType heartbeatProductType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(heartbeatProductType, "productType");
        this.productType = heartbeatProductType;
    }

    public static /* synthetic */ com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatRequest copy$default(com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatRequest heartbeatRequest, com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatProductType heartbeatProductType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            heartbeatProductType = heartbeatRequest.productType;
        }
        return heartbeatRequest.copy(heartbeatProductType);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatProductType getProductType() {
        return this.productType;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatRequest copy(@org.jetbrains.annotations.NotNull com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatProductType productType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productType, "productType");
        return new com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatRequest(productType);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatRequest) && this.productType == ((com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatRequest) other).productType;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.cloudtelephony.data.heartbeat.HeartbeatProductType getProductType() {
        return this.productType;
    }

    public int hashCode() {
        return this.productType.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "HeartbeatRequest(productType=" + this.productType + ")";
    }
}
