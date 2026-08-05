package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/BinaryEntity;", "Lcom/truecaller/messaging/data/types/Entity;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public class BinaryEntity extends com.truecaller.messaging.data.types.Entity {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.BinaryEntity> CREATOR = new a11.bar(11);
    public final android.net.Uri i;
    public final boolean j;
    public final long k;
    public final java.lang.String l;
    public int m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BinaryEntity(int i, int i2, long j, long j2, android.net.Uri uri, java.lang.String str, java.lang.String str2, boolean z) {
        super(j, str, i);
        j = (i2 & 1) != 0 ? -1L : j;
        i = (i2 & 4) != 0 ? 0 : i;
        str2 = (i2 & 128) != 0 ? "" : str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "source");
        this.n = 8;
        this.o = true;
        this.p = b91.d.q(str);
        this.q = b91.d.v(str);
        this.r = b91.d.u(str);
        this.s = b91.d.n(str);
        this.t = b91.d.p(str);
        this.u = b91.d.o(str);
        this.v = b91.d.s(str);
        this.i = uri;
        this.j = z;
        this.k = j2;
        this.m = -1;
        this.l = str2;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public void c(android.content.ContentValues contentValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        contentValues.put("type", this.b);
        contentValues.put("entity_info2", java.lang.Integer.valueOf(this.c));
        contentValues.put("entity_info1", this.i.toString());
        contentValues.put("entity_info3", java.lang.Long.valueOf(this.k));
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: d, reason: from getter */
    public int getN() {
        return this.n;
    }

    @Override // com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: e, reason: from getter */
    public boolean getS() {
        return this.s;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj) && (obj instanceof com.truecaller.messaging.data.types.BinaryEntity)) {
            if (kotlin.jvm.internal.Intrinsics.b(this.i, ((com.truecaller.messaging.data.types.BinaryEntity) obj).i)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: f, reason: from getter */
    public boolean getO() {
        return this.o;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: g, reason: from getter */
    public final boolean getU() {
        return this.u;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: h, reason: from getter */
    public boolean getT() {
        return this.t;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public int hashCode() {
        return this.i.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: i, reason: from getter */
    public boolean getP() {
        return this.p;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public boolean j() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: m, reason: from getter */
    public final boolean getV() {
        return this.v;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public final boolean n() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public boolean o() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: r, reason: from getter */
    public boolean getR() {
        return this.r;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: s, reason: from getter */
    public boolean getQ() {
        return this.q;
    }

    @Override // com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.i.toString());
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeLong(this.k);
        parcel.writeInt(this.m);
        parcel.writeString(this.l);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryEntity(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "source");
        this.n = 8;
        this.o = true;
        this.p = b91.d.q(this.b);
        this.q = b91.d.v(this.b);
        this.r = b91.d.u(this.b);
        this.s = b91.d.n(this.b);
        this.t = b91.d.p(this.b);
        this.u = b91.d.o(this.b);
        this.v = b91.d.s(this.b);
        android.net.Uri parse = android.net.Uri.parse(parcel.readString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        this.i = parse;
        this.j = parcel.readInt() == 1;
        this.k = parcel.readLong();
        this.m = parcel.readInt();
        java.lang.String readString = parcel.readString();
        this.l = readString == null ? "" : readString;
    }
}
