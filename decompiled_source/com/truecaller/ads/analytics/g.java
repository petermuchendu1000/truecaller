package com.truecaller.ads.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class g implements nc0.t {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final long d;
    public final qx2.f e;
    public final qx2.wh f;

    public g(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, qx2.f fVar, qx2.wh whVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "adClickPosition");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whVar, "deviceSize");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = fVar;
        this.f = whVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, qx2.j0, ci3.m] */
    @Override // nc0.t
    public final nc0.z a() {
        char c;
        char c2;
        qx2.lh lhVar;
        qx2.f fVar;
        qx2.wh whVar;
        bi3.y0 y0Var = qx2.j0.i;
        hi3.a aVar = qx2.j0.j;
        bi3.j0[] j0VarArr = (bi3.j0[]) y0Var.v().toArray(new bi3.j0[0]);
        boolean[] zArr = new boolean[j0VarArr.length];
        bi3.j0 j0Var = j0VarArr[2];
        java.lang.CharSequence charSequence = this.a;
        hi3.e.d(j0Var, charSequence);
        zArr[2] = true;
        bi3.j0 j0Var2 = j0VarArr[3];
        java.lang.CharSequence charSequence2 = this.b;
        hi3.e.d(j0Var2, charSequence2);
        zArr[3] = true;
        bi3.j0 j0Var3 = j0VarArr[4];
        java.lang.CharSequence charSequence3 = this.c;
        hi3.e.d(j0Var3, charSequence3);
        zArr[4] = true;
        java.lang.Long valueOf = java.lang.Long.valueOf(this.d);
        bi3.j0 j0Var4 = j0VarArr[5];
        zArr[5] = true;
        bi3.j0 j0Var5 = j0VarArr[6];
        zArr[6] = true;
        bi3.j0 j0Var6 = j0VarArr[7];
        zArr[7] = true;
        try {
            ?? obj = new java.lang.Object();
            com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2 = null;
            if (zArr[0]) {
                c = 2;
                c2 = 1;
                lhVar = null;
            } else {
                c = 2;
                bi3.j0 j0Var7 = j0VarArr[0];
                c2 = 1;
                lhVar = (qx2.lh) aVar.g(j0Var7.f, aVar.j(j0Var7));
            }
            ((qx2.j0) obj).a = lhVar;
            if (!zArr[c2]) {
                bi3.j0 j0Var8 = j0VarArr[c2];
                clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) aVar.g(j0Var8.f, aVar.j(j0Var8));
            }
            ((qx2.j0) obj).b = clientHeaderV2;
            if (!zArr[c]) {
                bi3.j0 j0Var9 = j0VarArr[c];
                charSequence = (java.lang.CharSequence) aVar.g(j0Var9.f, aVar.j(j0Var9));
            }
            ((qx2.j0) obj).c = charSequence;
            if (!zArr[3]) {
                bi3.j0 j0Var10 = j0VarArr[3];
                charSequence2 = (java.lang.CharSequence) aVar.g(j0Var10.f, aVar.j(j0Var10));
            }
            ((qx2.j0) obj).d = charSequence2;
            if (!zArr[4]) {
                bi3.j0 j0Var11 = j0VarArr[4];
                charSequence3 = (java.lang.CharSequence) aVar.g(j0Var11.f, aVar.j(j0Var11));
            }
            ((qx2.j0) obj).e = charSequence3;
            if (!zArr[5]) {
                bi3.j0 j0Var12 = j0VarArr[5];
                valueOf = (java.lang.Long) aVar.g(j0Var12.f, aVar.j(j0Var12));
            }
            ((qx2.j0) obj).f = valueOf;
            if (zArr[6]) {
                fVar = this.e;
            } else {
                bi3.j0 j0Var13 = j0VarArr[6];
                fVar = (qx2.f) aVar.g(j0Var13.f, aVar.j(j0Var13));
            }
            ((qx2.j0) obj).g = fVar;
            if (zArr[7]) {
                whVar = this.f;
            } else {
                bi3.j0 j0Var14 = j0VarArr[7];
                whVar = (qx2.wh) aVar.g(j0Var14.f, aVar.j(j0Var14));
            }
            ((qx2.j0) obj).h = whVar;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "buildInternalEvent(...)");
            return new nc0.x(obj);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e);
        } catch (bi3.bar e2) {
            throw e2;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ads.analytics.g)) {
            return false;
        }
        com.truecaller.ads.analytics.g gVar = (com.truecaller.ads.analytics.g) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, gVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, gVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, gVar.c) && this.d == gVar.d && kotlin.jvm.internal.Intrinsics.b(this.e, gVar.e) && kotlin.jvm.internal.Intrinsics.b(this.f, gVar.f);
    }

    public final int hashCode() {
        int e = ax1.bar.e(ax1.bar.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        long j = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((e + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("AppAdBounceBackEvent(requestId=", this.a, ", placement=", this.b, ", adUnitId=");
        com.appsflyer.internal.e.y(E, this.d, this.c, ", dwellTime=");
        E.append(", adClickPosition=");
        E.append(this.e);
        E.append(", deviceSize=");
        E.append(this.f);
        E.append(")");
        return E.toString();
    }
}
