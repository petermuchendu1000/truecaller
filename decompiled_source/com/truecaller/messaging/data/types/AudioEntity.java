package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/data/types/AudioEntity;", "Lcom/truecaller/messaging/data/types/BinaryEntity;", "CREATOR", "c22/bar", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AudioEntity extends com.truecaller.messaging.data.types.BinaryEntity {

    @org.jetbrains.annotations.NotNull
    public static final c22.bar CREATOR = new java.lang.Object();
    public final int w;
    public final int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioEntity(int i, int i2, long j, long j2, android.net.Uri uri, java.lang.String str, java.lang.String str2, boolean z) {
        super(i, 64, j, j2, uri, str, str2, z);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "source");
        this.x = 4;
        this.w = i2;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final void c(android.content.ContentValues contentValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        contentValues.put("type", this.b);
        contentValues.put("entity_type", java.lang.Integer.valueOf(this.x));
        contentValues.put("entity_info2", java.lang.Integer.valueOf(this.c));
        contentValues.put("entity_info1", this.i.toString());
        contentValues.put("entity_info3", java.lang.Long.valueOf(this.k));
        contentValues.put("entity_info4", java.lang.Integer.valueOf(this.w));
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
        if (super.equals(obj) && (obj instanceof com.truecaller.messaging.data.types.AudioEntity) && ((com.truecaller.messaging.data.types.AudioEntity) obj).w == this.w) {
            return true;
        }
        return false;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final int hashCode() {
        return (super.hashCode() * 31) + this.w;
    }

    public final com.truecaller.messaging.data.types.BinaryEntity t(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "source");
        long j = this.k;
        return new com.truecaller.messaging.data.types.AudioEntity(this.c, this.w, this.a, j, this.i, this.b, str, this.j);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.w);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioEntity(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "source");
        this.x = 4;
        this.w = parcel.readInt();
    }
}
