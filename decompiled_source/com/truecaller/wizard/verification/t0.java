package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class t0 extends com.truecaller.wizard.verification.u0 {
    public final int e;
    public final java.lang.String f;
    public final boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(int i, java.lang.String str, boolean z) {
        super("VerificationAttemptsExceeded", 2131886136, "Verification Attempts Exceeded");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.sdk.oAuth.networking.data.PartnerDetailsResponse.OAUTH_SCOPE_PHONE);
        this.e = i;
        this.f = str;
        this.g = z;
    }
}
