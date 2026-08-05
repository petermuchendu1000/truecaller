package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class b {
    public int a = 0;
    public int b;
    public int c;
    public com.truecaller.search.global.h0 d;
    public boolean e;
    public com.truecaller.search.global.b f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    public b(int i) {
        this.b = i;
        this.c = java.lang.Math.min(0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.truecaller.search.global.e1 e1Var, int i) {
        java.lang.String str;
        int h = h(i);
        boolean z = true;
        if (i != d() - 1) {
            z = false;
        }
        e1Var.m(z);
        if (i == 0) {
            str = o();
        } else {
            str = null;
        }
        e1Var.g(str);
        if (h != i() && h != p() && h != l() && h != m() && h != q()) {
            if (h != k() && h != j()) {
                if (h == n()) {
                    b((ey2.a) e1Var, i);
                    return;
                }
                com.truecaller.search.global.b bVar = this.f;
                if (bVar != null) {
                    bVar.a(e1Var, f(i));
                    return;
                }
                return;
            }
            c((ey2.a) e1Var, this.h);
        }
    }

    public abstract void b(ey2.a aVar, int i);

    public abstract boolean c(ey2.a aVar, boolean z);

    public final int d() {
        int i;
        int i2 = this.b;
        int i3 = 1;
        if (i2 != Integer.MAX_VALUE && this.e) {
            return 1;
        }
        boolean z = this.e;
        int i4 = this.c;
        int i5 = (z ? 1 : 0) + i4;
        if (this.a > i2) {
            i = 1;
        } else {
            i = 0;
        }
        int i6 = i + i5;
        if (i4 != 0 || z || l() == 0) {
            i3 = 0;
        }
        return i6 + i3 + (this.i ? 1 : 0) + (this.j ? 1 : 0);
    }

    public final int e(int i) {
        if (i < d()) {
            return i;
        }
        com.truecaller.search.global.b bVar = this.f;
        if (bVar != null) {
            return bVar.e(i - d());
        }
        com.truecaller.log.AssertionUtil.shouldNeverHappen(new java.lang.IllegalArgumentException(y.o.d(i, "Position ", "cannot be mapped as the delegate position.")), new java.lang.String[0]);
        return -1;
    }

    public final int f(int i) {
        int d = i - d();
        if (d < 0) {
            java.util.Locale locale = java.util.Locale.ENGLISH;
            java.lang.String simpleName = getClass().getSimpleName();
            int d2 = d();
            boolean z = this.e;
            java.lang.StringBuilder z2 = bar.z("::getInnerPos:: ", i, simpleName, "  Original Adapter pos: ", " adapter count: ");
            z2.append(d2);
            z2.append("  is loading shown: ");
            z2.append(z);
            com.truecaller.log.AssertionUtil.shouldNeverHappen(new java.lang.IllegalArgumentException(" Position is -1. ".concat(z2.toString())), new java.lang.String[0]);
        }
        return d;
    }

    public final int g() {
        com.truecaller.search.global.b bVar;
        int d = d();
        int i = 0;
        if (this.b != Integer.MAX_VALUE && (bVar = this.f) != null) {
            i = bVar.g();
        }
        return d + i;
    }

    public final int h(int i) {
        boolean z;
        int i2;
        int h;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        com.truecaller.log.AssertionUtil.isTrue(z, new java.lang.String[]{bar.k(i, " Position was ")});
        if (this.h && i == this.c) {
            return j();
        }
        if (this.g && i == this.c) {
            return k();
        }
        if (this.j && i == this.c) {
            return m();
        }
        if (this.e && i == this.c) {
            return i();
        }
        int l = l();
        if (i == 0 && this.c == 0 && l > 0) {
            return l;
        }
        boolean z2 = this.e;
        int i3 = this.c;
        if (z2) {
            i3++;
        }
        if (i == i3 && this.i) {
            return p();
        }
        int i4 = this.c;
        if (z2) {
            i4++;
        }
        if (i == i4 && this.j) {
            return m();
        }
        if (z2 && (this.i || this.j)) {
            i2 = this.c + 2;
        } else if (!z2 && !this.i && !this.j) {
            i2 = this.c;
        } else {
            i2 = 1 + this.c;
        }
        if (i == i2 && this.a > this.b) {
            return q();
        }
        if (i < this.c) {
            return n();
        }
        com.truecaller.search.global.b bVar = this.f;
        if (bVar != null && (h = bVar.h(f(i))) > 0) {
            return h;
        }
        com.truecaller.log.AssertionUtil.shouldNeverHappen(new java.lang.IllegalStateException("View type for position " + i + " not handled. In adapter: " + this), new java.lang.String[0]);
        return 0;
    }

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract java.lang.String o();

    public abstract int p();

    public abstract int q();

    public final void r(int i) {
        this.a = i;
        this.c = java.lang.Math.min(i, this.b);
    }

    public final void s(com.truecaller.search.global.b bVar) {
        boolean z;
        if (bVar == this) {
            z = true;
        } else {
            z = false;
        }
        com.truecaller.log.AssertionUtil.isFalse(z, new java.lang.String[]{"You cannot nest an adapter inside itself"});
        this.f = bVar;
    }

    public final void t(int i) {
        this.b = i;
        this.c = java.lang.Math.min(this.a, i);
    }
}
