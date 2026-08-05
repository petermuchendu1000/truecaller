package com.truecaller.neo.acs.ui.fullscreen;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/neo/acs/ui/fullscreen/NeoFACSActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "neo-acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NeoFACSActivity extends com.truecaller.neo.acs.ui.fullscreen.Hilt_NeoFACSActivity {
    public r52.bar d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.neo.acs.ui.fullscreen.Hilt_NeoFACSActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new p52.bar(this, null, 1), 3);
        if (bundle != null) {
            return;
        }
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
        p52.h.L.getClass();
        barVar.g(android.R.id.content, new p52.h(), (java.lang.String) null);
        barVar.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        androidx.fragment.app.Fragment F = getSupportFragmentManager().F(android.R.id.content);
        if (F != null) {
            if (!(F instanceof jz.bar)) {
                F = null;
            }
            if (F != null) {
                ((jz.bar) F).z1(z);
            }
        }
    }
}
