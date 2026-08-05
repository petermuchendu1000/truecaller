package com.truecaller.detailsview.presentation.ui.screen;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/detailsview/presentation/ui/screen/DetailsViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DetailsViewActivity extends com.truecaller.detailsview.presentation.ui.screen.Hilt_DetailsViewActivity {
    public static final /* synthetic */ int k0 = 0;
    public pd1.k d0;
    public i82.t e0;
    public qc3.bar f0;
    public mk.e g0;
    public oc1.bar h0;
    public lv0.bar i0;
    public final androidx.lifecycle.o1 j0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ke1.l0.class), new ke1.b(this, 1), new ke1.b(this, 0), new ke1.b(this, 2));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.detailsview.presentation.ui.screen.Hilt_DetailsViewActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Extras detailsViewIntentBuilder$Extras = (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Extras) ((android.os.Parcelable) g6.b.g(intent, "DetailsViewExtras", com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Extras.class));
        if (detailsViewIntentBuilder$Extras != null) {
            t0(detailsViewIntentBuilder$Extras.getSource(), detailsViewIntentBuilder$Extras.getAction());
            e.d.a(this, new d3.qux(1816187885, new ji1.baz(8, this, detailsViewIntentBuilder$Extras), true));
            fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ke1.a(this, null, 1), 3);
            return;
        }
        throw new java.lang.IllegalStateException("Missing extras!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.detailsview.presentation.ui.screen.Hilt_DetailsViewActivity
    public final void onDestroy() {
        lv0.bar barVar = this.i0;
        if (barVar != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "activity");
            tf2.k0 k0Var = barVar.e;
            if (k0Var != null) {
                k0Var.c(this);
            }
            barVar.e = null;
            super.onDestroy();
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("callInterstitialCoordinator");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        setIntent(intent);
        com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Extras detailsViewIntentBuilder$Extras = (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Extras) ((android.os.Parcelable) g6.b.g(intent, "DetailsViewExtras", com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Extras.class));
        if (detailsViewIntentBuilder$Extras != null) {
            t0(detailsViewIntentBuilder$Extras.getSource(), detailsViewIntentBuilder$Extras.getAction());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestart() {
        super/*android.app.Activity*/.onRestart();
        ke1.l0 l0Var = (ke1.l0) this.j0.getValue();
        if (l0Var.c0) {
            l0Var.c0 = false;
            l0Var.u.c(com.truecaller.detailsview.api.model.DetailsViewSource.CallFromDV.getValue());
        }
    }

    public final void reportFullyDrawn() {
        try {
            mk.e eVar = this.g0;
            if (eVar != null) {
                eVar.m();
                super/*androidx.activity.ComponentActivity*/.reportFullyDrawn();
            } else {
                kotlin.jvm.internal.Intrinsics.n("viewFullyDrawnReporter");
                throw null;
            }
        } catch (java.lang.SecurityException e) {
            o82.a.C(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0(com.truecaller.detailsview.api.model.DetailsViewSource detailsViewSource, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action detailsViewIntentBuilder$Action) {
        com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.RegisterForInterstitialLauncher registerForInterstitialLauncher;
        com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource detailsViewIntentBuilder$OutgoingCallSource;
        com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator.Source source;
        com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator.OutgoingCallSource outgoingCallSource;
        boolean z;
        if (detailsViewIntentBuilder$Action instanceof com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.RegisterForInterstitialLauncher) {
            registerForInterstitialLauncher = (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.RegisterForInterstitialLauncher) detailsViewIntentBuilder$Action;
        } else {
            registerForInterstitialLauncher = null;
        }
        if (registerForInterstitialLauncher != null) {
            detailsViewIntentBuilder$OutgoingCallSource = registerForInterstitialLauncher.getOutgoingCallSource();
        } else {
            detailsViewIntentBuilder$OutgoingCallSource = null;
        }
        lv0.bar barVar = this.i0;
        if (barVar != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsViewSource, "<this>");
            boolean z2 = true;
            if (lv0.baz.a[detailsViewSource.ordinal()] == 1) {
                source = com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator.Source.AfterInAppOutgoingCall;
            } else {
                source = com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator.Source.Other;
            }
            if (detailsViewIntentBuilder$OutgoingCallSource != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsViewIntentBuilder$OutgoingCallSource, "<this>");
                int i = lv0.baz.b[detailsViewIntentBuilder$OutgoingCallSource.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            outgoingCallSource = com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator.OutgoingCallSource.T9Search;
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    } else {
                        outgoingCallSource = com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator.OutgoingCallSource.Dialpad;
                    }
                } else {
                    outgoingCallSource = com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator.OutgoingCallSource.CallLog;
                }
            } else {
                outgoingCallSource = null;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "activity");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "activity");
            tf2.k0 k0Var = barVar.e;
            if (k0Var != null) {
                k0Var.c(this);
            }
            barVar.e = null;
            java.lang.Object obj = barVar.a.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            u03.c cVar = (u03.b) obj;
            if (!cVar.o() && cVar.b() && source == com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator.Source.AfterInAppOutgoingCall && kotlin.collections.CollectionsKt.N(barVar.d, outgoingCallSource)) {
                z = true;
            } else {
                z = false;
            }
            if (source == com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator.Source.AfterInAppOutgoingCall) {
                z2 = false;
            }
            if (z) {
                tf2.k0 k0Var2 = (tf2.k0) barVar.b.get();
                barVar.e = k0Var2;
                k0Var2.b(this);
                return;
            } else {
                if (z2) {
                    tf2.k0 k0Var3 = (tf2.k0) barVar.c.get();
                    barVar.e = k0Var3;
                    k0Var3.b(this);
                    return;
                }
                return;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("callInterstitialCoordinator");
        throw null;
    }
}
