package com.truecaller.favorite_contacts_data.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/favorite_contacts_data/data/FavoriteContact;", "Landroid/os/Parcelable;", "favorite-contacts-data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class FavoriteContact implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.favorite_contacts_data.data.FavoriteContact> CREATOR = new a11.bar(6);
    public final java.lang.Integer a;
    public final java.lang.Long b;
    public final java.lang.String c;
    public final int d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public FavoriteContact(java.lang.Integer num, java.lang.Long l, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = num;
        this.b = l;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public static com.truecaller.favorite_contacts_data.data.FavoriteContact a(com.truecaller.favorite_contacts_data.data.FavoriteContact favoriteContact, java.lang.String str, java.lang.String str2, boolean z, int i) {
        boolean z2;
        java.lang.Integer num = favoriteContact.a;
        java.lang.Long l = favoriteContact.b;
        java.lang.String str3 = favoriteContact.c;
        int i2 = favoriteContact.d;
        boolean z3 = favoriteContact.h;
        boolean z4 = favoriteContact.i;
        if ((i & 512) != 0) {
            z2 = favoriteContact.j;
        } else {
            z2 = true;
        }
        boolean z5 = z2;
        favoriteContact.getClass();
        return new com.truecaller.favorite_contacts_data.data.FavoriteContact(num, l, str3, i2, str, str2, z, z3, z4, z5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.favorite_contacts_data.data.FavoriteContact)) {
            return false;
        }
        com.truecaller.favorite_contacts_data.data.FavoriteContact favoriteContact = (com.truecaller.favorite_contacts_data.data.FavoriteContact) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, favoriteContact.a) && kotlin.jvm.internal.Intrinsics.b(this.b, favoriteContact.b) && kotlin.jvm.internal.Intrinsics.b(this.c, favoriteContact.c) && this.d == favoriteContact.d && kotlin.jvm.internal.Intrinsics.b(this.e, favoriteContact.e) && kotlin.jvm.internal.Intrinsics.b(this.f, favoriteContact.f) && this.g == favoriteContact.g && this.h == favoriteContact.h && this.i == favoriteContact.i && this.j == favoriteContact.j;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        java.lang.Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i5 = hashCode * 31;
        java.lang.Long l = this.b;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        java.lang.String str = this.c;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i7 = (((i6 + hashCode3) * 31) + this.d) * 31;
        java.lang.String str2 = this.e;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        java.lang.String str3 = this.f;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        int i9 = (i8 + i4) * 31;
        int i10 = 1237;
        if (this.g) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i11 = (i9 + i) * 31;
        if (this.h) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i13 = (i11 + i2) * 31;
        if (this.i) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        int i14 = (i13 + i3) * 31;
        if (this.j) {
            i10 = 1231;
        }
        return i14 + i10;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FavoriteContact(id=");
        sb.append(this.a);
        sb.append(", phonebookId=");
        sb.append(this.b);
        sb.append(", phonebookLookupKey=");
        t.c.x(this.d, this.c, ", position=", ", normalizedNumber=", sb);
        bar.E(sb, this.e, ", defaultAction=", this.f, ", askAlwaysToCall=");
        nc0.k1.p(sb, this.g, ", isDirectCall=", this.h, ", rememberDefaultAction=");
        return ax1.bar.q(sb, this.i, ", rememberDefaultMessageAction=", this.j, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        java.lang.Integer num = this.a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            z0.a0.j(parcel, 1, num);
        }
        java.lang.Long l = this.b;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
    }

    public /* synthetic */ FavoriteContact(java.lang.Integer num, java.lang.Long l, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, int i2) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? false : z, false, (i2 & 256) != 0 ? true : z2, (i2 & 512) != 0 ? false : z3);
    }
}
