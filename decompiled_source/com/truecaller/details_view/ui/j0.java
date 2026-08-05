package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class j0 implements g.bar, u6.v, p.x1, androidx.fragment.app.l1, wc.f, wc.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.details_view.ui.DetailsViewActivityLegacy b;

    public /* synthetic */ j0(com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy, int i) {
        this.a = i;
        this.b = detailsViewActivityLegacy;
    }

    public void h(android.os.Bundle bundle, java.lang.String str) {
        com.truecaller.details_view.ui.s0 s0Var;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "result");
        boolean z = bundle.getBoolean("extra_can_close_survey");
        gb1.d z0 = this.b.z0();
        z0.F = !z;
        if (z && (s0Var = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) z0).a) != null) {
            s0Var.c();
        }
    }

    public void onActivityResult(java.lang.Object obj) {
        boolean z;
        com.truecaller.data.entity.Contact contact;
        int i = this.a;
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.b;
        androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
        switch (i) {
            case 0:
                int i2 = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                int i3 = 0;
                if (activityResult.a == -1) {
                    z = true;
                } else {
                    z = false;
                }
                com.truecaller.details_view.ui.i0 i0Var = (com.truecaller.details_view.ui.i0) detailsViewActivityLegacy.B0();
                fg3.h0.J(i0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.d0(i0Var, z, null, i3), 3);
                return;
            default:
                int i4 = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                int i5 = activityResult.a;
                android.content.Intent intent = activityResult.b;
                if (i5 == -1 && intent != null && (contact = (com.truecaller.data.entity.Contact) ((android.os.Parcelable) g6.b.g(intent, "contact", com.truecaller.data.entity.Contact.class))) != null) {
                    com.truecaller.details_view.ui.t B0 = detailsViewActivityLegacy.B0();
                    java.lang.String stringExtra = intent.getStringExtra("originalContactName");
                    com.truecaller.details_view.ui.i0 i0Var2 = (com.truecaller.details_view.ui.i0) B0;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
                    i0Var2.h0 = fg3.h0.J(i0Var2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ag2.qux(contact, stringExtra, i0Var2, (df3.bar) null, 27), 3);
                    return;
                }
                return;
        }
    }

    public u6.z1 onApplyWindowInsets(android.view.View view, u6.z1 z1Var) {
        int i = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(z1Var, "insets");
        int i2 = z1Var.a.g(1).b;
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.b;
        detailsViewActivityLegacy.L0 = i2;
        ea1.bar barVar = detailsViewActivityLegacy.C0;
        if (barVar != null) {
            d6.j L = barVar.p.L(2131363782);
            ea1.bar barVar2 = detailsViewActivityLegacy.C0;
            if (barVar2 != null) {
                L.n(barVar2.d.getId(), detailsViewActivityLegacy.L0);
                ea1.bar barVar3 = detailsViewActivityLegacy.C0;
                if (barVar3 != null) {
                    d6.j L2 = barVar3.p.L(2131363068);
                    ea1.bar barVar4 = detailsViewActivityLegacy.C0;
                    if (barVar4 != null) {
                        L2.n(barVar4.d.getId(), detailsViewActivityLegacy.L0);
                        return z1Var;
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
        kotlin.jvm.internal.Intrinsics.d(menuItem);
        this.b.onOptionsItemSelected(menuItem);
        return true;
    }
}
