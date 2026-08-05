package com.truecaller.data.entity;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class Contact implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.truecaller.data.entity.Contact> CREATOR = new om0.bar(10);
    public int A;
    public java.lang.String B;
    public java.util.List C;
    public java.util.List D;
    public com.truecaller.data.entity.Contact.LogBizMonFetchedFrom E;
    public java.lang.String F;
    public long G;
    public java.lang.String H;
    public java.lang.String I;
    public java.lang.String J;
    public java.lang.String K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String O;
    public java.lang.String P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;
    public java.lang.Number T;
    public java.lang.Integer U;
    public boolean V;
    public int W;
    public int X;
    public long Y;
    public long Z;
    public final java.util.ArrayList a;
    public long a0;
    public final java.util.ArrayList b;
    public long b0;
    public final java.util.ArrayList c;
    public java.lang.String c0;
    public final java.util.ArrayList d;
    public java.lang.String d0;
    public final java.util.ArrayList e;
    public java.lang.String e0;
    public final java.util.ArrayList f;
    public boolean f0;
    public final java.util.ArrayList g;
    public int g0;
    public final java.util.ArrayList h;
    public java.lang.Integer h0;
    public final transient java.util.ArrayList i;
    public boolean i0;
    public transient android.net.Uri j;
    public com.truecaller.data.entity.PremiumLevel j0;
    public transient boolean k;
    public int k0;
    public java.util.List l;
    public java.util.List m;
    public java.util.List n;
    public java.util.List o;
    public java.util.List p;
    public java.util.List q;
    public java.util.List r;
    public java.util.List s;
    public int t;
    public com.truecaller.contact.entity.model.StructuredNameEntity u;
    public com.truecaller.contact.entity.model.NoteEntity v;
    public com.truecaller.contact.entity.model.BusinessProfileEntity w;
    public com.truecaller.contact.entity.model.SpamInfoEntity x;
    public com.truecaller.contact.entity.model.FeedbackEntity y;
    public com.truecaller.contact.entity.model.SenderIdEntity z;

    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public enum LogBizMonFetchedFrom {
        SEARCH("Search"),
        PHONE_BOOK("PhoneBook"),
        CACHE("Cache"),
        BIZ_CALL_KIT("BizCallKit"),
        BIZ_DYNAMIC_CONTACT("BizDynamicContact"),
        UNKNOWN("Unknown");

        private final java.lang.String logBizMonFetchedFrom;

        LogBizMonFetchedFrom(java.lang.String str) {
            this.logBizMonFetchedFrom = str;
        }

        public java.lang.String getValue() {
            return this.logBizMonFetchedFrom;
        }
    }

    public Contact() {
        this.a = new java.util.ArrayList();
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        this.d = new java.util.ArrayList();
        this.e = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        this.h = new java.util.ArrayList();
        this.i = new java.util.ArrayList();
        this.C = new java.util.ArrayList();
        this.D = new java.util.ArrayList();
        this.E = com.truecaller.data.entity.Contact.LogBizMonFetchedFrom.UNKNOWN;
        this.g0 = -1;
        this.j0 = com.truecaller.data.entity.PremiumLevel.NONE;
    }

    public static void Z(java.util.ArrayList arrayList) {
        if (arrayList != null) {
            java.util.ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                q81.a aVar = (q81.a) listIterator.next();
                int previousIndex = listIterator.previousIndex();
                if (previousIndex != -1) {
                    java.util.ListIterator listIterator2 = arrayList.listIterator();
                    boolean z = false;
                    while (!z && listIterator2.hasNext() && listIterator2.nextIndex() != previousIndex) {
                        q81.a aVar2 = (q81.a) listIterator2.next();
                        boolean mergeEquals = aVar2.mergeEquals(aVar);
                        if (mergeEquals) {
                            if (aVar2 instanceof com.truecaller.data.entity.Number) {
                                com.truecaller.data.entity.Number number = (com.truecaller.data.entity.Number) aVar2;
                                com.truecaller.data.entity.Number number2 = (com.truecaller.data.entity.Number) aVar;
                                if (number2.k.intValue() > number.k.intValue()) {
                                    java.lang.Integer num = number2.k;
                                    num.getClass();
                                    number.k = num;
                                }
                                if (number.j == null) {
                                    number.j = number2.j;
                                }
                                if (jj3.bar.i(number.d)) {
                                    number.d = number2.d;
                                }
                                if (number.o == null) {
                                    number.o = number2.o;
                                }
                                number.c = java.lang.Integer.valueOf(number.c.intValue() | number2.c.intValue());
                                if (number2.m.intValue() != -1) {
                                    number.m = number2.m;
                                    number.l = number2.l;
                                    number.j(number2.f());
                                }
                            }
                            listIterator.remove();
                        }
                        z = mergeEquals;
                    }
                }
            }
        }
    }

    public final java.lang.Integer A() {
        com.truecaller.contact.entity.model.SpamInfoEntity spamInfoEntity = this.x;
        if (spamInfoEntity != null && spamInfoEntity.getNumCalls60DaysPointerPosition() != null) {
            java.lang.Integer numCalls60DaysPointerPosition = this.x.getNumCalls60DaysPointerPosition();
            numCalls60DaysPointerPosition.intValue();
            return numCalls60DaysPointerPosition;
        }
        return null;
    }

    public final java.util.List B() {
        com.truecaller.contact.entity.model.SpamInfoEntity spamInfoEntity = this.x;
        if (spamInfoEntity == null || spamInfoEntity.getNumCallsHourly().size() != 24) {
            return null;
        }
        return this.x.getNumCallsHourly();
    }

    public final java.util.List C() {
        if (this.m == null) {
            this.m = java.util.Collections.unmodifiableList(this.b);
        }
        return this.m;
    }

    public final java.lang.String D() {
        java.util.ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return "";
        }
        return ((com.truecaller.contact.entity.model.SourceEntity) arrayList.get(0)).getUrl();
    }

    public final java.lang.Long E() {
        long j = this.a0;
        if (j == 0) {
            return null;
        }
        return java.lang.Long.valueOf(j);
    }

    public final com.truecaller.data.entity.PremiumLevel F() {
        return this.j0;
    }

    public final int G() {
        java.lang.Integer num = this.U;
        if (num != null) {
            return num.intValue();
        }
        return 100;
    }

    public final java.util.List H() {
        if (this.q == null) {
            this.q = java.util.Collections.unmodifiableList(this.f);
        }
        return this.q;
    }

    public final java.util.List I() {
        if (this.n == null) {
            this.n = java.util.Collections.unmodifiableList(this.c);
        }
        return this.n;
    }

    public final boolean J(int i) {
        if ((i & this.t) != 0) {
            return true;
        }
        return false;
    }

    public final boolean K() {
        return !this.b.isEmpty();
    }

    public final boolean L() {
        if ((this.W & 32) == 32) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        if ((this.W & 4) == 0 && !jj3.bar.i(this.I)) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if (this.j0 != com.truecaller.data.entity.PremiumLevel.GOLD && !J(32)) {
            return false;
        }
        return true;
    }

    public final boolean P() {
        if (!J(128) || I().isEmpty()) {
            return false;
        }
        return "4".equals(((com.truecaller.contact.entity.model.TagEntity) I().get(0)).getTagId());
    }

    public final boolean Q() {
        if (E() != null) {
            return true;
        }
        return false;
    }

    public final boolean R() {
        if (this.j0 != com.truecaller.data.entity.PremiumLevel.REGULAR && !J(4)) {
            return false;
        }
        return true;
    }

    public final boolean S() {
        if (J(16) && !X()) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if (S() && !O() && !X()) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        if ("private".equalsIgnoreCase(this.R) && !K()) {
            return true;
        }
        return false;
    }

    public final boolean V() {
        if (J(1024) && !P() && !O() && !S() && !J(128)) {
            return true;
        }
        return false;
    }

    public final boolean W() {
        if (V() && X()) {
            return true;
        }
        return false;
    }

    public final boolean X() {
        if (this.B != null) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        if (!J(128) || !X()) {
            if (J(128) && !P() && !O() && !S() && !X()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void a(com.truecaller.contact.entity.model.AddressEntity addressEntity) {
        this.a.add(addressEntity);
    }

    public final void a0(java.lang.Integer num) {
        int intValue;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        this.t = intValue;
    }

    public final void b(com.truecaller.contact.entity.model.LinkEntity linkEntity) {
        this.e.add(linkEntity);
    }

    public final void b0(com.truecaller.data.entity.CallKitContact callKitContact) {
        int i;
        this.I = callKitContact.getName();
        com.truecaller.data.entity.Number number = new com.truecaller.data.entity.Number();
        number.f = callKitContact.getNumber();
        this.b.add(number);
        this.O = callKitContact.getLogoUrl();
        if ("verified".equals(callKitContact.getBadge())) {
            i = 128;
        } else if ("priority".equals(callKitContact.getBadge())) {
            i = 16;
        } else if ("small_business".equals(callKitContact.getBadge())) {
            i = 1024;
        } else {
            i = 0;
        }
        a0(java.lang.Integer.valueOf(i));
        this.E = com.truecaller.data.entity.Contact.LogBizMonFetchedFrom.BIZ_CALL_KIT;
    }

    public final void c(com.truecaller.data.entity.Number number) {
        this.b.add(number);
        if ((number.c.intValue() & 13) != 0) {
            this.i.add(number);
        }
    }

    public final void c0(com.truecaller.data.entity.BizDynamicContact bizDynamicContact) {
        int i;
        this.I = bizDynamicContact.getName();
        com.truecaller.data.entity.Number number = new com.truecaller.data.entity.Number();
        number.f = bizDynamicContact.getNumber();
        this.b.add(number);
        this.O = bizDynamicContact.getLogoUrl();
        int i2 = 0;
        if (com.truecaller.data.entity.BizDCIBadge.BADGE_VERIFIED.getValue() == bizDynamicContact.getBadge()) {
            i = 128;
        } else if (com.truecaller.data.entity.BizDCIBadge.BADGE_PRIORITY.getValue() == bizDynamicContact.getBadge()) {
            i = 16;
        } else {
            i = 0;
        }
        a0(java.lang.Integer.valueOf(i));
        java.lang.String callReason = bizDynamicContact.getCallReason();
        if (callReason != null) {
            int length = callReason.length();
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                int codePointAt = callReason.codePointAt(i3);
                if (!java.lang.Character.isWhitespace(codePointAt)) {
                    com.truecaller.contact.entity.model.BusinessProfileEntity businessProfileEntity = this.w;
                    if (businessProfileEntity != null) {
                        this.w = new com.truecaller.contact.entity.model.BusinessProfileEntity(businessProfileEntity.getPrimaryFields(), this.w.getMediaCallerIds(), this.w.getAppStores(), this.w.getBrandedMedia(), callReason, this.w.getAlternatePhoneNumbers(), this.w.getMessageCta());
                    } else {
                        com.truecaller.contact.entity.model.DataEntityPrimaryFields dataEntityPrimaryFields = new com.truecaller.contact.entity.model.DataEntityPrimaryFields((java.lang.Long) null, this.H, false, (java.lang.Long) null, java.lang.Integer.valueOf(this.W));
                        java.util.List list = java.util.Collections.EMPTY_LIST;
                        this.w = new com.truecaller.contact.entity.model.BusinessProfileEntity(dataEntityPrimaryFields, list, list, list, callReason, list, (com.truecaller.contact.entity.model.BusinessProfileEntity.MessageCta) null);
                    }
                } else {
                    i3 += java.lang.Character.charCount(codePointAt);
                }
            }
        }
        java.lang.String tag = bizDynamicContact.getTag();
        if (tag != null) {
            int length2 = tag.length();
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                int codePointAt2 = tag.codePointAt(i2);
                if (!java.lang.Character.isWhitespace(codePointAt2)) {
                    this.c.clear();
                    d(new com.truecaller.contact.entity.model.TagEntity(new com.truecaller.contact.entity.model.DataEntityPrimaryFields((java.lang.Long) null, this.H, false, (java.lang.Long) null, java.lang.Integer.valueOf(this.W)), tag));
                    break;
                }
                i2 += java.lang.Character.charCount(codePointAt2);
            }
        }
        this.E = com.truecaller.data.entity.Contact.LogBizMonFetchedFrom.BIZ_DYNAMIC_CONTACT;
        this.F = bizDynamicContact.getRequestId();
    }

    public final void d(com.truecaller.contact.entity.model.TagEntity tagEntity) {
        this.c.add(tagEntity);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String e() {
        com.truecaller.contact.entity.model.AddressEntity m = m();
        if (m == null) {
            return null;
        }
        if (!U() && (jj3.bar.k(m.getStreet()) || jj3.bar.k(m.getZipCode()) || jj3.bar.k(m.getCity()) || jj3.bar.k(m03.bar.a(m)))) {
            return u03.e0.C(", ", new java.lang.String[]{m.getStreet(), u03.e0.C(" ", new java.lang.CharSequence[]{m.getZipCode(), m.getCity(), m03.bar.a(m)})});
        }
        return m.getCity();
    }

    public final void e0(java.lang.Boolean bool) {
        boolean z;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.V = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof com.truecaller.data.entity.Contact) {
                com.truecaller.data.entity.Contact contact = (com.truecaller.data.entity.Contact) obj;
                java.util.ArrayList arrayList = contact.b;
                if (jj3.bar.f(this.e0, contact.e0) && K() == contact.K()) {
                    java.util.ArrayList arrayList2 = this.b;
                    if (arrayList2.size() == arrayList.size()) {
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            com.truecaller.data.entity.Number number = (com.truecaller.data.entity.Number) it.next();
                            java.util.Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                if (number.f.equals(((com.truecaller.data.entity.Number) it2.next()).f)) {
                                    break;
                                }
                            }
                            return false;
                        }
                        if (u03.e0.F(this.I, contact.I, true) != 0) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final java.util.List f() {
        if (this.l == null) {
            this.l = java.util.Collections.unmodifiableList(this.a);
        }
        return this.l;
    }

    public final java.lang.Long g() {
        long j = this.Z;
        if (j == 0) {
            return null;
        }
        return java.lang.Long.valueOf(j);
    }

    public final void g0(java.lang.Long l) {
        long longValue;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        this.a0 = longValue;
    }

    public final java.lang.String h() {
        java.lang.String str;
        java.lang.String str2 = this.Q;
        if (J(64) && !jj3.bar.i(str2)) {
            java.lang.String str3 = this.L;
            if (jj3.bar.i(str3)) {
                java.lang.String str4 = this.I;
                java.lang.StringBuilder k = ia0.bar.k(str2);
                if (str4 != null) {
                    str = bar.t(" (", str4, ")");
                } else {
                    str = "";
                }
                k.append(str);
                return k.toString();
            }
            return ax1.bar.l(str2, " (", str3, ")");
        }
        return null;
    }

    public final void h0(java.lang.Long l) {
        long longValue;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        this.Y = longValue;
    }

    public final java.lang.Long i() {
        java.lang.Number number = this.T;
        if (number != null) {
            return java.lang.Long.valueOf(number.longValue());
        }
        return null;
    }

    public final void i0(java.lang.Integer num) {
        int intValue;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        this.W = intValue;
    }

    public final java.lang.String j() {
        com.truecaller.contact.entity.model.AddressEntity m = m();
        if (m == null) {
            return null;
        }
        return m03.bar.a(m);
    }

    public final void j0(java.lang.Integer num) {
        int intValue;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        this.A = intValue;
    }

    public final void k0() {
        Z(this.b);
        Z(this.d);
        Z(this.e);
        Z(this.c);
    }

    public final boolean l0() {
        if (!Q() && !U() && !L() && !Y() && !T() && !V() && !P()) {
            return true;
        }
        return false;
    }

    public final com.truecaller.contact.entity.model.AddressEntity m() {
        java.util.Iterator it = this.a.iterator();
        com.truecaller.contact.entity.model.AddressEntity addressEntity = null;
        while (it.hasNext()) {
            addressEntity = (com.truecaller.contact.entity.model.AddressEntity) it.next();
            if (addressEntity.getPrimaryFields().d != null) {
                break;
            }
        }
        return addressEntity;
    }

    public final boolean m0() {
        if ((this.W & 463) != 0) {
            return true;
        }
        return false;
    }

    public final java.lang.String n() {
        if (jj3.bar.k(this.e0)) {
            return this.e0;
        }
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            com.truecaller.data.entity.Number number = (com.truecaller.data.entity.Number) it.next();
            java.lang.String E = u03.e0.E(new java.lang.String[]{number.f, number.h, number.g});
            this.e0 = E;
            if (!jj3.bar.i(E)) {
                break;
            }
        }
        return this.e0;
    }

    public final boolean n0() {
        if ((this.W & 13) != 0) {
            return true;
        }
        return false;
    }

    public final java.lang.String o() {
        com.truecaller.data.entity.Number r = r();
        if (r != null) {
            return r.d();
        }
        java.util.ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            return ((com.truecaller.data.entity.Number) arrayList.get(0)).d();
        }
        if (!jj3.bar.i(this.e0)) {
            java.lang.String str = this.e0;
            java.lang.String str2 = null;
            if (android.text.TextUtils.isEmpty(null)) {
                str2 = r11.bar.a().c();
            }
            try {
                if (!android.text.TextUtils.isEmpty(str2)) {
                    com.google.i18n.phonenumbers.PhoneNumberUtil a = d61.bar.a();
                    if (jj3.bar.g(r11.bar.a().c(), a.getRegionCodeForCountryCode(a.parse(str, str2).getCountryCode()))) {
                        return t41.f0.b(str, str2, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
                    }
                    return t41.f0.b(str, str2, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
                }
                throw new com.google.i18n.phonenumbers.NumberParseException(com.google.i18n.phonenumbers.NumberParseException.ErrorType.INVALID_COUNTRY_CODE, "Bad country ISO code, " + str2);
            } catch (java.lang.Exception unused) {
                return str;
            }
        }
        return this.e0;
    }

    public final boolean o0(java.lang.String str) {
        java.util.ArrayList arrayList;
        if (n0() && (arrayList = this.i) != null && t41.i0.f(str)) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.truecaller.data.entity.Number number = (com.truecaller.data.entity.Number) it.next();
                if (str.equals(number.f) && (number.c.intValue() & 13) != 0) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final com.truecaller.data.entity.Number r() {
        java.lang.String n = n();
        if (!jj3.bar.i(n)) {
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                com.truecaller.data.entity.Number number = (com.truecaller.data.entity.Number) it.next();
                if (n.equals(number.f)) {
                    return number;
                }
            }
            return null;
        }
        return null;
    }

    public final java.lang.String s() {
        java.lang.String h = h();
        if (h != null) {
            return h;
        }
        return this.I;
    }

    public final java.lang.String t() {
        java.lang.String u = u();
        if (jj3.bar.i(u)) {
            java.lang.String o = o();
            if (jj3.bar.i(o)) {
                return android.content.res.Resources.getSystem().getString(android.R.string.unknownName);
            }
            return o;
        }
        return u;
    }

    public final java.lang.String u() {
        java.lang.String h = h();
        if (h != null) {
            return h;
        }
        java.lang.String str = this.I;
        if (!Q()) {
            if (!jj3.bar.i(this.J)) {
                return bar.v(this.J, ")", qb.qux.s(str, " ("));
            }
            if (!jj3.bar.i(this.L)) {
                return bar.v(this.L, ")", qb.qux.s(str, " ("));
            }
            return str;
        }
        return str;
    }

    public final java.util.List v() {
        if (this.s == null) {
            this.s = java.util.Collections.unmodifiableList(this.h);
        }
        return this.s;
    }

    public final java.lang.String w() {
        com.truecaller.contact.entity.model.AddressEntity m = m();
        if (m == null) {
            return "";
        }
        return m03.bar.b(m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String valueOf;
        parcel.writeLong(this.G);
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeString(this.J);
        parcel.writeString(this.K);
        parcel.writeString(this.L);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeString(this.R);
        java.lang.Number number = this.T;
        if (number == null) {
            valueOf = null;
        } else {
            valueOf = java.lang.String.valueOf(number);
        }
        parcel.writeString(valueOf);
        parcel.writeLong(this.Y);
        parcel.writeString(this.c0);
        parcel.writeInt(this.W);
        parcel.writeInt(this.X);
        parcel.writeLong(this.Z);
        parcel.writeLong(this.a0);
        parcel.writeLong(this.b0);
        parcel.writeString(this.d0);
        parcel.writeString(this.e0);
        parcel.writeInt(this.f0 ? 1 : 0);
        parcel.writeInt(this.g0);
        parcel.writeInt(this.k0);
        parcel.writeInt(this.V ? 1 : 0);
        parcel.writeTypedList(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeTypedList(this.c);
        parcel.writeTypedList(this.d);
        parcel.writeTypedList(this.e);
        parcel.writeInt(this.t);
        parcel.writeParcelable(this.j, 0);
        parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.u, i);
        parcel.writeParcelable(this.v, i);
        parcel.writeParcelable(this.w, i);
        parcel.writeParcelable(this.x, i);
        parcel.writeValue(i());
        parcel.writeTypedList(this.f);
        parcel.writeTypedList(this.g);
        parcel.writeTypedList(this.h);
        parcel.writeSerializable(this.E);
        parcel.writeString(this.F);
        parcel.writeInt(G());
        parcel.writeParcelable(this.z, i);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeTypedList(this.C);
        parcel.writeList(this.D);
        parcel.writeValue(this.h0);
        parcel.writeInt(this.i0 ? 1 : 0);
        parcel.writeParcelable(this.y, i);
    }

    public final java.lang.Long x() {
        long j = this.G;
        if (j != 0) {
            return java.lang.Long.valueOf(j);
        }
        return null;
    }

    public final java.lang.String y() {
        return u03.e0.C(" @ ", new java.lang.CharSequence[]{this.P, this.Q});
    }

    public final java.util.List z() {
        if (this.p == null) {
            this.p = java.util.Collections.unmodifiableList(this.e);
        }
        return this.p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0245, code lost:
    
        if (r9 == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x025f, code lost:
    
        if (r9 == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02d7, code lost:
    
        if (r2 == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02c0, code lost:
    
        if (r2 == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d1, code lost:
    
        if (r7 == 'l') goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Contact(android.os.Parcel parcel) {
        int i;
        java.lang.String z;
        int i2;
        java.lang.String str;
        java.lang.Float f;
        java.lang.Number number;
        this.a = new java.util.ArrayList();
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        this.d = new java.util.ArrayList();
        this.e = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        this.h = new java.util.ArrayList();
        this.i = new java.util.ArrayList();
        this.C = new java.util.ArrayList();
        this.D = new java.util.ArrayList();
        this.E = com.truecaller.data.entity.Contact.LogBizMonFetchedFrom.UNKNOWN;
        this.g0 = -1;
        this.j0 = com.truecaller.data.entity.PremiumLevel.NONE;
        this.G = parcel.readLong();
        this.H = parcel.readString();
        this.I = parcel.readString();
        this.J = parcel.readString();
        this.K = parcel.readString();
        this.L = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.O = parcel.readString();
        this.P = parcel.readString();
        this.Q = parcel.readString();
        this.R = parcel.readString();
        java.lang.String readString = parcel.readString();
        java.lang.Number number2 = null;
        java.lang.Double valueOf = null;
        r6 = null;
        java.lang.String str2 = null;
        if (readString != null) {
            if (!jj3.bar.h(readString)) {
                java.lang.String[] strArr = {"0x", "0X", "-0x", "-0X", "#", "-#"};
                int i3 = 0;
                while (true) {
                    if (i3 >= 6) {
                        i = 0;
                        break;
                    }
                    java.lang.String str3 = strArr[i3];
                    if (readString.startsWith(str3)) {
                        i = str3.length();
                        break;
                    }
                    i3++;
                }
                if (i > 0) {
                    char c = 0;
                    int i4 = i;
                    while (i < readString.length() && (c = readString.charAt(i)) == '0') {
                        i4++;
                        i++;
                    }
                    int length = readString.length() - i4;
                    if (length > 16 || (length == 16 && c > '7')) {
                        number = lf0.r0.x(readString);
                    } else if (length <= 8 && (length != 8 || c <= '7')) {
                        number = java.lang.Integer.decode(readString);
                    } else {
                        number = java.lang.Long.decode(readString);
                    }
                } else {
                    char charAt = readString.charAt(readString.length() - 1);
                    int indexOf = readString.indexOf(46);
                    int indexOf2 = readString.indexOf(69) + readString.indexOf(101);
                    int i5 = indexOf2 + 1;
                    if (indexOf > -1) {
                        if (i5 > -1) {
                            if (i5 >= indexOf && i5 <= readString.length()) {
                                str = readString.substring(indexOf + 1, i5);
                            } else {
                                throw new java.lang.NumberFormatException(readString.concat(" is not a valid number."));
                            }
                        } else {
                            str = readString.substring(indexOf + 1);
                        }
                        z = lf0.r0.z(indexOf, readString);
                        i2 = str.length();
                    } else {
                        if (i5 > -1) {
                            if (i5 <= readString.length()) {
                                z = lf0.r0.z(i5, readString);
                            } else {
                                throw new java.lang.NumberFormatException(readString.concat(" is not a valid number."));
                            }
                        } else {
                            z = lf0.r0.z(readString.length(), readString);
                        }
                        i2 = 0;
                        str = null;
                    }
                    if (!java.lang.Character.isDigit(charAt) && charAt != '.') {
                        java.lang.String m = (i5 <= -1 || i5 >= readString.length() - 1) ? null : f63.qux.m(1, indexOf2 + 2, readString);
                        java.lang.String m2 = f63.qux.m(1, 0, readString);
                        boolean z2 = lf0.r0.B(z) && lf0.r0.B(m);
                        if (charAt != 'D') {
                            if (charAt != 'F') {
                                if (charAt != 'L') {
                                    if (charAt != 'd') {
                                        if (charAt != 'f') {
                                        }
                                    }
                                }
                                if (str == null && m == null) {
                                    if (m2.charAt(0) == '-') {
                                        java.lang.String substring = m2.substring(1);
                                        if (!jj3.bar.i(substring)) {
                                            for (int i6 = 0; i6 < substring.length(); i6++) {
                                                if (java.lang.Character.isDigit(substring.charAt(i6))) {
                                                }
                                            }
                                            try {
                                                number = java.lang.Long.decode(m2);
                                            } catch (java.lang.NumberFormatException unused) {
                                                number = lf0.r0.x(m2);
                                            }
                                        }
                                    }
                                    if (!jj3.bar.i(m2)) {
                                        for (int i7 = 0; i7 < m2.length(); i7++) {
                                            if (java.lang.Character.isDigit(m2.charAt(i7))) {
                                            }
                                        }
                                        number = java.lang.Long.decode(m2);
                                    }
                                }
                                throw new java.lang.NumberFormatException(readString.concat(" is not a valid number."));
                            }
                            if (m2 == null) {
                                f = null;
                            } else {
                                try {
                                    f = java.lang.Float.valueOf(m2);
                                } catch (java.lang.NumberFormatException unused2) {
                                }
                            }
                            if (!f.isInfinite()) {
                                float floatValue = f.floatValue();
                                number = f;
                                number = f;
                                if (floatValue == 0.0f) {
                                }
                            }
                        }
                        if (m2 != null) {
                            try {
                                valueOf = java.lang.Double.valueOf(m2);
                            } catch (java.lang.NumberFormatException unused3) {
                            }
                        }
                        if (!valueOf.isInfinite()) {
                            double floatValue2 = valueOf.floatValue();
                            number2 = valueOf;
                            number2 = valueOf;
                            if (floatValue2 == 0.0d) {
                            }
                        }
                        try {
                            number = lf0.r0.w(m2);
                        } catch (java.lang.NumberFormatException unused4) {
                            throw new java.lang.NumberFormatException(readString.concat(" is not a valid number."));
                        }
                    } else {
                        if (i5 > -1 && i5 < readString.length() - 1) {
                            str2 = readString.substring(indexOf2 + 2, readString.length());
                        }
                        if (str == null && str2 == null) {
                            try {
                                try {
                                    number = java.lang.Integer.decode(readString);
                                } catch (java.lang.NumberFormatException unused5) {
                                    number = lf0.r0.x(readString);
                                }
                            } catch (java.lang.NumberFormatException unused6) {
                                number = java.lang.Long.decode(readString);
                            }
                        } else {
                            boolean z3 = lf0.r0.B(z) && lf0.r0.B(str2);
                            if (i2 <= 7) {
                                try {
                                    java.lang.Float valueOf2 = java.lang.Float.valueOf(readString);
                                    if (!valueOf2.isInfinite()) {
                                        float floatValue3 = valueOf2.floatValue();
                                        number2 = valueOf2;
                                        number2 = valueOf2;
                                        if (floatValue3 == 0.0f) {
                                        }
                                    }
                                } catch (java.lang.NumberFormatException unused7) {
                                }
                            }
                            if (i2 <= 16) {
                                try {
                                    java.lang.Double valueOf3 = java.lang.Double.valueOf(readString);
                                    if (!valueOf3.isInfinite()) {
                                        double doubleValue = valueOf3.doubleValue();
                                        number2 = valueOf3;
                                        number2 = valueOf3;
                                        if (doubleValue == 0.0d) {
                                        }
                                    }
                                } catch (java.lang.NumberFormatException unused8) {
                                }
                            }
                            number = lf0.r0.w(readString);
                        }
                    }
                }
                number2 = number;
            } else {
                throw new java.lang.NumberFormatException("A blank string is not a valid number");
            }
        }
        this.T = number2;
        this.Y = parcel.readLong();
        this.c0 = parcel.readString();
        this.W = parcel.readInt();
        this.X = parcel.readInt();
        this.Z = parcel.readLong();
        this.a0 = parcel.readLong();
        this.b0 = parcel.readLong();
        this.d0 = parcel.readString();
        this.e0 = parcel.readString();
        this.f0 = parcel.readInt() == 1;
        this.g0 = parcel.readInt();
        this.k0 = parcel.readInt();
        this.V = parcel.readInt() == 1;
        this.a.addAll(parcel.createTypedArrayList(com.truecaller.contact.entity.model.AddressEntity.CREATOR));
        this.b.addAll(parcel.createTypedArrayList(com.truecaller.data.entity.Number.CREATOR));
        this.c.addAll(parcel.createTypedArrayList(com.truecaller.contact.entity.model.TagEntity.CREATOR));
        this.d.addAll(parcel.createTypedArrayList(com.truecaller.contact.entity.model.SourceEntity.CREATOR));
        this.e.addAll(parcel.createTypedArrayList(com.truecaller.contact.entity.model.LinkEntity.CREATOR));
        this.t = parcel.readInt();
        this.j = (android.net.Uri) parcel.readParcelable(android.net.Uri.class.getClassLoader());
        this.k = parcel.readByte() != 0;
        this.u = parcel.readParcelable(com.truecaller.contact.entity.model.StructuredNameEntity.class.getClassLoader());
        this.v = parcel.readParcelable(com.truecaller.contact.entity.model.NoteEntity.class.getClassLoader());
        this.w = parcel.readParcelable(com.truecaller.contact.entity.model.BusinessProfileEntity.class.getClassLoader());
        this.x = parcel.readParcelable(com.truecaller.contact.entity.model.SpamInfoEntity.class.getClassLoader());
        this.T = (java.lang.Long) parcel.readValue(java.lang.Long.class.getClassLoader());
        this.f.addAll(parcel.createTypedArrayList(com.truecaller.contact.entity.model.SearchWarningEntity.CREATOR));
        this.g.addAll(parcel.createTypedArrayList(com.truecaller.contact.entity.model.ContactSurveyEntity.CREATOR));
        this.h.addAll(parcel.createTypedArrayList(com.truecaller.contact.entity.model.ElectedTagEntity.CREATOR));
        this.E = (com.truecaller.data.entity.Contact.LogBizMonFetchedFrom) parcel.readSerializable();
        this.F = parcel.readString();
        this.U = java.lang.Integer.valueOf(parcel.readInt());
        this.z = parcel.readParcelable(com.truecaller.contact.entity.model.SenderIdEntity.class.getClassLoader());
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.createTypedArrayList(com.truecaller.data.entity.SpamCategoryModel.CREATOR);
        parcel.readList(this.D, java.lang.Long.class.getClassLoader());
        this.h0 = (java.lang.Integer) parcel.readValue(java.lang.Integer.class.getClassLoader());
        this.i0 = parcel.readInt() == 1;
        this.y = parcel.readParcelable(com.truecaller.contact.entity.model.FeedbackEntity.class.getClassLoader());
    }
}
