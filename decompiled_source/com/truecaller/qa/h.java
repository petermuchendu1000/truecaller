package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class h implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.qa.QMActivity b;

    public /* synthetic */ h(int i, com.truecaller.qa.QMActivity qMActivity) {
        this.a = i;
        this.b = qMActivity;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [com.truecaller.qa.QMActivity, android.content.Context, java.lang.Object] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, final int i) {
        android.content.Intent putExtra;
        android.content.Intent putExtra2;
        int i2 = this.a;
        final int i3 = 0;
        final ?? r11 = this.b;
        switch (i2) {
            case 0:
                int i4 = com.truecaller.qa.QMActivity.B1;
                r11.getClass();
                java.lang.String obj = ((android.widget.EditText) ((android.app.Dialog) dialogInterface).findViewById(2131363348)).getText().toString();
                if (obj != null && obj.length() < 3 && android.text.TextUtils.isDigitsOnly(obj)) {
                    r11.i0.l("verificationLastSequenceNumber", java.lang.Integer.parseInt(obj));
                    r11.i0.m("vsnt_value", java.lang.System.currentTimeMillis());
                    return;
                } else {
                    android.widget.Toast.makeText((android.content.Context) r11, "Invalid number!", 0).show();
                    return;
                }
            case 1:
                int i5 = com.truecaller.qa.QMActivity.B1;
                android.app.Dialog dialog = (android.app.Dialog) dialogInterface;
                java.lang.CharSequence text = ((android.widget.TextView) dialog.findViewById(2131363406)).getText();
                java.lang.CharSequence text2 = ((android.widget.TextView) dialog.findViewById(2131363409)).getText();
                java.lang.CharSequence text3 = ((android.widget.TextView) dialog.findViewById(2131363407)).getText();
                java.lang.CharSequence text4 = ((android.widget.TextView) dialog.findViewById(2131363408)).getText();
                if (!android.text.TextUtils.isEmpty(text) && !android.text.TextUtils.isEmpty(text2) && !jj3.bar.i(text3) && !jj3.bar.i(text4)) {
                    com.truecaller.searchwarnings.data.SearchWarningDTO searchWarningDTO = new com.truecaller.searchwarnings.data.SearchWarningDTO(java.lang.String.valueOf(text), java.lang.String.valueOf(text2), java.lang.String.valueOf(text3), "#00FF00", "#1900FF", "https://storage.googleapis.com/tc-search-context-eu/message-icon/ic_fraud.png", java.lang.Integer.parseInt(text4.toString()));
                    up2.qux quxVar = r11.N0;
                    com.truecaller.searchwarnings.data.SearchWarningDTO[] searchWarningDTOArr = {searchWarningDTO};
                    quxVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchWarningDTOArr, "searchWarnings");
                    fg3.h0.P(new up2.baz(quxVar, searchWarningDTOArr, null, 1));
                    android.widget.Toast.makeText((android.content.Context) r11, "Created search warning, id=" + ((java.lang.Object) text) + ", title=" + ((java.lang.Object) text2) + ", message=" + ((java.lang.Object) text3) + ", messageDisplayState=" + ((java.lang.Object) text4), 1).show();
                    return;
                }
                android.widget.Toast.makeText((android.content.Context) r11, "Incomplete input, no search warning added", 0).show();
                return;
            case 2:
                r11.G0.a.edit().putInt("insightsReminderTime", i).apply();
                return;
            case 3:
                int i6 = com.truecaller.qa.QMActivity.B1;
                java.lang.CharSequence text5 = ((android.widget.TextView) ((android.app.Dialog) dialogInterface).findViewById(2131363376)).getText();
                if (!android.text.TextUtils.isEmpty(text5) && android.text.TextUtils.isDigitsOnly(text5)) {
                    int parseInt = java.lang.Integer.parseInt(java.lang.String.valueOf(text5));
                    r11.D0.d0("getWhoViewedMeCounter", parseInt);
                    android.widget.Toast.makeText((android.content.Context) r11, "Counter updated, counter value: " + parseInt, 0).show();
                    return;
                }
                android.widget.Toast.makeText((android.content.Context) r11, "Incomplete input, counter not changed", 0).show();
                return;
            case 4:
                int i7 = com.truecaller.qa.QMActivity.B1;
                java.lang.CharSequence text6 = ((android.widget.TextView) ((android.app.Dialog) dialogInterface).findViewById(2131363376)).getText();
                if (!android.text.TextUtils.isEmpty(text6) && android.text.TextUtils.isDigitsOnly(text6)) {
                    int parseInt2 = java.lang.Integer.parseInt(java.lang.String.valueOf(text6));
                    r11.D0.d0("userHomeNotificationsCount", parseInt2);
                    android.widget.Toast.makeText((android.content.Context) r11, "Counter updated, counter value: " + parseInt2, 0).show();
                    return;
                }
                android.widget.Toast.makeText((android.content.Context) r11, "Incomplete input, counter not changed", 0).show();
                return;
            case 5:
                final com.truecaller.forcedupdate.UpdateType a = r11.e0.a();
                new i.d((android.content.Context) r11).setTitle("Current: " + a.name()).c(new java.lang.String[]{"No update", "Optional update", "Required update", "Version discontinued"}, new android.content.DialogInterface.OnClickListener() { // from class: com.truecaller.qa.k
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface2, int i8) {
                        com.truecaller.forcedupdate.UpdateType updateType;
                        java.lang.Boolean bool;
                        int i9 = i3;
                        java.lang.Object obj2 = a;
                        int i10 = i;
                        java.lang.Object obj3 = r11;
                        switch (i9) {
                            case 0:
                                androidx.fragment.app.FragmentActivity fragmentActivity = (com.truecaller.qa.QMActivity) obj3;
                                com.truecaller.forcedupdate.UpdateType updateType2 = (com.truecaller.forcedupdate.UpdateType) obj2;
                                int i11 = com.truecaller.qa.QMActivity.B1;
                                com.truecaller.forcedupdate.UpdateType updateType3 = com.truecaller.forcedupdate.UpdateType.NONE;
                                if (i8 != 1) {
                                    if (i8 != 2) {
                                        if (i8 != 3) {
                                            updateType = updateType3;
                                        } else {
                                            updateType = com.truecaller.forcedupdate.UpdateType.DISCONTINUED;
                                        }
                                    } else {
                                        updateType = com.truecaller.forcedupdate.UpdateType.REQUIRED;
                                    }
                                } else {
                                    updateType = com.truecaller.forcedupdate.UpdateType.OPTIONAL;
                                }
                                fragmentActivity.e0.c(updateType, "market://details?id=com.truecaller", 1);
                                if (i10 == 1) {
                                    androidx.fragment.app.g1 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                                    mp1.bar barVar = fragmentActivity.e0;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportFragmentManager, "fragmentManager");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "forcedUpdateManager");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("qaLaunchContext", "launchContext");
                                    com.truecaller.forcedupdate.UpdateType b = barVar.b(true);
                                    if (b != updateType3 && !supportFragmentManager.R()) {
                                        com.truecaller.forcedupdate.ui.a aVar = new com.truecaller.forcedupdate.ui.a();
                                        android.os.Bundle bundle = new android.os.Bundle();
                                        bundle.putString("argForcedUpdateType", b.name());
                                        bundle.putString("argContext", "qaLaunchContext");
                                        aVar.setArguments(bundle);
                                        aVar.show(supportFragmentManager, com.truecaller.forcedupdate.ui.a.class.getSimpleName());
                                    }
                                } else if (i10 == 2) {
                                    com.truecaller.forcedupdate.ui.ForcedUpdateActivity.t0(fragmentActivity);
                                }
                                android.widget.Toast.makeText((android.content.Context) fragmentActivity, (java.lang.CharSequence) ("State changed from " + updateType2.name() + " to " + fragmentActivity.e0.a().name()), 0).show();
                                return;
                            default:
                                java.lang.String str = (java.lang.String) obj2;
                                p02.p2 p2Var = ((p02.s0) obj3).i;
                                p2Var.getClass();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
                                qw2.b0 b0Var = (qw2.b0) p2Var.C;
                                if (!b0Var.n()) {
                                    for (java.lang.String str2 : b0Var.g()) {
                                        p02.s0 s0Var = (p02.q2) p2Var.a;
                                        if (s0Var != null) {
                                            bool = java.lang.Boolean.valueOf(s0Var.l6(str2));
                                        } else {
                                            bool = null;
                                        }
                                        if (yp.d0.D(bool)) {
                                            p02.s0 s0Var2 = (p02.q2) p2Var.a;
                                            if (s0Var2 != null) {
                                                p02.s0 s0Var3 = s0Var2;
                                                new tx.z0(2132018370, s0Var3.requireContext(), 2132018369).e5(s0Var3.getChildFragmentManager());
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    p02.s0 s0Var4 = (p02.q2) p2Var.a;
                                    if (s0Var4 != null) {
                                        p02.s0 s0Var5 = s0Var4;
                                        if0.y1.P(s0Var5, ((qw2.b0) s0Var5.s).g(), i10);
                                        return;
                                    }
                                    return;
                                }
                                p02.s0 s0Var6 = (p02.q2) p2Var.a;
                                if (s0Var6 != null) {
                                    p02.s0 s0Var7 = s0Var6;
                                    s0Var7.startActivityForResult(com.truecaller.messaging.defaultsms.DefaultSmsActivity.u0(s0Var7.requireContext(), str, (java.lang.String) null, (java.lang.String) null, "flowDeleteSMS", true), i10);
                                    return;
                                }
                                return;
                        }
                    }
                }).m();
                return;
            case 6:
                int i8 = com.truecaller.qa.QMActivity.B1;
                android.app.Dialog dialog2 = (android.app.Dialog) dialogInterface;
                java.lang.CharSequence text7 = ((android.widget.TextView) dialog2.findViewById(2131363325)).getText();
                java.lang.CharSequence text8 = ((android.widget.TextView) dialog2.findViewById(2131363328)).getText();
                java.lang.CharSequence text9 = ((android.widget.TextView) dialog2.findViewById(2131363327)).getText();
                if (!android.text.TextUtils.isEmpty(text8) && !android.text.TextUtils.isEmpty(text9)) {
                    if (((com.truecaller.network.advanced.edge.baz) r11.w0.get()).a(java.lang.String.valueOf(text7), java.lang.String.valueOf(text8), java.lang.String.valueOf(text9))) {
                        android.widget.Toast.makeText((android.content.Context) r11, "Added edge endpoint named " + ((java.lang.Object) text8) + " pointing to " + ((java.lang.Object) text9), 1).show();
                        return;
                    }
                    android.widget.Toast.makeText((android.content.Context) r11, "Error adding edge endpoint", 0).show();
                    return;
                }
                return;
            case 7:
                int i9 = com.truecaller.qa.QMActivity.B1;
                r11.getClass();
                java.lang.String charSequence = ((android.widget.TextView) ((android.app.Dialog) dialogInterface).findViewById(2131363323)).getText().toString();
                if (!android.text.TextUtils.isEmpty(charSequence)) {
                    hz1.d dVar = r11.G0;
                    int parseInt3 = java.lang.Integer.parseInt(charSequence);
                    android.content.SharedPreferences sharedPreferences = dVar.a;
                    sharedPreferences.edit().putInt("highlights_tab_views", parseInt3).apply();
                    if (sharedPreferences.getInt("highlights_tab_views", 0) == parseInt3) {
                        android.widget.Toast.makeText((android.content.Context) r11, "Counter set to: " + charSequence, 1).show();
                        return;
                    }
                    android.widget.Toast.makeText((android.content.Context) r11, "Error setting banner counter", 0).show();
                    return;
                }
                return;
            case 8:
                int i10 = com.truecaller.qa.QMActivity.B1;
                r11.getClass();
                android.app.Dialog dialog3 = (android.app.Dialog) dialogInterface;
                java.lang.CharSequence text10 = ((android.widget.TextView) dialog3.findViewById(2131363425)).getText();
                java.lang.CharSequence text11 = ((android.widget.TextView) dialog3.findViewById(2131363426)).getText();
                if (!android.text.TextUtils.isEmpty(text10) && !android.text.TextUtils.isEmpty(text11)) {
                    kx2.bar barVar = r11.j0;
                    java.lang.String valueOf = java.lang.String.valueOf(text10);
                    java.lang.String valueOf2 = java.lang.String.valueOf(text11);
                    java.util.List asList = java.util.Arrays.asList(1L, 2L);
                    barVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueOf2, "number");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "categories");
                    barVar.e.c(0, kotlin.collections.x.c(new com.truecaller.topspammers.api.TopSpammer(barVar.f.k(valueOf2), valueOf, 999, asList, null, 16, null)));
                    android.widget.Toast.makeText((android.content.Context) r11, "Created top spammer, name=" + ((java.lang.Object) text10) + ", value=" + ((java.lang.Object) text11), 1).show();
                    return;
                }
                android.widget.Toast.makeText((android.content.Context) r11, "Incomplete input, no top spammer added", 0).show();
                return;
            case 9:
                int i11 = com.truecaller.qa.QMActivity.B1;
                java.lang.CharSequence text12 = ((android.widget.TextView) ((android.app.Dialog) dialogInterface).findViewById(2131363376)).getText();
                if (!android.text.TextUtils.isEmpty(text12) && android.text.TextUtils.isDigitsOnly(text12)) {
                    int parseInt4 = java.lang.Integer.parseInt(java.lang.String.valueOf(text12));
                    r11.D0.d0("userAppearedInSearchesCount", parseInt4);
                    android.widget.Toast.makeText((android.content.Context) r11, "Counter updated, counter value: " + parseInt4, 0).show();
                    return;
                }
                android.widget.Toast.makeText((android.content.Context) r11, "Incomplete input, counter not changed", 0).show();
                return;
            case 10:
                int i12 = com.truecaller.qa.QMActivity.B1;
                r11.getClass();
                if (i == 0) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r11, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("qaLaunchContext", "analyticsLaunchContext");
                    putExtra = new android.content.Intent((android.content.Context) r11, (java.lang.Class<?>) com.truecaller.premium.gift.GoldGiftDialogActivity.class).putExtra("EXTRA_SKIP_INTRO", false).putExtra("EXTRA_ANALYTICS_CONTEXT_TYPE", "goldGiftSender_dialog").putExtra("EXTRA_ANALYTICS_LAUNCH_CONTEXT", "qaLaunchContext").putExtra("EXTRA_SKIP_INTRO", false).addFlags(268435456);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "addFlags(...)");
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r11, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Someone", com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Some number", "number");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("qaLaunchContext", "analyticsLaunchContext");
                    putExtra = new android.content.Intent((android.content.Context) r11, (java.lang.Class<?>) com.truecaller.premium.gift.GoldGiftDialogActivity.class).addFlags(268435456).putExtra("EXTRA_SENDER_NAME", "Someone").putExtra("EXTRA_ANALYTICS_CONTEXT_TYPE", "goldGiftReceiver_dialog").putExtra("EXTRA_ANALYTICS_LAUNCH_CONTEXT", "qaLaunchContext").putExtra("EXTRA_SENDER_NUMBER", "Some number");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                }
                r11.startActivity(putExtra);
                dialogInterface.dismiss();
                return;
            default:
                int i14 = com.truecaller.qa.QMActivity.B1;
                r11.getClass();
                if (i == 0) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r11, "context");
                    putExtra2 = new android.content.Intent((android.content.Context) r11, (java.lang.Class<?>) com.truecaller.premium.giveaway.GiveawayGrantDialogActivity.class).putExtra("ExtraScreenType", com.truecaller.premium.giveaway.GiveawayGrantDialogMvp.ScreenType.ALREADY_GRANTED.name());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra2, "putExtra(...)");
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r11, "context");
                    putExtra2 = new android.content.Intent((android.content.Context) r11, (java.lang.Class<?>) com.truecaller.premium.giveaway.GiveawayGrantDialogActivity.class).putExtra("ExtraScreenType", com.truecaller.premium.giveaway.GiveawayGrantDialogMvp.ScreenType.UPGRADE_FAILED.name());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra2, "putExtra(...)");
                }
                r11.startActivity(putExtra2);
                dialogInterface.dismiss();
                return;
        }
    }
}
