package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/CountItem;", "Landroid/os/Parcelable;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class CountItem implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.CountItem> CREATOR = new a11.bar(15);
    public final int a;
    public final int b;

    public CountItem(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.messaging.data.types.CountItem)) {
            return false;
        }
        com.truecaller.messaging.data.types.CountItem countItem = (com.truecaller.messaging.data.types.CountItem) obj;
        return this.a == countItem.a && this.b == countItem.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return h0.b.P(this.a, this.b, "CountItem(totalConversation=", ", totalUnreadCount=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
