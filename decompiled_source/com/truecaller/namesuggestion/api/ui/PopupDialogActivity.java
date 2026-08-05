package com.truecaller.namesuggestion.api.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class PopupDialogActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    public android.view.View a0;
    public e52.qux c0;
    public final android.graphics.drawable.ColorDrawable b0 = new android.graphics.drawable.ColorDrawable(0);
    public final e52.bar d0 = new e52.bar(this, 0);

    public final void finish() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, this.a0.getHeight());
        ofFloat.setDuration(getResources().getInteger(android.R.integer.config_shortAnimTime));
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator(1.0f));
        ofFloat.addUpdateListener(this.d0);
        ofFloat.addListener(new ad.b(this, 4));
        ofFloat.start();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (view.getId() != 16908290 || this.c0 != null) {
            return;
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        yy.qux.m(getTheme());
        setContentView(2131558491);
        getWindow().setBackgroundDrawable(this.b0);
        android.view.View findViewById = findViewById(android.R.id.content);
        this.a0 = findViewById;
        findViewById.getViewTreeObserver().addOnPreDrawListener(new e52.baz(this, 0));
        this.a0.setOnClickListener(this);
        com.truecaller.namesuggestion.impl.ui.c t0 = t0();
        this.c0 = t0;
        if (t0 != null) {
            androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.bar j = bar.j(supportFragmentManager, supportFragmentManager);
            j.g(2131364006, this.c0, (java.lang.String) null);
            j.l();
        }
    }

    public abstract com.truecaller.namesuggestion.impl.ui.c t0();
}
