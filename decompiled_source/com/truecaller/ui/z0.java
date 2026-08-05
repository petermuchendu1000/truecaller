package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class z0 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(java.lang.Object obj, int i) {
        super(0);
        this.i = i;
        this.j = obj;
    }

    public final java.lang.Object invoke() {
        switch (this.i) {
            case 0:
                return (com.truecaller.ui.b1) this.j;
            default:
                return (androidx.lifecycle.u1) ((com.truecaller.ui.z0) this.j).invoke();
        }
    }
}
