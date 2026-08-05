package com.truecaller.forcedupdate.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class j implements f.baz {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity b;

    public /* synthetic */ j(androidx.appcompat.app.AppCompatActivity appCompatActivity, int i) {
        this.a = i;
        this.b = appCompatActivity;
    }

    public final void a(androidx.activity.ComponentActivity componentActivity) {
        switch (this.a) {
            case 0:
                com.truecaller.forcedupdate.ui.Hilt_ForcedUpdateActivity hilt_ForcedUpdateActivity = (com.truecaller.forcedupdate.ui.Hilt_ForcedUpdateActivity) this.b;
                if (!hilt_ForcedUpdateActivity.c0) {
                    hilt_ForcedUpdateActivity.c0 = true;
                    com.truecaller.forcedupdate.ui.bar barVar = (com.truecaller.forcedupdate.ui.bar) hilt_ForcedUpdateActivity.X3();
                    barVar.getClass();
                    return;
                }
                return;
            default:
                com.truecaller.forcedupdate.ui.Hilt_SimpleForceUpdateActivity hilt_SimpleForceUpdateActivity = (com.truecaller.forcedupdate.ui.Hilt_SimpleForceUpdateActivity) this.b;
                if (!hilt_SimpleForceUpdateActivity.c0) {
                    hilt_SimpleForceUpdateActivity.c0 = true;
                    tx.e eVar = (com.truecaller.forcedupdate.ui.l) hilt_SimpleForceUpdateActivity.X3();
                    com.truecaller.forcedupdate.ui.SimpleForceUpdateActivity simpleForceUpdateActivity = (com.truecaller.forcedupdate.ui.SimpleForceUpdateActivity) hilt_SimpleForceUpdateActivity;
                    tx.w wVar = eVar.f;
                    tx.c0 c0Var = wVar.b;
                    simpleForceUpdateActivity.d0 = new k0.h((x42.bar) c0Var.F3.get());
                    simpleForceUpdateActivity.e0 = (java.lang.String) wVar.Q.get();
                    simpleForceUpdateActivity.f0 = c0Var.l6;
                    return;
                }
                return;
        }
    }
}
