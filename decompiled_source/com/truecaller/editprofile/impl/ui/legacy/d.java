package com.truecaller.editprofile.impl.ui.legacy;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/editprofile/impl/ui/legacy/d;", "Landroidx/fragment/app/Fragment;", "Lcom/truecaller/editprofile/impl/ui/legacy/h;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "Lcom/truecaller/editprofile/impl/ui/legacy/u;", "La82/qux;", "La82/bar;", "Lgh1/i;", "Le41/v;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class d extends a42.bar implements com.truecaller.editprofile.impl.ui.legacy.h, android.app.DatePickerDialog.OnDateSetListener, com.truecaller.editprofile.impl.ui.legacy.u, a82.qux, a82.bar, gh1.i, e41.v {
    public final kotlin.Lazy A;
    public final kotlin.Lazy B;
    public final kotlin.Lazy C;
    public final kotlin.Lazy D;
    public final kotlin.Lazy E;
    public final kotlin.Lazy F;
    public final kotlin.Lazy G;
    public final kotlin.Lazy H;
    public final kotlin.Lazy I;
    public final kotlin.Lazy J;
    public final kotlin.Lazy K;
    public final kotlin.Lazy L;
    public final kotlin.Lazy M;
    public final kotlin.Lazy N;
    public final kotlin.Lazy O;
    public final kotlin.Lazy P;
    public final kotlin.Lazy Q;
    public final kotlin.Lazy R;
    public final kotlin.Lazy S;
    public final kotlin.Lazy T;
    public final kotlin.Lazy U;
    public final kotlin.Lazy V;
    public final kotlin.Lazy W;
    public final kotlin.Lazy X;
    public final kotlin.Lazy Y;
    public final kotlin.Lazy Z;
    public final kotlin.Lazy a0;
    public final kotlin.Lazy b0;
    public final kotlin.Lazy c0;
    public final kotlin.Lazy d0;
    public final kotlin.Lazy e0;
    public final kotlin.Lazy f0;
    public final kotlin.Lazy g0;
    public final com.truecaller.editprofile.impl.ui.legacy.baz h0;
    public com.truecaller.editprofile.impl.ui.legacy.s i;
    public ag0.qux j;
    public bv.c k;
    public a82.baz l;
    public hk2.i m;
    public final kotlin.Lazy n;
    public final kotlin.Lazy o;
    public android.view.View p;
    public final kotlin.Lazy q;
    public final kotlin.Lazy r;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public final kotlin.Lazy y;
    public final kotlin.Lazy z;

    public d() {
        super(6);
        final int i = 0;
        this.n = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.editprofile.impl.ui.legacy.bar
            public final /* synthetic */ com.truecaller.editprofile.impl.ui.legacy.d b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i) {
                    case 0:
                        android.content.Context requireContext = this.b.requireContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        return new u03.g0(yy.qux.v(requireContext, true));
                    default:
                        return new w31.c((u03.f0) this.b.n.getValue(), 0);
                }
            }
        });
        final int i2 = 1;
        this.o = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.editprofile.impl.ui.legacy.bar
            public final /* synthetic */ com.truecaller.editprofile.impl.ui.legacy.d b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i2) {
                    case 0:
                        android.content.Context requireContext = this.b.requireContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        return new u03.g0(yy.qux.v(requireContext, true));
                    default:
                        return new w31.c((u03.f0) this.b.n.getValue(), 0);
                }
            }
        });
        this.q = gj.m.K(this, 2131362470);
        this.r = gj.m.K(this, 2131362471);
        this.s = gj.m.K(this, 2131362472);
        this.t = gj.m.K(this, 2131362473);
        this.u = gj.m.K(this, 2131363013);
        this.v = gj.m.K(this, 2131363011);
        this.w = gj.m.K(this, 2131363091);
        this.x = gj.m.K(this, 2131363135);
        this.y = gj.m.K(this, 2131363201);
        this.z = gj.m.K(this, 2131363598);
        this.A = gj.m.K(this, 2131363627);
        this.B = gj.m.K(this, 2131363630);
        this.C = gj.m.K(this, 2131367374);
        this.D = gj.m.K(this, 2131367375);
        this.E = gj.m.K(this, 2131363936);
        this.F = gj.m.K(this, 2131363939);
        this.G = gj.m.K(this, 2131364261);
        this.H = gj.m.K(this, 2131364265);
        this.I = gj.m.K(this, 2131364311);
        this.J = gj.m.K(this, 2131363093);
        this.K = gj.m.K(this, 2131364860);
        this.L = gj.m.K(this, 2131364862);
        this.M = gj.m.K(this, 2131364899);
        this.N = gj.m.K(this, 2131364902);
        this.O = gj.m.K(this, 2131365473);
        this.P = gj.m.K(this, 2131365711);
        this.Q = gj.m.K(this, 2131365709);
        this.R = gj.m.K(this, 2131363597);
        this.S = gj.m.K(this, 2131363599);
        this.T = gj.m.K(this, 2131366309);
        this.U = gj.m.K(this, 2131366310);
        this.V = gj.m.K(this, 2131366670);
        this.W = gj.m.K(this, 2131366669);
        this.X = gj.m.K(this, 2131367587);
        this.Y = gj.m.K(this, 2131367586);
        this.Z = gj.m.K(this, 2131367650);
        this.a0 = gj.m.K(this, 2131367651);
        this.b0 = gj.m.K(this, 2131362268);
        this.c0 = gj.m.K(this, 2131363069);
        this.d0 = gj.m.K(this, 2131366228);
        this.e0 = gj.m.K(this, 2131365007);
        this.f0 = gj.m.K(this, 2131367108);
        this.g0 = gj.m.K(this, 2131362392);
        this.h0 = new com.truecaller.editprofile.impl.ui.legacy.baz(this, 13);
    }

    public static java.lang.String h6(android.text.Editable editable) {
        java.lang.String obj;
        java.lang.String str = null;
        if (kotlin.text.StringsKt.X(editable)) {
            editable = null;
        }
        if (editable != null && (obj = editable.toString()) != null) {
            str = kotlin.text.StringsKt.u0(obj).toString();
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static java.lang.String i6(android.widget.EditText editText) {
        java.lang.String str;
        android.text.Editable text = editText.getText();
        if (text != null) {
            str = h6(text);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static void q6(com.google.android.material.textfield.TextInputLayout textInputLayout, pg2.h hVar) {
        pg2.f fVar;
        boolean z = hVar instanceof pg2.f;
        textInputLayout.setErrorEnabled(z);
        java.lang.String str = null;
        if (z) {
            fVar = (pg2.f) hVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            str = fVar.a;
        }
        textInputLayout.setError(str);
        if (textInputLayout.j.q) {
            textInputLayout.requestFocus();
        }
    }

    @Override // a82.qux
    public final void L1(a82.d dVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "result");
        com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) d6();
        if (dVar != null) {
            df3.bar barVar = null;
            if (dVar.equals(a82.b.a)) {
                fg3.h0.J(sVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.editprofile.impl.ui.legacy.l(sVar, barVar, 5), 3);
                com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar != null) {
                    ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).o6();
                }
                com.truecaller.editprofile.impl.ui.legacy.h hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar2 != null) {
                    ((com.truecaller.editprofile.impl.ui.legacy.d) hVar2).n6(false);
                    return;
                }
                return;
            }
            if (dVar instanceof a82.a) {
                com.truecaller.editprofile.impl.ui.legacy.h hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar3 != null) {
                    a82.a aVar = (a82.a) dVar;
                    android.net.Uri uri = aVar.a;
                    w03.bar barVar2 = aVar.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "croppingSpecs");
                    a82.baz bazVar = ((com.truecaller.editprofile.impl.ui.legacy.d) hVar3).l;
                    if (bazVar != null) {
                        bazVar.b(uri, barVar2);
                        return;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("photoCropHelper");
                        throw null;
                    }
                }
                return;
            }
            if (dVar instanceof a82.c) {
                com.truecaller.editprofile.impl.ui.legacy.h hVar4 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar4 != null) {
                    android.net.Uri uri2 = ((a82.c) dVar).a;
                    com.truecaller.editprofile.impl.ui.legacy.d dVar2 = (com.truecaller.editprofile.impl.ui.legacy.d) hVar4;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri2, "uri");
                    bv.c cVar = dVar2.k;
                    if (cVar != null) {
                        android.content.Context requireContext = dVar2.requireContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        dVar2.startActivity(cVar.a(requireContext, uri2, "ContactEditor"));
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("imageCroppingIntentBuilder");
                    throw null;
                }
                return;
            }
            throw new java.lang.RuntimeException();
        }
    }

    public final void L3(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        java.lang.String tag = tcSystemDialog.getTag();
        if (tag != null && tag.hashCode() == 457190743 && tag.equals("TAG_IMAGE_FORBIDDEN_DIALOG")) {
            ((com.truecaller.editprofile.impl.ui.legacy.s) d6()).u2();
        }
    }

    @Override // a82.bar
    public final void W1(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) d6();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
        fg3.h0.J(sVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.editprofile.impl.ui.legacy.m(sVar, uri, (df3.bar) null), 3);
    }

    public final void Z5() {
        android.view.View currentFocus;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
        }
        ((android.view.View) this.z.getValue()).requestFocus();
    }

    public final w31.c a6() {
        return (w31.c) this.o.getValue();
    }

    public final android.widget.EditText b6() {
        return (android.widget.EditText) this.E.getValue();
    }

    public final android.widget.EditText c6() {
        return (android.widget.EditText) this.M.getValue();
    }

    public final com.truecaller.editprofile.impl.ui.legacy.g d6() {
        com.truecaller.editprofile.impl.ui.legacy.s sVar = this.i;
        if (sVar != null) {
            return sVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final void e2(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        androidx.fragment.app.FragmentActivity activity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        java.lang.String tag = tcSystemDialog.getTag();
        if (tag != null) {
            int hashCode = tag.hashCode();
            if (hashCode != -2092617451) {
                if (hashCode != 318992986) {
                    if (hashCode == 457190743 && tag.equals("TAG_IMAGE_FORBIDDEN_DIALOG")) {
                        ((com.truecaller.editprofile.impl.ui.legacy.s) d6()).u2();
                        return;
                    }
                    return;
                }
                if (tag.equals("TAG_EXIT_WITHOUT_SAVING_DIALOG") && (activity = getActivity()) != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            if (tag.equals("TAG_EDIT_VERIFIED_NAME_DIALOG")) {
                com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) d6();
                qx2.d3 h = qx2.hg.h();
                h.m("ChangeVerifiedNamePopup");
                h.l("CancelChangeName");
                qx2.hg h2 = h.h();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "build(...)");
                j71.g.K(h2, sVar.r);
            }
        }
    }

    public final com.truecaller.common.ui.button.ProgressButton e6() {
        return (com.truecaller.common.ui.button.ProgressButton) this.d0.getValue();
    }

    public final void f3(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        java.lang.String tag = tcSystemDialog.getTag();
        if (tag != null) {
            int hashCode = tag.hashCode();
            if (hashCode != -2092617451) {
                if (hashCode != 318992986) {
                    if (hashCode == 457190743 && tag.equals("TAG_IMAGE_FORBIDDEN_DIALOG")) {
                        ((com.truecaller.editprofile.impl.ui.legacy.s) d6()).p2(true);
                        return;
                    }
                    return;
                }
                if (tag.equals("TAG_EXIT_WITHOUT_SAVING_DIALOG")) {
                    com.truecaller.editprofile.impl.ui.legacy.g d6 = d6();
                    android.widget.EditText b6 = b6();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b6, "<get-firstNameEditText>(...)");
                    java.lang.String i6 = i6(b6);
                    android.widget.EditText c6 = c6();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c6, "<get-lastNameEditText>(...)");
                    java.lang.String i63 = i6(c6);
                    android.widget.EditText editText = (android.widget.EditText) this.A.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText, "<get-emailEditText>(...)");
                    java.lang.String i64 = i6(editText);
                    android.widget.EditText editText2 = (android.widget.EditText) this.W.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText2, "<get-streetEditText>(...)");
                    java.lang.String i65 = i6(editText2);
                    android.widget.EditText editText3 = (android.widget.EditText) this.Z.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText3, "<get-zipCodeEditText>(...)");
                    java.lang.String i66 = i6(editText3);
                    android.widget.EditText editText4 = (android.widget.EditText) this.v.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText4, "<get-cityEditText>(...)");
                    java.lang.String i67 = i6(editText4);
                    android.widget.EditText editText5 = (android.widget.EditText) this.w.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText5, "<get-companyEditText>(...)");
                    java.lang.String i68 = i6(editText5);
                    android.widget.EditText editText6 = (android.widget.EditText) this.K.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText6, "<get-jobTitleEditText>(...)");
                    java.lang.String i69 = i6(editText6);
                    android.widget.EditText editText7 = (android.widget.EditText) this.Y.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText7, "<get-websiteEditText>(...)");
                    java.lang.String i610 = i6(editText7);
                    android.widget.EditText editText8 = (android.widget.EditText) this.q.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText8, "<get-bioEditText>(...)");
                    ((com.truecaller.editprofile.impl.ui.legacy.s) d6).v2(i6, i63, i64, i65, i66, i67, i68, i69, i610, i6(editText8));
                    return;
                }
                return;
            }
            if (tag.equals("TAG_EDIT_VERIFIED_NAME_DIALOG")) {
                com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) d6();
                fg3.h0.J(sVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.editprofile.impl.ui.legacy.l(sVar, null, 1), 3);
            }
        }
    }

    public final void f6() {
        java.lang.String str;
        androidx.fragment.app.FragmentActivity activity;
        for (androidx.fragment.app.Fragment fragment : getChildFragmentManager().c.f()) {
            if (fragment instanceof gh1.baz) {
                ((gh1.baz) fragment).getParentFragmentManager().U();
                return;
            } else if (fragment instanceof gh1.j) {
                ((gh1.j) fragment).getParentFragmentManager().U();
                return;
            }
        }
        com.truecaller.editprofile.impl.ui.legacy.g d6 = d6();
        android.widget.EditText b6 = b6();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b6, "<get-firstNameEditText>(...)");
        java.lang.String i6 = i6(b6);
        android.widget.EditText c6 = c6();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c6, "<get-lastNameEditText>(...)");
        java.lang.String i63 = i6(c6);
        android.widget.EditText editText = (android.widget.EditText) this.A.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText, "<get-emailEditText>(...)");
        java.lang.String i64 = i6(editText);
        android.widget.EditText editText2 = (android.widget.EditText) this.W.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText2, "<get-streetEditText>(...)");
        java.lang.String i65 = i6(editText2);
        android.widget.EditText editText3 = (android.widget.EditText) this.Z.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText3, "<get-zipCodeEditText>(...)");
        java.lang.String i66 = i6(editText3);
        android.widget.EditText editText4 = (android.widget.EditText) this.v.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText4, "<get-cityEditText>(...)");
        java.lang.String i67 = i6(editText4);
        android.widget.EditText editText5 = (android.widget.EditText) this.w.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText5, "<get-companyEditText>(...)");
        java.lang.String i68 = i6(editText5);
        android.widget.EditText editText6 = (android.widget.EditText) this.K.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText6, "<get-jobTitleEditText>(...)");
        java.lang.String i69 = i6(editText6);
        android.widget.EditText editText7 = (android.widget.EditText) this.Y.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText7, "<get-websiteEditText>(...)");
        java.lang.String i610 = i6(editText7);
        android.widget.EditText editText8 = (android.widget.EditText) this.q.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText8, "<get-bioEditText>(...)");
        java.lang.String i611 = i6(editText8);
        com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) d6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i6, "firstName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i63, "lastName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i64, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i65, "streetAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i66, "zipCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i67, "city");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i68, "company");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i69, "jobTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i610, "website");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i611, "bio");
        if (!sVar.A) {
            java.lang.String h2 = com.truecaller.editprofile.impl.ui.legacy.s.h2(i6);
            java.lang.String h23 = com.truecaller.editprofile.impl.ui.legacy.s.h2(i63);
            java.lang.String h24 = com.truecaller.editprofile.impl.ui.legacy.s.h2(i64);
            java.lang.String h25 = com.truecaller.editprofile.impl.ui.legacy.s.h2(i65);
            java.lang.String h26 = com.truecaller.editprofile.impl.ui.legacy.s.h2(i66);
            java.lang.String h27 = com.truecaller.editprofile.impl.ui.legacy.s.h2(i67);
            java.lang.String h28 = com.truecaller.editprofile.impl.ui.legacy.s.h2(i68);
            java.lang.String h29 = com.truecaller.editprofile.impl.ui.legacy.s.h2(i69);
            java.lang.String h210 = com.truecaller.editprofile.impl.ui.legacy.s.h2(i610);
            java.lang.String h211 = com.truecaller.editprofile.impl.ui.legacy.s.h2(i611);
            java.util.Date date = sVar.x;
            if (date == null || (str = sVar.B.format(date)) == null) {
                str = "";
            }
            com.truecaller.editprofile.impl.ui.legacy.i iVar = new com.truecaller.editprofile.impl.ui.legacy.i(h2, h23, h24, h25, h26, h27, h28, h29, h210, h211, str, sVar.w.name(), null);
            if (sVar.C) {
                com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar != null) {
                    androidx.fragment.app.g1 childFragmentManager = ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).getChildFragmentManager();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    com.truecaller.common.ui.dialogs.qux.b(childFragmentManager, "TAG_EXIT_WITHOUT_FORCE_UPDATE_DIALOG", 2132020767, 2132020766, 2131233714, 2132019037, (java.lang.Integer) null, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 448);
                    return;
                }
                return;
            }
            if (!kotlin.jvm.internal.Intrinsics.b(sVar.u, iVar)) {
                com.truecaller.editprofile.impl.ui.legacy.h hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar2 != null) {
                    androidx.fragment.app.g1 childFragmentManager2 = ((com.truecaller.editprofile.impl.ui.legacy.d) hVar2).getChildFragmentManager();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                    com.truecaller.common.ui.dialogs.qux.b(childFragmentManager2, "TAG_EXIT_WITHOUT_SAVING_DIALOG", 2132020777, 2132020776, (java.lang.Integer) null, 2132021640, 2132021601, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 400);
                    return;
                }
                return;
            }
            com.truecaller.editprofile.impl.ui.legacy.h hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
            if (hVar3 != null && (activity = ((com.truecaller.editprofile.impl.ui.legacy.d) hVar3).getActivity()) != null) {
                activity.finish();
            }
        }
    }

    public final void g6(com.truecaller.editprofile.impl.ui.legacy.Gender gender) {
        com.truecaller.editprofile.impl.ui.legacy.i iVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gender, "gender");
        com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) d6();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gender, "gender");
        sVar.w = gender;
        com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
        if (hVar != null) {
            java.lang.String k2 = sVar.k2(gender);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k2, "gender");
            ((android.widget.EditText) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).G.getValue()).setText(k2);
        }
        com.truecaller.editprofile.impl.ui.legacy.i j2 = sVar.j2();
        if (j2 != null) {
            iVar = com.truecaller.editprofile.impl.ui.legacy.i.a(j2, null, null, null, null, null, null, null, null, null, null, null, gender.name(), 6143);
        } else {
            iVar = null;
        }
        sVar.x2(iVar);
    }

    public final void j6(com.google.android.material.textfield.TextInputLayout textInputLayout) {
        ((android.view.View) this.O.getValue()).post(new com.amazon.aps.ads.util.adview.baz(18, this, textInputLayout));
    }

    public final void k4(java.lang.String str, com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        java.lang.String tag = tcSystemDialog.getTag();
        if (tag != null && tag.hashCode() == 457190743 && tag.equals("TAG_IMAGE_FORBIDDEN_DIALOG")) {
            t41.p.n(requireContext(), str);
            nc0.u1.e(uf.qux.p("ImageUploadCommunityGuidelinesClicked", "action", "ImageUploadCommunityGuidelinesClicked", (java.lang.String) null, "InvalidImagePopup"), ((com.truecaller.editprofile.impl.ui.legacy.s) d6()).r);
        }
    }

    public final void k6(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "avatarUri");
        a6().C2(new com.truecaller.common.ui.avatar.AvatarXConfig(uri, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, false, false, false, false, (java.lang.Integer) null, false, true, false, false, false, (java.lang.String) null, false, false, -131074), true);
    }

    public final void l6(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "avatarUrl");
        android.net.Uri parse = android.net.Uri.parse(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        k6(parse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.text.DateFormat] */
    public final void m6(java.util.Date date, java.text.SimpleDateFormat simpleDateFormat) {
        java.lang.String format;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleDateFormat, "defaultDateFormat");
        android.view.View view = this.p;
        if (view != null) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131367033);
            android.content.Context context = getContext();
            if (context == null) {
                format = "";
            } else {
                ?? dateFormat = android.text.format.DateFormat.getDateFormat(context);
                if (dateFormat != 0) {
                    simpleDateFormat = dateFormat;
                }
                format = simpleDateFormat.format(date);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            }
            textView.setText(format);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("birthdayPickerDialogTitleView");
        throw null;
    }

    public final void n6(boolean z) {
        com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig = a6().h0;
        if (avatarXConfig != null) {
            a6().C2(com.truecaller.common.ui.avatar.AvatarXConfig.a(avatarXConfig, (android.net.Uri) null, (java.lang.String) null, false, false, false, false, (java.lang.Integer) null, false, false, z, false, false, (java.lang.String) null, false, false, -524289), false);
        }
    }

    public final void o6() {
        a6().C2(new com.truecaller.common.ui.avatar.AvatarXConfig((android.net.Uri) null, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, false, false, false, false, (java.lang.Integer) null, false, true, false, false, false, (java.lang.String) null, false, false, -917506), false);
        ((com.truecaller.common.ui.avatar.AvatarXView) this.g0.getValue()).setOnClickListener(new com.truecaller.editprofile.impl.ui.legacy.a(this, 0));
    }

    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        com.truecaller.social_login.SocialAccountProfile socialAccountProfile;
        com.truecaller.editprofile.impl.ui.legacy.h hVar;
        com.truecaller.editprofile.impl.ui.legacy.h hVar2;
        com.truecaller.editprofile.impl.ui.legacy.h hVar3;
        super.onActivityResult(i, i2, intent);
        int i3 = 3;
        if (i == 3) {
            com.truecaller.editprofile.impl.ui.legacy.g d6 = d6();
            int i4 = com.truecaller.social_login.google.GoogleLoginActivity.e0;
            df3.bar barVar = null;
            if (intent != null) {
                socialAccountProfile = (com.truecaller.social_login.SocialAccountProfile) intent.getParcelableExtra("result");
            } else {
                socialAccountProfile = null;
            }
            com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) d6;
            u03.g0 g0Var = sVar.g;
            if (i2 == -1) {
                if (socialAccountProfile != null) {
                    sVar.z = socialAccountProfile.e;
                    java.lang.String str = socialAccountProfile.a;
                    if (str == null || str.length() <= 0) {
                        str = null;
                    }
                    if (str != null && (hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a) != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "firstName");
                        ((com.truecaller.editprofile.impl.ui.legacy.d) hVar3).b6().setText(str);
                    }
                    java.lang.String str2 = socialAccountProfile.b;
                    if (str2 == null || str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 != null && (hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a) != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "lastName");
                        ((com.truecaller.editprofile.impl.ui.legacy.d) hVar2).c6().setText(str2);
                    }
                    java.lang.String str3 = socialAccountProfile.c;
                    if (str3 == null || str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 != null && (hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a) != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "email");
                        ((android.widget.EditText) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).A.getValue()).setText(str3);
                    }
                    java.lang.String str4 = socialAccountProfile.d;
                    if (str4 == null || str4.length() <= 0) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        com.truecaller.editprofile.impl.ui.legacy.h hVar4 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                        if (hVar4 != null) {
                            ((com.truecaller.editprofile.impl.ui.legacy.d) hVar4).l6(str4);
                        }
                        com.truecaller.editprofile.impl.ui.legacy.h hVar5 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                        if (hVar5 != null) {
                            ((com.truecaller.editprofile.impl.ui.legacy.d) hVar5).n6(true);
                        }
                        fg3.h0.J(sVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.data.country.f(sVar, str4, barVar, i3), 3);
                        return;
                    }
                    return;
                }
                com.truecaller.editprofile.impl.ui.legacy.h hVar6 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar6 != null) {
                    java.lang.String h = g0Var.h(2132020786, new java.lang.Object[]{"GOOGLE"});
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
                    ((com.truecaller.editprofile.impl.ui.legacy.d) hVar6).s6(h);
                    return;
                }
                return;
            }
            com.truecaller.editprofile.impl.ui.legacy.h hVar7 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
            if (hVar7 != null) {
                java.lang.String h2 = g0Var.h(2132020747, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "getString(...)");
                ((com.truecaller.editprofile.impl.ui.legacy.d) hVar7).s6(h2);
            }
        }
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(2131559162, viewGroup, false);
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(android.widget.DatePicker datePicker, int i, int i2, int i3) {
        com.truecaller.editprofile.impl.ui.legacy.i iVar;
        java.lang.String str;
        java.lang.String format;
        java.lang.String format2;
        com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) d6();
        java.text.SimpleDateFormat simpleDateFormat = sVar.B;
        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.editprofile.impl.ui.legacy.s.D;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(1, i);
        calendar.set(2, i2);
        calendar.set(5, i3);
        java.util.Date time = calendar.getTime();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        sVar.x = time;
        com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
        if (hVar != null) {
            com.truecaller.editprofile.impl.ui.legacy.d dVar = (com.truecaller.editprofile.impl.ui.legacy.d) hVar;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(time, "dateOfBirthday");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleDateFormat, "defaultBirthdayFormat");
            android.widget.EditText editText = (android.widget.EditText) dVar.s.getValue();
            android.content.Context context = dVar.getContext();
            if (context == null) {
                format2 = "";
            } else {
                java.text.DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(context);
                if (dateFormat == null) {
                    dateFormat = simpleDateFormat;
                }
                format2 = dateFormat.format(time);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            }
            editText.setText(format2);
        }
        com.truecaller.editprofile.impl.ui.legacy.i j2 = sVar.j2();
        if (j2 != null) {
            java.util.Date date = sVar.x;
            if (date == null || (format = simpleDateFormat.format(date)) == null) {
                str = "";
            } else {
                str = format;
            }
            iVar = com.truecaller.editprofile.impl.ui.legacy.i.a(j2, null, null, null, null, null, null, null, null, null, null, str, null, 7167);
        } else {
            iVar = null;
        }
        sVar.x2(iVar);
    }

    public final void onDestroyView() {
        ((com.truecaller.editprofile.impl.ui.legacy.s) d6()).m1();
        super.onDestroyView();
    }

    public final void onResume() {
        super.onResume();
        com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) d6();
        fg3.h0.J(sVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.editprofile.impl.ui.legacy.l(sVar, null, 3), 3);
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        java.io.Serializable serializable;
        com.truecaller.editprofile.api.ui.AutoFocusOnField autoFocusOnField;
        com.truecaller.editprofile.impl.ui.legacy.h hVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        kotlin.Lazy lazy = this.g0;
        ((com.truecaller.common.ui.avatar.AvatarXView) lazy.getValue()).setPresenter(a6());
        ((com.truecaller.common.ui.avatar.AvatarXView) lazy.getValue()).setOnClickListener(new com.truecaller.editprofile.impl.ui.legacy.a(this, 2));
        a82.baz bazVar = this.l;
        df3.bar barVar = null;
        if (bazVar != null) {
            bazVar.a(this);
            ((android.widget.EditText) this.C.getValue()).setOnClickListener(new com.truecaller.editprofile.impl.ui.legacy.a(this, 3));
            ((com.truecaller.editprofile.impl.ui.legacy.s) d6()).u0(this);
            com.truecaller.editprofile.impl.ui.legacy.g d6 = d6();
            android.os.Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("ARG_AUTO_FOCUS_ON_FIELD");
            } else {
                serializable = null;
            }
            if (serializable instanceof com.truecaller.editprofile.api.ui.AutoFocusOnField) {
                autoFocusOnField = (com.truecaller.editprofile.api.ui.AutoFocusOnField) serializable;
            } else {
                autoFocusOnField = null;
            }
            com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) d6;
            boolean z = false;
            if (autoFocusOnField != null && (hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a) != null) {
                com.truecaller.editprofile.impl.ui.legacy.d dVar = (com.truecaller.editprofile.impl.ui.legacy.d) hVar;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoFocusOnField, "field");
                switch (com.truecaller.editprofile.impl.ui.legacy.c.a[autoFocusOnField.ordinal()]) {
                    case 1:
                        dVar.b6().requestFocus();
                        break;
                    case 2:
                        dVar.c6().requestFocus();
                        break;
                    case 3:
                        com.google.android.material.textfield.TextInputLayout textInputLayout = (com.google.android.material.textfield.TextInputLayout) dVar.P.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout, "<get-phoneNumberEditTextInputLayout>(...)");
                        dVar.j6(textInputLayout);
                        ((com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6()).q2();
                        break;
                    case 4:
                        com.google.android.material.textfield.TextInputLayout textInputLayout2 = (com.google.android.material.textfield.TextInputLayout) dVar.U.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout2, "<get-secondaryPhoneNumberTextInputLayout>(...)");
                        dVar.j6(textInputLayout2);
                        ((com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6()).w2();
                        break;
                    case 5:
                        com.google.android.material.textfield.TextInputLayout textInputLayout3 = (com.google.android.material.textfield.TextInputLayout) dVar.B.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout3, "<get-emailTextInputLayout>(...)");
                        dVar.j6(textInputLayout3);
                        ((android.widget.EditText) dVar.A.getValue()).requestFocus();
                        break;
                    case 6:
                        com.google.android.material.textfield.TextInputLayout textInputLayout4 = (com.google.android.material.textfield.TextInputLayout) dVar.t.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout4, "<get-birthdayTextInputLayout>(...)");
                        dVar.j6(textInputLayout4);
                        ((com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6()).o2();
                        break;
                    case 7:
                        com.google.android.material.textfield.TextInputLayout textInputLayout5 = (com.google.android.material.textfield.TextInputLayout) dVar.H.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout5, "<get-genderEditTextInputLayout>(...)");
                        dVar.j6(textInputLayout5);
                        ((com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6()).r2();
                        break;
                    case 8:
                        ((android.widget.EditText) dVar.W.getValue()).requestFocus();
                        break;
                    case 9:
                        ((android.widget.EditText) dVar.Z.getValue()).requestFocus();
                        break;
                    case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                        ((android.widget.EditText) dVar.v.getValue()).requestFocus();
                        break;
                    case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                        ((android.widget.EditText) dVar.y.getValue()).requestFocus();
                        break;
                    case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                        ((android.widget.EditText) dVar.w.getValue()).requestFocus();
                        break;
                    case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                        ((android.widget.EditText) dVar.K.getValue()).requestFocus();
                        break;
                    case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                        ((android.widget.EditText) dVar.Y.getValue()).requestFocus();
                        break;
                    case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                        ((android.widget.EditText) dVar.q.getValue()).requestFocus();
                        break;
                    case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                        ((com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6()).p2(false);
                        break;
                    default:
                        throw new java.lang.RuntimeException();
                }
            }
            android.os.Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                z = arguments2.getBoolean("ARG_VALIDATE_PROFILE");
            }
            if (z) {
                com.truecaller.editprofile.impl.ui.legacy.s sVar2 = (com.truecaller.editprofile.impl.ui.legacy.s) d6();
                fg3.h0.J(sVar2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.editprofile.impl.ui.legacy.l(sVar2, barVar, 4), 3);
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("photoCropHelper");
        throw null;
    }

    public final void p6(java.lang.String str, kotlin.jvm.functions.Function1 function1) {
        com.truecaller.common.ui.button.ProgressButton e6 = e6();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e6, "<get-saveLoaderButton>(...)");
        gj.m.j0(e6);
        e6().setText(str);
        e6().setOnClickListener(new aq2.g(9, function1));
    }

    public final void r6(pg2.k0 k0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k0Var, "profileError");
        com.google.android.material.textfield.TextInputLayout textInputLayout = (com.google.android.material.textfield.TextInputLayout) this.r.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout, "<get-bioTextInputLayout>(...)");
        q6(textInputLayout, k0Var.h);
        com.google.android.material.textfield.TextInputLayout textInputLayout2 = (com.google.android.material.textfield.TextInputLayout) this.L.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout2, "<get-jobTitleTextInputLayout>(...)");
        q6(textInputLayout2, k0Var.g);
        com.google.android.material.textfield.TextInputLayout textInputLayout3 = (com.google.android.material.textfield.TextInputLayout) this.J.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout3, "<get-companyNameInputLayout>(...)");
        q6(textInputLayout3, k0Var.f);
        com.google.android.material.textfield.TextInputLayout textInputLayout4 = (com.google.android.material.textfield.TextInputLayout) this.V.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout4, "<get-streetTextInputLayout>(...)");
        q6(textInputLayout4, k0Var.d);
        com.google.android.material.textfield.TextInputLayout textInputLayout5 = (com.google.android.material.textfield.TextInputLayout) this.u.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout5, "<get-cityTextInputLayout>(...)");
        q6(textInputLayout5, k0Var.e);
        com.google.android.material.textfield.TextInputLayout textInputLayout6 = (com.google.android.material.textfield.TextInputLayout) this.N.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout6, "<get-lastNameTextInputLayout>(...)");
        q6(textInputLayout6, k0Var.b);
        com.google.android.material.textfield.TextInputLayout textInputLayout7 = (com.google.android.material.textfield.TextInputLayout) this.F.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout7, "<get-firstNameTextInputLayout>(...)");
        q6(textInputLayout7, k0Var.a);
        com.google.android.material.textfield.TextInputLayout textInputLayout8 = (com.google.android.material.textfield.TextInputLayout) this.B.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout8, "<get-emailTextInputLayout>(...)");
        q6(textInputLayout8, k0Var.j);
        com.google.android.material.textfield.TextInputLayout textInputLayout9 = (com.google.android.material.textfield.TextInputLayout) this.a0.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout9, "<get-zipCodeEditTextInputLayout>(...)");
        q6(textInputLayout9, k0Var.i);
    }

    public final void s6(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "message");
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        android.widget.Toast.makeText(context, str, 0).show();
    }
}
