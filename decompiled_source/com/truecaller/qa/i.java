package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class i implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ i(int i, java.lang.Object obj, java.lang.Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        java.lang.String str;
        int i2 = this.a;
        boolean z = true;
        java.lang.String str2 = null;
        java.lang.Object obj = this.c;
        java.lang.Object obj2 = this.b;
        switch (i2) {
            case 0:
                androidx.appcompat.app.AppCompatActivity appCompatActivity = (com.truecaller.qa.QMActivity) obj2;
                java.util.List list = (java.util.List) obj;
                int i3 = com.truecaller.qa.QMActivity.B1;
                dx2.bar barVar = dx2.bar.a;
                dx2.bar.g((dx2.d) list.get(i));
                android.widget.Toast.makeText((android.content.Context) appCompatActivity, (java.lang.CharSequence) ("Theme set to " + ((dx2.d) list.get(i)).b), 0).show();
                appCompatActivity.getApplicationContext().setTheme(((dx2.d) list.get(i)).c);
                y90.m6.P(appCompatActivity, com.truecaller.bottombar.BottomBarButtonType.CALLS, (java.lang.String) null, true);
                return;
            case 1:
                java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                tx.baz bazVar = ((com.truecaller.search.global.m) obj2).i;
                if (bazVar != null) {
                    java.lang.String str3 = (java.lang.String) arrayList.get(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "searchToken");
                    java.lang.Object obj3 = ((com.truecaller.search.global.h0) bazVar).a;
                    if (obj3 != null) {
                        ((com.truecaller.search.global.m) ((com.truecaller.search.global.i0) obj3)).b6(str3, com.truecaller.analytics.AppEvents.GlobalSearch.NavigationSource.NUMBER_SCAN_MANUAL);
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
                throw null;
            case 2:
                com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext referralManager$ReferralLaunchContext = (com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext) obj;
                dj2.z zVar = ((dj2.t) obj2).j;
                zVar.q = referralManager$ReferralLaunchContext;
                com.truecaller.log.AssertionUtil.isNotNull(zVar.a, new java.lang.String[0]);
                dj2.a0 a0Var = zVar.c;
                a0Var.getClass();
                if (jj3.bar.i(ne0.baz.k("referralLink"))) {
                    zVar.p = 1;
                    zVar.e.D(zVar);
                    return;
                } else {
                    dj2.t tVar = (dj2.t) zVar.a;
                    a0Var.getClass();
                    tVar.W4(ne0.baz.k("referralCode"), zVar.e2(), referralManager$ReferralLaunchContext, zVar.b);
                    return;
                }
            case 3:
                h93.baz bazVar2 = (h93.baz) ((eq.m0) obj2).c;
                if (((kotlin.jvm.internal.h0) obj).a != 1) {
                    z = false;
                }
                bazVar2.k("welcome_page_button_is_variant", z);
                dialogInterface.dismiss();
                return;
            case 4:
                com.truecaller.qa.x xVar = (com.truecaller.qa.x) ((dg.b0) obj2).a;
                java.util.List list2 = (java.util.List) obj;
                if (i == 0) {
                    xVar.g0("qaForcedInboxBanner", null);
                } else {
                    xVar.g0("qaForcedInboxBanner", (java.lang.String) list2.get(i - 1));
                }
                dialogInterface.dismiss();
                return;
            case 5:
                vb2.b bVar = (vb2.b) obj;
                androidx.appcompat.widget.AppCompatEditText appCompatEditText = ((i82.o) obj2).g;
                if (appCompatEditText != null) {
                    str2 = appCompatEditText.getText().toString().trim();
                }
                bVar.a(str2);
                return;
            case 6:
                vb2.b bVar2 = (vb2.b) obj;
                androidx.appcompat.widget.AppCompatEditText appCompatEditText2 = ((i82.o) obj2).g;
                if (appCompatEditText2 != null) {
                    str2 = appCompatEditText2.getText().toString().trim();
                }
                bVar2.a(str2);
                return;
            case 7:
                w22.x xVar2 = (w22.x) obj;
                j02.u a6 = ((j02.f) obj2).a6();
                a6.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xVar2, "conversationListItem");
                com.truecaller.messaging.data.types.Conversation conversation = xVar2.s;
                if (conversation != null) {
                    j02.qux quxVar = a6.v;
                    ((u03.qux) a6.B).getClass();
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    quxVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversation, "conversation");
                    quxVar.a("cancel", false, currentTimeMillis, conversation);
                    return;
                }
                return;
            case 8:
                k92.j jVar = (k92.j) obj2;
                ff3.g gVar = (ff3.g) obj;
                kotlin.jvm.internal.Intrinsics.e(dialogInterface, "null cannot be cast to non-null type android.app.Dialog");
                android.view.View findViewById = ((android.app.Dialog) dialogInterface).findViewById(2131364682);
                kotlin.jvm.internal.Intrinsics.e(findViewById, "null cannot be cast to non-null type android.widget.EditText");
                java.lang.String obj4 = ((android.widget.EditText) findViewById).getText().toString();
                if (!android.text.TextUtils.isEmpty(obj4)) {
                    ng3.b bVar3 = fg3.r0.a;
                    fg3.h0.J(fg3.f1.a, lg3.k.a, (fg3.f0) null, new k5.l(gVar, obj4, (df3.bar) null), 2);
                    android.content.Context context = (android.content.Context) jVar.a;
                    android.widget.Toast.makeText(context, context.getString(2132022453), 0).show();
                    return;
                }
                return;
            case 9:
                com.truecaller.feature_toggles.control_panel.FeaturesControlPanelActivity featuresControlPanelActivity = (com.truecaller.feature_toggles.control_panel.FeaturesControlPanelActivity) obj2;
                com.truecaller.featuretoggles.FeatureKey featureKey = (com.truecaller.featuretoggles.FeatureKey) obj;
                int i4 = com.truecaller.feature_toggles.control_panel.FeaturesControlPanelActivity.f0;
                kotlin.jvm.internal.Intrinsics.e(dialogInterface, "null cannot be cast to non-null type android.app.Dialog");
                java.lang.String obj5 = ((android.widget.EditText) ((android.app.Dialog) dialogInterface).findViewById(2131363921)).getText().toString();
                mo1.k t0 = featuresControlPanelActivity.t0();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureKey, "featureKey");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj5, "newFirebaseString");
                t0.c.c(featureKey).f(obj5);
                t0.d2((java.lang.String) null);
                android.widget.Toast.makeText((android.content.Context) featuresControlPanelActivity, (java.lang.CharSequence) "String changed", 1).show();
                return;
            case 10:
                h72.a aVar = n12.a.l;
                n12.h b6 = ((n12.a) obj2).b6();
                java.lang.Enum r2 = ((com.truecaller.messaging.conversation.notifications.ConversationMutePeriod[]) obj)[i];
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "period");
                fg3.h0.J(b6, b6.e, (fg3.f0) null, new mc.b(b6, r2, (df3.bar) null, 18), 2);
                int i5 = n12.d.a[r2.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            str = "forever";
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    } else {
                        str = "24h";
                    }
                } else {
                    str = "1h";
                }
                b6.q = str;
                return;
            case 11:
                p02.s0 s0Var = (p02.s0) obj2;
                android.net.Uri uri = (android.net.Uri) obj;
                if (i == 0) {
                    p02.i1 i1Var = s0Var.j;
                    i1Var.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
                    i1Var.d2(uri);
                    return;
                }
                p02.i1 i1Var2 = s0Var.j;
                i1Var2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
                i1Var2.L2(com.truecaller.messaging.conversation.draft.DraftMode.VCARD, kotlin.collections.x.c(new com.truecaller.messaging.conversation.draft.DraftUri(uri, com.truecaller.messaging.conversation.draft.UriTypeHint.VCARD, false)), kotlin.collections.h0.a, (java.lang.String) null, false, -1L, 0);
                return;
            case 12:
                java.lang.CharSequence text = ((android.widget.TextView) ((android.view.View) obj).findViewById(2131364964)).getText();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                android.widget.EditText editText = ((p12.e) obj2).c;
                int selectionStart = editText.getSelectionStart();
                int selectionEnd = editText.getSelectionEnd();
                if (selectionStart != selectionEnd) {
                    android.text.Editable text2 = editText.getText();
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                    spannableStringBuilder.append(text2.subSequence(0, selectionStart));
                    spannableStringBuilder.append((java.lang.CharSequence) "[");
                    spannableStringBuilder.append(text2.subSequence(selectionStart, selectionEnd));
                    spannableStringBuilder.append((java.lang.CharSequence) "](");
                    spannableStringBuilder.append(text);
                    spannableStringBuilder.append((java.lang.CharSequence) ")");
                    spannableStringBuilder.append(text2.subSequence(selectionEnd, text2.length()));
                    editText.setText(spannableStringBuilder);
                    editText.setSelection(text.length() + selectionEnd + 4);
                    return;
                }
                return;
            case 13:
                s42.x xVar3 = (s42.x) obj2;
                java.util.LinkedHashMap s = kotlin.collections.r0.s((java.util.LinkedHashMap) obj);
                fg3.h0.J(xVar3, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s2.k(xVar3, s, (df3.bar) null, 3), 3);
                xVar3.c("unblock", s);
                xVar3.e(s42.i.a);
                return;
            case 14:
                com.truecaller.qa.x xVar4 = ((u21.bar) obj2).b;
                java.lang.String str4 = (java.lang.String) ((kotlin.jvm.internal.j0) obj).a;
                xVar4.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "value");
                xVar4.g0("ctCustomServerEndpoint", str4);
                return;
            default:
                java.lang.String str5 = (java.lang.String) obj;
                y00.bar barVar2 = y83.d.t;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogInterface, "<unused var>");
                y83.x xVar5 = (y83.x) ((y83.d) obj2).e5();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "phoneNumber");
                xVar5.j2(com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action.Confirmed);
                xVar5.n2(str5);
                return;
        }
    }

    public /* synthetic */ i(k92.j jVar, kotlin.jvm.functions.Function2 function2) {
        this.a = 8;
        this.b = jVar;
        this.c = (ff3.g) function2;
    }
}
