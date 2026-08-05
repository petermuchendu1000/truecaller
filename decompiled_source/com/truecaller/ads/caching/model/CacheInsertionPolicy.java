package com.truecaller.ads.caching.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/ads/caching/model/CacheInsertionPolicy;", "", "orderBy", "", "exclusion", "Lcom/truecaller/ads/caching/model/Exclusion;", "<init>", "(Ljava/lang/String;Lcom/truecaller/ads/caching/model/Exclusion;)V", "getOrderBy", "()Ljava/lang/String;", "getExclusion", "()Lcom/truecaller/ads/caching/model/Exclusion;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CacheInsertionPolicy {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.caching.model.Exclusion exclusion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String orderBy;

    public CacheInsertionPolicy(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable com.truecaller.ads.caching.model.Exclusion exclusion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "orderBy");
        this.orderBy = str;
        this.exclusion = exclusion;
    }

    public static /* synthetic */ com.truecaller.ads.caching.model.CacheInsertionPolicy copy$default(com.truecaller.ads.caching.model.CacheInsertionPolicy cacheInsertionPolicy, java.lang.String str, com.truecaller.ads.caching.model.Exclusion exclusion, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cacheInsertionPolicy.orderBy;
        }
        if ((i & 2) != 0) {
            exclusion = cacheInsertionPolicy.exclusion;
        }
        return cacheInsertionPolicy.copy(str, exclusion);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getOrderBy() {
        return this.orderBy;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.ads.caching.model.Exclusion getExclusion() {
        return this.exclusion;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.caching.model.CacheInsertionPolicy copy(@org.jetbrains.annotations.NotNull java.lang.String orderBy, @org.jetbrains.annotations.Nullable com.truecaller.ads.caching.model.Exclusion exclusion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orderBy, "orderBy");
        return new com.truecaller.ads.caching.model.CacheInsertionPolicy(orderBy, exclusion);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.caching.model.CacheInsertionPolicy)) {
            return false;
        }
        com.truecaller.ads.caching.model.CacheInsertionPolicy cacheInsertionPolicy = (com.truecaller.ads.caching.model.CacheInsertionPolicy) other;
        return kotlin.jvm.internal.Intrinsics.b(this.orderBy, cacheInsertionPolicy.orderBy) && kotlin.jvm.internal.Intrinsics.b(this.exclusion, cacheInsertionPolicy.exclusion);
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.caching.model.Exclusion getExclusion() {
        return this.exclusion;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrderBy() {
        return this.orderBy;
    }

    public int hashCode() {
        int hashCode = this.orderBy.hashCode() * 31;
        com.truecaller.ads.caching.model.Exclusion exclusion = this.exclusion;
        return hashCode + (exclusion == null ? 0 : exclusion.hashCode());
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "CacheInsertionPolicy(orderBy=" + this.orderBy + ", exclusion=" + this.exclusion + ")";
    }

    public /* synthetic */ CacheInsertionPolicy(java.lang.String str, com.truecaller.ads.caching.model.Exclusion exclusion, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : exclusion);
    }
}
