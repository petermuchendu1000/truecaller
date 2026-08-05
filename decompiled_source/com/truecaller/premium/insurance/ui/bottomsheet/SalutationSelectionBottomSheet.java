package com.truecaller.premium.insurance.ui.bottomsheet;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/premium/insurance/ui/bottomsheet/SalutationSelectionBottomSheet;", "Lvq/a;", "<init>", "()V", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SalutationSelectionBottomSheet extends vq.a {
    public final kotlin.Lazy c = gj.m.K(this, 2131366214);
    public final kotlin.Lazy d = gj.m.K(this, 2131366215);
    public final kotlin.Lazy e = gj.m.K(this, 2131366216);

    public final void onCreate(android.os.Bundle bundle) {
        super/*androidx.fragment.app.t*/.onCreate(bundle);
        setStyle(2, 2132083583);
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        android.view.View inflate = layoutInflater.inflate(2131558617, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        final int i = 0;
        ((android.view.View) this.c.getValue()).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: jb2.bar
            public final /* synthetic */ com.truecaller.premium.insurance.ui.bottomsheet.SalutationSelectionBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i2 = i;
                com.truecaller.premium.insurance.ui.bottomsheet.SalutationSelectionBottomSheet salutationSelectionBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putSerializable("SalutationResult", com.truecaller.premium.insurance.ui.bottomsheet.Salutation.MR);
                        kotlin.Unit unit = kotlin.Unit.a;
                        ll.baz.x(bundle2, salutationSelectionBottomSheet, "SalutationResultCode");
                        android.app.Dialog dialog = salutationSelectionBottomSheet.getDialog();
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    case 1:
                        android.os.Bundle bundle3 = new android.os.Bundle();
                        bundle3.putSerializable("SalutationResult", com.truecaller.premium.insurance.ui.bottomsheet.Salutation.MRS);
                        kotlin.Unit unit2 = kotlin.Unit.a;
                        ll.baz.x(bundle3, salutationSelectionBottomSheet, "SalutationResultCode");
                        android.app.Dialog dialog2 = salutationSelectionBottomSheet.getDialog();
                        if (dialog2 != null) {
                            dialog2.dismiss();
                            return;
                        }
                        return;
                    default:
                        android.os.Bundle bundle4 = new android.os.Bundle();
                        bundle4.putSerializable("SalutationResult", com.truecaller.premium.insurance.ui.bottomsheet.Salutation.MS);
                        kotlin.Unit unit3 = kotlin.Unit.a;
                        ll.baz.x(bundle4, salutationSelectionBottomSheet, "SalutationResultCode");
                        android.app.Dialog dialog3 = salutationSelectionBottomSheet.getDialog();
                        if (dialog3 != null) {
                            dialog3.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        final int i2 = 1;
        ((android.view.View) this.d.getValue()).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: jb2.bar
            public final /* synthetic */ com.truecaller.premium.insurance.ui.bottomsheet.SalutationSelectionBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i22 = i2;
                com.truecaller.premium.insurance.ui.bottomsheet.SalutationSelectionBottomSheet salutationSelectionBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putSerializable("SalutationResult", com.truecaller.premium.insurance.ui.bottomsheet.Salutation.MR);
                        kotlin.Unit unit = kotlin.Unit.a;
                        ll.baz.x(bundle2, salutationSelectionBottomSheet, "SalutationResultCode");
                        android.app.Dialog dialog = salutationSelectionBottomSheet.getDialog();
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    case 1:
                        android.os.Bundle bundle3 = new android.os.Bundle();
                        bundle3.putSerializable("SalutationResult", com.truecaller.premium.insurance.ui.bottomsheet.Salutation.MRS);
                        kotlin.Unit unit2 = kotlin.Unit.a;
                        ll.baz.x(bundle3, salutationSelectionBottomSheet, "SalutationResultCode");
                        android.app.Dialog dialog2 = salutationSelectionBottomSheet.getDialog();
                        if (dialog2 != null) {
                            dialog2.dismiss();
                            return;
                        }
                        return;
                    default:
                        android.os.Bundle bundle4 = new android.os.Bundle();
                        bundle4.putSerializable("SalutationResult", com.truecaller.premium.insurance.ui.bottomsheet.Salutation.MS);
                        kotlin.Unit unit3 = kotlin.Unit.a;
                        ll.baz.x(bundle4, salutationSelectionBottomSheet, "SalutationResultCode");
                        android.app.Dialog dialog3 = salutationSelectionBottomSheet.getDialog();
                        if (dialog3 != null) {
                            dialog3.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        final int i3 = 2;
        ((android.view.View) this.e.getValue()).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: jb2.bar
            public final /* synthetic */ com.truecaller.premium.insurance.ui.bottomsheet.SalutationSelectionBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i22 = i3;
                com.truecaller.premium.insurance.ui.bottomsheet.SalutationSelectionBottomSheet salutationSelectionBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putSerializable("SalutationResult", com.truecaller.premium.insurance.ui.bottomsheet.Salutation.MR);
                        kotlin.Unit unit = kotlin.Unit.a;
                        ll.baz.x(bundle2, salutationSelectionBottomSheet, "SalutationResultCode");
                        android.app.Dialog dialog = salutationSelectionBottomSheet.getDialog();
                        if (dialog != null) {
                            dialog.dismiss();
                            return;
                        }
                        return;
                    case 1:
                        android.os.Bundle bundle3 = new android.os.Bundle();
                        bundle3.putSerializable("SalutationResult", com.truecaller.premium.insurance.ui.bottomsheet.Salutation.MRS);
                        kotlin.Unit unit2 = kotlin.Unit.a;
                        ll.baz.x(bundle3, salutationSelectionBottomSheet, "SalutationResultCode");
                        android.app.Dialog dialog2 = salutationSelectionBottomSheet.getDialog();
                        if (dialog2 != null) {
                            dialog2.dismiss();
                            return;
                        }
                        return;
                    default:
                        android.os.Bundle bundle4 = new android.os.Bundle();
                        bundle4.putSerializable("SalutationResult", com.truecaller.premium.insurance.ui.bottomsheet.Salutation.MS);
                        kotlin.Unit unit3 = kotlin.Unit.a;
                        ll.baz.x(bundle4, salutationSelectionBottomSheet, "SalutationResultCode");
                        android.app.Dialog dialog3 = salutationSelectionBottomSheet.getDialog();
                        if (dialog3 != null) {
                            dialog3.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
    }
}
