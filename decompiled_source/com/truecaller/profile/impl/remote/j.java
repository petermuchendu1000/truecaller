package com.truecaller.profile.impl.remote;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class j extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.truecaller.profile.impl.remote.p A;
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(boolean z, com.truecaller.profile.impl.remote.p pVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = z;
        this.A = pVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.profile.impl.remote.j(this.z, this.A, barVar, 0);
            default:
                return new com.truecaller.profile.impl.remote.j(this.z, this.A, barVar, 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0131  */
    /* JADX WARN: Type inference failed for: r4v2, types: [gd3.k1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [gd3.k1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pg2.i iVar;
        java.lang.Object W;
        java.lang.Object k;
        java.lang.Object K;
        boolean z;
        pg2.m mVar;
        java.lang.String str;
        java.lang.String str2;
        kotlin.Pair o;
        java.lang.Object k2;
        xe0.o0 r;
        java.lang.Object L;
        int i = this.x;
        boolean z2 = this.z;
        com.truecaller.profile.impl.remote.p pVar = this.A;
        switch (i) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i2 = this.y;
                java.lang.Long l = null;
                try {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    od.p.E(obj);
                                    W = obj;
                                    wg2.f fVar = (wg2.f) W;
                                    z = fVar.c;
                                    com.truecaller.profile.impl.remote.model.ProfileResponseDto profileResponseDto = fVar.b;
                                    if (!z) {
                                        if (profileResponseDto != null) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileResponseDto, "<this>");
                                            java.lang.String firstName = profileResponseDto.getFirstName();
                                            if (firstName == null) {
                                                str = "";
                                            } else {
                                                str = firstName;
                                            }
                                            java.lang.String lastName = profileResponseDto.getLastName();
                                            if (lastName == null) {
                                                str2 = "";
                                            } else {
                                                str2 = lastName;
                                            }
                                            mVar = new pg2.m(str, str2, profileResponseDto.getPersonalData().getGender(), profileResponseDto.getPersonalData().getAddress().getStreet(), profileResponseDto.getPersonalData().getAddress().getCity(), profileResponseDto.getPersonalData().getAddress().getZipCode(), (java.lang.String) null, profileResponseDto.getPersonalData().getOnlineIds().getFacebookId(), profileResponseDto.getPersonalData().getOnlineIds().getEmail(), profileResponseDto.getPersonalData().getOnlineIds().getUrl(), profileResponseDto.getPersonalData().getOnlineIds().getGoogleIdToken(), profileResponseDto.getPersonalData().getAvatarUrl(), (com.truecaller.profile.api.model.AvatarState) null, (java.lang.Long) kotlin.collections.CollectionsKt.firstOrNull(profileResponseDto.getPersonalData().getTags()), profileResponseDto.getPersonalData().getCompanyName(), profileResponseDto.getPersonalData().getJobTitle(), profileResponseDto.getPersonalData().getAbout(), profileResponseDto.getPersonalData().getBirthday(), profileResponseDto.getPersonalData().getVerifiedName(), 4160);
                                        } else {
                                            mVar = null;
                                        }
                                        if (profileResponseDto != null) {
                                            l = new java.lang.Long(profileResponseDto.getUserId());
                                        }
                                        return new pg2.j(mVar, l);
                                    }
                                    return new pg2.i(new java.lang.Integer(fVar.a));
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            od.p.E(obj);
                            K = obj;
                        } else {
                            od.p.E(obj);
                            k = obj;
                            if (k == null) {
                                we0.h hVar = (we0.h) k;
                                xe0.f0 build = xe0.f0.c().build();
                                kotlin.jvm.internal.Intrinsics.d(build);
                                this.y = 2;
                                K = hVar.K(build, (gd3.k1) new java.lang.Object(), this);
                                if (K == barVar) {
                                    return barVar;
                                }
                            } else {
                                throw new java.lang.IllegalArgumentException("Required value was null.");
                            }
                        }
                    } else {
                        od.p.E(obj);
                        if (!z2 && pVar.d.a()) {
                            com.truecaller.profile.impl.remote.t tVar = pVar.b;
                            this.y = 1;
                            k = wi0.bar.k(tVar, this);
                            if (k == barVar) {
                                return barVar;
                            }
                            if (k == null) {
                            }
                        } else {
                            com.truecaller.profile.impl.remote.g gVar = pVar.c;
                            this.y = 3;
                            W = fg3.h0.W(gVar.b, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c(gVar, (df3.bar) null, 5), this);
                            if (W == barVar) {
                                return barVar;
                            }
                            wg2.f fVar2 = (wg2.f) W;
                            z = fVar2.c;
                            com.truecaller.profile.impl.remote.model.ProfileResponseDto profileResponseDto2 = fVar2.b;
                            if (!z) {
                            }
                        }
                    }
                    return new pg2.j(es.baz.E((xe0.i0) K), (java.lang.Long) null);
                } catch (gd3.h2 e) {
                    iVar = new pg2.i(new java.lang.Integer(e.a.a.a));
                    return iVar;
                } catch (gd3.i2 e2) {
                    iVar = new pg2.i(new java.lang.Integer(e2.a.a.a));
                    return iVar;
                } catch (java.util.concurrent.CancellationException e3) {
                    throw e3;
                } catch (java.lang.Exception unused) {
                    return new pg2.i((java.lang.Integer) null);
                }
            default:
                ef3.bar barVar2 = ef3.bar.a;
                int i3 = this.y;
                try {
                } catch (java.util.concurrent.CancellationException e4) {
                    throw e4;
                } catch (java.lang.Exception e5) {
                    kotlin.o oVar = kotlin.q.b;
                    o = od.p.o(e5);
                }
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            od.p.E(obj);
                            L = obj;
                            r = (xe0.o0) L;
                            kotlin.o oVar2 = kotlin.q.b;
                            o = new kotlin.Pair(od.p.I(r), od.p.K(r));
                            return new kotlin.q(o);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    k2 = obj;
                } else {
                    od.p.E(obj);
                    if (z2) {
                        r = pVar.f.r();
                        kotlin.o oVar22 = kotlin.q.b;
                        o = new kotlin.Pair(od.p.I(r), od.p.K(r));
                        return new kotlin.q(o);
                    }
                    com.truecaller.profile.impl.remote.t tVar2 = pVar.b;
                    this.y = 1;
                    k2 = wi0.bar.k(tVar2, this);
                    if (k2 == barVar2) {
                        return barVar2;
                    }
                }
                if (k2 != null) {
                    xe0.l0 build2 = xe0.l0.c().build();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
                    this.y = 2;
                    L = ((we0.h) k2).L(build2, (gd3.k1) new java.lang.Object(), this);
                    if (L == barVar2) {
                        return barVar2;
                    }
                    r = (xe0.o0) L;
                    kotlin.o oVar222 = kotlin.q.b;
                    o = new kotlin.Pair(od.p.I(r), od.p.K(r));
                    return new kotlin.q(o);
                }
                throw new java.lang.IllegalArgumentException("Required value was null.");
        }
    }
}
