package com.truecaller.swish.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/swish/model/SwishPayeeData;", "Landroid/os/Parcelable;", "swish-integration_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class SwishPayeeData implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.swish.model.SwishPayeeData> CREATOR = new f22.bar(19);
    public final com.truecaller.common.ui.avatar.AvatarXConfig a;
    public final java.lang.String b;
    public final boolean c;
    public final com.truecaller.swish.model.SwishNumber d;

    public SwishPayeeData(com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig, java.lang.String str, boolean z, com.truecaller.swish.model.SwishNumber swishNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarXConfig, "avatarXConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(swishNumber, "number");
        this.a = avatarXConfig;
        this.b = str;
        this.c = z;
        this.d = swishNumber;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.swish.model.SwishPayeeData)) {
            return false;
        }
        com.truecaller.swish.model.SwishPayeeData swishPayeeData = (com.truecaller.swish.model.SwishPayeeData) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, swishPayeeData.a) && kotlin.jvm.internal.Intrinsics.b(this.b, swishPayeeData.b) && this.c == swishPayeeData.c && kotlin.jvm.internal.Intrinsics.b(this.d, swishPayeeData.d);
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = this.a.hashCode() * 31;
        java.lang.String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.d.hashCode() + ((i2 + i) * 31);
    }

    public final java.lang.String toString() {
        return "SwishPayeeData(avatarXConfig=" + this.a + ", contactName=" + this.b + ", isKnownContact=" + this.c + ", number=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        this.d.writeToParcel(parcel, i);
    }
}
