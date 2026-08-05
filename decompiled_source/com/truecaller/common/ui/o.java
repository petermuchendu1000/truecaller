package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class o {
    public final int a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ o() {
        this(0, true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.common.ui.o)) {
            return false;
        }
        com.truecaller.common.ui.o oVar = (com.truecaller.common.ui.o) obj;
        return this.a == oVar.a && this.b == oVar.b && this.c == oVar.c;
    }

    public final int hashCode() {
        int i;
        int i2 = this.a * 31;
        int i3 = 1237;
        if (this.b) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i4 = (i2 + i) * 31;
        if (this.c) {
            i3 = 1231;
        }
        return i4 + i3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StatusBarStyle(color=");
        sb.append(this.a);
        sb.append(", applySystemUiFlagLightStatusBar=");
        sb.append(this.b);
        sb.append(", useZeroTopInset=");
        return h8.s0.s(sb, this.c, ")");
    }

    public o(int i, boolean z) {
        this.a = i;
        this.b = z;
        this.c = true;
    }
}
