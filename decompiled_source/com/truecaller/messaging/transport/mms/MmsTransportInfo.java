package com.truecaller.messaging.transport.mms;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MmsTransportInfo implements com.truecaller.messaging.data.types.TransportInfo {
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.transport.mms.MmsTransportInfo> CREATOR = new hn.bar(25);
    public final int A;
    public final int B;
    public final boolean C;
    public final boolean D;
    public final android.util.SparseArray E;
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final android.net.Uri e;
    public final int f;
    public final int g;
    public final java.lang.String h;
    public final int i;
    public final java.lang.String j;
    public final int k;
    public final android.net.Uri l;
    public final java.lang.String m;
    public final int n;
    public final java.lang.String o;
    public final org.joda.time.DateTime p;
    public final int q;
    public final int r;
    public final int s;
    public final java.lang.String t;
    public final java.lang.String u;
    public final java.lang.String v;
    public final int w;
    public final int x;
    public final int y;
    public final long z;

    public MmsTransportInfo(k42.j jVar) {
        this.a = jVar.a;
        this.b = jVar.b;
        this.c = jVar.c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f = jVar.f;
        this.h = jVar.g;
        this.i = jVar.h;
        this.j = jVar.i;
        this.k = jVar.j;
        this.l = jVar.k;
        java.lang.String str = jVar.p;
        this.o = str == null ? "" : str;
        org.joda.time.DateTime dateTime = jVar.q;
        this.p = dateTime == null ? new org.joda.time.DateTime(0L) : dateTime;
        this.q = jVar.r;
        this.r = jVar.s;
        this.s = jVar.t;
        java.lang.String str2 = jVar.u;
        this.v = str2 == null ? "" : str2;
        this.w = jVar.v;
        this.g = jVar.w;
        this.x = jVar.x;
        this.y = jVar.y;
        this.z = jVar.z;
        java.lang.String str3 = jVar.l;
        this.m = str3 == null ? "" : str3;
        this.n = jVar.m;
        this.t = jVar.n;
        java.lang.String str4 = jVar.o;
        this.u = str4 != null ? str4 : "";
        this.A = jVar.A;
        this.B = jVar.B;
        this.C = jVar.C;
        this.D = jVar.D;
        this.E = jVar.E;
    }

    public static int b(int i, int i2, int i3) {
        if (i == 1) {
            return i2 == 130 ? 4 : 0;
        }
        if (i == 2) {
            return (i3 == 0 || i3 == 128) ? 1 : 9;
        }
        if (i != 4) {
            return i != 5 ? 0 : 9;
        }
        return 5;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final long R0() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k42.j, java.lang.Object] */
    public final k42.j a() {
        ?? obj = new java.lang.Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.h;
        obj.h = this.i;
        obj.i = this.j;
        obj.j = this.k;
        obj.k = this.l;
        obj.l = this.m;
        obj.m = this.n;
        obj.n = this.t;
        obj.o = this.u;
        obj.p = this.o;
        obj.q = this.p;
        obj.r = this.q;
        obj.s = this.r;
        obj.t = this.s;
        obj.u = this.v;
        obj.v = this.w;
        obj.w = this.g;
        obj.x = this.x;
        obj.y = this.y;
        obj.z = this.z;
        obj.A = this.A;
        obj.B = this.B;
        obj.C = this.C;
        obj.D = this.D;
        obj.E = this.E;
        return obj;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final long d0() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.truecaller.messaging.transport.mms.MmsTransportInfo.class != obj.getClass()) {
            return false;
        }
        com.truecaller.messaging.transport.mms.MmsTransportInfo mmsTransportInfo = (com.truecaller.messaging.transport.mms.MmsTransportInfo) obj;
        android.net.Uri uri = mmsTransportInfo.l;
        java.lang.String str = mmsTransportInfo.j;
        java.lang.String str2 = mmsTransportInfo.h;
        android.net.Uri uri2 = mmsTransportInfo.e;
        if (this.a != mmsTransportInfo.a || this.b != mmsTransportInfo.b || this.c != mmsTransportInfo.c || this.f != mmsTransportInfo.f || this.g != mmsTransportInfo.g || this.i != mmsTransportInfo.i || this.k != mmsTransportInfo.k || this.n != mmsTransportInfo.n || this.q != mmsTransportInfo.q || this.r != mmsTransportInfo.r || this.s != mmsTransportInfo.s || this.w != mmsTransportInfo.w || this.x != mmsTransportInfo.x || this.y != mmsTransportInfo.y || this.z != mmsTransportInfo.z || this.A != mmsTransportInfo.A || this.B != mmsTransportInfo.B || this.C != mmsTransportInfo.C || this.D != mmsTransportInfo.D) {
            return false;
        }
        android.net.Uri uri3 = this.e;
        if (uri3 == null ? uri2 != null : !uri3.equals(uri2)) {
            return false;
        }
        java.lang.String str3 = this.h;
        if (str3 == null ? str2 != null : !str3.equals(str2)) {
            return false;
        }
        java.lang.String str4 = this.j;
        if (str4 == null ? str != null : !str4.equals(str)) {
            return false;
        }
        android.net.Uri uri4 = this.l;
        if (uri4 == null ? uri != null : !uri4.equals(uri)) {
            return false;
        }
        if (this.m.equals(mmsTransportInfo.m) && this.o.equals(mmsTransportInfo.o) && this.p.equals(mmsTransportInfo.p) && jj3.bar.f(this.t, mmsTransportInfo.t) && this.u.equals(mmsTransportInfo.u) && jj3.bar.f(this.v, mmsTransportInfo.v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        long j = this.a;
        long j2 = this.b;
        int i5 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.c) * 31;
        int i6 = 0;
        android.net.Uri uri = this.e;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            i = 0;
        }
        int i7 = (((((i5 + i) * 31) + this.f) * 31) + this.g) * 31;
        java.lang.String str = this.h;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (((i7 + i2) * 31) + this.i) * 31;
        java.lang.String str2 = this.j;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (((i8 + i3) * 31) + this.k) * 31;
        android.net.Uri uri2 = this.l;
        if (uri2 != null) {
            i4 = uri2.hashCode();
        } else {
            i4 = 0;
        }
        int w = (((((ro0.f.w(this.p, ax1.bar.e((ax1.bar.e((i9 + i4) * 31, 31, this.m) + this.n) * 31, 31, this.o), 31) + this.q) * 31) + this.r) * 31) + this.s) * 31;
        java.lang.String str3 = this.t;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        int e = (((((ax1.bar.e(ax1.bar.e((w + i6) * 31, 31, this.u), 31, this.v) + this.w) * 31) + this.x) * 31) + this.y) * 31;
        long j3 = this.z;
        return ((((((((e + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.A) * 31) + this.B) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0);
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    /* renamed from: j1 */
    public final int getE() {
        return 0;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    /* renamed from: p */
    public final int getD() {
        return 0;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final java.lang.String r1(org.joda.time.DateTime dateTime) {
        return com.truecaller.messaging.data.types.Message.d(this.b, dateTime);
    }

    public final java.lang.String toString() {
        return "{ type : mms, messageId: " + this.a + ", uri: \"" + java.lang.String.valueOf(this.e) + "\" }";
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final boolean u0() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeParcelable(this.e, 0);
        parcel.writeInt(this.f);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeParcelable(this.l, 0);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeString(this.o);
        parcel.writeLong(this.p.i());
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.g);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeLong(this.z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    /* renamed from: z1 */
    public final long getA() {
        return this.a;
    }

    public MmsTransportInfo(android.os.Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.e = (android.net.Uri) parcel.readParcelable(android.net.Uri.class.getClassLoader());
        this.f = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = parcel.readInt();
        this.l = (android.net.Uri) parcel.readParcelable(android.net.Uri.class.getClassLoader());
        this.m = parcel.readString();
        this.n = parcel.readInt();
        this.o = parcel.readString();
        this.p = new org.joda.time.DateTime(parcel.readLong());
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readString();
        this.u = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readInt();
        this.g = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readLong();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt() != 0;
        this.D = parcel.readInt() != 0;
        this.E = null;
    }
}
