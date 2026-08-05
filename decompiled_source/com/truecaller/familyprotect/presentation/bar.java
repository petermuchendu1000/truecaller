package com.truecaller.familyprotect.presentation;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class bar implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.familyprotect.presentation.FamilyGroupMainActivity b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ java.lang.String d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ bar(com.truecaller.familyprotect.presentation.FamilyGroupMainActivity familyGroupMainActivity, java.lang.String str, java.lang.String str2, boolean z, int i) {
        this.a = i;
        this.b = familyGroupMainActivity;
        this.c = str;
        this.d = str2;
        this.e = z;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        switch (this.a) {
            case 0:
                v2.n nVar = (v2.n) obj;
                int intValue = ((java.lang.Integer) obj2).intValue();
                int i = com.truecaller.familyprotect.presentation.FamilyGroupMainActivity.j0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (nVar.P(intValue & 1, z)) {
                    yp.d0.o(false, d3.a.d(1426614797, new com.truecaller.familyprotect.presentation.bar(this.b, this.c, this.d, this.e, 1), nVar), nVar, 48, 1);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
            default:
                v2.n nVar2 = (v2.n) obj;
                int intValue2 = ((java.lang.Integer) obj2).intValue();
                int i2 = com.truecaller.familyprotect.presentation.FamilyGroupMainActivity.j0;
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (nVar2.P(intValue2 & 1, z2)) {
                    com.truecaller.familyprotect.presentation.FamilyGroupMainActivity familyGroupMainActivity = this.b;
                    rq0.l lVar = familyGroupMainActivity.e0;
                    if (lVar != null) {
                        wl1.bar barVar = (wl1.bar) lVar.b;
                        if (barVar.a.a.a("featureActivityRecognition", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG) && barVar.b.d(x42.b.c)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean b = ((wk1.qux) lVar.c).b(tj1.h.a);
                        if (z3 && !b) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        boolean c = ((gk1.bar) lVar.a).f.c();
                        if (z4 || c) {
                            z5 = false;
                        }
                        jm1.a aVar = new jm1.a(z5);
                        boolean h = nVar2.h(familyGroupMainActivity);
                        java.lang.Object M = nVar2.M();
                        v2.c cVar = v2.k.a;
                        if (h || M == cVar) {
                            com.truecaller.blockinglevel.presentation.qux quxVar = new com.truecaller.blockinglevel.presentation.qux(0, familyGroupMainActivity, com.truecaller.familyprotect.presentation.FamilyGroupMainActivity.class, "finish", "finish()V", 0, 8);
                            nVar2.k0(quxVar);
                            M = quxVar;
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.reflect.KFunction) M;
                        boolean h2 = nVar2.h(familyGroupMainActivity);
                        java.lang.Object M2 = nVar2.M();
                        if (h2 || M2 == cVar) {
                            com.truecaller.blockinglevel.presentation.qux quxVar2 = new com.truecaller.blockinglevel.presentation.qux(0, familyGroupMainActivity, com.truecaller.familyprotect.presentation.FamilyGroupMainActivity.class, "navigateToFamilyProtectionConfigSettings", "navigateToFamilyProtectionConfigSettings()V", 0, 9);
                            nVar2.k0(quxVar2);
                            M2 = quxVar2;
                        }
                        kotlin.jvm.functions.Function0 function02 = (kotlin.reflect.KFunction) M2;
                        boolean h3 = nVar2.h(familyGroupMainActivity);
                        java.lang.Object M3 = nVar2.M();
                        if (h3 || M3 == cVar) {
                            M3 = new ah3.o(2, familyGroupMainActivity, com.truecaller.familyprotect.presentation.FamilyGroupMainActivity.class, "sendPendingMemberInviteReminderMessage", "sendPendingMemberInviteReminderMessage(Ljava/lang/String;Lcom/truecaller/familyprotect/uicomponents/bottomsheets/ShareTextClickHandler$DeliveryMethod;)V", 0, 2);
                            nVar2.k0(M3);
                        }
                        kotlin.jvm.functions.Function2 function2 = (kotlin.reflect.KFunction) M3;
                        boolean h4 = nVar2.h(familyGroupMainActivity);
                        java.lang.Object M4 = nVar2.M();
                        if (h4 || M4 == cVar) {
                            ah3.o oVar = new ah3.o(2, familyGroupMainActivity, com.truecaller.familyprotect.presentation.FamilyGroupMainActivity.class, "onShareDownloadLinkMethodSelected", "onShareDownloadLinkMethodSelected(Ljava/lang/String;Lcom/truecaller/familyprotect/uicomponents/bottomsheets/ShareTextClickHandler$DeliveryMethod;)V", 0, 3);
                            nVar2.k0(oVar);
                            M4 = oVar;
                        }
                        kotlin.jvm.functions.Function2 function22 = (kotlin.reflect.KFunction) M4;
                        boolean h5 = nVar2.h(familyGroupMainActivity);
                        java.lang.Object M5 = nVar2.M();
                        if (h5 || M5 == cVar) {
                            com.truecaller.blockinglevel.presentation.qux quxVar3 = new com.truecaller.blockinglevel.presentation.qux(0, familyGroupMainActivity, com.truecaller.familyprotect.presentation.FamilyGroupMainActivity.class, "navigateToPremiumPaywall", "navigateToPremiumPaywall()V", 0, 10);
                            nVar2.k0(quxVar3);
                            M5 = quxVar3;
                        }
                        androidx.glance.appwidget.protobuf.d1.d(aVar, this.c, this.d, this.e, (rb.e0) null, function0, function02, function2, function22, (kotlin.reflect.KFunction) M5, nVar2, 0);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("familyGroupNavGraphHelper");
                        throw null;
                    }
                } else {
                    nVar2.S();
                }
                return kotlin.Unit.a;
        }
    }
}
