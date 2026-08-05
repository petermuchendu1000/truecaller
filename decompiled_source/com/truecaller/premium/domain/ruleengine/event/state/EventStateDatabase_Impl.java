package com.truecaller.premium.domain.ruleengine.event.state;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/premium/domain/ruleengine/event/state/EventStateDatabase_Impl;", "Lcom/truecaller/premium/domain/ruleengine/event/state/EventStateDatabase;", "<init>", "()V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EventStateDatabase_Impl extends com.truecaller.premium.domain.ruleengine.event.state.EventStateDatabase {
    public static final /* synthetic */ int b = 0;
    public final kotlin.Lazy a = kotlin.LazyKt.lazy(new jq0.baz(this, 9));

    @Override // com.truecaller.premium.domain.ruleengine.event.state.EventStateDatabase
    public final ka2.baz b() {
        return (ka2.baz) this.a.getValue();
    }

    public final void clearAllTables() {
        performClear(false, new java.lang.String[]{"rule_state"});
    }

    public final java.util.List createAutoMigrations(java.util.Map map) {
        return nc0.k1.k("autoMigrationSpecs", map);
    }

    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.lang.String[]{"rule_state"});
    }

    public final androidx.room.q0 createOpenDelegate() {
        return new a11.d(this);
    }

    public final java.util.Set getRequiredAutoMigrationSpecClasses() {
        return new java.util.LinkedHashSet();
    }

    public final java.util.Map getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ka2.baz.class), kotlin.collections.h0.a);
        return linkedHashMap;
    }
}
