package com.truecaller.premium.familysharing;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/truecaller/premium/familysharing/FamilySharingDialogActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "com/moloco/sdk/internal/publisher/b0", "androidx/fragment/app/a1", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilySharingDialogActivity extends com.truecaller.premium.familysharing.Hilt_FamilySharingDialogActivity {
    public static final /* synthetic */ int e0 = 0;
    public u62.l d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.premium.familysharing.Hilt_FamilySharingDialogActivity
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
                android.os.Bundle extras = getIntent().getExtras();
                ta2.qux quxVar = new ta2.qux();
                quxVar.setArguments(extras);
                barVar.g(android.R.id.content, quxVar, (java.lang.String) null);
                barVar.l();
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("notificationManager");
            throw null;
        }
    }
}
