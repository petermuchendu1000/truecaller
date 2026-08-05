package com.truecaller.messaging.transport.mms;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class PduEntity extends com.truecaller.messaging.data.types.BinaryEntity {
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.transport.mms.PduEntity> CREATOR = new hn.bar(26);
    public final java.lang.String A;
    public final java.lang.String B;
    public final int w;
    public final java.lang.String x;
    public final java.lang.String y;
    public final java.lang.String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PduEntity(java.lang.String str, android.net.Uri uri, int i, int i2, java.lang.String str2, java.lang.String str3) {
        super(0, 197, 0L, i, uri, str, null, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "content");
        this.w = i2;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = str2;
        this.B = str3;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: e */
    public final boolean getS() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: i */
    public final boolean getP() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: r */
    public final boolean getR() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: s */
    public final boolean getQ() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
    }

    public PduEntity(android.os.Parcel parcel) {
        super(parcel);
        this.w = parcel.readInt();
        this.x = parcel.readString();
        this.y = parcel.readString();
        this.z = parcel.readString();
        this.A = parcel.readString();
        this.B = parcel.readString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PduEntity(of.g gVar, android.net.Uri uri, int i) {
        super(0, 196, -1L, i, uri, r9, null, false);
        android.util.SparseArray sparseArray = gVar.a;
        byte[] bArr = (byte[]) sparseArray.get(145);
        java.lang.String v = bArr != null ? o40.bar.v(bArr) : "application/octet-stream";
        java.lang.String str = "image/jpg".equals(v) ? "image/jpeg" : v;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "content");
        java.lang.Integer num = (java.lang.Integer) sparseArray.get(129);
        this.w = num == null ? 0 : num.intValue();
        byte[] bArr2 = (byte[]) sparseArray.get(152);
        this.x = bArr2 != null ? new java.lang.String(bArr2) : null;
        byte[] bArr3 = (byte[]) sparseArray.get(151);
        this.y = bArr3 != null ? new java.lang.String(bArr3) : null;
        byte[] bArr4 = (byte[]) sparseArray.get(197);
        this.z = bArr4 != null ? o40.bar.v(bArr4) : null;
        byte[] bArr5 = (byte[]) sparseArray.get(192);
        this.A = bArr5 != null ? o40.bar.v(bArr5) : null;
        byte[] bArr6 = (byte[]) sparseArray.get(142);
        this.B = bArr6 != null ? o40.bar.v(bArr6) : null;
    }
}
