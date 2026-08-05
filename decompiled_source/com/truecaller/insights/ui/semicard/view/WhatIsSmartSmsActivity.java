package com.truecaller.insights.ui.semicard.view;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/insights/ui/semicard/view/WhatIsSmartSmsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class WhatIsSmartSmsActivity extends com.truecaller.insights.ui.semicard.view.Hilt_WhatIsSmartSmsActivity {
    public r31.bar d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.insights.ui.semicard.view.Hilt_WhatIsSmartSmsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        setContentView(2131558513);
        f13.b bVar = this.d0;
        if (bVar != null) {
            bVar.k("smart_notifications_clicked", true);
            java.lang.String stringExtra = getIntent().getStringExtra("sender_id");
            boolean booleanExtra = getIntent().getBooleanExtra("is_im", false);
            az1.j.q.getClass();
            rd0.bar.f(stringExtra, "smart_notif", booleanExtra, true).show(getSupportFragmentManager(), az1.j.s);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("coreSettings");
        throw null;
    }
}
