package com.truecaller.filters.blockedlist;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class Hilt_BlockedListActivity extends com.truecaller.filters.BlockBaseActivity implements bd3.qux {
    public volatile yc3.baz b0;
    public final java.lang.Object c0 = new java.lang.Object();
    public boolean d0 = false;

    public Hilt_BlockedListActivity() {
        addOnContextAvailableListener(new y22.m(this, 7));
    }

    public final java.lang.Object X3() {
        return s0().X3();
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.G(this, super/*androidx.activity.ComponentActivity*/.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.filters.BlockBaseActivity
    public void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        s0().c();
    }

    public final void onDestroy() {
        super.onDestroy();
        s0().a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yc3.baz s0() {
        if (this.b0 == null) {
            synchronized (this.c0) {
                try {
                    if (this.b0 == null) {
                        this.b0 = new yc3.baz(this);
                    }
                } finally {
                }
            }
        }
        return this.b0;
    }
}
