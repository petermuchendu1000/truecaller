package com.truecaller.settings.impl.ui.block;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/truecaller/settings/impl/ui/block/BlockSettingsFragment;", "Landroidx/fragment/app/Fragment;", "Lp41/bar;", "Le41/v;", "<init>", "()V", "e00/b", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class BlockSettingsFragment extends a42.bar implements p41.bar, e41.v {
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
    public final kotlin.Lazy P;
    public final kotlin.Lazy Q;
    public final kotlin.Lazy R;
    public final kotlin.Lazy S;
    public final kotlin.Lazy T;
    public final kotlin.Lazy U;
    public final kotlin.Lazy V;
    public er2.b W;
    public int X;
    public boolean Y;
    public java.lang.Integer Z;
    public final kotlin.Lazy a0;
    public final g.baz b0;
    public final bs2.m c0;
    public rs2.bar i;
    public u03.f0 j;
    public qb2.u k;
    public i82.t l;
    public er2.d1 m;
    public hk2.s n;
    public final androidx.lifecycle.o1 o;
    public final rb.g p;
    public final j13.bar q;
    public final kotlin.Lazy r;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final kotlin.Lazy u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public final kotlin.Lazy y;
    public final kotlin.Lazy z;
    public static final /* synthetic */ kotlin.reflect.KProperty[] e0 = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/settings/impl/databinding/FragmentBlockSettingsBinding;", com.truecaller.settings.impl.ui.block.BlockSettingsFragment.class))};
    public static final e00.b d0 = new e00.b(21);

    public BlockSettingsFragment() {
        super(14);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new e93.e(new er2.u(this, 1), 2));
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        this.o = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(er2.n1.class), new az1.a(lazy, 28), new az1.b(17, this, lazy), new az1.a(lazy, 29));
        this.p = new rb.g(l0Var.getOrCreateKotlinClass(er2.w.class), new er2.u(this, 0));
        er2.v vVar = new er2.v(0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "viewBinder");
        this.q = new j13.bar(vVar);
        this.r = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$SpamList$Companion.a);
        this.s = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$SpamList$Banner.a);
        this.t = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$Block$NotificationForBlockedCalls.a);
        this.u = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$Block$NotificationForBlockedMessages.a);
        this.v = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$Block$HowToBlockCalls.a);
        this.w = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$AdvancedBlock$UnknownNumbers.a);
        this.x = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$AdvancedBlock$ForeignNumbers.a);
        this.y = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$AdvancedBlock$NonPhonebookNumbers.a);
        this.z = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$ManualBlock$PhoneNumber.a);
        this.A = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$ManualBlock$Name.a);
        this.B = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$AdvancedBlock$BlockNeighbourSpoofing.a);
        this.C = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$PremiumBlock$BlockNeighbourSpoofing.a);
        this.D = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$AdvancedBlock$BlockVerifiedBusinesses.a);
        this.E = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$AdvancedBlock$BlockNumberSeriesCalls.a);
        this.F = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$PremiumBlock$BlockNumberSeriesCalls.a);
        this.G = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings.HowToHandleSpamCalls.HowToHandleSpamCallOptions.a);
        this.H = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings.HowToHandleSpamCalls.Companion.a);
        this.I = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$PremiumBlock$GetPremium.a);
        this.J = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$ManualBlock$SenderName.a);
        this.K = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$ManualBlock$CountryCode.a);
        this.L = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$ManualBlock$NumberAdvanced.a);
        this.M = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$ManualBlock$ManageBlockList.a);
        this.N = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$BlockAds$Ads.a);
        this.O = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$CallAssistant$AssistantSpamCalls.a);
        this.P = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings.ThreeLevelOfSpam.MessagingThreeLevelOfSpamStatus.a);
        this.Q = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$Block$Companion.a);
        this.R = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$PremiumBlock$Companion.a);
        this.S = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$ManualBlock$Companion.a);
        this.T = o82.a.q(this, com.truecaller.settings.impl.ui.block.BlockSettings$AdvancedBlock$Companion.a);
        this.U = kotlin.LazyKt.lazy(new er2.j(this, 9));
        this.V = kotlin.LazyKt.lazy(new er2.j(this, 10));
        this.W = new er2.a(false);
        this.X = bd.bar.q(0);
        this.Y = true;
        this.a0 = kotlin.LazyKt.lazy(new er2.j(this, 11));
        g.baz registerForActivityResult = registerForActivityResult(new androidx.fragment.app.a1(8), new er2.k(this));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.b0 = registerForActivityResult;
        this.c0 = new bs2.m(this, 1);
    }

    public final void E(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        i6(new da0.baz(24, this, str));
    }

    public final void L3(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
    }

    public final com.truecaller.common.ui.o O4() {
        return new com.truecaller.common.ui.o();
    }

    public final void Y1(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
    }

    public final wq2.bar Z5() {
        return (wq2.bar) this.q.getValue(this, e0[0]);
    }

    public final android.graphics.drawable.Drawable a6(er2.b bVar) {
        int i;
        u03.f0 f0Var = this.j;
        if (f0Var != null) {
            if (bVar instanceof er2.baz) {
                i = 2131231401;
            } else if (bVar instanceof er2.qux) {
                i = 2131231403;
            } else if (bVar instanceof er2.a) {
                i = 2131231404;
            } else {
                throw new java.lang.RuntimeException();
            }
            android.graphics.drawable.Drawable d = ((u03.g0) f0Var).d(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "getDrawable(...)");
            return d;
        }
        kotlin.jvm.internal.Intrinsics.n("resourceProvider");
        throw null;
    }

    public final er2.d1 b6() {
        er2.d1 d1Var = this.m;
        if (d1Var != null) {
            return d1Var;
        }
        kotlin.jvm.internal.Intrinsics.n("navigator");
        throw null;
    }

    public final er2.n1 c6() {
        return (er2.n1) this.o.getValue();
    }

    public final void d6() {
        com.truecaller.settings.impl.ui.SettingsActivity settingsActivity;
        i.baz supportActionBar;
        com.truecaller.settings.impl.ui.SettingsActivity requireActivity = requireActivity();
        if (requireActivity instanceof com.truecaller.settings.impl.ui.SettingsActivity) {
            settingsActivity = requireActivity;
        } else {
            settingsActivity = null;
        }
        if (settingsActivity != null && (supportActionBar = settingsActivity.getSupportActionBar()) != null) {
            supportActionBar.g();
        }
        android.view.Window window = requireActivity().getWindow();
        kotlin.jvm.internal.Intrinsics.d(window);
        yy.qux.l(window);
        window.setStatusBarColor(0);
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = Z5().a;
        er2.k kVar = new er2.k(this);
        java.util.WeakHashMap weakHashMap = u6.t0.a;
        u6.k0.m(coordinatorLayout, kVar);
    }

    public final void e2(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
    }

    public final void e6() {
        com.truecaller.settings.impl.ui.SettingsActivity settingsActivity;
        bs2.m mVar;
        i.baz supportActionBar;
        com.truecaller.settings.impl.ui.SettingsActivity requireActivity = requireActivity();
        if (requireActivity instanceof com.truecaller.settings.impl.ui.SettingsActivity) {
            settingsActivity = requireActivity;
        } else {
            settingsActivity = null;
        }
        if (settingsActivity != null && (supportActionBar = settingsActivity.getSupportActionBar()) != null) {
            supportActionBar.D();
        }
        f6(!dx2.bar.d());
        java.util.ArrayList arrayList = Z5().c.h;
        if (arrayList != null && (mVar = this.c0) != null) {
            arrayList.remove(mVar);
        }
    }

    public final void f3(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        java.lang.String tag = tcSystemDialog.getTag();
        if (tag != null && tag.hashCode() == -755606015 && tag.equals("tag_block_verified_businesses_confirmation_dialog")) {
            c6().b.s(true);
        }
    }

    public final void f6(boolean z) {
        u6.c2 a2Var;
        if (!cp1.bar.v(this)) {
            return;
        }
        android.view.Window window = requireActivity().getWindow();
        po1.baz bazVar = new po1.baz(Z5().a);
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 35) {
            a2Var = new u6.c2(window, bazVar);
        } else if (i >= 30) {
            a2Var = new u6.c2(window, bazVar);
        } else if (i >= 26) {
            a2Var = new u6.a2(window, bazVar);
        } else {
            a2Var = new u6.a2(window, bazVar);
        }
        a2Var.O(z);
    }

    public final void g6() {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        d6();
        androidx.appcompat.widget.Toolbar toolbar = Z5().k;
        toolbar.setNavigationContentDescription(2132019198);
        toolbar.setNavigationOnClickListener(new er2.l(this, 12));
        if (toolbar.isLaidOut() && !toolbar.isLayoutRequested()) {
            com.google.android.material.appbar.CollapsingToolbarLayout collapsingToolbarLayout = Z5().d;
            int height = toolbar.getHeight();
            android.view.ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                i = marginLayoutParams.topMargin;
            } else {
                i = 0;
            }
            collapsingToolbarLayout.setScrimVisibleHeightTrigger(height + i + 1);
        } else {
            toolbar.addOnLayoutChangeListener(new as.bar(this, 3));
        }
        Z5().c.a(this.c0);
    }

    public final void h6(boolean z) {
        qb2.t tVar;
        if (z) {
            qb2.u uVar = this.k;
            if (uVar != null) {
                tVar = uVar.d;
            } else {
                kotlin.jvm.internal.Intrinsics.n("interstitialNavControllerRegistry");
                throw null;
            }
        } else {
            qb2.u uVar2 = this.k;
            if (uVar2 != null) {
                tVar = uVar2.c;
            } else {
                kotlin.jvm.internal.Intrinsics.n("interstitialNavControllerRegistry");
                throw null;
            }
        }
        qb2.t tVar2 = tVar;
        qb2.t.h(tVar2, this.b0, true, false, false, (java.lang.String) null, new er2.j(this, 3), com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    public final void i6(kotlin.jvm.functions.Function0 function0) {
        if (getView() == null) {
            return;
        }
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new el0.a(this, function0, (df3.bar) null, 5), 3);
    }

    public final void k4(java.lang.String str, com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
    }

    public final void l2() {
        c6().t();
    }

    public final void n4(boolean z) {
        i6(new er2.j(this, 8));
    }

    public final void onDestroyView() {
        e6();
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
    }

    public final void onResume() {
        int i;
        java.lang.Object value;
        super/*androidx.fragment.app.Fragment*/.onResume();
        er2.n1 c6 = c6();
        er2.l0 l0Var = c6.b;
        jq2.b bVar = l0Var.i;
        jq2.b bVar2 = l0Var.i;
        if (bVar.y("key_temp_change_block_method") && l0Var.k.h()) {
            com.truecaller.calling_common.settings.CallingSettings.BlockMethod blockMethod = com.truecaller.calling_common.settings.CallingSettings.BlockMethod.Mute;
            int i2 = er2.z.b[blockMethod.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = 8;
                } else {
                    throw new java.lang.RuntimeException();
                }
            } else {
                i = 4;
            }
            bVar2.d0("blockCallMethod", i);
            ig3.h2 h2Var = l0Var.x;
            do {
                value = h2Var.getValue();
            } while (!h2Var.n(value, er2.g1.a((er2.g1) value, false, false, false, false, false, false, l0Var.g(blockMethod), false, false, false, false, null, null, null, false, null, 4194175)));
            c6.u(er2.u0.a);
        }
        bVar2.c0("key_temp_change_block_method", false);
        c6().w();
        c6().t();
        if (isVisible()) {
            d6();
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "outState");
        super/*androidx.fragment.app.Fragment*/.onSaveInstanceState(bundle);
        bundle.putBoolean("appBarExpanded", this.Y);
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        g6();
        kotlin.Lazy lazy = this.a0;
        if (((com.truecaller.settings.impl.framework.ui.model.CategoryType) lazy.getValue()) != null) {
            Z5().c.f(false, false, true);
            com.truecaller.settings.impl.framework.ui.model.CategoryType categoryType = (com.truecaller.settings.impl.framework.ui.model.CategoryType) lazy.getValue();
            if (categoryType != null) {
                er2.n1 c6 = c6();
                c6.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categoryType, "settingItem");
                m03.r.t(c6, new c1.baz(categoryType, c6, (df3.bar) null, 8));
            }
        }
        if (bundle != null) {
            Z5().c.f(bundle.getBoolean("appBarExpanded", this.Y), false, true);
        }
        if (((er2.w) this.p.getValue()).d) {
            h6(true);
        }
        er2.n1 c62 = c6();
        androidx.lifecycle.d1 d1Var = c62.j;
        com.truecaller.settings.api.SettingsSource settingsSource = (com.truecaller.settings.api.SettingsSource) d1Var.a("source");
        java.lang.Object a = d1Var.a("analytics_context");
        if (a != null) {
            java.lang.String str = (java.lang.String) a;
            if (settingsSource != com.truecaller.settings.api.SettingsSource.BOTTOM_BAR) {
                ak0.qux quxVar = c62.h;
                quxVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "context");
                bd.bar.u(quxVar.a, "blockView", str);
            }
            rs2.bar barVar = this.i;
            if (barVar != null) {
                android.widget.FrameLayout frameLayout = Z5().j;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "settingsContainer");
                int i = 0;
                ro0.f.c(barVar, frameLayout, c6().o, false, new er2.j(this, i), new er2.n(this, i), 4);
                pe0.j.s(this, c6().b.y, new er2.s(this, 0));
                pe0.j.u(this, c6().q, new er2.s(this, 1));
                pe0.j.u(this, c6().s, new er2.t(this));
                pe0.j.s(this, (ig3.q1) c6().d.d, new er2.s(this, 2));
                pe0.j.s(this, ig3.w1.I(c6().u), new er2.s(this, 3));
                com.truecaller.settings.impl.ui.block.autoblockspammers.AutoBlockSpammersSelectorView autoBlockSpammersSelectorView = Z5().b;
                er2.j jVar = new er2.j(this, 2);
                er2.j jVar2 = new er2.j(this, 6);
                er2.j jVar3 = new er2.j(this, 7);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "onOffClick");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar2, "onBasicClick");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar3, "onMaxClick");
                d91.n0 n0Var = autoBlockSpammersSelectorView.v;
                ((com.google.android.material.button.MaterialButton) n0Var.f).setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(jVar, 28));
                n0Var.d.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(jVar2, 29));
                ((com.google.android.material.button.MaterialButton) n0Var.e).setOnClickListener(new gr2.bar(jVar3, 0));
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("uiHandler");
            throw null;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.");
    }

    public final java.lang.String p() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("analytics_context")) != null) {
            return string;
        }
        return "blockSettings";
    }

    public final int z4() {
        return 8;
    }
}
