package com.truecaller.service.vbmissedcall;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/service/vbmissedcall/VBMissedCallNotificationExtras;", "Landroid/os/Parcelable;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VBMissedCallNotificationExtras implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras> CREATOR = new hn.bar(1);
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;

    public VBMissedCallNotificationExtras(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "businessNumber");
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public static com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras a(com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras vBMissedCallNotificationExtras, java.lang.String str, java.lang.String str2, int i) {
        java.lang.String str3 = vBMissedCallNotificationExtras.a;
        if ((i & 2) != 0) {
            str = vBMissedCallNotificationExtras.b;
        }
        java.lang.String str4 = str;
        long j = vBMissedCallNotificationExtras.c;
        java.lang.String str5 = vBMissedCallNotificationExtras.d;
        java.lang.String str6 = vBMissedCallNotificationExtras.e;
        if ((i & 32) != 0) {
            str2 = vBMissedCallNotificationExtras.f;
        }
        java.lang.String str7 = vBMissedCallNotificationExtras.g;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "businessNumber");
        return new com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras(j, str3, str4, str5, str6, str2, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras)) {
            return false;
        }
        com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras vBMissedCallNotificationExtras = (com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, vBMissedCallNotificationExtras.a) && kotlin.jvm.internal.Intrinsics.b(this.b, vBMissedCallNotificationExtras.b) && this.c == vBMissedCallNotificationExtras.c && kotlin.jvm.internal.Intrinsics.b(this.d, vBMissedCallNotificationExtras.d) && kotlin.jvm.internal.Intrinsics.b(this.e, vBMissedCallNotificationExtras.e) && kotlin.jvm.internal.Intrinsics.b(this.f, vBMissedCallNotificationExtras.f) && kotlin.jvm.internal.Intrinsics.b(this.g, vBMissedCallNotificationExtras.g);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        java.lang.String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        java.lang.String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        long j = this.c;
        int i3 = (((i2 + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        java.lang.String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int e = ax1.bar.e((i3 + hashCode3) * 31, 31, this.e);
        java.lang.String str4 = this.f;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (e + hashCode4) * 31;
        java.lang.String str5 = this.g;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i4 + i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("VBMissedCallNotificationExtras(callId=", this.a, ", cmbId=", this.b, ", callLogId=");
        ro0.f.K(E, this.c, ", displayName=", this.d);
        bar.E(E, ", businessNumber=", this.e, ", alternateNumber=", this.f);
        return y.o.f(", contactType=", this.g, ")", E);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
