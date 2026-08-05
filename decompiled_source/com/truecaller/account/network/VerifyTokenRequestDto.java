package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/truecaller/account/network/VerifyTokenRequestDto;", "", "requestId", "", "phoneNumber", "countryCode", "dialingCode", "", "token", "verifiedSim", "Lcom/truecaller/account/network/SimDto;", "simSubscriptionIds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/truecaller/account/network/SimDto;Ljava/util/List;)V", "getRequestId", "()Ljava/lang/String;", "getPhoneNumber", "getCountryCode", "getDialingCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getToken", "getVerifiedSim", "()Lcom/truecaller/account/network/SimDto;", "getSimSubscriptionIds", "()Ljava/util/List;", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class VerifyTokenRequestDto {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String countryCode;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer dialingCode;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String phoneNumber;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String requestId;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Integer> simSubscriptionIds;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String token;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.account.network.SimDto verifiedSim;

    public VerifyTokenRequestDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.Nullable com.truecaller.account.network.SimDto simDto, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "countryCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "token");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "simSubscriptionIds");
        this.requestId = str;
        this.phoneNumber = str2;
        this.countryCode = str3;
        this.dialingCode = num;
        this.token = str4;
        this.verifiedSim = simDto;
        this.simSubscriptionIds = list;
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
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getSimSubscriptionIds() {
        return this.simSubscriptionIds;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToken() {
        return this.token;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.account.network.SimDto getVerifiedSim() {
        return this.verifiedSim;
    }
}
