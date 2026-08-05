package com.truecaller.ads.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class l implements nc0.t {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final int f;
    public final java.lang.String g;
    public final java.util.List h;
    public final java.util.List i;
    public final long j;
    public final long k;
    public final java.lang.String l;
    public final java.lang.String m;
    public final java.lang.Integer n;
    public final java.lang.String o;
    public final java.lang.String p;
    public final qx2.n q;
    public final java.lang.Integer r;
    public final java.lang.String s;

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.String str6, java.util.List list, java.util.List list2, long j, long j2, java.lang.String str7, java.lang.String str8, java.lang.Integer num, java.lang.String str9, java.lang.String str10, qx2.n nVar, java.lang.Integer num2, java.lang.String str11) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "adRequestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "requestedAdType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "requestConnection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "responseConnection");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
        this.h = list;
        this.i = list2;
        this.j = j;
        this.k = j2;
        this.l = str7;
        this.m = str8;
        this.n = num;
        this.o = str9;
        this.p = str10;
        this.q = nVar;
        this.r = num2;
        this.s = str11;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [qx2.r0, java.lang.Object, ci3.m] */
    @Override // nc0.t
    public final nc0.z a() {
        java.lang.String str;
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
        java.util.List list;
        java.util.List list2;
        long longValue;
        long longValue2;
        java.lang.CharSequence charSequence8;
        java.lang.CharSequence charSequence9;
        java.lang.Integer num3;
        java.lang.CharSequence charSequence10;
        java.lang.CharSequence charSequence11;
        qx2.n nVar;
        java.lang.Integer num4;
        java.lang.Integer num5;
        java.lang.CharSequence charSequence12;
        java.lang.CharSequence charSequence13;
        o00.z zVar;
        hi3.e eVar = new hi3.e(qx2.r0.y, qx2.r0.z);
        bi3.j0[] j0VarArr = eVar.b;
        bi3.j0 j0Var = j0VarArr[2];
        java.lang.String str3 = this.a;
        hi3.e.d(j0Var, str3);
        ((qx2.q0) eVar).e = str3;
        boolean[] zArr = eVar.c;
        zArr[2] = true;
        bi3.j0 j0Var2 = j0VarArr[4];
        java.lang.String str4 = this.b;
        hi3.e.d(j0Var2, str4);
        ((qx2.q0) eVar).g = str4;
        zArr[4] = true;
        java.lang.String a = ((b50.baz) ((tx.w) wi0.bar.o()).Wa.get()).a();
        hi3.e.d(j0VarArr[3], a);
        ((qx2.q0) eVar).f = a;
        zArr[3] = true;
        bi3.j0 j0Var3 = j0VarArr[5];
        java.lang.String str5 = this.c;
        hi3.e.d(j0Var3, str5);
        ((qx2.q0) eVar).h = str5;
        zArr[5] = true;
        bi3.j0 j0Var4 = j0VarArr[6];
        java.lang.String str6 = this.d;
        hi3.e.d(j0Var4, str6);
        ((qx2.q0) eVar).i = str6;
        zArr[6] = true;
        bi3.j0 j0Var5 = j0VarArr[7];
        java.lang.String str7 = this.e;
        hi3.e.d(j0Var5, str7);
        ((qx2.q0) eVar).j = str7;
        zArr[7] = true;
        bi3.j0 j0Var6 = j0VarArr[9];
        int i = this.f;
        ((qx2.q0) eVar).l = i;
        zArr[9] = true;
        bi3.j0 j0Var7 = j0VarArr[8];
        java.lang.String str8 = this.g;
        hi3.e.d(j0Var7, str8);
        ((qx2.q0) eVar).k = str8;
        zArr[8] = true;
        kotlin.Lazy lazy = com.truecaller.ads.analytics.n.a;
        kotlin.collections.h0 h0Var = this.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0Var, "requestedAdType");
        if (!((java.lang.Boolean) com.truecaller.ads.analytics.n.a.getValue()).booleanValue()) {
            h0Var = kotlin.collections.h0.a;
        }
        hi3.e.d(j0VarArr[10], h0Var);
        ((qx2.q0) eVar).m = h0Var;
        zArr[10] = true;
        bi3.j0 j0Var8 = j0VarArr[11];
        java.util.List list3 = this.i;
        hi3.e.d(j0Var8, list3);
        ((qx2.q0) eVar).n = list3;
        zArr[11] = true;
        bi3.j0 j0Var9 = j0VarArr[12];
        ((qx2.q0) eVar).o = this.j;
        zArr[12] = true;
        bi3.j0 j0Var10 = j0VarArr[13];
        ((qx2.q0) eVar).p = this.k;
        zArr[13] = true;
        bi3.j0 j0Var11 = j0VarArr[14];
        java.lang.String str9 = this.l;
        hi3.e.d(j0Var11, str9);
        ((qx2.q0) eVar).q = str9;
        zArr[14] = true;
        bi3.j0 j0Var12 = j0VarArr[15];
        java.lang.String str10 = this.m;
        hi3.e.d(j0Var12, str10);
        ((qx2.q0) eVar).r = str10;
        zArr[15] = true;
        bi3.j0 j0Var13 = j0VarArr[16];
        java.lang.Integer num6 = this.n;
        hi3.e.d(j0Var13, num6);
        ((qx2.q0) eVar).s = num6;
        zArr[16] = true;
        java.lang.String str11 = this.o;
        if (str11 != null) {
            str = com.truecaller.ads.analytics.b.a(str11);
        } else {
            str = null;
        }
        hi3.e.d(j0VarArr[17], str);
        ((qx2.q0) eVar).t = str;
        zArr[17] = true;
        bi3.j0 j0Var14 = j0VarArr[18];
        java.lang.String str12 = this.p;
        hi3.e.d(j0Var14, str12);
        ((qx2.q0) eVar).u = str12;
        zArr[18] = true;
        bi3.j0 j0Var15 = j0VarArr[19];
        qx2.n nVar2 = this.q;
        hi3.e.d(j0Var15, nVar2);
        ((qx2.q0) eVar).v = nVar2;
        zArr[19] = true;
        com.truecaller.ads.adsrouter.network.NetworkTracker$HttpVersion a2 = a10.w.a(str3);
        if (a2 != null) {
            num = java.lang.Integer.valueOf(a2.getValue());
        } else {
            num = null;
        }
        hi3.e.d(j0VarArr[20], num);
        ((qx2.q0) eVar).w = num;
        zArr[20] = true;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "requestId");
        a10.w.a.remove(str3);
        if (i == com.truecaller.ads.analytics.AdRequestEventSSP.AD_ROUTER_API.getCode()) {
            num2 = this.r;
        } else {
            num2 = null;
        }
        hi3.e.d(j0VarArr[21], num2);
        ((qx2.q0) eVar).x = num2;
        zArr[21] = true;
        if (kotlin.jvm.internal.Intrinsics.b(str5, "MESSAGE_ID") && (zVar = lf.bar.a) != null) {
            str2 = zVar.c;
        } else {
            str2 = null;
        }
        hi3.e.d(j0VarArr[22], str2);
        ((qx2.q0) eVar).y = str2;
        zArr[22] = true;
        bi3.j0 j0Var16 = j0VarArr[23];
        java.lang.String str13 = this.s;
        hi3.e.d(j0Var16, str13);
        ((qx2.q0) eVar).z = str13;
        zArr[23] = true;
        try {
            ?? obj = new java.lang.Object();
            if (zArr[0]) {
                lhVar = null;
            } else {
                lhVar = (qx2.lh) eVar.a(j0VarArr[0]);
            }
            ((qx2.r0) obj).a = lhVar;
            if (zArr[1]) {
                clientHeaderV2 = null;
            } else {
                clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) eVar.a(j0VarArr[1]);
            }
            ((qx2.r0) obj).b = clientHeaderV2;
            if (zArr[2]) {
                charSequence = ((qx2.q0) eVar).e;
            } else {
                charSequence = (java.lang.CharSequence) eVar.a(j0VarArr[2]);
            }
            ((qx2.r0) obj).c = charSequence;
            if (zArr[3]) {
                charSequence2 = ((qx2.q0) eVar).f;
            } else {
                charSequence2 = (java.lang.CharSequence) eVar.a(j0VarArr[3]);
            }
            ((qx2.r0) obj).d = charSequence2;
            if (zArr[4]) {
                charSequence3 = ((qx2.q0) eVar).g;
            } else {
                charSequence3 = (java.lang.CharSequence) eVar.a(j0VarArr[4]);
            }
            ((qx2.r0) obj).e = charSequence3;
            if (zArr[5]) {
                charSequence4 = ((qx2.q0) eVar).h;
            } else {
                charSequence4 = (java.lang.CharSequence) eVar.a(j0VarArr[5]);
            }
            ((qx2.r0) obj).f = charSequence4;
            if (zArr[6]) {
                charSequence5 = ((qx2.q0) eVar).i;
            } else {
                charSequence5 = (java.lang.CharSequence) eVar.a(j0VarArr[6]);
            }
            ((qx2.r0) obj).g = charSequence5;
            if (zArr[7]) {
                charSequence6 = ((qx2.q0) eVar).j;
            } else {
                charSequence6 = (java.lang.CharSequence) eVar.a(j0VarArr[7]);
            }
            ((qx2.r0) obj).h = charSequence6;
            if (zArr[8]) {
                charSequence7 = ((qx2.q0) eVar).k;
            } else {
                charSequence7 = (java.lang.CharSequence) eVar.a(j0VarArr[8]);
            }
            ((qx2.r0) obj).i = charSequence7;
            if (zArr[9]) {
                intValue = ((qx2.q0) eVar).l;
            } else {
                intValue = ((java.lang.Integer) eVar.a(j0VarArr[9])).intValue();
            }
            ((qx2.r0) obj).j = intValue;
            if (zArr[10]) {
                list = ((qx2.q0) eVar).m;
            } else {
                list = (java.util.List) eVar.a(j0VarArr[10]);
            }
            ((qx2.r0) obj).k = list;
            if (zArr[11]) {
                list2 = ((qx2.q0) eVar).n;
            } else {
                list2 = (java.util.List) eVar.a(j0VarArr[11]);
            }
            ((qx2.r0) obj).l = list2;
            if (zArr[12]) {
                longValue = ((qx2.q0) eVar).o;
            } else {
                longValue = ((java.lang.Long) eVar.a(j0VarArr[12])).longValue();
            }
            ((qx2.r0) obj).m = longValue;
            if (zArr[13]) {
                longValue2 = ((qx2.q0) eVar).p;
            } else {
                longValue2 = ((java.lang.Long) eVar.a(j0VarArr[13])).longValue();
            }
            ((qx2.r0) obj).n = longValue2;
            if (zArr[14]) {
                charSequence8 = ((qx2.q0) eVar).q;
            } else {
                charSequence8 = (java.lang.CharSequence) eVar.a(j0VarArr[14]);
            }
            ((qx2.r0) obj).o = charSequence8;
            if (zArr[15]) {
                charSequence9 = ((qx2.q0) eVar).r;
            } else {
                charSequence9 = (java.lang.CharSequence) eVar.a(j0VarArr[15]);
            }
            ((qx2.r0) obj).p = charSequence9;
            if (zArr[16]) {
                num3 = ((qx2.q0) eVar).s;
            } else {
                num3 = (java.lang.Integer) eVar.a(j0VarArr[16]);
            }
            ((qx2.r0) obj).q = num3;
            if (zArr[17]) {
                charSequence10 = ((qx2.q0) eVar).t;
            } else {
                charSequence10 = (java.lang.CharSequence) eVar.a(j0VarArr[17]);
            }
            ((qx2.r0) obj).r = charSequence10;
            if (zArr[18]) {
                charSequence11 = ((qx2.q0) eVar).u;
            } else {
                charSequence11 = (java.lang.CharSequence) eVar.a(j0VarArr[18]);
            }
            ((qx2.r0) obj).s = charSequence11;
            if (zArr[19]) {
                nVar = ((qx2.q0) eVar).v;
            } else {
                nVar = (qx2.n) eVar.a(j0VarArr[19]);
            }
            ((qx2.r0) obj).t = nVar;
            if (zArr[20]) {
                num4 = ((qx2.q0) eVar).w;
            } else {
                num4 = (java.lang.Integer) eVar.a(j0VarArr[20]);
            }
            ((qx2.r0) obj).u = num4;
            if (zArr[21]) {
                num5 = ((qx2.q0) eVar).x;
            } else {
                num5 = (java.lang.Integer) eVar.a(j0VarArr[21]);
            }
            ((qx2.r0) obj).v = num5;
            if (zArr[22]) {
                charSequence12 = ((qx2.q0) eVar).y;
            } else {
                charSequence12 = (java.lang.CharSequence) eVar.a(j0VarArr[22]);
            }
            ((qx2.r0) obj).w = charSequence12;
            if (zArr[23]) {
                charSequence13 = ((qx2.q0) eVar).z;
            } else {
                charSequence13 = (java.lang.CharSequence) eVar.a(j0VarArr[23]);
            }
            ((qx2.r0) obj).x = charSequence13;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "build(...)");
            return new nc0.x(obj);
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
        if (!(obj instanceof com.truecaller.ads.analytics.l)) {
            return false;
        }
        com.truecaller.ads.analytics.l lVar = (com.truecaller.ads.analytics.l) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, lVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, lVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, lVar.c) && kotlin.jvm.internal.Intrinsics.b(this.d, lVar.d) && kotlin.jvm.internal.Intrinsics.b(this.e, lVar.e) && this.f == lVar.f && kotlin.jvm.internal.Intrinsics.b(this.g, lVar.g) && kotlin.jvm.internal.Intrinsics.b(this.h, lVar.h) && kotlin.jvm.internal.Intrinsics.b(this.i, lVar.i) && this.j == lVar.j && this.k == lVar.k && kotlin.jvm.internal.Intrinsics.b(this.l, lVar.l) && kotlin.jvm.internal.Intrinsics.b(this.m, lVar.m) && kotlin.jvm.internal.Intrinsics.b(this.n, lVar.n) && kotlin.jvm.internal.Intrinsics.b(this.o, lVar.o) && kotlin.jvm.internal.Intrinsics.b(this.p, lVar.p) && kotlin.jvm.internal.Intrinsics.b(this.q, lVar.q) && kotlin.jvm.internal.Intrinsics.b(this.r, lVar.r) && kotlin.jvm.internal.Intrinsics.b(this.s, lVar.s);
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
        int hashCode11 = this.a.hashCode() * 31;
        int i = 0;
        java.lang.String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode11 + hashCode) * 31;
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
        int g = uf.qux.g((i3 + hashCode4) * 31, 31, this.h);
        java.util.List list = this.i;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int i4 = (g + hashCode5) * 31;
        long j = this.j;
        int i5 = (i4 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.k;
        int e2 = ax1.bar.e(ax1.bar.e((i5 + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.l), 31, this.m);
        java.lang.Integer num = this.n;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int i6 = (e2 + hashCode6) * 31;
        java.lang.String str5 = this.o;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        java.lang.String str6 = this.p;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        qx2.n nVar = this.q;
        if (nVar == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = nVar.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        java.lang.Integer num2 = this.r;
        if (num2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num2.hashCode();
        }
        int i11 = (i9 + hashCode10) * 31;
        java.lang.String str7 = this.s;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return i11 + i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("AppAdRequestV2FailedEvent(adRequestId=", this.a, ", opId=", this.b, ", placement=");
        bar.E(E, this.c, ", adUnitId=", this.d, ", requestSource=");
        t.c.x(this.f, this.e, ", ssp=", ", partnerName=", E);
        f63.qux.w(this.g, ", requestedAdType=", ", gamMediationInfo=", E, this.h);
        E.append(this.i);
        E.append(", requestTimestamp=");
        E.append(this.j);
        ro0.f.L(E, ", responseTimestamp=", this.k, ", requestConnection=");
        bar.E(E, this.l, ", responseConnection=", this.m, ", errorCode=");
        bar.D(this.n, ", errorMessage=", this.o, ", callId=", E);
        E.append(this.p);
        E.append(", adRequestConfig=");
        E.append(this.q);
        E.append(", callCategory=");
        E.append(this.r);
        E.append(", flowId=");
        E.append(this.s);
        E.append(")");
        return E.toString();
    }
}
