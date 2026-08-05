package com.truecaller.google_login;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class f implements com.truecaller.google_login.g {
    public static final y7.b e = lk.c.s("hasConnectedGoogleAccount");
    public static final y7.b f = lk.c.S("token");
    public final android.content.Context a;
    public final kotlin.coroutines.CoroutineContext b;
    public final a11.h c;
    public final kotlin.Lazy d;

    public f(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext, a11.h hVar, com.truecaller.google_login.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "applicationContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "io");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "manager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "idTokenParser");
        this.a = context;
        this.b = coroutineContext;
        this.c = hVar;
        this.d = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(this, 18));
    }

    public static z6.g e(com.truecaller.google_login.j jVar, android.app.Activity activity) {
        oq.bar bazVar;
        if (jVar instanceof com.truecaller.google_login.h) {
            com.truecaller.google_login.h hVar = (com.truecaller.google_login.h) jVar;
            boolean z = hVar.a;
            java.lang.String str = hVar.c;
            boolean z2 = hVar.b;
            java.lang.String string = activity.getString(2132021644);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "serverClientId");
            if (string.length() > 0) {
                bazVar = new oq.bar(string, str, z, z2);
            } else {
                throw new java.lang.IllegalArgumentException("serverClientId should not be empty");
            }
        } else if (jVar instanceof com.truecaller.google_login.i) {
            java.lang.String string2 = activity.getString(2132021644);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string2, "serverClientId");
            bazVar = new oq.baz(string2);
        } else {
            throw new java.lang.RuntimeException();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "credentialOption");
        arrayList.add(bazVar);
        return new z6.g(kotlin.collections.CollectionsKt.G0(arrayList));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(4:11|12|13|(2:15|16)(3:18|19|20))(2:21|22))(1:23))(6:44|45|(2:48|46)|49|50|(2:52|35))|24|25|(3:(1:28)|29|(4:31|(3:33|(2:36|12)|35)|13|(0)(0))(2:37|38))(5:39|(1:41)|42|19|20)))|55|6|7|(0)(0)|24|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x003e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
    
        r4 = kotlin.q.b;
        r0 = od.p.o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.auth.api.identity.zba, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.util.List list, ff3.qux quxVar) {
        com.truecaller.google_login.c cVar;
        int i;
        boolean z;
        java.lang.Object barVar;
        com.google.android.gms.auth.api.identity.AuthorizationResult authorizationResult;
        com.google.android.gms.auth.api.identity.AuthorizationResult authorizationResult2;
        android.app.PendingIntent pendingIntent;
        if (quxVar instanceof com.truecaller.google_login.c) {
            cVar = (com.truecaller.google_login.c) quxVar;
            int i2 = cVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = cVar.y;
                ef3.bar barVar2 = ef3.bar.a;
                i = cVar.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            authorizationResult2 = cVar.x;
                            od.p.E(obj);
                            authorizationResult = authorizationResult2;
                            pendingIntent = authorizationResult.f;
                            if (pendingIntent == null) {
                                return new com.truecaller.google_login.baz(pendingIntent);
                            }
                            java.util.List list2 = authorizationResult.d;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list2, "getGrantedScopes(...)");
                            barVar = new com.truecaller.google_login.qux(list2, authorizationResult.b);
                            return barVar;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    android.content.Context context = this.a;
                    com.google.android.gms.common.internal.Preconditions.i(context);
                    com.google.android.gms.internal.auth-api.zbad zbadVar = new com.google.android.gms.internal.auth-api.zbad(context, (com.google.android.gms.auth.api.identity.zba) new java.lang.Object());
                    kotlin.o oVar = kotlin.q.b;
                    android.os.Parcelable.Creator creator = com.google.android.gms.auth.api.identity.AuthorizationRequest.CREATOR;
                    com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder builder = new com.google.android.gms.auth.api.identity.AuthorizationRequest.Builder();
                    builder.j = true;
                    java.util.List list3 = list;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list3, 10));
                    java.util.Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new com.google.android.gms.common.api.Scope(1, (java.lang.String) it.next()));
                    }
                    com.google.android.gms.common.internal.Preconditions.b(!arrayList.isEmpty(), "requestedScopes cannot be null or empty");
                    builder.a = arrayList;
                    com.google.android.gms.tasks.Task e2 = zbadVar.e(new com.google.android.gms.auth.api.identity.AuthorizationRequest(builder.a, builder.b, builder.c, builder.d, builder.e, builder.f, builder.g, builder.h, builder.i, builder.j));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e2, "authorize(...)");
                    cVar.A = 1;
                    obj = ef0.a.m(e2, cVar);
                    if (obj == barVar2) {
                        return barVar2;
                    }
                }
                com.google.android.gms.auth.api.identity.AuthorizationResult o = (com.google.android.gms.auth.api.identity.AuthorizationResult) obj;
                kotlin.o oVar2 = kotlin.q.b;
                z = o instanceof kotlin.p;
                java.lang.Exception exc = null;
                if (z) {
                    if (z) {
                        o = null;
                    }
                    authorizationResult = o;
                    if (authorizationResult != null) {
                        java.lang.String str = authorizationResult.b;
                        if (str != null) {
                            t7.e c = c();
                            cVar.x = authorizationResult;
                            cVar.A = 2;
                            if (ef0.a.a0(c, f, str, cVar) != barVar2) {
                                authorizationResult2 = authorizationResult;
                                authorizationResult = authorizationResult2;
                            }
                            return barVar2;
                        }
                        pendingIntent = authorizationResult.f;
                        if (pendingIntent == null) {
                        }
                    } else {
                        return new com.truecaller.google_login.bar(new java.lang.IllegalStateException());
                    }
                } else {
                    java.lang.Throwable a = kotlin.q.a(o);
                    if (a instanceof java.lang.Exception) {
                        exc = (java.lang.Exception) a;
                    }
                    barVar = new com.truecaller.google_login.bar(exc);
                    return barVar;
                }
            }
        }
        cVar = new com.truecaller.google_login.c(this, quxVar);
        java.lang.Object obj2 = cVar.y;
        ef3.bar barVar22 = ef3.bar.a;
        i = cVar.A;
        if (i == 0) {
        }
        com.google.android.gms.auth.api.identity.AuthorizationResult o2 = (com.google.android.gms.auth.api.identity.AuthorizationResult) obj2;
        kotlin.o oVar22 = kotlin.q.b;
        z = o2 instanceof kotlin.p;
        java.lang.Exception exc2 = null;
        if (z) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(3:18|19|20))(1:23))(3:28|29|(2:31|22))|24|(2:26|22)(2:27|20)))|34|6|7|(0)(0)|24|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        if (ef0.a.t(r11, r0) != r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(r11);
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.auth.api.identity.zba, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(ff3.qux quxVar) {
        com.truecaller.google_login.d dVar;
        ef3.bar barVar;
        int i;
        java.lang.Object G;
        com.google.android.gms.auth.api.identity.bar barVar2;
        com.google.android.gms.internal.auth-api.zbad zbadVar;
        if (quxVar instanceof com.truecaller.google_login.d) {
            dVar = (com.truecaller.google_login.d) quxVar;
            int i2 = dVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.B = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = dVar.z;
                barVar = ef3.bar.a;
                i = dVar.B;
                boolean z = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                od.p.E(obj);
                                return java.lang.Boolean.valueOf(z);
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        barVar2 = dVar.y;
                        zbadVar = dVar.x;
                        od.p.E(obj);
                        zbadVar.a(barVar2.a((java.lang.String) obj).b());
                        t7.e c = c();
                        dVar.x = null;
                        dVar.y = null;
                        dVar.B = 3;
                    } else {
                        od.p.E(obj);
                    }
                } else {
                    od.p.E(obj);
                    a11.h hVar = this.c;
                    z6.bar barVar3 = new z6.bar();
                    dVar.B = 1;
                    if (hVar.a(barVar3, dVar) == barVar) {
                        return barVar;
                    }
                }
                android.content.Context context = this.a;
                com.google.android.gms.common.internal.Preconditions.i(context);
                com.google.android.gms.internal.auth-api.zbad zbadVar2 = new com.google.android.gms.internal.auth-api.zbad(context, (com.google.android.gms.auth.api.identity.zba) new java.lang.Object());
                android.os.Parcelable.Creator creator = com.google.android.gms.auth.api.identity.ClearTokenRequest.CREATOR;
                com.google.android.gms.auth.api.identity.bar builder = new com.google.android.gms.auth.api.identity.ClearTokenRequest.Builder();
                t7.e c2 = c();
                y7.b bVar = f;
                dVar.x = zbadVar2;
                dVar.y = builder;
                dVar.B = 2;
                G = ef0.a.G(c2, bVar, "", dVar);
                if (G == barVar) {
                    barVar2 = builder;
                    obj = G;
                    zbadVar = zbadVar2;
                    zbadVar.a(barVar2.a((java.lang.String) obj).b());
                    t7.e c3 = c();
                    dVar.x = null;
                    dVar.y = null;
                    dVar.B = 3;
                } else {
                    return barVar;
                }
            }
        }
        dVar = new com.truecaller.google_login.d(this, quxVar);
        java.lang.Object obj2 = dVar.z;
        barVar = ef3.bar.a;
        i = dVar.B;
        boolean z2 = true;
        if (i == 0) {
        }
        android.content.Context context2 = this.a;
        com.google.android.gms.common.internal.Preconditions.i(context2);
        com.google.android.gms.internal.auth-api.zbad zbadVar22 = new com.google.android.gms.internal.auth-api.zbad(context2, (com.google.android.gms.auth.api.identity.zba) new java.lang.Object());
        android.os.Parcelable.Creator creator2 = com.google.android.gms.auth.api.identity.ClearTokenRequest.CREATOR;
        com.google.android.gms.auth.api.identity.bar builder2 = new com.google.android.gms.auth.api.identity.ClearTokenRequest.Builder();
        t7.e c23 = c();
        y7.b bVar2 = f;
        dVar.x = zbadVar22;
        dVar.y = builder2;
        dVar.B = 2;
        G = ef0.a.G(c23, bVar2, "", dVar);
        if (G == barVar) {
        }
    }

    public final t7.e c() {
        return (t7.e) this.d.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(10:5|6|7|(1:(1:(1:(3:12|13|(2:15|16)(2:18|(2:20|21)(2:22|(2:24|25)(2:26|27))))(2:28|29))(4:30|31|32|33))(1:35))(3:45|46|(2:48|43))|36|(1:44)|40|(2:42|43)|32|33))|53|6|7|(0)(0)|36|(1:38)|44|40|(0)|32|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0045, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
    
        r10 = c();
        r0.x = r9;
        r0.y = null;
        r0.B = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b3, code lost:
    
        if (ef0.a.W(r10, r3, false, r0) != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(android.app.Activity activity, com.truecaller.google_login.j jVar, df3.bar barVar) {
        com.truecaller.google_login.e eVar;
        ef3.bar barVar2;
        int i;
        y7.b bVar;
        com.google.android.gms.internal.ads.ej ejVar;
        oq.qux o;
        t7.e c;
        if (barVar instanceof com.truecaller.google_login.e) {
            eVar = (com.truecaller.google_login.e) barVar;
            int i2 = eVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.B = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = eVar.z;
                barVar2 = ef3.bar.a;
                i = eVar.B;
                bVar = e;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                e = eVar.x;
                                od.p.E(obj);
                                if (e instanceof a7.f) {
                                    return new com.truecaller.google_login.n((a7.f) e);
                                }
                                if (e instanceof a7.d) {
                                    return new com.truecaller.google_login.m((a7.d) e);
                                }
                                if (e instanceof a7.a) {
                                    return new com.truecaller.google_login.k((a7.a) e);
                                }
                                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
                                return new com.truecaller.google_login.l(e);
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o = eVar.y;
                        z6.h hVar = eVar.x;
                        od.p.E(obj);
                        return new com.truecaller.google_login.o(com.truecaller.google_login.b.a(o.d));
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    a11.h hVar2 = this.c;
                    z6.g e2 = e(jVar, activity);
                    eVar.B = 1;
                    obj = hVar2.h(activity, e2, eVar);
                    if (obj == barVar2) {
                        return barVar2;
                    }
                }
                z6.h hVar3 = (z6.h) obj;
                ejVar = hVar3.a;
                if ((ejVar instanceof z6.e) || !kotlin.jvm.internal.Intrinsics.b((java.lang.String) ejVar.b, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(new java.lang.IllegalStateException("Invalid credential type"), "exception");
                }
                o = qk3.p.o((android.os.Bundle) hVar3.a.c);
                c = c();
                eVar.x = null;
                eVar.y = o;
                eVar.B = 2;
                if (ef0.a.W(c, bVar, true, eVar) == barVar2) {
                    return barVar2;
                }
                return new com.truecaller.google_login.o(com.truecaller.google_login.b.a(o.d));
            }
        }
        eVar = new com.truecaller.google_login.e(this, barVar);
        java.lang.Object obj2 = eVar.z;
        barVar2 = ef3.bar.a;
        i = eVar.B;
        bVar = e;
        if (i == 0) {
        }
        z6.h hVar32 = (z6.h) obj2;
        ejVar = hVar32.a;
        if (ejVar instanceof z6.e) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(new java.lang.IllegalStateException("Invalid credential type"), "exception");
        o = qk3.p.o((android.os.Bundle) hVar32.a.c);
        c = c();
        eVar.x = null;
        eVar.y = o;
        eVar.B = 2;
        if (ef0.a.W(c, bVar, true, eVar) == barVar2) {
        }
        return new com.truecaller.google_login.o(com.truecaller.google_login.b.a(o.d));
    }
}
