package com.truecaller.editprofile.impl.ui.legacy;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class a implements android.view.View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.editprofile.impl.ui.legacy.d b;

    public /* synthetic */ a(com.truecaller.editprofile.impl.ui.legacy.d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.text.Editable text;
        int i = this.a;
        com.truecaller.editprofile.impl.ui.legacy.d dVar = this.b;
        switch (i) {
            case 0:
                ((com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6()).p2(false);
                return;
            case 1:
                dVar.f6();
                return;
            case 2:
                ((com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6()).p2(false);
                return;
            case 3:
                bd.bar.u(((com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6()).r, "ChangeVerifiedNamePopup", "editProfile");
                androidx.fragment.app.g1 childFragmentManager = dVar.getChildFragmentManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                com.truecaller.common.ui.dialogs.qux.b(childFragmentManager, "TAG_EDIT_VERIFIED_NAME_DIALOG", 2132020746, 2132020745, 2131232599, 2132021582, 2132021579, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 384);
                return;
            default:
                com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6();
                com.truecaller.editprofile.impl.ui.legacy.i iVar = null;
                sVar.x = null;
                com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar != null && (text = ((android.widget.EditText) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).s.getValue()).getText()) != null) {
                    text.clear();
                }
                com.truecaller.editprofile.impl.ui.legacy.i j2 = sVar.j2();
                if (j2 != null) {
                    iVar = com.truecaller.editprofile.impl.ui.legacy.i.a(j2, null, null, null, null, null, null, null, null, null, null, "", null, 7167);
                }
                sVar.x2(iVar);
                return;
        }
    }
}
