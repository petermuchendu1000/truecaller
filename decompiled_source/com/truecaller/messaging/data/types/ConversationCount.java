package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/ConversationCount;", "Landroid/os/Parcelable;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ConversationCount implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.ConversationCount> CREATOR = new a11.bar(13);
    public final com.truecaller.messaging.data.types.CountItem a;
    public final com.truecaller.messaging.data.types.CountItem b;
    public final com.truecaller.messaging.data.types.CountItem c;
    public final com.truecaller.messaging.data.types.CountItem d;
    public final com.truecaller.messaging.data.types.CountItem e;
    public final com.truecaller.messaging.data.types.CountItem f;
    public final com.truecaller.messaging.data.types.CountItem g;
    public final com.truecaller.messaging.data.types.CountItem h;
    public final com.truecaller.messaging.data.types.CountItem i;

    public ConversationCount(com.truecaller.messaging.data.types.CountItem countItem, com.truecaller.messaging.data.types.CountItem countItem2, com.truecaller.messaging.data.types.CountItem countItem3, com.truecaller.messaging.data.types.CountItem countItem4, com.truecaller.messaging.data.types.CountItem countItem5, com.truecaller.messaging.data.types.CountItem countItem6, com.truecaller.messaging.data.types.CountItem countItem7, com.truecaller.messaging.data.types.CountItem countItem8, com.truecaller.messaging.data.types.CountItem countItem9) {
        this.a = countItem;
        this.b = countItem2;
        this.c = countItem3;
        this.d = countItem4;
        this.e = countItem5;
        this.f = countItem6;
        this.g = countItem7;
        this.h = countItem8;
        this.i = countItem9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.messaging.data.types.ConversationCount)) {
            return false;
        }
        com.truecaller.messaging.data.types.ConversationCount conversationCount = (com.truecaller.messaging.data.types.ConversationCount) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, conversationCount.a) && kotlin.jvm.internal.Intrinsics.b(this.b, conversationCount.b) && kotlin.jvm.internal.Intrinsics.b(this.c, conversationCount.c) && kotlin.jvm.internal.Intrinsics.b(this.d, conversationCount.d) && kotlin.jvm.internal.Intrinsics.b(this.e, conversationCount.e) && kotlin.jvm.internal.Intrinsics.b(this.f, conversationCount.f) && kotlin.jvm.internal.Intrinsics.b(this.g, conversationCount.g) && kotlin.jvm.internal.Intrinsics.b(this.h, conversationCount.h) && kotlin.jvm.internal.Intrinsics.b(this.i, conversationCount.i);
    }

    public final int hashCode() {
        com.truecaller.messaging.data.types.CountItem countItem = this.a;
        int hashCode = (countItem == null ? 0 : countItem.hashCode()) * 31;
        com.truecaller.messaging.data.types.CountItem countItem2 = this.b;
        int hashCode2 = (hashCode + (countItem2 == null ? 0 : countItem2.hashCode())) * 31;
        com.truecaller.messaging.data.types.CountItem countItem3 = this.c;
        int hashCode3 = (hashCode2 + (countItem3 == null ? 0 : countItem3.hashCode())) * 31;
        com.truecaller.messaging.data.types.CountItem countItem4 = this.d;
        int hashCode4 = (hashCode3 + (countItem4 == null ? 0 : countItem4.hashCode())) * 31;
        com.truecaller.messaging.data.types.CountItem countItem5 = this.e;
        int hashCode5 = (hashCode4 + (countItem5 == null ? 0 : countItem5.hashCode())) * 31;
        com.truecaller.messaging.data.types.CountItem countItem6 = this.f;
        int hashCode6 = (hashCode5 + (countItem6 == null ? 0 : countItem6.hashCode())) * 31;
        com.truecaller.messaging.data.types.CountItem countItem7 = this.g;
        int hashCode7 = (hashCode6 + (countItem7 == null ? 0 : countItem7.hashCode())) * 31;
        com.truecaller.messaging.data.types.CountItem countItem8 = this.h;
        int hashCode8 = (hashCode7 + (countItem8 == null ? 0 : countItem8.hashCode())) * 31;
        com.truecaller.messaging.data.types.CountItem countItem9 = this.i;
        return hashCode8 + (countItem9 != null ? countItem9.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ConversationCount(inbox=" + this.a + ", unread=" + this.b + ", bill=" + this.c + ", delivery=" + this.d + ", travel=" + this.e + ", otp=" + this.f + ", transaction=" + this.g + ", offers=" + this.h + ", spam=" + this.i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        com.truecaller.messaging.data.types.CountItem countItem = this.a;
        if (countItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            countItem.writeToParcel(parcel, i);
        }
        com.truecaller.messaging.data.types.CountItem countItem2 = this.b;
        if (countItem2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            countItem2.writeToParcel(parcel, i);
        }
        com.truecaller.messaging.data.types.CountItem countItem3 = this.c;
        if (countItem3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            countItem3.writeToParcel(parcel, i);
        }
        com.truecaller.messaging.data.types.CountItem countItem4 = this.d;
        if (countItem4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            countItem4.writeToParcel(parcel, i);
        }
        com.truecaller.messaging.data.types.CountItem countItem5 = this.e;
        if (countItem5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            countItem5.writeToParcel(parcel, i);
        }
        com.truecaller.messaging.data.types.CountItem countItem6 = this.f;
        if (countItem6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            countItem6.writeToParcel(parcel, i);
        }
        com.truecaller.messaging.data.types.CountItem countItem7 = this.g;
        if (countItem7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            countItem7.writeToParcel(parcel, i);
        }
        com.truecaller.messaging.data.types.CountItem countItem8 = this.h;
        if (countItem8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            countItem8.writeToParcel(parcel, i);
        }
        com.truecaller.messaging.data.types.CountItem countItem9 = this.i;
        if (countItem9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            countItem9.writeToParcel(parcel, i);
        }
    }
}
