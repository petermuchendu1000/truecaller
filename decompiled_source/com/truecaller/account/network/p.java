package com.truecaller.account.network;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/truecaller/account/network/p;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "path", "key", "account-network_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class p {

    /* renamed from: a, reason: from kotlin metadata */
    @bw.qux("p")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String path;

    /* renamed from: b, reason: from kotlin metadata */
    @bw.qux("k")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;

    /* renamed from: a, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    /* renamed from: b, reason: from getter */
    public final java.lang.String getPath() {
        return this.path;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.account.network.p)) {
            return false;
        }
        com.truecaller.account.network.p pVar = (com.truecaller.account.network.p) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.path, pVar.path) && kotlin.jvm.internal.Intrinsics.b(this.key, pVar.key);
    }

    public final int hashCode() {
        return this.key.hashCode() + (this.path.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return y.o.e("TokenPathDto(path=", this.path, ", key=", this.key, ")");
    }
}
