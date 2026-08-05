package com.truecaller.ads.caching.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J*\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/caching/model/CacheConfiguration;", "", "version", "", "configList", "", "Lcom/truecaller/ads/caching/model/Config;", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "getVersion", "()Ljava/lang/Integer;", "setVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getConfigList", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/truecaller/ads/caching/model/CacheConfiguration;", "equals", "", "other", "hashCode", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CacheConfiguration {
    public static final int $stable = 8;

    @bw.qux("config")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.caching.model.Config> configList;

    @bw.qux("version")
    @org.jetbrains.annotations.Nullable
    private java.lang.Integer version;

    public CacheConfiguration(@org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.caching.model.Config> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "configList");
        this.version = num;
        this.configList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.caching.model.CacheConfiguration copy$default(com.truecaller.ads.caching.model.CacheConfiguration cacheConfiguration, java.lang.Integer num, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = cacheConfiguration.version;
        }
        if ((i & 2) != 0) {
            list = cacheConfiguration.configList;
        }
        return cacheConfiguration.copy(num, list);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.caching.model.Config> component2() {
        return this.configList;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.caching.model.CacheConfiguration copy(@org.jetbrains.annotations.Nullable java.lang.Integer version, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.caching.model.Config> configList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configList, "configList");
        return new com.truecaller.ads.caching.model.CacheConfiguration(version, configList);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.caching.model.CacheConfiguration)) {
            return false;
        }
        com.truecaller.ads.caching.model.CacheConfiguration cacheConfiguration = (com.truecaller.ads.caching.model.CacheConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.b(this.version, cacheConfiguration.version) && kotlin.jvm.internal.Intrinsics.b(this.configList, cacheConfiguration.configList);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.caching.model.Config> getConfigList() {
        return this.configList;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        java.lang.Integer num = this.version;
        return this.configList.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final void setVersion(@org.jetbrains.annotations.Nullable java.lang.Integer num) {
        this.version = num;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "CacheConfiguration(version=" + this.version + ", configList=" + this.configList + ")";
    }

    public /* synthetic */ CacheConfiguration(java.lang.Integer num, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, list);
    }
}
