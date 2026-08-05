package com.truecaller.callui.presentation.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/callui/presentation/ui/CallUIActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallUIActivity extends com.truecaller.callui.presentation.ui.Hilt_CallUIActivity {
    public static final /* synthetic */ int r0 = 0;
    public final androidx.lifecycle.o1 d0;
    public final androidx.lifecycle.o1 e0;
    public final androidx.lifecycle.o1 f0;
    public cz.e g0;
    public qc3.bar h0;
    public qc3.bar i0;
    public qc3.bar j0;
    public qc3.bar k0;
    public qc3.bar l0;
    public qc3.bar m0;
    public mk.e n0;
    public qc3.bar o0;
    public ah.h0 p0;
    public final g.baz q0;

    public CallUIActivity() {
        ly0.a aVar = new ly0.a(this, 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        this.d0 = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(ly0.o1.class), new ly0.a(this, 1), aVar, new ly0.a(this, 2));
        this.e0 = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(uy0.k.class), new ly0.a(this, 4), new ly0.a(this, 3), new ly0.a(this, 5));
        this.f0 = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(dz0.c.class), new ly0.a(this, 7), new ly0.a(this, 6), new ly0.a(this, 8));
        this.q0 = registerForActivityResult(new androidx.fragment.app.a1(8), new jc3.bar(this, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.callui.presentation.ui.Hilt_CallUIActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        this.p0 = ge0.i.m(getOnBackPressedDispatcher(), this, new l10.baz(this, 6), 2);
        e.d.a(this, new d3.qux(1280457074, new ie3.h(this, 20), true));
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ly0.qux(this, (df3.bar) null, 1), 3);
        x0(getIntent());
    }

    @Override // com.truecaller.callui.presentation.ui.Hilt_CallUIActivity
    public final void onDestroy() {
        super.onDestroy();
        dz0.a aVar = (dz0.a) u0().get();
        fg3.k2 k2Var = aVar.d;
        if (k2Var != null) {
            k2Var.cancel((java.util.concurrent.CancellationException) null);
        }
        try {
            aVar.a.unregisterReceiver(aVar.f);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        xy0.baz bazVar = (xy0.baz) v0().get();
        fg3.k2 k2Var2 = bazVar.c;
        if (k2Var2 != null) {
            k2Var2.cancel((java.util.concurrent.CancellationException) null);
        }
        xy0.qux a = bazVar.a();
        a.b.o((java.lang.Object) null);
        a.c.clear();
    }

    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        x0(intent);
    }

    public final void onPictureInPictureModeChanged(boolean z, android.content.res.Configuration configuration) {
        com.truecaller.callui.api.internal.analytics.model.AnalyticsContext analyticsContext;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super/*androidx.activity.ComponentActivity*/.onPictureInPictureModeChanged(z, configuration);
        dz0.c cVar = (dz0.c) this.f0.getValue();
        qc3.bar barVar = cVar.i;
        qc3.bar barVar2 = cVar.c;
        if (z) {
            cVar.q(true);
            ((hy0.baz) barVar2.get()).a(cy0.z.c);
            ((ly0.p0) barVar.get()).b(new ly0.c1(com.truecaller.callui.presentation.ui.ActiveBottomSheet.NONE));
            ((ly0.p0) barVar.get()).b(ly0.u0.o);
            dy0.b bVar = (dy0.b) cVar.h.get();
            com.truecaller.callui.api.model.CallUICallState b = ((ly0.a0) ((ly0.p0) barVar.get()).c.getValue()).b();
            bVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "callState");
            switch (dy0.a.a[b.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    analyticsContext = null;
                    break;
                case 4:
                    analyticsContext = com.truecaller.callui.api.internal.analytics.model.AnalyticsContext.DEFAULT_DIALER_INCOMING_CALL;
                    break;
                case 5:
                    analyticsContext = com.truecaller.callui.api.internal.analytics.model.AnalyticsContext.DEFAULT_DIALER_OUTGOING_CALL;
                    break;
                case 6:
                case 7:
                    analyticsContext = com.truecaller.callui.api.internal.analytics.model.AnalyticsContext.DEFAULT_DIALER_ONGOING_CALL;
                    break;
                default:
                    throw new java.lang.RuntimeException();
            }
            if (analyticsContext != null) {
                bd.bar.u(bVar.a, com.truecaller.callui.api.internal.analytics.model.AnalyticsContext.FLOATING_CALL_SCREEN.getValue(), analyticsContext.getValue());
                return;
            }
            return;
        }
        cVar.q(false);
        ((hy0.baz) barVar2.get()).a(cy0.z.d);
        ((ly0.p0) barVar.get()).b(ly0.a1.o);
        dy0.baz bazVar = (dy0.baz) cVar.j.get();
        qc3.bar barVar3 = cVar.g;
        bazVar.b(((cy0.y) ((fy0.qux) barVar3.get()).d.getValue()).d, ((cy0.y) ((fy0.qux) barVar3.get()).d.getValue()).a, com.truecaller.callui.api.internal.analytics.model.AnalyticsContext.FLOATING_CALL_SCREEN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onPictureInPictureRequested() {
        if (((dz0.c) this.f0.getValue()).p()) {
            ((dz0.a) u0().get()).b();
        }
        return super/*android.app.Activity*/.onPictureInPictureRequested();
    }

    public final void onStart() {
        super.onStart();
        w0().c.a(cy0.z.d);
    }

    public final void onStop() {
        super.onStop();
        w0().c.a(cy0.z.c);
    }

    public final void onUserLeaveHint() {
        super/*androidx.activity.ComponentActivity*/.onUserLeaveHint();
        if (!kg3.baz.C(this) && ((dz0.c) this.f0.getValue()).p()) {
            ((dz0.a) u0().get()).b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0() {
        finish();
        qc3.bar barVar = this.l0;
        if (barVar != null) {
            ((ly0.p0) barVar.get()).b(ly0.q0.p);
            qc3.bar barVar2 = this.m0;
            if (barVar2 != null) {
                ((hy0.baz) barVar2.get()).a(cy0.z.g);
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("callUI");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("stateHolder");
        throw null;
    }

    public final qc3.bar u0() {
        qc3.bar barVar = this.i0;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("callUIPip");
        throw null;
    }

    public final qc3.bar v0() {
        qc3.bar barVar = this.j0;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("snackbar");
        throw null;
    }

    public final ly0.o1 w0() {
        return (ly0.o1) this.d0.getValue();
    }

    public final void x0(android.content.Intent intent) {
        com.truecaller.callui.api.CallUISource callUISource;
        java.lang.String str;
        int i;
        if (intent != null) {
            callUISource = (com.truecaller.callui.api.CallUISource) g6.b.h(intent, "com.truecaller.callui.presentation.ui.PARAM_CONTEXT", com.truecaller.callui.api.CallUISource.class);
        } else {
            callUISource = null;
        }
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 2544381) {
                if (hashCode == 1935487934 && str.equals("ANSWER")) {
                    w0().c.a(cy0.z.b);
                    return;
                }
                return;
            }
            if (str.equals("SHOW")) {
                ly0.o1 w0 = w0();
                w0.getClass();
                if (callUISource == null) {
                    i = -1;
                } else {
                    i = ly0.h1.f[callUISource.ordinal()];
                }
                if (i != -1) {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw new java.lang.RuntimeException();
                        }
                    } else {
                        dy0.baz bazVar = (dy0.baz) w0.i.get();
                        bazVar.getClass();
                        dy0.baz.a(bazVar, com.truecaller.callui.api.internal.analytics.model.CallUIActions.NOTIFICATION, null, com.truecaller.callui.api.internal.analytics.model.AnalyticsContext.NOTIFICATION_V2, 2);
                    }
                }
            }
        }
    }
}
