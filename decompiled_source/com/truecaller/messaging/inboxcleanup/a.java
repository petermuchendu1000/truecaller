package com.truecaller.messaging.inboxcleanup;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class a implements m22.k {
    public final qc3.bar a;
    public final xz1.q b;
    public final u03.b c;
    public final qw2.a0 d;
    public final qc3.bar e;
    public final com.truecaller.messaging.inboxcleanup.b f;
    public final xf0.bar g;
    public final nc0.bar h;
    public final android.content.Context i;
    public final oo1.f j;
    public final f43.baz k;
    public final m03.p l;
    public final t41.r0 m;
    public final qo1.k n;
    public final qc3.bar o;

    public a(qc3.bar barVar, xz1.q qVar, u03.b bVar, qw2.a0 a0Var, qc3.bar barVar2, com.truecaller.messaging.inboxcleanup.b bVar2, xf0.bar barVar3, nc0.bar barVar4, android.content.Context context, oo1.f fVar, f43.baz bazVar, m03.p pVar, t41.r0 r0Var, qo1.k kVar, qc3.bar barVar5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "messageActionHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "messageSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "deviceInfoUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "tcPermissionUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "messagesStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar2, "inboxCleanerNotificationHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "backgroundWorkTrigger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "featuresRegistry");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "inboxCleanerDataFetcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "dateHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0Var, "timestampUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "messagingFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar5, "removeOffersHelper");
        this.a = barVar;
        this.b = qVar;
        this.c = bVar;
        this.d = a0Var;
        this.e = barVar2;
        this.f = bVar2;
        this.g = barVar3;
        this.h = barVar4;
        this.i = context;
        this.j = fVar;
        this.k = bazVar;
        this.l = pVar;
        this.m = r0Var;
        this.n = kVar;
        this.o = barVar5;
    }

    public static java.lang.String k(int i) {
        if (i != -1) {
            if (i != 7) {
                if (i != 15) {
                    if (i != 30) {
                        return "none";
                    }
                    return "30 days";
                }
                return "15 days";
            }
            return "7 days";
        }
        return "all";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(ff3.qux quxVar) {
        m22.l lVar;
        int i;
        boolean z;
        xz1.q qVar;
        boolean z2;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String str;
        if (quxVar instanceof m22.l) {
            lVar = (m22.l) quxVar;
            int i2 = lVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = lVar.x;
                java.lang.Object obj2 = ef3.bar.a;
                i = lVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    lVar.z = 1;
                    obj = b(lVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                com.truecaller.messaging.inboxcleanup.CleanupResult cleanupResult = (com.truecaller.messaging.inboxcleanup.CleanupResult) obj;
                z = cleanupResult instanceof com.truecaller.messaging.inboxcleanup.CleanupResult.Success;
                qVar = this.b;
                if (!z) {
                    xz1.r rVar = (xz1.r) qVar;
                    int C = rVar.C("allTimeCleanupStatsOtpCount", 0);
                    com.truecaller.messaging.inboxcleanup.CleanupResult.Success success = (com.truecaller.messaging.inboxcleanup.CleanupResult.Success) cleanupResult;
                    int i3 = success.c;
                    int i4 = success.b;
                    int i5 = success.a;
                    rVar.d0("allTimeCleanupStatsOtpCount", C + i5);
                    rVar.d0("allTimeCleanupStatsPromotionalCount", rVar.C("allTimeCleanupStatsPromotionalCount", 0) + i4);
                    rVar.d0("allTimeCleanupStatsSpamCount", rVar.o0() + i3);
                    org.joda.time.DateTime dateTime = new org.joda.time.DateTime();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dateTime, "now(...)");
                    rVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "value");
                    rVar.e0("autoCleanupLastDate", dateTime.i());
                    rVar.d0("autoCleanupRunCount", rVar.C("autoCleanupRunCount", 0) + 1);
                    f(i5, i4, i3);
                } else {
                    xz1.r rVar2 = (xz1.r) qVar;
                    rVar2.d0("autoCleanupFailureRunCount", rVar2.C("autoCleanupFailureRunCount", 0) + 1);
                    f(0, 0, 0);
                }
                if (!((xz1.r) qVar).z("isAutoCleanupNotifEnabled", true) && (!((z2 = cleanupResult instanceof com.truecaller.messaging.inboxcleanup.CleanupResult.GeneralError)) || ((com.truecaller.messaging.inboxcleanup.CleanupResult.GeneralError) cleanupResult).a)) {
                    com.truecaller.messaging.inboxcleanup.b bVar = this.f;
                    s62.d dVar = bVar.b;
                    android.content.Context context = bVar.a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cleanupResult, "result");
                    if (!z2 || ((com.truecaller.messaging.inboxcleanup.CleanupResult.GeneralError) cleanupResult).a) {
                        if (z) {
                            string = context.getString(2132021728);
                        } else {
                            string = context.getString(2132021726);
                        }
                        kotlin.jvm.internal.Intrinsics.d(string);
                        if (z) {
                            com.truecaller.messaging.inboxcleanup.CleanupResult.Success success2 = (com.truecaller.messaging.inboxcleanup.CleanupResult.Success) cleanupResult;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            int i6 = success2.a;
                            int i7 = success2.c;
                            int i8 = success2.b;
                            if (i6 > 0) {
                                sb.append(context.getResources().getQuantityString(2131886170, i6, java.lang.Integer.valueOf(i6)));
                            }
                            if (i8 > 0) {
                                if (i6 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(context.getResources().getQuantityString(2131886169, i8, java.lang.Integer.valueOf(i8)));
                            }
                            if (i7 > 0) {
                                if (i6 > 0 || i8 > 0) {
                                    qb.qux.w(" ", context.getString(2132021714), " ", sb);
                                }
                                sb.append(context.getResources().getQuantityString(2131886171, i7, java.lang.Integer.valueOf(i7)));
                            }
                            sb.append(" " + context.getString(2132021743));
                            str = sb.toString();
                        } else {
                            if (z2) {
                                string2 = context.getString(2132021724);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            } else if (cleanupResult instanceof com.truecaller.messaging.inboxcleanup.CleanupResult.NoPermissionsError) {
                                string2 = context.getString(2132021725);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            } else {
                                throw new java.lang.RuntimeException();
                            }
                            str = string2;
                        }
                        android.content.Context context2 = bVar.a;
                        int i9 = com.truecaller.messaging.inboxcleanup.InboxCleanupActivity.d0;
                        android.content.Intent k = h0.k.k(context2, cleanupResult, "Notification", 8);
                        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                        s62.f fVar = (s62.f) dVar;
                        android.app.Notification d = com.truecaller.messaging.inboxcleanup.b.a(bVar, string, str, fVar.k(pushNotificationSource.getType(), 0, 201326592, context2, k, "inboxCleanupAutomatic"), 24).d();
                        kotlin.jvm.internal.Intrinsics.d(d);
                        fVar.v(2131364627, d, pushNotificationSource.getType(), "inboxCleanupAutomatic");
                    }
                    return kotlin.Unit.a;
                }
                return kotlin.Unit.a;
            }
        }
        lVar = new m22.l(this, quxVar);
        java.lang.Object obj3 = lVar.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = lVar.z;
        if (i == 0) {
        }
        com.truecaller.messaging.inboxcleanup.CleanupResult cleanupResult2 = (com.truecaller.messaging.inboxcleanup.CleanupResult) obj3;
        z = cleanupResult2 instanceof com.truecaller.messaging.inboxcleanup.CleanupResult.Success;
        qVar = this.b;
        if (!z) {
        }
        if (!((xz1.r) qVar).z("isAutoCleanupNotifEnabled", true)) {
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c2, code lost:
    
        if (r12 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(ff3.qux quxVar) {
        m22.m mVar;
        int i;
        java.util.List arrayList;
        int i2;
        java.util.List list;
        int i3;
        xz1.r rVar;
        int i4;
        int i5;
        java.util.List list2;
        int i6;
        int i7;
        android.util.SparseBooleanArray sparseBooleanArray;
        if (quxVar instanceof m22.m) {
            mVar = (m22.m) quxVar;
            int i8 = mVar.D;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                mVar.D = i8 - Integer.MIN_VALUE;
                java.lang.Object obj = mVar.B;
                java.lang.Object obj2 = ef3.bar.a;
                i = mVar.D;
                xz1.q qVar = this.b;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    i7 = mVar.A;
                                    i3 = mVar.z;
                                    i6 = mVar.y;
                                    java.util.List list3 = mVar.x;
                                    od.p.E(obj);
                                    sparseBooleanArray = (android.util.SparseBooleanArray) obj;
                                    if (sparseBooleanArray != null) {
                                        return new com.truecaller.messaging.inboxcleanup.CleanupResult.GeneralError(true);
                                    }
                                    java.util.Collection l = uf3.p.l(0, sparseBooleanArray.size());
                                    if (!(l instanceof java.util.Collection) || !l.isEmpty()) {
                                        kotlin.collections.m0 it = l.iterator();
                                        while (((uf3.h) it).c) {
                                            if (!sparseBooleanArray.valueAt(it.nextInt())) {
                                                return new com.truecaller.messaging.inboxcleanup.CleanupResult.GeneralError(true);
                                            }
                                        }
                                    }
                                    return new com.truecaller.messaging.inboxcleanup.CleanupResult.Success(i6, i3, i7);
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i3 = mVar.z;
                            i4 = mVar.y;
                            list2 = mVar.x;
                            od.p.E(obj);
                            java.util.List list4 = (java.util.List) obj;
                            i5 = list4.size();
                            list2.addAll(list4);
                            list = list2;
                            if (i4 != 0 && i3 == 0 && i5 == 0) {
                                return new com.truecaller.messaging.inboxcleanup.CleanupResult.GeneralError(false);
                            }
                            bi3.a G = ((y12.v) ((xd0.qux) this.e.get()).a()).G(list, true);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(G, "deleteMessages(...)");
                            mVar.x = null;
                            mVar.y = i4;
                            mVar.z = i3;
                            mVar.A = i5;
                            mVar.D = 4;
                            obj = m03.r.b(G, mVar);
                            if (obj != obj2) {
                                i6 = i4;
                                i7 = i5;
                                sparseBooleanArray = (android.util.SparseBooleanArray) obj;
                                if (sparseBooleanArray != null) {
                                }
                            }
                            return obj2;
                        }
                        int i9 = mVar.y;
                        java.util.List list5 = mVar.x;
                        od.p.E(obj);
                        java.util.List list6 = (java.util.List) obj;
                        int size = list6.size();
                        list5.addAll(list6);
                        list = list5;
                        i2 = i9;
                        i3 = size;
                        rVar = (xz1.r) qVar;
                        if (rVar.q0() == 0) {
                            long i10 = new org.joda.time.DateTime().x(rVar.q0()).i();
                            mVar.x = list;
                            mVar.y = i2;
                            mVar.z = i3;
                            mVar.A = 0;
                            mVar.D = 3;
                            java.lang.Object d = d(i10, mVar);
                            if (d != obj2) {
                                list2 = list;
                                obj = d;
                                i4 = i2;
                                java.util.List list42 = (java.util.List) obj;
                                i5 = list42.size();
                                list2.addAll(list42);
                                list = list2;
                                if (i4 != 0) {
                                }
                                bi3.a G2 = ((y12.v) ((xd0.qux) this.e.get()).a()).G(list, true);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(G2, "deleteMessages(...)");
                                mVar.x = null;
                                mVar.y = i4;
                                mVar.z = i3;
                                mVar.A = i5;
                                mVar.D = 4;
                                obj = m03.r.b(G2, mVar);
                                if (obj != obj2) {
                                }
                            }
                            return obj2;
                        }
                        i4 = i2;
                        i5 = 0;
                        if (i4 != 0) {
                        }
                        bi3.a G22 = ((y12.v) ((xd0.qux) this.e.get()).a()).G(list, true);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(G22, "deleteMessages(...)");
                        mVar.x = null;
                        mVar.y = i4;
                        mVar.z = i3;
                        mVar.A = i5;
                        mVar.D = 4;
                        obj = m03.r.b(G22, mVar);
                        if (obj != obj2) {
                        }
                        return obj2;
                    }
                    arrayList = mVar.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    xz1.r rVar2 = (xz1.r) qVar;
                    if (!rVar2.z0()) {
                        return new com.truecaller.messaging.inboxcleanup.CleanupResult.GeneralError(true);
                    }
                    if (this.c.p() && this.d.n()) {
                        arrayList = new java.util.ArrayList();
                        if (rVar2.p0() != 0) {
                            long i11 = new org.joda.time.DateTime().x(rVar2.p0()).i();
                            mVar.x = arrayList;
                            mVar.y = 0;
                            mVar.D = 1;
                            obj = c(i11, mVar);
                        } else {
                            i2 = 0;
                            ((xz1.h) this.o.get()).getClass();
                            list = arrayList;
                            i3 = 0;
                            rVar = (xz1.r) qVar;
                            if (rVar.q0() == 0) {
                            }
                        }
                    } else {
                        return com.truecaller.messaging.inboxcleanup.CleanupResult.NoPermissionsError.a;
                    }
                }
                java.util.List list7 = (java.util.List) obj;
                i2 = list7.size();
                arrayList.addAll(list7);
                ((xz1.h) this.o.get()).getClass();
                list = arrayList;
                i3 = 0;
                rVar = (xz1.r) qVar;
                if (rVar.q0() == 0) {
                }
            }
        }
        mVar = new m22.m(this, quxVar);
        java.lang.Object obj3 = mVar.B;
        java.lang.Object obj22 = ef3.bar.a;
        i = mVar.D;
        xz1.q qVar2 = this.b;
        if (i == 0) {
        }
        java.util.List list72 = (java.util.List) obj3;
        i2 = list72.size();
        arrayList.addAll(list72);
        ((xz1.h) this.o.get()).getClass();
        list = arrayList;
        i3 = 0;
        rVar = (xz1.r) qVar2;
        if (rVar.q0() == 0) {
        }
    }

    public final java.lang.Object c(long j, ff3.qux quxVar) {
        f43.baz bazVar = this.k;
        return fg3.h0.W((kotlin.coroutines.CoroutineContext) bazVar.b, new b1.n2(bazVar, j, (df3.bar) null, 20), quxVar);
    }

    public final java.lang.Object d(long j, ff3.qux quxVar) {
        f43.baz bazVar = this.k;
        return fg3.h0.W((kotlin.coroutines.CoroutineContext) bazVar.b, new l22.bar(bazVar, j, null, 1), quxVar);
    }

    public final boolean e() {
        java.util.List g0;
        if (this.d.o()) {
            oo1.f fVar = this.j;
            java.lang.String b = ((oo1.g) fVar.t0.n(fVar, oo1.f.i1[74])).b();
            java.lang.Object obj = null;
            if (kotlin.text.StringsKt.X(b)) {
                b = null;
            }
            if (b != null && (g0 = kotlin.text.StringsKt.g0(b, new java.lang.String[]{","}, 0, 6)) != null) {
                this.c.getClass();
                java.lang.String str = android.os.Build.DEVICE;
                if (kotlin.text.StringsKt.X(str)) {
                    str = null;
                }
                if (str != null) {
                    java.util.Iterator it = g0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (str.equalsIgnoreCase((java.lang.String) next)) {
                            obj = next;
                            break;
                        }
                    }
                    if (obj == null) {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final void f(int i, int i2, int i3) {
        xz1.r rVar = (xz1.r) this.b;
        java.lang.String k = k(rVar.p0());
        java.lang.String k2 = k(rVar.C("autoCleanupPromotionalPeriod", 30));
        java.lang.String k3 = k(rVar.q0());
        hi3.e eVar = new hi3.e(qx2.d5.l, qx2.d5.m);
        bi3.j0[] j0VarArr = eVar.b;
        bi3.j0 j0Var = j0VarArr[2];
        ((qx2.c5) eVar).e = "auto";
        boolean[] zArr = eVar.c;
        zArr[2] = true;
        bi3.j0 j0Var2 = j0VarArr[3];
        ((qx2.c5) eVar).f = k;
        zArr[3] = true;
        bi3.j0 j0Var3 = j0VarArr[4];
        ((qx2.c5) eVar).g = k3;
        zArr[4] = true;
        int C = rVar.C("manualCleanupRunCount", 0);
        bi3.j0 j0Var4 = j0VarArr[7];
        ((qx2.c5) eVar).j = C;
        zArr[7] = true;
        int C2 = rVar.C("manualCleanupFailureRunCount", 0);
        bi3.j0 j0Var5 = j0VarArr[6];
        ((qx2.c5) eVar).i = C2;
        zArr[6] = true;
        bi3.j0 j0Var6 = j0VarArr[5];
        ((qx2.c5) eVar).h = k2;
        zArr[5] = true;
        if (rVar.z("isManualCleanupOtpEnabled", true)) {
            bi3.j0 j0Var7 = j0VarArr[8];
            ((qx2.c5) eVar).k = i;
            zArr[8] = true;
        }
        if (rVar.z("isManualCleanupSpamEnabled", true)) {
            bi3.j0 j0Var8 = j0VarArr[9];
            ((qx2.c5) eVar).l = i3;
            zArr[9] = true;
        }
        if (((qo1.l) this.n).g() && rVar.z("isManualCleanupPromotionalEnabled", true)) {
            eVar.f(java.lang.Integer.valueOf(i2));
        }
        this.h.c(eVar.e());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b1, code lost:
    
        if (((java.lang.Boolean) r11).booleanValue() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object g(ff3.qux quxVar) {
        m22.n nVar;
        java.lang.Object obj;
        int i;
        if (quxVar instanceof m22.n) {
            nVar = (m22.n) quxVar;
            int i2 = nVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.z = i2 - Integer.MIN_VALUE;
                obj = nVar.x;
                java.lang.Object obj2 = ef3.bar.a;
                i = nVar.z;
                boolean z = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                od.p.E(obj);
                            } else {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            od.p.E(obj);
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                nVar.z = 3;
                                obj = i(nVar);
                            }
                            z = false;
                            return java.lang.Boolean.valueOf(z);
                        }
                    } else {
                        od.p.E(obj);
                    }
                } else {
                    od.p.E(obj);
                    if (e()) {
                        xz1.r rVar = (xz1.r) this.b;
                        if (!rVar.z0() && new org.joda.time.base.BaseDateTime(new org.joda.time.DateTime(rVar.D("otpBannerLastDismissedDate", 0L))).B(30).n()) {
                            long i3 = new org.joda.time.DateTime().x(30).i();
                            nVar.z = 1;
                            obj = this.k.s(i3, nVar);
                        }
                    }
                    z = false;
                    return java.lang.Boolean.valueOf(z);
                }
                if (((java.lang.Number) obj).intValue() > 99) {
                    nVar.z = 2;
                    obj = h(nVar);
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            }
        }
        nVar = new m22.n(this, quxVar);
        obj = nVar.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = nVar.z;
        boolean z2 = true;
        if (i == 0) {
        }
        if (((java.lang.Number) obj).intValue() > 99) {
        }
        z2 = false;
        return java.lang.Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object h(ff3.qux quxVar) {
        m22.o oVar;
        java.lang.Object obj;
        int i;
        if (quxVar instanceof m22.o) {
            oVar = (m22.o) quxVar;
            int i2 = oVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.z = i2 - Integer.MIN_VALUE;
                obj = oVar.x;
                java.lang.Object obj2 = ef3.bar.a;
                i = oVar.z;
                boolean z = false;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (e()) {
                        xz1.r rVar = (xz1.r) this.b;
                        if (!rVar.z0() && ((qo1.l) this.n).g() && new org.joda.time.base.BaseDateTime(new org.joda.time.DateTime(rVar.D("promotionalTabPromoLastDismissedDate", 0L))).B(30).n()) {
                            new org.joda.time.DateTime().x(30);
                            oVar.z = 1;
                            obj = new java.lang.Integer(0);
                            if (obj == obj2) {
                                return obj2;
                            }
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                }
                if (((java.lang.Number) obj).intValue() > 99) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }
        oVar = new m22.o(this, quxVar);
        obj = oVar.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = oVar.z;
        boolean z2 = false;
        if (i == 0) {
        }
        if (((java.lang.Number) obj).intValue() > 99) {
        }
        return java.lang.Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0098, code lost:
    
        if (((java.lang.Boolean) r10).booleanValue() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object i(ff3.qux quxVar) {
        m22.p pVar;
        java.lang.Object obj;
        int i;
        if (quxVar instanceof m22.p) {
            pVar = (m22.p) quxVar;
            int i2 = pVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.z = i2 - Integer.MIN_VALUE;
                obj = pVar.x;
                java.lang.Object obj2 = ef3.bar.a;
                i = pVar.z;
                boolean z = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                    }
                } else {
                    od.p.E(obj);
                    if (e()) {
                        xz1.r rVar = (xz1.r) this.b;
                        if (!rVar.z0() && new org.joda.time.base.BaseDateTime(new org.joda.time.DateTime(rVar.D("spamTabPromoLastDismissedDate", 0L))).B(30).n()) {
                            long i3 = new org.joda.time.DateTime().x(30).i();
                            pVar.z = 1;
                            obj = this.k.t(i3, pVar);
                        }
                    }
                    z = false;
                    return java.lang.Boolean.valueOf(z);
                }
                if (((java.lang.Number) obj).intValue() > 99) {
                    pVar.z = 2;
                    obj = h(pVar);
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            }
        }
        pVar = new m22.p(this, quxVar);
        obj = pVar.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = pVar.z;
        boolean z2 = true;
        if (i == 0) {
        }
        if (((java.lang.Number) obj).intValue() > 99) {
        }
        z2 = false;
        return java.lang.Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0072, code lost:
    
        if (r1 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object j(ff3.qux quxVar) {
        m22.q qVar;
        ef3.bar barVar;
        int i;
        long i2;
        int intValue;
        int i3;
        java.lang.Object t;
        int i4;
        int i5;
        int intValue2;
        oo1.f fVar;
        kr0.o oVar;
        kotlin.reflect.KProperty[] kPropertyArr;
        boolean z;
        boolean z2;
        boolean z3;
        xz1.r rVar;
        boolean z4;
        int d;
        org.joda.time.DateTime m;
        org.joda.time.DateTime C;
        if (quxVar instanceof m22.q) {
            qVar = (m22.q) quxVar;
            int i6 = qVar.C;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                qVar.C = i6 - Integer.MIN_VALUE;
                java.lang.Object obj = qVar.A;
                barVar = ef3.bar.a;
                i = qVar.C;
                f43.baz bazVar = this.k;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                i5 = qVar.z;
                                i4 = qVar.y;
                                od.p.E(obj);
                                intValue2 = ((java.lang.Number) obj).intValue();
                                fVar = this.j;
                                oVar = fVar.u0;
                                kPropertyArr = oo1.f.i1;
                                if (i4 <= ((oo1.g) oVar.n(fVar, kPropertyArr[75])).d(30)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (i5 <= ((oo1.g) fVar.v0.n(fVar, kPropertyArr[76])).d(50)) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (intValue2 <= ((oo1.g) fVar.w0.n(fVar, kPropertyArr[77])).d(50)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                org.joda.time.DateTime P = new org.joda.time.DateTime().P();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(P, "withTimeAtStartOfDay(...)");
                                rVar = (xz1.r) this.b;
                                boolean z5 = z2;
                                if (new org.joda.time.DateTime(rVar.D("firstDmaNotificationShownDate", 0L)).i() == 0) {
                                    z4 = z;
                                    if (this.m.a(java.util.concurrent.TimeUnit.DAYS, new org.joda.time.DateTime(rVar.D("firstDmaNotificationShownDate", 0L)).i(), 30L) && !rVar.z("lastDmaNotificationClicked", false)) {
                                        d = ((oo1.g) fVar.y0.n(fVar, kPropertyArr[79])).d(30);
                                        boolean a = this.m.a(java.util.concurrent.TimeUnit.DAYS, new org.joda.time.DateTime(rVar.D("lastDmaNotificationShownDate", 0L)).i(), d);
                                        if (!this.c.p() && (z4 || z5 || z3)) {
                                            m03.p pVar = this.l;
                                            m = pVar.m();
                                            C = P.C(22);
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "plusHours(...)");
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "date");
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(C, "compareDate");
                                            if (m.m(C)) {
                                                org.joda.time.DateTime m2 = pVar.m();
                                                org.joda.time.DateTime C2 = P.C(8);
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C2, "plusHours(...)");
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m2, "date");
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(C2, "compareDate");
                                                if (m2.j(C2) && a) {
                                                    int max = java.lang.Math.max(i4, java.lang.Math.max(i5, intValue2));
                                                    com.truecaller.messaging.inboxcleanup.b bVar = this.f;
                                                    android.content.Context context = bVar.a;
                                                    java.lang.String string = context.getString(2132021747, java.lang.Integer.valueOf(max));
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                                    java.lang.String string2 = context.getString(2132021746);
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                                                    s62.d dVar = bVar.b;
                                                    android.content.Context context2 = bVar.a;
                                                    int i7 = com.truecaller.messaging.inboxcleanup.InboxCleanupActivity.d0;
                                                    android.content.Intent k = h0.k.k(context2, (com.truecaller.messaging.inboxcleanup.CleanupResult) null, "Notification", 2);
                                                    com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
                                                    s62.f fVar2 = (s62.f) dVar;
                                                    android.app.Notification d2 = com.truecaller.messaging.inboxcleanup.b.a(bVar, string, string2, fVar2.k(pushNotificationSource.getType(), 0, 201326592, context2, k, "inboxCleanupDMA"), 8).d();
                                                    kotlin.jvm.internal.Intrinsics.d(d2);
                                                    fVar2.v(2131364628, d2, pushNotificationSource.getType(), "inboxCleanupDMA");
                                                    return kotlin.Unit.a;
                                                }
                                            }
                                        }
                                        return kotlin.Unit.a;
                                    }
                                } else {
                                    z4 = z;
                                }
                                d = ((oo1.g) fVar.x0.n(fVar, kPropertyArr[78])).d(7);
                                boolean a2 = this.m.a(java.util.concurrent.TimeUnit.DAYS, new org.joda.time.DateTime(rVar.D("lastDmaNotificationShownDate", 0L)).i(), d);
                                if (!this.c.p()) {
                                    m03.p pVar2 = this.l;
                                    m = pVar2.m();
                                    C = P.C(22);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "plusHours(...)");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "date");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(C, "compareDate");
                                    if (m.m(C)) {
                                    }
                                }
                                return kotlin.Unit.a;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i8 = qVar.y;
                        i2 = qVar.x;
                        od.p.E(obj);
                        i3 = ((java.lang.Number) obj).intValue();
                        intValue = i8;
                        qVar.x = i2;
                        qVar.y = intValue;
                        qVar.z = i3;
                        qVar.C = 3;
                        t = bazVar.t(i2, qVar);
                        if (t != barVar) {
                            i4 = intValue;
                            obj = t;
                            i5 = i3;
                            intValue2 = ((java.lang.Number) obj).intValue();
                            fVar = this.j;
                            oVar = fVar.u0;
                            kPropertyArr = oo1.f.i1;
                            if (i4 <= ((oo1.g) oVar.n(fVar, kPropertyArr[75])).d(30)) {
                            }
                            if (i5 <= ((oo1.g) fVar.v0.n(fVar, kPropertyArr[76])).d(50)) {
                            }
                            if (intValue2 <= ((oo1.g) fVar.w0.n(fVar, kPropertyArr[77])).d(50)) {
                            }
                            org.joda.time.DateTime P2 = new org.joda.time.DateTime().P();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(P2, "withTimeAtStartOfDay(...)");
                            rVar = (xz1.r) this.b;
                            boolean z53 = z2;
                            if (new org.joda.time.DateTime(rVar.D("firstDmaNotificationShownDate", 0L)).i() == 0) {
                            }
                            d = ((oo1.g) fVar.x0.n(fVar, kPropertyArr[78])).d(7);
                            boolean a23 = this.m.a(java.util.concurrent.TimeUnit.DAYS, new org.joda.time.DateTime(rVar.D("lastDmaNotificationShownDate", 0L)).i(), d);
                            if (!this.c.p()) {
                            }
                            return kotlin.Unit.a;
                        }
                        return barVar;
                    }
                    i2 = qVar.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    i2 = new org.joda.time.DateTime().x(30).i();
                    qVar.x = i2;
                    qVar.C = 1;
                    obj = bazVar.s(i2, qVar);
                }
                intValue = ((java.lang.Number) obj).intValue();
                ((xz1.h) this.o.get()).getClass();
                i3 = 0;
                qVar.x = i2;
                qVar.y = intValue;
                qVar.z = i3;
                qVar.C = 3;
                t = bazVar.t(i2, qVar);
                if (t != barVar) {
                }
                return barVar;
            }
        }
        qVar = new m22.q(this, quxVar);
        java.lang.Object obj2 = qVar.A;
        barVar = ef3.bar.a;
        i = qVar.C;
        f43.baz bazVar2 = this.k;
        if (i == 0) {
        }
        intValue = ((java.lang.Number) obj2).intValue();
        ((xz1.h) this.o.get()).getClass();
        i3 = 0;
        qVar.x = i2;
        qVar.y = intValue;
        qVar.z = i3;
        qVar.C = 3;
        t = bazVar2.t(i2, qVar);
        if (t != barVar) {
        }
        return barVar;
    }
}
