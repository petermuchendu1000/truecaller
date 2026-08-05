package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class b0 extends com.truecaller.ads.util.e0 {
    public final int a;

    public b0(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.ads.util.b0) && this.a == ((com.truecaller.ads.util.b0) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return y.o.d(this.a, "GAMFailedServeAdRouterIfAvailable(reason=", ")");
    }
}
