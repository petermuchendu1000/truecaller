package com.truecaller.ads.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class d implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;

    public final java.lang.Object invoke() {
        kotlin.p o;
        kotlin.p o2;
        kotlin.p pVar = null;
        switch (this.a) {
            case 0:
                oo1.f d = ((tx.w) r11.bar.a().b()).d();
                java.lang.String b = d.n0.n(d, oo1.f.i1[67]).b();
                if (b.length() <= 0) {
                    b = null;
                }
                if (b == null) {
                    return null;
                }
                try {
                    kotlin.o oVar = kotlin.q.b;
                    com.google.gson.Gson gson = new com.google.gson.Gson();
                    java.lang.reflect.Type type = new com.truecaller.ads.analytics.e().getType();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    java.lang.Object fromJson = gson.fromJson(b, type);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
                    o2 = (com.truecaller.ads.analytics.AdsEventStatusConfig) fromJson;
                } catch (java.lang.Throwable th) {
                    kotlin.o oVar2 = kotlin.q.b;
                    o2 = od.p.o(th);
                }
                if (!(o2 instanceof kotlin.p)) {
                    pVar = o2;
                }
                return (com.truecaller.ads.analytics.AdsEventStatusConfig) pVar;
            case 1:
                return ((wj2.bar) ((tx.w) wi0.bar.o()).N9.get()).a.d("adErrorMessageConfig_51538", "");
            case 2:
                try {
                    kotlin.o oVar3 = kotlin.q.b;
                    java.lang.String str = (java.lang.String) com.truecaller.ads.analytics.b.a.getValue();
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        com.google.gson.Gson gson2 = new com.google.gson.Gson();
                        java.lang.reflect.Type type2 = new com.truecaller.ads.analytics.a().getType();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                        java.lang.Object fromJson2 = gson2.fromJson(str, type2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson2, "fromJson(...)");
                        o = (java.util.List) fromJson2;
                    } else {
                        o = null;
                    }
                } catch (java.lang.Throwable th2) {
                    kotlin.o oVar4 = kotlin.q.b;
                    o = od.p.o(th2);
                }
                if (!(o instanceof kotlin.p)) {
                    pVar = o;
                }
                return (java.util.List) pVar;
            default:
                return java.lang.Boolean.valueOf(((tx.w) wi0.bar.o()).o().b.a("featureLogRequestAdTypeInEvent", com.truecaller.featuretoggles.FeatureState.DISABLED));
        }
    }
}
