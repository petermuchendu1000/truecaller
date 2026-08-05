package com.truecaller.contact.entity.model;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/contact/entity/model/DataEntityPrimaryFields;", "Landroid/os/Parcelable;", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DataEntityPrimaryFields implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.contact.entity.model.DataEntityPrimaryFields> CREATOR = new f22.bar(7);
    public java.lang.Long a;
    public final java.lang.String b;
    public final boolean c;
    public final java.lang.Long d;
    public final java.lang.Integer e;

    public DataEntityPrimaryFields(java.lang.Long l, java.lang.String str, boolean z, java.lang.Long l2, java.lang.Integer num) {
        this.a = l;
        this.b = str;
        this.c = z;
        this.d = l2;
        this.e = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.contact.entity.model.DataEntityPrimaryFields)) {
            return false;
        }
        com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = (com.truecaller.contact.entity.model.DataEntityPrimaryFields) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, dataEntityPrimaryFields.a) && kotlin.jvm.internal.Intrinsics.b(this.b, dataEntityPrimaryFields.b) && this.c == dataEntityPrimaryFields.c && kotlin.jvm.internal.Intrinsics.b(this.d, dataEntityPrimaryFields.d) && kotlin.jvm.internal.Intrinsics.b(this.e, dataEntityPrimaryFields.e);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int hashCode3;
        java.lang.Long l = this.a;
        int i2 = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i3 = hashCode * 31;
        java.lang.String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i5 = (i4 + i) * 31;
        java.lang.Long l2 = this.d;
        if (l2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        java.lang.Integer num = this.e;
        if (num != null) {
            i2 = num.hashCode();
        }
        return i6 + i2;
    }

    public final java.lang.String toString() {
        java.lang.Long l = this.a;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataEntityPrimaryFields(dataId=");
        sb.append(l);
        sb.append(", rawContactTcId=");
        sb.append(this.b);
        sb.append(", isPrimary=");
        sb.append(this.c);
        sb.append(", dataPhonebookId=");
        sb.append(this.d);
        sb.append(", source=");
        return com.appsflyer.internal.e.m(sb, this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        java.lang.Long l = this.a;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        java.lang.Long l2 = this.d;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        java.lang.Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            z0.a0.j(parcel, 1, num);
        }
    }
}
