package com.truecaller.voicemail.presentation.deactivate;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class d implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.voicemail.presentation.deactivate.VoicemailDeactivateActivity b;

    public /* synthetic */ d(com.truecaller.voicemail.presentation.deactivate.VoicemailDeactivateActivity voicemailDeactivateActivity, int i) {
        this.a = i;
        this.b = voicemailDeactivateActivity;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z;
        boolean z2;
        int i = this.a;
        int i2 = 1;
        v2.n nVar = (v2.n) obj;
        int intValue = ((java.lang.Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = com.truecaller.voicemail.presentation.deactivate.VoicemailDeactivateActivity.e0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (nVar.P(intValue & 1, z)) {
                    yp.d0.o(false, d3.a.d(-566632499, new com.truecaller.voicemail.presentation.deactivate.d(this.b, i2), nVar), nVar, 48, 1);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
            default:
                int i4 = com.truecaller.voicemail.presentation.deactivate.VoicemailDeactivateActivity.e0;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (nVar.P(intValue & 1, z2)) {
                    com.truecaller.voicemail.presentation.deactivate.VoicemailDeactivateActivity voicemailDeactivateActivity = this.b;
                    com.truecaller.voicemail.presentation.deactivate.h hVar = (com.truecaller.voicemail.presentation.deactivate.h) voicemailDeactivateActivity.d0.getValue();
                    boolean h = nVar.h(voicemailDeactivateActivity);
                    java.lang.Object M = nVar.M();
                    if (h || M == v2.k.a) {
                        com.truecaller.blockinglevel.presentation.qux quxVar = new com.truecaller.blockinglevel.presentation.qux(0, voicemailDeactivateActivity, com.truecaller.voicemail.presentation.deactivate.VoicemailDeactivateActivity.class, "finish", "finish()V", 0, 11);
                        nVar.k0(quxVar);
                        M = quxVar;
                    }
                    com.truecaller.voicemail.presentation.deactivate.bar.d(hVar, (kotlin.reflect.KFunction) M, nVar, 0);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
        }
    }
}
