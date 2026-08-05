package com.truecaller.ads.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class c {
    public final int a;
    public final int b;

    public c(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ads.analytics.c)) {
            return false;
        }
        com.truecaller.ads.analytics.c cVar = (com.truecaller.ads.analytics.c) obj;
        return this.a == cVar.a && this.b == cVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return h0.b.P(this.a, this.b, "AdSizeData(width=", ", height=", ")");
    }
}
