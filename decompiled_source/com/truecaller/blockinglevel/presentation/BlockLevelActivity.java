package com.truecaller.blockinglevel.presentation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/truecaller/blockinglevel/presentation/BlockLevelActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lcom/truecaller/blockinglevel/presentation/w;", "uiState", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BlockLevelActivity extends com.truecaller.blockinglevel.presentation.Hilt_BlockLevelActivity {
    public static final /* synthetic */ int f0 = 0;
    public i82.t d0;
    public final androidx.lifecycle.o1 e0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(com.truecaller.blockinglevel.presentation.f0.class), new com.truecaller.blockinglevel.presentation.b(this, 1), new com.truecaller.blockinglevel.presentation.b(this, 0), new com.truecaller.blockinglevel.presentation.b(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.blockinglevel.presentation.Hilt_BlockLevelActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.blockinglevel.presentation.BlockLevelArgs blockLevelArgs;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            blockLevelArgs = (com.truecaller.blockinglevel.presentation.BlockLevelArgs) ((android.os.Parcelable) g6.b.g(intent, "extra_args", com.truecaller.blockinglevel.presentation.BlockLevelArgs.class));
        } else {
            blockLevelArgs = null;
        }
        if (blockLevelArgs == null) {
            com.truecaller.log.AssertionUtil.shouldNeverHappen(new java.lang.IllegalStateException("Block level screen arguments are null"), new java.lang.String[0]);
            finish();
            return;
        }
        com.truecaller.blockinglevel.presentation.f0 u0 = u0();
        ak0.qux quxVar = u0.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockLevelArgs, "args");
        int i = com.truecaller.blockinglevel.presentation.e0.a[blockLevelArgs.c.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                quxVar.b(com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action.DialogSeen, blockLevelArgs.b);
            } else {
                throw new java.lang.RuntimeException();
            }
        } else {
            bd.bar.u(quxVar.a, "ProtectionLevelLite", "deeplink");
        }
        u0.i = blockLevelArgs;
        if (u0.f.a.getValue() == null) {
            ig3.h2 h2Var = u0.e;
            com.truecaller.blockinglevel.presentation.w wVar = new com.truecaller.blockinglevel.presentation.w(blockLevelArgs.b, blockLevelArgs.a, blockLevelArgs.c, ((er2.l0) u0.d.a).l(), false);
            h2Var.getClass();
            h2Var.p((java.lang.Object) null, wVar);
            com.truecaller.blockinglevel.api.BlockLevelLaunchContext blockLevelLaunchContext = blockLevelArgs.c;
            com.truecaller.blockinglevel.api.BlockLevel blockLevel = blockLevelArgs.a;
            u0.q(blockLevelLaunchContext, blockLevel, blockLevel, null, false);
        }
        pe0.j.t(this, u0().h, new com.truecaller.blockinglevel.presentation.a(this, 0));
        d.h0 onBackPressedDispatcher = getOnBackPressedDispatcher();
        ah.h0 h0Var = new ah.h0(this, 7);
        onBackPressedDispatcher.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0Var, "onBackPressedCallback");
        onBackPressedDispatcher.b(h0Var);
        e.d.a(this, new d3.qux(1101107294, new a2.r(this, 17), true));
    }

    public final d3.qux t0(com.truecaller.blockinglevel.presentation.w wVar) {
        return new d3.qux(895262800, new com.truecaller.blockinglevel.presentation.bar(wVar, this, 2), true);
    }

    public final com.truecaller.blockinglevel.presentation.f0 u0() {
        return (com.truecaller.blockinglevel.presentation.f0) this.e0.getValue();
    }
}
