package com.truecaller.spamcategories.db;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/spamcategories/db/SpamCategoriesDatabase_Impl;", "Lcom/truecaller/spamcategories/db/SpamCategoriesDatabase;", "<init>", "()V", "spamcategories_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SpamCategoriesDatabase_Impl extends com.truecaller.spamcategories.db.SpamCategoriesDatabase {
    public static final /* synthetic */ int d = 0;
    public final kotlin.Lazy c = kotlin.LazyKt.lazy(new o93.k(this, 9));

    @Override // com.truecaller.spamcategories.db.SpamCategoriesDatabase
    public final ot2.baz b() {
        return (ot2.baz) this.c.getValue();
    }

    public final void clearAllTables() {
        performClear(false, new java.lang.String[]{"spam_categories"});
    }

    public final java.util.List createAutoMigrations(java.util.Map map) {
        return nc0.k1.k("autoMigrationSpecs", map);
    }

    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.lang.String[]{"spam_categories"});
    }

    public final androidx.room.q0 createOpenDelegate() {
        return new a11.d(this);
    }

    public final java.util.Set getRequiredAutoMigrationSpecClasses() {
        return new java.util.LinkedHashSet();
    }

    public final java.util.Map getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ot2.baz.class), kotlin.collections.h0.a);
        return linkedHashMap;
    }
}
