package com.truecaller.qa.badges.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/qa/badges/ui/ContactBadgeQaActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ContactBadgeQaActivity extends com.truecaller.qa.badges.ui.Hilt_ContactBadgeQaActivity {
    public static final /* synthetic */ int g0 = 0;
    public d41.a d0;
    public final androidx.lifecycle.o1 e0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ei2.e.class), new ei2.qux(this, 1), new ei2.qux(this, 0), new ei2.qux(this, 2));
    public final kotlin.Lazy f0 = kotlin.LazyKt.lazy(new e31.bar(this, 5));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.qa.badges.ui.Hilt_ContactBadgeQaActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        df3.bar barVar = null;
        androidx.constraintlayout.widget.ConstraintLayout inflate = getLayoutInflater().inflate(2131558460, (android.view.ViewGroup) null, false);
        int i = 2131365877;
        android.widget.Button button = (android.widget.Button) df0.qux.o(2131365877, inflate);
        if (button != null) {
            i = 2131365882;
            androidx.recyclerview.widget.RecyclerView o = df0.qux.o(2131365882, inflate);
            if (o != null) {
                i = 2131365883;
                android.widget.EditText editText = (android.widget.EditText) df0.qux.o(2131365883, inflate);
                if (editText != null) {
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
                    d41.a aVar = new d41.a(constraintLayout, button, o, editText, 2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                    this.d0 = aVar;
                    setContentView(constraintLayout);
                    d41.a aVar2 = this.d0;
                    if (aVar2 != null) {
                        ((androidx.recyclerview.widget.RecyclerView) aVar2.d).setAdapter((ei2.c) this.f0.getValue());
                        d41.a aVar3 = this.d0;
                        if (aVar3 != null) {
                            ((androidx.recyclerview.widget.RecyclerView) aVar3.d).setItemAnimator((androidx.recyclerview.widget.p1) null);
                            d41.a aVar4 = this.d0;
                            if (aVar4 != null) {
                                ((android.widget.Button) aVar4.c).setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(this, 15));
                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ei2.baz(this, barVar, 1), 3);
                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ei2.baz(this, barVar, 3), 3);
                                return;
                            }
                            kotlin.jvm.internal.Intrinsics.n("binding");
                            throw null;
                        }
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
