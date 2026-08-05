package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/truecaller/account/network/CheckCredentialsDeviceDto;", "", "deviceId", "", "model", "manufacturer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getModel", "getManufacturer", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CheckCredentialsDeviceDto {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String deviceId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String manufacturer;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String model;

    public CheckCredentialsDeviceDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "deviceId");
        this.deviceId = str;
        this.model = str2;
        this.manufacturer = str3;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getManufacturer() {
        return this.manufacturer;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getModel() {
        return this.model;
    }
}
