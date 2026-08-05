package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class z extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ a70.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(a70.d dVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = dVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.search.global.z(this.z, barVar, 0);
            default:
                return new com.truecaller.search.global.z(this.z, barVar, 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.database.sqlite.SQLiteException sQLiteException;
        android.database.Cursor cursor;
        uu0.qux quxVar;
        switch (this.x) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    su0.b0 b0Var = (su0.b0) ((qc3.bar) this.z.h).get();
                    b0Var.getClass();
                    com.truecaller.log.AssertionUtil.isTrue(true, new java.lang.String[0]);
                    try {
                        cursor = b0Var.a.getContentResolver().query(h81.c.g(), null, "type=?", new java.lang.String[]{java.lang.String.valueOf(5)}, "timestamp DESC");
                    } catch (android.database.sqlite.SQLiteException e) {
                        sQLiteException = e;
                        cursor = null;
                    }
                    if (cursor != null) {
                        try {
                            o81.qux a = b0Var.b.a();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "<this>");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "extraInfoReader");
                            quxVar = new uu0.qux(cursor, new p81.qux(cursor, a), new jr.l(cursor), false);
                        } catch (android.database.sqlite.SQLiteException e2) {
                            sQLiteException = e2;
                            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(sQLiteException);
                            m03.r.d(cursor);
                            quxVar = null;
                            if (quxVar == null) {
                            }
                        }
                        if (quxVar == null) {
                            return null;
                        }
                        this.y = 1;
                        obj = ak.e1.l(quxVar, this);
                        if (obj == barVar) {
                            return barVar;
                        }
                    }
                    quxVar = null;
                    if (quxVar == null) {
                    }
                }
                return (uu0.baz) obj;
            default:
                ef3.bar barVar2 = ef3.bar.a;
                int i2 = this.y;
                a70.d dVar = this.z;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) dVar.f;
                    com.truecaller.search.global.z zVar = new com.truecaller.search.global.z(dVar, null, 0);
                    this.y = 1;
                    obj = fg3.h0.W(coroutineContext, zVar, this);
                    if (obj == barVar2) {
                        return barVar2;
                    }
                }
                uu0.baz bazVar = (uu0.baz) obj;
                com.truecaller.search.global.y yVar = (com.truecaller.search.global.y) dVar.a;
                if (yVar != null) {
                    com.truecaller.search.global.w wVar = (com.truecaller.search.global.w) yVar;
                    android.database.ContentObserver contentObserver = wVar.H;
                    ey2.q qVar = wVar.l;
                    if (qVar != null) {
                        android.database.Cursor cursor2 = qVar.o;
                        if (cursor2 != null) {
                            cursor2.unregisterContentObserver(contentObserver);
                            cursor2.close();
                        }
                        ey2.q qVar2 = wVar.l;
                        if (bazVar != null) {
                            qVar2.getClass();
                            qVar2.p = bazVar.getColumnIndex("_id");
                        }
                        qVar2.o = bazVar;
                        qVar2.notifyDataSetChanged();
                        if (wVar.j.getAdapter() == null) {
                            wVar.j.setAdapter(wVar.p);
                        } else {
                            wVar.l.notifyDataSetChanged();
                        }
                        if (bazVar != null) {
                            bazVar.registerContentObserver(contentObserver);
                        }
                        wVar.Z4();
                        wVar.V4(wVar.m);
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
