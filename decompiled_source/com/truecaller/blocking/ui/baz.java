package com.truecaller.blocking.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class baz {
    public final dj0.j a;

    public baz(dj0.j jVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "blockManager");
        this.a = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x0310, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r11v12, types: [int] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x03be -> B:12:0x03c5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(qj0.d dVar, ff3.qux quxVar) {
        qj0.e eVar;
        int i;
        boolean z;
        java.lang.String str;
        java.lang.Boolean bool;
        java.lang.Long l;
        java.lang.Integer num;
        java.util.Iterator it;
        java.lang.Boolean bool2;
        java.util.List list;
        java.lang.String str2;
        ?? r11;
        com.truecaller.blocking.ui.BlockRequest blockRequest;
        int i2;
        java.util.List list2;
        com.truecaller.blocking.ui.BlockRequest blockRequest2;
        java.lang.Boolean bool3;
        java.lang.Long l2;
        java.lang.String str3;
        java.util.Iterator it2;
        int i3;
        int i4;
        int intValue;
        java.util.Iterator it3;
        int i5;
        java.util.List list3;
        com.truecaller.blocking.ui.BlockRequest blockRequest3;
        java.lang.Boolean bool4;
        java.lang.String str4;
        java.util.Iterator it4;
        int i6;
        boolean z2;
        com.truecaller.blocking.api.model.TrackingType trackingType;
        java.lang.String str5;
        java.lang.String str6;
        kotlin.Pair pair;
        kotlin.Pair pair2;
        java.util.Iterator it5;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.Integer num2;
        kotlin.Pair pair3;
        kotlin.Pair pair4;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.Integer num3;
        kotlin.Pair pair5;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.Integer num4;
        kotlin.Pair pair6;
        kotlin.Pair pair7;
        com.truecaller.blocking.api.model.TrackingType trackingType2;
        com.truecaller.blocking.api.model.TrackingType trackingType3;
        com.truecaller.blocking.ui.baz bazVar = this;
        if (quxVar instanceof qj0.e) {
            eVar = (qj0.e) quxVar;
            int i7 = eVar.I;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                eVar.I = i7 - Integer.MIN_VALUE;
                java.lang.Object obj = eVar.G;
                ef3.bar barVar = ef3.bar.a;
                i = eVar.I;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                i4 = eVar.F;
                                i2 = eVar.E;
                                int i8 = eVar.D;
                                java.util.Iterator it6 = eVar.C;
                                java.lang.String str13 = eVar.B;
                                java.lang.Long l3 = eVar.A;
                                bool2 = eVar.z;
                                blockRequest = eVar.y;
                                list = eVar.x;
                                od.p.E(obj);
                                i5 = i8;
                                intValue = ((java.lang.Number) obj).intValue();
                                it3 = it6;
                                str2 = str13;
                                l2 = l3;
                                num = new java.lang.Integer(i4 + intValue);
                                bazVar = this;
                                l = l2;
                                it = it3;
                                r11 = i5;
                                if (it.hasNext()) {
                                    com.truecaller.blocking.ui.BlockRequest.BlockPolicy blockPolicy = (com.truecaller.blocking.ui.BlockRequest.BlockPolicy) it.next();
                                    int intValue2 = num.intValue();
                                    boolean z3 = blockPolicy instanceof com.truecaller.blocking.ui.BlockRequest.BlockPolicy.ImId;
                                    dj0.j jVar = bazVar.a;
                                    if (z3) {
                                        java.util.List list4 = ((com.truecaller.blocking.ui.BlockRequest.BlockPolicy.ImId) blockPolicy).a;
                                        java.lang.String str14 = blockRequest.h;
                                        if (str14 != null) {
                                            com.truecaller.blocking.api.model.TrackingType.Companion.getClass();
                                            trackingType3 = fj0.d.a(str14);
                                        } else {
                                            trackingType3 = null;
                                        }
                                        java.lang.String str15 = blockRequest.i;
                                        com.truecaller.blocking.api.model.EntityType.Companion.getClass();
                                        com.truecaller.blocking.api.model.EntityType a = fj0.bar.a(bool2);
                                        boolean z4 = blockRequest.j;
                                        com.truecaller.blocking.api.model.WildCardType wildCardType = blockRequest.k;
                                        boolean z5 = blockRequest.n;
                                        eVar.x = list;
                                        eVar.y = blockRequest;
                                        eVar.z = bool2;
                                        eVar.A = l;
                                        eVar.B = str2;
                                        eVar.C = it;
                                        eVar.D = r11;
                                        eVar.E = i2;
                                        eVar.F = intValue2;
                                        eVar.I = 1;
                                        java.lang.Long l4 = l;
                                        java.lang.String str16 = str2;
                                        java.lang.Object W = fg3.h0.W(jVar.b, new dj0.a(jVar, list4, trackingType3, str16, str15, z4, wildCardType, a, l4, z5, null), eVar);
                                        if (W != barVar) {
                                            int i9 = r11;
                                            str4 = str16;
                                            i4 = intValue2;
                                            bool4 = bool2;
                                            list3 = list;
                                            i6 = i9;
                                            blockRequest3 = blockRequest;
                                            it4 = it;
                                            l2 = l4;
                                            obj = W;
                                            intValue = ((java.lang.Number) obj).intValue();
                                            it3 = it4;
                                            str2 = str4;
                                            blockRequest = blockRequest3;
                                            i5 = i6;
                                            list = list3;
                                            bool2 = bool4;
                                            num = new java.lang.Integer(i4 + intValue);
                                            bazVar = this;
                                            l = l2;
                                            it = it3;
                                            r11 = i5;
                                            if (it.hasNext()) {
                                                return new com.truecaller.blocking.ui.bar(num.intValue(), list);
                                            }
                                        }
                                    } else {
                                        java.lang.String str17 = str2;
                                        java.lang.Long l5 = l;
                                        if (blockPolicy instanceof com.truecaller.blocking.ui.BlockRequest.BlockPolicy.Numbers) {
                                            com.truecaller.blocking.ui.BlockRequest.BlockPolicy.Numbers numbers = (com.truecaller.blocking.ui.BlockRequest.BlockPolicy.Numbers) blockPolicy;
                                            java.util.List list5 = numbers.a;
                                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(list5, 10));
                                            java.util.Iterator it7 = list5.iterator();
                                            while (it7.hasNext()) {
                                                arrayList.add(new com.truecaller.blocking.ui.BlockResult.BlockedData(str17, (java.lang.String) ((kotlin.Pair) it7.next()).a, blockRequest.h));
                                                it7 = it7;
                                                it = it;
                                            }
                                            java.util.Iterator it8 = it;
                                            list.addAll(arrayList);
                                            java.util.List list6 = numbers.a;
                                            java.lang.String str18 = blockRequest.h;
                                            if (str18 != null) {
                                                com.truecaller.blocking.api.model.TrackingType.Companion.getClass();
                                                trackingType2 = fj0.d.a(str18);
                                            } else {
                                                trackingType2 = null;
                                            }
                                            java.lang.String str19 = blockRequest.i;
                                            com.truecaller.blocking.api.model.EntityType.Companion.getClass();
                                            com.truecaller.blocking.api.model.EntityType a2 = fj0.bar.a(bool2);
                                            boolean z6 = blockRequest.j;
                                            com.truecaller.blocking.api.model.WildCardType wildCardType2 = blockRequest.k;
                                            boolean z7 = blockRequest.n;
                                            eVar.x = list;
                                            eVar.y = blockRequest;
                                            eVar.z = bool2;
                                            eVar.A = l5;
                                            eVar.B = str17;
                                            eVar.C = it8;
                                            eVar.D = r11;
                                            eVar.E = i2;
                                            eVar.F = intValue2;
                                            eVar.I = 2;
                                            java.lang.Object W2 = fg3.h0.W(jVar.b, new dj0.a(jVar, list6, trackingType2, str17, str19, z6, wildCardType2, a2, l5, z7, null), eVar);
                                            if (W2 != barVar) {
                                                int i11 = r11;
                                                str3 = str17;
                                                i4 = intValue2;
                                                bool3 = bool2;
                                                list2 = list;
                                                i3 = i11;
                                                l2 = l5;
                                                blockRequest2 = blockRequest;
                                                it2 = it8;
                                                obj = W2;
                                                intValue = ((java.lang.Number) obj).intValue();
                                                it3 = it2;
                                                str2 = str3;
                                                blockRequest = blockRequest2;
                                                i5 = i3;
                                                list = list2;
                                                bool2 = bool3;
                                                num = new java.lang.Integer(i4 + intValue);
                                                bazVar = this;
                                                l = l2;
                                                it = it3;
                                                r11 = i5;
                                                if (it.hasNext()) {
                                                }
                                            }
                                        } else {
                                            java.util.Iterator it9 = it;
                                            if (blockPolicy instanceof com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames) {
                                                com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames numbersAndNames = (com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames) blockPolicy;
                                                if (r11 != 0) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                java.util.List list7 = numbersAndNames.a;
                                                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(list7, 10));
                                                java.util.Iterator it10 = list7.iterator();
                                                while (it10.hasNext()) {
                                                    com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames.Data data = (com.truecaller.blocking.ui.BlockRequest.BlockPolicy.NumbersAndNames.Data) it10.next();
                                                    kotlin.Pair pair8 = data.a;
                                                    com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy suggestedNameReplacePolicy = data.b;
                                                    boolean z8 = z2;
                                                    if (kotlin.jvm.internal.Intrinsics.b(suggestedNameReplacePolicy, com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy.Never.a)) {
                                                        if (pair8 != null && (pair7 = (kotlin.Pair) pair8.a) != null) {
                                                            str11 = (java.lang.String) pair7.a;
                                                        } else {
                                                            str11 = null;
                                                        }
                                                        if (pair8 != null && (pair6 = (kotlin.Pair) pair8.a) != null) {
                                                            str12 = (java.lang.String) pair6.b;
                                                        } else {
                                                            str12 = null;
                                                        }
                                                        it5 = it10;
                                                        kotlin.Pair pair9 = new kotlin.Pair(str11, str12);
                                                        if (pair8 != null) {
                                                            num4 = (java.lang.Integer) pair8.b;
                                                        } else {
                                                            num4 = null;
                                                        }
                                                        pair3 = new kotlin.Pair(pair9, num4);
                                                    } else {
                                                        it5 = it10;
                                                        if (kotlin.jvm.internal.Intrinsics.b(suggestedNameReplacePolicy, com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy.Always.a)) {
                                                            if (pair8 != null && (pair5 = (kotlin.Pair) pair8.a) != null) {
                                                                str9 = (java.lang.String) pair5.a;
                                                            } else {
                                                                str9 = null;
                                                            }
                                                            if (str17 == null) {
                                                                str10 = "";
                                                            } else {
                                                                str10 = str17;
                                                            }
                                                            kotlin.Pair pair10 = new kotlin.Pair(str9, str10);
                                                            if (pair8 != null) {
                                                                num3 = (java.lang.Integer) pair8.b;
                                                            } else {
                                                                num3 = null;
                                                            }
                                                            pair3 = new kotlin.Pair(pair10, num3);
                                                        } else {
                                                            if (!(suggestedNameReplacePolicy instanceof com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy.IfSuggestedNameExists)) {
                                                                break;
                                                            }
                                                            if ((z8 && str17 != null && str17.length() != 0) || (str7 = ((com.truecaller.blocking.ui.BlockRequest.SuggestedNameReplacePolicy.IfSuggestedNameExists) suggestedNameReplacePolicy).a) == null) {
                                                                str7 = str17;
                                                            }
                                                            if (pair8 != null && (pair4 = (kotlin.Pair) pair8.a) != null) {
                                                                str8 = (java.lang.String) pair4.a;
                                                            } else {
                                                                str8 = null;
                                                            }
                                                            kotlin.Pair pair11 = new kotlin.Pair(str8, str7);
                                                            if (pair8 != null) {
                                                                num2 = (java.lang.Integer) pair8.b;
                                                            } else {
                                                                num2 = null;
                                                            }
                                                            pair3 = new kotlin.Pair(pair11, num2);
                                                        }
                                                    }
                                                    arrayList2.add(pair3);
                                                    z2 = z8;
                                                    it10 = it5;
                                                }
                                                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.z.q(arrayList2, 10));
                                                java.util.Iterator it11 = arrayList2.iterator();
                                                while (it11.hasNext()) {
                                                    kotlin.Pair pair12 = (kotlin.Pair) it11.next();
                                                    if (pair12 != null && (pair2 = (kotlin.Pair) pair12.a) != null) {
                                                        str5 = (java.lang.String) pair2.a;
                                                    } else {
                                                        str5 = null;
                                                    }
                                                    if (pair12 != null && (pair = (kotlin.Pair) pair12.a) != null) {
                                                        str6 = (java.lang.String) pair.b;
                                                    } else {
                                                        str6 = null;
                                                    }
                                                    java.util.Iterator it12 = it11;
                                                    arrayList3.add(new com.truecaller.blocking.ui.BlockResult.BlockedData(str6, str5, blockRequest.h));
                                                    it11 = it12;
                                                    arrayList2 = arrayList2;
                                                }
                                                java.util.ArrayList arrayList4 = arrayList2;
                                                list.addAll(arrayList3);
                                                java.lang.String str20 = blockRequest.h;
                                                if (str20 != null) {
                                                    com.truecaller.blocking.api.model.TrackingType.Companion.getClass();
                                                    trackingType = fj0.d.a(str20);
                                                } else {
                                                    trackingType = null;
                                                }
                                                java.lang.String str21 = blockRequest.i;
                                                com.truecaller.blocking.api.model.EntityType.Companion.getClass();
                                                com.truecaller.blocking.api.model.EntityType a3 = fj0.bar.a(bool2);
                                                boolean z9 = blockRequest.j;
                                                com.truecaller.blocking.api.model.WildCardType wildCardType3 = blockRequest.k;
                                                boolean z10 = blockRequest.n;
                                                eVar.x = list;
                                                eVar.y = blockRequest;
                                                eVar.z = bool2;
                                                eVar.A = l5;
                                                eVar.B = str17;
                                                eVar.C = it9;
                                                eVar.D = r11;
                                                eVar.E = i2;
                                                eVar.F = intValue2;
                                                eVar.I = 3;
                                                java.lang.Object W3 = fg3.h0.W(jVar.b, new dj0.b(jVar, arrayList4, trackingType, str21, z9, wildCardType3, a3, l5, z10, null), eVar);
                                                if (W3 != barVar) {
                                                    str13 = str17;
                                                    i4 = intValue2;
                                                    l3 = l5;
                                                    it6 = it9;
                                                    obj = W3;
                                                    i5 = r11;
                                                    intValue = ((java.lang.Number) obj).intValue();
                                                    it3 = it6;
                                                    str2 = str13;
                                                    l2 = l3;
                                                    num = new java.lang.Integer(i4 + intValue);
                                                    bazVar = this;
                                                    l = l2;
                                                    it = it3;
                                                    r11 = i5;
                                                    if (it.hasNext()) {
                                                    }
                                                }
                                            } else {
                                                throw new java.lang.RuntimeException();
                                            }
                                        }
                                    }
                                    return barVar;
                                }
                            } else {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            i4 = eVar.F;
                            i2 = eVar.E;
                            i3 = eVar.D;
                            it2 = eVar.C;
                            str3 = eVar.B;
                            l2 = eVar.A;
                            bool3 = eVar.z;
                            blockRequest2 = eVar.y;
                            list2 = eVar.x;
                            od.p.E(obj);
                            intValue = ((java.lang.Number) obj).intValue();
                            it3 = it2;
                            str2 = str3;
                            blockRequest = blockRequest2;
                            i5 = i3;
                            list = list2;
                            bool2 = bool3;
                            num = new java.lang.Integer(i4 + intValue);
                            bazVar = this;
                            l = l2;
                            it = it3;
                            r11 = i5;
                            if (it.hasNext()) {
                            }
                        }
                    } else {
                        i4 = eVar.F;
                        i2 = eVar.E;
                        i6 = eVar.D;
                        it4 = eVar.C;
                        str4 = eVar.B;
                        l2 = eVar.A;
                        bool4 = eVar.z;
                        blockRequest3 = eVar.y;
                        list3 = eVar.x;
                        od.p.E(obj);
                        intValue = ((java.lang.Number) obj).intValue();
                        it3 = it4;
                        str2 = str4;
                        blockRequest = blockRequest3;
                        i5 = i6;
                        list = list3;
                        bool2 = bool4;
                        num = new java.lang.Integer(i4 + intValue);
                        bazVar = this;
                        l = l2;
                        it = it3;
                        r11 = i5;
                        if (it.hasNext()) {
                        }
                    }
                } else {
                    java.util.ArrayList l6 = ia0.bar.l(obj);
                    com.truecaller.blocking.ui.BlockRequest c = dVar.c();
                    boolean z11 = dVar instanceof qj0.baz;
                    if (z11) {
                        z = ((qj0.baz) dVar).e();
                    } else {
                        z = false;
                    }
                    if (z11) {
                        str = ((qj0.baz) dVar).b();
                    } else {
                        str = null;
                    }
                    if (z11) {
                        bool = java.lang.Boolean.valueOf(((qj0.baz) dVar).a());
                    } else {
                        bool = null;
                    }
                    if (dVar instanceof qj0.qux) {
                        l = ((qj0.qux) dVar).d();
                    } else {
                        l = null;
                    }
                    if (!z) {
                        str = c.a;
                    }
                    java.util.List list8 = c.g;
                    num = new java.lang.Integer(0);
                    it = list8.iterator();
                    bool2 = bool;
                    list = l6;
                    str2 = str;
                    r11 = z;
                    blockRequest = c;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        eVar = new qj0.e(bazVar, quxVar);
        java.lang.Object obj2 = eVar.G;
        ef3.bar barVar2 = ef3.bar.a;
        i = eVar.I;
        if (i == 0) {
        }
    }
}
