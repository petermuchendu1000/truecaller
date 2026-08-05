package com.truecaller.premium;

/* loaded from: /home/user/tc_decoded/classes.dex */
public abstract class Hilt_FullScreenPaywallActivity extends androidx.appcompat.app.AppCompatActivity implements bd3.qux {

    /* renamed from: a0, reason: collision with root package name */
    public volatile yc3.baz f4558a0;

    /* renamed from: b0, reason: collision with root package name */
    public final java.lang.Object f4559b0 = new java.lang.Object();

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4560c0 = false;

    public Hilt_FullScreenPaywallActivity() {
        addOnContextAvailableListener(new ee2.b(this, 18));
    }

    public final java.lang.Object X3() {
        return s0().X3();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.n
    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.G(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        s0().c();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        s0().a();
    }

    public final yc3.baz s0() {
        if (this.f4558a0 == null) {
            synchronized (this.f4559b0) {
                try {
                    if (this.f4558a0 == null) {
                        this.f4558a0 = new yc3.baz(this);
                    }
                } finally {
                }
            }
        }
        return this.f4558a0;
    }

    public void t0() {
        if (!this.f4560c0) {
            this.f4560c0 = true;
            ((com.truecaller.premium.FullScreenPaywallActivity) this).f4551g0 = cd3.baz.a(((i82.qux) X3()).f.Bk);
        }
    }
}
