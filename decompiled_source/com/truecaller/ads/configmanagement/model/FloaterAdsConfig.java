package com.truecaller.ads.configmanagement.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/configmanagement/model/FloaterAdsConfig;", "", "placement", "", "enabled", "", "hideFloaterWhenListHasAdFromSdks", "", "Lcom/truecaller/ads/configmanagement/model/SDK;", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "getPlacement", "()Ljava/lang/String;", "getEnabled", "()Z", "getHideFloaterWhenListHasAdFromSdks", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class FloaterAdsConfig {
    public static final int $stable = 8;
    private final boolean enabled;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.configmanagement.model.SDK> hideFloaterWhenListHasAdFromSdks;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String placement;

    /* JADX WARN: Multi-variable type inference failed */
    public FloaterAdsConfig(@org.jetbrains.annotations.NotNull java.lang.String str, boolean z, @org.jetbrains.annotations.NotNull java.util.List<? extends com.truecaller.ads.configmanagement.model.SDK> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "hideFloaterWhenListHasAdFromSdks");
        this.placement = str;
        this.enabled = z;
        this.hideFloaterWhenListHasAdFromSdks = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.configmanagement.model.FloaterAdsConfig copy$default(com.truecaller.ads.configmanagement.model.FloaterAdsConfig floaterAdsConfig, java.lang.String str, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = floaterAdsConfig.placement;
        }
        if ((i & 2) != 0) {
            z = floaterAdsConfig.enabled;
        }
        if ((i & 4) != 0) {
            list = floaterAdsConfig.hideFloaterWhenListHasAdFromSdks;
        }
        return floaterAdsConfig.copy(str, z, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.configmanagement.model.SDK> component3() {
        return this.hideFloaterWhenListHasAdFromSdks;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.configmanagement.model.FloaterAdsConfig copy(@org.jetbrains.annotations.NotNull java.lang.String placement, boolean enabled, @org.jetbrains.annotations.NotNull java.util.List<? extends com.truecaller.ads.configmanagement.model.SDK> hideFloaterWhenListHasAdFromSdks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hideFloaterWhenListHasAdFromSdks, "hideFloaterWhenListHasAdFromSdks");
        return new com.truecaller.ads.configmanagement.model.FloaterAdsConfig(placement, enabled, hideFloaterWhenListHasAdFromSdks);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.configmanagement.model.FloaterAdsConfig)) {
            return false;
        }
        com.truecaller.ads.configmanagement.model.FloaterAdsConfig floaterAdsConfig = (com.truecaller.ads.configmanagement.model.FloaterAdsConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.placement, floaterAdsConfig.placement) && this.enabled == floaterAdsConfig.enabled && kotlin.jvm.internal.Intrinsics.b(this.hideFloaterWhenListHasAdFromSdks, floaterAdsConfig.hideFloaterWhenListHasAdFromSdks);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.configmanagement.model.SDK> getHideFloaterWhenListHasAdFromSdks() {
        return this.hideFloaterWhenListHasAdFromSdks;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        int i;
        int hashCode = this.placement.hashCode() * 31;
        if (this.enabled) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.hideFloaterWhenListHasAdFromSdks.hashCode() + ((hashCode + i) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.placement;
        boolean z = this.enabled;
        return y.o.g(ax1.bar.t("FloaterAdsConfig(placement=", str, ", enabled=", ", hideFloaterWhenListHasAdFromSdks=", z), this.hideFloaterWhenListHasAdFromSdks, ")");
    }
}
