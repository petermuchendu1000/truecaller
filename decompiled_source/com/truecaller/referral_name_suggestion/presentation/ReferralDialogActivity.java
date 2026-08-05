package com.truecaller.referral_name_suggestion.presentation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/referral_name_suggestion/presentation/ReferralDialogActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lij2/r;", "Lij2/a;", "<init>", "()V", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReferralDialogActivity extends com.truecaller.referral_name_suggestion.presentation.Hilt_ReferralDialogActivity implements ij2.r, ij2.a {
    public static final /* synthetic */ int f0 = 0;
    public final kotlin.Lazy d0;
    public final kotlin.Lazy e0;

    public ReferralDialogActivity() {
        final int i = 0;
        this.d0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: ij2.d
            public final /* synthetic */ com.truecaller.referral_name_suggestion.presentation.ReferralDialogActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i2 = i;
                ej2.qux quxVar = null;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.referral_name_suggestion.presentation.ReferralDialogActivity.f0;
                        android.content.Intent intent = appCompatActivity.getIntent();
                        if (intent != null) {
                            quxVar = (ej2.qux) g6.b.h(intent, "content_data", ej2.qux.class);
                        }
                        if (quxVar != null) {
                            return quxVar;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    default:
                        int i4 = com.truecaller.referral_name_suggestion.presentation.ReferralDialogActivity.f0;
                        android.content.Intent intent2 = appCompatActivity.getIntent();
                        if (intent2 == null) {
                            return null;
                        }
                        return intent2.getStringExtra("message_data");
                }
            }
        });
        final int i2 = 1;
        this.e0 = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: ij2.d
            public final /* synthetic */ com.truecaller.referral_name_suggestion.presentation.ReferralDialogActivity b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                int i22 = i2;
                ej2.qux quxVar = null;
                androidx.appcompat.app.AppCompatActivity appCompatActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.referral_name_suggestion.presentation.ReferralDialogActivity.f0;
                        android.content.Intent intent = appCompatActivity.getIntent();
                        if (intent != null) {
                            quxVar = (ej2.qux) g6.b.h(intent, "content_data", ej2.qux.class);
                        }
                        if (quxVar != null) {
                            return quxVar;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    default:
                        int i4 = com.truecaller.referral_name_suggestion.presentation.ReferralDialogActivity.f0;
                        android.content.Intent intent2 = appCompatActivity.getIntent();
                        if (intent2 == null) {
                            return null;
                        }
                        return intent2.getStringExtra("message_data");
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.referral_name_suggestion.presentation.Hilt_ReferralDialogActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (bundle == null) {
            java.lang.String str = (java.lang.String) this.e0.getValue();
            if (str != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "successMessage");
                ij2.b bVar = new ij2.b();
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("arg_success_message", str);
                bVar.setArguments(bundle2);
                bVar.show(getSupportFragmentManager(), "ReferralAppliedDialogFragment");
                return;
            }
            t0();
        }
    }

    public final void t0() {
        ej2.qux quxVar = (ej2.qux) this.d0.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "contentConfig");
        ij2.u uVar = new ij2.u();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putSerializable("content_data_dialog", quxVar);
        uVar.setArguments(bundle);
        uVar.show(getSupportFragmentManager(), "ReferralNameSuggestionComposeDialogFragment");
    }
}
