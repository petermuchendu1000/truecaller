package com.truecaller.rewardprogram.impl.ui.qa;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/truecaller/rewardprogram/impl/ui/qa/RewardProgramQaActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "snackbarMessage", "Lcom/truecaller/rewardprogram/impl/ui/qa/components/BonusTasksAlertDialogRequestKey;", "bonusTasksAlertDialogRequestKey", "", "isContributionsAlertDialogOpen", "isRecurringTasksAlertDialogOpen", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RewardProgramQaActivity extends com.truecaller.rewardprogram.impl.ui.qa.Hilt_RewardProgramQaActivity {
    public static final /* synthetic */ int e0 = 0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(com.truecaller.rewardprogram.impl.ui.qa.j.class), new com.truecaller.rewardprogram.impl.ui.qa.d(this, 1), new com.truecaller.rewardprogram.impl.ui.qa.d(this, 0), new com.truecaller.rewardprogram.impl.ui.qa.d(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.rewardprogram.impl.ui.qa.Hilt_RewardProgramQaActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        e.d.a(this, new d3.qux(-1325587383, new com.truecaller.rewardprogram.impl.ui.qa.baz(this, 0), true));
    }

    public final com.truecaller.rewardprogram.impl.ui.qa.j s0() {
        return (com.truecaller.rewardprogram.impl.ui.qa.j) this.d0.getValue();
    }
}
