package com.truecaller.insights.core.smartnotifications.helper;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/insights/core/smartnotifications/helper/InsightsNotificationIdentifier;", "Landroid/os/Parcelable;", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class InsightsNotificationIdentifier implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.insights.core.smartnotifications.helper.InsightsNotificationIdentifier> CREATOR = new hn.bar(2);
    public final int a;
    public final java.lang.String b;
    public final int c;

    public InsightsNotificationIdentifier(int i, java.lang.String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.insights.core.smartnotifications.helper.InsightsNotificationIdentifier)) {
            return false;
        }
        com.truecaller.insights.core.smartnotifications.helper.InsightsNotificationIdentifier insightsNotificationIdentifier = (com.truecaller.insights.core.smartnotifications.helper.InsightsNotificationIdentifier) obj;
        return this.a == insightsNotificationIdentifier.a && kotlin.jvm.internal.Intrinsics.b(this.b, insightsNotificationIdentifier.b) && this.c == insightsNotificationIdentifier.c;
    }

    public final int hashCode() {
        int i = this.a * 31;
        java.lang.String str = this.b;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return bar.m(this.c, ")", qb.qux.r("InsightsNotificationIdentifier(notificationId=", this.a, ", notificationTag=", this.b, ", requestId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }
}
