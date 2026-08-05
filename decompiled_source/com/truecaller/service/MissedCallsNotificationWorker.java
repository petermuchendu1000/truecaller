package com.truecaller.service;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u0093\u0001\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/truecaller/service/MissedCallsNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lkotlin/coroutines/CoroutineContext;", "uiCoroutineContext", "cpuCoroutineContext", "asyncIoCoroutineContext", "Lsu0/b;", "historyManager", "Ls62/d;", "systemNotificationManager", "Ls62/g;", "pendingIntentFactory", "Lhw0/a;", "callingSettings", "Lu03/z;", "permissionUtil", "Ltp2/a;", "searchWarningsHelper", "Lp81/b;", "rawContactDao", "Lc62/q;", "searchManager", "Lqo1/qux;", "bizmonFeaturesInventory", "Lzg0/bar;", "bizCallMeBackDataProvider", "Ljw0/bar;", "callLogApi", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lsu0/b;Ls62/d;Ls62/g;Lhw0/a;Lu03/z;Ltp2/a;Lp81/b;Lc62/q;Lqo1/qux;Lzg0/bar;Ljw0/bar;)V", "dq2/c", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class MissedCallsNotificationWorker extends androidx.work.CoroutineWorker {
    public final android.content.Context a;
    public final kotlin.coroutines.CoroutineContext b;
    public final kotlin.coroutines.CoroutineContext c;
    public final kotlin.coroutines.CoroutineContext d;
    public final su0.b e;
    public final s62.d f;
    public final s62.g g;
    public final hw0.a h;
    public final u03.z i;
    public final tp2.a j;
    public final p81.b k;
    public final c62.q l;
    public final qo1.qux m;
    public final zg0.bar n;
    public final jw0.bar o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissedCallsNotificationWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @javax.inject.Named("UI") @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext coroutineContext, @javax.inject.Named("CPU") @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext coroutineContext2, @javax.inject.Named("IO") @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext coroutineContext3, @org.jetbrains.annotations.NotNull su0.b bVar, @org.jetbrains.annotations.NotNull s62.d dVar, @org.jetbrains.annotations.NotNull s62.g gVar, @org.jetbrains.annotations.NotNull hw0.a aVar, @org.jetbrains.annotations.NotNull u03.z zVar, @org.jetbrains.annotations.NotNull tp2.a aVar2, @org.jetbrains.annotations.NotNull p81.b bVar2, @org.jetbrains.annotations.NotNull c62.q qVar, @org.jetbrains.annotations.NotNull qo1.qux quxVar, @org.jetbrains.annotations.NotNull zg0.bar barVar, @org.jetbrains.annotations.NotNull jw0.bar barVar2) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiCoroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "cpuCoroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext3, "asyncIoCoroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "historyManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "systemNotificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "pendingIntentFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "callingSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zVar, "permissionUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar2, "searchWarningsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar2, "rawContactDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "searchManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "bizmonFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "bizCallMeBackDataProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "callLogApi");
        this.a = context;
        this.b = coroutineContext;
        this.c = coroutineContext2;
        this.d = coroutineContext3;
        this.e = bVar;
        this.f = dVar;
        this.g = gVar;
        this.h = aVar;
        this.i = zVar;
        this.j = aVar2;
        this.k = bVar2;
        this.l = qVar;
        this.m = quxVar;
        this.n = barVar;
        this.o = barVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b7, code lost:
    
        if (r8 == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        if (r9 == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        if (r9 == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Enum a(com.truecaller.service.MissedCallsNotificationWorker missedCallsNotificationWorker, ff3.qux quxVar) {
        dq2.f fVar;
        int i;
        boolean booleanValue;
        boolean a;
        hw0.q qVar = missedCallsNotificationWorker.h;
        if (quxVar instanceof dq2.f) {
            fVar = (dq2.f) quxVar;
            int i2 = fVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.B = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = fVar.z;
                ef3.bar barVar = ef3.bar.a;
                i = fVar.B;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                od.p.E(obj);
                                return dq2.c.b;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a = fVar.y;
                        booleanValue = fVar.x;
                        od.p.E(obj);
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            fVar.x = booleanValue;
                            fVar.y = a;
                            fVar.B = 3;
                            java.lang.Object W = ef0.a.W(qVar.d(), hw0.q.q, false, fVar);
                            if (W != barVar) {
                                W = kotlin.Unit.a;
                            }
                        }
                        return dq2.c.c;
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    r11.bar applicationContext = missedCallsNotificationWorker.a.getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.e(applicationContext, "null cannot be cast to non-null type com.truecaller.common.app.ApplicationBase");
                    if (applicationContext.d()) {
                        fVar.B = 1;
                        obj = ef0.a.z(qVar.d(), hw0.q.s, false, fVar);
                    } else {
                        return dq2.c.c;
                    }
                }
                booleanValue = ((java.lang.Boolean) obj).booleanValue();
                a = missedCallsNotificationWorker.i.a();
                if (!booleanValue && a) {
                    return dq2.c.a;
                }
                if (booleanValue) {
                    fVar.x = booleanValue;
                    fVar.y = a;
                    fVar.B = 2;
                    obj = ef0.a.z(qVar.d(), hw0.q.q, true, fVar);
                }
                return dq2.c.c;
            }
        }
        fVar = new dq2.f(missedCallsNotificationWorker, quxVar);
        java.lang.Object obj2 = fVar.z;
        ef3.bar barVar2 = ef3.bar.a;
        i = fVar.B;
        if (i == 0) {
        }
        booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        a = missedCallsNotificationWorker.i.a();
        if (!booleanValue) {
        }
        if (booleanValue) {
        }
        return dq2.c.c;
    }

    public static final java.lang.Object b(com.truecaller.service.MissedCallsNotificationWorker missedCallsNotificationWorker, uu0.baz bazVar, android.content.Context context, bu1.e eVar) {
        s62.h hVar = missedCallsNotificationWorker.g;
        long j = 0;
        while (bazVar.moveToNext()) {
            com.truecaller.data.entity.HistoryEvent d = ((uu0.qux) bazVar).d();
            if (d != null) {
                j = java.lang.Math.max(j, d.j);
            }
        }
        f6.f0 f = missedCallsNotificationWorker.f();
        android.app.Notification notification = f.Q;
        f.k(4);
        f.D = context.getColor(2131102024);
        notification.icon = 2131232899;
        f.l(16, true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "setAutoCancel(...)");
        notification.when = j;
        android.content.Intent putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.notifications.MissedCallsNotificationActionReceiver.class).setAction("com.truecaller.CLEAR_ALTERNATIVE_MISSED_CALLS").putExtra("lastTimestamp", j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        s62.h hVar2 = hVar;
        bo.p a = hVar2.a();
        a.b = 2131366098;
        a.c = 335544320;
        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
        notification.deleteIntent = a.k(pushNotificationSource.getType(), "notificationMissedCallPromo", putExtra);
        f.l = 1;
        f.j(context.getString(2132022101));
        f.i(context.getString(2132022100));
        android.content.Intent o = y90.m6.o(context, com.truecaller.bottombar.BottomBarButtonType.CALLS, "notification", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 120);
        int i = com.truecaller.ui.NotificationAccessActivity.k0;
        android.content.Intent t = yb0.i.t(context, com.truecaller.premium.util.NotificationAccessSource.MISSED_CALL_NOTIFICATION, 2132018122, o);
        f6.k1 k1Var = new f6.k1(context);
        k1Var.a.add(t);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var, "addNextIntent(...)");
        bo.p a2 = hVar2.a();
        a2.b = 2131366101;
        a2.c = 335544320;
        android.app.PendingIntent f2 = a2.f(k1Var, pushNotificationSource.getType(), "notificationMissedCallPromo");
        f.a(0, f2, context.getString(2132022107));
        f.g = f2;
        f.m(android.graphics.BitmapFactory.decodeResource(context.getResources(), 2131755009));
        android.app.Notification d2 = f.d();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
        java.lang.Object j2 = missedCallsNotificationWorker.j(d2, "notificationMissedCallPromo", pushNotificationSource, eVar);
        if (j2 == ef3.bar.a) {
            return j2;
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0303 A[LOOP:0: B:83:0x02fd->B:85:0x0303, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c5  */
    /* JADX WARN: Type inference failed for: r12v15, types: [int] */
    /* JADX WARN: Type inference failed for: r29v0, types: [com.truecaller.service.MissedCallsNotificationWorker] */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x025e -> B:19:0x0277). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x00e6 -> B:88:0x00ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object c(com.truecaller.service.MissedCallsNotificationWorker missedCallsNotificationWorker, uu0.baz bazVar, ff3.qux quxVar) {
        dq2.h hVar;
        int i;
        boolean z;
        uu0.baz bazVar2;
        java.util.ArrayList l;
        uu0.baz bazVar3;
        boolean z2;
        f6.f0 f;
        f6.y yVar;
        long j;
        int i2;
        boolean z3;
        java.util.Iterator it;
        uu0.baz bazVar4;
        int i3;
        int i4;
        boolean z4;
        ef3.bar barVar;
        int i5;
        f6.f0 f0Var;
        java.util.Iterator it3;
        int i6;
        java.text.SimpleDateFormat simpleDateFormat;
        java.lang.String format;
        dq2.h hVar2;
        java.lang.String string;
        s62.g gVar = missedCallsNotificationWorker.g;
        sw0.qux quxVar2 = missedCallsNotificationWorker.o;
        android.content.Context context = missedCallsNotificationWorker.a;
        if (quxVar instanceof dq2.h) {
            hVar = (dq2.h) quxVar;
            int i7 = hVar.O;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                hVar.O = i7 - Integer.MIN_VALUE;
                java.lang.Object obj = hVar.M;
                ef3.bar barVar2 = ef3.bar.a;
                i = hVar.O;
                java.lang.String str = "notificationMultipleMissedCall";
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                android.app.PendingIntent pendingIntent = hVar.E;
                                f0Var = hVar.A;
                                java.lang.String str2 = hVar.z;
                                od.p.E(obj);
                                f = f0Var;
                                return f.d();
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i8 = hVar.K;
                        z4 = false;
                        long j2 = hVar.L;
                        int i9 = hVar.J;
                        ?? r12 = hVar.I;
                        int i10 = hVar.H;
                        com.truecaller.data.entity.Contact contact = hVar.G;
                        java.lang.String str3 = hVar.F;
                        com.truecaller.data.entity.HistoryEvent historyEvent = hVar.E;
                        java.util.Iterator it4 = hVar.D;
                        uu0.baz bazVar5 = hVar.C;
                        f6.y yVar2 = hVar.B;
                        f6.f0 f0Var2 = hVar.A;
                        java.lang.String str4 = hVar.z;
                        od.p.E(obj);
                        s62.g gVar2 = gVar;
                        ef3.bar barVar3 = barVar2;
                        dq2.h hVar3 = hVar;
                        int i11 = i8;
                        java.util.Iterator it5 = it4;
                        com.truecaller.data.entity.HistoryEvent historyEvent2 = historyEvent;
                        java.lang.Object g = obj;
                        boolean z5 = r12;
                        f = f0Var2;
                        java.lang.String str5 = "notificationMultipleMissedCall";
                        long j3 = j2;
                        int i12 = i9;
                        java.lang.String str6 = (java.lang.String) g;
                        if (jj3.bar.j(contact.s())) {
                            if (str6 == null || kotlin.text.StringsKt.X(str6)) {
                                it3 = it5;
                                java.lang.Object[] objArr = new java.lang.Object[2];
                                objArr[z4 ? 1 : 0] = contact.s();
                                objArr[1] = str3;
                                string = context.getString(2132018283, objArr);
                            } else {
                                it3 = it5;
                                java.lang.Object[] objArr2 = new java.lang.Object[2];
                                objArr2[z4 ? 1 : 0] = contact.s();
                                objArr2[1] = str6;
                                string = context.getString(2132018283, objArr2);
                            }
                            str3 = string;
                        } else {
                            it3 = it5;
                        }
                        if (!contact.Q() && !android.text.TextUtils.isEmpty(contact.d0)) {
                            java.lang.Long E = contact.E();
                            i6 = i11;
                            hVar2 = hVar3;
                            if (E != null) {
                                f.c(android.provider.ContactsContract.Contacts.getLookupUri(E.longValue(), contact.d0).toString());
                            }
                        } else {
                            i6 = i11;
                            hVar2 = hVar3;
                            java.util.List<com.truecaller.data.entity.Number> C = contact.C();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "getNumbers(...)");
                            for (com.truecaller.data.entity.Number number : C) {
                                f.c("tel:" + ((java.lang.Object) jj3.bar.e(number.h, number.f)));
                            }
                        }
                        i2 = i10;
                        bazVar4 = bazVar5;
                        long j4 = j3;
                        dq2.h hVar4 = hVar2;
                        z3 = z5;
                        yVar = yVar2;
                        com.truecaller.data.entity.HistoryEvent historyEvent3 = historyEvent2;
                        long j5 = j4;
                        if (!android.text.format.DateUtils.isToday(historyEvent3.j)) {
                            format = vz1.bar.e(context, historyEvent3.j);
                        } else {
                            long j6 = historyEvent3.j;
                            if (vz1.bar.b(context) == 'd') {
                                simpleDateFormat = vz1.bar.l;
                            } else {
                                simpleDateFormat = vz1.bar.m;
                            }
                            format = simpleDateFormat.format(new java.util.Date(j6));
                        }
                        kotlin.jvm.internal.Intrinsics.d(format);
                        java.lang.Object[] objArr3 = new java.lang.Object[2];
                        objArr3[z4 ? 1 : 0] = format;
                        objArr3[1] = str3;
                        java.lang.String string2 = context.getString(2132018287, objArr3);
                        if (string2 == null) {
                            ((java.util.ArrayList) yVar.f).add(f6.f0.e(string2));
                        } else {
                            yVar.getClass();
                        }
                        i4 = i6 + 1;
                        barVar2 = barVar3;
                        hVar = hVar4;
                        gVar = gVar2;
                        j = j5;
                        str = str5;
                        it = it3;
                        bazVar2 = null;
                        i3 = i12;
                        z4 = z4;
                        gVar2 = gVar;
                        if (it.hasNext()) {
                            com.truecaller.data.entity.HistoryEvent historyEvent4 = (com.truecaller.data.entity.HistoryEvent) it.next();
                            int i14 = i3;
                            if (bazVar4 == null) {
                                bazVar4 = historyEvent4.d;
                                i14 = i3;
                            } else if (i3 != 0) {
                                i14 = jj3.bar.f(bazVar4, historyEvent4.d);
                            }
                            ef3.bar barVar4 = barVar2;
                            int i15 = i14;
                            long max = java.lang.Math.max(j, historyEvent4.j);
                            if (i4 >= 5 && i15 == 0) {
                                j = max;
                                barVar = barVar4;
                                i5 = i15;
                            } else {
                                str3 = historyEvent4.d;
                                if (android.text.TextUtils.isEmpty(str3)) {
                                    str3 = context.getString(2132018071);
                                    i12 = i15;
                                    j5 = max;
                                    it3 = it;
                                    i6 = i4;
                                    str5 = str;
                                    historyEvent3 = historyEvent4;
                                    hVar4 = hVar;
                                    barVar3 = barVar4;
                                } else {
                                    com.truecaller.data.entity.Contact contact2 = historyEvent4.h;
                                    if (contact2 == null) {
                                        str5 = str;
                                        f.c("tel:" + historyEvent4.d);
                                        i12 = i15;
                                        j5 = max;
                                        it3 = it;
                                        i6 = i4;
                                        hVar4 = hVar;
                                        historyEvent3 = historyEvent4;
                                        barVar3 = barVar4;
                                    } else {
                                        str5 = str;
                                        uu0.baz bazVar6 = bazVar2;
                                        hVar.x = bazVar6;
                                        hVar.y = bazVar6;
                                        hVar.z = bazVar6;
                                        hVar.A = f;
                                        hVar.B = yVar;
                                        hVar.C = bazVar4;
                                        hVar.D = it;
                                        hVar.E = historyEvent4;
                                        hVar.F = str3;
                                        hVar.G = contact2;
                                        hVar.H = i2;
                                        hVar.I = z3 ? 1 : 0;
                                        hVar.J = i15;
                                        hVar.L = max;
                                        hVar.K = i4;
                                        uu0.baz bazVar7 = bazVar4;
                                        hVar.O = 2;
                                        g = missedCallsNotificationWorker.g(contact2, hVar);
                                        historyEvent2 = historyEvent4;
                                        barVar3 = barVar4;
                                        if (g != barVar3) {
                                            i10 = i2;
                                            contact = contact2;
                                            bazVar5 = bazVar7;
                                            yVar2 = yVar;
                                            z5 = z3 ? 1 : 0;
                                            int i16 = i4;
                                            it5 = it;
                                            dq2.h hVar5 = hVar;
                                            i11 = i16;
                                            hVar3 = hVar5;
                                            i12 = i15;
                                            j3 = max;
                                            z4 = z4;
                                            java.lang.String str62 = (java.lang.String) g;
                                            if (jj3.bar.j(contact.s())) {
                                            }
                                            if (!contact.Q()) {
                                            }
                                            i6 = i11;
                                            hVar2 = hVar3;
                                            java.util.List<com.truecaller.data.entity.Number> C2 = contact.C();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C2, "getNumbers(...)");
                                            while (r1.hasNext()) {
                                            }
                                            i2 = i10;
                                            bazVar4 = bazVar5;
                                            long j42 = j3;
                                            dq2.h hVar42 = hVar2;
                                            z3 = z5;
                                            yVar = yVar2;
                                            com.truecaller.data.entity.HistoryEvent historyEvent32 = historyEvent2;
                                            long j52 = j42;
                                        } else {
                                            return barVar3;
                                        }
                                    }
                                }
                                if (!android.text.format.DateUtils.isToday(historyEvent32.j)) {
                                }
                                kotlin.jvm.internal.Intrinsics.d(format);
                                java.lang.Object[] objArr32 = new java.lang.Object[2];
                                objArr32[z4 ? 1 : 0] = format;
                                objArr32[1] = str3;
                                java.lang.String string22 = context.getString(2132018287, objArr32);
                                if (string22 == null) {
                                }
                                i4 = i6 + 1;
                                barVar2 = barVar3;
                                hVar = hVar42;
                                gVar = gVar2;
                                j = j52;
                                str = str5;
                                it = it3;
                                bazVar2 = null;
                                i3 = i12;
                                z4 = z4;
                                gVar2 = gVar;
                                if (it.hasNext()) {
                                    barVar = barVar2;
                                    i5 = i3;
                                }
                            }
                        }
                        java.lang.String str7 = str;
                        if (i2 > 5) {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            objArr4[z4 ? 1 : 0] = new java.lang.Integer(i2 - 5);
                            ((f6.v0) yVar).d = f6.f0.e(context.getString(2132022108, objArr4));
                            ((f6.v0) yVar).a = true;
                        }
                        f.t(yVar);
                        f.l = 1;
                        android.content.Intent putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.notifications.MissedCallsNotificationActionReceiver.class).setAction("com.truecaller.CLEAR_MISSED_CALLS").putExtra("lastTimestamp", j);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                        bo.p a = ((s62.h) gVar2).a();
                        a.b = 2131366098;
                        a.c = 335544320;
                        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                        f.Q.deleteIntent = a.k(pushNotificationSource.getType(), str7, putExtra);
                        if (!qe0.i1.s()) {
                            android.app.Notification d = f.d();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
                            hVar.x = null;
                            hVar.y = null;
                            hVar.z = null;
                            hVar.A = f;
                            hVar.B = null;
                            hVar.C = null;
                            hVar.D = null;
                            hVar.E = null;
                            hVar.F = null;
                            hVar.G = null;
                            hVar.H = i2;
                            hVar.I = z3 ? 1 : 0;
                            hVar.J = i5;
                            hVar.L = j;
                            hVar.K = i4;
                            hVar.O = 3;
                            if (missedCallsNotificationWorker.j(d, str7, pushNotificationSource, hVar) == barVar) {
                                return barVar;
                            }
                            f0Var = f;
                            f = f0Var;
                        }
                        return f.d();
                    }
                    boolean z6 = false;
                    bazVar2 = null;
                    com.truecaller.data.entity.HistoryEvent historyEvent5 = hVar.z;
                    java.util.List list = hVar.y;
                    uu0.baz bazVar8 = hVar.x;
                    od.p.E(obj);
                    java.util.ArrayList arrayList = list;
                    dq2.h hVar6 = hVar;
                    uu0.baz bazVar9 = bazVar8;
                    com.truecaller.data.entity.HistoryEvent d2 = historyEvent5;
                    java.lang.Object obj2 = obj;
                    if (!((java.lang.Boolean) obj2).booleanValue()) {
                        arrayList.add(d2);
                    }
                    bazVar3 = bazVar9;
                    hVar = hVar6;
                    l = arrayList;
                    z = z6;
                    while (bazVar3.moveToNext()) {
                        d2 = ((uu0.qux) bazVar3).d();
                        if (d2 != null) {
                            com.truecaller.data.entity.Contact contact3 = d2.h;
                            hVar.x = bazVar3;
                            hVar.y = l;
                            hVar.z = d2;
                            hVar.O = 1;
                            java.lang.Object h = missedCallsNotificationWorker.h(contact3, hVar);
                            if (h == barVar2) {
                                return barVar2;
                            }
                            dq2.h hVar7 = hVar;
                            bazVar9 = bazVar3;
                            obj2 = h;
                            arrayList = l;
                            hVar6 = hVar7;
                            z6 = z;
                            if (!((java.lang.Boolean) obj2).booleanValue()) {
                            }
                            bazVar3 = bazVar9;
                            hVar = hVar6;
                            l = arrayList;
                            z = z6;
                            while (bazVar3.moveToNext()) {
                            }
                        }
                    }
                    if (!l.isEmpty()) {
                        return bazVar2;
                    }
                    int size = l.size();
                    java.lang.String string3 = context.getString(2132022109);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    objArr5[z ? 1 : 0] = new java.lang.Integer(size);
                    java.lang.String m = bx.e1.m(1, string3, "format(...)", objArr5);
                    sw0.qux quxVar3 = quxVar2;
                    if (quxVar3.b() && quxVar3.c()) {
                        z2 = true;
                    } else {
                        z2 = z ? 1 : 0;
                    }
                    bo.p a2 = ((s62.h) gVar).a();
                    a2.b = 2131366100;
                    a2.c = 335544320;
                    int i17 = com.truecaller.notifications.MissedCallsNotificationActionReceiver.l;
                    android.app.PendingIntent e = a2.e(com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationMultipleMissedCall", ap1.d.v(context, z2));
                    f = missedCallsNotificationWorker.f();
                    f.k(4);
                    f.D = context.getColor(2131102024);
                    f.Q.icon = 2131232899;
                    f.l(16, true);
                    f.g = e;
                    f.e = f6.f0.e(context.getString(2132022110));
                    f.f = f6.f0.e(m);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "setContentText(...)");
                    yVar = new f6.y(1);
                    ((f6.v0) yVar).c = f6.f0.e(m);
                    j = 0;
                    i2 = size;
                    z3 = z2;
                    it = l.iterator();
                    bazVar4 = bazVar2;
                    i3 = 1;
                    i4 = z ? 1 : 0;
                    z4 = z;
                    gVar2 = gVar;
                    if (it.hasNext()) {
                    }
                    java.lang.String str72 = str;
                    if (i2 > 5) {
                    }
                    f.t(yVar);
                    f.l = 1;
                    android.content.Intent putExtra2 = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.notifications.MissedCallsNotificationActionReceiver.class).setAction("com.truecaller.CLEAR_MISSED_CALLS").putExtra("lastTimestamp", j);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra2, "putExtra(...)");
                    bo.p a3 = ((s62.h) gVar2).a();
                    a3.b = 2131366098;
                    a3.c = 335544320;
                    com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource2 = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                    f.Q.deleteIntent = a3.k(pushNotificationSource2.getType(), str72, putExtra2);
                    if (!qe0.i1.s()) {
                    }
                    return f.d();
                }
                z = false;
                bazVar2 = null;
                l = ia0.bar.l(obj);
                bazVar3 = bazVar;
                while (bazVar3.moveToNext()) {
                }
                if (!l.isEmpty()) {
                }
            }
        }
        hVar = new dq2.h(missedCallsNotificationWorker, quxVar);
        java.lang.Object obj3 = hVar.M;
        ef3.bar barVar22 = ef3.bar.a;
        i = hVar.O;
        java.lang.String str8 = "notificationMultipleMissedCall";
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x02dd, code lost:
    
        if (r1.c() != false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0390 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.jvm.internal.j0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object d(com.truecaller.service.MissedCallsNotificationWorker missedCallsNotificationWorker, com.truecaller.data.entity.HistoryEvent historyEvent, ff3.qux quxVar) {
        dq2.i iVar;
        int i;
        java.lang.String str;
        sw0.qux quxVar2;
        s62.h hVar;
        java.lang.String str2;
        android.content.Context context;
        com.truecaller.data.entity.Contact contact;
        android.app.PendingIntent pendingIntent;
        android.app.PendingIntent pendingIntent2;
        android.app.PendingIntent pendingIntent3;
        int i2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        boolean z;
        android.content.Context context2;
        java.lang.String str7;
        f6.f0 f0Var;
        int i3;
        boolean z2;
        com.truecaller.data.entity.Contact contact2;
        android.content.Context context3;
        f6.f0 f0Var2;
        java.lang.String str8;
        f6.f0 f0Var3;
        int i4;
        java.lang.String string;
        java.lang.String str9;
        int i5;
        com.truecaller.data.entity.Contact contact3;
        android.content.Intent putExtra;
        java.lang.String str10;
        long j;
        java.lang.String str11;
        int i6;
        com.truecaller.data.entity.Contact contact4;
        kotlin.jvm.internal.j0 j0Var;
        java.lang.String s;
        c62.v a;
        kotlin.jvm.internal.j0 j0Var2;
        kotlin.jvm.internal.j0 j0Var3;
        java.lang.String str12;
        f6.f0 f0Var4;
        com.truecaller.service.MissedCallsNotificationWorker missedCallsNotificationWorker2 = missedCallsNotificationWorker;
        sw0.qux quxVar3 = missedCallsNotificationWorker2.o;
        s62.h hVar2 = missedCallsNotificationWorker2.g;
        if (quxVar instanceof dq2.i) {
            iVar = (dq2.i) quxVar;
            int i7 = iVar.H;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                iVar.H = i7 - Integer.MIN_VALUE;
                java.lang.Object obj = iVar.F;
                ef3.bar barVar = ef3.bar.a;
                i = iVar.H;
                java.lang.String str13 = "build(...)";
                java.lang.String str14 = "notificationMissedCall";
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    android.app.PendingIntent pendingIntent4 = iVar.C;
                                    f0Var4 = iVar.A;
                                    od.p.E(obj);
                                    f0Var = f0Var4;
                                    return f0Var.d();
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i6 = iVar.E;
                            i3 = iVar.D;
                            android.app.PendingIntent pendingIntent5 = iVar.C;
                            kotlin.jvm.internal.j0 j0Var4 = iVar.B;
                            f0Var = iVar.A;
                            od.p.E(obj);
                            j0Var3 = j0Var4;
                            str12 = (java.lang.String) obj;
                            if (str12 != null) {
                                if (kotlin.text.StringsKt.X(str12)) {
                                    str12 = null;
                                }
                                if (str12 != null) {
                                    java.lang.String str15 = j0Var3.a + ": " + str12;
                                    j0Var3.a = str15;
                                    f6.y yVar = new f6.y(0);
                                    yVar.f = f6.f0.e(str15);
                                    f0Var.t(yVar);
                                }
                            }
                            f0Var.i((java.lang.CharSequence) j0Var3.a);
                            if (!qe0.i1.s()) {
                                android.app.Notification d = f0Var.d();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, str13);
                                com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                                iVar.x = null;
                                iVar.y = null;
                                iVar.z = null;
                                iVar.A = f0Var;
                                iVar.B = null;
                                iVar.C = null;
                                iVar.D = i3;
                                iVar.E = i6;
                                iVar.H = 4;
                                if (missedCallsNotificationWorker2.j(d, str14, pushNotificationSource, iVar) != barVar) {
                                    f0Var4 = f0Var;
                                    f0Var = f0Var4;
                                } else {
                                    return barVar;
                                }
                            }
                            return f0Var.d();
                        }
                        i6 = iVar.E;
                        i3 = iVar.D;
                        android.app.PendingIntent pendingIntent6 = iVar.C;
                        kotlin.jvm.internal.j0 j0Var5 = iVar.B;
                        f0Var = iVar.A;
                        contact4 = iVar.z;
                        str7 = iVar.y;
                        context2 = iVar.x;
                        od.p.E(obj);
                        j0Var2 = j0Var5;
                        contact = contact4;
                        j0Var = j0Var2;
                        if (contact == null) {
                            r11.bar applicationContext = context2.getApplicationContext();
                            kotlin.jvm.internal.Intrinsics.e(applicationContext, "null cannot be cast to non-null type com.truecaller.common.app.ApplicationBase");
                            if (applicationContext.d() && !android.text.TextUtils.isEmpty(str7)) {
                                try {
                                    c62.r rVar = missedCallsNotificationWorker2.l;
                                    java.util.UUID randomUUID = java.util.UUID.randomUUID();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
                                    c62.o c = rVar.c(randomUUID, "notification");
                                    c.x = 6;
                                    c.y = str7;
                                    c.f();
                                    a = c.a();
                                } catch (java.io.IOException unused) {
                                }
                                if (a != null) {
                                    contact = a.a();
                                    if (contact == null) {
                                        return null;
                                    }
                                }
                            }
                            contact = null;
                            if (contact == null) {
                            }
                        }
                        s = contact.s();
                        if (!jj3.bar.h(s)) {
                            str7 = s;
                        }
                        j0Var.a = str7;
                        iVar.x = null;
                        iVar.y = null;
                        iVar.z = null;
                        iVar.A = f0Var;
                        iVar.B = j0Var;
                        iVar.C = null;
                        iVar.D = i3;
                        iVar.E = i6;
                        iVar.H = 3;
                        obj = missedCallsNotificationWorker2.g(contact, iVar);
                        j0Var3 = j0Var;
                        if (obj == barVar) {
                            return barVar;
                        }
                        str12 = (java.lang.String) obj;
                        if (str12 != null) {
                        }
                        f0Var.i((java.lang.CharSequence) j0Var3.a);
                        if (!qe0.i1.s()) {
                        }
                        return f0Var.d();
                    }
                    i4 = iVar.D;
                    f0Var3 = iVar.C;
                    com.truecaller.data.entity.Contact contact5 = iVar.B;
                    f0Var2 = iVar.A;
                    com.truecaller.data.entity.Contact contact6 = iVar.z;
                    str8 = iVar.y;
                    context3 = iVar.x;
                    od.p.E(obj);
                    quxVar2 = quxVar3;
                    hVar = hVar2;
                    str4 = "build(...)";
                    str6 = "notificationMissedCall";
                    contact2 = contact6;
                    z2 = true;
                } else {
                    od.p.E(obj);
                    android.content.Context applicationContext2 = missedCallsNotificationWorker2.getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                    java.lang.String string2 = applicationContext2.getString(2132018071);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    if (historyEvent != null) {
                        str = historyEvent.d;
                    } else {
                        str = null;
                    }
                    if (str == null || str.length() == 0) {
                        quxVar2 = quxVar3;
                        hVar = hVar2;
                        str2 = "notificationMissedCall";
                        context = applicationContext2;
                        str = string2;
                        contact = null;
                        pendingIntent = null;
                        pendingIntent2 = null;
                        pendingIntent3 = null;
                        i2 = 0;
                        str3 = null;
                    } else {
                        com.truecaller.data.entity.Contact contact7 = historyEvent.h;
                        if (contact7 == null || android.text.TextUtils.isEmpty(contact7.d0) || !contact7.Q()) {
                            str2 = "notificationMissedCall";
                            str9 = null;
                        } else {
                            java.lang.Long E = contact7.E();
                            if (E != null) {
                                j = E.longValue();
                            } else {
                                j = -1;
                            }
                            str2 = "notificationMissedCall";
                            str9 = android.provider.ContactsContract.Contacts.getLookupUri(j, contact7.d0).toString();
                        }
                        if (str9 == null) {
                            str9 = "tel:".concat(str);
                        }
                        if (missedCallsNotificationWorker2.m.b.a("featureNotificationCMB", com.truecaller.featuretoggles.FeatureState.DISABLED) && contact7 != null && i71.g.G(contact7)) {
                            com.truecaller.bizmon.callMeBack.db.entity.BizCallMeBackRecord bizCallMeBackRecord = (com.truecaller.bizmon.callMeBack.db.entity.BizCallMeBackRecord) missedCallsNotificationWorker2.n.a.getValue();
                            if (bizCallMeBackRecord != null) {
                                str10 = bizCallMeBackRecord.getBusinessNumber();
                            } else {
                                str10 = null;
                            }
                            i5 = kotlin.jvm.internal.Intrinsics.b(str10, str);
                        } else {
                            i5 = 0;
                        }
                        int i8 = com.truecaller.notifications.MissedCallsNotificationActionReceiver.l;
                        java.lang.Long l = historyEvent.i;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l, "getCallLogId(...)");
                        long longValue = l.longValue();
                        quxVar2 = quxVar3;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext2, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
                        hVar = hVar2;
                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                            int i9 = com.truecaller.notifications.support.NotificationTrampolineActivity.n0;
                            putExtra = p7.bar.d(applicationContext2, "notification", str, java.lang.Long.valueOf(longValue), (java.lang.String) null, 48);
                            context = applicationContext2;
                            contact3 = contact7;
                        } else {
                            context = applicationContext2;
                            contact3 = contact7;
                            putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.notifications.MissedCallsNotificationActionReceiver.class).setAction("com.truecaller.CALL").putExtra("number", str).putExtra("callLogId", longValue);
                            kotlin.jvm.internal.Intrinsics.d(putExtra);
                        }
                        android.app.PendingIntent e = missedCallsNotificationWorker2.e(putExtra, 2131366096, com.truecaller.analytics.common.event.PushNotificationAction.LeftButton);
                        if (i5 != 0) {
                            str3 = str9;
                            pendingIntent2 = null;
                            pendingIntent3 = missedCallsNotificationWorker2.k(historyEvent, str, true);
                            pendingIntent = e;
                            contact = contact3;
                            i2 = i5;
                        } else {
                            pendingIntent2 = missedCallsNotificationWorker2.k(historyEvent, str, false);
                            pendingIntent = e;
                            str3 = str9;
                            contact = contact3;
                            pendingIntent3 = null;
                            i2 = i5;
                        }
                    }
                    android.content.Intent action = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.notifications.MissedCallsNotificationActionReceiver.class).setAction("com.truecaller.CLEAR_MISSED_CALLS");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(action, "setAction(...)");
                    if (historyEvent != null) {
                        str4 = "build(...)";
                        str5 = str;
                        action.putExtra("lastTimestamp", historyEvent.j);
                    } else {
                        str4 = "build(...)";
                        str5 = str;
                    }
                    bo.p a2 = hVar.a();
                    a2.b = 2131366098;
                    a2.c = 335544320;
                    android.app.PendingIntent k = a2.k(com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), str2, action);
                    f6.f0 f = missedCallsNotificationWorker2.f();
                    android.app.Notification notification = f.Q;
                    f.k(4);
                    f.D = context.getColor(2131102024);
                    notification.icon = 2131232899;
                    str6 = str2;
                    f.l(16, true);
                    notification.deleteIntent = k;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "setDeleteIntent(...)");
                    if (historyEvent != null) {
                        long j2 = historyEvent.j;
                        if (j2 > 0) {
                            notification.when = j2;
                        }
                    }
                    if (pendingIntent != null) {
                        if (i2 != 0) {
                            string = context.getString(2132022103);
                        } else {
                            string = context.getString(2132022102);
                        }
                        kotlin.jvm.internal.Intrinsics.d(string);
                        f.a(2131232898, pendingIntent, string);
                    }
                    if (pendingIntent2 != null) {
                        f.a(2131232907, pendingIntent2, context.getString(2132022105));
                    }
                    if (pendingIntent3 != null) {
                        f.a(2131232898, pendingIntent3, context.getString(2132022104));
                    }
                    f.l = 1;
                    if (str3 != null) {
                        f.c(str3);
                    }
                    if (contact != null) {
                        iVar.x = context;
                        java.lang.String str16 = str5;
                        iVar.y = str16;
                        iVar.z = contact;
                        iVar.A = f;
                        iVar.B = null;
                        iVar.C = f;
                        iVar.D = i2;
                        iVar.E = 0;
                        z2 = true;
                        iVar.H = 1;
                        missedCallsNotificationWorker2 = missedCallsNotificationWorker;
                        android.content.Context context4 = missedCallsNotificationWorker2.a;
                        context4.setTheme(2132084053);
                        k41.baz bazVar = new k41.baz(context4, missedCallsNotificationWorker2.c, 2131166670);
                        bazVar.C2(gf0.e.q(contact, false, false, 31), false);
                        java.lang.Object F2 = k41.baz.F2(bazVar, iVar);
                        if (F2 != barVar) {
                            contact2 = contact;
                            context3 = context;
                            f0Var2 = f;
                            obj = F2;
                            str8 = str16;
                            f0Var3 = f0Var2;
                            i4 = i2;
                        } else {
                            return barVar;
                        }
                    } else {
                        z = true;
                        missedCallsNotificationWorker2 = missedCallsNotificationWorker;
                        context2 = context;
                        str7 = str5;
                        f0Var = f;
                        i3 = i2;
                        ?? obj2 = new java.lang.Object();
                        if (contact == null && jj3.bar.j(contact.s())) {
                            str11 = contact.s();
                        } else {
                            str11 = str7;
                        }
                        ((kotlin.jvm.internal.j0) obj2).a = str11;
                        sw0.qux quxVar4 = quxVar2;
                        ?? r132 = quxVar4.b() ? z : 0;
                        bo.p a3 = hVar.a();
                        a3.b = 2131366100;
                        a3.c = 335544320;
                        int i10 = com.truecaller.notifications.MissedCallsNotificationActionReceiver.l;
                        android.content.Intent v = ap1.d.v(context2, (boolean) r132);
                        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource2 = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                        android.app.PendingIntent e2 = a3.e(pushNotificationSource2.getType(), "missedCallNotification", v);
                        f0Var.j(context2.getString(2132022106));
                        f0Var.i((java.lang.CharSequence) ((kotlin.jvm.internal.j0) obj2).a);
                        f0Var.g = e2;
                        if (!qe0.i1.s()) {
                            android.app.Notification d2 = f0Var.d();
                            str13 = str4;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d2, str13);
                            iVar.x = context2;
                            iVar.y = str7;
                            iVar.z = contact;
                            iVar.A = f0Var;
                            iVar.B = obj2;
                            iVar.C = null;
                            iVar.D = i3;
                            iVar.E = r132;
                            iVar.H = 2;
                            str14 = str6;
                            if (missedCallsNotificationWorker2.j(d2, str14, pushNotificationSource2, iVar) != barVar) {
                                i6 = r132;
                                contact4 = contact;
                                j0Var2 = obj2;
                                contact = contact4;
                                j0Var = j0Var2;
                                if (contact == null) {
                                }
                                s = contact.s();
                                if (!jj3.bar.h(s)) {
                                }
                                j0Var.a = str7;
                                iVar.x = null;
                                iVar.y = null;
                                iVar.z = null;
                                iVar.A = f0Var;
                                iVar.B = j0Var;
                                iVar.C = null;
                                iVar.D = i3;
                                iVar.E = i6;
                                iVar.H = 3;
                                obj = missedCallsNotificationWorker2.g(contact, iVar);
                                j0Var3 = j0Var;
                                if (obj == barVar) {
                                }
                                str12 = (java.lang.String) obj;
                                if (str12 != null) {
                                }
                                f0Var.i((java.lang.CharSequence) j0Var3.a);
                                if (!qe0.i1.s()) {
                                }
                                return f0Var.d();
                            }
                            return barVar;
                        }
                        str13 = str4;
                        str14 = str6;
                        i6 = r132;
                        j0Var = obj2;
                        if (contact == null) {
                        }
                        s = contact.s();
                        if (!jj3.bar.h(s)) {
                        }
                        j0Var.a = str7;
                        iVar.x = null;
                        iVar.y = null;
                        iVar.z = null;
                        iVar.A = f0Var;
                        iVar.B = j0Var;
                        iVar.C = null;
                        iVar.D = i3;
                        iVar.E = i6;
                        iVar.H = 3;
                        obj = missedCallsNotificationWorker2.g(contact, iVar);
                        j0Var3 = j0Var;
                        if (obj == barVar) {
                        }
                        str12 = (java.lang.String) obj;
                        if (str12 != null) {
                        }
                        f0Var.i((java.lang.CharSequence) j0Var3.a);
                        if (!qe0.i1.s()) {
                        }
                        return f0Var.d();
                    }
                }
                f0Var3.m((android.graphics.Bitmap) obj);
                contact = contact2;
                str7 = str8;
                f0Var = f0Var2;
                context2 = context3;
                i3 = i4;
                z = z2;
                ?? obj22 = new java.lang.Object();
                if (contact == null) {
                }
                str11 = str7;
                ((kotlin.jvm.internal.j0) obj22).a = str11;
                sw0.qux quxVar42 = quxVar2;
                if (quxVar42.b()) {
                }
                bo.p a32 = hVar.a();
                a32.b = 2131366100;
                a32.c = 335544320;
                int i102 = com.truecaller.notifications.MissedCallsNotificationActionReceiver.l;
                android.content.Intent v2 = ap1.d.v(context2, (boolean) r132);
                com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource22 = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                android.app.PendingIntent e22 = a32.e(pushNotificationSource22.getType(), "missedCallNotification", v2);
                f0Var.j(context2.getString(2132022106));
                f0Var.i((java.lang.CharSequence) ((kotlin.jvm.internal.j0) obj22).a);
                f0Var.g = e22;
                if (!qe0.i1.s()) {
                }
            }
        }
        iVar = new dq2.i(missedCallsNotificationWorker2, quxVar);
        java.lang.Object obj3 = iVar.F;
        ef3.bar barVar2 = ef3.bar.a;
        i = iVar.H;
        java.lang.String str132 = "build(...)";
        java.lang.String str142 = "notificationMissedCall";
        if (i == 0) {
        }
        f0Var3.m((android.graphics.Bitmap) obj3);
        contact = contact2;
        str7 = str8;
        f0Var = f0Var2;
        context2 = context3;
        i3 = i4;
        z = z2;
        ?? obj222 = new java.lang.Object();
        if (contact == null) {
        }
        str11 = str7;
        ((kotlin.jvm.internal.j0) obj222).a = str11;
        sw0.qux quxVar422 = quxVar2;
        if (quxVar422.b()) {
        }
        bo.p a322 = hVar.a();
        a322.b = 2131366100;
        a322.c = 335544320;
        int i1022 = com.truecaller.notifications.MissedCallsNotificationActionReceiver.l;
        android.content.Intent v22 = ap1.d.v(context2, (boolean) r132);
        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource222 = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
        android.app.PendingIntent e222 = a322.e(pushNotificationSource222.getType(), "missedCallNotification", v22);
        f0Var.j(context2.getString(2132022106));
        f0Var.i((java.lang.CharSequence) ((kotlin.jvm.internal.j0) obj222).a);
        f0Var.g = e222;
        if (!qe0.i1.s()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(com.truecaller.qa.QMActivity qMActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qMActivity, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.service.MissedCallsNotificationWorker.class, "workerClass");
        nd.y d = new f6.v0(com.truecaller.service.MissedCallsNotificationWorker.class).d();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qMActivity, "context");
        od.n k = od.n.k(qMActivity);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k, "getInstance(...)");
        k.g("javaClass", nd.l.b, d);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        dq2.d dVar;
        int i;
        if (barVar instanceof dq2.d) {
            dVar = (dq2.d) barVar;
            int i2 = dVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = dVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = dVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    bu1.e eVar = new bu1.e(this, (df3.bar) null, 8);
                    dVar.z = 1;
                    obj = fg3.h0.W(this.d, eVar, dVar);
                    if (obj == barVar2) {
                        return barVar2;
                    }
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        dVar = new dq2.d(this, (ff3.qux) barVar);
        java.lang.Object obj2 = dVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = dVar.z;
        if (i == 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }

    public final android.app.PendingIntent e(android.content.Intent intent, int i, com.truecaller.analytics.common.event.PushNotificationAction pushNotificationAction) {
        int type = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType();
        int i2 = android.os.Build.VERSION.SDK_INT;
        s62.h hVar = this.g;
        if (i2 >= 31) {
            bo.p a = hVar.a();
            a.b = i;
            a.c = 335544320;
            a.e = java.lang.Integer.valueOf(pushNotificationAction.getType());
            return a.e(type, "missedCallNotification", intent);
        }
        bo.p a2 = hVar.a();
        a2.b = i;
        a2.c = 335544320;
        a2.e = java.lang.Integer.valueOf(pushNotificationAction.getType());
        return a2.i(type, "missedCallNotification", intent);
    }

    public final f6.f0 f() {
        return new f6.f0(this.a, this.f.o("missed_calls"));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object g(com.truecaller.data.entity.Contact contact, ff3.qux quxVar) {
        dq2.e eVar;
        int i;
        java.lang.String str;
        if (quxVar instanceof dq2.e) {
            eVar = (dq2.e) quxVar;
            int i2 = eVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = eVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = eVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (contact == null || !i71.g.G(contact) || (str = contact.H) == null) {
                        return null;
                    }
                    cv0.bar barVar2 = new cv0.bar(this, str, (df3.bar) null, 9);
                    eVar.z = 1;
                    obj = fg3.h0.W(this.d, barVar2, eVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                return (java.lang.String) obj;
            }
        }
        eVar = new dq2.e(this, quxVar);
        java.lang.Object obj2 = eVar.x;
        ef3.bar barVar3 = ef3.bar.a;
        i = eVar.z;
        if (i == 0) {
        }
        return (java.lang.String) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object h(com.truecaller.data.entity.Contact contact, ff3.qux quxVar) {
        dq2.g gVar;
        java.lang.Object obj;
        int i;
        if (quxVar instanceof dq2.g) {
            gVar = (dq2.g) quxVar;
            int i2 = gVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.A = i2 - Integer.MIN_VALUE;
                obj = gVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = gVar.A;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        contact = gVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (!this.m.b.a("featureBizMissedCallNotification", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                        return java.lang.Boolean.FALSE;
                    }
                    gVar.x = contact;
                    gVar.A = 1;
                    obj = ef0.a.z(this.h.d(), hw0.q.t, true, gVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return java.lang.Boolean.FALSE;
                }
                if (contact == null) {
                    return java.lang.Boolean.FALSE;
                }
                if (!i71.g.G(contact) && !contact.V()) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }
        gVar = new dq2.g(this, quxVar);
        obj = gVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = gVar.A;
        boolean z2 = true;
        if (i == 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    public final java.lang.Object j(android.app.Notification notification, java.lang.String str, com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource, ff3.qux quxVar) {
        java.lang.Object W = fg3.h0.W(this.b, new c12.d(this, pushNotificationSource, notification, str, (df3.bar) null, 4), quxVar);
        if (W == ef3.bar.a) {
            return W;
        }
        return kotlin.Unit.a;
    }

    public final android.app.PendingIntent k(com.truecaller.data.entity.HistoryEvent historyEvent, java.lang.String str, boolean z) {
        android.content.Intent putExtra;
        int i;
        android.content.Context context = this.a;
        if (z) {
            int i2 = com.truecaller.notifications.MissedCallsNotificationActionReceiver.l;
            java.lang.Long l = historyEvent.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l, "getCallLogId(...)");
            long longValue = l.longValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                int i3 = com.truecaller.notifications.support.NotificationTrampolineActivity.n0;
                java.lang.Long valueOf = java.lang.Long.valueOf(longValue);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
                putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.notifications.support.NotificationTrampolineActivity.class).putExtra("notification-name", "com.truecaller.intent.action.BIZ_CALL_ME_BACK").putExtra("notification-type", "Opened").putExtra("number", str).putExtra("call-log-id", valueOf);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            } else {
                putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.notifications.MissedCallsNotificationActionReceiver.class).setAction("com.truecaller.BIZ_CALL_ME_BACK").putExtra("number", str).putExtra("callLogId", longValue);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            }
            i = 2131366097;
        } else {
            int i4 = com.truecaller.notifications.MissedCallsNotificationActionReceiver.l;
            java.lang.Long l2 = historyEvent.i;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l2, "getCallLogId(...)");
            long longValue2 = l2.longValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                int i5 = com.truecaller.notifications.support.NotificationTrampolineActivity.n0;
                java.lang.Long valueOf2 = java.lang.Long.valueOf(longValue2);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
                putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.notifications.support.NotificationTrampolineActivity.class).putExtra("notification-name", "com.truecaller.intent.action.SMS").putExtra("number", str).putExtra("call-log-id", valueOf2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            } else {
                putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.notifications.MissedCallsNotificationActionReceiver.class).setAction("com.truecaller.SMS").putExtra("number", str).putExtra("callLogId", longValue2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            }
            i = 2131366102;
        }
        return e(putExtra, i, com.truecaller.analytics.common.event.PushNotificationAction.RightButton);
    }
}
