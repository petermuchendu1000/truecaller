package com.truecaller.editprofile.impl.ui.legacy;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class q extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.truecaller.editprofile.impl.ui.legacy.s A;
    public final /* synthetic */ int x;
    public com.truecaller.editprofile.impl.ui.legacy.h y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.truecaller.editprofile.impl.ui.legacy.s sVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.A = sVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.editprofile.impl.ui.legacy.q(this.A, barVar, 0);
            default:
                return new com.truecaller.editprofile.impl.ui.legacy.q(this.A, barVar, 1);
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object f;
        com.truecaller.editprofile.impl.ui.legacy.h hVar;
        java.lang.Object c;
        com.truecaller.editprofile.impl.ui.legacy.h hVar2;
        com.truecaller.editprofile.impl.ui.legacy.h hVar3;
        boolean z;
        com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig;
        java.lang.Object a;
        com.truecaller.editprofile.impl.ui.legacy.h hVar4;
        int i = this.x;
        com.truecaller.editprofile.impl.ui.legacy.s sVar = this.A;
        switch (i) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i2 = this.z;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            hVar2 = this.y;
                            od.p.E(obj);
                            c = obj;
                            if (!((java.lang.Boolean) c).booleanValue()) {
                                hVar = hVar2;
                                z = true;
                                hVar2 = hVar;
                                com.truecaller.editprofile.impl.ui.legacy.d dVar = (com.truecaller.editprofile.impl.ui.legacy.d) hVar2;
                                avatarXConfig = dVar.a6().h0;
                                if (avatarXConfig != null) {
                                    dVar.a6().C2(com.truecaller.common.ui.avatar.AvatarXConfig.a(avatarXConfig, (android.net.Uri) null, (java.lang.String) null, false, false, false, false, (java.lang.Integer) null, false, false, false, false, z, (java.lang.String) null, false, false, -33554433), true);
                                }
                                kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.editprofile.impl.ui.legacy.s.D;
                                hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                                if (hVar3 != null) {
                                    ((com.truecaller.editprofile.impl.ui.legacy.d) hVar3).n6(true);
                                }
                                return kotlin.Unit.a;
                            }
                            z = false;
                            com.truecaller.editprofile.impl.ui.legacy.d dVar2 = (com.truecaller.editprofile.impl.ui.legacy.d) hVar2;
                            avatarXConfig = dVar2.a6().h0;
                            if (avatarXConfig != null) {
                            }
                            kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.editprofile.impl.ui.legacy.s.D;
                            hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                            if (hVar3 != null) {
                            }
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    f = obj;
                } else {
                    od.p.E(obj);
                    rg2.m mVar = sVar.e;
                    this.z = 1;
                    f = mVar.f(this);
                    if (f == barVar) {
                        return barVar;
                    }
                }
                pg2.m mVar2 = (pg2.m) f;
                java.lang.String avatarUrl = mVar2.getAvatarUrl();
                if (avatarUrl != null && avatarUrl.length() != 0) {
                    kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.editprofile.impl.ui.legacy.s.D;
                    com.truecaller.editprofile.impl.ui.legacy.h hVar5 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                    if (hVar5 != null) {
                        ((com.truecaller.editprofile.impl.ui.legacy.d) hVar5).l6(avatarUrl);
                    }
                    hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                    if (hVar != null) {
                        if (!mVar2.u()) {
                            xg2.a aVar = sVar.n;
                            this.y = hVar;
                            this.z = 2;
                            c = aVar.c(this);
                            if (c != barVar) {
                                hVar2 = hVar;
                                if (!((java.lang.Boolean) c).booleanValue()) {
                                }
                            } else {
                                return barVar;
                            }
                        }
                        z = true;
                        hVar2 = hVar;
                        com.truecaller.editprofile.impl.ui.legacy.d dVar22 = (com.truecaller.editprofile.impl.ui.legacy.d) hVar2;
                        avatarXConfig = dVar22.a6().h0;
                        if (avatarXConfig != null) {
                        }
                    }
                    kotlin.reflect.KProperty[] kPropertyArr22 = com.truecaller.editprofile.impl.ui.legacy.s.D;
                    hVar3 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                    if (hVar3 != null) {
                    }
                    return kotlin.Unit.a;
                }
                kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.editprofile.impl.ui.legacy.s.D;
                com.truecaller.editprofile.impl.ui.legacy.h hVar6 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar6 != null) {
                    ((com.truecaller.editprofile.impl.ui.legacy.d) hVar6).o6();
                }
                com.truecaller.editprofile.impl.ui.legacy.h hVar7 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar7 != null) {
                    ((com.truecaller.editprofile.impl.ui.legacy.d) hVar7).n6(false);
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar2 = ef3.bar.a;
                int i3 = this.z;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hVar4 = this.y;
                        od.p.E(obj);
                        a = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    kotlin.reflect.KProperty[] kPropertyArr5 = com.truecaller.editprofile.impl.ui.legacy.s.D;
                    com.truecaller.editprofile.impl.ui.legacy.h hVar8 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                    if (hVar8 != null) {
                        tg2.e eVar = sVar.q;
                        this.y = hVar8;
                        this.z = 1;
                        a = eVar.a(this);
                        if (a != barVar2) {
                            hVar4 = hVar8;
                        } else {
                            return barVar2;
                        }
                    }
                    return kotlin.Unit.a;
                }
                int intValue = ((java.lang.Number) a).intValue();
                com.truecaller.common.ui.avatar.AvatarXView avatarXView = (com.truecaller.common.ui.avatar.AvatarXView) ((com.truecaller.editprofile.impl.ui.legacy.d) hVar4).g0.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(avatarXView, "<get-avatarView>(...)");
                avatarXView.j(intValue, true);
                return kotlin.Unit.a;
        }
    }
}
