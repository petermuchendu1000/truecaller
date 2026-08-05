package com.truecaller.ads.rewarded;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"com/truecaller/ads/rewarded/RewardedAdManagerImpl$PlacementConfig", "", "", "enable", "", "placement", "adUnitIdKey", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "Lcom/truecaller/ads/rewarded/RewardedAdManagerImpl$PlacementConfig;", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/truecaller/ads/rewarded/RewardedAdManagerImpl$PlacementConfig;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnable", "Ljava/lang/String;", "getPlacement", "getAdUnitIdKey", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class RewardedAdManagerImpl$PlacementConfig {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String adUnitIdKey;
    private final boolean enable;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String placement;

    public RewardedAdManagerImpl$PlacementConfig(boolean z, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "adUnitIdKey");
        this.enable = z;
        this.placement = str;
        this.adUnitIdKey = str2;
    }

    public static /* synthetic */ com.truecaller.ads.rewarded.RewardedAdManagerImpl$PlacementConfig copy$default(com.truecaller.ads.rewarded.RewardedAdManagerImpl$PlacementConfig rewardedAdManagerImpl$PlacementConfig, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = rewardedAdManagerImpl$PlacementConfig.enable;
        }
        if ((i & 2) != 0) {
            str = rewardedAdManagerImpl$PlacementConfig.placement;
        }
        if ((i & 4) != 0) {
            str2 = rewardedAdManagerImpl$PlacementConfig.adUnitIdKey;
        }
        return rewardedAdManagerImpl$PlacementConfig.copy(z, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAdUnitIdKey() {
        return this.adUnitIdKey;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.rewarded.RewardedAdManagerImpl$PlacementConfig copy(boolean enable, @org.jetbrains.annotations.NotNull java.lang.String placement, @org.jetbrains.annotations.NotNull java.lang.String adUnitIdKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitIdKey, "adUnitIdKey");
        return new com.truecaller.ads.rewarded.RewardedAdManagerImpl$PlacementConfig(enable, placement, adUnitIdKey);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.rewarded.RewardedAdManagerImpl$PlacementConfig)) {
            return false;
        }
        com.truecaller.ads.rewarded.RewardedAdManagerImpl$PlacementConfig rewardedAdManagerImpl$PlacementConfig = (com.truecaller.ads.rewarded.RewardedAdManagerImpl$PlacementConfig) other;
        return this.enable == rewardedAdManagerImpl$PlacementConfig.enable && kotlin.jvm.internal.Intrinsics.b(this.placement, rewardedAdManagerImpl$PlacementConfig.placement) && kotlin.jvm.internal.Intrinsics.b(this.adUnitIdKey, rewardedAdManagerImpl$PlacementConfig.adUnitIdKey);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdUnitIdKey() {
        return this.adUnitIdKey;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        int i;
        if (this.enable) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.adUnitIdKey.hashCode() + ax1.bar.e(i * 31, 31, this.placement);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.enable;
        return bar.v(this.adUnitIdKey, ")", bx.e1.u("PlacementConfig(enable=", ", placement=", this.placement, ", adUnitIdKey=", z));
    }
}
