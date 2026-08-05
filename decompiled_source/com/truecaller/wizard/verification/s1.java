package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class s1 extends com.truecaller.sdk.bar implements fg3.e0, of0.b {
    public final p.c3 A;
    public final ah.n B;
    public final bm.e C;
    public final o02.baz D;
    public final javax.inject.Provider E;
    public final javax.inject.Provider F;
    public final t41.r0 G;
    public final a52.bar H;
    public final pl1.bar I;
    public final lf2.r J;
    public final a53.bar K;
    public final javax.inject.Provider L;
    public int M;
    public java.lang.String N;
    public java.lang.String O;
    public long P;
    public java.lang.String Q;
    public java.lang.Long R;
    public java.lang.String S;
    public java.lang.String T;
    public java.util.List U;
    public int V;
    public java.lang.String W;
    public long X;
    public java.lang.String Y;
    public fg3.r1 Z;
    public fg3.k2 a0;
    public final kotlin.coroutines.CoroutineContext b;
    public fg3.k2 b0;
    public final kotlin.coroutines.CoroutineContext c;
    public boolean c0;
    public final kotlin.coroutines.CoroutineContext d;
    public yy.c1 d0;
    public final javax.inject.Provider e;
    public boolean e0;
    public final javax.inject.Provider f;
    public com.truecaller.wizard.verification.v1 f0;
    public final javax.inject.Provider g;
    public final ig3.h2 g0;
    public final com.truecaller.wizard.verification.r0 h;
    public final ig3.q1 h0;
    public final t93.c i;
    public final ig3.h2 i0;
    public final q73.qux j;
    public final ig3.v1 j0;
    public final t41.t k;
    public final kotlin.Lazy k0;
    public final c71.k l;
    public final kotlin.Lazy l0;
    public final u03.baz m;
    public final f43.baz n;
    public final com.truecaller.wizard.verification.y1 o;
    public final com.truecaller.wizard.WizardVerificationMode p;
    public final wt.l q;
    public final or2.z0 r;
    public final q93.l s;
    public final bm.e t;
    public final u03.b0 u;
    public final ah.y v;
    public final qf0.d w;
    public final javax.inject.Provider x;
    public final javax.inject.Provider y;
    public final com.google.android.gms.internal.auth.e z;

    public s1(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, kotlin.coroutines.CoroutineContext coroutineContext3, tx.d dVar, tx.d dVar2, tx.d dVar3, com.truecaller.wizard.verification.r0 r0Var, t93.c cVar, q73.qux quxVar, t41.t tVar, c71.k kVar, u03.baz bazVar, f43.baz bazVar2, com.truecaller.wizard.verification.y1 y1Var, com.truecaller.wizard.WizardVerificationMode wizardVerificationMode, wt.l lVar, or2.z0 z0Var, q93.l lVar2, bm.e eVar, u03.b0 b0Var, p22.b bVar, ah.y yVar, qf0.d dVar4, javax.inject.Provider provider, javax.inject.Provider provider2, com.google.android.gms.internal.auth.e eVar2, p.c3 c3Var, ah.n nVar, bm.e eVar3, o02.baz bazVar3, tx.v vVar, tx.d dVar5, t41.r0 r0Var2, a52.bar barVar, pl1.bar barVar2, lf2.r rVar, a53.bar barVar3, tx.v vVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "asyncCoroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "reverseOtpListenerContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext3, "uiCoroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "phoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar2, "countryCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar3, "dialingCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0Var, "verificationHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "wizardSettingsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "accountHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "phoneNumberHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "wizardErrorTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "clock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "analyticsManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(y1Var, "wizardContactSupportHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wizardVerificationMode, "verificationMode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "attestationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(z0Var, "readPhoneNumberABTestManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar2, "smsListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "sendSmsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "resourceProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "smsStatusHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yVar, "verificationCallManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar4, "retentionTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "identityConfigsInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider2, "identityFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar2, "navigationHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c3Var, "verificationSimHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "sendOnboardingOtpUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar3, "verifyOnboardingOtpUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar3, "verifyReverseOtpUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "throttledNotificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar5, "throttledReminderScheduler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0Var2, "timestampUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "whatsAppConversationOpener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "reverseOtpUiStateProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "attemptTimer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "lottieAnimationHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar2, "telephonyUtil");
        this.b = coroutineContext;
        this.c = coroutineContext2;
        this.d = coroutineContext3;
        this.e = dVar;
        this.f = dVar2;
        this.g = dVar3;
        this.h = r0Var;
        this.i = cVar;
        this.j = quxVar;
        this.k = tVar;
        this.l = kVar;
        this.m = bazVar;
        this.n = bazVar2;
        this.o = y1Var;
        this.p = wizardVerificationMode;
        this.q = lVar;
        this.r = z0Var;
        this.s = lVar2;
        this.t = eVar;
        this.u = b0Var;
        this.v = yVar;
        this.w = dVar4;
        this.x = provider;
        this.y = provider2;
        this.z = eVar2;
        this.A = c3Var;
        this.B = nVar;
        this.C = eVar3;
        this.D = bazVar3;
        this.E = vVar;
        this.F = dVar5;
        this.G = r0Var2;
        this.H = barVar;
        this.I = barVar2;
        this.J = rVar;
        this.K = barVar3;
        this.L = vVar2;
        com.truecaller.wizard.verification.baz bazVar4 = com.truecaller.wizard.verification.baz.a;
        this.f0 = new com.truecaller.wizard.verification.v1(bazVar4, null, null);
        ig3.h2 c = ig3.w1.c(new com.truecaller.wizard.verification.v1(bazVar4, null, null));
        this.g0 = c;
        this.h0 = new ig3.q1(c);
        this.i0 = ig3.w1.c((java.lang.Object) null);
        this.j0 = ig3.w1.b(5, 0, hg3.bar.b, 2);
        this.k0 = kotlin.LazyKt.lazy(new com.truecaller.wizard.verification.x0(this, 0));
        this.l0 = kotlin.LazyKt.lazy(new com.truecaller.wizard.verification.x0(this, 1));
    }

    public static final void c2(com.truecaller.wizard.verification.s1 s1Var, w73.bar barVar, java.lang.String str) {
        java.lang.Integer num;
        com.truecaller.wizard.verification.s0 s0Var = com.truecaller.wizard.verification.s0.q;
        if (barVar == null) {
            s1Var.r2(com.truecaller.wizard.verification.s0.p, str);
            return;
        }
        com.truecaller.account.network.TokenResponseDto tokenResponseDto = barVar.a;
        if (tokenResponseDto != null) {
            java.lang.String domain = tokenResponseDto.getDomain();
            if (domain != null && !kotlin.text.StringsKt.X(domain)) {
                s1Var.i.l(domain);
            }
            int status = tokenResponseDto.getStatus();
            if (status != 11) {
                if (status != 12) {
                    if (status != 21) {
                        if (status != 700) {
                            switch (status) {
                                case 1:
                                    s1Var.B2(tokenResponseDto, true);
                                    return;
                                case 2:
                                case 3:
                                    break;
                                case 4:
                                case 5:
                                case 6:
                                    s1Var.z2(tokenResponseDto.getTokenTtl(), str);
                                    return;
                                case 7:
                                    s1Var.r2(com.truecaller.wizard.verification.s0.o, str);
                                    return;
                                case 8:
                                    s1Var.x2(true);
                                    return;
                                case 9:
                                    s1Var.B2(tokenResponseDto, false);
                                    return;
                                default:
                                    switch (status) {
                                        case AD_SERVER_ERROR_VALUE:
                                            java.lang.String message = tokenResponseDto.getMessage();
                                            java.lang.String requestId = tokenResponseDto.getRequestId();
                                            java.lang.Long parsedPhoneNumber = tokenResponseDto.getParsedPhoneNumber();
                                            if (message != null && requestId != null && parsedPhoneNumber != null) {
                                                if (((b92.f) s1Var.q.e).c()) {
                                                    fg3.h0.J(s1Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new b2.e(s1Var, message, requestId, parsedPhoneNumber.longValue(), (df3.bar) null, 5), 3);
                                                    return;
                                                } else {
                                                    s1Var.r2(com.truecaller.wizard.verification.s0.i, "NumberVerification");
                                                    return;
                                                }
                                            }
                                            s1Var.r2(s0Var, "NumberVerification");
                                            return;
                                        case 20002:
                                            s1Var.z2(tokenResponseDto.getTtl(), str);
                                            return;
                                        case 20003:
                                            s1Var.r2(com.truecaller.wizard.verification.s0.r, str);
                                            return;
                                        default:
                                            s1Var.l.x(str, "Unknown success status " + tokenResponseDto.getStatus(), (java.util.List) null);
                                            s1Var.r2(s0Var, str);
                                            return;
                                    }
                            }
                        }
                    } else {
                        s1Var.r2(com.truecaller.wizard.verification.s0.e, str);
                        return;
                    }
                }
                fg3.h0.J(s1Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.editprofile.impl.ui.legacy.m(s1Var, tokenResponseDto, str, (df3.bar) null, 10), 3);
                return;
            }
            s1Var.y2();
            return;
        }
        com.truecaller.account.network.TokenErrorResponseDto tokenErrorResponseDto = barVar.b;
        if (tokenErrorResponseDto != null) {
            num = java.lang.Integer.valueOf(tokenErrorResponseDto.getStatus());
        } else {
            num = null;
        }
        s1Var.k2(0L, num, str);
    }

    public static final void d2(com.truecaller.wizard.verification.s1 s1Var, java.lang.String str) {
        f43.baz bazVar = s1Var.n;
        gd0.d dVar = (gd0.c) bazVar.e;
        fg3.k2 k2Var = s1Var.a0;
        if (k2Var != null) {
            k2Var.cancel((java.util.concurrent.CancellationException) null);
        }
        if (kotlin.jvm.internal.Intrinsics.b(s1Var.N, "call")) {
            ah.y yVar = s1Var.v;
            java.lang.String str2 = (java.lang.String) yVar.q;
            if (str2 != null) {
                j01.qux quxVar = (j01.qux) yVar.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "number");
                fg3.h0.J((fg3.e0) quxVar.b, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new n5.z(quxVar, str2, str, (df3.bar) null, 29), 3);
            }
            dVar.b("onDropCallSuccess");
        }
        s1Var.h.c();
        boolean booleanValue = ((java.lang.Boolean) ((kotlin.Lazy) s1Var.A.e).getValue()).booleanValue();
        java.lang.String str3 = s1Var.N;
        ((nc0.bar) bazVar.b).d(new n93.b((com.truecaller.wizard.WizardVerificationMode) bazVar.c, (java.lang.String) bazVar.f, booleanValue));
        if (kotlin.jvm.internal.Intrinsics.b(str3, "sms")) {
            dVar.b("VerificationCompletedSms");
        }
        qf0.d dVar2 = s1Var.w;
        qf0.qux quxVar2 = dVar2.a;
        ((u03.qux) dVar2.c).getClass();
        quxVar2.e0("dateTimeRegisteredMillis", java.lang.System.currentTimeMillis());
        ((o73.a) s1Var.E.get()).b.a(2131363489, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationThrottledReminder");
    }

    public static final java.lang.Object e2(com.truecaller.wizard.verification.s1 s1Var, ff3.g gVar) {
        java.lang.Object W = fg3.h0.W(s1Var.d, new com.truecaller.wizard.verification.b1(s1Var, null, 2), gVar);
        if (W == ef3.bar.a) {
            return W;
        }
        return kotlin.Unit.a;
    }

    public static boolean l2(java.lang.String str) {
        if (!kotlin.jvm.internal.Intrinsics.b(str, "reverse_otp") && !kotlin.jvm.internal.Intrinsics.b(str, "reverse_whatsapp")) {
            return false;
        }
        return true;
    }

    public final void B2(com.truecaller.account.network.TokenResponseDto tokenResponseDto, boolean z) {
        long j;
        if (z) {
            int i = this.M + 1;
            this.M = i;
            this.i.c(i);
        }
        if (kotlin.collections.CollectionsKt.N(kotlin.collections.y.j(new java.lang.String[]{"reverse_otp", "reverse_whatsapp"}), tokenResponseDto.getMethod())) {
            com.truecaller.log.AssertionUtil.shouldNeverHappen(new java.lang.IllegalStateException(h0.b.Q(tokenResponseDto.getMethod(), " requires gRPC API")), new java.lang.String[0]);
            r2(com.truecaller.wizard.verification.s0.q, "NumberVerification");
            return;
        }
        D2(tokenResponseDto.getMethod());
        this.O = tokenResponseDto.getRequestId();
        ((u03.qux) this.m).getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        java.lang.Long tokenTtl = tokenResponseDto.getTokenTtl();
        if (tokenTtl != null) {
            j = tokenTtl.longValue();
        } else {
            j = 0;
        }
        this.P = timeUnit.toMillis(j) + currentTimeMillis;
        this.Q = tokenResponseDto.getPattern();
        this.S = tokenResponseDto.getParsedCountryCode();
        this.R = tokenResponseDto.getParsedPhoneNumber();
        f2(true);
    }

    public final void C2() {
        java.lang.String str;
        java.util.List list = this.U;
        if (list != null) {
            str = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(list);
        } else {
            str = null;
        }
        java.lang.String str2 = this.W;
        if (str != null && str2 != null) {
            a52.bar barVar = this.H;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "message");
            try {
                barVar.b.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://wa.me/" + str + "?text=" + java.net.URLEncoder.encode(str2, "UTF-8"))));
                return;
            } catch (android.content.ActivityNotFoundException e) {
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
                return;
            }
        }
        com.truecaller.log.AssertionUtil.shouldNeverHappen(new java.lang.IllegalStateException("Reverse WhatsApp phone number or message is null"), new java.lang.String[0]);
    }

    public final void D2(java.lang.String str) {
        this.N = str;
        this.i0.o(str);
    }

    public final void E2(com.truecaller.wizard.verification.v1 v1Var) {
        this.f0 = v1Var;
        ig3.h2 h2Var = this.g0;
        h2Var.getClass();
        h2Var.p((java.lang.Object) null, v1Var);
    }

    public final void F2() {
        lf2.r.m(this.J, this.c, new com.truecaller.wizard.verification.x0(this, 5), new com.truecaller.wizard.verification.r1(this, null), (com.truecaller.wizard.verification.g0) null, 8);
    }

    public final void f2(boolean z) {
        com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement reverseOtpChargesNotePlacement;
        gd0.d dVar = (gd0.c) this.n.e;
        this.e0 = true;
        long j = this.P;
        ((u03.qux) this.m).getClass();
        long currentTimeMillis = j - java.lang.System.currentTimeMillis();
        if (currentTimeMillis <= 0) {
            x2(!z);
            return;
        }
        b12.s sVar = new b12.s(this, (df3.bar) null, 5);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "onTimeout");
        lf2.r rVar = this.J;
        rVar.b = fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) rVar.a, (fg3.f0) null, new aj0.j(currentTimeMillis, sVar, (df3.bar) null, 24), 2);
        java.lang.String str = this.N;
        if (str != null) {
            switch (str.hashCode()) {
                case 114009:
                    if (str.equals("sms")) {
                        E2(com.truecaller.wizard.verification.v1.a(this.f0, new com.truecaller.wizard.verification.r(this.P, j2(), ""), null, null, 4));
                        return;
                    }
                    break;
                case 3045982:
                    if (str.equals("call")) {
                        E2(com.truecaller.wizard.verification.v1.a(this.f0, new com.truecaller.wizard.verification.c(j2(), this.P), null, null, 4));
                        return;
                    }
                    break;
                case 1174103631:
                    if (str.equals("reverse_whatsapp")) {
                        E2(com.truecaller.wizard.verification.v1.a(this.f0, com.truecaller.wizard.verification.o.a, null, null, 4));
                        dVar.b("onReverseWhatsAppSeen");
                        F2();
                        return;
                    }
                    break;
                case 1521676366:
                    if (str.equals("reverse_otp")) {
                        if (((qo1.i) this.y.get()).a.a("rotpOtpChargesNoteAboveCta_62747", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                            reverseOtpChargesNotePlacement = com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement.ABOVE_CTA;
                        } else {
                            reverseOtpChargesNotePlacement = com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement.BOTTOM;
                        }
                        com.truecaller.wizard.verification.ReverseOtpChargesNotePlacement reverseOtpChargesNotePlacement2 = reverseOtpChargesNotePlacement;
                        com.truecaller.wizard.verification.v1 v1Var = this.f0;
                        java.lang.String j2 = j2();
                        ((u03.qux) this.I.a).getClass();
                        E2(com.truecaller.wizard.verification.v1.a(v1Var, new com.truecaller.wizard.verification.k(j2, true, true, reverseOtpChargesNotePlacement2, new com.truecaller.wizard.verification.m(java.util.concurrent.TimeUnit.SECONDS.toMillis(5L) + java.lang.System.currentTimeMillis()), this.P), null, null, 4));
                        this.b0 = lf2.r.m(rVar, (kotlin.coroutines.CoroutineContext) null, new com.truecaller.wizard.verification.x0(this, 6), new a10.k(this, (df3.bar) null, 11), new com.truecaller.wizard.verification.g0(this, 1), 1);
                        dVar.b("onReverseOtpSeen");
                        F2();
                        return;
                    }
                    break;
                case 1934780818:
                    if (str.equals("whatsapp")) {
                        E2(com.truecaller.wizard.verification.v1.a(this.f0, new com.truecaller.wizard.verification.w1(this.P, j2(), ""), null, null, 4));
                        return;
                    }
                    break;
            }
        }
        this.l.x("NumberVerification", "Client fault. Unknown method", (java.util.List) null);
        r2(com.truecaller.wizard.verification.s0.q, "NumberVerification");
    }

    public final void g2() {
        h2();
        fg3.r1 r1Var = this.Z;
        if (r1Var != null) {
            r1Var.cancel((java.util.concurrent.CancellationException) null);
        }
        this.j0.d();
        E2(new com.truecaller.wizard.verification.v1(com.truecaller.wizard.verification.baz.a, null, null));
    }

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        fg3.r1 r1Var = this.Z;
        if (r1Var == null) {
            r1Var = fg3.h0.c();
            this.Z = r1Var;
        }
        return this.b.plus(r1Var);
    }

    public final void h2() {
        this.J.f();
        D2(null);
        this.O = null;
        this.P = 0L;
        this.Q = null;
    }

    public final java.lang.String j2() {
        java.lang.String str;
        java.lang.Long l = this.R;
        if (l == null || (str = java.lang.String.valueOf(l.longValue())) == null) {
            str = (java.lang.String) this.e.get();
        }
        java.lang.String str2 = this.S;
        if (str2 == null) {
            str2 = (java.lang.String) this.f.get();
        }
        kotlin.jvm.internal.Intrinsics.d(str);
        kotlin.jvm.internal.Intrinsics.d(str2);
        java.lang.String o = this.k.o(str, str2);
        if (o != null) {
            str = o;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.y.s(str, " ", " ", false);
    }

    public final void k2(long j, java.lang.Integer num, java.lang.String str) {
        java.lang.String str2;
        if (num == null) {
            str2 = "null";
        } else {
            switch (num.intValue()) {
                case 40001:
                    str2 = "Invalid body format";
                    break;
                case 40002:
                    str2 = "Application not supported";
                    break;
                case 40003:
                    str2 = "Invalid phone number";
                    break;
                case 40004:
                    str2 = "Client secret wrong";
                    break;
                case 40012:
                    str2 = "invalid_region";
                    break;
                case 40106:
                    str2 = "Blacklisted number";
                    break;
                case 40306:
                    str2 = "Service Unavailable";
                    break;
                case 50002:
                    str2 = "Internal server error";
                    break;
                default:
                    str2 = java.lang.String.valueOf(num.intValue());
                    break;
            }
        }
        this.l.x(str, str2, (java.util.List) null);
        if (num != null && num.intValue() == 40003) {
            r2(com.truecaller.wizard.verification.s0.f, str);
            kotlin.Unit unit = kotlin.Unit.a;
            if (this.p == com.truecaller.wizard.WizardVerificationMode.PRIMARY_NUMBER) {
                ((gd0.c) this.r.a).b("readPhoneNumber_38745_number_invalid");
                return;
            }
            return;
        }
        if (num != null && num.intValue() == 40012) {
            r2(com.truecaller.wizard.verification.s0.k, str);
            return;
        }
        if (num != null && num.intValue() == 40306) {
            r2(com.truecaller.wizard.verification.s0.n, str);
            return;
        }
        if (num != null && num.intValue() == 40106) {
            r2(com.truecaller.wizard.verification.s0.e, str);
            return;
        }
        if (num != null && num.intValue() == 40011) {
            r2(com.truecaller.wizard.verification.s0.j, str);
            return;
        }
        if (num != null && num.intValue() == 45101) {
            r2(com.truecaller.wizard.verification.s0.h, str);
            return;
        }
        if (num != null && num.intValue() == 40302) {
            r2(com.truecaller.wizard.verification.s0.i, str);
            return;
        }
        if (num != null && num.intValue() == 24) {
            u03.g0 g0Var = (u03.g0) this.u;
            java.lang.String h = g0Var.h(2132018845, new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
            java.lang.String h2 = g0Var.h(2132018844, j2());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "getString(...)");
            java.lang.String h3 = g0Var.h(2132019051, new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h3, "getString(...)");
            w2(h, h2, h3, "PhoneNumberMismatch", "VerifyReverseOTP");
            F2();
            return;
        }
        if ((num == null || num.intValue() != 4) && ((num == null || num.intValue() != 5) && (num == null || num.intValue() != 6))) {
            if (num != null && num.intValue() == 7) {
                r2(com.truecaller.wizard.verification.s0.o, str);
                return;
            }
            if (num != null && num.intValue() == 8) {
                x2(true);
                return;
            }
            if (num != null && num.intValue() == 11) {
                y2();
                return;
            }
            if (num != null && num.intValue() == 20002) {
                z2(java.lang.Long.valueOf(j), str);
                return;
            } else if (num != null && num.intValue() == 20003) {
                r2(com.truecaller.wizard.verification.s0.r, str);
                return;
            } else {
                r2(com.truecaller.wizard.verification.s0.q, str);
                return;
            }
        }
        z2(java.lang.Long.valueOf(j), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
    
        if (kotlin.collections.v.z(new java.lang.String[]{"call", "sms", "whatsapp"}, r4.N) != false) goto L13;
     */
    @Override // com.truecaller.sdk.bar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1() {
        boolean z;
        this.a = null;
        if (this.e0) {
            java.lang.Object obj = this.e.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            java.lang.String str = (java.lang.String) obj;
            java.lang.Object obj2 = this.f.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            java.lang.String str2 = (java.lang.String) obj2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "enteredPhoneNumber");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "enteredCountryCode");
            ((nc0.bar) this.n.b).d(new n93.qux(str, str2));
        }
        fg3.k2 k2Var = (fg3.k2) this.J.b;
        if (k2Var != null) {
            z = true;
            if (k2Var.isActive()) {
            }
        }
        z = false;
        java.util.List list = (java.util.List) this.l0.getValue();
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("backgroundOtp".equalsIgnoreCase((java.lang.String) it.next())) {
                    if (this.p != com.truecaller.wizard.WizardVerificationMode.CHANGE_NUMBER && z) {
                        return;
                    }
                }
            }
        }
        g2();
    }

    public final boolean m2() {
        fg3.k2 k2Var = (fg3.k2) this.J.b;
        com.google.android.gms.internal.auth.e eVar = this.z;
        if ((k2Var != null && k2Var.isActive()) || l2(this.N)) {
            eVar.v();
            return true;
        }
        eVar.v();
        return false;
    }

    public final void n2() {
        com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type startupDialogEvent$Type;
        com.truecaller.wizard.verification.s sVar = this.f0.a;
        if (sVar instanceof com.truecaller.wizard.verification.k) {
            startupDialogEvent$Type = com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type.ReverseOtpPhoneNumberHint;
        } else if (sVar instanceof com.truecaller.wizard.verification.o) {
            startupDialogEvent$Type = com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type.ReverseWhatsAppPhoneNumberHint;
        } else {
            startupDialogEvent$Type = null;
        }
        if (startupDialogEvent$Type != null) {
            this.n.d0(startupDialogEvent$Type, com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action.ClickedNegative);
        }
        this.z.v();
    }

    public final void o2(com.truecaller.wizard.verification.u0 u0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u0Var, "message");
        java.lang.Object obj = this.f.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        java.lang.Integer num = (java.lang.Integer) this.g.get();
        java.lang.Object obj2 = this.e.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        com.moloco.sdk.internal.services.bidtoken.t a = this.o.a(u0Var, (java.lang.String) obj, num, (java.lang.String) obj2);
        com.truecaller.wizard.verification.u1 u1Var = (com.truecaller.wizard.verification.u1) this.a;
        if (u1Var != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "emailData");
            android.content.Context requireContext = ((com.truecaller.wizard.verification.l0) u1Var).requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            boolean m = ak.r0.m(requireContext, a);
            if (!m) {
                E2(com.truecaller.wizard.verification.v1.a(this.f0, null, null, 2132023908, 3));
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u0Var, "message");
            f43.baz bazVar = this.n;
            ((nc0.bar) bazVar.b).d(new n93.h(u0Var, m, (com.truecaller.wizard.WizardVerificationMode) bazVar.c, (java.lang.String) bazVar.f));
        }
    }

    public final void p2() {
        com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type startupDialogEvent$Type;
        f43.baz bazVar = this.n;
        gd0.d dVar = (gd0.c) bazVar.e;
        com.truecaller.wizard.verification.s sVar = this.f0.a;
        df3.bar barVar = null;
        if (sVar instanceof com.truecaller.wizard.verification.k) {
            dVar.b("onReverseOtpSuccess");
            startupDialogEvent$Type = com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type.ReverseOtpPhoneNumberHint;
        } else if (sVar instanceof com.truecaller.wizard.verification.o) {
            dVar.b("onReverseWhatsAppSuccess");
            startupDialogEvent$Type = com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type.ReverseWhatsAppPhoneNumberHint;
        } else {
            startupDialogEvent$Type = null;
        }
        if (startupDialogEvent$Type != null) {
            bazVar.d0(startupDialogEvent$Type, com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action.ClickedPositive);
        }
        yy.c1 c1Var = this.d0;
        if (c1Var != null) {
            java.lang.String valueOf = java.lang.String.valueOf(c1Var.e());
            t93.c cVar = this.i;
            cVar.e(valueOf);
            cVar.q(c1Var.b());
            cVar.o(java.lang.String.valueOf(c1Var.d().getValue()));
            fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.wizard.verification.b1(this, barVar, 0), 3);
            return;
        }
        r2(com.truecaller.wizard.verification.s0.q, "NumberVerification");
        kotlin.Unit unit = kotlin.Unit.a;
    }

    public final void q2() {
        this.e0 = false;
        com.truecaller.wizard.verification.f0 f0Var = this.f0.b;
        com.truecaller.wizard.WizardVerificationMode wizardVerificationMode = this.p;
        com.truecaller.wizard.WizardVerificationMode wizardVerificationMode2 = com.truecaller.wizard.WizardVerificationMode.PRIMARY_NUMBER;
        com.google.android.gms.internal.auth.e eVar = this.z;
        if (wizardVerificationMode != wizardVerificationMode2 && this.j.c() && (f0Var instanceof com.truecaller.wizard.verification.y) && (((com.truecaller.wizard.verification.y) f0Var).a instanceof com.truecaller.wizard.verification.t0)) {
            ((q83.u0) eVar.c).x(q83.u.c);
        } else {
            eVar.v();
        }
    }

    public final void r2(com.truecaller.wizard.verification.u0 u0Var, java.lang.String str) {
        if (this.a == null) {
            g2();
            return;
        }
        h2();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u0Var, "message");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "source");
        f43.baz bazVar = this.n;
        ((nc0.bar) bazVar.b).d(new n93.c(u0Var, str, (com.truecaller.wizard.WizardVerificationMode) bazVar.c, (java.lang.String) bazVar.f));
        fg3.k2 k2Var = this.a0;
        if (k2Var != null) {
            k2Var.cancel((java.util.concurrent.CancellationException) null);
        }
        com.truecaller.wizard.verification.v1 v1Var = this.f0;
        java.lang.Object obj = this.f.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        E2(com.truecaller.wizard.verification.v1.a(v1Var, null, new com.truecaller.wizard.verification.y(u0Var, this.o.b(u0Var, (java.lang.String) obj)), null, 5));
    }

    @Override // com.truecaller.sdk.bar
    public final void u0(java.lang.Object obj) {
        java.lang.String str;
        com.truecaller.wizard.verification.u1 u1Var = (com.truecaller.wizard.verification.u1) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(u1Var, "presenterView");
        df3.bar barVar = null;
        if (this.Z != null) {
            g2();
            this.Z = null;
        }
        this.a = u1Var;
        E2(new com.truecaller.wizard.verification.v1(com.truecaller.wizard.verification.baz.a, null, null));
        fg3.k2 J = fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.wizard.verification.b1(this, barVar, 5), 3);
        fg3.k2 J2 = fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.wizard.verification.b1(this, barVar, 6), 3);
        ig3.p1 p1Var = new ig3.p1((ig3.v1) this.v.r);
        ag2.c cVar = new ag2.c(3, 6, (df3.bar) null);
        ig3.h2 h2Var = this.i0;
        int i = 4;
        a61.b bVar = new a61.b(p1Var, h2Var, cVar, 4);
        int i2 = 0;
        int i3 = 1;
        a63.h0 h0Var = new a63.h0(new androidx.room.o(10, new com.truecaller.wizard.verification.j1(new com.truecaller.wizard.verification.h1(new androidx.room.o(25, bVar, new com.truecaller.wizard.verification.p1(this, barVar, i2)), i2), i3), this), 23);
        ig3.v1 v1Var = this.j0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v1Var, "<this>");
        t41.r0 r0Var = this.G;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0Var, "timestampUtil");
        this.a0 = ig3.w1.F(new androidx.room.o(25, new androidx.room.o(9, new ig3.v(ig3.w1.H(new ig3.i[]{h0Var, new androidx.room.o(25, new com.truecaller.wizard.verification.j1(new com.truecaller.wizard.verification.j1(new a61.b(new ig3.r1(new b2.e(v1Var, r0Var, 2000L, (df3.bar) null, 18)), h2Var, new ag2.c(3, 7, (df3.bar) null), 4), i2), 2), new com.truecaller.wizard.verification.p1(this, barVar, i3))}), new ag2.c(J, J2, (df3.bar) null, 5)), this), new com.truecaller.data.country.f(this, (df3.bar) null, 22)), this);
        t93.c cVar2 = this.i;
        java.lang.String h = cVar2.h();
        java.lang.String str2 = "";
        if (h == null) {
            str = "";
        } else {
            str = h;
        }
        java.lang.String g = cVar2.g();
        if (g != null) {
            str2 = g;
        }
        boolean booleanValue = ((java.lang.Boolean) ((kotlin.Lazy) this.A.e).getValue()).booleanValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "numberSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "countrySource");
        f43.baz bazVar = this.n;
        ((nc0.bar) bazVar.b).d(new n93.f(str, booleanValue, (com.truecaller.wizard.WizardVerificationMode) bazVar.c, (java.lang.String) bazVar.f, str2));
        if (this.p == com.truecaller.wizard.WizardVerificationMode.PRIMARY_NUMBER) {
            gd0.d dVar = (gd0.c) this.r.a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "source");
            if (str.equals("SIM")) {
                dVar.b("readPhoneNumber_38745_sim");
            } else if (str.equals("ManualEntry")) {
                dVar.b("readPhoneNumber_38745_manual_entry");
            }
        }
        this.M = cVar2.d();
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.wizard.verification.b1(this, barVar, i), 3);
    }

    public final void u2(boolean z) {
        fg3.k2 k2Var;
        if (z && (((k2Var = (fg3.k2) this.J.b) == null || !k2Var.isActive()) && l2(this.N))) {
            this.z.v();
            return;
        }
        if (l2(this.N)) {
            com.truecaller.wizard.verification.v1 v1Var = this.f0;
            com.truecaller.wizard.verification.s sVar = v1Var.a;
            if (sVar instanceof com.truecaller.wizard.verification.k) {
                E2(com.truecaller.wizard.verification.v1.a(v1Var, com.truecaller.wizard.verification.k.a((com.truecaller.wizard.verification.k) sVar, true, 61), null, null, 4));
            } else if (sVar instanceof com.truecaller.wizard.verification.o) {
                E2(com.truecaller.wizard.verification.v1.a(v1Var, null, null, null, 5));
            }
        }
    }

    public final void v2() {
        com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type startupDialogEvent$Type;
        com.truecaller.wizard.verification.v1 v1Var = this.f0;
        com.truecaller.wizard.verification.f0 f0Var = v1Var.b;
        com.truecaller.wizard.verification.s sVar = v1Var.a;
        if (f0Var != null) {
            boolean z = f0Var instanceof com.truecaller.wizard.verification.b0;
            if (z && (sVar instanceof com.truecaller.wizard.verification.k)) {
                startupDialogEvent$Type = com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type.ReverseOtpPhoneNumberHint;
            } else if (z && (sVar instanceof com.truecaller.wizard.verification.o)) {
                startupDialogEvent$Type = com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type.ReverseWhatsAppPhoneNumberHint;
            } else if (f0Var instanceof com.truecaller.wizard.verification.d0) {
                startupDialogEvent$Type = com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Type.ReverseWhatsAppMessageNotSent;
            } else {
                startupDialogEvent$Type = null;
            }
            if (startupDialogEvent$Type != null) {
                this.n.d0(startupDialogEvent$Type, com.truecaller.startup_dialogs.analytics.StartupDialogEvent$Action.Shown);
            }
        }
    }

    public final void w2(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.n.e0(str4, str5);
        E2(com.truecaller.wizard.verification.v1.a(this.f0, null, new com.truecaller.wizard.verification.z(str, str2, str3), null, 5));
    }

    public final void x2(boolean z) {
        int i;
        if (this.a == null) {
            g2();
            return;
        }
        java.lang.Integer num = (java.lang.Integer) ((java.util.Map) this.k0.getValue()).get(this.N);
        int i2 = 1;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        df3.bar barVar = null;
        lf2.r rVar = this.J;
        if (z && i < this.M) {
            boolean l2 = l2(this.N);
            com.google.android.gms.internal.auth.e eVar = this.z;
            if (l2) {
                rVar.f();
                this.e0 = false;
                fg3.k2 k2Var = this.a0;
                if (k2Var != null) {
                    k2Var.cancel((java.util.concurrent.CancellationException) null);
                }
                if (((java.lang.Number) this.g0.l().getValue()).intValue() == 0) {
                    eVar.v();
                    return;
                }
                u03.g0 g0Var = (u03.g0) this.u;
                java.lang.String h = g0Var.h(2132018848, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
                java.lang.String h2 = g0Var.h(2132018847, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "getString(...)");
                java.lang.String h3 = g0Var.h(2132019059, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h3, "getString(...)");
                w2(h, h2, h3, com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.MSG_TIMEOUT, "NumberVerification");
                return;
            }
            rVar.f();
            this.e0 = false;
            fg3.k2 k2Var2 = this.a0;
            if (k2Var2 != null) {
                k2Var2.cancel((java.util.concurrent.CancellationException) null);
            }
            eVar.v();
            return;
        }
        rVar.f();
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.wizard.verification.b1(this, barVar, i2), 3);
    }

    public final void y2() {
        E2(com.truecaller.wizard.verification.v1.a(this.f0, null, null, 2132019132, 3));
        if (kotlin.jvm.internal.Intrinsics.b(this.N, "call")) {
            ah.y yVar = this.v;
            yVar.q = null;
            ((ig3.v1) yVar.r).e(new kotlin.Pair("", (java.lang.Object) null));
        } else if (kotlin.jvm.internal.Intrinsics.b(this.N, "sms") || kotlin.jvm.internal.Intrinsics.b(this.N, "whatsapp")) {
            this.j0.e("");
        }
        f2(false);
    }

    public final void z2(java.lang.Long l, java.lang.String str) {
        long j;
        javax.inject.Provider provider = this.F;
        if (l != null) {
            long longValue = l.longValue();
            r93.baz bazVar = (r93.baz) provider.get();
            h93.baz bazVar2 = bazVar.d;
            if (bazVar.a.a.a("throttledUserReminder_52542", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                h93.baz bazVar3 = bazVar2;
                if (!bazVar3.d("registration_reminder_set", false)) {
                    int i = com.truecaller.wizard.verification.throttled.ThrottledReminderBroadcastReceiver.d;
                    android.content.Context context = bazVar.c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                    android.content.Intent intent = new android.content.Intent("com.truecaller.wizard.verification.throttled.alert");
                    intent.setClass(context, com.truecaller.wizard.verification.throttled.ThrottledReminderBroadcastReceiver.class);
                    android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(context, 2131366981, intent, 201326592);
                    if (broadcast == null) {
                        com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("cannot create reminder for throttled user");
                    } else {
                        android.app.AlarmManager alarmManager = bazVar.b;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        xf3.qux quxVar = xf3.a.b;
                        alarmManager.set(0, xf3.a.e(fj.a.H(longValue, xf3.c.d)) + currentTimeMillis, broadcast);
                        bazVar3.k("registration_reminder_set", true);
                    }
                }
            }
        }
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        r2(new com.truecaller.wizard.verification.t0((int) java.lang.Math.ceil(j / java.util.concurrent.TimeUnit.HOURS.toSeconds(1L)), j2(), ((r93.baz) provider.get()).a.a.a("throttledUserReminder_52542", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)), str);
    }
}
