package com.truecaller.surveys.ui.reportProfile;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/surveys/ui/reportProfile/ReportProfileSurveyActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReportProfileSurveyActivity extends com.truecaller.surveys.ui.reportProfile.Hilt_ReportProfileSurveyActivity {
    public static final /* synthetic */ int j0 = 0;
    public d91.n0 e0;
    public final androidx.lifecycle.o1 d0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(rv2.v.class), new kv2.a(this, 1), new kv2.a(this, 0), new kv2.a(this, 2));
    public final lv2.d f0 = new lv2.d();
    public final lv2.b g0 = new lv2.b();
    public final lv2.qux h0 = new lv2.qux();
    public final lv2.f i0 = new lv2.f();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.surveys.ui.reportProfile.Hilt_ReportProfileSurveyActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        int i = 1;
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        df3.bar barVar = null;
        androidx.constraintlayout.widget.ConstraintLayout inflate = android.view.LayoutInflater.from(this).inflate(2131558498, (android.view.ViewGroup) null, false);
        int i2 = 2131362277;
        if (df0.qux.o(2131362277, inflate) != null) {
            i2 = 2131365411;
            android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131365411, inflate);
            if (textView != null) {
                i2 = 2131366063;
                android.widget.Button button = (android.widget.Button) df0.qux.o(2131366063, inflate);
                if (button != null) {
                    i2 = 2131366736;
                    androidx.recyclerview.widget.RecyclerView o = df0.qux.o(2131366736, inflate);
                    if (o != null) {
                        i2 = 2131367033;
                        if (((android.widget.TextView) df0.qux.o(2131367033, inflate)) != null) {
                            i2 = 2131367108;
                            androidx.appcompat.widget.Toolbar o2 = df0.qux.o(2131367108, inflate);
                            if (o2 != null) {
                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
                                d91.n0 n0Var = new d91.n0(constraintLayout, textView, button, o, o2);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n0Var, "inflate(...)");
                                this.e0 = n0Var;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                                ak.r0.i(constraintLayout, com.truecaller.common.ui.insets.InsetType.SystemBars);
                                d91.n0 n0Var2 = this.e0;
                                if (n0Var2 != null) {
                                    setContentView(n0Var2.c);
                                    android.content.Intent intent = getIntent();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                                    com.truecaller.data.entity.Contact contact = (android.os.Parcelable) g6.b.g(intent, "KEY_CONTACT", com.truecaller.data.entity.Contact.class);
                                    rv2.v t0 = t0();
                                    if (contact != null) {
                                        t0.getClass();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
                                        c9.bar l = androidx.lifecycle.g1.l(t0);
                                        rm2.e eVar = new rm2.e(t0, contact, barVar, 13);
                                        int i3 = 3;
                                        fg3.h0.J(l, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, eVar, 3);
                                        d91.n0 n0Var3 = this.e0;
                                        if (n0Var3 != null) {
                                            setSupportActionBar((androidx.appcompat.widget.Toolbar) n0Var3.f);
                                            i.baz supportActionBar = getSupportActionBar();
                                            if (supportActionBar != null) {
                                                supportActionBar.v(2131233387);
                                            }
                                            i.baz supportActionBar2 = getSupportActionBar();
                                            if (supportActionBar2 != null) {
                                                supportActionBar2.p(true);
                                            }
                                            i.baz supportActionBar3 = getSupportActionBar();
                                            if (supportActionBar3 != null) {
                                                supportActionBar3.t(false);
                                            }
                                            d91.n0 n0Var4 = this.e0;
                                            if (n0Var4 != null) {
                                                n0Var4.b.setAdapter(new androidx.recyclerview.widget.i(new androidx.recyclerview.widget.h1[]{this.i0, this.f0, this.g0, this.h0}));
                                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new kv2.baz(this, barVar, i), 3);
                                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new kv2.baz(this, barVar, i3), 3);
                                                ge0.i.m(getOnBackPressedDispatcher(), (androidx.lifecycle.d0) null, new jm2.p(this, 29), 3);
                                                return;
                                            }
                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                        throw null;
                                    }
                                    throw new java.lang.IllegalArgumentException("Required value was null.");
                                }
                                kotlin.jvm.internal.Intrinsics.n("binding");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public final boolean onSupportNavigateUp() {
        rv2.v t0 = t0();
        t0.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(t0), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r23.d(t0, null, 3), 3);
        return true;
    }

    public final rv2.v t0() {
        return (rv2.v) this.d0.getValue();
    }
}
