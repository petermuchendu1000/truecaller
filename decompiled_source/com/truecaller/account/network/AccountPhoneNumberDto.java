package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/account/network/AccountPhoneNumberDto;", "", "phoneNumber", "", "countryCode", "", "priority", "", "<init>", "(JLjava/lang/String;I)V", "getPhoneNumber", "()J", "getCountryCode", "()Ljava/lang/String;", "getPriority", "()I", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AccountPhoneNumberDto {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String countryCode;
    private final long phoneNumber;
    private final int priority;

    public AccountPhoneNumberDto(long j, @org.jetbrains.annotations.NotNull java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "countryCode");
        this.phoneNumber = j;
        this.countryCode = str;
        this.priority = i;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final long getPhoneNumber() {
        return this.phoneNumber;
    }

    public final int getPriority() {
        return this.priority;
    }
}
