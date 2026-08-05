package com.truecaller.acs.ui.popup;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/acs/ui/popup/AfterCallPopupActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AfterCallPopupActivity extends com.truecaller.acs.ui.popup.Hilt_AfterCallPopupActivity {
    public static final /* synthetic */ int i0 = 0;
    public e00.s d0;
    public nz.c e0;
    public qc3.bar f0;
    public final kotlin.Lazy g0;
    public final kotlin.Lazy h0;

    public AfterCallPopupActivity() {
        final int i = 0;
        this.g0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: nz.d
            public final /* synthetic */ com.truecaller.acs.ui.popup.AfterCallPopupActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i2 = i;
                bd3.qux quxVar = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.acs.ui.popup.AfterCallPopupActivity.i0;
                        return android.view.animation.AnimationUtils.loadAnimation(quxVar, 2130771981);
                    default:
                        int i4 = com.truecaller.acs.ui.popup.AfterCallPopupActivity.i0;
                        return android.view.animation.AnimationUtils.loadAnimation(quxVar, 2130771982);
                }
            }
        });
        final int i2 = 1;
        this.h0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: nz.d
            public final /* synthetic */ com.truecaller.acs.ui.popup.AfterCallPopupActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i22 = i2;
                bd3.qux quxVar = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.acs.ui.popup.AfterCallPopupActivity.i0;
                        return android.view.animation.AnimationUtils.loadAnimation(quxVar, 2130771981);
                    default:
                        int i4 = com.truecaller.acs.ui.popup.AfterCallPopupActivity.i0;
                        return android.view.animation.AnimationUtils.loadAnimation(quxVar, 2130771982);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
        androidx.fragment.app.Fragment G = getSupportFragmentManager().G("AfterCallPopupFragment");
        if (G != null) {
            if (!(G instanceof nz.s)) {
                G = null;
            }
            if (G != null) {
                nz.s sVar = (nz.s) G;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(motionEvent, "event");
                if (motionEvent.getAction() == 0) {
                    nz.u uVar = sVar.j;
                    if (uVar != null) {
                        ((nz.g0) uVar).R3();
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
        if (!((android.view.animation.Animation) this.g0.getValue()).hasStarted()) {
            super/*android.app.Activity*/.finish();
            return;
        }
        android.view.animation.Animation animation = (android.view.animation.Animation) this.h0.getValue();
        animation.setFillAfter(true);
        animation.setAnimationListener(new l23.baz(this, 1));
        androidx.fragment.app.Fragment F = getSupportFragmentManager().F(2131364006);
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
    @Override // com.truecaller.acs.ui.popup.Hilt_AfterCallPopupActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.acs.data.AfterCallHistoryEvent afterCallHistoryEvent;
        qc3.bar barVar;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        setContentView(2131558433);
        android.view.Window window = getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        h6.e.U(window, 0.75f);
        qc3.bar barVar2 = this.f0;
        df3.bar barVar3 = null;
        if (barVar2 != null) {
            ((u40.qux) barVar2.get()).d(this);
            if (bundle != null) {
                return;
            }
            if (fu.baz.z()) {
                ye0.k.N(this);
            }
            u0();
            android.content.Intent intent = getIntent();
            if (intent != null) {
                afterCallHistoryEvent = cu0.j1.j(intent);
            } else {
                afterCallHistoryEvent = null;
            }
            if (afterCallHistoryEvent != null && afterCallHistoryEvent.getLaunchedFromWidget()) {
                e00.s sVar = this.d0;
                if (sVar != null) {
                    ig3.h2 h2Var = sVar.b;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    h2Var.getClass();
                    h2Var.p((java.lang.Object) null, bool);
                } else {
                    kotlin.jvm.internal.Intrinsics.n("acsStarter");
                    throw null;
                }
            }
            try {
                kotlin.o oVar = kotlin.q.b;
                barVar = this.f0;
            } catch (java.lang.Throwable th) {
                kotlin.o oVar2 = kotlin.q.b;
                od.p.o(th);
            }
            if (barVar != null) {
                java.lang.Object obj = barVar.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                t.c.e((u40.qux) obj, this, new nm.b(12));
                kotlin.Unit unit = kotlin.Unit.a;
                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new nz.e(this, barVar3, 0), 3);
                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new nz.e(this, barVar3, 2), 3);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("adsConsentManager");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("adsConsentManager");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        setIntent(intent);
        u0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        com.truecaller.ads.acsrules.model.AcsRules acsRules = (com.truecaller.ads.acsrules.model.AcsRules) ((android.os.Parcelable) g6.b.g(intent, "ARG_ACS_RULES", com.truecaller.ads.acsrules.model.AcsRules.class));
        if (acsRules != null) {
            nz.c cVar = this.e0;
            if (cVar != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsRules, "acsRules");
                cVar.a = acsRules;
            } else {
                kotlin.jvm.internal.Intrinsics.n("acsRulesStateHolder");
                throw null;
            }
        }
    }

    public final void onUserLeaveHint() {
        nz.u uVar;
        super/*androidx.activity.ComponentActivity*/.onUserLeaveHint();
        androidx.fragment.app.Fragment G = getSupportFragmentManager().G("AfterCallPopupFragment");
        if (G != null) {
            if (!(G instanceof nz.s)) {
                G = null;
            }
            if (G != null && (uVar = ((nz.s) G).j) != null) {
                ((nz.g0) uVar).R3();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        androidx.fragment.app.Fragment G = getSupportFragmentManager().G("AfterCallPopupFragment");
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
        com.truecaller.acs.data.AfterCallHistoryEvent afterCallHistoryEvent;
        android.content.Intent intent = getIntent();
        if (intent != null) {
            afterCallHistoryEvent = cu0.j1.j(intent);
        } else {
            afterCallHistoryEvent = null;
        }
        if (afterCallHistoryEvent == null) {
            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("AfterCallHistoryEvent is null. Failed to add fragment");
            finish();
            return;
        }
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar = new androidx.fragment.app.bar(supportFragmentManager);
        nz.s.d0.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(afterCallHistoryEvent, "item");
        nz.s sVar = new nz.s();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("key_history_item", afterCallHistoryEvent);
        sVar.setArguments(bundle);
        barVar.g(2131364006, sVar, "AfterCallPopupFragment");
        barVar.l();
    }
}
