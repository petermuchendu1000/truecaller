package com.truecaller.premium.contactrequest;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B]\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/truecaller/premium/contactrequest/ContactRequestNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Ls62/d;", "notificationManager", "Lt71/g;", "contactRequestEventHandler", "Li82/l;", "premiumContactUtil", "Lo71/bar;", "contactRequestAnalytics", "Lnc0/bar;", "analytics", "Lac2/bar;", "contactRequestFlowObserver", "Lqo1/o;", "premiumFeaturesInventory", "Lnd1/bar;", "detailsViewIntentBuilder", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ls62/d;Lt71/g;Li82/l;Lo71/bar;Lnc0/bar;Lac2/bar;Lqo1/o;Lnd1/bar;)V", "v82/bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes4.dex */
public final class ContactRequestNotificationWorker extends androidx.work.CoroutineWorker {
    public final android.content.Context a;
    public final s62.d b;
    public final t71.g c;
    public final i82.l d;
    public final o71.bar e;
    public final nc0.bar f;
    public final ac2.bar g;
    public final qo1.o h;
    public final nd1.bar i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactRequestNotificationWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull s62.d dVar, @org.jetbrains.annotations.NotNull t71.g gVar, @org.jetbrains.annotations.NotNull i82.l lVar, @org.jetbrains.annotations.NotNull o71.bar barVar, @org.jetbrains.annotations.NotNull nc0.bar barVar2, @org.jetbrains.annotations.NotNull ac2.bar barVar3, @org.jetbrains.annotations.NotNull qo1.o oVar, @org.jetbrains.annotations.NotNull nd1.bar barVar4) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "notificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "contactRequestEventHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "premiumContactUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "contactRequestAnalytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "contactRequestFlowObserver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "premiumFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "detailsViewIntentBuilder");
        this.a = context;
        this.b = dVar;
        this.c = gVar;
        this.d = lVar;
        this.e = barVar;
        this.f = barVar2;
        this.g = barVar3;
        this.h = oVar;
        this.i = barVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.truecaller.network.notification.NotificationType notificationType, java.lang.String str, java.lang.String str2, java.lang.String str3, ff3.qux quxVar) {
        v82.a aVar;
        int i;
        t71.f fVar;
        java.lang.String str4;
        if (quxVar instanceof v82.a) {
            aVar = (v82.a) quxVar;
            int i2 = aVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = aVar.z;
                wi.v vVar = this.d;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    int i3 = v82.baz.a[notificationType.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3 && str != null) {
                                return vVar.t(str);
                            }
                            return null;
                        }
                        aVar.z = 1;
                        obj = ((t71.d) this.c.b).d(str3, aVar);
                        if (obj == barVar) {
                            return barVar;
                        }
                    } else {
                        if (str2 != null) {
                            return vVar.u(str2);
                        }
                        return null;
                    }
                }
                fVar = (t71.f) obj;
                if (fVar == null && (str4 = fVar.c) != null) {
                    return vVar.u(str4);
                }
            }
        }
        aVar = new v82.a(this, quxVar);
        java.lang.Object obj2 = aVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = aVar.z;
        wi.v vVar2 = this.d;
        if (i == 0) {
        }
        fVar = (t71.f) obj2;
        return fVar == null ? null : null;
    }

    public final java.lang.Object b(v82.bar barVar, v82.qux quxVar) {
        java.lang.String string;
        java.lang.String str;
        boolean z = barVar.g;
        com.truecaller.data.entity.Contact contact = barVar.d;
        if (!z && contact == null) {
            return kotlin.Unit.a;
        }
        int i = v82.baz.a[barVar.e.ordinal()];
        nc0.bar barVar2 = this.f;
        android.content.Context context = this.a;
        s62.f fVar = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (contact == null || (string = contact.t()) == null) {
                        string = context.getString(2132019071);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    }
                    java.lang.String string2 = context.getString(2132018420, string);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    f6.k1 k1Var = new f6.k1(getApplicationContext());
                    android.content.Context applicationContext = getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    android.content.Intent o = y90.m6.o(applicationContext, (com.truecaller.bottombar.BottomBarButtonType) null, "notificationContactRequestAccept", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 122);
                    java.util.ArrayList arrayList = k1Var.a;
                    arrayList.add(o);
                    android.content.Context applicationContext2 = getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                    com.truecaller.data.entity.Contact contact2 = barVar.d;
                    if (contact2 != null) {
                        str = contact2.I;
                    } else {
                        str = null;
                    }
                    arrayList.add(this.i.a(applicationContext2, new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Extras(new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.ContactData((java.lang.String) null, str, barVar.c, (java.lang.String) null, contact2, (com.truecaller.data.entity.HistoryEvent) null, 41, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.truecaller.detailsview.api.model.DetailsViewSource.NotificationContactRequestAccept, (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.HistoryEventData) null, 4, (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action) null, 20, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var, "addNextIntent(...)");
                    com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                    s62.f fVar2 = fVar;
                    android.app.PendingIntent l = fVar2.l(this.a, k1Var, pushNotificationSource.getType(), "ContactRequestAcceptedNotification", 0, 201326592);
                    f6.f0 f0Var = new f6.f0(getApplicationContext(), fVar2.o("miscellaneous_channel"));
                    f0Var.e = f6.f0.e(context.getString(2132018421));
                    f0Var.f = f6.f0.e(string2);
                    f6.y yVar = new f6.y(0);
                    yVar.f = f6.f0.e(string2);
                    f0Var.t(yVar);
                    f0Var.m(android.graphics.BitmapFactory.decodeResource(context.getResources(), 2131232912));
                    f0Var.D = getApplicationContext().getColor(2131102024);
                    f0Var.k(-1);
                    f0Var.Q.icon = 2131232902;
                    f0Var.g = l;
                    f0Var.l(16, true);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var, "setAutoCancel(...)");
                    android.app.Notification d = f0Var.d();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
                    fVar2.v(2131363140, d, pushNotificationSource.getType(), "ContactRequestAcceptedNotification");
                    bd.bar.u(barVar2, "notificationContactRequestAccept", "notification");
                }
            } else {
                java.lang.Object d2 = d(barVar, quxVar);
                if (d2 == ef3.bar.a) {
                    return d2;
                }
                return kotlin.Unit.a;
            }
        } else {
            java.lang.String string3 = context.getString(2132018422);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            f6.k1 k1Var2 = new f6.k1(getApplicationContext());
            android.content.Context applicationContext3 = getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
            android.content.Intent o2 = y90.m6.o(applicationContext3, (com.truecaller.bottombar.BottomBarButtonType) null, "notificationContactRequest", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 122);
            java.util.ArrayList arrayList2 = k1Var2.a;
            arrayList2.add(o2);
            int i2 = com.truecaller.contactrequest.tabscontainer.ContactRequestActivity.g0;
            android.content.Context applicationContext4 = getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext4, "getApplicationContext(...)");
            arrayList2.add(bf0.s2.v(applicationContext4, "notificationContactRequest"));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var2, "addNextIntent(...)");
            com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource2 = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
            s62.f fVar3 = fVar;
            android.app.PendingIntent l2 = fVar3.l(this.a, k1Var2, pushNotificationSource2.getType(), "ContactRequestNotification", 0, 201326592);
            f6.f0 f0Var2 = new f6.f0(getApplicationContext(), fVar3.o("miscellaneous_channel"));
            f0Var2.e = f6.f0.e(context.getString(2132018423));
            f0Var2.f = f6.f0.e(string3);
            f6.y yVar2 = new f6.y(0);
            yVar2.f = f6.f0.e(string3);
            f0Var2.t(yVar2);
            f0Var2.m(android.graphics.BitmapFactory.decodeResource(context.getResources(), 2131232912));
            f0Var2.D = getApplicationContext().getColor(2131102024);
            f0Var2.k(-1);
            f0Var2.Q.icon = 2131232902;
            f0Var2.g = l2;
            f0Var2.l(16, true);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var2, "setAutoCancel(...)");
            android.app.Notification d3 = f0Var2.d();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d3, "build(...)");
            fVar3.v(2131363140, d3, pushNotificationSource2.getType(), "ContactRequestNotification");
            bd.bar.u(barVar2, "notificationContactRequest", "notification");
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r10.v(r5, r1, r7, r8, r9) == r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        if (r10.v(r1, r6, (java.lang.String) null, (java.lang.String) null, r9) == r3) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        if (r1 == r3) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(v82.bar barVar, ff3.qux quxVar) {
        v82.b bVar;
        int i;
        if (quxVar instanceof v82.b) {
            bVar = (v82.b) quxVar;
            int i2 = bVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.z = i2 - Integer.MIN_VALUE;
                v82.b bVar2 = bVar;
                java.lang.Object obj = bVar2.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = bVar2.z;
                if (i == 0) {
                    if (i != 1 && i != 2 && i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    boolean z = barVar.g;
                    java.lang.String str = barVar.b;
                    com.truecaller.data.entity.Contact contact = barVar.d;
                    if (!z && contact != null) {
                        int i3 = v82.baz.a[barVar.e.ordinal()];
                        po1.baz bazVar = this.c;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    java.lang.String str2 = barVar.a;
                                    if (str == null) {
                                        str = contact.H;
                                    }
                                    java.lang.String str3 = str;
                                    java.lang.String str4 = contact.I;
                                    com.truecaller.contactrequest.persistence.ContactRequestStatus contactRequestStatus = com.truecaller.contactrequest.persistence.ContactRequestStatus.ACCEPTED;
                                    bVar2.z = 2;
                                }
                            } else {
                                java.lang.String str5 = barVar.a;
                                com.truecaller.contactrequest.persistence.ContactRequestStatus contactRequestStatus2 = com.truecaller.contactrequest.persistence.ContactRequestStatus.REJECTED;
                                bVar2.z = 3;
                            }
                        } else if (str != null || (str = contact.H) != null) {
                            java.lang.String str6 = str;
                            java.lang.String str7 = barVar.a;
                            java.lang.String str8 = barVar.c;
                            java.lang.String str9 = contact.I;
                            long j = barVar.f;
                            bVar2.z = 1;
                            java.lang.Object e = ((t71.d) bazVar.b).e(new t71.f(str7, com.truecaller.contactrequest.persistence.ContactRequestEntryType.RECEIVED, str6, str9, str8, j, com.truecaller.contactrequest.persistence.ContactRequestStatus.PENDING), bVar2);
                            if (e != barVar2) {
                                e = kotlin.Unit.a;
                            }
                        }
                    }
                }
                return kotlin.Unit.a;
            }
        }
        bVar = new v82.b(this, quxVar);
        v82.b bVar22 = bVar;
        java.lang.Object obj2 = bVar22.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = bVar22.z;
        if (i == 0) {
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(v82.bar barVar, ff3.qux quxVar) {
        v82.c cVar;
        int i;
        t71.f fVar;
        com.truecaller.data.entity.Contact contact;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.truecaller.data.entity.Contact contact2;
        v82.bar barVar2 = barVar;
        if (quxVar instanceof v82.c) {
            cVar = (v82.c) quxVar;
            int i2 = cVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = cVar.y;
                ef3.bar barVar3 = ef3.bar.a;
                i = cVar.A;
                if (i == 0) {
                    if (i == 1) {
                        barVar2 = cVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.lang.String str4 = barVar2.a;
                    cVar.x = barVar2;
                    cVar.A = 1;
                    obj = ((t71.d) this.c.b).d(str4, cVar);
                    if (obj == barVar3) {
                        return barVar3;
                    }
                }
                fVar = (t71.f) obj;
                contact = barVar2.d;
                java.lang.String str5 = null;
                if (contact != null || (str = contact.I) == null) {
                    if (fVar == null) {
                        str = fVar.d;
                    } else {
                        str = null;
                    }
                    if (str != null || str.length() == 0) {
                        str2 = null;
                        android.content.Context context = this.a;
                        if (str2 == null) {
                            str3 = context.getString(2132019071);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "getString(...)");
                        } else {
                            str3 = str2;
                        }
                        java.lang.String string = context.getString(2132018424, str3);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        f6.k1 k1Var = new f6.k1(getApplicationContext());
                        android.content.Context applicationContext = getApplicationContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        android.content.Intent o = y90.m6.o(applicationContext, (com.truecaller.bottombar.BottomBarButtonType) null, "notificationContactRequestRejected", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 122);
                        java.util.ArrayList arrayList = k1Var.a;
                        arrayList.add(o);
                        android.content.Context applicationContext2 = getApplicationContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                        contact2 = barVar2.d;
                        if (contact2 != null) {
                            str5 = contact2.H;
                        }
                        arrayList.add(this.i.a(applicationContext2, new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Extras(new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.ContactData(str5, str2, (java.lang.String) null, (java.lang.String) null, (com.truecaller.data.entity.Contact) null, (com.truecaller.data.entity.HistoryEvent) null, 60, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.truecaller.detailsview.api.model.DetailsViewSource.NotificationContactRequestRejected, (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.HistoryEventData) null, 999, (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action) null, 20, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var, "addNextIntent(...)");
                        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                        int type = pushNotificationSource.getType();
                        s62.f fVar2 = this.b;
                        android.app.PendingIntent l = fVar2.l(this.a, k1Var, type, "ContactRequestRejectedNotification", 0, 201326592);
                        f6.f0 f0Var = new f6.f0(getApplicationContext(), fVar2.o("miscellaneous_channel"));
                        f0Var.e = f6.f0.e(context.getString(2132018425));
                        f0Var.f = f6.f0.e(string);
                        f6.y yVar = new f6.y(0);
                        yVar.f = f6.f0.e(string);
                        f0Var.t(yVar);
                        f0Var.m(android.graphics.BitmapFactory.decodeResource(context.getResources(), 2131232912));
                        f0Var.D = getApplicationContext().getColor(2131102024);
                        f0Var.k(-1);
                        f0Var.Q.icon = 2131232902;
                        f0Var.g = l;
                        f0Var.l(16, true);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var, "setAutoCancel(...)");
                        android.app.Notification d = f0Var.d();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
                        fVar2.v(2131363140, d, pushNotificationSource.getType(), "ContactRequestRejectedNotification");
                        bd.bar.u(this.f, "notificationContactRequestRejected", "notification");
                        return kotlin.Unit.a;
                    }
                }
                str2 = str;
                android.content.Context context2 = this.a;
                if (str2 == null) {
                }
                java.lang.String string2 = context2.getString(2132018424, str3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                f6.k1 k1Var2 = new f6.k1(getApplicationContext());
                android.content.Context applicationContext3 = getApplicationContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                android.content.Intent o2 = y90.m6.o(applicationContext3, (com.truecaller.bottombar.BottomBarButtonType) null, "notificationContactRequestRejected", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 122);
                java.util.ArrayList arrayList2 = k1Var2.a;
                arrayList2.add(o2);
                android.content.Context applicationContext22 = getApplicationContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext22, "getApplicationContext(...)");
                contact2 = barVar2.d;
                if (contact2 != null) {
                }
                arrayList2.add(this.i.a(applicationContext22, new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Extras(new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.ContactData(str5, str2, (java.lang.String) null, (java.lang.String) null, (com.truecaller.data.entity.Contact) null, (com.truecaller.data.entity.HistoryEvent) null, 60, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.truecaller.detailsview.api.model.DetailsViewSource.NotificationContactRequestRejected, (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.HistoryEventData) null, 999, (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action) null, 20, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var2, "addNextIntent(...)");
                com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource2 = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                int type2 = pushNotificationSource2.getType();
                s62.f fVar22 = this.b;
                android.app.PendingIntent l2 = fVar22.l(this.a, k1Var2, type2, "ContactRequestRejectedNotification", 0, 201326592);
                f6.f0 f0Var2 = new f6.f0(getApplicationContext(), fVar22.o("miscellaneous_channel"));
                f0Var2.e = f6.f0.e(context2.getString(2132018425));
                f0Var2.f = f6.f0.e(string2);
                f6.y yVar2 = new f6.y(0);
                yVar2.f = f6.f0.e(string2);
                f0Var2.t(yVar2);
                f0Var2.m(android.graphics.BitmapFactory.decodeResource(context2.getResources(), 2131232912));
                f0Var2.D = getApplicationContext().getColor(2131102024);
                f0Var2.k(-1);
                f0Var2.Q.icon = 2131232902;
                f0Var2.g = l2;
                f0Var2.l(16, true);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var2, "setAutoCancel(...)");
                android.app.Notification d2 = f0Var2.d();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
                fVar22.v(2131363140, d2, pushNotificationSource2.getType(), "ContactRequestRejectedNotification");
                bd.bar.u(this.f, "notificationContactRequestRejected", "notification");
                return kotlin.Unit.a;
            }
        }
        cVar = new v82.c(this, quxVar);
        java.lang.Object obj2 = cVar.y;
        ef3.bar barVar32 = ef3.bar.a;
        i = cVar.A;
        if (i == 0) {
        }
        fVar = (t71.f) obj2;
        contact = barVar2.d;
        java.lang.String str52 = null;
        if (contact != null) {
        }
        if (fVar == null) {
        }
        if (str != null) {
        }
        str2 = null;
        android.content.Context context22 = this.a;
        if (str2 == null) {
        }
        java.lang.String string22 = context22.getString(2132018424, str3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
        f6.k1 k1Var22 = new f6.k1(getApplicationContext());
        android.content.Context applicationContext32 = getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext32, "getApplicationContext(...)");
        android.content.Intent o22 = y90.m6.o(applicationContext32, (com.truecaller.bottombar.BottomBarButtonType) null, "notificationContactRequestRejected", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 122);
        java.util.ArrayList arrayList22 = k1Var22.a;
        arrayList22.add(o22);
        android.content.Context applicationContext222 = getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext222, "getApplicationContext(...)");
        contact2 = barVar2.d;
        if (contact2 != null) {
        }
        arrayList22.add(this.i.a(applicationContext222, new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Extras(new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.ContactData(str52, str2, (java.lang.String) null, (java.lang.String) null, (com.truecaller.data.entity.Contact) null, (com.truecaller.data.entity.HistoryEvent) null, 60, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.truecaller.detailsview.api.model.DetailsViewSource.NotificationContactRequestRejected, (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.HistoryEventData) null, 999, (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action) null, 20, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var22, "addNextIntent(...)");
        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource22 = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
        int type22 = pushNotificationSource22.getType();
        s62.f fVar222 = this.b;
        android.app.PendingIntent l22 = fVar222.l(this.a, k1Var22, type22, "ContactRequestRejectedNotification", 0, 201326592);
        f6.f0 f0Var22 = new f6.f0(getApplicationContext(), fVar222.o("miscellaneous_channel"));
        f0Var22.e = f6.f0.e(context22.getString(2132018425));
        f0Var22.f = f6.f0.e(string22);
        f6.y yVar22 = new f6.y(0);
        yVar22.f = f6.f0.e(string22);
        f0Var22.t(yVar22);
        f0Var22.m(android.graphics.BitmapFactory.decodeResource(context22.getResources(), 2131232912));
        f0Var22.D = getApplicationContext().getColor(2131102024);
        f0Var22.k(-1);
        f0Var22.Q.icon = 2131232902;
        f0Var22.g = l22;
        f0Var22.l(16, true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var22, "setAutoCancel(...)");
        android.app.Notification d22 = f0Var22.d();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d22, "build(...)");
        fVar222.v(2131363140, d22, pushNotificationSource22.getType(), "ContactRequestRejectedNotification");
        bd.bar.u(this.f, "notificationContactRequestRejected", "notification");
        return kotlin.Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0191, code lost:
    
        if (r2 == r6) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0152 A[Catch: Exception -> 0x01a9, TryCatch #0 {Exception -> 0x01a9, blocks: (B:14:0x0035, B:15:0x0194, B:21:0x004c, B:22:0x013d, B:24:0x0141, B:27:0x0146, B:29:0x0152, B:30:0x0164, B:32:0x016e, B:38:0x005b, B:39:0x011d, B:44:0x006a, B:46:0x00e4, B:51:0x0079, B:53:0x0085, B:56:0x008d, B:60:0x019e), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016e A[Catch: Exception -> 0x01a9, TryCatch #0 {Exception -> 0x01a9, blocks: (B:14:0x0035, B:15:0x0194, B:21:0x004c, B:22:0x013d, B:24:0x0141, B:27:0x0146, B:29:0x0152, B:30:0x0164, B:32:0x016e, B:38:0x005b, B:39:0x011d, B:44:0x006a, B:46:0x00e4, B:51:0x0079, B:53:0x0085, B:56:0x008d, B:60:0x019e), top: B:8:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        v82.qux quxVar;
        v82.qux quxVar2;
        java.lang.Object obj;
        int i;
        com.truecaller.network.notification.NotificationType notificationType;
        java.lang.String str;
        long j;
        java.lang.String str2;
        java.lang.String str3;
        v82.bar barVar2;
        long j2;
        v82.bar barVar3;
        v82.bar barVar4;
        int i2;
        boolean z;
        v82.bar barVar5;
        long j3;
        try {
            if (barVar instanceof v82.qux) {
                quxVar = (v82.qux) barVar;
                int i3 = quxVar.I;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    quxVar.I = i3 - Integer.MIN_VALUE;
                    quxVar2 = quxVar;
                    java.lang.Object obj2 = quxVar2.G;
                    obj = ef3.bar.a;
                    i = quxVar2.I;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4) {
                                        od.p.E(obj2);
                                        nd.s a = nd.t.a();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                                        return a;
                                    }
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                i2 = quxVar2.F;
                                z = quxVar2.E;
                                j3 = quxVar2.D;
                                barVar3 = quxVar2.C;
                                barVar5 = quxVar2.B;
                                od.p.E(obj2);
                                if (!barVar3.g && barVar3.d != null) {
                                    if (v82.baz.a[barVar3.e.ordinal()] == 1) {
                                        this.e.a.d(new hg0.a(com.truecaller.analytics.common.event.ContactRequestEvent.Action.RECEIVED));
                                    }
                                }
                                if (this.h.a()) {
                                    ac2.baz bazVar = this.g;
                                    quxVar2.x = null;
                                    quxVar2.y = null;
                                    quxVar2.z = null;
                                    quxVar2.A = null;
                                    quxVar2.B = barVar5;
                                    quxVar2.C = null;
                                    quxVar2.D = j3;
                                    quxVar2.E = z;
                                    quxVar2.F = i2;
                                    quxVar2.I = 4;
                                    ig3.v1 v1Var = bazVar.a;
                                    java.lang.Object obj3 = kotlin.Unit.a;
                                    java.lang.Object emit = v1Var.emit(obj3, quxVar2);
                                    if (emit == obj) {
                                        obj3 = emit;
                                    }
                                }
                                nd.s a2 = nd.t.a();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                                return a2;
                            }
                            i2 = quxVar2.F;
                            z = quxVar2.E;
                            j2 = quxVar2.D;
                            barVar3 = quxVar2.C;
                            barVar4 = quxVar2.B;
                            od.p.E(obj2);
                            quxVar2.x = null;
                            quxVar2.y = null;
                            quxVar2.z = null;
                            quxVar2.A = null;
                            quxVar2.B = barVar4;
                            quxVar2.C = barVar3;
                            quxVar2.D = j2;
                            quxVar2.E = z;
                            quxVar2.F = i2;
                            quxVar2.I = 3;
                            if (b(barVar3, quxVar2) == obj) {
                                long j4 = j2;
                                barVar5 = barVar4;
                                j3 = j4;
                                if (!barVar3.g) {
                                    if (v82.baz.a[barVar3.e.ordinal()] == 1) {
                                    }
                                }
                                if (this.h.a()) {
                                }
                                nd.s a22 = nd.t.a();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a22, "success(...)");
                                return a22;
                            }
                            return obj;
                        }
                        long j5 = quxVar2.D;
                        java.lang.String str4 = quxVar2.A;
                        java.lang.String str5 = quxVar2.z;
                        com.truecaller.network.notification.NotificationType notificationType2 = quxVar2.y;
                        java.lang.String str6 = quxVar2.x;
                        od.p.E(obj2);
                        j = j5;
                        str = str5;
                        notificationType = notificationType2;
                        str3 = str6;
                        str2 = str4;
                    } else {
                        od.p.E(obj2);
                        java.lang.String e = getInputData().e("EXTRA_MEMBER_TRANSACTION_ID");
                        if (e != null && e.length() != 0) {
                            com.truecaller.network.notification.NotificationType valueOf = com.truecaller.network.notification.NotificationType.valueOf(getInputData().b("EXTRA_NOTIFICATION_TYPE", -1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "let(...)");
                            java.lang.String e2 = getInputData().e("EXTRA_PHONE_NUMBER");
                            java.lang.String e3 = getInputData().e("EXTRA_TCID");
                            long d = getInputData().d("EXTRA_NOTIFICATION_TIMESTAMP", new org.joda.time.DateTime().i());
                            quxVar2.x = e;
                            quxVar2.y = valueOf;
                            quxVar2.z = e2;
                            quxVar2.A = e3;
                            quxVar2.D = d;
                            quxVar2.I = 1;
                            java.lang.Object a3 = a(valueOf, e2, e3, e, quxVar2);
                            if (a3 != obj) {
                                notificationType = valueOf;
                                str = e2;
                                j = d;
                                obj2 = a3;
                                str2 = e3;
                                str3 = e;
                            } else {
                                return obj;
                            }
                        }
                        nd.q qVar = new nd.q();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qVar, "failure(...)");
                        return qVar;
                    }
                    boolean a4 = getInputData().a("EXTRA_IS_TEST_MODE", false);
                    barVar2 = new v82.bar(str3, str2, str, (com.truecaller.data.entity.Contact) obj2, notificationType, j, a4);
                    j2 = j;
                    quxVar2.x = null;
                    quxVar2.y = null;
                    quxVar2.z = null;
                    quxVar2.A = null;
                    quxVar2.B = barVar2;
                    quxVar2.C = barVar2;
                    quxVar2.D = j2;
                    quxVar2.E = a4;
                    quxVar2.F = 0;
                    quxVar2.I = 2;
                    if (c(barVar2, quxVar2) == obj) {
                        barVar3 = barVar2;
                        barVar4 = barVar3;
                        i2 = 0;
                        z = a4;
                        quxVar2.x = null;
                        quxVar2.y = null;
                        quxVar2.z = null;
                        quxVar2.A = null;
                        quxVar2.B = barVar4;
                        quxVar2.C = barVar3;
                        quxVar2.D = j2;
                        quxVar2.E = z;
                        quxVar2.F = i2;
                        quxVar2.I = 3;
                        if (b(barVar3, quxVar2) == obj) {
                        }
                    } else {
                        return obj;
                    }
                }
            }
            if (i == 0) {
            }
            boolean a42 = getInputData().a("EXTRA_IS_TEST_MODE", false);
            barVar2 = new v82.bar(str3, str2, str, (com.truecaller.data.entity.Contact) obj2, notificationType, j, a42);
            j2 = j;
            quxVar2.x = null;
            quxVar2.y = null;
            quxVar2.z = null;
            quxVar2.A = null;
            quxVar2.B = barVar2;
            quxVar2.C = barVar2;
            quxVar2.D = j2;
            quxVar2.E = a42;
            quxVar2.F = 0;
            quxVar2.I = 2;
            if (c(barVar2, quxVar2) == obj) {
            }
        } catch (java.lang.Exception unused) {
            return new nd.q();
        }
        quxVar = new v82.qux(this, (ff3.qux) barVar);
        quxVar2 = quxVar;
        java.lang.Object obj22 = quxVar2.G;
        obj = ef3.bar.a;
        i = quxVar2.I;
    }
}
