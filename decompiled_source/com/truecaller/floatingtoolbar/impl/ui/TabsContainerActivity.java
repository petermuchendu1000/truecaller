package com.truecaller.floatingtoolbar.impl.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/floatingtoolbar/impl/ui/TabsContainerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ok3/bar", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TabsContainerActivity extends com.truecaller.floatingtoolbar.impl.ui.Hilt_TabsContainerActivity {
    public static final /* synthetic */ int i0 = 0;
    public ck2.bar d0;
    public java.lang.String e0;
    public java.lang.String f0;
    public q6.baz g0;
    public fd1.a h0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.floatingtoolbar.impl.ui.Hilt_TabsContainerActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        androidx.constraintlayout.widget.ConstraintLayout inflate = android.view.LayoutInflater.from(this).inflate(2131558506, (android.view.ViewGroup) null, false);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) df0.qux.o(2131364005, inflate);
        if (frameLayout != null) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
            ck2.bar barVar = new ck2.bar(constraintLayout, 23, frameLayout);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "inflate(...)");
            this.d0 = barVar;
            setContentView(constraintLayout);
            ck2.bar barVar2 = this.d0;
            if (barVar2 != null) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = barVar2.b;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
                ak.r0.i(constraintLayout2, com.truecaller.common.ui.insets.InsetType.NavigationBar);
                android.content.Intent intent = getIntent();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                t0(intent);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(2131364005)));
    }

    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        t0(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return false;
    }

    public final void onStart() {
        super.onStart();
        java.lang.String str = this.e0;
        if (str == null) {
            str = "n/a";
        }
        java.lang.String str2 = this.f0;
        if (str2 != null) {
            fd1.a aVar = this.h0;
            if (aVar != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "viewId");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "context");
                bd.bar.u(aVar.a, str2, str);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("callHistoryTabsAnalytics");
            throw null;
        }
    }

    public final void onStop() {
        super.onStop();
        this.e0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0(android.content.Intent intent) {
        java.lang.String str;
        com.truecaller.floatingtoolbar.api.CallHistoryTab$Type callHistoryTab$Type = (com.truecaller.floatingtoolbar.api.CallHistoryTab$Type) ((android.os.Parcelable) g6.b.g(intent, "selected_tab", com.truecaller.floatingtoolbar.api.CallHistoryTab$Type.class));
        if (callHistoryTab$Type != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("is_deep_link_flag", false);
            java.lang.String stringExtra = getIntent().getStringExtra("analytics_context");
            if (stringExtra == null) {
                stringExtra = "callTab_recents";
            }
            boolean booleanExtra2 = getIntent().getBooleanExtra("EXTRA_FORCE_SHOW_DEFAULT_DIALER_POP_UP", false);
            if (booleanExtra) {
                stringExtra = "deepLink";
            }
            this.e0 = stringExtra;
            fp1.bar barVar = new fp1.bar(stringExtra, getIntent().getStringExtra("args_campaign_id"), booleanExtra, booleanExtra2);
            int i = lp1.bar.a[callHistoryTab$Type.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = null;
                    } else {
                        str = "Truestories";
                    }
                } else {
                    str = "callTab_callRecording";
                }
            } else {
                str = "callTab_balance";
            }
            this.f0 = str;
            q6.baz bazVar = this.g0;
            if (bazVar != null) {
                androidx.fragment.app.Fragment t = bazVar.t(callHistoryTab$Type, barVar);
                if (t != null) {
                    androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.bar barVar2 = new androidx.fragment.app.bar(supportFragmentManager);
                    barVar2.g(2131364005, t, (java.lang.String) null);
                    barVar2.l();
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("callHistoryFragmentProvider");
            throw null;
        }
    }
}
