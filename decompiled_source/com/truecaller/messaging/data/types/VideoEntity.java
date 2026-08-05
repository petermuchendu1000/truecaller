package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/VideoEntity;", "Lcom/truecaller/messaging/data/types/BinaryEntity;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class VideoEntity extends com.truecaller.messaging.data.types.BinaryEntity {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.VideoEntity> CREATOR = new a11.bar(27);
    public final int A;
    public final boolean B;
    public final int w;
    public final int x;
    public final int y;
    public final android.net.Uri z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoEntity(long j, java.lang.String str, int i, android.net.Uri uri, boolean z, long j2, int i2, int i3, int i4, android.net.Uri uri2, java.lang.String str2) {
        super(i, 64, j, j2, uri, str, str2, z);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri2, "thumbnailUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "source");
        this.A = 2;
        this.B = true;
        this.w = i2;
        this.x = i3;
        this.y = i4;
        this.z = uri2;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final void c(android.content.ContentValues contentValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        contentValues.put("type", this.b);
        contentValues.put("entity_type", java.lang.Integer.valueOf(this.A));
        contentValues.put("entity_info2", java.lang.Integer.valueOf(this.c));
        contentValues.put("entity_info1", this.i.toString());
        contentValues.put("entity_info5", java.lang.Integer.valueOf(this.w));
        contentValues.put("entity_info6", java.lang.Integer.valueOf(this.x));
        contentValues.put("entity_info3", java.lang.Long.valueOf(this.k));
        contentValues.put("entity_info7", java.lang.Integer.valueOf(this.y));
        contentValues.put("entity_info4", this.z.toString());
        contentValues.put("entity_info8", this.l);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: d, reason: from getter */
    public final int getA() {
        return this.A;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final boolean equals(java.lang.Object obj) {
        if (super.equals(obj) && (obj instanceof com.truecaller.messaging.data.types.VideoEntity)) {
            com.truecaller.messaging.data.types.VideoEntity videoEntity = (com.truecaller.messaging.data.types.VideoEntity) obj;
            if (videoEntity.w == this.w && videoEntity.x == this.x && videoEntity.y == this.y && kotlin.jvm.internal.Intrinsics.b(videoEntity.z, this.z)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final int hashCode() {
        return this.z.hashCode() + (((((((super.hashCode() * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: s, reason: from getter */
    public final boolean getB() {
        return this.B;
    }

    public final com.truecaller.messaging.data.types.VideoEntity t(android.net.Uri uri, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "newUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "source");
        return new com.truecaller.messaging.data.types.VideoEntity(this.a, this.b, this.c, uri, this.j, this.k, this.w, this.x, this.y, this.z, str);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeString(this.z.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoEntity(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "source");
        this.A = 2;
        this.B = true;
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        android.net.Uri parse = android.net.Uri.parse(parcel.readString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        this.z = parse;
    }
}
