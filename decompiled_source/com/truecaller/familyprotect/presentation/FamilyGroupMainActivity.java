package com.truecaller.familyprotect.presentation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/familyprotect/presentation/FamilyGroupMainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyGroupMainActivity extends com.truecaller.familyprotect.presentation.Hilt_FamilyGroupMainActivity {
    public static final /* synthetic */ int j0 = 0;
    public uq2.baz d0;
    public rq0.l e0;
    public to1.e f0;
    public p7.bar g0;
    public a8.l h0;
    public i82.t i0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.familyprotect.presentation.Hilt_FamilyGroupMainActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.s(this, ex2.a.a);
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("start_destination");
        if (stringExtra == null) {
            stringExtra = "familyprotect/home";
        }
        e.d.a(this, new d3.qux(1486439345, new com.truecaller.familyprotect.presentation.bar(this, stringExtra, getIntent().getStringExtra("nested_destination"), getIntent().getBooleanExtra("is_popup_inclusive", false), 0), true));
    }
}
