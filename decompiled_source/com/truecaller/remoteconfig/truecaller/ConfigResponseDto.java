package com.truecaller.remoteconfig.truecaller;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R,\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/truecaller/remoteconfig/truecaller/ConfigResponseDto;", "", "features", "", "", "upgradeStatus", "Lcom/truecaller/remoteconfig/truecaller/UpgradeStatusDto;", "<init>", "(Ljava/util/Map;Lcom/truecaller/remoteconfig/truecaller/UpgradeStatusDto;)V", "getFeatures", "()Ljava/util/Map;", "setFeatures", "(Ljava/util/Map;)V", "getUpgradeStatus", "()Lcom/truecaller/remoteconfig/truecaller/UpgradeStatusDto;", "setUpgradeStatus", "(Lcom/truecaller/remoteconfig/truecaller/UpgradeStatusDto;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class ConfigResponseDto {

    @bw.qux("features")
    @org.jetbrains.annotations.Nullable
    private java.util.Map<java.lang.String, java.lang.String> features;

    @bw.qux("upgradeStatus")
    @org.jetbrains.annotations.Nullable
    private com.truecaller.remoteconfig.truecaller.UpgradeStatusDto upgradeStatus;

    public ConfigResponseDto(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> map, @org.jetbrains.annotations.Nullable com.truecaller.remoteconfig.truecaller.UpgradeStatusDto upgradeStatusDto) {
        this.features = map;
        this.upgradeStatus = upgradeStatusDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.remoteconfig.truecaller.ConfigResponseDto copy$default(com.truecaller.remoteconfig.truecaller.ConfigResponseDto configResponseDto, java.util.Map map, com.truecaller.remoteconfig.truecaller.UpgradeStatusDto upgradeStatusDto, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = configResponseDto.features;
        }
        if ((i & 2) != 0) {
            upgradeStatusDto = configResponseDto.upgradeStatus;
        }
        return configResponseDto.copy(map, upgradeStatusDto);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.Map<java.lang.String, java.lang.String> component1() {
        return this.features;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.remoteconfig.truecaller.UpgradeStatusDto getUpgradeStatus() {
        return this.upgradeStatus;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.remoteconfig.truecaller.ConfigResponseDto copy(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> features, @org.jetbrains.annotations.Nullable com.truecaller.remoteconfig.truecaller.UpgradeStatusDto upgradeStatus) {
        return new com.truecaller.remoteconfig.truecaller.ConfigResponseDto(features, upgradeStatus);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.remoteconfig.truecaller.ConfigResponseDto)) {
            return false;
        }
        com.truecaller.remoteconfig.truecaller.ConfigResponseDto configResponseDto = (com.truecaller.remoteconfig.truecaller.ConfigResponseDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.features, configResponseDto.features) && kotlin.jvm.internal.Intrinsics.b(this.upgradeStatus, configResponseDto.upgradeStatus);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.Map<java.lang.String, java.lang.String> getFeatures() {
        return this.features;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.remoteconfig.truecaller.UpgradeStatusDto getUpgradeStatus() {
        return this.upgradeStatus;
    }

    public int hashCode() {
        java.util.Map<java.lang.String, java.lang.String> map = this.features;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        com.truecaller.remoteconfig.truecaller.UpgradeStatusDto upgradeStatusDto = this.upgradeStatus;
        return hashCode + (upgradeStatusDto != null ? upgradeStatusDto.hashCode() : 0);
    }

    public final void setFeatures(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> map) {
        this.features = map;
    }

    public final void setUpgradeStatus(@org.jetbrains.annotations.Nullable com.truecaller.remoteconfig.truecaller.UpgradeStatusDto upgradeStatusDto) {
        this.upgradeStatus = upgradeStatusDto;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "ConfigResponseDto(features=" + this.features + ", upgradeStatus=" + this.upgradeStatus + ")";
    }
}
