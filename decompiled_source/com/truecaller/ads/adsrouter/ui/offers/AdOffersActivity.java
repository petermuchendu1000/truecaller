package com.truecaller.ads.adsrouter.ui.offers;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/ads/adsrouter/ui/offers/AdOffersActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lm10/f;", "<init>", "()V", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdOffersActivity extends com.truecaller.ads.adsrouter.ui.offers.Hilt_AdOffersActivity implements m10.f {
    public static final /* synthetic */ int h0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(m10.g.class), new m10.c(this, 1), new m10.c(this, 0), new m10.c(this, 2));
    public final kotlin.Lazy e0 = kotlin.LazyKt.lazy(kotlin.k.c, new a32.o(this, 21));
    public com.truecaller.ads.adsrouter.ui.offers.OfferConfig f0;
    public ho2.d g0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ads.adsrouter.ui.offers.Hilt_AdOffersActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig;
        java.lang.String string;
        java.util.ArrayList arrayList;
        java.lang.String str;
        java.lang.String str2;
        com.truecaller.ads.adsrouter.model.AdOffers offers;
        com.truecaller.ads.adsrouter.model.AdOffersTemplate offersTemplate;
        com.truecaller.ads.adsrouter.model.AdOffers offers2;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        yy.qux.C(this, 2);
        setContentView(u0().a);
        java.lang.String str3 = null;
        if (bundle != null) {
            offerConfig = (com.truecaller.ads.adsrouter.ui.offers.OfferConfig) ((android.os.Parcelable) t80.g.q(bundle, "offers_config", com.truecaller.ads.adsrouter.ui.offers.OfferConfig.class));
        } else {
            android.os.Bundle extras = getIntent().getExtras();
            if (extras != null) {
                offerConfig = (com.truecaller.ads.adsrouter.ui.offers.OfferConfig) ((android.os.Parcelable) t80.g.q(extras, "offers_config", com.truecaller.ads.adsrouter.ui.offers.OfferConfig.class));
            } else {
                offerConfig = null;
            }
        }
        this.f0 = offerConfig;
        androidx.appcompat.widget.Toolbar toolbar = u0().d;
        com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig2 = this.f0;
        if (offerConfig2 == null || (offers2 = offerConfig2.getOffers()) == null || (string = offers2.getTitle()) == null) {
            string = getString(2132022296);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        toolbar.setTitle(string);
        u0().d.setPadding(0, 0, getResources().getDimensionPixelSize(2131165296), 0);
        setSupportActionBar(u0().d);
        com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig3 = this.f0;
        if (offerConfig3 != null) {
            m10.g t0 = t0();
            t0.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerConfig3, "offerConfig");
            java.util.ArrayList l = bd.bar.l(false, offerConfig3.getAds(), t0.o(), offerConfig3.getPlacement(), offerConfig3.getCampaignId());
            if (offerConfig3.getUsedAds() != null) {
                arrayList = bd.bar.l(true, offerConfig3.getUsedAds(), t0.o(), offerConfig3.getPlacement(), offerConfig3.getCampaignId());
            } else {
                arrayList = kotlin.collections.h0.a;
            }
            t0.p(offerConfig3);
            this.g0 = new ho2.d(kotlin.collections.CollectionsKt.l0(l, arrayList), this);
            androidx.recyclerview.widget.RecyclerView recyclerView = u0().c;
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
            ho2.d dVar = this.g0;
            if (dVar != null) {
                recyclerView.setAdapter(dVar);
                androidx.recyclerview.widget.LinearLayoutManager layoutManager = recyclerView.getLayoutManager();
                kotlin.jvm.internal.Intrinsics.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                recyclerView.addOnScrollListener(new m10.b(this, layoutManager));
                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new m10.a(this, null, 1), 3);
                java.lang.String eventPixel = offerConfig3.getOffers().getEventPixel();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("offers_view", "event");
                if (eventPixel != null) {
                    m10.g t02 = t0();
                    com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig4 = this.f0;
                    if (offerConfig4 != null) {
                        str = offerConfig4.getPlacement();
                    } else {
                        str = null;
                    }
                    com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig5 = this.f0;
                    if (offerConfig5 != null) {
                        str2 = offerConfig5.getCampaignId();
                    } else {
                        str2 = null;
                    }
                    com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig6 = this.f0;
                    if (offerConfig6 != null && (offers = offerConfig6.getOffers()) != null && (offersTemplate = offers.getOffersTemplate()) != null) {
                        str3 = offersTemplate.getValue();
                    }
                    t02.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("offers_view", "event");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventPixel, "eventPixel");
                    ((f10.f) t02.f.getValue()).b(new f10.bar(com.truecaller.ads.adsrouter.pixel.AdsPixel.EVENT_PIXEL.getValue(), t02.o(), kotlin.collections.x.c(eventPixel), "offers_view", str, str2, str3, null, null, null, 896));
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("offersAdapter");
            throw null;
        }
        java.lang.String string2 = getString(2132020848);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) string2, 0).show();
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(2131689522, menu);
        m03.n.B(menu.findItem(2131364792), android.content.res.ColorStateList.valueOf(getColor(2131099723)));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        if (menuItem.getItemId() == 2131364792) {
            finish();
            return true;
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig;
        java.util.List<com.truecaller.ads.adsrouter.model.App> ads;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "outState");
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig2 = this.f0;
        if (offerConfig2 != null) {
            if (offerConfig2.getUsedAds() != null) {
                ads = kotlin.collections.CollectionsKt.l0(offerConfig2.getUsedAds(), offerConfig2.getAds());
            } else {
                ads = offerConfig2.getAds();
            }
            offerConfig = com.truecaller.ads.adsrouter.ui.offers.OfferConfig.copy$default(offerConfig2, null, ads, kotlin.collections.h0.a, null, null, 25, null);
            if (offerConfig != null) {
                bundle.putParcelable("offers_config", offerConfig);
                this.f0 = offerConfig;
            }
        }
        offerConfig = null;
        this.f0 = offerConfig;
    }

    public final m10.g t0() {
        return (m10.g) this.d0.getValue();
    }

    public final v40.c u0() {
        return (v40.c) this.e0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(m10.bar barVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.truecaller.ads.adsrouter.model.RedirectBehaviour redirectBehaviour;
        int i;
        java.lang.Boolean bool;
        com.truecaller.ads.adsrouter.model.AdOffers offers;
        com.truecaller.ads.adsrouter.model.AdOffersTemplate offersTemplate;
        com.truecaller.ads.adsrouter.model.AdOffers offers2;
        com.truecaller.ads.adsrouter.model.AdOffersTemplate offersTemplate2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "adOffers");
        m10.g t0 = t0();
        com.truecaller.ads.adsrouter.model.Tracking tracking = barVar.e;
        com.truecaller.ads.adsrouter.model.CreativeBehaviour creativeBehaviour = barVar.k;
        java.util.List<java.lang.String> click = tracking.getClick();
        com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig = this.f0;
        if (offerConfig != null) {
            str = offerConfig.getPlacement();
        } else {
            str = null;
        }
        com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig2 = this.f0;
        if (offerConfig2 != null) {
            str2 = offerConfig2.getCampaignId();
        } else {
            str2 = null;
        }
        com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig3 = this.f0;
        if (offerConfig3 != null && (offers2 = offerConfig3.getOffers()) != null && (offersTemplate2 = offers2.getOffersTemplate()) != null) {
            str3 = offersTemplate2.getValue();
        } else {
            str3 = null;
        }
        t0.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(click, "clickPixels");
        ((f10.f) t0.f.getValue()).b(new f10.bar(com.truecaller.ads.adsrouter.pixel.AdsPixel.CLICK.getValue(), t0.o(), click, null, str, str2, str3, null, null, null, 904));
        java.lang.String str5 = barVar.g;
        java.lang.String str6 = barVar.j;
        com.truecaller.ads.adsrouter.ui.offers.OfferConfig offerConfig4 = this.f0;
        if (offerConfig4 != null && (offers = offerConfig4.getOffers()) != null && (offersTemplate = offers.getOffersTemplate()) != null) {
            str4 = offersTemplate.getValue();
        } else {
            str4 = null;
        }
        java.lang.String y = yp.d0.y(str5, (java.lang.String) null, str6, (java.lang.String) null, str4, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 2037);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("render_id", barVar.j);
        java.lang.String str7 = barVar.i;
        if (str7 != null) {
            bundle.putString("placement", str7);
        }
        java.lang.String str8 = barVar.h;
        if (str8 != null) {
            bundle.putString("campaignId", str8);
        }
        if (creativeBehaviour != null) {
            redirectBehaviour = creativeBehaviour.getRedirectBehaviour();
        } else {
            redirectBehaviour = null;
        }
        if (redirectBehaviour == null) {
            i = -1;
        } else {
            i = m10.qux.a[redirectBehaviour.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (creativeBehaviour != null) {
                    bool = creativeBehaviour.getInAppRedirect();
                } else {
                    bool = null;
                }
                if (yp.d0.D(bool)) {
                    com.truecaller.ads.util.y0.s(this, null, y, bundle);
                    return;
                } else {
                    t41.p.m(this, bundle, y);
                    return;
                }
            }
            vd.b.e(this, y, (com.truecaller.ads.mraid.TwoPartExpandableAdProperties) null);
            return;
        }
        com.truecaller.ads.util.y0.s(this, null, y, bundle);
    }
}
