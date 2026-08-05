package com.truecaller.data.country;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class a {
    public final android.content.Context a;

    public a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.data.country.CountryListDto$bar, java.lang.Object] */
    public static com.truecaller.data.country.CountryListDto.bar a(java.io.DataInputStream dataInputStream) {
        ?? obj = new java.lang.Object();
        obj.a = dataInputStream.readUTF();
        obj.b = dataInputStream.readUTF();
        obj.c = dataInputStream.readUTF();
        obj.d = dataInputStream.readUTF();
        return obj;
    }

    public static com.truecaller.data.country.CountryListDto b(java.io.InputStream inputStream) {
        java.io.BufferedInputStream bufferedInputStream;
        if (inputStream instanceof java.io.BufferedInputStream) {
            bufferedInputStream = (java.io.BufferedInputStream) inputStream;
        } else {
            bufferedInputStream = new java.io.BufferedInputStream(inputStream, 8192);
        }
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(bufferedInputStream);
        try {
            com.truecaller.data.country.CountryListDto c = c(dataInputStream);
            dataInputStream.close();
            return c;
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.truecaller.data.country.CountryListDto$baz] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, com.truecaller.data.country.CountryListDto$baz] */
    public static com.truecaller.data.country.CountryListDto c(java.io.DataInputStream dataInputStream) {
        com.truecaller.data.country.CountryListDto countryListDto = new com.truecaller.data.country.CountryListDto();
        countryListDto.countryListChecksum = dataInputStream.readUTF();
        ?? obj = new java.lang.Object();
        if (dataInputStream.readBoolean()) {
            obj.a = a(dataInputStream);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int readInt = dataInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            arrayList.add(a(dataInputStream));
        }
        obj.b = arrayList;
        countryListDto.countryList = obj;
        ?? obj2 = new java.lang.Object();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int readInt2 = dataInputStream.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            arrayList2.add(a(dataInputStream));
        }
        obj2.b = arrayList2;
        countryListDto.suggestedCountryList = obj2;
        return countryListDto;
    }

    public static void d(java.io.DataOutputStream dataOutputStream, com.truecaller.data.country.CountryListDto.bar barVar) {
        dataOutputStream.writeUTF(barVar.a);
        dataOutputStream.writeUTF(barVar.b);
        dataOutputStream.writeUTF(barVar.c);
        dataOutputStream.writeUTF(barVar.d);
    }

    public static void e(java.io.DataOutputStream dataOutputStream, com.truecaller.data.country.CountryListDto countryListDto) {
        com.truecaller.data.country.CountryListDto.bar barVar;
        java.util.List<com.truecaller.data.country.CountryListDto.bar> list;
        dataOutputStream.writeUTF(countryListDto.countryListChecksum);
        com.truecaller.data.country.CountryListDto.baz bazVar = countryListDto.countryList;
        java.util.List<com.truecaller.data.country.CountryListDto.bar> list2 = null;
        if (bazVar != null) {
            barVar = bazVar.a;
        } else {
            barVar = null;
        }
        if (barVar == null) {
            dataOutputStream.writeBoolean(false);
        } else {
            dataOutputStream.writeBoolean(true);
            d(dataOutputStream, barVar);
        }
        com.truecaller.data.country.CountryListDto.baz bazVar2 = countryListDto.countryList;
        if (bazVar2 != null) {
            list = bazVar2.b;
        } else {
            list = null;
        }
        if (list == null) {
            list = kotlin.collections.h0.a;
        }
        dataOutputStream.writeInt(list.size());
        for (com.truecaller.data.country.CountryListDto.bar barVar2 : list) {
            kotlin.jvm.internal.Intrinsics.d(barVar2);
            d(dataOutputStream, barVar2);
        }
        com.truecaller.data.country.CountryListDto.baz bazVar3 = countryListDto.suggestedCountryList;
        if (bazVar3 != null) {
            list2 = bazVar3.b;
        }
        if (list2 == null) {
            list2 = kotlin.collections.h0.a;
        }
        dataOutputStream.writeInt(list2.size());
        for (com.truecaller.data.country.CountryListDto.bar barVar3 : list2) {
            kotlin.jvm.internal.Intrinsics.d(barVar3);
            d(dataOutputStream, barVar3);
        }
    }
}
