package com.truecaller.whoviewedme;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u008d\u0001\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/truecaller/whoviewedme/ReceiveProfileViewWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lc73/k0;", "whoViewedMeManager", "Ljq2/qux;", "generalSettings", "Lnc0/bar;", "analytics", "Lc73/y0;", "whoViewedMeNotifier", "Lp81/b;", "rawContactDao", "Lc73/qux;", "profileViewDao", "Le92/g;", "premiumFeatureManager", "Lw82/q1;", "premiumStateSettings", "Lcom/truecaller/data/country/g;", "countryRepository", "Lc73/bar;", "profileViewContactHelper", "Ltf2/a1;", "whoViewedMeTextGenerator", "Lc73/c1;", "wvmCryptoHelper", "Lac2/a;", "whoViewedMeEventFlowObserver", "Lqo1/o;", "premiumFeaturesInventory", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lc73/k0;Ljq2/qux;Lnc0/bar;Lc73/y0;Lp81/b;Lc73/qux;Le92/g;Lw82/q1;Lcom/truecaller/data/country/g;Lc73/bar;Ltf2/a1;Lc73/c1;Lac2/a;Lqo1/o;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReceiveProfileViewWorker extends androidx.work.CoroutineWorker {
    public final android.content.Context a;
    public final c73.k0 b;
    public final jq2.qux c;
    public final nc0.bar d;
    public final c73.y0 e;
    public final p81.b f;
    public final c73.qux g;
    public final e92.g h;
    public final w82.q1 i;
    public final com.truecaller.data.country.g j;
    public final c73.bar k;
    public final tf2.a1 l;
    public final c73.c1 m;
    public final ac2.a n;
    public final qo1.o o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveProfileViewWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull c73.k0 k0Var, @org.jetbrains.annotations.NotNull jq2.qux quxVar, @org.jetbrains.annotations.NotNull nc0.bar barVar, @org.jetbrains.annotations.NotNull c73.y0 y0Var, @org.jetbrains.annotations.NotNull p81.b bVar, @org.jetbrains.annotations.NotNull c73.qux quxVar2, @org.jetbrains.annotations.NotNull e92.g gVar, @org.jetbrains.annotations.NotNull w82.q1 q1Var, @org.jetbrains.annotations.NotNull com.truecaller.data.country.g gVar2, @org.jetbrains.annotations.NotNull c73.bar barVar2, @org.jetbrains.annotations.NotNull tf2.a1 a1Var, @org.jetbrains.annotations.NotNull c73.c1 c1Var, @org.jetbrains.annotations.NotNull ac2.a aVar, @org.jetbrains.annotations.NotNull qo1.o oVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k0Var, "whoViewedMeManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "generalSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(y0Var, "whoViewedMeNotifier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "rawContactDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar2, "profileViewDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "premiumFeatureManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(q1Var, "premiumStateSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar2, "countryRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "profileViewContactHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a1Var, "whoViewedMeTextGenerator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c1Var, "wvmCryptoHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "whoViewedMeEventFlowObserver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "premiumFeaturesInventory");
        this.a = context;
        this.b = k0Var;
        this.c = quxVar;
        this.d = barVar;
        this.e = y0Var;
        this.f = bVar;
        this.g = quxVar2;
        this.h = gVar;
        this.i = q1Var;
        this.j = gVar2;
        this.k = barVar2;
        this.l = a1Var;
        this.m = c1Var;
        this.n = aVar;
        this.o = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(ff3.qux quxVar) {
        c73.i iVar;
        int i;
        boolean i2;
        android.content.Context context;
        if (quxVar instanceof c73.i) {
            iVar = (c73.i) quxVar;
            int i3 = iVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.z = i3 - Integer.MIN_VALUE;
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
                    long d = ((c73.r0) this.b).d();
                    iVar.z = 1;
                    obj = bx.e1.f(this.g, d, iVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                int intValue = ((java.lang.Number) obj).intValue();
                i2 = d4.t.i(this.h, com.truecaller.premium.data.feature.PremiumFeature.WHO_VIEWED_ME);
                context = this.a;
                if (!i2 && intValue == 1) {
                    java.lang.String string = context.getResources().getString(2132019187);
                    kotlin.jvm.internal.Intrinsics.d(string);
                    return string;
                }
                java.lang.String string2 = context.getResources().getString(2132019186);
                kotlin.jvm.internal.Intrinsics.d(string2);
                return string2;
            }
        }
        iVar = new c73.i(this, quxVar);
        java.lang.Object obj2 = iVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = iVar.z;
        if (i == 0) {
        }
        int intValue2 = ((java.lang.Number) obj2).intValue();
        i2 = d4.t.i(this.h, com.truecaller.premium.data.feature.PremiumFeature.WHO_VIEWED_ME);
        context = this.a;
        if (!i2) {
        }
        java.lang.String string22 = context.getResources().getString(2132019186);
        kotlin.jvm.internal.Intrinsics.d(string22);
        return string22;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(java.lang.String str, com.truecaller.data.country.CountryListDto.bar barVar, ff3.qux quxVar) {
        c73.j jVar;
        int i;
        java.lang.String str2;
        java.lang.CharSequence charSequence;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        int intValue;
        int intValue2;
        android.database.Cursor query;
        java.util.ArrayList arrayList;
        c73.d dVar;
        java.lang.String str7;
        com.truecaller.data.entity.Contact contact;
        if (quxVar instanceof c73.j) {
            jVar = (c73.j) quxVar;
            int i2 = jVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = jVar.y;
                ef3.bar barVar2 = ef3.bar.a;
                i = jVar.A;
                a71.a aVar = this.g;
                c73.k0 k0Var = this.b;
                tf2.b1 b1Var = this.l;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            str5 = jVar.x;
                            od.p.E(obj);
                            intValue2 = ((java.lang.Number) obj).intValue();
                            int i3 = intValue2 - 1;
                            a71.a aVar2 = aVar;
                            java.lang.String[] strArr = {"INCOMING", null, java.lang.String.valueOf(((c73.r0) k0Var).d())};
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "elements");
                            query = ((android.content.ContentResolver) aVar2.e).query((android.net.Uri) aVar2.f, new java.lang.String[]{"rowid", "tc_id", "e_tc_id", "timestamp", "source", "country_name"}, "type = ? AND timestamp >= ?", (java.lang.String[]) kotlin.collections.v.C(strArr).toArray(new java.lang.String[0]), "timestamp DESC LIMIT 1");
                            if (query == null) {
                                android.database.Cursor cursor = query;
                                try {
                                    android.database.Cursor cursor2 = cursor;
                                    arrayList = new java.util.ArrayList();
                                    while (query.moveToNext()) {
                                        arrayList.add(aVar2.z0(query, false));
                                    }
                                    cursor.close();
                                } finally {
                                }
                            } else {
                                arrayList = kotlin.collections.h0.a;
                            }
                            dVar = (c73.d) kotlin.collections.CollectionsKt.firstOrNull(arrayList);
                            if (dVar == null && (contact = dVar.e) != null) {
                                str7 = contact.I;
                            } else {
                                str7 = null;
                            }
                            if (str5 == null && str5.length() != 0) {
                                if (str7 != null && str7.length() != 0) {
                                    tf2.b1 b1Var2 = b1Var;
                                    b1Var2.getClass();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "latestViewName");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "location");
                                    java.lang.String e = ((u03.g0) b1Var2.a).e(new java.lang.Object[]{str7, str5, java.lang.Integer.valueOf(i3)}, 2131886144, intValue2);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "getQuantityString(...)");
                                    return e;
                                }
                                return b1Var.b(intValue2, str5);
                            }
                            if (str7 == null && str7.length() != 0) {
                                tf2.b1 b1Var3 = b1Var;
                                b1Var3.getClass();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "latestViewName");
                                java.lang.String e2 = ((u03.g0) b1Var3.a).e(new java.lang.Object[]{str7, java.lang.Integer.valueOf(i3)}, 2131886142, intValue2);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e2, "getQuantityString(...)");
                                return e2;
                            }
                            java.lang.String e3 = ((u03.g0) b1Var.a).e(new java.lang.Object[]{java.lang.Integer.valueOf(intValue2)}, 2131886141, intValue2);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e3, "getQuantityString(...)");
                            return e3;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str6 = jVar.x;
                    od.p.E(obj);
                    intValue = ((java.lang.Number) obj).intValue();
                    if (str6 == null && str6.length() != 0 && !kotlin.text.StringsKt.N(str6, "null", false)) {
                        if (intValue == 0) {
                            tf2.b1 b1Var4 = b1Var;
                            b1Var4.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "location");
                            java.lang.String h = ((u03.g0) b1Var4.a).h(2132019188, str6);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
                            return h;
                        }
                        return b1Var.b(intValue, str6);
                    }
                    java.lang.String e4 = ((u03.g0) b1Var.a).e(new java.lang.Object[]{java.lang.Integer.valueOf(intValue)}, 2131886141, intValue);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e4, "getQuantityString(...)");
                    return e4;
                }
                od.p.E(obj);
                tf2.b1 b1Var5 = b1Var;
                b1Var5.getClass();
                java.lang.String str8 = "";
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (barVar == null || (charSequence = b1Var5.b.a(barVar)) == null) {
                    charSequence = null;
                }
                if (charSequence != null) {
                    str3 = charSequence.toString();
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    str8 = str3;
                }
                java.lang.String obj2 = kotlin.text.StringsKt.u0(str2 + " " + str8).toString();
                if (obj2 != null) {
                    str4 = kotlin.text.StringsKt.u0(obj2).toString();
                } else {
                    str4 = null;
                }
                if (kotlin.jvm.internal.Intrinsics.b(str4, "null null")) {
                    com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("WVM null null notification generated with location = " + str + " and country = " + barVar);
                }
                if (!d4.t.i(this.h, com.truecaller.premium.data.feature.PremiumFeature.WHO_VIEWED_ME)) {
                    long d = ((c73.r0) k0Var).d();
                    jVar.x = obj2;
                    jVar.A = 1;
                    java.lang.Object f = bx.e1.f(aVar, d, jVar);
                    if (f != barVar2) {
                        obj = f;
                        str6 = obj2;
                        intValue = ((java.lang.Number) obj).intValue();
                        if (str6 == null) {
                        }
                        java.lang.String e42 = ((u03.g0) b1Var.a).e(new java.lang.Object[]{java.lang.Integer.valueOf(intValue)}, 2131886141, intValue);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e42, "getQuantityString(...)");
                        return e42;
                    }
                } else {
                    long d2 = ((c73.r0) k0Var).d();
                    jVar.x = obj2;
                    jVar.A = 2;
                    a71.a aVar3 = aVar;
                    aVar3.getClass();
                    java.lang.Object W = fg3.h0.W((kotlin.coroutines.CoroutineContext) aVar3.b, new c73.c(com.truecaller.whoviewedme.ProfileViewType.INCOMING, d2, aVar3, (df3.bar) null, 0), jVar);
                    if (W != barVar2) {
                        obj = W;
                        str5 = obj2;
                        intValue2 = ((java.lang.Number) obj).intValue();
                        int i32 = intValue2 - 1;
                        a71.a aVar22 = aVar;
                        java.lang.String[] strArr2 = {"INCOMING", null, java.lang.String.valueOf(((c73.r0) k0Var).d())};
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr2, "elements");
                        query = ((android.content.ContentResolver) aVar22.e).query((android.net.Uri) aVar22.f, new java.lang.String[]{"rowid", "tc_id", "e_tc_id", "timestamp", "source", "country_name"}, "type = ? AND timestamp >= ?", (java.lang.String[]) kotlin.collections.v.C(strArr2).toArray(new java.lang.String[0]), "timestamp DESC LIMIT 1");
                        if (query == null) {
                        }
                        dVar = (c73.d) kotlin.collections.CollectionsKt.firstOrNull(arrayList);
                        if (dVar == null) {
                        }
                        str7 = null;
                        if (str5 == null) {
                        }
                        if (str7 == null) {
                        }
                        java.lang.String e32 = ((u03.g0) b1Var.a).e(new java.lang.Object[]{java.lang.Integer.valueOf(intValue2)}, 2131886141, intValue2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e32, "getQuantityString(...)");
                        return e32;
                    }
                }
                return barVar2;
            }
        }
        jVar = new c73.j(this, quxVar);
        java.lang.Object obj3 = jVar.y;
        ef3.bar barVar22 = ef3.bar.a;
        i = jVar.A;
        a71.a aVar4 = this.g;
        c73.k0 k0Var2 = this.b;
        tf2.b1 b1Var6 = this.l;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a7, code lost:
    
        if (r2 == r14) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014a, code lost:
    
        if (d(r2, r15, r4, r13) == r14) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0183, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a8, code lost:
    
        if (e(r1, r15, r13) == r14) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00df, code lost:
    
        if (r3 == r14) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0180, code lost:
    
        if (d(r1, r15, r4, r13) == r14) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(java.lang.String str, java.lang.String str2, java.lang.String str3, com.truecaller.whoviewedme.ProfileViewSource profileViewSource, boolean z, ff3.qux quxVar) {
        c73.k kVar;
        int i;
        com.truecaller.data.country.CountryListDto.bar barVar;
        com.truecaller.data.country.CountryListDto.bar barVar2;
        a71.a aVar;
        java.lang.String str4;
        java.lang.String str5;
        com.truecaller.whoviewedme.ProfileViewSource profileViewSource2;
        int i2;
        java.lang.String str6;
        java.lang.Object c;
        java.lang.String str7;
        com.truecaller.data.entity.Contact b;
        com.truecaller.whoviewedme.ProfileViewSource profileViewSource3 = profileViewSource;
        boolean z2 = z;
        if (quxVar instanceof c73.k) {
            kVar = (c73.k) quxVar;
            int i3 = kVar.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.C = i3 - Integer.MIN_VALUE;
                c73.k kVar2 = kVar;
                java.lang.Object obj = kVar2.A;
                java.lang.Object obj2 = ef3.bar.a;
                i = kVar2.C;
                a71.a aVar2 = this.g;
                com.truecaller.whoviewedme.ProfileViewSource profileViewSource4 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3 && i != 4) {
                                if (i == 5) {
                                    od.p.E(obj);
                                    return kotlin.Unit.a;
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            boolean z3 = kVar2.z;
                            od.p.E(obj);
                            z2 = z3;
                            if (!this.o.a()) {
                                kVar2.x = profileViewSource4;
                                kVar2.y = profileViewSource4;
                                kVar2.z = z2;
                                kVar2.C = 5;
                                ig3.v1 v1Var = this.n.a;
                                java.lang.Object obj3 = kotlin.Unit.a;
                                java.lang.Object emit = v1Var.emit(obj3, kVar2);
                                if (emit == obj2) {
                                    obj3 = emit;
                                }
                            } else {
                                return kotlin.Unit.a;
                            }
                        } else {
                            boolean z4 = kVar2.z;
                            com.truecaller.data.country.CountryListDto.bar barVar3 = kVar2.y;
                            profileViewSource3 = kVar2.x;
                            od.p.E(obj);
                            z2 = z4;
                            barVar2 = barVar3;
                            i2 = 3;
                            c = obj;
                            profileViewSource2 = null;
                            str6 = (java.lang.String) c;
                            if (str6 == null) {
                                return kotlin.Unit.a;
                            }
                        }
                    } else {
                        od.p.E(obj);
                        return kotlin.Unit.a;
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.data.country.g gVar = this.j;
                    if (str3 != null) {
                        com.truecaller.data.country.qux c2 = gVar.c();
                        c2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "iso");
                        java.util.Map map = c2.b;
                        java.util.Locale locale = java.util.Locale.ENGLISH;
                        barVar = (com.truecaller.data.country.CountryListDto.bar) map.get(ax1.bar.r(locale, "ENGLISH", str3, locale, "toLowerCase(...)"));
                    } else {
                        gVar.getClass();
                        barVar = null;
                    }
                    barVar2 = barVar;
                    if (z2) {
                        if (barVar2 != null) {
                            str7 = barVar2.b;
                        } else {
                            str7 = null;
                        }
                        kVar2.x = null;
                        kVar2.y = null;
                        kVar2.z = z2;
                        kVar2.C = 1;
                    } else if (this.i.G()) {
                        if (str == null) {
                            kVar2.x = profileViewSource3;
                            kVar2.y = barVar2;
                            kVar2.z = z2;
                            kVar2.C = 2;
                            c71.k kVar3 = this.m;
                            v03.baz bazVar = (v03.baz) kVar3.d;
                            by1.b bVar = new by1.b(kVar3, str2, (df3.bar) null, 4);
                            profileViewSource2 = null;
                            i2 = 3;
                            c = bazVar.c(2, 0L, bVar, kVar2);
                        } else {
                            profileViewSource2 = null;
                            i2 = 3;
                            str6 = str;
                        }
                    } else {
                        if (barVar2 != null) {
                            str4 = barVar2.b;
                            aVar = aVar2;
                        } else {
                            aVar = aVar2;
                            str4 = null;
                        }
                        a71.a aVar3 = aVar;
                        aVar3.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileViewSource3, "source");
                        aVar3.I(str, str2, profileViewSource3, com.truecaller.whoviewedme.ProfileViewType.INCOMING, str4);
                        if (barVar2 != null) {
                            str5 = barVar2.b;
                        } else {
                            str5 = null;
                        }
                        kVar2.x = null;
                        kVar2.y = null;
                        kVar2.z = z2;
                        kVar2.C = 4;
                    }
                    return obj2;
                }
                b = ((c73.baz) this.k).b(str6);
                if (b != null) {
                    return kotlin.Unit.a;
                }
                com.truecaller.contact.entity.model.AddressEntity m = b.m();
                if (m == null) {
                    return kotlin.Unit.a;
                }
                this.f.a(b);
                java.lang.String str8 = b.H;
                if (str8 == null) {
                    return kotlin.Unit.a;
                }
                if (b.I != null) {
                    a71.a aVar4 = aVar2;
                    aVar4.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileViewSource3, "source");
                    java.lang.String str9 = profileViewSource2;
                    aVar4.I(str8, str9, profileViewSource3, com.truecaller.whoviewedme.ProfileViewType.INCOMING, profileViewSource2);
                    profileViewSource4 = str9;
                    java.lang.String S = ak.r0.S(m);
                    java.lang.String str10 = S;
                    if (S == null) {
                        if (barVar2 != null) {
                            str10 = barVar2.b;
                        } else {
                            str10 = profileViewSource4;
                        }
                    }
                    kVar2.x = profileViewSource4;
                    kVar2.y = profileViewSource4;
                    kVar2.z = z2;
                    kVar2.C = i2;
                } else {
                    profileViewSource4 = profileViewSource2;
                    if (!this.o.a()) {
                    }
                }
            }
        }
        kVar = new c73.k(this, quxVar);
        c73.k kVar22 = kVar;
        java.lang.Object obj4 = kVar22.A;
        java.lang.Object obj22 = ef3.bar.a;
        i = kVar22.C;
        a71.a aVar22 = this.g;
        com.truecaller.whoviewedme.ProfileViewSource profileViewSource42 = null;
        if (i == 0) {
        }
        b = ((c73.baz) this.k).b(str6);
        if (b != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
    
        if (r13 == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(java.lang.String str, com.truecaller.data.country.CountryListDto.bar barVar, com.truecaller.whoviewedme.ProfileViewSource profileViewSource, ff3.qux quxVar) {
        c73.l lVar;
        java.lang.Object obj;
        int i;
        com.truecaller.whoviewedme.ProfileViewSource profileViewSource2;
        com.truecaller.whoviewedme.ProfileViewSource profileViewSource3;
        java.lang.String str2;
        com.truecaller.whoviewedme.WhoViewedMeLaunchContext whoViewedMeLaunchContext;
        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource;
        com.truecaller.whoviewedme.ProfileViewSource profileViewSource4;
        if (quxVar instanceof c73.l) {
            lVar = (c73.l) quxVar;
            int i2 = lVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.D = i2 - Integer.MIN_VALUE;
                c73.l lVar2 = lVar;
                obj = lVar2.B;
                java.lang.Object obj2 = ef3.bar.a;
                i = lVar2.D;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    profileViewSource4 = lVar2.z;
                                    od.p.E(obj);
                                    profileViewSource = profileViewSource4;
                                    nc0.u1.e(new d73.bar(profileViewSource, 1), this.d);
                                    return kotlin.Unit.a;
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str2 = lVar2.A;
                            profileViewSource3 = lVar2.z;
                            od.p.E(obj);
                            whoViewedMeLaunchContext = com.truecaller.whoviewedme.WhoViewedMeLaunchContext.NOTIFICATION;
                            pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                            lVar2.x = null;
                            lVar2.y = null;
                            lVar2.z = profileViewSource3;
                            lVar2.A = null;
                            lVar2.D = 4;
                            if (this.e.a(str2, (java.lang.String) obj, whoViewedMeLaunchContext, pushNotificationSource, lVar2) != obj2) {
                                profileViewSource4 = profileViewSource3;
                                profileViewSource = profileViewSource4;
                                nc0.u1.e(new d73.bar(profileViewSource, 1), this.d);
                                return kotlin.Unit.a;
                            }
                            return obj2;
                        }
                        profileViewSource2 = lVar2.z;
                        od.p.E(obj);
                        java.lang.String str3 = (java.lang.String) obj;
                        lVar2.x = null;
                        lVar2.y = null;
                        lVar2.z = profileViewSource2;
                        lVar2.A = str3;
                        lVar2.D = 3;
                        obj = a(lVar2);
                        if (obj != obj2) {
                            profileViewSource3 = profileViewSource2;
                            str2 = str3;
                            whoViewedMeLaunchContext = com.truecaller.whoviewedme.WhoViewedMeLaunchContext.NOTIFICATION;
                            pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                            lVar2.x = null;
                            lVar2.y = null;
                            lVar2.z = profileViewSource3;
                            lVar2.A = null;
                            lVar2.D = 4;
                            if (this.e.a(str2, (java.lang.String) obj, whoViewedMeLaunchContext, pushNotificationSource, lVar2) != obj2) {
                            }
                        }
                        return obj2;
                    }
                    profileViewSource = lVar2.z;
                    barVar = lVar2.y;
                    str = lVar2.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this.a).sendBroadcast(new android.content.Intent("com.truecaller.notification.action.NOTIFICATIONS_UPDATED"));
                    lVar2.x = str;
                    lVar2.y = barVar;
                    lVar2.z = profileViewSource;
                    lVar2.D = 1;
                    obj = ((c73.r0) this.b).k(lVar2);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    lVar2.x = null;
                    lVar2.y = null;
                    lVar2.z = profileViewSource;
                    lVar2.D = 2;
                    obj = b(str, barVar, lVar2);
                    if (obj != obj2) {
                        profileViewSource2 = profileViewSource;
                        java.lang.String str32 = (java.lang.String) obj;
                        lVar2.x = null;
                        lVar2.y = null;
                        lVar2.z = profileViewSource2;
                        lVar2.A = str32;
                        lVar2.D = 3;
                        obj = a(lVar2);
                        if (obj != obj2) {
                        }
                    }
                    return obj2;
                }
                nc0.u1.e(new d73.bar(profileViewSource, 1), this.d);
                return kotlin.Unit.a;
            }
        }
        lVar = new c73.l(this, quxVar);
        c73.l lVar22 = lVar;
        obj = lVar22.B;
        java.lang.Object obj22 = ef3.bar.a;
        i = lVar22.D;
        if (i == 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
        nc0.u1.e(new d73.bar(profileViewSource, 1), this.d);
        return kotlin.Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        c73.h hVar;
        int i;
        com.truecaller.whoviewedme.ProfileViewSource profileViewSource;
        if (barVar instanceof c73.h) {
            hVar = (c73.h) barVar;
            int i2 = hVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.z = i2 - Integer.MIN_VALUE;
                c73.h hVar2 = hVar;
                java.lang.Object obj = hVar2.x;
                java.lang.Object obj2 = ef3.bar.a;
                i = hVar2.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (((c73.r0) this.b).f() && ((cl2.m) this.c).z("showProfileViewNotifications", true)) {
                        java.lang.String e = getInputData().e("EXTRA_TC_ID");
                        java.lang.String e2 = getInputData().e("EXTRA_E_TC_ID");
                        if (e == null && e2 == null) {
                            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("TC id is null in Who viewed me notifications");
                            nd.q qVar = new nd.q();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qVar, "failure(...)");
                            return qVar;
                        }
                        try {
                            java.lang.String e3 = getInputData().e("EXTRA_PROFILE_VIEW_EVENT_SOURCE");
                            if (e3 != null) {
                                profileViewSource = com.truecaller.whoviewedme.ProfileViewSource.valueOf(e3);
                            } else {
                                profileViewSource = null;
                            }
                            kotlin.jvm.internal.Intrinsics.e(profileViewSource, "null cannot be cast to non-null type com.truecaller.whoviewedme.ProfileViewSource");
                        } catch (java.lang.Exception unused) {
                            profileViewSource = com.truecaller.whoviewedme.ProfileViewSource.UNKNOWN;
                        }
                        com.truecaller.whoviewedme.ProfileViewSource profileViewSource2 = profileViewSource;
                        java.lang.String e4 = getInputData().e("EXTRA_PROFILE_COUNTRY_ISO");
                        boolean a = getInputData().a("EXTRA_IS_QA_NOTIFICATION", false);
                        hVar2.z = 1;
                        if (c(e, e2, e4, profileViewSource2, a, hVar2) == obj2) {
                            return obj2;
                        }
                    } else {
                        nd.s a2 = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                        return a2;
                    }
                }
                nd.s a3 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "success(...)");
                return a3;
            }
        }
        hVar = new c73.h(this, (ff3.qux) barVar);
        c73.h hVar22 = hVar;
        java.lang.Object obj3 = hVar22.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = hVar22.z;
        if (i == 0) {
        }
        nd.s a32 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a32, "success(...)");
        return a32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r7.e.a(r8, (java.lang.String) r10, r4, r5, r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r10 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        if (r10 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object e(java.lang.String str, com.truecaller.data.country.CountryListDto.bar barVar, ff3.qux quxVar) {
        c73.m mVar;
        int i;
        java.lang.String str2;
        if (quxVar instanceof c73.m) {
            mVar = (c73.m) quxVar;
            int i2 = mVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.A = i2 - Integer.MIN_VALUE;
                c73.m mVar2 = mVar;
                java.lang.Object obj = mVar2.y;
                java.lang.Object obj2 = ef3.bar.a;
                i = mVar2.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                od.p.E(obj);
                                return kotlin.Unit.a;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = mVar2.x;
                        od.p.E(obj);
                        com.truecaller.whoviewedme.WhoViewedMeLaunchContext whoViewedMeLaunchContext = com.truecaller.whoviewedme.WhoViewedMeLaunchContext.NOTIFICATION;
                        com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.Firebase;
                        mVar2.x = null;
                        mVar2.A = 3;
                    } else {
                        od.p.E(obj);
                    }
                } else {
                    od.p.E(obj);
                    mVar2.A = 1;
                    obj = b(str, barVar, mVar2);
                }
                str2 = (java.lang.String) obj;
                mVar2.x = str2;
                mVar2.A = 2;
                obj = a(mVar2);
            }
        }
        mVar = new c73.m(this, quxVar);
        c73.m mVar22 = mVar;
        java.lang.Object obj3 = mVar22.y;
        java.lang.Object obj22 = ef3.bar.a;
        i = mVar22.A;
        if (i == 0) {
        }
        str2 = (java.lang.String) obj3;
        mVar22.x = str2;
        mVar22.A = 2;
        obj3 = a(mVar22);
    }
}
