package com.truecaller.util;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class CallMonitoringReceiver extends com.truecaller.messaging.notifications.i {
    public static volatile java.lang.String f = android.telephony.TelephonyManager.EXTRA_STATE_IDLE;
    public static volatile java.lang.String g = null;
    public cd3.bar d;
    public uk2.q e;

    public CallMonitoringReceiver() {
        super(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        boolean z;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        super.onReceive(context, intent);
        java.lang.String stringExtra = intent.getStringExtra("incoming_number");
        if ("android.intent.action.PHONE_STATE".equals(intent.getAction())) {
            java.lang.String stringExtra2 = intent.getStringExtra("state");
            if (stringExtra != null) {
                g = stringExtra;
            }
            if (!android.text.TextUtils.isEmpty(stringExtra2) && !f.equals(stringExtra2)) {
                uk2.q qVar = this.e;
                java.lang.String str = f;
                java.lang.String str2 = g;
                qVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra2, "state");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "lastState");
                fg3.h0.J((fg3.e0) qVar.b, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new tx0.s(qVar, stringExtra2, str, str2, (df3.bar) null, 14), 3);
                java.lang.String str3 = f;
                f = stringExtra2;
                if (!str3.equals(android.telephony.TelephonyManager.EXTRA_STATE_RINGING) || !stringExtra2.equals(android.telephony.TelephonyManager.EXTRA_STATE_OFFHOOK)) {
                    java.lang.String str4 = android.telephony.TelephonyManager.EXTRA_STATE_OFFHOOK;
                    if (!stringExtra2.equals(str4) && !str3.equals(str4)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    ((xf2.a) this.d.get()).h(com.truecaller.presence.api.model.AvailabilityTrigger.USER_ACTION, z);
                }
            }
        }
    }
}
