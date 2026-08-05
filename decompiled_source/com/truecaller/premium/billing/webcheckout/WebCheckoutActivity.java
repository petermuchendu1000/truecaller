package com.truecaller.premium.billing.webcheckout;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/premium/billing/webcheckout/WebCheckoutActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/razorpay/PaymentResultWithDataListener;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes4.dex */
public final class WebCheckoutActivity extends com.truecaller.premium.billing.webcheckout.Hilt_WebCheckoutActivity implements com.razorpay.PaymentResultWithDataListener {
    public static final /* synthetic */ int h0 = 0;
    public final kotlin.Lazy d0 = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 6));
    public w82.q3 e0;
    public final kotlin.Lazy f0;
    public final kotlin.Lazy g0;

    public WebCheckoutActivity() {
        final int i = 0;
        this.f0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: s82.f
            public final /* synthetic */ com.truecaller.premium.billing.webcheckout.WebCheckoutActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i2 = i;
                bd3.qux quxVar = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.premium.billing.webcheckout.WebCheckoutActivity.h0;
                        java.io.Serializable serializableExtra = quxVar.getIntent().getSerializableExtra("key_subscription");
                        if (!(serializableExtra instanceof r82.w)) {
                            return null;
                        }
                        return (r82.w) serializableExtra;
                    default:
                        int i4 = com.truecaller.premium.billing.webcheckout.WebCheckoutActivity.h0;
                        com.truecaller.premium.provider.Store serializableExtra2 = quxVar.getIntent().getSerializableExtra("key_store");
                        if (!(serializableExtra2 instanceof com.truecaller.premium.provider.Store)) {
                            return null;
                        }
                        return serializableExtra2;
                }
            }
        });
        final int i2 = 1;
        this.g0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: s82.f
            public final /* synthetic */ com.truecaller.premium.billing.webcheckout.WebCheckoutActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i22 = i2;
                bd3.qux quxVar = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.premium.billing.webcheckout.WebCheckoutActivity.h0;
                        java.io.Serializable serializableExtra = quxVar.getIntent().getSerializableExtra("key_subscription");
                        if (!(serializableExtra instanceof r82.w)) {
                            return null;
                        }
                        return (r82.w) serializableExtra;
                    default:
                        int i4 = com.truecaller.premium.billing.webcheckout.WebCheckoutActivity.h0;
                        com.truecaller.premium.provider.Store serializableExtra2 = quxVar.getIntent().getSerializableExtra("key_store");
                        if (!(serializableExtra2 instanceof com.truecaller.premium.provider.Store)) {
                            return null;
                        }
                        return serializableExtra2;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.premium.billing.webcheckout.Hilt_WebCheckoutActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.d0;
        setContentView(((d91.g) lazy.getValue()).a);
        setSupportActionBar(((d91.g) lazy.getValue()).c);
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
        }
        ge0.i.m(getOnBackPressedDispatcher(), this, new ry1.c(this, 9), 2);
        if (bundle == null) {
            r82.w wVar = (r82.w) this.f0.getValue();
            java.io.Serializable serializable = (com.truecaller.premium.provider.Store) this.g0.getValue();
            s82.m mVar = new s82.m();
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putSerializable("arg_subscription", wVar);
            bundle2.putSerializable("arg_store", serializable);
            mVar.setArguments(bundle2);
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
            barVar.g(2131364006, mVar, (java.lang.String) null);
            barVar.l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.razorpay.PaymentResultWithDataListener
    public final void onPaymentError(int i, java.lang.String str, com.razorpay.PaymentData paymentData) {
        if (i != 0) {
            java.lang.String string = getString(2132017964);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) string, 0).show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.razorpay.PaymentResultWithDataListener
    public final void onPaymentSuccess(java.lang.String str, com.razorpay.PaymentData paymentData) {
        if (paymentData != null) {
            w82.q3 q3Var = this.e0;
            if (q3Var != null) {
                q3Var.c(paymentData);
            } else {
                kotlin.jvm.internal.Intrinsics.n("webBillingPurchaseStateManager");
                throw null;
            }
        }
        r82.g0 g0Var = r82.g0.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g0Var, "result");
        fg3.j jVar = f40.d0.h;
        if (jVar != null) {
            we0.bar.C(jVar, g0Var);
        }
        f40.d0.h = null;
        finish();
    }

    public final boolean onSupportNavigateUp() {
        return t0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t0() {
        s82.m mVar;
        androidx.fragment.app.Fragment F = getSupportFragmentManager().F(2131364006);
        if (F instanceof s82.m) {
            mVar = (s82.m) F;
        } else {
            mVar = null;
        }
        if (mVar != null && ((s82.b0) mVar.h.getValue()).p()) {
            return true;
        }
        r82.e0 e0Var = r82.e0.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "result");
        fg3.j jVar = f40.d0.h;
        if (jVar != null) {
            we0.bar.C(jVar, e0Var);
        }
        f40.d0.h = null;
        finish();
        return false;
    }
}
