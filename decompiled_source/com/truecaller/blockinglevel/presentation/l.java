package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v2.p2 b;
    public final /* synthetic */ v2.p2 c;

    public /* synthetic */ l(v2.p2 p2Var, v2.p2 p2Var2, int i) {
        this.a = i;
        this.b = p2Var;
        this.c = p2Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object invoke() {
        boolean z;
        switch (this.a) {
            case 0:
                return new q3.e0(kotlin.collections.y.j(new q3.r[]{this.b.getValue(), this.c.getValue()}), (java.util.ArrayList) null, (java.lang.Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L), (4294967295L & java.lang.Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) | (java.lang.Float.floatToRawIntBits(0.0f) << 32));
            case 1:
                return new q3.e0(kotlin.collections.y.j(new q3.r[]{this.b.getValue(), this.c.getValue()}), (java.util.ArrayList) null, (java.lang.Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L), (4294967295L & java.lang.Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) | (java.lang.Float.floatToRawIntBits(0.0f) << 32));
            default:
                ly0.a0 a0Var = (ly0.a0) this.b.getValue();
                ly0.w wVar = (ly0.w) this.c.getValue();
                if ((a0Var instanceof ly0.x) && !((ly0.x) a0Var).p && ((wVar instanceof ly0.g) || (wVar instanceof ly0.s))) {
                    z = true;
                } else {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
        }
    }
}
