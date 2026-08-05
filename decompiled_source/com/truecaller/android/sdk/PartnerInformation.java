package com.truecaller.android.sdk;

@androidx.annotation.Keep
/* loaded from: /home/user/tc_decoded/classes5.dex */
public class PartnerInformation implements android.os.Parcelable {
    private static final java.lang.String APP_FINGERPRINT = "PARTNERINFO_APP_FINGERPRINT";
    public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.PartnerInformation> CREATOR = new hn.bar(6);
    public static final java.lang.String PACKAGE_NAME = "PARTNERINFO_PACKAGE_NAME";
    public static final java.lang.String PARTNER_INFO_EXTRA = "PARTNER_INFO_EXTRA";
    private static final java.lang.String PARTNER_KEY = "PARTNERINFO_PARTNER_KEY";
    private static final java.lang.String REQ_NONCE = "PARTNERINFO_REQ_NONCE";
    private static final java.lang.String SDK_LOCALE = "PARTNERINFO_LOCALE";
    private static final java.lang.String SDK_THEME = "PARTNERINFO_THEME";
    private static final java.lang.String SDK_VARIANT = "PARTNERINFO_SDK_VARIANT";
    private static final java.lang.String SDK_VARIANT_VERSION = "PARTNERINFO_SDK_VARIANT_VERSION";
    public static final java.lang.String TRUESDK_VERSION = "PARTNERINFO_TRUESDK_VERSION";

    @androidx.annotation.NonNull
    public final java.lang.String appFingerprint;

    @androidx.annotation.Nullable
    public final java.util.Locale locale;

    @androidx.annotation.NonNull
    public final java.lang.String packageName;

    @androidx.annotation.NonNull
    public final java.lang.String partnerKey;

    @androidx.annotation.NonNull
    public final java.lang.String reqNonce;

    @androidx.annotation.Nullable
    public java.lang.String sdkVariant;

    @androidx.annotation.Nullable
    public java.lang.String sdkVariantVersion;
    public final int theme;

    @androidx.annotation.NonNull
    public final java.lang.String truesdkVersion;

    public /* synthetic */ PartnerInformation(int i, android.os.Parcel parcel) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void writeToBundle(@androidx.annotation.NonNull android.os.Bundle bundle) {
        bundle.putString(TRUESDK_VERSION, this.truesdkVersion);
        bundle.putString(PARTNER_KEY, this.partnerKey);
        bundle.putString(PACKAGE_NAME, this.packageName);
        bundle.putString(APP_FINGERPRINT, this.appFingerprint);
        bundle.putString(REQ_NONCE, this.reqNonce);
        java.util.Locale locale = this.locale;
        if (locale != null) {
            bundle.putString(SDK_LOCALE, locale.toString());
        }
        bundle.putInt(SDK_THEME, this.theme);
        bundle.putString(SDK_VARIANT, this.sdkVariant);
        bundle.putString(SDK_VARIANT_VERSION, this.sdkVariantVersion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.partnerKey);
        parcel.writeString(this.packageName);
        parcel.writeString(this.appFingerprint);
    }

    public PartnerInformation(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull java.lang.String str3, @androidx.annotation.NonNull java.lang.String str4, @androidx.annotation.NonNull java.lang.String str5, @androidx.annotation.Nullable java.util.Locale locale, int i, @androidx.annotation.Nullable java.lang.String str6, @androidx.annotation.Nullable java.lang.String str7) {
        this.truesdkVersion = str;
        this.partnerKey = str2;
        this.packageName = str3;
        this.appFingerprint = str4;
        this.reqNonce = str5;
        this.locale = locale;
        this.theme = i;
        this.sdkVariant = str6;
        this.sdkVariantVersion = str7;
    }

    public PartnerInformation(@androidx.annotation.NonNull android.os.Bundle bundle) {
        this.truesdkVersion = bundle.getString(TRUESDK_VERSION, "");
        this.partnerKey = bundle.getString(PARTNER_KEY, "");
        this.packageName = bundle.getString(PACKAGE_NAME, "");
        this.appFingerprint = bundle.getString(APP_FINGERPRINT, "");
        this.reqNonce = bundle.getString(REQ_NONCE, "");
        this.locale = new java.util.Locale(bundle.getString(SDK_LOCALE, ""));
        this.theme = bundle.getInt(SDK_THEME, 0);
        this.sdkVariant = bundle.getString(SDK_VARIANT, "");
        this.sdkVariantVersion = bundle.getString(SDK_VARIANT_VERSION, "");
    }

    private PartnerInformation(android.os.Parcel parcel) {
        this.partnerKey = parcel.readString();
        this.packageName = parcel.readString();
        this.appFingerprint = parcel.readString();
        this.truesdkVersion = "0.4.2";
        this.reqNonce = java.util.UUID.randomUUID().toString();
        this.locale = java.util.Locale.ENGLISH;
        this.theme = 0;
    }
}
