package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class b extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ com.truecaller.blockinglevel.presentation.BlockLevelActivity j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(com.truecaller.blockinglevel.presentation.BlockLevelActivity blockLevelActivity, int i) {
        super(0);
        this.i = i;
        this.j = blockLevelActivity;
    }

    public final java.lang.Object invoke() {
        switch (this.i) {
            case 0:
                return this.j.getDefaultViewModelProviderFactory();
            case 1:
                return this.j.getViewModelStore();
            default:
                return this.j.getDefaultViewModelCreationExtras();
        }
    }
}
