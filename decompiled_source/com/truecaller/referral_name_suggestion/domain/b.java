package com.truecaller.referral_name_suggestion.domain;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class b {
    public static final java.util.Set k = kotlin.collections.y0.b(com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton.WHATSAPP);
    public final kotlin.coroutines.CoroutineContext a;
    public final wj2.j b;
    public final u03.q c;
    public final dj2.a0 d;
    public final w82.q1 e;
    public final r31.bar f;
    public final gj2.baz g;
    public final v03.qux h;
    public final u03.b0 i;
    public final kotlin.Lazy j;

    public b(kotlin.coroutines.CoroutineContext coroutineContext, wj2.j jVar, u03.q qVar, dj2.a0 a0Var, w82.q1 q1Var, r31.bar barVar, gj2.baz bazVar, v03.qux quxVar, u03.b0 b0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "asyncContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "userGrowthConfigsInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "gsonUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "referralSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(q1Var, "premiumStateSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "coreSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "contactSearchHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "resourceProvider");
        this.a = coroutineContext;
        this.b = jVar;
        this.c = qVar;
        this.d = a0Var;
        this.e = q1Var;
        this.f = barVar;
        this.g = bazVar;
        this.h = quxVar;
        this.i = b0Var;
        this.j = kotlin.LazyKt.lazy(new g10.n(this, 18));
    }

    public static com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext c(java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "launchContext");
        com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext.Companion.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        java.util.Iterator it = com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.b(((com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext) obj).getAnalyticsContext(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext) obj;
    }

    public final boolean a() {
        w82.r1 r1Var = this.e;
        if (r1Var.G() && r1Var.A() == com.truecaller.premium.data.PremiumScope.PAID_PREMIUM) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        return new org.joda.time.DateTime(this.f.f("profileVerificationDate", 0L)).B(30).k();
    }

    public final ej2.qux d(com.truecaller.referral_name_suggestion.domain.FirebaseDialogConfig firebaseDialogConfig, ej2.baz bazVar) {
        com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage o;
        ej2.bar barVar;
        int i;
        com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext referralAnalyticsContext;
        char c;
        com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton o2;
        java.lang.Object obj;
        com.truecaller.referral_name_suggestion.domain.FirebaseDialogConfig.Button button;
        java.lang.Object obj2;
        com.truecaller.referral_name_suggestion.domain.FirebaseDialogConfig.Image image;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseDialogConfig, "firebaseConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "contact");
        java.lang.String str = bazVar.a;
        if (str == null) {
            return null;
        }
        try {
            kotlin.o oVar = kotlin.q.b;
            com.truecaller.referral_name_suggestion.domain.qux quxVar = com.truecaller.referral_name_suggestion.domain.FirebaseDialogConfig.Image.Companion;
            java.lang.String image2 = firebaseDialogConfig.getImage();
            quxVar.getClass();
            if (image2 == null) {
                image = null;
            } else {
                java.util.Iterator it = com.truecaller.referral_name_suggestion.domain.FirebaseDialogConfig.Image.getEntries().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        java.lang.String value = ((com.truecaller.referral_name_suggestion.domain.FirebaseDialogConfig.Image) obj2).getValue();
                        java.lang.String upperCase = image2.toUpperCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        if (kotlin.jvm.internal.Intrinsics.b(value, upperCase)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                image = (com.truecaller.referral_name_suggestion.domain.FirebaseDialogConfig.Image) obj2;
            }
            if (image != null) {
                o = image.toReferralImage();
            } else {
                o = null;
            }
        } catch (java.lang.Throwable th) {
            kotlin.o oVar2 = kotlin.q.b;
            o = od.p.o(th);
        }
        kotlin.o oVar3 = kotlin.q.b;
        if (o instanceof kotlin.p) {
            o = null;
        }
        com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage referralNameSuggestionImage = o;
        if (referralNameSuggestionImage == null) {
            referralNameSuggestionImage = com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage.PROTECT;
        }
        com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage referralNameSuggestionImage2 = referralNameSuggestionImage;
        if (referralNameSuggestionImage2 == com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionImage.CONTACT) {
            barVar = bazVar.b;
        } else {
            barVar = null;
        }
        kotlin.collections.j0 buttons = firebaseDialogConfig.getButtons();
        if (buttons == null) {
            buttons = kotlin.collections.j0.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : (java.lang.Iterable) buttons) {
            try {
                kotlin.o oVar4 = kotlin.q.b;
                com.truecaller.referral_name_suggestion.domain.FirebaseDialogConfig.Button.Companion.getClass();
                if (str2 == null) {
                    button = null;
                } else {
                    java.util.Iterator it3 = com.truecaller.referral_name_suggestion.domain.FirebaseDialogConfig.Button.getEntries().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj = it3.next();
                            java.lang.String value2 = ((com.truecaller.referral_name_suggestion.domain.FirebaseDialogConfig.Button) obj).getValue();
                            java.lang.String upperCase2 = str2.toUpperCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                            if (kotlin.jvm.internal.Intrinsics.b(value2, upperCase2)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    button = (com.truecaller.referral_name_suggestion.domain.FirebaseDialogConfig.Button) obj;
                }
                if (button != null) {
                    o2 = button.toReferralButton();
                } else {
                    o2 = null;
                }
            } catch (java.lang.Throwable th3) {
                kotlin.o oVar5 = kotlin.q.b;
                o2 = od.p.o(th3);
            }
            if (o2 instanceof kotlin.p) {
                o2 = null;
            }
            com.truecaller.referral_name_suggestion.api.entity.ReferralNameSuggestionButton referralNameSuggestionButton = o2;
            if (referralNameSuggestionButton != null) {
                arrayList.add(referralNameSuggestionButton);
            }
        }
        java.util.Set K0 = kotlin.collections.CollectionsKt.K0(arrayList);
        if (K0.isEmpty()) {
            K0 = k;
        }
        java.util.Set set = K0;
        com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext c2 = c(firebaseDialogConfig.getTrigger());
        if (c2 == null) {
            return null;
        }
        if (c2 != com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext.SURVEY_AFTER_CALL && c2 != com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext.SURVEY_DETAILS_VIEW) {
            i = 2132022511;
        } else {
            i = 2132022512;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c2, "<this>");
        switch (gj2.b.a[c2.ordinal()]) {
            case 1:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.HOME_SCREEN;
                break;
            case 2:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.INBOX_OVERFLOW;
                break;
            case 3:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.CONTACTS;
                break;
            case 4:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.USER_BUSY_PROMPT;
                break;
            case 5:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.AFTER_CALL;
                break;
            case 6:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.NAVIGATION_DRAWER;
                break;
            case 7:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.PUSH_NOTIFICATION;
                break;
            case 8:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.DEEP_LINK;
                break;
            case 9:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.AFTER_CALL_PROMO;
                break;
            case 10:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.SEARCH_SCREEN_PROMO;
                break;
            case 11:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.BOTTOM_BAR;
                break;
            case 12:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.PROMO_POPUP;
                break;
            case 13:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.PREMIUM_TAB_V2;
                break;
            case 14:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.CONVERSATION;
                break;
            case 15:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.FACS_AFTER_CALL;
                break;
            case 16:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.CONTACT_EDIT;
                break;
            case 17:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.CONTACT_ADD;
                break;
            case 18:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.SURVEY_AFTER_CALL;
                break;
            case 19:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.SURVEY_DETAILS_VIEW;
                break;
            case 20:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.INVITE_FRIENDS;
                break;
            case 21:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.INVITE_FRIENDS_PREMIUM;
                break;
            case 22:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.STARTUP_PROMO;
                break;
            case 23:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.STARTUP_PROMO_PREMIUM;
                break;
            case 24:
                referralAnalyticsContext = com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext.UNKNOWN;
                break;
            default:
                throw new java.lang.RuntimeException();
        }
        com.truecaller.referral_name_suggestion.api.analytics.ReferralAnalyticsContext referralAnalyticsContext2 = referralAnalyticsContext;
        java.lang.String title = firebaseDialogConfig.getTitle();
        u03.b0 b0Var = this.i;
        if (title == null || title.length() == 0) {
            title = ((u03.g0) b0Var).h(2132022513, "$name");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(title, "getString(...)");
        }
        java.lang.String subtitle = firebaseDialogConfig.getSubtitle();
        if (subtitle == null || subtitle.length() == 0) {
            subtitle = ((u03.g0) b0Var).h(i, "$name");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtitle, "getString(...)");
        }
        java.lang.String str3 = subtitle;
        java.lang.Character variantChar = firebaseDialogConfig.getVariantChar();
        if (variantChar != null) {
            c = variantChar.charValue();
        } else {
            c = 'j';
        }
        return new ej2.qux(referralAnalyticsContext2, referralNameSuggestionImage2, title, str, str3, c, e(2132022510, firebaseDialogConfig.getPublicMessage(), str), e(2132022509, firebaseDialogConfig.getPrivateMessage(), str), set, barVar);
    }

    public final java.lang.String e(int i, java.lang.String str, java.lang.String str2) {
        if (str != null && str.length() != 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
            return kotlin.text.y.s(str, "$name", str2, false);
        }
        java.lang.String h = ((u03.g0) this.i).h(i, str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
        return h;
    }

    public final boolean f() {
        dj2.a0 a0Var = this.d;
        try {
            kotlin.o oVar = kotlin.q.b;
            boolean b = b();
            a0Var.getClass();
            int i = (int) ne0.baz.i.getLong("referralNameSuggestionDialogTimesShown", 0);
            boolean a = a();
            if (!b && !a) {
                if (i == 0) {
                    return true;
                }
                if (i < 3) {
                    a0Var.getClass();
                    return new org.joda.time.DateTime(ne0.baz.i.getLong("referralNameSuggestionDialogLastShown", 0L)).J(i).n();
                }
            }
            return false;
        } catch (java.lang.Throwable th) {
            kotlin.o oVar2 = kotlin.q.b;
            java.lang.Boolean o = od.p.o(th);
            if (kotlin.q.a(o) != null) {
                o = java.lang.Boolean.FALSE;
            }
            return o.booleanValue();
        }
    }
}
