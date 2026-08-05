package com.truecaller.premium.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/premium/ui/PremiumObtainedDialogActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PremiumObtainedDialogActivity extends com.truecaller.premium.ui.Hilt_PremiumObtainedDialogActivity {
    public static final /* synthetic */ int k0 = 0;
    public final kotlin.Lazy d0 = gj.m.J(this, 2131363494);
    public final kotlin.Lazy e0 = gj.m.J(this, 2131363495);
    public final kotlin.Lazy f0 = gj.m.J(this, 2131364318);
    public final kotlin.Lazy g0 = gj.m.J(this, 2131366405);
    public final kotlin.Lazy h0 = gj.m.J(this, 2131364553);
    public nc0.bar i0;
    public rq0.l j0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.premium.ui.Hilt_PremiumObtainedDialogActivity
    public final void onCreate(android.os.Bundle bundle) {
        boolean z;
        java.lang.String str;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        java.lang.String stringExtra = getIntent().getStringExtra("ARG_LEVEL");
        final int i = 1;
        final int i2 = 0;
        if (!kotlin.text.y.p(stringExtra, com.truecaller.premium.data.tier.PremiumTierType.GOLD.getId(), true) && !kotlin.text.y.p(stringExtra, com.truecaller.premium.data.tier.PremiumTierType.GOLD_FAMILY.getId(), true)) {
            z = false;
        } else {
            z = true;
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("ARG_ANALYTICS_LAUNCH_CONTEXT");
        if (stringExtra2 == null) {
            stringExtra2 = "unknown";
        }
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        getTheme().applyStyle(2132083915, false);
        d.m.b(this, new d.k0(0, 0, 1, d.j0.l), 2);
        setContentView(2131559022);
        kotlin.Lazy lazy = this.e0;
        ((android.widget.TextView) lazy.getValue()).setText(getIntent().getStringExtra("ARG_TITLE"));
        ((android.widget.TextView) this.d0.getValue()).setText(getIntent().getStringExtra("ARG_TEXT"));
        if (z) {
            ((android.widget.ImageView) this.h0.getValue()).setImageResource(2131232688);
            ((android.widget.TextView) lazy.getValue()).setTextColor(getColor(2131101103));
        }
        ((android.widget.TextView) this.f0.getValue()).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: be2.m
            public final /* synthetic */ com.truecaller.premium.ui.PremiumObtainedDialogActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.premium.ui.PremiumObtainedDialogActivity, android.app.Activity] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i3 = i2;
                ?? r0 = this.b;
                switch (i3) {
                    case 0:
                        int i4 = com.truecaller.premium.ui.PremiumObtainedDialogActivity.k0;
                        r0.finish();
                        return;
                    default:
                        rq0.l lVar = r0.j0;
                        if (lVar != null) {
                            lVar.Q();
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("premiumShareSheetHelper");
                            throw null;
                        }
                }
            }
        });
        ((android.widget.TextView) this.g0.getValue()).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: be2.m
            public final /* synthetic */ com.truecaller.premium.ui.PremiumObtainedDialogActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.premium.ui.PremiumObtainedDialogActivity, android.app.Activity] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i3 = i;
                ?? r0 = this.b;
                switch (i3) {
                    case 0:
                        int i4 = com.truecaller.premium.ui.PremiumObtainedDialogActivity.k0;
                        r0.finish();
                        return;
                    default:
                        rq0.l lVar = r0.j0;
                        if (lVar != null) {
                            lVar.Q();
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("premiumShareSheetHelper");
                            throw null;
                        }
                }
            }
        });
        if (z) {
            str = "gotGoldDialog";
        } else {
            str = "gotPremiumDialog";
        }
        nc0.bar barVar = this.i0;
        if (barVar != null) {
            bd.bar.u(barVar, str, stringExtra2);
        } else {
            kotlin.jvm.internal.Intrinsics.n("analytics");
            throw null;
        }
    }
}
