package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class z0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public com.truecaller.data.entity.Contact A;
    public java.lang.String B;
    public com.truecaller.blocking.FilterMatch C;
    public com.truecaller.data.entity.Contact D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public final /* synthetic */ java.util.List L;
    public final /* synthetic */ java.util.ArrayList M;
    public final /* synthetic */ com.truecaller.search.global.a1 N;
    public com.truecaller.search.global.a1 x;
    public java.util.Collection y;
    public java.util.Iterator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(java.util.List list, java.util.ArrayList arrayList, com.truecaller.search.global.a1 a1Var, df3.bar barVar) {
        super(2, barVar);
        this.L = list;
        this.M = arrayList;
        this.N = a1Var;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.search.global.z0(this.L, this.M, this.N, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x022b  */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0207 -> B:7:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x021f -> B:9:0x0222). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        com.truecaller.search.global.a1 a1Var;
        int i;
        int i2;
        int i3;
        java.util.Iterator it3;
        java.lang.String str;
        com.truecaller.blocking.FilterMatch filterMatch;
        com.truecaller.data.entity.Contact contact;
        int i4;
        int i5;
        int i6;
        java.util.ArrayList arrayList2;
        com.truecaller.data.entity.Contact contact2;
        int i7;
        int i8;
        java.lang.Object obj2;
        java.util.ArrayList arrayList3;
        com.truecaller.search.global.e eVar;
        java.lang.Object W;
        com.truecaller.blocking.FilterMatch filterMatch2;
        com.truecaller.data.entity.Contact contact3;
        java.lang.String str2;
        com.truecaller.data.entity.Contact contact4;
        int i9;
        int i10;
        com.truecaller.search.global.a1 a1Var2;
        java.util.ArrayList arrayList4;
        java.util.Iterator it4;
        com.truecaller.data.entity.Contact contact5;
        java.lang.String str3;
        com.truecaller.data.entity.Contact contact6;
        int i11;
        int i12;
        int i14;
        int i15;
        int i16;
        java.lang.Object obj3;
        ef3.bar barVar = ef3.bar.a;
        int i17 = this.K;
        com.truecaller.search.global.e eVar2 = null;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        boolean z = this.J;
                        int i18 = this.G;
                        i5 = this.F;
                        int i19 = this.E;
                        contact = this.D;
                        com.truecaller.blocking.FilterMatch filterMatch3 = this.C;
                        str = this.B;
                        java.util.Iterator it5 = this.z;
                        java.util.Collection collection = this.y;
                        com.truecaller.search.global.a1 a1Var3 = this.x;
                        od.p.E(obj);
                        boolean z2 = z;
                        eVar = null;
                        com.truecaller.blocking.FilterMatch filterMatch4 = filterMatch3;
                        int i20 = i19;
                        int i21 = i18;
                        arrayList3 = collection;
                        it3 = it5;
                        a1Var = a1Var3;
                        W = obj;
                        com.truecaller.data.entity.Contact contact7 = contact;
                        int i22 = i5;
                        com.truecaller.search.global.e eVar3 = new com.truecaller.search.global.e(contact7, str, filterMatch4, z2, ((java.lang.Boolean) W).booleanValue());
                        i2 = i22;
                        i3 = i20;
                        it = it3;
                        arrayList = arrayList3;
                        if (eVar3 != null) {
                            arrayList.add(eVar3);
                        }
                        eVar2 = eVar;
                        i = i21;
                        if (!it.hasNext()) {
                            kotlin.Pair pair = (kotlin.Pair) it.next();
                            contact3 = (com.truecaller.data.entity.Contact) pair.a;
                            str2 = (java.lang.String) pair.b;
                            o81.qux a = a1Var.e.a();
                            contact4 = a1Var.b.i(contact3);
                            if (contact4 != null) {
                                java.util.List list = contact4.D;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "getSpamCategoryIds(...)");
                                java.util.List a2 = a.a(list);
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact4, "<this>");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "categories");
                                if (!a2.isEmpty()) {
                                    contact4.C = a2;
                                }
                                com.truecaller.data.entity.Number r = contact4.r();
                                if (r != null) {
                                    ij0.e eVar4 = a1Var.a;
                                    java.lang.String str4 = r.f;
                                    java.lang.String str5 = r.e;
                                    this.x = a1Var;
                                    this.y = arrayList;
                                    this.z = it;
                                    this.A = contact3;
                                    this.B = str2;
                                    this.C = eVar2;
                                    this.D = contact4;
                                    this.E = i3;
                                    this.F = i2;
                                    this.G = i;
                                    this.H = 0;
                                    this.I = 0;
                                    this.K = 1;
                                    obj3 = eVar4.e(str4, false, str5, this);
                                    if (obj3 != barVar) {
                                        i16 = 0;
                                        a1Var2 = a1Var;
                                        arrayList4 = arrayList;
                                        it4 = it;
                                        contact5 = contact3;
                                        str3 = str2;
                                        contact6 = contact4;
                                        i11 = i3;
                                        i12 = i2;
                                        i14 = i;
                                        i15 = 0;
                                        com.truecaller.search.global.a1 a1Var4 = a1Var2;
                                        filterMatch2 = (com.truecaller.blocking.FilterMatch) obj3;
                                        i10 = i16;
                                        i9 = i15;
                                        i = i14;
                                        i2 = i12;
                                        i3 = i11;
                                        contact4 = contact6;
                                        str2 = str3;
                                        contact3 = contact5;
                                        it = it4;
                                        arrayList = arrayList4;
                                        a1Var = a1Var4;
                                        su0.u uVar = a1Var.f;
                                        this.x = a1Var;
                                        this.y = arrayList;
                                        this.z = it;
                                        this.A = contact3;
                                        this.B = str2;
                                        this.C = filterMatch2;
                                        this.D = contact4;
                                        this.E = i3;
                                        this.F = i2;
                                        this.G = i;
                                        this.H = i9;
                                        this.I = i10;
                                        this.K = 2;
                                        int i24 = i10;
                                        int i25 = i9;
                                        int i26 = i;
                                        obj2 = fg3.h0.W(uVar.a, new rv2.b0(contact3, uVar, null, 16), this);
                                        if (obj2 != barVar) {
                                            com.truecaller.data.entity.Contact contact8 = contact4;
                                            i5 = i2;
                                            contact2 = contact3;
                                            contact = contact8;
                                            com.truecaller.blocking.FilterMatch filterMatch5 = filterMatch2;
                                            it3 = it;
                                            filterMatch = filterMatch5;
                                            arrayList2 = arrayList;
                                            i8 = i24;
                                            i7 = i25;
                                            str = str2;
                                            i4 = i3;
                                            i6 = i26;
                                            boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
                                            y12.o0 o0Var = a1Var.g;
                                            this.x = a1Var;
                                            arrayList3 = arrayList2;
                                            this.y = arrayList3;
                                            this.z = it3;
                                            this.A = null;
                                            this.B = str;
                                            this.C = filterMatch;
                                            this.D = contact;
                                            this.E = i4;
                                            this.F = i5;
                                            this.G = i6;
                                            this.H = i7;
                                            this.I = i8;
                                            this.J = booleanValue;
                                            this.K = 3;
                                            eVar = null;
                                            W = fg3.h0.W(o0Var.d, new xy1.n(contact2, o0Var, (df3.bar) null, 6), this);
                                            if (W != barVar) {
                                                filterMatch4 = filterMatch;
                                                i20 = i4;
                                                i21 = i6;
                                                z2 = booleanValue;
                                                com.truecaller.data.entity.Contact contact72 = contact;
                                                int i222 = i5;
                                                com.truecaller.search.global.e eVar32 = new com.truecaller.search.global.e(contact72, str, filterMatch4, z2, ((java.lang.Boolean) W).booleanValue());
                                                i2 = i222;
                                                i3 = i20;
                                                it = it3;
                                                arrayList = arrayList3;
                                                if (eVar32 != null) {
                                                }
                                                eVar2 = eVar;
                                                i = i21;
                                                if (!it.hasNext()) {
                                                    return arrayList;
                                                }
                                            }
                                        }
                                    }
                                    return barVar;
                                }
                                i10 = 0;
                                i9 = 0;
                                filterMatch2 = null;
                                su0.u uVar2 = a1Var.f;
                                this.x = a1Var;
                                this.y = arrayList;
                                this.z = it;
                                this.A = contact3;
                                this.B = str2;
                                this.C = filterMatch2;
                                this.D = contact4;
                                this.E = i3;
                                this.F = i2;
                                this.G = i;
                                this.H = i9;
                                this.I = i10;
                                this.K = 2;
                                int i242 = i10;
                                int i252 = i9;
                                int i262 = i;
                                obj2 = fg3.h0.W(uVar2.a, new rv2.b0(contact3, uVar2, null, 16), this);
                                if (obj2 != barVar) {
                                }
                                return barVar;
                            }
                            eVar = eVar2;
                            i21 = i;
                            eVar32 = eVar;
                            if (eVar32 != null) {
                            }
                            eVar2 = eVar;
                            i = i21;
                            if (!it.hasNext()) {
                            }
                        }
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    int i27 = this.I;
                    int i28 = this.H;
                    i6 = this.G;
                    i5 = this.F;
                    i4 = this.E;
                    contact = this.D;
                    filterMatch = this.C;
                    str = this.B;
                    com.truecaller.data.entity.Contact contact9 = this.A;
                    it3 = this.z;
                    java.util.Collection collection2 = this.y;
                    com.truecaller.search.global.a1 a1Var5 = this.x;
                    od.p.E(obj);
                    a1Var = a1Var5;
                    contact2 = contact9;
                    arrayList2 = collection2;
                    i7 = i28;
                    i8 = i27;
                    obj2 = obj;
                    boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
                    y12.o0 o0Var2 = a1Var.g;
                    this.x = a1Var;
                    arrayList3 = arrayList2;
                    this.y = arrayList3;
                    this.z = it3;
                    this.A = null;
                    this.B = str;
                    this.C = filterMatch;
                    this.D = contact;
                    this.E = i4;
                    this.F = i5;
                    this.G = i6;
                    this.H = i7;
                    this.I = i8;
                    this.J = booleanValue2;
                    this.K = 3;
                    eVar = null;
                    W = fg3.h0.W(o0Var2.d, new xy1.n(contact2, o0Var2, (df3.bar) null, 6), this);
                    if (W != barVar) {
                    }
                    return barVar;
                }
            } else {
                int i29 = this.I;
                int i30 = this.H;
                int i31 = this.G;
                int i32 = this.F;
                int i34 = this.E;
                com.truecaller.data.entity.Contact contact10 = this.D;
                com.truecaller.data.entity.Number number = this.C;
                java.lang.String str6 = this.B;
                com.truecaller.data.entity.Contact contact11 = this.A;
                java.util.Iterator it6 = this.z;
                java.util.Collection collection3 = this.y;
                com.truecaller.search.global.a1 a1Var6 = this.x;
                od.p.E(obj);
                a1Var2 = a1Var6;
                arrayList4 = collection3;
                it4 = it6;
                contact5 = contact11;
                str3 = str6;
                contact6 = contact10;
                i11 = i34;
                i12 = i32;
                i14 = i31;
                i15 = i30;
                i16 = i29;
                obj3 = obj;
                com.truecaller.search.global.a1 a1Var42 = a1Var2;
                filterMatch2 = (com.truecaller.blocking.FilterMatch) obj3;
                i10 = i16;
                i9 = i15;
                i = i14;
                i2 = i12;
                i3 = i11;
                contact4 = contact6;
                str2 = str3;
                contact3 = contact5;
                it = it4;
                arrayList = arrayList4;
                a1Var = a1Var42;
                su0.u uVar22 = a1Var.f;
                this.x = a1Var;
                this.y = arrayList;
                this.z = it;
                this.A = contact3;
                this.B = str2;
                this.C = filterMatch2;
                this.D = contact4;
                this.E = i3;
                this.F = i2;
                this.G = i;
                this.H = i9;
                this.I = i10;
                this.K = 2;
                int i2422 = i10;
                int i2522 = i9;
                int i2622 = i;
                obj2 = fg3.h0.W(uVar22.a, new rv2.b0(contact3, uVar22, null, 16), this);
                if (obj2 != barVar) {
                }
                return barVar;
            }
        } else {
            od.p.E(obj);
            java.util.List list2 = this.L;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            for (java.lang.Object obj4 : list2) {
                if (!kotlin.collections.CollectionsKt.N(this.M, ((com.truecaller.data.entity.Contact) ((kotlin.Pair) obj4).a).H)) {
                    arrayList5.add(obj4);
                }
            }
            arrayList = new java.util.ArrayList();
            it = arrayList5.iterator();
            a1Var = this.N;
            i = 0;
            i2 = 0;
            i3 = 0;
            if (!it.hasNext()) {
            }
        }
    }
}
