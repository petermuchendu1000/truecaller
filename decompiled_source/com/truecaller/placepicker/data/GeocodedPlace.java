package com.truecaller.placepicker.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/placepicker/data/GeocodedPlace;", "Landroid/os/Parcelable;", "placepicker_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class GeocodedPlace implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.placepicker.data.GeocodedPlace> CREATOR = new cb1.bar(22);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.Double d;
    public final java.lang.Double e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final java.lang.String i;

    public GeocodedPlace(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Double d, java.lang.Double d2, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = d2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.placepicker.data.GeocodedPlace)) {
            return false;
        }
        com.truecaller.placepicker.data.GeocodedPlace geocodedPlace = (com.truecaller.placepicker.data.GeocodedPlace) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, geocodedPlace.a) && kotlin.jvm.internal.Intrinsics.b(this.b, geocodedPlace.b) && kotlin.jvm.internal.Intrinsics.b(this.c, geocodedPlace.c) && kotlin.jvm.internal.Intrinsics.b(this.d, geocodedPlace.d) && kotlin.jvm.internal.Intrinsics.b(this.e, geocodedPlace.e) && kotlin.jvm.internal.Intrinsics.b(this.f, geocodedPlace.f) && kotlin.jvm.internal.Intrinsics.b(this.g, geocodedPlace.g) && kotlin.jvm.internal.Intrinsics.b(this.h, geocodedPlace.h) && kotlin.jvm.internal.Intrinsics.b(this.i, geocodedPlace.i);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Double d = this.d;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        java.lang.Double d2 = this.e;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        java.lang.String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.g;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.h;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.i;
        return hashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("GeocodedPlace(name=", this.a, ", fullAddress=", this.b, ", placeId=");
        E.append(this.c);
        E.append(", latitude=");
        E.append(this.d);
        E.append(", longitude=");
        E.append(this.e);
        E.append(", state=");
        E.append(this.f);
        E.append(", city=");
        bar.E(E, this.g, ", zipCode=", this.h, ", countryCodeIso=");
        return bar.v(this.i, ")", E);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        java.lang.Double d = this.d;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        java.lang.Double d2 = this.e;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }
}
