package com.truecaller.messaging.transport.sms;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class SmsTransportInfo implements com.truecaller.messaging.data.types.TransportInfo {
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.transport.sms.SmsTransportInfo> CREATOR = new ks2.bar(15);
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final android.net.Uri e;
    public final java.lang.String f;
    public final int g;
    public final int h;
    public final java.lang.String i;
    public final int j;
    public final boolean k;
    public final java.lang.String l;

    public SmsTransportInfo(m42.f fVar) {
        this.a = fVar.a;
        this.b = fVar.b;
        this.c = fVar.c;
        this.d = fVar.d;
        this.e = fVar.e;
        this.g = fVar.f;
        this.h = fVar.g;
        this.i = fVar.h;
        this.f = fVar.k;
        this.j = fVar.i;
        this.k = fVar.j;
        this.l = fVar.l;
    }

    public static int b(int i) {
        if ((i & 1) == 0) {
            return 1;
        }
        if ((i & 8) != 0) {
            return 5;
        }
        if ((i & 4) != 0) {
            return 6;
        }
        return (i & 16) != 0 ? 3 : 2;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final long R0() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, m42.f] */
    public final m42.f a() {
        ?? obj = new java.lang.Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.g;
        obj.g = this.h;
        obj.h = this.i;
        obj.i = this.j;
        obj.j = this.k;
        obj.k = this.f;
        obj.l = this.l;
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
        if (obj != null && getClass() == obj.getClass()) {
            com.truecaller.messaging.transport.sms.SmsTransportInfo smsTransportInfo = (com.truecaller.messaging.transport.sms.SmsTransportInfo) obj;
            java.lang.String str = smsTransportInfo.i;
            java.lang.String str2 = smsTransportInfo.f;
            android.net.Uri uri = smsTransportInfo.e;
            if (this.a != smsTransportInfo.a || this.b != smsTransportInfo.b || this.c != smsTransportInfo.c || this.g != smsTransportInfo.g || this.h != smsTransportInfo.h || this.j != smsTransportInfo.j || this.k != smsTransportInfo.k) {
                return false;
            }
            android.net.Uri uri2 = this.e;
            if (uri2 == null ? uri != null : !uri2.equals(uri)) {
                return false;
            }
            java.lang.String str3 = this.f;
            if (str3 == null ? str2 != null : !str3.equals(str2)) {
                return false;
            }
            java.lang.String str4 = this.i;
            if (str4 != null) {
                return str4.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        long j = this.a;
        long j2 = this.b;
        int i3 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.c) * 31;
        int i4 = 0;
        android.net.Uri uri = this.e;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        java.lang.String str = this.f;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (((((i5 + i2) * 31) + this.g) * 31) + this.h) * 31;
        java.lang.String str2 = this.i;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return ((((i6 + i4) * 31) + this.j) * 31) + (this.k ? 1 : 0);
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final int j1() {
        return 0;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final int p() {
        int i = this.c;
        if (i != 0) {
            if (i != 32) {
                if (i != 64) {
                    return 0;
                }
                return 1;
            }
            return 2;
        }
        return 3;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final java.lang.String r1(org.joda.time.DateTime dateTime) {
        return com.truecaller.messaging.data.types.Message.d(this.b, dateTime);
    }

    public final java.lang.String toString() {
        return "{ type : sms, messageId: " + this.a + ", uri: \"" + java.lang.String.valueOf(this.e) + "\" }";
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
        android.net.Uri uri = this.e;
        if (uri == null) {
            parcel.writeString(null);
        } else {
            parcel.writeString(uri.toString());
        }
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.f);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeString(this.l);
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    /* renamed from: z1 */
    public final long getA() {
        return this.a;
    }

    public SmsTransportInfo(android.os.Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        java.lang.String readString = parcel.readString();
        if (android.text.TextUtils.isEmpty(readString)) {
            this.e = null;
        } else {
            this.e = android.net.Uri.parse(readString);
        }
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readString();
        this.f = parcel.readString();
        this.j = parcel.readInt();
        this.k = parcel.readInt() != 0;
        this.l = parcel.readString();
    }
}
