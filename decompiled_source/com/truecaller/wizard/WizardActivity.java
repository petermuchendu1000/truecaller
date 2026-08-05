package com.truecaller.wizard;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/wizard/WizardActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/fragment/app/k1;", "Lpt2/bar;", "<init>", "()V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WizardActivity extends com.truecaller.wizard.Hilt_WizardActivity implements androidx.fragment.app.k1, pt2.bar {
    public static volatile boolean t0;
    public qc3.bar d0;
    public h93.baz e0;
    public rn0.d0 f0;
    public javax.inject.Provider g0;
    public qc3.bar h0;
    public nc0.r1 i0;
    public com.truecaller.ugc.e j0;
    public i.d0 k0;
    public u03.b0 l0;
    public o73.m m0;
    public qo1.r n0;
    public s62.d o0;
    public final androidx.lifecycle.o1 p0;
    public final androidx.lifecycle.o1 q0;
    public final kotlin.Lazy r0;
    public final kotlin.Lazy s0;

    public WizardActivity() {
        o73.c cVar = new o73.c(this, 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        this.p0 = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(j93.b.class), new o73.c(this, 1), cVar, new o73.c(this, 2));
        this.q0 = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(q83.u0.class), new o73.c(this, 4), new o73.c(this, 3), new o73.c(this, 5));
        this.r0 = kotlin.LazyKt.lazy(new n10.b(this, 26));
        this.s0 = kotlin.LazyKt.lazy(new n11.m(this, 24));
    }

    @Override // pt2.bar
    public final void d(com.truecaller.startup_dialogs.StartupDialogType startupDialogType, com.truecaller.startup_dialogs.StartupDialogDismissReason startupDialogDismissReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startupDialogType, "dialogType");
        j93.b bVar = (j93.b) this.p0.getValue();
        bVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startupDialogType, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        m03.r.t(bVar, new b00.bar(bVar, startupDialogType, startupDialogDismissReason, (df3.bar) null, 12));
    }

    public final void i(androidx.fragment.app.g1 g1Var, androidx.fragment.app.Fragment fragment) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g1Var, "fragmentManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (!(fragment instanceof c93.a) && !(fragment instanceof e93.f)) {
            boolean z = fragment instanceof q83.bar;
            kotlin.Lazy lazy = this.s0;
            if (z) {
                java.lang.String str2 = (java.lang.String) ((java.util.Map) lazy.getValue()).get(fragment.getClass().getName());
                if (str2 != null) {
                    u0().w(new q83.k(str2));
                    return;
                }
                return;
            }
            if ((fragment instanceof q83.q) && (str = (java.lang.String) ((java.util.Map) lazy.getValue()).get(fragment.getClass().getName())) != null) {
                u0().w(new q83.m(str, (android.os.Bundle) null, 6));
                return;
            }
            return;
        }
        u0().w(new q83.m("Page_Profile", (android.os.Bundle) null, 6));
    }

    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        j93.b bVar = (j93.b) this.p0.getValue();
        bVar.getClass();
        m03.r.t(bVar, new gp0.j(bVar, i, (df3.bar) null, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBackPressed() {
        rn0.d0 d0Var = this.f0;
        if (d0Var != null) {
            if (d0Var.get() == com.truecaller.wizard.WizardVerificationMode.CHANGE_NUMBER && !w0().d("wizard_RequiredStepsCompleted", false)) {
                finishAffinity();
                return;
            } else {
                super/*androidx.activity.ComponentActivity*/.onBackPressed();
                return;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("wizardVerificationMode");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.wizard.Hilt_WizardActivity
    public final void onCreate(android.os.Bundle bundle) {
        boolean z;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        int i = 1;
        yy.qux.B(this, true, new ex2.qux(com.truecaller.themes.utils.StatusBarStyle.AUTO));
        super.onCreate(bundle);
        if (fu.baz.z()) {
            setRequestedOrientation(1);
        }
        getSupportFragmentManager().q.add(this);
        androidx.lifecycle.t lifecycle = getLifecycle();
        nc0.r1 r1Var = this.i0;
        df3.bar barVar = null;
        if (r1Var != null) {
            lifecycle.a(r1Var);
            setResult(0);
            u03.b0 b0Var = this.l0;
            if (b0Var != null) {
                try {
                    android.content.res.Resources resources = ((u03.g0) b0Var).a.getResources();
                    java.lang.ThreadLocal threadLocal = i6.h.a;
                    if (resources.getDrawable(2131233264, null) != null) {
                        setContentView(2131561138);
                        w0().n("wizard_StartContext", getIntent().getStringExtra("extraStartContext"));
                        if (getIntent().getBooleanExtra("extraWizardResetDefaultPage", false)) {
                            w0().p("wizard_StartPage");
                            w0().p("wizard_splash");
                        }
                        android.content.Intent intent = getIntent();
                        if (intent != null) {
                            v0();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                            if ("deepLink".equals(intent.getStringExtra("AppUserInteraction.Context")) && w0().d("wizard_FullyCompleted", false)) {
                                y0();
                                finish();
                                return;
                            }
                        }
                        int i2 = 3;
                        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o73.b(this, barVar, i), 3);
                        if (getIntent().getStringExtra("EXTRA_REG_NUDGE") != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (getIntent().getStringExtra("EXTRA_THROTTLED") == null) {
                            i = 0;
                        }
                        i.d0 d0Var = this.k0;
                        if (d0Var != null) {
                            h93.baz bazVar = (h93.baz) d0Var.b;
                            if (z) {
                                yb0.i.I(bazVar, com.truecaller.wizard.api.WizardStartContext.NUDGE_NOTIFICATION);
                            } else if (i != 0) {
                                yb0.i.I(bazVar, com.truecaller.wizard.api.WizardStartContext.THROTTLED_NOTIFICATION);
                            } else if (ne0.baz.i.getBoolean("regNudgeBadgeSet", false) && yb0.i.z(bazVar) == com.truecaller.wizard.api.WizardStartContext.INIT) {
                                yb0.i.I(bazVar, com.truecaller.wizard.api.WizardStartContext.NUDGE_BADGE);
                            }
                            if ((!z && yb0.i.z(bazVar) == com.truecaller.wizard.api.WizardStartContext.NUDGE_NOTIFICATION) || (i == 0 && yb0.i.z(bazVar) == com.truecaller.wizard.api.WizardStartContext.THROTTLED_NOTIFICATION)) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "<this>");
                                bazVar.p("wizard_StartContext");
                            }
                            x0(getIntent());
                            fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o73.b(this, barVar, i2), 3);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("registrationNudgeStartContextHelper");
                        throw null;
                    }
                } catch (android.content.res.Resources.NotFoundException unused) {
                }
                startActivity(new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.forcedupdate.ui.SimpleForceUpdateActivity.class));
                finish();
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("resourceProvider");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("unauthenticatedEventsUploadObserver");
        throw null;
    }

    @Override // com.truecaller.wizard.Hilt_WizardActivity
    public final void onDestroy() {
        super.onDestroy();
        getSupportFragmentManager().q.remove(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        getIntent().putExtras(intent);
        x0(intent);
    }

    public final void onStart() {
        super.onStart();
        t0 = true;
    }

    public final void onStop() {
        super.onStop();
        t0 = false;
    }

    public final q83.baz t0(java.lang.String str) {
        if (kotlin.jvm.internal.Intrinsics.b(str, "Page_Profile")) {
            str = "Page_Create_Profile";
        }
        if (kotlin.jvm.internal.Intrinsics.b(str, "Page_Create_Profile")) {
            qo1.s sVar = this.n0;
            if (sVar != null) {
                if (sVar.a()) {
                    return new q83.baz(e93.f.class, true);
                }
                return new q83.baz(c93.a.class, true);
            }
            kotlin.jvm.internal.Intrinsics.n("searchFeaturesInventory");
            throw null;
        }
        return (q83.baz) ((java.util.Map) this.r0.getValue()).get(str);
    }

    public final q83.u0 u0() {
        return (q83.u0) this.q0.getValue();
    }

    public final o73.m v0() {
        o73.m mVar = this.m0;
        if (mVar != null) {
            return mVar;
        }
        kotlin.jvm.internal.Intrinsics.n("wizardListener");
        throw null;
    }

    public final h93.baz w0() {
        h93.baz bazVar = this.e0;
        if (bazVar != null) {
            return bazVar;
        }
        kotlin.jvm.internal.Intrinsics.n("wizardSettings");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, qx2.bh, ci3.m] */
    public final void x0(android.content.Intent intent) {
        qx2.lh lhVar;
        if (intent != null) {
            v0();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            if ("deepLink".equals(intent.getStringExtra("AppUserInteraction.Context"))) {
                qc3.bar barVar = this.h0;
                com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2 = null;
                if (barVar != null) {
                    nc0.a aVar = (nc0.bar) barVar.get();
                    bi3.y0 y0Var = qx2.bh.c;
                    hi3.a aVar2 = qx2.bh.d;
                    bi3.j0[] j0VarArr = (bi3.j0[]) y0Var.v().toArray(new bi3.j0[0]);
                    boolean[] zArr = new boolean[j0VarArr.length];
                    try {
                        ?? obj = new java.lang.Object();
                        if (zArr[0]) {
                            lhVar = null;
                        } else {
                            bi3.j0 j0Var = j0VarArr[0];
                            lhVar = (qx2.lh) aVar2.g(j0Var.f, aVar2.j(j0Var));
                        }
                        obj.a = lhVar;
                        if (!zArr[1]) {
                            bi3.j0 j0Var2 = j0VarArr[1];
                            clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) aVar2.g(j0Var2.f, aVar2.j(j0Var2));
                        }
                        obj.b = clientHeaderV2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "build(...)");
                        aVar.c((ci3.m) obj);
                        return;
                    } catch (bi3.bar e) {
                        throw e;
                    } catch (java.lang.Exception e2) {
                        throw new java.lang.RuntimeException(e2);
                    }
                }
                kotlin.jvm.internal.Intrinsics.n("analytics");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0() {
        if (getIntent() != null && getIntent().hasExtra("extraRequestCode")) {
            return;
        }
        v0();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "activity");
        y90.m6.R(this, com.truecaller.bottombar.BottomBarButtonType.CALLS, "wizard");
    }

    public final void z0() {
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o73.b(this, null, 4), 3);
        android.content.Context context = v0().c;
        od.n s = t.c.s(context, "context", context, "context", context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(s, "getInstance(...)");
        nd.l lVar = nd.l.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.tagger.impl.sync.TagInitWorker.class, "workerClass");
        s.g("TagInitWorker", lVar, new f6.v0(com.truecaller.tagger.impl.sync.TagInitWorker.class).v(nd.d.j).d());
        s62.f fVar = this.o0;
        if (fVar != null) {
            fVar.a(2131363489, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationRegistrationNudge");
        } else {
            kotlin.jvm.internal.Intrinsics.n("notificationManager");
            throw null;
        }
    }
}
