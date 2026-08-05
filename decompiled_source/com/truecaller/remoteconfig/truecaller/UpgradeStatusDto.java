package com.truecaller.remoteconfig.truecaller;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001fB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J+\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/truecaller/remoteconfig/truecaller/UpgradeStatusDto;", "", "upgradePath", "Lcom/truecaller/remoteconfig/truecaller/UpgradeStatusDto$UpgradePathDto;", "downloadLink", "", "frequency", "", "<init>", "(Lcom/truecaller/remoteconfig/truecaller/UpgradeStatusDto$UpgradePathDto;Ljava/lang/String;I)V", "getUpgradePath", "()Lcom/truecaller/remoteconfig/truecaller/UpgradeStatusDto$UpgradePathDto;", "setUpgradePath", "(Lcom/truecaller/remoteconfig/truecaller/UpgradeStatusDto$UpgradePathDto;)V", "getDownloadLink", "()Ljava/lang/String;", "setDownloadLink", "(Ljava/lang/String;)V", "getFrequency", "()I", "setFrequency", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "UpgradePathDto", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class UpgradeStatusDto {

    @bw.qux("downloadLink")
    @org.jetbrains.annotations.Nullable
    private java.lang.String downloadLink;

    @bw.qux("notifyFreqInDays")
    private int frequency;

    @bw.qux("upgradePath")
    @org.jetbrains.annotations.Nullable
    private com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto upgradePath;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/remoteconfig/truecaller/UpgradeStatusDto$UpgradePathDto;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NO_UPGRADE", "OPTIONAL", "MANDATORY", "RETIRED_VERSION", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static final class UpgradePathDto {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto[] $VALUES;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String value;
        public static final com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto NO_UPGRADE = new com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto("NO_UPGRADE", 0, "NO_UPGRADE");
        public static final com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto OPTIONAL = new com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto("OPTIONAL", 1, "OPTIONAL");
        public static final com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto MANDATORY = new com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto("MANDATORY", 2, "MANDATORY");
        public static final com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto RETIRED_VERSION = new com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto("RETIRED_VERSION", 3, "RETIRED_VERSION");

        private static final /* synthetic */ com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto[] $values() {
            return new com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto[]{NO_UPGRADE, OPTIONAL, MANDATORY, RETIRED_VERSION};
        }

        static {
            com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private UpgradePathDto(java.lang.String str, int i, java.lang.String str2) {
            this.value = str2;
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto valueOf(java.lang.String str) {
            return (com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto) java.lang.Enum.valueOf(com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto.class, str);
        }

        public static com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto[] values() {
            return (com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto[]) $VALUES.clone();
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValue() {
            return this.value;
        }
    }

    public UpgradeStatusDto(@org.jetbrains.annotations.Nullable com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto upgradePathDto, @org.jetbrains.annotations.Nullable java.lang.String str, int i) {
        this.upgradePath = upgradePathDto;
        this.downloadLink = str;
        this.frequency = i;
    }

    public static /* synthetic */ com.truecaller.remoteconfig.truecaller.UpgradeStatusDto copy$default(com.truecaller.remoteconfig.truecaller.UpgradeStatusDto upgradeStatusDto, com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto upgradePathDto, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            upgradePathDto = upgradeStatusDto.upgradePath;
        }
        if ((i2 & 2) != 0) {
            str = upgradeStatusDto.downloadLink;
        }
        if ((i2 & 4) != 0) {
            i = upgradeStatusDto.frequency;
        }
        return upgradeStatusDto.copy(upgradePathDto, str, i);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto getUpgradePath() {
        return this.upgradePath;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDownloadLink() {
        return this.downloadLink;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFrequency() {
        return this.frequency;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.remoteconfig.truecaller.UpgradeStatusDto copy(@org.jetbrains.annotations.Nullable com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto upgradePath, @org.jetbrains.annotations.Nullable java.lang.String downloadLink, int frequency) {
        return new com.truecaller.remoteconfig.truecaller.UpgradeStatusDto(upgradePath, downloadLink, frequency);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.remoteconfig.truecaller.UpgradeStatusDto)) {
            return false;
        }
        com.truecaller.remoteconfig.truecaller.UpgradeStatusDto upgradeStatusDto = (com.truecaller.remoteconfig.truecaller.UpgradeStatusDto) other;
        return this.upgradePath == upgradeStatusDto.upgradePath && kotlin.jvm.internal.Intrinsics.b(this.downloadLink, upgradeStatusDto.downloadLink) && this.frequency == upgradeStatusDto.frequency;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDownloadLink() {
        return this.downloadLink;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto getUpgradePath() {
        return this.upgradePath;
    }

    public int hashCode() {
        com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto upgradePathDto = this.upgradePath;
        int hashCode = (upgradePathDto == null ? 0 : upgradePathDto.hashCode()) * 31;
        java.lang.String str = this.downloadLink;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.frequency;
    }

    public final void setDownloadLink(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.downloadLink = str;
    }

    public final void setFrequency(int i) {
        this.frequency = i;
    }

    public final void setUpgradePath(@org.jetbrains.annotations.Nullable com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto upgradePathDto) {
        this.upgradePath = upgradePathDto;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto upgradePathDto = this.upgradePath;
        java.lang.String str = this.downloadLink;
        int i = this.frequency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpgradeStatusDto(upgradePath=");
        sb.append(upgradePathDto);
        sb.append(", downloadLink=");
        sb.append(str);
        sb.append(", frequency=");
        return bar.m(i, ")", sb);
    }

    public /* synthetic */ UpgradeStatusDto(com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto upgradePathDto, java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(upgradePathDto, str, (i2 & 4) != 0 ? 0 : i);
    }
}
