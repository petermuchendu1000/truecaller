package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/data/types/RCSEntity;", "Lcom/truecaller/messaging/data/types/Entity;", "CREATOR", "c22/k", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RCSEntity extends com.truecaller.messaging.data.types.Entity {

    @org.jetbrains.annotations.NotNull
    public static final c22.k CREATOR = new java.lang.Object();
    public final java.lang.String i;
    public final int j;
    public final java.lang.String k;
    public final boolean l;
    public final int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RCSEntity(long j, java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3) {
        super(j, str, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "partUri");
        this.l = true;
        this.m = 10;
        this.i = str2;
        this.j = i2;
        this.k = str3;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public final void c(android.content.ContentValues contentValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        contentValues.put("type", this.b);
        contentValues.put("entity_type", java.lang.Integer.valueOf(this.m));
        contentValues.put("entity_info1", this.i);
        contentValues.put("entity_info2", java.lang.Integer.valueOf(this.j));
        contentValues.put("entity_info3", this.k);
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: d, reason: from getter */
    public final int getM() {
        return this.m;
    }

    @Override // com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: e */
    public final boolean getS() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public final boolean equals(java.lang.Object obj) {
        if (super.equals(obj) && (obj instanceof com.truecaller.messaging.data.types.RCSEntity)) {
            com.truecaller.messaging.data.types.RCSEntity rCSEntity = (com.truecaller.messaging.data.types.RCSEntity) obj;
            if (kotlin.jvm.internal.Intrinsics.b(this.i, rCSEntity.i) && this.j == rCSEntity.j && kotlin.jvm.internal.Intrinsics.b(this.k, rCSEntity.k)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: f */
    public final boolean getO() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: g */
    public final boolean getU() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: h */
    public final boolean getT() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public final int hashCode() {
        return this.k.hashCode() + ((ax1.bar.e(super.hashCode() * 31, 31, this.i) + this.j) * 31);
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: i */
    public final boolean getP() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public final boolean j() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: m */
    public final boolean getV() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: n, reason: from getter */
    public final boolean getL() {
        return this.l;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public final boolean o() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: r */
    public final boolean getR() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: s */
    public final boolean getQ() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RCSEntity(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "source");
        this.l = true;
        this.m = 10;
        java.lang.String readString = parcel.readString();
        this.i = readString == null ? "" : readString;
        this.j = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        this.k = readString2 != null ? readString2 : "";
    }
}
