package com.truecaller.familyprotect.domain.notification;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyGroupNotificationActionReceiver extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int f = 0;
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public qc3.bar c;
    public qc3.bar d;
    public qc3.bar e;

    public final qc3.bar a() {
        qc3.bar barVar = this.d;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("actionHandler");
        throw null;
    }

    public final void b(cf1.c cVar, com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action familyGroupAnalytics$Action) {
        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource;
        qc3.bar barVar = this.e;
        com.truecaller.analytics.common.event.PushNotificationAction pushNotificationAction = null;
        if (barVar != null) {
            ik1.baz bazVar = (ik1.baz) barVar.get();
            com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$PushNotificationId V = lk.c.V(cVar);
            boolean H = lk.c.H(cVar);
            bazVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(V, "id");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(familyGroupAnalytics$Action, "action");
            if (H) {
                pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
            } else {
                pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.Server;
            }
            int i = ik1.bar.b[familyGroupAnalytics$Action.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            pushNotificationAction = com.truecaller.analytics.common.event.PushNotificationAction.Deleted;
                        }
                    } else {
                        pushNotificationAction = com.truecaller.analytics.common.event.PushNotificationAction.Clicked;
                    }
                } else {
                    pushNotificationAction = com.truecaller.analytics.common.event.PushNotificationAction.Dismissed;
                }
            } else {
                pushNotificationAction = com.truecaller.analytics.common.event.PushNotificationAction.Clicked;
            }
            if (pushNotificationAction != null) {
                nc0.u1.e(new rc0.bar(pushNotificationAction, pushNotificationSource, V.getValue()), bazVar.a);
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("analytics");
        throw null;
    }

    public final void c(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        tx.c0 c0Var = ((uk1.qux) o40.bar.k(context)).H.b;
                        tx.w wVar = c0Var.a;
                        this.c = cd3.baz.a(wVar.vm);
                        this.d = cd3.baz.a(c0Var.o4);
                        this.e = cd3.baz.a(wVar.wm);
                        this.a = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        c(context, intent);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        java.lang.String action = intent.getAction();
        if (action != null) {
            int intExtra = intent.getIntExtra("extra_notification_id", -1);
            qc3.bar barVar = this.c;
            if (barVar != null) {
                ((s62.f) ((s62.d) ((uk1.c) barVar.get()).c.get())).a(intExtra, com.truecaller.analytics.common.event.PushNotificationSource.Firebase.getType(), "FamilyProtectNotification");
                java.lang.String stringExtra = intent.getStringExtra("extra_notification_type");
                sj1.baz bazVar = sj1.baz.d;
                if (!kotlin.jvm.internal.Intrinsics.b(stringExtra, "invite")) {
                    bazVar = sj1.baz.c;
                    if (!kotlin.jvm.internal.Intrinsics.b(stringExtra, "invite_nudge")) {
                        bazVar = sj1.baz.g;
                        if (!kotlin.jvm.internal.Intrinsics.b(stringExtra, "promote_to_admin")) {
                            bazVar = sj1.baz.f;
                            if (!kotlin.jvm.internal.Intrinsics.b(stringExtra, "remove_member")) {
                                bazVar = sj1.baz.b;
                                if (!kotlin.jvm.internal.Intrinsics.b(stringExtra, "demote_from_admin")) {
                                    bazVar = sj1.baz.e;
                                    if (!kotlin.jvm.internal.Intrinsics.b(stringExtra, "low_battery_status")) {
                                        bazVar = sj1.baz.h;
                                        if (!kotlin.jvm.internal.Intrinsics.b(stringExtra, "weekly_statistics_report")) {
                                            bazVar = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                switch (action.hashCode()) {
                    case -1343344782:
                        if (!action.equals("com.truecaller.familyprotect.NOTIFICATION_ACTION.SETTINGS")) {
                            return;
                        }
                        if (bazVar != null) {
                            b(bazVar, com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action.PUSH_NOTIFICATION_ACTION_CLICKED);
                        }
                        uk1.baz bazVar2 = (uk1.baz) a().get();
                        java.lang.Object obj = bazVar2.d.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        android.content.Intent c = k9.d.c((uq2.baz) obj, bazVar2.a, new com.truecaller.settings.api.SettingsLaunchConfig("FamilyProtectNotification"), com.truecaller.settings.api.SettingsCategory.SETTINGS_BLOCK, 8);
                        f6.k1 a = ((oj1.qux) bazVar2.e.get()).a();
                        a.a.add(c);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "addNextIntent(...)");
                        a.d();
                        return;
                    case -653200083:
                        if (action.equals("com.truecaller.familyprotect.NOTIFICATION_ACTION.CALL")) {
                            java.lang.String stringExtra2 = intent.getStringExtra("extra_phone_number");
                            if (stringExtra2 != null) {
                                uk1.baz bazVar3 = (uk1.baz) a().get();
                                bazVar3.getClass();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra2, "phoneNumber");
                                if (bazVar3.c.i()) {
                                    try {
                                        android.content.Intent intent2 = new android.content.Intent("android.intent.action.CALL");
                                        intent2.setData(android.net.Uri.parse("tel:".concat(stringExtra2)));
                                        intent2.setFlags(268435456);
                                        bazVar3.a.startActivity(intent2);
                                    } catch (android.content.ActivityNotFoundException unused) {
                                    }
                                }
                            }
                            if (bazVar != null) {
                                b(bazVar, com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action.FP_CALL);
                                return;
                            }
                            return;
                        }
                        return;
                    case -532349715:
                        if (action.equals("com.truecaller.familyprotect.NOTIFICATION_ACTION.GOT_IT") && bazVar != null) {
                            b(bazVar, com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action.PUSH_NOTIFICATION_DISMISSED);
                            return;
                        }
                        return;
                    case -103384783:
                        if (action.equals("com.truecaller.familyprotect.NOTIFICATION_ACTION.OPEN_REPORT_SCREEN")) {
                            if (bazVar != null) {
                                b(bazVar, com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action.PUSH_NOTIFICATION_ACTION_CLICKED);
                            }
                            uk1.baz bazVar4 = (uk1.baz) a().get();
                            fg3.h0.J((fg3.e0) bazVar4.h.getValue(), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new sr0.bar(bazVar4, (df3.bar) null, 24), 3);
                            return;
                        }
                        return;
                    case 41290938:
                        if (action.equals("com.truecaller.familyprotect.NOTIFICATION_ACTION.OPEN_FAMILY_PROTECT")) {
                            if (bazVar != null) {
                                b(bazVar, com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action.PUSH_NOTIFICATION_ACTION_CLICKED);
                            }
                            uk1.baz bazVar5 = (uk1.baz) a().get();
                            ((jm1.bar) bazVar5.f.get()).getClass();
                            android.content.Intent intent3 = new android.content.Intent(bazVar5.a, (java.lang.Class<?>) com.truecaller.familyprotect.presentation.FamilyGroupMainActivity.class);
                            f6.k1 a2 = ((oj1.qux) bazVar5.e.get()).a();
                            a2.a.add(intent3);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "addNextIntent(...)");
                            a2.d();
                            return;
                        }
                        return;
                    case 1419502264:
                        if (action.equals("com.truecaller.familyprotect.NOTIFICATION_ACTION.MESSAGE")) {
                            java.lang.String stringExtra3 = intent.getStringExtra("extra_phone_number");
                            if (stringExtra3 != null) {
                                uk1.baz bazVar6 = (uk1.baz) a().get();
                                bazVar6.getClass();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra3, "phoneNumber");
                                try {
                                    android.content.Intent intent4 = new android.content.Intent("android.intent.action.SENDTO");
                                    intent4.setData(android.net.Uri.parse("smsto:".concat(stringExtra3)));
                                    intent4.setFlags(268435456);
                                    bazVar6.a.startActivity(intent4);
                                } catch (android.content.ActivityNotFoundException unused2) {
                                }
                            }
                            if (bazVar != null) {
                                b(bazVar, com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action.FP_MESSAGE);
                                return;
                            }
                            return;
                        }
                        return;
                    case 2136249659:
                        if (action.equals("com.truecaller.familyprotect.NOTIFICATION_ACTION.DISMISS") && bazVar != null) {
                            b(bazVar, com.truecaller.familyprotect.api.internal.analytics.FamilyGroupAnalytics$Action.PUSH_NOTIFICATION_DISMISSED);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            kotlin.jvm.internal.Intrinsics.n("notificationHelper");
            throw null;
        }
    }
}
