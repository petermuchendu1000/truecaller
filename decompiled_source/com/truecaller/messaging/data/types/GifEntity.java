package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/data/types/GifEntity;", "Lcom/truecaller/messaging/data/types/ImageEntity;", "CREATOR", "c22/c", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GifEntity extends com.truecaller.messaging.data.types.ImageEntity {

    @org.jetbrains.annotations.NotNull
    public static final c22.c CREATOR = new java.lang.Object();
    public final int B;
    public final boolean C;
    public final boolean D;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GifEntity(long j, java.lang.String str, int i, java.lang.String str2, int i2, int i3, boolean z, long j2, android.net.Uri uri, java.lang.String str3) {
        super(j, str, i, r5, i2, i3, j2, z, uri, str3);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "thumbnailUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "source");
        android.net.Uri parse = android.net.Uri.parse(str2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        this.B = 3;
        this.C = true;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "contentType");
        this.D = true ^ "tenor/gif".equalsIgnoreCase(str);
    }

    @Override // com.truecaller.messaging.data.types.ImageEntity, com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final void c(android.content.ContentValues contentValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        super.c(contentValues);
        contentValues.put("type", this.b);
        contentValues.put("entity_type", java.lang.Integer.valueOf(this.B));
        contentValues.put("entity_info7", this.l);
    }

    @Override // com.truecaller.messaging.data.types.ImageEntity, com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: d, reason: from getter */
    public final int getB() {
        return this.B;
    }

    @Override // com.truecaller.messaging.data.types.ImageEntity, com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final boolean equals(java.lang.Object obj) {
        if (super.equals(obj) && (obj instanceof com.truecaller.messaging.data.types.GifEntity) && kotlin.jvm.internal.Intrinsics.b(((com.truecaller.messaging.data.types.GifEntity) obj).l, this.l)) {
            return true;
        }
        return false;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: f, reason: from getter */
    public final boolean getD() {
        return this.D;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: h, reason: from getter */
    public final boolean getC() {
        return this.C;
    }

    @Override // com.truecaller.messaging.data.types.ImageEntity, com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final int hashCode() {
        return this.l.hashCode() + (super.hashCode() * 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifEntity(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.B = 3;
        this.C = true;
        java.lang.String str = this.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "contentType");
        this.D = true ^ "tenor/gif".equalsIgnoreCase(str);
    }
}
