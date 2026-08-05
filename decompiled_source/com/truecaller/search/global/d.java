package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class d {
    public final com.truecaller.search.global.f a;
    public final com.truecaller.search.global.s0 b;
    public final com.truecaller.search.global.x0 c;
    public final com.truecaller.search.global.k1 d;
    public final com.truecaller.search.global.bar e;
    public final com.truecaller.search.global.qux f;
    public com.truecaller.search.global.SearchResultOrder g;
    public com.truecaller.search.global.b h;
    public final m03.s i;
    public final qo1.k j;

    public d(com.truecaller.search.global.f fVar, com.truecaller.search.global.s0 s0Var, com.truecaller.search.global.x0 x0Var, com.truecaller.search.global.k1 k1Var, com.truecaller.search.global.bar barVar, com.truecaller.search.global.qux quxVar, com.truecaller.search.global.SearchResultOrder searchResultOrder, m03.s sVar, qo1.k kVar) {
        com.truecaller.search.global.b bVar;
        this.a = fVar;
        this.b = s0Var;
        this.c = x0Var;
        this.d = k1Var;
        this.e = barVar;
        this.f = quxVar;
        this.g = searchResultOrder;
        this.i = sVar;
        this.j = kVar;
        int i = com.truecaller.search.global.c.a[searchResultOrder.ordinal()];
        if (i != 4 && i != 5) {
            if (i != 6) {
                bVar = fVar;
                if (i == 7) {
                    bVar = x0Var;
                }
            } else {
                bVar = s0Var;
            }
        } else {
            bVar = a();
        }
        this.h = bVar;
        b();
    }

    public final com.truecaller.search.global.b a() {
        if (this.i.b()) {
            return this.d;
        }
        return this.e;
    }

    public final void b() {
        com.truecaller.log.AssertionUtil.isNotNull(this.h, new java.lang.String[]{"Main Adapter is not assigned."});
        int i = com.truecaller.search.global.c.a[this.g.ordinal()];
        com.truecaller.search.global.b bVar = this.a;
        com.truecaller.search.global.x0 x0Var = this.c;
        com.truecaller.search.global.s0 s0Var = this.b;
        switch (i) {
            case 1:
                x0Var.s(a());
                s0Var.s(x0Var);
                bVar = s0Var;
                break;
            case 2:
                s0Var.s(x0Var);
                a().s(s0Var);
                bVar = a();
                break;
            case 3:
                x0Var.s(s0Var);
                a().s(x0Var);
                bVar = a();
                break;
            case 4:
                s0Var.s(x0Var);
                bVar.s(s0Var);
                break;
            case 5:
                x0Var.s(s0Var);
                bVar.s(x0Var);
                break;
            case 6:
                bVar.s(a());
                x0Var.s(bVar);
                bVar = x0Var;
                break;
            case 7:
                s0Var.s(a());
                bVar.s(s0Var);
                break;
            default:
                bVar = null;
                break;
        }
        boolean e = this.j.e();
        com.truecaller.search.global.qux quxVar = this.f;
        if (e) {
            this.h.s(bVar);
            quxVar.s(this.h);
            this.h = quxVar;
        } else {
            quxVar.s(bVar);
            this.h.s(quxVar);
        }
    }
}
