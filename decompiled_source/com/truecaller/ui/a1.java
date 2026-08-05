package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class a1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ kotlin.Lazy j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(kotlin.Lazy lazy, int i) {
        super(0);
        this.i = i;
        this.j = lazy;
    }

    public final java.lang.Object invoke() {
        androidx.lifecycle.n nVar;
        switch (this.i) {
            case 0:
                return ((androidx.lifecycle.u1) this.j.getValue()).getViewModelStore();
            default:
                androidx.lifecycle.n nVar2 = (androidx.lifecycle.u1) this.j.getValue();
                if (nVar2 instanceof androidx.lifecycle.n) {
                    nVar = nVar2;
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    return nVar.getDefaultViewModelCreationExtras();
                }
                return a9.bar.b;
        }
    }
}
