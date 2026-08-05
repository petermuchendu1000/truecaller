package com.truecaller.calling.initiate_call;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class a extends of0.a {
    public final q6.baz c;
    public java.lang.String d;
    public java.lang.String e;
    public java.lang.String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption j;
    public com.truecaller.calling.initiate_call.InitiateCallHelper$DialAssistOptions k;
    public com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource l;

    public a(q6.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "phoneAccountsManager");
        this.c = bazVar;
        this.j = com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption.Skip.a;
    }

    public final void c2(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption initiateCallHelper$CallContextOption, com.truecaller.calling.initiate_call.InitiateCallHelper$DialAssistOptions initiateCallHelper$DialAssistOptions, com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource initiateCallHelper$CallSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "displayName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "analyticsContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initiateCallHelper$CallSource, "callSource");
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = z2;
        this.i = z3;
        if (initiateCallHelper$CallContextOption == null) {
            initiateCallHelper$CallContextOption = com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption.Skip.a;
        }
        this.j = initiateCallHelper$CallContextOption;
        this.k = initiateCallHelper$DialAssistOptions;
        this.l = initiateCallHelper$CallSource;
        if (!t41.i0.c(str)) {
            com.truecaller.log.AssertionUtil.OnlyInDebug.fail(new java.lang.String[]{"Non-callable number was passed"});
            nv0.r rVar = (nv0.r) ((com.truecaller.sdk.bar) this).a;
            if (rVar != null) {
                ((com.truecaller.calling.initiate_call.SelectPhoneAccountActivity) rVar).finish();
                return;
            }
            return;
        }
        java.util.List l = this.c.l();
        androidx.fragment.app.FragmentActivity fragmentActivity = (nv0.r) ((com.truecaller.sdk.bar) this).a;
        if (fragmentActivity != null) {
            androidx.fragment.app.FragmentActivity fragmentActivity2 = (com.truecaller.calling.initiate_call.SelectPhoneAccountActivity) fragmentActivity;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l, "phoneAccountsInfo");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "displayString");
            android.view.Window window = fragmentActivity2.getWindow();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            h6.e.U(window, 0.75f);
            androidx.fragment.app.g1 supportFragmentManager = fragmentActivity2.getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            supportFragmentManager.getClass();
            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
            h72.a aVar = nr1.a.o;
            java.lang.String str4 = (java.lang.String) fragmentActivity2.g0.getValue();
            aVar.getClass();
            nr1.a aVar2 = new nr1.a();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("display_string", str2);
            bundle.putString("analyticsContext", str4);
            aVar2.setArguments(bundle);
            barVar.f(0, aVar2, (java.lang.String) null, 1);
            barVar.m(true, true);
        }
    }
}
