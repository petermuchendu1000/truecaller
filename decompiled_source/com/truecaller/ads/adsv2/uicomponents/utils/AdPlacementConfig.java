package com.truecaller.ads.adsv2.uicomponents.utils;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/ads/adsv2/uicomponents/utils/AdPlacementConfig;", "", "placement", "", "enable", "", "<init>", "(Ljava/lang/String;Z)V", "getPlacement", "()Ljava/lang/String;", "getEnable", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdPlacementConfig {
    public static final int $stable = 0;
    private final boolean enable;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String placement;

    public AdPlacementConfig(@org.jetbrains.annotations.NotNull java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        this.placement = str;
        this.enable = z;
    }

    public static /* synthetic */ com.truecaller.ads.adsv2.uicomponents.utils.AdPlacementConfig copy$default(com.truecaller.ads.adsv2.uicomponents.utils.AdPlacementConfig adPlacementConfig, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = adPlacementConfig.placement;
        }
        if ((i & 2) != 0) {
            z = adPlacementConfig.enable;
        }
        return adPlacementConfig.copy(str, z);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsv2.uicomponents.utils.AdPlacementConfig copy(@org.jetbrains.annotations.NotNull java.lang.String placement, boolean enable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        return new com.truecaller.ads.adsv2.uicomponents.utils.AdPlacementConfig(placement, enable);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsv2.uicomponents.utils.AdPlacementConfig)) {
            return false;
        }
        com.truecaller.ads.adsv2.uicomponents.utils.AdPlacementConfig adPlacementConfig = (com.truecaller.ads.adsv2.uicomponents.utils.AdPlacementConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.placement, adPlacementConfig.placement) && this.enable == adPlacementConfig.enable;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        return (this.placement.hashCode() * 31) + (this.enable ? 1231 : 1237);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bx.e1.p("AdPlacementConfig(placement=", this.placement, ", enable=", this.enable, ")");
    }
}
