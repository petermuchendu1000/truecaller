package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/account/network/CallHeroTokenDto;", "", "token", "", "ttlInSeconds", "", "<init>", "(Ljava/lang/String;J)V", "getToken", "()Ljava/lang/String;", "getTtlInSeconds", "()J", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallHeroTokenDto {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String token;
    private final long ttlInSeconds;

    public CallHeroTokenDto(@org.jetbrains.annotations.NotNull java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "token");
        this.token = str;
        this.ttlInSeconds = j;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToken() {
        return this.token;
    }

    public final long getTtlInSeconds() {
        return this.ttlInSeconds;
    }
}
