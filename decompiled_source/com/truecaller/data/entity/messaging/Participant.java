package com.truecaller.data.entity.messaging;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class Participant implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.truecaller.data.entity.messaging.Participant> CREATOR;
    public static final com.truecaller.data.entity.messaging.Participant G;
    public final java.util.List A;
    public final int B;
    public final int C;
    public final int D;
    public final java.lang.String E;
    public final java.lang.String F;
    public final long a;
    public final int b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final long h;
    public final int i;
    public final com.truecaller.data.entity.messaging.FraudReportType j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final java.lang.String n;
    public final java.lang.String o;
    public final java.lang.String p;
    public final int q;
    public final long r;
    public final int s;
    public final java.lang.String t;
    public final int u;
    public final java.lang.String v;
    public final long w;
    public final com.truecaller.data.entity.PremiumLevel x;
    public final java.lang.Long y;
    public final int z;

    static {
        s81.baz bazVar = new s81.baz(3);
        bazVar.e = "";
        G = bazVar.a();
        CREATOR = new rz0.b0(5);
    }

    public Participant(s81.baz bazVar) {
        this.a = bazVar.b;
        int i = bazVar.a;
        this.b = i;
        this.c = bazVar.c;
        java.lang.String str = bazVar.d;
        this.d = str == null ? "" : str;
        java.lang.String str2 = bazVar.e;
        str2 = str2 == null ? "" : str2;
        this.e = str2;
        java.lang.String str3 = bazVar.f;
        this.f = str3 != null ? str3 : "";
        this.h = bazVar.h;
        this.g = bazVar.g;
        this.i = bazVar.i;
        this.k = bazVar.j;
        this.l = bazVar.k;
        this.m = bazVar.l;
        this.n = bazVar.m;
        this.o = bazVar.n;
        this.p = bazVar.o;
        this.q = bazVar.p;
        this.r = bazVar.q;
        this.s = bazVar.r;
        this.t = bazVar.s;
        this.u = bazVar.x;
        this.v = bazVar.t;
        this.w = bazVar.u;
        com.truecaller.data.entity.PremiumLevel premiumLevel = bazVar.v;
        this.x = premiumLevel == null ? com.truecaller.data.entity.PremiumLevel.NONE : premiumLevel;
        this.y = bazVar.w;
        kj3.bar barVar = new kj3.bar();
        barVar.a(str2);
        int i2 = (barVar.a * 37) + i;
        barVar.a = i2;
        this.z = i2;
        this.A = java.util.Collections.unmodifiableList(bazVar.y);
        this.B = bazVar.z;
        this.C = bazVar.A;
        this.D = bazVar.B;
        this.j = bazVar.C;
        this.E = bazVar.D;
        this.F = bazVar.E;
    }

    public static com.truecaller.data.entity.messaging.Participant a(java.lang.String str, t41.t tVar, java.lang.String str2) {
        if (str.indexOf(64) > -1) {
            if (android.util.Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
                s81.baz bazVar = new s81.baz(2);
                bazVar.d = str;
                bazVar.e = str;
                return bazVar.a();
            }
            s81.baz bazVar2 = new s81.baz(1);
            bazVar2.d = str;
            bazVar2.e = str;
            return bazVar2.a();
        }
        return f(str, tVar, str2);
    }

    public static com.truecaller.data.entity.messaging.Participant b(com.truecaller.data.entity.Contact contact, java.lang.String str, t41.t tVar, android.net.Uri uri) {
        s81.baz bazVar = new s81.baz(0);
        if (str != null) {
            bazVar.e = str;
        } else {
            com.truecaller.data.entity.Number r = contact.r();
            if (r != null) {
                bazVar.e = r.f;
                bazVar.f = r.e;
            } else {
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new java.lang.IllegalArgumentException("Normalized number cannot be null"));
            }
        }
        if (tVar != null && jj3.bar.i(bazVar.f) && !jj3.bar.h(bazVar.e)) {
            java.lang.String b = ((t41.e0) tVar).b(bazVar.e);
            if (!jj3.bar.h(b)) {
                bazVar.f = b;
            }
        }
        if (contact.g() != null) {
            bazVar.h = contact.g().longValue();
        }
        if (!jj3.bar.i(contact.t())) {
            bazVar.m = contact.t();
        }
        if (uri != null) {
            bazVar.o = uri.toString();
        }
        return bazVar.a();
    }

    public static com.truecaller.data.entity.messaging.Participant[] c(android.net.Uri uri, t41.t tVar, java.lang.String str) {
        java.lang.String[] strArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String scheme = uri.getScheme();
        if ("sms".equals(scheme) || "smsto".equals(scheme)) {
            java.lang.String schemeSpecificPart = uri.getSchemeSpecificPart();
            java.lang.String query = uri.getQuery();
            if (!android.text.TextUtils.isEmpty(query)) {
                schemeSpecificPart = schemeSpecificPart.substring(0, (schemeSpecificPart.length() - query.length()) - 1);
            }
            if (schemeSpecificPart == null) {
                strArr = null;
            } else {
                int length = schemeSpecificPart.length();
                if (length == 0) {
                    strArr = jj3.bar.b;
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int i = 0;
                    boolean z = false;
                    int i2 = 0;
                    int i3 = 1;
                    while (i < length) {
                        if (",;".indexOf(schemeSpecificPart.charAt(i)) >= 0) {
                            if (z) {
                                int i4 = i3 + 1;
                                if (i3 == -1) {
                                    i = length;
                                }
                                arrayList2.add(schemeSpecificPart.substring(i2, i));
                                i3 = i4;
                                z = false;
                            }
                            i2 = i + 1;
                            i = i2;
                        } else {
                            i++;
                            z = true;
                        }
                    }
                    if (z) {
                        arrayList2.add(schemeSpecificPart.substring(i2, i));
                    }
                    strArr = (java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]);
                }
            }
            for (java.lang.String str2 : strArr) {
                com.truecaller.data.entity.messaging.Participant a = a(str2, tVar, str);
                int i5 = a.b;
                if (i5 == 0 || i5 == 1) {
                    arrayList.add(a);
                }
            }
        }
        return (com.truecaller.data.entity.messaging.Participant[]) arrayList.toArray(new com.truecaller.data.entity.messaging.Participant[arrayList.size()]);
    }

    public static com.truecaller.data.entity.messaging.Participant d(java.lang.String str, java.lang.String str2, java.lang.Long l) {
        if (str == null) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new java.lang.IllegalArgumentException("Build participant with type TYPE_TRUE_USER without IMID"));
        }
        s81.baz bazVar = new s81.baz(3);
        bazVar.e = str;
        bazVar.c = str;
        if (l != null) {
            bazVar.h = l.longValue();
        }
        if (!jj3.bar.i(str2)) {
            bazVar.m = str2;
        }
        return bazVar.a();
    }

    public static com.truecaller.data.entity.messaging.Participant e() {
        s81.baz bazVar = new s81.baz(6);
        bazVar.e = "Truecaller";
        bazVar.d = "Truecaller";
        bazVar.m = "Truecaller";
        bazVar.c = java.lang.String.valueOf(new java.util.Random().nextInt());
        bazVar.o = null;
        bazVar.z = 1;
        bazVar.i = 2;
        bazVar.x = 128;
        return bazVar.a();
    }

    public static com.truecaller.data.entity.messaging.Participant f(java.lang.String str, t41.t tVar, java.lang.String str2) {
        s81.baz bazVar;
        t41.e0 e0Var = (t41.e0) tVar;
        e0Var.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "number");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "simToken");
        java.lang.String m = t41.e0.m(e0Var, str, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164, (java.lang.String) null, str2, 2);
        if (m == null) {
            bazVar = new s81.baz(1);
            bazVar.e = str;
        } else {
            s81.baz bazVar2 = new s81.baz(0);
            bazVar2.e = m;
            java.lang.String b = e0Var.b(m);
            if (!jj3.bar.h(b)) {
                bazVar2.f = b;
            }
            bazVar = bazVar2;
        }
        bazVar.d = str;
        return bazVar.a();
    }

    public static com.truecaller.data.entity.messaging.Participant g(java.lang.String str) {
        s81.baz bazVar = new s81.baz(7);
        bazVar.e = "TrueGPT";
        bazVar.d = "TrueGPT";
        bazVar.m = "TrueGPT";
        bazVar.o = str;
        bazVar.c = java.lang.String.valueOf(new java.util.Random().nextInt());
        bazVar.i = 2;
        return bazVar.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.truecaller.data.entity.messaging.Participant)) {
            return false;
        }
        com.truecaller.data.entity.messaging.Participant participant = (com.truecaller.data.entity.messaging.Participant) obj;
        if (this.b != participant.b || !this.e.equals(participant.e)) {
            return false;
        }
        return true;
    }

    public final java.lang.String h() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i != 7) {
                                    com.truecaller.log.AssertionUtil.OnlyInDebug.fail("Should never happen");
                                    return "unknwon";
                                }
                                return "true_helper";
                            }
                            return "mock";
                        }
                        return "hidden";
                    }
                    return "tc";
                }
                return "email";
            }
            return "alphanum";
        }
        return "phone_number";
    }

    public final int hashCode() {
        return this.z;
    }

    public final boolean i(int i) {
        if ((i & this.u) != 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return jj3.bar.k(this.c);
    }

    public final boolean m(boolean z) {
        int i = this.i;
        if (i != 2) {
            if ((this.l && z) || i == 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean n() {
        if (this.B == 1) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (n() && !jj3.bar.i(this.E)) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if ((this.q & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if (this.j == com.truecaller.data.entity.messaging.FraudReportType.REPORTED_FRAUD) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        int i = this.i;
        if (i != 2) {
            if (this.l || u() || i == 1 || this.k) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{id : ");
        sb.append(this.a);
        sb.append(", type: ");
        sb.append(h());
        sb.append(", source : \"");
        return bar.m(this.q, "\"}", sb);
    }

    public final boolean u() {
        if (this.t != null) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        if (!r() && !i(2) && (this.q & 32) != 32) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeLong(this.h);
        parcel.writeString(this.g);
        parcel.writeInt(this.i);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeInt(this.q);
        parcel.writeLong(this.r);
        parcel.writeInt(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.u);
        parcel.writeString(this.v);
        parcel.writeLong(this.w);
        com.truecaller.data.entity.PremiumLevel premiumLevel = this.x;
        if (premiumLevel == null) {
            premiumLevel = com.truecaller.data.entity.PremiumLevel.NONE;
        }
        parcel.writeInt(premiumLevel.ordinal());
        parcel.writeValue(this.y);
        parcel.writeList(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.j.getDbValue());
        parcel.writeString(this.E);
        parcel.writeString(this.F);
    }

    public Participant(android.os.Parcel parcel) {
        this.a = parcel.readLong();
        int readInt = parcel.readInt();
        this.b = readInt;
        this.c = parcel.readString();
        this.d = parcel.readString();
        java.lang.String readString = parcel.readString();
        this.e = readString;
        this.f = parcel.readString();
        this.h = parcel.readLong();
        this.g = parcel.readString();
        this.i = parcel.readInt();
        this.k = parcel.readInt() == 1;
        this.l = parcel.readInt() == 1;
        this.m = parcel.readInt();
        this.n = parcel.readString();
        this.o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readInt();
        this.r = parcel.readLong();
        this.s = parcel.readInt();
        this.t = parcel.readString();
        this.u = parcel.readInt();
        this.v = parcel.readString();
        this.w = parcel.readLong();
        this.x = com.truecaller.data.entity.PremiumLevel.values()[parcel.readInt()];
        this.y = (java.lang.Long) parcel.readValue(java.lang.Long.class.getClassLoader());
        kj3.bar barVar = new kj3.bar();
        barVar.a(readString);
        int i = (barVar.a * 37) + readInt;
        barVar.a = i;
        this.z = i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        parcel.readList(arrayList, java.lang.Long.class.getClassLoader());
        this.A = arrayList;
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.j = com.truecaller.data.entity.messaging.FraudReportType.fromDbValue(parcel.readInt());
        this.E = parcel.readString();
        this.F = parcel.readString();
    }
}
