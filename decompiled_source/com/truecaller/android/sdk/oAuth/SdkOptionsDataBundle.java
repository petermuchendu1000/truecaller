package com.truecaller.android.sdk.oAuth;

@androidx.annotation.Keep
/* loaded from: /home/user/tc_decoded/classes5.dex */
public class SdkOptionsDataBundle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.SdkOptionsDataBundle> CREATOR = new cb1.bar(6);
    private final int buttonColor;
    private final int buttonTextColor;
    private final int ctaTextOption;
    private final int headingOption;
    private final int loginTextPrefixOption;
    private final int titleOption;

    public SdkOptionsDataBundle(android.os.Parcel parcel) {
        this.buttonColor = parcel.readInt();
        this.buttonTextColor = parcel.readInt();
        this.titleOption = parcel.readInt();
        this.ctaTextOption = parcel.readInt();
        this.loginTextPrefixOption = parcel.readInt();
        this.headingOption = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getButtonColor() {
        return this.buttonColor;
    }

    public int getButtonTextColor() {
        return this.buttonTextColor;
    }

    public int getCtaTextOption() {
        return this.ctaTextOption;
    }

    public int getHeadingOption() {
        return this.headingOption;
    }

    public int getLoginTextPrefixOption() {
        return this.loginTextPrefixOption;
    }

    public int getTitleOption() {
        return this.titleOption;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.buttonColor);
        parcel.writeInt(this.buttonTextColor);
        parcel.writeInt(this.titleOption);
        parcel.writeInt(this.ctaTextOption);
        parcel.writeInt(this.loginTextPrefixOption);
        parcel.writeInt(this.headingOption);
    }

    public SdkOptionsDataBundle(int i, int i2, int i3, int i4, int i5, int i6) {
        this.buttonColor = i;
        this.buttonTextColor = i2;
        this.titleOption = i3;
        this.headingOption = i4;
        this.ctaTextOption = i5;
        this.loginTextPrefixOption = i6;
    }
}
