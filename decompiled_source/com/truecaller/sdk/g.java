package com.truecaller.sdk;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class g extends com.truecaller.sdk.f {
    public final kotlin.coroutines.CoroutineContext b;
    public final android.telephony.TelephonyManager c;
    public final android.content.pm.PackageManager d;
    public final s62.d e;
    public final com.truecaller.sdk.i f;
    public final com.truecaller.sdk.o g;
    public final com.truecaller.sdk.o h;
    public final r31.bar i;
    public final mg2.bar j;
    public final q11.bar k;
    public final to1.e l;
    public final wj2.h m;
    public final qo1.q n;
    public final pz1.bar o;
    public final u03.g0 p;
    public final com.google.i18n.phonenumbers.PhoneNumberUtil q;
    public final u03.q r;
    public final qc3.bar s;
    public final po2.baz t;
    public java.util.Locale u;
    public ab.e v;
    public boolean w;
    public fp2.c x;

    public g(kotlin.coroutines.CoroutineContext coroutineContext, android.telephony.TelephonyManager telephonyManager, android.content.pm.PackageManager packageManager, s62.d dVar, com.truecaller.sdk.i iVar, com.truecaller.sdk.o oVar, com.truecaller.sdk.o oVar2, r31.bar barVar, mg2.bar barVar2, q11.bar barVar3, to1.e eVar, wj2.h hVar, qo1.q qVar, pz1.bar barVar4, u03.g0 g0Var, com.google.i18n.phonenumbers.PhoneNumberUtil phoneNumberUtil, u03.q qVar2, qc3.bar barVar5, po2.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "mUiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageManager, "mPackageManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "mNotificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "mEventsTrackHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "mSdkRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar2, "mSdkAccountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "mCoreSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "profileRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "accountSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "mSdkLocaleManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "sdkConfigsInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "mSdkFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "mActivityHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g0Var, "themedResourceProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberUtil, "phoneNumberUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar2, "gsonUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar5, "sdkMWebNetworkManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "legacyNetworkManager");
        this.b = coroutineContext;
        this.c = telephonyManager;
        this.d = packageManager;
        this.e = dVar;
        this.f = iVar;
        this.g = oVar;
        this.h = oVar2;
        this.i = barVar;
        this.j = barVar2;
        this.k = barVar3;
        this.l = eVar;
        this.m = hVar;
        this.n = qVar;
        this.o = barVar4;
        this.p = g0Var;
        this.q = phoneNumberUtil;
        this.r = qVar2;
        this.s = barVar5;
        this.t = bazVar;
    }

    public static java.lang.String j2(com.truecaller.android.sdk.common.models.TrueProfile trueProfile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trueProfile, "trueProfile");
        java.lang.String C = u03.e0.C(" ", trueProfile.firstName, trueProfile.lastName);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "combine(...)");
        return C;
    }

    @Override // com.truecaller.sdk.f
    public final void c2(com.truecaller.android.sdk.common.models.TrueProfile trueProfile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trueProfile, "trueProfile");
        f13.b bVar = this.i;
        trueProfile.verificationTimestamp = bVar.f("profileVerificationDate", 0L);
        trueProfile.verificationMode = bVar.h("profileVerificationMode");
        trueProfile.isSimChanged = o2();
        java.util.Locale locale = this.u;
        if (locale != null) {
            trueProfile.userLocale = locale;
        }
    }

    @Override // com.truecaller.sdk.f
    public final boolean d2(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        fg3.e0 bazVar;
        fg3.e0 e0Var;
        android.os.Bundle bundle3;
        pz1.bar barVar = this.o;
        if (bundle == null) {
            android.content.Intent intent = ((android.app.Activity) barVar.b).getIntent();
            if (intent != null) {
                bundle3 = intent.getExtras();
            } else {
                bundle3 = null;
            }
            if (bundle3 == null) {
                return false;
            }
            bundle2 = bundle3;
        } else {
            bundle2 = bundle;
        }
        kotlin.coroutines.CoroutineContext coroutineContext = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle2, "extras");
        s62.d dVar = this.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "notificationManager");
        com.truecaller.sdk.o oVar = this.g;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "sdkRepository");
        mg2.bar barVar2 = this.j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "profileRepository");
        q11.bar barVar3 = this.k;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "accountSettings");
        android.content.pm.PackageManager packageManager = this.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        com.truecaller.sdk.i iVar = this.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "eventsTrackerHolder");
        com.truecaller.sdk.o oVar2 = this.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar2, "sdkAccountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "activityHelper");
        qo1.q qVar = this.n;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "sdkFeaturesInventory");
        wj2.h hVar = this.m;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "sdkConfigsInventory");
        u03.q qVar2 = this.r;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar2, "gsonUtil");
        qc3.bar barVar4 = this.s;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "sdkMWebNetworkManager");
        po2.baz bazVar2 = this.t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "legacyNetworkManager");
        if (bundle2.containsKey("PARTNERINFO_TRUESDK_VERSION")) {
            e0Var = new fp2.b(coroutineContext, bundle2, barVar2, barVar3, packageManager, iVar, oVar2, qVar, hVar, barVar, qVar2, bazVar2);
        } else {
            if (bundle2.containsKey("a")) {
                bazVar = new fp2.d(bundle2, dVar, oVar, barVar2, barVar3, iVar, oVar2);
            } else {
                android.app.Activity activity = (android.app.Activity) barVar.b;
                if (kotlin.jvm.internal.Intrinsics.b(activity.getPackageName(), activity.getCallingPackage())) {
                    bazVar = new fp2.a(bundle2, barVar2, barVar3, iVar, oVar2);
                } else {
                    bazVar = new fp2.baz(coroutineContext, bundle2, barVar2, barVar3, oVar, iVar, oVar2, qVar, hVar, qVar2, barVar4);
                }
            }
            e0Var = bazVar;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "<set-?>");
        this.x = e0Var;
        this.v = n2().n();
        return true;
    }

    @Override // com.truecaller.sdk.f
    public void e2() {
        java.lang.Object obj = this.a;
        if (obj != null) {
            boolean z = !this.w;
            this.w = z;
            ((ip2.baz) obj).S0(z);
            fp2.c n2 = n2();
            boolean z2 = this.w;
            f43.baz bazVar = n2.f;
            bazVar.getClass();
            f43.baz.a0(bazVar, null, java.lang.Boolean.valueOf(z2), null, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (r2 == null) goto L29;
     */
    @Override // com.truecaller.sdk.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f2() {
        int i;
        android.text.SpannableStringBuilder spannableStringBuilder;
        kotlin.Unit unit;
        int i2;
        ip2.baz bazVar = (ip2.baz) this.a;
        if (bazVar == null) {
            return;
        }
        int j = n2().j();
        java.lang.Object obj = this.a;
        if (obj instanceof ip2.a) {
            com.truecaller.sdk.ConfirmProfileActivity confirmProfileActivity = (com.truecaller.sdk.ConfirmProfileActivity) ((ip2.a) obj);
            if (j == 1) {
                i2 = 2132084078;
            } else {
                i2 = 2132084079;
            }
            confirmProfileActivity.setTheme(i2);
            confirmProfileActivity.setContentView(2131558457);
        } else if (obj instanceof ip2.qux) {
            com.truecaller.sdk.FullScreenConfirmActivity fullScreenConfirmActivity = (com.truecaller.sdk.FullScreenConfirmActivity) ((ip2.qux) obj);
            if (j == 1) {
                i = 2132084076;
            } else {
                i = 2132084077;
            }
            fullScreenConfirmActivity.setTheme(i);
            fullScreenConfirmActivity.setContentView(fullScreenConfirmActivity.u0().a);
        }
        to1.e eVar = this.l;
        this.u = ((nz1.b) eVar.c).i;
        java.util.Locale i3 = n2().i();
        if (i3 != null) {
            java.lang.String language = i3.getLanguage();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
            if (language.length() > 0) {
                eVar.s(i3);
                unit = kotlin.Unit.a;
            } else {
                java.util.Locale locale = this.u;
                if (locale != null) {
                    eVar.s(locale);
                    unit = kotlin.Unit.a;
                } else {
                    unit = null;
                }
            }
        }
        java.util.Locale locale2 = this.u;
        if (locale2 != null) {
            eVar.s(locale2);
            kotlin.Unit unit2 = kotlin.Unit.a;
        }
        bazVar.Q0();
        boolean z = this.a instanceof ip2.bar;
        u03.g0 g0Var = this.p;
        if (z) {
            spannableStringBuilder = new android.text.SpannableStringBuilder(g0Var.h(2132018917, new java.lang.Object[0]));
        } else {
            spannableStringBuilder = new android.text.SpannableStringBuilder(g0Var.h(2132018916, new java.lang.Object[0]));
        }
        android.graphics.drawable.Drawable mutate = g0Var.d(2131233209).mutate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        if (this.a instanceof ip2.bar) {
            mutate.setTint(g0Var.b(2131099796));
        } else {
            mutate.setTint(bi3.a.s(g0Var.a, 2130970634));
        }
        java.lang.String spannableStringBuilder2 = spannableStringBuilder.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "toString(...)");
        int V = kotlin.text.StringsKt.V(spannableStringBuilder2, "**", 0, false, 6);
        if (V == -1) {
            spannableStringBuilder.append((java.lang.CharSequence) " ").setSpan(new android.text.style.ImageSpan(mutate), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 18);
        } else {
            spannableStringBuilder.setSpan(new android.text.style.ImageSpan(mutate), V, V + 2, 18);
        }
        bazVar.N0(spannableStringBuilder);
        n2().x();
    }

    @Override // com.truecaller.sdk.f
    public final void g2(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "outState");
        fp2.c n2 = n2();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "outState");
        bundle.putBundle("keySaveInstance", n2.c());
    }

    /* JADX WARN: Type inference failed for: r2v45, types: [com.truecaller.sdk.FullScreenConfirmActivity, android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v80, types: [android.content.Context, com.truecaller.sdk.ConfirmProfileActivity] */
    /* JADX WARN: Type inference failed for: r5v29, types: [android.content.Context, com.truecaller.sdk.BottomSheetConfirmProfileActivity, androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.jvm.internal.i0, java.lang.Object] */
    @Override // com.truecaller.sdk.f
    public void h2() {
        ab.e eVar;
        ab.e eVar2;
        ip2.baz bazVar;
        int i;
        int i2;
        android.net.Uri uri;
        int i3;
        ip2.baz bazVar2;
        int i4;
        java.lang.String m;
        final java.lang.String str;
        final java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        long j;
        ip2.baz bazVar3 = (ip2.baz) this.a;
        if (bazVar3 == null || (eVar = this.v) == null) {
            return;
        }
        com.truecaller.android.sdk.legacy.clients.CustomDataBundle customDataBundle = (com.truecaller.android.sdk.legacy.clients.CustomDataBundle) eVar.d;
        java.lang.String str5 = "";
        if (n2() instanceof fp2.baz) {
            fp2.baz bazVar4 = (fp2.baz) n2();
            if (!bazVar4.z()) {
                java.lang.String d = bazVar4.k.a.d("legacySdkBannerPlaceholder_49183", "");
                if (kotlin.text.StringsKt.X(d)) {
                    d = null;
                }
                com.truecaller.sdk.oAuth.networking.data.BannerResponse bannerResponse = d != null ? (com.truecaller.sdk.oAuth.networking.data.BannerResponse) bazVar4.l.a(d, com.truecaller.sdk.oAuth.networking.data.BannerResponse.class) : null;
                if (bannerResponse == null || (j = bannerResponse.getTtl()) == null) {
                    j = 500L;
                }
                bazVar4.r = j;
                com.truecaller.android.sdk.PartnerInformation partnerInformation = bazVar4.o;
                if (partnerInformation != null) {
                    fg3.h0.J(bazVar4, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f71.v(bazVar4, partnerInformation, (df3.bar) null, 22), 3);
                }
            }
        }
        com.truecaller.android.sdk.common.models.TrueProfile trueProfile = (com.truecaller.android.sdk.common.models.TrueProfile) fg3.h0.O(kotlin.coroutines.d.a, new e1.g0(n2(), (df3.bar) null, 26));
        f13.b bVar = this.i;
        trueProfile.verificationTimestamp = bVar.f("profileVerificationDate", 0L);
        trueProfile.verificationMode = bVar.h("profileVerificationMode");
        trueProfile.isSimChanged = o2();
        java.util.Locale locale = this.u;
        if (locale != null) {
            trueProfile.userLocale = locale;
        }
        java.lang.String j2 = j2(trueProfile);
        java.lang.String e = n2().e();
        boolean z = bazVar3 instanceof ip2.bar;
        u03.g0 g0Var = this.p;
        if (z) {
            java.lang.String m2 = m2(trueProfile);
            bazVar3.U0(m2, e, j2, l2(e));
            ?? r5 = (com.truecaller.sdk.BottomSheetConfirmProfileActivity) ((ip2.bar) bazVar3);
            if (eVar.y(2048)) {
                r5.t0().b.c.setBackgroundResource(2131231199);
            } else {
                r5.t0().b.c.setBackgroundResource(2131231268);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m2, "numberWithoutExtension");
            if (customDataBundle != null) {
                int i5 = customDataBundle.b;
                int i6 = customDataBundle.a;
                if (i6 != 0) {
                    eVar2 = eVar;
                    r5.t0().b.c.getBackground().setTint(i6);
                    bazVar2 = bazVar3;
                } else {
                    eVar2 = eVar;
                    android.graphics.drawable.Drawable background = r5.t0().b.c.getBackground();
                    u03.g0 g0Var2 = r5.f0;
                    if (g0Var2 != null) {
                        bazVar2 = bazVar3;
                        background.setTint(g0Var2.b(2131101106));
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("themedResourceProvider");
                        throw null;
                    }
                }
                if (i5 != 0) {
                    r5.t0().b.c.setTextColor(i5);
                } else {
                    android.widget.TextView textView = r5.t0().b.c;
                    u03.g0 g0Var3 = r5.f0;
                    if (g0Var3 != null) {
                        textView.setTextColor(g0Var3.b(android.R.color.white));
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("themedResourceProvider");
                        throw null;
                    }
                }
                try {
                    str4 = r5.getResources().getStringArray(2130903049)[customDataBundle.e];
                } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                    str4 = r5.getResources().getStringArray(2130903049)[0];
                }
                ((android.widget.TextView) r5.t0().b.o).setText(u03.e0.C(", ", str4, r5.getResources().getStringArray(2130903050)[customDataBundle.f]));
                android.widget.TextView textView2 = r5.t0().b.c;
                java.lang.String str6 = r5.getResources().getStringArray(2130903046)[customDataBundle.g];
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str6, "get(...)");
                java.lang.String format = java.lang.String.format(str6, java.util.Arrays.copyOf(new java.lang.Object[]{m2}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                textView2.setText(format);
            } else {
                bazVar2 = bazVar3;
                eVar2 = eVar;
            }
            if ((!jj3.bar.i(trueProfile.gender) && !kotlin.jvm.internal.Intrinsics.b(trueProfile.gender, "N")) || !jj3.bar.i(trueProfile.email)) {
                java.lang.String h = g0Var.h(2132018904, e);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
                i4 = 0;
                m = bx.e1.m(0, h, "format(...)", new java.lang.Object[0]);
            } else {
                i4 = 0;
                java.lang.String h2 = g0Var.h(2132018905, e);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "getString(...)");
                m = bx.e1.m(0, h2, "format(...)", new java.lang.Object[0]);
            }
            if (customDataBundle != null) {
                java.lang.String str7 = customDataBundle.d;
                java.lang.String str8 = customDataBundle.c;
                if (!jj3.bar.i(str8) && !jj3.bar.i(str7)) {
                    int i7 = i4;
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[i7] = e;
                    java.lang.String h3 = g0Var.h(2132018907, objArr);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h3, "getString(...)");
                    java.lang.String m3 = bx.e1.m(i7, h3, "format(...)", new java.lang.Object[i7]);
                    java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[2];
                    charSequenceArr[i7] = m;
                    charSequenceArr[1] = m3;
                    m = u03.e0.C("", charSequenceArr);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(m, "combine(...)");
                } else if (!jj3.bar.i(str8)) {
                    java.lang.String h4 = g0Var.h(2132018906, e);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h4, "getString(...)");
                    m = u03.e0.C("", m, bx.e1.m(0, h4, "format(...)", new java.lang.Object[0]));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(m, "combine(...)");
                } else if (!jj3.bar.i(str7)) {
                    java.lang.String h5 = g0Var.h(2132018908, e);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h5, "getString(...)");
                    m = u03.e0.C("", m, bx.e1.m(0, h5, "format(...)", new java.lang.Object[0]));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(m, "combine(...)");
                }
            }
            if (customDataBundle == null || (str = customDataBundle.c) == null) {
                str = null;
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
                if (!android.webkit.URLUtil.isHttpUrl(str) && !android.webkit.URLUtil.isHttpsUrl(str)) {
                    str = android.webkit.URLUtil.guessUrl(str);
                    kotlin.jvm.internal.Intrinsics.d(str);
                }
            }
            if (customDataBundle == null || (str3 = customDataBundle.d) == null) {
                str2 = null;
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "<this>");
                if (android.webkit.URLUtil.isHttpUrl(str3) || android.webkit.URLUtil.isHttpsUrl(str3)) {
                    str2 = str3;
                } else {
                    str2 = android.webkit.URLUtil.guessUrl(str3);
                    kotlin.jvm.internal.Intrinsics.d(str2);
                }
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "legalTextValue");
            ((android.widget.TextView) r5.t0().b.n).setText(pe0.j.x(0, m));
            if (str != null && !kotlin.text.StringsKt.X(str)) {
                s6.qux.b((android.widget.TextView) r5.t0().b.n, java.util.regex.Pattern.compile(r5.getString(2132018903)), new android.text.util.Linkify.TransformFilter() { // from class: com.truecaller.sdk.baz
                    @Override // android.text.util.Linkify.TransformFilter
                    public final java.lang.String transformUrl(java.util.regex.Matcher matcher, java.lang.String str9) {
                        int i8 = com.truecaller.sdk.BottomSheetConfirmProfileActivity.j0;
                        return str;
                    }
                });
            }
            if (str2 != null && !kotlin.text.StringsKt.X(str2)) {
                s6.qux.b((android.widget.TextView) r5.t0().b.n, java.util.regex.Pattern.compile(r5.getString(2132018909)), new android.text.util.Linkify.TransformFilter() { // from class: com.truecaller.sdk.baz
                    @Override // android.text.util.Linkify.TransformFilter
                    public final java.lang.String transformUrl(java.util.regex.Matcher matcher, java.lang.String str9) {
                        int i8 = com.truecaller.sdk.BottomSheetConfirmProfileActivity.j0;
                        return str2;
                    }
                });
            }
            bazVar = bazVar2;
        } else {
            eVar2 = eVar;
            java.lang.String str9 = trueProfile.phoneNumber;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str9, "phoneNumber");
            bazVar = bazVar3;
            bazVar.U0(str9, e, j2, l2(e));
        }
        ab.e eVar3 = eVar2;
        if (!eVar3.y(64) && n2().c().getBoolean("PARTNERINFO_OTHER_NUMBER", false)) {
            if (eVar3.y(1)) {
                i3 = 2132018913;
            } else if (eVar3.y(256)) {
                i3 = 2132018914;
            } else if (eVar3.y(512)) {
                i3 = 2132018879;
            } else {
                i3 = eVar3.y(4096) ? 2132018918 : 2132018915;
            }
            java.lang.String h6 = g0Var.h(i3, new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h6, "getString(...)");
            bazVar.u(h6);
        }
        if (!jj3.bar.i(trueProfile.avatarUrl)) {
            java.lang.String str10 = trueProfile.avatarUrl;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str10, "avatarUrl");
            bazVar.P0(str10);
        }
        java.lang.Object obj = this.a;
        if (obj != null) {
            if (obj instanceof ip2.a) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String str11 = trueProfile.phoneNumber;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str11, "phoneNumber");
                arrayList.add(new ho2.bar(str11, 2));
                arrayList.add(new ho2.bar(j2(trueProfile), 1));
                if (jj3.bar.i(trueProfile.jobTitle) && jj3.bar.i(trueProfile.companyName)) {
                    i = 1;
                } else {
                    i = 1;
                    java.lang.String C = u03.e0.C(" @ ", trueProfile.jobTitle, trueProfile.companyName);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "combine(...)");
                    arrayList.add(new ho2.bar(C, 1));
                }
                if (!jj3.bar.i(trueProfile.email)) {
                    java.lang.String str12 = trueProfile.email;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str12, "email");
                    arrayList.add(new ho2.bar(str12, i));
                }
                if (jj3.bar.i(trueProfile.street) && jj3.bar.i(trueProfile.zipcode) && jj3.bar.i(trueProfile.city)) {
                    i2 = 1;
                } else {
                    i2 = 1;
                    java.lang.String C2 = u03.e0.C(", ", trueProfile.street, trueProfile.city, trueProfile.zipcode);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C2, "combine(...)");
                    arrayList.add(new ho2.bar(C2, 1));
                }
                if (!jj3.bar.i(trueProfile.facebookId)) {
                    java.lang.String str13 = trueProfile.facebookId;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str13, "facebookId");
                    arrayList.add(new ho2.bar(str13, i2));
                }
                if (!jj3.bar.i(trueProfile.twitterId)) {
                    java.lang.String str14 = trueProfile.twitterId;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str14, "twitterId");
                    arrayList.add(new ho2.bar(str14, i2));
                }
                if (!jj3.bar.i(trueProfile.url)) {
                    java.lang.String str15 = trueProfile.url;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str15, "url");
                    arrayList.add(new ho2.bar(str15, i2));
                }
                java.lang.String str16 = (java.lang.String) k2(trueProfile).a;
                if (str16 != null && !jj3.bar.i(str16)) {
                    arrayList.add(new ho2.bar(str16, i2));
                }
                java.lang.Object obj2 = this.a;
                kotlin.jvm.internal.Intrinsics.e(obj2, "null cannot be cast to non-null type com.truecaller.sdk.views.PopupConfirmActivityView");
                ?? r2 = (com.truecaller.sdk.ConfirmProfileActivity) ((ip2.a) obj2);
                ho2.a aVar = new ho2.a(r2, arrayList, r2.j0);
                r2.d0.setItemAnimator((androidx.recyclerview.widget.p1) null);
                r2.d0.setAdapter(aVar);
                java.lang.Object obj3 = this.a;
                kotlin.jvm.internal.Intrinsics.e(obj3, "null cannot be cast to non-null type com.truecaller.sdk.views.PopupConfirmActivityView");
                java.lang.String str17 = trueProfile.firstName;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str17, "firstName");
                java.lang.String q = qk3.p.q(str17);
                com.truecaller.sdk.ConfirmProfileActivity confirmProfileActivity = (com.truecaller.sdk.ConfirmProfileActivity) ((ip2.a) obj3);
                com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig = confirmProfileActivity.i0.h0;
                if (avatarXConfig != null && (uri = avatarXConfig.a) != null) {
                    str5 = uri.toString();
                }
                confirmProfileActivity.i0.B2(new com.truecaller.common.ui.avatar.AvatarXConfig(str5, q));
                if (arrayList.size() > 2) {
                    java.lang.Object obj4 = this.a;
                    kotlin.jvm.internal.Intrinsics.e(obj4, "null cannot be cast to non-null type com.truecaller.sdk.views.PopupConfirmActivityView");
                    com.truecaller.sdk.ConfirmProfileActivity confirmProfileActivity2 = (com.truecaller.sdk.ConfirmProfileActivity) ((ip2.a) obj4);
                    confirmProfileActivity2.e0.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, confirmProfileActivity2.k0, (android.graphics.drawable.Drawable) null);
                    confirmProfileActivity2.e0.setOnClickListener(confirmProfileActivity2);
                }
            } else if (obj instanceof ip2.qux) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trueProfile, "trueProfile");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(new ho2.b(trueProfile.phoneNumber, 2131233208));
                if (!jj3.bar.i(trueProfile.jobTitle) || !jj3.bar.i(trueProfile.companyName)) {
                    arrayList2.add(new ho2.b(u03.e0.C(" @ ", trueProfile.jobTitle, trueProfile.companyName), 2131233213));
                }
                if (!jj3.bar.i(trueProfile.email)) {
                    arrayList2.add(new ho2.b(trueProfile.email, 2131233205));
                }
                if (!jj3.bar.i(trueProfile.street) || !jj3.bar.i(trueProfile.zipcode) || !jj3.bar.i(trueProfile.city)) {
                    arrayList2.add(new ho2.b(u03.e0.C(", ", trueProfile.street, trueProfile.city, trueProfile.zipcode), 2131233198));
                }
                if (!jj3.bar.i(trueProfile.facebookId)) {
                    arrayList2.add(new ho2.b(trueProfile.facebookId, 2131233202));
                }
                if (!jj3.bar.i(trueProfile.twitterId)) {
                    arrayList2.add(new ho2.b(trueProfile.twitterId, 2131233212));
                }
                if (!jj3.bar.i(trueProfile.url)) {
                    arrayList2.add(new ho2.b(trueProfile.url, 2131233204));
                }
                kotlin.Pair k2 = k2(trueProfile);
                java.lang.String str18 = (java.lang.String) k2.a;
                int intValue = ((java.lang.Number) k2.b).intValue();
                if (intValue != 0) {
                    arrayList2.add(new ho2.b(str18, intValue));
                }
                java.lang.Object obj5 = this.a;
                kotlin.jvm.internal.Intrinsics.e(obj5, "null cannot be cast to non-null type com.truecaller.sdk.views.FullScreenConfirmView");
                ?? r22 = (com.truecaller.sdk.FullScreenConfirmActivity) ((ip2.qux) obj5);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList2, "profileInfoList");
                ((androidx.recyclerview.widget.RecyclerView) r22.u0().i.g).setAdapter(new ho2.d((android.content.Context) r22, arrayList2));
                java.lang.Object obj6 = this.a;
                kotlin.jvm.internal.Intrinsics.e(obj6, "null cannot be cast to non-null type com.truecaller.sdk.views.FullScreenConfirmView");
                java.lang.String str19 = trueProfile.firstName;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str19, "firstName");
                java.lang.String q2 = qk3.p.q(str19);
                com.truecaller.sdk.FullScreenConfirmActivity fullScreenConfirmActivity = (com.truecaller.sdk.FullScreenConfirmActivity) ((ip2.qux) obj6);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(q2, "avatarLetter");
                com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig2 = fullScreenConfirmActivity.t0().h0;
                fullScreenConfirmActivity.t0().C2(new com.truecaller.common.ui.avatar.AvatarXConfig(avatarXConfig2 != null ? avatarXConfig2.a : null, (java.lang.String) null, q2, false, false, false, false, false, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) null, false, false, -10), false);
            } else {
                java.lang.String str20 = trueProfile.city;
                java.lang.String str21 = (str20 == null || kotlin.text.StringsKt.X(str20)) ? null : trueProfile.city;
                java.lang.String j22 = j2(trueProfile);
                java.lang.String m22 = m2(trueProfile);
                java.lang.String str22 = trueProfile.email;
                lo2.bar barVar = new lo2.bar(j22, m22, str22, str21);
                java.lang.Object obj7 = this.a;
                kotlin.jvm.internal.Intrinsics.e(obj7, "null cannot be cast to non-null type com.truecaller.sdk.views.BottomSheetConfirmView");
                com.truecaller.sdk.BottomSheetConfirmProfileActivity bottomSheetConfirmProfileActivity = (com.truecaller.sdk.BottomSheetConfirmProfileActivity) ((ip2.bar) obj7);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "trueProfileCustomData");
                bottomSheetConfirmProfileActivity.t0().b.g.setText(j22);
                ((android.widget.TextView) bottomSheetConfirmProfileActivity.t0().b.m).setText(m22);
                if (str22 != null && !kotlin.text.StringsKt.X(str22)) {
                    bottomSheetConfirmProfileActivity.t0().b.f.setText(str22);
                } else {
                    bottomSheetConfirmProfileActivity.t0().b.f.setVisibility(8);
                    bottomSheetConfirmProfileActivity.t0().b.b.setVisibility(8);
                }
                if (str21 != null && !kotlin.text.StringsKt.X(str21)) {
                    bottomSheetConfirmProfileActivity.t0().b.e.setText(str21);
                } else {
                    bottomSheetConfirmProfileActivity.t0().b.e.setVisibility(8);
                }
            }
        }
        if (n2() instanceof fp2.baz) {
            fp2.baz bazVar5 = (fp2.baz) n2();
            long e2 = bazVar5.k.a.e(8000L, "mwebSdkDefaultMinTtlInMs_48245");
            java.lang.String string = bazVar5.a.getString("ttl");
            if (string == null || kotlin.text.StringsKt.X(string)) {
                return;
            }
            ?? obj8 = new java.lang.Object();
            try {
                long parseLong = java.lang.Long.parseLong(string);
                ((kotlin.jvm.internal.i0) obj8).a = parseLong;
                if (parseLong < e2) {
                    ((kotlin.jvm.internal.i0) obj8).a = e2;
                }
                bazVar5.p = new com.truecaller.sdk.d(obj8, bazVar5).start();
            } catch (java.lang.NumberFormatException unused2) {
            }
        }
    }

    public final kotlin.Pair k2(com.truecaller.android.sdk.common.models.TrueProfile trueProfile) {
        ip2.baz bazVar = (ip2.baz) this.a;
        int i = 0;
        java.lang.String str = "";
        if (bazVar != null && !android.text.TextUtils.isEmpty(trueProfile.gender)) {
            java.lang.String str2 = trueProfile.gender;
            if (kotlin.jvm.internal.Intrinsics.b(str2, "M")) {
                str = bazVar.O0(2132018806);
                i = 2131233206;
            } else if (kotlin.jvm.internal.Intrinsics.b(str2, "F")) {
                str = bazVar.O0(2132018805);
                i = 2131233203;
            }
        }
        return new kotlin.Pair(str, java.lang.Integer.valueOf(i));
    }

    public final java.lang.String l2(java.lang.String str) {
        int i;
        java.lang.String[] i2 = this.p.i(2130903048);
        ab.e eVar = this.v;
        if (eVar != null) {
            i = eVar.c;
        } else {
            i = 4;
        }
        java.lang.String str2 = i2[i];
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
        return bx.e1.m(1, str2, "format(...)", new java.lang.Object[]{str});
    }

    @Override // com.truecaller.sdk.bar
    public final void m1() {
        this.a = null;
        n2().v();
    }

    public final java.lang.String m2(com.truecaller.android.sdk.common.models.TrueProfile trueProfile) {
        try {
            com.google.i18n.phonenumbers.Phonenumber.PhoneNumber parse = this.q.parse(trueProfile.phoneNumber, trueProfile.countryCode);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            return java.lang.String.valueOf(parse.getNationalNumber());
        } catch (com.google.i18n.phonenumbers.NumberParseException unused) {
            java.lang.String str = trueProfile.phoneNumber;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "phoneNumber");
            return str;
        }
    }

    public final fp2.c n2() {
        fp2.c cVar = this.x;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.Intrinsics.n("sdkPartner");
        throw null;
    }

    public final boolean o2() {
        boolean z;
        java.lang.String str = null;
        try {
            android.telephony.TelephonyManager telephonyManager = this.c;
            if (telephonyManager != null) {
                str = telephonyManager.getSimSerialNumber();
            }
        } catch (java.lang.SecurityException unused) {
        }
        java.lang.String h = this.i.h("profileSimNumber");
        ip2.baz bazVar = (ip2.baz) this.a;
        if (bazVar != null) {
            z = bazVar.V0();
        } else {
            z = false;
        }
        if (!z || jj3.bar.i(h) || jj3.bar.i(str) || kotlin.text.y.p(h, str, false)) {
            return false;
        }
        return true;
    }

    @Override // com.truecaller.sdk.bar
    public final void u0(java.lang.Object obj) {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (ip2.baz) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCompatActivity, "presenterView");
        this.a = appCompatActivity;
        fp2.c n2 = n2();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appCompatActivity, "presenterView");
        n2.d = appCompatActivity;
        f43.baz bazVar = n2.f;
        bazVar.getClass();
        f43.baz.a0(bazVar, "requested", null, null, 6);
        if (!n2.p()) {
            n2.a(0, 12);
            appCompatActivity.j0();
        } else if (!n2.r()) {
            n2.a(0, 10);
            appCompatActivity.j0();
        } else {
            appCompatActivity.M0();
        }
    }
}
