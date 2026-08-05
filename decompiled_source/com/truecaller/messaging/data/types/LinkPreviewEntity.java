package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/LinkPreviewEntity;", "Lcom/truecaller/messaging/data/types/BinaryEntity;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public class LinkPreviewEntity extends com.truecaller.messaging.data.types.BinaryEntity {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.LinkPreviewEntity> CREATOR = new a11.bar(19);
    public final java.lang.String A;
    public final java.lang.String B;
    public final int C;
    public final boolean D;
    public final int w;
    public final int x;
    public final android.net.Uri y;
    public final java.lang.String z;

    public /* synthetic */ LinkPreviewEntity(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i) {
        this(-1L, str, 0, -1, -1, -1L, uri, str2, str3, str4);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final void c(android.content.ContentValues contentValues) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        contentValues.put("type", this.b);
        contentValues.put("entity_type", java.lang.Integer.valueOf(this.C));
        contentValues.put("entity_info1", this.i.toString());
        contentValues.put("entity_info2", java.lang.Integer.valueOf(this.w));
        contentValues.put("entity_info3", java.lang.Integer.valueOf(this.x));
        android.net.Uri uri = this.y;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        contentValues.put("entity_info5", str);
        contentValues.put("entity_info7", this.B);
        contentValues.put("entity_info4", this.z);
        contentValues.put("entity_info6", this.A);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: d, reason: from getter */
    public final int getC() {
        return this.C;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final boolean equals(java.lang.Object obj) {
        if (super.equals(obj) && (obj instanceof com.truecaller.messaging.data.types.LinkPreviewEntity)) {
            com.truecaller.messaging.data.types.LinkPreviewEntity linkPreviewEntity = (com.truecaller.messaging.data.types.LinkPreviewEntity) obj;
            if (kotlin.jvm.internal.Intrinsics.b(linkPreviewEntity.z, this.z) && kotlin.jvm.internal.Intrinsics.b(linkPreviewEntity.A, this.A) && kotlin.jvm.internal.Intrinsics.b(linkPreviewEntity.y, this.y) && kotlin.jvm.internal.Intrinsics.b(linkPreviewEntity.B, this.B)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    public final int hashCode() {
        int i;
        int e = ax1.bar.e(ax1.bar.e(super.hashCode() * 31, 31, this.z), 31, this.A);
        android.net.Uri uri = this.y;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            i = 0;
        }
        return this.B.hashCode() + ((e + i) * 31);
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity
    /* renamed from: j, reason: from getter */
    public final boolean getD() {
        return this.D;
    }

    @Override // com.truecaller.messaging.data.types.BinaryEntity, com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        android.net.Uri uri = this.y;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LinkPreviewEntity(long j, java.lang.String str, int i, int i2, int i3, long j2, android.net.Uri uri, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(i, 192, j, j2, r7, str, null, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "description");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "url");
        android.net.Uri parse = android.net.Uri.parse("");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        this.C = 7;
        this.D = true;
        this.w = i2;
        this.x = i3;
        this.y = uri;
        this.z = str2;
        this.A = str3;
        this.B = str4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkPreviewEntity(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "source");
        this.C = 7;
        this.D = true;
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = android.net.Uri.parse(parcel.readString());
        java.lang.String readString = parcel.readString();
        this.z = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        this.A = readString2 == null ? "" : readString2;
        java.lang.String readString3 = parcel.readString();
        this.B = readString3 != null ? readString3 : "";
    }
}
