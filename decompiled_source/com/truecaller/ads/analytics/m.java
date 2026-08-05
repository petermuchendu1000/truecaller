package com.truecaller.ads.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class m implements nc0.t {
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;
    public final java.lang.String d;

    public m(java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "adId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "purposeConsent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "requestSource");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [qx2.t0, java.lang.Object, ci3.m] */
    @Override // nc0.t
    public final nc0.z a() {
        qx2.lh lhVar;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        int intValue;
        java.lang.CharSequence charSequence3;
        bi3.y0 y0Var = qx2.t0.g;
        hi3.a aVar = qx2.t0.h;
        bi3.j0[] j0VarArr = (bi3.j0[]) y0Var.v().toArray(new bi3.j0[0]);
        boolean[] zArr = new boolean[j0VarArr.length];
        bi3.j0 j0Var = j0VarArr[2];
        zArr[2] = true;
        bi3.j0 j0Var2 = j0VarArr[5];
        zArr[5] = true;
        bi3.j0 j0Var3 = j0VarArr[4];
        zArr[4] = true;
        bi3.j0 j0Var4 = j0VarArr[3];
        zArr[3] = true;
        try {
            ?? obj = new java.lang.Object();
            com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2 = null;
            if (zArr[0]) {
                lhVar = null;
            } else {
                bi3.j0 j0Var5 = j0VarArr[0];
                lhVar = (qx2.lh) aVar.g(j0Var5.f, aVar.j(j0Var5));
            }
            ((qx2.t0) obj).a = lhVar;
            if (!zArr[1]) {
                bi3.j0 j0Var6 = j0VarArr[1];
                clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) aVar.g(j0Var6.f, aVar.j(j0Var6));
            }
            ((qx2.t0) obj).b = clientHeaderV2;
            if (zArr[2]) {
                charSequence = this.a;
            } else {
                bi3.j0 j0Var7 = j0VarArr[2];
                charSequence = (java.lang.CharSequence) aVar.g(j0Var7.f, aVar.j(j0Var7));
            }
            ((qx2.t0) obj).c = charSequence;
            if (zArr[3]) {
                charSequence2 = this.d;
            } else {
                bi3.j0 j0Var8 = j0VarArr[3];
                charSequence2 = (java.lang.CharSequence) aVar.g(j0Var8.f, aVar.j(j0Var8));
            }
            ((qx2.t0) obj).d = charSequence2;
            if (zArr[4]) {
                intValue = this.c;
            } else {
                bi3.j0 j0Var9 = j0VarArr[4];
                intValue = ((java.lang.Integer) aVar.g(j0Var9.f, aVar.j(j0Var9))).intValue();
            }
            ((qx2.t0) obj).e = intValue;
            if (zArr[5]) {
                charSequence3 = this.b;
            } else {
                bi3.j0 j0Var10 = j0VarArr[5];
                charSequence3 = (java.lang.CharSequence) aVar.g(j0Var10.f, aVar.j(j0Var10));
            }
            ((qx2.t0) obj).f = charSequence3;
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
        if (!(obj instanceof com.truecaller.ads.analytics.m)) {
            return false;
        }
        com.truecaller.ads.analytics.m mVar = (com.truecaller.ads.analytics.m) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, mVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, mVar.b) && this.c == mVar.c && kotlin.jvm.internal.Intrinsics.b(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((ax1.bar.e(this.a.hashCode() * 31, 31, this.b) + this.c) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("AppAdsGoogleConsentTracker(adId=", this.a, ", purposeConsent=", this.b, ", status=");
        E.append(this.c);
        E.append(", requestSource=");
        E.append(this.d);
        E.append(")");
        return E.toString();
    }
}
