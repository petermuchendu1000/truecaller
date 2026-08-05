package com.truecaller.account.domain.auth;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class s1 extends gd3.y {
    public final /* synthetic */ gd3.qux b;
    public final /* synthetic */ com.truecaller.account.domain.auth.t1 c;
    public final /* synthetic */ gd3.n1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(gd3.qux quxVar, com.truecaller.account.domain.auth.t1 t1Var, gd3.n1 n1Var, gd3.d dVar) {
        super(dVar);
        this.b = quxVar;
        this.c = t1Var;
        this.d = n1Var;
    }

    public final void a(java.lang.String str, java.lang.Throwable th) {
        gd3.b0 b0Var;
        java.lang.Integer num;
        kotlin.text.MatchGroup h;
        java.lang.String str2;
        super/*gd3.v1*/.a(str, th);
        gd3.qux quxVar = this.b;
        if (quxVar != null) {
            b0Var = quxVar.c;
        } else {
            b0Var = null;
        }
        if ((b0Var instanceof com.truecaller.account.domain.auth.r1) && ((com.truecaller.account.domain.auth.r1) b0Var).n()) {
            gd3.g2 e = gd3.g2.e(th);
            if (e.a == gd3.g2.k.a) {
                try {
                    java.lang.String str3 = e.b;
                    com.truecaller.account.domain.auth.t1 t1Var = this.c;
                    if (str3 != null) {
                        kotlin.text.Regex regex = (kotlin.text.Regex) t1Var.c;
                        kotlin.text.n nVar = kotlin.text.Regex.c;
                        kotlin.text.m b = regex.b(str3);
                        if (b != null && (h = b.c.h(1)) != null && (str2 = h.a) != null) {
                            num = kotlin.text.StringsKt.toIntOrNull(str2);
                            com.truecaller.account.domain.auth.b1 b1Var = (com.truecaller.account.domain.auth.b1) ((qc3.bar) t1Var.b).get();
                            java.lang.String str4 = this.d.b;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "getFullMethodName(...)");
                            java.lang.String m = ((com.truecaller.account.domain.auth.r1) b0Var).m();
                            com.truecaller.account.domain.auth.d1 d1Var = (com.truecaller.account.domain.auth.d1) b1Var;
                            d1Var.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "requestUrl");
                            fg3.h0.J(d1Var.a, d1Var.b, (fg3.f0) null, new com.truecaller.account.domain.auth.c1(d1Var, m, str4, num, null), 2);
                        }
                    }
                    num = null;
                    com.truecaller.account.domain.auth.b1 b1Var2 = (com.truecaller.account.domain.auth.b1) ((qc3.bar) t1Var.b).get();
                    java.lang.String str42 = this.d.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str42, "getFullMethodName(...)");
                    java.lang.String m2 = ((com.truecaller.account.domain.auth.r1) b0Var).m();
                    com.truecaller.account.domain.auth.d1 d1Var2 = (com.truecaller.account.domain.auth.d1) b1Var2;
                    d1Var2.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str42, "requestUrl");
                    fg3.h0.J(d1Var2.a, d1Var2.b, (fg3.f0) null, new com.truecaller.account.domain.auth.c1(d1Var2, m2, str42, num, null), 2);
                } catch (java.io.IOException unused) {
                }
            }
        }
    }
}
