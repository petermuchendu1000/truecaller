package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class j extends com.truecaller.details_view.ui.r {
    public final int m;
    public final boolean n;

    public j(int i, boolean z) {
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
        if (!(obj instanceof com.truecaller.details_view.ui.j)) {
            return false;
        }
        com.truecaller.details_view.ui.j jVar = (com.truecaller.details_view.ui.j) obj;
        return this.m == jVar.m && this.n == jVar.n;
    }

    public final int hashCode() {
        return (this.m * 31) + (this.n ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return com.ironsource.adqualitysdk.sdk.i.bar.l(this.m, "PrivateImBusinessBlacklisted(spamScore=", ", isTopSpammer=", ")", this.n);
    }
}
