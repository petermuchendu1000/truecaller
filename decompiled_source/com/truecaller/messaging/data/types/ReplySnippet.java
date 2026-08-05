package com.truecaller.messaging.data.types;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/messaging/data/types/ReplySnippet;", "Landroid/os/Parcelable;", "messaging-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ReplySnippet implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.data.types.ReplySnippet> CREATOR = new a11.bar(25);
    public final long a;
    public final int b;
    public final java.util.List c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.Integer f;

    public ReplySnippet(long j, int i, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "entities");
        this.a = j;
        this.b = i;
        this.c = list;
        this.d = str;
        this.e = str2;
        this.f = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.messaging.data.types.ReplySnippet)) {
            return false;
        }
        com.truecaller.messaging.data.types.ReplySnippet replySnippet = (com.truecaller.messaging.data.types.ReplySnippet) obj;
        return this.a == replySnippet.a && this.b == replySnippet.b && kotlin.jvm.internal.Intrinsics.b(this.c, replySnippet.c) && kotlin.jvm.internal.Intrinsics.b(this.d, replySnippet.d) && kotlin.jvm.internal.Intrinsics.b(this.e, replySnippet.e) && kotlin.jvm.internal.Intrinsics.b(this.f, replySnippet.f);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.a;
        int g = uf.qux.g(((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31, 31, this.c);
        int i = 0;
        java.lang.String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (g + hashCode) * 31;
        java.lang.String str2 = this.e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        java.lang.Integer num = this.f;
        if (num != null) {
            i = num.hashCode();
        }
        return i3 + i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder e = com.google.android.gms.internal.ads.yj.e(this.b, "ReplySnippet(id=", ", status=", this.a);
        e.append(", entities=");
        e.append(this.c);
        e.append(", participantName=");
        e.append(this.d);
        e.append(", participantNormalizedAddress=");
        e.append(this.e);
        e.append(", participantType=");
        e.append(this.f);
        e.append(")");
        return e.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
        java.util.Iterator f = z0.a0.f(this.c, parcel);
        while (f.hasNext()) {
            parcel.writeParcelable((android.os.Parcelable) f.next(), i);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        java.lang.Integer num = this.f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            z0.a0.j(parcel, 1, num);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReplySnippet(com.truecaller.messaging.data.types.Message message) {
        this(r2, r4, r5, ak.e1.r(r10), r10.e, java.lang.Integer.valueOf(r10.b));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        long j = message.a;
        int i = message.g;
        com.truecaller.messaging.data.types.Entity[] entityArr = message.o;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entityArr, "entities");
        java.util.List h0 = kotlin.collections.v.h0(entityArr);
        com.truecaller.data.entity.messaging.Participant participant = message.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(participant, "participant");
    }
}
