package com.truecaller.android.sdk.common.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class VerifyInstallationModel {

    @bw.qux("countryCodeName")
    private final java.lang.String mCountryCodeName;

    @bw.qux("phoneNumber")
    private final java.lang.String mPhoneNumber;

    @bw.qux("secretToken")
    public final java.lang.String mSecretToken;

    @bw.qux("verificationToken")
    private final java.lang.String mVerificationToken;

    public VerifyInstallationModel(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull java.lang.String str3, @androidx.annotation.NonNull java.lang.String str4) {
        this.mVerificationToken = str;
        this.mPhoneNumber = str2;
        this.mCountryCodeName = str3;
        this.mSecretToken = str4;
    }
}
