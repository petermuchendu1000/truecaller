package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class a0 extends com.truecaller.ads.util.e0 {
    public final int a;

    public a0(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.ads.util.a0) && this.a == ((com.truecaller.ads.util.a0) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return y.o.d(this.a, "GAMFailedReqAdRouterAd(reason=", ")");
    }
}
