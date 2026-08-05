package com.truecaller.analytics.storage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/analytics/storage/AnalyticsDatabase_Impl;", "Lcom/truecaller/analytics/storage/AnalyticsDatabase;", "<init>", "()V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AnalyticsDatabase_Impl extends com.truecaller.analytics.storage.AnalyticsDatabase {
    public static final /* synthetic */ int b = 0;
    public final kotlin.Lazy a = kotlin.LazyKt.lazy(new a02.baz(this, 26));

    @Override // com.truecaller.analytics.storage.AnalyticsDatabase
    public final bd0.a b() {
        return (bd0.a) this.a.getValue();
    }

    public final void clearAllTables() {
        performClear(false, new java.lang.String[]{"persisted_event"});
    }

    public final java.util.List createAutoMigrations(java.util.Map map) {
        return nc0.k1.k("autoMigrationSpecs", map);
    }

    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.lang.String[]{"persisted_event"});
    }

    public final androidx.room.q0 createOpenDelegate() {
        return new a11.d(this);
    }

    public final java.util.Set getRequiredAutoMigrationSpecClasses() {
        return new java.util.LinkedHashSet();
    }

    public final java.util.Map getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(bd0.a.class), kotlin.collections.h0.a);
        return linkedHashMap;
    }
}
