package com.truecaller.messaging.data.types;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Message implements android.os.Parcelable, c22.qux {
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.Message> CREATOR = new a11.bar(21);
    public final java.lang.String A;
    public final boolean B;
    public final long C;
    public final long D;
    public final int E;
    public final int F;
    public final long G;
    public final long H;
    public final long I;
    public final long J;
    public final boolean K;
    public final boolean L;
    public final com.truecaller.data.entity.messaging.FraudReportType M;
    public final org.joda.time.DateTime N;
    public final com.truecaller.messaging.data.types.ImForwardInfo O;
    public final int P;
    public final long Q;
    public final long R;
    public final com.truecaller.data.entity.InsightsPdo S;
    public final long T;
    public final int U;
    public final java.lang.String V;
    public final java.lang.String W;
    public final com.truecaller.messaging.data.types.ModalFormResultSerialized X;
    public final long a;
    public final long b;
    public final com.truecaller.data.entity.messaging.Participant c;
    public final org.joda.time.DateTime d;
    public final org.joda.time.DateTime e;
    public final org.joda.time.DateTime f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int l;
    public final java.lang.String m;
    public final com.truecaller.messaging.data.types.TransportInfo n;
    public final com.truecaller.messaging.data.types.Entity[] o;
    public final com.truecaller.messaging.data.types.Mention[] p;
    public final java.lang.String q;
    public final java.lang.String r;
    public final java.lang.String s;
    public final int t;
    public final int u;
    public final int v;
    public final java.lang.String w;
    public final int x;
    public final org.joda.time.DateTime y;
    public final com.truecaller.messaging.data.types.ReplySnippet z;

    public Message(c22.f fVar) {
        this.a = fVar.a;
        this.b = fVar.b;
        this.c = fVar.c;
        org.joda.time.DateTime dateTime = fVar.e;
        this.e = dateTime == null ? new org.joda.time.DateTime(0L) : dateTime;
        org.joda.time.DateTime dateTime2 = fVar.d;
        this.d = dateTime2 == null ? new org.joda.time.DateTime(0L) : dateTime2;
        org.joda.time.DateTime dateTime3 = fVar.f;
        this.f = dateTime3 == null ? new org.joda.time.DateTime(0L) : dateTime3;
        this.g = fVar.g;
        this.h = fVar.h;
        this.i = fVar.i;
        this.j = fVar.j;
        this.k = fVar.k;
        this.n = fVar.n;
        this.l = fVar.l;
        this.m = fVar.m;
        this.q = fVar.s;
        this.r = fVar.t;
        this.B = fVar.q;
        this.s = fVar.r;
        this.t = fVar.u;
        this.u = fVar.v;
        this.v = fVar.w;
        this.w = fVar.x;
        this.x = fVar.y;
        org.joda.time.DateTime dateTime4 = fVar.z;
        this.y = dateTime4 == null ? new org.joda.time.DateTime(0L) : dateTime4;
        this.C = fVar.A;
        this.z = fVar.B;
        this.D = fVar.D;
        this.E = fVar.E;
        this.F = fVar.F;
        this.G = fVar.G;
        this.H = fVar.H;
        this.I = fVar.I;
        this.J = fVar.J;
        this.L = fVar.K;
        this.M = fVar.L;
        this.K = fVar.M;
        org.joda.time.DateTime dateTime5 = fVar.N;
        this.N = dateTime5 == null ? new org.joda.time.DateTime(0L) : dateTime5;
        this.A = fVar.C;
        java.util.ArrayList arrayList = fVar.o;
        if (arrayList == null) {
            this.o = new com.truecaller.messaging.data.types.Entity[0];
        } else {
            this.o = (com.truecaller.messaging.data.types.Entity[]) arrayList.toArray(new com.truecaller.messaging.data.types.Entity[arrayList.size()]);
        }
        this.O = fVar.O;
        this.P = fVar.P;
        this.R = fVar.Q;
        this.Q = fVar.R;
        this.S = fVar.S;
        java.util.HashSet hashSet = fVar.p;
        this.p = (com.truecaller.messaging.data.types.Mention[]) hashSet.toArray(new com.truecaller.messaging.data.types.Mention[hashSet.size()]);
        this.T = fVar.T;
        this.U = fVar.U;
        this.V = fVar.V;
        this.W = fVar.W;
        this.X = fVar.X;
    }

    public static java.lang.String d(long j, org.joda.time.DateTime dateTime) {
        return jj3.bar.o('0', java.lang.Long.toHexString(j)) + jj3.bar.o('0', java.lang.Long.toHexString(dateTime.i()));
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (com.truecaller.messaging.data.types.Entity entity : this.o) {
            if (entity.getK()) {
                com.truecaller.messaging.data.types.TextEntity textEntity = (com.truecaller.messaging.data.types.TextEntity) entity;
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(textEntity.i);
            } else if (entity.getL()) {
                com.truecaller.messaging.data.types.RCSEntity rCSEntity = (com.truecaller.messaging.data.types.RCSEntity) entity;
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(rCSEntity.i);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c22.f, java.lang.Object] */
    public final c22.f b() {
        ?? obj = new java.lang.Object();
        obj.a = -1L;
        obj.b = -1L;
        obj.k = 3;
        obj.l = 3;
        obj.m = "-1";
        obj.n = com.truecaller.messaging.transport.NullTransportInfo.b;
        java.util.HashSet hashSet = new java.util.HashSet();
        obj.p = hashSet;
        obj.q = false;
        obj.A = -1L;
        obj.L = com.truecaller.data.entity.messaging.FraudReportType.NONE;
        obj.P = 0;
        obj.Q = -1L;
        obj.T = -1L;
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.e = this.e;
        obj.d = this.d;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        obj.n = this.n;
        obj.m = this.m;
        com.truecaller.messaging.data.types.Entity[] entityArr = this.o;
        if (entityArr.length > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            obj.o = arrayList;
            java.util.Collections.addAll(arrayList, entityArr);
        }
        obj.r = this.s;
        obj.q = this.B;
        obj.u = this.t;
        obj.v = this.u;
        obj.w = this.v;
        obj.x = this.w;
        obj.y = this.x;
        obj.z = this.y;
        obj.A = this.C;
        obj.s = this.q;
        obj.t = this.r;
        obj.B = this.z;
        obj.D = this.D;
        obj.E = this.E;
        obj.F = this.F;
        obj.G = this.G;
        obj.H = this.H;
        obj.K = this.L;
        obj.L = this.M;
        obj.M = this.K;
        obj.N = this.N;
        obj.O = this.O;
        obj.P = this.P;
        obj.Q = this.R;
        obj.R = this.Q;
        obj.S = this.S;
        java.util.Collections.addAll(hashSet, this.p);
        obj.T = this.T;
        obj.U = this.U;
        obj.V = this.V;
        obj.W = this.W;
        obj.X = this.X;
        return obj;
    }

    public final boolean c() {
        for (com.truecaller.messaging.data.types.Entity entity : this.o) {
            if (!entity.getK() && !entity.getV() && entity.c == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        for (com.truecaller.messaging.data.types.Entity entity : this.o) {
            if (entity.getL()) {
                return ((com.truecaller.messaging.data.types.RCSEntity) entity).j;
            }
        }
        return -1;
    }

    public final boolean equals(java.lang.Object obj) {
        com.truecaller.data.entity.messaging.FraudReportType fraudReportType;
        com.truecaller.data.entity.messaging.FraudReportType fraudReportType2;
        if (this == obj) {
            return true;
        }
        if (obj == null || com.truecaller.messaging.data.types.Message.class != obj.getClass()) {
            return false;
        }
        com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) obj;
        if (this.a != message.a || this.b != message.b || this.g != message.g || this.h != message.h || this.i != message.i || this.j != message.j || this.k != message.k || this.l != message.l || !this.c.equals(message.c) || !this.d.equals(message.d) || !this.e.equals(message.e) || !this.n.equals(message.n) || !this.m.equals(message.m) || this.x != message.x || !this.y.equals(message.y) || this.C != message.C || this.D != message.D || this.L != message.L || (fraudReportType2 = this.M) != (fraudReportType = message.M) || fraudReportType2 != fraudReportType || this.K != message.K) {
            return false;
        }
        return java.util.Arrays.equals(this.o, message.o);
    }

    public final boolean f() {
        if (this.o.length != 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (this.a != -1) {
            return true;
        }
        return false;
    }

    @Override // c22.qux
    public final long getId() {
        return this.a;
    }

    public final boolean h() {
        for (com.truecaller.messaging.data.types.Entity entity : this.o) {
            if (!entity.getK() && !entity.getD() && !entity.getV()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int w = ro0.f.w(this.y, (ax1.bar.e((this.n.hashCode() + ((((((((((((ro0.f.w(this.e, ro0.f.w(this.d, ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.c.z) * 31, 31), 31) + this.g) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + this.k) * 31) + this.l) * 31)) * 31, 31, this.m) + this.x) * 31, 31);
        long j3 = this.C;
        int i = (w + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.D;
        return ((this.M.getDbValue() + ((((((i + ((int) (j4 ^ (j4 >>> 32)))) * 31) + java.util.Arrays.hashCode(this.o)) * 31) + (this.L ? 1 : 0)) * 31)) * 31) + (this.K ? 1 : 0);
    }

    public final boolean i() {
        for (com.truecaller.messaging.data.types.Entity entity : this.o) {
            if (entity.getK()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.k == 3 && (this.g & 17) == 17) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        return h81.a.E(this.c.e);
    }

    public final boolean n() {
        if (this.k == 2) {
            int i = this.g;
            if (i == 1 || i == 0) {
                if (!h() || c()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{id : ");
        sb.append(this.a);
        sb.append(", conversation : ");
        sb.append(this.b);
        sb.append(", status : ");
        sb.append(this.g);
        sb.append(", participant: ");
        sb.append(this.c);
        sb.append(", date : ");
        sb.append(this.e);
        sb.append(", dateSent : ");
        sb.append(this.d);
        sb.append(", seen : ");
        sb.append(this.h);
        sb.append(", read : ");
        sb.append(this.i);
        sb.append(", locked : ");
        sb.append(this.j);
        sb.append(", transport : ");
        sb.append(this.k);
        sb.append(", sim : ");
        sb.append(this.m);
        sb.append(", scheduledTransport : ");
        sb.append(this.l);
        sb.append(", transportInfo : ");
        sb.append(this.n);
        sb.append(", rawAddress : ");
        sb.append(this.s);
        com.truecaller.messaging.data.types.Entity[] entityArr = this.o;
        if (entityArr.length > 0) {
            sb.append(", entities : [");
            sb.append(entityArr[0]);
            for (int i = 1; i < entityArr.length; i++) {
                sb.append(", ");
                sb.append(entityArr[i]);
            }
            sb.append("]");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeLong(this.e.i());
        parcel.writeLong(this.d.i());
        parcel.writeLong(this.f.i());
        parcel.writeInt(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeParcelable(this.n, i);
        parcel.writeString(this.m);
        parcel.writeParcelableArray(this.o, i);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeString(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeString(this.w);
        parcel.writeInt(this.x);
        parcel.writeLong(this.y.i());
        parcel.writeLong(this.C);
        parcel.writeParcelable(this.z, i);
        parcel.writeLong(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeLong(this.G);
        parcel.writeLong(this.H);
        parcel.writeLong(this.I);
        parcel.writeLong(this.J);
        parcel.writeInt(this.K ? 1 : 0);
        parcel.writeLong(this.N.i());
        parcel.writeString(this.A);
        parcel.writeParcelable(this.O, i);
        parcel.writeInt(this.P);
        parcel.writeLong(this.R);
        parcel.writeLong(this.Q);
        parcel.writeParcelable(this.S, i);
        parcel.writeParcelableArray(this.p, i);
        parcel.writeLong(this.T);
        parcel.writeInt(this.U);
        parcel.writeString(this.V);
        parcel.writeString(this.W);
        parcel.writeParcelable(this.X, i);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeInt(this.M.getDbValue());
    }

    public Message(android.os.Parcel parcel) {
        com.truecaller.data.entity.InsightsPdo insightsPdo;
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = (com.truecaller.data.entity.messaging.Participant) parcel.readParcelable(com.truecaller.data.entity.messaging.Participant.class.getClassLoader());
        this.e = new org.joda.time.DateTime(parcel.readLong());
        this.d = new org.joda.time.DateTime(parcel.readLong());
        this.f = new org.joda.time.DateTime(parcel.readLong());
        this.g = parcel.readInt();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.n = (com.truecaller.messaging.data.types.TransportInfo) parcel.readParcelable(com.truecaller.messaging.data.types.TransportInfo.class.getClassLoader());
        this.m = parcel.readString();
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.truecaller.messaging.data.types.Entity.class.getClassLoader());
        if (readParcelableArray != null) {
            this.o = new com.truecaller.messaging.data.types.Entity[readParcelableArray.length];
            int i = 0;
            while (true) {
                com.truecaller.messaging.data.types.Entity[] entityArr = this.o;
                if (i >= entityArr.length) {
                    break;
                }
                entityArr[i] = (com.truecaller.messaging.data.types.Entity) readParcelableArray[i];
                i++;
            }
        } else {
            this.o = new com.truecaller.messaging.data.types.Entity[0];
        }
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.B = parcel.readInt() != 0;
        this.s = parcel.readString();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readString();
        this.x = parcel.readInt();
        this.y = new org.joda.time.DateTime(parcel.readLong());
        this.C = parcel.readLong();
        this.z = (com.truecaller.messaging.data.types.ReplySnippet) parcel.readParcelable(com.truecaller.messaging.data.types.ReplySnippet.class.getClassLoader());
        this.D = parcel.readLong();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readLong();
        this.H = parcel.readLong();
        this.I = parcel.readLong();
        this.J = parcel.readLong();
        this.K = parcel.readInt() != 0;
        this.N = new org.joda.time.DateTime(parcel.readLong());
        this.A = parcel.readString();
        this.O = (com.truecaller.messaging.data.types.ImForwardInfo) parcel.readParcelable(com.truecaller.messaging.data.types.ImForwardInfo.class.getClassLoader());
        this.P = parcel.readInt();
        this.R = parcel.readLong();
        this.Q = parcel.readLong();
        try {
            insightsPdo = (com.truecaller.data.entity.InsightsPdo) parcel.readParcelable(com.truecaller.data.entity.InsightsPdo.class.getClassLoader());
        } catch (android.os.BadParcelableException e) {
            o82.a.C(e);
            insightsPdo = null;
        }
        this.S = insightsPdo;
        android.os.Parcelable[] readParcelableArray2 = parcel.readParcelableArray(com.truecaller.messaging.data.types.Mention.class.getClassLoader());
        if (readParcelableArray2 != null) {
            this.p = new com.truecaller.messaging.data.types.Mention[readParcelableArray2.length];
            int i2 = 0;
            while (true) {
                com.truecaller.messaging.data.types.Mention[] mentionArr = this.p;
                if (i2 >= mentionArr.length) {
                    break;
                }
                mentionArr[i2] = (com.truecaller.messaging.data.types.Mention) readParcelableArray2[i2];
                i2++;
            }
        } else {
            this.p = new com.truecaller.messaging.data.types.Mention[0];
        }
        this.T = parcel.readLong();
        this.U = parcel.readInt();
        this.V = parcel.readString();
        this.W = parcel.readString();
        this.X = (com.truecaller.messaging.data.types.ModalFormResultSerialized) parcel.readParcelable(com.truecaller.messaging.data.types.ModalFormResultSerialized.class.getClassLoader());
        this.L = parcel.dataAvail() > 0 && parcel.readInt() != 0;
        this.M = com.truecaller.data.entity.messaging.FraudReportType.fromDbValue(parcel.dataAvail() > 0 ? parcel.readInt() : 0);
    }
}
