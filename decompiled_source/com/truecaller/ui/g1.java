package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class g1 implements com.truecaller.ui.i1 {
    public final int a;
    public final boolean b;
    public final int c;
    public final int d;
    public final java.lang.String e;
    public final int f;

    public g1(int i, int i2, int i3, int i4, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ui.g1)) {
            return false;
        }
        com.truecaller.ui.g1 g1Var = (com.truecaller.ui.g1) obj;
        return this.a == g1Var.a && this.b == g1Var.b && this.c == g1Var.c && this.d == g1Var.d && kotlin.jvm.internal.Intrinsics.b(this.e, g1Var.e) && this.f == g1Var.f;
    }

    public final int hashCode() {
        int i;
        int i2 = this.a * 31;
        if (this.b) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ax1.bar.e(li.qux.s((((i2 + i) * 31) + this.c) * 31, this.d, 31, 2130970621, 31), 31, this.e) + this.f;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(image=");
        sb.append(this.a);
        sb.append(", autoMirrorImage=");
        sb.append(this.b);
        sb.append(", tint=");
        os0.bar.A(this.c, this.d, ", shadowTintLight=", ", shadowTintDark=", sb);
        uf.qux.q(2130970621, ", title=", this.e, ", subtitle=", sb);
        return bar.m(this.f, ")", sb);
    }
}
