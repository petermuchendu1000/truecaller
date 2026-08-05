package com.truecaller.settings.impl.ui.general;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/settings/impl/ui/general/GeneralSettingsFragment;", "Landroidx/fragment/app/Fragment;", "Le41/v;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class GeneralSettingsFragment extends a42.bar implements e41.v {
    public final kotlin.Lazy A;
    public final kotlin.Lazy B;
    public final kotlin.Lazy C;
    public final kotlin.Lazy D;
    public final kotlin.Lazy E;
    public final kotlin.Lazy F;
    public final kotlin.Lazy G;
    public final kotlin.Lazy H;
    public final kotlin.Lazy I;
    public final kotlin.Lazy J;
    public final kotlin.Lazy K;
    public final kotlin.Lazy L;
    public final kotlin.Lazy M;
    public final kotlin.Lazy N;
    public final kotlin.Lazy O;
    public final g.baz P;
    public final g.baz Q;
    public final g.baz R;
    public final androidx.lifecycle.o1 i;
    public rs2.bar j;
    public com.truecaller.settings.impl.ui.j k;
    public gs2.c1 l;
    public hk2.i m;
    public qz1.bar n;
    public sz1.baz o;
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

    public GeneralSettingsFragment() {
        super(18);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new e93.e(new e93.e(this, 15), 16));
        this.i = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(gs2.v.class), new ev2.qux(lazy, 12), new az1.b(23, this, lazy), new ev2.qux(lazy, 13));
        this.p = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$RingtoneBanner$Companion.a);
        this.q = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$Ringtone$Companion.a);
        this.r = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$RingtoneBanner$SettingsPermissionBanner.a);
        this.s = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$Ringtone$ChangeRingtone.a);
        this.t = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$MessageSounds$ChatSound.a);
        this.u = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$MessageSounds$SmsSound.a);
        this.v = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$MessageSounds$Vibrate.a);
        this.w = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance.Default.a);
        this.x = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance.Bright.a);
        this.y = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings.Appearance.Dark.a);
        this.z = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$DataAndStorage$AutoDownloadMedia.a);
        this.A = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$DataAndStorage$DownloadTranslations.a);
        this.B = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$DataAndStorage$ManageStorage.a);
        this.C = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$BackupStorageFullBanner$Companion.a);
        this.D = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$BackupSmsBanner$SmsPermission.a);
        this.E = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.ChangeBackup.a);
        this.F = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.Video.a);
        this.G = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.Frequency.a);
        this.H = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.Network.a);
        this.I = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.GoogleAccount.a);
        this.J = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings.Backup.BackupNow.a);
        this.K = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$Languages$AppLanguage.a);
        this.L = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$Shortcuts$Messages.a);
        this.M = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$Shortcuts$Contacts.a);
        this.N = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings$Shortcuts$Dialer.a);
        this.O = o82.a.q(this, com.truecaller.settings.impl.ui.general.GeneralSettings.EnhancedSearch.ChangeEnhancedSearch.a);
        final int i = 0;
        g.baz registerForActivityResult = registerForActivityResult(new androidx.fragment.app.a1(8), new g.bar(this) { // from class: gs2.c0
            public final /* synthetic */ com.truecaller.settings.impl.ui.general.GeneralSettingsFragment b;

            {
                this.b = this;
            }

            public final void onActivityResult(java.lang.Object obj) {
                android.net.Uri uri;
                android.net.Uri uri2;
                android.net.Uri uri3;
                androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
                switch (i) {
                    case 0:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            android.content.Intent intent = activityResult.b;
                            if (intent != null) {
                                uri = (android.net.Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                            } else {
                                uri = null;
                            }
                            gs2.v a6 = this.b.a6();
                            a6.getClass();
                            fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new gs2.t(a6, uri, null, 1), 3);
                            return;
                        }
                        return;
                    case 1:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            android.content.Intent intent2 = activityResult.b;
                            if (intent2 != null) {
                                uri2 = (android.net.Uri) intent2.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                            } else {
                                uri2 = null;
                            }
                            gs2.v a62 = this.b.a6();
                            a62.getClass();
                            fg3.h0.J(androidx.lifecycle.g1.l(a62), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new gs2.t(a62, uri2, null, 0), 3);
                            return;
                        }
                        return;
                    default:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            android.content.Intent intent3 = activityResult.b;
                            if (intent3 != null) {
                                uri3 = (android.net.Uri) intent3.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                            } else {
                                uri3 = null;
                            }
                            gs2.v a64 = this.b.a6();
                            a64.getClass();
                            fg3.h0.J(androidx.lifecycle.g1.l(a64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new gs2.t(a64, uri3, null, 2), 3);
                            return;
                        }
                        return;
                }
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.P = registerForActivityResult;
        final int i2 = 1;
        g.baz registerForActivityResult2 = registerForActivityResult(new androidx.fragment.app.a1(8), new g.bar(this) { // from class: gs2.c0
            public final /* synthetic */ com.truecaller.settings.impl.ui.general.GeneralSettingsFragment b;

            {
                this.b = this;
            }

            public final void onActivityResult(java.lang.Object obj) {
                android.net.Uri uri;
                android.net.Uri uri2;
                android.net.Uri uri3;
                androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
                switch (i2) {
                    case 0:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            android.content.Intent intent = activityResult.b;
                            if (intent != null) {
                                uri = (android.net.Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                            } else {
                                uri = null;
                            }
                            gs2.v a6 = this.b.a6();
                            a6.getClass();
                            fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new gs2.t(a6, uri, null, 1), 3);
                            return;
                        }
                        return;
                    case 1:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            android.content.Intent intent2 = activityResult.b;
                            if (intent2 != null) {
                                uri2 = (android.net.Uri) intent2.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                            } else {
                                uri2 = null;
                            }
                            gs2.v a62 = this.b.a6();
                            a62.getClass();
                            fg3.h0.J(androidx.lifecycle.g1.l(a62), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new gs2.t(a62, uri2, null, 0), 3);
                            return;
                        }
                        return;
                    default:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            android.content.Intent intent3 = activityResult.b;
                            if (intent3 != null) {
                                uri3 = (android.net.Uri) intent3.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                            } else {
                                uri3 = null;
                            }
                            gs2.v a64 = this.b.a6();
                            a64.getClass();
                            fg3.h0.J(androidx.lifecycle.g1.l(a64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new gs2.t(a64, uri3, null, 2), 3);
                            return;
                        }
                        return;
                }
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult2, "registerForActivityResult(...)");
        this.Q = registerForActivityResult2;
        final int i3 = 2;
        g.baz registerForActivityResult3 = registerForActivityResult(new androidx.fragment.app.a1(8), new g.bar(this) { // from class: gs2.c0
            public final /* synthetic */ com.truecaller.settings.impl.ui.general.GeneralSettingsFragment b;

            {
                this.b = this;
            }

            public final void onActivityResult(java.lang.Object obj) {
                android.net.Uri uri;
                android.net.Uri uri2;
                android.net.Uri uri3;
                androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
                switch (i3) {
                    case 0:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            android.content.Intent intent = activityResult.b;
                            if (intent != null) {
                                uri = (android.net.Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                            } else {
                                uri = null;
                            }
                            gs2.v a6 = this.b.a6();
                            a6.getClass();
                            fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new gs2.t(a6, uri, null, 1), 3);
                            return;
                        }
                        return;
                    case 1:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            android.content.Intent intent2 = activityResult.b;
                            if (intent2 != null) {
                                uri2 = (android.net.Uri) intent2.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                            } else {
                                uri2 = null;
                            }
                            gs2.v a62 = this.b.a6();
                            a62.getClass();
                            fg3.h0.J(androidx.lifecycle.g1.l(a62), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new gs2.t(a62, uri2, null, 0), 3);
                            return;
                        }
                        return;
                    default:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "result");
                        if (activityResult.a == -1) {
                            android.content.Intent intent3 = activityResult.b;
                            if (intent3 != null) {
                                uri3 = (android.net.Uri) intent3.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                            } else {
                                uri3 = null;
                            }
                            gs2.v a64 = this.b.a6();
                            a64.getClass();
                            fg3.h0.J(androidx.lifecycle.g1.l(a64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new gs2.t(a64, uri3, null, 2), 3);
                            return;
                        }
                        return;
                }
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult3, "registerForActivityResult(...)");
        this.R = registerForActivityResult3;
    }

    public final void L3(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        if (kotlin.jvm.internal.Intrinsics.b(tcSystemDialog.getTag(), "TAG_ENABLE_BACKUP_WARNING_DIALOG")) {
            a6().c.c(com.truecaller.analytics.common.event.ViewActionEvent.BackupAction.DISMISS_ENABLE_BACKUP_WARNING.getValue());
        }
    }

    public final gs2.c1 Z5() {
        gs2.c1 c1Var = this.l;
        if (c1Var != null) {
            return c1Var;
        }
        kotlin.jvm.internal.Intrinsics.n("navigator");
        throw null;
    }

    public final gs2.v a6() {
        return (gs2.v) this.i.getValue();
    }

    public final void e2(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        if (kotlin.jvm.internal.Intrinsics.b(tcSystemDialog.getTag(), "TAG_ENABLE_BACKUP_WARNING_DIALOG")) {
            gs2.v a6 = a6();
            a6.c.c(com.truecaller.analytics.common.event.ViewActionEvent.BackupAction.CANCEL_ENABLE_BACKUP_WARNING.getValue());
            a6.b.q();
        }
    }

    public final void f3(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        if (kotlin.jvm.internal.Intrinsics.b(tcSystemDialog.getTag(), "TAG_ENABLE_BACKUP_WARNING_DIALOG")) {
            gs2.v a6 = a6();
            a6.c.c(com.truecaller.analytics.common.event.ViewActionEvent.BackupAction.CONFIRM_ENABLE_BACKUP_WARNING.getValue());
            a6.s(true, true);
        }
    }

    public final void k4(java.lang.String str, com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        if (kotlin.jvm.internal.Intrinsics.b(tcSystemDialog.getTag(), "TAG_ENABLE_BACKUP_WARNING_DIALOG")) {
            gs2.c1 Z5 = Z5();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "url");
            android.content.Context requireContext = Z5.a.requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            i61.bar.t(requireContext, str);
        }
    }

    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super/*androidx.fragment.app.Fragment*/.onActivityResult(i, i2, intent);
        if (i != 4321) {
            return;
        }
        Z5().b.a.b.u().a();
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return new android.widget.FrameLayout(requireContext());
    }

    public final void onResume() {
        super/*androidx.fragment.app.Fragment*/.onResume();
        gs2.v a6 = a6();
        a6.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new gs2.r(a6, null, 3), 3);
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        androidx.appcompat.app.AppCompatActivity requireActivity = requireActivity();
        kotlin.jvm.internal.Intrinsics.e(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        i.baz supportActionBar = requireActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.B(getString(2132023247));
            rs2.bar barVar = this.j;
            if (barVar != null) {
                ro0.f.d(barVar, a6().g, new gs2.f0(this, 1));
                pe0.j.u(this, a6().i, new g93.z(6, this, view));
                pe0.j.s(this, a6().j, new dr2.c(this, 19));
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("searchSettingUiHandler");
            throw null;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }
}
