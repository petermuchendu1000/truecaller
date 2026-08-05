package com.truecaller.ads.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux {
    public final long a;
    public final long b;

    public qux(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ads.analytics.qux)) {
            return false;
        }
        com.truecaller.ads.analytics.qux quxVar = (com.truecaller.ads.analytics.qux) obj;
        return this.a == quxVar.a && this.b == quxVar.b;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final java.lang.String toString() {
        return bar.n(this.b, ")", h0.b.T(this.a, "AdClickPosition(positionX=", ", positionY="));
    }
}
