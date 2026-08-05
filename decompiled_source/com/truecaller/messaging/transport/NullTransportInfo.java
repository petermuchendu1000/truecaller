package com.truecaller.messaging.transport;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class NullTransportInfo implements com.truecaller.messaging.data.types.TransportInfo {
    public final long a;
    public static final com.truecaller.messaging.transport.NullTransportInfo b = new com.truecaller.messaging.transport.NullTransportInfo();
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.transport.NullTransportInfo> CREATOR = new cb1.bar(20);

    public NullTransportInfo() {
        this.a = -1L;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final long R0() {
        return -1L;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final long d0() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.a == ((com.truecaller.messaging.transport.NullTransportInfo) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final int j1() {
        return 0;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final int p() {
        return 0;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final java.lang.String r1(org.joda.time.DateTime dateTime) {
        return "";
    }

    public final java.lang.String toString() {
        return bar.n(this.a, " }", new java.lang.StringBuilder("{ type : null, messageId: "));
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final boolean u0() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.a);
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final long z1() {
        return this.a;
    }

    public NullTransportInfo(e42.k kVar) {
        this.a = kVar.a;
    }

    public NullTransportInfo(android.os.Parcel parcel) {
        this.a = parcel.readLong();
    }
}
