package com.truecaller.account.social;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/account/social/GoogleOneTapSignInActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "account-social_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class GoogleOneTapSignInActivity extends com.truecaller.account.social.Hilt_GoogleOneTapSignInActivity {
    public static final /* synthetic */ int e0 = 0;
    public is0.qux d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.account.social.Hilt_GoogleOneTapSignInActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        is0.qux quxVar = this.d0;
        if (quxVar != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "activity");
            fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new u83.d0(quxVar, this, (df3.bar) null, 16), 3);
        } else {
            kotlin.jvm.internal.Intrinsics.n("googleOneTapDeepLinkHandler");
            throw null;
        }
    }
}
