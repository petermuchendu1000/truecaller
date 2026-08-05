package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/truecaller/account/network/AccountPhoneNumbersResponseDto;", "", "phones", "", "Lcom/truecaller/account/network/AccountPhoneNumberDto;", "<init>", "(Ljava/util/List;)V", "getPhones", "()Ljava/util/List;", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AccountPhoneNumbersResponseDto {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.account.network.AccountPhoneNumberDto> phones;

    public AccountPhoneNumbersResponseDto(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.account.network.AccountPhoneNumberDto> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "phones");
        this.phones = list;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.account.network.AccountPhoneNumberDto> getPhones() {
        return this.phones;
    }
}
