package com.truecaller.settings.impl.ui.privacy;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/settings/impl/ui/privacy/PrivacySettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class PrivacySettingsFragment extends androidx.fragment.app.Fragment implements bd3.qux {
    public final kotlin.Lazy A;
    public final kotlin.Lazy B;
    public final kotlin.Lazy C;
    public final kotlin.Lazy D;
    public yc3.h c;
    public volatile yc3.d e;
    public final androidx.lifecycle.o1 h;
    public rs2.bar i;
    public os2.o j;
    public qb2.u k;
    public final kotlin.Lazy l;
    public final kotlin.Lazy m;
    public final kotlin.Lazy n;
    public final kotlin.Lazy o;
    public final kotlin.Lazy p;
    public final kotlin.Lazy q;
    public final kotlin.Lazy r;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public final kotlin.Lazy y;
    public final kotlin.Lazy z;
    public boolean d = false;
    public final java.lang.Object f = new java.lang.Object();
    public boolean g = false;

    public PrivacySettingsFragment() {
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new ob2.b(new ob2.b(this, 6), 7));
        this.h = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(os2.u.class), new nb2.c(lazy, 15), new nu2.a(9, this, lazy), new nb2.c(lazy, 16));
        this.l = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$Activity$Availability.a);
        this.m = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$Activity$ProfileViewNotifications.a);
        this.n = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$Activity$WhoViewedMe.a);
        this.o = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$Activity$SearchProfilesPrivately.a);
        this.p = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$Activity$ControlAds.a);
        this.q = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$Activity$AnonymizedData.a);
        this.r = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$Activity$FraudMessageLogging.a);
        this.s = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$Activity$Supernova.a);
        this.t = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$Activity$VerifiedBusinessCallLogs.a);
        this.u = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$ManageData$DownloadData.a);
        this.v = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$ManageData$RectifyData.a);
        this.w = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$ManageData$AuthorisedApps.a);
        this.x = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$ManageData$ChangePhoneNumber.a);
        this.y = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$ManageData$DisconnectGoogle.a);
        this.z = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$ManageData$DeactivateAccount.a);
        this.A = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$ManageData$PrivacyPolicy.a);
        this.B = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$ManageData$PublicationCertificate.a);
        this.C = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$Activity$BizPrivacyVCEventsToggle.a);
        this.D = o82.a.q(this, com.truecaller.settings.impl.ui.privacy.PrivacySettings$ManageData$ManageComments.a);
    }

    public final os2.o R4() {
        os2.o oVar = this.j;
        if (oVar != null) {
            return oVar;
        }
        kotlin.jvm.internal.Intrinsics.n("privacySettingsNavigator");
        throw null;
    }

    public final os2.u S4() {
        return (os2.u) this.h.getValue();
    }

    public final void T4() {
        if (this.c == null) {
            this.c = new yc3.h(super.getContext(), this);
            this.d = cu0.j1.x(super.getContext());
        }
    }

    public final void U4() {
        if (!this.g) {
            this.g = true;
            tx.p pVar = (os2.f) X3();
            this.i = (rs2.bar) pVar.O.get();
            this.j = (os2.o) pVar.z4.get();
            this.k = (qb2.u) pVar.f.zi.get();
        }
    }

    @Override // bd3.baz
    public final java.lang.Object X3() {
        if (this.e == null) {
            synchronized (this.f) {
                try {
                    if (this.e == null) {
                        this.e = new yc3.d(this);
                    }
                } finally {
                }
            }
        }
        return this.e.X3();
    }

    public final android.content.Context getContext() {
        if (super.getContext() == null && !this.d) {
            return null;
        }
        T4();
        return this.c;
    }

    public final androidx.lifecycle.q1 getDefaultViewModelProviderFactory() {
        return bf0.s2.J(this, super.getDefaultViewModelProviderFactory());
    }

    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        T4();
        U4();
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return new android.widget.FrameLayout(requireContext());
    }

    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(new yc3.h(onGetLayoutInflater, this));
    }

    public final void onResume() {
        super.onResume();
        os2.u S4 = S4();
        S4.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(S4), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new os2.s(S4, null, 1), 3);
        os2.u S42 = S4();
        S42.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(S42), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new os2.s(S42, null, 0), 3);
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        androidx.appcompat.app.AppCompatActivity requireActivity = requireActivity();
        kotlin.jvm.internal.Intrinsics.e(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        i.baz supportActionBar = requireActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.B(getString(2132023345));
            rs2.bar barVar = this.i;
            if (barVar != null) {
                ro0.f.d(barVar, S4().h, new os2.b(this, 0));
                pe0.j.u(this, S4().j, new os2.e(this, 1));
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("searchSettingUiHandler");
                throw null;
            }
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    public final void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
        yc3.h hVar = this.c;
        fj.a.i(hVar == null || yc3.d.c(hVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new java.lang.Object[0]);
        T4();
        U4();
    }
}
