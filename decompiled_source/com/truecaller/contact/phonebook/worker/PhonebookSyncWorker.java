package com.truecaller.contact.phonebook.worker;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/contact/phonebook/worker/PhonebookSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lh61/bar;", "contactManager", "Ljavax/inject/Provider;", "Lyf0/y1;", "cloudPhoneBookDuplicateRemover", "Lhw0/a;", "callingSettings", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh61/bar;Ljavax/inject/Provider;Lhw0/a;)V", "contact-phonebook_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PhonebookSyncWorker extends androidx.work.CoroutineWorker {
    public final android.content.Context a;
    public final h61.bar b;
    public final javax.inject.Provider c;
    public final hw0.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonebookSyncWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull h61.bar barVar, @org.jetbrains.annotations.NotNull javax.inject.Provider<yf0.y1> provider, @org.jetbrains.annotations.NotNull hw0.a aVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "contactManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "cloudPhoneBookDuplicateRemover");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "callingSettings");
        this.a = context;
        this.b = barVar;
        this.c = provider;
        this.d = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(2:3|(20:5|6|7|(1:(1:(1:(1:(6:13|14|(1:16)(1:21)|17|18|19)(2:22|23))(9:24|25|26|(2:28|(1:30)(1:33))|14|(0)(0)|17|18|19))(12:34|35|36|(1:38)(1:41)|(2:40|32)|26|(0)|14|(0)(0)|17|18|19))(1:42))(1:58)|43|(1:45)|46|(1:48)(1:57)|49|(3:51|(1:53)(1:56)|(2:55|32))|36|(0)(0)|(0)|26|(0)|14|(0)(0)|17|18|19))|61|6|7|(0)(0)|43|(0)|46|(0)(0)|49|(0)|36|(0)(0)|(0)|26|(0)|14|(0)(0)|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0102, code lost:
    
        if (r1 == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006c, code lost:
    
        if (r1 == r3) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df A[Catch: RuntimeException -> 0x0105, TryCatch #0 {RuntimeException -> 0x0105, blocks: (B:13:0x003c, B:25:0x004b, B:26:0x00d1, B:28:0x00df, B:33:0x0100, B:35:0x0052, B:36:0x00b5, B:41:0x00cc, B:51:0x0092, B:56:0x00b0), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc A[Catch: RuntimeException -> 0x0105, TryCatch #0 {RuntimeException -> 0x0105, blocks: (B:13:0x003c, B:25:0x004b, B:26:0x00d1, B:28:0x00df, B:33:0x0100, B:35:0x0052, B:36:0x00b5, B:41:0x00cc, B:51:0x0092, B:56:0x00b0), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092 A[Catch: RuntimeException -> 0x0105, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0105, blocks: (B:13:0x003c, B:25:0x004b, B:26:0x00d1, B:28:0x00df, B:33:0x0100, B:35:0x0052, B:36:0x00b5, B:41:0x00cc, B:51:0x0092, B:56:0x00b0), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        k61.bar barVar2;
        java.lang.Object obj;
        ef3.bar barVar3;
        int i;
        java.util.Set set;
        long j;
        java.lang.Boolean bool;
        boolean a;
        boolean z;
        java.lang.Object W;
        if (barVar instanceof k61.bar) {
            barVar2 = (k61.bar) barVar;
            int i2 = barVar2.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                barVar2.A = i2 - Integer.MIN_VALUE;
                obj = barVar2.y;
                barVar3 = ef3.bar.a;
                i = barVar2.A;
                h61.bar barVar4 = this.b;
                hw0.a aVar = this.d;
                android.content.Context context = this.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    od.p.E(obj);
                                    od.n z2 = os0.bar.z(context, "context", context, "getInstance(...)");
                                    wd.e eVar = new wd.e((android.net.NetworkRequest) null);
                                    nd.w wVar = nd.w.a;
                                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
                                    long millis = timeUnit.toMillis(3000L);
                                    android.net.Uri uri = android.provider.ContactsContract.Data.CONTENT_URI;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "CONTENT_URI");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
                                    linkedHashSet.add(new nd.c(true, uri));
                                    if (android.os.Build.VERSION.SDK_INT >= 24) {
                                        set = kotlin.collections.CollectionsKt.K0(linkedHashSet);
                                        j = millis;
                                    } else {
                                        set = kotlin.collections.j0.a;
                                        j = -1;
                                    }
                                    nd.d dVar = new nd.d(eVar, wVar, false, false, false, false, j, -1L, set);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.contact.phonebook.worker.PhonebookSyncWorker.class, "workerClass");
                                    z2.g("PhonebookFullSyncWorker", nd.l.c, new f6.v0(com.truecaller.contact.phonebook.worker.PhonebookSyncWorker.class).v(dVar).d());
                                    nd.s a2 = nd.t.a();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                                    return a2;
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            z = barVar2.x;
                            od.p.E(obj);
                            if (((yf0.y1) this.c.get()).b()) {
                                context.getContentResolver().delete(h81.c.d(), "contact_source & 2 != 0", null);
                                barVar2.x = z;
                                barVar2.A = 4;
                                h61.baz bazVar = (h61.baz) barVar4;
                                java.lang.Object W2 = fg3.h0.W(bazVar.b, new fi2.g(bazVar, (df3.bar) null, 19), barVar2);
                                if (W2 != barVar3) {
                                    W2 = kotlin.Unit.a;
                                }
                            }
                            od.n z22 = os0.bar.z(context, "context", context, "getInstance(...)");
                            wd.e eVar2 = new wd.e((android.net.NetworkRequest) null);
                            nd.w wVar2 = nd.w.a;
                            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
                            java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit2, "timeUnit");
                            long millis2 = timeUnit2.toMillis(3000L);
                            android.net.Uri uri2 = android.provider.ContactsContract.Data.CONTENT_URI;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri2, "CONTENT_URI");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri2, "uri");
                            linkedHashSet2.add(new nd.c(true, uri2));
                            if (android.os.Build.VERSION.SDK_INT >= 24) {
                            }
                            nd.d dVar2 = new nd.d(eVar2, wVar2, false, false, false, false, j, -1L, set);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.contact.phonebook.worker.PhonebookSyncWorker.class, "workerClass");
                            z22.g("PhonebookFullSyncWorker", nd.l.c, new f6.v0(com.truecaller.contact.phonebook.worker.PhonebookSyncWorker.class).v(dVar2).d());
                            nd.s a22 = nd.t.a();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a22, "success(...)");
                            return a22;
                        }
                        z = barVar2.x;
                        od.p.E(obj);
                        barVar2.x = z;
                        barVar2.A = 3;
                        h61.baz bazVar2 = (h61.baz) barVar4;
                        W = fg3.h0.W(bazVar2.b, new fi2.g(bazVar2, (df3.bar) null, 19), barVar2);
                        if (W != barVar3) {
                            W = kotlin.Unit.a;
                        }
                        if (W == barVar3) {
                            return barVar3;
                        }
                        if (((yf0.y1) this.c.get()).b()) {
                        }
                        od.n z222 = os0.bar.z(context, "context", context, "getInstance(...)");
                        wd.e eVar22 = new wd.e((android.net.NetworkRequest) null);
                        nd.w wVar22 = nd.w.a;
                        java.util.LinkedHashSet linkedHashSet22 = new java.util.LinkedHashSet();
                        java.util.concurrent.TimeUnit timeUnit22 = java.util.concurrent.TimeUnit.MILLISECONDS;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit22, "timeUnit");
                        long millis22 = timeUnit22.toMillis(3000L);
                        android.net.Uri uri22 = android.provider.ContactsContract.Data.CONTENT_URI;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri22, "CONTENT_URI");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri22, "uri");
                        linkedHashSet22.add(new nd.c(true, uri22));
                        if (android.os.Build.VERSION.SDK_INT >= 24) {
                        }
                        nd.d dVar22 = new nd.d(eVar22, wVar22, false, false, false, false, j, -1L, set);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.contact.phonebook.worker.PhonebookSyncWorker.class, "workerClass");
                        z222.g("PhonebookFullSyncWorker", nd.l.c, new f6.v0(com.truecaller.contact.phonebook.worker.PhonebookSyncWorker.class).v(dVar22).d());
                        nd.s a222 = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a222, "success(...)");
                        return a222;
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    barVar2.A = 1;
                    obj = ef0.a.z(((hw0.q) aVar).d(), hw0.q.v, false, barVar2);
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    obj = null;
                }
                bool = (java.lang.Boolean) obj;
                if (bool == null) {
                    a = bool.booleanValue();
                } else {
                    a = getInputData().a("clearLocal", false);
                }
                z = a;
                if (z) {
                    context.getContentResolver().delete(h81.c.d(), "contact_source & 2 != 0", null);
                    barVar2.x = z;
                    barVar2.A = 2;
                    java.lang.Object W3 = ef0.a.W(((hw0.q) aVar).d(), hw0.q.v, false, barVar2);
                    if (W3 != barVar3) {
                        W3 = kotlin.Unit.a;
                    }
                    if (W3 == barVar3) {
                        return barVar3;
                    }
                }
                barVar2.x = z;
                barVar2.A = 3;
                h61.baz bazVar22 = (h61.baz) barVar4;
                W = fg3.h0.W(bazVar22.b, new fi2.g(bazVar22, (df3.bar) null, 19), barVar2);
                if (W != barVar3) {
                }
                if (W == barVar3) {
                }
                if (((yf0.y1) this.c.get()).b()) {
                }
                od.n z2222 = os0.bar.z(context, "context", context, "getInstance(...)");
                wd.e eVar222 = new wd.e((android.net.NetworkRequest) null);
                nd.w wVar222 = nd.w.a;
                java.util.LinkedHashSet linkedHashSet222 = new java.util.LinkedHashSet();
                java.util.concurrent.TimeUnit timeUnit222 = java.util.concurrent.TimeUnit.MILLISECONDS;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit222, "timeUnit");
                long millis222 = timeUnit222.toMillis(3000L);
                android.net.Uri uri222 = android.provider.ContactsContract.Data.CONTENT_URI;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri222, "CONTENT_URI");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri222, "uri");
                linkedHashSet222.add(new nd.c(true, uri222));
                if (android.os.Build.VERSION.SDK_INT >= 24) {
                }
                nd.d dVar222 = new nd.d(eVar222, wVar222, false, false, false, false, j, -1L, set);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.contact.phonebook.worker.PhonebookSyncWorker.class, "workerClass");
                z2222.g("PhonebookFullSyncWorker", nd.l.c, new f6.v0(com.truecaller.contact.phonebook.worker.PhonebookSyncWorker.class).v(dVar222).d());
                nd.s a2222 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2222, "success(...)");
                return a2222;
            }
        }
        barVar2 = new k61.bar(this, (ff3.qux) barVar);
        obj = barVar2.y;
        barVar3 = ef3.bar.a;
        i = barVar2.A;
        h61.bar barVar42 = this.b;
        hw0.a aVar2 = this.d;
        android.content.Context context2 = this.a;
        if (i == 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
        bool = (java.lang.Boolean) obj;
        if (bool == null) {
        }
        z = a;
        if (z) {
        }
        barVar2.x = z;
        barVar2.A = 3;
        h61.baz bazVar222 = (h61.baz) barVar42;
        W = fg3.h0.W(bazVar222.b, new fi2.g(bazVar222, (df3.bar) null, 19), barVar2);
        if (W != barVar3) {
        }
        if (W == barVar3) {
        }
        if (((yf0.y1) this.c.get()).b()) {
        }
        od.n z22222 = os0.bar.z(context2, "context", context2, "getInstance(...)");
        wd.e eVar2222 = new wd.e((android.net.NetworkRequest) null);
        nd.w wVar2222 = nd.w.a;
        java.util.LinkedHashSet linkedHashSet2222 = new java.util.LinkedHashSet();
        java.util.concurrent.TimeUnit timeUnit2222 = java.util.concurrent.TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit2222, "timeUnit");
        long millis2222 = timeUnit2222.toMillis(3000L);
        android.net.Uri uri2222 = android.provider.ContactsContract.Data.CONTENT_URI;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri2222, "CONTENT_URI");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri2222, "uri");
        linkedHashSet2222.add(new nd.c(true, uri2222));
        if (android.os.Build.VERSION.SDK_INT >= 24) {
        }
        nd.d dVar2222 = new nd.d(eVar2222, wVar2222, false, false, false, false, j, -1L, set);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.contact.phonebook.worker.PhonebookSyncWorker.class, "workerClass");
        z22222.g("PhonebookFullSyncWorker", nd.l.c, new f6.v0(com.truecaller.contact.phonebook.worker.PhonebookSyncWorker.class).v(dVar2222).d());
        nd.s a22222 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a22222, "success(...)");
        return a22222;
    }
}
