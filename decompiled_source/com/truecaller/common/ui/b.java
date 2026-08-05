package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class b extends w31.c {
    public final kotlin.Lazy l0;
    public final kotlin.Lazy m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final u03.f0 f0Var) {
        super(f0Var, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f0Var, "resourceProvider");
        final int i = 0;
        this.l0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.truecaller.common.ui.a
            public final java.lang.Object invoke() {
                int b;
                int i2 = i;
                u03.g0 g0Var = f0Var;
                switch (i2) {
                    case 0:
                        b = g0Var.b(2131101947);
                        break;
                    default:
                        b = g0Var.b(2131101542);
                        break;
                }
                return java.lang.Integer.valueOf(b);
            }
        });
        final int i2 = 1;
        this.m0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.truecaller.common.ui.a
            public final java.lang.Object invoke() {
                int b;
                int i22 = i2;
                u03.g0 g0Var = f0Var;
                switch (i22) {
                    case 0:
                        b = g0Var.b(2131101947);
                        break;
                    default:
                        b = g0Var.b(2131101542);
                        break;
                }
                return java.lang.Integer.valueOf(b);
            }
        });
    }

    @Override // w31.c
    public final int v2() {
        return ((java.lang.Number) this.m0.getValue()).intValue();
    }

    @Override // w31.c
    public final int w2() {
        return ((java.lang.Number) this.l0.getValue()).intValue();
    }
}
