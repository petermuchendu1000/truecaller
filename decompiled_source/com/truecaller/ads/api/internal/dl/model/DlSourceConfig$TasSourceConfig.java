package com.truecaller.ads.api.internal.dl.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f¨\u0006\u001f"}, d2 = {"com/truecaller/ads/api/internal/dl/model/DlSourceConfig$TasSourceConfig", "Lw20/k;", "", "requestParams", "", "reqCount", "", "skipCache", "<init>", "(Ljava/lang/String;IZ)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Z", "Lcom/truecaller/ads/api/internal/dl/model/DlSourceConfig$TasSourceConfig;", "copy", "(Ljava/lang/String;IZ)Lcom/truecaller/ads/api/internal/dl/model/DlSourceConfig$TasSourceConfig;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestParams", "I", "getReqCount", "Z", "getSkipCache", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlSourceConfig$TasSourceConfig implements w20.k {
    private final int reqCount;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String requestParams;
    private final boolean skipCache;

    public DlSourceConfig$TasSourceConfig(@org.jetbrains.annotations.NotNull java.lang.String str, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "requestParams");
        this.requestParams = str;
        this.reqCount = i;
        this.skipCache = z;
    }

    public static /* synthetic */ com.truecaller.ads.api.internal.dl.model.DlSourceConfig$TasSourceConfig copy$default(com.truecaller.ads.api.internal.dl.model.DlSourceConfig$TasSourceConfig dlSourceConfig$TasSourceConfig, java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = dlSourceConfig$TasSourceConfig.requestParams;
        }
        if ((i2 & 2) != 0) {
            i = dlSourceConfig$TasSourceConfig.reqCount;
        }
        if ((i2 & 4) != 0) {
            z = dlSourceConfig$TasSourceConfig.skipCache;
        }
        return dlSourceConfig$TasSourceConfig.copy(str, i, z);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRequestParams() {
        return this.requestParams;
    }

    /* renamed from: component2, reason: from getter */
    public final int getReqCount() {
        return this.reqCount;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSkipCache() {
        return this.skipCache;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.api.internal.dl.model.DlSourceConfig$TasSourceConfig copy(@org.jetbrains.annotations.NotNull java.lang.String requestParams, int reqCount, boolean skipCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        return new com.truecaller.ads.api.internal.dl.model.DlSourceConfig$TasSourceConfig(requestParams, reqCount, skipCache);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.api.internal.dl.model.DlSourceConfig$TasSourceConfig)) {
            return false;
        }
        com.truecaller.ads.api.internal.dl.model.DlSourceConfig$TasSourceConfig dlSourceConfig$TasSourceConfig = (com.truecaller.ads.api.internal.dl.model.DlSourceConfig$TasSourceConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.requestParams, dlSourceConfig$TasSourceConfig.requestParams) && this.reqCount == dlSourceConfig$TasSourceConfig.reqCount && this.skipCache == dlSourceConfig$TasSourceConfig.skipCache;
    }

    public final int getReqCount() {
        return this.reqCount;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRequestParams() {
        return this.requestParams;
    }

    public final boolean getSkipCache() {
        return this.skipCache;
    }

    public int hashCode() {
        return (((this.requestParams.hashCode() * 31) + this.reqCount) * 31) + (this.skipCache ? 1231 : 1237);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.requestParams;
        int i = this.reqCount;
        return h8.s0.s(bar.z("TasSourceConfig(requestParams=", i, str, ", reqCount=", ", skipCache="), this.skipCache, ")");
    }

    public /* synthetic */ DlSourceConfig$TasSourceConfig(java.lang.String str, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? false : z);
    }
}
