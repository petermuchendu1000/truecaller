package com.truecaller.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ui/DialerShortcutActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class DialerShortcutActivity extends com.truecaller.ui.Hilt_DialerShortcutActivity {
    public static final /* synthetic */ int e0 = 0;
    public s03.bar d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ui.Hilt_DialerShortcutActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if ("android.intent.action.CREATE_SHORTCUT".equals(getIntent().getAction())) {
            z62.d.m("dialerShortcutInstalled", true);
            s03.bar barVar = this.d0;
            if (barVar != null) {
                setResult(-1, h6.e.Q(this, ro0.f.b(barVar, 0)));
            } else {
                kotlin.jvm.internal.Intrinsics.n("shortcutHelper");
                throw null;
            }
        } else {
            android.content.Intent o = y90.m6.o(this, com.truecaller.bottombar.BottomBarButtonType.CALLS, "homescreenShortcut", (java.lang.String) null, (com.truecaller.messaging.data.types.InboxTab) null, 120);
            o.putExtra("is_dial_pad_auto_open", true);
            startActivity(o);
        }
        finish();
    }
}
