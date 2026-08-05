package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/truecaller/account/network/VerificationTokenResponse;", "", "", "", "Lcom/truecaller/account/network/n;", "Lcom/truecaller/account/network/TokenResponse;", "tokens", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/truecaller/account/network/VerificationTokenResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getTokens", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class VerificationTokenResponse {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, com.truecaller.account.network.n> tokens;

    public VerificationTokenResponse(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, com.truecaller.account.network.n> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "tokens");
        this.tokens = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.account.network.VerificationTokenResponse copy$default(com.truecaller.account.network.VerificationTokenResponse verificationTokenResponse, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = verificationTokenResponse.tokens;
        }
        return verificationTokenResponse.copy(map);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, com.truecaller.account.network.n> component1() {
        return this.tokens;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.account.network.VerificationTokenResponse copy(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, com.truecaller.account.network.n> tokens) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokens, "tokens");
        return new com.truecaller.account.network.VerificationTokenResponse(tokens);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.account.network.VerificationTokenResponse) && kotlin.jvm.internal.Intrinsics.b(this.tokens, ((com.truecaller.account.network.VerificationTokenResponse) other).tokens);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, com.truecaller.account.network.n> getTokens() {
        return this.tokens;
    }

    public int hashCode() {
        return this.tokens.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "VerificationTokenResponse(tokens=" + this.tokens + ")";
    }
}
