package com.truecaller.commentfeedback.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/commentfeedback/model/Profile;", "Landroid/os/Parcelable;", "comment-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Profile implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.commentfeedback.model.Profile> CREATOR = new a11.bar(8);
    public final java.lang.String a;
    public final java.lang.String b;
    public final boolean c;

    public Profile(java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "avatarUrl");
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.commentfeedback.model.Profile)) {
            return false;
        }
        com.truecaller.commentfeedback.model.Profile profile = (com.truecaller.commentfeedback.model.Profile) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, profile.a) && kotlin.jvm.internal.Intrinsics.b(this.b, profile.b) && this.c == profile.c;
    }

    public final int hashCode() {
        int i;
        int e = ax1.bar.e(this.a.hashCode() * 31, 31, this.b);
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return e + i;
    }

    public final java.lang.String toString() {
        return h8.s0.s(ro0.f.E("Profile(name=", this.a, ", avatarUrl=", this.b, ", isVerified="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
