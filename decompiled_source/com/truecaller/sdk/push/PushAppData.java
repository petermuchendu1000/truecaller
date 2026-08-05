package com.truecaller.sdk.push;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class PushAppData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.truecaller.sdk.push.PushAppData> CREATOR = new cb1.bar(24);
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;

    public PushAppData(java.lang.String str, java.lang.String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("requestId", this.a);
            jSONObject.put(com.unity3d.ads.metadata.MediationMetaData.KEY_NAME, this.b);
            jSONObject.put("ttl", this.c);
            return jSONObject.toString();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }

    public PushAppData(android.os.Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
    }
}
