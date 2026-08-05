package com.truecaller.ads.mediation.google;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/truecaller/ads/mediation/google/AdRouterMediationAdapter;", "Lcom/google/android/gms/ads/mediation/Adapter;", "<init>", "()V", "Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;", "conf", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationBannerAd;", "Lcom/google/android/gms/ads/mediation/MediationBannerAdCallback;", "callback", "", "loadBannerAd", "(Lcom/google/android/gms/ads/mediation/MediationBannerAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;", "Lcom/google/android/gms/ads/mediation/UnifiedNativeAdMapper;", "Lcom/google/android/gms/ads/mediation/MediationNativeAdCallback;", "loadNativeAd", "(Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAd;", "Lcom/google/android/gms/ads/mediation/MediationInterstitialAdCallback;", "loadInterstitialAd", "(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;)V", "Landroid/content/Context;", "context", "Lcom/google/android/gms/ads/mediation/InitializationCompleteCallback;", "initializationCompleteCallback", "", "Lcom/google/android/gms/ads/mediation/MediationConfiguration;", "list", "initialize", "(Landroid/content/Context;Lcom/google/android/gms/ads/mediation/InitializationCompleteCallback;Ljava/util/List;)V", "Lcom/google/android/gms/ads/mediation/VersionInfo;", "getVersionInfo", "()Lcom/google/android/gms/ads/mediation/VersionInfo;", "getSDKVersionInfo", "Lv70/qux;", "adRouterMediation", "Lv70/qux;", "bar", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public class AdRouterMediationAdapter extends com.google.android.gms.ads.mediation.Adapter {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final v70.qux adRouterMediation;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/mediation/google/AdRouterMediationAdapter$bar;", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public interface bar {
    }

    public AdRouterMediationAdapter() {
        r11.bar a = r11.bar.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "getAppBase(...)");
        this.adRouterMediation = (v70.qux) ((tx.w) ((com.truecaller.ads.mediation.google.AdRouterMediationAdapter.bar) f40.d0.z(a, com.truecaller.ads.mediation.google.AdRouterMediationAdapter.bar.class))).H.b.x1.get();
    }

    public void initialize(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull com.google.android.gms.ads.mediation.InitializationCompleteCallback initializationCompleteCallback, @org.jetbrains.annotations.NotNull java.util.List<? extends com.google.android.gms.ads.mediation.MediationConfiguration> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationCompleteCallback, "initializationCompleteCallback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
    }

    public void loadBannerAd(@org.jetbrains.annotations.NotNull com.google.android.gms.ads.mediation.MediationBannerAdConfiguration conf, @org.jetbrains.annotations.NotNull com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationBannerAd, com.google.android.gms.ads.mediation.MediationBannerAdCallback> callback) {
        java.lang.String str;
        com.truecaller.ads.AdLayoutTypeX v;
        java.util.Collection collection;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conf, "conf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Banner Ad Call - Adapter-> " + conf.getAdSize(), com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        kotlin.Unit unit = kotlin.Unit.a;
        android.content.Context context = conf.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        v70.baz bazVar = new v70.baz(context, callback);
        com.truecaller.ads.mediation.google.MediationCustomRequest mediationCustomRequest = new com.truecaller.ads.mediation.google.MediationCustomRequest();
        mediationCustomRequest.setAdSize(conf.getAdSize());
        mediationCustomRequest.setServerParams(conf.getServerParameters());
        mediationCustomRequest.setEventExtras(conf.getMediationExtras());
        mediationCustomRequest.setUseTesting(conf.isTestRequest());
        mediationCustomRequest.setBidResponse(conf.getBidResponse());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("adRouterRequest = " + mediationCustomRequest, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        v70.a aVar = (v70.a) this.adRouterMediation;
        aVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "listener");
        aVar.b = bazVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationCustomRequest, "adRequest");
        ak.r0 r0Var = aVar.b;
        if (r0Var == null) {
            return;
        }
        wi.qux quxVar = aVar.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationCustomRequest, "adRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0Var, "listener");
        qc3.bar barVar = (qc3.bar) quxVar.a;
        if (!((qo1.bar) barVar.get()).b.a("featureAdRouterOnGAM", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
            r0Var.T(s70.z.d);
            return;
        }
        android.os.Bundle eventExtras = mediationCustomRequest.getEventExtras();
        java.lang.String str2 = null;
        if (eventExtras != null) {
            str = eventExtras.getString("gam_ad_request_id");
        } else {
            str = null;
        }
        android.os.Bundle eventExtras2 = mediationCustomRequest.getEventExtras();
        if (eventExtras2 != null) {
            str2 = eventExtras2.getString("ad_request_source");
        }
        com.truecaller.ads.mediation.google.MediationExtra mediationExtra = new com.truecaller.ads.mediation.google.MediationExtra(str, str2);
        mediationExtra.getRequestSource();
        com.truecaller.ads.mediation.google.ServerParams t = quxVar.t(mediationCustomRequest);
        com.google.android.gms.ads.AdSize adSize = mediationCustomRequest.getAdSize();
        kotlin.ranges.IntRange intRange = g10.m0.x;
        java.util.List B = ye0.e0.B();
        java.util.ArrayList l = kotlin.collections.y.l(new java.lang.String[]{"animated_icon"});
        if (adSize != null) {
            kotlin.ranges.IntRange intRange2 = g10.m0.x;
            int i = ((kotlin.ranges.bar) intRange2).a;
            int i2 = ((kotlin.ranges.bar) intRange2).b;
            int height = adSize.getHeight();
            if (i <= height && height <= i2) {
                l.addAll(ye0.e0.C());
                v = quxVar.v(t.getLayoutId(), com.truecaller.ads.AdLayoutTypeX.SMALL, t.getContext());
                g10.m0 w = wi.qux.w(quxVar, l, mediationExtra, t, B, 48);
                v70.bar barVar2 = new v70.bar(w, v);
                g10.bar barVar3 = (g10.bar) ((qc3.bar) quxVar.b).get();
                kotlin.jvm.internal.Intrinsics.d(barVar3);
                f63.qux.j(barVar3, w, new j01.qux(r0Var, barVar2, barVar3, t, 24), true, (java.lang.String) null, 8);
            }
        }
        if (adSize != null) {
            kotlin.ranges.IntRange intRange3 = g10.m0.y;
            int i3 = ((kotlin.ranges.bar) intRange3).a;
            int i4 = ((kotlin.ranges.bar) intRange3).b;
            int height2 = adSize.getHeight();
            if (i3 <= height2 && height2 <= i4) {
                v = quxVar.v(t.getLayoutId(), com.truecaller.ads.AdLayoutTypeX.ACS, t.getContext());
                B = ye0.e0.F();
                l.addAll(ye0.e0.q());
                g10.m0 w2 = wi.qux.w(quxVar, l, mediationExtra, t, B, 48);
                v70.bar barVar22 = new v70.bar(w2, v);
                g10.bar barVar32 = (g10.bar) ((qc3.bar) quxVar.b).get();
                kotlin.jvm.internal.Intrinsics.d(barVar32);
                f63.qux.j(barVar32, w2, new j01.qux(r0Var, barVar22, barVar32, t, 24), true, (java.lang.String) null, 8);
            }
        }
        B = kotlin.collections.CollectionsKt.l0(ye0.e0.F(), ye0.e0.E());
        v = quxVar.v(t.getLayoutId(), com.truecaller.ads.AdLayoutTypeX.ACS_LARGE, t.getContext());
        if (((qo1.bar) barVar.get()).b()) {
            collection = kotlin.collections.CollectionsKt.m0((java.util.List) g10.m0.A.getValue(), "vast");
        } else {
            collection = (java.util.List) g10.m0.A.getValue();
        }
        l.addAll(collection);
        g10.m0 w22 = wi.qux.w(quxVar, l, mediationExtra, t, B, 48);
        v70.bar barVar222 = new v70.bar(w22, v);
        g10.bar barVar322 = (g10.bar) ((qc3.bar) quxVar.b).get();
        kotlin.jvm.internal.Intrinsics.d(barVar322);
        f63.qux.j(barVar322, w22, new j01.qux(r0Var, barVar222, barVar322, t, 24), true, (java.lang.String) null, 8);
    }

    public void loadInterstitialAd(@org.jetbrains.annotations.NotNull com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration conf, @org.jetbrains.annotations.NotNull com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.MediationInterstitialAd, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback> callback) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conf, "conf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Interstitial Call - Adapter", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        kotlin.Unit unit = kotlin.Unit.a;
        android.content.Context context = conf.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        v70.e eVar = new v70.e(context, callback);
        com.truecaller.ads.mediation.google.MediationCustomRequest mediationCustomRequest = new com.truecaller.ads.mediation.google.MediationCustomRequest();
        mediationCustomRequest.setServerParams(conf.getServerParameters());
        mediationCustomRequest.setEventExtras(conf.getMediationExtras());
        mediationCustomRequest.setUseTesting(conf.isTestRequest());
        mediationCustomRequest.setBidResponse(conf.getBidResponse());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("adRouterRequest = " + mediationCustomRequest, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        v70.a aVar = (v70.a) this.adRouterMediation;
        aVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "listener");
        aVar.b = eVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationCustomRequest, "adRequest");
        ak.r0 r0Var = aVar.b;
        if (r0Var == null) {
            return;
        }
        wi.qux quxVar = aVar.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationCustomRequest, "adRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0Var, "listener");
        if (!((qo1.bar) ((qc3.bar) quxVar.a).get()).b.a("featureAdRouterOnGAM", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
            r0Var.T(s70.z.d);
            return;
        }
        android.os.Bundle eventExtras = mediationCustomRequest.getEventExtras();
        java.lang.String str2 = null;
        if (eventExtras != null) {
            str = eventExtras.getString("gam_ad_request_id");
        } else {
            str = null;
        }
        android.os.Bundle eventExtras2 = mediationCustomRequest.getEventExtras();
        if (eventExtras2 != null) {
            str2 = eventExtras2.getString("ad_request_source");
        }
        com.truecaller.ads.mediation.google.MediationExtra mediationExtra = new com.truecaller.ads.mediation.google.MediationExtra(str, str2);
        mediationExtra.getRequestSource();
        com.truecaller.ads.mediation.google.ServerParams t = quxVar.t(mediationCustomRequest);
        g10.bar barVar = (g10.bar) ((qc3.bar) quxVar.b).get();
        kotlin.jvm.internal.Intrinsics.d(barVar);
        f63.qux.j(barVar, wi.qux.w(quxVar, (java.util.List) g10.m0.T.getValue(), mediationExtra, t, (java.util.List) g10.m0.U.getValue(), 32), new v70.d(r0Var, barVar, t, 0), true, (java.lang.String) null, 8);
    }

    public void loadNativeAd(@org.jetbrains.annotations.NotNull com.google.android.gms.ads.mediation.MediationNativeAdConfiguration conf, @org.jetbrains.annotations.NotNull com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> callback) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conf, "conf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Native Ad Call -Adapter", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        kotlin.Unit unit = kotlin.Unit.a;
        android.content.Context context = conf.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        v70.f fVar = new v70.f(context, callback);
        com.truecaller.ads.mediation.google.MediationCustomRequest mediationCustomRequest = new com.truecaller.ads.mediation.google.MediationCustomRequest();
        mediationCustomRequest.setServerParams(conf.getServerParameters());
        mediationCustomRequest.setEventExtras(conf.getMediationExtras());
        mediationCustomRequest.setUseTesting(conf.isTestRequest());
        mediationCustomRequest.setBidResponse(conf.getBidResponse());
        com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions = conf.getNativeAdOptions();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nativeAdOptions, "getNativeAdOptions(...)");
        mediationCustomRequest.setImageOrientation(nativeAdOptions.getMediaAspectRatio());
        mediationCustomRequest.setAdChoicesPlacement(nativeAdOptions.getAdChoicesPlacement());
        mediationCustomRequest.setShouldDownloadImages(!nativeAdOptions.shouldReturnUrlsForImageAssets());
        mediationCustomRequest.setShouldDownloadMultipleImages(nativeAdOptions.shouldRequestMultipleImages());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("adRouterRequest = " + mediationCustomRequest, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        v70.a aVar = (v70.a) this.adRouterMediation;
        aVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "listener");
        aVar.b = fVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationCustomRequest, "adRequest");
        ak.r0 r0Var = aVar.b;
        if (r0Var == null) {
            return;
        }
        wi.qux quxVar = aVar.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationCustomRequest, "adRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0Var, "listener");
        if (!((qo1.bar) ((qc3.bar) quxVar.a).get()).b.a("featureAdRouterOnGAM", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
            r0Var.T(s70.z.d);
            return;
        }
        android.os.Bundle eventExtras = mediationCustomRequest.getEventExtras();
        java.lang.String str2 = null;
        if (eventExtras != null) {
            str = eventExtras.getString("gam_ad_request_id");
        } else {
            str = null;
        }
        android.os.Bundle eventExtras2 = mediationCustomRequest.getEventExtras();
        if (eventExtras2 != null) {
            str2 = eventExtras2.getString("ad_request_source");
        }
        com.truecaller.ads.mediation.google.MediationExtra mediationExtra = new com.truecaller.ads.mediation.google.MediationExtra(str, str2);
        mediationExtra.getRequestSource();
        com.truecaller.ads.mediation.google.ServerParams t = quxVar.t(mediationCustomRequest);
        g10.bar barVar = (g10.bar) ((qc3.bar) quxVar.b).get();
        kotlin.jvm.internal.Intrinsics.d(barVar);
        f63.qux.j(barVar, wi.qux.w(quxVar, kotlin.collections.x.c("native"), mediationExtra, t, kotlin.collections.h0.a, 48), new v70.d(r0Var, barVar, t, 1), true, (java.lang.String) null, 8);
    }

    @org.jetbrains.annotations.NotNull
    public com.google.android.gms.ads.mediation.VersionInfo getSDKVersionInfo() {
        java.lang.String[] strArr = (java.lang.String[]) new kotlin.text.Regex("\\.").h(0, "1.0.0").toArray(new java.lang.String[0]);
        if (strArr.length >= 3) {
            return new com.google.android.gms.ads.mediation.VersionInfo(java.lang.Integer.parseInt(strArr[0]), java.lang.Integer.parseInt(strArr[1]), java.lang.Integer.parseInt(strArr[2]));
        }
        return new com.google.android.gms.ads.mediation.VersionInfo(0, 0, 0);
    }

    @org.jetbrains.annotations.NotNull
    public com.google.android.gms.ads.mediation.VersionInfo getVersionInfo() {
        java.lang.String[] strArr = (java.lang.String[]) new kotlin.text.Regex("\\.").h(0, "1.0.0.0").toArray(new java.lang.String[0]);
        if (strArr.length >= 4) {
            return new com.google.android.gms.ads.mediation.VersionInfo(java.lang.Integer.parseInt(strArr[0]), java.lang.Integer.parseInt(strArr[1]), java.lang.Integer.parseInt(strArr[3]) + (java.lang.Integer.parseInt(strArr[2]) * 100));
        }
        return new com.google.android.gms.ads.mediation.VersionInfo(0, 0, 0);
    }
}
