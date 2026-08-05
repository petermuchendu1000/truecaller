package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class n0 implements android.view.View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p.y1 b;

    public /* synthetic */ n0(p.y1 y1Var, int i) {
        this.a = i;
        this.b = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.a;
        p.y1 y1Var = this.b;
        switch (i) {
            case 0:
                int i2 = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
                y1Var.b();
                return;
            default:
                y1Var.b();
                return;
        }
    }
}
