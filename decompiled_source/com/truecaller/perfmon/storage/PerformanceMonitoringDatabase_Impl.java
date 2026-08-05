package com.truecaller.perfmon.storage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/perfmon/storage/PerformanceMonitoringDatabase_Impl;", "Lcom/truecaller/perfmon/storage/PerformanceMonitoringDatabase;", "<init>", "()V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PerformanceMonitoringDatabase_Impl extends com.truecaller.perfmon.storage.PerformanceMonitoringDatabase {
    public static final /* synthetic */ int b = 0;
    public final kotlin.Lazy a = kotlin.LazyKt.lazy(new lf2.k(this, 22));

    @Override // com.truecaller.perfmon.storage.PerformanceMonitoringDatabase
    public final m72.a b() {
        return (m72.a) this.a.getValue();
    }

    public final void clearAllTables() {
        performClear(false, new java.lang.String[]{"performance_logs"});
    }

    public final java.util.List createAutoMigrations(java.util.Map map) {
        return nc0.k1.k("autoMigrationSpecs", map);
    }

    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.lang.String[]{"performance_logs"});
    }

    public final androidx.room.q0 createOpenDelegate() {
        return new a11.d(this);
    }

    public final java.util.Set getRequiredAutoMigrationSpecClasses() {
        return new java.util.LinkedHashSet();
    }

    public final java.util.Map getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(m72.a.class), kotlin.collections.h0.a);
        return linkedHashMap;
    }
}
