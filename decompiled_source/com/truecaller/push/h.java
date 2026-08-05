package com.truecaller.push;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class h {
    public final android.content.Context a;
    public final qc3.bar b;
    public final qc3.bar c;
    public final qc3.bar d;
    public final qc3.bar e;
    public final qc3.bar f;
    public final qc3.bar g;
    public final qc3.bar h;
    public final qc3.bar i;
    public final qc3.bar j;
    public final qc3.bar k;
    public final java.util.Map l;

    public h(android.content.Context context, qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3, qc3.bar barVar4, qc3.bar barVar5, qc3.bar barVar6, qc3.bar barVar7, qc3.bar barVar8, qc3.bar barVar9, qc3.bar barVar10, com.google.common.collect.ImmutableMap immutableMap) {
        this.a = context;
        this.b = barVar;
        this.c = barVar2;
        this.d = barVar3;
        this.e = barVar4;
        this.f = barVar5;
        this.g = barVar6;
        this.h = barVar7;
        this.i = barVar8;
        this.j = barVar9;
        this.k = barVar10;
        this.l = immutableMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x090a  */
    /* JADX WARN: Type inference failed for: r2v17, types: [qx2.tg, java.lang.Object, ci3.m] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ai2.bar barVar) {
        char c;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Boolean bool;
        java.lang.String str3;
        java.lang.String str4;
        int i;
        qx2.lh lhVar;
        com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2;
        java.util.HashMap hashMap;
        java.lang.String str5;
        java.lang.String str6;
        ai2.baz bazVar = barVar.a;
        com.truecaller.network.notification.NotificationType c2 = barVar.c();
        int i2 = com.truecaller.push.g.a[c2.ordinal()];
        android.content.Context context = this.a;
        switch (i2) {
            case 1:
                ((o71.bar) this.c.get()).a.d(new hg0.a(com.truecaller.analytics.common.event.ContactRequestEvent.Action.RECEIVED));
                return;
            case 2:
            case 3:
            case 4:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notification");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                od.n k = od.n.k(context);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k, "getInstance(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.contactrequest.ContactRequestNotificationWorker.class, "workerClass");
                f6.v0 v0Var = new f6.v0(com.truecaller.premium.contactrequest.ContactRequestNotificationWorker.class);
                kotlin.Pair[] pairArr = {new kotlin.Pair("EXTRA_MEMBER_TRANSACTION_ID", barVar.a(com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_ID_KEY)), new kotlin.Pair("EXTRA_PHONE_NUMBER", barVar.a("n")), new kotlin.Pair("EXTRA_TCID", barVar.a("tcId")), new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(barVar.c().value)), new kotlin.Pair("EXTRA_NOTIFICATION_TIMESTAMP", java.lang.Long.valueOf(new org.joda.time.DateTime().i())), new kotlin.Pair("EXTRA_IS_TEST_MODE", java.lang.Boolean.FALSE)};
                nd.b0 b0Var = new nd.b0();
                for (int i3 = 0; i3 < 6; i3++) {
                    kotlin.Pair pair = pairArr[i3];
                    b0Var.b((java.lang.String) pair.a, pair.b);
                }
                k.g("ContactRequestNotificationWorker", nd.l.d, v0Var.y(b0Var.a()).d());
                return;
            case 5:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notification");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                od.n k2 = od.n.k(context);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k2, "getInstance(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.PremiumEntitlementNotificationWorker.class, "workerClass");
                f6.v0 v0Var2 = new f6.v0(com.truecaller.premium.PremiumEntitlementNotificationWorker.class);
                kotlin.Pair[] pairArr2 = {new kotlin.Pair("refreshOnlyKey", barVar.a("ro")), new kotlin.Pair("premiumLevelKey", barVar.a("pl")), new kotlin.Pair("daysKey", barVar.a("d"))};
                nd.b0 b0Var2 = new nd.b0();
                int i4 = 0;
                for (int i5 = 3; i4 < i5; i5 = 3) {
                    kotlin.Pair pair2 = pairArr2[i4];
                    b0Var2.b((java.lang.String) pair2.a, pair2.b);
                    i4++;
                }
                k2.g("PremiumEntitlementNotificationWorker", nd.l.a, v0Var2.y(b0Var2.a()).d());
                return;
            case 6:
                b61.baz bazVar2 = (b61.baz) this.g.get();
                fg3.h0.J(bazVar2.a, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new b61.bar(bazVar2, (df3.bar) null, 2), 3);
                return;
            case 7:
                int i6 = com.truecaller.referral.ReferralNotificationService.h;
                java.util.Objects.toString(context);
                barVar.toString();
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.referral.ReferralNotificationService.class);
                java.lang.String a = barVar.a(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                if (!jj3.bar.i(a)) {
                    a.getClass();
                    switch (a.hashCode()) {
                        case -1154529449:
                            if (a.equals("joiner")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -759238347:
                            if (a.equals("clearCache")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -722568161:
                            if (a.equals("referrer")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 106940687:
                            if (a.equals("promo")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            str = "com.truecaller.intent.action.REFERRAL_JOINER_NOTIFICATION_RECEIVED";
                            break;
                        case 1:
                            str = "com.truecaller.intent.action.ACTION_CLEAR_CACHE_NOTIFICATION_RECEIVED";
                            break;
                        case 2:
                            str = "com.truecaller.intent.action.REFERRAL_REFERRER_NOTIFICATION_RECEIVED";
                            break;
                        case 3:
                            str = "com.truecaller.intent.action.REFERRAL_REFERRER_PROMO_NOTIFICATION_RECEIVED";
                            break;
                    }
                    if (!jj3.bar.i(str)) {
                        com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new java.lang.IllegalArgumentException("Role is not present in referral notification"));
                        return;
                    }
                    intent.setAction(str);
                    intent.putExtra("title", barVar.b());
                    java.lang.String a2 = barVar.a("s");
                    if (!jj3.bar.k(a2)) {
                        str2 = "";
                    } else {
                        str2 = a2;
                    }
                    intent.putExtra("text", str2);
                    intent.putExtra("days", barVar.a("d"));
                    intent.putExtra(com.unity3d.ads.metadata.MediationMetaData.KEY_NAME, barVar.a("f"));
                    android.os.Bundle extras = intent.getExtras();
                    if (extras != null) {
                        extras.size();
                    }
                    if (extras != null) {
                        java.util.Iterator<java.lang.String> it = extras.keySet().iterator();
                        while (it.hasNext()) {
                            java.util.Objects.toString(extras.get(it.next()));
                        }
                    }
                    context.startService(intent);
                    return;
                }
                str = null;
                if (!jj3.bar.i(str)) {
                }
            case 8:
            case 9:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notification");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                od.n k3 = od.n.k(context);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k3, "getInstance(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.PremiumSubscriptionStatusNotificationWorker.class, "workerClass");
                f6.v0 v0Var3 = new f6.v0(com.truecaller.premium.PremiumSubscriptionStatusNotificationWorker.class);
                kotlin.Pair pair3 = new kotlin.Pair("PAGE_URL", barVar.a("u"));
                kotlin.Pair pair4 = new kotlin.Pair("REASON", barVar.a("rs"));
                kotlin.Pair pair5 = new kotlin.Pair("TYPE", java.lang.Integer.valueOf(barVar.c().value));
                java.lang.String a3 = barVar.a("ft");
                if (a3 != null) {
                    bool = java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(a3));
                } else {
                    bool = null;
                }
                kotlin.Pair[] pairArr3 = {pair3, pair4, pair5, new kotlin.Pair("IS_FREE_TRIAL", bool), new kotlin.Pair("PURCHASE_TYPE", barVar.a("ct"))};
                nd.b0 b0Var3 = new nd.b0();
                int i7 = 0;
                for (int i8 = 5; i7 < i8; i8 = 5) {
                    kotlin.Pair pair6 = pairArr3[i7];
                    b0Var3.b((java.lang.String) pair6.a, pair6.b);
                    i7++;
                }
                k3.g("PremiumSubscriptionStatusNotificationWorker", nd.l.a, v0Var3.y(b0Var3.a()).d());
                return;
            case 10:
                java.util.Map<java.lang.String, java.lang.String> map = bazVar.b;
                if (map == null) {
                    map = java.util.Collections.EMPTY_MAP;
                }
                if (map != null) {
                    ep2.bar barVar2 = (ep2.bar) this.d.get();
                    java.util.Map<java.lang.String, java.lang.String> map2 = bazVar.b;
                    if (map2 == null) {
                        map2 = java.util.Collections.EMPTY_MAP;
                    }
                    barVar2.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, com.unity3d.services.core.device.reader.JsonStorageKeyNames.DATA_KEY);
                    if (r11.bar.a().d()) {
                        if (map2.containsKey("requestId")) {
                            str3 = map2.get("requestId");
                        } else {
                            str3 = null;
                        }
                        if (map2.containsKey(com.unity3d.ads.metadata.MediationMetaData.KEY_NAME)) {
                            str4 = map2.get(com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
                        } else {
                            str4 = null;
                        }
                        if (map2.containsKey("ttl")) {
                            i = java.lang.Integer.parseInt(map2.get("ttl"));
                        } else {
                            i = 0;
                        }
                        com.truecaller.sdk.push.PushAppData pushAppData = new com.truecaller.sdk.push.PushAppData(str3, str4, i);
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putParcelable("a", pushAppData);
                        android.content.Intent launchIntent = com.truecaller.sdk.ConfirmProfileActivity.getLaunchIntent(context, bundle);
                        java.lang.String string = context.getString(2132018893, str4);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        android.net.Uri defaultUri = android.media.RingtoneManager.getDefaultUri(2);
                        s62.f fVar = barVar2.a;
                        java.lang.String o = fVar.o("profile_share");
                        s62.h hVar = barVar2.b;
                        bo.p a4 = hVar.a();
                        a4.b = 0;
                        a4.e = java.lang.Integer.valueOf(com.truecaller.analytics.common.event.PushNotificationAction.LeftButton.getType());
                        kotlin.jvm.internal.Intrinsics.d(launchIntent);
                        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                        android.app.PendingIntent e = a4.e(pushNotificationSource.getType(), "sdk_otp_notification", launchIntent);
                        android.content.Intent intent2 = new android.content.Intent("com.truecaller.sdk.web_request_reject", null, context, com.truecaller.sdk.push.SdkActionReceiver.class);
                        intent2.putExtras(bundle);
                        bo.p a5 = hVar.a();
                        a5.b = 16;
                        android.app.PendingIntent k4 = a5.k(pushNotificationSource.getType(), "sdk_otp_notification", intent2);
                        bo.p a6 = hVar.a();
                        a6.b = 16;
                        a6.e = java.lang.Integer.valueOf(com.truecaller.analytics.common.event.PushNotificationAction.RightButton.getType());
                        android.app.PendingIntent i9 = a6.i(pushNotificationSource.getType(), "sdk_otp_notification", intent2);
                        f6.f0 f0Var = new f6.f0(context, o);
                        android.app.Notification notification = f0Var.Q;
                        notification.icon = 2131232902;
                        f0Var.e = f6.f0.e(string);
                        notification.vibrate = new long[]{500, 100, 500};
                        f0Var.s(defaultUri);
                        f0Var.n(-16776961, 1, 1);
                        f0Var.l = 1;
                        f0Var.l(2, true);
                        f0Var.a(2131232901, e, context.getString(2132018890));
                        f0Var.a(2131232906, i9, context.getString(2132018892));
                        f0Var.f = f6.f0.e(context.getString(2132018891));
                        f0Var.g = e;
                        notification.deleteIntent = k4;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var, "setDeleteIntent(...)");
                        android.app.Notification d = f0Var.d();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
                        fVar.v(16, d, pushNotificationSource.getType(), "sdk_otp_notification");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushAppData, "pushAppData");
                        com.truecaller.sdk.i a7 = r11.bar.a();
                        kotlin.jvm.internal.Intrinsics.e(a7, "null cannot be cast to non-null type com.truecaller.sdk.EventsTrackerHolder");
                        com.truecaller.sdk.i iVar = a7;
                        bi3.y0 y0Var = qx2.tg.d;
                        hi3.a aVar = qx2.tg.e;
                        bi3.j0[] j0VarArr = (bi3.j0[]) y0Var.v().toArray(new bi3.j0[0]);
                        boolean[] zArr = new boolean[j0VarArr.length];
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        java.util.HashMap w = bx.e1.w("EventType", "NotificationShown");
                        if (str3 != null) {
                            w.put("WebRequestId", str3);
                            hashMap2.put("requestId", str3);
                        }
                        if (!android.text.TextUtils.isEmpty(str4)) {
                            w.put("PartnerName", str4);
                            hashMap2.put(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_OM_PARTNER, str4);
                        }
                        bi3.j0 j0Var = j0VarArr[2];
                        zArr[2] = true;
                        nc0.a aVar2 = iVar.a;
                        try {
                            ?? obj = new java.lang.Object();
                            if (zArr[0]) {
                                lhVar = null;
                            } else {
                                bi3.j0 j0Var2 = j0VarArr[0];
                                lhVar = (qx2.lh) aVar.g(j0Var2.f, aVar.j(j0Var2));
                            }
                            obj.a = lhVar;
                            if (zArr[1]) {
                                clientHeaderV2 = null;
                            } else {
                                bi3.j0 j0Var3 = j0VarArr[1];
                                clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) aVar.g(j0Var3.f, aVar.j(j0Var3));
                            }
                            obj.b = clientHeaderV2;
                            if (zArr[2]) {
                                hashMap = hashMap2;
                            } else {
                                bi3.j0 j0Var4 = j0VarArr[2];
                                hashMap = (java.util.Map) aVar.g(j0Var4.f, aVar.j(j0Var4));
                            }
                            obj.c = hashMap;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "build(...)");
                            aVar2.c((ci3.m) obj);
                            return;
                        } catch (bi3.bar e2) {
                            throw e2;
                        } catch (java.lang.Exception e3) {
                            throw new java.lang.RuntimeException(e3);
                        }
                    }
                    return;
                }
                return;
            case 11:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notification");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                od.n k5 = od.n.k(context);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k5, "getInstance(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.whoviewedme.ReceiveProfileViewWorker.class, "workerClass");
                f6.v0 v0Var4 = new f6.v0(com.truecaller.whoviewedme.ReceiveProfileViewWorker.class);
                kotlin.Pair[] pairArr4 = {new kotlin.Pair("EXTRA_TC_ID", barVar.a("n")), new kotlin.Pair("EXTRA_E_TC_ID", barVar.a("nx")), new kotlin.Pair("EXTRA_PROFILE_VIEW_EVENT_SOURCE", barVar.a("ac")), new kotlin.Pair("EXTRA_PROFILE_COUNTRY_ISO", barVar.a("c"))};
                nd.b0 b0Var4 = new nd.b0();
                int i10 = 0;
                for (int i11 = 4; i10 < i11; i11 = 4) {
                    kotlin.Pair pair7 = pairArr4[i10];
                    b0Var4.b((java.lang.String) pair7.a, pair7.b);
                    i10++;
                }
                k5.g("ReceiveProfileViewWorker", nd.l.a, v0Var4.y(b0Var4.a()).d());
                return;
            case 12:
                cv0.baz bazVar3 = (cv0.baz) this.e.get();
                bazVar3.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notification");
                fg3.h0.J(fg3.f1.a, bazVar3.c, (fg3.f0) null, new cv0.bar(bazVar3, barVar, (df3.bar) null, 0), 2);
                return;
            case 13:
                ((uv2.e) this.b.get()).e(false);
                return;
            case 14:
                n11.o oVar = (n11.l) this.f.get();
                java.lang.String a8 = barVar.a("t");
                n11.o oVar2 = oVar;
                zx.bar i12 = oVar2.i();
                if (i12 != null) {
                    int i14 = n11.p.e;
                    if (kotlin.jvm.internal.Intrinsics.b(kotlin.text.StringsKt.c0(i12.b, "+"), a8)) {
                        oVar2.d(i12);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notification");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                od.n k6 = od.n.k(context);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k6, "getInstance(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.gift.GoldGiftNotificationWorker.class, "workerClass");
                f6.v0 v0Var5 = new f6.v0(com.truecaller.premium.gift.GoldGiftNotificationWorker.class);
                kotlin.Pair[] pairArr5 = {new kotlin.Pair("fullNameKey", barVar.a("f")), new kotlin.Pair("numberKey", barVar.a("n"))};
                nd.b0 b0Var5 = new nd.b0();
                int i15 = 0;
                for (int i16 = 2; i15 < i16; i16 = 2) {
                    kotlin.Pair pair8 = pairArr5[i15];
                    b0Var5.b((java.lang.String) pair8.a, pair8.b);
                    i15++;
                }
                k6.g("GoldGiftNotificationWorker", nd.l.a, v0Var5.y(b0Var5.a()).d());
                return;
            case 16:
            case 17:
            case 18:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notification");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                od.n k7 = od.n.k(context);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k7, "getInstance(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.familysharing.FamilySharingNotificationWorker.class, "workerClass");
                f6.v0 v0Var6 = new f6.v0(com.truecaller.premium.familysharing.FamilySharingNotificationWorker.class);
                kotlin.Pair[] pairArr6 = {new kotlin.Pair("EXTRA_TC_ID", barVar.a("fop")), new kotlin.Pair("MEMBER_TC_ID", barVar.a("tcId")), new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(barVar.c().value))};
                nd.b0 b0Var6 = new nd.b0();
                int i17 = 0;
                for (int i18 = 3; i17 < i18; i18 = 3) {
                    kotlin.Pair pair9 = pairArr6[i17];
                    b0Var6.b((java.lang.String) pair9.a, pair9.b);
                    i17++;
                }
                k7.g("FamilySharingNotificationWorker", nd.l.a, v0Var6.y(b0Var6.a()).d());
                return;
            case 19:
                gg0.bar barVar3 = (gg0.bar) this.h.get();
                barVar3.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notification");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<this>");
                java.lang.String a9 = barVar.a("p");
                ji0.baz bazVar4 = new ji0.baz(com.appsflyer.internal.e.j(a9, "<this>", "+", a9), java.lang.Long.parseLong(barVar.a("st")), java.lang.Long.parseLong(barVar.a("et")), barVar.a("f"), barVar.a("rs"), barVar.a("i"), barVar.a("tg"), barVar.a("bg"), barVar.a("rid"));
                ((gi0.bar) barVar3.b.get()).a(bazVar4.i(), bazVar4.c(), bazVar4.e(), bazVar4.b(), bazVar4.f(), bazVar4.d(), bazVar4.h());
                com.google.gson.Gson gson = com.truecaller.bizmon.dynamicCalls.worker.BizDynamicCallerInfoSyncWorker.d;
                lf.bar.H(barVar3.a, bazVar4);
                return;
            case 20:
                m03.w wVar = (m03.w) this.i.get();
                wVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notification");
                qc3.bar barVar4 = wVar.b;
                s62.f fVar2 = (s62.d) barVar4.get();
                com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource2 = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                fVar2.a(2131364268, pushNotificationSource2.getType(), "generalNotification");
                android.content.Context context2 = wVar.a;
                f6.f0 f0Var2 = new f6.f0(context2, ((s62.d) barVar4.get()).o("general_info"));
                android.app.Notification notification2 = f0Var2.Q;
                notification2.icon = 2131232902;
                f0Var2.D = context2.getColor(2131102024);
                f0Var2.e = f6.f0.e(barVar.b());
                java.lang.String a10 = barVar.a("s");
                if (!jj3.bar.k(a10)) {
                    str5 = "";
                } else {
                    str5 = a10;
                }
                f0Var2.f = f6.f0.e(str5);
                f0Var2.s((android.net.Uri) null);
                notification2.vibrate = new long[]{500, 100, 500};
                f0Var2.l = 2;
                f0Var2.m = false;
                android.app.Notification d2 = f0Var2.d();
                s62.f fVar3 = (s62.d) barVar4.get();
                kotlin.jvm.internal.Intrinsics.d(d2);
                fVar3.v(2131364268, d2, pushNotificationSource2.getType(), "generalNotification");
                return;
            case 21:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notification");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                od.n k8 = od.n.k(context);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k8, "getInstance(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.scamfeed.ScamFeedNotificationWorker.class, "workerClass");
                f6.v0 v0Var7 = new f6.v0(com.truecaller.scamfeed.ScamFeedNotificationWorker.class);
                kotlin.Pair pair10 = new kotlin.Pair("EXTRA_URI", barVar.a("sfu"));
                kotlin.Pair pair11 = new kotlin.Pair("EXTRA_TITLE", barVar.b());
                java.lang.String a11 = barVar.a("s");
                if (!jj3.bar.k(a11)) {
                    a11 = "";
                }
                kotlin.Pair[] pairArr7 = {pair10, pair11, new kotlin.Pair("EXTRA_BODY", a11), new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(barVar.c().value))};
                nd.b0 b0Var7 = new nd.b0();
                int i19 = 0;
                for (int i20 = 4; i19 < i20; i20 = 4) {
                    kotlin.Pair pair12 = pairArr7[i19];
                    b0Var7.b((java.lang.String) pair12.a, pair12.b);
                    i19++;
                }
                k8.g("ScamFeedNotificationWorker", nd.l.a, v0Var7.y(b0Var7.a()).d());
                return;
            case 22:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notification");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                od.n k9 = od.n.k(context);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k9, "getInstance(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.editprofile.InvalidProfileNotificationWorker.class, "workerClass");
                f6.v0 v0Var8 = new f6.v0(com.truecaller.editprofile.InvalidProfileNotificationWorker.class);
                kotlin.Pair[] pairArr8 = {new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(barVar.c().value))};
                nd.b0 b0Var8 = new nd.b0();
                kotlin.Pair pair13 = pairArr8[0];
                b0Var8.b((java.lang.String) pair13.a, pair13.b);
                k9.g("InvalidProfileNotificationWorker", nd.l.a, v0Var8.y(b0Var8.a()).d());
                return;
            case 23:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notification");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                od.n k10 = od.n.k(context);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k10, "getInstance(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.familyprotect.FamilyProtectFetchConfigWorker.class, "workerClass");
                f6.v0 v0Var9 = new f6.v0(com.truecaller.familyprotect.FamilyProtectFetchConfigWorker.class);
                kotlin.Pair[] pairArr9 = {new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(barVar.c().value))};
                nd.b0 b0Var9 = new nd.b0();
                kotlin.Pair pair14 = pairArr9[0];
                b0Var9.b((java.lang.String) pair14.a, pair14.b);
                k10.g("FamilyProtectFetchConfigWorker", nd.l.a, v0Var9.y(b0Var9.a()).u(nd.bar.a, 30L, java.util.concurrent.TimeUnit.SECONDS).d());
                return;
            case 24:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notification");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                od.n k11 = od.n.k(context);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k11, "getInstance(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.impact.ImpactNotificationWorker.class, "workerClass");
                f6.v0 v0Var10 = new f6.v0(com.truecaller.impact.ImpactNotificationWorker.class);
                kotlin.Pair pair15 = new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(barVar.c().value));
                kotlin.Pair pair16 = new kotlin.Pair("EXTRA_NOTIFICATION_NUMBER", barVar.a("n"));
                kotlin.Pair pair17 = new kotlin.Pair("EXTRA_NOTIFICATION_TITLE", barVar.b());
                java.lang.String a12 = barVar.a("a");
                if (jj3.bar.k(a12)) {
                    str6 = a12;
                } else {
                    str6 = null;
                }
                kotlin.Pair[] pairArr10 = {pair15, pair16, pair17, new kotlin.Pair("EXTRA_NOTIFICATION_TEXTS", str6), new kotlin.Pair("EXTRA_NOTIFICATION_IMAGE_URL", barVar.a("i")), new kotlin.Pair("EXTRA_IMPACT_NOTIFICATION_TYPE", barVar.a("it"))};
                nd.b0 b0Var10 = new nd.b0();
                int i21 = 0;
                for (int i22 = 6; i21 < i22; i22 = 6) {
                    kotlin.Pair pair18 = pairArr10[i21];
                    b0Var10.b((java.lang.String) pair18.a, pair18.b);
                    i21++;
                }
                k11.g("ImpactNotificationWorker", nd.l.a, v0Var10.y(b0Var10.a()).d());
                return;
            case 25:
                ql1.baz bazVar5 = (ql1.baz) this.j.get();
                java.lang.String a14 = barVar.a("ci");
                vl1.bar barVar5 = bazVar5.d;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a14, "scamCallInfoJson");
                try {
                    barVar5.getClass();
                    vl1.bar.a("Received scam call payload " + a14);
                    com.truecaller.familyprotect.domain.remotereject.ScamCallInfo scamCallInfo = (com.truecaller.familyprotect.domain.remotereject.ScamCallInfo) bazVar5.c.a(a14, com.truecaller.familyprotect.domain.remotereject.ScamCallInfo.class);
                    if (scamCallInfo == null) {
                        vl1.bar.b("Received invalid payload", true);
                        return;
                    }
                    int i24 = com.truecaller.familyprotect.domain.remotereject.admin.RemoteRejectAdminService.h;
                    ef0.a.U(scamCallInfo.getMemberPhoneNumber(), scamCallInfo.getFraudsterPhoneNumber(), bazVar5.b, scamCallInfo.getCallId(), scamCallInfo.getFraudsterName());
                    return;
                } catch (java.lang.Exception e4) {
                    java.lang.String str7 = "Failed to de-serialise payload " + e4.getMessage();
                    barVar5.getClass();
                    vl1.bar.b(str7, true);
                    return;
                }
            case 26:
                ((uk1.a) this.k.get()).a(barVar.a("at"));
                return;
            default:
                java.util.Map map3 = this.l;
                if (map3.containsKey(c2) && ((com.truecaller.push.j) map3.get(c2)) != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notification");
                    barVar.toString();
                    return;
                }
                return;
        }
    }
}
