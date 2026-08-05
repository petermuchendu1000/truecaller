package com.truecaller.wizard.verification.throttled;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ThrottledReminderBroadcastReceiver extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int d = 0;
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public tx.v c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = ((r93.bar) o40.bar.k(context)).H.b.c5;
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
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        if (context != null) {
            tx.v vVar = this.c;
            android.graphics.Bitmap bitmap = null;
            if (vVar != null) {
                o73.a aVar = (o73.a) vVar.get();
                s62.f fVar = aVar.b;
                android.content.Context context2 = aVar.a;
                q83.qux quxVar = aVar.c;
                if (!((h93.baz) quxVar.a.get()).d("registration_reminder_set", false)) {
                    return;
                }
                android.content.Context context3 = aVar.a;
                android.content.Intent putExtra = y90.m6.o(context3, (com.truecaller.bottombar.BottomBarButtonType) null, "notificationThrottledReminder", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE).putExtra("EXTRA_THROTTLED", "EXTRA_THROTTLED");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                s62.f fVar2 = fVar;
                android.app.PendingIntent k = fVar2.k(pushNotificationSource.getType(), 2131366981, 335544320, context3, putExtra, "notificationThrottledReminder");
                f6.f0 f0Var = new f6.f0(context2, fVar2.o("miscellaneous_channel"));
                f0Var.e = f6.f0.e(context2.getString(2132023720));
                f0Var.f = f6.f0.e(context2.getString(2132023719));
                f0Var.Q.icon = 2131232902;
                f6.y yVar = new f6.y(0);
                yVar.f = f6.f0.e(context2.getString(2132023719));
                f0Var.t(yVar);
                f0Var.l = 2;
                f0Var.k(-1);
                android.graphics.drawable.Drawable drawable = context2.getDrawable(2131233733);
                if (drawable != null) {
                    bitmap = android.graphics.Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bitmap, "createBitmap(...)");
                    android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                }
                f0Var.m(bitmap);
                f0Var.g = k;
                f0Var.l(16, true);
                android.app.Notification d2 = f0Var.d();
                kotlin.jvm.internal.Intrinsics.d(d2);
                fVar2.v(2131363489, d2, pushNotificationSource.getType(), "notificationThrottledReminder");
                ((h93.baz) quxVar.a.get()).k("registration_reminder_set", false);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("throttledNotificationManager");
            throw null;
        }
    }
}
