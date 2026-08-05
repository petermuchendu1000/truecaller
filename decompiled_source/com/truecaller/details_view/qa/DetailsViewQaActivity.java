package com.truecaller.details_view.qa;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/details_view/qa/DetailsViewQaActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DetailsViewQaActivity extends com.truecaller.details_view.qa.Hilt_DetailsViewQaActivity {
    public static final /* synthetic */ int Q0 = 0;
    public u03.baz e0;
    public xd0.qux f0;
    public u03.b g0;
    public up2.qux h0;
    public ej.b i0;
    public nd1.bar j0;
    public java.lang.String d0 = "+46735358210";
    public final kotlin.Lazy k0 = gj.m.J(this, 2131366178);
    public final kotlin.Lazy l0 = gj.m.J(this, 2131364392);
    public final kotlin.Lazy m0 = gj.m.J(this, 2131364393);
    public final kotlin.Lazy n0 = gj.m.J(this, 2131364394);
    public final kotlin.Lazy o0 = gj.m.J(this, 2131364395);
    public final kotlin.Lazy p0 = gj.m.J(this, 2131364403);
    public final kotlin.Lazy q0 = gj.m.J(this, 2131364404);
    public final kotlin.Lazy r0 = gj.m.J(this, 2131364405);
    public final kotlin.Lazy s0 = gj.m.J(this, 2131364406);
    public final kotlin.Lazy t0 = gj.m.J(this, 2131364407);
    public final kotlin.Lazy u0 = gj.m.J(this, 2131364408);
    public final kotlin.Lazy v0 = gj.m.J(this, 2131364409);
    public final kotlin.Lazy w0 = gj.m.J(this, 2131364410);
    public final kotlin.Lazy x0 = gj.m.J(this, 2131364411);
    public final kotlin.Lazy y0 = gj.m.J(this, 2131364412);
    public final kotlin.Lazy z0 = gj.m.J(this, 2131364745);
    public final kotlin.Lazy A0 = gj.m.J(this, 2131364746);
    public final kotlin.Lazy B0 = gj.m.J(this, 2131364752);
    public final kotlin.Lazy C0 = gj.m.J(this, 2131364753);
    public final kotlin.Lazy D0 = gj.m.J(this, 2131364754);
    public final kotlin.Lazy E0 = gj.m.J(this, 2131364758);
    public final kotlin.Lazy F0 = gj.m.J(this, 2131364759);
    public final kotlin.Lazy G0 = gj.m.J(this, 2131364756);
    public final kotlin.Lazy H0 = gj.m.J(this, 2131364760);
    public final kotlin.Lazy I0 = gj.m.J(this, 2131365575);
    public final kotlin.Lazy J0 = gj.m.J(this, 2131366435);
    public final kotlin.Lazy K0 = gj.m.J(this, 2131367352);
    public final kotlin.Lazy L0 = gj.m.J(this, 2131366732);
    public final kotlin.Lazy M0 = gj.m.J(this, 2131366729);
    public final kotlin.Lazy N0 = gj.m.J(this, 2131364748);
    public final kotlin.Lazy O0 = gj.m.J(this, 2131364751);
    public final kotlin.Lazy P0 = gj.m.J(this, 2131365418);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.details_view.qa.Hilt_DetailsViewQaActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        u03.c cVar = this.g0;
        if (cVar != null) {
            if (!cVar.v()) {
                if (this.g0 != null) {
                    finish();
                } else {
                    kotlin.jvm.internal.Intrinsics.n("deviceInfoUtil");
                    throw null;
                }
            }
            yy.qux.C(this, 2);
            setContentView(2131558471);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.k0.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "<get-root>(...)");
            ak.r0.i(linearLayout, com.truecaller.common.ui.insets.InsetType.SystemBars);
            ((android.widget.Button) this.I0.getValue()).setOnClickListener(new gr2.bar(this, 3));
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("deviceInfoUtil");
        throw null;
    }

    public final java.lang.String t0(java.lang.String str) {
        if (((com.truecaller.common.ui.switchmaterial.SwitchMaterialX) this.K0.getValue()).isChecked()) {
            return "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, \n        |quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse \n        |cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est \n        |laborum.";
        }
        return str;
    }
}
