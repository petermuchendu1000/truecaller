package com.truecaller.cloudtelephony.callrecording.ui.details;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/ui/details/CallRecordingDetailsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/truecaller/cloudtelephony/callrecording/ui/details/g;", "Lb01/a;", "<init>", "()V", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallRecordingDetailsActivity extends com.truecaller.cloudtelephony.callrecording.ui.details.Hilt_CallRecordingDetailsActivity implements com.truecaller.cloudtelephony.callrecording.ui.details.g, b01.a {
    public static final /* synthetic */ int r0 = 0;
    public tx.a d0;
    public u03.i0 e0;
    public qo1.f f0;
    public com.truecaller.cloudtelephony.callrecording.ui.details.n g0;
    public g.baz h0;
    public q9.w n0;
    public w21.h o0;
    public final kotlin.Lazy i0 = kotlin.LazyKt.lazy(kotlin.k.c, new com.truecaller.cloudtelephony.callrecording.ui.details.e(this));
    public final kotlin.Lazy j0 = kotlin.LazyKt.lazy(new com.truecaller.cloudtelephony.callrecording.ui.details.bar(this, 0));
    public final kotlin.Lazy k0 = kotlin.LazyKt.lazy(new com.truecaller.cloudtelephony.callrecording.ui.details.bar(this, 1));
    public final kotlin.Lazy l0 = kotlin.LazyKt.lazy(new com.truecaller.cloudtelephony.callrecording.ui.details.bar(this, 2));
    public final kotlin.Lazy m0 = kotlin.LazyKt.lazy(new com.truecaller.cloudtelephony.callrecording.ui.details.bar(this, 3));
    public final com.truecaller.cloudtelephony.callrecording.ui.details.b p0 = new com.truecaller.cloudtelephony.callrecording.ui.details.b(this, 0);
    public final kotlin.Lazy q0 = kotlin.LazyKt.lazy(new com.truecaller.cloudtelephony.callrecording.ui.details.bar(this, 4));

    @Override // b01.a
    public final void o0() {
        com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = this.g0;
        if (nVar != null) {
            qz0.bar barVar = nVar.h;
            java.lang.String str = nVar.j.a;
            int i = nVar.v;
            qz0.qux quxVar = (qz0.qux) barVar;
            quxVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "callId");
            quxVar.a(qz0.qux.c(i), "Skip15sec", str);
            z42.bar.M(new v03.qux("CTRecordingRewindSkip", (java.util.Map) null), quxVar.b, quxVar.d);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [op2.baz, java.lang.Object] */
    @Override // com.truecaller.cloudtelephony.callrecording.ui.details.Hilt_CallRecordingDetailsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        tx.a aVar = this.d0;
        if (aVar != null) {
            com.truecaller.cloudtelephony.callrecording.data.CallRecording callRecording = (com.truecaller.cloudtelephony.callrecording.data.CallRecording) this.j0.getValue();
            com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig = (com.truecaller.common.ui.avatar.AvatarXConfig) this.k0.getValue();
            boolean booleanValue = ((java.lang.Boolean) this.l0.getValue()).booleanValue();
            tx.d dVar = aVar.a;
            tx.w wVar = dVar.b;
            kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
            qo1.f fVar = (qo1.f) wVar.X5.get();
            com.truecaller.settings.impl.ui.j I = wVar.I();
            u03.b0 b0Var = (u03.b0) wVar.v4.get();
            qz0.bar barVar = (qz0.bar) wVar.Nl.get();
            rz0.x xVar = (rz0.x) wVar.v6.get();
            kotlin.coroutines.CoroutineContext coroutineContext2 = (kotlin.coroutines.CoroutineContext) wVar.P.get();
            tx.e eVar = (tx.e) dVar.e;
            vz0.bar barVar2 = (vz0.bar) eVar.f.Ij.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "restAdapter");
            ?? obj = new java.lang.Object();
            ((op2.baz) obj).a = barVar2;
            this.g0 = new com.truecaller.cloudtelephony.callrecording.ui.details.n(coroutineContext, fVar, I, b0Var, barVar, xVar, callRecording, avatarXConfig, booleanValue, coroutineContext2, obj, (wj2.qux) wVar.Wj.get(), eVar.k(), (zz0.a) wVar.u6.get());
            setContentView(t0().a);
            d.h0 onBackPressedDispatcher = getOnBackPressedDispatcher();
            ah.h0 h0Var = new ah.h0(this, 8);
            onBackPressedDispatcher.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0Var, "onBackPressedCallback");
            onBackPressedDispatcher.b(h0Var);
            setSupportActionBar(t0().h.b);
            t0().h.c.setPresenter((w31.c) this.m0.getValue());
            i.baz supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.p(true);
                supportActionBar.s(true);
            }
            final int i = 0;
            t0().h.b.setNavigationOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.cloudtelephony.callrecording.ui.details.baz
                public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i2 = i;
                    com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity = this.b;
                    switch (i2) {
                        case 0:
                            int i3 = com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity.r0;
                            callRecordingDetailsActivity.getOnBackPressedDispatcher().d();
                            return;
                        default:
                            com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = callRecordingDetailsActivity.g0;
                            if (nVar != null) {
                                com.truecaller.cloudtelephony.callrecording.ui.details.g gVar = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                                if (gVar != null) {
                                    com.ironsource.adqualitysdk.sdk.i.bar.E(gVar, 2132017566);
                                    return;
                                }
                                return;
                            }
                            kotlin.jvm.internal.Intrinsics.n("presenter");
                            throw null;
                    }
                }
            });
            q9.w a = new q9.j(this).a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "build(...)");
            this.n0 = a;
            a.addListener(new com.truecaller.cloudtelephony.callrecording.ui.details.c(this));
            com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView = t0().c;
            q9.w wVar2 = this.n0;
            if (wVar2 != null) {
                callRecordingAudioPlayerView.setPlayer(wVar2);
                callRecordingAudioPlayerView.K();
                callRecordingAudioPlayerView.setOnDurationReadyCallback(new com.truecaller.cloudtelephony.callrecording.ui.details.bar(this, 5));
                callRecordingAudioPlayerView.setOnPlaybackSpeedCallback(new com.truecaller.cloudtelephony.callrecording.ui.details.a(this, 1));
                callRecordingAudioPlayerView.J(true, this);
                callRecordingAudioPlayerView.setContextMenuIconMenuCallback(new by2.a(15, this, callRecordingAudioPlayerView));
                final int i2 = 1;
                t0().b.b.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.cloudtelephony.callrecording.ui.details.baz
                    public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        int i22 = i2;
                        com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity = this.b;
                        switch (i22) {
                            case 0:
                                int i3 = com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity.r0;
                                callRecordingDetailsActivity.getOnBackPressedDispatcher().d();
                                return;
                            default:
                                com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = callRecordingDetailsActivity.g0;
                                if (nVar != null) {
                                    com.truecaller.cloudtelephony.callrecording.ui.details.g gVar = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                                    if (gVar != null) {
                                        com.ironsource.adqualitysdk.sdk.i.bar.E(gVar, 2132017566);
                                        return;
                                    }
                                    return;
                                }
                                kotlin.jvm.internal.Intrinsics.n("presenter");
                                throw null;
                        }
                    }
                });
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = t0().a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                ak.r0.i(constraintLayout, com.truecaller.common.ui.insets.InsetType.SystemBars);
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = t0().a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constraintLayout2, "<this>");
                constraintLayout2.setOnTouchListener(new cc3.a(constraintLayout2, 15));
                com.truecaller.cloudtelephony.callrecording.ui.audioplayer.CallRecordingAudioPlayerView callRecordingAudioPlayerView2 = t0().c;
                q9.w wVar3 = this.n0;
                if (wVar3 != null) {
                    callRecordingAudioPlayerView2.setPlayer(wVar3);
                    this.h0 = registerForActivityResult(new androidx.fragment.app.a1(8), new com.truecaller.cloudtelephony.callrecording.ui.details.qux(this));
                    com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = this.g0;
                    if (nVar != null) {
                        nVar.u0(this);
                        return;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("presenter");
                        throw null;
                    }
                }
                kotlin.jvm.internal.Intrinsics.n("player");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("player");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("presenterFactory");
        throw null;
    }

    @Override // com.truecaller.cloudtelephony.callrecording.ui.details.Hilt_CallRecordingDetailsActivity
    public final void onDestroy() {
        q9.w wVar = this.n0;
        if (wVar != null) {
            wVar.release();
            ((java.util.ArrayList) t0().i.c.b).remove(this.p0);
            com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = this.g0;
            if (nVar != null) {
                nVar.m1();
                super.onDestroy();
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("presenter");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("player");
        throw null;
    }

    @Override // b01.a
    public final void p0() {
        com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = this.g0;
        if (nVar != null) {
            qz0.bar barVar = nVar.h;
            java.lang.String str = nVar.j.a;
            int i = nVar.v;
            qz0.qux quxVar = (qz0.qux) barVar;
            quxVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "callId");
            quxVar.a(qz0.qux.c(i), "Rewind15sec", str);
            z42.bar.M(new v03.qux("CTRecordingRewindSkip", (java.util.Map) null), quxVar.b, quxVar.d);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final uz0.bar t0() {
        return (uz0.bar) this.i0.getValue();
    }

    public final p01.bar u0() {
        return (p01.bar) this.q0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0() {
        com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = this.g0;
        if (nVar != null) {
            if (nVar.r) {
                setResult(49374);
            }
            finish();
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final void w0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placeholderText");
        java.util.List<h01.a> f = getSupportFragmentManager().c.f();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "getFragments(...)");
        for (h01.a aVar : f) {
            if (aVar instanceof h01.a) {
                aVar.Q1(str);
            }
        }
    }
}
