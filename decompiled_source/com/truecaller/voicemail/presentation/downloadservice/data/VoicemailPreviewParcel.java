package com.truecaller.voicemail.presentation.downloadservice.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/voicemail/presentation/downloadservice/data/VoicemailPreviewParcel;", "Landroid/os/Parcelable;", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VoicemailPreviewParcel implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.voicemail.presentation.downloadservice.data.VoicemailPreviewParcel> CREATOR = new y02.t(3);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final long e;
    public final java.lang.String f;
    public final java.time.ZonedDateTime g;
    public final boolean h;
    public final boolean i;
    public final java.lang.String j;
    public final java.lang.String k;
    public final boolean l;

    public VoicemailPreviewParcel(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, java.lang.String str5, java.time.ZonedDateTime zonedDateTime, boolean z, boolean z2, java.lang.String str6, java.lang.String str7, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "fromNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "shortTranscription");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zonedDateTime, "createdAt");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
        this.f = str5;
        this.g = zonedDateTime;
        this.h = z;
        this.i = z2;
        this.j = str6;
        this.k = str7;
        this.l = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.voicemail.presentation.downloadservice.data.VoicemailPreviewParcel)) {
            return false;
        }
        com.truecaller.voicemail.presentation.downloadservice.data.VoicemailPreviewParcel voicemailPreviewParcel = (com.truecaller.voicemail.presentation.downloadservice.data.VoicemailPreviewParcel) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, voicemailPreviewParcel.a) && kotlin.jvm.internal.Intrinsics.b(this.b, voicemailPreviewParcel.b) && kotlin.jvm.internal.Intrinsics.b(this.c, voicemailPreviewParcel.c) && kotlin.jvm.internal.Intrinsics.b(this.d, voicemailPreviewParcel.d) && this.e == voicemailPreviewParcel.e && kotlin.jvm.internal.Intrinsics.b(this.f, voicemailPreviewParcel.f) && kotlin.jvm.internal.Intrinsics.b(this.g, voicemailPreviewParcel.g) && this.h == voicemailPreviewParcel.h && this.i == voicemailPreviewParcel.i && kotlin.jvm.internal.Intrinsics.b(this.j, voicemailPreviewParcel.j) && kotlin.jvm.internal.Intrinsics.b(this.k, voicemailPreviewParcel.k) && this.l == voicemailPreviewParcel.l;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int i2;
        int hashCode3;
        int hashCode4 = this.a.hashCode() * 31;
        int i3 = 0;
        java.lang.String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (hashCode4 + hashCode) * 31;
        java.lang.String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int e = ax1.bar.e((i4 + hashCode2) * 31, 31, this.d);
        long j = this.e;
        int b = (y80.baz.b(this.g) + ax1.bar.e((e + ((int) (j ^ (j >>> 32)))) * 31, 31, this.f)) * 31;
        int i5 = 1237;
        if (this.h) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i6 = (b + i) * 31;
        if (this.i) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i7 = (i6 + i2) * 31;
        java.lang.String str3 = this.j;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i8 = (i7 + hashCode3) * 31;
        java.lang.String str4 = this.k;
        if (str4 != null) {
            i3 = str4.hashCode();
        }
        int i9 = (i8 + i3) * 31;
        if (this.l) {
            i5 = 1231;
        }
        return i9 + i5;
    }

    public final java.lang.String toString() {
        java.time.ZonedDateTime zonedDateTime = this.g;
        java.lang.StringBuilder E = ro0.f.E("VoicemailPreviewParcel(id=", this.a, ", clientCallId=", this.b, ", toNumber=");
        bar.E(E, this.c, ", fromNumber=", this.d, ", duration=");
        ro0.f.K(E, this.e, ", shortTranscription=", this.f);
        E.append(", createdAt=");
        E.append(zonedDateTime);
        E.append(", fullTranscriptionAvailable=");
        E.append(this.h);
        E.append(", isSilent=");
        E.append(this.i);
        E.append(", pushTitle=");
        E.append(this.j);
        E.append(", pushBody=");
        E.append(this.k);
        E.append(", hasTranscript=");
        E.append(this.l);
        E.append(")");
        return E.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
        parcel.writeSerializable(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l ? 1 : 0);
    }
}
