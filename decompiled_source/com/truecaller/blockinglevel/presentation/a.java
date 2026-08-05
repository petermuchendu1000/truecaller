package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class a implements ig3.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ a(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a9, code lost:
    
        if (r2.emit(r11, r3) == r4) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        if (r2.emit(com.truecaller.blockinglevel.presentation.c0.a, r3) == r4) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ca, code lost:
    
        if (r2.emit(com.truecaller.blockinglevel.presentation.z.a, r3) == r4) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(com.truecaller.blockinglevel.presentation.PurchaseResult purchaseResult, df3.bar barVar) {
        com.truecaller.blockinglevel.presentation.y yVar;
        int i;
        com.truecaller.blockinglevel.api.BlockLevel blockLevel;
        com.truecaller.premium.PremiumLaunchContext.Static r12;
        com.truecaller.blockinglevel.presentation.f0 f0Var = (com.truecaller.blockinglevel.presentation.f0) this.b;
        ig3.q1 q1Var = f0Var.f;
        ig3.v1 v1Var = f0Var.g;
        if (barVar instanceof com.truecaller.blockinglevel.presentation.y) {
            yVar = (com.truecaller.blockinglevel.presentation.y) barVar;
            int i2 = yVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = yVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = yVar.z;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                od.p.E(obj);
                                com.truecaller.blockinglevel.presentation.f0.o(f0Var, false);
                            } else {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            od.p.E(obj);
                            com.truecaller.blockinglevel.presentation.f0.o(f0Var, false);
                        }
                    } else {
                        od.p.E(obj);
                        com.truecaller.blockinglevel.presentation.f0.o(f0Var, false);
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.blockinglevel.presentation.w wVar = (com.truecaller.blockinglevel.presentation.w) q1Var.a.getValue();
                    com.truecaller.blockinglevel.api.BlockLevelLaunchContext blockLevelLaunchContext = null;
                    if (wVar != null) {
                        blockLevel = wVar.b;
                    } else {
                        blockLevel = null;
                    }
                    com.truecaller.blockinglevel.presentation.w wVar2 = (com.truecaller.blockinglevel.presentation.w) q1Var.a.getValue();
                    if (wVar2 != null) {
                        blockLevelLaunchContext = wVar2.c;
                    }
                    int i3 = com.truecaller.blockinglevel.presentation.x.a[purchaseResult.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 == 5) {
                                        com.truecaller.blockinglevel.presentation.f0.o(f0Var, true);
                                    } else {
                                        throw new java.lang.RuntimeException();
                                    }
                                } else {
                                    com.truecaller.blockinglevel.presentation.f0.o(f0Var, false);
                                }
                            } else {
                                f0Var.p(blockLevelLaunchContext, blockLevel);
                                com.truecaller.blockinglevel.presentation.w wVar3 = (com.truecaller.blockinglevel.presentation.w) f0Var.e.getValue();
                                if (wVar3 == null || (r12 = wVar3.b()) == null) {
                                    r12 = i82.r.Y8;
                                }
                                com.truecaller.blockinglevel.presentation.b0 b0Var = new com.truecaller.blockinglevel.presentation.b0(r12);
                                yVar.z = 3;
                            }
                        } else {
                            yVar.z = 2;
                        }
                    } else {
                        f0Var.p(blockLevelLaunchContext, blockLevel);
                        yVar.z = 1;
                    }
                    return barVar2;
                }
                return kotlin.Unit.a;
            }
        }
        yVar = new com.truecaller.blockinglevel.presentation.y(this, barVar);
        java.lang.Object obj2 = yVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = yVar.z;
        if (i == 0) {
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, com.truecaller.blockinglevel.presentation.BlockLevelActivity, java.lang.Object, android.app.Activity] */
    public final java.lang.Object emit(java.lang.Object obj, df3.bar barVar) {
        switch (this.a) {
            case 0:
                com.truecaller.blockinglevel.presentation.d0 d0Var = (com.truecaller.blockinglevel.presentation.d0) obj;
                ?? r4 = (com.truecaller.blockinglevel.presentation.BlockLevelActivity) this.b;
                if (kotlin.jvm.internal.Intrinsics.b(d0Var, com.truecaller.blockinglevel.presentation.a0.a)) {
                    int i = com.truecaller.blockinglevel.presentation.BlockLevelActivity.f0;
                    r4.finish();
                } else if (kotlin.jvm.internal.Intrinsics.b(d0Var, com.truecaller.blockinglevel.presentation.z.a)) {
                    int i2 = com.truecaller.blockinglevel.presentation.BlockLevelActivity.f0;
                    r4.setResult(-1);
                    r4.finish();
                } else if (d0Var instanceof com.truecaller.blockinglevel.presentation.b0) {
                    i82.r rVar = ((com.truecaller.blockinglevel.presentation.b0) d0Var).a;
                    i82.u uVar = r4.d0;
                    if (uVar != null) {
                        uVar.d((android.content.Context) r4, rVar);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("premiumScreenNavigator");
                        throw null;
                    }
                } else if (kotlin.jvm.internal.Intrinsics.b(d0Var, com.truecaller.blockinglevel.presentation.c0.a)) {
                    int i3 = com.truecaller.blockinglevel.presentation.BlockLevelActivity.f0;
                    i.d dVar = new i.d((android.content.Context) r4);
                    dVar.k(2132019710);
                    dVar.e(2132019709);
                    dVar.setPositiveButton(2132019708, new a42.a((java.lang.Object) r4, 4)).b(false).m();
                } else {
                    throw new java.lang.RuntimeException();
                }
                return kotlin.Unit.a;
            default:
                return a((com.truecaller.blockinglevel.presentation.PurchaseResult) obj, barVar);
        }
    }
}
