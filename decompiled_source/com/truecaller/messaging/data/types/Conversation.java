package com.truecaller.messaging.data.types;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class Conversation implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.Conversation> CREATOR = new a11.bar(12);
    public final int A;
    public final int B;
    public final boolean C;
    public final int D;
    public final int E;
    public java.lang.String F;
    public final boolean G;
    public final org.joda.time.DateTime H;
    public final org.joda.time.DateTime I;
    public final org.joda.time.DateTime J;
    public final com.truecaller.messaging.data.types.Mention[] K;
    public final org.joda.time.DateTime L;
    public java.lang.String M;
    public final int N;
    public final int O;
    public final com.truecaller.messaging.data.types.ConversationPDO P;
    public final double Q;
    public final int R;
    public final int S;
    public final boolean T;
    public final boolean U;
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final int e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final org.joda.time.DateTime h;
    public final java.lang.String i;
    public final boolean j;
    public final int k;
    public final com.truecaller.data.entity.messaging.Participant[] l;
    public final boolean m;
    public final int n;
    public final int o;
    public final boolean p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public Conversation(c22.baz bazVar) {
        this.a = bazVar.a;
        this.b = bazVar.b;
        this.c = bazVar.c;
        this.d = bazVar.d;
        this.e = bazVar.e;
        this.f = bazVar.f;
        this.g = bazVar.g;
        org.joda.time.DateTime dateTime = bazVar.h;
        this.h = dateTime == null ? new org.joda.time.DateTime(0L) : dateTime;
        java.lang.String str = bazVar.i;
        this.i = str == null ? "" : str;
        this.j = bazVar.j;
        this.k = bazVar.k;
        java.util.ArrayList arrayList = bazVar.l;
        this.l = (com.truecaller.data.entity.messaging.Participant[]) arrayList.toArray(new com.truecaller.data.entity.messaging.Participant[arrayList.size()]);
        this.m = bazVar.m;
        this.n = bazVar.n;
        this.o = bazVar.o;
        this.p = bazVar.p;
        this.q = bazVar.q;
        this.s = bazVar.r;
        this.t = bazVar.s;
        this.u = bazVar.t;
        this.v = bazVar.u;
        this.y = bazVar.x;
        this.w = bazVar.v;
        this.x = bazVar.w;
        this.z = bazVar.y;
        this.A = bazVar.z;
        this.B = bazVar.A;
        this.C = bazVar.B;
        this.D = bazVar.C;
        this.E = bazVar.D;
        this.G = bazVar.E;
        org.joda.time.DateTime dateTime2 = bazVar.F;
        this.H = dateTime2 == null ? new org.joda.time.DateTime(0L) : dateTime2;
        org.joda.time.DateTime dateTime3 = bazVar.G;
        this.I = dateTime3 == null ? new org.joda.time.DateTime(0L) : dateTime3;
        org.joda.time.DateTime dateTime4 = bazVar.H;
        this.J = dateTime4 == null ? new org.joda.time.DateTime(0L) : dateTime4;
        org.joda.time.DateTime dateTime5 = bazVar.I;
        this.L = dateTime5 == null ? new org.joda.time.DateTime(0L) : dateTime5;
        java.util.HashSet hashSet = bazVar.J;
        this.K = (com.truecaller.messaging.data.types.Mention[]) hashSet.toArray(new com.truecaller.messaging.data.types.Mention[hashSet.size()]);
        this.r = bazVar.K;
        this.M = bazVar.L;
        this.N = bazVar.M;
        this.O = bazVar.N;
        this.P = bazVar.T;
        this.Q = bazVar.O;
        this.R = bazVar.P;
        this.S = bazVar.Q;
        this.T = bazVar.R;
        this.U = bazVar.S;
    }

    public final boolean a(boolean z) {
        for (com.truecaller.data.entity.messaging.Participant participant : this.l) {
            if (participant.m(z)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        for (com.truecaller.data.entity.messaging.Participant participant : this.l) {
            if (h81.a.E(participant.e)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        for (com.truecaller.data.entity.messaging.Participant participant : this.l) {
            if (participant.t()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeLong(this.h.i());
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k);
        com.truecaller.data.entity.messaging.Participant[] participantArr = this.l;
        parcel.writeInt(participantArr.length);
        parcel.writeTypedArray(participantArr, 0);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.z);
        parcel.writeInt(this.y);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeLong(this.H.i());
        parcel.writeLong(this.I.i());
        parcel.writeLong(this.J.i());
        parcel.writeLong(this.L.i());
        parcel.writeParcelableArray(this.K, i);
        parcel.writeInt(this.r);
        parcel.writeString(this.M);
        parcel.writeInt(this.N);
        parcel.writeInt(this.O);
        parcel.writeParcelable(this.P, i);
        parcel.writeDouble(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T ? 1 : 0);
        parcel.writeInt(this.U ? 1 : 0);
    }

    public Conversation(android.os.Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readInt();
        this.c = parcel.readLong();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = new org.joda.time.DateTime(parcel.readLong());
        this.i = parcel.readString();
        boolean z = false;
        this.j = parcel.readInt() == 1;
        this.k = parcel.readInt();
        com.truecaller.data.entity.messaging.Participant[] participantArr = new com.truecaller.data.entity.messaging.Participant[parcel.readInt()];
        this.l = participantArr;
        parcel.readTypedArray(participantArr, com.truecaller.data.entity.messaging.Participant.CREATOR);
        this.m = parcel.readByte() == 1;
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readInt() == 1;
        this.q = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.z = parcel.readInt();
        this.y = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt() == 1;
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.G = parcel.readInt() == 1;
        this.H = new org.joda.time.DateTime(parcel.readLong());
        this.I = new org.joda.time.DateTime(parcel.readLong());
        this.J = new org.joda.time.DateTime(parcel.readLong());
        this.L = new org.joda.time.DateTime(parcel.readLong());
        android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.truecaller.messaging.data.types.Mention.class.getClassLoader());
        this.K = new com.truecaller.messaging.data.types.Mention[readParcelableArray.length];
        int i = 0;
        while (true) {
            com.truecaller.messaging.data.types.Mention[] mentionArr = this.K;
            if (i >= mentionArr.length) {
                break;
            }
            mentionArr[i] = (com.truecaller.messaging.data.types.Mention) readParcelableArray[i];
            i++;
        }
        this.r = parcel.readInt();
        this.M = parcel.readString();
        this.N = parcel.readInt();
        this.O = parcel.readInt();
        this.P = (com.truecaller.messaging.data.types.ConversationPDO) parcel.readParcelable(com.truecaller.messaging.data.types.ConversationPDO.class.getClassLoader());
        this.Q = parcel.readDouble();
        this.R = parcel.readInt();
        this.S = parcel.readInt();
        this.T = parcel.dataAvail() > 0 && parcel.readInt() == 1;
        if (parcel.dataAvail() > 0 && parcel.readInt() == 1) {
            z = true;
        }
        this.U = z;
    }
}
