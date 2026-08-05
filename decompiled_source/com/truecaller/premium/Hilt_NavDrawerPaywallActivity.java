package com.truecaller.premium;

/* loaded from: /home/user/tc_decoded/classes.dex */
public abstract class Hilt_NavDrawerPaywallActivity extends com.truecaller.premium.FullScreenPaywallActivity {

    /* renamed from: i0, reason: collision with root package name */
    public boolean f4561i0 = false;

    public Hilt_NavDrawerPaywallActivity() {
        addOnContextAvailableListener(new ee2.b(this, 19));
    }

    @Override // com.truecaller.premium.Hilt_FullScreenPaywallActivity
    public final void t0() {
        if (!this.f4561i0) {
            this.f4561i0 = true;
            ((com.truecaller.premium.NavDrawerPaywallActivity) this).f4551g0 = cd3.baz.a(((i82.g) X3()).f.Bk);
        }
    }
}
