package com.truecaller.contacteditor.api.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/contacteditor/api/model/ContactExtras;", "Landroid/os/Parcelable;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final /* data */ class ContactExtras implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.contacteditor.api.model.ContactExtras> CREATOR = new y02.t(22);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Long f4537a;
    public final java.lang.String b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f4538c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f4539d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f4540e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f4541f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f4542g;

    /* renamed from: h, reason: collision with root package name */
    public final com.truecaller.contacteditor.api.model.Job f4543h;

    public ContactExtras(java.lang.Long l2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.util.List list2, java.lang.String str4, com.truecaller.contacteditor.api.model.Job job) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "phoneNumbers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "emails");
        this.f4537a = l2;
        this.b = str;
        this.f4538c = str2;
        this.f4539d = str3;
        this.f4540e = list;
        this.f4541f = list2;
        this.f4542g = str4;
        this.f4543h = job;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.contacteditor.api.model.ContactExtras)) {
            return false;
        }
        com.truecaller.contacteditor.api.model.ContactExtras contactExtras = (com.truecaller.contacteditor.api.model.ContactExtras) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.f4537a, contactExtras.f4537a) && kotlin.jvm.internal.Intrinsics.b(this.b, contactExtras.b) && kotlin.jvm.internal.Intrinsics.b(this.f4538c, contactExtras.f4538c) && kotlin.jvm.internal.Intrinsics.b(this.f4539d, contactExtras.f4539d) && kotlin.jvm.internal.Intrinsics.b(this.f4540e, contactExtras.f4540e) && kotlin.jvm.internal.Intrinsics.b(this.f4541f, contactExtras.f4541f) && kotlin.jvm.internal.Intrinsics.b(this.f4542g, contactExtras.f4542g) && kotlin.jvm.internal.Intrinsics.b(this.f4543h, contactExtras.f4543h);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i10 = 0;
        java.lang.Long l2 = this.f4537a;
        if (l2 == null) {
            hashCode = 0;
        } else {
            hashCode = l2.hashCode();
        }
        int i11 = hashCode * 31;
        java.lang.String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        java.lang.String str2 = this.f4538c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        java.lang.String str3 = this.f4539d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int g5 = uf.qux.g(uf.qux.g((i13 + hashCode4) * 31, 31, this.f4540e), 31, this.f4541f);
        java.lang.String str4 = this.f4542g;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i14 = (g5 + hashCode5) * 31;
        com.truecaller.contacteditor.api.model.Job job = this.f4543h;
        if (job != null) {
            i10 = job.hashCode();
        }
        return i14 + i10;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ContactExtras(phonebookId=");
        sb2.append(this.f4537a);
        sb2.append(", imageUrl=");
        sb2.append(this.b);
        sb2.append(", firstName=");
        defpackage.bar.E(sb2, this.f4538c, ", lastName=", this.f4539d, ", phoneNumbers=");
        com.ironsource.adqualitysdk.sdk.i.bar.y(sb2, this.f4540e, ", emails=", this.f4541f, ", address=");
        sb2.append(this.f4542g);
        sb2.append(", job=");
        sb2.append(this.f4543h);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i10) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        java.lang.Long l2 = this.f4537a;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.b);
        parcel.writeString(this.f4538c);
        parcel.writeString(this.f4539d);
        java.util.Iterator f4 = z0.a0.f(this.f4540e, parcel);
        while (f4.hasNext()) {
            ((com.truecaller.contacteditor.api.model.PhoneNumber) f4.next()).writeToParcel(parcel, i10);
        }
        java.util.Iterator f10 = z0.a0.f(this.f4541f, parcel);
        while (f10.hasNext()) {
            ((com.truecaller.contacteditor.api.model.Email) f10.next()).writeToParcel(parcel, i10);
        }
        parcel.writeString(this.f4542g);
        com.truecaller.contacteditor.api.model.Job job = this.f4543h;
        if (job == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            job.writeToParcel(parcel, i10);
        }
    }
}
