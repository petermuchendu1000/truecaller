package com.truecaller.callui.presentation.ui.components.tooltip;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/callui/presentation/ui/components/tooltip/CallUITooltipViewModel;", "Landroidx/lifecycle/n1;", "yy0/baz", "ap1/d", "Type", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallUITooltipViewModel extends androidx.lifecycle.n1 {
    public final fy0.qux b;
    public final ah.n c;
    public final fy0.b d;
    public final qo1.d e;
    public final u03.b0 f;
    public final bh2.baz g;
    public final t41.t h;
    public final dy0.baz i;
    public final we1.a j;
    public boolean k;
    public fg3.k2 l;
    public fg3.k2 m;
    public fg3.k2 n;
    public final ig3.h2 o;
    public final ig3.q1 p;
    public final ig3.h2 q;
    public final ig3.i r;
    public final ig3.h2 s;
    public final ig3.i t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/callui/presentation/ui/components/tooltip/CallUITooltipViewModel$Type;", "", "<init>", "(Ljava/lang/String;I)V", "SIGNAL", "BATTERY", "ON_HOLD", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class Type {
        private static final /* synthetic */ gf3.bar $ENTRIES;
        private static final /* synthetic */ com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type[] $VALUES;
        public static final com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type SIGNAL = new com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type("SIGNAL", 0);
        public static final com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type BATTERY = new com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type("BATTERY", 1);
        public static final com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type ON_HOLD = new com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type("ON_HOLD", 2);

        private static final /* synthetic */ com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type[] $values() {
            return new com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type[]{SIGNAL, BATTERY, ON_HOLD};
        }

        static {
            com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ge0.i.u($values);
        }

        private Type(java.lang.String str, int i) {
        }

        @org.jetbrains.annotations.NotNull
        public static gf3.bar getEntries() {
            return $ENTRIES;
        }

        public static com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type valueOf(java.lang.String str) {
            return (com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type) java.lang.Enum.valueOf(com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type.class, str);
        }

        public static com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type[] values() {
            return (com.truecaller.callui.presentation.ui.components.tooltip.CallUITooltipViewModel.Type[]) $VALUES.clone();
        }
    }

    public CallUITooltipViewModel(fy0.qux quxVar, ah.n nVar, f0.x0 x0Var, fy0.b bVar, qo1.d dVar, u03.b0 b0Var, bh2.baz bazVar, t41.t tVar, dy0.baz bazVar2, we1.a aVar) {
        com.truecaller.wizard.verification.j1 j1Var;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "callUIRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "networkSignalQualityMonitor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x0Var, "ownBatteryStatusProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "contactBatteryStatusProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "callingFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "resourceProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "callerInfoMapper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "phoneNumberHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "callUIAnalytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "tooltipHapticFeedback");
        this.b = quxVar;
        this.c = nVar;
        this.d = bVar;
        this.e = dVar;
        this.f = b0Var;
        this.g = bazVar;
        this.h = tVar;
        this.i = bazVar2;
        this.j = aVar;
        ig3.h2 c = ig3.w1.c(yy0.bar.a);
        this.o = c;
        this.p = new ig3.q1(c);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ig3.h2 c2 = ig3.w1.c(bool);
        this.q = c2;
        if (!((qo1.e) dVar).b.a("featureInCallUILowBattery", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
            j1Var = new com.truecaller.wizard.verification.j1(new by0.bar(100, false), 9);
        } else {
            j1Var = (ig3.i) x0Var.b;
        }
        this.r = ig3.w1.t(new a61.b(c2, ig3.w1.t(new wh2.baz(j1Var, 9)), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e(c2, (df3.bar) null, 1), 4));
        ig3.h2 c3 = ig3.w1.c(bool);
        this.s = c3;
        this.t = ig3.w1.t(new a61.b(c3, ig3.w1.t(new com.truecaller.wizard.verification.j1(ig3.w1.M(ig3.w1.t(new a61.b(quxVar.d, quxVar.g, new y53.j(3, 2, (df3.bar) null), 4)), new yy0.c(1, this, null)), 24)), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e(c3, (df3.bar) null, 1), 4));
    }

    public final void n() {
        if (this.k) {
            this.k = false;
            ah.n nVar = this.c;
            nVar.getClass();
            try {
                fg3.k2 k2Var = (fg3.k2) nVar.g;
                if (k2Var != null) {
                    k2Var.cancel((java.util.concurrent.CancellationException) null);
                }
                nVar.g = null;
                fg3.k2 k2Var2 = (fg3.k2) nVar.h;
                if (k2Var2 != null) {
                    k2Var2.cancel((java.util.concurrent.CancellationException) null);
                }
                nVar.h = null;
                fg3.k2 k2Var3 = (fg3.k2) nVar.f;
                if (k2Var3 != null) {
                    k2Var3.cancel((java.util.concurrent.CancellationException) null);
                }
                fg3.h0.k((fe3.bar) nVar.d, (java.util.concurrent.CancellationException) null);
                ((y.n0) nVar.b).n0();
                nVar.f = null;
                nVar.e = fy0.i.e;
            } catch (java.lang.Exception unused) {
            }
            fg3.k2 k2Var4 = this.l;
            if (k2Var4 != null) {
                k2Var4.cancel((java.util.concurrent.CancellationException) null);
            }
            this.l = null;
            fg3.k2 k2Var5 = this.m;
            if (k2Var5 != null) {
                k2Var5.cancel((java.util.concurrent.CancellationException) null);
            }
            fg3.k2 k2Var6 = this.n;
            if (k2Var6 != null) {
                k2Var6.cancel((java.util.concurrent.CancellationException) null);
            }
            this.m = null;
            this.n = null;
            ig3.h2 h2Var = this.o;
            h2Var.getClass();
            h2Var.p((java.lang.Object) null, yy0.bar.a);
            we1.a aVar = this.j;
            u6.i iVar = (u6.i) aVar.b;
            android.media.ToneGenerator toneGenerator = (android.media.ToneGenerator) iVar.a;
            if (toneGenerator != null) {
                toneGenerator.release();
            }
            iVar.a = null;
            android.os.Vibrator vibrator = (android.os.Vibrator) ((kotlin.Lazy) aVar.e).getValue();
            if (vibrator != null) {
                vibrator.cancel();
            }
        }
    }
}
