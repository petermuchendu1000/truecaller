package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class b0 implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kotlin.jvm.internal.e0 b;
    public final /* synthetic */ java.lang.String c;

    public /* synthetic */ b0(kotlin.jvm.internal.e0 e0Var, java.lang.String str, int i) {
        this.a = i;
        this.b = e0Var;
        this.c = str;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                if (this.c.length() > ((java.lang.Integer) obj).intValue()) {
                    z = true;
                } else {
                    z = false;
                }
                this.b.a = z;
                return kotlin.Unit.a;
            default:
                kotlin.jvm.internal.e0 e0Var = this.b;
                boolean z2 = true;
                if (!e0Var.a && kotlin.jvm.internal.Intrinsics.b(obj, this.c)) {
                    e0Var.a = true;
                    z2 = false;
                }
                return java.lang.Boolean.valueOf(z2);
        }
    }
}
