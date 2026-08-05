package com.truecaller.calling.missedcallreminder;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class a extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.truecaller.calling.missedcallreminder.MissedCallReminder A;
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver missedCallReminderNotificationReceiver, com.truecaller.calling.missedcallreminder.MissedCallReminder missedCallReminder, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = missedCallReminderNotificationReceiver;
        this.A = missedCallReminder;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.calling.missedcallreminder.a(this.z, this.A, barVar, 0);
            default:
                return new com.truecaller.calling.missedcallreminder.a(this.z, this.A, barVar, 1);
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

    /* JADX WARN: Removed duplicated region for block: B:46:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object z;
        java.lang.String str;
        android.net.Uri uri;
        android.content.Intent a;
        int type;
        android.app.PendingIntent i;
        qc3.bar barVar;
        int type2;
        switch (this.x) {
            case 0:
                ef3.bar barVar2 = ef3.bar.a;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver missedCallReminderNotificationReceiver = this.z;
                    missedCallReminderNotificationReceiver.a().startActivity(y90.m6.o(missedCallReminderNotificationReceiver.a(), com.truecaller.bottombar.BottomBarButtonType.CALLS, "notificationCalls", null, null, 120).addFlags(335544320));
                    com.truecaller.calling.missedcallreminder.MissedCallReminder missedCallReminder = this.A;
                    java.lang.String str2 = missedCallReminder.a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notificationMissedCallReminder", "analyticsContext");
                    com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource initiateCallHelper$CallSource = com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource.MISSED_CALL_REMINDER_NOTIFICATION;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initiateCallHelper$CallSource, "source");
                    com.truecaller.calling.initiate_call.InitiateCallHelper$CallOptions initiateCallHelper$CallOptions = new com.truecaller.calling.initiate_call.InitiateCallHelper$CallOptions(str2, "notificationMissedCallReminder", "notificationMissedCallReminder", null, null, false, false, false, false, null, true, com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption.ShowOnBoarded.a, null, initiateCallHelper$CallSource);
                    qc3.bar barVar3 = missedCallReminderNotificationReceiver.g;
                    if (barVar3 != null) {
                        ((nv0.l) ((nv0.c) barVar3.get())).d(initiateCallHelper$CallOptions);
                        kotlin.coroutines.CoroutineContext coroutineContext = missedCallReminderNotificationReceiver.d;
                        if (coroutineContext != null) {
                            com.truecaller.calling.missedcallreminder.qux quxVar = new com.truecaller.calling.missedcallreminder.qux(missedCallReminderNotificationReceiver, missedCallReminder, null, 0);
                            this.y = 1;
                            if (fg3.h0.W(coroutineContext, quxVar, this) == barVar2) {
                                return barVar2;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("asyncContext");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("initiateCallHelper");
                        throw null;
                    }
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar4 = ef3.bar.a;
                int i3 = this.y;
                com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver missedCallReminderNotificationReceiver2 = this.z;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    z = obj;
                } else {
                    od.p.E(obj);
                    hw0.a aVar = missedCallReminderNotificationReceiver2.k;
                    if (aVar != null) {
                        this.y = 1;
                        z = ef0.a.z(((hw0.q) aVar).d(), hw0.q.r, false, this);
                        if (z == barVar4) {
                            return barVar4;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("callingSettings");
                        throw null;
                    }
                }
                if (!((java.lang.Boolean) z).booleanValue()) {
                    return kotlin.Unit.a;
                }
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.truecaller.calling.missedcallreminder.MissedCallReminder missedCallReminder2 = this.A;
                long hours = timeUnit.toHours(currentTimeMillis - missedCallReminder2.c);
                if (hours <= 12 && hours >= 1) {
                    qc3.bar barVar5 = missedCallReminderNotificationReceiver2.j;
                    if (barVar5 != null) {
                        com.truecaller.data.entity.Contact f = ((p81.bar) barVar5.get()).f(missedCallReminder2.b);
                        if (f == null || (str = f.t()) == null) {
                            str = missedCallReminder2.a;
                        }
                        java.lang.String quantityString = missedCallReminderNotificationReceiver2.a().getResources().getQuantityString(2131886104, (int) hours, str, new java.lang.Long(hours));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                        if (f != null) {
                            uri = m03.r.j(f, true);
                        } else {
                            uri = null;
                        }
                        android.graphics.Bitmap w = j0.b.w(fj.a.u(uri), 2131755009, missedCallReminderNotificationReceiver2.a());
                        if (w.getWidth() <= 0 || w.getHeight() <= 0) {
                            w = null;
                        }
                        int color = missedCallReminderNotificationReceiver2.a().getColor(2131102024);
                        jw0.bar barVar6 = missedCallReminderNotificationReceiver2.m;
                        if (barVar6 != null) {
                            if (((sw0.qux) barVar6).b()) {
                                jw0.bar barVar7 = missedCallReminderNotificationReceiver2.m;
                                if (barVar7 != null) {
                                    if (((sw0.qux) barVar7).c()) {
                                        a = y90.m6.o(missedCallReminderNotificationReceiver2.a(), com.truecaller.bottombar.BottomBarButtonType.CALLS, "notificationMissedCallReminder", null, null, 120).putExtra("set_missed_filter", true);
                                        kotlin.jvm.internal.Intrinsics.d(a);
                                        bo.p a2 = missedCallReminderNotificationReceiver2.b().a();
                                        a2.b = missedCallReminder2.d;
                                        a2.c = 335544320;
                                        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                                        android.app.PendingIntent e = a2.e(pushNotificationSource.getType(), "notificationMissedCallReminder", a);
                                        bo.p a3 = missedCallReminderNotificationReceiver2.b().a();
                                        a3.b = 2131365350;
                                        a3.c = 335544320;
                                        a3.e = new java.lang.Integer(com.truecaller.analytics.common.event.PushNotificationAction.RightButton.getType());
                                        android.content.Intent putExtra = new android.content.Intent(missedCallReminderNotificationReceiver2.a(), (java.lang.Class<?>) com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver.class).setAction("com.truecaller.intent.action.MISSED_CALL_REMINDER_SNOOZED").putExtra("reminder", missedCallReminder2);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                                        android.app.PendingIntent i4 = a3.i(pushNotificationSource.getType(), "notificationMissedCallReminder", putExtra);
                                        bo.p a4 = missedCallReminderNotificationReceiver2.b().a();
                                        a4.b = 2131365349;
                                        a4.c = 335544320;
                                        android.content.Intent putExtra2 = new android.content.Intent(missedCallReminderNotificationReceiver2.a(), (java.lang.Class<?>) com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver.class).setAction("com.truecaller.intent.action.MISSED_CALL_REMINDER_DISMISSED").putExtra("reminder", missedCallReminder2);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra2, "putExtra(...)");
                                        android.app.PendingIntent k = a4.k(pushNotificationSource.getType(), "notificationMissedCallReminder", putExtra2);
                                        if (android.os.Build.VERSION.SDK_INT < 31) {
                                            int i5 = com.truecaller.notifications.support.NotificationTrampolineActivity.n0;
                                            android.content.Context a5 = missedCallReminderNotificationReceiver2.a();
                                            java.lang.String str3 = missedCallReminder2.a;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "rawNumber");
                                            android.content.Intent d = p7.bar.d(a5, "notificationMissedCallReminder", str3, (java.lang.Long) null, missedCallReminder2.b, 8);
                                            bo.p a6 = missedCallReminderNotificationReceiver2.b().a();
                                            a6.b = 2131365348;
                                            a6.c = 335544320;
                                            if (hours < 12) {
                                                type2 = com.truecaller.analytics.common.event.PushNotificationAction.LeftButton.getType();
                                            } else {
                                                type2 = com.truecaller.analytics.common.event.PushNotificationAction.MiddleButton.getType();
                                            }
                                            a6.e = new java.lang.Integer(type2);
                                            i = a6.e(pushNotificationSource.getType(), "notificationMissedCallReminder", d);
                                        } else {
                                            bo.p a7 = missedCallReminderNotificationReceiver2.b().a();
                                            a7.b = 2131365348;
                                            a7.c = 335544320;
                                            if (hours < 12) {
                                                type = com.truecaller.analytics.common.event.PushNotificationAction.LeftButton.getType();
                                            } else {
                                                type = com.truecaller.analytics.common.event.PushNotificationAction.MiddleButton.getType();
                                            }
                                            a7.e = new java.lang.Integer(type);
                                            android.content.Intent putExtra3 = new android.content.Intent(missedCallReminderNotificationReceiver2.a(), (java.lang.Class<?>) com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver.class).setAction("com.truecaller.intent.action.MISSED_CALL_REMINDER_CALLED").putExtra("reminder", missedCallReminder2);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra3, "putExtra(...)");
                                            i = a7.i(pushNotificationSource.getType(), "notificationMissedCallReminder", putExtra3);
                                        }
                                        barVar = missedCallReminderNotificationReceiver2.h;
                                        if (barVar == null) {
                                            f6.f0 f0Var = new f6.f0(missedCallReminderNotificationReceiver2.a(), ((s62.d) barVar.get()).o("missed_calls_reminder"));
                                            android.app.Notification notification = f0Var.Q;
                                            notification.icon = 2131232597;
                                            f0Var.e = f6.f0.e(missedCallReminderNotificationReceiver2.a().getString(2132018238));
                                            f0Var.f = f6.f0.e(quantityString);
                                            f0Var.m(w);
                                            f0Var.m = true;
                                            f0Var.l(16, true);
                                            notification.when = missedCallReminder2.c;
                                            f0Var.D = color;
                                            f0Var.g = e;
                                            notification.deleteIntent = k;
                                            f0Var.a(2131232898, i, missedCallReminderNotificationReceiver2.a().getString(2132018235));
                                            if (hours < 12) {
                                                f0Var.a(2131232909, i4, missedCallReminderNotificationReceiver2.a().getString(2132018236));
                                            }
                                            notification.vibrate = null;
                                            f0Var.s((android.net.Uri) null);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var, "setSound(...)");
                                            kotlin.coroutines.CoroutineContext c = missedCallReminderNotificationReceiver2.c();
                                            a61.bar barVar8 = new a61.bar(missedCallReminderNotificationReceiver2, missedCallReminder2, f0Var, (df3.bar) null, 13);
                                            this.y = 2;
                                            if (fg3.h0.W(c, barVar8, this) == barVar4) {
                                                return barVar4;
                                            }
                                            return kotlin.Unit.a;
                                        }
                                        kotlin.jvm.internal.Intrinsics.n("systemNotificationManager");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("callLogApi");
                                    throw null;
                                }
                            }
                            nd1.bar barVar9 = missedCallReminderNotificationReceiver2.l;
                            if (barVar9 != null) {
                                a = barVar9.a(missedCallReminderNotificationReceiver2.a(), new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Extras(new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.ContactData((java.lang.String) null, (java.lang.String) null, missedCallReminder2.a, missedCallReminder2.b, (com.truecaller.data.entity.Contact) null, (com.truecaller.data.entity.HistoryEvent) null, 51, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.truecaller.detailsview.api.model.DetailsViewSource.MissedCallReminder, (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.HistoryEventData) null, 10, (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action) null, 20, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                                kotlin.jvm.internal.Intrinsics.d(a);
                                bo.p a22 = missedCallReminderNotificationReceiver2.b().a();
                                a22.b = missedCallReminder2.d;
                                a22.c = 335544320;
                                com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource2 = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                                android.app.PendingIntent e2 = a22.e(pushNotificationSource2.getType(), "notificationMissedCallReminder", a);
                                bo.p a32 = missedCallReminderNotificationReceiver2.b().a();
                                a32.b = 2131365350;
                                a32.c = 335544320;
                                a32.e = new java.lang.Integer(com.truecaller.analytics.common.event.PushNotificationAction.RightButton.getType());
                                android.content.Intent putExtra4 = new android.content.Intent(missedCallReminderNotificationReceiver2.a(), (java.lang.Class<?>) com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver.class).setAction("com.truecaller.intent.action.MISSED_CALL_REMINDER_SNOOZED").putExtra("reminder", missedCallReminder2);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra4, "putExtra(...)");
                                android.app.PendingIntent i42 = a32.i(pushNotificationSource2.getType(), "notificationMissedCallReminder", putExtra4);
                                bo.p a42 = missedCallReminderNotificationReceiver2.b().a();
                                a42.b = 2131365349;
                                a42.c = 335544320;
                                android.content.Intent putExtra22 = new android.content.Intent(missedCallReminderNotificationReceiver2.a(), (java.lang.Class<?>) com.truecaller.calling.missedcallreminder.MissedCallReminderNotificationReceiver.class).setAction("com.truecaller.intent.action.MISSED_CALL_REMINDER_DISMISSED").putExtra("reminder", missedCallReminder2);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra22, "putExtra(...)");
                                android.app.PendingIntent k2 = a42.k(pushNotificationSource2.getType(), "notificationMissedCallReminder", putExtra22);
                                if (android.os.Build.VERSION.SDK_INT < 31) {
                                }
                                barVar = missedCallReminderNotificationReceiver2.h;
                                if (barVar == null) {
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("detailsViewIntentBuilder");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("callLogApi");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("aggregatedContactDao");
                        throw null;
                    }
                } else {
                    return kotlin.Unit.a;
                }
                break;
        }
    }
}
