package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class l0 implements pt2.baz {
    public final uj0.qux a;
    public final dg.b0 b;
    public final mk.e c;
    public final qo1.v d;
    public final b91.baz e;
    public final com.truecaller.startup_dialogs.StartupDialogType f;
    public com.truecaller.blockinglevel.api.BlockLevel g;
    public com.truecaller.blockinglevel.api.BlockLevelVariant h;

    public l0(uj0.qux quxVar, dg.b0 b0Var, mk.e eVar, qo1.v vVar, b91.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "helper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "blockSettingsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "getBlockingLevelConfigUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "userGrowthFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "blockLevelNavigation");
        this.a = quxVar;
        this.b = b0Var;
        this.c = eVar;
        this.d = vVar;
        this.e = bazVar;
        this.f = com.truecaller.startup_dialogs.StartupDialogType.BLOCKING_LEVEL;
        this.g = com.truecaller.blockinglevel.api.BlockLevel.OFF;
        this.h = com.truecaller.blockinglevel.api.BlockLevelVariant.DEFAULT;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(12:5|6|7|(1:(1:10)(2:44|45))(2:46|(2:48|49)(2:50|(2:52|53)(4:54|(2:56|(2:58|(1:60)(2:70|71))(1:72))(1:73)|61|(2:67|(1:69))(2:65|66))))|11|12|(1:14)|15|(1:17)(1:42)|18|23|(2:28|29)(2:26|27)))|76|6|7|(0)(0)|11|12|(0)|15|(0)(0)|18|23|(0)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b5, code lost:
    
        r0 = kotlin.q.b;
        r6 = od.p.o(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(df3.bar barVar) {
        com.truecaller.blockinglevel.presentation.k0 k0Var;
        int i;
        com.truecaller.blockinglevel.api.internal.BlockLevelConfig o;
        com.truecaller.blockinglevel.api.internal.BlockLevelConfig blockLevelConfig;
        int i2;
        kotlin.Pair pair;
        com.truecaller.blockinglevel.api.BlockLevel blockLevel;
        com.truecaller.blockinglevel.api.BlockLevel blockLevel2;
        if (barVar instanceof com.truecaller.blockinglevel.presentation.k0) {
            k0Var = (com.truecaller.blockinglevel.presentation.k0) barVar;
            int i3 = k0Var.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k0Var.z = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = k0Var.x;
                java.lang.Object obj2 = ef3.bar.a;
                i = k0Var.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (!this.d.b.a("featureBlockSettingOnboarding", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                        return java.lang.Boolean.FALSE;
                    }
                    if (!((h93.baz) this.a.a).d("show_block_level", false)) {
                        return java.lang.Boolean.FALSE;
                    }
                    ((h93.baz) this.a.a).k("show_block_level", false);
                    int i4 = uj0.baz.a[((dg.b0) this.a.b).A().ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                blockLevel2 = com.truecaller.blockinglevel.api.BlockLevel.OFF;
                            } else {
                                throw new java.lang.RuntimeException();
                            }
                        } else {
                            blockLevel2 = com.truecaller.blockinglevel.api.BlockLevel.MAX;
                        }
                    } else {
                        blockLevel2 = com.truecaller.blockinglevel.api.BlockLevel.BASIC;
                    }
                    if (((er2.l0) this.b.a).l() && blockLevel2 != com.truecaller.blockinglevel.api.BlockLevel.OFF) {
                        return java.lang.Boolean.FALSE;
                    }
                    kotlin.o oVar = kotlin.q.b;
                    mk.e eVar = this.c;
                    k0Var.z = 1;
                    obj = eVar.h();
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                o = (com.truecaller.blockinglevel.api.internal.BlockLevelConfig) obj;
                kotlin.o oVar2 = kotlin.q.b;
                if (o instanceof kotlin.p) {
                    o = null;
                }
                blockLevelConfig = o;
                if (blockLevelConfig != null) {
                    i2 = -1;
                } else {
                    i2 = com.truecaller.blockinglevel.presentation.j0.a[blockLevelConfig.ordinal()];
                }
                switch (i2) {
                    case -1:
                    case 1:
                        pair = new kotlin.Pair((java.lang.Object) null, (java.lang.Object) null);
                        break;
                    case 0:
                    default:
                        throw new java.lang.RuntimeException();
                    case 2:
                        pair = new kotlin.Pair(com.truecaller.blockinglevel.api.BlockLevel.OFF, com.truecaller.blockinglevel.api.BlockLevelVariant.DEFAULT);
                        break;
                    case 3:
                        pair = new kotlin.Pair(com.truecaller.blockinglevel.api.BlockLevel.BASIC, com.truecaller.blockinglevel.api.BlockLevelVariant.DEFAULT);
                        break;
                    case 4:
                        pair = new kotlin.Pair(com.truecaller.blockinglevel.api.BlockLevel.MAX, com.truecaller.blockinglevel.api.BlockLevelVariant.DEFAULT);
                        break;
                    case 5:
                        pair = new kotlin.Pair(com.truecaller.blockinglevel.api.BlockLevel.OFF, com.truecaller.blockinglevel.api.BlockLevelVariant.BUTTON);
                        break;
                    case 6:
                        pair = new kotlin.Pair(com.truecaller.blockinglevel.api.BlockLevel.BASIC, com.truecaller.blockinglevel.api.BlockLevelVariant.BUTTON);
                        break;
                    case 7:
                        pair = new kotlin.Pair(com.truecaller.blockinglevel.api.BlockLevel.MAX, com.truecaller.blockinglevel.api.BlockLevelVariant.BUTTON);
                        break;
                    case 8:
                        pair = new kotlin.Pair(com.truecaller.blockinglevel.api.BlockLevel.OFF, com.truecaller.blockinglevel.api.BlockLevelVariant.CARD);
                        break;
                    case 9:
                        pair = new kotlin.Pair(com.truecaller.blockinglevel.api.BlockLevel.BASIC, com.truecaller.blockinglevel.api.BlockLevelVariant.CARD);
                        break;
                    case 10:
                        pair = new kotlin.Pair(com.truecaller.blockinglevel.api.BlockLevel.MAX, com.truecaller.blockinglevel.api.BlockLevelVariant.CARD);
                        break;
                    case 11:
                        pair = new kotlin.Pair(com.truecaller.blockinglevel.api.BlockLevel.OFF, com.truecaller.blockinglevel.api.BlockLevelVariant.FRAUD);
                        break;
                    case 12:
                        pair = new kotlin.Pair(com.truecaller.blockinglevel.api.BlockLevel.BASIC, com.truecaller.blockinglevel.api.BlockLevelVariant.FRAUD);
                        break;
                    case 13:
                        pair = new kotlin.Pair(com.truecaller.blockinglevel.api.BlockLevel.MAX, com.truecaller.blockinglevel.api.BlockLevelVariant.FRAUD);
                        break;
                }
                blockLevel = (com.truecaller.blockinglevel.api.BlockLevel) pair.a;
                com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant = (com.truecaller.blockinglevel.api.BlockLevelVariant) pair.b;
                if (blockLevel == null && blockLevelVariant != null) {
                    this.h = blockLevelVariant;
                    this.g = blockLevel;
                    ((b93.d) this.a.c).a = true;
                    return java.lang.Boolean.TRUE;
                }
                return java.lang.Boolean.FALSE;
            }
        }
        k0Var = new com.truecaller.blockinglevel.presentation.k0(this, (ff3.qux) barVar);
        java.lang.Object obj3 = k0Var.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = k0Var.z;
        if (i == 0) {
        }
        o = (com.truecaller.blockinglevel.api.internal.BlockLevelConfig) obj3;
        kotlin.o oVar22 = kotlin.q.b;
        if (o instanceof kotlin.p) {
        }
        blockLevelConfig = o;
        if (blockLevelConfig != null) {
        }
        switch (i2) {
        }
        blockLevel = (com.truecaller.blockinglevel.api.BlockLevel) pair.a;
        com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant2 = (com.truecaller.blockinglevel.api.BlockLevelVariant) pair.b;
        if (blockLevel == null) {
        }
        return java.lang.Boolean.FALSE;
    }

    public final android.content.Intent c(androidx.fragment.app.FragmentActivity fragmentActivity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "fromActivity");
        return this.e.l(fragmentActivity, this.g, this.h, com.truecaller.blockinglevel.api.BlockLevelLaunchContext.POST_REGISTRATION);
    }

    public final com.truecaller.startup_dialogs.StartupDialogType d() {
        return this.f;
    }

    public final /* bridge */ void e(com.truecaller.startup_dialogs.StartupDialogDismissReason startupDialogDismissReason) {
    }

    public final /* bridge */ void f() {
    }

    public final boolean g() {
        return true;
    }

    public final /* bridge */ int h() {
        return 0;
    }

    public final /* bridge */ int i() {
        return 0;
    }
}
