package com.truecaller.data.country;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class h extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.truecaller.data.country.n x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.truecaller.data.country.n nVar, df3.bar barVar) {
        super(2, barVar);
        this.x = nVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.data.country.h(this.x, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.truecaller.data.country.CountryListDto.baz bazVar;
        java.util.List<com.truecaller.data.country.CountryListDto.bar> list;
        ef3.bar barVar = ef3.bar.a;
        od.p.E(obj);
        com.truecaller.data.country.CountryListDto countryListDto = this.x.b.c().a;
        if (countryListDto != null && (bazVar = countryListDto.countryList) != null && (list = bazVar.b) != null) {
            return list;
        }
        return kotlin.collections.h0.a;
    }
}
