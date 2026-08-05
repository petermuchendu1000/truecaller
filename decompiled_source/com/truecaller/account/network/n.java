package com.truecaller.account.network;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lcom/truecaller/account/network/n;", "", "", "a", "J", "b", "()J", "ttl", "", "Ljava/lang/String;", "()Ljava/lang/String;", "token", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class n {

    /* renamed from: a, reason: from kotlin metadata */
    @bw.qux("ttl")
    private final long ttl;

    /* renamed from: b, reason: from kotlin metadata */
    @bw.qux("token")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String token;

    /* renamed from: a, reason: from getter */
    public final java.lang.String getToken() {
        return this.token;
    }

    /* renamed from: b, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.account.network.n)) {
            return false;
        }
        com.truecaller.account.network.n nVar = (com.truecaller.account.network.n) obj;
        return this.ttl == nVar.ttl && kotlin.jvm.internal.Intrinsics.b(this.token, nVar.token);
    }

    public final int hashCode() {
        long j = this.ttl;
        return this.token.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("TokenDto(ttl=", this.ttl, ", token=", this.token);
        p.append(")");
        return p.toString();
    }
}
