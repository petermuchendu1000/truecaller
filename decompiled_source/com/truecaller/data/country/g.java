package com.truecaller.data.country;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class g {
    public final kotlin.coroutines.CoroutineContext a;
    public final android.content.Context b;
    public final pk0.baz c;
    public final com.truecaller.data.country.a d;
    public final com.truecaller.data.country.c e;
    public final kotlin.Lazy f;

    public g(kotlin.coroutines.CoroutineContext coroutineContext, android.content.Context context, pk0.baz bazVar, com.truecaller.data.country.a aVar, com.truecaller.data.country.c cVar, com.truecaller.data.country.c cVar2, com.truecaller.data.country.c cVar3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "buildHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "countryFileUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "countryListRestAdapter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar2, "deviceInfoUtilHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar3, "countryMainThreadExecutionLogger");
        this.a = coroutineContext;
        this.b = context;
        this.c = bazVar;
        this.d = aVar;
        this.e = cVar;
        this.f = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.truecaller.data.country.e
            public final java.lang.Object invoke() {
                com.truecaller.data.country.CountryListDto o;
                com.truecaller.data.country.CountryListDto o2;
                if (android.os.Looper.getMainLooper().isCurrentThread()) {
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new com.truecaller.data.country.CountriesFileOnMainThreadException());
                }
                java.lang.Object obj = com.truecaller.data.country.qux.e;
                com.truecaller.data.country.g gVar = com.truecaller.data.country.g.this;
                com.truecaller.data.country.a aVar2 = gVar.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar2, "countryFileUtil");
                android.content.Context context2 = aVar2.a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("countries_v2.bin", "fileName");
                try {
                    kotlin.o oVar = kotlin.q.b;
                    o = com.truecaller.data.country.a.b(new java.io.FileInputStream(new java.io.File(context2.getFilesDir(), "countries_v2.bin")));
                } catch (java.lang.Throwable th) {
                    kotlin.o oVar2 = kotlin.q.b;
                    o = od.p.o(th);
                }
                df3.bar barVar = null;
                if (o instanceof kotlin.p) {
                    o = null;
                }
                com.truecaller.data.country.CountryListDto countryListDto = o;
                if (countryListDto == null) {
                    try {
                        java.io.InputStream open = context2.getAssets().open("countries_v2.bin");
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "open(...)");
                        o2 = com.truecaller.data.country.a.b(open);
                    } catch (java.lang.Throwable th2) {
                        kotlin.o oVar3 = kotlin.q.b;
                        o2 = od.p.o(th2);
                    }
                    if (o2 instanceof kotlin.p) {
                        o2 = null;
                    }
                    countryListDto = o2;
                }
                com.truecaller.data.country.qux quxVar = new com.truecaller.data.country.qux(countryListDto);
                if (gVar.d(quxVar) | gVar.e(quxVar)) {
                    fg3.h0.J(fg3.f1.a, gVar.a, (fg3.f0) null, new com.truecaller.data.country.f(quxVar, gVar, barVar, 0), 2);
                }
                return quxVar;
            }
        });
    }

    public final com.truecaller.data.country.CountryListDto.bar a(java.lang.String str) {
        if (str != null) {
            com.truecaller.data.country.qux c = c();
            c.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
            java.util.Map map = c.c;
            java.util.Locale locale = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "ENGLISH");
            java.lang.String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return (com.truecaller.data.country.CountryListDto.bar) map.get(kotlin.text.StringsKt.u0(lowerCase).toString());
        }
        return null;
    }

    public final com.truecaller.data.country.CountryListDto.bar b(java.lang.String str) {
        java.lang.String str2;
        if (str != null) {
            if (kotlin.text.y.w(str, "+", false)) {
                str2 = str.substring(1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
            } else if (kotlin.text.y.w(str, "00", false)) {
                str2 = str.substring(2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
            } else {
                str2 = "";
            }
            int length = str2.length();
            if (6 <= length) {
                length = 6;
            }
            java.lang.String substring = str2.substring(0, length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            while (substring.length() > 0) {
                com.truecaller.data.country.qux c = c();
                c.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(substring, "code");
                com.truecaller.data.country.CountryListDto.bar barVar = (com.truecaller.data.country.CountryListDto.bar) c.d.get(substring);
                if (barVar != null) {
                    return barVar;
                }
                substring = substring.substring(0, substring.length() - 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            }
            return null;
        }
        return null;
    }

    public final com.truecaller.data.country.qux c() {
        return (com.truecaller.data.country.qux) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.truecaller.data.country.baz] */
    public final boolean d(com.truecaller.data.country.qux quxVar) {
        java.util.List list;
        java.util.List<com.truecaller.data.country.CountryListDto.bar> list2;
        java.util.List<com.truecaller.data.country.CountryListDto.bar> list3;
        int i;
        com.truecaller.data.country.CountryListDto.baz bazVar;
        com.truecaller.data.country.CountryListDto.baz bazVar2;
        java.util.List j = kotlin.collections.y.j(new java.lang.String[]{"HUAWEI_STORE", "OPPO_STORE", "MI_STORE", "VIVO_STORE"});
        java.lang.String upperCase = this.c.b().toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (j.contains(upperCase)) {
            list = kotlin.collections.y.j(new java.lang.String[]{"tw", "hk", "mo"});
        } else {
            list = kotlin.collections.h0.a;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "countryFilter");
        if (!list.isEmpty()) {
            com.truecaller.data.country.CountryListDto countryListDto = quxVar.a;
            if (countryListDto != null && (bazVar2 = countryListDto.countryList) != null) {
                list2 = bazVar2.b;
            } else {
                list2 = null;
            }
            if (countryListDto != null && (bazVar = countryListDto.suggestedCountryList) != null) {
                list3 = bazVar.b;
            } else {
                list3 = null;
            }
            java.util.List[] listArr = {list2, list3};
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listArr, "elements");
            java.util.List<java.util.List> C = kotlin.collections.v.C(listArr);
            if (C.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (java.util.List list4 : C) {
                    final com.truecaller.data.country.bar barVar = new com.truecaller.data.country.bar(list);
                    if (com.mbridge.msdk.config.component.common.express.operator.baz.z(list4, (com.truecaller.data.country.baz) new java.util.function.Predicate() { // from class: com.truecaller.data.country.baz
                        @Override // java.util.function.Predicate
                        public final boolean test(java.lang.Object obj) {
                            return ((java.lang.Boolean) com.truecaller.data.country.bar.this.invoke(obj)).booleanValue();
                        }
                    }) && (i = i + 1) < 0) {
                        kotlin.collections.y.o();
                        throw null;
                    }
                }
            }
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(com.truecaller.data.country.qux quxVar) {
        com.truecaller.data.country.CountryListDto.baz bazVar;
        android.content.Context context = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.String n = m03.r.n(context);
        if (n != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n, "iso");
            java.util.Map map = quxVar.b;
            java.util.Locale locale = java.util.Locale.ENGLISH;
            com.truecaller.data.country.CountryListDto.bar barVar = (com.truecaller.data.country.CountryListDto.bar) map.get(ax1.bar.r(locale, "ENGLISH", n, locale, "toLowerCase(...)"));
            if (barVar != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "country");
                com.truecaller.data.country.CountryListDto countryListDto = quxVar.a;
                if (countryListDto != null && (bazVar = countryListDto.countryList) != null && !kotlin.jvm.internal.Intrinsics.b(bazVar.a, barVar)) {
                    bazVar.a = barVar;
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
