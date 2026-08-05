package com.truecaller.network.advanced.edge;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class qux implements com.truecaller.network.advanced.edge.baz {
    public final n11.l a;
    public final y52.bar b;
    public final q11.bar c;
    public final android.telephony.TelephonyManager d;
    public final java.io.File e;
    public com.truecaller.network.advanced.edge.bar f;
    public final kotlin.Lazy g;

    public qux(n11.l lVar, y52.bar barVar, q11.bar barVar2, android.telephony.TelephonyManager telephonyManager, java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "networkAdvancedSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "accountSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telephonyManager, "telephonyManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "filesDir");
        this.a = lVar;
        this.b = barVar;
        this.c = barVar2;
        this.d = telephonyManager;
        java.io.File file2 = new java.io.File(file, "edges.json");
        this.e = file2;
        this.g = kotlin.LazyKt.lazy(new com.truecaller.ads.util.u0(17));
        try {
            if (file2.exists()) {
                synchronized (this) {
                    java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(file2), kotlin.text.Charsets.UTF_8);
                    try {
                        com.truecaller.network.advanced.edge.bar barVar3 = (com.truecaller.network.advanced.edge.bar) new com.google.gson.Gson().fromJson(inputStreamReader, com.truecaller.network.advanced.edge.bar.class);
                        inputStreamReader.close();
                        this.f = barVar3;
                    } finally {
                    }
                }
            }
        } catch (java.lang.Exception e) {
            if (e instanceof com.google.gson.v) {
                java.lang.String str = "Couldn't parse edges from disk: " + e.getMessage();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "message");
                o82.a.C(new java.lang.RuntimeException(str));
                b();
                return;
            }
            o82.a.C(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.truecaller.network.advanced.edge.bar$bar, java.lang.Object] */
    public final boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.Map linkedHashMap;
        boolean f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "domain");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "edgeName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "edgeHost");
        synchronized (this) {
            try {
                com.truecaller.network.advanced.edge.bar barVar = this.f;
                com.truecaller.network.advanced.edge.bar barVar2 = barVar;
                if (barVar == null) {
                    barVar2 = new java.lang.Object();
                }
                if (barVar2.getData() == null) {
                    barVar2.c(new java.util.LinkedHashMap());
                }
                java.util.Map data = barVar2.getData();
                if (data == null || (linkedHashMap = (java.util.Map) data.get(str)) == null) {
                    linkedHashMap = new java.util.LinkedHashMap();
                }
                ?? obj = new java.lang.Object();
                obj.b(kotlin.collections.y.l(new java.lang.String[]{str3}));
                linkedHashMap.put(str2, obj);
                java.util.Map data2 = barVar2.getData();
                if (data2 != null) {
                }
                this.f = barVar2;
                f = f(barVar2);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return f;
    }

    public final void b() {
        synchronized (this) {
            this.e.delete();
            this.f = null;
            kotlin.Unit unit = kotlin.Unit.a;
        }
        this.b.p("edgeLocationsExpiration");
        this.b.p("edgeLocationsLastRequestTime");
    }

    public final java.lang.String c(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "domain");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "edgeName");
        java.lang.String d = d(this.f, str, str2);
        if (d == null) {
            return d((com.truecaller.network.advanced.edge.bar) this.g.getValue(), str, str2);
        }
        return d;
    }

    public final java.lang.String d(com.truecaller.network.advanced.edge.bar barVar, java.lang.String str, java.lang.String str2) {
        java.util.Map map;
        com.truecaller.network.advanced.edge.bar.C0000bar c0000bar;
        java.util.List edges;
        java.lang.String str3;
        synchronized (this) {
            if (barVar != null) {
                java.util.Map data = barVar.getData();
                if (data != null && (map = (java.util.Map) data.get(str)) != null && (c0000bar = (com.truecaller.network.advanced.edge.bar.C0000bar) map.get(str2)) != null) {
                    edges = c0000bar.getEdges();
                }
            }
            edges = null;
        }
        if (edges == null || (str3 = (java.lang.String) kotlin.collections.CollectionsKt.firstOrNull(edges)) == null || kotlin.text.StringsKt.X(str3)) {
            return null;
        }
        return str3;
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        com.truecaller.network.advanced.edge.bar.C0000bar c0000bar;
        java.util.Map map;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "domain");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "edgeName");
        synchronized (this) {
            try {
                com.truecaller.network.advanced.edge.bar barVar = this.f;
                if (barVar != null) {
                    java.util.Map data = barVar.getData();
                    if (data != null && (map = (java.util.Map) data.get(str)) != null) {
                        c0000bar = (com.truecaller.network.advanced.edge.bar.C0000bar) map.remove(str2);
                    } else {
                        c0000bar = null;
                    }
                    if (c0000bar != null) {
                        f(barVar);
                    }
                    kotlin.Unit unit = kotlin.Unit.a;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f(com.truecaller.network.advanced.edge.bar barVar) {
        try {
            java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.e), kotlin.text.Charsets.UTF_8);
            try {
                new com.google.gson.Gson().toJson(barVar, outputStreamWriter);
                kotlin.Unit unit = kotlin.Unit.a;
                outputStreamWriter.close();
                if (barVar.getTimeToLive() > 0) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis() + java.util.concurrent.TimeUnit.SECONDS.toMillis(barVar.getTimeToLive());
                    java.util.Date date = new java.util.Date(currentTimeMillis);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Edge location document (");
                    sb.append(barVar);
                    sb.append(") expires @ ");
                    sb.append(date);
                    this.b.m("edgeLocationsExpiration", currentTimeMillis);
                    return true;
                }
                return true;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    i71.g.r(outputStreamWriter, th);
                    throw th2;
                }
            }
        } catch (java.io.IOException e) {
            o82.a.C(e);
            return false;
        } catch (java.lang.RuntimeException e2) {
            o82.a.C(e2);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, p31.bar] */
    /* JADX WARN: Type inference failed for: r6v0, types: [j31.n, java.lang.Object] */
    public final boolean g() {
        com.truecaller.network.advanced.edge.bar barVar;
        java.lang.String g = this.a.g();
        if (g == null) {
            g = this.c.h("profileNumber");
        }
        boolean z = false;
        if (g == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Trying to call edge location without phone number", "message");
            o82.a.C(new java.lang.RuntimeException("Trying to call edge location without phone number"));
            return false;
        }
        java.lang.String f = this.a.f();
        if (f == null) {
            f = this.c.h("profileCountryIso");
        }
        if (f == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Trying to call edge location without profile country code", "message");
            o82.a.C(new java.lang.RuntimeException("Trying to call edge location without profile country code"));
            return false;
        }
        this.b.m("edgeLocationsLastRequestTime", java.lang.System.currentTimeMillis());
        java.lang.String networkCountryIso = this.d.getNetworkCountryIso();
        ?? obj = new java.lang.Object();
        obj.a(com.truecaller.common.network.util.KnownEndpoints.EDGE);
        obj.g(com.truecaller.network.advanced.edge.a.class);
        ?? obj2 = new java.lang.Object();
        com.truecaller.common.network.util.AuthRequirement authRequirement = com.truecaller.common.network.util.AuthRequirement.OPTIONAL;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authRequirement, "authRequirement");
        obj2.b(authRequirement, (java.lang.String) null);
        ((j31.n) obj2).b = new j31.c(false);
        okhttp3.OkHttpClient a = p31.baz.a((j31.n) obj2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "client");
        ((p31.bar) obj).g = a;
        wj3.k0 H = ((com.truecaller.network.advanced.edge.a) obj.d(com.truecaller.network.advanced.edge.a.class)).a(networkCountryIso, f, g).H();
        if (!H.a.k() || (barVar = (com.truecaller.network.advanced.edge.bar) H.b) == null) {
            return false;
        }
        synchronized (this) {
            this.f = barVar;
            if (barVar.getData() != null) {
                z = true;
            }
            if (z) {
                return f(barVar);
            }
            kotlin.Unit unit = kotlin.Unit.a;
            return true;
        }
    }
}
