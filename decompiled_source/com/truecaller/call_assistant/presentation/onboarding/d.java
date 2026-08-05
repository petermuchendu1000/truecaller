package com.truecaller.call_assistant.presentation.onboarding;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class d implements c4.bar {
    public final /* synthetic */ v2.t0 a;
    public final /* synthetic */ v2.a2 b;

    public d(v2.t0 t0Var, v2.a2 a2Var) {
        this.a = t0Var;
        this.b = a2Var;
    }

    public final long E(int i, long j, long j2) {
        int i2 = (int) (j & 4294967295L);
        float f = 0.0f;
        if (java.lang.Float.intBitsToFloat(i2) != 0.0f) {
            this.a.setValue(java.lang.Boolean.TRUE);
        }
        v2.a2 a2Var = this.b;
        float g = a2Var.g() - java.lang.Float.intBitsToFloat(i2);
        if (g >= 0.0f) {
            f = g;
        }
        a2Var.i(f);
        return 0L;
    }

    public final /* bridge */ java.lang.Object r(long j, long j2, df3.bar barVar) {
        return bx.e1.b();
    }

    public final /* bridge */ java.lang.Object r0(long j, df3.bar barVar) {
        return bx.e1.c();
    }

    public final /* bridge */ long v(int i, long j) {
        return 0L;
    }
}
