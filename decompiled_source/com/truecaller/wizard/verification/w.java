package com.truecaller.wizard.verification;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/wizard/verification/w;", "Li/x;", "<init>", "()V", "com/truecaller/wizard/verification/v", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class w extends i.x implements bd3.qux {
    public yc3.h c;
    public volatile yc3.d e;
    public nc0.bar i;
    public boolean d = false;
    public final java.lang.Object f = new java.lang.Object();
    public boolean g = false;
    public final kotlin.Lazy h = kotlin.LazyKt.lazy(new com.truecaller.wizard.verification.x1(this, 1));

    public final void S4() {
        if (this.c == null) {
            this.c = new yc3.h(super/*androidx.fragment.app.Fragment*/.getContext(), (androidx.fragment.app.Fragment) this);
            this.d = cu0.j1.x(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public final void T4() {
        if (!this.g) {
            this.g = true;
            this.i = (nc0.bar) ((com.truecaller.wizard.verification.x) X3()).f.Y.get();
        }
    }

    public final void U4(java.lang.String str) {
        qx2.w2 h = qx2.he.h();
        h.B("VerificationClickBackDialog");
        h.m(str);
        qx2.he h2 = h.h();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "build(...)");
        nc0.bar barVar = this.i;
        if (barVar != null) {
            j71.g.K(h2, barVar);
        } else {
            kotlin.jvm.internal.Intrinsics.n("analytics");
            throw null;
        }
    }

    @Override // bd3.baz
    public final java.lang.Object X3() {
        if (this.e == null) {
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = new yc3.d((androidx.fragment.app.Fragment) this);
                    }
                } finally {
                }
            }
        }
        return this.e.X3();
    }

    public final android.content.Context getContext() {
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.d) {
            return null;
        }
        S4();
        return this.c;
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.J(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(android.content.Context context) {
        super/*androidx.fragment.app.t*/.onAttach(context);
        S4();
        T4();
    }

    public final android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        i.d dVar = new i.d(requireActivity(), 2132083437);
        dVar.l(2131558978);
        final int i = 0;
        final int i2 = 1;
        i.e create = dVar.setPositiveButton(2132023717, new android.content.DialogInterface.OnClickListener() { // from class: com.truecaller.wizard.verification.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i3) {
                com.truecaller.wizard.verification.v vVar;
                switch (i) {
                    case 0:
                        ((com.truecaller.wizard.verification.w) this).U4("Close");
                        return;
                    case 1:
                        com.truecaller.wizard.verification.w wVar = (com.truecaller.wizard.verification.w) this;
                        wVar.U4("ChangeNumber");
                        com.truecaller.wizard.verification.v parentFragment = wVar.getParentFragment();
                        if (parentFragment instanceof com.truecaller.wizard.verification.v) {
                            vVar = parentFragment;
                        } else {
                            vVar = null;
                        }
                        if (vVar != null) {
                            ((com.truecaller.wizard.verification.l0) vVar).d5().m2();
                            return;
                        }
                        return;
                    default:
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this;
                        if (function0 != null) {
                            function0.invoke();
                            return;
                        }
                        return;
                }
            }
        }).setNegativeButton(2132023716, new android.content.DialogInterface.OnClickListener() { // from class: com.truecaller.wizard.verification.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(android.content.DialogInterface dialogInterface, int i3) {
                com.truecaller.wizard.verification.v vVar;
                switch (i2) {
                    case 0:
                        ((com.truecaller.wizard.verification.w) this).U4("Close");
                        return;
                    case 1:
                        com.truecaller.wizard.verification.w wVar = (com.truecaller.wizard.verification.w) this;
                        wVar.U4("ChangeNumber");
                        com.truecaller.wizard.verification.v parentFragment = wVar.getParentFragment();
                        if (parentFragment instanceof com.truecaller.wizard.verification.v) {
                            vVar = parentFragment;
                        } else {
                            vVar = null;
                        }
                        if (vVar != null) {
                            ((com.truecaller.wizard.verification.l0) vVar).d5().m2();
                            return;
                        }
                        return;
                    default:
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) this;
                        if (function0 != null) {
                            function0.invoke();
                            return;
                        }
                        return;
                }
            }
        }).create();
        U4("Shown");
        create.setOnShowListener(new com.truecaller.wizard.verification.u(0, create, this));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "let(...)");
        return create;
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        U4("Dismiss");
        super/*androidx.fragment.app.t*/.onDismiss(dialogInterface);
    }

    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super/*androidx.fragment.app.t*/.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new yc3.h(onGetLayoutInflater, (androidx.fragment.app.Fragment) this));
    }

    public final void onAttach(android.app.Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        yc3.h hVar = this.c;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        S4();
        T4();
    }
}
