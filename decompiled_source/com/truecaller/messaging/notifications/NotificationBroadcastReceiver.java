package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class NotificationBroadcastReceiver extends com.truecaller.messaging.notifications.i {
    public static final /* synthetic */ int o = 0;
    public com.truecaller.messaging.notifications.h0 d;
    public tx.z e;
    public qc3.bar f;
    public m03.s g;
    public nc0.y0 h;
    public xd0.qux i;
    public s62.d j;
    public e42.s k;
    public q83.a l;
    public hy1.f0 m;
    public kv1.i n;

    public NotificationBroadcastReceiver() {
        super(0);
    }

    public static android.content.Intent e(android.content.Context context, java.lang.String str, java.util.List list, boolean z, com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier, java.lang.String str2) {
        boolean z2;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.messaging.notifications.NotificationBroadcastReceiver.class);
        intent.setAction(str);
        int size = list.size();
        if (size > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.truecaller.log.AssertionUtil.AlwaysFatal.isTrue(z2, new java.lang.String[0]);
        long[] jArr = new long[size];
        int[] iArr = new int[size];
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) it.next();
            jArr[i] = message.a;
            iArr[i] = yp.k.B(message);
            i++;
        }
        intent.putExtra("EXTRA_MESSAGE_IDS", jArr);
        intent.putExtra("EXTRA_MESSAGE_INSIGHTS_NOTIFICATION_IDS", iArr);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(java.lang.Long.valueOf(((com.truecaller.messaging.data.types.Message) it2.next()).b));
        }
        intent.putExtra("EXTRA_CONVERSATION_IDS", jj3.bar.w((java.lang.Long[]) linkedHashSet.toArray(new java.lang.Long[linkedHashSet.size()])));
        if (list.size() == 1) {
            intent.putExtra("EXTRA_MESSAGE_ID", ((com.truecaller.messaging.data.types.Message) list.get(0)).a);
        }
        intent.putExtra("EXTRA_AUTHORIZED_ONLY", z);
        intent.putExtra("EXTRA_NOTIFICATION_ID", notificationIdentifier);
        intent.putExtra("EXTRA_NOTIFICATION_CHANNEL_ID", str2);
        return intent;
    }

    public final void f(int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            for (int i : iArr) {
                this.m.t(i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.truecaller.messaging.notifications.i, android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.truecaller.insights.fraud.analytics.FraudActionScope fraudActionScope;
        char c;
        com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier;
        char c2;
        char c3;
        java.lang.CharSequence charSequence;
        char c4;
        long j;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        super.onReceive(context, intent);
        if (intent != null && intent.getAction() != null) {
            if (intent.getBooleanExtra("EXTRA_AUTHORIZED_ONLY", false) && !this.g.b()) {
                this.l.f(context, com.truecaller.wizard.api.WizardStartContext.NOTIFICATION, false);
                return;
            }
            java.lang.String action = intent.getAction();
            com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier2 = (com.truecaller.messaging.notifications.NotificationIdentifier) intent.getParcelableExtra("EXTRA_NOTIFICATION_ID");
            action.getClass();
            if (!action.equals("com.truecaller.messaging.notifications.ERROR_DISMISSED")) {
                if (!action.equals("com.truecaller.messaging.notifications.DISMISSED")) {
                    switch (action.hashCode()) {
                        case -262798704:
                            if (action.equals("com.truecaller.messaging.notifications.MARK_READ")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 317616099:
                            if (action.equals("com.truecaller.messaging.notifications.DELETE")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 464095904:
                            if (action.equals("com.truecaller.messaging.notifications.QUICK_REPLY")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 718632563:
                            if (action.equals("com.truecaller.messaging.notifications.RESEND")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1737289192:
                            if (action.equals("com.truecaller.messaging.notifications.MARK_MESSAGE_READ")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            notificationIdentifier = notificationIdentifier2;
                            c2 = 2;
                            long[] longArrayExtra = intent.getLongArrayExtra("EXTRA_CONVERSATION_IDS");
                            long[] longArrayExtra2 = intent.getLongArrayExtra("EXTRA_MESSAGE_IDS");
                            if (longArrayExtra != null && longArrayExtra.length != 0 && longArrayExtra2 != null && longArrayExtra2.length != 0) {
                                ((y12.v) ((xd0.qux) this.f.get()).a()).e0("notification", false, true, longArrayExtra, longArrayExtra2);
                                this.h.j("markAllAsRead", longArrayExtra2[longArrayExtra2.length - 1], false, (com.truecaller.messaging.data.types.QuickAction) null);
                            }
                            com.truecaller.messaging.notifications.h0 h0Var = this.d;
                            h0Var.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longArrayExtra, "conversationIds");
                            for (long j2 : longArrayExtra) {
                                int i = com.truecaller.messaging.urgent.service.UrgentMessageService.j;
                                o40.bar.i(h0Var.a, java.lang.Long.valueOf(j2));
                            }
                            f(intent.getIntArrayExtra("EXTRA_MESSAGE_INSIGHTS_NOTIFICATION_IDS"));
                            break;
                        case 1:
                            notificationIdentifier = notificationIdentifier2;
                            c3 = 2;
                            long longExtra = intent.getLongExtra("EXTRA_MESSAGE_ID", -1L);
                            this.h.j("delete", longExtra, false, (com.truecaller.messaging.data.types.QuickAction) null);
                            ((y12.v) ((xd0.qux) this.f.get()).a()).b0(longExtra).F();
                            c2 = c3;
                            break;
                        case 2:
                            notificationIdentifier = notificationIdentifier2;
                            long[] longArrayExtra3 = intent.getLongArrayExtra("EXTRA_CONVERSATION_IDS");
                            if (longArrayExtra3 != null && longArrayExtra3.length != 0) {
                                android.os.Bundle resultsFromIntent = android.app.RemoteInput.getResultsFromIntent(intent);
                                df3.bar barVar = null;
                                if (resultsFromIntent != null) {
                                    charSequence = resultsFromIntent.getCharSequence("KEY_REPLY_TEXT");
                                } else {
                                    charSequence = null;
                                }
                                if (jj3.bar.j(charSequence)) {
                                    tx.z zVar = this.e;
                                    long j3 = longArrayExtra3[0];
                                    tx.w wVar = (tx.w) zVar.a.b;
                                    kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
                                    cd3.bar barVar2 = wVar.m9;
                                    tx.c0 c0Var = wVar.b;
                                    m32.qux quxVar = new m32.qux(coroutineContext, j3, cd3.baz.a(barVar2), (tx.bar) wVar.O1.get(), (e42.s) wVar.y3.get(), (e32.bar) wVar.Qg.get(), (nc0.y0) wVar.r9.get(), (x32.k) wVar.Sg.get(), (xd0.qux) wVar.T2.get(), cd3.baz.a(c0Var.w4), cd3.baz.a(c0Var.x4));
                                    long[] longArrayExtra4 = intent.getLongArrayExtra("EXTRA_MESSAGE_IDS");
                                    if (longArrayExtra4 != null && longArrayExtra4.length != 0) {
                                        java.lang.String charSequence2 = charSequence.toString();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence2, "text");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longArrayExtra4, "messageIds");
                                        if (jj3.bar.h(charSequence2)) {
                                            c3 = 2;
                                        } else {
                                            quxVar.l = charSequence2;
                                            quxVar.m = longArrayExtra4;
                                            c3 = 2;
                                            fg3.h0.J(fg3.f1.a, coroutineContext, (fg3.f0) null, new lo1.bar(quxVar, barVar, 11), 2);
                                        }
                                        this.h.j("reply", longArrayExtra4[longArrayExtra4.length - 1], false, (com.truecaller.messaging.data.types.QuickAction) null);
                                        c2 = c3;
                                        break;
                                    }
                                }
                                c2 = 2;
                                break;
                            }
                            c3 = 2;
                            c2 = c3;
                            break;
                        case 3:
                            long[] longArrayExtra5 = intent.getLongArrayExtra("EXTRA_MESSAGE_IDS");
                            long[] longArrayExtra6 = intent.getLongArrayExtra("EXTRA_CONVERSATION_IDS");
                            if (longArrayExtra6 != null && longArrayExtra6.length != 0 && notificationIdentifier2 != null) {
                                notificationIdentifier = notificationIdentifier2;
                                ((s62.f) this.j).b(notificationIdentifier.a, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), notificationIdentifier.b, "notificationIncomingMessage");
                            } else {
                                notificationIdentifier = notificationIdentifier2;
                            }
                            if (longArrayExtra5 != null && longArrayExtra5.length != 0) {
                                ((y12.v) ((xd0.qux) this.f.get()).a()).P(longArrayExtra5[0]).E(new com.truecaller.messaging.notifications.x(this, 0));
                                this.h.h(longArrayExtra5[longArrayExtra5.length - 1], "resend");
                            }
                            c2 = 2;
                            break;
                        case 4:
                            long longExtra2 = intent.getLongExtra("EXTRA_MESSAGE_ID", -1L);
                            long[] longArrayExtra7 = intent.getLongArrayExtra("EXTRA_CONVERSATION_IDS");
                            xd0.qux quxVar2 = (xd0.qux) this.f.get();
                            if (longExtra2 == -1) {
                                com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("No message id was sent.");
                            } else {
                                ((y12.v) quxVar2.a()).e0("notification", false, true, longArrayExtra7, longExtra2);
                            }
                            com.truecaller.messaging.notifications.h0 h0Var2 = this.d;
                            h0Var2.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longArrayExtra7, "conversationIds");
                            for (long j4 : longArrayExtra7) {
                                int i2 = com.truecaller.messaging.urgent.service.UrgentMessageService.j;
                                o40.bar.i(h0Var2.a, java.lang.Long.valueOf(j4));
                            }
                            this.h.j("markAsRead", longExtra2, false, (com.truecaller.messaging.data.types.QuickAction) null);
                            f(intent.getIntArrayExtra("EXTRA_MESSAGE_INSIGHTS_NOTIFICATION_IDS"));
                        default:
                            notificationIdentifier = notificationIdentifier2;
                            c2 = 2;
                            break;
                    }
                    switch (action.hashCode()) {
                        case -1086701267:
                            if (action.equals("com.truecaller.messaging.notifications.CHECK_BALANCE")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -262798704:
                            if (action.equals("com.truecaller.messaging.notifications.MARK_READ")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 317616099:
                            if (action.equals("com.truecaller.messaging.notifications.DELETE")) {
                                c4 = c2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1737289192:
                            if (action.equals("com.truecaller.messaging.notifications.MARK_MESSAGE_READ")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            if (notificationIdentifier != null) {
                                java.lang.String str = notificationIdentifier.b;
                                int i3 = notificationIdentifier.a;
                                if (i3 == 2131365483 && str != null) {
                                    com.truecaller.messaging.notifications.t tVar = (com.truecaller.messaging.notifications.t) this.i.a();
                                    try {
                                        j = java.lang.Long.parseLong(u03.e0.z(str));
                                    } catch (java.lang.RuntimeException unused) {
                                        j = 0;
                                    }
                                    tVar.c(java.util.Collections.singleton(java.lang.Long.valueOf(j)));
                                    return;
                                }
                                ((s62.f) this.j).b(i3, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), str, "notificationIncomingMessage");
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                long[] longArrayExtra8 = intent.getLongArrayExtra("EXTRA_MESSAGE_IDS");
                if (longArrayExtra8 != null && longArrayExtra8.length != 0) {
                    ((y12.v) ((xd0.qux) this.f.get()).a()).o0(longArrayExtra8);
                    this.h.j("dismiss", longArrayExtra8[longArrayExtra8.length - 1], false, (com.truecaller.messaging.data.types.QuickAction) null);
                }
                f(intent.getIntArrayExtra("EXTRA_MESSAGE_INSIGHTS_NOTIFICATION_IDS"));
                if (intent.getBooleanExtra("EXTRA_FRAUD_DISMISS", false)) {
                    boolean booleanExtra = intent.getBooleanExtra("EXTRA_FRAUD_DISMISS_IS_SENDER_LEVEL", false);
                    java.lang.String stringExtra = intent.getStringExtra("EXTRA_FRAUD_DISMISS_MESSAGE_ID");
                    java.lang.String stringExtra2 = intent.getStringExtra("EXTRA_FRAUD_DISMISS_CONVERSATION_ID");
                    kv1.i iVar = this.n;
                    com.truecaller.insights.fraud.analytics.FraudUserActionType fraudUserActionType = com.truecaller.insights.fraud.analytics.FraudUserActionType.DISMISS;
                    if (booleanExtra) {
                        fraudActionScope = com.truecaller.insights.fraud.analytics.FraudActionScope.SENDER;
                    } else {
                        fraudActionScope = com.truecaller.insights.fraud.analytics.FraudActionScope.MESSAGE;
                    }
                    com.truecaller.insights.fraud.analytics.FraudActionScope fraudActionScope2 = fraudActionScope;
                    com.truecaller.insights.fraud.analytics.FraudActionSurface fraudActionSurface = com.truecaller.insights.fraud.analytics.FraudActionSurface.NOTIFICATION;
                    com.truecaller.insights.fraud.analytics.FraudLabelValue fraudLabelValue = com.truecaller.insights.fraud.analytics.FraudLabelValue.IGNORED;
                    iVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fraudUserActionType, "action");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fraudActionScope2, "scope");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fraudActionSurface, "surface");
                    iVar.a.d(new kv1.e(fraudUserActionType, fraudActionScope2, stringExtra, stringExtra2, fraudActionSurface, null, fraudLabelValue, null, null));
                    return;
                }
                return;
            }
            long[] longArrayExtra9 = intent.getLongArrayExtra("EXTRA_CONVERSATION_IDS");
            if (longArrayExtra9 != null && longArrayExtra9.length != 0) {
                if (notificationIdentifier2 != null) {
                    ((s62.f) this.j).b(notificationIdentifier2.a, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), notificationIdentifier2.b, "notificationIncomingMessage");
                }
                long[] longArrayExtra10 = intent.getLongArrayExtra("EXTRA_MESSAGE_IDS");
                if (longArrayExtra10 != null && longArrayExtra10.length != 0) {
                    this.h.h(longArrayExtra10[longArrayExtra10.length - 1], "dismiss");
                }
            }
        }
    }
}
