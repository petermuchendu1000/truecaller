package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/Reaction;", "Landroid/os/Parcelable;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class Reaction implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.Reaction> CREATOR = new a11.bar(24);
    public final long a;
    public final long b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final long e;
    public final int f;
    public final long g;
    public final java.lang.String h;

    public Reaction(long j, long j2, java.lang.String str, java.lang.String str2, long j3, int i, long j4, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "fromPeerId");
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
        this.f = i;
        this.g = j4;
        this.h = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.messaging.data.types.Reaction)) {
            return false;
        }
        com.truecaller.messaging.data.types.Reaction reaction = (com.truecaller.messaging.data.types.Reaction) obj;
        return this.a == reaction.a && this.b == reaction.b && kotlin.jvm.internal.Intrinsics.b(this.c, reaction.c) && kotlin.jvm.internal.Intrinsics.b(this.d, reaction.d) && this.e == reaction.e && this.f == reaction.f && this.g == reaction.g && kotlin.jvm.internal.Intrinsics.b(this.h, reaction.h);
    }

    public final int hashCode() {
        int hashCode;
        long j = this.a;
        long j2 = this.b;
        int e = ax1.bar.e(((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.c);
        int i = 0;
        java.lang.String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        long j3 = this.e;
        int i3 = (((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f) * 31;
        long j4 = this.g;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        java.lang.String str2 = this.h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i4 + i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder T = h0.b.T(this.a, "Reaction(id=", ", messageId=");
        ro0.f.K(T, this.b, ", fromPeerId=", this.c);
        li.qux.C(", emoji=", this.d, ", date=", T);
        h8.s0.y(this.f, this.e, ", status=", T);
        ro0.f.L(T, ", conversaitonId=", this.g, ", groupName=");
        return bar.v(this.h, ")", T);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.f);
        parcel.writeLong(this.g);
        parcel.writeString(this.h);
    }

    public /* synthetic */ Reaction(int i, java.lang.String str, long j, java.lang.String str2, long j2, int i2) {
        this(-1L, (i2 & 2) != 0 ? -1L : j, str, str2, j2, i, -1L, null);
    }
}
