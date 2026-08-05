package com.truecaller.ads.keywords.network;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class c {
    public final qc3.bar a;
    public final qc3.bar b;
    public final qc3.bar c;

    public c(qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "adCampaignsRestAdapter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "adsIdentifierHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "adsConfigurationManager");
        this.a = barVar;
        this.b = barVar2;
        this.c = barVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(j70.bar barVar, ff3.qux quxVar) {
        com.truecaller.ads.keywords.network.a aVar;
        int i;
        boolean z;
        wj3.k0 k0Var;
        if (quxVar instanceof com.truecaller.ads.keywords.network.a) {
            aVar = (com.truecaller.ads.keywords.network.a) quxVar;
            int i2 = aVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = aVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.lang.String a = ((com.truecaller.ads.util.l) ((com.truecaller.ads.util.k) this.b.get())).a();
                    if (a == null) {
                        a = "";
                    }
                    kotlin.Pair pair = new kotlin.Pair("adId", a);
                    kotlin.Pair pair2 = new kotlin.Pair("placement", kotlin.collections.CollectionsKt.b0(barVar.b, ",", (java.lang.String) null, (java.lang.String) null, (kotlin.jvm.functions.Function1) null, 62));
                    kotlin.Pair pair3 = new kotlin.Pair("searchType", (java.lang.Object) null);
                    kotlin.Pair pair4 = new kotlin.Pair("name", (java.lang.Object) null);
                    kotlin.Pair pair5 = new kotlin.Pair("countryCode", (java.lang.Object) null);
                    kotlin.Pair pair6 = new kotlin.Pair("q", barVar.a);
                    kotlin.Pair pair7 = new kotlin.Pair("spamScore", (java.lang.Object) null);
                    t90.b2 b2Var = (t90.b2) this.c.get();
                    b2Var.e();
                    int i3 = t90.z1.a[b2Var.l.a.ordinal()];
                    if (i3 != 1 && i3 != 2) {
                        if (i3 == 3) {
                            z = true;
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    } else {
                        z = false;
                    }
                    java.util.Map i4 = kotlin.collections.r0.i(new kotlin.Pair[]{pair, pair2, pair3, pair4, pair5, pair6, pair7, new kotlin.Pair("optOutUser", java.lang.Boolean.valueOf(z))});
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry entry : i4.entrySet()) {
                        if (entry.getValue() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    com.truecaller.ads.keywords.network.b bVar = new com.truecaller.ads.keywords.network.b(this, linkedHashMap, null);
                    aVar.z = 1;
                    obj = ak.r0.h0(bVar, aVar);
                    if (obj == barVar2) {
                        return barVar2;
                    }
                }
                k0Var = (wj3.k0) obj;
                if (k0Var != null || !k0Var.a.k()) {
                    return null;
                }
                return (com.truecaller.ads.keywords.model.AdCampaignsRestDto) k0Var.b;
            }
        }
        aVar = new com.truecaller.ads.keywords.network.a(this, quxVar);
        java.lang.Object obj2 = aVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = aVar.z;
        if (i == 0) {
        }
        k0Var = (wj3.k0) obj2;
        if (k0Var != null) {
        }
        return null;
    }
}
