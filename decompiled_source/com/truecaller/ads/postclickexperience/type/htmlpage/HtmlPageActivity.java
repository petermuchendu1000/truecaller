package com.truecaller.ads.postclickexperience.type.htmlpage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/truecaller/ads/postclickexperience/type/htmlpage/HtmlPageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "b80/baz", "b80/bar", "m90/bar", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class HtmlPageActivity extends com.truecaller.ads.postclickexperience.type.htmlpage.Hilt_HtmlPageActivity {
    public static final /* synthetic */ int f0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(m90.c.class), new m90.a(this, 1), new m90.a(this, 0), new m90.a(this, 2));
    public final kotlin.Lazy e0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 22));

    /* JADX WARN: Multi-variable type inference failed */
    public static final void t0(com.truecaller.ads.postclickexperience.type.htmlpage.HtmlPageActivity htmlPageActivity) {
        com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent.OnClick onClick;
        java.lang.String str;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Integer callCategory;
        com.truecaller.ads.acsrules.model.CallDirection callDirection;
        com.truecaller.ads.CallType callType;
        m90.c cVar = (m90.c) htmlPageActivity.d0.getValue();
        e00.qux quxVar = cVar.f;
        com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent htmlPageUiComponent = cVar.i;
        java.lang.String str2 = null;
        if (htmlPageUiComponent != null && (onClick = htmlPageUiComponent.d) != null && (str = onClick.a) != null) {
            com.truecaller.ads.postclickexperience.common.ui.PostClickExperienceInput postClickExperienceInput = cVar.g;
            if (postClickExperienceInput != null) {
                java.lang.String renderId = postClickExperienceInput.getRenderId();
                ((u03.baz) cVar.e.get()).getClass();
                java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                com.truecaller.ads.util.CallInformation callInformation = quxVar.c;
                if (callInformation != null && (callType = callInformation.getCallType()) != null) {
                    num = java.lang.Integer.valueOf(callType.getCallType());
                } else {
                    num = null;
                }
                java.lang.String valueOf2 = java.lang.String.valueOf(num);
                com.truecaller.ads.util.CallInformation callInformation2 = quxVar.c;
                if (callInformation2 != null && (callDirection = callInformation2.getCallDirection()) != null) {
                    num2 = java.lang.Integer.valueOf(callDirection.getInt());
                } else {
                    num2 = null;
                }
                java.lang.String valueOf3 = java.lang.String.valueOf(num2);
                com.truecaller.ads.util.CallInformation callInformation3 = quxVar.c;
                if (callInformation3 != null && (callCategory = callInformation3.getCallCategory()) != null) {
                    str2 = java.lang.String.valueOf(callCategory.intValue());
                }
                str2 = yp.d0.y(str, "", renderId, valueOf, valueOf2, valueOf3, str2, (java.lang.String) null, (java.lang.String) null, 1984);
            } else {
                kotlin.jvm.internal.Intrinsics.n("inputData");
                throw null;
            }
        }
        if (str2 != null) {
            t41.p.n(htmlPageActivity, str2);
        }
        htmlPageActivity.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        super/*android.app.Activity*/.finish();
        overridePendingTransition(0, android.R.anim.fade_out);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ads.postclickexperience.type.htmlpage.Hilt_HtmlPageActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.e0;
        setContentView(((v40.bar) lazy.getValue()).a);
        overridePendingTransition(android.R.anim.fade_in, 0);
        android.webkit.WebView webView = ((v40.bar) lazy.getValue()).c;
        webView.setBackgroundColor(0);
        webView.setVerticalScrollBarEnabled(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.addJavascriptInterface(new m90.bar(this), "Android");
        webView.setWebViewClient(new b80.baz(this, 4));
        webView.setWebChromeClient(new b80.bar(this, 2));
        u0(getIntent());
    }

    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        u0(intent);
    }

    public final void u0(android.content.Intent intent) {
        com.truecaller.ads.postclickexperience.common.ui.PostClickExperienceInput inputData$ads_legacy_googlePlayRelease;
        if (intent != null && (inputData$ads_legacy_googlePlayRelease = com.truecaller.ads.postclickexperience.deeplink.PostClickExperienceDeeplink.INSTANCE.inputData$ads_legacy_googlePlayRelease(intent)) != null) {
            m90.c cVar = (m90.c) this.d0.getValue();
            cVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputData$ads_legacy_googlePlayRelease, "inputData");
            cVar.g = inputData$ads_legacy_googlePlayRelease;
            c9.bar l = androidx.lifecycle.g1.l(cVar);
            java.lang.Object obj = cVar.b.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            df3.bar barVar = null;
            fg3.h0.J(l, (kotlin.coroutines.CoroutineContext) obj, (fg3.f0) null, new lj0.baz(cVar, inputData$ads_legacy_googlePlayRelease, barVar, 28), 2);
            fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new m90.qux(this, inputData$ads_legacy_googlePlayRelease.getAutoCTE(), barVar, 1), 3);
            return;
        }
        finish();
    }
}
