package com.truecaller.ads.interstitial;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JJ\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0016R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010\u0018¨\u0006+"}, d2 = {"com/truecaller/ads/interstitial/AdInterstitialManagerImpl$PlacementConfig", "", "", "enable", "", "fCap", "", "resetTimeInHrs", "", "placement", "", "Lcom/truecaller/ads/interstitial/AdInterstitialManagerImpl$SourceType;", "source", "<init>", "(ZIJLjava/lang/String;Ljava/util/List;)V", "component1", "()Z", "component2", "()I", "component3", "()J", "component4", "()Ljava/lang/String;", "component5", "()Ljava/util/List;", "Lcom/truecaller/ads/interstitial/AdInterstitialManagerImpl$PlacementConfig;", "copy", "(ZIJLjava/lang/String;Ljava/util/List;)Lcom/truecaller/ads/interstitial/AdInterstitialManagerImpl$PlacementConfig;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnable", "I", "getFCap", "J", "getResetTimeInHrs", "Ljava/lang/String;", "getPlacement", "Ljava/util/List;", "getSource", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdInterstitialManagerImpl$PlacementConfig {
    public static final int $stable = 8;
    private final boolean enable;
    private final int fCap;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String placement;
    private final long resetTimeInHrs;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.ads.interstitial.AdInterstitialManagerImpl$SourceType> source;

    public AdInterstitialManagerImpl$PlacementConfig(boolean z, int i, long j, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.interstitial.AdInterstitialManagerImpl$SourceType> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        this.enable = z;
        this.fCap = i;
        this.resetTimeInHrs = j;
        this.placement = str;
        this.source = list;
    }

    public static /* synthetic */ com.truecaller.ads.interstitial.AdInterstitialManagerImpl$PlacementConfig copy$default(com.truecaller.ads.interstitial.AdInterstitialManagerImpl$PlacementConfig adInterstitialManagerImpl$PlacementConfig, boolean z, int i, long j, java.lang.String str, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = adInterstitialManagerImpl$PlacementConfig.enable;
        }
        if ((i2 & 2) != 0) {
            i = adInterstitialManagerImpl$PlacementConfig.fCap;
        }
        if ((i2 & 4) != 0) {
            j = adInterstitialManagerImpl$PlacementConfig.resetTimeInHrs;
        }
        if ((i2 & 8) != 0) {
            str = adInterstitialManagerImpl$PlacementConfig.placement;
        }
        if ((i2 & 16) != 0) {
            list = adInterstitialManagerImpl$PlacementConfig.source;
        }
        long j2 = j;
        return adInterstitialManagerImpl$PlacementConfig.copy(z, i, j2, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFCap() {
        return this.fCap;
    }

    /* renamed from: component3, reason: from getter */
    public final long getResetTimeInHrs() {
        return this.resetTimeInHrs;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.interstitial.AdInterstitialManagerImpl$SourceType> component5() {
        return this.source;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.interstitial.AdInterstitialManagerImpl$PlacementConfig copy(boolean enable, int fCap, long resetTimeInHrs, @org.jetbrains.annotations.NotNull java.lang.String placement, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.interstitial.AdInterstitialManagerImpl$SourceType> source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        return new com.truecaller.ads.interstitial.AdInterstitialManagerImpl$PlacementConfig(enable, fCap, resetTimeInHrs, placement, source);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.interstitial.AdInterstitialManagerImpl$PlacementConfig)) {
            return false;
        }
        com.truecaller.ads.interstitial.AdInterstitialManagerImpl$PlacementConfig adInterstitialManagerImpl$PlacementConfig = (com.truecaller.ads.interstitial.AdInterstitialManagerImpl$PlacementConfig) other;
        return this.enable == adInterstitialManagerImpl$PlacementConfig.enable && this.fCap == adInterstitialManagerImpl$PlacementConfig.fCap && this.resetTimeInHrs == adInterstitialManagerImpl$PlacementConfig.resetTimeInHrs && kotlin.jvm.internal.Intrinsics.b(this.placement, adInterstitialManagerImpl$PlacementConfig.placement) && kotlin.jvm.internal.Intrinsics.b(this.source, adInterstitialManagerImpl$PlacementConfig.source);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getFCap() {
        return this.fCap;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    public final long getResetTimeInHrs() {
        return this.resetTimeInHrs;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.interstitial.AdInterstitialManagerImpl$SourceType> getSource() {
        return this.source;
    }

    public int hashCode() {
        int i;
        int hashCode;
        if (this.enable) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i2 = ((i * 31) + this.fCap) * 31;
        long j = this.resetTimeInHrs;
        int e = ax1.bar.e((i2 + ((int) (j ^ (j >>> 32)))) * 31, 31, this.placement);
        java.util.List<com.truecaller.ads.interstitial.AdInterstitialManagerImpl$SourceType> list = this.source;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return e + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.enable;
        int i = this.fCap;
        long j = this.resetTimeInHrs;
        java.lang.String str = this.placement;
        java.util.List<com.truecaller.ads.interstitial.AdInterstitialManagerImpl$SourceType> list = this.source;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlacementConfig(enable=");
        sb.append(z);
        sb.append(", fCap=");
        sb.append(i);
        sb.append(", resetTimeInHrs=");
        ro0.f.K(sb, j, ", placement=", str);
        sb.append(", source=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ AdInterstitialManagerImpl$PlacementConfig(boolean z, int i, long j, java.lang.String str, java.util.List list, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, (i2 & 4) != 0 ? 0L : j, str, list);
    }
}
