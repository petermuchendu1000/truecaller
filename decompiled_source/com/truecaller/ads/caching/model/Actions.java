package com.truecaller.ads.caching.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/truecaller/ads/caching/model/Actions;", "", "shouldCheckForCache", "", "adUnitId", "", "requestType", "Lcom/truecaller/ads/caching/model/RequestType;", "<init>", "(ZLjava/lang/String;Lcom/truecaller/ads/caching/model/RequestType;)V", "getShouldCheckForCache", "()Z", "getAdUnitId", "()Ljava/lang/String;", "getRequestType", "()Lcom/truecaller/ads/caching/model/RequestType;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Actions {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String adUnitId;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.caching.model.RequestType requestType;
    private final boolean shouldCheckForCache;

    public Actions(boolean z, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull com.truecaller.ads.caching.model.RequestType requestType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestType, "requestType");
        this.shouldCheckForCache = z;
        this.adUnitId = str;
        this.requestType = requestType;
    }

    public static /* synthetic */ com.truecaller.ads.caching.model.Actions copy$default(com.truecaller.ads.caching.model.Actions actions, boolean z, java.lang.String str, com.truecaller.ads.caching.model.RequestType requestType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = actions.shouldCheckForCache;
        }
        if ((i & 2) != 0) {
            str = actions.adUnitId;
        }
        if ((i & 4) != 0) {
            requestType = actions.requestType;
        }
        return actions.copy(z, str, requestType);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShouldCheckForCache() {
        return this.shouldCheckForCache;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.ads.caching.model.RequestType getRequestType() {
        return this.requestType;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.caching.model.Actions copy(boolean shouldCheckForCache, @org.jetbrains.annotations.NotNull java.lang.String adUnitId, @org.jetbrains.annotations.NotNull com.truecaller.ads.caching.model.RequestType requestType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestType, "requestType");
        return new com.truecaller.ads.caching.model.Actions(shouldCheckForCache, adUnitId, requestType);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.caching.model.Actions)) {
            return false;
        }
        com.truecaller.ads.caching.model.Actions actions = (com.truecaller.ads.caching.model.Actions) other;
        return this.shouldCheckForCache == actions.shouldCheckForCache && kotlin.jvm.internal.Intrinsics.b(this.adUnitId, actions.adUnitId) && this.requestType == actions.requestType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.caching.model.RequestType getRequestType() {
        return this.requestType;
    }

    public final boolean getShouldCheckForCache() {
        return this.shouldCheckForCache;
    }

    public int hashCode() {
        int i;
        if (this.shouldCheckForCache) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.requestType.hashCode() + ax1.bar.e(i * 31, 31, this.adUnitId);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.shouldCheckForCache;
        java.lang.String str = this.adUnitId;
        com.truecaller.ads.caching.model.RequestType requestType = this.requestType;
        java.lang.StringBuilder u = bx.e1.u("Actions(shouldCheckForCache=", ", adUnitId=", str, ", requestType=", z);
        u.append(requestType);
        u.append(")");
        return u.toString();
    }
}
