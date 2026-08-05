package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/data/types/DocumentEntity;", "Lcom/truecaller/messaging/data/types/BinaryEntity;", "CREATOR", "c22/a", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DocumentEntity extends com.truecaller.messaging.data.types.BinaryEntity {

    @org.jetbrains.annotations.NotNull
    public static final c22.a CREATOR = new java.lang.Object();
    public final java.lang.String w;
    public final int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentEntity(long j, java.lang.String str, int i, android.net.Uri uri, boolean z, long j2, java.lang.String str2, java.lang.String str3) {
        super(i, 64, j, j2, uri, str, str3, z);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "fileName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "source");
        this.x = 5;
        this.w = str2;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final void c(android.content.ContentValues contentValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        super.c(contentValues);
        contentValues.put("entity_type", java.lang.Integer.valueOf(this.x));
        contentValues.put("entity_info4", this.w);
        contentValues.put("entity_info5", this.l);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: d, reason: from getter */
    public final int getX() {
        return this.x;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final boolean equals(java.lang.Object obj) {
        if (super.equals(obj) && (obj instanceof com.truecaller.messaging.data.types.DocumentEntity) && kotlin.jvm.internal.Intrinsics.b(((com.truecaller.messaging.data.types.DocumentEntity) obj).w, this.w)) {
            return true;
        }
        return false;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final int hashCode() {
        return this.w.hashCode() + (super.hashCode() * 31);
    }

    public final com.truecaller.messaging.data.types.BinaryEntity t(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "source");
        return new com.truecaller.messaging.data.types.DocumentEntity(this.a, this.b, this.c, this.i, this.j, this.k, this.w, str);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.w);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentEntity(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "source");
        this.x = 5;
        java.lang.String readString = parcel.readString();
        this.w = readString == null ? "" : readString;
    }
}
