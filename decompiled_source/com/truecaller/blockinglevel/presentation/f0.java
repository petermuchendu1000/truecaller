package com.truecaller.blockinglevel.presentation;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/blockinglevel/presentation/f0;", "Landroidx/lifecycle/n1;", "Lgf2/y;", "com/truecaller/blockinglevel/presentation/d0", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class f0 extends androidx.lifecycle.n1 implements gf2.y {
    public final /* synthetic */ com.truecaller.blockinglevel.presentation.k b;
    public final ak0.qux c;
    public final dg.b0 d;
    public final ig3.h2 e;
    public final ig3.q1 f;
    public final ig3.v1 g;
    public final ig3.p1 h;
    public com.truecaller.blockinglevel.presentation.BlockLevelArgs i;

    public f0(ak0.qux quxVar, dg.b0 b0Var, com.truecaller.blockinglevel.presentation.k kVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "blockSettingsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "purchaseStateHandler");
        this.b = kVar;
        this.c = quxVar;
        this.d = b0Var;
        ig3.h2 c = ig3.w1.c((java.lang.Object) null);
        this.e = c;
        this.f = new ig3.q1(c);
        ig3.v1 b = ig3.w1.b(0, 0, (hg3.bar) null, 6);
        this.g = b;
        this.h = new ig3.p1(b);
        fg3.h0.J(androidx.lifecycle.g1.l(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.qux(kVar, this, (df3.bar) null, 23), 3);
    }

    public static final void o(com.truecaller.blockinglevel.presentation.f0 f0Var, boolean z) {
        java.lang.Object value;
        com.truecaller.blockinglevel.presentation.w wVar;
        ig3.h2 h2Var = f0Var.e;
        do {
            value = h2Var.getValue();
            com.truecaller.blockinglevel.presentation.w wVar2 = (com.truecaller.blockinglevel.presentation.w) value;
            wVar = null;
            if (wVar2 != null) {
                wVar = com.truecaller.blockinglevel.presentation.w.a(wVar2, null, z, 15);
            }
        } while (!h2Var.n(value, wVar));
    }

    public final void c(gf2.x xVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xVar, "state");
        this.b.c(xVar);
    }

    public final void p(com.truecaller.blockinglevel.api.BlockLevelLaunchContext blockLevelLaunchContext, com.truecaller.blockinglevel.api.BlockLevel blockLevel) {
        com.truecaller.blockinglevel.api.BlockLevelVariant blockLevelVariant;
        if (blockLevel == null) {
            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("BlockLevelViewModel.logContinueClickConverted level is null");
            return;
        }
        if (blockLevelLaunchContext == null) {
            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("BlockLevelViewModel.logContinueClickConverted context is null");
            return;
        }
        com.truecaller.blockinglevel.api.BlockLevel blockLevel2 = null;
        if (blockLevelLaunchContext == com.truecaller.blockinglevel.api.BlockLevelLaunchContext.POST_REGISTRATION) {
            com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action blockLevelAnalytics$Action = com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action.DialogConverted;
            com.truecaller.blockinglevel.presentation.BlockLevelArgs blockLevelArgs = this.i;
            if (blockLevelArgs != null) {
                blockLevelVariant = blockLevelArgs.b;
            } else {
                blockLevelVariant = null;
            }
            this.c.b(blockLevelAnalytics$Action, blockLevelVariant);
        }
        com.truecaller.blockinglevel.presentation.BlockLevelArgs blockLevelArgs2 = this.i;
        if (blockLevelArgs2 != null) {
            blockLevel2 = blockLevelArgs2.a;
        }
        q(blockLevelLaunchContext, blockLevel2, blockLevel, blockLevel, true);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [hi3.d, qx2.tb, java.lang.Object] */
    public final void q(com.truecaller.blockinglevel.api.BlockLevelLaunchContext blockLevelLaunchContext, com.truecaller.blockinglevel.api.BlockLevel blockLevel, com.truecaller.blockinglevel.api.BlockLevel blockLevel2, com.truecaller.blockinglevel.api.BlockLevel blockLevel3, boolean z) {
        java.lang.CharSequence charSequence;
        char c;
        qx2.lh lhVar;
        boolean booleanValue;
        if (blockLevel == null) {
            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("BlockLevelViewModel.logLevelEvent config is null");
            return;
        }
        if (blockLevel2 == null) {
            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("BlockLevelViewModel.logLevelEvent from is null");
            return;
        }
        ak0.qux quxVar = this.c;
        quxVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelLaunchContext, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "default");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel2, "from");
        int i = uj0.bar.b[blockLevelLaunchContext.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    charSequence = "ACSMax";
                } else {
                    throw new java.lang.RuntimeException();
                }
            } else {
                charSequence = "PostRegistration";
            }
        } else {
            charSequence = "Deeplink";
        }
        bi3.y0 y0Var = qx2.tb.h;
        hi3.a aVar = qx2.tb.i;
        bi3.j0[] j0VarArr = (bi3.j0[]) y0Var.v().toArray(new bi3.j0[0]);
        boolean[] zArr = new boolean[j0VarArr.length];
        java.lang.CharSequence f = ak0.qux.f(blockLevel);
        hi3.e.d(j0VarArr[2], f);
        zArr[2] = true;
        java.lang.CharSequence f2 = ak0.qux.f(blockLevel2);
        hi3.e.d(j0VarArr[3], f2);
        zArr[3] = true;
        java.lang.CharSequence f3 = ak0.qux.f(blockLevel3);
        hi3.e.d(j0VarArr[4], f3);
        zArr[4] = true;
        bi3.j0 j0Var = j0VarArr[5];
        zArr[5] = true;
        bi3.j0 j0Var2 = j0VarArr[6];
        zArr[6] = true;
        try {
            ?? obj = new java.lang.Object();
            com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2 = null;
            if (zArr[0]) {
                c = 2;
                lhVar = null;
            } else {
                bi3.j0 j0Var3 = j0VarArr[0];
                c = 2;
                lhVar = (qx2.lh) aVar.g(j0Var3.f, aVar.j(j0Var3));
            }
            ((qx2.tb) obj).a = lhVar;
            if (!zArr[1]) {
                bi3.j0 j0Var4 = j0VarArr[1];
                clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) aVar.g(j0Var4.f, aVar.j(j0Var4));
            }
            ((qx2.tb) obj).b = clientHeaderV2;
            if (!zArr[c]) {
                bi3.j0 j0Var5 = j0VarArr[c];
                f = (java.lang.CharSequence) aVar.g(j0Var5.f, aVar.j(j0Var5));
            }
            ((qx2.tb) obj).c = f;
            if (!zArr[3]) {
                bi3.j0 j0Var6 = j0VarArr[3];
                f2 = (java.lang.CharSequence) aVar.g(j0Var6.f, aVar.j(j0Var6));
            }
            ((qx2.tb) obj).d = f2;
            if (!zArr[4]) {
                bi3.j0 j0Var7 = j0VarArr[4];
                f3 = (java.lang.CharSequence) aVar.g(j0Var7.f, aVar.j(j0Var7));
            }
            ((qx2.tb) obj).e = f3;
            if (zArr[5]) {
                booleanValue = z;
            } else {
                bi3.j0 j0Var8 = j0VarArr[5];
                booleanValue = ((java.lang.Boolean) aVar.g(j0Var8.f, aVar.j(j0Var8))).booleanValue();
            }
            ((qx2.tb) obj).f = booleanValue;
            if (!zArr[6]) {
                bi3.j0 j0Var9 = j0VarArr[6];
                charSequence = (java.lang.CharSequence) aVar.g(j0Var9.f, aVar.j(j0Var9));
            }
            ((qx2.tb) obj).g = charSequence;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "build(...)");
            j71.g.K((hi3.d) obj, quxVar.a);
        } catch (bi3.bar e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public final void r(com.truecaller.blockinglevel.presentation.d0 d0Var) {
        fg3.h0.J(androidx.lifecycle.g1.l(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.qux(this, d0Var, (df3.bar) null, 24), 3);
    }

    public final void s() {
        com.truecaller.settings.api.block.BlockSettingsHelper.BlockLevel blockLevel;
        com.truecaller.blockinglevel.presentation.w wVar = (com.truecaller.blockinglevel.presentation.w) this.f.a.getValue();
        if (wVar == null) {
            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("BlockLevelViewModel.onContinueClicked state is null");
            return;
        }
        com.truecaller.blockinglevel.api.BlockLevel blockLevel2 = wVar.b;
        p(wVar.c, blockLevel2);
        int i = com.truecaller.blockinglevel.presentation.e0.b[blockLevel2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    blockLevel = com.truecaller.settings.api.block.BlockSettingsHelper.BlockLevel.MAX;
                } else {
                    throw new java.lang.RuntimeException();
                }
            } else {
                blockLevel = com.truecaller.settings.api.block.BlockSettingsHelper.BlockLevel.BASIC;
            }
        } else {
            blockLevel = com.truecaller.settings.api.block.BlockSettingsHelper.BlockLevel.OFF;
        }
        mq2.qux D = this.d.D(blockLevel);
        if (D.equals(mq2.baz.a)) {
            if (blockLevel2 == com.truecaller.blockinglevel.api.BlockLevel.MAX) {
                r(com.truecaller.blockinglevel.presentation.z.a);
                return;
            } else {
                r(com.truecaller.blockinglevel.presentation.a0.a);
                return;
            }
        }
        if (D.equals(mq2.bar.a)) {
            r(new com.truecaller.blockinglevel.presentation.b0(wVar.b()));
            return;
        }
        throw new java.lang.RuntimeException();
    }

    public final void t(com.truecaller.blockinglevel.api.BlockLevel blockLevel) {
        ig3.h2 h2Var;
        java.lang.Object value;
        com.truecaller.blockinglevel.api.BlockLevel blockLevel2;
        com.truecaller.blockinglevel.presentation.w wVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevel, "level");
        com.truecaller.blockinglevel.presentation.w wVar2 = (com.truecaller.blockinglevel.presentation.w) this.f.a.getValue();
        if (wVar2 == null) {
            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("BlockLevelViewModel.onLevelSelected state is null");
            return;
        }
        com.truecaller.blockinglevel.api.BlockLevel blockLevel3 = wVar2.b;
        do {
            h2Var = this.e;
            value = h2Var.getValue();
            com.truecaller.blockinglevel.presentation.w wVar3 = (com.truecaller.blockinglevel.presentation.w) value;
            blockLevel2 = null;
            if (wVar3 != null) {
                wVar = com.truecaller.blockinglevel.presentation.w.a(wVar3, blockLevel, false, 29);
            } else {
                wVar = null;
            }
        } while (!h2Var.n(value, wVar));
        com.truecaller.blockinglevel.api.BlockLevelLaunchContext blockLevelLaunchContext = wVar2.c;
        com.truecaller.blockinglevel.presentation.BlockLevelArgs blockLevelArgs = this.i;
        if (blockLevelArgs != null) {
            blockLevel2 = blockLevelArgs.a;
        }
        q(blockLevelLaunchContext, blockLevel2, blockLevel3, blockLevel, false);
    }

    public final void u() {
        com.truecaller.blockinglevel.presentation.w wVar = (com.truecaller.blockinglevel.presentation.w) this.f.a.getValue();
        if (wVar == null) {
            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("BlockLevelViewModel.onSkipClicked state is null");
        } else if (wVar.c()) {
            r(com.truecaller.blockinglevel.presentation.a0.a);
        }
    }
}
