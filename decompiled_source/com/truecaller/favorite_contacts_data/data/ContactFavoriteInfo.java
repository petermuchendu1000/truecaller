package com.truecaller.favorite_contacts_data.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/favorite_contacts_data/data/ContactFavoriteInfo;", "Landroid/os/Parcelable;", "favorite-contacts-data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ContactFavoriteInfo implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.favorite_contacts_data.data.ContactFavoriteInfo> CREATOR = new a11.bar(5);
    public final com.truecaller.favorite_contacts_data.data.FavoriteContact a;
    public final com.truecaller.data.entity.Contact b;
    public final kotlin.Lazy c;

    public ContactFavoriteInfo(com.truecaller.favorite_contacts_data.data.FavoriteContact favoriteContact, com.truecaller.data.entity.Contact contact) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(favoriteContact, "favoriteContactData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        this.a = favoriteContact;
        this.b = contact;
        this.c = kotlin.LazyKt.lazy(new bf1.h(this, 5));
    }

    public final com.truecaller.data.entity.Number a() {
        java.lang.Object obj;
        java.util.List C = this.b.C();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "getNumbers(...)");
        java.util.ListIterator listIterator = C.listIterator(C.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (kotlin.jvm.internal.Intrinsics.b(((com.truecaller.data.entity.Number) obj).f, this.a.e)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (com.truecaller.data.entity.Number) obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.favorite_contacts_data.data.ContactFavoriteInfo)) {
            return false;
        }
        com.truecaller.favorite_contacts_data.data.ContactFavoriteInfo contactFavoriteInfo = (com.truecaller.favorite_contacts_data.data.ContactFavoriteInfo) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, contactFavoriteInfo.a) && kotlin.jvm.internal.Intrinsics.b(this.b, contactFavoriteInfo.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "ContactFavoriteInfo(favoriteContactData=" + this.a + ", contact=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        this.a.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, i);
    }
}
