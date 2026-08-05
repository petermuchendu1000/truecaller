package com.truecaller.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NotificationHandlerService extends u62.qux {
    public static final java.util.List n = kotlin.collections.y.j(new java.lang.String[]{"com.android.server.telecom", "com.android.phone", "com.google.android.dialer", "com.android.dialer", "com.android.contacts", "com.samsung.android.contacts", "com.samsung.android.dialer"});
    public static final java.util.List o = kotlin.collections.y.j(new java.lang.Integer[]{1, 6001, 10001});
    public static final java.util.List p = kotlin.collections.y.j(new java.lang.String[]{"missedcall", "missed_call"});
    public static final java.util.Set q;
    public static int r;
    public android.os.Looper d;
    public android.os.Handler e;
    public boolean f;
    public com.google.common.collect.ImmutableSet g;
    public hw0.a h;
    public m03.s i;
    public f6.c1 j;
    public xf2.a k;
    public kotlin.coroutines.CoroutineContext l;
    public final kotlin.Lazy m = kotlin.LazyKt.lazy(new tr2.baz(this, 5));

    static {
        java.lang.String[] strArr = {"com.whatsapp", "com.viber.voip", "jp.naver.line.android", "org.telegram.messenger"};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "elements");
        q = kotlin.collections.v.l0(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.truecaller.notifications.NotificationHandlerService notificationHandlerService, android.service.notification.StatusBarNotification statusBarNotification, ff3.qux quxVar) {
        u62.e eVar;
        java.lang.Object obj;
        int i;
        java.util.Locale locale;
        java.lang.String r2;
        if (quxVar instanceof u62.e) {
            eVar = (u62.e) quxVar;
            int i2 = eVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.A = i2 - Integer.MIN_VALUE;
                obj = eVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = eVar.A;
                boolean z = true;
                boolean z2 = false;
                if (i == 0) {
                    if (i == 1) {
                        statusBarNotification = eVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (statusBarNotification.isClearable() && n.contains(statusBarNotification.getPackageName())) {
                        hw0.q qVar = notificationHandlerService.h;
                        if (qVar != null) {
                            eVar.x = statusBarNotification;
                            eVar.A = 1;
                            obj = ef0.a.z(qVar.d(), hw0.q.s, false, eVar);
                            if (obj == barVar) {
                                return barVar;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("callingSettings");
                            throw null;
                        }
                    } else {
                        return java.lang.Boolean.FALSE;
                    }
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return java.lang.Boolean.FALSE;
                }
                f6.c1 c1Var = notificationHandlerService.j;
                if (c1Var != null) {
                    if (c1Var.a()) {
                        if (android.os.Build.VERSION.SDK_INT > 26) {
                            try {
                                f6.c1 c1Var2 = notificationHandlerService.j;
                                if (c1Var2 != null) {
                                    bf.i d = c1Var2.d();
                                    if (d != null && d.a == 0) {
                                    }
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("notificationManager");
                                    throw null;
                                }
                            } catch (java.lang.NullPointerException e) {
                                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
                            }
                        }
                        java.lang.String tag = statusBarNotification.getTag();
                        if (tag != null && (r2 = ax1.bar.r((locale = java.util.Locale.ROOT), "ROOT", tag, locale, "toLowerCase(...)")) != null && kotlin.text.StringsKt.N(r2, "voicemail", false)) {
                            return java.lang.Boolean.FALSE;
                        }
                        boolean contains = o.contains(new java.lang.Integer(statusBarNotification.getId()));
                        java.lang.String groupKey = statusBarNotification.getGroupKey();
                        if (groupKey != null) {
                            java.lang.String lowerCase = groupKey.toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (lowerCase != null) {
                                java.util.List list = p;
                                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                                    java.util.Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        if (kotlin.text.StringsKt.N(lowerCase, (java.lang.String) it.next(), false)) {
                                            break;
                                        }
                                    }
                                }
                                z = false;
                                z2 = z;
                            }
                        }
                        if (!contains && !z2) {
                            return java.lang.Boolean.FALSE;
                        }
                        notificationHandlerService.cancelNotification(statusBarNotification.getKey());
                        return java.lang.Boolean.TRUE;
                    }
                    return java.lang.Boolean.FALSE;
                }
                kotlin.jvm.internal.Intrinsics.n("notificationManager");
                throw null;
            }
        }
        eVar = new u62.e(notificationHandlerService, quxVar);
        obj = eVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = eVar.A;
        boolean z3 = true;
        boolean z23 = false;
        if (i == 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        new java.lang.StringBuilder("onBind() on ").append(java.lang.Thread.currentThread().getName());
        android.os.IBinder onBind = super.onBind(intent);
        r = getCurrentInterruptionFilter();
        return onBind;
    }

    @Override // u62.qux, android.app.Service
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!(getApplicationContext() instanceof tx.a1)) {
            stopSelf();
        } else {
            super.onCreate();
            new com.truecaller.analytics.technical.anr.f(this).start();
        }
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        java.lang.Thread.currentThread().getName();
        com.google.common.collect.ImmutableSet immutableSet = this.g;
        if (immutableSet != null) {
            java.util.Iterator it = immutableSet.iterator();
            while (it.hasNext()) {
                ((u62.c) it.next()).a();
            }
            android.os.Looper looper = this.d;
            if (looper != null) {
                looper.quit();
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("notificationHandlers");
        throw null;
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onInterruptionFilterChanged(int i) {
        r = i;
        ag2.q qVar = this.k;
        if (qVar != null) {
            qVar.h(com.truecaller.presence.api.model.AvailabilityTrigger.USER_ACTION, false);
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenceManager");
            throw null;
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerConnected() {
        java.lang.Thread.currentThread().getName();
        android.os.Handler handler = this.e;
        if (handler == null) {
            this.f = true;
        } else if (handler != null) {
            handler.post(new rr1.b0(this, 12));
        } else {
            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("Main handler is null");
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationPosted(android.service.notification.StatusBarNotification statusBarNotification) {
        fg3.h0.J((fg3.e0) this.m.getValue(), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new te1.g(statusBarNotification, this, null, 26), 3);
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRemoved(android.service.notification.StatusBarNotification statusBarNotification) {
        if (statusBarNotification != null && this.e != null) {
            statusBarNotification.getPackageName();
            android.os.Handler handler = this.e;
            if (handler != null) {
                handler.post(new u62.d(this, statusBarNotification));
            }
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        new java.lang.StringBuilder("onUnbind() on ").append(java.lang.Thread.currentThread().getName());
        r = 0;
        return super.onUnbind(intent);
    }
}
