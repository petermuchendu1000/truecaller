package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class FragmentActivityBase extends com.truecaller.ui.Hilt_FragmentActivityBase {
    public androidx.fragment.app.Fragment d0;
    public qw2.a0 e0;
    public qw2.d0 f0;
    public qo1.m g0;
    public androidx.appcompat.widget.Toolbar h0;

    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        if (this.g0.a.a("featureNewConfigurationUpdate_45524", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
            super.onConfigurationChanged(configuration);
        } else {
            super.onConfigurationChanged(getResources().getConfiguration());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ui.Hilt_FragmentActivityBase
    public void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (bundle == null) {
            nc0.u1.f(r11.bar.a(), getIntent());
        }
    }

    @Override // com.truecaller.ui.Hilt_FragmentActivityBase
    public void onDestroy() {
        super.onDestroy();
        getClass().getSimpleName().concat("#onDestroy()");
    }

    public void onPause() {
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        getClass().getSimpleName().concat("#onPause()");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onPrepareOptionsMenu(android.view.Menu menu) {
        v0(menu);
        return super/*android.app.Activity*/.onPrepareOptionsMenu(menu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        getClass().getSimpleName().concat("#onResume()");
        if (!((qw2.b0) this.e0).i()) {
            qw2.d0 d0Var = this.f0;
            d0Var.getClass();
            d0Var.h(com.truecaller.bottombar.BottomBarButtonType.CALLS);
            finish();
            return;
        }
        supportInvalidateOptionsMenu();
    }

    public void onStart() {
        super.onStart();
        getClass().getSimpleName().concat("#onStart()");
    }

    public void onStop() {
        super.onStop();
        getClass().getSimpleName().concat("#onStop()");
    }

    public final void onSupportActionModeStarted(n.baz bazVar) {
        v0(bazVar.c());
        super.onSupportActionModeStarted(bazVar);
    }

    public final void setSupportActionBar(androidx.appcompat.widget.Toolbar toolbar) {
        this.h0 = toolbar;
        super.setSupportActionBar(toolbar);
    }

    public int u0() {
        return 2130971058;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0(android.view.Menu menu) {
        android.graphics.drawable.Drawable icon;
        if (menu != null) {
            int u0 = u0();
            for (int i = 0; i < menu.size(); i++) {
                android.view.MenuItem item = menu.getItem(i);
                int i2 = m03.v.b;
                if (item != null && (icon = item.getIcon()) != null) {
                    icon.setTint(bi3.a.s(this, u0));
                    item.setIcon(icon);
                }
            }
        }
    }
}
