package com.truecaller.settings.impl.ui.messaging;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/settings/impl/ui/messaging/MessagingSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class MessagingSettingsFragment extends kc0.t {
    public final kotlin.Lazy A;
    public final kotlin.Lazy B;
    public final kotlin.Lazy C;
    public final androidx.lifecycle.o1 i;
    public rs2.bar j;
    public final kotlin.Lazy k;
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

    public MessagingSettingsFragment() {
        super(1);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new k91.d(new k91.d(this, 5), 6));
        this.i = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(ks2.i.class), new iq1.c(lazy, 22), new iq1.d(23, this, lazy), new iq1.c(lazy, 23));
        this.k = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings$DefaultSMSApp$DefaultSMSStatus.a);
        this.l = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings$Passcode$PasscodeLock.a);
        this.m = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings.ThreeLevelOfSpam.MessagingThreeLevelOfSpamStatus.a);
        this.n = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings$SMSSettings$Companion.a);
        this.o = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings$SMSSettings$GroupTransport.a);
        this.p = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings.MessageID.ManagePreferences.a);
        this.q = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings$SmartSMS$Companion.a);
        this.r = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings$SmartSMS$SmartNotifications.a);
        this.s = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings$SmartSMS$SmartReminders.a);
        this.t = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings$Sim1$Companion.a);
        this.u = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings$Sim1$SMSDeliveryReports.a);
        this.v = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings$Sim1$AutoDownloadMMS.a);
        this.w = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings$Sim1$AutoDownloadMMSWhenRoaming.a);
        this.x = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2.Companion.a);
        this.y = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2.SMSDeliveryReports.a);
        this.z = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2.AutoDownloadMMS.a);
        this.A = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings.Sim2.AutoDownloadMMSWhenRoaming.a);
        this.B = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings$ChatSettings$ReadReceipts.a);
        this.C = o82.a.q(this, com.truecaller.settings.impl.ui.messaging.MessagingSettings.FraudWarnings.FraudWarningsToggle.a);
    }

    public final ks2.i a6() {
        return (ks2.i) this.i.getValue();
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return new android.widget.FrameLayout(requireContext());
    }

    public final void onResume() {
        super/*androidx.fragment.app.Fragment*/.onResume();
        ks2.i a6 = a6();
        a6.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new jp2.b(a6, null, 19), 3);
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity appCompatActivity;
        i.baz bazVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        androidx.appcompat.app.AppCompatActivity requireActivity = requireActivity();
        if (requireActivity instanceof androidx.appcompat.app.AppCompatActivity) {
            appCompatActivity = requireActivity;
        } else {
            appCompatActivity = null;
        }
        if (appCompatActivity != null) {
            bazVar = appCompatActivity.getSupportActionBar();
        } else {
            bazVar = null;
        }
        if (bazVar != null) {
            bazVar.B(getString(2132023295));
        }
        rs2.bar barVar = this.j;
        if (barVar != null) {
            ro0.f.d(barVar, a6().e, new ks2.qux(this, 0));
            pe0.j.s(this, (ig3.q1) a6().c.k, new jf1.k(this, 8));
        } else {
            kotlin.jvm.internal.Intrinsics.n("searchSettingUiHandler");
            throw null;
        }
    }
}
