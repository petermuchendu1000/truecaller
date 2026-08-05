package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class bar implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.blockinglevel.presentation.w b;
    public final /* synthetic */ com.truecaller.blockinglevel.presentation.BlockLevelActivity c;

    public /* synthetic */ bar(com.truecaller.blockinglevel.presentation.w wVar, com.truecaller.blockinglevel.presentation.BlockLevelActivity blockLevelActivity, int i) {
        this.a = i;
        this.b = wVar;
        this.c = blockLevelActivity;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        java.lang.String t;
        java.lang.String v;
        com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary buttonStylePrimary;
        java.lang.String v2;
        com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary buttonStylePrimary2;
        int i3 = this.a;
        v2.c cVar = v2.k.a;
        com.truecaller.blockinglevel.presentation.BlockLevelActivity blockLevelActivity = this.c;
        com.truecaller.blockinglevel.presentation.w wVar = this.b;
        boolean z3 = false;
        int i4 = 1;
        switch (i3) {
            case 0:
                v2.n nVar = (v2.n) obj;
                int intValue = ((java.lang.Integer) obj2).intValue();
                int i5 = com.truecaller.blockinglevel.presentation.BlockLevelActivity.f0;
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                if (nVar.P(intValue & 1, z3)) {
                    re2.baz.a(d3.a.d(741808678, new com.truecaller.blockinglevel.presentation.bar(wVar, blockLevelActivity, i4), nVar), nVar, 6);
                } else {
                    nVar.S();
                }
                return kotlin.Unit.a;
            case 1:
                v2.n nVar2 = (v2.n) obj;
                int intValue2 = ((java.lang.Integer) obj2).intValue();
                int i6 = com.truecaller.blockinglevel.presentation.BlockLevelActivity.f0;
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (nVar2.P(intValue2 & 1, z)) {
                    int i7 = com.truecaller.blockinglevel.presentation.baz.a[wVar.a.ordinal()];
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                if (i7 == 4) {
                                    nVar2.Z(1617299053);
                                    com.truecaller.blockinglevel.api.BlockLevel blockLevel = wVar.b;
                                    boolean z4 = wVar.d;
                                    boolean c = wVar.c();
                                    com.truecaller.blockinglevel.presentation.f0 u0 = blockLevelActivity.u0();
                                    boolean h = nVar2.h(u0);
                                    java.lang.Object M = nVar2.M();
                                    if (h || M == cVar) {
                                        cc2.i0 i0Var = new cc2.i0(1, u0, com.truecaller.blockinglevel.presentation.f0.class, "onLevelSelected", "onLevelSelected(Lcom/truecaller/blockinglevel/api/BlockLevel;)V", 0, 19);
                                        nVar2.k0(i0Var);
                                        M = i0Var;
                                    }
                                    kotlin.jvm.functions.Function1 function1 = (kotlin.reflect.KFunction) M;
                                    boolean z5 = wVar.e;
                                    com.truecaller.blockinglevel.presentation.f0 u02 = blockLevelActivity.u0();
                                    boolean h2 = nVar2.h(u02);
                                    java.lang.Object M2 = nVar2.M();
                                    if (h2 || M2 == cVar) {
                                        com.truecaller.blockinglevel.presentation.qux quxVar = new com.truecaller.blockinglevel.presentation.qux(0, u02, com.truecaller.blockinglevel.presentation.f0.class, "onSkipClicked", "onSkipClicked()V", 0, 3);
                                        nVar2.k0(quxVar);
                                        M2 = quxVar;
                                    }
                                    com.truecaller.blockinglevel.presentation.g0.a(blockLevel, z4, z5, c, function1, (kotlin.reflect.KFunction) M2, blockLevelActivity.t0(wVar), nVar2, 0);
                                    nVar2.p(false);
                                } else {
                                    throw ro0.f.G(-86428480, nVar2, false);
                                }
                            } else {
                                nVar2.Z(-86393564);
                                com.truecaller.blockinglevel.api.BlockLevel blockLevel2 = wVar.b;
                                boolean c2 = wVar.c();
                                boolean z6 = wVar.e;
                                com.truecaller.blockinglevel.presentation.f0 u03 = blockLevelActivity.u0();
                                boolean h3 = nVar2.h(u03);
                                java.lang.Object M3 = nVar2.M();
                                if (h3 || M3 == cVar) {
                                    M3 = new cc2.i0(1, u03, com.truecaller.blockinglevel.presentation.f0.class, "onLevelSelected", "onLevelSelected(Lcom/truecaller/blockinglevel/api/BlockLevel;)V", 0, 18);
                                    nVar2.k0(M3);
                                }
                                kotlin.jvm.functions.Function1 function12 = (kotlin.reflect.KFunction) M3;
                                com.truecaller.blockinglevel.presentation.f0 u04 = blockLevelActivity.u0();
                                boolean h4 = nVar2.h(u04);
                                java.lang.Object M4 = nVar2.M();
                                if (h4 || M4 == cVar) {
                                    M4 = new com.truecaller.blockinglevel.presentation.qux(0, u04, com.truecaller.blockinglevel.presentation.f0.class, "onSkipClicked", "onSkipClicked()V", 0, 2);
                                    nVar2.k0(M4);
                                }
                                com.truecaller.blockinglevel.presentation.g0.d(blockLevel2, c2, z6, function12, (kotlin.reflect.KFunction) M4, blockLevelActivity.t0(wVar), nVar2, 0);
                                nVar2.p(false);
                            }
                        } else {
                            nVar2.Z(-86410715);
                            com.truecaller.blockinglevel.api.BlockLevel blockLevel3 = wVar.b;
                            boolean c3 = wVar.c();
                            boolean z7 = wVar.e;
                            com.truecaller.blockinglevel.presentation.f0 u05 = blockLevelActivity.u0();
                            boolean h5 = nVar2.h(u05);
                            java.lang.Object M5 = nVar2.M();
                            if (h5 || M5 == cVar) {
                                M5 = new cc2.i0(1, u05, com.truecaller.blockinglevel.presentation.f0.class, "onLevelSelected", "onLevelSelected(Lcom/truecaller/blockinglevel/api/BlockLevel;)V", 0, 17);
                                nVar2.k0(M5);
                            }
                            kotlin.jvm.functions.Function1 function13 = (kotlin.reflect.KFunction) M5;
                            com.truecaller.blockinglevel.presentation.f0 u06 = blockLevelActivity.u0();
                            boolean h6 = nVar2.h(u06);
                            java.lang.Object M6 = nVar2.M();
                            if (h6 || M6 == cVar) {
                                M6 = new com.truecaller.blockinglevel.presentation.qux(0, u06, com.truecaller.blockinglevel.presentation.f0.class, "onSkipClicked", "onSkipClicked()V", 0, 1);
                                nVar2.k0(M6);
                            }
                            com.truecaller.blockinglevel.presentation.g0.c(blockLevel3, c3, z7, function13, (kotlin.reflect.KFunction) M6, blockLevelActivity.t0(wVar), nVar2, 0);
                            nVar2.p(false);
                        }
                    } else {
                        nVar2.Z(-86427713);
                        com.truecaller.blockinglevel.api.BlockLevel blockLevel4 = wVar.b;
                        boolean c4 = wVar.c();
                        boolean z8 = wVar.e;
                        com.truecaller.blockinglevel.presentation.f0 u07 = blockLevelActivity.u0();
                        boolean h7 = nVar2.h(u07);
                        java.lang.Object M7 = nVar2.M();
                        if (h7 || M7 == cVar) {
                            M7 = new cc2.i0(1, u07, com.truecaller.blockinglevel.presentation.f0.class, "onLevelSelected", "onLevelSelected(Lcom/truecaller/blockinglevel/api/BlockLevel;)V", 0, 16);
                            nVar2.k0(M7);
                        }
                        kotlin.jvm.functions.Function1 function14 = (kotlin.reflect.KFunction) M7;
                        com.truecaller.blockinglevel.presentation.f0 u08 = blockLevelActivity.u0();
                        boolean h8 = nVar2.h(u08);
                        java.lang.Object M8 = nVar2.M();
                        if (h8 || M8 == cVar) {
                            M8 = new com.truecaller.blockinglevel.presentation.qux(0, u08, com.truecaller.blockinglevel.presentation.f0.class, "onSkipClicked", "onSkipClicked()V", 0, 0);
                            nVar2.k0(M8);
                        }
                        com.truecaller.blockinglevel.presentation.g0.b(blockLevel4, c4, z8, function14, (kotlin.reflect.KFunction) M8, blockLevelActivity.t0(wVar), null, nVar2, 0, 64);
                        nVar2.p(false);
                    }
                } else {
                    nVar2.S();
                }
                return kotlin.Unit.a;
            default:
                com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant = wVar.a;
                com.truecaller.blockinglevel.api.BlockLevel blockLevel5 = wVar.b;
                v2.n nVar3 = (v2.n) obj;
                int intValue3 = ((java.lang.Integer) obj2).intValue();
                int i8 = com.truecaller.blockinglevel.presentation.BlockLevelActivity.f0;
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (nVar3.P(intValue3 & 1, z2)) {
                    com.truecaller.blockinglevel.api.BlockLevelLaunchContext blockLevelLaunchContext = wVar.c;
                    boolean z9 = wVar.d;
                    com.truecaller.blockinglevel.api.BlockLevel blockLevel6 = com.truecaller.blockinglevel.api.BlockLevel.MAX;
                    if (blockLevel5 == blockLevel6 && z9) {
                        nVar3.Z(-972714101);
                        int i9 = com.truecaller.blockinglevel.presentation.baz.b[blockLevelLaunchContext.ordinal()];
                        if (i9 != 1 && i9 != 2) {
                            if (i9 == 3) {
                                v2 = k9.d.t(nVar3, -972366870, 2132019697, nVar3, false);
                            } else {
                                throw ro0.f.G(1354096126, nVar3, false);
                            }
                        } else {
                            nVar3.Z(-972572059);
                            v2 = qk.b1.v(2132019696, new java.lang.Object[]{qk.b1.u(2132019698, nVar3)}, nVar3);
                            nVar3.p(false);
                        }
                        java.lang.String str = v2;
                        com.truecaller.blockinglevel.presentation.f0 u09 = blockLevelActivity.u0();
                        boolean h9 = nVar3.h(u09);
                        java.lang.Object M9 = nVar3.M();
                        if (h9 || M9 == cVar) {
                            c03.f fVar = new c03.f(0, u09, com.truecaller.blockinglevel.presentation.f0.class, "onContinueClicked", "onContinueClicked()V", 0, 28);
                            nVar3.k0(fVar);
                            M9 = fVar;
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.reflect.KFunction) M9;
                        if (blockLevelVariant != com.truecaller.blockinglevel.api.BlockLevelVariant.DEFAULT && blockLevelVariant != com.truecaller.blockinglevel.api.BlockLevelVariant.FRAUD) {
                            buttonStylePrimary2 = com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary.PRIMARY;
                        } else {
                            buttonStylePrimary2 = com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary.GREEN;
                        }
                        com.truecaller.blockinglevel.presentation.g0.f(str, buttonStylePrimary2, function0, null, nVar3, 0, 8);
                        nVar3.p(false);
                    } else if (blockLevel5 == blockLevel6 && !z9) {
                        nVar3.Z(-971943627);
                        com.truecaller.blockinglevel.presentation.g0.r(wVar.b(), blockLevelActivity.u0(), null, nVar3, 0);
                        nVar3.p(false);
                    } else {
                        nVar3.Z(-971769004);
                        int i11 = com.truecaller.blockinglevel.presentation.baz.b[blockLevelLaunchContext.ordinal()];
                        if (i11 != 1 && i11 != 2) {
                            if (i11 == 3) {
                                v = k9.d.t(nVar3, -971099621, 2132021583, nVar3, false);
                            } else {
                                throw ro0.f.G(1354126620, nVar3, false);
                            }
                        } else {
                            nVar3.Z(-971627210);
                            int i12 = com.truecaller.blockinglevel.presentation.baz.c[blockLevel5.ordinal()];
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 == 3) {
                                        t = k9.d.t(nVar3, 1354139707, 2132019698, nVar3, false);
                                        v = qk.b1.v(2132019696, new java.lang.Object[]{t}, nVar3);
                                        nVar3.p(false);
                                    } else {
                                        throw ro0.f.G(1354131704, nVar3, false);
                                    }
                                } else {
                                    i = 1354136765;
                                    i2 = 2132019691;
                                }
                            } else {
                                i = 1354133819;
                                i2 = 2132019701;
                            }
                            t = k9.d.t(nVar3, i, i2, nVar3, false);
                            v = qk.b1.v(2132019696, new java.lang.Object[]{t}, nVar3);
                            nVar3.p(false);
                        }
                        java.lang.String str2 = v;
                        com.truecaller.blockinglevel.presentation.f0 u010 = blockLevelActivity.u0();
                        boolean h12 = nVar3.h(u010);
                        java.lang.Object M10 = nVar3.M();
                        if (h12 || M10 == cVar) {
                            c03.f fVar2 = new c03.f(0, u010, com.truecaller.blockinglevel.presentation.f0.class, "onContinueClicked", "onContinueClicked()V", 0, 29);
                            nVar3.k0(fVar2);
                            M10 = fVar2;
                        }
                        kotlin.jvm.functions.Function0 function02 = (kotlin.reflect.KFunction) M10;
                        if (blockLevelVariant != com.truecaller.blockinglevel.api.BlockLevelVariant.DEFAULT && blockLevelVariant != com.truecaller.blockinglevel.api.BlockLevelVariant.FRAUD) {
                            buttonStylePrimary = com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary.PRIMARY;
                        } else {
                            buttonStylePrimary = com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary.GREEN;
                        }
                        com.truecaller.blockinglevel.presentation.g0.e(str2, buttonStylePrimary, function02, null, nVar3, 0, 8);
                        nVar3.p(false);
                    }
                } else {
                    nVar3.S();
                }
                return kotlin.Unit.a;
        }
    }
}
