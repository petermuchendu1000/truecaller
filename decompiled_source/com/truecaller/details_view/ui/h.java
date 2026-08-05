package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class h extends com.truecaller.details_view.ui.r {
    public final int m;
    public final boolean n;

    public h(int i, boolean z) {
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
        if (!(obj instanceof com.truecaller.details_view.ui.h)) {
            return false;
        }
        com.truecaller.details_view.ui.h hVar = (com.truecaller.details_view.ui.h) obj;
        return this.m == hVar.m && this.n == hVar.n;
    }

    public final int hashCode() {
        return (this.m * 31) + (this.n ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return com.ironsource.adqualitysdk.sdk.i.bar.l(this.m, "PhonebookSpam(spamScore=", ", isTopSpammer=", ")", this.n);
    }
}
