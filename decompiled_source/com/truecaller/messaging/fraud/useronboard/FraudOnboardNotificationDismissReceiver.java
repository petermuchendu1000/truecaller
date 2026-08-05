package com.truecaller.messaging.fraud.useronboard;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudOnboardNotificationDismissReceiver extends android.content.BroadcastReceiver {
    public static final /* synthetic */ int d = 0;
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public kv1.i c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (kv1.i) ((com.truecaller.messaging.fraud.useronboard.a) o40.bar.k(context)).H.b.a.E9.get();
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        kv1.i iVar = this.c;
        if (iVar != null) {
            k9.d.i(iVar, com.truecaller.insights.fraud.analytics.FraudUserActionType.DISMISS, com.truecaller.insights.fraud.analytics.FraudActionScope.SETTING, com.truecaller.insights.fraud.analytics.FraudActionSurface.ONBOARDING, (java.lang.Long) null, (java.lang.Boolean) null, (com.truecaller.insights.fraud.analytics.FraudLabelValue) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1016);
        } else {
            kotlin.jvm.internal.Intrinsics.n("fraudSystemAnalytics");
            throw null;
        }
    }
}
