package com.truecaller.premium.familysharing.contactpicker;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/premium/familysharing/contactpicker/FamilySharingContactPickerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ze0/c0", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilySharingContactPickerActivity extends com.truecaller.premium.familysharing.contactpicker.Hilt_FamilySharingContactPickerActivity {
    public static final /* synthetic */ int d0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.premium.familysharing.contactpicker.Hilt_FamilySharingContactPickerActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        if (bundle == null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            j.g(android.R.id.content, new wa2.a(), (java.lang.String) null);
            j.l();
        }
        getOnBackPressedDispatcher().a(this, new tn0.b(this, 1));
    }
}
