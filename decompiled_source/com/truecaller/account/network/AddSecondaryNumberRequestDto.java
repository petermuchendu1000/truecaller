package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/account/network/AddSecondaryNumberRequestDto;", "", "phoneNumber", "", "countryCode", "dialingCode", "", "sequenceNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;I)V", "getPhoneNumber", "()Ljava/lang/String;", "getCountryCode", "getDialingCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSequenceNo", "()I", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AddSecondaryNumberRequestDto {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String countryCode;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer dialingCode;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String phoneNumber;
    private final int sequenceNo;

    public AddSecondaryNumberRequestDto(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.Integer num, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "countryCode");
        this.phoneNumber = str;
        this.countryCode = str2;
        this.dialingCode = num;
        this.sequenceNo = i;
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

    public final int getSequenceNo() {
        return this.sequenceNo;
    }
}
