package com.truecaller.notifications.enhancing;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class bar extends u62.c {
    public final android.content.Context a;
    public final m03.s b;
    public final co.t d;
    public final android.content.SharedPreferences e;
    public final t41.s f;
    public final s62.d h;
    public final o63.bar i;
    public final p63.bar j;
    public final c62.q k;
    public final dn2.qux l;
    public final ga1.e m;
    public final qo1.r n;
    public final java.util.LinkedHashSet g = new java.util.LinkedHashSet();
    public final android.os.Handler c = new android.os.Handler(android.os.Looper.getMainLooper());

    public bar(android.content.Context context, t41.s sVar, m03.s sVar2, s62.d dVar, o63.bar barVar, p63.bar barVar2, c62.q qVar, dn2.qux quxVar, ga1.e eVar, qo1.r rVar) {
        this.a = context;
        this.b = sVar2;
        this.h = dVar;
        this.f = sVar;
        this.e = context.getSharedPreferences("enhancedNumbers", 0);
        this.i = barVar;
        this.j = barVar2;
        this.k = qVar;
        this.l = quxVar;
        this.m = eVar;
        this.n = rVar;
        co.t tVar = new co.t(this, 8);
        this.d = tVar;
        g6.b.j(context, tVar, new android.content.IntentFilter("com.truecaller.ACTION_ENHANCED_NOTIFICATION_DELETED"), "com.truecaller.permission.ENHANCED_NOTIFICATION", (android.os.Handler) null, 4);
    }

    @Override // u62.c
    public final void a() {
        this.a.unregisterReceiver(this.d);
    }

    @Override // u62.c
    public final void b(android.service.notification.StatusBarNotification statusBarNotification) {
        boolean b = this.i.b();
        boolean b2 = this.b.b();
        boolean contains = com.truecaller.notifications.NotificationHandlerService.q.contains(statusBarNotification.getPackageName());
        if (b && b2 && contains) {
            try {
                h(statusBarNotification);
            } catch (java.lang.RuntimeException e) {
                o82.a.B("Error handling notification", e);
            }
        }
    }

    public final void e() {
        java.lang.String quantityString;
        java.lang.String string;
        long longValue;
        java.util.LinkedHashSet linkedHashSet = this.g;
        linkedHashSet.size();
        java.lang.Thread.currentThread().getName();
        if (((qo1.s) this.n).b.a("featureMessagingAppsCallerId", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
            this.m.n(new java.util.ArrayList(linkedHashSet));
            return;
        }
        boolean isEmpty = linkedHashSet.isEmpty();
        s62.d dVar = this.h;
        if (isEmpty) {
            ((s62.f) dVar).a(2131365522, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "enhanceNotification");
            return;
        }
        long[] jArr = new long[linkedHashSet.size()];
        java.util.Iterator it = linkedHashSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            java.lang.Long l = ((com.truecaller.notifications.enhancing.SourcedContact) it.next()).c;
            int i2 = i + 1;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            jArr[i] = longValue;
            i = i2;
        }
        android.content.Intent intent = new android.content.Intent("com.truecaller.ACTION_ENHANCED_NOTIFICATION_DELETED");
        intent.putExtra("ids", jArr);
        android.content.Context context = this.a;
        android.content.Intent t0 = com.truecaller.notifications.enhancing.SourcedContactListActivity.t0(context, linkedHashSet);
        android.content.res.Resources resources = context.getResources();
        java.lang.String quantityString2 = resources.getQuantityString(2131886096, linkedHashSet.size(), java.lang.Integer.valueOf(linkedHashSet.size()));
        if (linkedHashSet.size() == 1) {
            com.truecaller.notifications.enhancing.SourcedContact sourcedContact = (com.truecaller.notifications.enhancing.SourcedContact) linkedHashSet.iterator().next();
            quantityString = sourcedContact.e;
            string = resources.getString(2132017944, sourcedContact.b);
        } else {
            quantityString = resources.getQuantityString(2131886096, linkedHashSet.size(), java.lang.Integer.valueOf(linkedHashSet.size()));
            string = resources.getString(2132017945);
        }
        s62.f fVar = (s62.f) dVar;
        f6.f0 f0Var = new f6.f0(context, fVar.o("miscellaneous_channel"));
        f0Var.u(quantityString2);
        f0Var.j(quantityString);
        f0Var.i(string);
        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
        android.app.PendingIntent q = fVar.q(pushNotificationSource.getType(), 2131366093, 335544320, this.a, intent, "enhanceNotification");
        android.app.Notification notification = f0Var.Q;
        notification.deleteIntent = q;
        notification.icon = 2131232902;
        f0Var.f(true);
        f0Var.g = fVar.k(pushNotificationSource.getType(), 2131366094, 335544320, this.a, t0, "enhanceNotification");
        f0Var.D = context.getColor(2131099683);
        fVar.v(2131365522, f0Var.d(), pushNotificationSource.getType(), "enhanceNotification");
        o63.bar barVar = this.i;
        barVar.c.d0("KEY_NOTIFICATIONS_SHOWN_COUNT", barVar.c.C("KEY_NOTIFICATIONS_SHOWN_COUNT", 0) + 1);
    }

    public final java.lang.String f(android.service.notification.StatusBarNotification statusBarNotification) {
        java.lang.CharSequence charSequence;
        try {
            android.content.pm.PackageManager packageManager = this.a.getPackageManager();
            charSequence = packageManager.getPackageInfo(statusBarNotification.getPackageName(), 0).applicationInfo.loadLabel(packageManager);
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.RuntimeException unused) {
            charSequence = "";
        }
        return java.lang.String.valueOf(charSequence);
    }

    public final void g(android.service.notification.StatusBarNotification statusBarNotification, java.util.LinkedHashSet linkedHashSet, java.lang.String str) {
        boolean z;
        if (!android.text.TextUtils.isEmpty(str)) {
            java.util.List<java.lang.String> a = this.f.a(str);
            android.text.TextUtils.join(", ", a);
            java.lang.String f = f(statusBarNotification);
            for (java.lang.String str2 : a) {
                long j = this.e.getLong(str2, 0L);
                if (j != 0 && java.lang.System.currentTimeMillis() - 86400000 <= j) {
                    z = false;
                } else {
                    z = true;
                }
                boolean e = this.l.e(this.a, str2);
                if (z && !e) {
                    com.truecaller.data.entity.Contact d = u62.c.d(this.k, str2);
                    p63.bar barVar = this.j;
                    if (d != null && !android.text.TextUtils.isEmpty(d.s())) {
                        barVar.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "appName");
                        ef0.a.T(new q63.baz(f, 3), barVar);
                        linkedHashSet.add(new com.truecaller.notifications.enhancing.SourcedContact(statusBarNotification.getPackageName(), f, d.x(), d.H, d.s(), str2, m03.r.j(d, false), m03.r.j(d, true)));
                    } else {
                        if (d != null) {
                            d.s();
                        }
                        barVar.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "appName");
                        ef0.a.T(new q63.baz(f, 2), barVar);
                    }
                }
            }
        }
    }

    public final void h(android.service.notification.StatusBarNotification statusBarNotification) {
        android.app.Notification notification = statusBarNotification.getNotification();
        if (notification != null) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            if (!android.text.TextUtils.isEmpty(notification.tickerText)) {
                g(statusBarNotification, linkedHashSet, notification.tickerText.toString());
            }
            g(statusBarNotification, linkedHashSet, notification.extras.getString("android.title"));
            java.lang.String[] stringArray = notification.extras.getStringArray("android.people");
            if (stringArray != null) {
                for (java.lang.String str : stringArray) {
                    g(statusBarNotification, linkedHashSet, str);
                }
            }
            if (!linkedHashSet.isEmpty()) {
                java.lang.String f = f(statusBarNotification);
                p63.bar barVar = this.j;
                barVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "appName");
                ef0.a.T(new q63.baz(f, 1), barVar);
                this.c.post(new com.amazon.aps.ads.util.adview.baz(20, this, linkedHashSet));
            }
        }
    }
}
