package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class m0 {
    public final com.truecaller.blockinglevel.api.BlockLevel a;
    public final int b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final zf3.baz e;
    public final long f;

    public m0(com.truecaller.blockinglevel.api.BlockLevel blockLevel, int i, java.lang.String str, java.lang.String str2, zf3.b bVar, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "level");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "subtitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "features");
        this.a = blockLevel;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = bVar;
        this.f = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.blockinglevel.presentation.m0)) {
            return false;
        }
        com.truecaller.blockinglevel.presentation.m0 m0Var = (com.truecaller.blockinglevel.presentation.m0) obj;
        return this.a == m0Var.a && this.b == m0Var.b && kotlin.jvm.internal.Intrinsics.b(this.c, m0Var.c) && kotlin.jvm.internal.Intrinsics.b(this.d, m0Var.d) && kotlin.jvm.internal.Intrinsics.b(this.e, m0Var.e) && q3.r.d(this.f, m0Var.f);
    }

    public final int hashCode() {
        int i = bx.e1.i(this.e, ax1.bar.e(ax1.bar.e(((this.a.hashCode() * 31) + this.b) * 31, 31, this.c), 31, this.d), 31);
        int i2 = q3.r.m;
        return kotlin.e0.a(this.f) + i;
    }

    public final java.lang.String toString() {
        java.lang.String j = q3.r.j(this.f);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProtectionLevelCardData(level=");
        sb.append(this.a);
        sb.append(", iconRes=");
        sb.append(this.b);
        sb.append(", title=");
        bar.E(sb, this.c, ", subtitle=", this.d, ", features=");
        sb.append(this.e);
        sb.append(", selectedIconBackground=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
