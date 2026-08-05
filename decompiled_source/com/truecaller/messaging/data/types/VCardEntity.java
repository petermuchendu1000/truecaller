package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/data/types/VCardEntity;", "Lcom/truecaller/messaging/data/types/BinaryEntity;", "CREATOR", "c22/m", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class VCardEntity extends com.truecaller.messaging.data.types.BinaryEntity {

    @org.jetbrains.annotations.NotNull
    public static final c22.m CREATOR = new java.lang.Object();
    public final boolean A;
    public final java.lang.String w;
    public final int x;
    public final android.net.Uri y;
    public final int z;

    public /* synthetic */ VCardEntity(java.lang.String str, int i, java.lang.String str2, long j, java.lang.String str3, int i2, android.net.Uri uri, java.lang.String str4, int i3) {
        this(-1L, str, i, str2, false, j, str3, i2, (i3 & 256) != 0 ? android.net.Uri.EMPTY : uri, (i3 & 512) != 0 ? "" : str4);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final void c(android.content.ContentValues contentValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        super.c(contentValues);
        contentValues.put("entity_type", java.lang.Integer.valueOf(this.z));
        contentValues.put("entity_info4", java.lang.String.valueOf(this.y));
        contentValues.put("entity_info5", this.w);
        contentValues.put("entity_info6", java.lang.Integer.valueOf(this.x));
        contentValues.put("entity_info7", this.l);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: d, reason: from getter */
    public final int getZ() {
        return this.z;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final boolean equals(java.lang.Object obj) {
        if (super.equals(obj) && (obj instanceof com.truecaller.messaging.data.types.VCardEntity)) {
            com.truecaller.messaging.data.types.VCardEntity vCardEntity = (com.truecaller.messaging.data.types.VCardEntity) obj;
            if (kotlin.jvm.internal.Intrinsics.b(vCardEntity.w, this.w) && vCardEntity.x == this.x && kotlin.jvm.internal.Intrinsics.b(vCardEntity.y, this.y)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final int hashCode() {
        int i;
        int e = (ax1.bar.e(super.hashCode() * 31, 31, this.w) + this.x) * 31;
        android.net.Uri uri = this.y;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            i = 0;
        }
        return e + i;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: r, reason: from getter */
    public final boolean getA() {
        return this.A;
    }

    public final com.truecaller.messaging.data.types.BinaryEntity t(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "source");
        java.lang.String uri = this.i.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return new com.truecaller.messaging.data.types.VCardEntity(this.a, this.b, this.c, uri, this.j, this.k, this.w, this.x, this.y, str);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.w);
        parcel.writeInt(this.x);
        parcel.writeString(java.lang.String.valueOf(this.y));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VCardEntity(long j, java.lang.String str, int i, java.lang.String str2, boolean z, long j2, java.lang.String str3, int i2, android.net.Uri uri, java.lang.String str4) {
        super(i, 64, j, j2, r7, str, str4, z);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "contactName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "source");
        android.net.Uri parse = android.net.Uri.parse(str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        this.z = 6;
        this.A = true;
        this.w = str3;
        this.x = i2;
        this.y = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VCardEntity(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "source");
        this.z = 6;
        this.A = true;
        this.w = java.lang.String.valueOf(parcel.readString());
        this.x = parcel.readInt();
        this.y = android.net.Uri.parse(parcel.readString());
    }
}
