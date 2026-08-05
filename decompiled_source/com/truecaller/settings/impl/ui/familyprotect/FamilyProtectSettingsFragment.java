package com.truecaller.settings.impl.ui.familyprotect;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/truecaller/settings/impl/ui/familyprotect/FamilyProtectSettingsFragment;", "Landroidx/fragment/app/Fragment;", "Lp41/bar;", "<init>", "()V", "bs2/b", "Lbs2/v;", "currentUiState", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class FamilyProtectSettingsFragment extends a42.bar implements p41.bar {
    public rs2.bar i;
    public u03.f0 j;
    public bs2.p k;
    public final androidx.lifecycle.o1 l;
    public final j13.bar m;
    public androidx.compose.ui.platform.ComposeView n;
    public androidx.compose.ui.platform.ComposeView o;
    public androidx.compose.ui.platform.ComposeView p;
    public androidx.compose.ui.platform.ComposeView q;
    public androidx.compose.ui.platform.ComposeView r;
    public final kotlin.Lazy s;
    public final kotlin.Lazy t;
    public final bs2.m u;
    public final int v;
    public static final /* synthetic */ kotlin.reflect.KProperty[] x = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/settings/impl/databinding/FragmentFamilyProtectSettingsBinding;", com.truecaller.settings.impl.ui.familyprotect.FamilyProtectSettingsFragment.class))};
    public static final bs2.b w = new java.lang.Object();

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public FamilyProtectSettingsFragment() {
        super(4);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new ad2.a(new ad2.a(this, 7), 8));
        this.l = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(bs2.g0.class), new az1.a(lazy, 4), new az1.b(3, this, lazy), new az1.a(lazy, 5));
        ?? obj = new java.lang.Object();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj, "viewBinder");
        this.m = new j13.bar(obj);
        this.s = kotlin.LazyKt.lazy(new bs2.f(this, 2));
        this.t = kotlin.LazyKt.lazy(new bs2.f(this, 3));
        this.u = new bs2.m(this, 0);
        this.v = 8;
    }

    public final void E(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        f6();
        Z5().h.setNavigationIcon((android.graphics.drawable.Drawable) null);
        Z5().h.setTitleMarginStart(getResources().getDimensionPixelSize(2131166371));
    }

    public final com.truecaller.common.ui.o O4() {
        return new com.truecaller.common.ui.o();
    }

    public final void Y1(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
    }

    public final wq2.qux Z5() {
        return (wq2.qux) this.m.getValue(this, x[0]);
    }

    public final bs2.p a6() {
        bs2.p pVar = this.k;
        if (pVar != null) {
            return pVar;
        }
        kotlin.jvm.internal.Intrinsics.n("familyProtectSettingsNavigator");
        throw null;
    }

    public final float b6() {
        if (((bs2.v) c6().o.a.getValue()).e != null) {
            return r0.intValue() / getResources().getDisplayMetrics().density;
        }
        return 45;
    }

    public final bs2.g0 c6() {
        return (bs2.g0) this.l.getValue();
    }

    public final void d6() {
        androidx.compose.ui.platform.ComposeView composeView = this.n;
        androidx.compose.ui.platform.ComposeView composeView2 = this.o;
        androidx.compose.ui.platform.ComposeView composeView3 = this.p;
        if (composeView != null && composeView.getParent() != null && composeView2 != null && composeView2.getParent() != null && composeView3 != null && composeView3.getParent() != null) {
            return;
        }
        androidx.compose.ui.platform.ComposeView findViewWithTag = requireView().findViewWithTag(com.truecaller.settings.impl.ui.familyprotect.FamilyProtectSettings$FamilyProtectAdminSettings$NotificationSettings.a);
        androidx.compose.ui.platform.ComposeView findViewWithTag2 = requireView().findViewWithTag(com.truecaller.settings.impl.ui.familyprotect.FamilyProtectSettings$FamilyProtectAdminSettings$BlockList.a);
        androidx.compose.ui.platform.ComposeView findViewWithTag3 = requireView().findViewWithTag(com.truecaller.settings.impl.ui.familyprotect.FamilyProtectSettings$FamilyProtectAdminSettings$AdvancedBlocking.a);
        if (findViewWithTag != null && findViewWithTag2 != null && findViewWithTag3 != null) {
            if (findViewWithTag != this.n || findViewWithTag2 != this.o || findViewWithTag3 != this.p) {
                this.n = findViewWithTag;
                this.o = findViewWithTag2;
                this.p = findViewWithTag3;
                findViewWithTag.setContent(new d3.qux(-1026974315, new bs2.c(this, 7), true));
                findViewWithTag2.setContent(new d3.qux(1727826380, new bs2.c(this, 8), true));
                findViewWithTag3.setContent(new d3.qux(-85966323, new bs2.c(this, 9), true));
            }
        }
    }

    public final void e6() {
        androidx.compose.ui.platform.ComposeView composeView = this.q;
        androidx.compose.ui.platform.ComposeView composeView2 = this.r;
        if (composeView != null && composeView.getParent() != null && composeView2 != null && composeView2.getParent() != null) {
            return;
        }
        androidx.compose.ui.platform.ComposeView findViewWithTag = requireView().findViewWithTag(com.truecaller.settings.impl.ui.familyprotect.FamilyProtectSettings$FamilyProtectMemberSettings$NotificationSettings.a);
        androidx.compose.ui.platform.ComposeView findViewWithTag2 = requireView().findViewWithTag(com.truecaller.settings.impl.ui.familyprotect.FamilyProtectSettings$FamilyProtectMemberSettings$BlockList.a);
        if (findViewWithTag != null && findViewWithTag2 != null) {
            if (findViewWithTag != this.q || findViewWithTag2 != this.r) {
                this.q = findViewWithTag;
                this.r = findViewWithTag2;
                findViewWithTag.setContent(new d3.qux(1071060004, new bs2.c(this, 10), true));
                findViewWithTag2.setContent(new d3.qux(570535629, new bs2.c(this, 0), true));
            }
        }
    }

    public final void f6() {
        com.truecaller.settings.impl.ui.SettingsActivity settingsActivity;
        u6.c2 a2Var;
        int i;
        i.baz supportActionBar;
        com.truecaller.settings.impl.ui.SettingsActivity requireActivity = requireActivity();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (requireActivity instanceof com.truecaller.settings.impl.ui.SettingsActivity) {
            settingsActivity = requireActivity;
        } else {
            settingsActivity = null;
        }
        if (settingsActivity != null && (supportActionBar = settingsActivity.getSupportActionBar()) != null) {
            supportActionBar.g();
        }
        androidx.appcompat.widget.Toolbar toolbar = Z5().h;
        toolbar.setNavigationOnClickListener(new a42.qux(this, 18));
        if (toolbar.isLaidOut() && !toolbar.isLayoutRequested()) {
            com.google.android.material.appbar.CollapsingToolbarLayout collapsingToolbarLayout = Z5().c;
            int height = toolbar.getHeight();
            android.view.ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            }
            if (marginLayoutParams != null) {
                i = marginLayoutParams.topMargin;
            } else {
                i = 0;
            }
            collapsingToolbarLayout.setScrimVisibleHeightTrigger(height + i + 1);
        } else {
            toolbar.addOnLayoutChangeListener(new as.bar(this, 1));
        }
        Z5().b.a(this.u);
        boolean z = !dx2.bar.d();
        if (cp1.bar.v(this)) {
            android.view.Window window = requireActivity().getWindow();
            po1.baz bazVar = new po1.baz(Z5().a);
            int i2 = android.os.Build.VERSION.SDK_INT;
            if (i2 >= 35) {
                a2Var = new u6.c2(window, bazVar);
            } else if (i2 >= 30) {
                a2Var = new u6.c2(window, bazVar);
            } else if (i2 >= 26) {
                a2Var = new u6.a2(window, bazVar);
            } else {
                a2Var = new u6.a2(window, bazVar);
            }
            a2Var.O(z);
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = Z5().a;
        a32.a aVar = new a32.a(this, 13);
        java.util.WeakHashMap weakHashMap = u6.t0.a;
        u6.k0.m(coordinatorLayout, aVar);
    }

    public final void l2() {
    }

    public final void n4(boolean z) {
    }

    public final void onDestroyView() {
        bs2.m mVar;
        u6.c2 a2Var;
        i.baz supportActionBar;
        com.truecaller.settings.impl.ui.SettingsActivity settingsActivity = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof com.truecaller.settings.impl.ui.SettingsActivity) {
            settingsActivity = (com.truecaller.settings.impl.ui.SettingsActivity) requireActivity;
        }
        if (settingsActivity != null && (supportActionBar = settingsActivity.getSupportActionBar()) != null) {
            supportActionBar.D();
        }
        boolean z = !dx2.bar.d();
        if (cp1.bar.v(this)) {
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
        java.util.ArrayList arrayList = Z5().b.h;
        if (arrayList != null && (mVar = this.u) != null) {
            arrayList.remove(mVar);
        }
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        f6();
        rs2.bar barVar = this.i;
        if (barVar != null) {
            android.widget.FrameLayout frameLayout = Z5().f;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "settingsContainer");
            ro0.f.c(barVar, frameLayout, c6().p, false, new bs2.f(this, 1), new bs2.e(this, 2), 4);
            pe0.j.s(this, c6().o, new bs2.i(this, 1));
            pe0.j.s(this, c6().g, new bs2.i(this, 0));
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("uiHandler");
        throw null;
    }

    public final java.lang.String p() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("analytics_context")) != null) {
            return string;
        }
        return "blockSettings";
    }

    /* renamed from: z4, reason: from getter */
    public final int getV() {
        return this.v;
    }
}
