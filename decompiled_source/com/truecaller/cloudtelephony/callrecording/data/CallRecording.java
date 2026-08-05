package com.truecaller.cloudtelephony.callrecording.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/data/CallRecording;", "Landroid/os/Parcelable;", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CallRecording implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.cloudtelephony.callrecording.data.CallRecording> CREATOR = new om0.bar(29);
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.util.Date c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final long f;
    public final java.util.List g;
    public final java.lang.String h;
    public final com.truecaller.cloudtelephony.callrecording.data.CallRecordingSummaryStatus i;
    public final java.lang.String j;
    public final com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus k;
    public final int l;
    public final boolean m;
    public final boolean n;

    public CallRecording(java.lang.String str, java.lang.String str2, java.util.Date date, java.lang.String str3, java.lang.String str4, long j, java.util.List list, java.lang.String str5, com.truecaller.cloudtelephony.callrecording.data.CallRecordingSummaryStatus callRecordingSummaryStatus, java.lang.String str6, com.truecaller.cloudtelephony.callrecording.data.CallRecordingSubjectStatus callRecordingSubjectStatus, int i, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "filePath");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "date");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callRecordingSummaryStatus, "summaryStatus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callRecordingSubjectStatus, "subjectStatus");
        this.a = str;
        this.b = str2;
        this.c = date;
        this.d = str3;
        this.e = str4;
        this.f = j;
        this.g = list;
        this.h = str5;
        this.i = callRecordingSummaryStatus;
        this.j = str6;
        this.k = callRecordingSubjectStatus;
        this.l = i;
        this.m = z;
        this.n = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.cloudtelephony.callrecording.data.CallRecording)) {
            return false;
        }
        com.truecaller.cloudtelephony.callrecording.data.CallRecording callRecording = (com.truecaller.cloudtelephony.callrecording.data.CallRecording) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, callRecording.a) && kotlin.jvm.internal.Intrinsics.b(this.b, callRecording.b) && kotlin.jvm.internal.Intrinsics.b(this.c, callRecording.c) && kotlin.jvm.internal.Intrinsics.b(this.d, callRecording.d) && kotlin.jvm.internal.Intrinsics.b(this.e, callRecording.e) && this.f == callRecording.f && kotlin.jvm.internal.Intrinsics.b(this.g, callRecording.g) && kotlin.jvm.internal.Intrinsics.b(this.h, callRecording.h) && this.i == callRecording.i && kotlin.jvm.internal.Intrinsics.b(this.j, callRecording.j) && this.k == callRecording.k && this.l == callRecording.l && this.m == callRecording.m && this.n == callRecording.n;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i;
        int h = uf.qux.h(this.c, ax1.bar.e(this.a.hashCode() * 31, 31, this.b), 31);
        int i2 = 0;
        java.lang.String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (h + hashCode) * 31;
        java.lang.String str2 = this.e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        long j = this.f;
        int i4 = (((i3 + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        java.util.List list = this.g;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        java.lang.String str3 = this.h;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int hashCode5 = (this.i.hashCode() + ((i5 + hashCode4) * 31)) * 31;
        java.lang.String str4 = this.j;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int hashCode6 = (((this.k.hashCode() + ((hashCode5 + i2) * 31)) * 31) + this.l) * 31;
        int i6 = 1237;
        if (this.m) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i7 = (hashCode6 + i) * 31;
        if (this.n) {
            i6 = 1231;
        }
        return i7 + i6;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("CallRecording(id=", this.a, ", filePath=", this.b, ", date=");
        E.append(this.c);
        E.append(", name=");
        E.append(this.d);
        E.append(", callerNumber=");
        com.appsflyer.internal.e.y(E, this.f, this.e, ", duration=");
        E.append(", transcriptions=");
        E.append(this.g);
        E.append(", summary=");
        E.append(this.h);
        E.append(", summaryStatus=");
        E.append(this.i);
        E.append(", subject=");
        E.append(this.j);
        E.append(", subjectStatus=");
        E.append(this.k);
        E.append(", type=");
        E.append(this.l);
        E.append(", audioBackedUp=");
        E.append(this.m);
        E.append(", isDemo=");
        E.append(this.n);
        E.append(")");
        return E.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
        java.util.List list = this.g;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((com.truecaller.cloudtelephony.callrecording.data.CallRecordingTranscriptionItem) it.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.h);
        parcel.writeString(this.i.name());
        parcel.writeString(this.j);
        parcel.writeString(this.k.name());
        parcel.writeInt(this.l);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
    }
}
