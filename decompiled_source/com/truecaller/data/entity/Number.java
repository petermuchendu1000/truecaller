package com.truecaller.data.entity;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class Number implements q81.a, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.truecaller.data.entity.Number> CREATOR = new om0.bar(13);
    public static java.lang.String q;
    public java.lang.Long a;
    public java.lang.String b;
    public java.lang.Integer c;
    public java.lang.String d;
    public java.lang.String e;
    public java.lang.String f;
    public java.lang.String g;
    public java.lang.String h;
    public java.lang.Integer i;
    public java.lang.String j;
    public java.lang.Integer k;
    public java.lang.String l;
    public java.lang.Integer m;
    public java.lang.String n;
    public java.lang.Long o;
    public boolean p;

    public Number() {
        this.c = 0;
        this.i = 0;
        this.k = 0;
        this.m = 0;
    }

    public static com.truecaller.data.entity.Number a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.truecaller.data.entity.Number number;
        if (android.text.TextUtils.isEmpty(str) && android.text.TextUtils.isEmpty(str2)) {
            return null;
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            number = new com.truecaller.data.entity.Number(str, null);
        } else {
            number = new com.truecaller.data.entity.Number(str2, str3);
        }
        number.f = (java.lang.String) jj3.bar.e(str, number.f);
        number.h = (java.lang.String) jj3.bar.e(str2, number.h);
        number.e = (java.lang.String) jj3.bar.e(str3, number.e);
        return number;
    }

    public static com.google.i18n.phonenumbers.PhoneNumberUtil g(java.lang.String str) {
        if (q == null) {
            if (android.text.TextUtils.isEmpty(str)) {
                str = r11.bar.a().c();
            }
            if (jj3.bar.i(str)) {
                return null;
            }
            q = str.toUpperCase();
        }
        return d61.bar.a();
    }

    public final java.lang.String b() {
        if (!android.text.TextUtils.isEmpty(this.d)) {
            return this.d;
        }
        com.google.i18n.phonenumbers.PhoneNumberUtil g = g(null);
        if (g != null && !android.text.TextUtils.isEmpty(this.f)) {
            try {
                java.lang.String safeDisplayName = com.google.i18n.phonenumbers.PhoneNumberToCarrierMapper.getInstance().getSafeDisplayName(g.parse(this.f, this.e), java.util.Locale.getDefault());
                if (!jj3.bar.i(safeDisplayName)) {
                    return safeDisplayName;
                }
            } catch (java.lang.Exception e) {
                e = e;
                com.truecaller.log.AssertionUtil.shouldNeverHappen(e, new java.lang.String[0]);
            } catch (com.google.i18n.phonenumbers.NumberParseException unused) {
            } catch (java.lang.OutOfMemoryError e2) {
                e = e2;
                com.truecaller.log.AssertionUtil.shouldNeverHappen(e, new java.lang.String[0]);
            }
        }
        return null;
    }

    public final java.lang.String c() {
        if (jj3.bar.u(this.f, "+", false)) {
            return this.f.substring(1);
        }
        return this.f;
    }

    public final java.lang.String d() {
        java.lang.String str = this.h;
        if (str != null && t41.i0.c.matcher(str).find()) {
            return str;
        }
        if (q != null && this.e != null) {
            if (!jj3.bar.i(this.g) && q.contains(this.e)) {
                return this.g;
            }
            if (!android.text.TextUtils.isEmpty(this.f) && !q.contains(this.e)) {
                java.lang.String str2 = this.f;
                try {
                    return t41.f0.b(str2, r11.bar.a().c(), com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
                } catch (com.google.i18n.phonenumbers.NumberParseException unused) {
                    return str2;
                }
            }
        }
        java.lang.String str3 = this.f;
        if (str == null) {
            return str3;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String e() {
        if (t41.i0.f(this.h)) {
            return this.h;
        }
        if (t41.i0.f(this.f)) {
            return this.f;
        }
        if (t41.i0.f(this.g)) {
            return this.g;
        }
        return null;
    }

    public final com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType f() {
        return t41.i0.h(this.n, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UNKNOWN);
    }

    public final int h() {
        java.lang.Integer num = this.m;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final boolean i() {
        if (t41.i0.e(this.h) && t41.i0.e(this.f) && t41.i0.e(this.g)) {
            return true;
        }
        return false;
    }

    public final void j(com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType phoneNumberType) {
        java.lang.String obj;
        if (phoneNumberType == null) {
            obj = null;
        } else {
            obj = phoneNumberType.toString();
        }
        this.n = obj;
    }

    @Override // q81.a
    public final boolean mergeEquals(q81.a aVar) {
        if (this == aVar) {
            return true;
        }
        if (aVar instanceof com.truecaller.data.entity.Number) {
            return android.text.TextUtils.equals(this.f, ((com.truecaller.data.entity.Number) aVar).f);
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Number{id=");
        sb.append(this.a);
        sb.append(", tcId='");
        sb.append(this.b);
        sb.append("', source=");
        sb.append(this.c);
        sb.append(", carrier='");
        sb.append(this.d);
        sb.append("', countryCode='");
        sb.append(this.e);
        sb.append("', normalizedNumber='");
        sb.append(this.f);
        sb.append("', nationalNumber='");
        sb.append(this.g);
        sb.append("', rawNumber='");
        sb.append(this.h);
        sb.append("', dialingCode=");
        sb.append(this.i);
        sb.append(", spamType='");
        sb.append(this.j);
        sb.append("', spamScore=");
        sb.append(this.k);
        sb.append(", telTypeLabel='");
        sb.append(this.l);
        sb.append("', telType=");
        sb.append(this.m);
        sb.append(", numberType='");
        sb.append(this.n);
        sb.append("', dataPhonebookId=");
        sb.append(this.o);
        sb.append(", isPrimaryDataPhonebookId=");
        return h0.b.R(sb, this.p, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.a == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.a.longValue());
        }
        parcel.writeString(this.b);
        parcel.writeInt(this.c.intValue());
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        if (this.i == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.i.intValue());
        }
        parcel.writeString(this.j);
        parcel.writeInt(this.k.intValue());
        parcel.writeString(this.l);
        if (this.m == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.m.intValue());
        }
        parcel.writeString(this.n);
        if (this.o == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.o.longValue());
        }
        parcel.writeByte(this.p ? (byte) 1 : (byte) 0);
    }

    public Number(java.lang.String str, java.lang.String str2) {
        this();
        this.h = str;
        com.google.i18n.phonenumbers.PhoneNumberUtil g = g(str2);
        com.google.i18n.phonenumbers.ShortNumberInfo shortNumberInfo = com.google.i18n.phonenumbers.ShortNumberInfo.getInstance();
        java.lang.String E = u03.e0.E(new java.lang.String[]{str2, q});
        if (g != null && !android.text.TextUtils.isEmpty(E)) {
            if (!g.getSupportedRegions().contains(E)) {
                qb.qux.v("Invalid country iso: ", E);
                this.f = str;
            }
            try {
                if (shortNumberInfo.isEmergencyNumber(str, E)) {
                    this.f = str;
                    this.g = str;
                    j(com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE);
                } else {
                    com.google.i18n.phonenumbers.Phonenumber.PhoneNumber parse = g.parse(str, E);
                    if (!shortNumberInfo.isPossibleShortNumber(parse) && g.isPossibleNumber(parse)) {
                        if (g.isValidNumber(parse)) {
                            this.f = g.format(parse, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164);
                            this.g = g.format(parse, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
                        } else {
                            this.f = str;
                            this.g = str;
                        }
                        this.i = java.lang.Integer.valueOf(parse.getCountryCode());
                        j(g.getNumberType(parse));
                    }
                    this.f = str;
                    this.g = str;
                    this.i = java.lang.Integer.valueOf(parse.getCountryCode());
                    j(g.getNumberType(parse));
                }
                com.truecaller.data.country.CountryListDto.bar b = ((com.truecaller.data.country.g) t41.f.a.getValue()).b(this.f);
                if (b == null) {
                    this.e = E;
                    return;
                }
                java.lang.String str3 = b.c;
                java.util.Locale locale = java.util.Locale.ENGLISH;
                this.e = jj3.bar.x(str3);
                return;
            } catch (com.google.i18n.phonenumbers.NumberParseException e) {
                this.f = str;
                e.getMessage();
                return;
            }
        }
        this.f = str;
        this.e = str2;
    }
}
