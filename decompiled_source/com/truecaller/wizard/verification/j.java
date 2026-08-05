package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class j implements com.truecaller.wizard.verification.r0 {
    public final r31.bar a;
    public final qc3.bar b;
    public final n11.g c;
    public final q73.qux d;
    public final c52.qux e;
    public final u03.z f;
    public final u03.baz g;

    public j(r31.bar barVar, qc3.bar barVar2, n11.g gVar, q73.qux quxVar, c52.qux quxVar2, u03.z zVar, u03.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "coreSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "accountSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "regionUtils");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "accountHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar2, "deviceUtilsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zVar, "permissionUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "clock");
        this.a = barVar;
        this.b = barVar2;
        this.c = gVar;
        this.d = quxVar;
        this.e = quxVar2;
        this.f = zVar;
        this.g = bazVar;
    }

    @Override // com.truecaller.wizard.verification.r0
    public final java.lang.Object a(yy.e1 e1Var, v73.f fVar) {
        java.lang.String d = e1Var.d();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "getInstallationId(...)");
        java.lang.Object e = e(d, e1Var.h(), e1Var.g(), false, yy.qux.w(e1Var), yy.qux.x(e1Var), null, null, yy.qux.u(e1Var), fVar);
        if (e == ef3.bar.a) {
            return e;
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0146  */
    @Override // com.truecaller.wizard.verification.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(com.truecaller.account.network.TokenResponseDto tokenResponseDto, java.lang.Long l, java.lang.String str, java.lang.String str2, df3.bar barVar) {
        long j;
        kotlin.Pair pair;
        com.truecaller.account.network.AccessTokenDetails accessTokenDetails;
        java.lang.String str3;
        com.truecaller.account.network.VerificationPhoneNumber verificationPhoneNumber;
        java.lang.String installationId = tokenResponseDto.getInstallationId();
        if (installationId != null) {
            java.lang.Long userId = tokenResponseDto.getUserId();
            if (userId != null) {
                long longValue = userId.longValue();
                java.lang.Long ttl = tokenResponseDto.getTtl();
                if (ttl != null) {
                    j = ttl.longValue();
                } else {
                    j = 0;
                }
                boolean b = kotlin.jvm.internal.Intrinsics.b(tokenResponseDto.getSuspended(), java.lang.Boolean.TRUE);
                kotlin.Pair y = yi3.bar.y(tokenResponseDto);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenResponseDto, "<this>");
                java.util.List phones = tokenResponseDto.getPhones();
                cy.qux quxVar = null;
                if (phones != null) {
                    java.util.List w0 = kotlin.collections.CollectionsKt.w0(new vc2.f(3), phones);
                    if (w0 != null && (verificationPhoneNumber = (com.truecaller.account.network.VerificationPhoneNumber) kotlin.collections.CollectionsKt.X(1, w0)) != null) {
                        pair = new kotlin.Pair(java.lang.Long.valueOf(verificationPhoneNumber.getPhoneNumber()), verificationPhoneNumber.getCountryCode());
                        accessTokenDetails = tokenResponseDto.getAccessTokenDetails();
                        if (accessTokenDetails == null) {
                            com.truecaller.account.network.m config = accessTokenDetails.getConfig();
                            long b2 = config.b();
                            java.util.Map a = config.a();
                            java.util.ArrayList arrayList = new java.util.ArrayList(a.size());
                            for (java.util.Map.Entry entry : a.entrySet()) {
                                java.lang.Object key = entry.getKey();
                                java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
                                com.truecaller.account.network.AccessTokenDetails accessTokenDetails2 = accessTokenDetails;
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(iterable, 10));
                                java.util.Iterator it = iterable.iterator();
                                while (it.hasNext()) {
                                    com.truecaller.account.network.p pVar = (com.truecaller.account.network.p) it.next();
                                    arrayList2.add(new cy.a(pVar.a(), pVar.b()));
                                    it = it;
                                    installationId = installationId;
                                }
                                arrayList.add(new kotlin.Pair(key, arrayList2));
                                accessTokenDetails = accessTokenDetails2;
                            }
                            str3 = installationId;
                            cy.baz bazVar = new cy.baz(kotlin.collections.r0.p(arrayList), b2);
                            java.util.Map tokens = accessTokenDetails.getTokens().getTokens();
                            java.util.ArrayList arrayList3 = new java.util.ArrayList(tokens.size());
                            for (java.util.Map.Entry entry2 : tokens.entrySet()) {
                                arrayList3.add(new kotlin.Pair(entry2.getKey(), new cy.bar(((com.truecaller.account.network.n) entry2.getValue()).a(), ((com.truecaller.account.network.n) entry2.getValue()).b())));
                            }
                            quxVar = new cy.qux(bazVar, kotlin.collections.r0.p(arrayList3));
                        } else {
                            str3 = installationId;
                        }
                        return e(str3, longValue, j, b, y, pair, l, str, quxVar, (ff3.qux) barVar);
                    }
                }
                pair = new kotlin.Pair((java.lang.Object) null, (java.lang.Object) null);
                accessTokenDetails = tokenResponseDto.getAccessTokenDetails();
                if (accessTokenDetails == null) {
                }
                return e(str3, longValue, j, b, y, pair, l, str, quxVar, (ff3.qux) barVar);
            }
            throw new java.lang.IllegalStateException();
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // com.truecaller.wizard.verification.r0
    public final void c() {
        ((u03.qux) this.g).getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        f13.b bVar = this.a;
        bVar.m("profileVerificationDate", currentTimeMillis);
        java.lang.String str = null;
        if (this.f.c()) {
            java.lang.Object systemService = this.e.a.getSystemService(com.truecaller.sdk.oAuth.networking.data.PartnerDetailsResponse.OAUTH_SCOPE_PHONE);
            kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            try {
                str = ((android.telephony.TelephonyManager) systemService).getSimSerialNumber();
            } catch (java.lang.SecurityException unused) {
            }
        }
        bVar.n("profileSimNumber", str);
        int i = com.truecaller.wizard.verification.h.a[this.c.b().ordinal()];
        qc3.bar barVar = this.b;
        if (i != 1) {
            if (i == 2) {
                ((q11.bar) barVar.get()).k("region_br_policy_accepted", true);
                return;
            }
            return;
        }
        ((q11.bar) barVar.get()).k("region_za_policy_accepted", true);
    }

    @Override // com.truecaller.wizard.verification.r0
    public final java.lang.Object d(yy.e1 e1Var, java.lang.Long l, java.lang.String str, java.lang.String str2, df3.bar barVar) {
        java.lang.String d = e1Var.d();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "getInstallationId(...)");
        return e(d, e1Var.h(), e1Var.g(), e1Var.f(), yy.qux.w(e1Var), yy.qux.x(e1Var), l, str, yy.qux.u(e1Var), (ff3.qux) barVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object e(java.lang.String str, long j, long j2, boolean z, kotlin.Pair pair, kotlin.Pair pair2, java.lang.Long l, java.lang.String str2, cy.qux quxVar, ff3.qux quxVar2) {
        com.truecaller.wizard.verification.i iVar;
        int i;
        java.lang.String v;
        java.lang.String str3;
        if (quxVar2 instanceof com.truecaller.wizard.verification.i) {
            iVar = (com.truecaller.wizard.verification.i) quxVar2;
            int i2 = iVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = iVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = iVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.lang.Long l2 = (java.lang.Long) pair.a;
                    java.lang.String str4 = (java.lang.String) pair.b;
                    if (l2 == null) {
                        l2 = l;
                    }
                    if (l2 != null && (v = ze0.c0.v(l2.longValue())) != null) {
                        if (str4 == null) {
                            if (str2 != null) {
                                str3 = str2;
                            } else {
                                throw new java.lang.IllegalStateException();
                            }
                        } else {
                            str3 = str4;
                        }
                        java.lang.Long l3 = (java.lang.Long) pair2.a;
                        java.lang.String str5 = (java.lang.String) pair2.b;
                        q73.qux quxVar3 = this.d;
                        java.lang.String str6 = null;
                        if (z) {
                            quxVar3.d(str);
                            if (l3 != null) {
                                str6 = ze0.c0.v(l3.longValue());
                            }
                            com.truecaller.wizard.account.AccountHelperImpl$VerifiedNumberParams accountHelperImpl$VerifiedNumberParams = new com.truecaller.wizard.account.AccountHelperImpl$VerifiedNumberParams(j, v, str3, str, j2, str6, str5);
                            quxVar3.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountHelperImpl$VerifiedNumberParams, "params");
                            quxVar3.d.n("verified_number_params", new com.google.gson.Gson().toJson(accountHelperImpl$VerifiedNumberParams));
                        } else {
                            zx.bar barVar2 = new zx.bar(str3, v);
                            if (str5 != null && l3 != null) {
                                str6 = new zx.bar(str5, ze0.c0.v(l3.longValue()));
                            }
                            iVar.z = 1;
                            java.lang.Object W = fg3.h0.W(quxVar3.a, new i1.g3(quxVar3, j, barVar2, str, j2, str6, quxVar, (df3.bar) null), iVar);
                            if (W != barVar) {
                                W = kotlin.Unit.a;
                            }
                            if (W == barVar) {
                                return barVar;
                            }
                        }
                    } else {
                        throw new java.lang.IllegalStateException();
                    }
                }
                return com.truecaller.wizard.verification.p0.a;
            }
        }
        iVar = new com.truecaller.wizard.verification.i(this, quxVar2);
        java.lang.Object obj2 = iVar.x;
        ef3.bar barVar3 = ef3.bar.a;
        i = iVar.z;
        if (i == 0) {
        }
        return com.truecaller.wizard.verification.p0.a;
    }
}
