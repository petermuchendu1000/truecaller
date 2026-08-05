package com.truecaller.editprofile.impl.ui.legacy;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class baz implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.editprofile.impl.ui.legacy.d b;

    public /* synthetic */ baz(com.truecaller.editprofile.impl.ui.legacy.d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.truecaller.editprofile.impl.ui.legacy.h hVar;
        java.lang.String str4;
        java.lang.String str5;
        com.truecaller.editprofile.impl.ui.legacy.h hVar2;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        com.truecaller.editprofile.impl.ui.legacy.h hVar3;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        com.truecaller.editprofile.impl.ui.legacy.h hVar4;
        int i = this.a;
        java.lang.String str20 = "";
        com.truecaller.editprofile.impl.ui.legacy.i iVar = null;
        com.truecaller.editprofile.impl.ui.legacy.d dVar = this.b;
        switch (i) {
            case 0:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((android.view.View) obj, "it");
                com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6();
                com.truecaller.editprofile.impl.ui.legacy.h hVar5 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar5 != null) {
                    zx.bar i2 = ((n11.l) sVar.k.b).i();
                    if (i2 != null && (str = i2.b) != null) {
                        str20 = str;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str20, "secondaryPhoneNumber");
                    androidx.fragment.app.g1 childFragmentManager = ((com.truecaller.editprofile.impl.ui.legacy.d) hVar5).getChildFragmentManager();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    childFragmentManager.getClass();
                    androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(childFragmentManager);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str20, "phoneNumber");
                    gh1.j jVar = new gh1.j();
                    jVar.setArguments(ue0.i.t(new kotlin.Pair[]{new kotlin.Pair("phoneNumber", str20)}));
                    barVar.g(2131364006, jVar, (java.lang.String) null);
                    barVar.d((java.lang.String) null);
                    barVar.l();
                }
                return kotlin.Unit.a;
            case 1:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((android.view.View) obj, "it");
                ((com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6()).o2();
                return kotlin.Unit.a;
            case 2:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((android.view.View) obj, "it");
                ((com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6()).r2();
                return kotlin.Unit.a;
            case 3:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((android.view.View) obj, "it");
                com.truecaller.editprofile.impl.ui.legacy.s sVar2 = (com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6();
                com.truecaller.editprofile.impl.ui.legacy.h hVar6 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar2).a;
                if (hVar6 != null) {
                    ((com.truecaller.editprofile.impl.ui.legacy.d) hVar6).Z5();
                }
                com.truecaller.editprofile.impl.ui.legacy.h hVar7 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar2).a;
                if (hVar7 != null) {
                    com.truecaller.editprofile.impl.ui.legacy.d dVar2 = (com.truecaller.editprofile.impl.ui.legacy.d) hVar7;
                    int i3 = com.truecaller.social_login.google.GoogleLoginActivity.e0;
                    android.content.Context requireContext = dVar2.requireContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requireContext, "context");
                    dVar2.startActivityForResult(new android.content.Intent(requireContext, (java.lang.Class<?>) com.truecaller.social_login.google.GoogleLoginActivity.class), 3);
                }
                return kotlin.Unit.a;
            case 4:
                android.text.Editable editable = (android.text.Editable) obj;
                com.truecaller.editprofile.impl.ui.legacy.g d6 = dVar.d6();
                if (editable != null) {
                    str2 = com.truecaller.editprofile.impl.ui.legacy.d.h6(editable);
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                com.truecaller.editprofile.impl.ui.legacy.s sVar3 = (com.truecaller.editprofile.impl.ui.legacy.s) d6;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "text");
                if (str3.length() > 0 && (hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar3).a) != null) {
                    com.google.android.material.textfield.TextInputLayout textInputLayout = (com.google.android.material.textfield.TextInputLayout) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).N.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout, "<get-lastNameTextInputLayout>(...)");
                    textInputLayout.setError((java.lang.CharSequence) null);
                    textInputLayout.setErrorEnabled(false);
                }
                com.truecaller.editprofile.impl.ui.legacy.i j2 = sVar3.j2();
                if (j2 != null) {
                    iVar = com.truecaller.editprofile.impl.ui.legacy.i.a(j2, null, str3, null, null, null, null, null, null, null, null, null, null, 8189);
                }
                sVar3.x2(iVar);
                return kotlin.Unit.a;
            case 5:
                android.text.Editable editable2 = (android.text.Editable) obj;
                com.truecaller.editprofile.impl.ui.legacy.g d63 = dVar.d6();
                if (editable2 != null) {
                    str4 = com.truecaller.editprofile.impl.ui.legacy.d.h6(editable2);
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                com.truecaller.editprofile.impl.ui.legacy.s sVar4 = (com.truecaller.editprofile.impl.ui.legacy.s) d63;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "text");
                if ((str5.length() == 0 || fu.baz.B(str5)) && (hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar4).a) != null) {
                    com.google.android.material.textfield.TextInputLayout textInputLayout2 = (com.google.android.material.textfield.TextInputLayout) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar2).B.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout2, "<get-emailTextInputLayout>(...)");
                    textInputLayout2.setError((java.lang.CharSequence) null);
                    textInputLayout2.setErrorEnabled(false);
                }
                com.truecaller.editprofile.impl.ui.legacy.i j23 = sVar4.j2();
                if (j23 != null) {
                    iVar = com.truecaller.editprofile.impl.ui.legacy.i.a(j23, null, null, str5, null, null, null, null, null, null, null, null, null, 8187);
                }
                sVar4.x2(iVar);
                return kotlin.Unit.a;
            case 6:
                android.text.Editable editable3 = (android.text.Editable) obj;
                com.truecaller.editprofile.impl.ui.legacy.g d64 = dVar.d6();
                if (editable3 != null) {
                    str6 = com.truecaller.editprofile.impl.ui.legacy.d.h6(editable3);
                } else {
                    str6 = null;
                }
                if (str6 == null) {
                    str7 = "";
                } else {
                    str7 = str6;
                }
                com.truecaller.editprofile.impl.ui.legacy.s sVar5 = (com.truecaller.editprofile.impl.ui.legacy.s) d64;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "text");
                com.truecaller.editprofile.impl.ui.legacy.i j24 = sVar5.j2();
                if (j24 != null) {
                    iVar = com.truecaller.editprofile.impl.ui.legacy.i.a(j24, null, null, null, str7, null, null, null, null, null, null, null, null, 8183);
                }
                sVar5.x2(iVar);
                return kotlin.Unit.a;
            case 7:
                android.text.Editable editable4 = (android.text.Editable) obj;
                com.truecaller.editprofile.impl.ui.legacy.g d65 = dVar.d6();
                if (editable4 != null) {
                    str8 = com.truecaller.editprofile.impl.ui.legacy.d.h6(editable4);
                } else {
                    str8 = null;
                }
                if (str8 == null) {
                    str9 = "";
                } else {
                    str9 = str8;
                }
                com.truecaller.editprofile.impl.ui.legacy.s sVar6 = (com.truecaller.editprofile.impl.ui.legacy.s) d65;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "text");
                com.truecaller.editprofile.impl.ui.legacy.i j25 = sVar6.j2();
                if (j25 != null) {
                    iVar = com.truecaller.editprofile.impl.ui.legacy.i.a(j25, null, null, null, null, str9, null, null, null, null, null, null, null, 8175);
                }
                sVar6.x2(iVar);
                return kotlin.Unit.a;
            case 8:
                android.text.Editable editable5 = (android.text.Editable) obj;
                com.truecaller.editprofile.impl.ui.legacy.g d66 = dVar.d6();
                if (editable5 != null) {
                    str10 = com.truecaller.editprofile.impl.ui.legacy.d.h6(editable5);
                } else {
                    str10 = null;
                }
                if (str10 == null) {
                    str11 = "";
                } else {
                    str11 = str10;
                }
                com.truecaller.editprofile.impl.ui.legacy.s sVar7 = (com.truecaller.editprofile.impl.ui.legacy.s) d66;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "text");
                com.truecaller.editprofile.impl.ui.legacy.i j26 = sVar7.j2();
                if (j26 != null) {
                    iVar = com.truecaller.editprofile.impl.ui.legacy.i.a(j26, null, null, null, null, null, str11, null, null, null, null, null, null, 8159);
                }
                sVar7.x2(iVar);
                return kotlin.Unit.a;
            case 9:
                android.text.Editable editable6 = (android.text.Editable) obj;
                com.truecaller.editprofile.impl.ui.legacy.g d67 = dVar.d6();
                if (editable6 != null) {
                    str12 = com.truecaller.editprofile.impl.ui.legacy.d.h6(editable6);
                } else {
                    str12 = null;
                }
                if (str12 == null) {
                    str13 = "";
                } else {
                    str13 = str12;
                }
                com.truecaller.editprofile.impl.ui.legacy.s sVar8 = (com.truecaller.editprofile.impl.ui.legacy.s) d67;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str13, "text");
                com.truecaller.editprofile.impl.ui.legacy.i j27 = sVar8.j2();
                if (j27 != null) {
                    iVar = com.truecaller.editprofile.impl.ui.legacy.i.a(j27, null, null, null, null, null, null, str13, null, null, null, null, null, 8127);
                }
                sVar8.x2(iVar);
                return kotlin.Unit.a;
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                android.text.Editable editable7 = (android.text.Editable) obj;
                com.truecaller.editprofile.impl.ui.legacy.g d68 = dVar.d6();
                if (editable7 != null) {
                    str14 = com.truecaller.editprofile.impl.ui.legacy.d.h6(editable7);
                } else {
                    str14 = null;
                }
                if (str14 == null) {
                    str15 = "";
                } else {
                    str15 = str14;
                }
                com.truecaller.editprofile.impl.ui.legacy.s sVar9 = (com.truecaller.editprofile.impl.ui.legacy.s) d68;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str15, "text");
                com.truecaller.editprofile.impl.ui.legacy.i j28 = sVar9.j2();
                if (j28 != null) {
                    iVar = com.truecaller.editprofile.impl.ui.legacy.i.a(j28, null, null, null, null, null, null, null, str15, null, null, null, null, 8063);
                }
                sVar9.x2(iVar);
                return kotlin.Unit.a;
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                android.text.Editable editable8 = (android.text.Editable) obj;
                com.truecaller.editprofile.impl.ui.legacy.g d69 = dVar.d6();
                if (editable8 != null) {
                    str16 = com.truecaller.editprofile.impl.ui.legacy.d.h6(editable8);
                } else {
                    str16 = null;
                }
                if (str16 != null) {
                    str20 = str16;
                }
                com.truecaller.editprofile.impl.ui.legacy.s sVar10 = (com.truecaller.editprofile.impl.ui.legacy.s) d69;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str20, "text");
                if ((str20.length() == 0 || com.truecaller.editprofile.impl.ui.legacy.s.m2(str20)) && (hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar10).a) != null) {
                    com.google.android.material.textfield.TextInputLayout textInputLayout3 = (com.google.android.material.textfield.TextInputLayout) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar3).X.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout3, "<get-websiteEditTextInputLayout>(...)");
                    textInputLayout3.setError((java.lang.CharSequence) null);
                    textInputLayout3.setErrorEnabled(false);
                }
                com.truecaller.editprofile.impl.ui.legacy.i j29 = sVar10.j2();
                if (j29 != null) {
                    iVar = com.truecaller.editprofile.impl.ui.legacy.i.a(j29, null, null, null, null, null, null, null, null, str20, null, null, null, 7935);
                }
                sVar10.x2(iVar);
                return kotlin.Unit.a;
            case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                android.text.Editable editable9 = (android.text.Editable) obj;
                com.truecaller.editprofile.impl.ui.legacy.g d610 = dVar.d6();
                if (editable9 != null) {
                    str17 = com.truecaller.editprofile.impl.ui.legacy.d.h6(editable9);
                } else {
                    str17 = null;
                }
                if (str17 != null) {
                    str20 = str17;
                }
                com.truecaller.editprofile.impl.ui.legacy.s sVar11 = (com.truecaller.editprofile.impl.ui.legacy.s) d610;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str20, "text");
                com.truecaller.editprofile.impl.ui.legacy.i j210 = sVar11.j2();
                if (j210 != null) {
                    iVar = com.truecaller.editprofile.impl.ui.legacy.i.a(j210, null, null, null, null, null, null, null, null, null, str20, null, null, 7679);
                }
                sVar11.x2(iVar);
                return kotlin.Unit.a;
            case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((android.view.View) obj, "it");
                com.truecaller.editprofile.impl.ui.legacy.g d611 = dVar.d6();
                android.widget.EditText b6 = dVar.b6();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b6, "<get-firstNameEditText>(...)");
                java.lang.String i6 = com.truecaller.editprofile.impl.ui.legacy.d.i6(b6);
                android.widget.EditText c6 = dVar.c6();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c6, "<get-lastNameEditText>(...)");
                java.lang.String i63 = com.truecaller.editprofile.impl.ui.legacy.d.i6(c6);
                android.widget.EditText editText = (android.widget.EditText) dVar.A.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText, "<get-emailEditText>(...)");
                java.lang.String i64 = com.truecaller.editprofile.impl.ui.legacy.d.i6(editText);
                android.widget.EditText editText2 = (android.widget.EditText) dVar.W.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText2, "<get-streetEditText>(...)");
                java.lang.String i65 = com.truecaller.editprofile.impl.ui.legacy.d.i6(editText2);
                android.widget.EditText editText3 = (android.widget.EditText) dVar.Z.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText3, "<get-zipCodeEditText>(...)");
                java.lang.String i66 = com.truecaller.editprofile.impl.ui.legacy.d.i6(editText3);
                android.widget.EditText editText4 = (android.widget.EditText) dVar.v.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText4, "<get-cityEditText>(...)");
                java.lang.String i67 = com.truecaller.editprofile.impl.ui.legacy.d.i6(editText4);
                android.widget.EditText editText5 = (android.widget.EditText) dVar.w.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText5, "<get-companyEditText>(...)");
                java.lang.String i68 = com.truecaller.editprofile.impl.ui.legacy.d.i6(editText5);
                android.widget.EditText editText6 = (android.widget.EditText) dVar.K.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText6, "<get-jobTitleEditText>(...)");
                java.lang.String i69 = com.truecaller.editprofile.impl.ui.legacy.d.i6(editText6);
                android.widget.EditText editText7 = (android.widget.EditText) dVar.Y.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText7, "<get-websiteEditText>(...)");
                java.lang.String i610 = com.truecaller.editprofile.impl.ui.legacy.d.i6(editText7);
                android.widget.EditText editText8 = (android.widget.EditText) dVar.q.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editText8, "<get-bioEditText>(...)");
                ((com.truecaller.editprofile.impl.ui.legacy.s) d611).v2(i6, i63, i64, i65, i66, i67, i68, i69, i610, com.truecaller.editprofile.impl.ui.legacy.d.i6(editText8));
                return kotlin.Unit.a;
            case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                android.text.Editable editable10 = (android.text.Editable) obj;
                com.truecaller.editprofile.impl.ui.legacy.g d612 = dVar.d6();
                if (editable10 != null) {
                    str18 = com.truecaller.editprofile.impl.ui.legacy.d.h6(editable10);
                } else {
                    str18 = null;
                }
                if (str18 == null) {
                    str19 = "";
                } else {
                    str19 = str18;
                }
                com.truecaller.editprofile.impl.ui.legacy.s sVar12 = (com.truecaller.editprofile.impl.ui.legacy.s) d612;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str19, "text");
                if (str19.length() > 0 && (hVar4 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar12).a) != null) {
                    com.google.android.material.textfield.TextInputLayout textInputLayout4 = (com.google.android.material.textfield.TextInputLayout) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar4).F.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputLayout4, "<get-firstNameTextInputLayout>(...)");
                    textInputLayout4.setError((java.lang.CharSequence) null);
                    textInputLayout4.setErrorEnabled(false);
                }
                com.truecaller.editprofile.impl.ui.legacy.i j211 = sVar12.j2();
                if (j211 != null) {
                    iVar = com.truecaller.editprofile.impl.ui.legacy.i.a(j211, str19, null, null, null, null, null, null, null, null, null, null, null, 8190);
                }
                sVar12.x2(iVar);
                return kotlin.Unit.a;
            case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((android.view.View) obj, "it");
                ((com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6()).w2();
                return kotlin.Unit.a;
            default:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((android.view.View) obj, "it");
                ((com.truecaller.editprofile.impl.ui.legacy.s) dVar.d6()).q2();
                return kotlin.Unit.a;
        }
    }
}
