package com.truecaller.ads.analytics;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class p {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.Long d;
    public final com.truecaller.ads.analytics.qux e;
    public final com.truecaller.ads.analytics.o f;

    public /* synthetic */ p(java.lang.String str, java.lang.String str2) {
        this(str, "AFTERCALL", str2, null, null, null);
    }

    public static com.truecaller.ads.analytics.p a(com.truecaller.ads.analytics.p pVar, java.lang.Long l, com.truecaller.ads.analytics.qux quxVar, com.truecaller.ads.analytics.o oVar, int i) {
        java.lang.String str = pVar.a;
        java.lang.String str2 = pVar.b;
        java.lang.String str3 = pVar.c;
        if ((i & 8) != 0) {
            l = pVar.d;
        }
        java.lang.Long l2 = l;
        if ((i & 16) != 0) {
            quxVar = pVar.e;
        }
        com.truecaller.ads.analytics.qux quxVar2 = quxVar;
        if ((i & 32) != 0) {
            oVar = pVar.f;
        }
        pVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "adUnit");
        return new com.truecaller.ads.analytics.p(str, str2, str3, l2, quxVar2, oVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ads.analytics.p)) {
            return false;
        }
        com.truecaller.ads.analytics.p pVar = (com.truecaller.ads.analytics.p) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, pVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, pVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, pVar.c) && kotlin.jvm.internal.Intrinsics.b(this.d, pVar.d) && kotlin.jvm.internal.Intrinsics.b(this.e, pVar.e) && kotlin.jvm.internal.Intrinsics.b(this.f, pVar.f);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int e = ax1.bar.e(ax1.bar.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = 0;
        java.lang.Long l = this.d;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        com.truecaller.ads.analytics.qux quxVar = this.e;
        if (quxVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = quxVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        com.truecaller.ads.analytics.o oVar = this.f;
        if (oVar != null) {
            i = oVar.hashCode();
        }
        return i3 + i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("ShownAd(requestId=", this.a, ", placement=", this.b, ", adUnit=");
        E.append(this.c);
        E.append(", dwellTime=");
        E.append(this.d);
        E.append(", clickPosition=");
        E.append(this.e);
        E.append(", screenSize=");
        E.append(this.f);
        E.append(")");
        return E.toString();
    }

    public p(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, com.truecaller.ads.analytics.qux quxVar, com.truecaller.ads.analytics.o oVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "requestId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "adUnit");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = quxVar;
        this.f = oVar;
    }
}
