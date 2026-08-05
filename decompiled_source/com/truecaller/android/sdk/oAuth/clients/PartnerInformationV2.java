package com.truecaller.android.sdk.oAuth.clients;

@androidx.annotation.Keep
/* loaded from: /home/user/tc_decoded/classes5.dex */
public class PartnerInformationV2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.clients.PartnerInformationV2> CREATOR = new om0.bar(14);
    private static final java.lang.String MIN_SDK_VERSION_FOR_ENABLING_VERSIONING = "3.2.0";
    private static final int VERSION = 0;

    @androidx.annotation.NonNull
    private final java.lang.String appFingerprint;

    @androidx.annotation.NonNull
    private final java.lang.String clientId;

    @androidx.annotation.NonNull
    private final java.lang.String codeChallenge;

    @androidx.annotation.Nullable
    private final java.util.Locale locale;

    @androidx.annotation.NonNull
    private final java.lang.String packageName;
    private final java.lang.String[] scopes;

    @androidx.annotation.Nullable
    private final java.lang.String sdkVariant;

    @androidx.annotation.Nullable
    private final java.lang.String sdkVariantVersion;
    private final java.lang.String state;
    private final int theme;

    @androidx.annotation.NonNull
    private final java.lang.String trueSdkVersion;

    public PartnerInformationV2(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull java.lang.String str3, @androidx.annotation.NonNull java.lang.String str4, @androidx.annotation.Nullable java.util.Locale locale, @androidx.annotation.Nullable java.lang.String str5, @androidx.annotation.Nullable java.lang.String str6, @androidx.annotation.NonNull java.lang.String str7, java.lang.String[] strArr, java.lang.String str8, int i) {
        this.clientId = str2;
        this.packageName = str3;
        this.appFingerprint = str4;
        this.trueSdkVersion = str;
        this.codeChallenge = str7;
        this.locale = locale;
        this.sdkVariant = str5;
        this.sdkVariantVersion = str6;
        this.scopes = strArr;
        this.state = str8;
        this.theme = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @androidx.annotation.NonNull
    public java.lang.String getAppFingerprint() {
        return this.appFingerprint;
    }

    @androidx.annotation.NonNull
    public java.lang.String getClientId() {
        return this.clientId;
    }

    @androidx.annotation.NonNull
    public java.lang.String getCodeChallenge() {
        return this.codeChallenge;
    }

    @androidx.annotation.Nullable
    public java.util.Locale getLocale() {
        return this.locale;
    }

    @androidx.annotation.NonNull
    public java.lang.String getPackageName() {
        return this.packageName;
    }

    public java.lang.String[] getScopes() {
        return this.scopes;
    }

    @androidx.annotation.Nullable
    public java.lang.String getSdkVariant() {
        return this.sdkVariant;
    }

    @androidx.annotation.Nullable
    public java.lang.String getSdkVariantVersion() {
        return this.sdkVariantVersion;
    }

    public java.lang.String getState() {
        return this.state;
    }

    public int getTheme() {
        return this.theme;
    }

    @androidx.annotation.NonNull
    public java.lang.String getTrueSdkVersion() {
        return this.trueSdkVersion;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.clientId);
        parcel.writeString(this.packageName);
        parcel.writeString(this.appFingerprint);
        parcel.writeString(this.trueSdkVersion);
        parcel.writeString(this.codeChallenge);
        parcel.writeSerializable(this.locale);
        parcel.writeString(this.sdkVariant);
        parcel.writeString(this.sdkVariantVersion);
        parcel.writeStringArray(this.scopes);
        parcel.writeString(this.state);
        if (ll.baz.w(this.trueSdkVersion, MIN_SDK_VERSION_FOR_ENABLING_VERSIONING)) {
            parcel.writeInt(0);
            parcel.writeInt(this.theme);
        }
    }

    public PartnerInformationV2(android.os.Parcel parcel) {
        this.clientId = parcel.readString();
        this.packageName = parcel.readString();
        this.appFingerprint = parcel.readString();
        java.lang.String readString = parcel.readString();
        this.trueSdkVersion = readString;
        this.codeChallenge = parcel.readString();
        this.locale = (java.util.Locale) parcel.readSerializable();
        this.sdkVariant = parcel.readString();
        this.sdkVariantVersion = parcel.readString();
        this.scopes = parcel.createStringArray();
        this.state = parcel.readString();
        if (readString != null && ll.baz.w(readString, MIN_SDK_VERSION_FOR_ENABLING_VERSIONING)) {
            if (parcel.readInt() >= 0) {
                this.theme = parcel.readInt();
                return;
            } else {
                this.theme = 0;
                return;
            }
        }
        this.theme = 0;
    }
}
