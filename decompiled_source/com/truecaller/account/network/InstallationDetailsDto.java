package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/truecaller/account/network/InstallationDetailsDto;", "", "language", "", "device", "Lcom/truecaller/account/network/DeviceDto;", "app", "Lcom/truecaller/account/network/AppDto;", "storeVersion", "Lcom/truecaller/account/network/VersionDto;", "sims", "", "Lcom/truecaller/account/network/SimDto;", "<init>", "(Ljava/lang/String;Lcom/truecaller/account/network/DeviceDto;Lcom/truecaller/account/network/AppDto;Lcom/truecaller/account/network/VersionDto;Ljava/util/List;)V", "getLanguage", "()Ljava/lang/String;", "getDevice", "()Lcom/truecaller/account/network/DeviceDto;", "getApp", "()Lcom/truecaller/account/network/AppDto;", "getStoreVersion", "()Lcom/truecaller/account/network/VersionDto;", "getSims", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class InstallationDetailsDto {

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.account.network.AppDto app;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.account.network.DeviceDto device;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String language;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.account.network.SimDto> sims;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.account.network.VersionDto storeVersion;

    public InstallationDetailsDto(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull com.truecaller.account.network.DeviceDto deviceDto, @org.jetbrains.annotations.NotNull com.truecaller.account.network.AppDto appDto, @org.jetbrains.annotations.Nullable com.truecaller.account.network.VersionDto versionDto, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.account.network.SimDto> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceDto, "device");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appDto, "app");
        this.language = str;
        this.device = deviceDto;
        this.app = appDto;
        this.storeVersion = versionDto;
        this.sims = list;
    }

    public static /* synthetic */ com.truecaller.account.network.InstallationDetailsDto copy$default(com.truecaller.account.network.InstallationDetailsDto installationDetailsDto, java.lang.String str, com.truecaller.account.network.DeviceDto deviceDto, com.truecaller.account.network.AppDto appDto, com.truecaller.account.network.VersionDto versionDto, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = installationDetailsDto.language;
        }
        if ((i & 2) != 0) {
            deviceDto = installationDetailsDto.device;
        }
        if ((i & 4) != 0) {
            appDto = installationDetailsDto.app;
        }
        if ((i & 8) != 0) {
            versionDto = installationDetailsDto.storeVersion;
        }
        if ((i & 16) != 0) {
            list = installationDetailsDto.sims;
        }
        java.util.List list2 = list;
        com.truecaller.account.network.AppDto appDto2 = appDto;
        return installationDetailsDto.copy(str, deviceDto, appDto2, versionDto, list2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLanguage() {
        return this.language;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.account.network.DeviceDto getDevice() {
        return this.device;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.account.network.AppDto getApp() {
        return this.app;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.account.network.VersionDto getStoreVersion() {
        return this.storeVersion;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.account.network.SimDto> component5() {
        return this.sims;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.account.network.InstallationDetailsDto copy(@org.jetbrains.annotations.Nullable java.lang.String language, @org.jetbrains.annotations.NotNull com.truecaller.account.network.DeviceDto device, @org.jetbrains.annotations.NotNull com.truecaller.account.network.AppDto app, @org.jetbrains.annotations.Nullable com.truecaller.account.network.VersionDto storeVersion, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.account.network.SimDto> sims) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(device, "device");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(app, "app");
        return new com.truecaller.account.network.InstallationDetailsDto(language, device, app, storeVersion, sims);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.account.network.InstallationDetailsDto)) {
            return false;
        }
        com.truecaller.account.network.InstallationDetailsDto installationDetailsDto = (com.truecaller.account.network.InstallationDetailsDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.language, installationDetailsDto.language) && kotlin.jvm.internal.Intrinsics.b(this.device, installationDetailsDto.device) && kotlin.jvm.internal.Intrinsics.b(this.app, installationDetailsDto.app) && kotlin.jvm.internal.Intrinsics.b(this.storeVersion, installationDetailsDto.storeVersion) && kotlin.jvm.internal.Intrinsics.b(this.sims, installationDetailsDto.sims);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.account.network.AppDto getApp() {
        return this.app;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.account.network.DeviceDto getDevice() {
        return this.device;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLanguage() {
        return this.language;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.account.network.SimDto> getSims() {
        return this.sims;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.account.network.VersionDto getStoreVersion() {
        return this.storeVersion;
    }

    public int hashCode() {
        java.lang.String str = this.language;
        int hashCode = (this.app.hashCode() + ((this.device.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
        com.truecaller.account.network.VersionDto versionDto = this.storeVersion;
        int hashCode2 = (hashCode + (versionDto == null ? 0 : versionDto.hashCode())) * 31;
        java.util.List<com.truecaller.account.network.SimDto> list = this.sims;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.language;
        com.truecaller.account.network.DeviceDto deviceDto = this.device;
        com.truecaller.account.network.AppDto appDto = this.app;
        com.truecaller.account.network.VersionDto versionDto = this.storeVersion;
        java.util.List<com.truecaller.account.network.SimDto> list = this.sims;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstallationDetailsDto(language=");
        sb.append(str);
        sb.append(", device=");
        sb.append(deviceDto);
        sb.append(", app=");
        sb.append(appDto);
        sb.append(", storeVersion=");
        sb.append(versionDto);
        sb.append(", sims=");
        return y.o.g(sb, list, ")");
    }
}
