package com.truecaller.data.entity;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class HistoryEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.truecaller.data.entity.HistoryEvent> CREATOR = new om0.bar(11);
    public static volatile com.google.i18n.phonenumbers.PhoneNumberUtil E;
    public static volatile java.lang.String F;
    public int A;
    public int B;
    public int C;
    public int D;
    public java.lang.Long a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public java.lang.String e;
    public java.lang.String f;
    public java.lang.String g;
    public com.truecaller.data.entity.Contact h;
    public java.lang.Long i;
    public long j;
    public long k;
    public long l;
    public java.lang.String m;
    public int n;
    public int o;
    public com.truecaller.data.entity.CallRecording p;
    public java.lang.String q;
    public int r;
    public com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType s;
    public int t;
    public int u;
    public java.lang.String v;
    public int w;
    public java.lang.String x;
    public com.truecaller.data.entity.CallContextMessage y;
    public boolean z;

    public final boolean a() {
        if (this.A == 2 && java.lang.System.currentTimeMillis() - this.j < java.util.concurrent.TimeUnit.MINUTES.toMillis(2L)) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i = this.t;
        if (i != 0) {
            int i2 = 1;
            if (i == 1) {
                return 2;
            }
            if (i != 2) {
                i2 = 6;
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            return 0;
                        }
                        return 21;
                    }
                    return 4;
                }
            }
            return i2;
        }
        return 999;
    }

    public final java.lang.String c() {
        java.lang.String str = this.m;
        if (str == null) {
            return "-1";
        }
        return str;
    }

    public final boolean d() {
        return java.util.Objects.equals(this.v, "com.whatsapp");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.truecaller.data.entity.HistoryEvent historyEvent = (com.truecaller.data.entity.HistoryEvent) obj;
        if (!this.c.equals(historyEvent.c) || this.t != historyEvent.t || this.u != historyEvent.u || !java.util.Objects.equals(this.x, historyEvent.x) || this.j != historyEvent.j || this.k != historyEvent.k || this.n != historyEvent.n) {
            return false;
        }
        java.lang.String str = this.d;
        if (str == null ? historyEvent.d != null : !str.equals(historyEvent.d)) {
            return false;
        }
        java.lang.String str2 = this.e;
        if (str2 == null ? historyEvent.e != null : !str2.equals(historyEvent.e)) {
            return false;
        }
        java.lang.String str3 = this.f;
        if (str3 == null ? historyEvent.f != null : !str3.equals(historyEvent.f)) {
            return false;
        }
        java.lang.String str4 = this.g;
        if (str4 == null ? historyEvent.g != null : !str4.equals(historyEvent.g)) {
            return false;
        }
        if (this.s != historyEvent.s) {
            return false;
        }
        java.lang.Long l = this.i;
        if (l == null ? historyEvent.i != null : !l.equals(historyEvent.i)) {
            return false;
        }
        com.truecaller.data.entity.CallRecording callRecording = this.p;
        if (callRecording == null ? historyEvent.p != null : callRecording.equals(historyEvent.p)) {
            return false;
        }
        if (this.l != historyEvent.l || !java.util.Objects.equals(this.h, historyEvent.h)) {
            return false;
        }
        java.lang.String str5 = this.q;
        if (str5 == null ? historyEvent.q != null : str5.equals(historyEvent.q)) {
            return false;
        }
        return this.m.equals(historyEvent.m);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        java.lang.String str = this.d;
        int i9 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i10 = i * 31;
        java.lang.String str2 = this.e;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        java.lang.String str3 = this.f;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i11 + i3) * 31;
        java.lang.String str4 = this.g;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType = this.s;
        if (phoneNumberType != null) {
            i5 = phoneNumberType.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (((((i14 + i5) * 31) + this.t) * 31) + this.u) * 31;
        java.lang.String str5 = this.x;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 31;
        java.lang.Long l = this.i;
        if (l != null) {
            i7 = l.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 31;
        long j = this.j;
        int i18 = (i17 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.k;
        int e = ax1.bar.e((ax1.bar.e((i18 + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.m) + this.n) * 31, 31, this.c);
        com.truecaller.data.entity.CallRecording callRecording = this.p;
        if (callRecording != null) {
            i8 = callRecording.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (e + i8) * 31;
        long j3 = this.l;
        int hashCode = (this.h.hashCode() + ((i19 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        java.lang.String str6 = this.q;
        if (str6 != null) {
            i9 = str6.hashCode();
        }
        return hashCode + i9;
    }

    public final java.lang.String toString() {
        if (("HistoryEvent:{id=" + this.a + ", tcId=" + this.b + ", normalizedNumber=" + this.d) == null) {
            return "null";
        }
        if (("<non-null normalized number>, rawNumber=" + this.e) == null) {
            return "null";
        }
        if (("<non-null raw number>, cachedName=" + this.g) == null) {
            return "null";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<non-null cached name>, numberType=");
        sb.append(this.s);
        sb.append(", type=");
        sb.append(this.t);
        sb.append(", action=");
        sb.append(this.u);
        sb.append(", filterSource=");
        sb.append(this.x);
        sb.append(", callLogId=");
        sb.append(this.i);
        sb.append(", timestamp=");
        sb.append(this.j);
        sb.append(", duration=");
        sb.append(this.k);
        sb.append(", features=");
        sb.append(this.n);
        sb.append(", isNew=");
        sb.append(this.n);
        sb.append(", isRead=");
        sb.append(this.n);
        sb.append(", phoneAccountComponentName=");
        sb.append(this.v);
        sb.append(", contact=");
        sb.append(this.h);
        sb.append(", eventId=");
        sb.append(this.c);
        sb.append(", callRecording=");
        sb.append(this.p);
        sb.append(", contextMessage=");
        sb.append(this.y);
        sb.append(", ringingDuration=");
        sb.append(this.l);
        sb.append(", assistantState=");
        sb.append(this.A);
        sb.append(", ctVoicemailState=");
        sb.append(this.B);
        sb.append(", callRecordingState=");
        sb.append(this.C);
        sb.append(", clientCallId=");
        return bar.v(this.q, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int ordinal;
        parcel.writeString(this.b);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType = this.s;
        if (phoneNumberType == null) {
            ordinal = -1;
        } else {
            ordinal = phoneNumberType.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeString(this.x);
        parcel.writeLong(this.j);
        parcel.writeLong(this.k);
        parcel.writeInt(this.n);
        parcel.writeInt(this.r);
        parcel.writeInt(this.o);
        parcel.writeString(this.v);
        parcel.writeInt(this.w);
        if (this.a == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.a.longValue());
        }
        if (this.i == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.i.longValue());
        }
        if (this.h == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeParcelable(this.h, i);
        }
        parcel.writeString(this.m);
        parcel.writeString(this.c);
        if (this.p == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeParcelable(this.p, i);
        }
        if (this.y == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeParcelable(this.y, i);
        }
        parcel.writeLong(this.l);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeString(this.q);
        parcel.writeInt(this.D);
    }
}
