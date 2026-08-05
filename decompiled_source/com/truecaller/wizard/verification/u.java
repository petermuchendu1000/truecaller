package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class u implements android.content.DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ u(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        int i = this.a;
        java.lang.Object obj = this.b;
        java.lang.Object obj2 = this.c;
        switch (i) {
            case 0:
                i.e eVar = (i.e) obj;
                com.truecaller.wizard.verification.w wVar = (com.truecaller.wizard.verification.w) obj2;
                android.view.Window window = eVar.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(yb0.i.w(2131234500, wVar.requireContext()));
                }
                android.widget.TextView textView = (android.widget.TextView) eVar.findViewById(2131365708);
                if (textView != null) {
                    textView.setText(t41.i.a((java.lang.String) wVar.h.getValue()));
                    return;
                }
                return;
            case 1:
                p02.v3 v3Var = (p02.v3) obj;
                vq.qux quxVar = (vq.qux) obj2;
                p02.u3 u3Var = p02.v3.o;
                android.view.View view = v3Var.getView();
                if (view != null) {
                    gj.m.U(view, new ob2.baz(10, v3Var, quxVar));
                    return;
                }
                return;
            default:
                com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog = (com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog) obj2;
                i.e eVar2 = (i.e) obj;
                reverseOtpDialog.j = eVar2.f(-1);
                reverseOtpDialog.k = eVar2.f(-2);
                reverseOtpDialog.S4();
                ((d.l) eVar2).c.a(reverseOtpDialog, new ah.h0(reverseOtpDialog, 26));
                return;
        }
    }

    public /* synthetic */ u(com.truecaller.wizard.verification.otp.sms.ReverseOtpDialog reverseOtpDialog, i.e eVar) {
        this.a = 2;
        this.c = reverseOtpDialog;
        this.b = eVar;
    }
}
