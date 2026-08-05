package com.truecaller.common.account;

/* loaded from: /home/user/tc_decoded/classes.dex */
public class TruecallerAccountAuthenticatorService extends android.app.Service {

    /* renamed from: a, reason: collision with root package name */
    public n11.i f4536a;

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        if (intent == null || !"android.accounts.AccountAuthenticator".equals(intent.getAction())) {
            return null;
        }
        return this.f4536a.getIBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        super.onCreate();
        this.f4536a = new n11.i(this);
    }
}
