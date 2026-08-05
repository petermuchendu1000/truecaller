package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class w implements com.truecaller.messaging.notifications.t {
    public long A = -100;
    public long B = -1;
    public final m02.s C;
    public final kx1.bar D;
    public final u03.f0 E;
    public final a32.x F;
    public final xz1.j G;
    public final com.truecaller.messaging.notifications.g H;
    public final bw1.bar I;
    public final android.content.Context a;
    public final u62.i b;
    public final s62.d c;
    public final s62.g d;
    public final m03.s e;
    public final m03.y0 f;
    public final to1.g g;
    public final xz1.q h;
    public final com.truecaller.messaging.notifications.z i;
    public final yd3.qux j;
    public final y12.a0 k;
    public final qc3.bar l;
    public final qc3.bar m;
    public final m03.p n;
    public final com.truecaller.messaging.notifications.d0 o;
    public final com.truecaller.messaging.notifications.j p;
    public final com.truecaller.messaging.notifications.k q;
    public final p81.bar r;
    public final ix1.d s;
    public final dn.qux t;
    public final com.truecaller.messaging.notifications.h0 u;
    public final qo1.j v;
    public final qc3.bar w;
    public final qo1.k x;
    public final we1.a y;
    public final qc3.bar z;

    public w(android.content.Context context, s62.d dVar, s62.g gVar, m03.s sVar, m03.y0 y0Var, to1.g gVar2, xz1.q qVar, u62.i iVar, com.truecaller.messaging.notifications.z zVar, y12.a0 a0Var, qc3.bar barVar, qc3.bar barVar2, m03.p pVar, com.truecaller.messaging.notifications.d0 d0Var, com.truecaller.messaging.notifications.j jVar, com.truecaller.messaging.notifications.k kVar, p81.bar barVar3, ix1.d dVar2, dn.qux quxVar, yd3.qux quxVar2, com.truecaller.messaging.notifications.h0 h0Var, qo1.k kVar2, qo1.j jVar2, m02.s sVar2, qc3.bar barVar4, we1.a aVar, qc3.bar barVar5, kx1.bar barVar6, u03.f0 f0Var, a32.x xVar, com.truecaller.messaging.notifications.g gVar3, xz1.j jVar3, bw1.bar barVar7) {
        this.a = context;
        this.c = dVar;
        this.d = gVar;
        this.e = sVar;
        this.f = y0Var;
        this.g = gVar2;
        this.h = qVar;
        this.b = iVar;
        this.i = zVar;
        this.j = quxVar2;
        this.k = a0Var;
        this.l = barVar;
        this.m = barVar2;
        this.n = pVar;
        this.o = d0Var;
        this.p = jVar;
        this.q = kVar;
        this.r = barVar3;
        this.s = dVar2;
        this.t = quxVar;
        this.u = h0Var;
        this.x = kVar2;
        this.C = sVar2;
        this.v = jVar2;
        this.w = barVar4;
        this.y = aVar;
        this.z = barVar5;
        this.D = barVar6;
        this.E = f0Var;
        this.F = xVar;
        this.H = gVar3;
        this.G = jVar3;
        this.I = barVar7;
    }

    public static boolean n(zt1.baz bazVar) {
        zt1.bar barVar;
        com.truecaller.insights.core.notification.InsightsNotifType insightsNotifType;
        com.truecaller.insights.catx.processor.Decision decision = null;
        if (bazVar != null) {
            barVar = bazVar.c;
        } else {
            barVar = null;
        }
        if (barVar != null) {
            insightsNotifType = barVar.b;
        } else {
            insightsNotifType = null;
        }
        if (barVar != null) {
            decision = barVar.a.c;
        }
        if (insightsNotifType == com.truecaller.insights.core.notification.InsightsNotifType.REGULAR_MID && decision == com.truecaller.insights.catx.processor.Decision.VERIFIED_NON_SPAM) {
            return true;
        }
        return false;
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void a(long j) {
        if (this.A == j) {
            this.A = -100L;
        }
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void b(long j) {
        this.A = j;
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void c(java.util.Collection collection) {
        ((com.truecaller.messaging.notifications.g0) this.o).c(collection);
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void d(com.truecaller.messaging.data.types.Message message) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        java.util.Objects.requireNonNull(myLooper);
        android.os.Handler handler = new android.os.Handler(myLooper);
        boolean a = ((qo1.l) this.x).a.a("featureMessagingDBLookupLogicAdjustment", com.truecaller.featuretoggles.FeatureState.DISABLED);
        com.truecaller.messaging.notifications.g gVar = this.H;
        if (!a) {
            t(null, message);
            gVar.a(message, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t(8), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t(9));
        } else {
            gVar.a(message, new c80.p(11, this, handler), new a2.q(this, handler, message, 14));
        }
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void e(com.truecaller.messaging.data.types.Message message) {
        long j = this.A;
        long j2 = message.b;
        if (j == j2) {
            return;
        }
        this.B = j2;
        s62.f fVar = (s62.f) this.c;
        java.lang.String o = fVar.o("miscellaneous_channel");
        android.content.Context context = this.a;
        f6.f0 f0Var = new f6.f0(context, o);
        android.app.Notification notification = f0Var.Q;
        notification.icon = 2131232903;
        f0Var.D = context.getColor(2131099683);
        com.truecaller.data.entity.messaging.Participant participant = message.c;
        android.content.res.Resources resources = context.getResources();
        java.lang.String string = resources.getString(2132018212);
        java.lang.String string2 = resources.getString(2132018206, ak.r0.C(participant));
        f0Var.j(string);
        f0Var.i(string2);
        f0Var.m(android.graphics.BitmapFactory.decodeResource(context.getResources(), 2131232904));
        java.lang.String valueOf = java.lang.String.valueOf(message.a);
        int hashCode = valueOf.hashCode();
        com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier = new com.truecaller.messaging.notifications.NotificationIdentifier(2131363806, valueOf, hashCode);
        s62.h hVar = (s62.h) this.d;
        bo.p a = hVar.a();
        a.c = 1275068416;
        a.b = hashCode;
        android.content.Intent[] k = qe0.i1.k(context, java.util.Collections.singletonList(message), notificationIdentifier, "view_failed_message");
        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
        f0Var.g = a.d(k, pushNotificationSource.getType(), "notificationFailedMessage");
        java.lang.String string3 = resources.getString(2132018210);
        bo.p a2 = hVar.a();
        a2.b = hashCode;
        a2.e = java.lang.Integer.valueOf(com.truecaller.analytics.common.event.PushNotificationAction.LeftButton.getType());
        int i = com.truecaller.messaging.notifications.NotificationBroadcastReceiver.o;
        f0Var.a(2131232446, a2.k(pushNotificationSource.getType(), "notificationFailedMessage", com.truecaller.messaging.notifications.NotificationBroadcastReceiver.e(context, "com.truecaller.messaging.notifications.ERROR_DISMISSED", java.util.Collections.singletonList(message), false, notificationIdentifier, "")), string3);
        java.lang.String string4 = resources.getString(2132018211);
        bo.p a3 = hVar.a();
        a3.b = hashCode;
        a3.e = java.lang.Integer.valueOf(com.truecaller.analytics.common.event.PushNotificationAction.RightButton.getType());
        f0Var.a(2131233233, a3.i(pushNotificationSource.getType(), "notificationFailedMessage", com.truecaller.messaging.notifications.NotificationBroadcastReceiver.e(this.a, "com.truecaller.messaging.notifications.RESEND", java.util.Collections.singletonList(message), false, notificationIdentifier, "")), string4);
        notification.when = message.e.i();
        f0Var.f(true);
        v(f0Var, message.k);
        bo.p a4 = hVar.a();
        a4.b = hashCode;
        a4.c = 201326592;
        notification.deleteIntent = a4.k(pushNotificationSource.getType(), "notificationFailedMessage", com.truecaller.messaging.notifications.NotificationBroadcastReceiver.e(context, "com.truecaller.messaging.notifications.ERROR_DISMISSED", java.util.Collections.singletonList(message), false, notificationIdentifier, ""));
        fVar.w(valueOf, 2131363806, f0Var.d(), pushNotificationSource.getType(), "notificationFailedMessage");
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void f(com.truecaller.messaging.data.types.Conversation conversation) {
        com.truecaller.data.entity.messaging.Participant participant = conversation.l[0];
        long j = conversation.a;
        java.lang.String valueOf = java.lang.String.valueOf(j);
        int hashCode = java.lang.String.valueOf(j).hashCode();
        s62.f fVar = (s62.f) this.c;
        java.lang.String o = fVar.o("personal_chats");
        bo.p a = ((s62.h) this.d).a();
        a.b = hashCode;
        long j2 = conversation.a;
        int i = com.truecaller.messaging.conversation.ConversationActivity.f0;
        android.content.Context context = this.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notificationHiddenNumberResolved", "analyticsContext");
        android.content.Intent[] q = h0.s.q(context, j2, -1L, "notificationHiddenNumberResolved", false, (java.util.List) null, (com.truecaller.messaging.notifications.NotificationIdentifier) null, (java.lang.String) null, 2032);
        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
        android.app.PendingIntent d = a.d(q, pushNotificationSource.getType(), "notificationHiddenNumberResolved");
        android.content.Context context2 = this.a;
        f6.f0 f0Var = new f6.f0(context2, o);
        f0Var.Q.icon = 2131232903;
        f0Var.D = context2.getColor(2131101542);
        f0Var.e = f6.f0.e(context2.getString(2132018207));
        f0Var.f = f6.f0.e(context2.getString(2132017823));
        f0Var.g = d;
        f0Var.l(16, true);
        java.lang.String str = participant.p;
        this.e.getClass();
        fVar.w(valueOf, 2131364444, this.b.a(f0Var, new a93.c(14, this, h81.a.C(str, true))), pushNotificationSource.getType(), "notificationHiddenNumberResolved");
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void g(java.util.Map map) {
        try {
            u(map);
        } catch (java.util.concurrent.CancellationException e) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
        }
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void h(long j) {
        if (j == this.B) {
            ((s62.f) this.c).a(2131363806, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationFailedMessage");
            this.B = -1L;
        }
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void i() {
        android.widget.Toast.makeText(this.a, 2132018209, 0).show();
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void j(com.truecaller.messaging.data.types.Message message) {
        com.truecaller.data.entity.messaging.Participant participant = message.c;
        java.lang.String C = ak.r0.C(participant);
        java.lang.String m = m(message.f.i());
        android.content.Context context = this.a;
        java.lang.String string = context.getString(2132018875);
        java.lang.String string2 = context.getString(2132018874, C, m);
        java.lang.String str = participant.p;
        this.e.getClass();
        s(message, j0.b.v(fj.a.u(h81.a.C(str, true)), context), string, string2, "notificationSentScheduledMessage");
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void k(com.truecaller.messaging.data.types.Message message) {
        java.lang.String C = ak.r0.C(message.c);
        java.lang.String m = m(message.f.i());
        android.content.Context context = this.a;
        s(message, android.graphics.BitmapFactory.decodeResource(context.getResources(), 2131232904), context.getString(2132018873), context.getString(2132018872, C, m), "notificationFailedScheduledMessage");
    }

    @Override // com.truecaller.messaging.notifications.t
    public final void l(com.truecaller.messaging.data.types.Message message) {
        int i = com.truecaller.messaging.notifications.ClassZeroActivity.k0;
        android.content.Context context = this.a;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.messaging.notifications.ClassZeroActivity.class);
        intent.putExtra("extra_message_values", message);
        intent.setFlags(402653184);
        context.startActivity(intent);
    }

    public final java.lang.String m(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        m03.p pVar = this.n;
        sb.append(pVar.c(j, "dd MMM"));
        sb.append(", ");
        sb.append(pVar.e(j));
        return sb.toString();
    }

    public final boolean o(com.truecaller.messaging.data.types.Message message) {
        boolean z;
        com.truecaller.data.entity.messaging.Participant participant = message.c;
        if (this.g.g() && !this.C.a()) {
            z = true;
        } else {
            z = false;
        }
        return participant.m(z);
    }

    public final void p(java.lang.String str, java.lang.String str2, java.util.List list) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) it.next();
            com.truecaller.data.entity.messaging.Participant participant = message.c;
            hashMap.put(participant.e, participant);
            java.util.List list2 = (java.util.List) hashMap2.get(participant.e);
            if (list2 == null) {
                list2 = new java.util.ArrayList();
                hashMap2.put(participant.e, list2);
            }
            list2.add(com.truecaller.messaging.data.types.Message.d(message.n.d0(), message.e));
        }
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            this.p.a(new kotlin.Pair((com.truecaller.data.entity.messaging.Participant) entry.getValue(), ((p81.baz) this.r).c(((com.truecaller.data.entity.messaging.Participant) entry.getValue()).h)), str, str2, (java.util.List) hashMap2.get(entry.getKey()));
        }
    }

    public final boolean q(com.truecaller.messaging.data.types.Message message) {
        if (this.v.b.a("featureInsightsUnifiedMidFlow", com.truecaller.featuretoggles.FeatureState.DISABLED) || !((ix1.e) this.s).g()) {
            return false;
        }
        gu1.b bVar = (gu1.b) this.m.get();
        kf.b bVar2 = new kf.b(message, this.k, this.d);
        gu1.l lVar = (gu1.l) bVar;
        lVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar2, "smartNotificationsHelper");
        return ((java.lang.Boolean) fg3.h0.O(kotlin.coroutines.d.a, new go2.y0(lVar, message, bVar2, (df3.bar) null, 9))).booleanValue();
    }

    public final hu1.bar r(com.truecaller.messaging.data.types.Conversation conversation, com.truecaller.messaging.data.types.Message message) {
        java.lang.String str = message.a + (" synthetic_id: " + ((zr1.q) this.w.get()).b(message)) + (" notifId: " + yi3.bar.x(message));
        bt1.baz.a(k9.d.q("DUPLICATE_MID: To be shown: message_id: ", str));
        zt1.baz bazVar = (zt1.baz) yi3.bar.F(new ce1.bar(21), new com.truecaller.messaging.notifications.u(this, message, conversation));
        xz1.q qVar = this.h;
        if (bazVar != null && bazVar.d == com.truecaller.insights.core.notification.MaliciousSignal.FRAUD && !((xz1.r) qVar).x0()) {
            return new hu1.bar(false, bazVar);
        }
        yd3.qux quxVar = this.j;
        if (bazVar != null && bazVar.a && !((xz1.r) qVar).x0()) {
            quxVar.s(message);
            return new hu1.bar(true, bazVar);
        }
        if (bazVar != null && !bazVar.a && bazVar.d == com.truecaller.insights.core.notification.MaliciousSignal.SPAM && !((xz1.r) qVar).x0()) {
            return new hu1.bar(false, bazVar);
        }
        java.lang.Boolean bool = (java.lang.Boolean) yi3.bar.F(new ce1.bar(22), new com.truecaller.messaging.notifications.v(this, message, 0));
        if (!o(message) && bool.booleanValue()) {
            bt1.baz.a(k9.d.q("DUPLICATE_MID: smartnotif marked as seen: message_id: ", str));
            quxVar.s(message);
            return new hu1.bar(true, bazVar);
        }
        return new hu1.bar(false, bazVar);
    }

    public final void s(com.truecaller.messaging.data.types.Message message, android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        s62.f fVar = (s62.f) this.c;
        java.lang.String o = fVar.o("miscellaneous_channel");
        android.content.Context context = this.a;
        f6.f0 f0Var = new f6.f0(context, o);
        f0Var.e = f6.f0.e(str);
        f0Var.f = f6.f0.e(str2);
        v(f0Var, message.k);
        f0Var.t(new f6.y(0));
        java.lang.String valueOf = java.lang.String.valueOf(message.a);
        int hashCode = valueOf.hashCode();
        com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier = new com.truecaller.messaging.notifications.NotificationIdentifier(2131366245, valueOf, hashCode);
        bo.p a = ((s62.h) this.d).a();
        a.c = 1275068416;
        a.b = hashCode;
        android.content.Intent[] k = qe0.i1.k(context, java.util.Collections.singletonList(message), notificationIdentifier, "view_scheduled_message");
        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
        f0Var.g = a.d(k, pushNotificationSource.getType(), str3);
        f0Var.Q.icon = 2131232903;
        f0Var.D = context.getColor(2131099683);
        fVar.w(valueOf, 2131366245, this.b.a(f0Var, new com.google.firebase.crashlytics.internal.concurrency.baz(bitmap, 11)), pushNotificationSource.getType(), str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(com.truecaller.messaging.data.types.Conversation conversation, com.truecaller.messaging.data.types.Message message) {
        com.truecaller.messaging.data.types.Conversation conversation2;
        int i;
        boolean z;
        com.truecaller.messaging.notifications.FraudNotificationType fraudNotificationType;
        com.truecaller.insights.fraud.analytics.FraudWarningScope fraudWarningScope;
        java.lang.String str;
        int i2;
        com.truecaller.messaging.data.types.Message message2 = message;
        if (!this.e.b()) {
            return;
        }
        com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType insightsPerformanceTracker$TraceType = com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType.INSIGHTS_NOTIFICATION_FLOW;
        kx1.bar barVar = this.D;
        u03.y a = barVar.a(insightsPerformanceTracker$TraceType);
        java.util.HashMap hashMap = new java.util.HashMap();
        int i3 = 0;
        hashMap.put("is_dma", java.lang.String.valueOf(false));
        y12.a0 a0Var = this.k;
        if (conversation == null) {
            conversation2 = ((y12.b0) a0Var).a(message2.c.e);
        } else {
            conversation2 = conversation;
        }
        if (message2.b == -1 && conversation2 != null) {
            c22.f b = message2.b();
            b.b = conversation2.a;
            message2 = b.a();
        }
        com.truecaller.messaging.data.types.Message message3 = message2;
        com.truecaller.data.entity.messaging.Participant participant = message3.c;
        if (conversation2 != null) {
            i = conversation2.O;
        } else {
            i = 0;
        }
        kf.b bVar = new kf.b(message3, a0Var, this.d);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message3, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "smartNotificationsHelper");
        bu1.e eVar = new bu1.e(this.y, message3, i, bVar, (df3.bar) null);
        kotlin.coroutines.d dVar = kotlin.coroutines.d.a;
        zt1.baz bazVar = (zt1.baz) fg3.h0.O(dVar, eVar);
        boolean d = ((qo1.l) this.x).d();
        com.truecaller.messaging.notifications.d0 d0Var = this.o;
        if (d) {
            try {
                z = ((java.lang.Boolean) fg3.h0.O(dVar, new a2.r(this, 19))).booleanValue();
            } catch (java.lang.InterruptedException unused) {
                z = false;
            }
            if (z && conversation2 != null && bazVar != null && bazVar.d == com.truecaller.insights.core.notification.MaliciousSignal.FRAUD && !conversation2.a(false)) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(message3);
                hashMap2.put(conversation2, arrayList);
                java.util.HashMap hashMap3 = new java.util.HashMap();
                if (bazVar.b) {
                    fraudNotificationType = com.truecaller.messaging.notifications.FraudNotificationType.SILENT_FRAUD_NOTIFICATION;
                } else {
                    fraudNotificationType = com.truecaller.messaging.notifications.FraudNotificationType.HEADS_UP_FRAUD_NOTIFICATION;
                }
                hashMap3.put(message3, fraudNotificationType);
                java.util.HashMap hashMap4 = new java.util.HashMap();
                zt1.bar barVar2 = bazVar.c;
                if (barVar2 != null) {
                    com.truecaller.insights.catx.processor.Decision decision = barVar2.a.c;
                    if (decision == com.truecaller.insights.catx.processor.Decision.CONVICTED_FRAUD) {
                        fraudWarningScope = com.truecaller.insights.fraud.analytics.FraudWarningScope.SENDER;
                    } else if (decision == com.truecaller.insights.catx.processor.Decision.MESSAGE_FRAUD) {
                        fraudWarningScope = com.truecaller.insights.fraud.analytics.FraudWarningScope.MESSAGE;
                    }
                    if (fraudWarningScope != null) {
                        hashMap4.put(message3, fraudWarningScope);
                    }
                    ((com.truecaller.messaging.notifications.g0) d0Var).i(hashMap2, null, null, hashMap3, hashMap4);
                    return;
                }
                fraudWarningScope = null;
                if (fraudWarningScope != null) {
                }
                ((com.truecaller.messaging.notifications.g0) d0Var).i(hashMap2, null, null, hashMap3, hashMap4);
                return;
            }
        }
        if (this.F.b() && conversation2 != null && bazVar != null && bazVar.d == com.truecaller.insights.core.notification.MaliciousSignal.SPAM && !conversation2.a(false)) {
            java.util.HashMap hashMap5 = new java.util.HashMap();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(message3);
            hashMap5.put(conversation2, arrayList2);
            java.util.HashMap hashMap6 = new java.util.HashMap();
            hashMap6.put(message3, com.truecaller.messaging.notifications.SpamNotificationType.SILENT_SPAM_NOTIFICATION);
            ((com.truecaller.messaging.notifications.g0) d0Var).i(hashMap5, hashMap6, null, null, null);
            return;
        }
        if (bazVar != null && bazVar.a) {
            barVar.b(a, hashMap);
            return;
        }
        if (!o(message3)) {
            yi3.bar.F(new ce1.bar(23), new com.truecaller.messaging.notifications.v(this, message3, 1));
        }
        long millis = java.util.concurrent.TimeUnit.DAYS.toMillis(2L);
        org.joda.time.DateTime P = new org.joda.time.DateTime().P();
        org.joda.time.base.BasePeriod basePeriod = new org.joda.time.base.BasePeriod(new int[]{0, 0, 0, 0, 10, 0, 0, 0}, org.joda.time.PeriodType.k());
        org.joda.time.chrono.BaseChronology g = P.g();
        long i4 = P.i();
        org.joda.time.chrono.BaseChronology baseChronology = g;
        baseChronology.getClass();
        int size = basePeriod.size();
        while (i3 < size) {
            long value = basePeriod.getValue(i3);
            if (value != 0) {
                i2 = i3;
                i4 = basePeriod.a(i3).a(baseChronology).b(i4, 1 * value);
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
        if (P.O(i4).n()) {
            if (message3.k == 2) {
                str = participant.e;
            } else {
                str = participant.d;
            }
            if (!this.t.A(this.a, str)) {
                int i5 = (int) ne0.baz.i.getLong("featurePromoIncomingMsgCount", 0);
                xz1.r rVar = (xz1.r) this.h;
                if (rVar.C("pendingIncomingMsgNotificationsCount", 0) < i5 && new org.joda.time.DateTime(rVar.D("LastMessagePromotionDate", 0L)).M(1, millis).n()) {
                    com.truecaller.data.entity.messaging.Participant participant2 = (com.truecaller.data.entity.messaging.Participant) this.q.a(java.util.Collections.singletonList(message3)).get(participant.e);
                    if (participant2 != null) {
                        participant = participant2;
                    }
                    s62.f fVar = (s62.f) this.c;
                    android.app.Notification a2 = this.i.a(participant, fVar.o("miscellaneous_channel"));
                    if (a2 != null) {
                        fVar.v(2131365332, a2, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationIncomingMessagePromo");
                        rVar.d0("pendingIncomingMsgNotificationsCount", rVar.C("pendingIncomingMsgNotificationsCount", 0) + 1);
                        org.joda.time.DateTime dateTime = new org.joda.time.DateTime();
                        rVar.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "value");
                        rVar.e0("LastMessagePromotionDate", dateTime.i());
                    }
                }
            }
        }
        barVar.b(a, hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x02d6, code lost:
    
        if (r0 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0277, code lost:
    
        if (r0 != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0220 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0320  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(java.util.Map map) {
        qc3.bar barVar;
        java.util.ArrayList arrayList;
        com.truecaller.messaging.data.types.Message message;
        java.util.ArrayList arrayList2;
        java.lang.String str;
        java.util.ArrayList arrayList3;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        qc3.bar barVar2;
        java.util.HashMap hashMap3;
        com.truecaller.messaging.data.types.Conversation conversation;
        com.truecaller.messaging.notifications.w wVar;
        java.util.ArrayList arrayList4;
        hu1.bar barVar3;
        hu1.bar barVar4;
        boolean booleanValue;
        zt1.baz bazVar;
        qo1.l lVar;
        boolean z;
        com.truecaller.messaging.notifications.FraudNotificationType fraudNotificationType;
        com.truecaller.insights.fraud.analytics.FraudWarningScope fraudWarningScope;
        java.util.HashMap hashMap4;
        java.util.HashMap hashMap5;
        java.util.HashMap hashMap6;
        gj3.bar a;
        a32.x xVar;
        com.truecaller.messaging.notifications.VerifiedNonSpamNotificationType verifiedNonSpamNotificationType;
        boolean z2;
        com.truecaller.messaging.notifications.SpamNotificationType spamNotificationType;
        com.truecaller.messaging.notifications.w wVar2 = this;
        java.util.HashMap hashMap7 = new java.util.HashMap();
        java.util.HashMap hashMap8 = new java.util.HashMap();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.HashMap hashMap9 = new java.util.HashMap();
        java.util.HashMap hashMap10 = new java.util.HashMap();
        java.util.HashMap hashMap11 = new java.util.HashMap();
        java.util.HashMap hashMap12 = new java.util.HashMap();
        java.util.Iterator it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            barVar = wVar2.l;
            java.lang.String str2 = "conversation";
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            boolean z3 = true;
            com.truecaller.messaging.data.types.Conversation conversation2 = (com.truecaller.messaging.data.types.Conversation) entry.getKey();
            for (com.truecaller.messaging.data.types.Message message2 : (java.util.List) entry.getValue()) {
                com.truecaller.messaging.notifications.h0 h0Var = wVar2.u;
                qc3.bar barVar5 = barVar;
                java.util.LinkedHashSet linkedHashSet = h0Var.h;
                java.util.ArrayList arrayList8 = arrayList6;
                u03.z zVar = h0Var.f;
                java.util.Iterator it2 = it;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversation2, str2);
                java.lang.String str3 = str2;
                long j = conversation2.a;
                if (((qo1.l) h0Var.c).h() && zVar.j() && j != h0Var.i) {
                    int i = message2.k;
                    long j2 = message2.a;
                    if (i == 0) {
                        long i2 = message2.e.i();
                        h0Var.d.getClass();
                        if (java.lang.Math.abs(i2 - java.lang.System.currentTimeMillis()) < com.truecaller.messaging.notifications.i0.a) {
                            arrayList = arrayList7;
                            if (h0Var.b.z("shouldTreatSmsAsUrgent", false) && !linkedHashSet.contains(java.lang.Long.valueOf(j2)) && zVar.j()) {
                                linkedHashSet.add(java.lang.Long.valueOf(j2));
                                int i3 = com.truecaller.messaging.urgent.service.UrgentMessageService.j;
                                o40.bar.q(h0Var.a, h0Var.a(conversation2, message2));
                            }
                            long j3 = message2.a;
                            if (wVar2.A != message2.b) {
                                arrayList5.add(message2);
                                barVar = barVar5;
                                arrayList6 = arrayList8;
                                it = it2;
                                str2 = str3;
                                arrayList7 = arrayList;
                            } else {
                                yd3.qux quxVar = wVar2.j;
                                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) quxVar.c;
                                boolean a2 = wVar2.v.a.a("featureInsightsDistinctNotificationFlow", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG);
                                com.truecaller.messaging.data.types.Conversation conversation3 = conversation2;
                                kx1.bar barVar6 = wVar2.D;
                                if (a2) {
                                    barVar4 = (hu1.bar) concurrentHashMap.get(java.lang.Long.valueOf(j3));
                                    if (barVar4 == null) {
                                        u03.y a3 = barVar6.a(com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType.INSIGHTS_NOTIFICATION_FLOW);
                                        java.util.HashMap hashMap13 = new java.util.HashMap();
                                        hashMap13.put("is_dma", java.lang.String.valueOf(z3));
                                        message = message2;
                                        arrayList6 = arrayList8;
                                        hashMap = hashMap8;
                                        arrayList2 = arrayList5;
                                        str = str3;
                                        java.util.ArrayList arrayList9 = arrayList;
                                        hashMap2 = hashMap10;
                                        barVar2 = barVar5;
                                        hashMap3 = hashMap7;
                                        arrayList3 = arrayList9;
                                        barVar4 = (hu1.bar) yi3.bar.F(new ce1.bar(19), new com.truecaller.messaging.notifications.u(wVar2, conversation3, message, arrayList6, arrayList9, 0));
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "notificationState");
                                        concurrentHashMap.put(java.lang.Long.valueOf(j3), barVar4);
                                        barVar6.b(a3, hashMap13);
                                    } else {
                                        message = message2;
                                        arrayList2 = arrayList5;
                                        arrayList6 = arrayList8;
                                        str = str3;
                                        arrayList3 = arrayList;
                                        hashMap = hashMap8;
                                        hashMap2 = hashMap10;
                                        barVar2 = barVar5;
                                        hashMap3 = hashMap7;
                                    }
                                } else {
                                    message = message2;
                                    arrayList2 = arrayList5;
                                    arrayList6 = arrayList8;
                                    str = str3;
                                    arrayList3 = arrayList;
                                    hashMap = hashMap8;
                                    hashMap2 = hashMap10;
                                    barVar2 = barVar5;
                                    hashMap3 = hashMap7;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                                    if (((java.util.concurrent.CopyOnWriteArraySet) quxVar.b).contains(java.lang.Integer.valueOf(yi3.bar.x(message)))) {
                                        barVar4 = new hu1.bar(true, null);
                                    } else {
                                        u03.y a4 = barVar6.a(com.truecaller.insights.tracking.performance.InsightsPerformanceTracker$TraceType.INSIGHTS_NOTIFICATION_FLOW);
                                        java.util.HashMap hashMap14 = new java.util.HashMap();
                                        hashMap14.put("is_dma", java.lang.String.valueOf(true));
                                        conversation = conversation3;
                                        wVar = this;
                                        arrayList4 = arrayList3;
                                        barVar3 = (hu1.bar) yi3.bar.F(new ce1.bar(20), new com.truecaller.messaging.notifications.u(this, conversation, message, arrayList6, arrayList3, 1));
                                        barVar6.b(a4, hashMap14);
                                        booleanValue = ((java.lang.Boolean) wVar.G.e.getValue()).booleanValue();
                                        bazVar = barVar3.b;
                                        boolean z4 = barVar3.a;
                                        lVar = (qo1.l) wVar.x;
                                        if (lVar.d()) {
                                            try {
                                                z = ((java.lang.Boolean) fg3.h0.O(kotlin.coroutines.d.a, new a2.r(wVar, 19))).booleanValue();
                                            } catch (java.lang.InterruptedException unused) {
                                                z = false;
                                            }
                                            if (z && bazVar != null && bazVar.d == com.truecaller.insights.core.notification.MaliciousSignal.FRAUD) {
                                                if (bazVar.b) {
                                                    fraudNotificationType = com.truecaller.messaging.notifications.FraudNotificationType.SILENT_FRAUD_NOTIFICATION;
                                                } else {
                                                    fraudNotificationType = com.truecaller.messaging.notifications.FraudNotificationType.HEADS_UP_FRAUD_NOTIFICATION;
                                                }
                                                hashMap11.put(message, fraudNotificationType);
                                                zt1.bar barVar7 = bazVar.c;
                                                if (barVar7 != null) {
                                                    com.truecaller.insights.catx.processor.Decision decision = barVar7.a.c;
                                                    if (decision == com.truecaller.insights.catx.processor.Decision.CONVICTED_FRAUD) {
                                                        fraudWarningScope = com.truecaller.insights.fraud.analytics.FraudWarningScope.SENDER;
                                                    } else if (decision == com.truecaller.insights.catx.processor.Decision.MESSAGE_FRAUD) {
                                                        fraudWarningScope = com.truecaller.insights.fraud.analytics.FraudWarningScope.MESSAGE;
                                                    }
                                                    if (fraudWarningScope != null) {
                                                        hashMap12.put(message, fraudWarningScope);
                                                    }
                                                    hashMap4 = hashMap2;
                                                    if (message.t != 4 && conversation.u != 0 && lVar.g()) {
                                                        ((y12.v) ((xd0.qux) barVar2.get()).a()).V(j3);
                                                        hashMap10 = hashMap4;
                                                        wVar2 = wVar;
                                                        arrayList7 = arrayList4;
                                                        hashMap7 = hashMap3;
                                                        hashMap8 = hashMap;
                                                        it = it2;
                                                        arrayList5 = arrayList2;
                                                        str2 = str;
                                                        z3 = true;
                                                        conversation2 = conversation;
                                                        barVar = barVar2;
                                                    } else {
                                                        if (!wVar.o(message)) {
                                                            hashMap5 = hashMap;
                                                            ((java.util.List) com.mbridge.msdk.config.component.common.express.operator.baz.f(hashMap5, conversation, new bi3.a0(5))).add(message);
                                                            hashMap6 = hashMap3;
                                                        } else {
                                                            hashMap5 = hashMap;
                                                            qc3.bar barVar8 = wVar.z;
                                                            if (((h32.baz) ((h32.bar) barVar8.get())).a(message)) {
                                                                hashMap6 = hashMap3;
                                                                java.util.List list = (java.util.List) hashMap6.get(conversation);
                                                                if (list == null) {
                                                                    list = new java.util.ArrayList();
                                                                    hashMap6.put(conversation, list);
                                                                }
                                                                list.add(message);
                                                            } else {
                                                                hashMap6 = hashMap3;
                                                                h32.baz bazVar2 = (h32.baz) ((h32.bar) barVar8.get());
                                                                bazVar2.getClass();
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                                                                android.content.ContentResolver contentResolver = bazVar2.d;
                                                                android.net.Uri q = h81.a.q(j3);
                                                                android.content.ContentValues contentValues = new android.content.ContentValues();
                                                                contentValues.put("seen", (java.lang.Integer) 1);
                                                                contentValues.put("info24", (java.lang.Integer) 0);
                                                                kotlin.Unit unit = kotlin.Unit.a;
                                                                contentResolver.update(q, contentValues, null, null);
                                                                i32.baz bazVar3 = bazVar2.b;
                                                                kotlin.Lazy lazy = bazVar3.c;
                                                                kotlin.Lazy lazy2 = bazVar3.c;
                                                                if (((java.util.List) lazy.getValue()).isEmpty()) {
                                                                    a = null;
                                                                } else {
                                                                    org.joda.time.LocalTime localTime = new org.joda.time.LocalTime();
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localTime, "now(...)");
                                                                    org.joda.time.DateTime b = i32.baz.b(localTime);
                                                                    a = i32.baz.a(((com.truecaller.messaging.notifications.mass.dnd.PeriodTime) ((java.util.List) lazy2.getValue()).get(0)).getEnd());
                                                                    for (com.truecaller.messaging.notifications.mass.dnd.PeriodTime periodTime : (java.util.List) lazy2.getValue()) {
                                                                        org.joda.time.DateTime a5 = i32.baz.a(periodTime.getStart());
                                                                        gj3.bar a6 = i32.baz.a(periodTime.getEnd());
                                                                        if (a5.j(a6) && a5.m(b)) {
                                                                            a6 = a6.B(1);
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a6, "plusDays(...)");
                                                                        }
                                                                        long i4 = a6.i() - b.i();
                                                                        long i5 = a.i() - b.i();
                                                                        if ((1 <= i4 && i4 <= i5) || i5 < 0) {
                                                                            a = a6;
                                                                        }
                                                                    }
                                                                }
                                                                if (a != null) {
                                                                    a.toString();
                                                                    nd.j0 j0Var = bazVar2.c;
                                                                    long i6 = a.i() - new org.joda.time.DateTime().i();
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j0Var, "workManager");
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.messaging.notifications.mass.MassDndWorker.class, "workerClass");
                                                                    j0Var.g("MassDndWorker", nd.l.a, new f6.v0(com.truecaller.messaging.notifications.mass.MassDndWorker.class).x(i6, java.util.concurrent.TimeUnit.MILLISECONDS).d());
                                                                }
                                                            }
                                                        }
                                                        hashMap10 = hashMap4;
                                                        hashMap7 = hashMap6;
                                                        wVar2 = wVar;
                                                        hashMap8 = hashMap5;
                                                        arrayList7 = arrayList4;
                                                        it = it2;
                                                        arrayList5 = arrayList2;
                                                        str2 = str;
                                                        z3 = true;
                                                        conversation2 = conversation;
                                                        barVar = barVar2;
                                                    }
                                                }
                                                fraudWarningScope = null;
                                                if (fraudWarningScope != null) {
                                                }
                                                hashMap4 = hashMap2;
                                                if (message.t != 4) {
                                                }
                                                if (!wVar.o(message)) {
                                                }
                                                hashMap10 = hashMap4;
                                                hashMap7 = hashMap6;
                                                wVar2 = wVar;
                                                hashMap8 = hashMap5;
                                                arrayList7 = arrayList4;
                                                it = it2;
                                                arrayList5 = arrayList2;
                                                str2 = str;
                                                z3 = true;
                                                conversation2 = conversation;
                                                barVar = barVar2;
                                            }
                                        }
                                        xVar = wVar.F;
                                        if (!xVar.b() || booleanValue) {
                                            if (bazVar == null && bazVar.d == com.truecaller.insights.core.notification.MaliciousSignal.SPAM) {
                                                if (xVar.a() == com.truecaller.messaging.MessagingLevel.HIGH) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (!z2) {
                                                    if (bazVar.b) {
                                                        spamNotificationType = com.truecaller.messaging.notifications.SpamNotificationType.SILENT_SPAM_NOTIFICATION;
                                                    } else {
                                                        spamNotificationType = com.truecaller.messaging.notifications.SpamNotificationType.HEADS_UP_SPAM_NOTIFICATION;
                                                    }
                                                    hashMap9.put(message, spamNotificationType);
                                                    hashMap4 = hashMap2;
                                                    if (message.t != 4) {
                                                    }
                                                    if (!wVar.o(message)) {
                                                    }
                                                    hashMap10 = hashMap4;
                                                    hashMap7 = hashMap6;
                                                    wVar2 = wVar;
                                                    hashMap8 = hashMap5;
                                                    arrayList7 = arrayList4;
                                                    it = it2;
                                                }
                                                wVar2 = wVar;
                                                arrayList7 = arrayList4;
                                                hashMap7 = hashMap3;
                                                hashMap8 = hashMap;
                                                it = it2;
                                                hashMap10 = hashMap2;
                                            } else {
                                                if (!booleanValue && n(bazVar)) {
                                                    if (!n(bazVar)) {
                                                        verifiedNonSpamNotificationType = com.truecaller.messaging.notifications.VerifiedNonSpamNotificationType.HEADS_UP;
                                                    } else if (bazVar != null && bazVar.b) {
                                                        verifiedNonSpamNotificationType = com.truecaller.messaging.notifications.VerifiedNonSpamNotificationType.SILENT;
                                                    } else {
                                                        verifiedNonSpamNotificationType = com.truecaller.messaging.notifications.VerifiedNonSpamNotificationType.HEADS_UP;
                                                    }
                                                    hashMap4 = hashMap2;
                                                    hashMap4.put(message, verifiedNonSpamNotificationType);
                                                } else {
                                                    hashMap4 = hashMap2;
                                                }
                                                if (message.t != 4) {
                                                }
                                                if (!wVar.o(message)) {
                                                }
                                                hashMap10 = hashMap4;
                                                hashMap7 = hashMap6;
                                                wVar2 = wVar;
                                                hashMap8 = hashMap5;
                                                arrayList7 = arrayList4;
                                                it = it2;
                                            }
                                        }
                                        arrayList5 = arrayList2;
                                        str2 = str;
                                        z3 = true;
                                        conversation2 = conversation;
                                        barVar = barVar2;
                                    }
                                }
                                wVar = this;
                                arrayList4 = arrayList3;
                                barVar3 = barVar4;
                                conversation = conversation3;
                                booleanValue = ((java.lang.Boolean) wVar.G.e.getValue()).booleanValue();
                                bazVar = barVar3.b;
                                boolean z43 = barVar3.a;
                                lVar = (qo1.l) wVar.x;
                                if (lVar.d()) {
                                }
                                xVar = wVar.F;
                                if (!xVar.b()) {
                                }
                                if (bazVar == null) {
                                }
                                if (!booleanValue) {
                                }
                                hashMap4 = hashMap2;
                            }
                        }
                    }
                }
                arrayList = arrayList7;
                long j33 = message2.a;
                if (wVar2.A != message2.b) {
                }
            }
        }
        com.truecaller.messaging.notifications.w wVar3 = wVar2;
        java.util.ArrayList arrayList10 = arrayList7;
        java.util.HashMap hashMap15 = hashMap7;
        java.util.ArrayList arrayList11 = arrayList5;
        java.util.HashMap hashMap16 = hashMap10;
        java.util.HashMap hashMap17 = hashMap8;
        java.util.Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            hashMap15.remove((com.truecaller.messaging.data.types.Conversation) it3.next());
        }
        com.truecaller.messaging.notifications.g0 g0Var = (com.truecaller.messaging.notifications.g0) wVar3.o;
        g0Var.i(hashMap15, hashMap9, hashMap16, hashMap11, hashMap12);
        g0Var.c(arrayList10);
        boolean isEmpty = hashMap17.isEmpty();
        s62.d dVar = wVar3.c;
        if (isEmpty) {
            ((s62.f) dVar).a(2131365480, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationBlockedMessage");
        } else {
            java.util.Iterator it4 = hashMap17.keySet().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                com.truecaller.messaging.data.types.Conversation conversation4 = (com.truecaller.messaging.data.types.Conversation) it4.next();
                java.util.List list2 = (java.util.List) hashMap17.get(conversation4);
                if (list2 != null) {
                    wVar3.p("inSpammerList", "spamNotification", list2);
                    if (!((xz1.r) wVar3.h).x0()) {
                        int size = list2.size();
                        long[] jArr = new long[size];
                        for (int i7 = 0; i7 < list2.size(); i7++) {
                            jArr[i7] = ((com.truecaller.messaging.data.types.Message) list2.get(i7)).a;
                        }
                        if (size > 0) {
                            ((y12.v) ((xd0.qux) barVar.get()).a()).o0(jArr);
                        }
                    } else {
                        s62.f fVar = (s62.f) dVar;
                        java.lang.String o = fVar.o("blocked_sms");
                        android.content.Context context = wVar3.a;
                        f6.f0 f0Var = new f6.f0(context, o);
                        com.truecaller.data.entity.messaging.Participant participant = ((com.truecaller.messaging.data.types.Message) list2.get(0)).c;
                        java.lang.String str4 = participant.n;
                        java.lang.String str5 = participant.e;
                        if (str4 != null && !str4.isEmpty()) {
                            str5 = bar.x(new java.lang.StringBuilder(), participant.n, " (", str5, ")");
                        }
                        java.lang.String valueOf = java.lang.String.valueOf(conversation4.a);
                        int i8 = (int) conversation4.a;
                        android.app.Notification notification = f0Var.Q;
                        notification.icon = 2131232897;
                        f0Var.D = bi3.a.s(wVar3.E.a, 2130970603);
                        f0Var.e = f6.f0.e(context.getResources().getQuantityString(2131886103, list2.size(), java.lang.Integer.valueOf(list2.size())));
                        f0Var.f = f6.f0.e(str5);
                        f0Var.m(t41.i.c(context.getDrawable(2131233405)));
                        s62.h hVar = (s62.h) wVar3.d;
                        bo.p a7 = hVar.a();
                        a7.b = i8;
                        java.util.Iterator it5 = it4;
                        android.content.Intent e = com.truecaller.messaging.notifications.NotificationBroadcastReceiver.e(context, "com.truecaller.messaging.notifications.DISMISSED", list2, false, new com.truecaller.messaging.notifications.NotificationIdentifier(2131365480, 0, 6), "");
                        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                        notification.deleteIntent = a7.k(pushNotificationSource.getType(), "notificationBlockedMessage", e);
                        android.content.Intent putExtra = y90.m6.m(context, com.truecaller.bottombar.BottomBarButtonType.MESSAGES, "notificationBlockedMessage").putExtra("inbox_tab", com.truecaller.messaging.data.types.InboxTab.SPAM);
                        qe0.i1.e(putExtra, list2);
                        qe0.i1.g(putExtra, "block_messages");
                        qe0.i1.h(2131365480, valueOf, putExtra);
                        java.lang.String str6 = ((com.truecaller.messaging.data.types.Message) list2.get(0)).c.e;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(putExtra, "<this>");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "address");
                        putExtra.putExtra("block_address", str6);
                        bo.p a8 = hVar.a();
                        a8.c = 335544320;
                        f0Var.g = a8.e(pushNotificationSource.getType(), "notificationBlockedMessage", putExtra);
                        fVar.w(valueOf, 2131365480, f0Var.d(), pushNotificationSource.getType(), "notificationBlockedMessage");
                        it4 = it5;
                    }
                }
            }
        }
        if (!arrayList11.isEmpty()) {
            wVar3.p("inConversationView", "conversation", arrayList11);
        }
    }

    public final void v(f6.f0 f0Var, int i) {
        int i2;
        int ringerMode = ((android.media.AudioManager) this.e.a.getSystemService("audio")).getRingerMode();
        if (((xz1.r) this.h).y0() && ringerMode != 0) {
            i2 = 6;
        } else {
            i2 = 4;
        }
        f0Var.k(i2);
        m03.y0 y0Var = this.f;
        if (i == 2) {
            f0Var.s(y0Var.a());
        } else {
            f0Var.s(y0Var.c());
        }
    }
}
