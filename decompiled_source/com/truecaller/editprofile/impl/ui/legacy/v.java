package com.truecaller.editprofile.impl.ui.legacy;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/editprofile/impl/ui/legacy/v;", "Lvq/a;", "<init>", "()V", "com/truecaller/editprofile/impl/ui/legacy/u", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class v extends vq.a {
    public final kotlin.Lazy c = gj.m.K(this, 2131364262);
    public final kotlin.Lazy d = gj.m.K(this, 2131364263);
    public final kotlin.Lazy e = gj.m.K(this, 2131364264);
    public com.truecaller.editprofile.impl.ui.legacy.u f;

    public final void onAttach(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        super/*androidx.fragment.app.t*/.onAttach(context);
        if (this.f == null && (getParentFragment() instanceof com.truecaller.editprofile.impl.ui.legacy.u)) {
            com.truecaller.editprofile.impl.ui.legacy.u parentFragment = getParentFragment();
            kotlin.jvm.internal.Intrinsics.e(parentFragment, "null cannot be cast to non-null type com.truecaller.editprofile.impl.ui.legacy.GenderSelectionBottomSheet.Listener");
            this.f = parentFragment;
            return;
        }
        throw new java.lang.IllegalStateException("parent fragment should implement ".concat(com.truecaller.editprofile.impl.ui.legacy.u.class.getSimpleName()));
    }

    public final void onCreate(android.os.Bundle bundle) {
        super/*androidx.fragment.app.t*/.onCreate(bundle);
        setStyle(2, 2132083583);
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        android.view.View inflate = layoutInflater.inflate(2131558600, viewGroup, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        final int i = 0;
        ((android.view.View) this.e.getValue()).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.editprofile.impl.ui.legacy.t
            public final /* synthetic */ com.truecaller.editprofile.impl.ui.legacy.v b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                switch (i) {
                    case 0:
                        com.truecaller.editprofile.impl.ui.legacy.v vVar = this.b;
                        android.app.Dialog dialog = vVar.getDialog();
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        com.truecaller.editprofile.impl.ui.legacy.u uVar = vVar.f;
                        if (uVar != null) {
                            ((com.truecaller.editprofile.impl.ui.legacy.d) uVar).g6(com.truecaller.editprofile.impl.ui.legacy.Gender.P);
                            return;
                        }
                        return;
                    case 1:
                        com.truecaller.editprofile.impl.ui.legacy.v vVar2 = this.b;
                        android.app.Dialog dialog2 = vVar2.getDialog();
                        if (dialog2 != null) {
                            dialog2.dismiss();
                        }
                        com.truecaller.editprofile.impl.ui.legacy.u uVar2 = vVar2.f;
                        if (uVar2 != null) {
                            ((com.truecaller.editprofile.impl.ui.legacy.d) uVar2).g6(com.truecaller.editprofile.impl.ui.legacy.Gender.M);
                            return;
                        }
                        return;
                    default:
                        com.truecaller.editprofile.impl.ui.legacy.v vVar3 = this.b;
                        android.app.Dialog dialog3 = vVar3.getDialog();
                        if (dialog3 != null) {
                            dialog3.dismiss();
                        }
                        com.truecaller.editprofile.impl.ui.legacy.u uVar3 = vVar3.f;
                        if (uVar3 != null) {
                            ((com.truecaller.editprofile.impl.ui.legacy.d) uVar3).g6(com.truecaller.editprofile.impl.ui.legacy.Gender.F);
                            return;
                        }
                        return;
                }
            }
        });
        final int i2 = 1;
        ((android.view.View) this.d.getValue()).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.editprofile.impl.ui.legacy.t
            public final /* synthetic */ com.truecaller.editprofile.impl.ui.legacy.v b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                switch (i2) {
                    case 0:
                        com.truecaller.editprofile.impl.ui.legacy.v vVar = this.b;
                        android.app.Dialog dialog = vVar.getDialog();
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        com.truecaller.editprofile.impl.ui.legacy.u uVar = vVar.f;
                        if (uVar != null) {
                            ((com.truecaller.editprofile.impl.ui.legacy.d) uVar).g6(com.truecaller.editprofile.impl.ui.legacy.Gender.P);
                            return;
                        }
                        return;
                    case 1:
                        com.truecaller.editprofile.impl.ui.legacy.v vVar2 = this.b;
                        android.app.Dialog dialog2 = vVar2.getDialog();
                        if (dialog2 != null) {
                            dialog2.dismiss();
                        }
                        com.truecaller.editprofile.impl.ui.legacy.u uVar2 = vVar2.f;
                        if (uVar2 != null) {
                            ((com.truecaller.editprofile.impl.ui.legacy.d) uVar2).g6(com.truecaller.editprofile.impl.ui.legacy.Gender.M);
                            return;
                        }
                        return;
                    default:
                        com.truecaller.editprofile.impl.ui.legacy.v vVar3 = this.b;
                        android.app.Dialog dialog3 = vVar3.getDialog();
                        if (dialog3 != null) {
                            dialog3.dismiss();
                        }
                        com.truecaller.editprofile.impl.ui.legacy.u uVar3 = vVar3.f;
                        if (uVar3 != null) {
                            ((com.truecaller.editprofile.impl.ui.legacy.d) uVar3).g6(com.truecaller.editprofile.impl.ui.legacy.Gender.F);
                            return;
                        }
                        return;
                }
            }
        });
        final int i3 = 2;
        ((android.view.View) this.c.getValue()).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.editprofile.impl.ui.legacy.t
            public final /* synthetic */ com.truecaller.editprofile.impl.ui.legacy.v b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                switch (i3) {
                    case 0:
                        com.truecaller.editprofile.impl.ui.legacy.v vVar = this.b;
                        android.app.Dialog dialog = vVar.getDialog();
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        com.truecaller.editprofile.impl.ui.legacy.u uVar = vVar.f;
                        if (uVar != null) {
                            ((com.truecaller.editprofile.impl.ui.legacy.d) uVar).g6(com.truecaller.editprofile.impl.ui.legacy.Gender.P);
                            return;
                        }
                        return;
                    case 1:
                        com.truecaller.editprofile.impl.ui.legacy.v vVar2 = this.b;
                        android.app.Dialog dialog2 = vVar2.getDialog();
                        if (dialog2 != null) {
                            dialog2.dismiss();
                        }
                        com.truecaller.editprofile.impl.ui.legacy.u uVar2 = vVar2.f;
                        if (uVar2 != null) {
                            ((com.truecaller.editprofile.impl.ui.legacy.d) uVar2).g6(com.truecaller.editprofile.impl.ui.legacy.Gender.M);
                            return;
                        }
                        return;
                    default:
                        com.truecaller.editprofile.impl.ui.legacy.v vVar3 = this.b;
                        android.app.Dialog dialog3 = vVar3.getDialog();
                        if (dialog3 != null) {
                            dialog3.dismiss();
                        }
                        com.truecaller.editprofile.impl.ui.legacy.u uVar3 = vVar3.f;
                        if (uVar3 != null) {
                            ((com.truecaller.editprofile.impl.ui.legacy.d) uVar3).g6(com.truecaller.editprofile.impl.ui.legacy.Gender.F);
                            return;
                        }
                        return;
                }
            }
        });
    }
}
