package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class o0 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ android.view.View b;

    public /* synthetic */ o0(android.view.View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        android.view.View view = this.b;
        switch (i) {
            case 0:
                int i2 = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
                view.requestLayout();
                view.invalidate();
                return;
            case 1:
                ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService(android.view.inputmethod.InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 2:
                view.setEnabled(false);
                return;
            default:
                ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
        }
    }
}
