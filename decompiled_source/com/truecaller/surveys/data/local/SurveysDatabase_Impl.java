package com.truecaller.surveys.data.local;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/surveys/data/local/SurveysDatabase_Impl;", "Lcom/truecaller/surveys/data/local/SurveysDatabase;", "<init>", "()V", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SurveysDatabase_Impl extends com.truecaller.surveys.data.local.SurveysDatabase {
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;

    public SurveysDatabase_Impl() {
        final int i = 0;
        this.a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: fu2.d
            public final /* synthetic */ com.truecaller.surveys.data.local.SurveysDatabase_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i) {
                    case 0:
                        return new fu2.c(this.b);
                    default:
                        return new fu2.qux(this.b);
                }
            }
        });
        final int i2 = 1;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: fu2.d
            public final /* synthetic */ com.truecaller.surveys.data.local.SurveysDatabase_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i2) {
                    case 0:
                        return new fu2.c(this.b);
                    default:
                        return new fu2.qux(this.b);
                }
            }
        });
    }

    @Override // com.truecaller.surveys.data.local.SurveysDatabase
    public final fu2.qux b() {
        return (fu2.qux) this.b.getValue();
    }

    @Override // com.truecaller.surveys.data.local.SurveysDatabase
    public final fu2.c c() {
        return (fu2.c) this.a.getValue();
    }

    public final void clearAllTables() {
        performClear(false, new java.lang.String[]{"surveys", "surveys_config"});
    }

    public final java.util.List createAutoMigrations(java.util.Map map) {
        return nc0.k1.k("autoMigrationSpecs", map);
    }

    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.lang.String[]{"surveys", "surveys_config"});
    }

    public final androidx.room.q0 createOpenDelegate() {
        return new a11.d(this);
    }

    public final java.util.Set getRequiredAutoMigrationSpecClasses() {
        return new java.util.LinkedHashSet();
    }

    public final java.util.Map getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        kotlin.reflect.KClass orCreateKotlinClass = l0Var.getOrCreateKotlinClass(fu2.c.class);
        kotlin.collections.h0 h0Var = kotlin.collections.h0.a;
        linkedHashMap.put(orCreateKotlinClass, h0Var);
        linkedHashMap.put(l0Var.getOrCreateKotlinClass(fu2.qux.class), h0Var);
        return linkedHashMap;
    }
}
