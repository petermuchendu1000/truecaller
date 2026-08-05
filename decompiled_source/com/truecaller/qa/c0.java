package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class c0 implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ac1.e d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ c0(boolean z, boolean z2, boolean z3, ac1.e eVar, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = eVar;
        this.e = z4;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        gi2.e eVar = (gi2.e) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "$this$section");
        ac1.e eVar2 = this.d;
        eVar.f("Voicemail force show sim on onboarding", this.a, new com.truecaller.qa.e0(eVar2, null, 0));
        eVar.f("in onboarding tutorial AB test", this.b, new com.truecaller.qa.f0(eVar2, null, 0));
        eVar.f("has started onboarding at least once", this.c, new com.truecaller.qa.f0(eVar2, null, 1));
        eVar.f("Always show voicemail promo screen", ((com.truecaller.qa.x) eVar2.c).z("isForceShowVoicemailPromoScreen", false), new com.truecaller.qa.e0(eVar2, null, 1));
        eVar.b("send voicemail push", new b12.s(eVar2, (df3.bar) null, 3));
        eVar.f("calls tab voicemail promo dismissed", this.e, new com.truecaller.qa.f0(eVar2, null, 2));
        return kotlin.Unit.a;
    }
}
