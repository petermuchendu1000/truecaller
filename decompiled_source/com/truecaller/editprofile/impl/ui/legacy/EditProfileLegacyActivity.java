package com.truecaller.editprofile.impl.ui.legacy;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/editprofile/impl/ui/legacy/EditProfileLegacyActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EditProfileLegacyActivity extends com.truecaller.editprofile.impl.ui.legacy.Hilt_EditProfileLegacyActivity {
    public static final /* synthetic */ int d0 = 0;

    public final void onBackPressed() {
        for (androidx.fragment.app.Fragment fragment : getSupportFragmentManager().c.f()) {
            if (fragment instanceof com.truecaller.editprofile.impl.ui.legacy.d) {
                ((com.truecaller.editprofile.impl.ui.legacy.d) fragment).f6();
                return;
            }
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.editprofile.impl.ui.legacy.Hilt_EditProfileLegacyActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        com.truecaller.editprofile.api.ui.AutoFocusOnField autoFocusOnField = (com.truecaller.editprofile.api.ui.AutoFocusOnField) g6.b.h(intent, "autoFocusOnField", com.truecaller.editprofile.api.ui.AutoFocusOnField.class);
        java.lang.String stringExtra = getIntent().getStringExtra("extraAnalyticsContext");
        boolean booleanExtra = getIntent().getBooleanExtra("validateProfile", false);
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
        com.truecaller.editprofile.impl.ui.legacy.d dVar = new com.truecaller.editprofile.impl.ui.legacy.d();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putSerializable("ARG_ANALYTICS_CONTEXT", stringExtra);
        bundle2.putSerializable("ARG_AUTO_FOCUS_ON_FIELD", autoFocusOnField);
        bundle2.putBoolean("ARG_VALIDATE_PROFILE", booleanExtra);
        dVar.setArguments(bundle2);
        barVar.g(android.R.id.content, dVar, (java.lang.String) null);
        barVar.l();
    }
}
