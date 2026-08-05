package com.truecaller.ads.provider;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/ads/provider/AdsDevicePerformanceClassConfig;", "", "version", "", "placement", "", "Lcom/truecaller/ads/provider/PerformancePlacement;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getVersion", "()Ljava/lang/String;", "getPlacement", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdsDevicePerformanceClassConfig {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.provider.PerformancePlacement> placement;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String version;

    public AdsDevicePerformanceClassConfig(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.provider.PerformancePlacement> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "placement");
        this.version = str;
        this.placement = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.provider.AdsDevicePerformanceClassConfig copy$default(com.truecaller.ads.provider.AdsDevicePerformanceClassConfig adsDevicePerformanceClassConfig, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = adsDevicePerformanceClassConfig.version;
        }
        if ((i & 2) != 0) {
            list = adsDevicePerformanceClassConfig.placement;
        }
        return adsDevicePerformanceClassConfig.copy(str, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.provider.PerformancePlacement> component2() {
        return this.placement;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.provider.AdsDevicePerformanceClassConfig copy(@org.jetbrains.annotations.NotNull java.lang.String version, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.provider.PerformancePlacement> placement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        return new com.truecaller.ads.provider.AdsDevicePerformanceClassConfig(version, placement);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.provider.AdsDevicePerformanceClassConfig)) {
            return false;
        }
        com.truecaller.ads.provider.AdsDevicePerformanceClassConfig adsDevicePerformanceClassConfig = (com.truecaller.ads.provider.AdsDevicePerformanceClassConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.version, adsDevicePerformanceClassConfig.version) && kotlin.jvm.internal.Intrinsics.b(this.placement, adsDevicePerformanceClassConfig.placement);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.provider.PerformancePlacement> getPlacement() {
        return this.placement;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.placement.hashCode() + (this.version.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("AdsDevicePerformanceClassConfig(version=", this.version, ", placement=", this.placement, ")");
    }
}
