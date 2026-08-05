package com.truecaller.acs.ui.fullscreen;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/acs/ui/fullscreen/AfterCallScreenActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AfterCallScreenActivity extends com.truecaller.acs.ui.fullscreen.Hilt_AfterCallScreenActivity {
    public static final /* synthetic */ int g0 = 0;
    public e00.r d0;
    public qc3.bar e0;
    public nz.c f0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.acs.ui.fullscreen.Hilt_AfterCallScreenActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        setContentView(2131558433);
        qc3.bar barVar = this.e0;
        df3.bar barVar2 = null;
        if (barVar != null) {
            ((u40.qux) barVar.get()).d(this);
            fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new mz.bar(this, barVar2, 1), 3);
            getWindow().getDecorView().setSystemUiVisibility(1280);
            if (bundle != null) {
                return;
            }
            android.content.Intent intent = getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            com.truecaller.ads.acsrules.model.AcsRules acsRules = (com.truecaller.ads.acsrules.model.AcsRules) ((android.os.Parcelable) g6.b.g(intent, "ARG_ACS_RULES", com.truecaller.ads.acsrules.model.AcsRules.class));
            if (acsRules != null) {
                nz.c cVar = this.f0;
                if (cVar != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsRules, "acsRules");
                    cVar.a = acsRules;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("acsRulesStateHolder");
                    throw null;
                }
            }
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            supportFragmentManager.getClass();
            androidx.fragment.app.bar barVar3 = new androidx.fragment.app.bar(supportFragmentManager);
            mz.h.M.getClass();
            barVar3.g(2131364006, new mz.h(), (java.lang.String) null);
            barVar3.l();
            try {
                kotlin.o oVar = kotlin.q.b;
                qc3.bar barVar4 = this.e0;
                if (barVar4 != null) {
                    java.lang.Object obj = barVar4.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    t.c.e((u40.qux) obj, this, new mm.w0(11));
                    kotlin.Unit unit = kotlin.Unit.a;
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("adsConsentManager");
                throw null;
            } catch (java.lang.Throwable th) {
                kotlin.o oVar2 = kotlin.q.b;
                od.p.o(th);
                return;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("adsConsentManager");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        androidx.fragment.app.Fragment F = getSupportFragmentManager().F(2131364006);
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
