package com.truecaller.call_assistant.presentation.disable;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class bar implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.call_assistant.presentation.disable.AssistantDisableActivity b;

    public /* synthetic */ bar(com.truecaller.call_assistant.presentation.disable.AssistantDisableActivity assistantDisableActivity, int i) {
        this.a = i;
        this.b = assistantDisableActivity;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z;
        boolean z2 = false;
        int i = 1;
        switch (this.a) {
            case 0:
                v2.n nVar = (v2.n) obj;
                int intValue = ((java.lang.Integer) obj2).intValue();
                int i2 = com.truecaller.call_assistant.presentation.disable.AssistantDisableActivity.e0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (nVar.P(intValue & 1, z)) {
                    yp.d0.o(false, d3.a.d(-1170801047, new com.truecaller.call_assistant.presentation.disable.bar(this.b, i), nVar), nVar, 48, 1);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
            default:
                v2.n nVar2 = (v2.n) obj;
                int intValue2 = ((java.lang.Integer) obj2).intValue();
                int i3 = com.truecaller.call_assistant.presentation.disable.AssistantDisableActivity.e0;
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (nVar2.P(intValue2 & 1, z2)) {
                    com.truecaller.call_assistant.presentation.disable.AssistantDisableActivity assistantDisableActivity = this.b;
                    com.truecaller.call_assistant.presentation.disable.g gVar = (com.truecaller.call_assistant.presentation.disable.g) assistantDisableActivity.d0.getValue();
                    boolean h = nVar2.h(assistantDisableActivity);
                    java.lang.Object M = nVar2.M();
                    v2.c cVar = v2.k.a;
                    if (h || M == cVar) {
                        M = new com.truecaller.blockinglevel.presentation.qux(0, assistantDisableActivity, com.truecaller.call_assistant.presentation.disable.AssistantDisableActivity.class, "finish", "finish()V", 0, 4);
                        nVar2.k0(M);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.reflect.KFunction) M;
                    boolean h2 = nVar2.h(assistantDisableActivity);
                    java.lang.Object M2 = nVar2.M();
                    java.lang.Object obj3 = M2;
                    if (h2 || M2 == cVar) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar barVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(assistantDisableActivity, 14);
                        nVar2.k0(barVar);
                        obj3 = barVar;
                    }
                    com.truecaller.call_assistant.presentation.disable.b.a(null, gVar, function0, (kotlin.jvm.functions.Function0) obj3, nVar2, 0);
                } else {
                    nVar2.S();
                }
                return kotlin.Unit.a;
        }
    }
}
