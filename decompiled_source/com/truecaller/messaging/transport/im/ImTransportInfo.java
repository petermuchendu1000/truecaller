package com.truecaller.messaging.transport.im;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/truecaller/messaging/transport/im/ImTransportInfo;", "Lcom/truecaller/messaging/data/types/TransportInfo;", "f42/t0", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ImTransportInfo implements com.truecaller.messaging.data.types.TransportInfo {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.transport.im.ImTransportInfo> CREATOR = new f22.bar(2);
    public final long a;
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final com.truecaller.messaging.data.types.Reaction[] k;
    public final long l;
    public final int m;
    public final int n;
    public final java.lang.String o;
    public final com.truecaller.messaging.data.types.QuickAction[] p;
    public final int q;
    public final int r;
    public final int s;
    public final com.truecaller.data.entity.messaging.Participant t;

    public ImTransportInfo(long j, java.lang.String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j2, com.truecaller.messaging.data.types.Reaction[] reactionArr, long j3, int i8, int i9, java.lang.String str2, com.truecaller.messaging.data.types.QuickAction[] quickActionArr, int i10, int i11, int i13, com.truecaller.data.entity.messaging.Participant participant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "rawId");
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = j2;
        this.k = reactionArr;
        this.l = j3;
        this.m = i8;
        this.n = i9;
        this.o = str2;
        this.p = quickActionArr;
        this.q = i10;
        this.r = i11;
        this.s = i13;
        this.t = participant;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final long R0() {
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f42.t0, java.lang.Object] */
    public final f42.t0 a() {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "info");
        ?? obj = new java.lang.Object();
        obj.b = "";
        obj.h = -1;
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.s;
        obj.i = this.h;
        obj.j = this.i;
        obj.k = this.j;
        java.util.ArrayList arrayList2 = null;
        com.truecaller.messaging.data.types.Reaction[] reactionArr = this.k;
        if (reactionArr != null) {
            arrayList = kotlin.collections.v.k0(reactionArr);
        } else {
            arrayList = null;
        }
        obj.l = arrayList;
        obj.m = this.o;
        com.truecaller.messaging.data.types.QuickAction[] quickActionArr = this.p;
        if (quickActionArr != null) {
            arrayList2 = kotlin.collections.v.k0(quickActionArr);
        }
        obj.n = arrayList2;
        obj.o = this.q;
        obj.p = this.r;
        return obj;
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
    /* renamed from: j1, reason: from getter */
    public final int getE() {
        return this.e;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    /* renamed from: p, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final java.lang.String r1(org.joda.time.DateTime dateTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "date");
        return this.b;
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    public final boolean u0() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeLong(this.j);
        com.truecaller.messaging.data.types.Reaction[] reactionArr = this.k;
        if (reactionArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            int length = reactionArr.length;
            parcel.writeInt(length);
            for (int i2 = 0; i2 != length; i2++) {
                reactionArr[i2].writeToParcel(parcel, i);
            }
        }
        parcel.writeLong(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeString(this.o);
        com.truecaller.messaging.data.types.QuickAction[] quickActionArr = this.p;
        if (quickActionArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            int length2 = quickActionArr.length;
            parcel.writeInt(length2);
            for (int i3 = 0; i3 != length2; i3++) {
                parcel.writeParcelable(quickActionArr[i3], i);
            }
        }
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeParcelable(this.t, i);
    }

    @Override // com.truecaller.messaging.data.types.TransportInfo
    /* renamed from: z1, reason: from getter */
    public final long getA() {
        return this.a;
    }
}
