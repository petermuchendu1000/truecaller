package com.truecaller.voicemail.domain.callstabpromo;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class a {
    public final nc0.bar a;

    public a(nc0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        this.a = barVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hi3.e, qx2.w2] */
    public final void a() {
        ?? eVar = new hi3.e(qx2.x2.h, qx2.x2.i);
        eVar.p("ActivateVoicemailCallsTab_en");
        eVar.o("Activate");
        eVar.C(com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.CALLS_TAB.getValue());
        qx2.x2 e = eVar.e();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "build(...)");
        j71.g.K(e, this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hi3.e, qx2.w2] */
    public final void b() {
        ?? eVar = new hi3.e(qx2.x2.h, qx2.x2.i);
        eVar.C(com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.CALLS_TAB.getValue());
        eVar.p("ActivateVoicemailCallsTab_en");
        eVar.o("Dismiss");
        qx2.x2 e = eVar.e();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "build(...)");
        j71.g.K(e, this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hi3.e, qx2.d3] */
    public final void c() {
        ?? eVar = new hi3.e(qx2.e3.f, qx2.e3.g);
        java.lang.String value = com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.CALLS_TAB.getValue();
        bi3.j0[] j0VarArr = ((hi3.e) eVar).b;
        hi3.e.d(j0VarArr[2], value);
        eVar.e = value;
        boolean[] zArr = ((hi3.e) eVar).c;
        zArr[2] = true;
        bi3.j0 j0Var = j0VarArr[3];
        eVar.f = "ActivateVoicemailCallsTab_en";
        zArr[3] = true;
        qx2.e3 e = eVar.e();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "build(...)");
        j71.g.K(e, this.a);
    }
}
