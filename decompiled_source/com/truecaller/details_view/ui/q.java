package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class q extends com.truecaller.details_view.ui.r {
    public final int m;
    public final boolean n;

    public q(int i, boolean z) {
        this.m = i;
        this.n = z;
    }

    @Override // com.truecaller.details_view.ui.r
    public final int K() {
        return this.m;
    }

    @Override // com.truecaller.details_view.ui.r
    public final boolean L() {
        return this.n;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.details_view.ui.q)) {
            return false;
        }
        com.truecaller.details_view.ui.q qVar = (com.truecaller.details_view.ui.q) obj;
        return this.m == qVar.m && this.n == qVar.n;
    }

    public final int hashCode() {
        return (this.m * 31) + (this.n ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return com.ironsource.adqualitysdk.sdk.i.bar.l(this.m, "VerifiedBusiness(spamScore=", ", isTopSpammer=", ")", this.n);
    }
}
