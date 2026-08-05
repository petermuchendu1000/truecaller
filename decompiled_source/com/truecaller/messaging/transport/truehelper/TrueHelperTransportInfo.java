package com.truecaller.messaging.transport.truehelper;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/transport/truehelper/TrueHelperTransportInfo;", "Lcom/truecaller/messaging/data/types/TransportInfo;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class TrueHelperTransportInfo implements com.truecaller.messaging.data.types.TransportInfo {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.transport.truehelper.TrueHelperTransportInfo> CREATOR = new ks2.bar(18);
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;

    public TrueHelperTransportInfo(int i, java.lang.String str, java.lang.String str2, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "rawId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "role");
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final long R0() {
        return -1L;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final long d0() {
        return -1L;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.messaging.transport.truehelper.TrueHelperTransportInfo)) {
            return false;
        }
        com.truecaller.messaging.transport.truehelper.TrueHelperTransportInfo trueHelperTransportInfo = (com.truecaller.messaging.transport.truehelper.TrueHelperTransportInfo) obj;
        return this.a == trueHelperTransportInfo.a && kotlin.jvm.internal.Intrinsics.b(this.b, trueHelperTransportInfo.b) && kotlin.jvm.internal.Intrinsics.b(this.c, trueHelperTransportInfo.c) && this.d == trueHelperTransportInfo.d;
    }

    public final int hashCode() {
        long j = this.a;
        return ax1.bar.e(ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.b), 31, this.c) + this.d;
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "date");
        return this.b;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("TrueHelperTransportInfo(messageId=", this.a, ", rawId=", this.b);
        p.append(", role=");
        p.append(this.c);
        p.append(", errorCode=");
        p.append(this.d);
        p.append(")");
        return p.toString();
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final boolean u0() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    /* renamed from: z1, reason: from getter */
    public final long getA() {
        return this.a;
    }

    public /* synthetic */ TrueHelperTransportInfo(int i, java.lang.String str, int i2, java.lang.String str2, long j) {
        this(0, str, str2, (i & 1) != 0 ? -1L : j);
    }
}
