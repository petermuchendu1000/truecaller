package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/ImageEntity;", "Lcom/truecaller/messaging/data/types/BinaryEntity;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public class ImageEntity extends com.truecaller.messaging.data.types.BinaryEntity {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.ImageEntity> CREATOR = new a11.bar(18);
    public final boolean A;
    public final int w;
    public final int x;
    public final android.net.Uri y;
    public final int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageEntity(long j, java.lang.String str, int i, android.net.Uri uri, int i2, int i3, long j2, boolean z, android.net.Uri uri2, java.lang.String str2) {
        super(i, 64, j, j2, uri, str, str2, z);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri2, "thumbnailUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "source");
        this.z = 1;
        this.A = true;
        this.w = i2;
        this.x = i3;
        this.y = uri2;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public void c(android.content.ContentValues contentValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        contentValues.put("type", this.b);
        contentValues.put("entity_type", java.lang.Integer.valueOf(getZ()));
        contentValues.put("entity_info2", java.lang.Integer.valueOf(this.c));
        contentValues.put("entity_info1", this.i.toString());
        contentValues.put("entity_info5", java.lang.Integer.valueOf(this.w));
        contentValues.put("entity_info6", java.lang.Integer.valueOf(this.x));
        contentValues.put("entity_info3", java.lang.Long.valueOf(this.k));
        contentValues.put("entity_info4", this.y.toString());
        contentValues.put("entity_info7", this.l);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: d, reason: from getter */
    public int getZ() {
        return this.z;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj) && (obj instanceof com.truecaller.messaging.data.types.ImageEntity)) {
            com.truecaller.messaging.data.types.ImageEntity imageEntity = (com.truecaller.messaging.data.types.ImageEntity) obj;
            if (imageEntity.w == this.w && imageEntity.x == this.x && kotlin.jvm.internal.Intrinsics.b(imageEntity.y, this.y)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public int hashCode() {
        return this.y.hashCode() + (((((super.hashCode() * 31) + this.w) * 31) + this.x) * 31);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: i, reason: from getter */
    public final boolean getA() {
        return this.A;
    }

    public final com.truecaller.messaging.data.types.ImageEntity t(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "newSource");
        return new com.truecaller.messaging.data.types.ImageEntity(this.a, this.b, this.c, this.i, this.w, this.x, this.k, this.j, this.y, str);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeString(this.y.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageEntity(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "source");
        this.z = 1;
        this.A = true;
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        android.net.Uri parse = android.net.Uri.parse(parcel.readString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        this.y = parse;
    }
}
