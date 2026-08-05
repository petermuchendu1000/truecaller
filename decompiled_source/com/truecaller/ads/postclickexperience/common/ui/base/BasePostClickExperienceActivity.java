package com.truecaller.ads.postclickexperience.common.ui.base;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/postclickexperience/common/ui/base/BasePostClickExperienceActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class BasePostClickExperienceActivity extends androidx.appcompat.app.AppCompatActivity {
    /* JADX WARN: Multi-variable type inference failed */
    public final void onBackPressed() {
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 3);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        setContentView(t0());
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(-16777216);
    }

    public void q0() {
        finishAndRemoveTask();
    }

    public final void s0(g90.bar barVar, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "tag");
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar2 = new androidx.fragment.app.bar(supportFragmentManager);
        barVar2.f(2131364010, barVar, str, 1);
        barVar2.m(true, true);
    }

    public abstract android.widget.FrameLayout t0();
}
