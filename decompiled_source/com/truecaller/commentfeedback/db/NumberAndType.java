package com.truecaller.commentfeedback.db;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/commentfeedback/db/NumberAndType;", "Landroid/os/Parcelable;", "comment-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class NumberAndType implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.commentfeedback.db.NumberAndType> CREATOR = new a11.bar(1);
    public final java.lang.String a;
    public final com.truecaller.commentfeedback.db.PhoneNumberType b;

    public NumberAndType(java.lang.String str, com.truecaller.commentfeedback.db.PhoneNumberType phoneNumberType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberType, "numberType");
        this.a = str;
        this.b = phoneNumberType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.commentfeedback.db.NumberAndType)) {
            return false;
        }
        com.truecaller.commentfeedback.db.NumberAndType numberAndType = (com.truecaller.commentfeedback.db.NumberAndType) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, numberAndType.a) && this.b == numberAndType.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "NumberAndType(number=" + this.a + ", numberType=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
    }

    public /* synthetic */ NumberAndType(java.lang.String str) {
        this(str, com.truecaller.commentfeedback.db.PhoneNumberType.UNKNOWN_NUMBER_TYPE);
    }
}
