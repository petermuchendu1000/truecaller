package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class x1 implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ x1(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final java.lang.Object invoke() {
        switch (this.a) {
            case 0:
                com.truecaller.wizard.verification.y1 y1Var = (com.truecaller.wizard.verification.y1) this.b;
                java.lang.String d = y1Var.a.a.d("wizardContactSupport_28661", "");
                if (d.length() == 0) {
                    d = null;
                }
                if (d == null) {
                    return null;
                }
                try {
                    return (com.truecaller.wizard.verification.WizardContactSupportConfig) ((com.google.gson.Gson) y1Var.c.getValue()).fromJson(d, com.truecaller.wizard.verification.WizardContactSupportConfig.class);
                } catch (com.google.gson.s e) {
                    e.getMessage();
                    return null;
                }
            default:
                java.lang.String string = ((com.truecaller.wizard.verification.w) this.b).requireArguments().getString("PhoneNumber");
                if (string == null) {
                    return "";
                }
                return string;
        }
    }
}
