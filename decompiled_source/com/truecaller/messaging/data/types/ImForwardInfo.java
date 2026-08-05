package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/ImForwardInfo;", "Landroid/os/Parcelable;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ImForwardInfo implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.ImForwardInfo> CREATOR = new a11.bar(17);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;

    public ImForwardInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "rawMessageId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.messaging.data.types.ImForwardInfo)) {
            return false;
        }
        com.truecaller.messaging.data.types.ImForwardInfo imForwardInfo = (com.truecaller.messaging.data.types.ImForwardInfo) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, imForwardInfo.a) && kotlin.jvm.internal.Intrinsics.b(this.b, imForwardInfo.b) && kotlin.jvm.internal.Intrinsics.b(this.c, imForwardInfo.c) && kotlin.jvm.internal.Intrinsics.b(this.d, imForwardInfo.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return bar.x(ro0.f.E("ImForwardInfo(rawMessageId=", this.a, ", peerId=", this.b, ", context="), this.c, ", forwardingId=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
