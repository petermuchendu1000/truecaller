package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VerificationSmsBroadcastReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        java.lang.String str2 = null;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"com.truecaller.wizard.SEND_SMS".equals(str)) {
            if (intent != null) {
                str2 = intent.getAction();
            }
            if (!"com.truecaller.wizard.SMS_DELIVERY".equals(str2)) {
                return;
            }
        }
        if (context != null) {
            androidx.localbroadcastmanager.content.LocalBroadcastManager localBroadcastManager = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(context);
            intent.putExtra("resultCode", getResultCode());
            localBroadcastManager.sendBroadcast(intent);
        }
    }
}
