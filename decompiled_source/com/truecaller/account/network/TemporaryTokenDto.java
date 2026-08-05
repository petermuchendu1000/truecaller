package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/truecaller/account/network/TemporaryTokenDto;", "", "token", "", "ttl", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "getToken", "()Ljava/lang/String;", "getTtl", "()Ljava/lang/Long;", "Ljava/lang/Long;", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TemporaryTokenDto {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String token;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long ttl;

    public TemporaryTokenDto(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.Long l) {
        this.token = str;
        this.ttl = l;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getToken() {
        return this.token;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getTtl() {
        return this.ttl;
    }
}
