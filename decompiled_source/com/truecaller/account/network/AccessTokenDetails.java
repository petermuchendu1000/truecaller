package com.truecaller.account.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/truecaller/account/network/AccessTokenDetails;", "", "Lcom/truecaller/account/network/m;", "config", "Lcom/truecaller/account/network/VerificationTokenResponse;", "tokens", "<init>", "(Lcom/truecaller/account/network/m;Lcom/truecaller/account/network/VerificationTokenResponse;)V", "component1", "()Lcom/truecaller/account/network/m;", "component2", "()Lcom/truecaller/account/network/VerificationTokenResponse;", "copy", "(Lcom/truecaller/account/network/m;Lcom/truecaller/account/network/VerificationTokenResponse;)Lcom/truecaller/account/network/AccessTokenDetails;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/truecaller/account/network/m;", "getConfig", "Lcom/truecaller/account/network/VerificationTokenResponse;", "getTokens", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AccessTokenDetails {

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.account.network.m config;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.account.network.VerificationTokenResponse tokens;

    public AccessTokenDetails(@org.jetbrains.annotations.NotNull com.truecaller.account.network.m mVar, @org.jetbrains.annotations.NotNull com.truecaller.account.network.VerificationTokenResponse verificationTokenResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationTokenResponse, "tokens");
        this.config = mVar;
        this.tokens = verificationTokenResponse;
    }

    public static /* synthetic */ com.truecaller.account.network.AccessTokenDetails copy$default(com.truecaller.account.network.AccessTokenDetails accessTokenDetails, com.truecaller.account.network.m mVar, com.truecaller.account.network.VerificationTokenResponse verificationTokenResponse, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mVar = accessTokenDetails.config;
        }
        if ((i & 2) != 0) {
            verificationTokenResponse = accessTokenDetails.tokens;
        }
        return accessTokenDetails.copy(mVar, verificationTokenResponse);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.account.network.m getConfig() {
        return this.config;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.account.network.VerificationTokenResponse getTokens() {
        return this.tokens;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.account.network.AccessTokenDetails copy(@org.jetbrains.annotations.NotNull com.truecaller.account.network.m config, @org.jetbrains.annotations.NotNull com.truecaller.account.network.VerificationTokenResponse tokens) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokens, "tokens");
        return new com.truecaller.account.network.AccessTokenDetails(config, tokens);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.account.network.AccessTokenDetails)) {
            return false;
        }
        com.truecaller.account.network.AccessTokenDetails accessTokenDetails = (com.truecaller.account.network.AccessTokenDetails) other;
        return kotlin.jvm.internal.Intrinsics.b(this.config, accessTokenDetails.config) && kotlin.jvm.internal.Intrinsics.b(this.tokens, accessTokenDetails.tokens);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.account.network.m getConfig() {
        return this.config;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.account.network.VerificationTokenResponse getTokens() {
        return this.tokens;
    }

    public int hashCode() {
        return this.tokens.hashCode() + (this.config.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "AccessTokenDetails(config=" + this.config + ", tokens=" + this.tokens + ")";
    }
}
