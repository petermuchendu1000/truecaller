package com.truecaller.ads.caching.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/truecaller/ads/caching/model/RequestSource;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "shouldCheckForCache", "", "adUnitId", "requestType", "Lcom/truecaller/ads/caching/model/RequestType;", "conditions", "", "Lcom/truecaller/ads/caching/model/Conditions;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/truecaller/ads/caching/model/RequestType;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getShouldCheckForCache", "()Z", "getAdUnitId", "getRequestType", "()Lcom/truecaller/ads/caching/model/RequestType;", "getConditions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class RequestSource {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String adUnitId;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.caching.model.Conditions> conditions;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.caching.model.RequestType requestType;
    private final boolean shouldCheckForCache;

    public RequestSource(@org.jetbrains.annotations.NotNull java.lang.String str, boolean z, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull com.truecaller.ads.caching.model.RequestType requestType, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.caching.model.Conditions> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestType, "requestType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "conditions");
        this.id = str;
        this.shouldCheckForCache = z;
        this.adUnitId = str2;
        this.requestType = requestType;
        this.conditions = list;
    }

    public static /* synthetic */ com.truecaller.ads.caching.model.RequestSource copy$default(com.truecaller.ads.caching.model.RequestSource requestSource, java.lang.String str, boolean z, java.lang.String str2, com.truecaller.ads.caching.model.RequestType requestType, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = requestSource.id;
        }
        if ((i & 2) != 0) {
            z = requestSource.shouldCheckForCache;
        }
        if ((i & 4) != 0) {
            str2 = requestSource.adUnitId;
        }
        if ((i & 8) != 0) {
            requestType = requestSource.requestType;
        }
        if ((i & 16) != 0) {
            list = requestSource.conditions;
        }
        java.util.List list2 = list;
        java.lang.String str3 = str2;
        return requestSource.copy(str, z, str3, requestType, list2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldCheckForCache() {
        return this.shouldCheckForCache;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.ads.caching.model.RequestType getRequestType() {
        return this.requestType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.caching.model.Conditions> component5() {
        return this.conditions;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.caching.model.RequestSource copy(@org.jetbrains.annotations.NotNull java.lang.String id, boolean shouldCheckForCache, @org.jetbrains.annotations.NotNull java.lang.String adUnitId, @org.jetbrains.annotations.NotNull com.truecaller.ads.caching.model.RequestType requestType, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.caching.model.Conditions> conditions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestType, "requestType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conditions, "conditions");
        return new com.truecaller.ads.caching.model.RequestSource(id, shouldCheckForCache, adUnitId, requestType, conditions);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.caching.model.RequestSource)) {
            return false;
        }
        com.truecaller.ads.caching.model.RequestSource requestSource = (com.truecaller.ads.caching.model.RequestSource) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, requestSource.id) && this.shouldCheckForCache == requestSource.shouldCheckForCache && kotlin.jvm.internal.Intrinsics.b(this.adUnitId, requestSource.adUnitId) && this.requestType == requestSource.requestType && kotlin.jvm.internal.Intrinsics.b(this.conditions, requestSource.conditions);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.caching.model.Conditions> getConditions() {
        return this.conditions;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
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
        int hashCode = this.id.hashCode() * 31;
        if (this.shouldCheckForCache) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.conditions.hashCode() + ((this.requestType.hashCode() + ax1.bar.e((hashCode + i) * 31, 31, this.adUnitId)) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        boolean z = this.shouldCheckForCache;
        java.lang.String str2 = this.adUnitId;
        com.truecaller.ads.caching.model.RequestType requestType = this.requestType;
        java.util.List<com.truecaller.ads.caching.model.Conditions> list = this.conditions;
        java.lang.StringBuilder t = ax1.bar.t("RequestSource(id=", str, ", shouldCheckForCache=", ", adUnitId=", z);
        t.append(str2);
        t.append(", requestType=");
        t.append(requestType);
        t.append(", conditions=");
        return y.o.g(t, list, ")");
    }

    public RequestSource(java.lang.String str, boolean z, java.lang.String str2, com.truecaller.ads.caching.model.RequestType requestType, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, requestType, (i & 16) != 0 ? kotlin.collections.h0.a : list);
    }
}
