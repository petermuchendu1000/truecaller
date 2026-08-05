package com.truecaller.messaging.sharing;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class SharingActivity extends com.truecaller.messaging.sharing.Hilt_SharingActivity implements com.truecaller.messaging.sharing.a, com.truecaller.messaging.sharing.qux {
    public ac0.qux d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.sharing.Hilt_SharingActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        yy.qux.m(getTheme());
        this.d0.u0(this);
    }

    @Override // com.truecaller.messaging.sharing.Hilt_SharingActivity
    public final void onDestroy() {
        super.onDestroy();
        ((com.truecaller.sdk.bar) this.d0).a = null;
    }
}
