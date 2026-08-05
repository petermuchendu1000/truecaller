package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/TextEntity;", "Lcom/truecaller/messaging/data/types/Entity;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TextEntity extends com.truecaller.messaging.data.types.Entity {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.TextEntity> CREATOR = new a11.bar(26);
    public final java.lang.String i;
    public final boolean j;
    public final boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextEntity(long j, int i, boolean z, java.lang.String str, java.lang.String str2) {
        super(j, str, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "content");
        this.k = true;
        this.i = str2;
        this.j = z;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public final void c(android.content.ContentValues contentValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        contentValues.put("type", this.b);
        contentValues.put("entity_type", (java.lang.Integer) 0);
        byte[] bytes = kotlin.text.y.s(this.i, "\u0000", "", false).getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-8");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        contentValues.put("entity_info1", new java.lang.String(bytes, forName));
        contentValues.put("entity_info2", java.lang.Boolean.valueOf(this.j));
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: d */
    public final int getA() {
        return 0;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: e */
    public final boolean getS() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public final boolean equals(java.lang.Object obj) {
        if (super.equals(obj) && (obj instanceof com.truecaller.messaging.data.types.TextEntity)) {
            com.truecaller.messaging.data.types.TextEntity textEntity = (com.truecaller.messaging.data.types.TextEntity) obj;
            if (kotlin.jvm.internal.Intrinsics.b(this.i, textEntity.i) && this.j == textEntity.j) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: f */
    public final boolean getD() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: g */
    public final boolean getU() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: h */
    public final boolean getC() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public final int hashCode() {
        int i;
        int e = ax1.bar.e(super.hashCode() * 31, 31, this.i);
        if (this.j) {
            i = 1231;
        } else {
            i = 1237;
        }
        return e + i;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: i */
    public final boolean getA() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    public final boolean j() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: m */
    public final boolean getV() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: n */
    public final boolean getL() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: o, reason: from getter */
    public final boolean getK() {
        return this.k;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: r */
    public final boolean getA() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity
    /* renamed from: s */
    public final boolean getB() {
        return false;
    }

    @Override // com.truecaller.messaging.data.types.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
    }

    public TextEntity(android.os.Parcel parcel) {
        super(parcel);
        this.k = true;
        java.lang.String readString = parcel.readString();
        this.i = readString == null ? "" : readString;
        this.j = parcel.readInt() != 0;
    }
}
