package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class b implements android.view.ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ com.truecaller.ui.CallMeBackActivity a;

    public b(com.truecaller.ui.CallMeBackActivity callMeBackActivity) {
        this.a = callMeBackActivity;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        com.truecaller.ui.CallMeBackActivity callMeBackActivity = this.a;
        float top = callMeBackActivity.m0.getTop() * 1.5f;
        callMeBackActivity.l0.setTranslationY(top);
        callMeBackActivity.s0.setFloatValues(top, 0.0f);
        callMeBackActivity.s0.start();
        callMeBackActivity.l0.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
