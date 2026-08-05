package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/truecaller/account/network/CheckCredentialsRequestDto;", "", "", "reason", "Lcom/truecaller/account/network/CheckCredentialsDeviceDto;", "device", "endpoint", "<init>", "(Ljava/lang/String;Lcom/truecaller/account/network/CheckCredentialsDeviceDto;Ljava/lang/String;)V", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "Lcom/truecaller/account/network/CheckCredentialsDeviceDto;", "getDevice", "()Lcom/truecaller/account/network/CheckCredentialsDeviceDto;", "getEndpoint", "Companion", "com/truecaller/account/network/c", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CheckCredentialsRequestDto {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.account.network.c Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REASON_RECEIVED_UNAUTHORIZED = "received_unauthorized";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REASON_RESTORED_FROM_ACCOUNT_MANAGER = "restored_from_account_manager";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REASON_RESTORED_FROM_AUTOBACKUP = "restored_from_autobackup";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String REASON_RESTORED_FROM_FILE = "restored_from_file";

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.account.network.CheckCredentialsDeviceDto device;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String endpoint;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String reason;

    public CheckCredentialsRequestDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull com.truecaller.account.network.CheckCredentialsDeviceDto checkCredentialsDeviceDto, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "reason");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCredentialsDeviceDto, "device");
        this.reason = str;
        this.device = checkCredentialsDeviceDto;
        this.endpoint = str2;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.account.network.CheckCredentialsDeviceDto getDevice() {
        return this.device;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEndpoint() {
        return this.endpoint;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getReason() {
        return this.reason;
    }

    public /* synthetic */ CheckCredentialsRequestDto(java.lang.String str, com.truecaller.account.network.CheckCredentialsDeviceDto checkCredentialsDeviceDto, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, checkCredentialsDeviceDto, (i & 4) != 0 ? null : str2);
    }
}
