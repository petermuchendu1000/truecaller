package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u0007J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006)"}, d2 = {"Lcom/truecaller/messaging/data/types/Mention;", "Landroid/os/Parcelable;", "id", "", "imId", "", "offset", "", "length", "privateName", "publicName", "<init>", "(JLjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getImId", "()Ljava/lang/String;", "getOffset", "()I", "getLength", "getPrivateName", "getPublicName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class Mention implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.Mention> CREATOR = new a11.bar(20);
    private final long id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String imId;
    private final int length;
    private final int offset;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String privateName;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String publicName;

    public Mention(long j, @org.jetbrains.annotations.NotNull java.lang.String str, int i, int i2, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "imId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "privateName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "publicName");
        this.id = j;
        this.imId = str;
        this.offset = i;
        this.length = i2;
        this.privateName = str2;
        this.publicName = str3;
    }

    public static /* synthetic */ com.truecaller.messaging.data.types.Mention copy$default(com.truecaller.messaging.data.types.Mention mention, long j, java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            j = mention.id;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            str = mention.imId;
        }
        java.lang.String str4 = str;
        if ((i3 & 4) != 0) {
            i = mention.offset;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = mention.length;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str2 = mention.privateName;
        }
        java.lang.String str5 = str2;
        if ((i3 & 32) != 0) {
            str3 = mention.publicName;
        }
        return mention.copy(j2, str4, i4, i5, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getImId() {
        return this.imId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getPrivateName() {
        return this.privateName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getPublicName() {
        return this.publicName;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.data.types.Mention copy(long id, @org.jetbrains.annotations.NotNull java.lang.String imId, int offset, int length, @org.jetbrains.annotations.NotNull java.lang.String privateName, @org.jetbrains.annotations.NotNull java.lang.String publicName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imId, "imId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privateName, "privateName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicName, "publicName");
        return new com.truecaller.messaging.data.types.Mention(id, imId, offset, length, privateName, publicName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.messaging.data.types.Mention)) {
            return false;
        }
        com.truecaller.messaging.data.types.Mention mention = (com.truecaller.messaging.data.types.Mention) other;
        return this.id == mention.id && kotlin.jvm.internal.Intrinsics.b(this.imId, mention.imId) && this.offset == mention.offset && this.length == mention.length && kotlin.jvm.internal.Intrinsics.b(this.privateName, mention.privateName) && kotlin.jvm.internal.Intrinsics.b(this.publicName, mention.publicName);
    }

    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImId() {
        return this.imId;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getOffset() {
        return this.offset;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrivateName() {
        return this.privateName;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPublicName() {
        return this.publicName;
    }

    public int hashCode() {
        long j = this.id;
        return this.publicName.hashCode() + ax1.bar.e((((ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.imId) + this.offset) * 31) + this.length) * 31, 31, this.privateName);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.id;
        java.lang.String str = this.imId;
        int i = this.offset;
        int i2 = this.length;
        java.lang.String str2 = this.privateName;
        java.lang.String str3 = this.publicName;
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("Mention(id=", j, ", imId=", str);
        h8.s0.x(i, i2, ", offset=", ", length=", p);
        bar.E(p, ", privateName=", str2, ", publicName=", str3);
        p.append(")");
        return p.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.imId);
        dest.writeInt(this.offset);
        dest.writeInt(this.length);
        dest.writeString(this.privateName);
        dest.writeString(this.publicName);
    }

    public /* synthetic */ Mention(long j, java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1L : j, str, i, i2, str2, str3);
    }
}
