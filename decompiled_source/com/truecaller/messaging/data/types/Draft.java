package com.truecaller.messaging.data.types;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Draft implements android.os.Parcelable {
    public final long a;
    public final com.truecaller.messaging.data.types.Conversation b;
    public final java.lang.String c;
    public final boolean d;
    public final com.truecaller.data.entity.messaging.Participant[] e;
    public final com.truecaller.messaging.data.types.BinaryEntity[] f;
    public final boolean g;
    public final java.lang.String h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final com.truecaller.messaging.data.types.ReplySnippet l;
    public final int m;
    public final com.truecaller.messaging.data.types.ImForwardInfo n;
    public final int o;
    public final long p;
    public final int q;
    public final int r;
    public final com.truecaller.messaging.data.types.ModalFormResultSerialized s;
    public static final com.truecaller.messaging.data.types.BinaryEntity[] t = new com.truecaller.messaging.data.types.BinaryEntity[0];
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.Draft> CREATOR = new a11.bar(16);

    public Draft(c22.b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        java.lang.String str = bVar.d;
        this.c = str == null ? "" : str;
        this.d = bVar.e;
        java.util.HashSet hashSet = bVar.c;
        this.e = (com.truecaller.data.entity.messaging.Participant[]) hashSet.toArray(new com.truecaller.data.entity.messaging.Participant[hashSet.size()]);
        java.util.ArrayList arrayList = bVar.f;
        if (arrayList == null) {
            this.f = t;
        } else {
            this.f = (com.truecaller.messaging.data.types.BinaryEntity[]) arrayList.toArray(new com.truecaller.messaging.data.types.BinaryEntity[arrayList.size()]);
        }
        this.g = bVar.g;
        this.h = java.util.UUID.randomUUID().toString();
        this.l = bVar.i;
        this.i = bVar.h;
        this.j = bVar.j;
        this.k = bVar.k;
        this.m = bVar.l;
        this.n = bVar.m;
        this.o = bVar.n;
        this.p = bVar.o;
        this.q = bVar.p;
        this.r = bVar.q;
        this.s = bVar.r;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [e42.k, java.lang.Object] */
    public final com.truecaller.messaging.data.types.Message a(java.lang.String str, java.lang.String str2) {
        com.truecaller.messaging.transport.NullTransportInfo nullTransportInfo;
        c22.f fVar = new c22.f();
        long j = this.a;
        if (j != -1) {
            fVar.a = j;
        }
        com.truecaller.messaging.data.types.Conversation conversation = this.b;
        if (conversation != null) {
            fVar.b = conversation.a;
        }
        fVar.h = this.j;
        fVar.i = true;
        fVar.j = false;
        fVar.e = new org.joda.time.DateTime();
        fVar.d = new org.joda.time.DateTime();
        com.truecaller.data.entity.messaging.Participant[] participantArr = this.e;
        fVar.c = participantArr[0];
        fVar.g(str);
        fVar.s = this.h;
        fVar.t = str2;
        fVar.g = 3;
        fVar.q = this.g;
        fVar.r = participantArr[0].d;
        fVar.u = 2;
        fVar.A = this.i;
        fVar.O = this.n;
        fVar.M = this.k;
        fVar.P = this.o;
        fVar.X = this.s;
        fVar.Q = this.p;
        fVar.U = this.r;
        if (j != -1) {
            ?? obj = new java.lang.Object();
            obj.a = j;
            nullTransportInfo = new com.truecaller.messaging.transport.NullTransportInfo((e42.k) obj);
        } else {
            nullTransportInfo = com.truecaller.messaging.transport.NullTransportInfo.b;
        }
        fVar.k = 3;
        fVar.n = nullTransportInfo;
        for (com.truecaller.messaging.data.types.BinaryEntity binaryEntity : this.f) {
            fVar.f(binaryEntity);
        }
        if (!android.text.TextUtils.isEmpty(this.c) || c()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("text/plain", "type");
            java.lang.String str3 = this.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "content");
            fVar.f(b91.d.l(-1L, "text/plain", 0, str3, this.d, 0, 0, 0, 0L, null, null, null, null, 0, null, null, 0.0d, 0.0d, 0, null, 1048544));
        }
        return fVar.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, c22.b] */
    public final c22.b b() {
        ?? obj = new java.lang.Object();
        obj.a = -1L;
        java.util.HashSet hashSet = new java.util.HashSet();
        obj.c = hashSet;
        obj.g = false;
        obj.h = -1L;
        obj.j = true;
        obj.k = false;
        obj.l = 3;
        obj.o = -1L;
        obj.p = 3;
        obj.a = this.a;
        obj.b = this.b;
        obj.d = this.c;
        obj.e = this.d;
        java.util.Collections.addAll(hashSet, this.e);
        com.truecaller.messaging.data.types.BinaryEntity[] binaryEntityArr = this.f;
        if (binaryEntityArr.length > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(binaryEntityArr.length);
            obj.f = arrayList;
            java.util.Collections.addAll(arrayList, binaryEntityArr);
        }
        obj.g = this.g;
        obj.i = this.l;
        obj.h = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.m;
        obj.m = this.n;
        obj.n = this.o;
        obj.o = this.p;
        obj.p = this.q;
        obj.q = this.r;
        obj.r = this.s;
        return obj;
    }

    public final boolean c() {
        if (this.p != -1) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (jj3.bar.i(this.c) && this.f.length == 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        if (this.i != -1) {
            return true;
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Draft{messageId=");
        sb.append(this.a);
        sb.append(", conversation=");
        sb.append(this.b);
        sb.append(", participants=");
        sb.append(java.util.Arrays.toString(this.e));
        sb.append(", hiddenNumber=");
        return h0.b.R(sb, this.g, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeTypedArray(this.e, i);
        parcel.writeParcelableArray(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.l, i);
        parcel.writeLong(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.m);
        parcel.writeParcelable(this.n, i);
        parcel.writeInt(this.o);
        parcel.writeLong(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeParcelable(this.s, i);
    }

    public Draft(android.os.Parcel parcel) {
        this.a = parcel.readLong();
        this.b = (com.truecaller.messaging.data.types.Conversation) parcel.readParcelable(com.truecaller.messaging.data.types.Conversation.class.getClassLoader());
        this.c = parcel.readString();
        this.d = parcel.readInt() != 0;
        this.e = (com.truecaller.data.entity.messaging.Participant[]) parcel.createTypedArray(com.truecaller.data.entity.messaging.Participant.CREATOR);
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.truecaller.messaging.data.types.Entity.class.getClassLoader());
        this.f = new com.truecaller.messaging.data.types.BinaryEntity[readParcelableArray.length];
        int i = 0;
        while (true) {
            com.truecaller.messaging.data.types.BinaryEntity[] binaryEntityArr = this.f;
            if (i >= binaryEntityArr.length) {
                break;
            }
            binaryEntityArr[i] = (com.truecaller.messaging.data.types.BinaryEntity) readParcelableArray[i];
            i++;
        }
        this.g = parcel.readInt() != 0;
        this.h = parcel.readString();
        this.l = (com.truecaller.messaging.data.types.ReplySnippet) parcel.readParcelable(com.truecaller.messaging.data.types.ReplySnippet.class.getClassLoader());
        this.i = parcel.readLong();
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.m = parcel.readInt();
        this.n = (com.truecaller.messaging.data.types.ImForwardInfo) parcel.readParcelable(com.truecaller.messaging.data.types.ImForwardInfo.class.getClassLoader());
        this.o = parcel.readInt();
        this.p = parcel.readLong();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = (com.truecaller.messaging.data.types.ModalFormResultSerialized) parcel.readParcelable(com.truecaller.messaging.data.types.ModalFormResultSerialized.class.getClassLoader());
    }
}
