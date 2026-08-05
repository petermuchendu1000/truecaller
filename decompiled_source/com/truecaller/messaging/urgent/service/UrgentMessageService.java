package com.truecaller.messaging.urgent.service;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class UrgentMessageService extends r42.baz implements r42.e {
    public static final /* synthetic */ int j = 0;
    public s62.d e;
    public r42.f f;
    public r42.j g;
    public r42.d h;
    public final co.t i;

    public UrgentMessageService() {
        super(0);
        this.i = new co.t(this, 27);
    }

    public final r42.f b() {
        r42.f fVar = this.f;
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        r42.d dVar = this.h;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.Intrinsics.n("binder");
        throw null;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        r42.j jVar = this.g;
        if (jVar != null) {
            jVar.g.setVisibility(0);
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenterView");
            throw null;
        }
    }

    @Override // r42.baz, android.app.Service
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        super.onCreate();
        this.g = new r42.j(yy.qux.v(this, true), b());
        b().b = this;
        r42.f b = b();
        r42.j jVar = this.g;
        if (jVar != null) {
            b.u0(jVar);
            this.h = new r42.d(b());
            androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this).registerReceiver(this.i, new android.content.IntentFilter("com.truecaller.messaging.urgent.ACTION_DISMISS_CONVERSATION"));
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenterView");
        throw null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        b().m1();
        b().b = null;
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(this.i);
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        java.lang.String str;
        java.lang.String concat;
        r42.e eVar;
        r42.e eVar2;
        r42.e eVar3;
        super.onStartCommand(intent, i, i2);
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 210284648) {
                if (hashCode == 1203654752 && str.equals("notification_tapped") && (eVar3 = (r42.e) ((of0.a) b()).b) != null) {
                    com.truecaller.messaging.urgent.service.UrgentMessageService urgentMessageService = (com.truecaller.messaging.urgent.service.UrgentMessageService) eVar3;
                    int i3 = com.truecaller.messaging.urgent.conversations.UrgentConversationsActivity.o0;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urgentMessageService, "context");
                    android.content.Intent flags = new android.content.Intent(urgentMessageService, (java.lang.Class<?>) com.truecaller.messaging.urgent.conversations.UrgentConversationsActivity.class).setFlags(268435456);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(flags, "setFlags(...)");
                    urgentMessageService.startActivity(flags);
                    return 2;
                }
                return 2;
            }
            if (str.equals("new_message")) {
                s62.d dVar = this.e;
                if (dVar != null) {
                    android.content.Intent action = new android.content.Intent(this, (java.lang.Class<?>) com.truecaller.messaging.urgent.service.UrgentMessageService.class).setAction("notification_tapped");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(action, "setAction(...)");
                    android.app.PendingIntent s = ((s62.f) dVar).s(this, action, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "urgentMessageNotification");
                    s62.d dVar2 = this.e;
                    if (dVar2 != null) {
                        android.app.Notification build = new android.app.Notification.Builder(this, ((s62.f) dVar2).o("urgent_messages")).setSmallIcon(2131232920).setContentTitle(getString(2132023613)).setColor(getColor(2131102024)).setContentIntent(s).build();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                        startForeground(2131367350, build);
                        com.truecaller.messaging.data.types.Conversation conversation = (com.truecaller.messaging.data.types.Conversation) intent.getParcelableExtra("conversation");
                        r42.f b = b();
                        java.util.ArrayList arrayList = b.l;
                        if (conversation != null) {
                            long j2 = conversation.a;
                            java.util.Iterator it = arrayList.iterator();
                            int i4 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                    if (((com.truecaller.messaging.urgent.UrgentConversation) it.next()).a.a == j2) {
                                        break;
                                    }
                                    i4++;
                                } else {
                                    i4 = -1;
                                    break;
                                }
                            }
                            if (i4 >= 0) {
                                com.truecaller.messaging.urgent.UrgentConversation urgentConversation = (com.truecaller.messaging.urgent.UrgentConversation) arrayList.get(i4);
                                arrayList.set(i4, com.truecaller.messaging.urgent.UrgentConversation.a(urgentConversation, urgentConversation.b + 1, -1L));
                                fg3.o1 o1Var = (fg3.o1) b.o.remove(java.lang.Long.valueOf(j2));
                                if (o1Var != null) {
                                    o1Var.cancel((java.util.concurrent.CancellationException) null);
                                }
                            } else {
                                arrayList.add(0, new com.truecaller.messaging.urgent.UrgentConversation(conversation, 1, -1L));
                            }
                            b.f2();
                            if (b.m.isEmpty()) {
                                b.h.getClass();
                                if (android.os.Build.VERSION.SDK_INT >= 26 && (eVar = (r42.e) ((of0.a) b).b) != null) {
                                    java.lang.Object systemService = ((com.truecaller.messaging.urgent.service.UrgentMessageService) eVar).getSystemService("keyguard");
                                    kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
                                    if (((android.app.KeyguardManager) systemService).isKeyguardLocked() && (eVar2 = (r42.e) ((of0.a) b).b) != null) {
                                        com.truecaller.messaging.urgent.service.UrgentMessageService urgentMessageService2 = (com.truecaller.messaging.urgent.service.UrgentMessageService) eVar2;
                                        urgentMessageService2.startActivity(new android.content.Intent(urgentMessageService2, (java.lang.Class<?>) com.truecaller.messaging.urgent.UrgentMessageKeyguardActivity.class).addFlags(268435456));
                                    }
                                }
                                u03.g0 g0Var = b.f;
                                java.util.Iterator it2 = arrayList.iterator();
                                int i5 = 0;
                                while (it2.hasNext()) {
                                    i5 += ((com.truecaller.messaging.urgent.UrgentConversation) it2.next()).b;
                                }
                                r42.j jVar = (r42.j) ((com.truecaller.sdk.bar) b).a;
                                if (jVar != null) {
                                    u03.g0 g0Var2 = g0Var;
                                    java.lang.String e = g0Var2.e(new java.lang.Object[0], 2131886212, i5);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "getQuantityString(...)");
                                    com.truecaller.data.entity.messaging.Participant[] participantArr = conversation.l;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participantArr, "participants");
                                    java.lang.Object E = kotlin.collections.v.E(participantArr);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(E, "first(...)");
                                    java.lang.String r = ak.e1.r((com.truecaller.data.entity.messaging.Participant) E);
                                    if (arrayList.size() == 1) {
                                        concat = "";
                                    } else {
                                        concat = " ".concat(g0Var2.h(2132019045, new java.lang.Object[]{java.lang.Integer.valueOf(arrayList.size() - 1)}));
                                    }
                                    java.lang.String Q = h0.b.Q(r, concat);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "title");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Q, "subtitle");
                                    jVar.d.post(new p0.baz(jVar, e, Q, 14));
                                }
                                r42.j jVar2 = (r42.j) ((com.truecaller.sdk.bar) b).a;
                                if (jVar2 != null) {
                                    gj.m.k0(jVar2.e, true);
                                    return 2;
                                }
                                return 2;
                            }
                            return 2;
                        }
                        return 2;
                    }
                    kotlin.jvm.internal.Intrinsics.n("notificationManager");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("notificationManager");
                throw null;
            }
            return 2;
        }
        return 2;
    }
}
