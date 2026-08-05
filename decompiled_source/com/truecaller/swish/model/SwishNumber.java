package com.truecaller.swish.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/swish/model/SwishNumber;", "Landroid/os/Parcelable;", "swish-integration_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class SwishNumber implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.swish.model.SwishNumber> CREATOR = new f22.bar(18);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public SwishNumber(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "normalizedNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "displayNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "displayType");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.swish.model.SwishNumber)) {
            return false;
        }
        com.truecaller.swish.model.SwishNumber swishNumber = (com.truecaller.swish.model.SwishNumber) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, swishNumber.a) && kotlin.jvm.internal.Intrinsics.b(this.b, swishNumber.b) && kotlin.jvm.internal.Intrinsics.b(this.c, swishNumber.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ax1.bar.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final java.lang.String toString() {
        return bar.v(this.c, ")", ro0.f.E("SwishNumber(normalizedNumber=", this.a, ", displayNumber=", this.b, ", displayType="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
