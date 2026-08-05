package com.truecaller.ads.postclickexperience.common.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class Hilt_PostClickExperienceActivity extends com.truecaller.ads.postclickexperience.common.ui.base.BasePostClickExperienceActivity implements bd3.qux {
    public volatile yc3.baz a0;
    public final java.lang.Object b0 = new java.lang.Object();
    public boolean c0 = false;

    public Hilt_PostClickExperienceActivity() {
        addOnContextAvailableListener(new ee2.b(this, 5));
    }

    public final java.lang.Object X3() {
        return u0().X3();
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.G(this, super/*androidx.activity.ComponentActivity*/.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ads.postclickexperience.common.ui.base.BasePostClickExperienceActivity
    public void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        u0().c();
    }

    public final void onDestroy() {
        super.onDestroy();
        u0().a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yc3.baz u0() {
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
