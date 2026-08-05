package com.truecaller.wearable.data.services;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0012\u001a\u0002H\u0013\"\u0006\b\u0000\u0010\u0013\u0018\u0001H\u0086\b¢\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Lcom/truecaller/wearable/data/services/DataLayerRequest;", "", "host", "", "path", "requestId", "body", "headers", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getHost", "()Ljava/lang/String;", "getPath", "getRequestId", "getBody", "getHeaders", "()Ljava/util/Map;", "deserializeBody", "T", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class DataLayerRequest {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String body;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.String> headers;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String host;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String path;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String requestId;

    public DataLayerRequest(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "host");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "headers");
        this.host = str;
        this.path = str2;
        this.requestId = str3;
        this.body = str4;
        this.headers = map;
    }

    public static /* synthetic */ com.truecaller.wearable.data.services.DataLayerRequest copy$default(com.truecaller.wearable.data.services.DataLayerRequest dataLayerRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dataLayerRequest.host;
        }
        if ((i & 2) != 0) {
            str2 = dataLayerRequest.path;
        }
        if ((i & 4) != 0) {
            str3 = dataLayerRequest.requestId;
        }
        if ((i & 8) != 0) {
            str4 = dataLayerRequest.body;
        }
        if ((i & 16) != 0) {
            map = dataLayerRequest.headers;
        }
        java.util.Map map2 = map;
        java.lang.String str5 = str3;
        return dataLayerRequest.copy(str, str2, str5, str4, map2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getHost() {
        return this.host;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getBody() {
        return this.body;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.String> component5() {
        return this.headers;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.wearable.data.services.DataLayerRequest copy(@org.jetbrains.annotations.NotNull java.lang.String host, @org.jetbrains.annotations.NotNull java.lang.String path, @org.jetbrains.annotations.NotNull java.lang.String requestId, @org.jetbrains.annotations.NotNull java.lang.String body, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(body, "body");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "headers");
        return new com.truecaller.wearable.data.services.DataLayerRequest(host, path, requestId, body, headers);
    }

    public final <T> T deserializeBody() {
        new com.google.gson.Gson();
        getBody();
        kotlin.jvm.internal.Intrinsics.m();
        throw null;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.wearable.data.services.DataLayerRequest)) {
            return false;
        }
        com.truecaller.wearable.data.services.DataLayerRequest dataLayerRequest = (com.truecaller.wearable.data.services.DataLayerRequest) other;
        return kotlin.jvm.internal.Intrinsics.b(this.host, dataLayerRequest.host) && kotlin.jvm.internal.Intrinsics.b(this.path, dataLayerRequest.path) && kotlin.jvm.internal.Intrinsics.b(this.requestId, dataLayerRequest.requestId) && kotlin.jvm.internal.Intrinsics.b(this.body, dataLayerRequest.body) && kotlin.jvm.internal.Intrinsics.b(this.headers, dataLayerRequest.headers);
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
    public final java.lang.String getHost() {
        return this.host;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPath() {
        return this.path;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        return this.headers.hashCode() + ax1.bar.e(ax1.bar.e(ax1.bar.e(this.host.hashCode() * 31, 31, this.path), 31, this.requestId), 31, this.body);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.host;
        java.lang.String str2 = this.path;
        java.lang.String str3 = this.requestId;
        java.lang.String str4 = this.body;
        java.util.Map<java.lang.String, java.lang.String> map = this.headers;
        java.lang.StringBuilder E = ro0.f.E("DataLayerRequest(host=", str, ", path=", str2, ", requestId=");
        bar.E(E, str3, ", body=", str4, ", headers=");
        E.append(map);
        E.append(")");
        return E.toString();
    }
}
