package com.truecaller.account.domain.auth;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/truecaller/account/domain/auth/v1;", "", "", "a", "I", "()I", "statusCode", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
final /* data */ class v1 {

    /* renamed from: a, reason: from kotlin metadata */
    @bw.qux("status")
    private final int statusCode;

    /* renamed from: a, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.account.domain.auth.v1) && this.statusCode == ((com.truecaller.account.domain.auth.v1) obj).statusCode;
    }

    public final int hashCode() {
        return this.statusCode;
    }

    public final java.lang.String toString() {
        return y.o.d(this.statusCode, "UnauthorizedResponse(statusCode=", ")");
    }
}
