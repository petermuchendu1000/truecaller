package com.truecaller.ads.installedapps;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/installedapps/InstalledAppsDatabase_Impl;", "Lcom/truecaller/ads/installedapps/InstalledAppsDatabase;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class InstalledAppsDatabase_Impl extends com.truecaller.ads.installedapps.InstalledAppsDatabase {
    public final kotlin.Lazy a = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(this, 8));

    @Override // com.truecaller.ads.installedapps.InstalledAppsDatabase
    public final com.truecaller.ads.installedapps.qux b() {
        return (com.truecaller.ads.installedapps.qux) this.a.getValue();
    }

    public final void clearAllTables() {
        performClear(false, new java.lang.String[]{"installed_packages"});
    }

    public final java.util.List createAutoMigrations(java.util.Map map) {
        java.util.ArrayList k = nc0.k1.k("autoMigrationSpecs", map);
        k.add(new a11.i(1, 2, 10));
        return k;
    }

    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.lang.String[]{"installed_packages"});
    }

    public final androidx.room.q0 createOpenDelegate() {
        return new a11.d(this);
    }

    public final java.util.Set getRequiredAutoMigrationSpecClasses() {
        return new java.util.LinkedHashSet();
    }

    public final java.util.Map getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(com.truecaller.ads.installedapps.qux.class), kotlin.collections.h0.a);
        return linkedHashMap;
    }
}
