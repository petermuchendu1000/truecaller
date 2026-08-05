package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/messaging/data/types/LocationEntity;", "Lcom/truecaller/messaging/data/types/BinaryEntity;", "CREATOR", "c22/e", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class LocationEntity extends com.truecaller.messaging.data.types.BinaryEntity {

    @org.jetbrains.annotations.NotNull
    public static final c22.e CREATOR = new java.lang.Object();
    public final java.lang.String w;
    public final double x;
    public final double y;
    public final int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationEntity(long j, java.lang.String str, int i, android.net.Uri uri, long j2, java.lang.String str2, double d, double d2) {
        super(i, 192, j, j2, uri, str, null, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "previewUri");
        this.z = 9;
        this.w = str2;
        this.x = d;
        this.y = d2;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final void c(android.content.ContentValues contentValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        contentValues.put("type", this.b);
        contentValues.put("entity_type", java.lang.Integer.valueOf(this.z));
        contentValues.put("entity_info2", java.lang.Integer.valueOf(this.c));
        contentValues.put("entity_info3", java.lang.Long.valueOf(this.k));
        contentValues.put("entity_info1", this.i.toString());
        contentValues.put("entity_info4", this.w);
        contentValues.put("entity_info5", java.lang.Double.valueOf(this.x));
        contentValues.put("entity_info6", java.lang.Double.valueOf(this.y));
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
        if (super.equals(obj) && (obj instanceof com.truecaller.messaging.data.types.LocationEntity)) {
            com.truecaller.messaging.data.types.LocationEntity locationEntity = (com.truecaller.messaging.data.types.LocationEntity) obj;
            if (locationEntity.x == this.x && locationEntity.y == this.y && kotlin.jvm.internal.Intrinsics.b(locationEntity.w, this.w)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        java.lang.String str = this.w;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i2 = (hashCode + i) * 31;
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.x);
        int i3 = (i2 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.y);
        return i3 + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    /* renamed from: t, reason: from getter */
    public final java.lang.String getW() {
        return this.w;
    }

    /* renamed from: u, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: v, reason: from getter */
    public final double getY() {
        return this.y;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.w);
        parcel.writeDouble(this.x);
        parcel.writeDouble(this.y);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationEntity(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "source");
        this.z = 9;
        this.w = parcel.readString();
        this.x = parcel.readDouble();
        this.y = parcel.readDouble();
    }
}
