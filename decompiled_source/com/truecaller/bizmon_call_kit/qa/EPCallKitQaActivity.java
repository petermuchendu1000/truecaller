package com.truecaller.bizmon_call_kit.qa;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/bizmon_call_kit/qa/EPCallKitQaActivity;", "Landroidx/activity/ComponentActivity;", "Lfg3/e0;", "<init>", "()V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class EPCallKitQaActivity extends com.truecaller.bizmon_call_kit.qa.Hilt_EPCallKitQaActivity implements fg3.e0 {
    public static final /* synthetic */ int i0 = 0;
    public kotlin.coroutines.CoroutineContext d0;
    public kotlin.coroutines.CoroutineContext e0;
    public qc3.bar f0;
    public final fg3.m2 g0 = fg3.h0.e();
    public final v2.e2 h0 = androidx.compose.runtime.a.h(0);

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.e0;
        if (coroutineContext != null) {
            return coroutineContext.plus(this.g0);
        }
        kotlin.jvm.internal.Intrinsics.n("uiContext");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.bizmon_call_kit.qa.Hilt_EPCallKitQaActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        kotlin.coroutines.CoroutineContext coroutineContext = this.d0;
        if (coroutineContext != null) {
            fg3.h0.J(this, coroutineContext, (fg3.f0) null, new aj0.k(this, null, 0), 2);
            e.d.a(this, new d3.qux(-1947241577, new aj0.i(this, 0), true));
        } else {
            kotlin.jvm.internal.Intrinsics.n("asyncContext");
            throw null;
        }
    }

    @Override // com.truecaller.bizmon_call_kit.qa.Hilt_EPCallKitQaActivity
    public final void onDestroy() {
        super.onDestroy();
        this.g0.cancel((java.util.concurrent.CancellationException) null);
    }
}
