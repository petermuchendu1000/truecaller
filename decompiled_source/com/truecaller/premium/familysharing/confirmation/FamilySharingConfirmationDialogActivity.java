package com.truecaller.premium.familysharing.confirmation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/premium/familysharing/confirmation/FamilySharingConfirmationDialogActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "i61/bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilySharingConfirmationDialogActivity extends com.truecaller.premium.familysharing.confirmation.Hilt_FamilySharingConfirmationDialogActivity {
    public static final /* synthetic */ int e0 = 0;
    public u62.l d0;

    public static final android.content.Intent t0(com.truecaller.qa.QMActivity qMActivity, com.truecaller.data.entity.messaging.Participant participant) {
        return i61.bar.j(qMActivity, participant, "familySharing_screen");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.premium.familysharing.confirmation.Hilt_FamilySharingConfirmationDialogActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        android.content.res.Resources.Theme theme = getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        yy.qux.n(theme, true);
        d.m.b(this, new d.k0(0, 0, 1, d.j0.l), 2);
        if (bundle == null) {
            u62.l lVar = this.d0;
            if (lVar != null) {
                lVar.a(2131363822, com.truecaller.analytics.common.event.PushNotificationSource.Firebase, "familySharingConfirmation_dialog");
                androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
                com.truecaller.data.entity.messaging.Participant participant = (com.truecaller.data.entity.messaging.Participant) getIntent().getParcelableExtra("FamilySharingConfirmationDialogFragment.Participant");
                java.lang.String stringExtra = getIntent().getStringExtra("ANALYTICS_LAUNCH_CONTEXT");
                if (stringExtra == null) {
                    stringExtra = "unknown";
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "analyticsLaunchContext");
                va2.baz bazVar = new va2.baz();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putParcelable("FamilySharingConfirmationDialogFragment.Participant", participant);
                bundle2.putString("ANALYTICS_LAUNCH_CONTEXT", stringExtra);
                bazVar.setArguments(bundle2);
                barVar.g(android.R.id.content, bazVar, (java.lang.String) null);
                barVar.l();
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("notificationManager");
            throw null;
        }
    }
}
