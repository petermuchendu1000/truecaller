package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class CallMeBackActivity extends com.truecaller.ui.Hilt_CallMeBackActivity implements android.view.View.OnClickListener {
    public static final /* synthetic */ int x0 = 0;
    public final android.graphics.drawable.ColorDrawable d0 = new android.graphics.drawable.ColorDrawable(android.graphics.Color.argb(178, 0, 0, 0));
    public nc0.bar e0;
    public nv0.c f0;
    public n11.g g0;
    public bm.e h0;
    public w31.g i0;
    public u03.f0 j0;
    public qc3.bar k0;
    public android.view.View l0;
    public android.view.View m0;
    public java.lang.String n0;
    public java.lang.Integer o0;
    public java.lang.String p0;
    public com.truecaller.data.entity.Contact q0;
    public java.lang.String r0;
    public android.animation.ValueAnimator s0;
    public android.animation.ValueAnimator t0;
    public android.content.SharedPreferences u0;
    public com.truecaller.calling.initiate_call.InitiateCallHelper.CallContextOption v0;
    public com.truecaller.calling.initiate_call.InitiateCallHelper.DialAssistOptions w0;

    public static android.content.Intent u0(android.content.Context context, com.truecaller.data.entity.Contact contact, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, com.truecaller.calling.initiate_call.InitiateCallHelper.CallContextOption callContextOption, com.truecaller.calling.initiate_call.InitiateCallHelper.DialAssistOptions dialAssistOptions, java.lang.Integer num) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.ui.CallMeBackActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(8388608);
        intent.addFlags(65536);
        intent.putExtra("ARG_CONTACT", (android.os.Parcelable) contact);
        intent.putExtra("ARG_NUMBER", str);
        intent.putExtra("ARG_SIM_SLOT", num);
        intent.putExtra("ARG_REASON", i);
        intent.putExtra("ARG_ANALYTICS_CONTEXT", str2);
        intent.putExtra("ARG_VIEW_ANALYTICS_CONTEXT", str3);
        intent.putExtra("dialAssistOptions", (android.os.Parcelable) dialAssistOptions);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("callContextOption", callContextOption);
        intent.putExtras(bundle);
        return intent;
    }

    public static android.text.SpannableStringBuilder w0(androidx.recyclerview.widget.r0 r0Var, java.lang.String str) {
        com.truecaller.ui.baz bazVar = new com.truecaller.ui.baz((android.content.Context) r0Var.f, r0Var);
        bazVar.setBounds(0, 0, bazVar.getIntrinsicWidth(), bazVar.getIntrinsicHeight());
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        spannableStringBuilder.insert(0, (java.lang.CharSequence) "# ");
        spannableStringBuilder.setSpan(new android.text.style.ImageSpan(bazVar), 0, 1, 18);
        return spannableStringBuilder;
    }

    public final void finish() {
        if (this.t0.isRunning()) {
            return;
        }
        this.t0.setFloatValues(0.0f, this.m0.getTop() * 1.5f);
        this.t0.start();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Boolean bool;
        int id = view.getId();
        if (id == 2131363169) {
            v0();
            return;
        }
        if (id == 2131362292) {
            bm.e eVar = this.h0;
            java.lang.String str = this.n0;
            c2.a aVar = new c2.a(this, 29);
            eVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "callback");
            if (!((qo1.k) eVar.j).h()) {
                aVar.invoke(java.lang.Boolean.FALSE);
                return;
            }
            fg3.k2 k2Var = (fg3.k2) eVar.k;
            if (k2Var != null) {
                bool = java.lang.Boolean.valueOf(k2Var.isActive());
            } else {
                bool = null;
            }
            if (!yp.d0.D(bool)) {
                eVar.k = fg3.h0.J(fg3.f1.a, (kotlin.coroutines.CoroutineContext) eVar.h, (fg3.f0) null, new o90.g(str, eVar, aVar, (df3.bar) null, 12), 2);
                return;
            }
            return;
        }
        if (id == 2131362763) {
            java.lang.String str2 = this.n0;
            java.lang.String str3 = this.r0;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "analyticsContext");
            android.os.Parcelable.Creator creator = com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource.CREATOR;
            com.truecaller.calling.initiate_call.InitiateCallHelper.CallContextOption callContextOption = this.v0;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callContextOption, "callContextOption");
            com.truecaller.calling.initiate_call.InitiateCallHelper.DialAssistOptions dialAssistOptions = this.w0;
            java.lang.Integer num = this.o0;
            com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource callSource = com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource.CALL_ME_BACK;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callSource, "source");
            this.f0.d(new com.truecaller.calling.initiate_call.InitiateCallHelper.CallOptions(str2, str3, str3, (java.lang.String) null, num, false, false, true, false, (android.telecom.PhoneAccountHandle) null, false, callContextOption, dialAssistOptions, callSource));
            v0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ui.Hilt_CallMeBackActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        pk3.c cVar;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        yy.qux.m(getTheme());
        setContentView(2131560961);
        getWindow().setBackgroundDrawable(this.d0);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s0 = ofFloat;
        ofFloat.setDuration(getResources().getInteger(android.R.integer.config_longAnimTime));
        this.s0.setInterpolator(new android.view.animation.DecelerateInterpolator(3.0f));
        final int i = 0;
        this.s0.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(this) { // from class: com.truecaller.ui.a
            public final /* synthetic */ com.truecaller.ui.CallMeBackActivity b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                int i2 = i;
                com.truecaller.ui.CallMeBackActivity callMeBackActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.ui.CallMeBackActivity.x0;
                        callMeBackActivity.getClass();
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        callMeBackActivity.l0.setTranslationY(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                        android.graphics.drawable.ColorDrawable colorDrawable = callMeBackActivity.d0;
                        colorDrawable.setColor(android.graphics.Color.argb((int) (animatedFraction * 255.0f * 0.7f), 0, 0, 0));
                        colorDrawable.invalidateSelf();
                        return;
                    default:
                        int i4 = com.truecaller.ui.CallMeBackActivity.x0;
                        callMeBackActivity.getClass();
                        float animatedFraction2 = valueAnimator.getAnimatedFraction();
                        callMeBackActivity.l0.setTranslationY(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                        android.graphics.drawable.ColorDrawable colorDrawable2 = callMeBackActivity.d0;
                        colorDrawable2.setColor(android.graphics.Color.argb((int) ((1.0f - animatedFraction2) * 255.0f * 0.7f), 0, 0, 0));
                        colorDrawable2.invalidateSelf();
                        return;
                }
            }
        });
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.t0 = ofFloat2;
        ofFloat2.setDuration(300L);
        this.t0.setInterpolator(new android.view.animation.AccelerateInterpolator(3.0f));
        android.animation.ValueAnimator valueAnimator = this.t0;
        boolean z = true;
        final char c = 1 == true ? 1 : 0;
        valueAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(this) { // from class: com.truecaller.ui.a
            public final /* synthetic */ com.truecaller.ui.CallMeBackActivity b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                int i2 = c;
                com.truecaller.ui.CallMeBackActivity callMeBackActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.ui.CallMeBackActivity.x0;
                        callMeBackActivity.getClass();
                        float animatedFraction = valueAnimator2.getAnimatedFraction();
                        callMeBackActivity.l0.setTranslationY(((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue());
                        android.graphics.drawable.ColorDrawable colorDrawable = callMeBackActivity.d0;
                        colorDrawable.setColor(android.graphics.Color.argb((int) (animatedFraction * 255.0f * 0.7f), 0, 0, 0));
                        colorDrawable.invalidateSelf();
                        return;
                    default:
                        int i4 = com.truecaller.ui.CallMeBackActivity.x0;
                        callMeBackActivity.getClass();
                        float animatedFraction2 = valueAnimator2.getAnimatedFraction();
                        callMeBackActivity.l0.setTranslationY(((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue());
                        android.graphics.drawable.ColorDrawable colorDrawable2 = callMeBackActivity.d0;
                        colorDrawable2.setColor(android.graphics.Color.argb((int) ((1.0f - animatedFraction2) * 255.0f * 0.7f), 0, 0, 0));
                        colorDrawable2.invalidateSelf();
                        return;
                }
            }
        });
        this.t0.addListener(new ad.b(this, 2));
        this.u0 = getSharedPreferences("callMeBackNotifications", 0);
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131367033);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(2131366692);
        com.truecaller.common.ui.avatar.AvatarXView findViewById = findViewById(2131362381);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(2131362292);
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(2131362763);
        android.view.View findViewById2 = findViewById(2131365048);
        this.m0 = findViewById(2131366821);
        this.l0 = findViewById(2131363169);
        if (this.g0.j()) {
            ((android.widget.ImageView) this.m0).setImageResource(2131233883);
        }
        this.l0.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        android.content.Intent intent = getIntent();
        this.q0 = intent.getParcelableExtra("ARG_CONTACT");
        this.n0 = intent.getStringExtra("ARG_NUMBER");
        if (intent.hasExtra("ARG_SIM_SLOT")) {
            this.o0 = java.lang.Integer.valueOf(intent.getIntExtra("ARG_SIM_SLOT", -1));
        }
        this.r0 = intent.getStringExtra("ARG_ANALYTICS_CONTEXT");
        java.lang.String stringExtra = intent.getStringExtra("ARG_VIEW_ANALYTICS_CONTEXT");
        this.v0 = intent.getParcelableExtra("callContextOption");
        this.w0 = intent.getParcelableExtra("dialAssistOptions");
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) getSystemService(com.truecaller.sdk.oAuth.networking.data.PartnerDetailsResponse.OAUTH_SCOPE_PHONE);
        java.lang.String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (android.text.TextUtils.isEmpty(networkCountryIso)) {
            networkCountryIso = telephonyManager.getSimCountryIso();
        }
        java.util.Locale locale = java.util.Locale.ENGLISH;
        java.lang.String x = jj3.bar.x(networkCountryIso);
        if (this.q0 != null && (str = this.n0) != null) {
            this.p0 = t41.f0.e(str, x);
            int intExtra = intent.getIntExtra("ARG_REASON", 1);
            androidx.recyclerview.widget.r0 r0Var = new androidx.recyclerview.widget.r0(this);
            r0Var.c = true;
            r0Var.e = 10;
            r0Var.d = 10;
            textView.setText(this.q0.s());
            if (intExtra != 0) {
                if (intExtra == 1) {
                    textView2.setText(getString(2132017554));
                    yf2.bar a = ((bg2.bar) this.k0.get()).a(this.n0);
                    if (a != null && (cVar = a.b) != null && a.d()) {
                        textView2.setVisibility(0);
                        if (cVar.i() != pk3.b.c) {
                            z = false;
                        }
                        r0Var.b = z;
                        r0Var.e = 6;
                        r0Var.d = 6;
                        textView.setText(w0(r0Var, this.q0.s()));
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "<this>");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
                        textView2.setText(ll.baz.u(a, this));
                    }
                    w31.c cVar2 = new w31.c(this.j0);
                    findViewById.setPresenter(cVar2);
                    cVar2.B2(this.i0.a(this.q0));
                    textView4.setText(getString(2132017552));
                }
            } else {
                r0Var.b = false;
                textView.setText(w0(r0Var, this.q0.s()));
                textView2.setText(getString(2132017555, ""));
                w31.c cVar3 = new w31.c(this.j0);
                findViewById.setPresenter(cVar3);
                cVar3.B2(this.i0.a(this.q0));
                textView4.setText(getString(2132017553));
            }
            if (java.lang.System.currentTimeMillis() - this.u0.getLong(this.p0, 0L) < 3600000) {
                textView2.setText(getString(2132017557));
                textView2.setVisibility(0);
                textView3.setVisibility(8);
            }
            bd.bar.u(this.e0, "callMeBackDialog", stringExtra);
            return;
        }
        super/*android.app.Activity*/.finish();
    }

    public final void onStart() {
        super.onStart();
        this.l0.getViewTreeObserver().addOnPreDrawListener(new com.truecaller.ui.b(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0() {
        finish();
        overridePendingTransition(0, 0);
    }
}
