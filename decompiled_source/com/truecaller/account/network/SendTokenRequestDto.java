package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/truecaller/account/network/SendTokenRequestDto;", "", "", "phoneNumber", "countryCode", "", "dialingCode", "sequenceNo", "", "changeNumber", "region", "Lcom/truecaller/account/network/InstallationDetailsDto;", "installationDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;IZLjava/lang/String;Lcom/truecaller/account/network/InstallationDetailsDto;)V", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", "getCountryCode", "Ljava/lang/Integer;", "getDialingCode", "()Ljava/lang/Integer;", "I", "getSequenceNo", "()I", "Z", "getChangeNumber", "()Z", "getRegion", "Lcom/truecaller/account/network/InstallationDetailsDto;", "getInstallationDetails", "()Lcom/truecaller/account/network/InstallationDetailsDto;", "Companion", "com/truecaller/account/network/k", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class SendTokenRequestDto {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.account.network.k Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PRIVACY_REGION_1 = "region-1";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PRIVACY_REGION_BR = "region-br";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PRIVACY_REGION_C = "region-c";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PRIVACY_REGION_ROW = "region-2";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PRIVACY_REGION_ZA = "region-za";
    private final boolean changeNumber;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String countryCode;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer dialingCode;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.account.network.InstallationDetailsDto installationDetails;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String phoneNumber;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String region;
    private final int sequenceNo;

    public SendTokenRequestDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.Integer num, int i, boolean z, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull com.truecaller.account.network.InstallationDetailsDto installationDetailsDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "countryCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "region");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(installationDetailsDto, "installationDetails");
        this.phoneNumber = str;
        this.countryCode = str2;
        this.dialingCode = num;
        this.sequenceNo = i;
        this.changeNumber = z;
        this.region = str3;
        this.installationDetails = installationDetailsDto;
    }

    public final boolean getChangeNumber() {
        return this.changeNumber;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getDialingCode() {
        return this.dialingCode;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.account.network.InstallationDetailsDto getInstallationDetails() {
        return this.installationDetails;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRegion() {
        return this.region;
    }

    public final int getSequenceNo() {
        return this.sequenceNo;
    }
}
