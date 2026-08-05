package com.truecaller.details_view.routing;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/details_view/routing/ExtraNotificationData;", "Landroid/os/Parcelable;", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ExtraNotificationData implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.details_view.routing.ExtraNotificationData> CREATOR = new hn.bar(12);
    public final java.lang.String a;
    public final java.lang.Long[] b;
    public final java.lang.String c;
    public final int d;
    public final java.lang.String e;
    public final java.lang.String f;

    public ExtraNotificationData(java.lang.String str, java.lang.Long[] lArr, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4) {
        this.a = str;
        this.b = lArr;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.details_view.routing.ExtraNotificationData)) {
            return false;
        }
        com.truecaller.details_view.routing.ExtraNotificationData extraNotificationData = (com.truecaller.details_view.routing.ExtraNotificationData) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, extraNotificationData.a) && kotlin.jvm.internal.Intrinsics.b(this.b, extraNotificationData.b) && kotlin.jvm.internal.Intrinsics.b(this.c, extraNotificationData.c) && this.d == extraNotificationData.d && kotlin.jvm.internal.Intrinsics.b(this.e, extraNotificationData.e) && kotlin.jvm.internal.Intrinsics.b(this.f, extraNotificationData.f);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Long[] lArr = this.b;
        int hashCode2 = (hashCode + (lArr == null ? 0 : java.util.Arrays.hashCode(lArr))) * 31;
        java.lang.String str2 = this.c;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31;
        java.lang.String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("ExtraNotificationData(address=", this.a, ", messagesIds=", java.util.Arrays.toString(this.b), ", notificationTag=");
        t.c.x(this.d, this.c, ", notificationId=", ", notificationAction=", E);
        return bar.x(E, this.e, ", analyticsSource=", this.f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        java.lang.Long[] lArr = this.b;
        if (lArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            int length = lArr.length;
            parcel.writeInt(length);
            for (int i2 = 0; i2 != length; i2++) {
                parcel.writeLong(lArr[i2].longValue());
            }
        }
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
