package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class FeedbackFormFragment extends com.truecaller.ui.a0 {
    public static final java.util.List D = java.util.Arrays.asList(new ey2.o(2132017987), new ey2.o(2132017995), new ey2.o(2132017990), new ey2.o(2132017988), new ey2.o(2132017989), new ey2.o(2132017986), new ey2.o(2132017992), new ey2.o(2132017994), new ey2.o(2132017993), new ey2.o(2132017991));
    public ki.qux A;
    public u03.w B;
    public com.truecaller.ui.t j;
    public android.os.Bundle k;
    public android.widget.TextView m;
    public android.widget.EditText n;
    public android.widget.EditText o;
    public android.widget.TextView p;
    public android.widget.EditText q;
    public android.widget.TextView r;
    public com.truecaller.ui.components.NewComboBase s;
    public android.widget.TextView t;
    public android.widget.EditText u;
    public android.view.MenuItem v;
    public android.view.View w;
    public android.graphics.Paint x;
    public int y;
    public int z;
    public boolean l = false;
    public final java.util.ArrayList C = new java.util.ArrayList(D);

    @Override // com.truecaller.ui.v
    public final void R4() {
        this.n = null;
        this.q = null;
        this.s = null;
        this.u = null;
        this.o = null;
        this.k = null;
    }

    public final boolean X4(boolean z) {
        java.lang.String obj = this.q.getText().toString();
        java.util.Set set = u03.e0.e;
        if (!android.text.TextUtils.isEmpty(obj) && android.util.Patterns.EMAIL_ADDRESS.matcher(obj).matches()) {
            b5(this.p, false);
            return true;
        }
        if (z) {
            U4(2132017970);
        }
        b5(this.p, true);
        this.q.requestFocus();
        return false;
    }

    public final boolean Y4(int i, boolean z) {
        if (i < 100) {
            if (!z) {
                return false;
            }
            java.lang.String string = getString(2132017971, new java.lang.Object[]{java.lang.Integer.valueOf(i)});
            synchronized (this) {
                android.content.Context context = getContext();
                if (context != null) {
                    android.widget.Toast.makeText(context, string, 0).show();
                }
            }
            b5(this.t, true);
            this.u.requestFocus();
            return false;
        }
        b5(this.t, false);
        return true;
    }

    public final boolean Z4(boolean z) {
        if (this.n.getText().length() == 0) {
            if (z) {
                U4(2132017972);
            }
            b5(this.m, true);
            this.n.requestFocus();
            return false;
        }
        b5(this.m, false);
        return true;
    }

    public final void a5(boolean z) {
        this.n.setFocusableInTouchMode(z);
        this.n.setFocusable(z);
        this.o.setFocusableInTouchMode(z);
        this.o.setFocusable(z);
        this.q.setFocusableInTouchMode(z);
        this.q.setFocusable(z);
        this.u.setFocusableInTouchMode(z);
        this.u.setFocusable(z);
        this.s.setFocusableInTouchMode(z);
        this.s.setFocusable(z);
        this.s.setClickable(z);
    }

    public final void b5(android.widget.TextView textView, boolean z) {
        int i;
        int i2;
        if (z) {
            i = 2131233711;
        } else {
            i = 0;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        if (z) {
            i2 = this.z;
        } else {
            i2 = this.y;
        }
        textView.setTextColor(i2);
    }

    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        this.k = bundle;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "owner");
        androidx.lifecycle.t1 viewModelStore = getViewModelStore();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "owner");
        androidx.lifecycle.q1 defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "owner");
        a9.qux defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStore, "store");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultViewModelProviderFactory, "factory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultViewModelCreationExtras, "defaultCreationExtras");
        ej.b z = ro0.f.z(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras, com.truecaller.ui.t.class, "modelClass");
        kotlin.reflect.KClass r = t.c.r(com.truecaller.ui.t.class, "modelClass", "modelClass");
        if (r != null) {
            str = r.getQualifiedName();
        } else {
            str = null;
        }
        if (str != null) {
            this.j = (com.truecaller.ui.t) z.y("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str), r);
            android.graphics.Paint paint = new android.graphics.Paint();
            this.x = paint;
            paint.setColorFilter(new android.graphics.LightingColorFilter(0, 16777215));
            return;
        }
        throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        if (getActivity() != null && !isDetached()) {
            menuInflater.inflate(2131689496, menu);
            this.v = menu.findItem(2131363886);
        }
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        setHasOptionsMenu(true);
        getActivity().setTitle(2132017996);
        android.view.View inflate = layoutInflater.inflate(2131558429, (android.view.ViewGroup) getActivity().h0, false);
        this.w = inflate;
        inflate.setLayerType(1, this.x);
        return layoutInflater.inflate(2131561022, viewGroup, false);
    }

    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (!super.onOptionsItemSelected(menuItem)) {
            if (menuItem.getItemId() != 2131363886) {
                return false;
            }
            if (!this.l && Z4(true) && X4(true)) {
                ey2.o selection = this.s.getSelection();
                getActivity();
                if (selection.c == 2132017987) {
                    U4(2132017977);
                    b5(this.r, true);
                    this.s.requestFocus();
                    return true;
                }
                b5(this.r, false);
                if (Y4(this.u.length(), true)) {
                    androidx.fragment.app.FragmentActivity activity = getActivity();
                    if (!((u03.x) this.B).e()) {
                        android.content.Context requireContext = requireContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requireContext, "<this>");
                        ak.r0.k0(requireContext, 2132017962, (java.lang.String) null, 0, 6);
                        return true;
                    }
                    this.l = true;
                    a5(false);
                    this.v.setActionView(this.w);
                    android.os.Bundle bundle = new android.os.Bundle();
                    onSaveInstanceState(bundle);
                    boolean equals = getString(2132017992).equals(bundle.getString("FeedbackFormFragment.STATE_SUBJECT"));
                    ki.qux quxVar = this.A;
                    java.lang.String string = bundle.getString("FeedbackFormFragment.STATE_NAME");
                    java.lang.String string2 = bundle.getString("FeedbackFormFragment.STATE_EMAIL");
                    java.lang.String string3 = bundle.getString("FeedbackFormFragment.STATE_SUBJECT");
                    java.lang.String string4 = bundle.getString("FeedbackFormFragment.STATE_FEEDBACK");
                    c80.p pVar = new c80.p(12, this, activity);
                    quxVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "lifecycleOwner");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string2, "email");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string3, "subject");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string4, "feedback");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "onResultAction");
                    fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.n(equals, quxVar, pVar, string, string2, string3, string4, null), 3);
                }
            }
        }
        return true;
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("FeedbackFormFragment.STATE_NAME", this.n.getText().toString());
        bundle.putString("FeedbackFormFragment.STATE_EMAIL", this.q.getText().toString());
        bundle.putString("FeedbackFormFragment.STATE_FEEDBACK", this.u.getText().toString());
        bundle.putString("FeedbackFormFragment.STATE_SUBJECT", this.s.getSelection().d(getActivity()));
    }

    @Override // com.truecaller.ui.v
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.m = (android.widget.TextView) view.findViewById(2131363878);
        this.n = (android.widget.EditText) view.findViewById(2131363877);
        this.o = (android.widget.EditText) view.findViewById(2131363881);
        this.p = (android.widget.TextView) view.findViewById(2131363874);
        this.q = (android.widget.EditText) view.findViewById(2131363873);
        this.r = (android.widget.TextView) view.findViewById(2131363880);
        this.s = (com.truecaller.ui.components.NewComboBase) view.findViewById(2131363879);
        this.t = (android.widget.TextView) view.findViewById(2131363876);
        this.u = (android.widget.EditText) view.findViewById(2131363875);
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (!r11.bar.a().d()) {
            activity.finish();
            return;
        }
        this.y = bi3.a.s(getContext(), 2130970931);
        this.z = bi3.a.s(getContext(), 2130970571);
        int s = bi3.a.s(getContext(), 2130970931);
        final int s2 = bi3.a.s(getContext(), 2130970935);
        this.j.d.e(getViewLifecycleOwner(), new androidx.lifecycle.r0() { // from class: com.truecaller.ui.o
            public final void a(java.lang.Object obj) {
                com.truecaller.ui.s sVar = (com.truecaller.ui.s) obj;
                com.truecaller.ui.FeedbackFormFragment feedbackFormFragment = com.truecaller.ui.FeedbackFormFragment.this;
                feedbackFormFragment.o.setText(sVar.a);
                android.os.Bundle bundle2 = feedbackFormFragment.k;
                int i = s2;
                if (bundle2 == null) {
                    feedbackFormFragment.n.setText(sVar.b);
                    feedbackFormFragment.q.setText(sVar.c);
                    com.truecaller.ui.components.NewComboBase newComboBase = feedbackFormFragment.s;
                    int i2 = m03.v.b;
                    ((android.widget.TextView) newComboBase.findViewById(2131364974)).setTextColor(i);
                    return;
                }
                feedbackFormFragment.n.setText(bundle2.getString("FeedbackFormFragment.STATE_NAME"));
                feedbackFormFragment.q.setText(feedbackFormFragment.k.getString("FeedbackFormFragment.STATE_EMAIL"));
                feedbackFormFragment.u.setText(feedbackFormFragment.k.getString("FeedbackFormFragment.STATE_FEEDBACK"));
                java.lang.String string = feedbackFormFragment.k.getString("FeedbackFormFragment.STATE_SUBJECT");
                feedbackFormFragment.s.setSelection(new ey2.o(string, null));
                if (((ey2.o) feedbackFormFragment.C.get(0)).d(feedbackFormFragment.getActivity()).equals(string)) {
                    com.truecaller.ui.components.NewComboBase newComboBase2 = feedbackFormFragment.s;
                    int i3 = m03.v.b;
                    ((android.widget.TextView) newComboBase2.findViewById(2131364974)).setTextColor(i);
                }
                if (feedbackFormFragment.getString(2132017993).equals(string)) {
                    android.widget.EditText editText = feedbackFormFragment.u;
                    if (editText != null) {
                        editText.setHint(2132017975);
                        return;
                    }
                    return;
                }
                android.widget.EditText editText2 = feedbackFormFragment.u;
                if (editText2 != null) {
                    editText2.setHint(2132017974);
                }
            }
        });
        this.s.setData(this.C);
        this.s.setFocusableInTouchMode(true);
        this.s.requestFocus();
        this.s.setObserver(new com.truecaller.ui.p(this, s2, s));
        this.n.addTextChangedListener(new com.truecaller.ui.q(this, 0));
        this.q.addTextChangedListener(new com.truecaller.ui.q(this, 1));
        this.u.addTextChangedListener(new com.truecaller.ui.q(this, 2));
    }
}
