package com.truecaller.healthcheck.presentation;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class Hilt_HealthCheckActivity extends androidx.activity.ComponentActivity implements bd3.qux {
    public volatile yc3.baz a0;
    public final java.lang.Object b0 = new java.lang.Object();
    public boolean c0 = false;

    public Hilt_HealthCheckActivity() {
        addOnContextAvailableListener(new ps2.baz(this, 27));
    }

    public final java.lang.Object X3() {
        return r0().X3();
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.G(this, super.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        r0().c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        super/*android.app.Activity*/.onDestroy();
        r0().a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yc3.baz r0() {
        if (this.a0 == null) {
            synchronized (this.b0) {
                try {
                    if (this.a0 == null) {
                        this.a0 = new yc3.baz(this);
                    }
                } finally {
                }
            }
        }
        return this.a0;
    }
}
