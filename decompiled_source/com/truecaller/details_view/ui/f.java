package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class f extends com.truecaller.details_view.ui.r {
    public final int m;

    public f(int i) {
        this.m = i;
    }

    @Override // com.truecaller.details_view.ui.r
    public final int K() {
        return this.m;
    }

    @Override // com.truecaller.details_view.ui.r
    public final boolean L() {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.details_view.ui.f) && this.m == ((com.truecaller.details_view.ui.f) obj).m;
    }

    public final int hashCode() {
        return (this.m * 31) + 1237;
    }

    public final java.lang.String toString() {
        return y.o.d(this.m, "Gold(spamScore=", ", isTopSpammer=false)");
    }
}
