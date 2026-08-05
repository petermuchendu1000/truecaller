package com.truecaller.account.network;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R,\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0003\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/truecaller/account/network/m;", "", "", "a", "J", "b", "()J", "ttl", "", "", "", "Lcom/truecaller/account/network/p;", "Ljava/util/Map;", "()Ljava/util/Map;", "config", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class m {

    /* renamed from: a, reason: from kotlin metadata */
    @bw.qux("ttl")
    private final long ttl;

    /* renamed from: b, reason: from kotlin metadata */
    @bw.qux("config")
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.util.List<com.truecaller.account.network.p>> config;

    /* renamed from: a, reason: from getter */
    public final java.util.Map getConfig() {
        return this.config;
    }

    /* renamed from: b, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.account.network.m)) {
            return false;
        }
        com.truecaller.account.network.m mVar = (com.truecaller.account.network.m) obj;
        return this.ttl == mVar.ttl && kotlin.jvm.internal.Intrinsics.b(this.config, mVar.config);
    }

    public final int hashCode() {
        long j = this.ttl;
        return this.config.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final java.lang.String toString() {
        return "TokenConfigResponse(ttl=" + this.ttl + ", config=" + this.config + ")";
    }
}
