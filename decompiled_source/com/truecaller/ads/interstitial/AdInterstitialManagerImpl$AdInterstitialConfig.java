package com.truecaller.ads.interstitial;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"com/truecaller/ads/interstitial/AdInterstitialManagerImpl$AdInterstitialConfig", "", "", "Lcom/truecaller/ads/interstitial/AdInterstitialManagerImpl$PlacementConfig;", "config", "", "version", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "Lcom/truecaller/ads/interstitial/AdInterstitialManagerImpl$AdInterstitialConfig;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/truecaller/ads/interstitial/AdInterstitialManagerImpl$AdInterstitialConfig;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getConfig", "Ljava/lang/String;", "getVersion", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdInterstitialManagerImpl$AdInterstitialConfig {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.interstitial.AdInterstitialManagerImpl$PlacementConfig> config;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String version;

    public AdInterstitialManagerImpl$AdInterstitialConfig(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.interstitial.AdInterstitialManagerImpl$PlacementConfig> list, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "version");
        this.config = list;
        this.version = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.interstitial.AdInterstitialManagerImpl$AdInterstitialConfig copy$default(com.truecaller.ads.interstitial.AdInterstitialManagerImpl$AdInterstitialConfig adInterstitialManagerImpl$AdInterstitialConfig, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = adInterstitialManagerImpl$AdInterstitialConfig.config;
        }
        if ((i & 2) != 0) {
            str = adInterstitialManagerImpl$AdInterstitialConfig.version;
        }
        return adInterstitialManagerImpl$AdInterstitialConfig.copy(list, str);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.interstitial.AdInterstitialManagerImpl$PlacementConfig> component1() {
        return this.config;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.interstitial.AdInterstitialManagerImpl$AdInterstitialConfig copy(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.interstitial.AdInterstitialManagerImpl$PlacementConfig> config, @org.jetbrains.annotations.NotNull java.lang.String version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        return new com.truecaller.ads.interstitial.AdInterstitialManagerImpl$AdInterstitialConfig(config, version);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.interstitial.AdInterstitialManagerImpl$AdInterstitialConfig)) {
            return false;
        }
        com.truecaller.ads.interstitial.AdInterstitialManagerImpl$AdInterstitialConfig adInterstitialManagerImpl$AdInterstitialConfig = (com.truecaller.ads.interstitial.AdInterstitialManagerImpl$AdInterstitialConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.config, adInterstitialManagerImpl$AdInterstitialConfig.config) && kotlin.jvm.internal.Intrinsics.b(this.version, adInterstitialManagerImpl$AdInterstitialConfig.version);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.interstitial.AdInterstitialManagerImpl$PlacementConfig> getConfig() {
        return this.config;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() + (this.config.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "AdInterstitialConfig(config=" + this.config + ", version=" + this.version + ")";
    }
}
