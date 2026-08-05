package com.truecaller.messaging.conversation.fraud;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/truecaller/messaging/conversation/fraud/ReportingFlowActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "vd/b", "Lb12/n;", "uiState", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ReportingFlowActivity extends com.truecaller.messaging.conversation.fraud.Hilt_ReportingFlowActivity {
    public static final /* synthetic */ int e0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(b12.c0.class), new b12.l(this, 1), new b12.l(this, 0), new b12.l(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v2, types: [b12.j, df3.bar] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.truecaller.messaging.conversation.fraud.ReportingFlowActivity, android.app.Activity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object t0(com.truecaller.messaging.conversation.fraud.ReportingFlowActivity reportingFlowActivity, boolean z, ff3.qux quxVar) {
        ?? r0;
        int i;
        androidx.activity.ComponentActivity componentActivity;
        if (quxVar instanceof b12.j) {
            b12.j jVar = (b12.j) quxVar;
            int i2 = jVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.z = i2 - Integer.MIN_VALUE;
                r0 = jVar;
                java.lang.Object obj = r0.y;
                ef3.bar barVar = ef3.bar.a;
                i = r0.z;
                if (i == 0) {
                    if (i == 1) {
                        androidx.activity.ComponentActivity componentActivity2 = r0.x;
                        od.p.E(obj);
                        componentActivity = componentActivity2;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (z) {
                        reportingFlowActivity.getClass();
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("dismiss", true);
                        intent.putExtra("userAction", reportingFlowActivity.getIntent().getStringExtra("userAction"));
                        reportingFlowActivity.setResult(-1, intent);
                        reportingFlowActivity.finish();
                        return kotlin.Unit.a;
                    }
                    r0.x = reportingFlowActivity;
                    r0.z = 1;
                    componentActivity = reportingFlowActivity;
                    if (fg3.h0.r(500L, (df3.bar) r0) == barVar) {
                        return barVar;
                    }
                }
                componentActivity.finish();
                return kotlin.Unit.a;
            }
        }
        r0 = new ff3.qux(quxVar);
        java.lang.Object obj2 = r0.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = r0.z;
        if (i == 0) {
        }
        componentActivity.finish();
        return kotlin.Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.conversation.fraud.Hilt_ReportingFlowActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        d.m.b(this, new d.k0(0, 0, 2, d.j0.k), 2);
        ge0.i.m(getOnBackPressedDispatcher(), this, new a2.a0(this, 17), 2);
        e.d.a(this, new d3.qux(-824817193, new b12.g(this, 0), true));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0426 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0449 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0474 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x049d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x04fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x052e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0559 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x057c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x059e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(final b12.c0 c0Var, v2.n nVar, final int i) {
        int i2;
        int i3;
        boolean z;
        v2.h1 r;
        kotlin.jvm.functions.Function2 function2;
        d12.bar barVar;
        java.lang.String r2;
        java.lang.String r3;
        java.lang.String v;
        java.lang.String r4;
        java.lang.String r5;
        boolean d;
        int i4;
        d12.bar barVar2;
        java.lang.String r6;
        java.lang.String t;
        java.lang.String r7;
        java.lang.String t2;
        java.lang.String r8;
        boolean z2;
        boolean z3;
        boolean h;
        java.lang.Object M;
        boolean z4;
        boolean z5;
        boolean h2;
        java.lang.Object M2;
        boolean h3;
        java.lang.Object M3;
        zf3.baz bazVar;
        boolean h4;
        java.lang.Object M4;
        zf3.baz bazVar2;
        boolean h5;
        java.lang.Object M5;
        boolean h6;
        java.lang.Object M6;
        java.lang.String str;
        boolean z6;
        java.lang.String str2;
        boolean h7;
        java.lang.Object M7;
        java.lang.String str3;
        java.lang.String str4;
        boolean z7;
        boolean h8;
        java.lang.Object M8;
        boolean h9;
        java.lang.Object M9;
        boolean h10;
        java.lang.Object M10;
        boolean h11;
        java.lang.Object M11;
        nVar.b0(-145892802);
        if (nVar.h(c0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (nVar.h(this)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        final int i7 = 0;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i6 & 1, z)) {
            v2.t0 b = androidx.compose.runtime.a.b(c0Var.F, nVar, 0);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((b12.n) b.getValue()).a);
            boolean f = nVar.f(b) | nVar.h(this);
            java.lang.Object M12 = nVar.M();
            v2.c cVar = v2.k.a;
            if (f || M12 == cVar) {
                M12 = new a32.d(b, this, null, 27);
                nVar.k0(M12);
            }
            v2.f.h(valueOf, (kotlin.jvm.functions.Function2) M12, nVar);
            boolean p = ((u03.b) c0Var.q.get()).p();
            java.lang.String str5 = "";
            switch (b12.k.a[((b12.n) b.getValue()).g.ordinal()]) {
                case 1:
                    nVar.Z(215236492);
                    com.truecaller.data.entity.messaging.Participant participant = ((b12.n) b.getValue()).i;
                    if (participant != null && (r2 = ak.e1.r(participant)) != null) {
                        str5 = r2;
                    }
                    barVar = new d12.bar(qk.b1.v(2132018007, new java.lang.Object[]{str5}, nVar), 2131234388, qk.b1.u(2132018011, nVar), false);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z8 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h && M != cVar) {
                        z5 = z2;
                        z4 = z3;
                    } else {
                        z4 = z3;
                        z5 = z2;
                        b12.i iVar = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                        nVar.k0(iVar);
                        M = iVar;
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2 || M2 == cVar) {
                        b12.i iVar2 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                        nVar.k0(iVar2);
                        M2 = iVar2;
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3 || M3 == cVar) {
                        a2.t tVar = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                        nVar.k0(tVar);
                        M3 = tVar;
                    }
                    kotlin.jvm.functions.Function0 function03 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4 && M4 != cVar) {
                        bazVar2 = bazVar;
                    } else {
                        bazVar2 = bazVar;
                        aj0.l lVar = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                        nVar.k0(lVar);
                        M4 = lVar;
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5 || M5 == cVar) {
                        a2.t tVar2 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                        nVar.k0(tVar2);
                        M5 = tVar2;
                    }
                    kotlin.jvm.functions.Function0 function04 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6 || M6 == cVar) {
                        a2.t tVar3 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                        nVar.k0(tVar3);
                        M6 = tVar3;
                    }
                    kotlin.jvm.functions.Function0 function05 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7 && M7 != cVar) {
                        str4 = str;
                        z7 = z6;
                        str3 = str2;
                    } else {
                        str3 = str2;
                        str4 = str;
                        z7 = z6;
                        aj0.l lVar2 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                        nVar.k0(lVar2);
                        M7 = lVar2;
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8 || M8 == cVar) {
                        aj0.l lVar3 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                        nVar.k0(lVar3);
                        M8 = lVar3;
                    }
                    kotlin.jvm.functions.Function1 function13 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9 || M9 == cVar) {
                        a2.t tVar4 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                        nVar.k0(tVar4);
                        M9 = tVar4;
                    }
                    kotlin.jvm.functions.Function0 function06 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10 || M10 == cVar) {
                        aj0.l lVar4 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                        nVar.k0(lVar4);
                        M10 = lVar4;
                    }
                    kotlin.jvm.functions.Function1 function14 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11 || M11 == cVar) {
                        aj0.l lVar5 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                        nVar.k0(lVar5);
                        M11 = lVar5;
                    }
                    hi3.baz.q(barVar2, fraudFlowDestination, z8, z5, function0, bazVar2, function1, function02, function03, z4, str3, function05, str4, z7, function13, function12, function04, function06, function14, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case 2:
                    nVar.Z(215671453);
                    barVar = new d12.bar(qk.b1.s(2131886099, ((b12.n) b.getValue()).h.size(), nVar), 2131234389, qk.b1.u(2132018038, nVar), true);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z82 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar3 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar3);
                    M = iVar3;
                    kotlin.jvm.functions.Function0 function07 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar22 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar22);
                    M2 = iVar22;
                    kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar5 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar5);
                    M3 = tVar5;
                    kotlin.jvm.functions.Function0 function032 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar6 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar6);
                    M4 = lVar6;
                    kotlin.jvm.functions.Function1 function15 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar22 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar22);
                    M5 = tVar22;
                    kotlin.jvm.functions.Function0 function042 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar32 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar32);
                    M6 = tVar32;
                    kotlin.jvm.functions.Function0 function052 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar22 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar22);
                    M7 = lVar22;
                    kotlin.jvm.functions.Function1 function122 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar32 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar32);
                    M8 = lVar32;
                    kotlin.jvm.functions.Function1 function132 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination2 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar42 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar42);
                    M9 = tVar42;
                    kotlin.jvm.functions.Function0 function062 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar42 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar42);
                    M10 = lVar42;
                    kotlin.jvm.functions.Function1 function142 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar52 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar52);
                    M11 = lVar52;
                    hi3.baz.q(barVar2, fraudFlowDestination2, z82, z5, function07, bazVar2, function15, function022, function032, z4, str3, function052, str4, z7, function132, function122, function042, function062, function142, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case 3:
                    nVar.Z(216159703);
                    barVar = new d12.bar(qk.b1.s(2131886099, ((b12.n) b.getValue()).h.size(), nVar), 2131234389, qk.b1.u(2132018037, nVar), true);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z822 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar32 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar32);
                    M = iVar32;
                    kotlin.jvm.functions.Function0 function072 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar222);
                    M2 = iVar222;
                    kotlin.jvm.functions.Function0 function0222 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar52 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar52);
                    M3 = tVar52;
                    kotlin.jvm.functions.Function0 function0322 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar62 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar62);
                    M4 = lVar62;
                    kotlin.jvm.functions.Function1 function152 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar222 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar222);
                    M5 = tVar222;
                    kotlin.jvm.functions.Function0 function0422 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar322 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar322);
                    M6 = tVar322;
                    kotlin.jvm.functions.Function0 function0522 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar222 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar222);
                    M7 = lVar222;
                    kotlin.jvm.functions.Function1 function1222 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar322 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar322);
                    M8 = lVar322;
                    kotlin.jvm.functions.Function1 function1322 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination22 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar422 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar422);
                    M9 = tVar422;
                    kotlin.jvm.functions.Function0 function0622 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar422 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar422);
                    M10 = lVar422;
                    kotlin.jvm.functions.Function1 function1422 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar522 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar522);
                    M11 = lVar522;
                    hi3.baz.q(barVar2, fraudFlowDestination22, z822, z5, function072, bazVar2, function152, function0222, function0322, z4, str3, function0522, str4, z7, function1322, function1222, function0422, function0622, function1422, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case 4:
                    nVar.Z(216641753);
                    barVar = new d12.bar(qk.b1.u(2132018014, nVar), 2131234157, qk.b1.u(2132018011, nVar), false);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z8222 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar322 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar322);
                    M = iVar322;
                    kotlin.jvm.functions.Function0 function0722 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar2222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar2222);
                    M2 = iVar2222;
                    kotlin.jvm.functions.Function0 function02222 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar522 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar522);
                    M3 = tVar522;
                    kotlin.jvm.functions.Function0 function03222 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar622 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar622);
                    M4 = lVar622;
                    kotlin.jvm.functions.Function1 function1522 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar2222 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar2222);
                    M5 = tVar2222;
                    kotlin.jvm.functions.Function0 function04222 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar3222 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar3222);
                    M6 = tVar3222;
                    kotlin.jvm.functions.Function0 function05222 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar2222 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar2222);
                    M7 = lVar2222;
                    kotlin.jvm.functions.Function1 function12222 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar3222 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar3222);
                    M8 = lVar3222;
                    kotlin.jvm.functions.Function1 function13222 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination222 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar4222 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar4222);
                    M9 = tVar4222;
                    kotlin.jvm.functions.Function0 function06222 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar4222 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar4222);
                    M10 = lVar4222;
                    kotlin.jvm.functions.Function1 function14222 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar5222 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar5222);
                    M11 = lVar5222;
                    hi3.baz.q(barVar2, fraudFlowDestination222, z8222, z5, function0722, bazVar2, function1522, function02222, function03222, z4, str3, function05222, str4, z7, function13222, function12222, function04222, function06222, function14222, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case 5:
                    nVar.Z(217036724);
                    barVar = new d12.bar(qk.b1.u(2132018017, nVar), 2131234158, qk.b1.u(2132018016, nVar), true);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z82222 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar3222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar3222);
                    M = iVar3222;
                    kotlin.jvm.functions.Function0 function07222 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar22222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar22222);
                    M2 = iVar22222;
                    kotlin.jvm.functions.Function0 function022222 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar5222 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar5222);
                    M3 = tVar5222;
                    kotlin.jvm.functions.Function0 function032222 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar6222 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar6222);
                    M4 = lVar6222;
                    kotlin.jvm.functions.Function1 function15222 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar22222 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar22222);
                    M5 = tVar22222;
                    kotlin.jvm.functions.Function0 function042222 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar32222 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar32222);
                    M6 = tVar32222;
                    kotlin.jvm.functions.Function0 function052222 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar22222 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar22222);
                    M7 = lVar22222;
                    kotlin.jvm.functions.Function1 function122222 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar32222 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar32222);
                    M8 = lVar32222;
                    kotlin.jvm.functions.Function1 function132222 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination2222 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar42222 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar42222);
                    M9 = tVar42222;
                    kotlin.jvm.functions.Function0 function062222 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar42222 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar42222);
                    M10 = lVar42222;
                    kotlin.jvm.functions.Function1 function142222 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar52222 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar52222);
                    M11 = lVar52222;
                    hi3.baz.q(barVar2, fraudFlowDestination2222, z82222, z5, function07222, bazVar2, function15222, function022222, function032222, z4, str3, function052222, str4, z7, function132222, function122222, function042222, function062222, function142222, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case 6:
                    nVar.Z(217506126);
                    barVar = new d12.bar(qk.b1.u(2132018017, nVar), 2131234158, qk.b1.u(2132018015, nVar), true);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z822222 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar32222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar32222);
                    M = iVar32222;
                    kotlin.jvm.functions.Function0 function072222 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar222222);
                    M2 = iVar222222;
                    kotlin.jvm.functions.Function0 function0222222 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar52222 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar52222);
                    M3 = tVar52222;
                    kotlin.jvm.functions.Function0 function0322222 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar62222 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar62222);
                    M4 = lVar62222;
                    kotlin.jvm.functions.Function1 function152222 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar222222 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar222222);
                    M5 = tVar222222;
                    kotlin.jvm.functions.Function0 function0422222 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar322222 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar322222);
                    M6 = tVar322222;
                    kotlin.jvm.functions.Function0 function0522222 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar222222 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar222222);
                    M7 = lVar222222;
                    kotlin.jvm.functions.Function1 function1222222 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar322222 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar322222);
                    M8 = lVar322222;
                    kotlin.jvm.functions.Function1 function1322222 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination22222 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar422222 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar422222);
                    M9 = tVar422222;
                    kotlin.jvm.functions.Function0 function0622222 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar422222 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar422222);
                    M10 = lVar422222;
                    kotlin.jvm.functions.Function1 function1422222 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar522222 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar522222);
                    M11 = lVar522222;
                    hi3.baz.q(barVar2, fraudFlowDestination22222, z822222, z5, function072222, bazVar2, function152222, function0222222, function0322222, z4, str3, function0522222, str4, z7, function1322222, function1222222, function0422222, function0622222, function1422222, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case 7:
                    nVar.Z(217998189);
                    com.truecaller.data.entity.messaging.Participant participant2 = ((b12.n) b.getValue()).i;
                    if (participant2 != null && (r3 = ak.e1.r(participant2)) != null) {
                        str5 = r3;
                    }
                    barVar = new d12.bar(qk.b1.v(2132018007, new java.lang.Object[]{str5}, nVar), 2131234388, qk.b1.u(2132018019, nVar), false);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z8222222 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar322222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar322222);
                    M = iVar322222;
                    kotlin.jvm.functions.Function0 function0722222 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar2222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar2222222);
                    M2 = iVar2222222;
                    kotlin.jvm.functions.Function0 function02222222 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar522222 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar522222);
                    M3 = tVar522222;
                    kotlin.jvm.functions.Function0 function03222222 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar622222 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar622222);
                    M4 = lVar622222;
                    kotlin.jvm.functions.Function1 function1522222 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar2222222 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar2222222);
                    M5 = tVar2222222;
                    kotlin.jvm.functions.Function0 function04222222 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar3222222 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar3222222);
                    M6 = tVar3222222;
                    kotlin.jvm.functions.Function0 function05222222 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar2222222 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar2222222);
                    M7 = lVar2222222;
                    kotlin.jvm.functions.Function1 function12222222 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar3222222 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar3222222);
                    M8 = lVar3222222;
                    kotlin.jvm.functions.Function1 function13222222 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination222222 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar4222222 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar4222222);
                    M9 = tVar4222222;
                    kotlin.jvm.functions.Function0 function06222222 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar4222222 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar4222222);
                    M10 = lVar4222222;
                    kotlin.jvm.functions.Function1 function14222222 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar5222222 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar5222222);
                    M11 = lVar5222222;
                    hi3.baz.q(barVar2, fraudFlowDestination222222, z8222222, z5, function0722222, bazVar2, function1522222, function02222222, function03222222, z4, str3, function05222222, str4, z7, function13222222, function12222222, function04222222, function06222222, function14222222, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case 8:
                    nVar.Z(218427415);
                    if (p) {
                        nVar.Z(218461918);
                        com.truecaller.data.entity.messaging.Participant participant3 = ((b12.n) b.getValue()).i;
                        if (participant3 != null && (r5 = ak.e1.r(participant3)) != null) {
                            str5 = r5;
                        }
                        v = qk.b1.v(2132018032, new java.lang.Object[]{str5}, nVar);
                        nVar.p(false);
                    } else {
                        nVar.Z(218696216);
                        com.truecaller.data.entity.messaging.Participant participant4 = ((b12.n) b.getValue()).i;
                        if (participant4 != null && (r4 = ak.e1.r(participant4)) != null) {
                            str5 = r4;
                        }
                        v = qk.b1.v(2132018033, new java.lang.Object[]{str5}, nVar);
                        nVar.p(false);
                    }
                    barVar = new d12.bar(qk.b1.u(2132018034, nVar), 2131234389, v, true);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z82222222 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar3222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar3222222);
                    M = iVar3222222;
                    kotlin.jvm.functions.Function0 function07222222 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar22222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar22222222);
                    M2 = iVar22222222;
                    kotlin.jvm.functions.Function0 function022222222 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar5222222 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar5222222);
                    M3 = tVar5222222;
                    kotlin.jvm.functions.Function0 function032222222 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar6222222 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar6222222);
                    M4 = lVar6222222;
                    kotlin.jvm.functions.Function1 function15222222 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar22222222 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar22222222);
                    M5 = tVar22222222;
                    kotlin.jvm.functions.Function0 function042222222 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar32222222 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar32222222);
                    M6 = tVar32222222;
                    kotlin.jvm.functions.Function0 function052222222 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar22222222 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar22222222);
                    M7 = lVar22222222;
                    kotlin.jvm.functions.Function1 function122222222 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar32222222 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar32222222);
                    M8 = lVar32222222;
                    kotlin.jvm.functions.Function1 function132222222 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination2222222 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar42222222 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar42222222);
                    M9 = tVar42222222;
                    kotlin.jvm.functions.Function0 function062222222 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar42222222 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar42222222);
                    M10 = lVar42222222;
                    kotlin.jvm.functions.Function1 function142222222 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar52222222 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar52222222);
                    M11 = lVar52222222;
                    hi3.baz.q(barVar2, fraudFlowDestination2222222, z82222222, z5, function07222222, bazVar2, function15222222, function022222222, function032222222, z4, str3, function052222222, str4, z7, function132222222, function122222222, function042222222, function062222222, function142222222, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case 9:
                    nVar.Z(219327655);
                    if (((java.lang.Boolean) nVar.j(k4.t1.a)).booleanValue()) {
                        d = false;
                    } else {
                        dx2.bar barVar3 = dx2.bar.a;
                        d = dx2.bar.d();
                    }
                    java.lang.String u = qk.b1.u(2132018022, nVar);
                    com.truecaller.data.entity.messaging.Participant participant5 = ((b12.n) b.getValue()).i;
                    if (participant5 != null && (r6 = ak.e1.r(participant5)) != null) {
                        str5 = r6;
                    }
                    java.lang.String v2 = qk.b1.v(2132018021, new java.lang.Object[]{str5}, nVar);
                    if (d) {
                        i4 = 2131234294;
                    } else {
                        i4 = 2131234293;
                    }
                    d12.bar barVar4 = new d12.bar(u, i4, v2, true);
                    nVar.p(false);
                    barVar2 = barVar4;
                    boolean z822222222 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar32222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar32222222);
                    M = iVar32222222;
                    kotlin.jvm.functions.Function0 function072222222 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar222222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar222222222);
                    M2 = iVar222222222;
                    kotlin.jvm.functions.Function0 function0222222222 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar52222222 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar52222222);
                    M3 = tVar52222222;
                    kotlin.jvm.functions.Function0 function0322222222 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar62222222 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar62222222);
                    M4 = lVar62222222;
                    kotlin.jvm.functions.Function1 function152222222 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar222222222 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar222222222);
                    M5 = tVar222222222;
                    kotlin.jvm.functions.Function0 function0422222222 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar322222222 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar322222222);
                    M6 = tVar322222222;
                    kotlin.jvm.functions.Function0 function0522222222 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar222222222 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar222222222);
                    M7 = lVar222222222;
                    kotlin.jvm.functions.Function1 function1222222222 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar322222222 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar322222222);
                    M8 = lVar322222222;
                    kotlin.jvm.functions.Function1 function1322222222 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination22222222 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar422222222 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar422222222);
                    M9 = tVar422222222;
                    kotlin.jvm.functions.Function0 function0622222222 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar422222222 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar422222222);
                    M10 = lVar422222222;
                    kotlin.jvm.functions.Function1 function1422222222 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar522222222 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar522222222);
                    M11 = lVar522222222;
                    hi3.baz.q(barVar2, fraudFlowDestination22222222, z822222222, z5, function072222222, bazVar2, function152222222, function0222222222, function0322222222, z4, str3, function0522222222, str4, z7, function1322222222, function1222222222, function0422222222, function0622222222, function1422222222, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                    nVar.Z(220101663);
                    barVar = new d12.bar(qk.b1.s(2131886097, ((b12.n) b.getValue()).h.size(), nVar), 2131234388, qk.b1.u(2132018008, nVar), true);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z8222222222 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar322222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar322222222);
                    M = iVar322222222;
                    kotlin.jvm.functions.Function0 function0722222222 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar2222222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar2222222222);
                    M2 = iVar2222222222;
                    kotlin.jvm.functions.Function0 function02222222222 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar522222222 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar522222222);
                    M3 = tVar522222222;
                    kotlin.jvm.functions.Function0 function03222222222 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar622222222 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar622222222);
                    M4 = lVar622222222;
                    kotlin.jvm.functions.Function1 function1522222222 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar2222222222 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar2222222222);
                    M5 = tVar2222222222;
                    kotlin.jvm.functions.Function0 function04222222222 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar3222222222 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar3222222222);
                    M6 = tVar3222222222;
                    kotlin.jvm.functions.Function0 function05222222222 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar2222222222 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar2222222222);
                    M7 = lVar2222222222;
                    kotlin.jvm.functions.Function1 function12222222222 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar3222222222 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar3222222222);
                    M8 = lVar3222222222;
                    kotlin.jvm.functions.Function1 function13222222222 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination222222222 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar4222222222 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar4222222222);
                    M9 = tVar4222222222;
                    kotlin.jvm.functions.Function0 function06222222222 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar4222222222 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar4222222222);
                    M10 = lVar4222222222;
                    kotlin.jvm.functions.Function1 function14222222222 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar5222222222 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar5222222222);
                    M11 = lVar5222222222;
                    hi3.baz.q(barVar2, fraudFlowDestination222222222, z8222222222, z5, function0722222222, bazVar2, function1522222222, function02222222222, function03222222222, z4, str3, function05222222222, str4, z7, function13222222222, function12222222222, function04222222222, function06222222222, function14222222222, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                    nVar.Z(220575002);
                    barVar = new d12.bar(qk.b1.u(2132018014, nVar), 2131234157, qk.b1.u(2132018028, nVar), false);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z82222222222 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar3222222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar3222222222);
                    M = iVar3222222222;
                    kotlin.jvm.functions.Function0 function07222222222 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar22222222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar22222222222);
                    M2 = iVar22222222222;
                    kotlin.jvm.functions.Function0 function022222222222 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar5222222222 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar5222222222);
                    M3 = tVar5222222222;
                    kotlin.jvm.functions.Function0 function032222222222 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar6222222222 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar6222222222);
                    M4 = lVar6222222222;
                    kotlin.jvm.functions.Function1 function15222222222 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar22222222222 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar22222222222);
                    M5 = tVar22222222222;
                    kotlin.jvm.functions.Function0 function042222222222 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar32222222222 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar32222222222);
                    M6 = tVar32222222222;
                    kotlin.jvm.functions.Function0 function052222222222 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar22222222222 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar22222222222);
                    M7 = lVar22222222222;
                    kotlin.jvm.functions.Function1 function122222222222 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar32222222222 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar32222222222);
                    M8 = lVar32222222222;
                    kotlin.jvm.functions.Function1 function132222222222 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination2222222222 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar42222222222 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar42222222222);
                    M9 = tVar42222222222;
                    kotlin.jvm.functions.Function0 function062222222222 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar42222222222 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar42222222222);
                    M10 = lVar42222222222;
                    kotlin.jvm.functions.Function1 function142222222222 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar52222222222 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar52222222222);
                    M11 = lVar52222222222;
                    hi3.baz.q(barVar2, fraudFlowDestination2222222222, z82222222222, z5, function07222222222, bazVar2, function15222222222, function022222222222, function032222222222, z4, str3, function052222222222, str4, z7, function132222222222, function122222222222, function042222222222, function062222222222, function142222222222, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                    nVar.Z(220959650);
                    if (p) {
                        nVar.Z(220997377);
                        com.truecaller.data.entity.messaging.Participant participant6 = ((b12.n) b.getValue()).i;
                        if (participant6 != null && (r7 = ak.e1.r(participant6)) != null) {
                            str5 = r7;
                        }
                        t = qk.b1.v(2132018029, new java.lang.Object[]{str5}, nVar);
                        nVar.p(false);
                    } else {
                        t = k9.d.t(nVar, 221163816, 2132018030, nVar, false);
                    }
                    barVar = new d12.bar(qk.b1.u(2132018031, nVar), 2131234158, t, true);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z822222222222 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar32222222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar32222222222);
                    M = iVar32222222222;
                    kotlin.jvm.functions.Function0 function072222222222 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar222222222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar222222222222);
                    M2 = iVar222222222222;
                    kotlin.jvm.functions.Function0 function0222222222222 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar52222222222 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar52222222222);
                    M3 = tVar52222222222;
                    kotlin.jvm.functions.Function0 function0322222222222 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar62222222222 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar62222222222);
                    M4 = lVar62222222222;
                    kotlin.jvm.functions.Function1 function152222222222 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar222222222222 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar222222222222);
                    M5 = tVar222222222222;
                    kotlin.jvm.functions.Function0 function0422222222222 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar322222222222 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar322222222222);
                    M6 = tVar322222222222;
                    kotlin.jvm.functions.Function0 function0522222222222 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar222222222222);
                    M7 = lVar222222222222;
                    kotlin.jvm.functions.Function1 function1222222222222 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar322222222222 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar322222222222);
                    M8 = lVar322222222222;
                    kotlin.jvm.functions.Function1 function1322222222222 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination22222222222 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar422222222222 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar422222222222);
                    M9 = tVar422222222222;
                    kotlin.jvm.functions.Function0 function0622222222222 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar422222222222 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar422222222222);
                    M10 = lVar422222222222;
                    kotlin.jvm.functions.Function1 function1422222222222 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar522222222222 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar522222222222);
                    M11 = lVar522222222222;
                    hi3.baz.q(barVar2, fraudFlowDestination22222222222, z822222222222, z5, function072222222222, bazVar2, function152222222222, function0222222222222, function0322222222222, z4, str3, function0522222222222, str4, z7, function1322222222222, function1222222222222, function0422222222222, function0622222222222, function1422222222222, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                    nVar.Z(221697419);
                    barVar = new d12.bar(qk.b1.u(2132018025, nVar), 2131232822, qk.b1.u(2132018028, nVar), false);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z8222222222222 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar322222222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar322222222222);
                    M = iVar322222222222;
                    kotlin.jvm.functions.Function0 function0722222222222 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar2222222222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar2222222222222);
                    M2 = iVar2222222222222;
                    kotlin.jvm.functions.Function0 function02222222222222 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar522222222222 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar522222222222);
                    M3 = tVar522222222222;
                    kotlin.jvm.functions.Function0 function03222222222222 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar622222222222 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar622222222222);
                    M4 = lVar622222222222;
                    kotlin.jvm.functions.Function1 function1522222222222 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar2222222222222 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar2222222222222);
                    M5 = tVar2222222222222;
                    kotlin.jvm.functions.Function0 function04222222222222 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar3222222222222 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar3222222222222);
                    M6 = tVar3222222222222;
                    kotlin.jvm.functions.Function0 function05222222222222 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar2222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar2222222222222);
                    M7 = lVar2222222222222;
                    kotlin.jvm.functions.Function1 function12222222222222 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar3222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar3222222222222);
                    M8 = lVar3222222222222;
                    kotlin.jvm.functions.Function1 function13222222222222 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination222222222222 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar4222222222222 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar4222222222222);
                    M9 = tVar4222222222222;
                    kotlin.jvm.functions.Function0 function06222222222222 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar4222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar4222222222222);
                    M10 = lVar4222222222222;
                    kotlin.jvm.functions.Function1 function14222222222222 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar5222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar5222222222222);
                    M11 = lVar5222222222222;
                    hi3.baz.q(barVar2, fraudFlowDestination222222222222, z8222222222222, z5, function0722222222222, bazVar2, function1522222222222, function02222222222222, function03222222222222, z4, str3, function05222222222222, str4, z7, function13222222222222, function12222222222222, function04222222222222, function06222222222222, function14222222222222, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                    nVar.Z(222098218);
                    barVar = new d12.bar(qk.b1.u(2132018025, nVar), 2131232822, qk.b1.u(2132018013, nVar), false);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z82222222222222 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar3222222222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar3222222222222);
                    M = iVar3222222222222;
                    kotlin.jvm.functions.Function0 function07222222222222 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar22222222222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar22222222222222);
                    M2 = iVar22222222222222;
                    kotlin.jvm.functions.Function0 function022222222222222 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar5222222222222 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar5222222222222);
                    M3 = tVar5222222222222;
                    kotlin.jvm.functions.Function0 function032222222222222 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar6222222222222 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar6222222222222);
                    M4 = lVar6222222222222;
                    kotlin.jvm.functions.Function1 function15222222222222 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar22222222222222 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar22222222222222);
                    M5 = tVar22222222222222;
                    kotlin.jvm.functions.Function0 function042222222222222 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar32222222222222 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar32222222222222);
                    M6 = tVar32222222222222;
                    kotlin.jvm.functions.Function0 function052222222222222 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar22222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar22222222222222);
                    M7 = lVar22222222222222;
                    kotlin.jvm.functions.Function1 function122222222222222 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar32222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar32222222222222);
                    M8 = lVar32222222222222;
                    kotlin.jvm.functions.Function1 function132222222222222 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination2222222222222 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar42222222222222 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar42222222222222);
                    M9 = tVar42222222222222;
                    kotlin.jvm.functions.Function0 function062222222222222 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar42222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar42222222222222);
                    M10 = lVar42222222222222;
                    kotlin.jvm.functions.Function1 function142222222222222 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar52222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar52222222222222);
                    M11 = lVar52222222222222;
                    hi3.baz.q(barVar2, fraudFlowDestination2222222222222, z82222222222222, z5, function07222222222222, bazVar2, function15222222222222, function022222222222222, function032222222222222, z4, str3, function052222222222222, str4, z7, function132222222222222, function122222222222222, function042222222222222, function062222222222222, function142222222222222, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                    nVar.Z(222504380);
                    if (p) {
                        nVar.Z(222542107);
                        com.truecaller.data.entity.messaging.Participant participant7 = ((b12.n) b.getValue()).i;
                        if (participant7 != null && (r8 = ak.e1.r(participant7)) != null) {
                            str5 = r8;
                        }
                        t2 = qk.b1.v(2132018029, new java.lang.Object[]{str5}, nVar);
                        nVar.p(false);
                    } else {
                        t2 = k9.d.t(nVar, 222775816, 2132018030, nVar, false);
                    }
                    barVar = new d12.bar(qk.b1.u(2132018026, nVar), 2131232823, t2, true);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z822222222222222 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar32222222222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar32222222222222);
                    M = iVar32222222222222;
                    kotlin.jvm.functions.Function0 function072222222222222 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar222222222222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar222222222222222);
                    M2 = iVar222222222222222;
                    kotlin.jvm.functions.Function0 function0222222222222222 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar52222222222222 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar52222222222222);
                    M3 = tVar52222222222222;
                    kotlin.jvm.functions.Function0 function0322222222222222 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar62222222222222 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar62222222222222);
                    M4 = lVar62222222222222;
                    kotlin.jvm.functions.Function1 function152222222222222 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar222222222222222 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar222222222222222);
                    M5 = tVar222222222222222;
                    kotlin.jvm.functions.Function0 function0422222222222222 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar322222222222222 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar322222222222222);
                    M6 = tVar322222222222222;
                    kotlin.jvm.functions.Function0 function0522222222222222 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar222222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar222222222222222);
                    M7 = lVar222222222222222;
                    kotlin.jvm.functions.Function1 function1222222222222222 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar322222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar322222222222222);
                    M8 = lVar322222222222222;
                    kotlin.jvm.functions.Function1 function1322222222222222 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination22222222222222 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar422222222222222 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar422222222222222);
                    M9 = tVar422222222222222;
                    kotlin.jvm.functions.Function0 function0622222222222222 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar422222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar422222222222222);
                    M10 = lVar422222222222222;
                    kotlin.jvm.functions.Function1 function1422222222222222 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar522222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar522222222222222);
                    M11 = lVar522222222222222;
                    hi3.baz.q(barVar2, fraudFlowDestination22222222222222, z822222222222222, z5, function072222222222222, bazVar2, function152222222222222, function0222222222222222, function0322222222222222, z4, str3, function0522222222222222, str4, z7, function1322222222222222, function1222222222222222, function0422222222222222, function0622222222222222, function1422222222222222, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                    nVar.Z(223318037);
                    barVar = new d12.bar(qk.b1.s(2131886098, ((b12.n) b.getValue()).h.size(), nVar), 2131232823, qk.b1.u(2132018012, nVar), true);
                    nVar.p(false);
                    barVar2 = barVar;
                    boolean z8222222222222222 = ((b12.n) b.getValue()).j;
                    z2 = ((b12.n) b.getValue()).a;
                    z3 = ((b12.n) b.getValue()).b;
                    h = nVar.h(c0Var);
                    M = nVar.M();
                    if (h) {
                    }
                    z4 = z3;
                    z5 = z2;
                    b12.i iVar322222222222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 0);
                    nVar.k0(iVar322222222222222);
                    M = iVar322222222222222;
                    kotlin.jvm.functions.Function0 function0722222222222222 = (kotlin.jvm.functions.Function0) M;
                    h2 = nVar.h(c0Var);
                    M2 = nVar.M();
                    if (!h2) {
                    }
                    b12.i iVar2222222222222222 = new b12.i(0, c0Var, b12.c0.class, "closeSurvey", "closeSurvey()Lkotlinx/coroutines/Job;", 8, 1);
                    nVar.k0(iVar2222222222222222);
                    M2 = iVar2222222222222222;
                    kotlin.jvm.functions.Function0 function02222222222222222 = (kotlin.jvm.functions.Function0) M2;
                    h3 = nVar.h(c0Var);
                    M3 = nVar.M();
                    if (!h3) {
                    }
                    a2.t tVar522222222222222 = new a2.t(0, c0Var, b12.c0.class, "onConsentCheckedValueChanged", "onConsentCheckedValueChanged()V", 0, 11);
                    nVar.k0(tVar522222222222222);
                    M3 = tVar522222222222222;
                    kotlin.jvm.functions.Function0 function03222222222222222 = (kotlin.reflect.KFunction) M3;
                    bazVar = ((b12.n) b.getValue()).l;
                    h4 = nVar.h(c0Var);
                    M4 = nVar.M();
                    if (h4) {
                    }
                    bazVar2 = bazVar;
                    aj0.l lVar622222222222222 = new aj0.l(1, c0Var, b12.c0.class, "setSpamCategory", "setSpamCategory(Lcom/truecaller/compose/ui/components/search/SpamCategory;)V", 0, 7);
                    nVar.k0(lVar622222222222222);
                    M4 = lVar622222222222222;
                    kotlin.jvm.functions.Function1 function1522222222222222 = (kotlin.reflect.KFunction) M4;
                    h5 = nVar.h(c0Var);
                    M5 = nVar.M();
                    if (!h5) {
                    }
                    a2.t tVar2222222222222222 = new a2.t(0, c0Var, b12.c0.class, "onReportSpamClick", "onReportSpamClick()V", 0, 12);
                    nVar.k0(tVar2222222222222222);
                    M5 = tVar2222222222222222;
                    kotlin.jvm.functions.Function0 function04222222222222222 = (kotlin.reflect.KFunction) M5;
                    h6 = nVar.h(c0Var);
                    M6 = nVar.M();
                    if (!h6) {
                    }
                    a2.t tVar3222222222222222 = new a2.t(0, c0Var, b12.c0.class, "onSendAction", "onSendAction()V", 0, 13);
                    nVar.k0(tVar3222222222222222);
                    M6 = tVar3222222222222222;
                    kotlin.jvm.functions.Function0 function05222222222222222 = (kotlin.reflect.KFunction) M6;
                    str = ((b12.n) b.getValue()).d;
                    z6 = ((b12.n) b.getValue()).c;
                    str2 = ((b12.n) b.getValue()).e;
                    h7 = nVar.h(c0Var);
                    M7 = nVar.M();
                    if (h7) {
                    }
                    str3 = str2;
                    str4 = str;
                    z7 = z6;
                    aj0.l lVar2222222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onIsBusinessCheckedChange", "onIsBusinessCheckedChange(Z)V", 0, 8);
                    nVar.k0(lVar2222222222222222);
                    M7 = lVar2222222222222222;
                    kotlin.jvm.functions.Function1 function12222222222222222 = (kotlin.reflect.KFunction) M7;
                    h8 = nVar.h(c0Var);
                    M8 = nVar.M();
                    if (!h8) {
                    }
                    aj0.l lVar3222222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onSuggestedNameChange", "onSuggestedNameChange(Ljava/lang/String;)V", 0, 9);
                    nVar.k0(lVar3222222222222222);
                    M8 = lVar3222222222222222;
                    kotlin.jvm.functions.Function1 function13222222222222222 = (kotlin.reflect.KFunction) M8;
                    com.truecaller.messaging.conversation.fraud.FraudFlowDestination fraudFlowDestination222222222222222 = ((b12.n) b.getValue()).g;
                    h9 = nVar.h(c0Var);
                    M9 = nVar.M();
                    if (!h9) {
                    }
                    a2.t tVar4222222222222222 = new a2.t(0, c0Var, b12.c0.class, "reportFraudAndBlock", "reportFraudAndBlock()V", 0, 10);
                    nVar.k0(tVar4222222222222222);
                    M9 = tVar4222222222222222;
                    kotlin.jvm.functions.Function0 function06222222222222222 = (kotlin.reflect.KFunction) M9;
                    h10 = nVar.h(c0Var);
                    M10 = nVar.M();
                    if (!h10) {
                    }
                    aj0.l lVar4222222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onVeryImportantClicked", "onVeryImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 5);
                    nVar.k0(lVar4222222222222222);
                    M10 = lVar4222222222222222;
                    kotlin.jvm.functions.Function1 function14222222222222222 = (kotlin.reflect.KFunction) M10;
                    h11 = nVar.h(c0Var);
                    M11 = nVar.M();
                    if (!h11) {
                    }
                    aj0.l lVar5222222222222222 = new aj0.l(1, c0Var, b12.c0.class, "onNotSoImportantClicked", "onNotSoImportantClicked(Lcom/truecaller/messaging/conversation/fraud/ImportanceFlowType;)V", 0, 6);
                    nVar.k0(lVar5222222222222222);
                    M11 = lVar5222222222222222;
                    hi3.baz.q(barVar2, fraudFlowDestination222222222222222, z8222222222222222, z5, function0722222222222222, bazVar2, function1522222222222222, function02222222222222222, function03222222222222222, z4, str3, function05222222222222222, str4, z7, function13222222222222222, function12222222222222222, function04222222222222222, function06222222222222222, function14222222222222222, (kotlin.reflect.KFunction) M11, nVar, 0);
                    break;
                default:
                    nVar.Z(223737374);
                    nVar.p(false);
                    r = nVar.r();
                    if (r != null) {
                        function2 = new kotlin.jvm.functions.Function2(this, c0Var, i, i7) { // from class: b12.h
                            public final /* synthetic */ int a;
                            public final /* synthetic */ com.truecaller.messaging.conversation.fraud.ReportingFlowActivity b;
                            public final /* synthetic */ b12.c0 c;

                            {
                                this.a = i7;
                                this.b = this;
                            }

                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                int i8 = this.a;
                                b12.c0 c0Var2 = this.c;
                                com.truecaller.messaging.conversation.fraud.ReportingFlowActivity reportingFlowActivity = this.b;
                                v2.n nVar2 = (v2.n) obj;
                                ((java.lang.Integer) obj2).getClass();
                                int i9 = com.truecaller.messaging.conversation.fraud.ReportingFlowActivity.e0;
                                switch (i8) {
                                    case 0:
                                        reportingFlowActivity.s0(c0Var2, nVar2, v2.f.D(1));
                                        return kotlin.Unit.a;
                                    default:
                                        reportingFlowActivity.s0(c0Var2, nVar2, v2.f.D(1));
                                        return kotlin.Unit.a;
                                }
                            }
                        };
                        r.d = function2;
                    }
                    return;
            }
        } else {
            nVar.S();
        }
        r = nVar.r();
        if (r != null) {
            final int i8 = 1;
            function2 = new kotlin.jvm.functions.Function2(this, c0Var, i, i8) { // from class: b12.h
                public final /* synthetic */ int a;
                public final /* synthetic */ com.truecaller.messaging.conversation.fraud.ReportingFlowActivity b;
                public final /* synthetic */ b12.c0 c;

                {
                    this.a = i8;
                    this.b = this;
                }

                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    int i82 = this.a;
                    b12.c0 c0Var2 = this.c;
                    com.truecaller.messaging.conversation.fraud.ReportingFlowActivity reportingFlowActivity = this.b;
                    v2.n nVar2 = (v2.n) obj;
                    ((java.lang.Integer) obj2).getClass();
                    int i9 = com.truecaller.messaging.conversation.fraud.ReportingFlowActivity.e0;
                    switch (i82) {
                        case 0:
                            reportingFlowActivity.s0(c0Var2, nVar2, v2.f.D(1));
                            return kotlin.Unit.a;
                        default:
                            reportingFlowActivity.s0(c0Var2, nVar2, v2.f.D(1));
                            return kotlin.Unit.a;
                    }
                }
            };
            r.d = function2;
        }
    }
}
