package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/account/network/ExchangeCredentialsRequestDto;", "", "installationId", "", "<init>", "(Ljava/lang/String;)V", "getInstallationId", "()Ljava/lang/String;", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ExchangeCredentialsRequestDto {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String installationId;

    public ExchangeCredentialsRequestDto(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "installationId");
        this.installationId = str;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getInstallationId() {
        return this.installationId;
    }
}
