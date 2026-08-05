package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class w implements fg3.e0, vj2.c {
    public final java.lang.String a;
    public final kotlin.coroutines.CoroutineContext b;
    public final qc3.bar c;
    public final com.truecaller.remoteconfig.experiment.p d;
    public final qc3.bar e;
    public final qc3.bar f;
    public final u03.baz g;
    public final qc3.bar h;
    public final qc3.bar i;
    public final qc3.bar j;
    public volatile java.util.LinkedHashMap k;
    public final pg3.a l;

    public w(java.lang.String str, kotlin.coroutines.CoroutineContext coroutineContext, qc3.bar barVar, com.truecaller.remoteconfig.experiment.p pVar, qc3.bar barVar2, qc3.bar barVar3, qc3.bar barVar4, u03.baz bazVar, qc3.bar barVar5, qc3.bar barVar6, qc3.bar barVar7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "appVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "configStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "api");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "qmConfigsRepo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "environment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "activationProcessor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "clock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar5, "deviceInfoUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar6, "buildHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar7, "unauthenticatedHeaderIdProvider");
        this.a = str;
        this.b = coroutineContext;
        this.c = barVar;
        this.d = pVar;
        this.e = barVar3;
        this.f = barVar4;
        this.g = bazVar;
        this.h = barVar5;
        this.i = barVar6;
        this.j = barVar7;
        this.l = pg3.b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0143, code lost:
    
        if (r17.i(r1, r12) == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0134, code lost:
    
        if (r1 != r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.truecaller.remoteconfig.experiment.w wVar, ff3.qux quxVar) {
        com.truecaller.remoteconfig.experiment.u uVar;
        int i;
        java.lang.String str;
        java.util.List list;
        java.util.List list2;
        java.lang.String str2;
        java.lang.String str3;
        java.util.List list3;
        java.lang.String str4;
        java.util.List list4;
        com.truecaller.remoteconfig.experiment.p pVar;
        qc3.bar barVar = wVar.h;
        if (quxVar instanceof com.truecaller.remoteconfig.experiment.u) {
            uVar = (com.truecaller.remoteconfig.experiment.u) quxVar;
            int i2 = uVar.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.G = i2 - Integer.MIN_VALUE;
                com.truecaller.remoteconfig.experiment.u uVar2 = uVar;
                java.lang.Object obj = uVar2.E;
                java.lang.Object obj2 = ef3.bar.a;
                i = uVar2.G;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                od.p.E(obj);
                                return kotlin.Unit.a;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.p.E(obj);
                        com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDto experimentConfigResponseDto = (com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDto) obj;
                        if (experimentConfigResponseDto != null) {
                            uVar2.x = null;
                            uVar2.G = 3;
                        }
                        return kotlin.Unit.a;
                    }
                    java.util.List list5 = uVar2.D;
                    java.util.List list6 = uVar2.C;
                    java.lang.String str5 = uVar2.B;
                    str = uVar2.A;
                    java.lang.String str6 = uVar2.z;
                    java.lang.String str7 = uVar2.y;
                    com.truecaller.remoteconfig.experiment.p pVar2 = uVar2.x;
                    od.p.E(obj);
                    list3 = list5;
                    str4 = str7;
                    list4 = list6;
                    pVar = pVar2;
                    str2 = str5;
                    str3 = str6;
                } else {
                    od.p.E(obj);
                    com.truecaller.remoteconfig.experiment.p pVar3 = wVar.d;
                    java.lang.String string = android.provider.Settings.Secure.getString(((u03.c) ((u03.b) barVar.get())).a.getContentResolver(), "android_id");
                    java.lang.String str8 = wVar.a;
                    ((u03.c) ((u03.b) barVar.get())).getClass();
                    str = android.os.Build.VERSION.RELEASE;
                    java.lang.String b = ((pk0.baz) wVar.i.get()).b();
                    java.lang.String j = ((u03.c) ((u03.b) barVar.get())).j();
                    if (j != null) {
                        java.lang.String lowerCase = j.toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        list = kotlin.collections.x.c(lowerCase);
                    } else {
                        list = null;
                    }
                    java.lang.Object systemService = ((u03.c) ((u03.b) barVar.get())).a.getSystemService(com.truecaller.sdk.oAuth.networking.data.PartnerDetailsResponse.OAUTH_SCOPE_PHONE);
                    kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    java.lang.String networkOperatorName = ((android.telephony.TelephonyManager) systemService).getNetworkOperatorName();
                    if (networkOperatorName != null) {
                        java.lang.String lowerCase2 = networkOperatorName.toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        list2 = kotlin.collections.x.c(lowerCase2);
                    } else {
                        list2 = null;
                    }
                    ry.bar barVar2 = (ry.bar) wVar.j.get();
                    uVar2.x = pVar3;
                    uVar2.y = string;
                    uVar2.z = str8;
                    uVar2.A = str;
                    uVar2.B = b;
                    uVar2.C = list;
                    uVar2.D = list2;
                    uVar2.G = 1;
                    java.lang.Object a = barVar2.a(true, uVar2);
                    if (a != obj2) {
                        str2 = b;
                        obj = a;
                        str3 = str8;
                        list3 = list2;
                        str4 = string;
                        list4 = list;
                        pVar = pVar3;
                    }
                    return obj2;
                }
                uVar2.x = null;
                uVar2.y = null;
                uVar2.z = null;
                uVar2.A = null;
                uVar2.B = null;
                uVar2.C = null;
                uVar2.D = null;
                uVar2.G = 2;
                obj = pVar.b(str4, str3, str, str2, list4, list3, (java.lang.String) obj, uVar2);
            }
        }
        uVar = new com.truecaller.remoteconfig.experiment.u(wVar, quxVar);
        com.truecaller.remoteconfig.experiment.u uVar22 = uVar;
        java.lang.Object obj3 = uVar22.E;
        java.lang.Object obj22 = ef3.bar.a;
        i = uVar22.G;
        if (i == 0) {
        }
        uVar22.x = null;
        uVar22.y = null;
        uVar22.z = null;
        uVar22.A = null;
        uVar22.B = null;
        uVar22.C = null;
        uVar22.D = null;
        uVar22.G = 2;
        obj3 = pVar.b(str4, str3, str, str2, list4, list3, (java.lang.String) obj3, uVar22);
    }

    @Override // vj2.c
    public final java.lang.String b(java.lang.String str) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        com.truecaller.remoteconfig.experiment.a0 a0Var = (com.truecaller.remoteconfig.experiment.a0) ((java.util.LinkedHashMap) h()).get(str);
        if (a0Var != null && (str2 = a0Var.b) != null) {
            return str2;
        }
        return "null";
    }

    public final java.lang.Object c(boolean z, df3.bar barVar) {
        return fg3.h0.W(this.b, new com.truecaller.remoteconfig.experiment.t(this, z, null), barVar);
    }

    @Override // vj2.c
    public final java.lang.String d(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "defaultValue");
        ((lo1.qux) this.e.get()).getClass();
        java.lang.String f = f(str);
        if (f == null) {
            return str2;
        }
        return f;
    }

    @Override // vj2.c
    public final long e(long j, java.lang.String str) {
        java.lang.Long t0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        ((lo1.qux) this.e.get()).getClass();
        java.lang.String f = f(str);
        if (f != null && (t0 = kotlin.text.StringsKt.t0(f)) != null) {
            return t0.longValue();
        }
        return j;
    }

    public final java.lang.String f(java.lang.String str) {
        com.truecaller.remoteconfig.experiment.a0 a0Var = (com.truecaller.remoteconfig.experiment.a0) ((java.util.LinkedHashMap) h()).get(str);
        if (a0Var != null) {
            com.truecaller.remoteconfig.experiment.c cVar = (com.truecaller.remoteconfig.experiment.c) this.f.get();
            cVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "flag");
            fg3.h0.J(cVar.a, cVar.b, (fg3.f0) null, new com.truecaller.data.country.f(cVar, a0Var, (df3.bar) null, 13), 2);
        }
        if (a0Var == null) {
            return null;
        }
        return a0Var.b;
    }

    @Override // vj2.c
    public final int g(int i, java.lang.String str) {
        java.lang.Integer intOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        ((lo1.qux) this.e.get()).getClass();
        java.lang.String f = f(str);
        if (f != null && (intOrNull = kotlin.text.StringsKt.toIntOrNull(f)) != null) {
            return intOrNull.intValue();
        }
        return i;
    }

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.b;
    }

    public final java.util.Map h() {
        com.truecaller.remoteconfig.experiment.q o;
        java.util.LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap == null) {
            com.truecaller.remoteconfig.experiment.y yVar = (com.truecaller.remoteconfig.experiment.y) this.c.get();
            yVar.getClass();
            try {
                kotlin.o oVar = kotlin.q.b;
                o = com.truecaller.remoteconfig.experiment.y.c(new java.io.DataInputStream(new java.io.BufferedInputStream(new java.io.FileInputStream(yVar.b()), 8192)));
            } catch (java.lang.Throwable th) {
                kotlin.o oVar2 = kotlin.q.b;
                o = od.p.o(th);
            }
            if (o instanceof kotlin.p) {
                o = null;
            }
            com.truecaller.remoteconfig.experiment.q qVar = o;
            if (qVar == null) {
                qVar = new com.truecaller.remoteconfig.experiment.q(kotlin.collections.h0.a, "", "");
            }
            java.util.LinkedHashMap g = oe0.e.g(qVar);
            this.k = g;
            return g;
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object i(com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDto experimentConfigResponseDto, ff3.qux quxVar) {
        com.truecaller.remoteconfig.experiment.v vVar;
        java.lang.Object obj;
        int i;
        java.util.ArrayList arrayList;
        com.truecaller.remoteconfig.experiment.q qVar;
        if (quxVar instanceof com.truecaller.remoteconfig.experiment.v) {
            vVar = (com.truecaller.remoteconfig.experiment.v) quxVar;
            int i2 = vVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.A = i2 - Integer.MIN_VALUE;
                obj = vVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = vVar.A;
                if (i == 0) {
                    if (i == 1) {
                        qVar = vVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.util.List<com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag> resolvedFlags = experimentConfigResponseDto.getResolvedFlags();
                    if (resolvedFlags != null) {
                        java.util.List<com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag> list = resolvedFlags;
                        arrayList = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
                        for (com.truecaller.remoteconfig.experiment.ExperimentConfigResponseDtoFlag experimentConfigResponseDtoFlag : list) {
                            arrayList.add(new com.truecaller.remoteconfig.experiment.r(experimentConfigResponseDtoFlag.getFlag(), experimentConfigResponseDtoFlag.getVariant(), experimentConfigResponseDtoFlag.getValue()));
                        }
                    } else {
                        arrayList = kotlin.collections.h0.a;
                    }
                    com.truecaller.remoteconfig.experiment.q qVar2 = new com.truecaller.remoteconfig.experiment.q(arrayList, experimentConfigResponseDto.getResolveId(), experimentConfigResponseDto.getResolveToken());
                    com.truecaller.remoteconfig.experiment.y yVar = (com.truecaller.remoteconfig.experiment.y) this.c.get();
                    vVar.x = qVar2;
                    vVar.A = 1;
                    yVar.getClass();
                    obj = fg3.h0.W(yVar.b, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux(yVar, qVar2, (df3.bar) null, 20), vVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                    qVar = qVar2;
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    this.k = oe0.e.g(qVar);
                }
                return kotlin.Unit.a;
            }
        }
        vVar = new com.truecaller.remoteconfig.experiment.v(this, quxVar);
        obj = vVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = vVar.A;
        if (i == 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
        return kotlin.Unit.a;
    }
}
