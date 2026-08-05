package com.truecaller.fcm;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FcmMessageListenerService extends com.google.firebase.messaging.FirebaseMessagingService implements bd3.qux {
    public volatile yc3.g a;
    public final java.lang.Object b = new java.lang.Object();
    public boolean c = false;
    public com.truecaller.push.a d;
    public com.truecaller.push.bar e;
    public np1.baz f;

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = new yc3.g(this);
                    }
                } finally {
                }
            }
        }
        return this.a.X3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.c) {
            this.c = true;
            tx.w wVar = ((ko1.bar) X3()).b;
            this.d = (com.truecaller.push.a) wVar.Eo.get();
            this.e = (com.truecaller.push.bar) wVar.b.ld.get();
            this.f = (np1.baz) wVar.Qm.get();
        }
        super/*android.app.Service*/.onCreate();
    }

    public final void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        java.lang.Object obj;
        er0.bar barVar;
        com.truecaller.clevertap.CleverTapMessageHandlerType cleverTapMessageHandlerType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        np1.baz bazVar = this.f;
        if (bazVar != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            if (bazVar.b() && remoteMessage.K1().containsValue("freshchat_user")) {
                np1.baz bazVar2 = this.f;
                if (bazVar2 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
                    if (bazVar2.a() != null) {
                        com.freshchat.consumer.sdk.Freshchat.handleFcmMessage(bazVar2.a, remoteMessage);
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("freshChatManager");
                throw null;
            }
            com.truecaller.push.bar barVar2 = this.e;
            if (barVar2 != null) {
                synchronized (barVar2) {
                    try {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
                        java.util.Iterator it = barVar2.i.iterator();
                        if (it.hasNext()) {
                            obj = it.next();
                            ((bi2.bar) obj).getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
                        } else {
                            obj = null;
                        }
                        bi2.bar barVar3 = (bi2.bar) obj;
                        if (barVar3 == null) {
                            o82.a.C(new java.lang.IllegalArgumentException("RemoteMessage -Unsupported type (No parser found!)"));
                            return;
                        }
                        com.truecaller.push.parser.RemoteMessageParserType remoteMessageParserType = barVar3.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
                        kotlin.jvm.internal.Intrinsics.e(remoteMessage, "null cannot be cast to non-null type com.google.firebase.messaging.RemoteMessage");
                        java.util.Map K1 = remoteMessage.K1();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(K1, "getData(...)");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
                        kotlin.jvm.internal.Intrinsics.e(remoteMessage, "null cannot be cast to non-null type com.google.firebase.messaging.RemoteMessage");
                        java.lang.Object obj2 = remoteMessage.a.get("google.sent_time");
                        if (!(obj2 instanceof java.lang.Long) && (obj2 instanceof java.lang.String)) {
                            try {
                                java.lang.Long.parseLong((java.lang.String) obj2);
                            } catch (java.lang.NumberFormatException unused) {
                            }
                        }
                        java.util.Map map = (z0.b) K1;
                        java.lang.String str = (java.lang.String) map.get("_type");
                        if (str == null && (str = (java.lang.String) map.get("wzrk_pn")) == null) {
                            if (!map.containsKey("a") && !map.containsKey("e")) {
                                str = null;
                            }
                            str = "notification";
                        }
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -1437526704:
                                    if (!str.equals("call_recording")) {
                                        break;
                                    } else {
                                        ((s01.e) barVar2.e.get()).a(map);
                                        break;
                                    }
                                case -1018298903:
                                    if (!str.equals("voicemail")) {
                                        break;
                                    } else {
                                        p.c3 c3Var = barVar2.h;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "data");
                                        fg3.h0.J((fg3.e0) c3Var.g, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new i43.bar(c3Var, map, (df3.bar) null, 0), 3);
                                        break;
                                    }
                                case -1001256387:
                                    if (str.equals("call_assistant") && ((qo1.c) ((qo1.b) barVar2.g.get())).c() && (barVar = (er0.bar) barVar2.d.get()) != null) {
                                        barVar.a(map);
                                        break;
                                    }
                                    break;
                                case -139391346:
                                    if (!str.equals("cloud_telephony")) {
                                        break;
                                    } else {
                                        s21.baz bazVar3 = barVar2.f;
                                        bazVar3.getClass();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "data");
                                        fg3.h0.J(bazVar3.f, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new p61.bar(map, bazVar3, (df3.bar) null, 5), 3);
                                        break;
                                    }
                                case 3364:
                                    if (!str.equals("im")) {
                                        break;
                                    } else {
                                        ((f42.v) barVar2.b.get()).a(map);
                                        break;
                                    }
                                case 3569038:
                                    if (!str.equals("true")) {
                                        break;
                                    } else {
                                        jz0.m mVar = (jz0.m) barVar2.a.get();
                                        int i = com.truecaller.push.baz.a[remoteMessageParserType.ordinal()];
                                        if (i != 1) {
                                            if (i == 2) {
                                                cleverTapMessageHandlerType = com.truecaller.clevertap.CleverTapMessageHandlerType.HMS;
                                            } else {
                                                throw new java.lang.RuntimeException();
                                            }
                                        } else {
                                            cleverTapMessageHandlerType = com.truecaller.clevertap.CleverTapMessageHandlerType.FCM;
                                        }
                                        mVar.a(remoteMessage, cleverTapMessageHandlerType, map);
                                        break;
                                    }
                                case 595233003:
                                    if (!str.equals("notification")) {
                                        break;
                                    } else {
                                        barVar2.a(map);
                                        break;
                                    }
                            }
                        }
                        return;
                    } finally {
                    }
                }
            }
            kotlin.jvm.internal.Intrinsics.n("pushHandler");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("freshChatManager");
        throw null;
    }

    public final void onNewToken(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "token");
        super.onNewToken(str);
        com.truecaller.push.a aVar = this.d;
        if (aVar != null) {
            com.truecaller.push.qux quxVar = new com.truecaller.push.qux(com.truecaller.push.PushProviderService.GMS, str);
            fg3.h0.J(fg3.f1.a, aVar.b, (fg3.f0) null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux(aVar, quxVar, (df3.bar) null, 16), 2);
            np1.baz bazVar = this.f;
            if (bazVar != null) {
                if (bazVar.b()) {
                    np1.baz bazVar2 = this.f;
                    if (bazVar2 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "token");
                        com.freshchat.consumer.sdk.Freshchat a = bazVar2.a();
                        if (a != null) {
                            a.setPushRegistrationToken(str);
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("freshChatManager");
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("freshChatManager");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("pushIdManager");
        throw null;
    }
}
