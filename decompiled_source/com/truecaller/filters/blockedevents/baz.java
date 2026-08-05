package com.truecaller.filters.blockedevents;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/filters/blockedevents/baz;", "Li/x;", "Landroid/view/View$OnClickListener;", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class baz extends i.x implements android.view.View.OnClickListener, android.widget.RadioGroup.OnCheckedChangeListener, bd3.qux {
    public yc3.h c;
    public volatile yc3.d e;
    public com.truecaller.filters.blockedevents.qux h;
    public android.widget.RadioGroup i;
    public android.widget.RadioButton j;
    public android.widget.RadioButton k;
    public android.widget.RadioButton l;
    public android.widget.TextView m;
    public android.widget.TextView n;
    public android.widget.TextView o;
    public android.widget.TextView p;
    public int q;
    public java.lang.String r;
    public boolean d = false;
    public final java.lang.Object f = new java.lang.Object();
    public boolean g = false;

    public final int S4() {
        android.widget.RadioGroup radioGroup = this.i;
        if (radioGroup != null) {
            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
            if (checkedRadioButtonId == 2131365951) {
                return 4;
            }
            if (checkedRadioButtonId == 2131365953) {
                return 5;
            }
            if (checkedRadioButtonId == 2131365952) {
                return 6;
            }
            android.widget.RadioGroup radioGroup2 = this.i;
            if (radioGroup2 == null) {
                kotlin.jvm.internal.Intrinsics.n("radioGroup");
                throw null;
            }
            throw new java.lang.IllegalStateException(y.o.d(radioGroup2.getCheckedRadioButtonId(), "Checked radio button id ", " has no corresponding matching digits option.").toString());
        }
        kotlin.jvm.internal.Intrinsics.n("radioGroup");
        throw null;
    }

    public final void T4() {
        if (this.c == null) {
            this.c = new yc3.h(super/*androidx.fragment.app.Fragment*/.getContext(), this);
            this.d = cu0.j1.x(super/*androidx.fragment.app.Fragment*/.getContext());
        }
    }

    public final void U4() {
        if (!this.g) {
            this.g = true;
            tx.p pVar = (com.truecaller.filters.blockedevents.a) X3();
            b91.qux quxVar = pVar.d;
            tx.w wVar = pVar.f;
            this.h = new com.truecaller.filters.blockedevents.qux((to1.g) wVar.r3.get(), (to1.k) wVar.g3.get(), (nd.j0) wVar.s1.get());
        }
    }

    public final void V4() {
        int S4 = S4();
        java.lang.String str = this.r;
        if (str != null) {
            java.util.List M = kotlin.text.c0.M(str);
            java.util.List z0 = kotlin.collections.CollectionsKt.z0(M, S4);
            java.util.List P = kotlin.collections.CollectionsKt.P(M, S4);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(P, 10));
            java.util.Iterator it = P.iterator();
            while (it.hasNext()) {
                ((java.lang.Character) it.next()).getClass();
                arrayList.add("*");
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(kotlin.collections.CollectionsKt.b0(kotlin.collections.CollectionsKt.l0(z0, arrayList), " ", (java.lang.String) null, (java.lang.String) null, (kotlin.jvm.functions.Function1) null, 62));
            kotlin.collections.m0 it2 = uf3.p.l(0, S4).iterator();
            while (((uf3.h) it2).c) {
                int nextInt = it2.nextInt() * 2;
                spannableString.setSpan(new android.text.style.UnderlineSpan(), nextInt, nextInt + 1, 17);
            }
            android.widget.TextView textView = this.p;
            if (textView != null) {
                textView.setVisibility(0);
                android.widget.TextView textView2 = this.p;
                if (textView2 != null) {
                    textView2.setText(spannableString);
                    return;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("phoneNumberTextView");
                    throw null;
                }
            }
            kotlin.jvm.internal.Intrinsics.n("phoneNumberTextView");
            throw null;
        }
        android.widget.TextView textView3 = this.p;
        if (textView3 != null) {
            textView3.setVisibility(8);
        } else {
            kotlin.jvm.internal.Intrinsics.n("phoneNumberTextView");
            throw null;
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
        if (super/*androidx.fragment.app.Fragment*/.getContext() == null && !this.d) {
            return null;
        }
        T4();
        return this.c;
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.J(this, super/*androidx.fragment.app.Fragment*/.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(android.content.Context context) {
        super/*androidx.fragment.app.t*/.onAttach(context);
        T4();
        U4();
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.RadioGroup radioGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(radioGroup, "group");
        android.widget.TextView textView = this.o;
        if (textView != null) {
            textView.setText(getString(2132017241, new java.lang.Object[]{java.lang.String.valueOf(S4())}));
            V4();
        } else {
            kotlin.jvm.internal.Intrinsics.n("titleTextView");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int S4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "v");
        if (view.getId() == 2131363561 && (S4 = S4()) != this.q) {
            com.truecaller.filters.blockedevents.qux quxVar = this.h;
            if (quxVar != null) {
                int a = ((to1.k) quxVar.d).a() + S4;
                to1.g gVar = (to1.g) quxVar.c;
                android.content.SharedPreferences.Editor edit = gVar.a.edit();
                edit.putInt("filter_filteringNeighbourSpoofingMatchingDigits", a);
                edit.apply();
                gVar.k(true);
                oj3.e.I((nd.j0) quxVar.e);
            } else {
                kotlin.jvm.internal.Intrinsics.n("presenter");
                throw null;
            }
        }
        dismiss();
    }

    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super/*androidx.fragment.app.t*/.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        int i = 5;
        if (arguments != null) {
            i = arguments.getInt("matching_digits", 5);
        }
        this.q = i;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("phone_number");
        } else {
            str = null;
        }
        this.r = str;
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.Window window;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        android.view.View inflate = yy.qux.F(layoutInflater, true).inflate(2131558986, viewGroup, false);
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
        return inflate;
    }

    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super/*androidx.fragment.app.t*/.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new yc3.h(onGetLayoutInflater, this));
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        android.view.View findViewById = view.findViewById(2131365956);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.i = (android.widget.RadioGroup) findViewById;
        android.view.View findViewById2 = view.findViewById(2131365951);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.j = (android.widget.RadioButton) findViewById2;
        android.view.View findViewById3 = view.findViewById(2131365953);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.k = (android.widget.RadioButton) findViewById3;
        android.view.View findViewById4 = view.findViewById(2131365952);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.l = (android.widget.RadioButton) findViewById4;
        android.view.View findViewById5 = view.findViewById(2131363561);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.m = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = view.findViewById(2131362820);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.n = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = view.findViewById(2131367048);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.o = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = view.findViewById(2131365714);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.p = (android.widget.TextView) findViewById8;
        android.widget.RadioButton radioButton = this.j;
        if (radioButton != null) {
            radioButton.setText("4");
            android.widget.RadioButton radioButton2 = this.k;
            if (radioButton2 != null) {
                radioButton2.setText("5");
                android.widget.RadioButton radioButton3 = this.l;
                if (radioButton3 != null) {
                    radioButton3.setText("6");
                    android.widget.RadioGroup radioGroup = this.i;
                    if (radioGroup != null) {
                        radioGroup.setOnCheckedChangeListener(this);
                        android.widget.TextView textView = this.m;
                        if (textView != null) {
                            textView.setOnClickListener(this);
                            android.widget.TextView textView2 = this.n;
                            if (textView2 != null) {
                                textView2.setOnClickListener(this);
                                int i = this.q;
                                if (i != 4) {
                                    if (i != 5) {
                                        if (i == 6) {
                                            android.widget.RadioGroup radioGroup2 = this.i;
                                            if (radioGroup2 != null) {
                                                radioGroup2.check(2131365952);
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("radioGroup");
                                                throw null;
                                            }
                                        } else {
                                            throw new java.lang.IllegalStateException(("Current matching digits " + this.q + " has no corresponding radio button option to check.").toString());
                                        }
                                    } else {
                                        android.widget.RadioGroup radioGroup3 = this.i;
                                        if (radioGroup3 != null) {
                                            radioGroup3.check(2131365953);
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("radioGroup");
                                            throw null;
                                        }
                                    }
                                } else {
                                    android.widget.RadioGroup radioGroup4 = this.i;
                                    if (radioGroup4 != null) {
                                        radioGroup4.check(2131365951);
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("radioGroup");
                                        throw null;
                                    }
                                }
                                android.widget.TextView textView3 = this.o;
                                if (textView3 != null) {
                                    textView3.setText(getString(2132017241, new java.lang.Object[]{java.lang.String.valueOf(S4())}));
                                    V4();
                                    return;
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("titleTextView");
                                    throw null;
                                }
                            }
                            kotlin.jvm.internal.Intrinsics.n("cancelTextView");
                            throw null;
                        }
                        kotlin.jvm.internal.Intrinsics.n("doneTextView");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("radioGroup");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("radioButtonOptionThree");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("radioButtonOptionTwo");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("radioButtonOptionOne");
        throw null;
    }

    public final void onAttach(android.app.Activity activity) {
        super/*androidx.fragment.app.Fragment*/.onAttach(activity);
        yc3.h hVar = this.c;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        T4();
        U4();
    }
}
