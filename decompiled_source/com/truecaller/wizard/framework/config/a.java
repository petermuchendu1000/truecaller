package com.truecaller.wizard.framework.config;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class a implements com.truecaller.wizard.framework.config.b {
    public final qc3.bar a;
    public final qc3.bar b;
    public final qc3.bar c;
    public final qc3.bar d;
    public final qc3.bar e;
    public final wj2.b f;
    public final kotlin.coroutines.CoroutineContext g;
    public java.lang.String h;
    public final java.util.LinkedHashMap i;
    public final com.google.gson.Gson j;

    public a(qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3, qc3.bar barVar4, qc3.bar barVar5, wj2.b bVar, kotlin.coroutines.CoroutineContext coroutineContext) {
        com.google.gson.n nVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "truecallerAccountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "accountSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "wizardSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "regionUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar5, "countriesHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "identityConfigsInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.a = barVar;
        this.b = barVar2;
        this.c = barVar3;
        this.d = barVar4;
        this.e = barVar5;
        this.f = bVar;
        this.g = coroutineContext;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = "tr".toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        kotlin.Pair pair = new kotlin.Pair(upperCase, com.truecaller.wizard.framework.config.OnboardingConfig.copy$default(b(), new com.truecaller.wizard.framework.config.AdsChoicesPageConfig(true), null, 2, null));
        java.lang.String upperCase2 = "et".toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        kotlin.Pair pair2 = new kotlin.Pair(upperCase2, com.truecaller.wizard.framework.config.OnboardingConfig.copy$default(b(), null, com.truecaller.wizard.framework.config.e.a, 1, null));
        java.lang.String upperCase3 = "us".toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
        java.util.Map i = kotlin.collections.r0.i(new kotlin.Pair[]{pair, pair2, new kotlin.Pair(upperCase3, com.truecaller.wizard.framework.config.OnboardingConfig.copy$default(b(), null, new com.truecaller.wizard.framework.config.WelcomePageConfig.Cta(null, null, null, null, null, null, 63, null), 1, null)), new kotlin.Pair(com.truecaller.common.account.Region.REGION_1.getValue(), com.truecaller.wizard.framework.config.OnboardingConfig.copy$default(b(), new com.truecaller.wizard.framework.config.AdsChoicesPageConfig(true), null, 2, null)), new kotlin.Pair(com.truecaller.common.account.Region.REGION_ZA.getValue(), com.truecaller.wizard.framework.config.OnboardingConfig.copy$default(b(), new com.truecaller.wizard.framework.config.AdsChoicesPageConfig(true), null, 2, null)), new kotlin.Pair(com.truecaller.common.account.Region.REGION_BR.getValue(), com.truecaller.wizard.framework.config.OnboardingConfig.copy$default(b(), new com.truecaller.wizard.framework.config.AdsChoicesPageConfig(true), null, 2, null)), new kotlin.Pair("Default", b())});
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.q0.b(i.size()));
        for (java.util.Map.Entry entry : i.entrySet()) {
            linkedHashMap.put(yp.d0.J((java.lang.String) entry.getKey()), entry.getValue());
        }
        this.i = linkedHashMap;
        com.google.gson.GsonBuilder registerTypeAdapter = new com.google.gson.GsonBuilder().registerTypeAdapter(com.truecaller.wizard.framework.config.OnboardingConfig.class, new com.google.gson.n() { // from class: com.truecaller.wizard.framework.config.bar
            public final java.lang.Object b(com.google.gson.o oVar, java.lang.reflect.Type type, com.google.gson.m mVar) {
                java.lang.Object obj;
                java.lang.Object obj2;
                java.lang.Object obj3;
                cw.n v;
                com.google.gson.o oVar2;
                cw.n v2;
                com.google.gson.o oVar3;
                com.truecaller.wizard.framework.config.a aVar = com.truecaller.wizard.framework.config.a.this;
                java.util.ArrayList a = com.truecaller.wizard.framework.config.a.a(aVar);
                java.util.LinkedHashMap linkedHashMap2 = aVar.i;
                java.util.Iterator it = a.iterator();
                while (true) {
                    obj = null;
                    if (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        if (oVar == null || (v2 = yp.d0.v(str, oVar)) == null || (oVar3 = (com.google.gson.o) v2.get("Page_AdsChoices")) == null || (obj2 = ((mp2.qux) mVar).o(oVar3, com.truecaller.wizard.framework.config.AdsChoicesPageConfig.class)) == null) {
                            com.truecaller.wizard.framework.config.OnboardingConfig onboardingConfig = (com.truecaller.wizard.framework.config.OnboardingConfig) linkedHashMap2.get(yp.d0.J(str));
                            if (onboardingConfig != null) {
                                obj2 = onboardingConfig.getAdsChoicesPage();
                            } else {
                                obj2 = null;
                            }
                        }
                        if (obj2 != null) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (obj2 != null) {
                    com.truecaller.wizard.framework.config.AdsChoicesPageConfig adsChoicesPageConfig = (com.truecaller.wizard.framework.config.AdsChoicesPageConfig) obj2;
                    java.util.Iterator it3 = com.truecaller.wizard.framework.config.a.a(aVar).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        java.lang.String str2 = (java.lang.String) it3.next();
                        if (oVar == null || (v = yp.d0.v(str2, oVar)) == null || (oVar2 = (com.google.gson.o) v.get("Page_Welcome")) == null || (obj3 = ((mp2.qux) mVar).o(oVar2, com.truecaller.wizard.framework.config.WelcomePageConfig.class)) == null) {
                            com.truecaller.wizard.framework.config.OnboardingConfig onboardingConfig2 = (com.truecaller.wizard.framework.config.OnboardingConfig) linkedHashMap2.get(yp.d0.J(str2));
                            if (onboardingConfig2 != null) {
                                obj3 = onboardingConfig2.getWelcomePage();
                            } else {
                                obj3 = null;
                            }
                        }
                        if (obj3 != null) {
                            obj = obj3;
                            break;
                        }
                    }
                    if (obj != null) {
                        return new com.truecaller.wizard.framework.config.OnboardingConfig(adsChoicesPageConfig, (com.truecaller.wizard.framework.config.WelcomePageConfig) obj);
                    }
                    throw new java.lang.IllegalStateException("No configuration found for Page_Welcome");
                }
                throw new java.lang.IllegalStateException("No configuration found for Page_AdsChoices");
            }
        });
        com.truecaller.wizard.framework.config.WelcomePageConfig.Companion.getClass();
        nVar = com.truecaller.wizard.framework.config.WelcomePageConfig.deserializer;
        this.j = registerTypeAdapter.registerTypeAdapter(com.truecaller.wizard.framework.config.WelcomePageConfig.class, nVar).create();
    }

    public static final java.util.ArrayList a(com.truecaller.wizard.framework.config.a aVar) {
        java.lang.String h = ((h93.baz) aVar.c.get()).h("country_iso");
        if (h == null) {
            zx.bar h2 = ((n11.l) aVar.a.get()).h();
            if (h2 != null) {
                h = h2.a;
            } else {
                h = null;
            }
            if (h == null) {
                h = ((q11.bar) aVar.b.get()).h("profileCountryIso");
            }
        }
        if (h == null) {
            h = aVar.h;
        }
        java.lang.String[] strArr = {h, ((n11.g) aVar.d.get()).b().getValue(), "Default"};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "elements");
        java.util.List C = kotlin.collections.v.C(strArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(C, 10));
        java.util.Iterator it = C.iterator();
        while (it.hasNext()) {
            arrayList.add(yp.d0.J((java.lang.String) it.next()));
        }
        return arrayList;
    }

    public static com.truecaller.wizard.framework.config.OnboardingConfig b() {
        return new com.truecaller.wizard.framework.config.OnboardingConfig(new com.truecaller.wizard.framework.config.AdsChoicesPageConfig(false), com.truecaller.wizard.framework.config.d.a);
    }
}
