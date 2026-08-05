package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
abstract class Hilt_DetailsViewActivityLegacy extends com.truecaller.dynamicfeaturesupport.DynamicFeatureActivity implements bd3.qux {
    public volatile yc3.baz a0;
    public final java.lang.Object b0 = new java.lang.Object();
    public boolean c0 = false;

    public Hilt_DetailsViewActivityLegacy() {
        addOnContextAvailableListener(new com.truecaller.details_view.ui.f1(this));
    }

    public final java.lang.Object X3() {
        return s0().X3();
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.G(this, super/*androidx.activity.ComponentActivity*/.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.dynamicfeaturesupport.DynamicFeatureActivity
    public void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        s0().c();
    }

    public void onDestroy() {
        super.onDestroy();
        s0().a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yc3.baz s0() {
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
