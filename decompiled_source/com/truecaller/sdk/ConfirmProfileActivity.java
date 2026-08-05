package com.truecaller.sdk;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class ConfirmProfileActivity extends com.truecaller.sdk.Hilt_ConfirmProfileActivity implements ip2.a, android.view.View.OnClickListener {
    public androidx.recyclerview.widget.RecyclerView d0;
    public androidx.appcompat.widget.AppCompatTextView e0;
    public androidx.appcompat.widget.AppCompatTextView f0;
    public androidx.appcompat.widget.AppCompatTextView g0;
    public com.truecaller.sdk.f h0;
    public w31.c i0;
    public u03.g0 j0;
    public android.graphics.drawable.Drawable k0;
    public android.graphics.drawable.Drawable l0;

    @androidx.annotation.Keep
    @com.airbnb.deeplinkdispatch.DeepLink({"truecallersdk://truesdk/mweb_verify"})
    public static android.content.Intent getLaunchIntent(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.Nullable android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.sdk.ConfirmProfileActivity.class);
        intent.addFlags(268468224);
        intent.putExtras(bundle);
        return intent;
    }

    @Override // ip2.baz
    public final void M0() {
        this.h0.f2();
    }

    @Override // ip2.baz
    public final void N0(android.text.SpannableStringBuilder spannableStringBuilder) {
        ((android.widget.TextView) findViewById(2131366817)).setText(spannableStringBuilder);
    }

    @Override // ip2.baz
    public final void P0(java.lang.String str) {
        java.lang.String str2;
        com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig = this.i0.h0;
        if (avatarXConfig != null) {
            str2 = avatarXConfig.d;
        } else {
            str2 = "";
        }
        this.i0.B2(new com.truecaller.common.ui.avatar.AvatarXConfig(str, str2));
    }

    @Override // ip2.baz
    public final void Q0() {
        this.d0 = findViewById(2131365837);
        this.e0 = findViewById(2131364943);
        this.f0 = findViewById(2131363184);
        this.g0 = findViewById(2131363101);
        findViewById(2131365836).setPresenter(this.i0);
        this.g0.setOnClickListener(this);
        this.k0 = this.j0.j(2131233199, 2130970931);
        this.l0 = this.j0.j(2131233200, 2130970931);
    }

    @Override // ip2.baz
    public final void R0() {
        this.h0.h2();
    }

    @Override // ip2.baz
    public final void S0(boolean z) {
        ho2.a aVar = (ho2.a) this.d0.getAdapter();
        int i = 2;
        if (z) {
            aVar.notifyItemRangeInserted(2, aVar.m.size() - 2);
            i = aVar.m.size();
        } else {
            aVar.notifyItemRangeRemoved(2, aVar.m.size() - 2);
        }
        aVar.o = i;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(2131366183);
        zc.t tVar = new zc.t();
        zc.n nVar = new zc.n();
        nVar.b(2131363227);
        nVar.b(2131363147);
        nVar.a(new com.truecaller.sdk.a(this, z, 1));
        tVar.T(nVar);
        tVar.V(300L);
        zc.r.a(viewGroup, tVar);
    }

    @Override // ip2.baz
    public final void T0(com.truecaller.android.sdk.common.models.TrueProfile trueProfile) {
        this.h0.c2(trueProfile);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ip2.baz
    public final void U0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.e0.setText(android.text.Html.fromHtml(getString(2132018904, str2)));
        ((android.widget.TextView) findViewById(2131365647)).setText(str4);
        this.g0.setText(getString(2132018899));
        this.f0.setText(getString(2132018878));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ip2.baz
    public final boolean V0() {
        if (g6.b.b(this, "android.permission.READ_PHONE_STATE") == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ip2.baz
    public final void h0() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(2131366183);
        zc.bar barVar = new zc.bar();
        barVar.S(new com.truecaller.sdk.b(this, 1));
        zc.r.a(viewGroup, barVar);
        findViewById(2131364613).setVisibility(0);
        findViewById(2131363227).setVisibility(8);
        ho2.a aVar = (ho2.a) this.d0.getAdapter();
        java.lang.String string = getString(2132022888);
        aVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "inProgressText");
        java.util.List j = kotlin.collections.y.j(new ho2.bar[]{aVar.m.get(0), new ho2.bar(string, 0)});
        aVar.m = j;
        aVar.o = j.size();
        aVar.notifyDataSetChanged();
        findViewById(2131367122).setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ip2.baz
    public final void j0() {
        finish();
        overridePendingTransition(0, 0);
    }

    public final void onBackPressed() {
        ((com.truecaller.sdk.g) this.h0).n2().t(2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int id = view.getId();
        if (id == 2131363101) {
            ((com.truecaller.sdk.g) this.h0).n2().w();
        } else if (id == 2131363184) {
            ((com.truecaller.sdk.g) this.h0).n2().u();
        } else if (id == 2131364943) {
            this.h0.e2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.sdk.Hilt_ConfirmProfileActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (this.h0.d2(bundle)) {
            this.h0.u0(this);
        } else {
            finish();
        }
    }

    @Override // com.truecaller.sdk.Hilt_ConfirmProfileActivity
    public final void onDestroy() {
        super.onDestroy();
        this.h0.m1();
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        this.h0.g2(bundle);
    }

    public final void onStop() {
        super.onStop();
        com.truecaller.sdk.g gVar = (com.truecaller.sdk.g) this.h0;
        java.util.Locale locale = gVar.u;
        if (locale != null) {
            gVar.l.s(locale);
        }
    }

    @Override // ip2.baz
    public final void u(java.lang.String str) {
        findViewById(2131364944).setVisibility(0);
        this.f0.setText(str);
        this.f0.setVisibility(0);
        this.f0.setOnClickListener(this);
    }
}
