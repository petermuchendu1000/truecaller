package com.truecaller.whatsappcallerid;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class Hilt_WhatsAppCallerIdPermissionDialogActivity extends com.truecaller.ui.BaseNotificationAccessActivity implements bd3.qux {
    public volatile yc3.baz h0;
    public final java.lang.Object i0 = new java.lang.Object();
    public boolean j0 = false;

    public Hilt_WhatsAppCallerIdPermissionDialogActivity() {
        addOnContextAvailableListener(new mq0.e(this, 16));
    }

    @Override // bd3.baz
    public final java.lang.Object X3() {
        return u0().X3();
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.G(this, super/*androidx.activity.ComponentActivity*/.getDefaultViewModelProviderFactory());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ui.BaseNotificationAccessActivity
    public void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        u0().c();
    }

    @Override // com.truecaller.ui.BaseNotificationAccessActivity
    public final void onDestroy() {
        super.onDestroy();
        u0().a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yc3.baz u0() {
        if (this.h0 == null) {
            synchronized (this.i0) {
                try {
                    if (this.h0 == null) {
                        this.h0 = new yc3.baz(this);
                    }
                } finally {
                }
            }
        }
        return this.h0;
    }
}
