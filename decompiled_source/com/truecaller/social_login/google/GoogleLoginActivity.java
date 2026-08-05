package com.truecaller.social_login.google;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/social_login/google/GoogleLoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lct2/baz;", "<init>", "()V", "social-login_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class GoogleLoginActivity extends com.truecaller.social_login.google.Hilt_GoogleLoginActivity implements ct2.baz {
    public static final /* synthetic */ int e0 = 0;
    public ct2.qux d0;

    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        com.google.android.gms.auth.api.signin.GoogleSignInResult googleSignInResult;
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        ct2.qux quxVar = this.d0;
        java.lang.String str = null;
        if (quxVar != null) {
            if (i == 1234) {
                if (intent != null) {
                    quxVar.g.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, com.unity3d.services.core.device.reader.JsonStorageKeyNames.DATA_KEY);
                    com.google.android.gms.auth.api.Auth.b.getClass();
                    com.google.android.gms.common.logging.Logger logger = com.google.android.gms.auth.api.signin.internal.zbm.a;
                    com.google.android.gms.common.api.Status parcelableExtra = intent.getParcelableExtra("googleSignInStatus");
                    com.google.android.gms.auth.api.signin.GoogleSignInAccount parcelableExtra2 = intent.getParcelableExtra("googleSignInAccount");
                    if (parcelableExtra2 == null) {
                        if (parcelableExtra == null) {
                            parcelableExtra = com.google.android.gms.common.api.Status.g;
                        }
                        googleSignInResult = new com.google.android.gms.auth.api.signin.GoogleSignInResult((com.google.android.gms.auth.api.signin.GoogleSignInAccount) null, parcelableExtra);
                    } else {
                        googleSignInResult = new com.google.android.gms.auth.api.signin.GoogleSignInResult(parcelableExtra2, com.google.android.gms.common.api.Status.e);
                    }
                } else {
                    googleSignInResult = null;
                }
                if (googleSignInResult == null) {
                    quxVar.e2(null, true);
                    return;
                }
                com.google.android.gms.common.api.Status status = googleSignInResult.a;
                com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = googleSignInResult.b;
                if (status.K1() && googleSignInAccount != null) {
                    java.lang.String str2 = googleSignInAccount.j;
                    java.lang.String str3 = googleSignInAccount.k;
                    java.lang.String str4 = googleSignInAccount.c;
                    android.net.Uri uri = googleSignInAccount.e;
                    if (uri != null) {
                        str = uri.toString();
                    }
                    quxVar.e2(new com.truecaller.social_login.SocialAccountProfile(str2, str3, str4, str, googleSignInAccount.b), false);
                    return;
                }
                int i3 = status.a;
                if (i3 == 16 || i3 == 12501) {
                    quxVar.e2(null, false);
                    return;
                } else {
                    quxVar.e2(null, true);
                    return;
                }
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.social_login.google.Hilt_GoogleLoginActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        ct2.qux quxVar = this.d0;
        if (quxVar != null) {
            quxVar.u0(this);
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }
}
