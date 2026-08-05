package com.truecaller.ads.postclickexperience.common.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/ads/postclickexperience/common/ui/PostClickExperienceActivity;", "Lcom/truecaller/ads/postclickexperience/common/ui/base/BasePostClickExperienceActivity;", "Lg90/baz;", "<init>", "()V", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PostClickExperienceActivity extends com.truecaller.ads.postclickexperience.common.ui.Hilt_PostClickExperienceActivity implements g90.baz {
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 9));

    @Override // g90.baz
    public final void b(com.truecaller.ads.postclickexperience.dto.Theme theme, com.truecaller.ads.postclickexperience.dto.ThankYouData thankYouData) {
        f90.qux.m.getClass();
        f90.qux quxVar = new f90.qux();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("extra_theme", theme);
        bundle.putParcelable("extra_thankyou_data", thankYouData);
        quxVar.setArguments(bundle);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "fragment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("OfflineAdsThankYouFragment", "tag");
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
        barVar.g(2131364010, quxVar, "OfflineAdsThankYouFragment");
        barVar.m(true, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x006a, code lost:
    
        n90.a.o.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "bundle");
        r0 = new n90.a();
        r0.setArguments(r4);
        s0(r0, "OfflineLeadGenFragment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r0.equals("OFFLINE_ARTICLE_PAGE") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        l90.a.o.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "bundle");
        r0 = new l90.a();
        r0.setArguments(r4);
        s0(r0, "ArticleFragment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r0.equals("ONLINE_ARTICLE_PAGE") != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r0.equals("OFFLINE_LEADGEN") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r0.equals("ONLINE_LEADGEN") == false) goto L23;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ads.postclickexperience.common.ui.Hilt_PostClickExperienceActivity, com.truecaller.ads.postclickexperience.common.ui.base.BasePostClickExperienceActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        android.os.Bundle extras = getIntent().getExtras();
        android.os.Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            str = extras2.getString(com.truecaller.ads.postclickexperience.deeplink.PostClickExperienceDeeplink.EXTRA_TYPE);
        } else {
            str = null;
        }
        if (extras != null && str != null) {
            switch (str.hashCode()) {
                case -1840202792:
                    break;
                case -642896188:
                    break;
                case -183315116:
                    break;
                case 1014971496:
                    break;
                default:
                    finishAndRemoveTask();
                    return;
            }
        } else {
            finishAndRemoveTask();
        }
    }

    @Override // com.truecaller.ads.postclickexperience.common.ui.base.BasePostClickExperienceActivity
    public final android.widget.FrameLayout t0() {
        android.widget.FrameLayout frameLayout = ((v40.a) this.d0.getValue()).a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        return frameLayout;
    }
}
