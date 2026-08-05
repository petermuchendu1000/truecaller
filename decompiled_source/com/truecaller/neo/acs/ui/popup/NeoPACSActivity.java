package com.truecaller.neo.acs.ui.popup;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/neo/acs/ui/popup/NeoPACSActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "neo-acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NeoPACSActivity extends com.truecaller.neo.acs.ui.popup.Hilt_NeoPACSActivity {
    public static final /* synthetic */ int h0 = 0;
    public r52.baz d0;
    public final kotlin.Lazy e0;
    public final kotlin.Lazy f0;
    public final java.lang.String g0 = q52.o.class.getName();

    public NeoPACSActivity() {
        final int i = 0;
        this.e0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: q52.baz
            public final /* synthetic */ com.truecaller.neo.acs.ui.popup.NeoPACSActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i2 = i;
                bd3.qux quxVar = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.neo.acs.ui.popup.NeoPACSActivity.h0;
                        return android.view.animation.AnimationUtils.loadAnimation(quxVar, 2130771981);
                    default:
                        int i4 = com.truecaller.neo.acs.ui.popup.NeoPACSActivity.h0;
                        return android.view.animation.AnimationUtils.loadAnimation(quxVar, 2130771982);
                }
            }
        });
        final int i2 = 1;
        this.f0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: q52.baz
            public final /* synthetic */ com.truecaller.neo.acs.ui.popup.NeoPACSActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i22 = i2;
                bd3.qux quxVar = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.neo.acs.ui.popup.NeoPACSActivity.h0;
                        return android.view.animation.AnimationUtils.loadAnimation(quxVar, 2130771981);
                    default:
                        int i4 = com.truecaller.neo.acs.ui.popup.NeoPACSActivity.h0;
                        return android.view.animation.AnimationUtils.loadAnimation(quxVar, 2130771982);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        androidx.fragment.app.Fragment G = getSupportFragmentManager().G(this.g0);
        if (G != null) {
            if (!(G instanceof q52.o)) {
                G = null;
            }
            if (G != null) {
                q52.o oVar = (q52.o) G;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
                if (motionEvent.getAction() == 0) {
                    q52.q qVar = oVar.j;
                    if (qVar != null) {
                        ((q52.c0) qVar).V3();
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("presenter");
                        throw null;
                    }
                }
            }
        }
        return super/*android.app.Activity*/.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        android.view.View view;
        android.view.View view2;
        if (!((android.view.animation.Animation) this.e0.getValue()).hasStarted()) {
            super/*android.app.Activity*/.finish();
            return;
        }
        android.view.animation.Animation animation = (android.view.animation.Animation) this.f0.getValue();
        animation.setFillAfter(true);
        animation.setAnimationListener(new l23.baz(this, 4));
        androidx.fragment.app.Fragment F = getSupportFragmentManager().F(android.R.id.content);
        if (F != null && (view2 = F.getView()) != null) {
            view = view2.findViewById(2131361884);
        } else {
            view = null;
        }
        if (view != null) {
            view.startAnimation(animation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.neo.acs.ui.popup.Hilt_NeoPACSActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        h6.e.U(window, 0.75f);
        if (bundle != null) {
            return;
        }
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        u0();
        df3.bar barVar = null;
        fg3.h0.J(androidx.lifecycle.g1.i(getLifecycle()), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q52.qux(this, barVar, 0), 3);
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q52.qux(this, barVar, 2), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        setIntent(intent);
        u0();
    }

    public final void onUserLeaveHint() {
        q52.q qVar;
        super/*androidx.activity.ComponentActivity*/.onUserLeaveHint();
        androidx.fragment.app.Fragment G = getSupportFragmentManager().G(this.g0);
        if (G != null) {
            if (!(G instanceof q52.o)) {
                G = null;
            }
            if (G != null && (qVar = ((q52.o) G).j) != null) {
                ((q52.c0) qVar).V3();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        androidx.fragment.app.Fragment G = getSupportFragmentManager().G(this.g0);
        if (G != null) {
            if (!(G instanceof jz.bar)) {
                G = null;
            }
            if (G != null) {
                ((jz.bar) G).z1(z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0() {
        android.os.Parcelable j;
        android.content.Intent intent = getIntent();
        if (intent != null && (j = cu0.j1.j(intent)) != null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            supportFragmentManager.getClass();
            androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
            q52.o.i0.getClass();
            q52.o oVar = new q52.o();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key_history_item", j);
            oVar.setArguments(bundle);
            barVar.g(android.R.id.content, oVar, this.g0);
            barVar.l();
            return;
        }
        com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("AfterCallHistoryEvent is null. Failed to add fragment");
        finish();
    }
}
