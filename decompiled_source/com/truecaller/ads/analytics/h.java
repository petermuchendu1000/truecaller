package com.truecaller.ads.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class h implements nc0.t {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final int g;
    public final int h;
    public final java.lang.String i;
    public final long j;
    public final java.lang.String k;
    public final qx2.m l;
    public final java.lang.Integer m;

    public h(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, int i2, java.lang.String str7, long j, java.lang.String str8, qx2.m mVar, java.lang.Integer num, int i3) {
        java.lang.String str9;
        java.lang.String str10;
        qx2.m mVar2;
        str3 = (i3 & 4) != 0 ? null : str3;
        str4 = (i3 & 8) != 0 ? null : str4;
        if ((i3 & 16) != 0) {
            str9 = null;
        } else {
            str9 = str5;
        }
        if ((i3 & 32) != 0) {
            str10 = null;
        } else {
            str10 = str6;
        }
        if ((i3 & 2048) != 0) {
            mVar2 = null;
        } else {
            mVar2 = mVar;
        }
        java.lang.Integer num2 = (i3 & 4096) == 0 ? num : null;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "adRequestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "event");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "adType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "connectionType");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str9;
        this.f = str10;
        this.g = i;
        this.h = i2;
        this.i = str7;
        this.j = j;
        this.k = str8;
        this.l = mVar2;
        this.m = num2;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [qx2.l0, java.lang.Object, ci3.m] */
    @Override // nc0.t
    public final nc0.z a() {
        qx2.lh lhVar;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        java.lang.CharSequence charSequence3;
        java.lang.CharSequence charSequence4;
        java.lang.CharSequence charSequence5;
        java.lang.CharSequence charSequence6;
        java.lang.CharSequence charSequence7;
        int intValue;
        int intValue2;
        java.lang.CharSequence charSequence8;
        long longValue;
        java.lang.CharSequence charSequence9;
        qx2.m mVar;
        java.lang.Integer num;
        hi3.e eVar = new hi3.e(qx2.l0.q, qx2.l0.r);
        bi3.j0[] j0VarArr = eVar.b;
        bi3.j0 j0Var = j0VarArr[2];
        java.lang.String str = this.a;
        hi3.e.d(j0Var, str);
        ((qx2.k0) eVar).e = str;
        boolean[] zArr = eVar.c;
        zArr[2] = true;
        bi3.j0 j0Var2 = j0VarArr[3];
        java.lang.String str2 = this.b;
        hi3.e.d(j0Var2, str2);
        ((qx2.k0) eVar).f = str2;
        zArr[3] = true;
        bi3.j0 j0Var3 = j0VarArr[4];
        java.lang.String str3 = this.c;
        hi3.e.d(j0Var3, str3);
        ((qx2.k0) eVar).g = str3;
        zArr[4] = true;
        java.lang.String a = ((b50.baz) ((tx.w) wi0.bar.o()).Wa.get()).a();
        hi3.e.d(j0VarArr[5], a);
        ((qx2.k0) eVar).h = a;
        zArr[5] = true;
        bi3.j0 j0Var4 = j0VarArr[6];
        java.lang.String str4 = this.d;
        hi3.e.d(j0Var4, str4);
        ((qx2.k0) eVar).i = str4;
        zArr[6] = true;
        bi3.j0 j0Var5 = j0VarArr[7];
        java.lang.String str5 = this.e;
        hi3.e.d(j0Var5, str5);
        ((qx2.k0) eVar).j = str5;
        zArr[7] = true;
        bi3.j0 j0Var6 = j0VarArr[8];
        java.lang.String str6 = this.f;
        hi3.e.d(j0Var6, str6);
        ((qx2.k0) eVar).k = str6;
        zArr[8] = true;
        bi3.j0 j0Var7 = j0VarArr[9];
        ((qx2.k0) eVar).l = this.g;
        zArr[9] = true;
        bi3.j0 j0Var8 = j0VarArr[10];
        ((qx2.k0) eVar).m = this.h;
        zArr[10] = true;
        bi3.j0 j0Var9 = j0VarArr[11];
        java.lang.String str7 = this.i;
        hi3.e.d(j0Var9, str7);
        ((qx2.k0) eVar).n = str7;
        zArr[11] = true;
        bi3.j0 j0Var10 = j0VarArr[12];
        ((qx2.k0) eVar).o = this.j;
        zArr[12] = true;
        bi3.j0 j0Var11 = j0VarArr[13];
        java.lang.String str8 = this.k;
        hi3.e.d(j0Var11, str8);
        ((qx2.k0) eVar).p = str8;
        zArr[13] = true;
        bi3.j0 j0Var12 = j0VarArr[14];
        qx2.m mVar2 = this.l;
        hi3.e.d(j0Var12, mVar2);
        ((qx2.k0) eVar).q = mVar2;
        zArr[14] = true;
        bi3.j0 j0Var13 = j0VarArr[15];
        java.lang.Integer num2 = this.m;
        hi3.e.d(j0Var13, num2);
        ((qx2.k0) eVar).r = num2;
        zArr[15] = true;
        try {
            ?? obj = new java.lang.Object();
            com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2 = null;
            if (zArr[0]) {
                lhVar = null;
            } else {
                lhVar = (qx2.lh) eVar.a(j0VarArr[0]);
            }
            ((qx2.l0) obj).a = lhVar;
            if (!zArr[1]) {
                clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) eVar.a(j0VarArr[1]);
            }
            ((qx2.l0) obj).b = clientHeaderV2;
            if (zArr[2]) {
                charSequence = ((qx2.k0) eVar).e;
            } else {
                charSequence = (java.lang.CharSequence) eVar.a(j0VarArr[2]);
            }
            ((qx2.l0) obj).c = charSequence;
            if (zArr[3]) {
                charSequence2 = ((qx2.k0) eVar).f;
            } else {
                charSequence2 = (java.lang.CharSequence) eVar.a(j0VarArr[3]);
            }
            ((qx2.l0) obj).d = charSequence2;
            if (zArr[4]) {
                charSequence3 = ((qx2.k0) eVar).g;
            } else {
                charSequence3 = (java.lang.CharSequence) eVar.a(j0VarArr[4]);
            }
            ((qx2.l0) obj).e = charSequence3;
            if (zArr[5]) {
                charSequence4 = ((qx2.k0) eVar).h;
            } else {
                charSequence4 = (java.lang.CharSequence) eVar.a(j0VarArr[5]);
            }
            ((qx2.l0) obj).f = charSequence4;
            if (zArr[6]) {
                charSequence5 = ((qx2.k0) eVar).i;
            } else {
                charSequence5 = (java.lang.CharSequence) eVar.a(j0VarArr[6]);
            }
            ((qx2.l0) obj).g = charSequence5;
            if (zArr[7]) {
                charSequence6 = ((qx2.k0) eVar).j;
            } else {
                charSequence6 = (java.lang.CharSequence) eVar.a(j0VarArr[7]);
            }
            ((qx2.l0) obj).h = charSequence6;
            if (zArr[8]) {
                charSequence7 = ((qx2.k0) eVar).k;
            } else {
                charSequence7 = (java.lang.CharSequence) eVar.a(j0VarArr[8]);
            }
            ((qx2.l0) obj).i = charSequence7;
            if (zArr[9]) {
                intValue = ((qx2.k0) eVar).l;
            } else {
                intValue = ((java.lang.Integer) eVar.a(j0VarArr[9])).intValue();
            }
            ((qx2.l0) obj).j = intValue;
            if (zArr[10]) {
                intValue2 = ((qx2.k0) eVar).m;
            } else {
                intValue2 = ((java.lang.Integer) eVar.a(j0VarArr[10])).intValue();
            }
            ((qx2.l0) obj).k = intValue2;
            if (zArr[11]) {
                charSequence8 = ((qx2.k0) eVar).n;
            } else {
                charSequence8 = (java.lang.CharSequence) eVar.a(j0VarArr[11]);
            }
            ((qx2.l0) obj).l = charSequence8;
            if (zArr[12]) {
                longValue = ((qx2.k0) eVar).o;
            } else {
                longValue = ((java.lang.Long) eVar.a(j0VarArr[12])).longValue();
            }
            ((qx2.l0) obj).m = longValue;
            if (zArr[13]) {
                charSequence9 = ((qx2.k0) eVar).p;
            } else {
                charSequence9 = (java.lang.CharSequence) eVar.a(j0VarArr[13]);
            }
            ((qx2.l0) obj).n = charSequence9;
            if (zArr[14]) {
                mVar = ((qx2.k0) eVar).q;
            } else {
                mVar = (qx2.m) eVar.a(j0VarArr[14]);
            }
            ((qx2.l0) obj).o = mVar;
            if (zArr[15]) {
                num = ((qx2.k0) eVar).r;
            } else {
                num = (java.lang.Integer) eVar.a(j0VarArr[15]);
            }
            ((qx2.l0) obj).p = num;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "buildInternalEvent(...)");
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
        if (!(obj instanceof com.truecaller.ads.analytics.h)) {
            return false;
        }
        com.truecaller.ads.analytics.h hVar = (com.truecaller.ads.analytics.h) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, hVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, hVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, hVar.c) && kotlin.jvm.internal.Intrinsics.b(this.d, hVar.d) && kotlin.jvm.internal.Intrinsics.b(this.e, hVar.e) && kotlin.jvm.internal.Intrinsics.b(this.f, hVar.f) && this.g == hVar.g && this.h == hVar.h && kotlin.jvm.internal.Intrinsics.b(this.i, hVar.i) && this.j == hVar.j && kotlin.jvm.internal.Intrinsics.b(this.k, hVar.k) && kotlin.jvm.internal.Intrinsics.b(this.l, hVar.l) && kotlin.jvm.internal.Intrinsics.b(this.m, hVar.m);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int e = ax1.bar.e(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        java.lang.String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        java.lang.String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        java.lang.String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        java.lang.String str4 = this.f;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int e2 = ax1.bar.e((((((i4 + hashCode4) * 31) + this.g) * 31) + this.h) * 31, 31, this.i);
        long j = this.j;
        int e3 = ax1.bar.e((e2 + ((int) (j ^ (j >>> 32)))) * 31, 31, this.k);
        qx2.m mVar = this.l;
        if (mVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = mVar.hashCode();
        }
        int i5 = (e3 + hashCode5) * 31;
        java.lang.Integer num = this.m;
        if (num != null) {
            i = num.hashCode();
        }
        return i5 + i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("AppAdFunnelEvent(adRequestId=", this.a, ", event=", this.b, ", opId=");
        bar.E(E, this.c, ", placement=", this.d, ", adUnitId=");
        bar.E(E, this.e, ", requestSource=", this.f, ", ssp=");
        os0.bar.A(this.g, this.h, ", servedType=", ", adType=", E);
        com.appsflyer.internal.e.y(E, this.j, this.i, ", timestamp=");
        E.append(", connectionType=");
        E.append(this.k);
        E.append(", adFunnelConfig=");
        E.append(this.l);
        E.append(", cardIndex=");
        E.append(this.m);
        E.append(")");
        return E.toString();
    }
}
