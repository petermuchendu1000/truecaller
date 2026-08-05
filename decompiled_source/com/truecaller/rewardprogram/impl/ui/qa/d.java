package com.truecaller.rewardprogram.impl.ui.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class d extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.truecaller.rewardprogram.impl.ui.qa.RewardProgramQaActivity rewardProgramQaActivity, int i) {
        super(0);
        this.i = i;
        this.j = rewardProgramQaActivity;
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
