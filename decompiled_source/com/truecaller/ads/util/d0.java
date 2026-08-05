package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class d0 extends com.truecaller.ads.util.e0 {
    public final u90.baz a;
    public final int b;

    public d0(u90.baz bazVar, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "ad");
        this.a = bazVar;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.truecaller.ads.util.d0) {
                com.truecaller.ads.util.d0 d0Var = (com.truecaller.ads.util.d0) obj;
                if (!this.a.equals(d0Var.a) || this.b != d0Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "OnGamAdOpened(ad=" + this.a + ", id=" + this.b + ")";
    }
}
