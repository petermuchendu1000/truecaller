package com.truecaller.afterblockcallpromos;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/afterblockcallpromos/AfterBlockCallPromoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "lf/bar", "after-block-call-promos_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AfterBlockCallPromoActivity extends com.truecaller.afterblockcallpromos.Hilt_AfterBlockCallPromoActivity {
    public static final /* synthetic */ int g0 = 0;
    public com.moloco.sdk.internal.services.bidtoken.t d0;
    public gj2.baz e0;
    public final kotlin.Lazy f0 = kotlin.LazyKt.lazy(new yf0.i4(this, 14));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.afterblockcallpromos.Hilt_AfterBlockCallPromoActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        zb0.b bVar = (zb0.b) this.f0.getValue();
        if (bVar == null) {
            finish();
        } else {
            e.d.a(this, new d3.qux(-1277557625, new zb0.bar(this, bVar, 0), true));
        }
    }
}
