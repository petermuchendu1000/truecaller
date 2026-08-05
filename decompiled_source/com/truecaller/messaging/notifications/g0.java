package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class g0 implements com.truecaller.messaging.notifications.d0 {
    public final qc3.bar A;
    public final qc3.bar B;
    public final qc3.bar C;
    public final qc3.bar D;
    public final qc3.bar E;
    public final qc3.bar F;
    public final qc3.bar G;
    public final qc3.bar H;
    public final qc3.bar I;
    public final qc3.bar J;
    public final kv1.i K;
    public final qc3.bar L;
    public final qc3.bar M;
    public final kotlin.Lazy N;
    public final kotlin.Lazy O;
    public final java.util.concurrent.ConcurrentHashMap P;
    public final kotlin.Pair Q;
    public final kotlin.Pair R;
    public final kotlin.coroutines.CoroutineContext a;
    public final kotlin.coroutines.CoroutineContext b;
    public final android.content.Context c;
    public final m03.s d;
    public final qc3.bar e;
    public final qc3.bar f;
    public final qc3.bar g;
    public final xz1.q h;
    public final qc3.bar i;
    public final qc3.bar j;
    public final qc3.bar k;
    public final mg2.bar l;
    public final q11.bar m;
    public final qc3.bar n;
    public final qc3.bar o;
    public final qc3.bar p;
    public final qc3.bar q;
    public final qc3.bar r;
    public final qo1.j s;
    public final u03.z t;
    public final s32.d u;
    public final lf2.r v;
    public final u03.b w;
    public final qc3.bar x;
    public final qc3.bar y;
    public final qc3.bar z;

    public g0(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, android.content.Context context, m03.s sVar, qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3, xz1.q qVar, qc3.bar barVar4, qc3.bar barVar5, qc3.bar barVar6, mg2.bar barVar7, q11.bar barVar8, qc3.bar barVar9, qc3.bar barVar10, qc3.bar barVar11, qc3.bar barVar12, qc3.bar barVar13, qo1.j jVar, u03.z zVar, s32.d dVar, lf2.r rVar, u03.b bVar, qc3.bar barVar14, qc3.bar barVar15, qc3.bar barVar16, qc3.bar barVar17, qc3.bar barVar18, qc3.bar barVar19, qc3.bar barVar20, qc3.bar barVar21, qc3.bar barVar22, qc3.bar barVar23, qc3.bar barVar24, qc3.bar barVar25, qc3.bar barVar26, kv1.i iVar, qc3.bar barVar27, qc3.bar barVar28) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "cpuContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "deviceManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "avatarXPresenter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "searchHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "messagingFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "messageSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "ringtoneNotificationSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar5, "notificationState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar6, "messageUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar7, "profileRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar8, "accountSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar9, "readMessageStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar10, "conversationNotificationsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar11, "messagingNotificationSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar12, "systemNotificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar13, "pendingIntentFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "insightsFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zVar, "permissionUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "securedMessagesTabManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "bitmapConverter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "deviceInfoUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar14, "smsCategorizerFlagProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar15, "emojiUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar16, "trueHelperConversationHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar17, "messagingConfigsInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar18, "shortcutHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar19, "messagingShortcutNudge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar20, "messagingThreeLevelSpamHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar21, "fraudFlowAbTestHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar22, "verifiedRegularMidAbTestHelperImpl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar23, "categorizerFlagProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar24, "messageAnalyticsDataHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar25, "messageAnalytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar26, "customCTAIMNotification");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "fraudSystemAnalytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar27, "rawMessageIdHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar28, "universalConversationIdHelper");
        this.a = coroutineContext;
        this.b = coroutineContext2;
        this.c = context;
        this.d = sVar;
        this.e = barVar;
        this.f = barVar2;
        this.g = barVar3;
        this.h = qVar;
        this.i = barVar4;
        this.j = barVar5;
        this.k = barVar6;
        this.l = barVar7;
        this.m = barVar8;
        this.n = barVar9;
        this.o = barVar10;
        this.p = barVar11;
        this.q = barVar12;
        this.r = barVar13;
        this.s = jVar;
        this.t = zVar;
        this.u = dVar;
        this.v = rVar;
        this.w = bVar;
        this.x = barVar14;
        this.y = barVar15;
        this.z = barVar16;
        this.A = barVar17;
        this.B = barVar18;
        this.C = barVar19;
        this.D = barVar20;
        this.E = barVar21;
        this.F = barVar22;
        this.G = barVar23;
        this.H = barVar24;
        this.I = barVar25;
        this.J = barVar26;
        this.K = iVar;
        this.L = barVar27;
        this.M = barVar28;
        final int i = 0;
        this.N = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.messaging.notifications.e0
            public final /* synthetic */ com.truecaller.messaging.notifications.g0 b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int dimensionPixelSize;
                int i2 = i;
                com.truecaller.messaging.notifications.g0 g0Var = this.b;
                switch (i2) {
                    case 0:
                        dimensionPixelSize = g0Var.c.getResources().getDimensionPixelSize(2131166429);
                        break;
                    default:
                        dimensionPixelSize = g0Var.c.getResources().getDimensionPixelSize(android.R.dimen.notification_large_icon_height);
                        break;
                }
                return java.lang.Integer.valueOf(dimensionPixelSize);
            }
        });
        final int i2 = 1;
        this.O = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.messaging.notifications.e0
            public final /* synthetic */ com.truecaller.messaging.notifications.g0 b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int dimensionPixelSize;
                int i22 = i2;
                com.truecaller.messaging.notifications.g0 g0Var = this.b;
                switch (i22) {
                    case 0:
                        dimensionPixelSize = g0Var.c.getResources().getDimensionPixelSize(2131166429);
                        break;
                    default:
                        dimensionPixelSize = g0Var.c.getResources().getDimensionPixelSize(android.R.dimen.notification_large_icon_height);
                        break;
                }
                return java.lang.Integer.valueOf(dimensionPixelSize);
            }
        });
        this.P = new java.util.concurrent.ConcurrentHashMap();
        this.Q = new kotlin.Pair(128680, context.getString(2132023482));
        this.R = new kotlin.Pair(128680, context.getString(2132022068));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0254, code lost:
    
        if (r7 == false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x032f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(f6.f0 f0Var, java.util.TreeMap treeMap, java.lang.String str, boolean z, com.truecaller.messaging.notifications.SpamNotificationType spamNotificationType, boolean z2) {
        com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier;
        java.util.ArrayList arrayList;
        com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier2;
        qc3.bar barVar;
        java.lang.String str2;
        java.lang.String str3;
        android.content.Intent[] l;
        com.truecaller.messaging.data.types.Conversation conversation;
        java.lang.String str4;
        java.lang.String str5;
        boolean z3;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        java.lang.String str6;
        f6.f0 f0Var2;
        com.truecaller.data.entity.messaging.Participant participant;
        int i2;
        int i3;
        android.content.Intent putExtra;
        int i4;
        java.util.List a0;
        boolean z8;
        java.util.Iterator it;
        java.util.ArrayList arrayList2;
        com.truecaller.messaging.data.types.Message message;
        boolean z9;
        int i5;
        int i6;
        java.lang.String b;
        com.truecaller.messaging.data.types.Conversation conversation2 = (com.truecaller.messaging.data.types.Conversation) treeMap.lastKey();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(treeMap, "<this>");
        java.lang.Object a = kotlin.collections.p0.a(conversation2, treeMap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "getValue(...)");
        com.truecaller.messaging.data.types.Message message2 = (com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0((java.util.List) a);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it2 = treeMap.entrySet().iterator();
        while (it2.hasNext()) {
            java.util.List list = (java.util.List) ((java.util.Map.Entry) it2.next()).getValue();
            kotlin.jvm.internal.Intrinsics.d(list);
            kotlin.collections.d0.v(arrayList3, list);
        }
        if (z) {
            notificationIdentifier = new com.truecaller.messaging.notifications.NotificationIdentifier(2131365483, 0, 6);
        } else {
            notificationIdentifier = new com.truecaller.messaging.notifications.NotificationIdentifier(2131365483, java.lang.String.valueOf(conversation2.a), (int) conversation2.a);
        }
        com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier3 = notificationIdentifier;
        java.util.Set entrySet = treeMap.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        java.lang.Object c0 = kotlin.collections.CollectionsKt.c0(entrySet);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c0, "last(...)");
        java.util.Map.Entry entry = (java.util.Map.Entry) c0;
        java.lang.Object key = entry.getKey();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
        com.truecaller.messaging.data.types.Conversation conversation3 = (com.truecaller.messaging.data.types.Conversation) key;
        java.lang.Object value = entry.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
        int i7 = ((com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0((java.util.List) value)).t;
        qc3.bar barVar2 = this.g;
        if ((i7 != 4 && conversation3.q != 4) || !((qo1.l) ((qo1.k) barVar2.get())).g()) {
            barVar = barVar2;
            str2 = "<get-key>(...)";
            arrayList = arrayList3;
            notificationIdentifier2 = notificationIdentifier3;
            str3 = "<get-value>(...)";
            l = qe0.i1.l(this.c, arrayList, notificationIdentifier2, "view_message", (java.lang.String) null, 56);
        } else {
            arrayList = arrayList3;
            notificationIdentifier2 = notificationIdentifier3;
            barVar = barVar2;
            str2 = "<get-key>(...)";
            str3 = "<get-value>(...)";
            l = qe0.i1.l(this.c, arrayList, notificationIdentifier2, "view_message", (java.lang.String) null, 24);
        }
        android.content.Intent[] intentArr = l;
        android.content.Context context = this.c;
        com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier4 = notificationIdentifier2;
        java.util.ArrayList arrayList4 = arrayList;
        android.content.Intent e = com.truecaller.messaging.notifications.NotificationBroadcastReceiver.e(context, "com.truecaller.messaging.notifications.DISMISSED", arrayList4, false, notificationIdentifier4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "createDismissIntent(...)");
        boolean x = a.bar.x(message2);
        com.truecaller.messaging.data.types.TransportInfo transportInfo = message2.n;
        java.lang.String str7 = null;
        if (x) {
            com.truecaller.data.entity.messaging.Participant participant2 = message2.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participant2, "participant");
            boolean v = ak.e1.v(participant2);
            str5 = "participant";
            if (v) {
                b = null;
            } else {
                b = ((zr1.q) this.L.get()).b(message2);
            }
            conversation = conversation2;
            zr1.u uVar = (zr1.u) this.M.get();
            java.lang.Object key2 = entry.getKey();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, str2);
            java.lang.String b2 = uVar.b((com.truecaller.messaging.data.types.Conversation) key2);
            str4 = "<this>";
            e.putExtra("EXTRA_FRAUD_DISMISS", true);
            e.putExtra("EXTRA_FRAUD_DISMISS_IS_SENDER_LEVEL", v);
            e.putExtra("EXTRA_FRAUD_DISMISS_MESSAGE_ID", b);
            e.putExtra("EXTRA_FRAUD_DISMISS_CONVERSATION_ID", b2);
        } else {
            conversation = conversation2;
            str4 = "<this>";
            str5 = "participant";
        }
        qc3.bar barVar3 = this.r;
        bo.p a2 = ((s62.h) ((s62.g) barVar3.get())).a();
        int i8 = notificationIdentifier4.c;
        a2.b = i8;
        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
        f0Var.Q.deleteIntent = a2.k(pushNotificationSource.getType(), "notificationIncomingMessage", e);
        bo.p a3 = ((s62.h) ((s62.g) barVar3.get())).a();
        a3.b = i8;
        a3.c = 1275068416;
        f0Var.g = a3.d(intentArr, pushNotificationSource.getType(), "notificationIncomingMessage");
        if (((vx.bar) this.J.get()).c() && a.bar.z(message2) && (transportInfo instanceof com.truecaller.messaging.transport.im.ImTransportInfo)) {
            com.truecaller.messaging.data.types.QuickAction[] quickActionArr = ((com.truecaller.messaging.transport.im.ImTransportInfo) transportInfo).p;
            if (quickActionArr != null) {
                i6 = quickActionArr.length;
            } else {
                i6 = 0;
            }
            if (i6 > 0) {
                z3 = true;
                if (!z3) {
                    kotlin.jvm.internal.Intrinsics.e(transportInfo, "null cannot be cast to non-null type com.truecaller.messaging.transport.im.ImTransportInfo");
                    com.truecaller.messaging.data.types.QuickAction[] quickActionArr2 = ((com.truecaller.messaging.transport.im.ImTransportInfo) transportInfo).p;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    if (quickActionArr2 != null) {
                        i4 = quickActionArr2.length;
                    } else {
                        i4 = 0;
                    }
                    if (i4 < 3) {
                        f0Var.b(b(arrayList4, notificationIdentifier4));
                        if (arrayList4.size() == 1) {
                            i5 = 2132018158;
                        } else {
                            i5 = 2132018157;
                        }
                        java.lang.String string = context.getString(i5);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        arrayList5.add(new nc0.h1("markAsRead", "", string));
                    }
                    if (quickActionArr2 != null && (a0 = kotlin.collections.v.a0(quickActionArr2)) != null) {
                        java.util.Iterator it3 = a0.iterator();
                        while (it3.hasNext()) {
                            com.truecaller.messaging.data.types.QuickAction quickAction = (com.truecaller.messaging.data.types.QuickAction) it3.next();
                            if (quickAction.getB().length() == 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (!z8) {
                                if (quickAction instanceof com.truecaller.messaging.data.types.QuickAction.DeepLink) {
                                    if (((com.truecaller.messaging.data.types.QuickAction.DeepLink) quickAction).e.length() == 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                }
                                int i9 = com.truecaller.messaging.conversation.ConversationActivity.f0;
                                long j = message2.b;
                                long j2 = message2.a;
                                java.util.List c = kotlin.collections.x.c(message2);
                                android.content.Context context2 = this.c;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
                                it = it3;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notificationIMCustomAction", "analyticsContext");
                                message = message2;
                                java.util.ArrayList arrayList6 = arrayList5;
                                android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.truecaller.messaging.conversation.ConversationActivity.class);
                                intent.putExtra("conversation_id", j);
                                if (j2 != -1) {
                                    intent.putExtra("message_id", j2);
                                }
                                intent.putExtra("launch_source", "notificationIMCustomAction");
                                intent.putExtra("quick_action", quickAction);
                                qe0.i1.h(notificationIdentifier4.a, notificationIdentifier4.b, intent);
                                if (c != null) {
                                    qe0.i1.e(intent, c);
                                }
                                com.truecaller.messaging.data.types.InboxTab inboxTab = com.truecaller.messaging.data.types.InboxTab.PERSONAL;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notificationIncomingMessage", "analyticsContext");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboxTab, "inboxTab");
                                android.content.Intent[] intentArr2 = {y90.m6.o(context2, com.truecaller.bottombar.BottomBarButtonType.MESSAGES, "notificationIncomingMessage", (java.lang.String) null, inboxTab, 96), intent};
                                sf3.a.a.getClass();
                                android.app.PendingIntent activities = android.app.PendingIntent.getActivities(context2, sf3.a.b.d(), intentArr2, 1275068416);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activities, "getActivities(...)");
                                f0Var.b(new f6.r(2131233233, quickAction.getB(), activities));
                                java.lang.String d = quickAction.getD();
                                nc0.h1 a4 = ((nc0.o0) this.H.get()).a(quickAction);
                                arrayList2 = arrayList6;
                                arrayList2.add(a4);
                                str7 = d;
                                it3 = it;
                                arrayList5 = arrayList2;
                                message2 = message;
                            }
                            it = it3;
                            arrayList2 = arrayList5;
                            message = message2;
                            it3 = it;
                            arrayList5 = arrayList2;
                            message2 = message;
                        }
                    }
                    java.util.ArrayList arrayList7 = arrayList5;
                    com.truecaller.messaging.data.types.Message message3 = message2;
                    if (!z) {
                        long j3 = message3.a;
                        a.bar.z(message3);
                        g(j3, 2, arrayList7, str7);
                        return;
                    }
                    return;
                }
                if (z2) {
                    java.lang.String string2 = context.getString(2132018159);
                    sf3.a.a.getClass();
                    sf3.bar barVar4 = sf3.a.b;
                    int d2 = barVar4.d();
                    com.truecaller.messaging.data.types.InboxTab inboxTab2 = com.truecaller.messaging.data.types.InboxTab.PERSONAL;
                    android.content.Context context3 = this.c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context3, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "analyticsContext");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboxTab2, "inboxTab");
                    com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType = com.truecaller.bottombar.BottomBarButtonType.MESSAGES;
                    android.content.Intent o = y90.m6.o(context3, bottomBarButtonType, "", (java.lang.String) null, inboxTab2, 96);
                    o.setType("typeFraudMarkSafeNotification");
                    o.putExtra("message_array", (android.os.Parcelable[]) arrayList4.toArray(new com.truecaller.messaging.data.types.Message[0]));
                    o.putExtra("notification_id", notificationIdentifier4);
                    bo.p a5 = ((s62.h) ((s62.g) barVar3.get())).a();
                    a5.b = d2;
                    a5.c = 167772160;
                    a5.e = java.lang.Integer.valueOf(com.truecaller.analytics.common.event.PushNotificationAction.LeftButton.getType());
                    f0Var.b(new f6.r(2131232080, string2, a5.e(pushNotificationSource.getType(), "notificationIncomingMessage", o)));
                    java.lang.String string3 = context.getString(2132017204);
                    int d3 = barVar4.d();
                    android.content.Context context4 = this.c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context4, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "analyticsContext");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboxTab2, "inboxTab");
                    android.content.Intent o2 = y90.m6.o(context4, bottomBarButtonType, "", (java.lang.String) null, inboxTab2, 96);
                    o2.setType("typeFraudBlockNotification");
                    o2.putExtra("message_array", (android.os.Parcelable[]) arrayList4.toArray(new com.truecaller.messaging.data.types.Message[0]));
                    o2.putExtra("notification_id", notificationIdentifier4);
                    bo.p a6 = ((s62.h) ((s62.g) barVar3.get())).a();
                    a6.b = d3;
                    a6.c = 167772160;
                    a6.e = java.lang.Integer.valueOf(com.truecaller.analytics.common.event.PushNotificationAction.RightButton.getType());
                    f0Var.b(new f6.r(2131232913, string3, a6.e(pushNotificationSource.getType(), "notificationIncomingMessage", o2)));
                    return;
                }
                java.lang.Object key3 = entry.getKey();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key3, str2);
                java.lang.Object value2 = entry.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, str3);
                if (n((com.truecaller.messaging.data.types.Conversation) key3, spamNotificationType)) {
                    java.lang.String string4 = context.getString(2132021931);
                    sf3.a.a.getClass();
                    sf3.bar barVar5 = sf3.a.b;
                    int d4 = barVar5.d();
                    com.truecaller.messaging.data.types.InboxTab inboxTab3 = com.truecaller.messaging.data.types.InboxTab.PERSONAL;
                    android.content.Context context5 = this.c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context5, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "analyticsContext");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboxTab3, "inboxTab");
                    com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType2 = com.truecaller.bottombar.BottomBarButtonType.MESSAGES;
                    android.content.Intent o3 = y90.m6.o(context5, bottomBarButtonType2, "", (java.lang.String) null, inboxTab3, 96);
                    o3.setType("typeNotSpamNotification");
                    o3.putExtra("message_array", (android.os.Parcelable[]) arrayList4.toArray(new com.truecaller.messaging.data.types.Message[0]));
                    o3.putExtra("notification_id", notificationIdentifier4);
                    bo.p a7 = ((s62.h) ((s62.g) barVar3.get())).a();
                    a7.b = d4;
                    a7.c = 167772160;
                    a7.e = java.lang.Integer.valueOf(com.truecaller.analytics.common.event.PushNotificationAction.LeftButton.getType());
                    f0Var.b(new f6.r(2131232820, string4, a7.e(pushNotificationSource.getType(), "notificationIncomingMessage", o3)));
                    java.lang.String str8 = str4;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(treeMap, str8);
                    com.truecaller.messaging.data.types.Conversation conversation4 = conversation;
                    java.lang.Object a8 = kotlin.collections.p0.a(conversation4, treeMap);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a8, "getValue(...)");
                    int i10 = ((com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0((java.util.List) a8)).k;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(treeMap, str8);
                    java.lang.Object a9 = kotlin.collections.p0.a(conversation4, treeMap);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a9, "getValue(...)");
                    boolean L = a.bar.L((com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0((java.util.List) a9));
                    java.lang.String string5 = context.getString(2132023483);
                    int d5 = barVar5.d();
                    android.content.Context context6 = this.c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context6, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "analyticsContext");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboxTab3, "inboxTab");
                    android.content.Intent o4 = y90.m6.o(context6, bottomBarButtonType2, "", (java.lang.String) null, inboxTab3, 96);
                    o4.setType("typeStopSpamNotification");
                    o4.putExtra("message_transport", i10);
                    o4.putExtra("is_message_rcs", L);
                    o4.putExtra("message_array", (android.os.Parcelable[]) arrayList4.toArray(new com.truecaller.messaging.data.types.Message[0]));
                    o4.putExtra("notification_id", notificationIdentifier4);
                    bo.p a10 = ((s62.h) ((s62.g) barVar3.get())).a();
                    a10.b = d5;
                    a10.c = 167772160;
                    a10.e = java.lang.Integer.valueOf(com.truecaller.analytics.common.event.PushNotificationAction.RightButton.getType());
                    f0Var.b(new f6.r(2131232913, string5, a10.e(pushNotificationSource.getType(), "notificationIncomingMessage", o4)));
                    return;
                }
                com.truecaller.messaging.data.types.Conversation conversation5 = conversation;
                java.lang.String str9 = str4;
                f0Var.b(b(arrayList4, notificationIdentifier4));
                if (treeMap.size() <= 1) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(treeMap, str9);
                    java.lang.Object a11 = kotlin.collections.p0.a(conversation5, treeMap);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a11, "getValue(...)");
                    com.truecaller.messaging.data.types.Message message4 = (com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0((java.util.List) a11);
                    so1.a aVar = ((qo1.l) ((qo1.k) barVar.get())).a;
                    com.truecaller.featuretoggles.FeatureState featureState = com.truecaller.featuretoggles.FeatureState.DISABLED;
                    if ((!aVar.a("featureMessagingFraudFlowMVP", featureState) && !((xz1.e) this.E.get()).a()) || !((m02.s) this.G.get()).a() || ((i = message4.c.b) != 6 && i != 7 && !a.bar.H(message4))) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    boolean a13 = this.s.a.a("featureInsightsNotificationSpamFeedback", featureState);
                    boolean z10 = a.bar.z(message4);
                    com.truecaller.data.entity.messaging.Participant participant3 = message4.c;
                    boolean booleanValue = ((java.lang.Boolean) ((xz1.j) this.F.get()).e.getValue()).booleanValue();
                    boolean z11 = z4;
                    boolean i11 = participant3.i(128);
                    if ((a13 && z10) || (booleanValue && i11)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5 && !z11) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    int ordinal = com.truecaller.analytics.common.event.PushNotificationAction.LeftButton.ordinal();
                    if (z6) {
                        int i13 = ordinal + 1;
                        com.truecaller.analytics.common.event.PushNotificationAction pushNotificationAction = (com.truecaller.analytics.common.event.PushNotificationAction) com.truecaller.analytics.common.event.PushNotificationAction.getEntries().get(ordinal);
                        z7 = z6;
                        java.lang.String string6 = context.getString(2132023476);
                        boolean f = f();
                        android.content.Context context7 = this.c;
                        if (f) {
                            i3 = i13;
                            com.truecaller.messaging.data.types.InboxTab inboxTab4 = com.truecaller.messaging.data.types.InboxTab.PERSONAL;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context7, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "analyticsContext");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inboxTab4, "inboxTab");
                            putExtra = y90.m6.o(context7, com.truecaller.bottombar.BottomBarButtonType.MESSAGES, "", (java.lang.String) null, inboxTab4, 96);
                            putExtra.setType("typeThisIsSpamNotification");
                            putExtra.putExtra("message_array", (android.os.Parcelable[]) arrayList4.toArray(new com.truecaller.messaging.data.types.Message[0]));
                            putExtra.putExtra("notification_id", notificationIdentifier4);
                        } else {
                            i3 = i13;
                            int i14 = com.truecaller.notifications.support.FeedbackDialogLauncherActivity.p0;
                            com.truecaller.messaging.data.types.Message[] messageArr = (com.truecaller.messaging.data.types.Message[]) arrayList4.toArray(new com.truecaller.messaging.data.types.Message[0]);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context7, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageArr, "messages");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("business_im_notification", "analyticsContext");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationIdentifier4, "notificationIdentifier");
                            putExtra = new android.content.Intent(context7, (java.lang.Class<?>) com.truecaller.notifications.support.FeedbackDialogLauncherActivity.class).putExtra("messages", messageArr).putExtra("analytics_context", "business_im_notification").putExtra("notification_id", notificationIdentifier4);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                        }
                        bo.p a14 = ((s62.h) ((s62.g) barVar3.get())).a();
                        a14.b = i8;
                        a14.c = 167772160;
                        a14.e = java.lang.Integer.valueOf(pushNotificationAction.getType());
                        str6 = "notificationIncomingMessage";
                        f6.r rVar = new f6.r(2131232820, string6, a14.e(pushNotificationSource.getType(), str6, putExtra));
                        f0Var2 = f0Var;
                        f0Var2.b(rVar);
                        ordinal = i3;
                    } else {
                        z7 = z6;
                        str6 = "notificationIncomingMessage";
                        f0Var2 = f0Var;
                    }
                    if (arrayList4.size() == 1 && message4.k == 0 && !z7) {
                        com.truecaller.analytics.common.event.PushNotificationAction pushNotificationAction2 = (com.truecaller.analytics.common.event.PushNotificationAction) com.truecaller.analytics.common.event.PushNotificationAction.getEntries().get(ordinal);
                        java.lang.String string7 = context.getString(2132019027);
                        bo.p a15 = ((s62.h) ((s62.g) barVar3.get())).a();
                        a15.b = i8;
                        a15.c = 167772160;
                        a15.e = java.lang.Integer.valueOf(pushNotificationAction2.getType());
                        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.messaging.notifications.NotificationBroadcastReceiver.class);
                        intent2.setAction("com.truecaller.messaging.notifications.DELETE");
                        participant = participant3;
                        intent2.putExtra("EXTRA_MESSAGE_ID", message4.a);
                        intent2.putExtra("EXTRA_NOTIFICATION_ID", notificationIdentifier4);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "createDeleteIntent(...)");
                        f0Var2.b(new f6.r(2131232517, string7, a15.i(pushNotificationSource.getType(), str6, intent2)));
                        ordinal++;
                    } else {
                        participant = participant3;
                    }
                    com.truecaller.data.entity.messaging.Participant participant4 = participant;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participant4, str5);
                    boolean z12 = true;
                    if (participant4.b != 1 && (!((qo1.l) ((qo1.k) barVar.get())).a() || !participant4.n() || (participant4.C & 4) != 0)) {
                        z12 = false;
                    }
                    if (!z12 && !z7) {
                        com.truecaller.analytics.common.event.PushNotificationAction pushNotificationAction3 = (com.truecaller.analytics.common.event.PushNotificationAction) com.truecaller.analytics.common.event.PushNotificationAction.getEntries().get(ordinal);
                        android.content.Intent e2 = com.truecaller.messaging.notifications.NotificationBroadcastReceiver.e(this.c, "com.truecaller.messaging.notifications.QUICK_REPLY", arrayList4, true, notificationIdentifier4, str);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e2, "createNativeQuickReplyIntent(...)");
                        if (android.os.Build.VERSION.SDK_INT >= 34) {
                            i2 = 184549376;
                        } else {
                            i2 = 167772160;
                        }
                        bo.p a16 = ((s62.h) ((s62.g) barVar3.get())).a();
                        a16.b = i8;
                        a16.c = i2;
                        a16.e = java.lang.Integer.valueOf(pushNotificationAction3.getType());
                        android.app.PendingIntent i15 = a16.i(pushNotificationSource.getType(), str6, e2);
                        java.lang.String string8 = context.getString(2132018842);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                        f6.q qVar = new f6.q(2131233233, string8, i15);
                        qVar.a(new f6.h1("KEY_REPLY_TEXT", string8, (java.lang.CharSequence[]) null, true, 0, new android.os.Bundle(), new java.util.HashSet()));
                        f6.r b3 = qVar.b();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b3, "build(...)");
                        f0Var2.b(b3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z3 = false;
        if (!z3) {
        }
    }

    public final f6.r b(java.util.ArrayList arrayList, com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier) {
        int i;
        java.lang.String str;
        if (arrayList.size() == 1) {
            i = 2132018158;
        } else {
            i = 2132018157;
        }
        java.lang.String string = this.c.getString(i);
        bo.p a = ((s62.h) ((s62.g) this.r.get())).a();
        a.e = java.lang.Integer.valueOf(com.truecaller.analytics.common.event.PushNotificationAction.LeftButton.getType());
        a.b = notificationIdentifier.c;
        int i2 = com.truecaller.messaging.notifications.NotificationBroadcastReceiver.o;
        if (arrayList.size() == 1) {
            str = "com.truecaller.messaging.notifications.MARK_MESSAGE_READ";
        } else {
            str = "com.truecaller.messaging.notifications.MARK_READ";
        }
        android.content.Intent e = com.truecaller.messaging.notifications.NotificationBroadcastReceiver.e(this.c, str, arrayList, true, notificationIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "createMarkReadIntent(...)");
        return new f6.r(2131232536, string, a.i(com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationIncomingMessage", e));
    }

    public final void c(java.util.Collection collection) {
        qc3.bar barVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "conversationIds");
        java.util.Collection collection2 = collection;
        java.util.Iterator it = collection2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            barVar = this.q;
            if (!hasNext) {
                break;
            }
            long longValue = ((java.lang.Number) it.next()).longValue();
            java.lang.Object obj = barVar.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            s62.f fVar = (s62.f) ((s62.d) obj);
            fVar.b(2131365483, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), java.lang.String.valueOf(longValue), "notificationIncomingMessage");
            this.P.remove(java.lang.Long.valueOf(longValue));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(collection2, 10));
        java.util.Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            arrayList.add(java.lang.String.valueOf(((java.lang.Number) it2.next()).longValue()));
        }
        java.util.Set K0 = kotlin.collections.CollectionsKt.K0(arrayList);
        java.util.ArrayList d = d();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it3 = d.iterator();
        while (it3.hasNext()) {
            java.lang.Object next = it3.next();
            if (!K0.contains(((android.service.notification.StatusBarNotification) next).getTag())) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() == 1 && ((android.service.notification.StatusBarNotification) arrayList2.get(0)).getTag() == null) {
            java.lang.Object obj2 = barVar.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            ((s62.f) ((s62.d) obj2)).a(2131365483, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationIncomingMessage");
        }
    }

    public final java.util.ArrayList d() {
        android.service.notification.StatusBarNotification[] j = ((s62.f) ((s62.d) this.q.get())).j();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.service.notification.StatusBarNotification statusBarNotification : j) {
            if (statusBarNotification.getId() == 2131365483) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    public final android.graphics.Bitmap e(com.truecaller.data.entity.messaging.Participant participant, int i) {
        android.graphics.Bitmap bitmap;
        boolean z;
        boolean z2;
        java.lang.String str = participant.p;
        int i2 = participant.b;
        this.d.getClass();
        android.net.Uri C = h81.a.C(str, true);
        android.content.Context context = this.c;
        if (C != null) {
            jg.o oVar = new jg.o(C, new vp1.bar(i, i));
            oVar.b = true;
            bitmap = j0.b.v(oVar, context);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        if (i2 == 7) {
            android.net.Uri a = ((u03.f0) ((e42.z) this.z.get()).a.get()).a(2131234459);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "buildResourceUri(...)");
            jg.o oVar2 = new jg.o(a, new vp1.bar(i, i));
            oVar2.b = true;
            android.graphics.Bitmap v = j0.b.v(oVar2, context);
            if (v != null) {
                return v;
            }
        }
        java.lang.Object obj = this.e.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        w31.c cVar = (w31.c) obj;
        java.lang.String str2 = participant.e;
        java.lang.String P = gf0.e.P(participant.n);
        if (participant.t() && !((m02.s) this.x.get()).a()) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        cVar.C2(new com.truecaller.common.ui.avatar.AvatarXConfig((android.net.Uri) null, str2, P, z, false, z2, false, false, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, -4194395), false);
        return (android.graphics.Bitmap) fg3.h0.O(kotlin.coroutines.d.a, new com.truecaller.messaging.notifications.f0(this, i, null, 1));
    }

    public final boolean f() {
        if (((xz1.e) this.E.get()).a() && ((m02.s) this.G.get()).a()) {
            return true;
        }
        return false;
    }

    public final void g(long j, int i, java.util.ArrayList arrayList, java.lang.String str) {
        nc0.y0 y0Var = (nc0.y0) this.I.get();
        boolean p = this.w.p();
        fg3.h0.J(fg3.f1.a, y0Var.c, (fg3.f0) null, new nc0.w0(y0Var, j, p, i, arrayList, str, (df3.bar) null), 2);
    }

    public final android.text.SpannableStringBuilder h(com.truecaller.messaging.data.types.Message message, boolean z, kotlin.Pair pair) {
        qc3.bar barVar = this.k;
        java.lang.String a = t41.k0.a(((s42.qux) ((s42.baz) barVar.get())).c(message));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "stringWithPhoneNumbersLTR(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "snippetText");
        android.text.SpannableString spannableString = new android.text.SpannableString(a);
        android.content.Context context = this.c;
        android.content.res.Resources resources = context.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "res");
        java.lang.String str = null;
        if (z) {
            ((s42.qux) ((s42.baz) barVar.get())).getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            java.util.ArrayList f = s42.qux.f(message);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = f.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (!s42.qux.n((java.lang.String) next)) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() == 1) {
                java.lang.String str2 = (java.lang.String) kotlin.collections.CollectionsKt.V(arrayList);
                if (b91.d.p(str2)) {
                    str = "🎞️";
                } else if (b91.d.q(str2)) {
                    str = "🌄";
                } else if (b91.d.v(str2)) {
                    str = "🎥";
                } else if (b91.d.u(str2)) {
                    str = "👤";
                } else if (b91.d.n(str2)) {
                    str = "🎙";
                } else if (b91.d.o(str2)) {
                    str = "📄";
                } else if (b91.d.s(str2)) {
                    str = "📍";
                }
            }
        }
        android.view.ContextThemeWrapper v = yy.qux.v(context, true);
        boolean M = a.bar.M(message);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "context");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        if (pair != null) {
            java.lang.Integer num = (java.lang.Integer) pair.a;
            if (num != null) {
                char[] chars = java.lang.Character.toChars(num.intValue());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(chars, "toChars(...)");
                spannableStringBuilder.append((java.lang.CharSequence) new java.lang.String(chars)).append((java.lang.CharSequence) " ");
            }
            java.lang.String str3 = (java.lang.String) pair.b;
            if (str3 != null) {
                spannableStringBuilder.append((java.lang.CharSequence) str3).append((java.lang.CharSequence) " ");
            }
            spannableStringBuilder.append((java.lang.CharSequence) "· ");
        }
        if (str != null) {
            spannableStringBuilder.append((java.lang.CharSequence) str).append((java.lang.CharSequence) " ");
        }
        if (M) {
            java.util.List list = p12.b.a;
            spannableStringBuilder.append((java.lang.CharSequence) p12.b.c(v, spannableString, com.truecaller.messaging.conversation.richtext.TextDelimiterFormatter$DelimiterVisibility.REMOVE));
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((java.lang.CharSequence) spannableString);
        return spannableStringBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0296, code lost:
    
        if (r2 == com.truecaller.messaging.notifications.VerifiedNonSpamNotificationType.SILENT) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04eb A[LOOP:4: B:80:0x04e5->B:82:0x04eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0523 A[Catch: all -> 0x0531, LOOP:5: B:89:0x051d->B:91:0x0523, LOOP_END, TryCatch #0 {all -> 0x0531, blocks: (B:88:0x0519, B:89:0x051d, B:91:0x0523, B:93:0x0534), top: B:87:0x0519, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(java.util.HashMap hashMap, java.util.HashMap hashMap2, java.util.HashMap hashMap3, java.util.HashMap hashMap4, java.util.HashMap hashMap5) {
        java.lang.Long l;
        boolean z;
        com.truecaller.messaging.notifications.SpamNotificationType spamNotificationType;
        com.truecaller.messaging.notifications.FraudNotificationType fraudNotificationType;
        com.truecaller.messaging.notifications.VerifiedNonSpamNotificationType verifiedNonSpamNotificationType;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        android.app.NotificationChannel d;
        java.lang.String j;
        com.truecaller.messaging.notifications.SpamNotificationType spamNotificationType2;
        com.truecaller.messaging.notifications.FraudNotificationType fraudNotificationType2;
        java.lang.String str6;
        boolean z5;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        boolean z6;
        java.util.TreeMap treeMap;
        com.truecaller.messaging.notifications.SpamNotificationType spamNotificationType3;
        com.truecaller.messaging.notifications.FraudNotificationType fraudNotificationType3;
        com.truecaller.insights.fraud.analytics.FraudWarningScope fraudWarningScope;
        java.util.Iterator it;
        java.util.Iterator it2;
        com.truecaller.messaging.notifications.SpamNotificationType spamNotificationType4;
        com.truecaller.messaging.notifications.FraudNotificationType fraudNotificationType4;
        java.lang.String str10;
        java.util.HashMap hashMap6 = hashMap2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashMap, "conversations");
        vd0.bar barVar = (vd0.bar) this.y.get();
        kotlin.coroutines.CoroutineContext coroutineContext = this.a;
        android.content.Context context = this.c;
        barVar.d(context, coroutineContext);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.util.List list = (java.util.List) entry.getValue();
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (a.bar.E((com.truecaller.messaging.data.types.Message) it3.next())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            java.util.Map b = ((com.truecaller.messaging.notifications.k) this.f.get()).b(linkedHashMap);
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.q0.b(b.size()));
            for (java.util.Map.Entry entry2 : b.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), kotlin.collections.CollectionsKt.w0(new a6.b(17), (java.util.List) entry2.getValue()));
            }
            java.util.TreeMap e = kotlin.collections.q0.e(linkedHashMap2, new a6.b(18));
            com.truecaller.messaging.data.types.Conversation conversation = (com.truecaller.messaging.data.types.Conversation) e.lastKey();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "<this>");
            java.lang.Object a = kotlin.collections.p0.a(conversation, e);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "getValue(...)");
            com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0((java.util.List) a);
            if (message.c.t() && conversation.O != 2) {
                z = true;
            } else {
                z = false;
            }
            if (hashMap6 == null || (spamNotificationType = (com.truecaller.messaging.notifications.SpamNotificationType) hashMap6.get(message)) == null) {
                spamNotificationType = com.truecaller.messaging.notifications.SpamNotificationType.NO_SPAM_NOTIFICATION;
            }
            com.truecaller.messaging.notifications.SpamNotificationType spamNotificationType5 = spamNotificationType;
            if (hashMap4 != null) {
                fraudNotificationType = (com.truecaller.messaging.notifications.FraudNotificationType) hashMap4.get(message);
            } else {
                fraudNotificationType = null;
            }
            if (hashMap3 == null || (verifiedNonSpamNotificationType = (com.truecaller.messaging.notifications.VerifiedNonSpamNotificationType) hashMap3.get(message)) == null) {
                verifiedNonSpamNotificationType = com.truecaller.messaging.notifications.VerifiedNonSpamNotificationType.HEADS_UP;
            }
            boolean b2 = this.u.b();
            xz1.q qVar = this.h;
            if (b2 && ((xz1.r) qVar).A0()) {
                z2 = true;
            } else {
                z2 = false;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "<this>");
            java.lang.Object a2 = kotlin.collections.p0.a(conversation, e);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "getValue(...)");
            boolean m = m((com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0((java.util.List) a2));
            java.lang.String str11 = "conversation";
            qc3.bar barVar2 = this.q;
            if (m) {
                str6 = "urgent_messages_ringtone";
                z3 = z;
                z4 = z2;
                spamNotificationType2 = spamNotificationType5;
                fraudNotificationType2 = fraudNotificationType;
            } else {
                kotlin.jvm.internal.Intrinsics.d(conversation);
                qc3.bar barVar3 = this.i;
                android.net.Uri a3 = ((m03.y0) barVar3.get()).a();
                xz1.r rVar = (xz1.r) qVar;
                z3 = z;
                java.lang.String H = rVar.H("chatMessagingRingtone", "");
                if (jj3.bar.i(H)) {
                    z4 = z2;
                    str = null;
                } else {
                    z4 = z2;
                    str = H;
                }
                if (a3 != null) {
                    str2 = a3.toString();
                } else {
                    str2 = null;
                }
                boolean b3 = kotlin.jvm.internal.Intrinsics.b(str, str2);
                qc3.bar barVar4 = this.p;
                if (!b3) {
                    if (a3 != null) {
                        str9 = a3.toString();
                    } else {
                        str9 = null;
                    }
                    if (str9 == null) {
                        str9 = "";
                    }
                    rVar.g0("chatMessagingRingtone", str9);
                    ((s62.a) barVar4.get()).a();
                    ((s62.f) ((s62.d) barVar2.get())).c(false);
                }
                android.net.Uri c = ((m03.y0) barVar3.get()).c();
                java.lang.String H2 = rVar.H("messagingRingtone", "");
                if (jj3.bar.i(H2)) {
                    str3 = null;
                } else {
                    str3 = H2;
                }
                if (c != null) {
                    str4 = "";
                    str5 = c.toString();
                } else {
                    str4 = "";
                    str5 = null;
                }
                if (!kotlin.jvm.internal.Intrinsics.b(str3, str5)) {
                    if (c != null) {
                        str7 = c.toString();
                    } else {
                        str7 = null;
                    }
                    if (str7 == null) {
                        str8 = str4;
                    } else {
                        str8 = str7;
                    }
                    rVar.g0("messagingRingtone", str8);
                    ((s62.a) barVar4.get()).b();
                    ((s62.f) ((s62.d) barVar2.get())).c(false);
                }
                n12.j jVar = (n12.j) this.o.get();
                jVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversation, "conversation");
                com.truecaller.data.entity.messaging.Participant[] participantArr = conversation.l;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participantArr, "participants");
                if (ak.e1.C(participantArr) || (d = jVar.e.d(n12.j.b(conversation))) == null) {
                    j = null;
                } else {
                    j = zc0.bar.j(d);
                }
                if (j == null) {
                    if (message.k == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    java.lang.String str12 = "smart_sms";
                    if (z5) {
                        fraudNotificationType2 = fraudNotificationType;
                        if (fraudNotificationType2 == com.truecaller.messaging.notifications.FraudNotificationType.SILENT_FRAUD_NOTIFICATION) {
                            str12 = "spam_sms";
                            spamNotificationType2 = spamNotificationType5;
                        } else {
                            spamNotificationType2 = spamNotificationType5;
                            if (spamNotificationType2 != com.truecaller.messaging.notifications.SpamNotificationType.SILENT_SPAM_NOTIFICATION) {
                                if (verifiedNonSpamNotificationType != com.truecaller.messaging.notifications.VerifiedNonSpamNotificationType.SILENT) {
                                    str12 = "personal_chats";
                                }
                            }
                            str12 = "spam_sms";
                        }
                        str6 = ((s62.f) ((s62.d) barVar2.get())).o(str12);
                    } else {
                        spamNotificationType2 = spamNotificationType5;
                        fraudNotificationType2 = fraudNotificationType;
                        if (!z5) {
                            if (fraudNotificationType2 != com.truecaller.messaging.notifications.FraudNotificationType.HEADS_UP_FRAUD_NOTIFICATION) {
                                if (fraudNotificationType2 != com.truecaller.messaging.notifications.FraudNotificationType.SILENT_FRAUD_NOTIFICATION) {
                                    if (spamNotificationType2 != com.truecaller.messaging.notifications.SpamNotificationType.HEADS_UP_SPAM_NOTIFICATION) {
                                        if (!z3 && spamNotificationType2 != com.truecaller.messaging.notifications.SpamNotificationType.SILENT_SPAM_NOTIFICATION) {
                                        }
                                    }
                                }
                                str12 = "spam_sms";
                                str6 = ((s62.f) ((s62.d) barVar2.get())).o(str12);
                            }
                            str12 = "non_spam_sms_v2";
                            str6 = ((s62.f) ((s62.d) barVar2.get())).o(str12);
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    }
                } else {
                    spamNotificationType2 = spamNotificationType5;
                    fraudNotificationType2 = fraudNotificationType;
                    str6 = j;
                }
            }
            java.lang.String str13 = str6;
            java.lang.String str14 = "build(...)";
            try {
                try {
                    if (z4) {
                        java.util.Iterator it4 = e.entrySet().iterator();
                        while (it4.hasNext()) {
                            java.util.Map.Entry entry3 = (java.util.Map.Entry) it4.next();
                            com.truecaller.messaging.data.types.Conversation conversation2 = (com.truecaller.messaging.data.types.Conversation) entry3.getKey();
                            java.util.List list2 = (java.util.List) entry3.getValue();
                            java.util.Iterator it5 = it4;
                            java.lang.String valueOf = java.lang.String.valueOf(conversation.a);
                            java.lang.String str15 = str11;
                            int i = (int) conversation.a;
                            com.truecaller.messaging.notifications.NotificationIdentifier notificationIdentifier = new com.truecaller.messaging.notifications.NotificationIdentifier(2131365483, valueOf, i);
                            java.util.Map c2 = kotlin.collections.q0.c(new kotlin.Pair(conversation2, list2));
                            kotlin.jvm.internal.Intrinsics.d(list2);
                            com.truecaller.messaging.data.types.Message message2 = (com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0(list2);
                            if (hashMap6 == null || (spamNotificationType4 = (com.truecaller.messaging.notifications.SpamNotificationType) hashMap6.get(message2)) == null) {
                                spamNotificationType4 = com.truecaller.messaging.notifications.SpamNotificationType.NO_SPAM_NOTIFICATION;
                            }
                            com.truecaller.messaging.data.types.Conversation conversation3 = conversation;
                            java.lang.Object obj = (com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0(list2);
                            if (hashMap4 != null) {
                                fraudNotificationType4 = (com.truecaller.messaging.notifications.FraudNotificationType) hashMap4.get(obj);
                            } else {
                                fraudNotificationType4 = null;
                            }
                            if (o(c2, spamNotificationType4, fraudNotificationType4)) {
                                s62.d dVar = (s62.d) barVar2.get();
                                f6.f0 f0Var = new f6.f0(context, str13);
                                f0Var.e = f6.f0.e(context.getResources().getString(2132018328));
                                bo.p a4 = ((s62.h) ((s62.g) this.r.get())).a();
                                a4.b = i;
                                a4.c = 1275068416;
                                android.content.Intent[] l2 = qe0.i1.l(this.c, list2, notificationIdentifier, "view_message", "notificationIncomingMessage", 48);
                                com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                                str10 = str15;
                                f0Var.g = a4.d(l2, pushNotificationSource.getType(), str10);
                                if (!z3) {
                                    int i2 = ((com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0(list2)).k;
                                    kotlin.jvm.internal.Intrinsics.d(conversation2);
                                    l(f0Var, i2, false, conversation2);
                                }
                                f0Var.Q.icon = 2131232903;
                                f0Var.D = context.getColor(2131099683);
                                kotlin.Unit unit = kotlin.Unit.a;
                                android.app.Notification d2 = f0Var.d();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d2, "build(...)");
                                ((s62.f) dVar).w(valueOf, 2131365483, d2, pushNotificationSource.getType(), "notificationIncomingMessage");
                            } else {
                                str10 = str15;
                            }
                            it4 = it5;
                            str11 = str10;
                            conversation = conversation3;
                        }
                    } else {
                        int i3 = 2131232903;
                        for (java.util.Map.Entry entry4 : e.entrySet()) {
                            com.truecaller.messaging.data.types.Conversation conversation4 = (com.truecaller.messaging.data.types.Conversation) entry4.getKey();
                            java.util.List list3 = (java.util.List) entry4.getValue();
                            kotlin.jvm.internal.Intrinsics.d(conversation4);
                            kotlin.jvm.internal.Intrinsics.d(list3);
                            com.truecaller.messaging.data.types.Message message3 = (com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0(list3);
                            if (hashMap6 == null || (spamNotificationType3 = (com.truecaller.messaging.notifications.SpamNotificationType) hashMap6.get(message3)) == null) {
                                spamNotificationType3 = com.truecaller.messaging.notifications.SpamNotificationType.NO_SPAM_NOTIFICATION;
                            }
                            java.lang.Object obj2 = (com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0(list3);
                            if (hashMap4 != null) {
                                fraudNotificationType3 = (com.truecaller.messaging.notifications.FraudNotificationType) hashMap4.get(obj2);
                            } else {
                                fraudNotificationType3 = null;
                            }
                            if (hashMap5 != null) {
                                fraudWarningScope = (com.truecaller.insights.fraud.analytics.FraudWarningScope) hashMap5.get(kotlin.collections.CollectionsKt.d0(list3));
                            } else {
                                fraudWarningScope = null;
                            }
                            java.lang.String str16 = str14;
                            com.truecaller.messaging.notifications.FraudNotificationType fraudNotificationType5 = fraudNotificationType3;
                            boolean z7 = z3;
                            j(conversation4, list3, str13, z7, spamNotificationType3, fraudNotificationType5, fraudWarningScope);
                            z3 = z7;
                            str14 = str16;
                            i3 = 2131232903;
                            hashMap6 = hashMap2;
                        }
                        java.lang.String str17 = str14;
                        int i4 = i3;
                        if (o(e, spamNotificationType2, fraudNotificationType2)) {
                            f6.f0 f0Var2 = new f6.f0(context, str13);
                            android.app.Notification notification = f0Var2.Q;
                            notification.icon = i4;
                            f0Var2.D = context.getColor(2131099683);
                            f0Var2.v = "com.truecaller.messaging.NEW_MESSAGES";
                            f0Var2.w = true;
                            notification.when = ((com.truecaller.messaging.data.types.Conversation) e.lastKey()).h.i();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var2, "setWhen(...)");
                            f0Var2.N = 2;
                            if (((qo1.l) ((qo1.k) this.g.get())).d() && fraudNotificationType2 != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            treeMap = e;
                            a(f0Var2, treeMap, str13, true, spamNotificationType2, z6);
                            java.lang.Object obj3 = barVar2.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                            android.app.Notification d3 = f0Var2.d();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d3, str17);
                            ((s62.f) ((s62.d) obj3)).v(2131365483, d3, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationIncomingMessage");
                            com.truecaller.messaging.notifications.l lVar = (com.truecaller.messaging.notifications.l) this.j.get();
                            java.util.Collection values = treeMap.values();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                            java.util.ArrayList r = kotlin.collections.z.r(values);
                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(r, 10));
                            it = r.iterator();
                            while (it.hasNext()) {
                                arrayList.add(java.lang.Long.valueOf(((com.truecaller.messaging.data.types.Message) it.next()).a));
                            }
                            lVar.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "ids");
                            java.util.LinkedHashSet linkedHashSet = lVar.b;
                            linkedHashSet.clear();
                            linkedHashSet.addAll(arrayList);
                            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(lVar.a.openFileOutput("notifications.state", 0));
                            it2 = linkedHashSet.iterator();
                            while (it2.hasNext()) {
                                dataOutputStream.writeLong(((java.lang.Number) it2.next()).longValue());
                            }
                            kotlin.Unit unit2 = kotlin.Unit.a;
                            dataOutputStream.close();
                        }
                    }
                    it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                    }
                    kotlin.Unit unit22 = kotlin.Unit.a;
                    dataOutputStream.close();
                } finally {
                }
                java.io.DataOutputStream dataOutputStream2 = new java.io.DataOutputStream(lVar.a.openFileOutput("notifications.state", 0));
            } catch (java.io.IOException e2) {
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e2);
            }
            treeMap = e;
            com.truecaller.messaging.notifications.l lVar2 = (com.truecaller.messaging.notifications.l) this.j.get();
            java.util.Collection values2 = treeMap.values();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values2, "<get-values>(...)");
            java.util.ArrayList r2 = kotlin.collections.z.r(values2);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(r2, 10));
            it = r2.iterator();
            while (it.hasNext()) {
            }
            lVar2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList2, "ids");
            java.util.LinkedHashSet linkedHashSet2 = lVar2.b;
            linkedHashSet2.clear();
            linkedHashSet2.addAll(arrayList2);
        }
        java.util.ArrayList d4 = d();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it6 = d4.iterator();
        while (it6.hasNext()) {
            java.lang.String tag = ((android.service.notification.StatusBarNotification) it6.next()).getTag();
            if (tag != null) {
                l = kotlin.text.StringsKt.t0(tag);
            } else {
                l = null;
            }
            if (l != null) {
                arrayList3.add(l);
            }
        }
        java.util.Set keySet = hashMap.keySet();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.z.q(keySet, 10));
        java.util.Iterator it7 = keySet.iterator();
        while (it7.hasNext()) {
            arrayList4.add(java.lang.Long.valueOf(((com.truecaller.messaging.data.types.Conversation) it7.next()).a));
        }
        java.util.List i0 = kotlin.collections.CollectionsKt.i0(arrayList3, arrayList4);
        if (!i0.isEmpty()) {
            fg3.h0.P(new com.truecaller.editprofile.impl.ui.legacy.m(i0, this, (df3.bar) null, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a3  */
    /* JADX WARN: Type inference failed for: r0v64, types: [h6.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [h6.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(com.truecaller.messaging.data.types.Conversation conversation, java.util.List list, java.lang.String str, boolean z, com.truecaller.messaging.notifications.SpamNotificationType spamNotificationType, com.truecaller.messaging.notifications.FraudNotificationType fraudNotificationType, com.truecaller.insights.fraud.analytics.FraudWarningScope fraudWarningScope) {
        boolean z2;
        com.truecaller.data.entity.messaging.Participant[] participantArr;
        com.truecaller.messaging.data.types.Conversation conversation2;
        java.lang.String str2;
        int i;
        android.graphics.Paint paint;
        android.graphics.Bitmap e;
        androidx.core.graphics.drawable.IconCompat iconCompat;
        int i2;
        java.io.InputStream k;
        android.graphics.Bitmap decodeStream;
        androidx.core.graphics.drawable.IconCompat e2;
        f6.v0 v0Var;
        f6.f0 f0Var;
        com.truecaller.messaging.data.types.Message message;
        java.util.ArrayList arrayList;
        qc3.bar barVar;
        java.util.LinkedHashMap linkedHashMap;
        java.util.List list2;
        long j;
        boolean z3;
        kotlin.Pair pair;
        com.truecaller.insights.fraud.analytics.FraudWarningScope fraudWarningScope2;
        com.truecaller.messaging.data.types.Entity entity;
        android.net.Uri uri;
        kotlin.Pair pair2;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.LinkedHashMap linkedHashMap2;
        android.net.Uri uri2;
        android.net.Uri uri3;
        java.lang.String uri4;
        java.lang.String uri5;
        android.graphics.BitmapFactory.Options p;
        java.io.File r;
        java.lang.Integer num;
        com.truecaller.messaging.data.types.Conversation conversation3 = conversation;
        java.util.List list3 = list;
        com.truecaller.messaging.notifications.SpamNotificationType spamNotificationType2 = spamNotificationType;
        com.truecaller.insights.fraud.analytics.FraudWarningScope fraudWarningScope3 = fraudWarningScope;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.P;
        android.content.Context context = this.c;
        if (!o(kotlin.collections.q0.c(new kotlin.Pair(conversation3, list3)), spamNotificationType2, fraudNotificationType)) {
            return;
        }
        long j2 = conversation3.a;
        com.truecaller.data.entity.messaging.Participant[] participantArr2 = conversation3.l;
        java.util.Map map = (java.util.Map) concurrentHashMap2.get(java.lang.Long.valueOf(j2));
        if (map != null) {
            java.util.List<com.truecaller.messaging.data.types.Message> list4 = list3;
            if ((list4 instanceof java.util.Collection) && list4.isEmpty()) {
                return;
            }
            for (com.truecaller.messaging.data.types.Message message2 : list4) {
                if (map.containsKey(java.lang.Long.valueOf(message2.a)) && (num = (java.lang.Integer) map.get(java.lang.Long.valueOf(message2.a))) != null && num.intValue() == 0) {
                }
            }
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(j2);
        ((s03.bar) this.B.get()).getClass();
        boolean z4 = false;
        boolean z5 = ((qo1.l) ((qo1.k) this.g.get())).d() && fraudNotificationType != null;
        f6.f0 f0Var2 = new f6.f0(context, str);
        f0Var2.Q.icon = 2131232903;
        f0Var2.D = context.getColor(2131099683);
        qc3.bar barVar2 = this.A;
        f6.v0 t0Var = new f6.t0(k());
        java.util.ArrayList arrayList2 = ((f6.t0) t0Var).e;
        f6.v0 v0Var2 = t0Var;
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        java.util.List list5 = list3;
        java.util.Iterator it = list5.iterator();
        loop1: while (true) {
            java.util.List list6 = list5;
            if (it.hasNext()) {
                com.truecaller.messaging.data.types.Message message3 = (com.truecaller.messaging.data.types.Message) it.next();
                if (z5) {
                    v0Var = v0Var2;
                    f0Var = f0Var2;
                    message = message3;
                    arrayList = arrayList2;
                    barVar = barVar2;
                    linkedHashMap = linkedHashMap3;
                    list2 = list6;
                    pair = this.R;
                    j = j2;
                    z3 = true;
                } else if (n(conversation3, spamNotificationType2)) {
                    f6.f0 f0Var3 = f0Var2;
                    long j3 = message3.a;
                    int i3 = ((com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0(list3)).k;
                    a.bar.L((com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0(list3));
                    barVar = barVar2;
                    v0Var = v0Var2;
                    linkedHashMap = linkedHashMap3;
                    list2 = list6;
                    f0Var = f0Var3;
                    message = message3;
                    arrayList = arrayList2;
                    j = j2;
                    z3 = true;
                    g(j3, 3, null, null);
                    pair = this.Q;
                } else {
                    v0Var = v0Var2;
                    f0Var = f0Var2;
                    message = message3;
                    arrayList = arrayList2;
                    barVar = barVar2;
                    linkedHashMap = linkedHashMap3;
                    list2 = list6;
                    j = j2;
                    z3 = true;
                    pair = null;
                }
                android.text.SpannableStringBuilder h = h(message, z3, pair);
                com.truecaller.messaging.data.types.Entity[] entityArr = message.o;
                org.joda.time.DateTime dateTime = message.e;
                com.truecaller.data.entity.messaging.Participant[] participantArr3 = participantArr2;
                f6.s0 s0Var = new f6.s0(h, dateTime.i(), q(message, fraudWarningScope3));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entityArr, "entities");
                int length = entityArr.length;
                int i4 = 0;
                while (i4 < length) {
                    org.joda.time.DateTime dateTime2 = dateTime;
                    com.truecaller.messaging.data.types.Entity entity2 = entityArr[i4];
                    kotlin.jvm.internal.Intrinsics.d(entity2);
                    com.truecaller.data.entity.messaging.Participant[] participantArr4 = participantArr3;
                    int i5 = entity2.c;
                    int i6 = length;
                    int i7 = i4;
                    boolean c = entity2.getC();
                    java.lang.String str3 = entity2.b;
                    if (c) {
                        entity = entity2;
                        uri = ((com.truecaller.messaging.data.types.GifEntity) entity).i;
                    } else {
                        entity = entity2;
                        if (entity.getA()) {
                            uri = ((com.truecaller.messaging.data.types.ImageEntity) entity).i;
                        }
                        pair2 = pair;
                        concurrentHashMap = concurrentHashMap2;
                        if (!entity.getA() || entity.getC()) {
                            linkedHashMap2 = linkedHashMap;
                            linkedHashMap2.put(java.lang.Long.valueOf(message.a), java.lang.Integer.valueOf(i5));
                        } else {
                            linkedHashMap2 = linkedHashMap;
                        }
                        i4 = i7 + 1;
                        participantArr3 = participantArr4;
                        linkedHashMap = linkedHashMap2;
                        dateTime = dateTime2;
                        length = i6;
                        concurrentHashMap2 = concurrentHashMap;
                        pair = pair2;
                    }
                    if (!gf0.e.E(uri) && i5 == 0) {
                        if (kotlin.jvm.internal.Intrinsics.b(str3, "tenor/gif")) {
                            str3 = "image/gif";
                        }
                        s0Var.e = str3;
                        s0Var.f = uri;
                    } else {
                        com.truecaller.messaging.data.types.ImageEntity imageEntity = (com.truecaller.messaging.data.types.ImageEntity) entity;
                        if (imageEntity.getC()) {
                            uri2 = ((com.truecaller.messaging.data.types.GifEntity) entity).y;
                        } else if (imageEntity.A) {
                            uri2 = imageEntity.y;
                        }
                        if (!gf0.e.E(uri2)) {
                            lf2.r rVar = this.v;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri2, "uri");
                            try {
                                p = rVar.p(uri2);
                                concurrentHashMap = concurrentHashMap2;
                                r = gf0.e.r((android.content.Context) rVar.a, uri2, ".jpg");
                            } catch (java.lang.Exception unused) {
                                concurrentHashMap = concurrentHashMap2;
                            }
                            if (r != null) {
                                java.lang.String path = r.getPath();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                                uri3 = lf2.r.j(path, p, 100);
                                if (uri3 != null || gf0.e.E(uri3)) {
                                    pair2 = pair;
                                } else {
                                    try {
                                        try {
                                            java.io.InputStream openInputStream = context.getContentResolver().openInputStream(uri3);
                                            if (openInputStream != null) {
                                                try {
                                                    java.io.OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri2);
                                                    if (openOutputStream != null) {
                                                        try {
                                                            i0.a.r(openInputStream, openOutputStream);
                                                            openOutputStream.close();
                                                        } finally {
                                                            try {
                                                                break loop1;
                                                            } catch (java.lang.Throwable th) {
                                                            }
                                                        }
                                                    }
                                                    openInputStream.close();
                                                } catch (java.lang.Throwable th2) {
                                                    try {
                                                        throw th2;
                                                        break loop1;
                                                    } catch (java.lang.Throwable th3) {
                                                        i71.g.r(openInputStream, th2);
                                                        throw th3;
                                                        break loop1;
                                                    }
                                                }
                                            }
                                            uri4 = uri2.toString();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri4, "toString(...)");
                                            uri5 = uri2.toString();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri5, "toString(...)");
                                            pair2 = pair;
                                        } finally {
                                            gf0.e.u(context, uri3);
                                        }
                                    } catch (java.io.IOException unused2) {
                                        pair2 = pair;
                                    } catch (java.lang.RuntimeException e3) {
                                        e = e3;
                                        pair2 = pair;
                                    }
                                    try {
                                        java.lang.String substring = uri4.substring(kotlin.text.StringsKt.Z(uri5, ".", 0, 6) + 1);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                        s0Var.e = "image/" + substring;
                                        s0Var.f = uri2;
                                    } catch (java.io.IOException unused3) {
                                    } catch (java.lang.RuntimeException e4) {
                                        e = e4;
                                        com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("Could not copy scaled thumbnail e: " + e.getMessage() + " uri: " + uri2);
                                    }
                                }
                                if (entity.getA()) {
                                }
                                linkedHashMap2 = linkedHashMap;
                                linkedHashMap2.put(java.lang.Long.valueOf(message.a), java.lang.Integer.valueOf(i5));
                                i4 = i7 + 1;
                                participantArr3 = participantArr4;
                                linkedHashMap = linkedHashMap2;
                                dateTime = dateTime2;
                                length = i6;
                                concurrentHashMap2 = concurrentHashMap;
                                pair = pair2;
                            }
                            uri3 = null;
                            if (uri3 != null) {
                            }
                            pair2 = pair;
                            if (entity.getA()) {
                            }
                            linkedHashMap2 = linkedHashMap;
                            linkedHashMap2.put(java.lang.Long.valueOf(message.a), java.lang.Integer.valueOf(i5));
                            i4 = i7 + 1;
                            participantArr3 = participantArr4;
                            linkedHashMap = linkedHashMap2;
                            dateTime = dateTime2;
                            length = i6;
                            concurrentHashMap2 = concurrentHashMap;
                            pair = pair2;
                        }
                    }
                    pair2 = pair;
                    concurrentHashMap = concurrentHashMap2;
                    if (entity.getA()) {
                    }
                    linkedHashMap2 = linkedHashMap;
                    linkedHashMap2.put(java.lang.Long.valueOf(message.a), java.lang.Integer.valueOf(i5));
                    i4 = i7 + 1;
                    participantArr3 = participantArr4;
                    linkedHashMap = linkedHashMap2;
                    dateTime = dateTime2;
                    length = i6;
                    concurrentHashMap2 = concurrentHashMap;
                    pair = pair2;
                }
                kotlin.Pair pair3 = pair;
                org.joda.time.DateTime dateTime3 = dateTime;
                com.truecaller.data.entity.messaging.Participant[] participantArr5 = participantArr3;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                java.util.ArrayList arrayList3 = arrayList;
                java.util.LinkedHashMap linkedHashMap4 = linkedHashMap;
                arrayList3.add(s0Var);
                if (arrayList3.size() > 25) {
                    arrayList3.remove(0);
                }
                this.w.getClass();
                if (android.os.Build.VERSION.SDK_INT > 27 && entityArr.length >= 2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entityArr, "entities");
                    for (com.truecaller.messaging.data.types.Entity entity3 : entityArr) {
                        if (entity3.getC() || entity3.getA()) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entityArr, "entities");
                            for (com.truecaller.messaging.data.types.Entity entity4 : entityArr) {
                                if (entity4.getK() || entity4.getL()) {
                                    if ((entityArr.length >= 2 && a.bar.H(message) && ((wj2.d) barVar.get()).a.d("massImNotificationTextEllipsisLimit_56867", "40").length() > 0) || ((entityArr.length >= 2 && message.m() && a.bar.O(message)) || entityArr.length == 2)) {
                                        java.lang.CharSequence h2 = h(message, false, pair3);
                                        java.lang.String str4 = "";
                                        if (entityArr.length >= 2 && a.bar.H(message)) {
                                            try {
                                                java.lang.String J = kotlin.text.c0.J(java.lang.Integer.parseInt(((wj2.d) barVar.get()).a.d("massImNotificationTextEllipsisLimit_56867", "40")), h2.toString());
                                                int S = kotlin.text.StringsKt.S(J);
                                                while (true) {
                                                    if (-1 >= S) {
                                                        break;
                                                    }
                                                    if (J.charAt(S) == ' ') {
                                                        str4 = J.substring(0, S + 1);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "substring(...)");
                                                        break;
                                                    }
                                                    S--;
                                                }
                                                h2 = str4 + "...";
                                            } catch (java.lang.Exception unused4) {
                                            }
                                        } else if (entityArr.length >= 2 && message.m() && a.bar.O(message)) {
                                            try {
                                                java.lang.String J2 = kotlin.text.c0.J(40, h2.toString());
                                                int S2 = kotlin.text.StringsKt.S(J2);
                                                while (true) {
                                                    if (-1 >= S2) {
                                                        break;
                                                    }
                                                    if (J2.charAt(S2) == ' ') {
                                                        str4 = J2.substring(0, S2 + 1);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str4, "substring(...)");
                                                        break;
                                                    }
                                                    S2--;
                                                }
                                                h2 = str4 + "...";
                                            } catch (java.lang.Exception e5) {
                                                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e5);
                                            }
                                        } else if (entityArr.length != 2) {
                                            h2 = "";
                                        }
                                        fraudWarningScope2 = fraudWarningScope;
                                        arrayList3.add(new f6.s0(h2, dateTime3.i(), q(message, fraudWarningScope2)));
                                        if (arrayList3.size() > 25) {
                                            arrayList3.remove(0);
                                        }
                                        conversation3 = conversation;
                                        list3 = list;
                                        spamNotificationType2 = spamNotificationType;
                                        participantArr2 = participantArr5;
                                        fraudWarningScope3 = fraudWarningScope2;
                                        j2 = j;
                                        concurrentHashMap2 = concurrentHashMap3;
                                        barVar2 = barVar;
                                        f0Var2 = f0Var;
                                        v0Var2 = v0Var;
                                        z4 = false;
                                        linkedHashMap3 = linkedHashMap4;
                                        arrayList2 = arrayList3;
                                        list5 = list2;
                                    }
                                }
                            }
                        }
                    }
                }
                fraudWarningScope2 = fraudWarningScope;
                conversation3 = conversation;
                list3 = list;
                spamNotificationType2 = spamNotificationType;
                participantArr2 = participantArr5;
                fraudWarningScope3 = fraudWarningScope2;
                j2 = j;
                concurrentHashMap2 = concurrentHashMap3;
                barVar2 = barVar;
                f0Var2 = f0Var;
                v0Var2 = v0Var;
                z4 = false;
                linkedHashMap3 = linkedHashMap4;
                arrayList2 = arrayList3;
                list5 = list2;
            } else {
                f6.v0 v0Var3 = v0Var2;
                f6.f0 f0Var4 = f0Var2;
                com.truecaller.data.entity.messaging.Participant[] participantArr6 = participantArr2;
                concurrentHashMap2.put(java.lang.Long.valueOf(j2), linkedHashMap3);
                f0Var4.t(v0Var3);
                f0Var4.Q.when = ((com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0(list)).e.i();
                f0Var4.v = "com.truecaller.messaging.NEW_MESSAGES";
                f0Var4.N = 2;
                java.util.Map c2 = kotlin.collections.q0.c(new kotlin.Pair(conversation, list));
                if (!c2.isEmpty()) {
                    java.util.Iterator it2 = c2.entrySet().iterator();
                    loop11: while (it2.hasNext()) {
                        java.util.List<com.truecaller.messaging.data.types.Message> list7 = (java.util.List) ((java.util.Map.Entry) it2.next()).getValue();
                        if (!(list7 instanceof java.util.Collection) || !list7.isEmpty()) {
                            for (com.truecaller.messaging.data.types.Message message4 : list7) {
                                if (a.bar.E(message4) && !((com.truecaller.messaging.notifications.l) this.j.get()).a(message4.a)) {
                                    z2 = true;
                                    break loop11;
                                }
                            }
                        }
                    }
                }
                z2 = false;
                f0Var4.l(8, !z2);
                f0Var4.O = !z5;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var4, "setAllowSystemGeneratedContextualActions(...)");
                if (((z22.qux) this.C.get()).a()) {
                    f0Var4.K = "home-shortcut-messages-id";
                    f0Var4.k = list.size();
                }
                if (android.os.Build.VERSION.SDK_INT < 30 || (i = conversation.b) == 2 || i == 3 || (conversation.c() && conversation.n <= 0 && conversation.o <= 0)) {
                    participantArr = participantArr6;
                    conversation2 = conversation;
                } else {
                    int intValue = ((java.lang.Number) this.O.getValue()).intValue();
                    participantArr = participantArr6;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participantArr, "participants");
                    if (ak.e1.C(participantArr)) {
                        java.lang.Object obj = this.e.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        ((w31.c) obj).C2(new com.truecaller.common.ui.avatar.AvatarXConfig((android.net.Uri) null, (java.lang.String) null, (java.lang.String) null, false, true, false, false, false, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, -33), false);
                        paint = null;
                        e = (android.graphics.Bitmap) fg3.h0.O(kotlin.coroutines.d.a, new com.truecaller.messaging.notifications.f0(this, intValue, null, 0));
                    } else {
                        paint = null;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participantArr, "participants");
                        java.lang.Object E = kotlin.collections.v.E(participantArr);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(E, "first(...)");
                        e = e((com.truecaller.data.entity.messaging.Participant) E, intValue);
                    }
                    int width = (int) (e.getWidth() * 1.3d);
                    int height = (int) (e.getHeight() * 1.3d);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "<this>");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "<this>");
                    android.graphics.Bitmap.Config config = e.getConfig();
                    if (config == null) {
                        config = android.graphics.Bitmap.Config.ARGB_8888;
                    }
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(height, width, config);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                    new android.graphics.Canvas(createBitmap).drawBitmap(e, (height - e.getWidth()) / 2.0f, (width - e.getHeight()) / 2.0f, paint);
                    createBitmap.getClass();
                    androidx.core.graphics.drawable.IconCompat iconCompat2 = new androidx.core.graphics.drawable.IconCompat(5);
                    iconCompat2.b = createBitmap;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(iconCompat2, "let(...)");
                    conversation2 = conversation;
                    com.truecaller.data.entity.messaging.Participant[] participantArr7 = conversation2.l;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participantArr7, "participants");
                    java.lang.String q = k9.d.q("conversation_", kotlin.collections.v.P(participantArr7, ",", (java.lang.String) null, (java.lang.String) null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t(10), 30));
                    ?? obj2 = new java.lang.Object();
                    ((h6.b) obj2).a = context;
                    ((h6.b) obj2).b = q;
                    ((h6.b) obj2).e = ((s42.qux) ((s42.baz) this.k.get())).g(conversation2);
                    ((h6.b) obj2).h = iconCompat2;
                    ((h6.b) obj2).l = true;
                    int i8 = com.truecaller.messaging.conversation.ConversationActivity.f0;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participantArr, "participants");
                    java.lang.String packageName = context.getPackageName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(participantArr, "participants");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageName, "packageName");
                    java.lang.String[] strArr = new java.lang.String[participantArr.length];
                    int[] iArr = new int[participantArr.length];
                    int i9 = 0;
                    for (int length2 = participantArr.length; i9 < length2; length2 = length2) {
                        strArr[i9] = participantArr[i9].e;
                        iArr[i9] = participantArr[i9].b;
                        i9++;
                    }
                    android.content.Intent putExtra = new android.content.Intent("com.truecaller.OPEN_CONVERSATION").putExtra("normalized_addresses", strArr).putExtra("participant_types", iArr);
                    putExtra.setPackage(packageName);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "apply(...)");
                    int i10 = android.os.Build.VERSION.SDK_INT;
                    if (i10 >= 29) {
                        oi2.baz.g(putExtra, jj3.bar.m(",", strArr));
                    }
                    ((h6.b) obj2).c = new android.content.Intent[]{putExtra};
                    if (!android.text.TextUtils.isEmpty(((h6.b) obj2).e)) {
                        android.content.Intent[] intentArr = ((h6.b) obj2).c;
                        if (intentArr != null && intentArr.length != 0) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj2, "build(...)");
                            int a = i10 >= 25 ? h6.a.a(h6.a.e(context.getSystemService(h6.a.f()))) : 5;
                            if (a != 0) {
                                if (i10 <= 29 && (iconCompat = ((h6.b) obj2).h) != null && (((i2 = iconCompat.a) == 6 || i2 == 4) && (k = iconCompat.k(context)) != null && (decodeStream = android.graphics.BitmapFactory.decodeStream(k)) != null)) {
                                    if (i2 == 6) {
                                        e2 = new androidx.core.graphics.drawable.IconCompat(5);
                                        e2.b = decodeStream;
                                    } else {
                                        e2 = androidx.core.graphics.drawable.IconCompat.e(decodeStream);
                                    }
                                    ((h6.b) obj2).h = e2;
                                }
                                if (i10 >= 30) {
                                    h6.qux.o(h6.a.e(context.getSystemService(h6.a.f())), obj2.c());
                                } else if (i10 >= 25) {
                                    android.content.pm.ShortcutManager e6 = h6.a.e(context.getSystemService(h6.a.f()));
                                    if (!h6.a.l(e6)) {
                                        java.util.List g = h6.a.g(e6);
                                        if (g.size() >= a) {
                                            h6.a.j(e6, java.util.Arrays.asList(h6.d.a(g)));
                                        }
                                        h6.a.p(e6, java.util.Arrays.asList(obj2.c()));
                                    }
                                }
                                if (h6.e.a == null) {
                                    try {
                                        h6.e.a = (h6.c) java.lang.Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, h6.e.class.getClassLoader()).getMethod("getInstance", android.content.Context.class).invoke(null, context);
                                    } catch (java.lang.Exception unused5) {
                                    }
                                    if (h6.e.a == null) {
                                        h6.e.a = new java.lang.Object();
                                    }
                                }
                                try {
                                    h6.e.a.getClass();
                                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                    if (arrayList4.size() >= a) {
                                        java.util.Iterator it3 = arrayList4.iterator();
                                        java.lang.String str5 = null;
                                        int i11 = -1;
                                        while (it3.hasNext()) {
                                            h6.b bVar = (h6.b) it3.next();
                                            int i13 = bVar.m;
                                            if (i13 > i11) {
                                                str5 = bVar.b;
                                                i11 = i13;
                                            }
                                        }
                                        java.util.Arrays.asList(str5);
                                    }
                                    java.util.Arrays.asList(obj2);
                                    java.util.Iterator it4 = ((java.util.ArrayList) h6.e.l0(context)).iterator();
                                    if (it4.hasNext()) {
                                        if (it4.next() == null) {
                                            java.util.Collections.singletonList(obj2);
                                            throw null;
                                        }
                                        throw new java.lang.ClassCastException();
                                    }
                                } catch (java.lang.Exception unused6) {
                                    java.util.Iterator it5 = ((java.util.ArrayList) h6.e.l0(context)).iterator();
                                    if (it5.hasNext()) {
                                        if (it5.next() == null) {
                                            java.util.Collections.singletonList(obj2);
                                            throw null;
                                        }
                                        throw new java.lang.ClassCastException();
                                    }
                                } catch (java.lang.Throwable th4) {
                                    java.util.Iterator it6 = ((java.util.ArrayList) h6.e.l0(context)).iterator();
                                    if (!it6.hasNext()) {
                                        h6.e.x0(context, ((h6.b) obj2).b);
                                        throw th4;
                                    }
                                    if (it6.next() == null) {
                                        java.util.Collections.singletonList(obj2);
                                        throw null;
                                    }
                                    throw new java.lang.ClassCastException();
                                }
                                h6.e.x0(context, ((h6.b) obj2).b);
                            }
                            f0Var4.K = q;
                            java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.z.q(list6, 10));
                            java.util.Iterator it7 = list6.iterator();
                            while (it7.hasNext()) {
                                arrayList5.add(((com.truecaller.messaging.data.types.Message) it7.next()).c);
                            }
                            for (com.truecaller.data.entity.messaging.Participant participant : kotlin.collections.CollectionsKt.K0(arrayList5)) {
                                kotlin.jvm.internal.Intrinsics.d(participant);
                                f0Var4.c.add(p(participant));
                            }
                        } else {
                            throw new java.lang.IllegalArgumentException("Shortcut must have an intent");
                        }
                    } else {
                        throw new java.lang.IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                }
                if (!z) {
                    l(f0Var4, ((com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0(list)).k, m((com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0(list)), conversation2);
                }
                if (yy.baz.B(conversation2)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participantArr, "participants");
                    com.truecaller.data.entity.messaging.Participant participant2 = (com.truecaller.data.entity.messaging.Participant) kotlin.collections.v.E(participantArr);
                    if (participant2 != null && (str2 = participant2.p) != null) {
                        vp1.baz bazVar = vp1.baz.l;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "size");
                        if (str2.length() == 0) {
                            str2 = null;
                        }
                        jg.o oVar = new jg.o(str2 != null ? android.net.Uri.parse(str2) : null, bazVar);
                        oVar.b = true;
                        android.graphics.Bitmap v = j0.b.v(oVar, context);
                        if (v != null) {
                            f0Var4.m(v);
                        }
                    }
                }
                a(f0Var4, kotlin.collections.q0.e(kotlin.collections.q0.c(new kotlin.Pair(conversation2, list)), new a6.b(18)), str, false, spamNotificationType, z5);
                java.lang.Object obj3 = this.q.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                android.app.Notification d = f0Var4.d();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
                ((s62.f) ((s62.d) obj3)).w(valueOf, 2131365483, d, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationIncomingMessage");
                com.truecaller.messaging.data.types.Message message5 = (com.truecaller.messaging.data.types.Message) kotlin.collections.CollectionsKt.d0(list);
                if (a.bar.x(message5)) {
                    k9.d.g(this.K, ((zr1.q) this.L.get()).b(message5), ((zr1.u) this.M.get()).b(conversation2), (com.truecaller.insights.fraud.analytics.FraudWarningType) null, com.truecaller.insights.fraud.analytics.FraudWarningSurface.NOTIFICATION, com.truecaller.insights.fraud.analytics.FraudWarningCopyVariant.POTENTIAL_FRAUD, fraudWarningScope == null ? vy2.i.u(message5) : fraudWarningScope, (java.lang.Integer) null, 140);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, f6.f1] */
    public final f6.f1 k() {
        java.lang.String string = this.c.getString(2132018213);
        pg2.m mVar = (pg2.m) fg3.h0.O(kotlin.coroutines.d.a, new com.truecaller.call_assistant.presentation.disable.c(this, (df3.bar) null, 3));
        s81.baz bazVar = new s81.baz(0);
        java.lang.String str = "";
        bazVar.e = this.m.i("profileNumber", "");
        bazVar.m = mVar.getFirstName();
        java.lang.String avatarUrl = mVar.getAvatarUrl();
        if (avatarUrl != null) {
            str = avatarUrl;
        }
        bazVar.o = str;
        com.truecaller.data.entity.messaging.Participant a = bazVar.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "build(...)");
        androidx.core.graphics.drawable.IconCompat e = androidx.core.graphics.drawable.IconCompat.e(e(a, ((java.lang.Number) this.N.getValue()).intValue()));
        ?? obj = new java.lang.Object();
        ((f6.f1) obj).a = string;
        ((f6.f1) obj).b = e;
        ((f6.f1) obj).c = null;
        ((f6.f1) obj).d = null;
        ((f6.f1) obj).e = false;
        ((f6.f1) obj).f = false;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "build(...)");
        return obj;
    }

    public final void l(f6.f0 f0Var, int i, boolean z, com.truecaller.messaging.data.types.Conversation conversation) {
        int i2;
        if (((xz1.r) this.h).y0() && ((android.media.AudioManager) this.d.a.getSystemService("audio")).getRingerMode() != 0) {
            i2 = 6;
        } else {
            i2 = 4;
        }
        f0Var.k(i2);
        qc3.bar barVar = this.i;
        if (i == 2) {
            if (z) {
                f0Var.s(((m03.y0) barVar.get()).d());
                f0Var.Q.vibrate = ((m03.y0) barVar.get()).e();
            } else {
                f0Var.s(((m03.y0) barVar.get()).a());
            }
        } else {
            f0Var.s(((m03.y0) barVar.get()).c());
        }
        java.lang.String str = conversation.M;
        if (str != null) {
            android.net.Uri parse = android.net.Uri.parse(str);
            kotlin.jvm.internal.Intrinsics.d(parse);
            if (gf0.e.w(this.c, parse)) {
                f0Var.s(parse);
            } else {
                fg3.h0.P(new com.truecaller.data.country.f(this, conversation, null, 6));
                conversation.M = null;
            }
        }
        f0Var.l = 5;
    }

    public final boolean m(com.truecaller.messaging.data.types.Message message) {
        if (((qo1.l) ((qo1.k) this.g.get())).h() && this.t.j() && a.bar.P(message)) {
            return true;
        }
        return false;
    }

    public final boolean n(com.truecaller.messaging.data.types.Conversation conversation, com.truecaller.messaging.notifications.SpamNotificationType spamNotificationType) {
        if (!f() || conversation.O != 2) {
            qc3.bar barVar = this.D;
            if (!((a32.x) barVar.get()).b() || spamNotificationType == com.truecaller.messaging.notifications.SpamNotificationType.NO_SPAM_NOTIFICATION || ((a32.x) barVar.get()).a() == com.truecaller.messaging.MessagingLevel.HIGH) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean o(java.util.Map map, com.truecaller.messaging.notifications.SpamNotificationType spamNotificationType, com.truecaller.messaging.notifications.FraudNotificationType fraudNotificationType) {
        if (spamNotificationType == com.truecaller.messaging.notifications.SpamNotificationType.NO_SPAM_NOTIFICATION && fraudNotificationType == null) {
            if (!map.isEmpty()) {
                java.util.Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.List<com.truecaller.messaging.data.types.Message> list = (java.util.List) ((java.util.Map.Entry) it.next()).getValue();
                    if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                        for (com.truecaller.messaging.data.types.Message message : list) {
                            if (((com.truecaller.messaging.notifications.l) this.j.get()).a(message.a)) {
                                com.truecaller.messaging.data.types.Entity[] entityArr = message.o;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entityArr, "entities");
                                for (com.truecaller.messaging.data.types.Entity entity : entityArr) {
                                    if (entity.getA() || entity.getC()) {
                                        return true;
                                    }
                                }
                            } else {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, f6.f1] */
    public final f6.f1 p(com.truecaller.data.entity.messaging.Participant participant) {
        java.lang.String r = ak.e1.r(participant);
        androidx.core.graphics.drawable.IconCompat e = androidx.core.graphics.drawable.IconCompat.e(e(participant, ((java.lang.Number) this.N.getValue()).intValue()));
        ?? obj = new java.lang.Object();
        ((f6.f1) obj).a = r;
        ((f6.f1) obj).b = e;
        ((f6.f1) obj).c = null;
        ((f6.f1) obj).d = null;
        ((f6.f1) obj).e = false;
        ((f6.f1) obj).f = true;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "build(...)");
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (ak.e1.v(r3) != false) goto L12;
     */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, f6.f1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f6.f1 q(com.truecaller.messaging.data.types.Message message, com.truecaller.insights.fraud.analytics.FraudWarningScope fraudWarningScope) {
        boolean I = a.bar.I(message);
        com.truecaller.data.entity.messaging.Participant participant = message.c;
        if (I) {
            return k();
        }
        if (((qo1.l) ((qo1.k) this.g.get())).d()) {
            if (com.truecaller.insights.fraud.analytics.FraudWarningScope.SENDER != fraudWarningScope) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participant, "participant");
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participant, "participant");
            java.lang.String r = ak.e1.r(participant);
            androidx.core.graphics.drawable.IconCompat f = androidx.core.graphics.drawable.IconCompat.f(2131232669, this.c);
            ?? obj = new java.lang.Object();
            ((f6.f1) obj).a = r;
            ((f6.f1) obj).b = f;
            ((f6.f1) obj).c = null;
            ((f6.f1) obj).d = null;
            ((f6.f1) obj).e = false;
            ((f6.f1) obj).f = true;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "build(...)");
            return obj;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participant, "participant");
        return p(participant);
    }
}
