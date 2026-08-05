package com.truecaller.service;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class AlarmReceiver extends com.truecaller.messaging.notifications.i {
    public static final com.truecaller.service.AlarmReceiver.AlarmType[] f;
    public static final com.truecaller.service.AlarmReceiver.AlarmType[] g;
    public static final com.truecaller.service.AlarmReceiver.AlarmType[] h;
    public static final com.truecaller.service.AlarmReceiver.AlarmType[] i;
    public static android.content.pm.PackageInfo j;
    public qc3.bar d;
    public qc3.bar e;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'TYPE_2DAYS_UPGRADED' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static abstract class AlarmType {
        private static final /* synthetic */ com.truecaller.service.AlarmReceiver.AlarmType[] $VALUES;
        public static final com.truecaller.service.AlarmReceiver.AlarmType TYPE_20DAYS;
        public static final com.truecaller.service.AlarmReceiver.AlarmType TYPE_2DAYS_UPGRADED;
        public static final com.truecaller.service.AlarmReceiver.AlarmType TYPE_DO_NOT_DISTURB_ACCESS;
        public static final com.truecaller.service.AlarmReceiver.AlarmType TYPE_RESCHEDULE;
        public static final com.truecaller.service.AlarmReceiver.AlarmType TYPE_UPDATE_SPAM;

        @androidx.annotation.Nullable
        private final java.lang.String mAnalyticsSubtype;
        private final long mFirstDelay;
        private final int mNotificationId;
        private final java.lang.String mNotificationType;
        private final long mRecurringPeriod;

        private static /* synthetic */ com.truecaller.service.AlarmReceiver.AlarmType[] $values() {
            return new com.truecaller.service.AlarmReceiver.AlarmType[]{TYPE_20DAYS, TYPE_2DAYS_UPGRADED, TYPE_RESCHEDULE, TYPE_UPDATE_SPAM, TYPE_DO_NOT_DISTURB_ACCESS};
        }

        static {
            com.truecaller.service.AlarmReceiver.AlarmType alarmType = new com.truecaller.service.AlarmReceiver.AlarmType("TYPE_20DAYS", 0, 1728000000L, 2131366078, "share", "Share TC");
            TYPE_20DAYS = alarmType;
            TYPE_2DAYS_UPGRADED = new com.truecaller.service.AlarmReceiver.AlarmType("TYPE_2DAYS_UPGRADED", 1, 172800000L, 2131366079, alarmType.getNotificationType(), alarmType.getAnalyticsSubtype());
            TYPE_RESCHEDULE = new com.truecaller.service.AlarmReceiver.AlarmType("TYPE_RESCHEDULE", 2, 2160000000L, 2131366087, null, null);
            TYPE_UPDATE_SPAM = new com.truecaller.service.AlarmReceiver.AlarmType("TYPE_UPDATE_SPAM", 3, 1209600000L, 1209600000L, 2131366088, "update_spam", "Open Block");
            TYPE_DO_NOT_DISTURB_ACCESS = new com.truecaller.service.AlarmReceiver.AlarmType("TYPE_DO_NOT_DISTURB_ACCESS", 4, 60000L, 2131366080, "do_not_disturb", "Mute Calls");
            $VALUES = $values();
        }

        private AlarmType(java.lang.String str, int i, long j, @androidx.annotation.Nullable int i2, java.lang.String str2, java.lang.String str3) {
            this(str, i, j, 0L, i2, str2, str3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static android.app.Notification createNotification(android.content.Context context, java.lang.String str, java.lang.String str2, android.app.PendingIntent pendingIntent) {
            f6.f0 f0Var = new f6.f0(context, getNotificationChannelId(context));
            f0Var.Q.icon = 2131232902;
            f0Var.D = context.getColor(2131102024);
            f0Var.u(context.getString(2132017196));
            f0Var.e = f6.f0.e(str);
            f6.y yVar = new f6.y(0);
            yVar.f = f6.f0.e(str2);
            f0Var.t(yVar);
            f0Var.f = f6.f0.e(str2);
            f0Var.k(1);
            f0Var.g = pendingIntent;
            f0Var.l(16, true);
            return f0Var.d();
        }

        @androidx.annotation.NonNull
        private static java.lang.String getNotificationChannelId(android.content.Context context) {
            return ((s62.d) com.truecaller.service.AlarmReceiver.g(context).P2.get()).o("miscellaneous_channel");
        }

        public static com.truecaller.service.AlarmReceiver.AlarmType valueOf(java.lang.String str) {
            return (com.truecaller.service.AlarmReceiver.AlarmType) java.lang.Enum.valueOf(com.truecaller.service.AlarmReceiver.AlarmType.class, str);
        }

        public static com.truecaller.service.AlarmReceiver.AlarmType[] values() {
            return (com.truecaller.service.AlarmReceiver.AlarmType[]) $VALUES.clone();
        }

        @androidx.annotation.Nullable
        public java.lang.String getAnalyticsSubtype() {
            return this.mAnalyticsSubtype;
        }

        public long getFirstDelay() {
            return this.mFirstDelay;
        }

        public abstract android.app.Notification getNotification(android.content.Context context);

        public int getNotificationId() {
            return this.mNotificationId;
        }

        public java.lang.String getNotificationType() {
            return this.mNotificationType;
        }

        public long getRecurringPeriod() {
            return this.mRecurringPeriod;
        }

        public boolean shouldShow(android.content.Context context) {
            return true;
        }

        private AlarmType(java.lang.String str, int i, long j, long j2, @androidx.annotation.Nullable int i2, java.lang.String str2, java.lang.String str3) {
            this.mFirstDelay = j;
            this.mRecurringPeriod = j2;
            this.mNotificationId = i2;
            this.mNotificationType = str2;
            this.mAnalyticsSubtype = str3;
        }
    }

    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public interface bar {
    }

    static {
        com.truecaller.service.AlarmReceiver.AlarmType alarmType = com.truecaller.service.AlarmReceiver.AlarmType.TYPE_RESCHEDULE;
        com.truecaller.service.AlarmReceiver.AlarmType alarmType2 = com.truecaller.service.AlarmReceiver.AlarmType.TYPE_UPDATE_SPAM;
        f = new com.truecaller.service.AlarmReceiver.AlarmType[]{com.truecaller.service.AlarmReceiver.AlarmType.TYPE_20DAYS, alarmType, alarmType2};
        g = new com.truecaller.service.AlarmReceiver.AlarmType[]{alarmType};
        h = new com.truecaller.service.AlarmReceiver.AlarmType[]{com.truecaller.service.AlarmReceiver.AlarmType.TYPE_2DAYS_UPGRADED, alarmType2};
        i = new com.truecaller.service.AlarmReceiver.AlarmType[]{com.truecaller.service.AlarmReceiver.AlarmType.TYPE_DO_NOT_DISTURB_ACCESS};
    }

    public AlarmReceiver() {
        super(1);
    }

    public static void e(android.content.Context context, boolean z) {
        if (context.getApplicationContext().d()) {
            if (z62.d.e("truecaller.alarm.notification.TYPE_NOTIFICATION_ACCESS.set").longValue() != -1) {
                try {
                    android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
                    android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context, 2131366081, new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.service.AlarmReceiver.class), 603979776);
                    if (broadcast != null) {
                        alarmManager.cancel(broadcast);
                        broadcast.cancel();
                    }
                    ((s62.d) g(context).P2.get()).a(2131366081, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationPeriodicPromo");
                    z62.d.n(0L, "TYPE_DISMISS_NOTIFICATION");
                } catch (java.lang.Exception e) {
                    o82.a.B("Failed to clean up legacy notification access alarms", e);
                }
                z62.d.n(-1L, "TYPE_NOTIFICATION_ACCESS");
            }
            if (j == null) {
                try {
                    j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                }
            }
            android.content.pm.PackageInfo packageInfo = j;
            long j2 = packageInfo.firstInstallTime;
            long j3 = packageInfo.lastUpdateTime;
            com.truecaller.service.AlarmReceiver.AlarmType[] alarmTypeArr = f;
            if (j2 != j3) {
                for (com.truecaller.service.AlarmReceiver.AlarmType alarmType : alarmTypeArr) {
                    if (z62.d.e("truecaller.alarm.notification." + alarmType.name() + ".set").longValue() > 0) {
                        z62.d.n(0L, alarmType.name());
                        ((android.app.AlarmManager) context.getSystemService("alarm")).cancel(android.app.PendingIntent.getBroadcast(context, alarmType.getNotificationId(), new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.service.AlarmReceiver.class), 67108864));
                        alarmType.name();
                    }
                }
                alarmTypeArr = h;
            }
            if (z) {
                alarmTypeArr = (com.truecaller.service.AlarmReceiver.AlarmType[]) jj3.bar.c(alarmTypeArr, i);
            }
            for (com.truecaller.service.AlarmReceiver.AlarmType alarmType2 : alarmTypeArr) {
                long longValue = z62.d.e("truecaller.alarm.notification." + alarmType2.name() + ".set").longValue();
                if ((!z62.d.g(z62.d.c(alarmType2.name())) || alarmType2.getRecurringPeriod() > 0) && ((z && longValue > 0) || longValue == 0)) {
                    h(context, alarmType2);
                }
            }
        }
    }

    public static com.truecaller.service.AlarmReceiver.bar g(android.content.Context context) {
        return (com.truecaller.service.AlarmReceiver.bar) j71.g.E(com.truecaller.service.AlarmReceiver.bar.class, context.getApplicationContext());
    }

    public static void h(android.content.Context context, com.truecaller.service.AlarmReceiver.AlarmType alarmType) {
        long firstDelay;
        long longValue = z62.d.e("truecaller.alarm.notification." + alarmType.name() + ".set").longValue();
        if (longValue == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (z62.d.g(z62.d.c(alarmType.name())) && alarmType.getRecurringPeriod() > 0) {
                firstDelay = alarmType.getRecurringPeriod();
            } else {
                firstDelay = alarmType.getFirstDelay();
            }
            longValue = currentTimeMillis + firstDelay;
        }
        ((android.app.AlarmManager) context.getSystemService("alarm")).set(0, longValue, android.app.PendingIntent.getBroadcast(context, alarmType.getNotificationId(), new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.service.AlarmReceiver.class).putExtra("notification_type", alarmType.name()), 67108864));
        z62.d.n(longValue, alarmType.name());
        alarmType.name();
        java.lang.System.currentTimeMillis();
    }

    public final void f(android.content.Context context, com.truecaller.service.AlarmReceiver.AlarmType alarmType) {
        z62.d.n(0L, alarmType.name());
        z62.d.m(z62.d.c(alarmType.name()), true);
        android.app.Notification notification = alarmType.getNotification(context);
        if (notification != null && alarmType.shouldShow(context)) {
            java.lang.String analyticsSubtype = alarmType.getAnalyticsSubtype();
            if (analyticsSubtype == null) {
                com.truecaller.log.AssertionUtil.OnlyInDebug.fail(new java.lang.String[]{"Notification must specify analytics subtype"});
                return;
            }
            new android.os.Bundle().putString("Subtype", analyticsSubtype);
            ((s62.d) this.d.get()).a(alarmType.getNotificationId(), com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationPeriodicPromo");
            u62.l lVar = (u62.l) this.e.get();
            int notificationId = alarmType.getNotificationId();
            lVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "notification");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notificationPeriodicPromo", "analyticsContext");
            java.util.Random random = lVar.d;
            android.content.Context context2 = lVar.a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "notification");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notificationPeriodicPromo", "analyticsContext");
            nc0.k1.x(lVar.c, "notificationPeriodicPromo", "Shown", (android.os.Bundle) null, 8);
            android.content.Intent b = u62.l.b(lVar, notification.contentIntent, "Opened");
            android.content.Intent b2 = u62.l.b(lVar, notification.deleteIntent, "Dismissed");
            notification.contentIntent = android.app.PendingIntent.getBroadcast(context2, random.nextInt(), b, 335544320);
            notification.deleteIntent = android.app.PendingIntent.getBroadcast(context2, random.nextInt(), b2, 335544320);
            s62.f fVar = lVar.b;
            fVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "notification");
            fg3.h0.J(fVar.e, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s2.k(fVar, notification, notificationId, (df3.bar) null), 3);
        }
        if (alarmType.getRecurringPeriod() > 0) {
            h(context, alarmType);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        long timeInMillis;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        super.onReceive(context, intent);
        java.util.Objects.toString(intent);
        if (intent.hasExtra("notification_type")) {
            try {
                com.truecaller.service.AlarmReceiver.AlarmType valueOf = com.truecaller.service.AlarmReceiver.AlarmType.valueOf(intent.getStringExtra("notification_type"));
                valueOf.name();
                int i2 = java.util.Calendar.getInstance().get(11);
                if (i2 >= 9 && i2 <= 21) {
                    f(context, valueOf);
                    return;
                }
                android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context.getApplicationContext(), valueOf.getNotificationId(), intent, 201326592);
                android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                int i3 = calendar.get(11);
                if (i3 >= 9 && i3 <= 21) {
                    timeInMillis = calendar.getTimeInMillis();
                } else {
                    calendar.add(11, 12);
                    timeInMillis = calendar.getTimeInMillis();
                }
                alarmManager.set(0, timeInMillis, broadcast);
            } catch (java.lang.IllegalArgumentException e) {
                o82.a.B("Unsupported alarm type", e);
            }
        }
    }
}
