package com.truecaller.data.country;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class f extends ff3.g implements kotlin.jvm.functions.Function2 {
    public java.lang.Object A;
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ java.lang.Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(java.lang.Object obj, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object c(java.lang.Object obj) {
        boolean z;
        java.lang.ref.WeakReference weakReference;
        java.lang.String str;
        com.truecaller.data.entity.Contact contact;
        java.lang.String str2;
        com.truecaller.data.entity.Contact contact2;
        com.truecaller.premium.PremiumLaunchContext.Static r11;
        com.truecaller.ui.t2 t2Var = (com.truecaller.ui.t2) this.A;
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            java.lang.Object obj2 = t2Var.d.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            w82.v vVar = (w82.v) obj2;
            ah.k0 k0Var = vVar.c;
            kotlin.Lazy lazy = (kotlin.Lazy) k0Var.i;
            u03.g0 g0Var = (u03.b0) k0Var.d;
            vj2.a aVar = (vj2.a) k0Var.b;
            f13.b bVar = (r31.bar) k0Var.a;
            java.lang.String str3 = (java.lang.String) k0Var.h;
            if (!((w82.r1) ((w82.q1) k0Var.e)).G() && str3 != null && aVar.c("featureFriendsUpgraded_24757", false)) {
                f13.b bVar2 = bVar;
                if (new org.joda.time.DateTime(bVar2.f("friendUpgradedToPremiumLastShown", 0L)).J(aVar.getInt("friendUpgradedCoolOffWeeks_24757", 2)).n()) {
                    com.truecaller.data.entity.Contact contact3 = (com.truecaller.data.entity.Contact) lazy.getValue();
                    if (contact3 != null) {
                        if (contact3.R()) {
                            str = g0Var.h(2132018530, new java.lang.Object[0]);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                        } else if (contact3.O()) {
                            str = g0Var.h(2132018528, new java.lang.Object[0]);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                        }
                        contact = (com.truecaller.data.entity.Contact) lazy.getValue();
                        if (contact != null) {
                            if (contact.R()) {
                                str2 = g0Var.h(2132018529, new java.lang.Object[0]);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
                            } else if (contact.O()) {
                                str2 = g0Var.h(2132018527, new java.lang.Object[0]);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
                            }
                            contact2 = (com.truecaller.data.entity.Contact) lazy.getValue();
                            if (contact2 != null) {
                                if (contact2.R()) {
                                    r11 = i82.r.H8;
                                } else if (contact2.O()) {
                                    r11 = i82.r.G8;
                                }
                                if (str != null && str2 != null && r11 != null) {
                                    vVar.c(r11, str, str2);
                                    java.util.ArrayList I0 = kotlin.collections.CollectionsKt.I0((java.util.List) k0Var.g);
                                    I0.add(str3);
                                    kotlin.Unit unit = kotlin.Unit.a;
                                    bVar2.n("premiumAlreadyNotified", kotlin.collections.CollectionsKt.b0(I0, ",", (java.lang.String) null, (java.lang.String) null, (kotlin.jvm.functions.Function1) null, 62));
                                    bVar2.m("friendUpgradedToPremiumLastShown", new org.joda.time.DateTime().i());
                                    k0Var.Z((java.lang.String) null);
                                    z = true;
                                    if (!z) {
                                        p.c3 c3Var = t2Var.e;
                                        cl2.m mVar = (jq2.qux) c3Var.b;
                                        if (!((w82.r1) ((w82.q1) c3Var.d)).G()) {
                                            cl2.m mVar2 = mVar;
                                            if (mVar2.k("premiumLostConsumableType")) {
                                                ((u03.baz) c3Var.c).getClass();
                                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                                long D = mVar2.D("premiumLostConsumableNotificationCount", 0L);
                                                long D2 = mVar2.D("premiumLostConsumableNotificationTimestamp", currentTimeMillis);
                                                if (D == 0) {
                                                    if (new org.joda.time.DateTime(D2).B(1).l(currentTimeMillis)) {
                                                        mVar.e0("premiumLostConsumableNotificationCount", D + 1);
                                                        c3Var.A();
                                                        z = true;
                                                    }
                                                } else if (D != 1 && D != 2) {
                                                    if (D == 3) {
                                                        if (new org.joda.time.DateTime(D2).J(2).l(currentTimeMillis)) {
                                                            mVar.e0("premiumLostConsumableNotificationCount", D + 1);
                                                            c3Var.A();
                                                            z = true;
                                                        }
                                                    } else {
                                                        c3Var.h();
                                                    }
                                                } else if (new org.joda.time.DateTime(D2).J(1).l(currentTimeMillis)) {
                                                    mVar.e0("premiumLostConsumableNotificationCount", D + 1);
                                                    c3Var.A();
                                                    z = true;
                                                }
                                            }
                                        }
                                        z = false;
                                    }
                                    if (!z) {
                                        o02.baz bazVar = t2Var.c;
                                        s62.d dVar = (s62.d) bazVar.d;
                                        android.content.Context context = (android.content.Context) bazVar.b;
                                        f13.b bVar3 = (r31.bar) bazVar.c;
                                        if (bVar3.c("premiumHadPremiumBlockingFeatures")) {
                                            android.content.Intent c = h8.s0.c((i82.t) bazVar.e, (android.content.Context) bazVar.b, i82.r.d9, (com.truecaller.premium.data.SubscriptionPromoEventMetaData) null, (com.truecaller.premium.data.feature.PremiumFeature) null, false, (com.truecaller.premium.interstitial.InterstitialAnimation) null, 60);
                                            android.content.Context context2 = (android.content.Context) bazVar.b;
                                            com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                                            s62.f fVar = (s62.f) dVar;
                                            android.app.PendingIntent k = fVar.k(pushNotificationSource.getType(), 0, 201326592, context2, c, "notificationPremiumBlocking");
                                            java.lang.String string = context.getString(2132018405);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                            java.lang.String string2 = context.getString(2132018404);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                            f6.f0 f0Var = new f6.f0(context, fVar.o("miscellaneous_channel"));
                                            f0Var.e = f6.f0.e(string);
                                            f0Var.f = f6.f0.e(string2);
                                            f6.y yVar = new f6.y(0);
                                            yVar.f = f6.f0.e(string2);
                                            f0Var.t(yVar);
                                            f0Var.m(android.graphics.BitmapFactory.decodeResource(context.getResources(), 2131231962));
                                            f0Var.D = context.getColor(2131102024);
                                            f0Var.k(-1);
                                            f0Var.Q.icon = 2131232902;
                                            f0Var.g = k;
                                            f0Var.l(16, true);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f0Var, "setAutoCancel(...)");
                                            android.app.Notification d = f0Var.d();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "build(...)");
                                            fVar.v(2131365792, d, pushNotificationSource.getType(), "notificationPremiumBlocking");
                                            bVar3.p("premiumHadPremiumBlockingFeatures");
                                            bd.bar.u((nc0.bar) bazVar.f, "notificationPremiumBlocking", "notification");
                                        }
                                    }
                                    weakReference = (java.lang.ref.WeakReference) this.z;
                                    this.y = 1;
                                    if (com.truecaller.ui.t2.a(t2Var, weakReference, this) == barVar) {
                                        return barVar;
                                    }
                                }
                            }
                            r11 = null;
                            if (str != null) {
                                vVar.c(r11, str, str2);
                                java.util.ArrayList I02 = kotlin.collections.CollectionsKt.I0((java.util.List) k0Var.g);
                                I02.add(str3);
                                kotlin.Unit unit2 = kotlin.Unit.a;
                                bVar2.n("premiumAlreadyNotified", kotlin.collections.CollectionsKt.b0(I02, ",", (java.lang.String) null, (java.lang.String) null, (kotlin.jvm.functions.Function1) null, 62));
                                bVar2.m("friendUpgradedToPremiumLastShown", new org.joda.time.DateTime().i());
                                k0Var.Z((java.lang.String) null);
                                z = true;
                                if (!z) {
                                }
                                if (!z) {
                                }
                                weakReference = (java.lang.ref.WeakReference) this.z;
                                this.y = 1;
                                if (com.truecaller.ui.t2.a(t2Var, weakReference, this) == barVar) {
                                }
                            }
                        }
                        str2 = null;
                        contact2 = (com.truecaller.data.entity.Contact) lazy.getValue();
                        if (contact2 != null) {
                        }
                        r11 = null;
                        if (str != null) {
                        }
                    }
                    str = null;
                    contact = (com.truecaller.data.entity.Contact) lazy.getValue();
                    if (contact != null) {
                    }
                    str2 = null;
                    contact2 = (com.truecaller.data.entity.Contact) lazy.getValue();
                    if (contact2 != null) {
                    }
                    r11 = null;
                    if (str != null) {
                    }
                }
            }
            z = false;
            if (!z) {
            }
            if (!z) {
            }
            weakReference = (java.lang.ref.WeakReference) this.z;
            this.y = 1;
            if (com.truecaller.ui.t2.a(t2Var, weakReference, this) == barVar) {
            }
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object f(java.lang.Object obj) {
        java.util.List list;
        java.lang.Object W;
        com.truecaller.accountonboarding.v1.Service.VerifyOnboardingOtpResponse.ResponseCase responseCase;
        int i;
        com.truecaller.wizard.verification.s1 s1Var = (com.truecaller.wizard.verification.s1) this.A;
        ef3.bar barVar = ef3.bar.a;
        int i2 = this.y;
        df3.bar barVar2 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                od.p.E(obj);
                W = obj;
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            s1Var.J.f();
            java.lang.String str = s1Var.O;
            if (str != null) {
                if (!(s1Var.f0.a instanceof com.truecaller.wizard.verification.c)) {
                    s1Var.E2(new com.truecaller.wizard.verification.v1(new com.truecaller.wizard.verification.e(false), (com.truecaller.wizard.verification.f0) null, (java.lang.Integer) null));
                }
                if (((qo1.i) s1Var.y.get()).a.a("readSimSubscriptionId_68972", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                    list = ((h13.c) s1Var.L.get()).a();
                } else {
                    list = kotlin.collections.h0.a;
                }
                java.util.List list2 = list;
                bm.e eVar = s1Var.C;
                java.lang.String str2 = (java.lang.String) this.z;
                java.lang.Object obj2 = s1Var.e.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                java.lang.String str3 = (java.lang.String) obj2;
                java.lang.Object obj3 = s1Var.f.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                java.lang.Integer num = (java.lang.Integer) s1Var.g.get();
                java.lang.String str4 = s1Var.Y;
                java.lang.String str5 = s1Var.N;
                this.y = 1;
                W = fg3.h0.W((kotlin.coroutines.CoroutineContext) eVar.b, new a32.n(str4, eVar, str3, (java.lang.String) obj3, str, str2, list2, num, str5, (df3.bar) null, 1), this);
                if (W == barVar) {
                    return barVar;
                }
            } else {
                throw new java.lang.IllegalStateException();
            }
        }
        o93.m mVar = (o93.o) W;
        if (mVar instanceof o93.m) {
            yy.f2 f2Var = mVar.a;
            if (f2Var != null) {
                responseCase = f2Var.e();
            } else {
                responseCase = null;
            }
            if (responseCase == null) {
                i = -1;
            } else {
                i = com.truecaller.wizard.verification.y0.b[responseCase.ordinal()];
            }
            if (i != -1) {
                if (i != 1) {
                    if (i != 2) {
                        s1Var.r2(com.truecaller.wizard.verification.s0.q, "VerifyOnboardingOTPGrpc");
                    } else {
                        s1Var.k2(f2Var.c().e().getValue(), java.lang.Integer.valueOf(f2Var.c().d()), "VerifyOnboardingOTPGrpc");
                    }
                } else {
                    yy.e1 d = f2Var.d();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "getOnboarded(...)");
                    fg3.h0.J(s1Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.data.country.f(s1Var, d, barVar2, 19), 3);
                }
            } else {
                s1Var.r2(com.truecaller.wizard.verification.s0.p, "VerifyOnboardingOTPGrpc");
            }
        } else if (mVar instanceof o93.n) {
            com.truecaller.wizard.verification.s1.c2(s1Var, ((o93.n) mVar).a, "VerifyOnboardingOTP");
        } else {
            throw new java.lang.RuntimeException();
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object g(java.lang.Object obj) {
        java.util.Iterator it;
        cs1.u uVar = (cs1.u) this.z;
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                it = (java.util.Iterator) this.A;
                od.p.E(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            fg3.e0 e0Var = (fg3.e0) this.A;
            df3.bar barVar2 = null;
            it = kotlin.collections.y.j(new fg3.k0[]{fg3.h0.g(e0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new cs1.o(uVar, barVar2, 0), 3), fg3.h0.g(e0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new cs1.o(uVar, barVar2, i2), 3)}).iterator();
        }
        while (it.hasNext()) {
            fg3.k0 k0Var = (fg3.k0) it.next();
            this.A = it;
            this.y = 1;
            if (k0Var.await(this) == barVar) {
                return barVar;
            }
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object j(java.lang.Object obj) {
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
                return obj;
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.p.E(obj);
        cu0.y yVar = (cu0.y) this.A;
        cu0.n0 n0Var = yVar.B;
        com.truecaller.callerid.CallerIdPerformanceTracker.TraceType traceType = com.truecaller.callerid.CallerIdPerformanceTracker.TraceType.CIDMGR_GETCONTACTFROMAGGRCONTDAO;
        cu0.o oVar = new cu0.o(yVar, (com.truecaller.data.entity.Number) this.z, (df3.bar) null, 0);
        this.y = 1;
        java.lang.Object a = n0Var.a(traceType, oVar, this);
        if (a == barVar) {
            return barVar;
        }
        return a;
    }

    private final java.lang.Object k(java.lang.Object obj) {
        java.lang.Object obj2;
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            cu0.c cVar = (cu0.c) this.A;
            cu0.y yVar = (cu0.y) this.z;
            this.y = 1;
            if (!cVar.l) {
                obj2 = lk3.bar.q(yVar.t.d(), new b63.qux(2, 23, (df3.bar) null), this);
                if (obj2 != barVar) {
                    obj2 = kotlin.Unit.a;
                }
                if (obj2 != barVar) {
                    obj2 = kotlin.Unit.a;
                }
            } else {
                obj2 = kotlin.Unit.a;
            }
            if (obj2 == barVar) {
                return barVar;
            }
        }
        return kotlin.Unit.a;
    }

    private final java.lang.Object l(java.lang.Object obj) {
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
                return obj;
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.p.E(obj);
        cu0.j0 j0Var = (cu0.j0) this.A;
        cu0.n0 n0Var = j0Var.B;
        com.truecaller.callerid.CallerIdPerformanceTracker.TraceType traceType = com.truecaller.callerid.CallerIdPerformanceTracker.TraceType.CIDMGR_GETCONTACTFROMAGGRCONTDAO;
        cu0.c0 c0Var = new cu0.c0(j0Var, (com.truecaller.data.entity.Number) this.z, (df3.bar) null, 0);
        this.y = 1;
        java.lang.Object a = n0Var.a(traceType, c0Var, this);
        if (a == barVar) {
            return barVar;
        }
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c5, code lost:
    
        if (cu0.j0.d(r1, r2, r3, r4, r5, r6, r15, r14) != r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        if (cu0.j0.b(r2, r1, r14) == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        if (cu0.j0.a(r2, r1, r15, r4, r14) == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ac, code lost:
    
        if (r15 == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00db, code lost:
    
        if (r15.a(r1, r3, r14) == r10) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object m(java.lang.Object obj) {
        com.truecaller.blocking.FilterMatch filterMatch;
        boolean z;
        cu0.f fVar = (cu0.f) this.A;
        java.lang.String str = fVar.d;
        java.lang.String str2 = fVar.b;
        cu0.j0 j0Var = (cu0.j0) this.z;
        ef3.bar barVar = ef3.bar.a;
        int i = this.y;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4 && i != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.p.E(obj);
                return kotlin.Unit.a;
            }
            od.p.E(obj);
            filterMatch = (com.truecaller.blocking.FilterMatch) obj;
            cu0.j0 j0Var2 = (cu0.j0) this.z;
            java.lang.String str3 = fVar.b;
            int i2 = fVar.c;
            int i3 = fVar.e;
            long j = fVar.f;
            this.y = 2;
        } else {
            od.p.E(obj);
            filterMatch = fVar.g;
            m03.s sVar = j0Var.f;
            qc3.bar barVar2 = j0Var.X;
            if (sVar.b() && !j0Var.j.b(str2)) {
                z = true;
            } else {
                z = false;
            }
            if (!j0Var.U.h()) {
                if (z && j0Var.y.g(new java.lang.String[]{"android.permission.READ_PHONE_STATE"})) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                j0Var.m();
            } else {
                int i4 = fVar.a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                ((cu0.n1) barVar2.get()).a = false;
                                this.y = 5;
                            }
                        } else {
                            ((cu0.n1) barVar2.get()).a = true;
                            int i5 = fVar.c;
                            this.y = 4;
                        }
                    } else {
                        if (filterMatch == null) {
                            ij0.e eVar = j0Var.r;
                            this.y = 1;
                            obj = eVar.b(this);
                        }
                        cu0.j0 j0Var22 = (cu0.j0) this.z;
                        java.lang.String str32 = fVar.b;
                        int i22 = fVar.c;
                        int i33 = fVar.e;
                        long j2 = fVar.f;
                        this.y = 2;
                    }
                } else {
                    cu0.n0 n0Var = j0Var.B;
                    com.truecaller.callerid.CallerIdPerformanceTracker.TraceType traceType = com.truecaller.callerid.CallerIdPerformanceTracker.TraceType.CIDMGR_ONOUTGOINGCALL;
                    a10.k kVar = new a10.k(j0Var, fVar, (df3.bar) null, 15);
                    this.y = 3;
                }
                return barVar;
            }
            return kotlin.Unit.a;
        }
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.data.country.f((com.truecaller.data.country.qux) this.A, (com.truecaller.data.country.g) this.z, barVar, 0);
            case 1:
                com.truecaller.data.country.f fVar = new com.truecaller.data.country.f((com.truecaller.data.country.g) this.z, barVar, 1);
                fVar.A = obj;
                return fVar;
            case 2:
                return new com.truecaller.data.country.f((com.truecaller.editprofile.impl.ui.legacy.s) this.z, barVar, 2);
            case 3:
                return new com.truecaller.data.country.f((com.truecaller.editprofile.impl.ui.legacy.s) this.A, (java.lang.String) this.z, barVar, 3);
            case 4:
                return new com.truecaller.data.country.f((com.truecaller.favourite_contacts.add_favourite_contact.d) this.z, barVar, 4);
            case 5:
                return new com.truecaller.data.country.f((com.truecaller.favourite_contacts.add_favourite_contact.d) this.A, (java.lang.String) this.z, barVar, 5);
            case 6:
                return new com.truecaller.data.country.f((com.truecaller.messaging.notifications.g0) this.A, (com.truecaller.messaging.data.types.Conversation) this.z, barVar, 6);
            case 7:
                return new com.truecaller.data.country.f((com.truecaller.namesuggestion.impl.ui.c) this.A, (com.truecaller.data.entity.Contact) this.z, barVar, 7);
            case 8:
                return new com.truecaller.data.country.f((com.truecaller.profile.impl.remote.g) this.z, barVar, 8);
            case 9:
                return new com.truecaller.data.country.f((com.truecaller.profile.impl.remote.p) this.A, (com.truecaller.profile.impl.remote.model.CreateProfileRequestDto) this.z, barVar, 9);
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                return new com.truecaller.data.country.f((com.truecaller.profile.impl.remote.p) this.A, (pg2.l) this.z, barVar, 10);
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                return new com.truecaller.data.country.f((com.truecaller.profile.impl.remote.p) this.A, (pg2.p0) this.z, barVar, 11);
            case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                return new com.truecaller.data.country.f((com.truecaller.profile.impl.remote.p) this.A, (java.lang.String) this.z, barVar, 12);
            case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                return new com.truecaller.data.country.f((com.truecaller.remoteconfig.experiment.c) this.A, (com.truecaller.remoteconfig.experiment.a0) this.z, barVar, 13);
            case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                return new com.truecaller.data.country.f((com.truecaller.search.global.h0) this.A, (com.truecaller.messaging.data.types.Message) this.z, barVar, 14);
            case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                return new com.truecaller.data.country.f((com.truecaller.telecom_operator_data.qa.TelecomOperatorContactEntryActivity) this.A, (android.widget.Spinner) this.z, barVar, 15);
            case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                return new com.truecaller.data.country.f((com.truecaller.ui.n1) this.z, barVar, 16);
            case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                return new com.truecaller.data.country.f((com.truecaller.ui.n1) this.A, (android.view.View) this.z, barVar, 17);
            case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                return new com.truecaller.data.country.f((com.truecaller.ui.t2) this.A, (java.lang.ref.WeakReference) this.z, barVar, 18);
            case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                return new com.truecaller.data.country.f((com.truecaller.wizard.verification.s1) this.A, (yy.e1) this.z, barVar, 19);
            case 20:
                return new com.truecaller.data.country.f((ay.c) this.A, (com.truecaller.wizard.verification.s1) this.z, barVar, 20);
            case 21:
                return new com.truecaller.data.country.f((com.truecaller.wizard.verification.s1) this.A, (java.lang.String) this.z, barVar, 21);
            case 22:
                com.truecaller.data.country.f fVar2 = new com.truecaller.data.country.f((com.truecaller.wizard.verification.s1) this.z, barVar, 22);
                fVar2.A = obj;
                return fVar2;
            case 23:
                com.truecaller.data.country.f fVar3 = new com.truecaller.data.country.f((cs1.u) this.z, barVar, 23);
                fVar3.A = obj;
                return fVar3;
            case 24:
                return new com.truecaller.data.country.f((rb.e0) this.A, (ct0.l) this.z, barVar, 24);
            case 25:
                return new com.truecaller.data.country.f((cu0.y) this.A, (com.truecaller.data.entity.Number) this.z, barVar, 25);
            case 26:
                return new com.truecaller.data.country.f((cu0.c) this.A, (cu0.y) this.z, barVar, 26);
            case 27:
                return new com.truecaller.data.country.f((cu0.j0) this.A, (com.truecaller.data.entity.Number) this.z, barVar, 27);
            case 28:
                return new com.truecaller.data.country.f((cu0.f) this.A, (cu0.j0) this.z, barVar, 28);
            default:
                return new com.truecaller.data.country.f((cu0.c) this.A, (cu0.j0) this.z, barVar, 29);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.x) {
            case 0:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 2:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 3:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 4:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 5:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 6:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 7:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 8:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 9:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 20:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 21:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 22:
                return create((java.lang.String) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 23:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 24:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 25:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 26:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 27:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            case 28:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
            default:
                return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:512:0x0800, code lost:
    
        if (kotlin.text.y.p(r6, r9, true) == false) goto L515;
     */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0769  */
    /* JADX WARN: Type inference failed for: r2v70, types: [gd3.k1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v71, types: [gd3.k1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [gd3.k1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.truecaller.data.country.CountryListDto countryListDto;
        java.util.List<com.truecaller.data.country.CountryListDto.bar> list;
        boolean z;
        com.truecaller.data.country.CountryListDto.bar barVar;
        java.util.List<com.truecaller.data.country.CountryListDto.bar> list2;
        java.lang.Object obj2;
        java.lang.String str;
        java.lang.String str2;
        com.truecaller.data.country.CountryListDto.baz bazVar;
        java.util.List<com.truecaller.data.country.CountryListDto.bar> list3;
        com.truecaller.data.country.CountryListDto.baz bazVar2;
        com.truecaller.data.country.CountryListDto.baz bazVar3;
        com.truecaller.data.country.CountryListDto.baz bazVar4;
        com.truecaller.data.country.CountryListDto.bar barVar2;
        com.truecaller.data.country.CountryListDto.baz bazVar5;
        com.truecaller.data.country.CountryListDto.baz bazVar6;
        com.truecaller.data.country.CountryListDto.baz bazVar7;
        java.util.List<com.truecaller.data.country.CountryListDto.bar> list4;
        com.truecaller.data.country.CountryListDto.baz bazVar8;
        com.truecaller.data.country.CountryListDto.baz bazVar9;
        java.lang.String str3;
        wj3.k0 H;
        java.lang.Object f;
        com.truecaller.editprofile.impl.ui.legacy.i iVar;
        com.truecaller.editprofile.impl.ui.legacy.h hVar;
        java.lang.Object h;
        java.lang.Object W;
        java.util.ArrayList arrayList;
        java.lang.Object W2;
        java.lang.Object W3;
        wj3.k0 H2;
        wj3.k0 k0Var;
        java.lang.Object k;
        java.lang.Object k2;
        java.lang.Object k3;
        java.lang.Object obj3;
        java.lang.String str4;
        java.lang.Object o;
        ig3.v1 v1Var;
        java.lang.Object a;
        java.lang.Object d;
        java.lang.Object obj4;
        int i = this.x;
        boolean z2 = false;
        df3.bar barVar3 = null;
        java.lang.Object obj5 = this.z;
        switch (i) {
            case 0:
                com.truecaller.data.country.g gVar = (com.truecaller.data.country.g) obj5;
                kotlin.coroutines.CoroutineContext coroutineContext = gVar.a;
                com.truecaller.data.country.a aVar = gVar.d;
                com.truecaller.data.country.qux quxVar = (com.truecaller.data.country.qux) this.A;
                ef3.bar barVar4 = ef3.bar.a;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    java.lang.Object W4 = fg3.h0.W(coroutineContext, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux(quxVar, aVar, (df3.bar) null, 11), this);
                    if (W4 != barVar4) {
                        W4 = kotlin.Unit.a;
                    }
                    if (W4 == barVar4) {
                        return barVar4;
                    }
                }
                this.y = 2;
                java.lang.Object W5 = fg3.h0.W(coroutineContext, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c(aVar, (df3.bar) null, 4), this);
                if (W5 != barVar4) {
                    W5 = kotlin.Unit.a;
                }
                if (W5 == barVar4) {
                    return barVar4;
                }
                return kotlin.Unit.a;
            case 1:
                com.truecaller.data.country.g gVar2 = (com.truecaller.data.country.g) obj5;
                ef3.bar barVar5 = ef3.bar.a;
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    try {
                        com.truecaller.data.country.c cVar = gVar2.e;
                        com.truecaller.data.country.CountryListDto countryListDto2 = gVar2.c().a;
                        if (countryListDto2 != null) {
                            str3 = countryListDto2.countryListChecksum;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        H = com.truecaller.data.country.c.a(str3).H();
                    } catch (java.lang.Exception unused) {
                    }
                    if (H.a.k()) {
                        countryListDto = (com.truecaller.data.country.CountryListDto) H.b;
                        if (countryListDto != null) {
                            return java.lang.Boolean.FALSE;
                        }
                        com.truecaller.data.country.qux quxVar2 = new com.truecaller.data.country.qux(countryListDto);
                        gVar2.d(quxVar2);
                        gVar2.e(quxVar2);
                        com.truecaller.data.country.qux c = gVar2.c();
                        com.truecaller.data.country.a aVar2 = gVar2.d;
                        this.A = null;
                        this.y = 1;
                        c.getClass();
                        com.truecaller.data.country.CountryListDto countryListDto3 = quxVar2.a;
                        if (countryListDto3 != null && (bazVar9 = countryListDto3.countryList) != null) {
                            list = bazVar9.b;
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            if (countryListDto3 != null && (bazVar7 = countryListDto3.countryList) != null) {
                                com.truecaller.data.country.CountryListDto countryListDto4 = c.a;
                                if (countryListDto4 == null || (bazVar8 = countryListDto4.countryList) == null || (list4 = bazVar8.b) == null) {
                                    list4 = kotlin.collections.h0.a;
                                }
                                bazVar7.b = list4;
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        if (countryListDto3 != null && (bazVar6 = countryListDto3.countryList) != null) {
                            barVar = bazVar6.a;
                        } else {
                            barVar = null;
                        }
                        if (barVar == null) {
                            if (countryListDto3 != null && (bazVar4 = countryListDto3.countryList) != null) {
                                com.truecaller.data.country.CountryListDto countryListDto5 = c.a;
                                if (countryListDto5 != null && (bazVar5 = countryListDto5.countryList) != null) {
                                    barVar2 = bazVar5.a;
                                } else {
                                    barVar2 = null;
                                }
                                bazVar4.a = barVar2;
                            }
                            z = true;
                        }
                        if (countryListDto3 != null && (bazVar3 = countryListDto3.suggestedCountryList) != null) {
                            list2 = bazVar3.b;
                        } else {
                            list2 = null;
                        }
                        if (list2 == null) {
                            if (countryListDto3 != null && (bazVar = countryListDto3.suggestedCountryList) != null) {
                                com.truecaller.data.country.CountryListDto countryListDto6 = c.a;
                                if (countryListDto6 == null || (bazVar2 = countryListDto6.suggestedCountryList) == null || (list3 = bazVar2.b) == null) {
                                    list3 = kotlin.collections.h0.a;
                                }
                                bazVar.b = list3;
                            }
                            z = true;
                        }
                        if (!z) {
                            if (countryListDto3 != null) {
                                str = countryListDto3.countryListChecksum;
                            } else {
                                str = null;
                            }
                            com.truecaller.data.country.CountryListDto countryListDto7 = c.a;
                            if (countryListDto7 != null) {
                                str2 = countryListDto7.countryListChecksum;
                            } else {
                                str2 = null;
                            }
                            break;
                        }
                        z2 = true;
                        c.a = quxVar2.a;
                        c.b = quxVar2.b;
                        c.c = quxVar2.c;
                        c.d = quxVar2.d;
                        if (z2) {
                            obj2 = fg3.h0.W(fg3.r0.b, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux(c, aVar2, (df3.bar) null, 11), this);
                            ef3.bar barVar6 = ef3.bar.a;
                            if (obj2 != barVar6) {
                                obj2 = kotlin.Unit.a;
                            }
                            if (obj2 != barVar6) {
                                obj2 = kotlin.Unit.a;
                            }
                        } else {
                            obj2 = kotlin.Unit.a;
                        }
                        if (obj2 == barVar5) {
                            return barVar5;
                        }
                    }
                    countryListDto = null;
                    if (countryListDto != null) {
                    }
                }
                return java.lang.Boolean.TRUE;
            case 2:
                com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) obj5;
                ef3.bar barVar7 = ef3.bar.a;
                int i4 = this.y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        iVar = (com.truecaller.editprofile.impl.ui.legacy.i) this.A;
                        od.p.E(obj);
                        f = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.editprofile.impl.ui.legacy.i iVar2 = sVar.u;
                    if (iVar2 != null) {
                        rg2.m mVar = sVar.e;
                        this.A = iVar2;
                        this.y = 1;
                        f = mVar.f(this);
                        if (f != barVar7) {
                            iVar = iVar2;
                        } else {
                            return barVar7;
                        }
                    } else {
                        throw new java.lang.IllegalStateException("No profile!");
                    }
                }
                java.lang.String verifiedName = ((pg2.m) f).getVerifiedName();
                com.truecaller.editprofile.impl.ui.legacy.s.e2(sVar, verifiedName);
                if (verifiedName != null && (hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a) != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifiedName, "verifiedName");
                    ((android.widget.EditText) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar).C.getValue()).setText(verifiedName);
                }
                com.truecaller.editprofile.impl.ui.legacy.h hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar2 != null) {
                    java.lang.String str5 = iVar.a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "firstName");
                    ((com.truecaller.editprofile.impl.ui.legacy.d) hVar2).b6().setText(str5);
                }
                com.truecaller.editprofile.impl.ui.legacy.h hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar3 != null) {
                    java.lang.String str6 = iVar.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "lastName");
                    ((com.truecaller.editprofile.impl.ui.legacy.d) hVar3).c6().setText(str6);
                }
                return kotlin.Unit.a;
            case 3:
                com.truecaller.editprofile.impl.ui.legacy.s sVar2 = (com.truecaller.editprofile.impl.ui.legacy.s) this.A;
                ef3.bar barVar8 = ef3.bar.a;
                int i5 = this.y;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    h = obj;
                } else {
                    od.p.E(obj);
                    rg2.m mVar2 = sVar2.e;
                    this.y = 1;
                    h = mVar2.h(this);
                    if (h == barVar8) {
                        return barVar8;
                    }
                }
                if (((java.lang.Boolean) h).booleanValue()) {
                    kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.editprofile.impl.ui.legacy.s.D;
                    com.truecaller.editprofile.impl.ui.legacy.h hVar4 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar2).a;
                    if (hVar4 != null) {
                        java.lang.String h2 = sVar2.g.h(2132020787, new java.lang.Object[0]);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "getString(...)");
                        ((com.truecaller.editprofile.impl.ui.legacy.d) hVar4).s6(h2);
                    }
                    return kotlin.Unit.a;
                }
                pg2.g0 g0Var = new pg2.g0((java.lang.String) obj5, com.truecaller.profile.api.model.ImageSource.GOOGLE, sVar2.y, false);
                this.y = 2;
                if (com.truecaller.editprofile.impl.ui.legacy.s.f2(sVar2, g0Var, this) == barVar8) {
                    return barVar8;
                }
                return kotlin.Unit.a;
            case 4:
                com.truecaller.favourite_contacts.add_favourite_contact.d dVar = (com.truecaller.favourite_contacts.add_favourite_contact.d) obj5;
                java.util.ArrayList arrayList2 = dVar.h;
                ef3.bar barVar9 = ef3.bar.a;
                int i6 = this.y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        arrayList = (java.util.ArrayList) this.A;
                        od.p.E(obj);
                        W = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    arrayList2.clear();
                    to1.e eVar = dVar.c;
                    this.A = arrayList2;
                    this.y = 1;
                    W = fg3.h0.W((kotlin.coroutines.CoroutineContext) eVar.b, new com.truecaller.call_assistant.presentation.disable.c(eVar, (df3.bar) null, 2), this);
                    if (W != barVar9) {
                        arrayList = arrayList2;
                    } else {
                        return barVar9;
                    }
                }
                arrayList.addAll((java.util.Collection) W);
                dVar.o(arrayList2);
                return kotlin.Unit.a;
            case 5:
                java.lang.String str7 = (java.lang.String) obj5;
                com.truecaller.favourite_contacts.add_favourite_contact.d dVar2 = (com.truecaller.favourite_contacts.add_favourite_contact.d) this.A;
                ig3.h2 h2Var = dVar2.f;
                ef3.bar barVar10 = ef3.bar.a;
                int i7 = this.y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        od.p.E(obj);
                        W2 = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    kotlin.coroutines.CoroutineContext coroutineContext2 = dVar2.b;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux quxVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux(dVar2, str7, (df3.bar) null, 14);
                    this.y = 1;
                    W2 = fg3.h0.W(coroutineContext2, quxVar3, this);
                    if (W2 == barVar10) {
                        return barVar10;
                    }
                }
                java.util.List list5 = (java.util.List) W2;
                if (list5.isEmpty()) {
                    h2Var.getClass();
                    h2Var.p((java.lang.Object) null, com.truecaller.favourite_contacts.add_favourite_contact.i.a);
                } else {
                    com.truecaller.favourite_contacts.add_favourite_contact.j jVar = new com.truecaller.favourite_contacts.add_favourite_contact.j(list5, str7);
                    h2Var.getClass();
                    h2Var.p((java.lang.Object) null, jVar);
                }
                return kotlin.Unit.a;
            case 6:
                kotlin.Unit unit = ef3.bar.a;
                int i8 = this.y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (((n12.j) ((com.truecaller.messaging.notifications.g0) this.A).o.get()).a((com.truecaller.messaging.data.types.Conversation) obj5, null) == unit) {
                        return unit;
                    }
                }
                return kotlin.Unit.a;
            case 7:
                com.truecaller.namesuggestion.impl.ui.c cVar2 = (com.truecaller.namesuggestion.impl.ui.c) this.A;
                ef3.bar barVar11 = ef3.bar.a;
                int i9 = this.y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        od.p.E(obj);
                        W3 = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    kotlin.coroutines.CoroutineContext coroutineContext3 = cVar2.j;
                    if (coroutineContext3 != null) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux quxVar4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux(cVar2, (com.truecaller.data.entity.Contact) obj5, (df3.bar) null, 15);
                        this.y = 1;
                        W3 = fg3.h0.W(coroutineContext3, quxVar4, this);
                        if (W3 == barVar11) {
                            return barVar11;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("ioContext");
                        throw null;
                    }
                }
                java.lang.String str8 = (java.lang.String) W3;
                cVar2.p = str8;
                g52.bar V4 = cVar2.V4();
                android.text.Editable text = V4.c.getText();
                if (text != null && text.length() > 0) {
                    V4.c.append(str8);
                }
                return kotlin.Unit.a;
            case 8:
                ef3.bar barVar12 = ef3.bar.a;
                int i10 = this.y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        k0Var = (wj3.k0) this.A;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    H2 = ((com.truecaller.profile.impl.remote.baz) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.IMAGES, com.truecaller.profile.impl.remote.baz.class)).b().H();
                    if (H2.a.k()) {
                        xg2.a aVar3 = (qg2.bar) ((com.truecaller.profile.impl.remote.g) obj5).c.get();
                        this.A = H2;
                        this.y = 1;
                        xg2.a aVar4 = aVar3;
                        java.lang.Object W6 = fg3.h0.W(aVar4.b, new xg2.baz(aVar4, (df3.bar) null, 1), this);
                        if (W6 != barVar12) {
                            W6 = kotlin.Unit.a;
                        }
                        if (W6 != barVar12) {
                            k0Var = H2;
                        } else {
                            return barVar12;
                        }
                    }
                    z2 = H2.a.k();
                    return java.lang.Boolean.valueOf(z2);
                }
                H2 = k0Var;
                z2 = H2.a.k();
                return java.lang.Boolean.valueOf(z2);
            case 9:
                ef3.bar barVar13 = ef3.bar.a;
                int i11 = this.y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        od.p.E(obj);
                        return obj;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.p.E(obj);
                this.y = 1;
                java.lang.Object a2 = ((com.truecaller.profile.impl.remote.p) this.A).c.a((com.truecaller.profile.impl.remote.model.CreateProfileRequestDto) obj5, this);
                if (a2 != barVar13) {
                    return a2;
                }
                return barVar13;
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                pg2.l lVar = (pg2.l) obj5;
                ef3.bar barVar14 = ef3.bar.a;
                int i13 = this.y;
                try {
                } catch (java.util.concurrent.CancellationException e) {
                    throw e;
                } catch (java.lang.Exception unused2) {
                }
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            od.p.E(obj);
                            z2 = true;
                            return java.lang.Boolean.valueOf(z2);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    k = obj;
                } else {
                    od.p.E(obj);
                    com.truecaller.profile.impl.remote.t tVar = ((com.truecaller.profile.impl.remote.p) this.A).b;
                    this.y = 1;
                    k = wi0.bar.k(tVar, this);
                    if (k == barVar14) {
                        return barVar14;
                    }
                }
                if (k != null) {
                    we0.h hVar5 = (we0.h) k;
                    xe0.w0 g = xe0.x0.g();
                    g.c(lVar.a);
                    g.b(lVar.b);
                    g.a(lVar.d);
                    java.lang.String str9 = lVar.c;
                    if (str9 != null) {
                        g.e(str9);
                    }
                    xe0.x0 build = g.build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                    this.y = 2;
                    if (hVar5.N(build, (gd3.k1) new java.lang.Object(), this) == barVar14) {
                        return barVar14;
                    }
                    z2 = true;
                    return java.lang.Boolean.valueOf(z2);
                }
                throw new java.lang.IllegalArgumentException("Required value was null.");
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                pg2.p0 p0Var = (pg2.p0) obj5;
                ef3.bar barVar15 = ef3.bar.a;
                int i14 = this.y;
                try {
                } catch (java.util.concurrent.CancellationException e2) {
                    throw e2;
                } catch (java.lang.Exception unused3) {
                }
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            od.p.E(obj);
                            z2 = true;
                            return java.lang.Boolean.valueOf(z2);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    k2 = obj;
                } else {
                    od.p.E(obj);
                    com.truecaller.profile.impl.remote.t tVar2 = ((com.truecaller.profile.impl.remote.p) this.A).b;
                    this.y = 1;
                    k2 = wi0.bar.k(tVar2, this);
                    if (k2 == barVar15) {
                        return barVar15;
                    }
                }
                if (k2 != null) {
                    we0.h hVar6 = (we0.h) k2;
                    xe0.m1 f2 = xe0.n1.f();
                    java.lang.String str10 = p0Var.a;
                    if (str10 != null) {
                        f2.b(str10);
                    }
                    java.lang.String str11 = p0Var.b;
                    if (str11 != null) {
                        f2.c(str11);
                    }
                    java.lang.String str12 = p0Var.c;
                    if (str12 != null) {
                        f2.a(str12);
                    }
                    xe0.n1 build2 = f2.build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
                    this.y = 2;
                    if (hVar6.P(build2, (gd3.k1) new java.lang.Object(), this) == barVar15) {
                        return barVar15;
                    }
                    z2 = true;
                    return java.lang.Boolean.valueOf(z2);
                }
                throw new java.lang.IllegalArgumentException("Required value was null.");
            case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                ef3.bar barVar16 = ef3.bar.a;
                int i15 = this.y;
                try {
                } catch (java.util.concurrent.CancellationException e3) {
                    throw e3;
                } catch (java.lang.Exception unused4) {
                }
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            od.p.E(obj);
                            z2 = true;
                            return java.lang.Boolean.valueOf(z2);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    k3 = obj;
                } else {
                    od.p.E(obj);
                    com.truecaller.profile.impl.remote.t tVar3 = ((com.truecaller.profile.impl.remote.p) this.A).b;
                    this.y = 1;
                    k3 = wi0.bar.k(tVar3, this);
                    if (k3 == barVar16) {
                        return barVar16;
                    }
                }
                if (k3 != null) {
                    xe0.s1 d2 = xe0.t1.d();
                    d2.a((java.lang.String) obj5);
                    xe0.t1 build3 = d2.build();
                    kotlin.jvm.internal.Intrinsics.d(build3);
                    this.y = 2;
                    if (((we0.h) k3).Q(build3, (gd3.k1) new java.lang.Object(), this) == barVar16) {
                        return barVar16;
                    }
                    z2 = true;
                    return java.lang.Boolean.valueOf(z2);
                }
                throw new java.lang.IllegalArgumentException("Required value was null.");
            case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                ef3.bar barVar17 = ef3.bar.a;
                int i16 = this.y;
                if (i16 != 0) {
                    if (i16 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.remoteconfig.experiment.c cVar3 = (com.truecaller.remoteconfig.experiment.c) this.A;
                    com.truecaller.remoteconfig.experiment.a0 a0Var = (com.truecaller.remoteconfig.experiment.a0) obj5;
                    this.y = 1;
                    java.lang.String str13 = a0Var.d;
                    if (str13 != null && str13.length() != 0 && (str4 = a0Var.c) != null && str4.length() != 0) {
                        obj3 = com.truecaller.remoteconfig.experiment.e.a((t7.e) cVar3.e.getValue(), new a61.bar(a0Var, cVar3, (df3.bar) null, 14), this);
                        if (obj3 != barVar17) {
                            obj3 = kotlin.Unit.a;
                        }
                    } else {
                        obj3 = kotlin.Unit.a;
                    }
                    if (obj3 == barVar17) {
                        return barVar17;
                    }
                }
                return kotlin.Unit.a;
            case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                ef3.bar barVar18 = ef3.bar.a;
                int i17 = this.y;
                if (i17 != 0) {
                    if (i17 == 1) {
                        od.p.E(obj);
                        return obj;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.p.E(obj);
                this.y = 1;
                java.lang.Object H3 = ((com.truecaller.search.global.h0) this.A).H.H((com.truecaller.messaging.data.types.Message) obj5, this);
                if (H3 != barVar18) {
                    return H3;
                }
                return barVar18;
            case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                com.truecaller.telecom_operator_data.qa.TelecomOperatorContactEntryActivity telecomOperatorContactEntryActivity = (com.truecaller.telecom_operator_data.qa.TelecomOperatorContactEntryActivity) this.A;
                ef3.bar barVar19 = ef3.bar.a;
                int i18 = this.y;
                if (i18 != 0) {
                    if (i18 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ax2.qux quxVar5 = telecomOperatorContactEntryActivity.d0;
                    if (quxVar5 != null) {
                        java.lang.String obj6 = ((android.widget.EditText) telecomOperatorContactEntryActivity.findViewById(2131365413)).getText().toString();
                        java.lang.String obj7 = ((android.widget.EditText) telecomOperatorContactEntryActivity.findViewById(2131365537)).getText().toString();
                        java.lang.Object selectedItem = ((android.widget.Spinner) obj5).getSelectedItem();
                        kotlin.jvm.internal.Intrinsics.e(selectedItem, "null cannot be cast to non-null type kotlin.String");
                        ax2.bar barVar20 = new ax2.bar(obj6, obj7, (java.lang.String) selectedItem);
                        this.y = 1;
                        if (quxVar5.b(barVar20, this) == barVar19) {
                            return barVar19;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("repository");
                        throw null;
                    }
                }
                android.widget.Toast.makeText((android.content.Context) telecomOperatorContactEntryActivity, (java.lang.CharSequence) "Inserted successfully!", 0).show();
                return kotlin.Unit.a;
            case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                ef3.bar barVar21 = ef3.bar.a;
                int i19 = this.y;
                if (i19 != 0) {
                    if (i19 == 1) {
                        v1Var = (ig3.v1) this.A;
                        od.p.E(obj);
                        o = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.ui.n1 n1Var = (com.truecaller.ui.n1) obj5;
                    ig3.v1 v1Var2 = n1Var.m;
                    com.truecaller.stats.StatsPeriod statsPeriod = com.truecaller.stats.StatsPeriod.ALL_TIME;
                    com.truecaller.ui.StatsType statsType = com.truecaller.ui.StatsType.SHARE;
                    this.A = v1Var2;
                    this.y = 1;
                    o = com.truecaller.ui.n1.o(n1Var, statsPeriod, statsType, this);
                    if (o != barVar21) {
                        v1Var = v1Var2;
                    } else {
                        return barVar21;
                    }
                }
                v1Var.e(o);
                return kotlin.Unit.a;
            case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                com.truecaller.ui.n1 n1Var2 = (com.truecaller.ui.n1) this.A;
                ef3.bar barVar22 = ef3.bar.a;
                int i20 = this.y;
                if (i20 != 0) {
                    if (i20 == 1) {
                        od.p.E(obj);
                        a = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    a = n1Var2.e.a((android.view.View) obj5, 720, 720, this);
                    if (a == barVar22) {
                        return barVar22;
                    }
                }
                android.net.Uri uri = (android.net.Uri) a;
                if (uri != null) {
                    n1Var2.r.e(uri);
                }
                return kotlin.Unit.a;
            case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                return c(obj);
            case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                com.truecaller.wizard.verification.s1 s1Var = (com.truecaller.wizard.verification.s1) this.A;
                kotlin.coroutines.CoroutineContext coroutineContext4 = s1Var.d;
                ef3.bar barVar23 = ef3.bar.a;
                int i21 = this.y;
                if (i21 != 0) {
                    if (i21 != 1) {
                        if (i21 != 2 && i21 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.p.E(obj);
                        return kotlin.Unit.a;
                    }
                    od.p.E(obj);
                    d = obj;
                } else {
                    od.p.E(obj);
                    s1Var.J.f();
                    java.lang.Long l = s1Var.R;
                    java.lang.String str14 = s1Var.S;
                    java.lang.String str15 = s1Var.O;
                    this.y = 1;
                    d = s1Var.h.d((yy.e1) obj5, l, str14, str15, this);
                    if (d == barVar23) {
                        return barVar23;
                    }
                }
                com.truecaller.wizard.verification.q0 q0Var = (com.truecaller.wizard.verification.q0) d;
                s1Var.e0 = false;
                if (kotlin.jvm.internal.Intrinsics.b(q0Var, com.truecaller.wizard.verification.n0.a)) {
                    com.truecaller.wizard.verification.c1 c1Var = new com.truecaller.wizard.verification.c1(s1Var, (df3.bar) null, 0);
                    this.y = 2;
                    if (fg3.h0.W(coroutineContext4, c1Var, this) == barVar23) {
                        return barVar23;
                    }
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.b(q0Var, com.truecaller.wizard.verification.o0.a) && !kotlin.jvm.internal.Intrinsics.b(q0Var, com.truecaller.wizard.verification.p0.a)) {
                        throw new java.lang.RuntimeException();
                    }
                    com.truecaller.wizard.verification.s1.d2(s1Var, (java.lang.String) yy.qux.w((yy.e1) obj5).b);
                    com.truecaller.wizard.verification.d1 d1Var = new com.truecaller.wizard.verification.d1(q0Var, s1Var, (df3.bar) null, 0);
                    this.y = 3;
                    if (fg3.h0.W(coroutineContext4, d1Var, this) == barVar23) {
                        return barVar23;
                    }
                }
                return kotlin.Unit.a;
            case 20:
                com.truecaller.wizard.verification.s0 s0Var = com.truecaller.wizard.verification.s0.r;
                com.truecaller.wizard.verification.s1 s1Var2 = (com.truecaller.wizard.verification.s1) obj5;
                ef3.bar barVar24 = ef3.bar.a;
                int i22 = this.y;
                if (i22 != 0) {
                    if (i22 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ay.c cVar4 = (ay.c) this.A;
                    if (kotlin.jvm.internal.Intrinsics.b(cVar4, ay.b.a)) {
                        this.y = 1;
                        if (com.truecaller.wizard.verification.s1.e2(s1Var2, this) == barVar24) {
                            return barVar24;
                        }
                    } else if (kotlin.jvm.internal.Intrinsics.b(cVar4, ay.bar.b)) {
                        s1Var2.r2(com.truecaller.wizard.verification.s0.p, "NumberVerification");
                    } else if (kotlin.jvm.internal.Intrinsics.b(cVar4, ay.bar.c)) {
                        s1Var2.r2(com.truecaller.wizard.verification.s0.i, "NumberVerification");
                    } else if (cVar4 instanceof ay.baz) {
                        s1Var2.r2(s0Var, "NumberVerification");
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.b(cVar4, ay.bar.d) && !(cVar4 instanceof ay.qux)) {
                            throw new java.lang.RuntimeException();
                        }
                        s1Var2.r2(s0Var, "DeviceVerification");
                    }
                }
                return kotlin.Unit.a;
            case 21:
                return f(obj);
            case 22:
                java.lang.String str16 = (java.lang.String) this.A;
                ef3.bar barVar25 = ef3.bar.a;
                int i23 = this.y;
                if (i23 != 0) {
                    if (i23 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.wizard.verification.s1 s1Var3 = (com.truecaller.wizard.verification.s1) obj5;
                    this.A = null;
                    this.y = 1;
                    java.lang.Object W7 = fg3.h0.W(s1Var3.d, new com.truecaller.data.country.f(s1Var3, str16, barVar3, 21), this);
                    if (W7 != barVar25) {
                        W7 = kotlin.Unit.a;
                    }
                    if (W7 == barVar25) {
                        return barVar25;
                    }
                }
                return kotlin.Unit.a;
            case 23:
                return g(obj);
            case 24:
                ef3.bar barVar26 = ef3.bar.a;
                int i24 = this.y;
                if (i24 != 0) {
                    if (i24 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ig3.p1 p1Var = ((rb.e0) this.A).E;
                    a32.e eVar2 = new a32.e((ct0.l) obj5, 24);
                    this.y = 1;
                    if (p1Var.a.collect(eVar2, this) == barVar26) {
                        return barVar26;
                    }
                }
                return kotlin.Unit.a;
            case 25:
                return j(obj);
            case 26:
                return k(obj);
            case 27:
                return l(obj);
            case 28:
                return m(obj);
            default:
                ef3.bar barVar27 = ef3.bar.a;
                int i25 = this.y;
                if (i25 != 0) {
                    if (i25 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    cu0.c cVar5 = (cu0.c) this.A;
                    cu0.j0 j0Var = (cu0.j0) obj5;
                    this.y = 1;
                    if (!cVar5.l) {
                        obj4 = lk3.bar.q(j0Var.t.d(), new b63.qux(2, 23, (df3.bar) null), this);
                        if (obj4 != barVar27) {
                            obj4 = kotlin.Unit.a;
                        }
                        if (obj4 != barVar27) {
                            obj4 = kotlin.Unit.a;
                        }
                    } else {
                        obj4 = kotlin.Unit.a;
                    }
                    if (obj4 == barVar27) {
                        return barVar27;
                    }
                }
                return kotlin.Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(java.lang.Object obj, java.lang.Object obj2, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.A = obj;
        this.z = obj2;
    }
}
