package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class q0 extends j41.bar {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ com.truecaller.details_view.ui.s0 c;

    public q0(int i, int i2, com.truecaller.details_view.ui.s0 s0Var) {
        this.a = i;
        this.b = i2;
        this.c = s0Var;
    }

    public final void a(int i) {
        c(null, java.lang.Integer.valueOf(i));
    }

    public final void b(float f) {
        c(java.lang.Float.valueOf(f), null);
    }

    public final void c(java.lang.Float f, java.lang.Integer num) {
        int i;
        if ((f != null && f.floatValue() > 0.5f) || (num != null && num.intValue() == 2131363068)) {
            i = this.a;
        } else {
            i = this.b;
        }
        this.c.e(i);
    }
}
