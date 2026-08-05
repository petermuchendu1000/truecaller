package com.truecaller.premium.familysharing;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BU\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/truecaller/premium/familysharing/FamilySharingNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Ls62/d;", "notificationManager", "Lw82/l1;", "premiumRepository", "Lta2/k;", "familySharingUtil", "Li82/l;", "premiumContactUtil", "Lqo1/o;", "premiumFeaturesInventory", "Lw82/q1;", "premiumStateSettings", "Lnc0/bar;", "analytics", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ls62/d;Lw82/l1;Lta2/k;Li82/l;Lqo1/o;Lw82/q1;Lnc0/bar;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilySharingNotificationWorker extends androidx.work.CoroutineWorker {
    public final android.content.Context a;
    public final s62.d b;
    public final w82.l1 c;
    public final ta2.k d;
    public final i82.l e;
    public final qo1.o f;
    public final w82.q1 g;
    public final nc0.bar h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilySharingNotificationWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull s62.d dVar, @org.jetbrains.annotations.NotNull w82.l1 l1Var, @org.jetbrains.annotations.NotNull ta2.k kVar, @org.jetbrains.annotations.NotNull i82.l lVar, @org.jetbrains.annotations.NotNull qo1.o oVar, @org.jetbrains.annotations.NotNull w82.q1 q1Var, @org.jetbrains.annotations.NotNull nc0.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "notificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l1Var, "premiumRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "familySharingUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "premiumContactUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "premiumFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(q1Var, "premiumStateSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        this.a = context;
        this.b = dVar;
        this.c = l1Var;
        this.d = kVar;
        this.e = lVar;
        this.f = oVar;
        this.g = q1Var;
        this.h = barVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        ta2.j jVar;
        int i;
        com.truecaller.data.entity.Contact contact;
        com.truecaller.data.entity.Contact contact2;
        com.truecaller.network.notification.NotificationType notificationType;
        com.truecaller.data.entity.Contact contact3;
        int i2;
        java.lang.String str;
        java.lang.String string;
        java.lang.String str2;
        java.lang.String str3;
        int i3;
        int i4;
        java.lang.String str4;
        java.lang.String string2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String string3;
        java.lang.String str7;
        if (barVar instanceof ta2.j) {
            jVar = (ta2.j) barVar;
            int i5 = jVar.C;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                jVar.C = i5 - Integer.MIN_VALUE;
                java.lang.Object obj = jVar.A;
                ef3.bar barVar2 = ef3.bar.a;
                i = jVar.C;
                if (i == 0) {
                    if (i == 1) {
                        contact3 = jVar.z;
                        contact = jVar.y;
                        notificationType = jVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (!((qo1.p) this.f).b.a("featureFamilyPlan", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                        nd.s a = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                        return a;
                    }
                    com.truecaller.network.notification.NotificationType valueOf = com.truecaller.network.notification.NotificationType.valueOf(getInputData().b("EXTRA_NOTIFICATION_TYPE", -1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "let(...)");
                    java.lang.String e = getInputData().e("EXTRA_TC_ID");
                    wi.v vVar = this.e;
                    if (e != null) {
                        contact = vVar.u(e);
                    } else {
                        contact = null;
                    }
                    java.lang.String e2 = getInputData().e("MEMBER_TC_ID");
                    if (e2 != null) {
                        contact2 = vVar.u(e2);
                    } else {
                        contact2 = null;
                    }
                    jVar.x = valueOf;
                    jVar.y = contact;
                    jVar.z = contact2;
                    jVar.C = 1;
                    if (((w82.n1) this.c).b(jVar) == barVar2) {
                        return barVar2;
                    }
                    notificationType = valueOf;
                    contact3 = contact2;
                }
                ((w82.r1) this.g).n("familyMembers", (java.lang.String) null);
                int[] iArr = ta2.i.a;
                i2 = iArr[notificationType.ordinal()];
                ta2.k kVar = this.d;
                com.truecaller.network.notification.NotificationType notificationType2 = notificationType;
                com.truecaller.data.entity.Contact contact4 = contact3;
                com.truecaller.data.entity.Contact contact5 = contact;
                android.content.Context context = this.a;
                s62.d dVar = this.b;
                java.lang.String str8 = "notificationFamilyMemberRevoked";
                if (i2 != 1) {
                    str = "notificationFamilyMemberLeft";
                    if (contact5 == null || (string = contact5.t()) == null) {
                        string = context.getString(2132019071);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    }
                    java.lang.String string4 = context.getString(2132018492, string);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    f6.k1 k1Var = new f6.k1(getApplicationContext());
                    android.content.Context applicationContext = getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    android.content.Intent o = y90.m6.o(applicationContext, (com.truecaller.bottombar.BottomBarButtonType) null, "FamilyNewMemberNotification", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 122);
                    java.util.ArrayList arrayList = k1Var.a;
                    arrayList.add(o);
                    int i6 = com.truecaller.premium.familysharing.FamilySharingDialogActivity.e0;
                    android.content.Context applicationContext2 = getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext2, "context");
                    str2 = "notificationFamilyNewMember";
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "launchAnalyticsContext");
                    android.content.Intent putExtra = com.moloco.sdk.internal.publisher.b0.o(applicationContext2, com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType.FAMILY_SHARING_ADDED_AS_MEMBER, str2).putExtra("FamilySharingDialogFragment.LaunchAnalyticsContext", str2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                    arrayList.add(putExtra);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var, "addNextIntent(...)");
                    com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                    s62.f fVar = (s62.f) dVar;
                    android.app.PendingIntent l = fVar.l(this.a, k1Var, pushNotificationSource.getType(), "FamilyNewMemberNotification", 0, 201326592);
                    f6.f0 f0Var = new f6.f0(getApplicationContext(), fVar.o("miscellaneous_channel"));
                    f0Var.e = f6.f0.e(context.getString(2132018493));
                    f0Var.f = f6.f0.e(string4);
                    f6.y yVar = new f6.y(0);
                    yVar.f = f6.f0.e(string4);
                    f0Var.t(yVar);
                    f0Var.m(android.graphics.BitmapFactory.decodeResource(context.getResources(), 2131232619));
                    f0Var.D = getApplicationContext().getColor(2131102024);
                    f0Var.k(-1);
                    f0Var.Q.icon = 2131232902;
                    f0Var.g = l;
                    f0Var.a(0, l, context.getString(2132018451));
                    f0Var.l(16, true);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var, "setAutoCancel(...)");
                    android.app.Notification d = f0Var.d();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
                    fVar.v(2131363822, d, pushNotificationSource.getType(), "FamilyNewMemberNotification");
                    if (contact5 != null) {
                        str3 = contact5.t();
                    } else {
                        str3 = null;
                    }
                    i82.v vVar2 = kVar.c;
                    i3 = 1;
                    vVar2.k("shouldShowNewFamilyMemberSplat", true);
                    vVar2.k("shouldShowNewFamilyMemberDialog", true);
                    ((w82.r1) kVar.b).n("familyOwnerName", str3);
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            if (contact4 == null || (string3 = contact4.t()) == null) {
                                string3 = context.getString(2132019071);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            }
                            java.lang.String str9 = string3;
                            java.lang.String string5 = context.getString(2132018487, str9);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                            f6.k1 k1Var2 = new f6.k1(getApplicationContext());
                            android.content.Context applicationContext3 = getApplicationContext();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                            android.content.Intent o2 = y90.m6.o(applicationContext3, (com.truecaller.bottombar.BottomBarButtonType) null, "notificationFamilyMemberLeft", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 122);
                            java.util.ArrayList arrayList2 = k1Var2.a;
                            arrayList2.add(o2);
                            int i7 = com.truecaller.premium.familysharing.FamilySharingDialogActivity.e0;
                            android.content.Context applicationContext4 = getApplicationContext();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext4, "getApplicationContext(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext4, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notificationFamilyMemberLeft", "launchAnalyticsContext");
                            android.content.Intent putExtra2 = com.moloco.sdk.internal.publisher.b0.o(applicationContext4, com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType.FAMILY_SHARING_MEMBERSHIP_REVOKED_BY_MEMBER, "notificationFamilyMemberLeft").putExtra("FamilySharingDialogFragment.LaunchAnalyticsContext", "notificationFamilyMemberLeft");
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra2, "putExtra(...)");
                            arrayList2.add(putExtra2);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var2, "addNextIntent(...)");
                            com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource2 = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                            s62.f fVar2 = (s62.f) dVar;
                            android.app.PendingIntent l2 = fVar2.l(this.a, k1Var2, pushNotificationSource2.getType(), "FamilyMemberLeftNotification", 0, 201326592);
                            f6.f0 f0Var2 = new f6.f0(getApplicationContext(), fVar2.o("miscellaneous_channel"));
                            f0Var2.e = f6.f0.e(context.getString(2132018488));
                            f0Var2.f = f6.f0.e(string5);
                            f6.y yVar2 = new f6.y(0);
                            yVar2.f = f6.f0.e(string5);
                            f0Var2.t(yVar2);
                            f0Var2.m(android.graphics.BitmapFactory.decodeResource(context.getResources(), 2131232619));
                            f0Var2.D = getApplicationContext().getColor(2131102024);
                            f0Var2.k(-1);
                            f0Var2.Q.icon = 2131232902;
                            f0Var2.g = l2;
                            f0Var2.a(0, l2, context.getString(2132018451));
                            f0Var2.l(16, true);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var2, "setAutoCancel(...)");
                            android.app.Notification d2 = f0Var2.d();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
                            fVar2.v(2131363822, d2, pushNotificationSource2.getType(), "FamilyMemberLeftNotification");
                            if (contact4 != null) {
                                str7 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(gj.m.R(contact4));
                            } else {
                                str7 = null;
                            }
                            kVar.c.k("shouldShowFamilyMemberLeftDialog", true);
                            w82.r1 r1Var = (w82.r1) kVar.b;
                            r1Var.n("familyOwnerName", str9);
                            r1Var.n("familyOwnerNumber", str7);
                        }
                        str = "notificationFamilyMemberLeft";
                    } else {
                        if (contact5 == null || (string2 = contact5.t()) == null) {
                            string2 = context.getString(2132019071);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        }
                        str = "notificationFamilyMemberLeft";
                        java.lang.String string6 = context.getString(2132018472, string2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                        f6.k1 k1Var3 = new f6.k1(getApplicationContext());
                        android.content.Context applicationContext5 = getApplicationContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext5, "getApplicationContext(...)");
                        android.content.Intent o3 = y90.m6.o(applicationContext5, (com.truecaller.bottombar.BottomBarButtonType) null, "FamilyMemberRevokedNotification", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 122);
                        java.util.ArrayList arrayList3 = k1Var3.a;
                        arrayList3.add(o3);
                        int i8 = com.truecaller.premium.familysharing.FamilySharingDialogActivity.e0;
                        android.content.Context applicationContext6 = getApplicationContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext6, "getApplicationContext(...)");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext6, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "launchAnalyticsContext");
                        android.content.Intent putExtra3 = com.moloco.sdk.internal.publisher.b0.o(applicationContext6, com.truecaller.premium.familysharing.FamilySharingDialogMvp$ScreenType.FAMILY_SHARING_MEMBERSHIP_REVOKED, str8).putExtra("FamilySharingDialogFragment.LaunchAnalyticsContext", str8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra3, "putExtra(...)");
                        arrayList3.add(putExtra3);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var3, "addNextIntent(...)");
                        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource3 = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                        s62.f fVar3 = (s62.f) dVar;
                        android.app.PendingIntent l3 = fVar3.l(this.a, k1Var3, pushNotificationSource3.getType(), "FamilyMemberRevokedNotification", 0, 201326592);
                        f6.f0 f0Var3 = new f6.f0(getApplicationContext(), fVar3.o("miscellaneous_channel"));
                        f0Var3.e = f6.f0.e(context.getString(2132018473));
                        f0Var3.f = f6.f0.e(string6);
                        f6.y yVar3 = new f6.y(0);
                        yVar3.f = f6.f0.e(string6);
                        f0Var3.t(yVar3);
                        f0Var3.m(android.graphics.BitmapFactory.decodeResource(context.getResources(), 2131232619));
                        f0Var3.D = getApplicationContext().getColor(2131102024);
                        f0Var3.k(-1);
                        f0Var3.Q.icon = 2131232902;
                        f0Var3.g = l3;
                        f0Var3.a(0, l3, context.getString(2132018451));
                        f0Var3.l(16, true);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var3, "setAutoCancel(...)");
                        android.app.Notification d3 = f0Var3.d();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d3, "build(...)");
                        fVar3.v(2131363822, d3, pushNotificationSource3.getType(), "FamilyMemberRevokedNotification");
                        if (contact5 != null) {
                            str5 = contact5.t();
                        } else {
                            str5 = null;
                        }
                        if (contact5 != null) {
                            str6 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(gj.m.R(contact5));
                        } else {
                            str6 = null;
                        }
                        kVar.c.k("shouldShowFamilyMembershipRevokedDialog", true);
                        w82.r1 r1Var2 = (w82.r1) kVar.b;
                        r1Var2.n("familyOwnerName", str5);
                        r1Var2.n("familyOwnerPhoneNumber", str6);
                        str8 = str8;
                    }
                    str2 = "notificationFamilyNewMember";
                    i3 = 1;
                }
                i4 = iArr[notificationType2.ordinal()];
                if (i4 == i3) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            str4 = "unknown";
                        } else {
                            str4 = str;
                        }
                    } else {
                        str4 = str8;
                    }
                } else {
                    str4 = str2;
                }
                bd.bar.u(this.h, str4, "notification");
                nd.s a2 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                return a2;
            }
        }
        jVar = new ta2.j(this, (ff3.qux) barVar);
        java.lang.Object obj2 = jVar.A;
        ef3.bar barVar22 = ef3.bar.a;
        i = jVar.C;
        if (i == 0) {
        }
        ((w82.r1) this.g).n("familyMembers", (java.lang.String) null);
        int[] iArr2 = ta2.i.a;
        i2 = iArr2[notificationType.ordinal()];
        ta2.k kVar2 = this.d;
        com.truecaller.network.notification.NotificationType notificationType22 = notificationType;
        com.truecaller.data.entity.Contact contact42 = contact3;
        com.truecaller.data.entity.Contact contact52 = contact;
        android.content.Context context2 = this.a;
        s62.d dVar2 = this.b;
        java.lang.String str82 = "notificationFamilyMemberRevoked";
        if (i2 != 1) {
        }
        i4 = iArr2[notificationType22.ordinal()];
        if (i4 == i3) {
        }
        bd.bar.u(this.h, str4, "notification");
        nd.s a23 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a23, "success(...)");
        return a23;
    }
}
