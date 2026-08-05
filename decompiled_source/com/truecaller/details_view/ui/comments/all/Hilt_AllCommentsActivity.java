package com.truecaller.details_view.ui.comments.all;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class Hilt_AllCommentsActivity extends androidx.appcompat.app.AppCompatActivity implements bd3.qux {
    public volatile yc3.baz a0;
    public final java.lang.Object b0 = new java.lang.Object();
    public boolean c0 = false;

    public Hilt_AllCommentsActivity() {
        addOnContextAvailableListener(new y22.m(this, 5));
    }

    public final java.lang.Object X3() {
        return s0().X3();
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.G(this, super/*androidx.activity.ComponentActivity*/.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
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
