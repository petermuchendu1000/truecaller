package com.truecaller.social_media.presentation.view;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/social_media/presentation/view/SocialMediaLinksActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "social-media_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SocialMediaLinksActivity extends com.truecaller.social_media.presentation.view.Hilt_SocialMediaLinksActivity {
    public static final /* synthetic */ int e0 = 0;
    public d91.c d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.social_media.presentation.view.Hilt_SocialMediaLinksActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        androidx.constraintlayout.widget.ConstraintLayout inflate = getLayoutInflater().inflate(2131558501, (android.view.ViewGroup) null, false);
        int i = 2131362268;
        if (df0.qux.o(2131362268, inflate) != null) {
            i = 2131363145;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) df0.qux.o(2131363145, inflate);
            if (frameLayout != null) {
                int i2 = 2131366257;
                if (df0.qux.o(2131366257, inflate) != null) {
                    i2 = 2131367109;
                    com.google.android.material.appbar.MaterialToolbar o = df0.qux.o(2131367109, inflate);
                    if (o != null) {
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
                        d91.c cVar = new d91.c(constraintLayout, frameLayout, o, 7);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
                        this.d0 = cVar;
                        setContentView(constraintLayout);
                        java.lang.String stringExtra = getIntent().getStringExtra("source");
                        d91.c cVar2 = this.d0;
                        if (cVar2 != null) {
                            com.google.android.material.appbar.MaterialToolbar materialToolbar = (com.google.android.material.appbar.MaterialToolbar) cVar2.d;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(materialToolbar, "toolbarSocialMediaLinks");
                            ak.r0.i(materialToolbar, com.truecaller.common.ui.insets.InsetType.StatusBar);
                            d91.c cVar3 = this.d0;
                            if (cVar3 != null) {
                                setSupportActionBar((com.google.android.material.appbar.MaterialToolbar) cVar3.d);
                                i.baz supportActionBar = getSupportActionBar();
                                if (supportActionBar != null) {
                                    supportActionBar.p(true);
                                    supportActionBar.u(0.0f);
                                }
                                d91.c cVar4 = this.d0;
                                if (cVar4 != null) {
                                    ((com.google.android.material.appbar.MaterialToolbar) cVar4.d).setNavigationOnClickListener(new lb1.b(this, 4));
                                    d91.c cVar5 = this.d0;
                                    if (cVar5 != null) {
                                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = cVar5.b;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                                        ak.r0.i(constraintLayout2, com.truecaller.common.ui.insets.InsetType.NavigationBar);
                                        lt2.b bVar = new lt2.b();
                                        android.os.Bundle bundle2 = new android.os.Bundle();
                                        bundle2.putString("arg_source", stringExtra);
                                        bVar.setArguments(bundle2);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "fragment");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("social_media_links_tag", "tag");
                                        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
                                        supportFragmentManager.getClass();
                                        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
                                        barVar.f(2131363145, bVar, "social_media_links_tag", 1);
                                        barVar.m(true, true);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "also(...)");
                                        return;
                                    }
                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                    throw null;
                                }
                                kotlin.jvm.internal.Intrinsics.n("binding");
                                throw null;
                            }
                            kotlin.jvm.internal.Intrinsics.n("binding");
                            throw null;
                        }
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                }
                i = i2;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
