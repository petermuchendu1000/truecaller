package com.truecaller.ads.postclickexperience.type.nativevideo;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/ads/postclickexperience/type/nativevideo/NativeVideoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lg90/baz;", "<init>", "()V", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class NativeVideoActivity extends com.truecaller.ads.postclickexperience.type.nativevideo.Hilt_NativeVideoActivity implements g90.baz {
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 26));

    @Override // g90.baz
    public final void b(com.truecaller.ads.postclickexperience.dto.Theme theme, com.truecaller.ads.postclickexperience.dto.ThankYouData thankYouData) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBackPressed() {
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ads.postclickexperience.type.nativevideo.Hilt_NativeVideoActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        setContentView(((v40.qux) this.d0.getValue()).a);
        t0(getIntent());
    }

    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        t0(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0(android.content.Intent intent) {
        android.os.Bundle bundle;
        java.lang.String str;
        android.os.Bundle extras;
        com.truecaller.ads.postclickexperience.common.ui.PostClickExperienceInput postClickExperienceInput = null;
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (intent != null && (extras = intent.getExtras()) != null) {
            str = extras.getString(com.truecaller.ads.postclickexperience.deeplink.PostClickExperienceDeeplink.EXTRA_TYPE);
        } else {
            str = null;
        }
        if (intent != null) {
            postClickExperienceInput = com.truecaller.ads.postclickexperience.deeplink.PostClickExperienceDeeplink.INSTANCE.inputData$ads_legacy_googlePlayRelease(intent);
        }
        if (bundle != null && postClickExperienceInput != null && str != null) {
            if (!str.equals("ONLINE_NATIVE_PORTRAIT_VIDEO") && !str.equals("ONLINE_NATIVE_PORTRAIT_VIDEO_WITH_IMAGE")) {
                finish();
                return;
            }
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            int id = ((v40.qux) this.d0.getValue()).b.getId();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            o90.a aVar = new o90.a();
            aVar.setArguments(bundle);
            j.g(id, aVar, "AdsNativePortraitVideo");
            j.m(true, true);
            return;
        }
        finish();
    }
}
