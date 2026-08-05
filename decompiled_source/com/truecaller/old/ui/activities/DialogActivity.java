package com.truecaller.old.ui.activities;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class DialogActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final /* synthetic */ int a0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        getTheme().applyStyle(2132083915, false);
        int i = m03.v.b;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(this).inflate(2131559040, (android.view.ViewGroup) null);
        linearLayout.addView(android.view.LayoutInflater.from(this).inflate(2131559005, (android.view.ViewGroup) null));
        setContentView(linearLayout);
        android.view.View findViewById = findViewById(android.R.id.content);
        m03.v.i((android.widget.TextView) findViewById.findViewById(2131363495), getIntent().getStringExtra("ARG_TITLE"));
        m03.v.i((android.widget.TextView) findViewById.findViewById(2131363491), getIntent().getStringExtra("ARG_TEXT"));
        m03.v.j(findViewById.findViewById(2131363497), false, true);
        m03.v.j(findViewById.findViewById(2131363493), false, true);
        m03.v.i((android.widget.TextView) findViewById.findViewById(2131363492), getString(2132019051));
        findViewById.findViewById(2131363492).setOnClickListener(new a42.qux(this, 24));
    }
}
