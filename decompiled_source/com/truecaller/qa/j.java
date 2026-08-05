package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class j implements android.view.View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ android.widget.TextView b;

    public /* synthetic */ j(android.widget.TextView textView, int i) {
        this.a = i;
        this.b = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.a;
        android.widget.TextView textView = this.b;
        switch (i) {
            case 0:
                int i2 = com.truecaller.qa.QMActivity.B1;
                textView.setVisibility(8);
                return;
            default:
                gj.m.f0(textView);
                return;
        }
    }
}
