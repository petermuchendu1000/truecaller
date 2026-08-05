package com.truecaller.wearable.data.services;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/truecaller/wearable/data/services/DataLayerResponse;", "", "status", "", "requestId", "", "body", "headers", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getStatus", "()I", "getRequestId", "()Ljava/lang/String;", "getBody", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class DataLayerResponse {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String body;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.String> headers;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String requestId;
    private final int status;

    public DataLayerResponse(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "headers");
        this.status = i;
        this.requestId = str;
        this.body = str2;
        this.headers = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.wearable.data.services.DataLayerResponse copy$default(com.truecaller.wearable.data.services.DataLayerResponse dataLayerResponse, int i, java.lang.String str, java.lang.String str2, java.util.Map map, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = dataLayerResponse.status;
        }
        if ((i2 & 2) != 0) {
            str = dataLayerResponse.requestId;
        }
        if ((i2 & 4) != 0) {
            str2 = dataLayerResponse.body;
        }
        if ((i2 & 8) != 0) {
            map = dataLayerResponse.headers;
        }
        return dataLayerResponse.copy(i, str, str2, map);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBody() {
        return this.body;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.String> component4() {
        return this.headers;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.wearable.data.services.DataLayerResponse copy(int status, @org.jetbrains.annotations.NotNull java.lang.String requestId, @org.jetbrains.annotations.NotNull java.lang.String body, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        return new com.truecaller.wearable.data.services.DataLayerResponse(status, requestId, body, headers);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.wearable.data.services.DataLayerResponse)) {
            return false;
        }
        com.truecaller.wearable.data.services.DataLayerResponse dataLayerResponse = (com.truecaller.wearable.data.services.DataLayerResponse) other;
        return this.status == dataLayerResponse.status && kotlin.jvm.internal.Intrinsics.b(this.requestId, dataLayerResponse.requestId) && kotlin.jvm.internal.Intrinsics.b(this.body, dataLayerResponse.body) && kotlin.jvm.internal.Intrinsics.b(this.headers, dataLayerResponse.headers);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBody() {
        return this.body;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.headers;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.headers.hashCode() + ax1.bar.e(ax1.bar.e(this.status * 31, 31, this.requestId), 31, this.body);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.status;
        java.lang.String str = this.requestId;
        java.lang.String str2 = this.body;
        java.util.Map<java.lang.String, java.lang.String> map = this.headers;
        java.lang.StringBuilder r = qb.qux.r("DataLayerResponse(status=", i, ", requestId=", str, ", body=");
        r.append(str2);
        r.append(", headers=");
        r.append(map);
        r.append(")");
        return r.toString();
    }
}
