package com.truecaller.profile.impl.remote;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class p {
    public final kotlin.coroutines.CoroutineContext a;
    public final com.truecaller.profile.impl.remote.t b;
    public final com.truecaller.profile.impl.remote.g c;
    public final qo1.r d;
    public final xg2.c e;
    public final com.google.android.gms.internal.auth.e f;
    public final qg2.bar g;

    public p(kotlin.coroutines.CoroutineContext coroutineContext, com.truecaller.profile.impl.remote.t tVar, com.truecaller.profile.impl.remote.g gVar, qo1.r rVar, xg2.c cVar, com.google.android.gms.internal.auth.e eVar, qg2.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "io");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "api");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "networkHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "searchFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "errorMessageHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "configurationJsonHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "avatarHelper");
        this.a = coroutineContext;
        this.b = tVar;
        this.c = gVar;
        this.d = rVar;
        this.e = cVar;
        this.f = eVar;
        this.g = barVar;
    }

    public static final com.truecaller.profile.api.model.ProfileError a(com.truecaller.profile.impl.remote.p pVar, com.truecaller.profile.api.model.ProfileSaveError profileSaveError) {
        java.lang.String fieldName = profileSaveError.getFieldName();
        xg2.c cVar = pVar.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileSaveError, com.truecaller.suspension.data.UnSuspendAccountSuccessResponseDto.REASON_ERROR);
        java.lang.String h = ((u03.g0) cVar.a).h(xg2.c.c(profileSaveError), new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
        return new com.truecaller.profile.api.model.ProfileError(fieldName, h);
    }

    public static final com.truecaller.profile.api.model.ProfileError b(com.truecaller.profile.impl.remote.p pVar, xe0.f2 f2Var) {
        java.lang.String b = f2Var.b();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getFieldName(...)");
        java.lang.String message = f2Var.getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
        return new com.truecaller.profile.api.model.ProfileError(b, message);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        if (r8 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(pg2.i0 i0Var, ff3.qux quxVar) {
        com.truecaller.profile.impl.remote.i iVar;
        int i;
        if (quxVar instanceof com.truecaller.profile.impl.remote.i) {
            iVar = (com.truecaller.profile.impl.remote.i) quxVar;
            int i2 = iVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = iVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = iVar.z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return (okhttp3.RequestBody) obj;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    return (okhttp3.RequestBody) obj;
                }
                od.p.E(obj);
                boolean z = i0Var instanceof pg2.g0;
                qg2.bar barVar2 = this.g;
                if (z) {
                    java.lang.String str = ((pg2.g0) i0Var).a;
                    iVar.z = 1;
                    xg2.a aVar = (xg2.a) barVar2;
                    obj = fg3.h0.W(aVar.b, new w91.baz(aVar, str, (df3.bar) null, 22), iVar);
                } else {
                    kotlin.jvm.internal.Intrinsics.e(i0Var, "null cannot be cast to non-null type com.truecaller.profile.api.model.UpdateAvatarParams.FromUri");
                    android.net.Uri uri = ((pg2.h0) i0Var).a;
                    if (!kotlin.jvm.internal.Intrinsics.b(uri.getScheme(), "http") && !kotlin.jvm.internal.Intrinsics.b(uri.getScheme(), com.unity3d.services.core.network.model.HttpRequest.DEFAULT_SCHEME)) {
                        ((xg2.a) barVar2).getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "avatarUri");
                        java.lang.String path = uri.getPath();
                        if (path == null) {
                            return null;
                        }
                        okhttp3.RequestBody.Companion companion = okhttp3.RequestBody.Companion;
                        okhttp3.MediaType.d.getClass();
                        okhttp3.MediaType b = okhttp3.MediaType.Companion.b("image/jpeg");
                        java.io.File file = new java.io.File(path);
                        companion.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
                        return okhttp3.RequestBody.Companion.a(file, b);
                    }
                    java.lang.String uri2 = uri.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                    iVar.z = 2;
                    xg2.a aVar2 = (xg2.a) barVar2;
                    obj = fg3.h0.W(aVar2.b, new w91.baz(aVar2, uri2, (df3.bar) null, 22), iVar);
                }
                return barVar;
            }
        }
        iVar = new com.truecaller.profile.impl.remote.i(this, quxVar);
        java.lang.Object obj2 = iVar.x;
        ef3.bar barVar3 = ef3.bar.a;
        i = iVar.z;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(ff3.qux quxVar) {
        com.truecaller.profile.impl.remote.k kVar;
        int i;
        if (quxVar instanceof com.truecaller.profile.impl.remote.k) {
            kVar = (com.truecaller.profile.impl.remote.k) quxVar;
            int i2 = kVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = kVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = kVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.call_assistant.presentation.disable.c cVar = new com.truecaller.call_assistant.presentation.disable.c(this, (df3.bar) null, 4);
                    kVar.z = 1;
                    obj = fg3.h0.W(this.a, cVar, kVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                return ((kotlin.q) obj).a;
            }
        }
        kVar = new com.truecaller.profile.impl.remote.k(this, quxVar);
        java.lang.Object obj2 = kVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = kVar.z;
        if (i == 0) {
        }
        return ((kotlin.q) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object e(boolean z, ff3.qux quxVar) {
        com.truecaller.profile.impl.remote.l lVar;
        int i;
        if (quxVar instanceof com.truecaller.profile.impl.remote.l) {
            lVar = (com.truecaller.profile.impl.remote.l) quxVar;
            int i2 = lVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = lVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = lVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.profile.impl.remote.j jVar = new com.truecaller.profile.impl.remote.j(z, this, null, 1);
                    lVar.z = 1;
                    obj = fg3.h0.W(this.a, jVar, lVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                return ((kotlin.q) obj).a;
            }
        }
        lVar = new com.truecaller.profile.impl.remote.l(this, quxVar);
        java.lang.Object obj2 = lVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = lVar.z;
        if (i == 0) {
        }
        return ((kotlin.q) obj2).a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (r12 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object f(pg2.i0 i0Var, ff3.qux quxVar) {
        com.truecaller.profile.impl.remote.n nVar;
        int i;
        okhttp3.RequestBody requestBody;
        if (quxVar instanceof com.truecaller.profile.impl.remote.n) {
            nVar = (com.truecaller.profile.impl.remote.n) quxVar;
            int i2 = nVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = nVar.y;
                java.lang.Object obj2 = ef3.bar.a;
                i = nVar.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return obj;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i0Var = nVar.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    nVar.x = i0Var;
                    nVar.A = 1;
                    obj = c(i0Var, nVar);
                }
                requestBody = (okhttp3.RequestBody) obj;
                if (requestBody != null) {
                    return pg2.bar.a;
                }
                nVar.x = null;
                nVar.A = 2;
                com.truecaller.profile.impl.remote.g gVar = this.c;
                java.lang.Object W = fg3.h0.W(gVar.b, new com.truecaller.profile.impl.remote.e(requestBody, gVar, i0Var.getSource(), (df3.bar) null, 0), nVar);
                if (W == obj2) {
                    return obj2;
                }
                return W;
            }
        }
        nVar = new com.truecaller.profile.impl.remote.n(this, quxVar);
        java.lang.Object obj3 = nVar.y;
        java.lang.Object obj22 = ef3.bar.a;
        i = nVar.A;
        if (i == 0) {
        }
        requestBody = (okhttp3.RequestBody) obj3;
        if (requestBody != null) {
        }
    }
}
