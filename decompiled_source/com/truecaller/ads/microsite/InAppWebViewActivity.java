package com.truecaller.ads.microsite;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/ads/microsite/InAppWebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "vd/b", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class InAppWebViewActivity extends com.truecaller.ads.microsite.Hilt_InAppWebViewActivity {
    public static final /* synthetic */ int e0 = 0;
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ads.microsite.Hilt_InAppWebViewActivity
    public final void onCreate(android.os.Bundle bundle) {
        androidx.fragment.app.Fragment gVar;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        setContentView(((v40.baz) this.d0.getValue()).a);
        java.lang.String stringExtra = getIntent().getStringExtra("url");
        if (stringExtra != null && stringExtra.length() != 0) {
            if (kotlin.jvm.internal.Intrinsics.b(getIntent().getStringExtra("dpanda"), "dpanda")) {
                b80.qux.e.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "url");
                gVar = new b80.qux();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("url", stringExtra);
                gVar.setArguments(bundle2);
            } else if (getIntent().getBooleanExtra("expandable", false)) {
                b91.a aVar = c80.baz.e;
                boolean booleanExtra = getIntent().getBooleanExtra("useCustomClose", false);
                java.lang.String stringExtra2 = getIntent().getStringExtra(com.truecaller.ads.postclickexperience.deeplink.PostClickExperienceDeeplink.PARAM_DEEPLINK_CREATIVE_ID);
                aVar.getClass();
                gVar = new c80.baz();
                android.os.Bundle c = com.appsflyer.internal.e.c("url", stringExtra, "htmlContent", (java.lang.String) null);
                c.putBoolean("useCustomClose", booleanExtra);
                c.putString(com.truecaller.ads.postclickexperience.deeplink.PostClickExperienceDeeplink.PARAM_DEEPLINK_CREATIVE_ID, stringExtra2);
                gVar.setArguments(c);
            } else if (kotlin.jvm.internal.Intrinsics.b(android.net.Uri.parse(stringExtra).getHost(), "truecaller.dpanda.online")) {
                b80.qux.e.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "url");
                gVar = new b80.qux();
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putString("url", stringExtra);
                gVar.setArguments(bundle3);
            } else {
                b80.g.n.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "url");
                gVar = new b80.g();
                android.os.Bundle bundle4 = new android.os.Bundle();
                bundle4.putString("url", stringExtra);
                gVar.setArguments(bundle4);
            }
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
            barVar.g(2131363145, gVar, (java.lang.String) null);
            barVar.l();
            return;
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(2131689504, menu);
        android.view.MenuItem findItem = menu.findItem(2131364792);
        if (findItem != null) {
            m03.n.B(findItem, android.content.res.ColorStateList.valueOf(getColor(2131099723)));
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        if (menuItem.getItemId() == 2131364792) {
            finishAndRemoveTask();
            return true;
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }
}
