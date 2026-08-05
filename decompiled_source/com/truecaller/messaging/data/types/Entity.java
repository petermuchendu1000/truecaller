package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/truecaller/messaging/data/types/Entity;", "Landroid/os/Parcelable;", "b91/d", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class Entity implements android.os.Parcelable {
    public static final java.lang.String[] d = {"text/x-vcard", "text/vcard", "text/directory", "text/directory; profile=vcard"};
    public static final java.lang.String[] e = {"image/gif", "image/jpeg", "image/jpg", "image/png"};
    public static final java.lang.String[] f = {"image/gif", "image/jpeg", "image/jpg", "image/png", "image/heif", "image/bmp", "image/x-ico", "image/webp"};
    public static final java.lang.String[] g = {"video/3gpp", "video/mp4"};
    public static final java.lang.String[] h = {"application/vnd.truecaller.linkpreview", "application/vnd.truecaller.linkpreview.media", "application/vnd.truecaller.linkpreview.playable"};
    public final long a;
    public final java.lang.String b;
    public final int c;

    public Entity(long j, java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public static final com.truecaller.messaging.data.types.Entity a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("text/plain", "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "content");
        return b91.d.l(-1L, "text/plain", 0, str, false, 0, 0, 0, 0L, null, null, null, null, 0, null, null, 0.0d, 0.0d, 0, null, 1048560);
    }

    public static final com.truecaller.messaging.data.types.BinaryEntity b(java.lang.String str, android.net.Uri uri, int i, int i2, int i3, long j, android.net.Uri uri2, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "content");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri2, "thumbnail");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "fileName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "vCardName");
        return b91.d.m(-1L, str, 0, uri, i, i2, i3, j, false, uri2, str2, str3, str4, i4, null, 0.0d, 0.0d, 245760);
    }

    public abstract void c(android.content.ContentValues contentValues);

    /* renamed from: d */
    public abstract int getZ();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract boolean getS();

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.truecaller.messaging.data.types.Entity) {
            com.truecaller.messaging.data.types.Entity entity = (com.truecaller.messaging.data.types.Entity) obj;
            if (this.a == entity.a && kotlin.jvm.internal.Intrinsics.b(this.b, entity.b) && this.c == entity.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public abstract boolean getD();

    /* renamed from: g */
    public abstract boolean getU();

    /* renamed from: h */
    public abstract boolean getC();

    public int hashCode() {
        return this.b.hashCode() + (((int) this.a) * 31) + this.c;
    }

    /* renamed from: i */
    public abstract boolean getA();

    public abstract boolean j();

    /* renamed from: m */
    public abstract boolean getV();

    /* renamed from: n */
    public abstract boolean getL();

    public abstract boolean o();

    /* renamed from: r */
    public abstract boolean getA();

    /* renamed from: s */
    public abstract boolean getQ();

    public final java.lang.String toString() {
        return t.c.q(com.appsflyer.internal.e.p("{ id : ", this.a, ", type: ", this.b), ", status : ", this.c, " }");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }

    public Entity(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "source");
        this.a = parcel.readLong();
        java.lang.String readString = parcel.readString();
        this.b = readString == null ? "" : readString;
        this.c = parcel.readInt();
    }
}
