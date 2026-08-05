package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class y0 {
    public static final kotlin.Lazy a = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a(27));
    public static final kotlin.Lazy b = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a(28));
    public static final kotlin.Lazy c = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a(29));
    public static final kotlin.Lazy d = kotlin.LazyKt.lazy(new com.truecaller.ads.util.u0(0));
    public static final kotlin.Lazy e = kotlin.LazyKt.lazy(new com.truecaller.ads.util.u0(1));
    public static final kotlin.Lazy f = kotlin.LazyKt.lazy(new com.truecaller.ads.util.u0(2));
    public static final kotlin.Lazy g = kotlin.LazyKt.lazy(new com.truecaller.ads.util.u0(3));
    public static final kotlin.Lazy h = kotlin.LazyKt.lazy(new com.truecaller.ads.util.u0(4));
    public static final kotlin.Lazy i = kotlin.LazyKt.lazy(new com.truecaller.ads.util.u0(5));

    public static final void A(int i2, android.view.View view) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        if (i2 != 0) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                if (view.getTag(2131366783) == null) {
                    view.setTag(2131366783, java.lang.Integer.valueOf(marginLayoutParams.bottomMargin));
                }
                marginLayoutParams.bottomMargin = i2;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static final boolean B(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        if (!kotlin.jvm.internal.Intrinsics.b(str, "AFTERCALL") && !kotlin.jvm.internal.Intrinsics.b(str, "AFTERCALL_TOP") && !kotlin.jvm.internal.Intrinsics.b(str, "AFTERCALL_SEQ") && !kotlin.jvm.internal.Intrinsics.b(str, "DETAILS") && !kotlin.jvm.internal.Intrinsics.b(str, "DETAILSVIEW") && !kotlin.jvm.internal.Intrinsics.b(str, "DETAILS_BOTTOM") && !kotlin.jvm.internal.Intrinsics.b(str, "MESSAGE_ID") && !kotlin.jvm.internal.Intrinsics.b(str, "CALLER_ID") && !kotlin.jvm.internal.Intrinsics.b(str, "CALL_LOG_PROMO") && !kotlin.jvm.internal.Intrinsics.b(str, bf0.s2.a0("AFTERCALL")) && !kotlin.jvm.internal.Intrinsics.b(str, bf0.s2.a0("AFTERCALL_TOP")) && !kotlin.jvm.internal.Intrinsics.b(str, bf0.s2.a0("AFTERCALL_SEQ")) && !kotlin.jvm.internal.Intrinsics.b(str, bf0.s2.a0("DETAILS")) && !kotlin.jvm.internal.Intrinsics.b(str, bf0.s2.a0("DETAILSVIEW")) && !kotlin.jvm.internal.Intrinsics.b(str, bf0.s2.a0("DETAILS_BOTTOM")) && !kotlin.jvm.internal.Intrinsics.b(str, bf0.s2.a0("MESSAGE_ID")) && !kotlin.jvm.internal.Intrinsics.b(str, bf0.s2.a0("CALLER_ID")) && !kotlin.jvm.internal.Intrinsics.b(str, bf0.s2.a0("CALL_LOG_PROMO"))) {
            return false;
        }
        return true;
    }

    public static final android.widget.TextView a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextSize(2, 8.0f);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388693;
        textView.setLayoutParams(layoutParams);
        textView.setTextColor(bi3.a.s(context, 2130970936));
        ge0.i.R(textView, 1.2f);
        return textView;
    }

    public static final void b(android.widget.TextView textView, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "textView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        textView.setText(str);
        int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        android.text.TextPaint paint = textView.getPaint();
        float f2 = 20.0f;
        paint.setTextSize(20.0f);
        while (f2 > 12.0f && paint.measureText(str) > width) {
            f2 -= 1.0f;
            paint.setTextSize(f2);
        }
        textView.setTextSize(f2 - 2.0f);
    }

    public static final void c(android.widget.TextView textView, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "<this>");
        java.lang.String i2 = i(str);
        if (i2 == null) {
            i2 = "Ad";
        }
        textView.setText(i2);
    }

    public static final com.truecaller.ads.analytics.c d(u90.baz bazVar) {
        u90.bar barVar;
        com.google.android.gms.ads.AdSize adSize;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "<this>");
        if (bazVar instanceof u90.bar) {
            barVar = (u90.bar) bazVar;
        } else {
            barVar = null;
        }
        if (barVar == null || (adSize = ((com.google.android.gms.ads.admanager.AdManagerAdView) barVar.a).getAdSize()) == null) {
            return null;
        }
        return new com.truecaller.ads.analytics.c(adSize.getWidth(), adSize.getHeight());
    }

    public static final java.lang.String e(com.google.android.gms.ads.LoadAdError loadAdError) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadAdError, "<this>");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("code", loadAdError.getCode());
        jSONObject2.put(com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, loadAdError.getMessage());
        jSONObject2.put("cause", loadAdError.getCause());
        jSONObject2.put("domain", loadAdError.getDomain());
        com.google.android.gms.ads.ResponseInfo responseInfo = loadAdError.getResponseInfo();
        if (responseInfo != null) {
            jSONObject = x(responseInfo);
        } else {
            jSONObject = null;
        }
        jSONObject2.put("responseInfo", jSONObject);
        java.lang.String jSONObject3 = jSONObject2.toString(2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    public static final int f(int i2, int i3, int i4) {
        float d2;
        if (i2 <= 0) {
            d2 = 0.0f;
        } else {
            d2 = uf3.p.d(i2, 1, 50) / 100.0f;
        }
        if (d2 == 0.0f || i3 <= 0 || i4 <= 0) {
            return 0;
        }
        float f2 = i3;
        int i5 = (int) (d2 * f2);
        if (i5 > f2 - (i4 * 1.2f)) {
            return 0;
        }
        return i5;
    }

    public static final java.lang.String g(int i2, java.lang.String str) {
        boolean a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        if (!k(str) && !n(str) && !m(str)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            com.truecaller.ads.api.model.ad.AdPlacement v = v(str);
            if (v != null) {
                a2 = v.equals(com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.DvBottom.b);
            } else {
                a2 = ((kotlin.text.Regex) i.getValue()).a(str);
            }
            if (!a2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
                if (!((kotlin.text.Regex) e.getValue()).a(str) && !o(str)) {
                    return "-1";
                }
                return java.lang.String.valueOf(i2);
            }
        }
        if (i2 >= 0) {
            return java.lang.String.valueOf(i2 + 1);
        }
        return java.lang.String.valueOf(i2);
    }

    public static final java.lang.String h(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "adPlacement");
        switch (str.hashCode()) {
            case -2019262942:
                str.equals("DETAILS");
                return "detailsView";
            case 241844968:
                if (str.equals("DETAILS_BOTTOM")) {
                    return "detailsViewBottom";
                }
                return "detailsView";
            case 403802954:
                if (str.equals("DETAILS_HEADER")) {
                    return "detailsViewHeader";
                }
                return "detailsView";
            case 2041361171:
                if (str.equals("DETAILS_OVERLAY")) {
                    return "detailsViewOverlay";
                }
                return "detailsView";
            default:
                return "detailsView";
        }
    }

    public static final java.lang.String i(java.lang.String str) {
        java.lang.String a2;
        if (str != null && (a2 = com.truecaller.ads.util.p.a(str)) != null) {
            return bar.t("Ad(", a2, ")");
        }
        return null;
    }

    public static final java.lang.String j(u90.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bVar instanceof u90.d) {
            u90.d dVar = (u90.d) bVar;
            java.lang.String string = dVar.u().getExtras().getString("partnerName");
            if (string == null) {
                com.google.android.gms.ads.ResponseInfo responseInfo = dVar.u().getResponseInfo();
                if (responseInfo != null) {
                    return responseInfo.getMediationAdapterClassName();
                }
            } else {
                return string;
            }
        } else if (bVar instanceof u90.bar) {
            java.lang.Object obj = ((u90.bar) bVar).a;
            vf3.i a2 = vf3.k.a((ff3.f) vf3.k.b(new u6.y0((android.view.View) obj, (df3.bar) null)).b);
            java.lang.String str = null;
            while (a2.hasNext()) {
                java.lang.Object tag = ((android.view.View) a2.next()).getTag(2131366789);
                if (tag != null) {
                    str = tag.toString();
                }
            }
            if (str == null) {
                com.google.android.gms.ads.ResponseInfo responseInfo2 = ((com.google.android.gms.ads.admanager.AdManagerAdView) obj).getResponseInfo();
                if (responseInfo2 != null) {
                    return responseInfo2.getMediationAdapterClassName();
                }
            } else {
                return str;
            }
        } else {
            if (bVar instanceof u90.qux) {
                return "com.google.ads.mediation.admob.AdMobAdapter";
            }
            if (bVar instanceof h10.b) {
                java.lang.String str2 = ((h10.i) ((h10.b) bVar)).c;
                uf.qux.r("TasExclusiveAdRequestFlow: partner name is ", str2, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                kotlin.Unit unit = kotlin.Unit.a;
                return str2;
            }
        }
        return null;
    }

    public static final boolean k(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        com.truecaller.ads.api.model.ad.AdPlacement v = v(str);
        if (v != null) {
            return v.equals(com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.Pacs.b);
        }
        return ((kotlin.text.Regex) b.getValue()).a(str);
    }

    public static final boolean l(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        if (!str.equals("AFTERCALL") && !str.equals("AFTERCALL_SEQ") && !str.equals(bf0.s2.a0("AFTERCALL")) && !str.equals(bf0.s2.a0("AFTERCALL_SEQ"))) {
            com.truecaller.ads.api.model.ad.AdPlacement v = v(str);
            if (v != null) {
                return v.equals(com.truecaller.ads.api.model.ad.AdPlacement.PacsScreen.Pacs.b);
            }
            return false;
        }
        return true;
    }

    public static final boolean m(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return ((kotlin.text.Regex) d.getValue()).a(str);
    }

    public static final boolean n(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        com.truecaller.ads.api.model.ad.AdPlacement v = v(str);
        if (v != null) {
            return v.equals(com.truecaller.ads.api.model.ad.AdPlacement.DvScreen.Dv.b);
        }
        return ((kotlin.text.Regex) c.getValue()).a(str);
    }

    public static final boolean o(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return ((kotlin.text.Regex) h.getValue()).a(str);
    }

    public static final boolean p(h10.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (kotlin.text.y.p(((h10.i) bVar).c, "Truecaller", true) || kotlin.text.y.p(((h10.i) bVar).c, "TcAdServer", true)) {
            return true;
        }
        return false;
    }

    public static final boolean q(com.truecaller.ads.adsrouter.model.ClickGuard clickGuard, android.view.MotionEvent motionEvent, android.widget.FrameLayout frameLayout) {
        java.lang.Throwable a2;
        java.lang.RuntimeException runtimeException;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameLayout, "view");
        try {
            kotlin.o oVar = kotlin.q.b;
            if (motionEvent.getAction() == 0 && clickGuard != null) {
                int row = clickGuard.getRow();
                int column = clickGuard.getColumn();
                if (row > 0 && column > 0) {
                    float width = frameLayout.getWidth() / column;
                    int x = (int) (motionEvent.getX() / width);
                    int y = (int) (motionEvent.getY() / (frameLayout.getHeight() / row));
                    if (x >= 0 && x < column && y >= 0 && y < row) {
                        int i2 = (y * column) + x;
                        if (!clickGuard.getUnsafeCells().isEmpty()) {
                            if (clickGuard.getUnsafeCells().contains(java.lang.Integer.valueOf(i2))) {
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } finally {
            if (a2 != null) {
            }
        }
    }

    public static final java.lang.String r(com.google.android.gms.ads.nativead.NativeAd nativeAd) {
        android.net.Uri uri;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAd, "<this>");
        kotlin.Pair pair = new kotlin.Pair("headline", nativeAd.getHeadline());
        com.google.android.gms.ads.nativead.NativeAd.Image icon = nativeAd.getIcon();
        org.json.JSONObject jSONObject = null;
        if (icon != null) {
            uri = icon.getUri();
        } else {
            uri = null;
        }
        kotlin.Pair pair2 = new kotlin.Pair("icon", uri);
        kotlin.Pair pair3 = new kotlin.Pair("cta", nativeAd.getCallToAction());
        kotlin.Pair pair4 = new kotlin.Pair("advertiser", nativeAd.getAdvertiser());
        com.google.android.gms.ads.ResponseInfo responseInfo = nativeAd.getResponseInfo();
        if (responseInfo != null) {
            str = responseInfo.getMediationAdapterClassName();
        } else {
            str = null;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject(kotlin.collections.r0.j(new kotlin.Pair[]{pair, pair2, pair3, pair4, new kotlin.Pair("adapter", str)}));
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List images = nativeAd.getImages();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(images, "getImages(...)");
        java.util.Iterator it = images.iterator();
        while (it.hasNext()) {
            jSONArray.put(((com.google.android.gms.ads.nativead.NativeAd.Image) it.next()).getUri());
        }
        jSONObject2.put("images", jSONArray);
        com.google.android.gms.ads.ResponseInfo responseInfo2 = nativeAd.getResponseInfo();
        if (responseInfo2 != null) {
            jSONObject = x(responseInfo2);
        }
        jSONObject2.put("responseInfo", jSONObject);
        java.lang.String jSONObject3 = jSONObject2.toString(2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    public static final void s(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
        android.view.ContextThemeWrapper v = yy.qux.v(context, true);
        v.f fVar = new v.f();
        fVar.e();
        if (str != null) {
            i2 = android.graphics.Color.parseColor(str);
        } else {
            i2 = 2130970619;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", i2 | (-16777216));
        fVar.d = bundle2;
        v.g a2 = fVar.a();
        android.content.Intent intent = a2.a;
        intent.putExtra("android.intent.extra.REFERRER", android.net.Uri.parse("2" + v.getPackageName()));
        intent.addFlags(268435456);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "apply(...)");
        try {
            a2.a(v, android.net.Uri.parse(str2));
        } catch (java.lang.Throwable th) {
            t41.p.m(context, bundle, str2);
            o82.a.C(th);
        }
    }

    public static final java.lang.Integer u(java.lang.String str) {
        java.lang.Integer o;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            kotlin.o oVar = kotlin.q.b;
            o = java.lang.Integer.valueOf(android.graphics.Color.parseColor(str));
        } catch (java.lang.Throwable th) {
            kotlin.o oVar2 = kotlin.q.b;
            o = od.p.o(th);
        }
        if (o instanceof kotlin.p) {
            o = null;
        }
        return o;
    }

    public static final com.truecaller.ads.api.model.ad.AdPlacement v(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        com.truecaller.ads.api.model.ad.AdPlacement.INSTANCE.getClass();
        com.truecaller.ads.api.model.ad.AdPlacement a2 = com.truecaller.ads.api.model.ad.AdPlacement.Companion.a(str);
        com.truecaller.ads.api.model.ad.AdPlacement.Unknown unknown = com.truecaller.ads.api.model.ad.AdPlacement.Unknown.a;
        if (kotlin.jvm.internal.Intrinsics.b(a2, unknown)) {
            a2 = null;
        }
        if (a2 != null) {
            return a2;
        }
        if (kotlin.text.y.w(str, "Test", false)) {
            java.lang.String substring = str.substring(4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            com.truecaller.ads.api.model.ad.AdPlacement a3 = com.truecaller.ads.api.model.ad.AdPlacement.Companion.a(substring);
            if (!kotlin.jvm.internal.Intrinsics.b(a3, unknown)) {
                return a3;
            }
        }
        return null;
    }

    public static final com.truecaller.ads.analytics.c w(java.lang.Integer num, java.lang.Integer num2) {
        int i2;
        if (num == null && num2 == null) {
            return null;
        }
        int i3 = 0;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        if (num2 != null) {
            i3 = num2.intValue();
        }
        return new com.truecaller.ads.analytics.c(i2, i3);
    }

    public static final org.json.JSONObject x(com.google.android.gms.ads.ResponseInfo responseInfo) {
        java.lang.String str;
        java.lang.Integer num;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseInfo, "<this>");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("responseId", responseInfo.getResponseId());
        com.google.android.gms.ads.AdapterResponseInfo loadedAdapterResponseInfo = responseInfo.getLoadedAdapterResponseInfo();
        if (loadedAdapterResponseInfo != null) {
            str = loadedAdapterResponseInfo.getAdapterClassName();
        } else {
            str = null;
        }
        jSONObject.put("adapter", str);
        jSONObject.put("mediationAdapterClassName", responseInfo.getMediationAdapterClassName());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List<com.google.android.gms.ads.AdapterResponseInfo> adapterResponses = responseInfo.getAdapterResponses();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapterResponses, "getAdapterResponses(...)");
        for (com.google.android.gms.ads.AdapterResponseInfo adapterResponseInfo : adapterResponses) {
            kotlin.Pair pair = new kotlin.Pair("adapter", adapterResponseInfo.getAdapterClassName());
            kotlin.Pair pair2 = new kotlin.Pair("latency", java.lang.Long.valueOf(adapterResponseInfo.getLatencyMillis()));
            com.google.android.gms.ads.AdError adError = adapterResponseInfo.getAdError();
            if (adError != null) {
                num = java.lang.Integer.valueOf(adError.getCode());
            } else {
                num = null;
            }
            kotlin.Pair pair3 = new kotlin.Pair("code", num);
            com.google.android.gms.ads.AdError adError2 = adapterResponseInfo.getAdError();
            if (adError2 != null) {
                str2 = adError2.getMessage();
            } else {
                str2 = null;
            }
            jSONArray.put(new org.json.JSONObject(kotlin.collections.r0.j(new kotlin.Pair[]{pair, pair2, pair3, new kotlin.Pair(com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, str2), new kotlin.Pair("adSourceId", adapterResponseInfo.getAdSourceId()), new kotlin.Pair("adSourceInstanceId", adapterResponseInfo.getAdSourceInstanceId()), new kotlin.Pair("adSourceName", adapterResponseInfo.getAdSourceName()), new kotlin.Pair("adSourceInstanceName", adapterResponseInfo.getAdSourceInstanceName()), new kotlin.Pair("credentials", y(adapterResponseInfo.getCredentials()))})));
            jSONObject.put("responseExtra", y(responseInfo.getResponseExtras()));
        }
        jSONObject.put("response", jSONArray);
        return jSONObject;
    }

    public static final org.json.JSONObject y(android.os.Bundle bundle) {
        java.util.Set<java.lang.String> keySet;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (java.lang.String str : keySet) {
                com.mbridge.msdk.config.component.common.express.operator.baz.w(linkedHashMap, str, bundle.get(str));
            }
        }
        return new org.json.JSONObject(linkedHashMap);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:18|19))(3:20|21|(1:23))|11|12|(1:16)(1:14)))|26|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        r5 = kotlin.q.b;
        r5 = od.p.o(r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object z(kotlin.jvm.functions.Function1 function1, ff3.qux quxVar) {
        com.truecaller.ads.util.x0 x0Var;
        java.lang.Object obj;
        int i2;
        if (quxVar instanceof com.truecaller.ads.util.x0) {
            com.truecaller.ads.util.x0 x0Var2 = (com.truecaller.ads.util.x0) quxVar;
            int i3 = x0Var2.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x0Var2.y = i3 - Integer.MIN_VALUE;
                x0Var = x0Var2;
                obj = x0Var.x;
                ef3.bar barVar = ef3.bar.a;
                i2 = x0Var.y;
                if (i2 == 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    kotlin.o oVar = kotlin.q.b;
                    x0Var.y = 1;
                    obj = function1.invoke(x0Var);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                kotlin.o oVar2 = kotlin.q.b;
                if (kotlin.q.a(obj) == null) {
                    return null;
                }
                return obj;
            }
        }
        x0Var = new ff3.qux(quxVar);
        obj = x0Var.x;
        ef3.bar barVar2 = ef3.bar.a;
        i2 = x0Var.y;
        if (i2 == 0) {
        }
        kotlin.o oVar22 = kotlin.q.b;
        if (kotlin.q.a(obj) == null) {
        }
    }
}
