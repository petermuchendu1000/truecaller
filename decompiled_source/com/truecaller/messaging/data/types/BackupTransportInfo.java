package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/BackupTransportInfo;", "Lcom/truecaller/messaging/data/types/TransportInfo;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BackupTransportInfo implements com.truecaller.messaging.data.types.TransportInfo {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.BackupTransportInfo> CREATOR = new a11.bar(10);
    public final long a;

    public BackupTransportInfo(long j) {
        this.a = j;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final long R0() {
        return 0L;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final long d0() {
        return 0L;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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
        return com.truecaller.messaging.data.types.Message.d(this.a, dateTime);
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final boolean u0() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeLong(this.a);
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    /* renamed from: z1, reason: from getter */
    public final long getA() {
        return this.a;
    }
}
