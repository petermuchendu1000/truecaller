package com.truecaller.namesuggestion.impl.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
abstract class Hilt_NameSuggestionActivity extends com.truecaller.namesuggestion.api.ui.PopupDialogActivity implements bd3.qux {
    public volatile yc3.baz e0;
    public final java.lang.Object f0 = new java.lang.Object();
    public boolean g0 = false;

    public Hilt_NameSuggestionActivity() {
        addOnContextAvailableListener(new com.truecaller.namesuggestion.impl.ui.bar(this));
    }

    public final java.lang.Object X3() {
        return u0().X3();
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.G(this, super/*androidx.activity.ComponentActivity*/.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.namesuggestion.api.ui.PopupDialogActivity
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
        if (this.e0 == null) {
            synchronized (this.f0) {
                try {
                    if (this.e0 == null) {
                        this.e0 = new yc3.baz(this);
                    }
                } finally {
                }
            }
        }
        return this.e0;
    }
}
