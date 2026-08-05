package com.truecaller.tcpermissions;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/tcpermissions/PermissionRequestOptions;", "Landroid/os/Parcelable;", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class PermissionRequestOptions implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.tcpermissions.PermissionRequestOptions> CREATOR = new om0.bar(20);
    public final boolean a;
    public final boolean b;
    public final java.lang.Integer c;

    public PermissionRequestOptions(boolean z, boolean z2, java.lang.Integer num) {
        this.a = z;
        this.b = z2;
        this.c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.tcpermissions.PermissionRequestOptions)) {
            return false;
        }
        com.truecaller.tcpermissions.PermissionRequestOptions permissionRequestOptions = (com.truecaller.tcpermissions.PermissionRequestOptions) obj;
        return this.a == permissionRequestOptions.a && this.b == permissionRequestOptions.b && kotlin.jvm.internal.Intrinsics.b(this.c, permissionRequestOptions.c);
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int i2 = 1237;
        if (this.a) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = i * 31;
        if (this.b) {
            i2 = 1231;
        }
        int i4 = (i3 + i2) * 31;
        java.lang.Integer num = this.c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return i4 + hashCode;
    }

    public final java.lang.String toString() {
        return com.appsflyer.internal.e.m(bx.e1.v("PermissionRequestOptions(showPermissionSettings=", ", showAccessContacts=", ", permissionsDeniedExplanation=", this.a, this.b), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        java.lang.Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            z0.a0.j(parcel, 1, num);
        }
    }

    public /* synthetic */ PermissionRequestOptions(java.lang.Integer num, int i) {
        this((i & 1) != 0, (i & 2) != 0, (i & 4) != 0 ? null : num);
    }
}
