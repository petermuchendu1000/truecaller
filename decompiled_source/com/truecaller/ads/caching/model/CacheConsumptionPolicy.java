package com.truecaller.ads.caching.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/truecaller/ads/caching/model/CacheConsumptionPolicy;", "", "default", "Lcom/truecaller/ads/caching/model/Default;", "conditions", "", "Lcom/truecaller/ads/caching/model/Conditions;", "<init>", "(Lcom/truecaller/ads/caching/model/Default;Ljava/util/List;)V", "getDefault", "()Lcom/truecaller/ads/caching/model/Default;", "getConditions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CacheConsumptionPolicy {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.caching.model.Conditions> conditions;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.caching.model.Default default;

    public CacheConsumptionPolicy(@org.jetbrains.annotations.NotNull com.truecaller.ads.caching.model.Default r2, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.caching.model.Conditions> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "default");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "conditions");
        this.default = r2;
        this.conditions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.caching.model.CacheConsumptionPolicy copy$default(com.truecaller.ads.caching.model.CacheConsumptionPolicy cacheConsumptionPolicy, com.truecaller.ads.caching.model.Default r1, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            r1 = cacheConsumptionPolicy.default;
        }
        if ((i & 2) != 0) {
            list = cacheConsumptionPolicy.conditions;
        }
        return cacheConsumptionPolicy.copy(r1, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.caching.model.Default getDefault() {
        return this.default;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.caching.model.Conditions> component2() {
        return this.conditions;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.caching.model.CacheConsumptionPolicy copy(@org.jetbrains.annotations.NotNull com.truecaller.ads.caching.model.Default r2, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.caching.model.Conditions> conditions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "default");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conditions, "conditions");
        return new com.truecaller.ads.caching.model.CacheConsumptionPolicy(r2, conditions);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.caching.model.CacheConsumptionPolicy)) {
            return false;
        }
        com.truecaller.ads.caching.model.CacheConsumptionPolicy cacheConsumptionPolicy = (com.truecaller.ads.caching.model.CacheConsumptionPolicy) other;
        return kotlin.jvm.internal.Intrinsics.b(this.default, cacheConsumptionPolicy.default) && kotlin.jvm.internal.Intrinsics.b(this.conditions, cacheConsumptionPolicy.conditions);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.caching.model.Conditions> getConditions() {
        return this.conditions;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.caching.model.Default getDefault() {
        return this.default;
    }

    public int hashCode() {
        return this.conditions.hashCode() + (this.default.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "CacheConsumptionPolicy(default=" + this.default + ", conditions=" + this.conditions + ")";
    }

    public CacheConsumptionPolicy(com.truecaller.ads.caching.model.Default r1, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, (i & 2) != 0 ? kotlin.collections.h0.a : list);
    }
}
