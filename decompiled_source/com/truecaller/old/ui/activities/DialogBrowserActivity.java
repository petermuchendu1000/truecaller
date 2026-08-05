package com.truecaller.old.ui.activities;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class DialogBrowserActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    public static final /* synthetic */ int c0 = 0;
    public android.webkit.WebView a0;
    public android.view.View b0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        java.lang.String stringExtra = getIntent().getStringExtra("ARG_URL");
        boolean booleanExtra = getIntent().getBooleanExtra("ARG_SUPPORTS_FILES", false);
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("Empty URL for DialogBrowserActivity");
            finish();
            return;
        }
        yy.qux.m(getTheme());
        setContentView(2131561009);
        this.a0 = (android.webkit.WebView) findViewById(2131367584);
        this.b0 = findViewById(2131367583);
        findViewById(2131363490).setOnClickListener(this);
        this.a0.setWebViewClient(new l20.baz(this.b0, booleanExtra));
        this.a0.loadUrl(stringExtra);
    }
}
