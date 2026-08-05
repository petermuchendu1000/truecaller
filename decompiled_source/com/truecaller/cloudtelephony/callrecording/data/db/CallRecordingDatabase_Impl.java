package com.truecaller.cloudtelephony.callrecording.data.db;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/data/db/CallRecordingDatabase_Impl;", "Lcom/truecaller/cloudtelephony/callrecording/data/db/CallRecordingDatabase;", "<init>", "()V", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallRecordingDatabase_Impl extends com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingDatabase {
    public final kotlin.Lazy a;
    public final kotlin.Lazy b;

    public CallRecordingDatabase_Impl() {
        final int i = 0;
        this.a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: sz0.qux
            public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingDatabase_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i) {
                    case 0:
                        return new sz0.baz(this.b);
                    default:
                        return new sz0.e(this.b);
                }
            }
        });
        final int i2 = 1;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: sz0.qux
            public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingDatabase_Impl b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i2) {
                    case 0:
                        return new sz0.baz(this.b);
                    default:
                        return new sz0.e(this.b);
                }
            }
        });
    }

    @Override // com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingDatabase
    public final sz0.baz b() {
        return (sz0.baz) this.a.getValue();
    }

    @Override // com.truecaller.cloudtelephony.callrecording.data.db.CallRecordingDatabase
    public final sz0.e c() {
        return (sz0.e) this.b.getValue();
    }

    public final void clearAllTables() {
        performClear(false, new java.lang.String[]{"call_recording", "recorded_call_info", "call_recording_feedback"});
    }

    public final java.util.List createAutoMigrations(java.util.Map map) {
        java.util.ArrayList k = nc0.k1.k("autoMigrationSpecs", map);
        k.add(new nk1.baz(1, 2, 6));
        k.add(new nk1.baz(2, 3, 7));
        k.add(new nk1.baz(3, 4, 8));
        k.add(new nk1.baz(4, 5, 9));
        k.add(new nk1.baz(5, 6, 10));
        k.add(new nk1.baz(6, 7, 11));
        k.add(new nk1.baz(7, 8, 12));
        k.add(new nk1.baz(8, 9, 13));
        k.add(new nk1.baz(10, 11, 5));
        return k;
    }

    public final androidx.room.m createInvalidationTracker() {
        return new androidx.room.m(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new java.lang.String[]{"call_recording", "recorded_call_info", "call_recording_feedback"});
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
        kotlin.reflect.KClass orCreateKotlinClass = l0Var.getOrCreateKotlinClass(sz0.baz.class);
        kotlin.collections.h0 h0Var = kotlin.collections.h0.a;
        linkedHashMap.put(orCreateKotlinClass, h0Var);
        linkedHashMap.put(l0Var.getOrCreateKotlinClass(sz0.e.class), h0Var);
        return linkedHashMap;
    }
}
