package com.truecaller.contacteditor.api.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/contacteditor/api/model/Email;", "Landroid/os/Parcelable;", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final /* data */ class Email implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.contacteditor.api.model.Email> CREATOR = new y02.t(23);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4544a;
    public final int b;

    public Email(java.lang.String str, int i10) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, androidx.core.app.NotificationCompat.CATEGORY_EMAIL);
        this.f4544a = str;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.contacteditor.api.model.Email)) {
            return false;
        }
        com.truecaller.contacteditor.api.model.Email email = (com.truecaller.contacteditor.api.model.Email) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.f4544a, email.f4544a) && this.b == email.b;
    }

    public final int hashCode() {
        return (this.f4544a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return com.appsflyer.internal.e.i("Email(email=", this.b, this.f4544a, ", type=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i10) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.f4544a);
        parcel.writeInt(this.b);
    }
}
