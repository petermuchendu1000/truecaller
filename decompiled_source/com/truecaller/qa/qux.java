package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class qux extends ff3.g implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qux(int i, int i2, df3.bar barVar) {
        super(i, barVar);
        this.x = i2;
    }

    public final df3.bar create(df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.qa.qux(1, 0, barVar);
            case 1:
                return new com.truecaller.qa.qux(1, 1, barVar);
            case 2:
                return new com.truecaller.qa.qux(1, 2, barVar);
            case 3:
                return new com.truecaller.qa.qux(1, 3, barVar);
            default:
                return new com.truecaller.qa.qux(1, 4, barVar);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        df3.bar barVar = (df3.bar) obj;
        switch (this.x) {
            case 0:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 2:
                create(barVar).invokeSuspend(kotlin.Unit.a);
                throw null;
            case 3:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.x) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                ff0.g.H();
                return kotlin.Unit.a;
            case 1:
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("".substring(0, 1), "substring(...)");
                return kotlin.Unit.a;
            case 2:
                ef3.bar barVar3 = ef3.bar.a;
                od.p.E(obj);
                java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException(new java.lang.IllegalStateException());
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Test a non-serializable exception", "message");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(illegalArgumentException, "cause");
                throw new java.lang.RuntimeException("Test a non-serializable exception", illegalArgumentException);
            case 3:
                ef3.bar barVar4 = ef3.bar.a;
                od.p.E(obj);
                bi3.y0 y0Var = qx2.ub.f;
                bi3.y0 y0Var2 = qx2.ub.f;
                boolean[] zArr = new boolean[((bi3.j0[]) y0Var.v().toArray(new bi3.j0[0])).length];
                return kotlin.Unit.a;
            default:
                ef3.bar barVar5 = ef3.bar.a;
                od.p.E(obj);
                com.truecaller.data.country.CountryListDto countryListDto = ((com.truecaller.data.country.g) t41.f.a.getValue()).c().a;
                if (countryListDto != null) {
                    com.truecaller.data.country.CountryListDto.baz bazVar = countryListDto.countryList;
                }
                return kotlin.Unit.a;
        }
    }
}
