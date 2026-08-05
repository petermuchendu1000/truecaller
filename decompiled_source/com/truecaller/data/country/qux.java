package com.truecaller.data.country;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class qux {
    public static final java.lang.Object e = kotlin.collections.r0.i(new kotlin.Pair[]{new kotlin.Pair("ca", new java.lang.String[]{"1403", "1587", "1780", "1825", "1236", "1250", "1604", "1672", "1778", "1204", "1431", "1506", "1709", "1902", "1226", "1249", "1289", "1343", "1365", "1416", "1437", "1519", "1613", "1647", "1705", "1807", "1905", "1418", "1438", "1450", "1514", "1579", "1581", "1819", "1873", "1306", "1639", "1867"}), new kotlin.Pair("kz", new java.lang.String[]{"733622", "76", "77"})});
    public com.truecaller.data.country.CountryListDto a;
    public java.util.Map b;
    public java.util.Map c;
    public java.util.Map d;

    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Map, java.lang.Object] */
    public qux(com.truecaller.data.country.CountryListDto countryListDto) {
        com.truecaller.data.country.CountryListDto.baz bazVar;
        java.util.List<com.truecaller.data.country.CountryListDto.bar> list;
        java.lang.String lowerCase;
        java.lang.String trim;
        this.a = countryListDto;
        this.b = new java.util.LinkedHashMap();
        this.c = new java.util.LinkedHashMap();
        this.d = new java.util.LinkedHashMap();
        if (this.a == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        com.truecaller.data.country.CountryListDto countryListDto2 = this.a;
        if (countryListDto2 != null && (bazVar = countryListDto2.countryList) != null && (list = bazVar.b) != null) {
            java.util.ArrayList T = kotlin.collections.CollectionsKt.T(list);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = T.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                java.lang.String str = ((com.truecaller.data.country.CountryListDto.bar) next).c;
                if (str != null && str.length() != 0) {
                    arrayList.add(next);
                }
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.truecaller.data.country.CountryListDto.bar barVar = (com.truecaller.data.country.CountryListDto.bar) it2.next();
                java.lang.String str2 = barVar.c;
                java.util.Locale locale = java.util.Locale.ENGLISH;
                if (str2 == null) {
                    lowerCase = null;
                } else {
                    lowerCase = str2.toLowerCase(locale);
                }
                java.lang.String str3 = barVar.b;
                if (str3 == null) {
                    trim = null;
                } else {
                    trim = str3.trim();
                }
                java.lang.String lowerCase2 = trim != null ? trim.toLowerCase() : null;
                hashMap.put(lowerCase, barVar);
                hashMap2.put(lowerCase2, barVar);
                java.lang.String[] strArr = (java.lang.String[]) e.get(lowerCase);
                if (strArr != null && strArr.length != 0) {
                    for (java.lang.String str4 : strArr) {
                        hashMap3.put(str4, barVar);
                    }
                } else {
                    java.lang.String str5 = barVar.d;
                    if (str5 != null) {
                        hashMap3.put(str5, barVar);
                    }
                }
            }
        }
        this.b = hashMap;
        this.c = hashMap2;
        this.d = hashMap3;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!com.truecaller.data.country.qux.class.equals(cls)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.e(obj, "null cannot be cast to non-null type com.truecaller.data.country.CountryDataStore");
        com.truecaller.data.country.qux quxVar = (com.truecaller.data.country.qux) obj;
        if (kotlin.jvm.internal.Intrinsics.b(this.a, quxVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, quxVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, quxVar.c) && kotlin.jvm.internal.Intrinsics.b(this.d, quxVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        com.truecaller.data.country.CountryListDto countryListDto = this.a;
        if (countryListDto != null) {
            i = countryListDto.hashCode();
        } else {
            i = 0;
        }
        return this.d.hashCode() + k9.d.l(this.c, k9.d.l(this.b, i * 31, 31), 31);
    }
}
