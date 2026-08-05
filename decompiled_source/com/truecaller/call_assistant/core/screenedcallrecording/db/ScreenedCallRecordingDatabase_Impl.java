package com.truecaller.call_assistant.core.screenedcallrecording.db;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/call_assistant/core/screenedcallrecording/db/ScreenedCallRecordingDatabase_Impl;", "Lcom/truecaller/call_assistant/core/screenedcallrecording/db/ScreenedCallRecordingDatabase;", "<init>", "()V", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ScreenedCallRecordingDatabase_Impl extends com.truecaller.call_assistant.core.screenedcallrecording.db.ScreenedCallRecordingDatabase {
    public final kotlin.Lazy a = kotlin.LazyKt.lazy(new i82.m(this, 11));

    @Override // com.truecaller.call_assistant.core.screenedcallrecording.db.ScreenedCallRecordingDatabase
    public final ir0.bar b() {
        return (ir0.bar) this.a.getValue();
    }

    public final void clearAllTables() {
        performClear(false, new java.lang.String[]{"screened_call_recording"});
    }

    public final java.util.List createAutoMigrations(java.util.Map map) {
        return nc0.k1.k("autoMigrationSpecs", map);
    }

    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.lang.String[]{"screened_call_recording"});
    }

    public final androidx.room.q0 createOpenDelegate() {
        return new a11.d(this);
    }

    public final java.util.Set getRequiredAutoMigrationSpecClasses() {
        return new java.util.LinkedHashSet();
    }

    public final java.util.Map getRequiredTypeConverterClasses() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ir0.bar.class), kotlin.collections.h0.a);
        return linkedHashMap;
    }
}
