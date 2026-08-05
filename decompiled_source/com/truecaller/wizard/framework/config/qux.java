package com.truecaller.wizard.framework.config;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class qux extends ff3.g implements kotlin.jvm.functions.Function2 {
    public com.truecaller.wizard.framework.config.a x;
    public int y;
    public final /* synthetic */ com.truecaller.wizard.framework.config.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qux(com.truecaller.wizard.framework.config.a aVar, df3.bar barVar) {
        super(2, barVar);
        this.z = aVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.wizard.framework.config.qux(this.z, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.truecaller.wizard.framework.config.a aVar;
        java.lang.String str;
        com.truecaller.wizard.framework.config.OnboardingConfig o;
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        com.truecaller.wizard.framework.config.a aVar2 = this.z;
        if (i != 0) {
            if (i == 1) {
                aVar = this.x;
                od.p.E(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            o83.baz bazVar = (o83.baz) aVar2.e.get();
            this.x = aVar2;
            this.y = 1;
            obj = bazVar.g(false, this);
            if (obj == barVar) {
                return barVar;
            }
            aVar = aVar2;
        }
        com.truecaller.data.country.CountryListDto.bar barVar2 = (com.truecaller.data.country.CountryListDto.bar) obj;
        com.truecaller.wizard.framework.config.OnboardingConfig onboardingConfig = null;
        if (barVar2 != null) {
            str = barVar2.c;
        } else {
            str = null;
        }
        aVar.h = str;
        java.lang.String d = aVar2.f.a.d("onboardingConfig_59062", "");
        if (d.length() <= 0) {
            d = null;
        }
        com.google.gson.Gson gson = aVar2.j;
        try {
            kotlin.o oVar = kotlin.q.b;
            kotlin.jvm.internal.Intrinsics.d(gson);
            if (d == null) {
                d = "{}";
            }
            java.lang.reflect.Type type = new com.truecaller.wizard.framework.config.baz().getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            java.lang.Object fromJson = gson.fromJson(d, type);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
            o = (com.truecaller.wizard.framework.config.OnboardingConfig) fromJson;
        } catch (java.lang.Throwable th) {
            kotlin.o oVar2 = kotlin.q.b;
            o = od.p.o(th);
        }
        java.lang.Throwable a = kotlin.q.a(o);
        if (a != null) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new com.truecaller.wizard.framework.config.OnboardingConfigParsingFailed(a));
        }
        if (o instanceof kotlin.p) {
            o = null;
        }
        com.truecaller.wizard.framework.config.OnboardingConfig onboardingConfig2 = o;
        if (onboardingConfig2 == null) {
            java.util.Iterator it = com.truecaller.wizard.framework.config.a.a(aVar2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.truecaller.wizard.framework.config.OnboardingConfig onboardingConfig3 = (com.truecaller.wizard.framework.config.OnboardingConfig) aVar2.i.get((java.lang.String) it.next());
                if (onboardingConfig3 != null) {
                    onboardingConfig = onboardingConfig3;
                    break;
                }
            }
            if (onboardingConfig != null) {
                return onboardingConfig;
            }
            throw new java.util.NoSuchElementException("No element of the collection was transformed to a non-null value.");
        }
        return onboardingConfig2;
    }
}
