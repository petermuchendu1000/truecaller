package com.truecaller.sdk.oneStepMid;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/sdk/oneStepMid/OneStepMidVerifyActivity;", "Landroidx/activity/ComponentActivity;", "", "<init>", "()V", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class OneStepMidVerifyActivity extends com.truecaller.sdk.oneStepMid.Hilt_OneStepMidVerifyActivity {
    public static final /* synthetic */ int e0 = 0;
    public bp2.c d0;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r6 == null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.sdk.oneStepMid.Hilt_OneStepMidVerifyActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        bp2.c t0 = t0();
        if (bundle == null) {
            android.content.Intent intent = ((android.app.Activity) t0.e.b).getIntent();
            if (intent != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
        }
        java.lang.String string2 = bundle.getString("requestNonce");
        if (string2 != null && (string = bundle.getString("partnerKey")) != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "partnerId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string2, "requestNonce");
            t0.h = string;
            t0.g = string2;
            t0().a = this;
            fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new bp2.qux(this, null, 1), 3);
            e.d.a(this, new d3.qux(-1191054758, new bp2.baz(this, 0, (byte) 0), true));
        }
        finish();
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new bp2.qux(this, null, 1), 3);
        e.d.a(this, new d3.qux(-1191054758, new bp2.baz(this, 0, (byte) 0), true));
    }

    @Override // com.truecaller.sdk.oneStepMid.Hilt_OneStepMidVerifyActivity
    public final void onDestroy() {
        super.onDestroy();
        t0().m1();
    }

    public final void s0(int i, v2.n nVar) {
        int i2;
        boolean z;
        nVar.b0(1665933808);
        if (nVar.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i3 & 1, z)) {
            dp2.bar.b(t0(), nVar, 432);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new bp2.baz(this, i);
        }
    }

    public final bp2.c t0() {
        bp2.c cVar = this.d0;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }
}
