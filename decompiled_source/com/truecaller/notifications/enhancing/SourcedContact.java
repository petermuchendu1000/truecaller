package com.truecaller.notifications.enhancing;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/notifications/enhancing/SourcedContact;", "Landroid/os/Parcelable;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SourcedContact implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.notifications.enhancing.SourcedContact> CREATOR = new cb1.bar(11);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.Long c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final android.net.Uri g;
    public final android.net.Uri h;

    public SourcedContact(java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.String str3, java.lang.String str4, java.lang.String str5, android.net.Uri uri, android.net.Uri uri2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "packageName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "label");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "number");
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = uri;
        this.h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.notifications.enhancing.SourcedContact)) {
            return false;
        }
        com.truecaller.notifications.enhancing.SourcedContact sourcedContact = (com.truecaller.notifications.enhancing.SourcedContact) obj;
        if (kotlin.jvm.internal.Intrinsics.b(this.a, sourcedContact.a) && kotlin.jvm.internal.Intrinsics.b(this.c, sourcedContact.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        java.lang.Long l = this.c;
        if (l != null) {
            long longValue = l.longValue();
            i = (int) (longValue ^ (longValue >>> 32));
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("SourcedContact(packageName=", this.a, ", label=", this.b, ", id=");
        E.append(this.c);
        E.append(", tcId=");
        E.append(this.d);
        E.append(", name=");
        bar.E(E, this.e, ", number=", this.f, ", photoUri=");
        E.append(this.g);
        E.append(", thumbnailPhotoUri=");
        E.append(this.h);
        E.append(")");
        return E.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        java.lang.Long l = this.c;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
    }
}
