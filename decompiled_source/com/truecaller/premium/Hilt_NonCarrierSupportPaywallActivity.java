package com.truecaller.premium;

/* loaded from: /home/user/tc_decoded/classes.dex */
public abstract class Hilt_NonCarrierSupportPaywallActivity extends com.truecaller.premium.FullScreenPaywallActivity {

    /* renamed from: i0, reason: collision with root package name */
    public boolean f4562i0 = false;

    public Hilt_NonCarrierSupportPaywallActivity() {
        addOnContextAvailableListener(new ee2.b(this, 20));
    }

    @Override // com.truecaller.premium.Hilt_FullScreenPaywallActivity
    public final void t0() {
        if (!this.f4562i0) {
            this.f4562i0 = true;
            ((com.truecaller.premium.NonCarrierSupportPaywallActivity) this).f4551g0 = cd3.baz.a(((i82.h) X3()).f.Bk);
        }
    }
}
