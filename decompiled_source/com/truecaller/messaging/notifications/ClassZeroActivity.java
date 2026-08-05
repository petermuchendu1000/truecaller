package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class ClassZeroActivity extends com.truecaller.messaging.notifications.Hilt_ClassZeroActivity {
    public static final /* synthetic */ int k0 = 0;
    public long d0 = 0;
    public i.e e0 = null;
    public java.util.ArrayList f0 = null;
    public final com.truecaller.messaging.notifications.baz g0 = new com.truecaller.messaging.notifications.baz(this);
    public qc3.bar h0;
    public final com.truecaller.messaging.notifications.bar i0;
    public final com.truecaller.messaging.notifications.bar j0;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.truecaller.messaging.notifications.bar] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.truecaller.messaging.notifications.bar] */
    public ClassZeroActivity() {
        final int i = 0;
        this.i0 = new android.content.DialogInterface.OnClickListener(this) { // from class: com.truecaller.messaging.notifications.bar
            public final /* synthetic */ com.truecaller.messaging.notifications.ClassZeroActivity b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i2) {
                int i3 = i;
                com.truecaller.messaging.notifications.ClassZeroActivity classZeroActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = com.truecaller.messaging.notifications.ClassZeroActivity.k0;
                        classZeroActivity.getClass();
                        dialogInterface.dismiss();
                        classZeroActivity.u0();
                        return;
                    default:
                        int i5 = com.truecaller.messaging.notifications.ClassZeroActivity.k0;
                        classZeroActivity.v0(true);
                        dialogInterface.dismiss();
                        classZeroActivity.u0();
                        return;
                }
            }
        };
        final int i2 = 1;
        this.j0 = new android.content.DialogInterface.OnClickListener(this) { // from class: com.truecaller.messaging.notifications.bar
            public final /* synthetic */ com.truecaller.messaging.notifications.ClassZeroActivity b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i22) {
                int i3 = i2;
                com.truecaller.messaging.notifications.ClassZeroActivity classZeroActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = com.truecaller.messaging.notifications.ClassZeroActivity.k0;
                        classZeroActivity.getClass();
                        dialogInterface.dismiss();
                        classZeroActivity.u0();
                        return;
                    default:
                        int i5 = com.truecaller.messaging.notifications.ClassZeroActivity.k0;
                        classZeroActivity.v0(true);
                        dialogInterface.dismiss();
                        classZeroActivity.u0();
                        return;
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.notifications.Hilt_ClassZeroActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        yy.qux.m(getTheme());
        requestWindowFeature(1);
        if (bundle != null && bundle.containsKey("messages")) {
            this.f0 = bundle.getParcelableArrayList("messages");
        }
        if (this.f0 == null) {
            this.f0 = new java.util.ArrayList();
        }
        com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) getIntent().getParcelableExtra("extra_message_values");
        if (message != null && !this.f0.contains(message)) {
            this.f0.add(message);
        }
        if (!this.f0.isEmpty()) {
            t0((com.truecaller.messaging.data.types.Message) this.f0.get(0));
            long uptimeMillis = android.os.SystemClock.uptimeMillis() + 300000;
            this.d0 = uptimeMillis;
            if (bundle != null) {
                this.d0 = java.lang.Math.min(bundle.getLong("timer_fire", uptimeMillis), this.d0);
                return;
            }
            return;
        }
        finish();
    }

    public final void onNewIntent(android.content.Intent intent) {
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) intent.getParcelableExtra("extra_message_values");
        if (message != null && !this.f0.contains(message)) {
            this.f0.add(message);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestart() {
        super/*android.app.Activity*/.onRestart();
        if (!this.f0.isEmpty()) {
            t0((com.truecaller.messaging.data.types.Message) this.f0.get(0));
        } else {
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        if (this.f0.isEmpty()) {
            finish();
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        if (this.f0.size() <= 10) {
            bundle.putLong("timer_fire", this.d0);
        }
        java.util.ArrayList arrayList = this.f0;
        arrayList.subList(0, java.lang.Math.max(arrayList.size() - 10, 0)).clear();
        bundle.putParcelableArrayList("messages", this.f0);
    }

    public final void onStart() {
        super.onStart();
        com.truecaller.messaging.notifications.baz bazVar = this.g0;
        bazVar.removeMessages(1);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j = this.d0;
        if (j <= uptimeMillis) {
            bazVar.sendEmptyMessage(1);
        } else {
            bazVar.sendEmptyMessageAtTime(1, j);
        }
    }

    public final void onStop() {
        super.onStop();
        this.g0.removeMessages(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0(com.truecaller.messaging.data.types.Message message) {
        i.e eVar = this.e0;
        if (eVar != null) {
            eVar.dismiss();
            this.e0 = null;
        }
        i.d dVar = new i.d(this);
        dVar.a.f = message.a();
        this.e0 = dVar.setPositiveButton(2132021612, this.j0).setNegativeButton(2132019018, this.i0).setTitle(ak.r0.C(message.c)).b(false).m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0() {
        i.e eVar = this.e0;
        if (eVar != null) {
            eVar.dismiss();
            this.e0 = null;
        }
        if (!this.f0.isEmpty()) {
            this.f0.remove(0);
        }
        if (this.f0.isEmpty()) {
            finish();
            return;
        }
        t0((com.truecaller.messaging.data.types.Message) this.f0.get(0));
        this.d0 = android.os.SystemClock.uptimeMillis() + 300000;
        com.truecaller.messaging.notifications.baz bazVar = this.g0;
        bazVar.removeMessages(1);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j = this.d0;
        if (j <= uptimeMillis) {
            bazVar.sendEmptyMessage(1);
        } else {
            bazVar.sendEmptyMessageAtTime(1, j);
        }
    }

    public final void v0(boolean z) {
        if (!this.f0.isEmpty()) {
            c22.f b = ((com.truecaller.messaging.data.types.Message) this.f0.get(0)).b();
            b.h = z;
            ((y12.v) ((xd0.qux) this.h0.get()).a()).l0(b.a(), true);
        }
    }
}
