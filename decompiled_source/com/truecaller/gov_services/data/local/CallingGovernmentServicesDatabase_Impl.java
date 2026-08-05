package com.truecaller.gov_services.data.local;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/gov_services/data/local/CallingGovernmentServicesDatabase_Impl;", "Lcom/truecaller/gov_services/data/local/CallingGovernmentServicesDatabase;", "<init>", "()V", "gov-services_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CallingGovernmentServicesDatabase_Impl extends com.truecaller.gov_services.data.local.CallingGovernmentServicesDatabase {
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;

    public CallingGovernmentServicesDatabase_Impl() {
        final int i = 0;
        this.c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: aq1.bar
            public final /* synthetic */ com.truecaller.gov_services.data.local.CallingGovernmentServicesDatabase_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i) {
                    case 0:
                        return new bq1.baz(this.b);
                    case 1:
                        return new bq1.c(this.b);
                    case 2:
                        return new bq1.a(this.b);
                    default:
                        return new bq1.b(this.b);
                }
            }
        });
        final int i2 = 1;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: aq1.bar
            public final /* synthetic */ com.truecaller.gov_services.data.local.CallingGovernmentServicesDatabase_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i2) {
                    case 0:
                        return new bq1.baz(this.b);
                    case 1:
                        return new bq1.c(this.b);
                    case 2:
                        return new bq1.a(this.b);
                    default:
                        return new bq1.b(this.b);
                }
            }
        });
        final int i3 = 2;
        this.e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: aq1.bar
            public final /* synthetic */ com.truecaller.gov_services.data.local.CallingGovernmentServicesDatabase_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i3) {
                    case 0:
                        return new bq1.baz(this.b);
                    case 1:
                        return new bq1.c(this.b);
                    case 2:
                        return new bq1.a(this.b);
                    default:
                        return new bq1.b(this.b);
                }
            }
        });
        final int i4 = 3;
        this.f = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: aq1.bar
            public final /* synthetic */ com.truecaller.gov_services.data.local.CallingGovernmentServicesDatabase_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i4) {
                    case 0:
                        return new bq1.baz(this.b);
                    case 1:
                        return new bq1.c(this.b);
                    case 2:
                        return new bq1.a(this.b);
                    default:
                        return new bq1.b(this.b);
                }
            }
        });
    }

    @Override // com.truecaller.gov_services.data.local.CallingGovernmentServicesDatabase
    public final bq1.baz b() {
        return (bq1.baz) this.c.getValue();
    }

    @Override // com.truecaller.gov_services.data.local.CallingGovernmentServicesDatabase
    public final bq1.a c() {
        return (bq1.a) this.e.getValue();
    }

    public final void clearAllTables() {
        performClear(false, new java.lang.String[]{"category", "region", "district", "contact"});
    }

    public final java.util.List createAutoMigrations(java.util.Map map) {
        return nc0.k1.k("autoMigrationSpecs", map);
    }

    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.lang.String[]{"category", "region", "district", "contact"});
    }

    public final androidx.room.q0 createOpenDelegate() {
        return new a11.d(this);
    }

    @Override // com.truecaller.gov_services.data.local.CallingGovernmentServicesDatabase
    public final bq1.b d() {
        return (bq1.b) this.f.getValue();
    }

    @Override // com.truecaller.gov_services.data.local.CallingGovernmentServicesDatabase
    public final bq1.c e() {
        return (bq1.c) this.d.getValue();
    }

    public final java.util.Set getRequiredAutoMigrationSpecClasses() {
        return new java.util.LinkedHashSet();
    }

    public final java.util.Map getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        kotlin.reflect.KClass orCreateKotlinClass = l0Var.getOrCreateKotlinClass(bq1.baz.class);
        kotlin.collections.h0 h0Var = kotlin.collections.h0.a;
        linkedHashMap.put(orCreateKotlinClass, h0Var);
        linkedHashMap.put(nc0.k1.n(l0Var, bq1.c.class, linkedHashMap, h0Var, bq1.a.class), h0Var);
        linkedHashMap.put(l0Var.getOrCreateKotlinClass(bq1.b.class), h0Var);
        return linkedHashMap;
    }
}
