package com.truecaller.videocallerid.ui.manageincomingvideo;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/videocallerid/ui/manageincomingvideo/ManageIncomingVideoSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "video-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ManageIncomingVideoSettingsActivity extends com.truecaller.videocallerid.ui.manageincomingvideo.Hilt_ManageIncomingVideoSettingsActivity {
    public ck2.bar d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.videocallerid.ui.manageincomingvideo.Hilt_ManageIncomingVideoSettingsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        androidx.core.widget.NestedScrollView inflate = getLayoutInflater().inflate(2131558485, (android.view.ViewGroup) null, false);
        int i = 2131365059;
        if (((com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView) df0.qux.o(2131365059, inflate)) != null) {
            i = 2131367108;
            androidx.appcompat.widget.Toolbar o = df0.qux.o(2131367108, inflate);
            if (o != null) {
                androidx.core.widget.NestedScrollView nestedScrollView = inflate;
                ck2.bar barVar = new ck2.bar((android.view.View) nestedScrollView, 21, (java.lang.Object) o);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "inflate(...)");
                this.d0 = barVar;
                setContentView(nestedScrollView);
                ck2.bar barVar2 = this.d0;
                if (barVar2 != null) {
                    androidx.appcompat.widget.Toolbar toolbar = (androidx.appcompat.widget.Toolbar) barVar2.c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
                    ak.r0.i(toolbar, com.truecaller.common.ui.insets.InsetType.StatusBar);
                    ck2.bar barVar3 = this.d0;
                    if (barVar3 != null) {
                        setSupportActionBar((androidx.appcompat.widget.Toolbar) barVar3.c);
                        i.baz supportActionBar = getSupportActionBar();
                        if (supportActionBar != null) {
                            supportActionBar.p(true);
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }
}
