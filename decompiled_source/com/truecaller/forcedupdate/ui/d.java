package com.truecaller.forcedupdate.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class d extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener, bd3.qux {
    public yc3.h c;
    public volatile yc3.d e;
    public com.truecaller.forcedupdate.UpdateType h;
    public androidx.cardview.widget.CardView i;
    public k0.h j;
    public mp1.bar k;
    public tx.v l;
    public nc0.bar m;
    public boolean d = false;
    public final java.lang.Object f = new java.lang.Object();
    public boolean g = false;

    public int R4() {
        int i = com.truecaller.forcedupdate.ui.c.a[this.h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return 0;
                }
                return 2131100184;
            }
            return 2131100187;
        }
        return 2131100183;
    }

    public int S4() {
        int i = com.truecaller.forcedupdate.ui.c.a[this.h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return 0;
                }
                return 2131231958;
            }
            return 2131231961;
        }
        return 2131231960;
    }

    public final void T4() {
        if (this.c == null) {
            this.c = new yc3.h(super.getContext(), this);
            this.d = cu0.j1.x(super.getContext());
        }
    }

    public final void U4() {
        if (!this.g) {
            this.g = true;
            tx.w wVar = ((com.truecaller.forcedupdate.ui.e) X3()).f;
            tx.c0 c0Var = wVar.b;
            this.j = new k0.h((x42.bar) c0Var.F3.get());
            this.k = (mp1.bar) wVar.G0.get();
            this.l = c0Var.l6;
            this.m = (nc0.bar) wVar.Y.get();
        }
    }

    public final java.lang.Object X3() {
        if (this.e == null) {
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = new yc3.d(this);
                    }
                } finally {
                }
            }
        }
        return this.e.X3();
    }

    public final android.content.Context getContext() {
        if (super.getContext() == null && !this.d) {
            return null;
        }
        T4();
        return this.c;
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.J(this, super.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        T4();
        U4();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (view.getId() == 2131362602) {
            try {
                if (this.h == com.truecaller.forcedupdate.UpdateType.DISCONTINUED) {
                    android.content.Context context = getContext();
                    if (context != null) {
                        this.j.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                        context.startActivity(new android.content.Intent("android.intent.action.UNINSTALL_PACKAGE", android.net.Uri.fromParts("package", context.getPackageName(), null)));
                        return;
                    }
                    return;
                }
                android.content.Context context2 = getContext();
                if (context2 != null) {
                    this.j.B(context2, this.k.a.G("forcedUpdate_link"), "forcedUpdate");
                    return;
                }
                return;
            } catch (android.content.ActivityNotFoundException e) {
                o82.a.C(e);
                return;
            }
        }
        if (view.getId() == 2131362605) {
            mp1.bar barVar = this.k;
            barVar.a.e0("forcedUpdate_lastDismissed", java.lang.System.currentTimeMillis());
            android.content.Intent launchIntentForPackage = getContext().getPackageManager().getLaunchIntentForPackage(getContext().getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(268468224);
                startActivity(launchIntentForPackage);
            }
            getActivity().finish();
        }
    }

    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.forcedupdate.UpdateType updateType;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            java.lang.String string = arguments.getString("updateType");
            if (!android.text.TextUtils.isEmpty(string)) {
                com.truecaller.forcedupdate.UpdateType.Companion.getClass();
                if (string == null) {
                    updateType = com.truecaller.forcedupdate.UpdateType.NONE;
                } else {
                    try {
                        updateType = com.truecaller.forcedupdate.UpdateType.valueOf(string);
                    } catch (java.lang.IllegalArgumentException unused) {
                        updateType = com.truecaller.forcedupdate.UpdateType.NONE;
                    }
                }
                this.h = updateType;
            }
        }
        com.truecaller.forcedupdate.UpdateType updateType2 = this.h;
        if (updateType2 != null && updateType2 != com.truecaller.forcedupdate.UpdateType.NONE) {
            return;
        }
        com.truecaller.log.AssertionUtil.report("Update type not specified");
        getActivity().finish();
    }

    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return layoutInflater.inflate(2131559339, viewGroup, false);
    }

    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new yc3.h(onGetLayoutInflater, this));
    }

    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        java.lang.String str;
        getActivity().getWindow().setBackgroundDrawableResource(R4());
        androidx.cardview.widget.CardView findViewById = view.findViewById(2131362602);
        this.i = findViewById;
        findViewById.setOnClickListener(this);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131367033);
        textView.setText(this.h.getTitle());
        textView.setOnLongClickListener(new aw2.c(this, 2));
        ((android.widget.TextView) view.findViewById(2131363468)).setText(this.h.getDescription());
        ((android.widget.TextView) view.findViewById(2131362603)).setText(this.h.getAction());
        ((android.widget.ImageView) view.findViewById(2131364553)).setImageResource(S4());
        android.view.View findViewById2 = view.findViewById(2131362605);
        if (findViewById2 != null) {
            if (this.h.getSkippable()) {
                findViewById2.setOnClickListener(this);
            } else {
                findViewById2.setVisibility(8);
            }
        }
        int i = com.truecaller.forcedupdate.ui.c.a[this.h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = null;
                } else {
                    str = "LegacyAppDiscontinued";
                }
            } else {
                str = "LegacyHardUpgrade";
            }
        } else {
            str = "LegacySoftUpgrade";
        }
        if (str != null) {
            bd.bar.u(this.m, str, "n/a");
        }
    }

    public final void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        yc3.h hVar = this.c;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        T4();
        U4();
    }
}
