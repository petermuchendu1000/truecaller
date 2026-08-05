package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class i0 {
    public final long a;
    public final long b;
    public final long c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final v3.baz f;
    public final com.truecaller.blockinglevel.api.BlockLevel g;
    public final int h;
    public final float i;

    public i0(long j, long j2, long j3, java.lang.String str, java.lang.String str2, v3.baz bazVar, com.truecaller.blockinglevel.api.BlockLevel blockLevel, int i, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "label");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "icon");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "level");
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = bazVar;
        this.g = blockLevel;
        this.h = i;
        this.i = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.blockinglevel.presentation.i0)) {
            return false;
        }
        com.truecaller.blockinglevel.presentation.i0 i0Var = (com.truecaller.blockinglevel.presentation.i0) obj;
        return q3.r.d(this.a, i0Var.a) && q3.r.d(this.b, i0Var.b) && q3.r.d(this.c, i0Var.c) && kotlin.jvm.internal.Intrinsics.b(this.d, i0Var.d) && kotlin.jvm.internal.Intrinsics.b(this.e, i0Var.e) && kotlin.jvm.internal.Intrinsics.b(this.f, i0Var.f) && this.g == i0Var.g && this.h == i0Var.h && java.lang.Float.compare(this.i, i0Var.i) == 0;
    }

    public final int hashCode() {
        int i = q3.r.m;
        return java.lang.Float.floatToIntBits(this.i) + ((((this.g.hashCode() + ((this.f.hashCode() + ax1.bar.e(ax1.bar.e(d4.t.k(d4.t.k(kotlin.e0.a(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31) + this.h) * 31);
    }

    public final java.lang.String toString() {
        java.lang.String j = q3.r.j(this.a);
        java.lang.String j2 = q3.r.j(this.b);
        java.lang.String j3 = q3.r.j(this.c);
        java.lang.StringBuilder E = ro0.f.E("Level(gradientColorStart=", j, ", gradientColorEnd=", j2, ", labelColor=");
        bar.E(E, j3, ", label=", this.d, ", title=");
        E.append(this.e);
        E.append(", icon=");
        E.append(this.f);
        E.append(", level=");
        E.append(this.g);
        E.append(", index=");
        E.append(this.h);
        E.append(", barHeightRatio=");
        return k9.d.o(this.i, ")", E);
    }
}
