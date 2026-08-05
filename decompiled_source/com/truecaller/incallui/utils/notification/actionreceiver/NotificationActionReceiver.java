package com.truecaller.incallui.utils.notification.actionreceiver;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NotificationActionReceiver extends android.content.BroadcastReceiver implements wr1.bar {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public qw2.g c;
    public android.content.Context d;

    public final qw2.g a() {
        qw2.g gVar = this.c;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final void b(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        ((wr1.baz) o40.bar.k(context)).i2(this);
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
        android.content.Context context2;
        android.content.Context context3;
        com.truecaller.incallui.utils.audio.AudioRoute audioRoute;
        rr1.c0 c0Var;
        rr1.c0 c0Var2;
        ur1.bar barVar;
        ur1.bar barVar2;
        android.content.Context context4;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        b(context, intent);
        if (context != null && intent != null) {
            this.d = context;
            ((com.truecaller.sdk.bar) a()).a = this;
            java.lang.String action = intent.getAction();
            if (action != null) {
                boolean z = false;
                switch (action.hashCode()) {
                    case -2140708147:
                        if (action.equals("HangUp")) {
                            qw2.g a = a();
                            ro0.f.u((rr1.n) a.c, 3);
                            wr1.bar barVar3 = (wr1.bar) ((com.truecaller.sdk.bar) a).a;
                            if (barVar3 != null && (context2 = ((com.truecaller.incallui.utils.notification.actionreceiver.NotificationActionReceiver) barVar3).d) != null) {
                                ak.r0.l(context2);
                            }
                            a.c2(com.truecaller.incallui.analytics.events.NotificationUIEvent.HANGUP_CLICK);
                            break;
                        }
                        break;
                    case -1087964458:
                        if (action.equals("Decline")) {
                            qw2.g a2 = a();
                            rr1.n nVar = (rr1.n) a2.c;
                            if (!((ir1.e) nVar.b.get()).b()) {
                                nVar.v();
                            } else {
                                rr1.m0 m0Var = nVar.K;
                                if (m0Var != null) {
                                    m0Var.g = true;
                                    m0Var.a.reject(false, null);
                                }
                                nVar.E = !nVar.p();
                            }
                            wr1.bar barVar4 = (wr1.bar) ((com.truecaller.sdk.bar) a2).a;
                            if (barVar4 != null && (context3 = ((com.truecaller.incallui.utils.notification.actionreceiver.NotificationActionReceiver) barVar4).d) != null) {
                                ak.r0.l(context3);
                            }
                            a2.c2(com.truecaller.incallui.analytics.events.NotificationUIEvent.DECLINE_CLICK);
                            break;
                        }
                        break;
                    case 1053541867:
                        if (action.equals("ToggleSpeaker")) {
                            qw2.g a3 = a();
                            rr1.l0 l0Var = (rr1.l0) a3.d;
                            ig3.h2 a4 = l0Var.a();
                            if (a4 != null && (barVar = (ur1.bar) a4.getValue()) != null) {
                                audioRoute = barVar.a;
                            } else {
                                audioRoute = null;
                            }
                            if (audioRoute == com.truecaller.incallui.utils.audio.AudioRoute.SPEAKER) {
                                rr1.i0 i0Var = l0Var.a;
                                if (i0Var != null && (c0Var2 = (rr1.c0) ((com.truecaller.sdk.bar) i0Var).a) != null) {
                                    ((com.truecaller.incallui.service.InCallUIService) c0Var2).setAudioRoute(5);
                                }
                                a3.c2(com.truecaller.incallui.analytics.events.NotificationUIEvent.SPEAKER_OFF_CLICK);
                                break;
                            } else {
                                rr1.i0 i0Var2 = l0Var.a;
                                if (i0Var2 != null && (c0Var = (rr1.c0) ((com.truecaller.sdk.bar) i0Var2).a) != null) {
                                    ((com.truecaller.incallui.service.InCallUIService) c0Var).setAudioRoute(8);
                                }
                                a3.c2(com.truecaller.incallui.analytics.events.NotificationUIEvent.SPEAKER_ON_CLICK);
                                break;
                            }
                        }
                        break;
                    case 1140822957:
                        if (action.equals("ToggleMute")) {
                            qw2.g a5 = a();
                            rr1.l0 l0Var2 = (rr1.l0) a5.d;
                            ig3.h2 a6 = l0Var2.a();
                            if (a6 != null && (barVar2 = (ur1.bar) a6.getValue()) != null) {
                                z = barVar2.d;
                            }
                            l0Var2.b(!z);
                            if (z) {
                                a5.c2(com.truecaller.incallui.analytics.events.NotificationUIEvent.UNMUTE_CLICK);
                                break;
                            } else {
                                a5.c2(com.truecaller.incallui.analytics.events.NotificationUIEvent.MUTE_CLICK);
                                break;
                            }
                        }
                        break;
                    case 1966025694:
                        if (action.equals("Answer")) {
                            qw2.g a7 = a();
                            rr1.i0 i0Var3 = ((rr1.l0) a7.d).a;
                            if (i0Var3 != null) {
                                i0Var3.H = false;
                                i0Var3.g2();
                            }
                            rr1.n nVar2 = (rr1.n) a7.c;
                            rr1.m0 m0Var2 = nVar2.K;
                            if (m0Var2 != null) {
                                fg3.h0.J(nVar2, nVar2.g, (fg3.f0) null, new rr1.d(nVar2, m0Var2, null, 0), 2);
                            }
                            wr1.bar barVar5 = (wr1.bar) ((com.truecaller.sdk.bar) a7).a;
                            if (barVar5 != null && (context4 = ((com.truecaller.incallui.utils.notification.actionreceiver.NotificationActionReceiver) barVar5).d) != null) {
                                ak.r0.l(context4);
                            }
                            a7.c2(com.truecaller.incallui.analytics.events.NotificationUIEvent.ANSWER_CLICK);
                            break;
                        }
                        break;
                }
            }
            ((com.truecaller.sdk.bar) a()).a = null;
            this.d = null;
        }
    }
}
