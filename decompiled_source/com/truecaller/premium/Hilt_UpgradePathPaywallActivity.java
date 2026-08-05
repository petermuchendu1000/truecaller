package com.truecaller.premium;

/* loaded from: /home/user/tc_decoded/classes.dex */
public abstract class Hilt_UpgradePathPaywallActivity extends com.truecaller.premium.FullScreenPaywallActivity {

    /* renamed from: i0, reason: collision with root package name */
    public boolean f4563i0 = false;

    public Hilt_UpgradePathPaywallActivity() {
        addOnContextAvailableListener(new ee2.b(this, 21));
    }

    @Override // com.truecaller.premium.Hilt_FullScreenPaywallActivity
    public final void t0() {
        if (!this.f4563i0) {
            this.f4563i0 = true;
            ((com.truecaller.premium.UpgradePathPaywallActivity) this).f4551g0 = cd3.baz.a(((i82.z) X3()).f.Bk);
        }
    }
}
