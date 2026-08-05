package com.truecaller.common.ui;

/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class d implements android.text.TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ d(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0208, code lost:
    
        if (bar.h(r7, r11.longValue()) < r12.l) goto L113;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(android.text.Editable editable) {
        java.lang.Object value;
        g71.b bVar;
        java.util.ArrayList arrayList;
        boolean z;
        boolean z2;
        com.truecaller.data.entity.messaging.Participant[] participantArr;
        com.truecaller.data.entity.messaging.Participant participant;
        u03.qux quxVar;
        xo1.qux quxVar2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i = this.a;
        java.lang.String str4 = "";
        java.lang.String str5 = null;
        java.lang.Object obj = this.b;
        switch (i) {
            case 0:
            case 1:
                return;
            case 2:
                kotlin.reflect.KProperty[] kPropertyArr = ev2.a.k;
                rv2.o a6 = ((ev2.a) obj).a6();
                if (editable != null) {
                    str5 = editable.toString();
                }
                a6.q(str5);
                return;
            case 3:
                ((iu2.h) obj).c.setEnabled(editable != null ? !kotlin.text.StringsKt.X(editable) : false);
                return;
            case 4:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editable, "editable");
                ((f32.e) obj).U4().l2(editable.toString());
                return;
            case 5:
                int i2 = com.truecaller.contacteditor.impl.ui.contactchooser.ContactChooserActivity.g0;
                g71.d dVar = (g71.d) ((com.truecaller.contacteditor.impl.ui.contactchooser.ContactChooserActivity) obj).d0.getValue();
                java.lang.String valueOf = java.lang.String.valueOf(editable);
                dVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueOf, "query");
                ig3.h2 h2Var = dVar.d;
                do {
                    value = h2Var.getValue();
                    bVar = (g71.b) value;
                    java.util.List list = bVar.b;
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : list) {
                        java.lang.String str6 = ((d81.a) obj2).a.I;
                        if (str6 != null) {
                            z = kotlin.text.StringsKt.N(str6, valueOf, true);
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(obj2);
                        }
                    }
                } while (!h2Var.n(value, g71.b.a(bVar, arrayList, arrayList.isEmpty(), 11)));
                return;
            case 6:
                ng3.b bVar2 = fg3.r0.a;
                fg3.h0.J(fg3.f1.a, lg3.k.a, (fg3.f0) null, new g10.z0((gi2.i) obj, editable, (df3.bar) null, 12), 2);
                return;
            case 7:
            case 8:
                return;
            case 9:
                kotlin.reflect.KProperty[] kPropertyArr2 = iv2.a.k;
                rv2.o a62 = ((iv2.a) obj).a6();
                if (editable != null) {
                    str5 = editable.toString();
                }
                a62.q(str5);
                return;
            case 10:
                ((iu2.i) obj).c.setEnabled(editable != null ? !kotlin.text.StringsKt.X(editable) : false);
                return;
            case 11:
                return;
            case 12:
                p02.s0 s0Var = (p02.s0) obj;
                p02.i1 i1Var = s0Var.j;
                boolean z3 = s0Var.Y0;
                p02.i1 i1Var2 = i1Var;
                i1Var2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editable, "text");
                p02.s0 s0Var2 = (p02.j1) ((com.truecaller.sdk.bar) i1Var2).a;
                if (s0Var2 != null) {
                    s0Var2.b1.c();
                }
                if (!i1Var2.E.c) {
                    if (!z3 && i1Var2.u2() && editable.length() > 0 && !i1Var2.x2()) {
                        com.truecaller.messaging.data.types.Draft draft = i1Var2.V;
                        if (draft != null && (participantArr = draft.e) != null && (participant = (com.truecaller.data.entity.messaging.Participant) kotlin.collections.v.F(participantArr)) != null) {
                            f42.z0 z0Var = i1Var2.J;
                            boolean z4 = i1Var2.d;
                            u03.qux quxVar3 = z0Var.c;
                            java.util.LinkedHashMap linkedHashMap = z0Var.i;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(participant, "participant");
                            boolean m = participant.m(z0Var.g.g());
                            java.lang.String str7 = participant.e;
                            if (!m) {
                                java.lang.Long l = (java.lang.Long) linkedHashMap.get(str7);
                                if (l != null) {
                                    quxVar = quxVar3;
                                    break;
                                } else {
                                    quxVar = quxVar3;
                                }
                                te0.v1 c0 = ak.e1.c0(participant);
                                if (c0 != null) {
                                    fg3.h0.J(z0Var, z0Var.b, (fg3.f0) null, new a00.b(z0Var, c0, z4, (df3.bar) null, 4), 2);
                                    quxVar.getClass();
                                    linkedHashMap.put(str7, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                                }
                            }
                        }
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    i1Var2.c3(editable, z2);
                    i1Var2.Y2();
                    if (i1Var2.u2() || i1Var2.Z) {
                        hr0.q qVar = i1Var2.N;
                        java.lang.String obj3 = editable.toString();
                        hr0.q qVar2 = qVar;
                        qVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj3, "text");
                        if (!z3) {
                            qVar2.a(obj3.toString(), false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                return;
            case 14:
                kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.settings.impl.ui.search.SearchSettingsFragment.l;
                qs2.t tVar = (qs2.t) ((com.truecaller.settings.impl.ui.search.SearchSettingsFragment) obj).j.getValue();
                java.lang.String valueOf2 = java.lang.String.valueOf(editable);
                tVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueOf2, "query");
                fg3.h0.J(androidx.lifecycle.g1.l(tVar), tVar.b, (fg3.f0) null, new q8.n(tVar, valueOf2, (df3.bar) null, 10), 2);
                return;
            case 15:
            case 16:
                return;
            case 17:
                p22.bar barVar = ru2.c.n;
                rv2.o a63 = ((ru2.c) obj).a6();
                if (editable != null) {
                    str5 = editable.toString();
                }
                a63.q(str5);
                return;
            case 18:
                return;
            case 19:
                uo1.e eVar = ((uo1.baz) obj).p;
                java.lang.String obj4 = editable.toString();
                eVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj4, "number");
                uo1.baz bazVar = (uo1.f) ((com.truecaller.sdk.bar) eVar).a;
                if (bazVar != null) {
                    bazVar.s.setEnabled(!jj3.bar.i(obj4));
                    return;
                }
                return;
            case 20:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editable, "editable");
                ((wa2.a) obj).R4().c2(editable.toString());
                return;
            case 21:
                return;
            case 22:
                xo1.f fVar = ((xo1.qux) obj).p;
                java.lang.String obj5 = editable.toString();
                fVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj5, "number");
                if (jj3.bar.i(obj5)) {
                    xo1.qux quxVar4 = (xo1.g) ((com.truecaller.sdk.bar) fVar).a;
                    if (quxVar4 != null) {
                        quxVar4.t.setEnabled(false);
                        return;
                    }
                    return;
                }
                fVar.f.getClass();
                int indexOf = fVar.j.indexOf(((com.truecaller.data.country.g) t41.f.a.getValue()).b(obj5));
                if (indexOf >= 0 && (quxVar2 = (xo1.g) ((com.truecaller.sdk.bar) fVar).a) != null) {
                    quxVar2.q.setSelection(indexOf);
                }
                xo1.qux quxVar5 = (xo1.g) ((com.truecaller.sdk.bar) fVar).a;
                if (quxVar5 != null) {
                    if (obj5.length() >= 3) {
                        r9 = true;
                    }
                    quxVar5.t.setEnabled(r9);
                    return;
                }
                return;
            case 23:
                ((kotlin.jvm.functions.Function1) obj).invoke(editable);
                return;
            case 24:
                y83.d dVar2 = (y83.d) obj;
                if (!dVar2.o) {
                    y83.x e5 = dVar2.e5();
                    if (editable != null) {
                        str = editable.toString();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        str4 = str;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "phoneNumber");
                    ig3.h2 h2Var2 = e5.C;
                    h2Var2.getClass();
                    h2Var2.p((java.lang.Object) null, str4);
                    return;
                }
                return;
            case 25:
                y93.a aVar = (y93.a) obj;
                if (!aVar.s) {
                    y83.x xVar = aVar.e5().f;
                    if (editable != null) {
                        str2 = editable.toString();
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str4 = str2;
                    }
                    xVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "phoneNumber");
                    ig3.h2 h2Var3 = xVar.C;
                    h2Var3.getClass();
                    h2Var3.p((java.lang.Object) null, str4);
                    return;
                }
                return;
            case 26:
                y93.f fVar2 = (y93.f) obj;
                if (!fVar2.r) {
                    y83.x xVar2 = fVar2.e5().f;
                    if (editable != null) {
                        str3 = editable.toString();
                    } else {
                        str3 = null;
                    }
                    if (str3 != null) {
                        str4 = str3;
                    }
                    xVar2.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "phoneNumber");
                    ig3.h2 h2Var4 = xVar2.C;
                    h2Var4.getClass();
                    h2Var4.p((java.lang.Object) null, str4);
                    return;
                }
                return;
            case 27:
                ((yo1.bar) obj).p.c2(editable.toString());
                return;
            case 28:
                kotlin.reflect.KProperty[] kPropertyArr4 = zu2.qux.k;
                rv2.o g5 = ((zu2.qux) obj).g5();
                if (editable != null) {
                    str5 = editable.toString();
                }
                g5.q(str5);
                return;
            default:
                ((iu2.d) obj).c.setEnabled(editable != null ? !kotlin.text.StringsKt.X(editable) : false);
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return;
            case 4:
            case 20:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "charSequence");
                return;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.widget.TextView, androidx.appcompat.widget.AppCompatAutoCompleteTextView, com.truecaller.common.ui.EditBase, android.widget.EditText] */
    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        java.lang.String str;
        java.lang.String str2;
        boolean z;
        java.lang.String obj;
        int i4 = this.a;
        java.lang.String str3 = "";
        java.lang.String str4 = null;
        boolean z2 = false;
        r1 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i5 = 0;
        z2 = false;
        java.lang.Object obj2 = this.b;
        switch (i4) {
            case 0:
                ?? r3 = (com.truecaller.common.ui.EditBase) obj2;
                int i6 = com.truecaller.common.ui.EditBase.g;
                boolean i7 = jj3.bar.i(r3.getText());
                if (!i7) {
                    android.graphics.drawable.Drawable drawable = r3.a;
                    if (r3.b) {
                        r3.setCompoundDrawables(drawable, r3.getCompoundDrawables()[1], r3.getCompoundDrawables()[2], r3.getCompoundDrawables()[3]);
                    } else {
                        r3.setCompoundDrawables(r3.getCompoundDrawables()[0], r3.getCompoundDrawables()[1], drawable, r3.getCompoundDrawables()[3]);
                    }
                } else {
                    r3.a();
                }
                com.google.firebase.crashlytics.internal.concurrency.baz bazVar = r3.e;
                if (bazVar != null) {
                    com.truecaller.search.global.GlobalSearchResultActivity globalSearchResultActivity = (com.truecaller.search.global.GlobalSearchResultActivity) bazVar.b;
                    android.view.View view = globalSearchResultActivity.z0;
                    if (i7 && globalSearchResultActivity.C0) {
                        z2 = true;
                    }
                    m03.v.j(view, z2, true);
                    return;
                }
                return;
            case 1:
                cn0.a T4 = ((d11.a) obj2).T4();
                if (charSequence != null) {
                    str4 = charSequence.toString();
                }
                if (str4 == null) {
                    d11.a aVar = (d11.a) ((com.truecaller.sdk.bar) T4).a;
                    if (aVar != null) {
                        ((android.widget.TextView) aVar.i.getValue()).setEnabled(false);
                    }
                    d11.a aVar2 = (d11.a) ((com.truecaller.sdk.bar) T4).a;
                    if (aVar2 != null) {
                        aVar2.W4(T4.e2(), 2130970634);
                        return;
                    }
                    return;
                }
                ((ze3.qux) T4.g).getClass();
                boolean c = ze3.qux.c(str4);
                if (kotlin.text.StringsKt.X(str4)) {
                    d11.a aVar3 = (d11.a) ((com.truecaller.sdk.bar) T4).a;
                    if (aVar3 != null) {
                        android.widget.TextView textView = (android.widget.TextView) aVar3.j.getValue();
                        textView.setTextColor(bi3.a.s(aVar3.requireContext(), 2130970571));
                        textView.setText(2132020176);
                        ((com.truecaller.commentfeedback.ui.ErrorConstraintLayout) aVar3.n.getValue()).setError(true);
                    }
                } else if (c) {
                    d11.a aVar4 = (d11.a) ((com.truecaller.sdk.bar) T4).a;
                    if (aVar4 != null) {
                        android.widget.TextView textView2 = (android.widget.TextView) aVar4.j.getValue();
                        textView2.setTextColor(bi3.a.s(aVar4.requireContext(), 2130970571));
                        textView2.setText(2132020178);
                        ((com.truecaller.commentfeedback.ui.ErrorConstraintLayout) aVar4.n.getValue()).setError(true);
                    }
                } else {
                    d11.a aVar5 = (d11.a) ((com.truecaller.sdk.bar) T4).a;
                    if (aVar5 != null) {
                        android.widget.TextView textView3 = (android.widget.TextView) aVar5.j.getValue();
                        textView3.setTextColor(bi3.a.s(aVar5.requireContext(), 2130970936));
                        textView3.setText(2132020180);
                        ((com.truecaller.commentfeedback.ui.ErrorConstraintLayout) aVar5.n.getValue()).setError(false);
                    }
                }
                boolean d = ze3.qux.d(((java.lang.Number) ((kotlin.Lazy) T4.m).getValue()).intValue(), T4.e2(), str4);
                if (d) {
                    d11.a aVar6 = (d11.a) ((com.truecaller.sdk.bar) T4).a;
                    if (aVar6 != null) {
                        aVar6.W4(T4.e2() - str4.length(), 2130970571);
                    }
                } else {
                    d11.a aVar7 = (d11.a) ((com.truecaller.sdk.bar) T4).a;
                    if (aVar7 != null) {
                        aVar7.W4(T4.e2() - str4.length(), 2130970634);
                    }
                }
                if (!d && !c) {
                    d11.a aVar8 = (d11.a) ((com.truecaller.sdk.bar) T4).a;
                    if (aVar8 != null) {
                        ((android.widget.TextView) aVar8.i.getValue()).setEnabled(true);
                        return;
                    }
                    return;
                }
                d11.a aVar9 = (d11.a) ((com.truecaller.sdk.bar) T4).a;
                if (aVar9 != null) {
                    ((android.widget.TextView) aVar9.i.getValue()).setEnabled(false);
                    return;
                }
                return;
            case 2:
            case 3:
                return;
            case 4:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "charSequence");
                return;
            case 5:
            case 6:
                return;
            case 7:
                com.truecaller.swish.ui.input.SwishInputActivity swishInputActivity = (com.truecaller.swish.ui.input.SwishInputActivity) obj2;
                if (charSequence == null || (str = charSequence.toString()) == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    cw2.bar barVar = swishInputActivity.e0;
                    if (barVar != null) {
                        ((android.widget.EditText) barVar.c).setHint(2132023459);
                        return;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                }
                cw2.bar barVar2 = swishInputActivity.e0;
                if (barVar2 != null) {
                    ((android.widget.EditText) barVar2.c).setHint("");
                    return;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
            case 8:
                ((i82.o) obj2).h();
                return;
            case 9:
            case 10:
                return;
            case 11:
                androidx.appcompat.widget.SearchView searchView = (androidx.appcompat.widget.SearchView) obj2;
                android.text.Editable text = searchView.p.getText();
                searchView.b0 = text;
                boolean isEmpty = android.text.TextUtils.isEmpty(text);
                searchView.v(!isEmpty);
                if (searchView.W && !searchView.P && isEmpty) {
                    searchView.u.setVisibility(8);
                } else {
                    i5 = 8;
                }
                searchView.w.setVisibility(i5);
                searchView.r();
                searchView.u();
                if (searchView.K != null && !android.text.TextUtils.equals(charSequence, searchView.a0)) {
                    searchView.K.onQueryTextChange(charSequence.toString());
                }
                searchView.a0 = charSequence.toString();
                return;
            case 12:
                return;
            case 13:
                ((hg3.s) obj2).c(charSequence);
                return;
            case 14:
                return;
            case 15:
                androidx.appcompat.widget.AppCompatButton appCompatButton = ((do1.a) obj2).g;
                if (charSequence == null || kotlin.text.StringsKt.X(charSequence)) {
                    z4 = true;
                }
                appCompatButton.setEnabled(!z4);
                return;
            case 16:
                q7.a aVar10 = (q7.a) obj2;
                if (aVar10 != null) {
                    aVar10.s();
                    return;
                }
                return;
            case 17:
                return;
            case 18:
                p02.u3 u3Var = th2.d.l;
                th2.f fVar = (th2.f) ((th2.d) obj2).i.getValue();
                if (charSequence != null) {
                    str2 = charSequence.toString();
                } else {
                    str2 = null;
                }
                ig3.h2 h2Var = fVar.e;
                if (str2 != null) {
                    fVar.h = str2;
                    java.lang.Character F = kotlin.text.c0.F(str2);
                    if (F != null) {
                        z = java.lang.Character.isLetter(F.charValue());
                    } else {
                        z = true;
                    }
                    ig3.h2 h2Var2 = fVar.g;
                    if (str2.length() > 4 && z) {
                        z3 = true;
                    }
                    com.ironsource.adqualitysdk.sdk.i.bar.A(z3, h2Var2, (java.lang.Object) null);
                    if (!z) {
                        th2.g gVar = new th2.g(2132022422);
                        h2Var.getClass();
                        h2Var.p((java.lang.Object) null, gVar);
                        return;
                    } else {
                        if (h2Var.getValue() instanceof th2.g) {
                            h2Var.p((java.lang.Object) null, th2.h.a);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 19:
                return;
            case 20:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "charSequence");
                return;
            case 21:
                x90.v vVar = (x90.v) obj2;
                if (charSequence != null && (obj = charSequence.toString()) != null) {
                    str3 = obj;
                }
                vVar.s = str3;
                return;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            default:
                return;
        }
    }

    private final void a(android.text.Editable editable) {
    }

    private final void b(android.text.Editable editable) {
    }

    private final void c(android.text.Editable editable) {
    }

    private final void d(android.text.Editable editable) {
    }

    private final void e(android.text.Editable editable) {
    }

    private final void f(android.text.Editable editable) {
    }

    private final void g(android.text.Editable editable) {
    }

    private final void h(android.text.Editable editable) {
    }

    private final void i(android.text.Editable editable) {
    }

    private final void j(android.text.Editable editable) {
    }

    private final void A(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void B(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void C(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void D(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void E(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void F(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void G(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void H(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void I(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void J(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void K(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void L(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void M(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void N(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void O(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void P(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void Q(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void R(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void S(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void T(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void U(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void V(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void W(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void X(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void Y(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void Z(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void a0(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void b0(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void c0(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void d0(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void v(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void w(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void x(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void y(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }

    private final void z(int i, int i2, int i3, java.lang.CharSequence charSequence) {
    }
}
