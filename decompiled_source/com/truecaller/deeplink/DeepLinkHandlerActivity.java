package com.truecaller.deeplink;

@com.airbnb.deeplinkdispatch.DeepLinkHandler({x91.qux.class, p40.l.class, bi3.a.class, bf0.s2.class})
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/deeplink/DeepLinkHandlerActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeepLinkHandlerActivity extends com.truecaller.deeplink.Hilt_DeepLinkHandlerActivity {
    public static final /* synthetic */ int x0 = 0;
    public qc3.bar d0;
    public qc3.bar e0;
    public qc3.bar f0;
    public qc3.bar g0;
    public qc3.bar h0;
    public qc3.bar i0;
    public qc3.bar j0;
    public qc3.bar k0;
    public qc3.bar l0;
    public qc3.bar m0;
    public nc0.bar n0;
    public uq2.baz o0;
    public qc3.bar p0;
    public qc3.bar q0;
    public com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate r0;
    public qc3.bar s0;
    public qc3.bar t0;
    public qc3.bar u0;
    public qc3.bar v0;
    public fg3.e0 w0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x00af. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void s0(com.truecaller.deeplink.DeepLinkHandlerActivity deepLinkHandlerActivity, android.content.Intent intent) {
        android.content.Intent intent2;
        java.lang.String str;
        android.content.Intent intent3;
        java.util.Set b;
        i82.r rVar;
        java.lang.Object obj;
        java.util.List g0;
        java.util.Set b2;
        java.util.List g03;
        com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate baseDeepLinkDelegate = deepLinkHandlerActivity.r0;
        if (baseDeepLinkDelegate != null) {
            if (com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate.dispatchFrom$default(baseDeepLinkDelegate, deepLinkHandlerActivity, (android.content.Intent) null, 2, (java.lang.Object) null).isSuccessful()) {
                android.content.Intent intent4 = deepLinkHandlerActivity.getIntent();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                deepLinkHandlerActivity.u0(intent4, "succeed");
                deepLinkHandlerActivity.finish();
                return;
            }
            android.net.Uri data = intent.getData();
            if (data != null) {
                java.lang.String host = data.getHost();
                if ("truecaller.com".equals(host) || "www.truecaller.com".equals(host)) {
                    java.lang.String path = data.getPath();
                    if (!android.text.TextUtils.isEmpty(path)) {
                        kotlin.jvm.internal.Intrinsics.d(path);
                        if (kotlin.text.y.w(path, "/d/", false)) {
                            host = path.substring(3);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(host, "substring(...)");
                        }
                    }
                    host = "";
                }
                if (!android.text.TextUtils.isEmpty(host)) {
                    if (host != null) {
                        switch (host.hashCode()) {
                            case -1961300393:
                                if (host.equals("video_caller_id_settings")) {
                                    uq2.baz bazVar = deepLinkHandlerActivity.o0;
                                    if (bazVar != null) {
                                        deepLinkHandlerActivity.startActivity(bazVar.a(deepLinkHandlerActivity, new com.truecaller.settings.api.SettingsLaunchConfig(false, true), com.truecaller.settings.api.SettingsCategory.SETTINGS_CALLERID, (com.truecaller.settings.api.SettingDeepLink) null));
                                        intent2 = intent;
                                        str = "succeed";
                                        break;
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("settingsRouter");
                                        throw null;
                                    }
                                }
                                break;
                            case -1872275494:
                                if (host.equals("browser-extension")) {
                                    java.lang.String queryParameter = data.getQueryParameter("pushId");
                                    if (queryParameter != null) {
                                        qc3.bar barVar = deepLinkHandlerActivity.i0;
                                        if (barVar != null) {
                                            ok0.bar barVar2 = (ok0.bar) barVar.get();
                                            barVar2.getClass();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryParameter, "pushId");
                                            fg3.h0.J((fg3.e0) barVar2.d.getValue(), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ob2.n(barVar2, queryParameter, null, 4), 3);
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("browserExtensionManager");
                                            throw null;
                                        }
                                    }
                                    intent2 = intent;
                                    str = "succeed";
                                    break;
                                }
                                break;
                            case -1854306943:
                                if (host.equals("scam_feed")) {
                                    qc3.bar barVar3 = deepLinkHandlerActivity.q0;
                                    if (barVar3 != null) {
                                        kl2.bar barVar4 = (kl2.bar) barVar3.get();
                                        barVar4.getClass();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkHandlerActivity, "context");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                                        if (!((qo1.u) barVar4.a).a.a("featureScamFeed", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                                            try {
                                                deepLinkHandlerActivity.startActivity(y90.m6.o(deepLinkHandlerActivity, (com.truecaller.bottombar.BottomBarButtonType) null, "deepLink", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 122));
                                            } catch (java.lang.RuntimeException e) {
                                                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
                                            }
                                        } else {
                                            try {
                                                if (barVar4.a()) {
                                                    android.content.Intent o = y90.m6.o(deepLinkHandlerActivity, com.truecaller.bottombar.BottomBarButtonType.SCAM_FEED, "deepLink", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 120);
                                                    o.setData(data);
                                                    deepLinkHandlerActivity.startActivity(o);
                                                } else {
                                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                                    arrayList.add(y90.m6.o(deepLinkHandlerActivity, (com.truecaller.bottombar.BottomBarButtonType) null, "deepLink", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 122));
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkHandlerActivity, "context");
                                                    android.content.Intent intent5 = new android.content.Intent((android.content.Context) deepLinkHandlerActivity, (java.lang.Class<?>) com.truecaller.scamfeed.presentation.ui.ScamFeedActivity.class);
                                                    intent5.setData(data);
                                                    arrayList.add(intent5.addFlags(536870912));
                                                    if (!arrayList.isEmpty()) {
                                                        android.content.Intent[] intentArr = (android.content.Intent[]) arrayList.toArray(new android.content.Intent[0]);
                                                        intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
                                                        deepLinkHandlerActivity.startActivities(intentArr, null);
                                                    } else {
                                                        throw new java.lang.IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                                                    }
                                                }
                                            } catch (java.lang.RuntimeException e2) {
                                                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e2);
                                            }
                                        }
                                        intent2 = intent;
                                        str = "succeed";
                                        break;
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("scamFeedHelper");
                                        throw null;
                                    }
                                }
                                break;
                            case -1782210391:
                                if (host.equals("favourite")) {
                                    qc3.bar barVar5 = deepLinkHandlerActivity.s0;
                                    if (barVar5 != null) {
                                        deepLinkHandlerActivity.startActivity(((com.truecaller.ui.b0) barVar5.get()).c(deepLinkHandlerActivity, com.truecaller.bottombar.BottomBarButtonType.CALLS, "deepLink", com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs.FAVORITE));
                                        intent2 = intent;
                                        str = "succeed";
                                        break;
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("homescreenRouter");
                                        throw null;
                                    }
                                }
                                break;
                            case -1253600828:
                                if (host.equals("global_search")) {
                                    qc3.bar barVar6 = deepLinkHandlerActivity.u0;
                                    if (barVar6 != null) {
                                        g73.bar barVar7 = (g73.bar) barVar6.get();
                                        barVar7.getClass();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkHandlerActivity, "context");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                                        java.io.Serializable serializable = com.truecaller.search.global.SearchResultOrder.ORDER_CGMT;
                                        java.io.Serializable serializable2 = com.truecaller.analytics.AppEvents.GlobalSearch.NavigationSource.WIDGET;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkHandlerActivity, "context");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializable, "resultOrder");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializable2, "source");
                                        android.content.Intent putExtra = new android.content.Intent((android.content.Context) deepLinkHandlerActivity, (java.lang.Class<?>) com.truecaller.search.global.GlobalSearchResultActivity.class).putExtra("ARG_SEARCH_TEXT", (java.lang.String) null).putExtra("ARG_SEARCH_COUNTRY", (java.lang.String) null).putExtra("ARG_FORCE_NUMBER_SEARCH", false).putExtra("ARG_SHOW_KEYBOARD", true).putExtra("ARG_RESULT_ORDER", serializable).putExtra("ARG_NAVIGATION_SOURCE", serializable2);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                                        barVar7.a(deepLinkHandlerActivity, putExtra);
                                        intent2 = intent;
                                        str = "succeed";
                                        break;
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("widgetHelper");
                                        throw null;
                                    }
                                }
                                break;
                            case -1048857620:
                                if (host.equals("truesdk")) {
                                    java.lang.String queryParameter2 = data.getQueryParameter("type");
                                    if (!jj3.bar.i(queryParameter2) && kotlin.jvm.internal.Intrinsics.b(queryParameter2, "btmsheet")) {
                                        qc3.bar barVar8 = deepLinkHandlerActivity.f0;
                                        if (barVar8 != null) {
                                            if (((qo1.q) barVar8.get()).a.a("featureSdkBottomSheetDialog", com.truecaller.featuretoggles.FeatureState.ENABLED)) {
                                                intent3 = new android.content.Intent((android.content.Context) deepLinkHandlerActivity, (java.lang.Class<?>) com.truecaller.sdk.BottomSheetConfirmProfileActivity.class);
                                                intent3.putExtra("requestNonce", data.getQueryParameter("requestNonce"));
                                                intent3.putExtra("partnerKey", data.getQueryParameter("partnerKey"));
                                                intent3.putExtra("partnerName", data.getQueryParameter("partnerName"));
                                                intent3.putExtra("lang", data.getQueryParameter("lang"));
                                                intent3.putExtra("title", data.getQueryParameter("title"));
                                                intent3.putExtra("skipOption", data.getQueryParameter("skipOption"));
                                                intent3.putExtra("ctaColor", data.getQueryParameter("ctaColor"));
                                                intent3.putExtra("ctaTextColor", data.getQueryParameter("ctaTextColor"));
                                                intent3.putExtra("privacyUrl", data.getQueryParameter("privacyUrl"));
                                                intent3.putExtra("termsUrl", data.getQueryParameter("termsUrl"));
                                                intent3.putExtra("loginPrefix", data.getQueryParameter("loginPrefix"));
                                                intent3.putExtra("loginSuffix", data.getQueryParameter("loginSuffix"));
                                                intent3.putExtra("ctaPrefix", data.getQueryParameter("ctaPrefix"));
                                                intent3.putExtra("btnShape", data.getQueryParameter("btnShape"));
                                                intent3.putExtra("ttl", data.getQueryParameter("ttl"));
                                                intent3.putExtra("bannerPath", data.getQueryParameter("bannerPath"));
                                                intent3.addFlags(268468224);
                                                deepLinkHandlerActivity.startActivity(intent3);
                                                intent2 = intent;
                                                str = "succeed";
                                                break;
                                            }
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("sdkFeaturesInventory");
                                            throw null;
                                        }
                                    }
                                    intent3 = new android.content.Intent((android.content.Context) deepLinkHandlerActivity, (java.lang.Class<?>) com.truecaller.sdk.ConfirmProfileActivity.class);
                                    intent3.putExtra("requestNonce", data.getQueryParameter("requestNonce"));
                                    intent3.putExtra("partnerKey", data.getQueryParameter("partnerKey"));
                                    intent3.putExtra("partnerName", data.getQueryParameter("partnerName"));
                                    intent3.putExtra("lang", data.getQueryParameter("lang"));
                                    intent3.putExtra("title", data.getQueryParameter("title"));
                                    intent3.putExtra("skipOption", data.getQueryParameter("skipOption"));
                                    intent3.putExtra("ctaColor", data.getQueryParameter("ctaColor"));
                                    intent3.putExtra("ctaTextColor", data.getQueryParameter("ctaTextColor"));
                                    intent3.putExtra("privacyUrl", data.getQueryParameter("privacyUrl"));
                                    intent3.putExtra("termsUrl", data.getQueryParameter("termsUrl"));
                                    intent3.putExtra("loginPrefix", data.getQueryParameter("loginPrefix"));
                                    intent3.putExtra("loginSuffix", data.getQueryParameter("loginSuffix"));
                                    intent3.putExtra("ctaPrefix", data.getQueryParameter("ctaPrefix"));
                                    intent3.putExtra("btnShape", data.getQueryParameter("btnShape"));
                                    intent3.putExtra("ttl", data.getQueryParameter("ttl"));
                                    intent3.putExtra("bannerPath", data.getQueryParameter("bannerPath"));
                                    intent3.addFlags(268468224);
                                    deepLinkHandlerActivity.startActivity(intent3);
                                    intent2 = intent;
                                    str = "succeed";
                                }
                                break;
                            case -819951495:
                                if (host.equals("verify")) {
                                    qc3.bar barVar9 = deepLinkHandlerActivity.t0;
                                    if (barVar9 != null) {
                                        q83.a aVar = (q83.a) barVar9.get();
                                        android.os.Bundle extras = deepLinkHandlerActivity.getIntent().getExtras();
                                        com.truecaller.wizard.api.WizardStartContext wizardStartContext = com.truecaller.wizard.api.WizardStartContext.INIT;
                                        aVar.getClass();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkHandlerActivity, "context");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wizardStartContext, "startContext");
                                        android.content.Intent a = q83.a.a(deepLinkHandlerActivity, extras, false, wizardStartContext, false);
                                        nc0.u1.a(a, "deepLink", (java.lang.String) null);
                                        deepLinkHandlerActivity.startActivity(a);
                                        intent2 = intent;
                                        str = "succeed";
                                        break;
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("wizardLauncher");
                                        throw null;
                                    }
                                }
                                break;
                            case -760248596:
                                if (host.equals("government_services")) {
                                    qc3.bar barVar10 = deepLinkHandlerActivity.e0;
                                    if (barVar10 != null) {
                                        xp1.bar barVar11 = (xp1.bar) barVar10.get();
                                        barVar11.getClass();
                                        fg3.h0.J(fg3.f1.a, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uz.e(barVar11, (df3.bar) null, 29), 3);
                                        intent2 = intent;
                                        str = "succeed";
                                        break;
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("governmentServices");
                                        throw null;
                                    }
                                }
                                break;
                            case -713740876:
                                if (host.equals("sdk_manage_auth_apps")) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkHandlerActivity, "context");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("conversation", "contextId");
                                    android.content.Intent intent6 = new android.content.Intent((android.content.Context) deepLinkHandlerActivity, (java.lang.Class<?>) com.truecaller.ui.settings.privacy.authorizedApps.ManageAuthorizedAppsActivity.class);
                                    intent6.putExtra("context", "conversation");
                                    deepLinkHandlerActivity.startActivity(intent6);
                                    intent2 = intent;
                                    str = "succeed";
                                    break;
                                }
                                break;
                            case -38832335:
                                if (host.equals("missed_calls")) {
                                    qc3.bar barVar12 = deepLinkHandlerActivity.u0;
                                    if (barVar12 != null) {
                                        g73.bar barVar13 = (g73.bar) barVar12.get();
                                        barVar13.getClass();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkHandlerActivity, "context");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                                        java.io.Serializable serializable3 = com.truecaller.common_call_log.data.FilterType.MISSED;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkHandlerActivity, "context");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializable3, "filterType");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("widget", "analyticsContext");
                                        android.content.Intent intent7 = new android.content.Intent((android.content.Context) deepLinkHandlerActivity, (java.lang.Class<?>) com.truecaller.dialer.ui.DialerActivity.class);
                                        intent7.putExtra("ARGUMENT_PHONE_NUMBER", (java.lang.String) null);
                                        intent7.putExtra("ARGUMENT_FILTER_TYPE", serializable3);
                                        intent7.putExtra("ARGUMENT_ANALYTICS_CONTEXT", "widget");
                                        barVar13.a(deepLinkHandlerActivity, intent7);
                                        intent2 = intent;
                                        str = "succeed";
                                        break;
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("widgetHelper");
                                        throw null;
                                    }
                                }
                                break;
                            case 604727084:
                                if (host.equals("interstitial")) {
                                    android.os.Bundle bundle = new android.os.Bundle();
                                    for (java.lang.String str2 : data.getQueryParameterNames()) {
                                        bundle.putString(str2, data.getQueryParameter(str2));
                                    }
                                    qc3.bar barVar14 = deepLinkHandlerActivity.d0;
                                    if (barVar14 != null) {
                                        ((m92.d) barVar14.get()).a(bundle);
                                        qc3.bar barVar15 = deepLinkHandlerActivity.k0;
                                        if (barVar15 != null) {
                                            i82.bar barVar16 = (i82.bar) barVar15.get();
                                            x91.d dVar = new x91.d(0, deepLinkHandlerActivity, data);
                                            barVar16.getClass();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "params");
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "conditionsNotMeetInvocation");
                                            java.lang.String string = bundle.getString("n");
                                            if (string == null || (g0 = kotlin.text.StringsKt.g0(string, new java.lang.String[]{","}, 0, 6)) == null || (b = kotlin.collections.CollectionsKt.K0(g0)) == null) {
                                                b = kotlin.collections.y0.b("ALL");
                                            }
                                            if (m92.b.a(barVar16.a, b, barVar16.b)) {
                                                java.lang.String string2 = bundle.getString("t");
                                                com.truecaller.premium.PremiumLaunchContext.Static r4 = i82.r.A7;
                                                if (string2 != null && !kotlin.text.StringsKt.X(string2)) {
                                                    com.truecaller.premium.PremiumLaunchContext.Static.Companion.getClass();
                                                    java.util.Iterator it = com.truecaller.premium.PremiumLaunchContext.Static.getEntries().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            java.lang.Object next = it.next();
                                                            if (kotlin.text.y.p(((com.truecaller.premium.PremiumLaunchContext.Static) next).name(), string2, true)) {
                                                                obj = next;
                                                            }
                                                        } else {
                                                            obj = null;
                                                        }
                                                    }
                                                    i82.r rVar2 = (com.truecaller.premium.PremiumLaunchContext.Static) obj;
                                                    if (rVar2 == null) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string2, "name");
                                                        rVar2 = new i82.p(string2);
                                                    }
                                                    rVar = rVar2;
                                                } else {
                                                    rVar = null;
                                                }
                                                if (rVar != null && qb2.u.b(barVar16.c, rVar, true, null, bundle.getString("c"), dVar, 8) == null) {
                                                    dVar.invoke();
                                                }
                                            }
                                            intent2 = intent;
                                            str = "succeed";
                                            break;
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("deeplinkInterstitialHelper");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("mPremiumTabDeeplinkHelper");
                                        throw null;
                                    }
                                }
                                break;
                            case 684190884:
                                if (host.equals("midtruesdk")) {
                                    java.lang.String queryParameter3 = data.getQueryParameter("type");
                                    if (!jj3.bar.i(queryParameter3) && kotlin.jvm.internal.Intrinsics.b(queryParameter3, "onestep_btmsheet")) {
                                        qc3.bar barVar17 = deepLinkHandlerActivity.f0;
                                        if (barVar17 != null) {
                                            if (((qo1.q) barVar17.get()).a.a("featureSdkOneStepMidVerification", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                                android.content.Intent intent8 = new android.content.Intent((android.content.Context) deepLinkHandlerActivity, (java.lang.Class<?>) com.truecaller.sdk.oneStepMid.OneStepMidVerifyActivity.class);
                                                intent8.putExtra("requestNonce", data.getQueryParameter("requestNonce"));
                                                intent8.putExtra("partnerKey", data.getQueryParameter("partnerKey"));
                                                deepLinkHandlerActivity.startActivity(intent8);
                                            }
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("sdkFeaturesInventory");
                                            throw null;
                                        }
                                    }
                                    intent2 = intent;
                                    str = "succeed";
                                    break;
                                }
                                break;
                            case 954925063:
                                if (host.equals("message")) {
                                    java.lang.String queryParameter4 = data.getQueryParameter("recipient");
                                    java.lang.String queryParameter5 = data.getQueryParameter("text");
                                    android.content.Intent intent9 = new android.content.Intent((android.content.Context) deepLinkHandlerActivity, (java.lang.Class<?>) com.truecaller.messaging.sharing.SharingActivity.class);
                                    intent9.setAction("android.intent.action.SENDTO");
                                    if (jj3.bar.k(queryParameter4)) {
                                        intent9.setData(android.net.Uri.parse("smsto:" + queryParameter4));
                                    }
                                    if (queryParameter5 != null) {
                                        intent9.putExtra("android.intent.extra.TEXT", queryParameter5);
                                    }
                                    deepLinkHandlerActivity.startActivity(intent9);
                                    intent2 = intent;
                                    str = "succeed";
                                    break;
                                }
                                break;
                            case 1465777723:
                                if (host.equals("invite_from_fb")) {
                                    qc3.bar barVar18 = deepLinkHandlerActivity.s0;
                                    if (barVar18 != null) {
                                        ((com.truecaller.ui.b0) barVar18.get()).f(deepLinkHandlerActivity, com.truecaller.bottombar.BottomBarButtonType.CALLS, "deepLinkFB");
                                        intent2 = intent;
                                        str = "succeed";
                                        break;
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("homescreenRouter");
                                        throw null;
                                    }
                                }
                                break;
                            case 1530307676:
                                if (host.equals("campaignInterstitial")) {
                                    java.lang.String queryParameter6 = data.getQueryParameter("c");
                                    android.os.Bundle bundle2 = new android.os.Bundle();
                                    for (java.lang.String str3 : data.getQueryParameterNames()) {
                                        bundle2.putString(str3, data.getQueryParameter(str3));
                                    }
                                    qc3.bar barVar19 = deepLinkHandlerActivity.s0;
                                    if (barVar19 != null) {
                                        com.truecaller.ui.b0 b0Var = (com.truecaller.ui.b0) barVar19.get();
                                        qc3.bar barVar20 = deepLinkHandlerActivity.m0;
                                        if (barVar20 != null) {
                                            android.content.Intent c = b0Var.c(deepLinkHandlerActivity, ((jq2.qux) barVar20.get()).o0().toBottomBarButtonType(), "deepLink", (com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs) null);
                                            qc3.bar barVar21 = deepLinkHandlerActivity.d0;
                                            if (barVar21 != null) {
                                                ((m92.d) barVar21.get()).a(bundle2);
                                                qc3.bar barVar22 = deepLinkHandlerActivity.j0;
                                                if (barVar22 != null) {
                                                    m92.baz bazVar2 = (m92.baz) barVar22.get();
                                                    bazVar2.getClass();
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle2, "params");
                                                    java.lang.String string3 = bundle2.getString("n");
                                                    if (string3 == null || (g03 = kotlin.text.StringsKt.g0(string3, new java.lang.String[]{","}, 0, 6)) == null || (b2 = kotlin.collections.CollectionsKt.K0(g03)) == null) {
                                                        b2 = kotlin.collections.y0.b("ALL");
                                                    }
                                                    if (m92.b.a(bazVar2.a, b2, bazVar2.b)) {
                                                        qc3.bar barVar23 = deepLinkHandlerActivity.l0;
                                                        if (barVar23 != null) {
                                                            qb2.t tVar = ((qb2.u) barVar23.get()).p;
                                                            tVar.getClass();
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "activityIntent");
                                                            android.content.Context context = tVar.a;
                                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                                            arrayList2.add(c);
                                                            i82.t tVar2 = tVar.f;
                                                            android.content.Context context2 = tVar.a;
                                                            qb2.h hVar = tVar.b;
                                                            arrayList2.add(h8.s0.c(tVar2, context2, hVar.b, new com.truecaller.premium.data.SubscriptionPromoEventMetaData(queryParameter6), (com.truecaller.premium.data.feature.PremiumFeature) null, hVar.h, hVar.i, 8).addFlags(268435456));
                                                            if (!arrayList2.isEmpty()) {
                                                                android.content.Intent[] intentArr2 = (android.content.Intent[]) arrayList2.toArray(new android.content.Intent[0]);
                                                                intentArr2[0] = new android.content.Intent(intentArr2[0]).addFlags(268484608);
                                                                context.startActivities(intentArr2, null);
                                                            } else {
                                                                throw new java.lang.IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                                                            }
                                                        } else {
                                                            kotlin.jvm.internal.Intrinsics.n("interstitialNavControllerRegistry");
                                                            throw null;
                                                        }
                                                    } else {
                                                        deepLinkHandlerActivity.startActivity(c);
                                                    }
                                                    intent2 = intent;
                                                    str = "succeed";
                                                    break;
                                                } else {
                                                    kotlin.jvm.internal.Intrinsics.n("deeplinkInterstitialCampaignHelper");
                                                    throw null;
                                                }
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("mPremiumTabDeeplinkHelper");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("generalSettings");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("homescreenRouter");
                                        throw null;
                                    }
                                }
                                break;
                            case 1655025443:
                                if (host.equals("dialpad")) {
                                    qc3.bar barVar24 = deepLinkHandlerActivity.u0;
                                    if (barVar24 != null) {
                                        g73.bar barVar25 = (g73.bar) barVar24.get();
                                        barVar25.getClass();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkHandlerActivity, "context");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                                        java.io.Serializable serializable4 = com.truecaller.common_call_log.data.FilterType.NONE;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkHandlerActivity, "context");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializable4, "filterType");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("widget", "analyticsContext");
                                        android.content.Intent intent10 = new android.content.Intent((android.content.Context) deepLinkHandlerActivity, (java.lang.Class<?>) com.truecaller.dialer.ui.DialerActivity.class);
                                        intent10.putExtra("ARGUMENT_PHONE_NUMBER", (java.lang.String) null);
                                        intent10.putExtra("ARGUMENT_FILTER_TYPE", serializable4);
                                        intent10.putExtra("ARGUMENT_ANALYTICS_CONTEXT", "widget");
                                        barVar25.a(deepLinkHandlerActivity, intent10);
                                        intent2 = intent;
                                        str = "succeed";
                                        break;
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("widgetHelper");
                                        throw null;
                                    }
                                }
                                break;
                        }
                    }
                } else {
                    intent2 = intent;
                    str = "succeed";
                }
                deepLinkHandlerActivity.u0(intent2, str);
                deepLinkHandlerActivity.finish();
                return;
            }
            deepLinkHandlerActivity.u0(intent, "failed");
            deepLinkHandlerActivity.finish();
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("deepLinkDelegate");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.deeplink.Hilt_DeepLinkHandlerActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        t0(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        t0(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [qx2.u4, java.lang.Object, ci3.m] */
    public final void t0(android.content.Intent intent) {
        qx2.lh lhVar;
        com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2;
        qc3.bar barVar = this.p0;
        if (barVar != null) {
            ((com.truecaller.clevertap.CleverTapManager) barVar.get()).mayBeProcessNotificationExtras(intent);
            android.net.Uri data = getIntent().getData();
            if (data != null) {
                qc3.bar barVar2 = this.h0;
                if (barVar2 != null) {
                    x91.m mVar = (x91.m) barVar2.get();
                    mVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "uri");
                    if (data.getQueryParameter("c") != null) {
                        nc0.a aVar = mVar.a;
                        bi3.y0 y0Var = qx2.u4.d;
                        hi3.a aVar2 = qx2.u4.e;
                        bi3.j0[] j0VarArr = (bi3.j0[]) y0Var.v().toArray(new bi3.j0[0]);
                        boolean[] zArr = new boolean[j0VarArr.length];
                        java.lang.CharSequence uri = data.toString();
                        hi3.e.d(j0VarArr[2], uri);
                        zArr[2] = true;
                        try {
                            ?? obj = new java.lang.Object();
                            if (zArr[0]) {
                                lhVar = null;
                            } else {
                                bi3.j0 j0Var = j0VarArr[0];
                                lhVar = (qx2.lh) aVar2.g(j0Var.f, aVar2.j(j0Var));
                            }
                            ((qx2.u4) obj).a = lhVar;
                            if (zArr[1]) {
                                clientHeaderV2 = null;
                            } else {
                                bi3.j0 j0Var2 = j0VarArr[1];
                                clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) aVar2.g(j0Var2.f, aVar2.j(j0Var2));
                            }
                            ((qx2.u4) obj).b = clientHeaderV2;
                            if (!zArr[2]) {
                                bi3.j0 j0Var3 = j0VarArr[2];
                                uri = (java.lang.CharSequence) aVar2.g(j0Var3.f, aVar2.j(j0Var3));
                            }
                            ((qx2.u4) obj).c = uri;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "build(...)");
                            aVar.c((ci3.m) obj);
                        } catch (bi3.bar e) {
                            throw e;
                        } catch (java.lang.Exception e2) {
                            throw new java.lang.RuntimeException(e2);
                        }
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.n("deeplinkAnalyticsHelper");
                    throw null;
                }
            }
            fg3.e0 e0Var = this.w0;
            if (e0Var != null) {
                fg3.h0.J(e0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uz.f(this, intent, (df3.bar) null, 26), 3);
                finish();
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("applicationScope");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("cleverTapManager");
        throw null;
    }

    public final void u0(android.content.Intent intent, java.lang.String str) {
        com.truecaller.messaging.data.types.QuickAction.DeepLink deepLink;
        android.os.Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey("keyQuickAction") && (deepLink = (com.truecaller.messaging.data.types.QuickAction.DeepLink) extras.getParcelable("keyQuickAction")) != null) {
            hi3.e eVar = new hi3.e(qx2.x7.f, qx2.x7.g);
            java.lang.String str2 = deepLink.d;
            bi3.j0[] j0VarArr = eVar.b;
            hi3.e.d(j0VarArr[2], str2);
            ((qx2.w7) eVar).e = str2;
            boolean[] zArr = eVar.c;
            zArr[2] = true;
            java.lang.String str3 = deepLink.g;
            hi3.e.d(j0VarArr[3], str3);
            ((qx2.w7) eVar).f = str3;
            zArr[3] = true;
            bi3.j0 j0Var = j0VarArr[4];
            ((qx2.w7) eVar).g = str;
            zArr[4] = true;
            qx2.x7 e = eVar.e();
            nc0.a aVar = this.n0;
            if (aVar != null) {
                aVar.c(e);
            } else {
                kotlin.jvm.internal.Intrinsics.n("analytics");
                throw null;
            }
        }
    }
}
