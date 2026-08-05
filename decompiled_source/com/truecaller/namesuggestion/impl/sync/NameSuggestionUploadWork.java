package com.truecaller.namesuggestion.impl.sync;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB5\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/truecaller/namesuggestion/impl/sync/NameSuggestionUploadWork;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Ln11/l;", "accountManager", "Ld52/bar;", "nameSuggestionManager", "Lqo1/r;", "searchFeaturesInventory", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ln11/l;Ld52/bar;Lqo1/r;)V", "i52/bar", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NameSuggestionUploadWork extends androidx.work.CoroutineWorker {
    public final n11.l a;
    public final d52.bar b;
    public final qo1.r c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NameSuggestionUploadWork(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull n11.l lVar, @org.jetbrains.annotations.NotNull d52.bar barVar, @org.jetbrains.annotations.NotNull qo1.r rVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "nameSuggestionManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "searchFeaturesInventory");
        this.a = lVar;
        this.b = barVar;
        this.c = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:
    
        if (r0 == r3) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0216, code lost:
    
        if (r0 != r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0208, code lost:
    
        if (0 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x020a, code lost:
    
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0211, code lost:
    
        if (0 == 0) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, com.truecaller.namesuggestion.api.network.NameSuggestionRestModel$bar] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, com.truecaller.namesuggestion.api.network.NameSuggestionRestModel$bar] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        i52.baz bazVar;
        int i;
        java.lang.Boolean bool;
        java.lang.Object obj;
        boolean booleanValue;
        if (barVar instanceof i52.baz) {
            bazVar = (i52.baz) barVar;
            int i2 = bazVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bazVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj2 = bazVar.x;
                java.lang.Boolean bool2 = ef3.bar.a;
                i = bazVar.z;
                boolean z = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj2);
                            booleanValue = ((java.lang.Boolean) obj2).booleanValue();
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj2);
                        obj = obj2;
                        booleanValue = ((java.lang.Boolean) obj).booleanValue();
                    }
                } else {
                    od.p.E(obj2);
                    if (!this.a.j()) {
                        nd.s a = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                        return a;
                    }
                    boolean a2 = ((qo1.s) this.c).b.a("featureDeprecateClientNameSuggestionStorage", com.truecaller.featuretoggles.FeatureState.DISABLED);
                    d52.bar barVar2 = this.b;
                    if (a2) {
                        nd.g inputData = getInputData();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputData, "<this>");
                        ?? obj3 = new java.lang.Object();
                        obj3.f(inputData.e("PHONE_NUMBER"));
                        obj3.e(inputData.e("NAME"));
                        obj3.h(inputData.b("TYPE", -1));
                        obj3.g(inputData.b("SOURCE", -1));
                        if (obj3.getType() != -1) {
                            if (obj3.getSource() != -1) {
                                bazVar.z = 1;
                                h52.bar barVar3 = ((f52.bar) barVar2).f;
                                java.util.List<com.truecaller.namesuggestion.api.network.NameSuggestionRestModel.bar> c = kotlin.collections.x.c((java.lang.Object) obj3);
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "suggestions");
                                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((com.truecaller.namesuggestion.api.network.bar) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.CONTACT, com.truecaller.namesuggestion.api.network.bar.class)).a(c).H().a.k());
                                obj = valueOf;
                            } else {
                                throw new java.lang.IllegalArgumentException("Invalid NameSuggestion type");
                            }
                        } else {
                            throw new java.lang.IllegalArgumentException("Invalid NameSuggestion type");
                        }
                    } else {
                        bazVar.z = 2;
                        f52.bar barVar4 = (f52.bar) barVar2;
                        barVar4.getClass();
                        android.database.Cursor cursor = null;
                        try {
                            try {
                                android.database.sqlite.SQLiteDatabase writableDatabase = s31.baz.a(barVar4.a).getWritableDatabase();
                                android.database.Cursor query = writableDatabase.query("name_suggestions", new java.lang.String[]{"_id", "number", "name", "type", "source"}, null, null, null, null, null);
                                if (query != null) {
                                    if (query.getCount() == 0) {
                                        bool = java.lang.Boolean.TRUE;
                                    } else {
                                        int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
                                        int columnIndexOrThrow2 = query.getColumnIndexOrThrow("number");
                                        int columnIndexOrThrow3 = query.getColumnIndexOrThrow("name");
                                        int columnIndexOrThrow4 = query.getColumnIndexOrThrow("type");
                                        int columnIndexOrThrow5 = query.getColumnIndexOrThrow("source");
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        while (query.moveToNext()) {
                                            boolean z2 = z;
                                            ?? obj4 = new java.lang.Object();
                                            obj4.f(query.getString(columnIndexOrThrow2));
                                            obj4.e(query.getString(columnIndexOrThrow3));
                                            obj4.h(query.getInt(columnIndexOrThrow4));
                                            obj4.g(query.getInt(columnIndexOrThrow5));
                                            arrayList.add(obj4);
                                            z = z2;
                                        }
                                        boolean z3 = z;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "suggestions");
                                        if (!((com.truecaller.namesuggestion.api.network.bar) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.CONTACT, com.truecaller.namesuggestion.api.network.bar.class)).a(arrayList).H().a.k()) {
                                            bool = java.lang.Boolean.FALSE;
                                        } else {
                                            query.moveToPosition(-1);
                                            writableDatabase.beginTransaction();
                                            int i3 = 0;
                                            while (query.moveToNext()) {
                                                try {
                                                    i3 += writableDatabase.delete("name_suggestions", "_id=?", new java.lang.String[]{java.lang.String.valueOf(query.getLong(columnIndexOrThrow))});
                                                } finally {
                                                    writableDatabase.endTransaction();
                                                }
                                            }
                                            writableDatabase.setTransactionSuccessful();
                                            writableDatabase.endTransaction();
                                            if (arrayList.size() != i3) {
                                                java.util.Locale locale = java.util.Locale.getDefault();
                                                java.lang.Integer num = new java.lang.Integer(arrayList.size());
                                                java.lang.Integer num2 = new java.lang.Integer(i3);
                                                java.lang.Object[] objArr = new java.lang.Object[2];
                                                objArr[0] = num;
                                                objArr[z3 ? 1 : 0] = num2;
                                                java.lang.String format = java.lang.String.format(locale, "Uploaded %d name suggestions but deleted %d from DB", java.util.Arrays.copyOf(objArr, 2));
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                                o82.a.C(new java.lang.IllegalStateException(format));
                                            }
                                            bool = java.lang.Boolean.TRUE;
                                        }
                                    }
                                    query.close();
                                    obj2 = bool;
                                }
                            } catch (java.io.IOException unused) {
                            } catch (java.lang.RuntimeException e) {
                                o82.a.C(e);
                            }
                            obj2 = java.lang.Boolean.FALSE;
                        } catch (java.lang.Throwable th) {
                            if (0 != 0) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    return bool2;
                }
                if (!booleanValue) {
                    nd.s a3 = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "success(...)");
                    return a3;
                }
                return com.ironsource.adqualitysdk.sdk.i.bar.q("retry(...)");
            }
        }
        bazVar = new i52.baz(this, (ff3.qux) barVar);
        java.lang.Object obj22 = bazVar.x;
        java.lang.Boolean bool22 = ef3.bar.a;
        i = bazVar.z;
        boolean z4 = true;
        if (i == 0) {
        }
        if (!booleanValue) {
        }
    }
}
