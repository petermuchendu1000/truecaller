package com.truecaller.familyprotect.presentation.permission;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/familyprotect/presentation/permission/FamilyGroupPermissionHandlerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyGroupPermissionHandlerActivity extends com.truecaller.familyprotect.presentation.permission.Hilt_FamilyGroupPermissionHandlerActivity {
    public static final /* synthetic */ int h0 = 0;
    public wk1.qux d0;
    public uq2.baz e0;
    public final kotlin.Lazy f0 = kotlin.LazyKt.lazy(new jq0.baz(this, 21));
    public final g.baz g0 = registerForActivityResult(new androidx.fragment.app.a1(8), new jc3.bar(this, 11));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.familyprotect.presentation.permission.Hilt_FamilyGroupPermissionHandlerActivity
    public final void onCreate(android.os.Bundle bundle) {
        android.content.Intent c;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        kotlin.Lazy lazy = this.f0;
        tj1.n nVar = (tj1.n) lazy.getValue();
        if (kotlin.jvm.internal.Intrinsics.b(nVar, tj1.l.a)) {
            c = ak.r0.Z(this, false);
        } else if (kotlin.jvm.internal.Intrinsics.b(nVar, tj1.k.a)) {
            c = ak.r0.a0(this, false);
        } else if (kotlin.jvm.internal.Intrinsics.b(nVar, tj1.i.a)) {
            uq2.baz bazVar = this.e0;
            if (bazVar != null) {
                c = k9.d.c(bazVar, this, new com.truecaller.settings.api.SettingsLaunchConfig("familyProtect"), com.truecaller.settings.api.SettingsCategory.SETTINGS_PRIVACY, 8);
            } else {
                kotlin.jvm.internal.Intrinsics.n("settingsRouter");
                throw null;
            }
        } else {
            finish();
            return;
        }
        try {
            this.g0.a(c, (ea.c) null);
        } catch (android.content.ActivityNotFoundException unused) {
            tj1.n nVar2 = (tj1.n) lazy.getValue();
            if (nVar2 != null) {
                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new km1.bar(this, nVar2, null, 1), 3);
            }
        }
    }
}
