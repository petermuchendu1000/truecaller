package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class i extends android.content.BroadcastReceiver {
    public final /* synthetic */ int a;
    public volatile boolean b;
    public final java.lang.Object c;

    public i(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = false;
                this.c = new java.lang.Object();
                return;
            case 2:
                this.b = false;
                this.c = new java.lang.Object();
                return;
            case 3:
                this.b = false;
                this.c = new java.lang.Object();
                return;
            case 4:
                this.b = false;
                this.c = new java.lang.Object();
                return;
            default:
                this.b = false;
                this.c = new java.lang.Object();
                return;
        }
    }

    private void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.b) {
            synchronized (this.c) {
                try {
                    if (!this.b) {
                        ((com.truecaller.messaging.notifications.y) o40.bar.k(context)).j2((com.truecaller.messaging.notifications.NotificationBroadcastReceiver) this);
                        this.b = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void b(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.b) {
            synchronized (this.c) {
                try {
                    if (!this.b) {
                        com.truecaller.service.AlarmReceiver alarmReceiver = (com.truecaller.service.AlarmReceiver) this;
                        tx.w wVar = ((dq2.bar) o40.bar.k(context)).H.b.a;
                        alarmReceiver.d = cd3.baz.a(wVar.P2);
                        alarmReceiver.e = cd3.baz.a(wVar.t3);
                        this.b = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void c(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.b) {
            synchronized (this.c) {
                try {
                    if (!this.b) {
                        ((hq2.l) o40.bar.k(context)).p2((com.truecaller.service.vbmissedcall.VBMissedCallNotificationActionReceiver) this);
                        this.b = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void d(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.b) {
            synchronized (this.c) {
                try {
                    if (!this.b) {
                        com.truecaller.util.CallMonitoringReceiver callMonitoringReceiver = (com.truecaller.util.CallMonitoringReceiver) this;
                        tx.c0 c0Var = ((m03.g) o40.bar.k(context)).H.b;
                        tx.w wVar = c0Var.a;
                        callMonitoringReceiver.d = wVar.M1;
                        callMonitoringReceiver.e = new uk2.q((fg3.e0) wVar.f0.get(), (y11.b) c0Var.U4.get());
                        this.b = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        switch (this.a) {
            case 0:
                a(context, intent);
                return;
            case 1:
                b(context, intent);
                return;
            case 2:
                c(context, intent);
                return;
            case 3:
                d(context, intent);
                return;
            default:
                com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
                if (!this.b) {
                    synchronized (this.c) {
                        try {
                            if (!this.b) {
                                ((u62.a) o40.bar.k(context)).h2((com.truecaller.notifications.MissedCallsNotificationActionReceiver) this);
                                this.b = true;
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
        }
    }
}
