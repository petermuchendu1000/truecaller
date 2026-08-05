package com.truecaller.call_decline_messages.db;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/call_decline_messages/db/CallDeclineMessageDatabase_Impl;", "Lcom/truecaller/call_decline_messages/db/CallDeclineMessageDatabase;", "<init>", "()V", "call-decline-messages_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallDeclineMessageDatabase_Impl extends com.truecaller.call_decline_messages.db.CallDeclineMessageDatabase {
    public static final /* synthetic */ int b = 0;
    public final kotlin.Lazy a = kotlin.LazyKt.lazy(new x22.qux(this, 22));

    @Override // com.truecaller.call_decline_messages.db.CallDeclineMessageDatabase
    public final xt0.bar b() {
        return (xt0.bar) this.a.getValue();
    }

    public final void clearAllTables() {
        performClear(false, new java.lang.String[]{com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TABLE_NAME});
    }

    public final java.util.List createAutoMigrations(java.util.Map map) {
        return nc0.k1.k("autoMigrationSpecs", map);
    }

    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.lang.String[]{com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TABLE_NAME});
    }

    public final androidx.room.q0 createOpenDelegate() {
        return new w33.baz(this);
    }

    public final java.util.Set getRequiredAutoMigrationSpecClasses() {
        return new java.util.LinkedHashSet();
    }

    public final java.util.Map getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(xt0.bar.class), kotlin.collections.h0.a);
        return linkedHashMap;
    }
}
