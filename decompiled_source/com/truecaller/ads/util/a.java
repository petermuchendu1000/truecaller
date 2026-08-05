package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc3.bar b;

    public /* synthetic */ a(qc3.bar barVar, int i) {
        this.a = i;
        this.b = barVar;
    }

    public final java.lang.Object invoke() {
        java.util.List o;
        java.util.List o2;
        java.util.List o3;
        java.util.List o4;
        int i = this.a;
        java.util.List list = null;
        qc3.bar barVar = this.b;
        switch (i) {
            case 0:
                return java.lang.Boolean.valueOf(((qo1.bar) barVar.get()).b.a("featureRetryAdRequest", com.truecaller.featuretoggles.FeatureState.DISABLED));
            case 1:
                java.lang.String d = ((wj2.bar) barVar.get()).a.d("adAcsFallbackRequestConfig_55421", "");
                if (d.length() <= 0) {
                    d = null;
                }
                if (d == null) {
                    return null;
                }
                try {
                    kotlin.o oVar = kotlin.q.b;
                    com.google.gson.Gson gson = new com.google.gson.Gson();
                    java.lang.reflect.Type type = new com.truecaller.ads.util.b().getType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    java.lang.Object fromJson = gson.fromJson(d, type);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
                    o = (java.util.List) fromJson;
                } catch (java.lang.Throwable th) {
                    kotlin.o oVar2 = kotlin.q.b;
                    o = od.p.o(th);
                }
                if (!(o instanceof kotlin.p)) {
                    list = o;
                }
                return list;
            case 2:
                java.lang.String d2 = ((wj2.bar) barVar.get()).a.d("adClickRestrictionOverlayConfig_67602", "");
                if (d2.length() <= 0) {
                    d2 = null;
                }
                if (d2 == null) {
                    return null;
                }
                try {
                    kotlin.o oVar3 = kotlin.q.b;
                    com.google.gson.Gson gson2 = new com.google.gson.Gson();
                    java.lang.reflect.Type type2 = new com.truecaller.ads.util.h().getType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    java.lang.Object fromJson2 = gson2.fromJson(d2, type2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson2, "fromJson(...)");
                    o2 = (java.util.List) fromJson2;
                } catch (java.lang.Throwable th2) {
                    kotlin.o oVar4 = kotlin.q.b;
                    o2 = od.p.o(th2);
                }
                if (!(o2 instanceof kotlin.p)) {
                    list = o2;
                }
                return list;
            case 3:
                java.lang.String d3 = ((wj2.bar) barVar.get()).a.d("adRequestEventRestrictionConfig_60074", "");
                if (d3.length() <= 0) {
                    d3 = null;
                }
                if (d3 == null) {
                    return null;
                }
                try {
                    kotlin.o oVar5 = kotlin.q.b;
                    com.google.gson.Gson gson3 = new com.google.gson.Gson();
                    java.lang.reflect.Type type3 = new com.truecaller.ads.util.q().getType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                    java.lang.Object fromJson3 = gson3.fromJson(d3, type3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson3, "fromJson(...)");
                    o3 = (java.util.List) fromJson3;
                } catch (java.lang.Throwable th3) {
                    kotlin.o oVar6 = kotlin.q.b;
                    o3 = od.p.o(th3);
                }
                if (!(o3 instanceof kotlin.p)) {
                    list = o3;
                }
                return list;
            case 4:
                return java.lang.Boolean.valueOf(((qo1.d) barVar.get()).b.a("featureCrossDomainPresence", com.truecaller.featuretoggles.FeatureState.DISABLED));
            case 5:
                java.lang.Object obj = barVar.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return (zf1.qux) obj;
            case 6:
                java.lang.Object obj2 = barVar.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                return (zf1.qux) obj2;
            case 7:
                return (nc0.bar) barVar.get();
            case 8:
                return java.lang.Boolean.valueOf(((qo1.m) barVar.get()).a.a("featureInternalPerformanceMonitoring_59043", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG));
            case 9:
                return (nc0.bar) barVar.get();
            case 10:
                return (nc0.bar) barVar.get();
            case 11:
                return (nc0.bar) barVar.get();
            case 12:
                return (nc0.bar) barVar.get();
            case 13:
                return (nc0.bar) barVar.get();
            case 14:
                return (nc0.bar) barVar.get();
            case 15:
                return (n33.bar) barVar.get();
            case 16:
                return java.lang.Boolean.valueOf(((qo1.bar) barVar.get()).b.a("featureMultiAd", com.truecaller.featuretoggles.FeatureState.DISABLED));
            case 17:
                return java.lang.Boolean.valueOf(((qo1.bar) barVar.get()).b.a("featureMultiAdOnDvBottom", com.truecaller.featuretoggles.FeatureState.DISABLED));
            case 18:
                return java.lang.Boolean.valueOf(((qo1.bar) barVar.get()).b.a("featureMultiAdOnAcs", com.truecaller.featuretoggles.FeatureState.DISABLED));
            case 19:
                return java.lang.Boolean.valueOf(((qo1.bar) barVar.get()).b.a("featureMultiAdOnClp", com.truecaller.featuretoggles.FeatureState.DISABLED));
            case 20:
                java.lang.String d4 = ((wj2.bar) barVar.get()).a.d("multiAdRemoteConfig_62722", "");
                if (d4.length() <= 0) {
                    d4 = null;
                }
                if (d4 == null) {
                    return null;
                }
                try {
                    kotlin.o oVar7 = kotlin.q.b;
                    com.google.gson.Gson gson4 = new com.google.gson.Gson();
                    java.lang.reflect.Type type4 = new s80.bar().getType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                    java.lang.Object fromJson4 = gson4.fromJson(d4, type4);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson4, "fromJson(...)");
                    o4 = (java.util.List) fromJson4;
                } catch (java.lang.Throwable th4) {
                    kotlin.o oVar8 = kotlin.q.b;
                    o4 = od.p.o(th4);
                }
                if (!(o4 instanceof kotlin.p)) {
                    list = o4;
                }
                return list;
            case 21:
                return ((ix1.b) barVar.get()).b();
            case 22:
                return java.lang.Boolean.valueOf(((qo1.m) barVar.get()).c.a("CROSS_DOMAIN_HTTP1", com.truecaller.featuretoggles.FeatureState.ENABLED));
            default:
                return (nc0.bar) barVar.get();
        }
    }
}
