package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class i {
    public final float a;
    public final float b;
    public final float c;

    public i(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.common.ui.i)) {
            return false;
        }
        com.truecaller.common.ui.i iVar = (com.truecaller.common.ui.i) obj;
        return java.lang.Float.compare(this.a, iVar.a) == 0 && java.lang.Float.compare(this.b, iVar.b) == 0 && java.lang.Float.compare(this.c, iVar.c) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.c) + ax1.bar.d(this.b, java.lang.Float.floatToIntBits(this.a) * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Data(azimuth=");
        sb.append(this.a);
        sb.append(", pitch=");
        sb.append(this.b);
        sb.append(", roll=");
        return k9.d.o(this.c, ")", sb);
    }
}
