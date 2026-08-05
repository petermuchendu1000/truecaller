package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class b1 {
    public final qc3.bar a;
    public final qc3.bar b;
    public final qc3.bar c;
    public final qc3.bar d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;

    public b1(qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3, qc3.bar barVar4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "adsConfigsInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "adsFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "buildHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "devicePerformanceUtil");
        this.a = barVar;
        this.b = barVar2;
        this.c = barVar3;
        this.d = barVar4;
        final int i = 0;
        this.e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.ads.util.z0
            public final /* synthetic */ com.truecaller.ads.util.b1 b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.truecaller.ads.util.GamSdkInitConfig o;
                int i2 = i;
                com.truecaller.ads.util.b1 b1Var = this.b;
                switch (i2) {
                    case 0:
                        return java.lang.Boolean.valueOf(((qo1.bar) b1Var.b.get()).b.a("featureDisableGamMediationAdapterInit", com.truecaller.featuretoggles.FeatureState.DISABLED));
                    default:
                        java.lang.String d = ((wj2.bar) b1Var.a.get()).a.d("gamMediationAdapterInitConfig_55025", "");
                        com.truecaller.ads.util.GamSdkInitConfig gamSdkInitConfig = null;
                        if (kotlin.text.StringsKt.X(d)) {
                            d = null;
                        }
                        if (d == null) {
                            return null;
                        }
                        try {
                            kotlin.o oVar = kotlin.q.b;
                            com.google.gson.Gson gson = new com.google.gson.Gson();
                            java.lang.reflect.Type type = new com.truecaller.ads.util.a1().getType();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                            java.lang.Object fromJson = gson.fromJson(d, type);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
                            o = (com.truecaller.ads.util.GamSdkInitConfig) fromJson;
                        } catch (java.lang.Throwable th) {
                            kotlin.o oVar2 = kotlin.q.b;
                            o = od.p.o(th);
                        }
                        if (!(o instanceof kotlin.p)) {
                            gamSdkInitConfig = o;
                        }
                        return gamSdkInitConfig;
                }
            }
        });
        final int i2 = 1;
        this.f = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.ads.util.z0
            public final /* synthetic */ com.truecaller.ads.util.b1 b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.truecaller.ads.util.GamSdkInitConfig o;
                int i22 = i2;
                com.truecaller.ads.util.b1 b1Var = this.b;
                switch (i22) {
                    case 0:
                        return java.lang.Boolean.valueOf(((qo1.bar) b1Var.b.get()).b.a("featureDisableGamMediationAdapterInit", com.truecaller.featuretoggles.FeatureState.DISABLED));
                    default:
                        java.lang.String d = ((wj2.bar) b1Var.a.get()).a.d("gamMediationAdapterInitConfig_55025", "");
                        com.truecaller.ads.util.GamSdkInitConfig gamSdkInitConfig = null;
                        if (kotlin.text.StringsKt.X(d)) {
                            d = null;
                        }
                        if (d == null) {
                            return null;
                        }
                        try {
                            kotlin.o oVar = kotlin.q.b;
                            com.google.gson.Gson gson = new com.google.gson.Gson();
                            java.lang.reflect.Type type = new com.truecaller.ads.util.a1().getType();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                            java.lang.Object fromJson = gson.fromJson(d, type);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
                            o = (com.truecaller.ads.util.GamSdkInitConfig) fromJson;
                        } catch (java.lang.Throwable th) {
                            kotlin.o oVar2 = kotlin.q.b;
                            o = od.p.o(th);
                        }
                        if (!(o instanceof kotlin.p)) {
                            gamSdkInitConfig = o;
                        }
                        return gamSdkInitConfig;
                }
            }
        });
    }
}
