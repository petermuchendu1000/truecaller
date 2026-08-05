package com.truecaller.calling.initiate_call;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/calling/initiate_call/SelectPhoneAccountActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lnv0/r;", "Lnv0/q;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class SelectPhoneAccountActivity extends com.truecaller.calling.initiate_call.Hilt_SelectPhoneAccountActivity implements nv0.r, nv0.q {
    public static final /* synthetic */ int h0 = 0;
    public com.truecaller.calling.initiate_call.a d0;
    public nv0.c e0;
    public final androidx.lifecycle.o1 f0 = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(hv0.m.class), new nv0.o(this, 1), new nv0.o(this, 0), new nv0.o(this, 2));
    public final kotlin.Lazy g0 = kotlin.LazyKt.lazy(new n11.m(this, 17));

    public final void attachBaseContext(android.content.Context context) {
        android.view.ContextThemeWrapper contextThemeWrapper;
        if (context != null) {
            contextThemeWrapper = yy.qux.v(context, true);
        } else {
            contextThemeWrapper = null;
        }
        super.attachBaseContext(contextThemeWrapper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        super/*android.app.Activity*/.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.calling.initiate_call.Hilt_SelectPhoneAccountActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        android.content.res.Resources.Theme theme = getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        yy.qux.n(theme, false);
        com.truecaller.calling.initiate_call.a aVar = this.d0;
        if (aVar != null) {
            aVar.b = this;
            java.lang.String stringExtra = getIntent().getStringExtra("extraNumber");
            if (stringExtra == null) {
                com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("number is null");
                finish();
                return;
            }
            java.lang.String stringExtra2 = getIntent().getStringExtra("extraDisplayName");
            if (stringExtra2 == null) {
                com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("displayName is null");
                finish();
                return;
            }
            java.lang.String stringExtra3 = getIntent().getStringExtra("extraAnalyticsContext");
            if (stringExtra3 == null) {
                com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("analyticsContext is null");
                finish();
                return;
            }
            boolean booleanExtra = getIntent().getBooleanExtra("noCallMeBack", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("promptRoaming", false);
            com.truecaller.calling.initiate_call.InitiateCallHelper$DialAssistOptions initiateCallHelper$DialAssistOptions = (com.truecaller.calling.initiate_call.InitiateCallHelper$DialAssistOptions) getIntent().getParcelableExtra("dialAssistOptions");
            com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption initiateCallHelper$CallContextOption = (com.truecaller.calling.initiate_call.InitiateCallHelper$CallContextOption) getIntent().getParcelableExtra("callContextOption");
            boolean booleanExtra3 = getIntent().getBooleanExtra("canCallAlternateBizNumber", false);
            com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource initiateCallHelper$CallSource = (com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource) g6.b.g(getIntent(), "callSource", com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource.class);
            com.truecaller.calling.initiate_call.a aVar2 = this.d0;
            if (aVar2 != null) {
                ((com.truecaller.sdk.bar) aVar2).a = this;
                try {
                } catch (java.lang.IllegalStateException e) {
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
                }
                if (aVar2 != null) {
                    if (initiateCallHelper$CallSource == null) {
                        initiateCallHelper$CallSource = com.truecaller.calling.initiate_call.InitiateCallHelper$CallSource.UNKNOWN;
                    }
                    aVar2.c2(stringExtra, stringExtra2, stringExtra3, booleanExtra, booleanExtra2, booleanExtra3, initiateCallHelper$CallContextOption, initiateCallHelper$DialAssistOptions, initiateCallHelper$CallSource);
                    ((hv0.m) this.f0.getValue()).c.e(this, new az1.qux(new nr0.qux(this, 6)));
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("presenter");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }
}
