package com.truecaller.contacteditor.api.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/contacteditor/api/model/Job;", "Landroid/os/Parcelable;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final /* data */ class Job implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.contacteditor.api.model.Job> CREATOR = new y02.t(24);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4545a;
    public final java.lang.String b;

    public Job(java.lang.String str, java.lang.String str2) {
        this.f4545a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.contacteditor.api.model.Job)) {
            return false;
        }
        com.truecaller.contacteditor.api.model.Job job = (com.truecaller.contacteditor.api.model.Job) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.f4545a, job.f4545a) && kotlin.jvm.internal.Intrinsics.b(this.b, job.b);
    }

    public final int hashCode() {
        java.lang.String str = this.f4545a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return y.o.e("Job(company=", this.f4545a, ", jobTitle=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i10) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.f4545a);
        parcel.writeString(this.b);
    }
}
