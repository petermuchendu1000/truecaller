package com.truecaller.ads.acsrules.local;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class bar implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ bar(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final java.lang.Object invoke() {
        switch (this.a) {
            case 0:
                com.truecaller.ads.acsrules.local.baz bazVar = (com.truecaller.ads.acsrules.local.baz) this.b;
                oo1.f fVar = (oo1.f) bazVar.a.get();
                java.lang.String b = fVar.j0.n(fVar, oo1.f.i1[63]).b();
                if (kotlin.text.StringsKt.X(b)) {
                    b = null;
                }
                if (b == null) {
                    return null;
                }
                java.lang.Object obj = bazVar.b.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return (com.truecaller.ads.acsrules.local.AcsRulesFirebaseRemoteConfig) ((u03.q) obj).a(b, com.truecaller.ads.acsrules.local.AcsRulesFirebaseRemoteConfig.class);
            default:
                com.truecaller.ads.acsrules.local.b bVar = (com.truecaller.ads.acsrules.local.b) this.b;
                return e13.b.a("acsRulesSetting", bVar.a, bVar.b);
        }
    }
}
