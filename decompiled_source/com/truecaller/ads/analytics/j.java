package com.truecaller.ads.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class j implements nc0.t {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final int f;
    public final java.lang.String g;
    public final int h;
    public final int i;
    public final java.util.List j;
    public final java.lang.String k;
    public final com.truecaller.ads.analytics.c l;
    public final java.lang.String m;
    public final java.lang.String n;
    public final java.util.List o;
    public final long p;
    public final long q;
    public final java.lang.String r;
    public final java.lang.String s;
    public final java.lang.Integer t;
    public final java.lang.String u;
    public final java.lang.String v;
    public final qx2.n w;
    public final java.lang.Integer x;
    public final java.lang.String y;

    public j(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.String str6, int i2, int i3, java.util.List list, java.lang.String str7, com.truecaller.ads.analytics.c cVar, java.lang.String str8, java.lang.String str9, java.util.List list2, long j, long j2, java.lang.String str10, java.lang.String str11, java.lang.Integer num, java.lang.String str12, java.lang.String str13, qx2.n nVar, java.lang.Integer num2, java.lang.String str14, int i4) {
        java.lang.String str15 = (i4 & 2) != 0 ? null : str2;
        com.truecaller.ads.analytics.c cVar2 = (i4 & 2048) != 0 ? null : cVar;
        java.lang.String str16 = (i4 & 4096) != 0 ? null : str8;
        java.lang.String str17 = (i4 & 8192) != 0 ? null : str9;
        java.util.List list3 = (i4 & 16384) != 0 ? null : list2;
        java.lang.Integer num3 = (524288 & i4) != 0 ? null : num;
        java.lang.String str18 = (1048576 & i4) != 0 ? null : str12;
        java.lang.String str19 = (2097152 & i4) != 0 ? null : str13;
        qx2.n nVar2 = (i4 & 4194304) != 0 ? null : nVar;
        java.lang.Integer num4 = (i4 & 8388608) != 0 ? null : num2;
        java.lang.String str20 = (i4 & 16777216) != 0 ? null : str14;
        java.lang.Integer num5 = num4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "adRequestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "requestedAdType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "requestConnection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "responseConnection");
        this.a = str;
        this.b = str15;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
        this.h = i2;
        this.i = i3;
        this.j = list;
        this.k = str7;
        this.l = cVar2;
        this.m = str16;
        this.n = str17;
        this.o = list3;
        this.p = j;
        this.q = j2;
        this.r = str10;
        this.s = str11;
        this.t = num3;
        this.u = str18;
        this.v = str19;
        this.w = nVar2;
        this.x = num5;
        this.y = str20;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [qx2.p0, java.lang.Object, ci3.m] */
    /* JADX WARN: Type inference failed for: r5v25, types: [qx2.o, java.lang.Object] */
    @Override // nc0.t
    public final nc0.z a() {
        java.lang.Double d;
        java.lang.Double d2;
        java.lang.String str;
        char c;
        qx2.o oVar;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.String str2;
        qx2.lh lhVar;
        com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        java.lang.CharSequence charSequence3;
        java.lang.CharSequence charSequence4;
        java.lang.CharSequence charSequence5;
        java.lang.CharSequence charSequence6;
        java.lang.CharSequence charSequence7;
        int intValue;
        int intValue2;
        int intValue3;
        java.util.List list;
        java.lang.CharSequence charSequence8;
        qx2.o oVar2;
        java.lang.Double d3;
        java.lang.Double d4;
        java.util.List list2;
        long longValue;
        long longValue2;
        java.lang.CharSequence charSequence9;
        java.lang.CharSequence charSequence10;
        java.lang.Integer num3;
        java.lang.CharSequence charSequence11;
        java.lang.CharSequence charSequence12;
        qx2.n nVar;
        java.lang.Integer num4;
        java.lang.Integer num5;
        java.lang.CharSequence charSequence13;
        java.lang.CharSequence charSequence14;
        o00.z zVar;
        hi3.e eVar = new hi3.e(qx2.p0.E, qx2.p0.F);
        bi3.j0[] j0VarArr = eVar.b;
        bi3.j0 j0Var = j0VarArr[2];
        java.lang.String str3 = this.a;
        hi3.e.d(j0Var, str3);
        ((qx2.o0) eVar).e = str3;
        boolean[] zArr = eVar.c;
        zArr[2] = true;
        bi3.j0 j0Var2 = j0VarArr[4];
        java.lang.String str4 = this.b;
        hi3.e.d(j0Var2, str4);
        ((qx2.o0) eVar).g = str4;
        zArr[4] = true;
        java.lang.String a = ((b50.baz) ((tx.w) wi0.bar.o()).Wa.get()).a();
        hi3.e.d(j0VarArr[3], a);
        ((qx2.o0) eVar).f = a;
        zArr[3] = true;
        bi3.j0 j0Var3 = j0VarArr[5];
        java.lang.String str5 = this.c;
        hi3.e.d(j0Var3, str5);
        ((qx2.o0) eVar).h = str5;
        zArr[5] = true;
        bi3.j0 j0Var4 = j0VarArr[6];
        java.lang.String str6 = this.d;
        hi3.e.d(j0Var4, str6);
        ((qx2.o0) eVar).i = str6;
        zArr[6] = true;
        bi3.j0 j0Var5 = j0VarArr[7];
        java.lang.String str7 = this.e;
        hi3.e.d(j0Var5, str7);
        ((qx2.o0) eVar).j = str7;
        zArr[7] = true;
        bi3.j0 j0Var6 = j0VarArr[9];
        int i = this.f;
        ((qx2.o0) eVar).l = i;
        zArr[9] = true;
        bi3.j0 j0Var7 = j0VarArr[8];
        java.lang.String str8 = this.g;
        hi3.e.d(j0Var7, str8);
        ((qx2.o0) eVar).k = str8;
        zArr[8] = true;
        bi3.j0 j0Var8 = j0VarArr[10];
        ((qx2.o0) eVar).m = this.h;
        zArr[10] = true;
        bi3.j0 j0Var9 = j0VarArr[11];
        ((qx2.o0) eVar).n = this.i;
        zArr[11] = true;
        kotlin.Lazy lazy = com.truecaller.ads.analytics.n.a;
        kotlin.collections.h0 h0Var = this.j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0Var, "requestedAdType");
        if (!((java.lang.Boolean) com.truecaller.ads.analytics.n.a.getValue()).booleanValue()) {
            h0Var = kotlin.collections.h0.a;
        }
        hi3.e.d(j0VarArr[12], h0Var);
        ((qx2.o0) eVar).o = h0Var;
        zArr[12] = true;
        bi3.j0 j0Var10 = j0VarArr[13];
        java.lang.String str9 = this.k;
        hi3.e.d(j0Var10, str9);
        ((qx2.o0) eVar).p = str9;
        zArr[13] = true;
        java.lang.String str10 = this.m;
        if (str10 != null) {
            d = kotlin.text.x.h(str10);
        } else {
            d = null;
        }
        hi3.e.d(j0VarArr[15], d);
        ((qx2.o0) eVar).r = d;
        zArr[15] = true;
        java.lang.String str11 = this.n;
        if (str11 != null) {
            d2 = kotlin.text.x.h(str11);
        } else {
            d2 = null;
        }
        hi3.e.d(j0VarArr[16], d2);
        ((qx2.o0) eVar).s = d2;
        zArr[16] = true;
        bi3.j0 j0Var11 = j0VarArr[17];
        java.util.List list3 = this.o;
        hi3.e.d(j0Var11, list3);
        ((qx2.o0) eVar).t = list3;
        zArr[17] = true;
        bi3.j0 j0Var12 = j0VarArr[18];
        ((qx2.o0) eVar).u = this.p;
        zArr[18] = true;
        bi3.j0 j0Var13 = j0VarArr[19];
        ((qx2.o0) eVar).v = this.q;
        zArr[19] = true;
        bi3.j0 j0Var14 = j0VarArr[20];
        java.lang.String str12 = this.r;
        hi3.e.d(j0Var14, str12);
        ((qx2.o0) eVar).w = str12;
        zArr[20] = true;
        bi3.j0 j0Var15 = j0VarArr[21];
        java.lang.String str13 = this.s;
        hi3.e.d(j0Var15, str13);
        ((qx2.o0) eVar).x = str13;
        zArr[21] = true;
        bi3.j0 j0Var16 = j0VarArr[22];
        java.lang.Integer num6 = this.t;
        hi3.e.d(j0Var16, num6);
        ((qx2.o0) eVar).y = num6;
        zArr[22] = true;
        java.lang.String str14 = this.u;
        if (str14 != null) {
            str = com.truecaller.ads.analytics.b.a(str14);
        } else {
            str = null;
        }
        hi3.e.d(j0VarArr[23], str);
        ((qx2.o0) eVar).z = str;
        zArr[23] = true;
        bi3.j0 j0Var17 = j0VarArr[24];
        java.lang.String str15 = this.v;
        hi3.e.d(j0Var17, str15);
        ((qx2.o0) eVar).A = str15;
        zArr[24] = true;
        com.truecaller.ads.analytics.c cVar = this.l;
        if (cVar != null) {
            c = 4;
            int i2 = cVar.a;
            int i3 = cVar.b;
            ?? obj = new java.lang.Object();
            ((qx2.o) obj).a = i2;
            ((qx2.o) obj).b = i3;
            oVar = obj;
        } else {
            c = 4;
            oVar = null;
        }
        hi3.e.d(j0VarArr[14], oVar);
        ((qx2.o0) eVar).q = oVar;
        zArr[14] = true;
        bi3.j0 j0Var18 = j0VarArr[25];
        qx2.n nVar2 = this.w;
        hi3.e.d(j0Var18, nVar2);
        ((qx2.o0) eVar).B = nVar2;
        zArr[25] = true;
        com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion a2 = a10.w.a(str3);
        if (a2 != null) {
            num = java.lang.Integer.valueOf(a2.getValue());
        } else {
            num = null;
        }
        hi3.e.d(j0VarArr[26], num);
        ((qx2.o0) eVar).C = num;
        zArr[26] = true;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "requestId");
        a10.w.a.remove(str3);
        if (i == com.truecaller.ads.analytics.AdRequestEventSSP.AD_ROUTER_API.getCode()) {
            num2 = this.x;
        } else {
            num2 = null;
        }
        hi3.e.d(j0VarArr[27], num2);
        ((qx2.o0) eVar).D = num2;
        zArr[27] = true;
        if (kotlin.jvm.internal.Intrinsics.b(str5, "MESSAGE_ID") && (zVar = lf.bar.a) != null) {
            str2 = zVar.c;
        } else {
            str2 = null;
        }
        hi3.e.d(j0VarArr[28], str2);
        ((qx2.o0) eVar).E = str2;
        zArr[28] = true;
        bi3.j0 j0Var19 = j0VarArr[29];
        java.lang.String str16 = this.y;
        hi3.e.d(j0Var19, str16);
        ((qx2.o0) eVar).F = str16;
        zArr[29] = true;
        try {
            ?? obj2 = new java.lang.Object();
            if (zArr[0]) {
                lhVar = null;
            } else {
                lhVar = (qx2.lh) eVar.a(j0VarArr[0]);
            }
            ((qx2.p0) obj2).a = lhVar;
            if (zArr[1]) {
                clientHeaderV2 = null;
            } else {
                clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) eVar.a(j0VarArr[1]);
            }
            ((qx2.p0) obj2).b = clientHeaderV2;
            if (zArr[2]) {
                charSequence = ((qx2.o0) eVar).e;
            } else {
                charSequence = (java.lang.CharSequence) eVar.a(j0VarArr[2]);
            }
            ((qx2.p0) obj2).c = charSequence;
            if (zArr[3]) {
                charSequence2 = ((qx2.o0) eVar).f;
            } else {
                charSequence2 = (java.lang.CharSequence) eVar.a(j0VarArr[3]);
            }
            ((qx2.p0) obj2).d = charSequence2;
            if (zArr[c]) {
                charSequence3 = ((qx2.o0) eVar).g;
            } else {
                charSequence3 = (java.lang.CharSequence) eVar.a(j0VarArr[c]);
            }
            ((qx2.p0) obj2).e = charSequence3;
            if (zArr[5]) {
                charSequence4 = ((qx2.o0) eVar).h;
            } else {
                charSequence4 = (java.lang.CharSequence) eVar.a(j0VarArr[5]);
            }
            ((qx2.p0) obj2).f = charSequence4;
            if (zArr[6]) {
                charSequence5 = ((qx2.o0) eVar).i;
            } else {
                charSequence5 = (java.lang.CharSequence) eVar.a(j0VarArr[6]);
            }
            ((qx2.p0) obj2).g = charSequence5;
            if (zArr[7]) {
                charSequence6 = ((qx2.o0) eVar).j;
            } else {
                charSequence6 = (java.lang.CharSequence) eVar.a(j0VarArr[7]);
            }
            ((qx2.p0) obj2).h = charSequence6;
            if (zArr[8]) {
                charSequence7 = ((qx2.o0) eVar).k;
            } else {
                charSequence7 = (java.lang.CharSequence) eVar.a(j0VarArr[8]);
            }
            ((qx2.p0) obj2).i = charSequence7;
            if (zArr[9]) {
                intValue = ((qx2.o0) eVar).l;
            } else {
                intValue = ((java.lang.Integer) eVar.a(j0VarArr[9])).intValue();
            }
            ((qx2.p0) obj2).j = intValue;
            if (zArr[10]) {
                intValue2 = ((qx2.o0) eVar).m;
            } else {
                intValue2 = ((java.lang.Integer) eVar.a(j0VarArr[10])).intValue();
            }
            ((qx2.p0) obj2).k = intValue2;
            if (zArr[11]) {
                intValue3 = ((qx2.o0) eVar).n;
            } else {
                intValue3 = ((java.lang.Integer) eVar.a(j0VarArr[11])).intValue();
            }
            ((qx2.p0) obj2).l = intValue3;
            if (zArr[12]) {
                list = ((qx2.o0) eVar).o;
            } else {
                list = (java.util.List) eVar.a(j0VarArr[12]);
            }
            ((qx2.p0) obj2).m = list;
            if (zArr[13]) {
                charSequence8 = ((qx2.o0) eVar).p;
            } else {
                charSequence8 = (java.lang.CharSequence) eVar.a(j0VarArr[13]);
            }
            ((qx2.p0) obj2).n = charSequence8;
            if (zArr[14]) {
                oVar2 = ((qx2.o0) eVar).q;
            } else {
                oVar2 = (qx2.o) eVar.a(j0VarArr[14]);
            }
            ((qx2.p0) obj2).o = oVar2;
            if (zArr[15]) {
                d3 = ((qx2.o0) eVar).r;
            } else {
                d3 = (java.lang.Double) eVar.a(j0VarArr[15]);
            }
            ((qx2.p0) obj2).p = d3;
            if (zArr[16]) {
                d4 = ((qx2.o0) eVar).s;
            } else {
                d4 = (java.lang.Double) eVar.a(j0VarArr[16]);
            }
            ((qx2.p0) obj2).q = d4;
            if (zArr[17]) {
                list2 = ((qx2.o0) eVar).t;
            } else {
                list2 = (java.util.List) eVar.a(j0VarArr[17]);
            }
            ((qx2.p0) obj2).r = list2;
            if (zArr[18]) {
                longValue = ((qx2.o0) eVar).u;
            } else {
                longValue = ((java.lang.Long) eVar.a(j0VarArr[18])).longValue();
            }
            ((qx2.p0) obj2).s = longValue;
            if (zArr[19]) {
                longValue2 = ((qx2.o0) eVar).v;
            } else {
                longValue2 = ((java.lang.Long) eVar.a(j0VarArr[19])).longValue();
            }
            ((qx2.p0) obj2).t = longValue2;
            if (zArr[20]) {
                charSequence9 = ((qx2.o0) eVar).w;
            } else {
                charSequence9 = (java.lang.CharSequence) eVar.a(j0VarArr[20]);
            }
            ((qx2.p0) obj2).u = charSequence9;
            if (zArr[21]) {
                charSequence10 = ((qx2.o0) eVar).x;
            } else {
                charSequence10 = (java.lang.CharSequence) eVar.a(j0VarArr[21]);
            }
            ((qx2.p0) obj2).v = charSequence10;
            if (zArr[22]) {
                num3 = ((qx2.o0) eVar).y;
            } else {
                num3 = (java.lang.Integer) eVar.a(j0VarArr[22]);
            }
            ((qx2.p0) obj2).w = num3;
            if (zArr[23]) {
                charSequence11 = ((qx2.o0) eVar).z;
            } else {
                charSequence11 = (java.lang.CharSequence) eVar.a(j0VarArr[23]);
            }
            ((qx2.p0) obj2).x = charSequence11;
            if (zArr[24]) {
                charSequence12 = ((qx2.o0) eVar).A;
            } else {
                charSequence12 = (java.lang.CharSequence) eVar.a(j0VarArr[24]);
            }
            ((qx2.p0) obj2).y = charSequence12;
            if (zArr[25]) {
                nVar = ((qx2.o0) eVar).B;
            } else {
                nVar = (qx2.n) eVar.a(j0VarArr[25]);
            }
            ((qx2.p0) obj2).z = nVar;
            if (zArr[26]) {
                num4 = ((qx2.o0) eVar).C;
            } else {
                num4 = (java.lang.Integer) eVar.a(j0VarArr[26]);
            }
            ((qx2.p0) obj2).A = num4;
            if (zArr[27]) {
                num5 = ((qx2.o0) eVar).D;
            } else {
                num5 = (java.lang.Integer) eVar.a(j0VarArr[27]);
            }
            ((qx2.p0) obj2).B = num5;
            if (zArr[28]) {
                charSequence13 = ((qx2.o0) eVar).E;
            } else {
                charSequence13 = (java.lang.CharSequence) eVar.a(j0VarArr[28]);
            }
            ((qx2.p0) obj2).C = charSequence13;
            if (zArr[29]) {
                charSequence14 = ((qx2.o0) eVar).F;
            } else {
                charSequence14 = (java.lang.CharSequence) eVar.a(j0VarArr[29]);
            }
            ((qx2.p0) obj2).D = charSequence14;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj2, "build(...)");
            return new nc0.x(obj2);
        } catch (bi3.bar e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ads.analytics.j)) {
            return false;
        }
        com.truecaller.ads.analytics.j jVar = (com.truecaller.ads.analytics.j) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, jVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, jVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, jVar.c) && kotlin.jvm.internal.Intrinsics.b(this.d, jVar.d) && kotlin.jvm.internal.Intrinsics.b(this.e, jVar.e) && this.f == jVar.f && kotlin.jvm.internal.Intrinsics.b(this.g, jVar.g) && this.h == jVar.h && this.i == jVar.i && kotlin.jvm.internal.Intrinsics.b(this.j, jVar.j) && kotlin.jvm.internal.Intrinsics.b(this.k, jVar.k) && kotlin.jvm.internal.Intrinsics.b(this.l, jVar.l) && kotlin.jvm.internal.Intrinsics.b(this.m, jVar.m) && kotlin.jvm.internal.Intrinsics.b(this.n, jVar.n) && kotlin.jvm.internal.Intrinsics.b(this.o, jVar.o) && this.p == jVar.p && this.q == jVar.q && kotlin.jvm.internal.Intrinsics.b(this.r, jVar.r) && kotlin.jvm.internal.Intrinsics.b(this.s, jVar.s) && kotlin.jvm.internal.Intrinsics.b(this.t, jVar.t) && kotlin.jvm.internal.Intrinsics.b(this.u, jVar.u) && kotlin.jvm.internal.Intrinsics.b(this.v, jVar.v) && kotlin.jvm.internal.Intrinsics.b(this.w, jVar.w) && kotlin.jvm.internal.Intrinsics.b(this.x, jVar.x) && kotlin.jvm.internal.Intrinsics.b(this.y, jVar.y);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15 = this.a.hashCode() * 31;
        int i = 0;
        java.lang.String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode15 + hashCode) * 31;
        java.lang.String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int e = ax1.bar.e((i2 + hashCode2) * 31, 31, this.d);
        java.lang.String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (((e + hashCode3) * 31) + this.f) * 31;
        java.lang.String str4 = this.g;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int g = uf.qux.g((((((i3 + hashCode4) * 31) + this.h) * 31) + this.i) * 31, 31, this.j);
        java.lang.String str5 = this.k;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i4 = (g + hashCode5) * 31;
        com.truecaller.ads.analytics.c cVar = this.l;
        if (cVar == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = cVar.hashCode();
        }
        int i5 = (i4 + hashCode6) * 31;
        java.lang.String str6 = this.m;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i6 = (i5 + hashCode7) * 31;
        java.lang.String str7 = this.n;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i7 = (i6 + hashCode8) * 31;
        java.util.List list = this.o;
        if (list == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list.hashCode();
        }
        int i8 = (i7 + hashCode9) * 31;
        long j = this.p;
        int i9 = (i8 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.q;
        int e2 = ax1.bar.e(ax1.bar.e((i9 + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.r), 31, this.s);
        java.lang.Integer num = this.t;
        if (num == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num.hashCode();
        }
        int i11 = (e2 + hashCode10) * 31;
        java.lang.String str8 = this.u;
        if (str8 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str8.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        java.lang.String str9 = this.v;
        if (str9 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str9.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        qx2.n nVar = this.w;
        if (nVar == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = nVar.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        java.lang.Integer num2 = this.x;
        if (num2 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = num2.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        java.lang.String str10 = this.y;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return i15 + i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("AppAdRequestEvent(adRequestId=", this.a, ", opId=", this.b, ", placement=");
        bar.E(E, this.c, ", adUnitId=", this.d, ", requestSource=");
        t.c.x(this.f, this.e, ", ssp=", ", partnerName=", E);
        t.c.x(this.h, this.g, ", status=", ", servedType=", E);
        E.append(this.i);
        E.append(", requestedAdType=");
        E.append(this.j);
        E.append(", responseAdType=");
        E.append(this.k);
        E.append(", responseAdSize=");
        E.append(this.l);
        E.append(", ecpm=");
        bar.E(E, this.m, ", rawEcpm=", this.n, ", gamMediationInfo=");
        E.append(this.o);
        E.append(", requestTimestamp=");
        E.append(this.p);
        ro0.f.L(E, ", responseTimestamp=", this.q, ", requestConnection=");
        bar.E(E, this.r, ", responseConnection=", this.s, ", errorCode=");
        bar.D(this.t, ", errorMessage=", this.u, ", callId=", E);
        E.append(this.v);
        E.append(", adRequestConfig=");
        E.append(this.w);
        E.append(", callCategory=");
        E.append(this.x);
        E.append(", flowId=");
        E.append(this.y);
        E.append(")");
        return E.toString();
    }
}
