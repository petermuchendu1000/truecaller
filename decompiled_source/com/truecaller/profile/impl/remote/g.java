package com.truecaller.profile.impl.remote;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class g implements fg3.e0 {
    public final qc3.bar a;
    public final kotlin.coroutines.CoroutineContext b;
    public final qc3.bar c;

    public g(kotlin.coroutines.CoroutineContext coroutineContext, qc3.bar barVar, qc3.bar barVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "adapter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "avatarHelper");
        this.a = barVar;
        this.b = coroutineContext;
        this.c = barVar2;
    }

    public static com.truecaller.profile.api.model.ProfileSaveResult b(wj3.k0 k0Var) {
        com.google.gson.Gson gson;
        java.lang.reflect.Type type;
        int i = k0Var.a.d;
        if (i != 204) {
            if (i != 400) {
                java.io.Reader reader = null;
                if (i != 422) {
                    if (i != 500) {
                        if (i != 403) {
                            if (i != 404) {
                                return new com.truecaller.profile.api.model.ProfileSaveResult(i, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                            }
                            return pg2.c0.a;
                        }
                        return pg2.y.a;
                    }
                    return pg2.z.a;
                }
                com.truecaller.profile.impl.remote.model.ProfileSaveErrorResponse.Companion.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k0Var, "response");
                gson = com.truecaller.profile.impl.remote.model.ProfileSaveErrorResponse.gson;
                okhttp3.ResponseBody responseBody = k0Var.c;
                if (responseBody != null) {
                    reader = responseBody.charStream();
                }
                type = com.truecaller.profile.impl.remote.model.ProfileSaveErrorResponse.type;
                java.lang.Object fromJson = gson.fromJson(reader, type);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
                kotlin.collections.h0 errors = ((com.truecaller.profile.impl.remote.model.ProfileSaveErrorResponse) fromJson).getErrors();
                if (errors == null) {
                    errors = kotlin.collections.h0.a;
                }
                return new com.truecaller.profile.api.model.ProfileSaveResult.UnprocessableEntity(errors);
            }
            return pg2.x.a;
        }
        return pg2.d0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.truecaller.profile.impl.remote.model.CreateProfileRequestDto createProfileRequestDto, ff3.qux quxVar) {
        com.truecaller.profile.impl.remote.c cVar;
        int i;
        try {
            if (quxVar instanceof com.truecaller.profile.impl.remote.c) {
                cVar = (com.truecaller.profile.impl.remote.c) quxVar;
                int i2 = cVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.z = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = cVar.x;
                    ef3.bar barVar = ef3.bar.a;
                    i = cVar.z;
                    if (i == 0) {
                        if (i == 1) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        com.truecaller.profile.impl.remote.q qVar = (com.truecaller.profile.impl.remote.q) this.a.get();
                        cVar.z = 1;
                        obj = qVar.a(createProfileRequestDto, cVar);
                        if (obj == barVar) {
                            return barVar;
                        }
                    }
                    return b((wj3.k0) obj);
                }
            }
            if (i == 0) {
            }
            return b((wj3.k0) obj);
        } catch (java.io.IOException unused) {
            return new com.truecaller.profile.api.model.ProfileSaveResult(0, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        cVar = new com.truecaller.profile.impl.remote.c(this, quxVar);
        java.lang.Object obj2 = cVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = cVar.z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(com.truecaller.profile.impl.remote.model.UpdateProfileRequestDto updateProfileRequestDto, ff3.qux quxVar) {
        com.truecaller.profile.impl.remote.d dVar;
        int i;
        try {
            if (quxVar instanceof com.truecaller.profile.impl.remote.d) {
                dVar = (com.truecaller.profile.impl.remote.d) quxVar;
                int i2 = dVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dVar.z = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = dVar.x;
                    ef3.bar barVar = ef3.bar.a;
                    i = dVar.z;
                    if (i == 0) {
                        if (i == 1) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        com.truecaller.profile.impl.remote.q qVar = (com.truecaller.profile.impl.remote.q) this.a.get();
                        dVar.z = 1;
                        obj = qVar.b(updateProfileRequestDto, dVar);
                        if (obj == barVar) {
                            return barVar;
                        }
                    }
                    return b((wj3.k0) obj);
                }
            }
            if (i == 0) {
            }
            return b((wj3.k0) obj);
        } catch (java.io.IOException unused) {
            return new com.truecaller.profile.api.model.ProfileSaveResult(0, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        dVar = new com.truecaller.profile.impl.remote.d(this, quxVar);
        java.lang.Object obj2 = dVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = dVar.z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(ff3.qux quxVar) {
        com.truecaller.profile.impl.remote.f fVar;
        int i;
        try {
            if (quxVar instanceof com.truecaller.profile.impl.remote.f) {
                fVar = (com.truecaller.profile.impl.remote.f) quxVar;
                int i2 = fVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fVar.z = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = fVar.x;
                    ef3.bar barVar = ef3.bar.a;
                    i = fVar.z;
                    if (i == 0) {
                        if (i == 1) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        com.truecaller.profile.impl.remote.q qVar = (com.truecaller.profile.impl.remote.q) this.a.get();
                        fVar.z = 1;
                        obj = qVar.c(fVar);
                        if (obj == barVar) {
                            return barVar;
                        }
                    }
                    return b((wj3.k0) obj);
                }
            }
            if (i == 0) {
            }
            return b((wj3.k0) obj);
        } catch (java.io.IOException unused) {
            return new com.truecaller.profile.api.model.ProfileSaveResult(0, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        fVar = new com.truecaller.profile.impl.remote.f(this, quxVar);
        java.lang.Object obj2 = fVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = fVar.z;
    }

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.b;
    }
}
