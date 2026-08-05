package com.truecaller.ads.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class i implements nc0.t {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final int e;
    public final java.lang.String f;
    public final int g;

    public i(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "partnerName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = i2;
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, qx2.v0, ci3.m] */
    @Override // nc0.t
    public final nc0.z a() {
        qx2.lh lhVar;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        java.lang.CharSequence charSequence3;
        java.lang.CharSequence charSequence4;
        int intValue;
        java.lang.CharSequence charSequence5;
        int intValue2;
        hi3.e eVar = new hi3.e(qx2.v0.j, qx2.v0.k);
        bi3.j0[] j0VarArr = eVar.b;
        bi3.j0 j0Var = j0VarArr[2];
        java.lang.String str = this.a;
        hi3.e.d(j0Var, str);
        ((qx2.u0) eVar).e = str;
        boolean[] zArr = eVar.c;
        zArr[2] = true;
        java.lang.String str2 = "";
        java.lang.String str3 = this.b;
        if (str3 == null) {
            str3 = "";
        }
        bi3.j0 j0Var2 = j0VarArr[3];
        ((qx2.u0) eVar).f = str3;
        zArr[3] = true;
        java.lang.String str4 = this.c;
        if (str4 != null) {
            str2 = str4;
        }
        bi3.j0 j0Var3 = j0VarArr[4];
        ((qx2.u0) eVar).g = str2;
        zArr[4] = true;
        bi3.j0 j0Var4 = j0VarArr[5];
        java.lang.String str5 = this.d;
        hi3.e.d(j0Var4, str5);
        ((qx2.u0) eVar).h = str5;
        zArr[5] = true;
        bi3.j0 j0Var5 = j0VarArr[6];
        ((qx2.u0) eVar).i = this.e;
        zArr[6] = true;
        bi3.j0 j0Var6 = j0VarArr[7];
        java.lang.String str6 = this.f;
        hi3.e.d(j0Var6, str6);
        ((qx2.u0) eVar).j = str6;
        zArr[7] = true;
        bi3.j0 j0Var7 = j0VarArr[8];
        ((qx2.u0) eVar).k = this.g;
        zArr[8] = true;
        try {
            ?? obj = new java.lang.Object();
            com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2 = null;
            if (zArr[0]) {
                lhVar = null;
            } else {
                lhVar = (qx2.lh) eVar.a(j0VarArr[0]);
            }
            ((qx2.v0) obj).a = lhVar;
            if (!zArr[1]) {
                clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) eVar.a(j0VarArr[1]);
            }
            ((qx2.v0) obj).b = clientHeaderV2;
            if (zArr[2]) {
                charSequence = ((qx2.u0) eVar).e;
            } else {
                charSequence = (java.lang.CharSequence) eVar.a(j0VarArr[2]);
            }
            ((qx2.v0) obj).c = charSequence;
            if (zArr[3]) {
                charSequence2 = ((qx2.u0) eVar).f;
            } else {
                charSequence2 = (java.lang.CharSequence) eVar.a(j0VarArr[3]);
            }
            ((qx2.v0) obj).d = charSequence2;
            if (zArr[4]) {
                charSequence3 = ((qx2.u0) eVar).g;
            } else {
                charSequence3 = (java.lang.CharSequence) eVar.a(j0VarArr[4]);
            }
            ((qx2.v0) obj).e = charSequence3;
            if (zArr[5]) {
                charSequence4 = ((qx2.u0) eVar).h;
            } else {
                charSequence4 = (java.lang.CharSequence) eVar.a(j0VarArr[5]);
            }
            ((qx2.v0) obj).f = charSequence4;
            if (zArr[6]) {
                intValue = ((qx2.u0) eVar).i;
            } else {
                intValue = ((java.lang.Integer) eVar.a(j0VarArr[6])).intValue();
            }
            ((qx2.v0) obj).g = intValue;
            if (zArr[7]) {
                charSequence5 = ((qx2.u0) eVar).j;
            } else {
                charSequence5 = (java.lang.CharSequence) eVar.a(j0VarArr[7]);
            }
            ((qx2.v0) obj).h = charSequence5;
            if (zArr[8]) {
                intValue2 = ((qx2.u0) eVar).k;
            } else {
                intValue2 = ((java.lang.Integer) eVar.a(j0VarArr[8])).intValue();
            }
            ((qx2.v0) obj).i = intValue2;
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
        if (!(obj instanceof com.truecaller.ads.analytics.i)) {
            return false;
        }
        com.truecaller.ads.analytics.i iVar = (com.truecaller.ads.analytics.i) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, iVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, iVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, iVar.c) && kotlin.jvm.internal.Intrinsics.b(this.d, iVar.d) && this.e == iVar.e && kotlin.jvm.internal.Intrinsics.b(this.f, iVar.f) && this.g == iVar.g;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        java.lang.String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        java.lang.String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ax1.bar.e((ax1.bar.e((i2 + i) * 31, 31, this.d) + this.e) * 31, 31, this.f) + this.g;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("AppAdQPSControlEvent(requestId=", this.a, ", opId=", this.b, ", placement=");
        bar.E(E, this.c, ", adUnitId=", this.d, ", ssp=");
        uf.qux.q(this.e, ", partnerName=", this.f, ", status=", E);
        return bar.m(this.g, ")", E);
    }
}
