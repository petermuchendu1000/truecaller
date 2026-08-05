package com.truecaller.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/ui/UserHomeStats;", "Landroid/os/Parcelable;", "stats_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class UserHomeStats implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ui.UserHomeStats> CREATOR = new java.lang.Object();
    public final java.lang.String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public UserHomeStats(java.lang.String str, int i, int i2, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "filterDays");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ui.UserHomeStats)) {
            return false;
        }
        com.truecaller.ui.UserHomeStats userHomeStats = (com.truecaller.ui.UserHomeStats) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, userHomeStats.a) && this.b == userHomeStats.b && this.c == userHomeStats.c && this.d == userHomeStats.d && this.e == userHomeStats.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder z = bar.z("UserHomeStats(filterDays=", this.b, this.a, ", spamCallsCount=", ", timeSavedFromSpammers=");
        os0.bar.A(this.c, this.d, ", unknownNumbersIdentified=", ", messagesMovedToSpam=", z);
        return bar.m(this.e, ")", z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
