package com.truecaller.android.sdk.legacy.clients;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class CustomDataBundle implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.legacy.clients.CustomDataBundle> CREATOR = new om0.bar(5);
    public final int a;
    public final int b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final int e;
    public final int f;
    public final int g;

    public CustomDataBundle(java.lang.String str, int i, int i2, int i3, java.lang.String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.g = i3;
        this.e = i4;
        this.f = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.g);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }

    public CustomDataBundle(android.os.Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.g = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
    }

    public CustomDataBundle(android.os.Bundle bundle) {
        this.a = bundle.getInt("CUSTOMDATA_BTN_COLOR", 0);
        this.b = bundle.getInt("CUSTOMDATA_BTN_TEXT_COLOR", 0);
        this.c = bundle.getString("CUSTOMDATA_PRIVACY_URL", "");
        this.d = bundle.getString("CUSTOMDATA_TERMS_URL", "");
        this.g = bundle.getInt("CUSTOMDATA_CTA_TEXT_PREFIX_OPTION", 0);
        this.e = bundle.getInt("CUSTOMDATA_LOGIN_TEXT_PREFIX_OPTION", 0);
        this.f = bundle.getInt("CUSTOMDATA_LOGIN_TEXT_SUFFIX_OPTION", 0);
    }
}
