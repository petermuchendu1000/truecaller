package com.truecaller.messaging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/ForwardContentItem;", "Landroid/os/Parcelable;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ForwardContentItem implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.ForwardContentItem> CREATOR = new rz0.b0(28);
    public final java.lang.String a;
    public final boolean b;
    public final com.truecaller.messaging.data.types.BinaryEntity c;
    public final int d;
    public final java.util.List e;
    public final com.truecaller.messaging.data.types.ImForwardInfo f;

    public ForwardContentItem(java.lang.String str, boolean z, com.truecaller.messaging.data.types.BinaryEntity binaryEntity, int i, java.util.List list, com.truecaller.messaging.data.types.ImForwardInfo imForwardInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        this.a = str;
        this.b = z;
        this.c = binaryEntity;
        this.d = i;
        this.e = list;
        this.f = imForwardInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.messaging.ForwardContentItem)) {
            return false;
        }
        com.truecaller.messaging.ForwardContentItem forwardContentItem = (com.truecaller.messaging.ForwardContentItem) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, forwardContentItem.a) && this.b == forwardContentItem.b && kotlin.jvm.internal.Intrinsics.b(this.c, forwardContentItem.c) && this.d == forwardContentItem.d && kotlin.jvm.internal.Intrinsics.b(this.e, forwardContentItem.e) && kotlin.jvm.internal.Intrinsics.b(this.f, forwardContentItem.f);
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        if (this.b) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i2 = (hashCode3 + i) * 31;
        int i3 = 0;
        com.truecaller.messaging.data.types.BinaryEntity binaryEntity = this.c;
        if (binaryEntity == null) {
            hashCode = 0;
        } else {
            hashCode = binaryEntity.hashCode();
        }
        int i4 = (((i2 + hashCode) * 31) + this.d) * 31;
        java.util.List list = this.e;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        com.truecaller.messaging.data.types.ImForwardInfo imForwardInfo = this.f;
        if (imForwardInfo != null) {
            i3 = imForwardInfo.hashCode();
        }
        return i5 + i3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder t = ax1.bar.t("ForwardContentItem(text=", this.a, ", isRichText=", ", mediaContent=", this.b);
        t.append(this.c);
        t.append(", transport=");
        t.append(this.d);
        t.append(", mentions=");
        t.append(this.e);
        t.append(", imForwardInfo=");
        t.append(this.f);
        t.append(")");
        return t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        java.util.List list = this.e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((android.os.Parcelable) it.next(), i);
            }
        }
        parcel.writeParcelable(this.f, i);
    }
}
