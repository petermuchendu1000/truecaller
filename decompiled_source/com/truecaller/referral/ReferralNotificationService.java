package com.truecaller.referral;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class ReferralNotificationService extends android.app.IntentService implements bd3.qux {
    public static final /* synthetic */ int h = 0;
    public volatile yc3.g a;
    public final java.lang.Object b;
    public boolean c;
    public qc3.bar d;
    public qc3.bar e;
    public qc3.bar f;
    public qc3.bar g;

    public ReferralNotificationService() {
        super("ReferralNotificationService");
        this.b = new java.lang.Object();
        this.c = false;
    }

    @Override // bd3.baz
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v6 */
    public final void a(android.content.Intent intent, java.lang.String str) {
        char c;
        java.lang.String string;
        char c2;
        boolean z;
        java.lang.String string2;
        int i;
        int i2;
        android.content.Intent intent2;
        android.app.PendingIntent e;
        int i3;
        java.lang.String stringExtra = intent.getStringExtra(com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
        java.lang.String stringExtra2 = intent.getStringExtra("days");
        int i4 = 7;
        if (stringExtra2 != null) {
            try {
                i4 = java.lang.Integer.parseInt(stringExtra2);
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        switch (str.hashCode()) {
            case -1154529449:
                if (str.equals("joiner")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -722568161:
                if (str.equals("referrer")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 106940687:
                if (str.equals("promo")) {
                    c = 2;
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
                string = getString(2132022521);
                break;
            case 1:
                string = getString(2132022522);
                break;
            case 2:
                string = intent.getStringExtra("title");
                break;
            default:
                string = null;
                break;
        }
        switch (str.hashCode()) {
            case -1154529449:
                if (str.equals("joiner")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -722568161:
                if (str.equals("referrer")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 106940687:
                if (str.equals("promo")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                z = 1;
                string2 = getString(2132022519, stringExtra, java.lang.Integer.valueOf(i4), getResources().getQuantityString(2131886198, i4));
                break;
            case 1:
                string2 = getString(2132022520, stringExtra);
                z = 1;
                break;
            case 2:
                string2 = intent.getStringExtra("text");
                z = 1;
                break;
            default:
                z = 1;
                string2 = null;
                break;
        }
        if (!android.text.TextUtils.isEmpty(string2) && !android.text.TextUtils.isEmpty(string)) {
            if (jj3.bar.f(str, "referrer")) {
                i = 2132022533;
            } else {
                i = 2132022508;
            }
            java.lang.String string3 = getString(i);
            f6.f0 f0Var = new f6.f0(this, ((u62.l) this.e.get()).b.o("miscellaneous_channel"));
            f0Var.e = f6.f0.e(string);
            f0Var.f = f6.f0.e(string2);
            f6.y yVar = new f6.y(0);
            yVar.f = f6.f0.e(string2);
            f0Var.t(yVar);
            f0Var.D = getColor(2131102024);
            f0Var.k(-1);
            f0Var.Q.icon = 2131232902;
            if (str.equals("promo")) {
                intent2 = ok3.bar.z(this);
                intent2.putExtra("LAUNCH_MODE", "MODE_REFER_MORE_FRIENDS");
                u62.l lVar = (u62.l) this.e.get();
                com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                lVar.a(2131366025, pushNotificationSource, "notificationReferral");
                ((u62.l) this.e.get()).a(2131366024, pushNotificationSource, "notificationReferral");
            } else if (!str.equals("referrer") && !str.equals("joiner")) {
                intent2 = null;
            } else {
                if (str.equals("referrer")) {
                    i2 = 2132022524;
                } else {
                    i2 = 2132022523;
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i4);
                java.lang.String quantityString = getResources().getQuantityString(2131886198, i4);
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = stringExtra;
                objArr[z] = valueOf;
                objArr[2] = quantityString;
                java.lang.String string4 = getString(i2, objArr);
                android.content.Intent z2 = ok3.bar.z(this);
                z2.putExtra("REFERRAL_GRANTED_MESSAGE", string4);
                z2.putExtra("LAUNCH_MODE", "MODE_REFERRAL_GRANTED_VIEW");
                intent2 = z2;
            }
            if (intent2 == null) {
                e = null;
            } else {
                bo.p a = ((s62.g) this.g.get()).a();
                a.b = 2131366026;
                a.c = 201326592;
                e = a.e(com.truecaller.analytics.common.event.PushNotificationSource.Firebase.getType(), "notificationReferral", intent2);
            }
            f0Var.g = e;
            android.content.Intent intent3 = new android.content.Intent("com.truecaller.intent.action.REFERRAL_REFER_MORE_USERS", null, this, com.truecaller.referral.ReferralNotificationService.class);
            intent3.putExtra("refer_mode", str);
            bo.p a2 = ((s62.g) this.g.get()).a();
            android.content.Context context = (android.content.Context) a2.d;
            a2.b = 2131366027;
            a2.c = 201326592;
            com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource2 = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
            int type = pushNotificationSource2.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent3, "intent");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notificationReferral", "analyticsContext");
            android.app.PendingIntent service = android.app.PendingIntent.getService(context, a2.b, intent3, a2.c);
            kotlin.jvm.internal.Intrinsics.d(service);
            android.content.Intent c3 = bo.p.c(a2, com.truecaller.notificationchannels.tracking.NotificationTrackingReceiver.class, type, "notificationReferral", service, 8);
            sf3.a.a.getClass();
            android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context, sf3.a.b.d(), c3, a2.c);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
            f0Var.a(0, broadcast, string3);
            f0Var.l(16, z);
            if (jj3.bar.f(str, "referrer")) {
                i3 = 2131366025;
            } else {
                i3 = 2131366024;
            }
            u62.l lVar2 = (u62.l) this.e.get();
            android.app.Notification d = f0Var.d();
            lVar2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "notification");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationSource2, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notificationReferral", "analyticsContext");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "notification");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationSource2, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notificationReferral", "analyticsContext");
            lVar2.b.w((java.lang.String) null, i3, d, pushNotificationSource2.getType(), "notificationReferral");
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.c) {
            this.c = true;
            tx.w wVar = ((dj2.v) X3()).b;
            this.d = cd3.baz.a(wVar.Lm);
            this.e = cd3.baz.a(wVar.t3);
            this.f = cd3.baz.a(wVar.dj);
            this.g = cd3.baz.a(wVar.A3);
        }
        super.onCreate();
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(android.content.Intent intent) {
        if (intent != null) {
            java.lang.String action = intent.getAction();
            if (!android.text.TextUtils.isEmpty(action)) {
                action.getClass();
                char c = 65535;
                switch (action.hashCode()) {
                    case -1908554575:
                        if (action.equals("com.truecaller.intent.action.REFERRAL_REFER_MORE_USERS")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 233028233:
                        if (action.equals("com.truecaller.intent.action.REFERRAL_REFERRER_NOTIFICATION_RECEIVED")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1204829377:
                        if (action.equals("com.truecaller.intent.action.REFERRAL_JOINER_NOTIFICATION_RECEIVED")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1968287211:
                        if (action.equals("com.truecaller.intent.action.ACTION_CLEAR_CACHE_NOTIFICATION_RECEIVED")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1987817529:
                        if (action.equals("com.truecaller.intent.action.REFERRAL_REFERRER_PROMO_NOTIFICATION_RECEIVED")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        java.lang.String stringExtra = intent.getStringExtra("refer_mode");
                        if (jj3.bar.f(stringExtra, "referrer")) {
                            android.content.Intent z = ok3.bar.z(this);
                            z.putExtra("LAUNCH_MODE", "MODE_REFER_MORE_FRIENDS");
                            startActivity(z);
                        } else if (jj3.bar.f(stringExtra, "joiner")) {
                            android.content.Intent z2 = ok3.bar.z(this);
                            z2.putExtra("LAUNCH_MODE", "MODE_REFERRAL_ON_BOARDING");
                            startActivity(z2);
                        } else if (jj3.bar.f(stringExtra, "promo")) {
                            android.content.Intent z3 = ok3.bar.z(this);
                            z3.putExtra("LAUNCH_MODE", "MODE_SHOW_REFERRAL");
                            startActivity(z3);
                        }
                        u62.l lVar = (u62.l) this.e.get();
                        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                        lVar.a(2131366025, pushNotificationSource, "notificationReferral");
                        ((u62.l) this.e.get()).a(2131366024, pushNotificationSource, "notificationReferral");
                        ak.r0.l(this);
                        return;
                    case 1:
                        a(intent, "referrer");
                        w82.n1 n1Var = (w82.l1) this.d.get();
                        n1Var.getClass();
                        return;
                    case 2:
                        a(intent, "joiner");
                        w82.n1 n1Var2 = (w82.l1) this.d.get();
                        n1Var2.getClass();
                        return;
                    case 3:
                        ((dj2.a0) this.f.get()).getClass();
                        ne0.baz.q("referralLink");
                        ((dj2.a0) this.f.get()).getClass();
                        ne0.baz.q("referralCode");
                        return;
                    case 4:
                        a(intent, "promo");
                        return;
                    default:
                        return;
                }
            }
        }
    }
}
