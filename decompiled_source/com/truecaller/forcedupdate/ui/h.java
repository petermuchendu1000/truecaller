package com.truecaller.forcedupdate.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class h implements zj2.c {
    public final /* synthetic */ int a = 1;
    public final android.content.Context b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public h(android.content.Context context, qc3.bar barVar, m03.c cVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "forcedUpdateManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "appListener");
        this.b = context;
        this.c = barVar;
        this.d = cVar;
    }

    public final /* bridge */ void a() {
        int i = this.a;
    }

    public final void c(r5.g gVar) {
        com.truecaller.remoteconfig.truecaller.UpgradeStatus.UpgradePath upgradePath;
        int i;
        com.truecaller.forcedupdate.UpdateType updateType;
        java.lang.String str;
        switch (this.a) {
            case 0:
                mp1.bar barVar = (mp1.bar) ((qc3.bar) this.c).get();
                java.lang.Integer num = null;
                if (gVar != null) {
                    upgradePath = (com.truecaller.remoteconfig.truecaller.UpgradeStatus.UpgradePath) gVar.b;
                } else {
                    upgradePath = null;
                }
                if (upgradePath == null) {
                    i = -1;
                } else {
                    i = com.truecaller.forcedupdate.ui.g.a[upgradePath.ordinal()];
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            updateType = com.truecaller.forcedupdate.UpdateType.NONE;
                        } else {
                            updateType = com.truecaller.forcedupdate.UpdateType.DISCONTINUED;
                        }
                    } else {
                        updateType = com.truecaller.forcedupdate.UpdateType.REQUIRED;
                    }
                } else {
                    updateType = com.truecaller.forcedupdate.UpdateType.OPTIONAL;
                }
                if (gVar != null) {
                    str = (java.lang.String) gVar.c;
                } else {
                    str = null;
                }
                if (gVar != null) {
                    num = java.lang.Integer.valueOf(gVar.a);
                }
                barVar.c(updateType, str, num);
                if (((m03.c) this.d).b() && !barVar.a().getSkippable()) {
                    com.truecaller.forcedupdate.ui.ForcedUpdateActivity.t0(this.b);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void f(java.util.Map map) {
        j81.baz bazVar;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "parameters");
                return;
            default:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "parameters");
                com.google.gson.Gson gson = (com.google.gson.Gson) this.d;
                java.lang.Object fromJson = gson.fromJson(gson.toJson(map), oo1.a.class);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
                try {
                    bazVar = (j81.baz) gson.fromJson(((oo1.a) fromJson).f, j81.baz.class);
                    if (bazVar == null) {
                        bazVar = new j81.baz(kotlin.collections.h0.a);
                    }
                } catch (com.google.gson.v e) {
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
                    bazVar = new j81.baz(kotlin.collections.h0.a);
                }
                j81.qux quxVar = (j81.qux) this.c;
                j81.a aVar = quxVar.b;
                y42.f fVar = quxVar.a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "blacklistedOperatorsDto");
                java.util.List<j81.bar> operators = bazVar.getOperators();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(operators, 10));
                for (j81.bar barVar : operators) {
                    arrayList.add(new kotlin.Pair(barVar.getMcc(), barVar.getMnc()));
                }
                java.util.List c = fVar.c();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(c, "getAllSimInfos(...)");
                java.util.List list = c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.truecaller.multisim.SimInfo n = fVar.n(((com.truecaller.multisim.SimInfo) it.next()).b);
                    kotlin.Pair pair = null;
                    if (n != null) {
                        java.lang.String str = n.e;
                        if (str.length() >= 4) {
                            pair = new kotlin.Pair(str.substring(0, 3), str.substring(3));
                        }
                    }
                    arrayList2.add(pair);
                }
                boolean z = aVar.z("keyIsOperatorBlacklisted", false);
                boolean z2 = !kotlin.collections.CollectionsKt.Z(arrayList2, kotlin.collections.CollectionsKt.K0(arrayList)).isEmpty();
                aVar.c0("keyIsOperatorBlacklisted", z2);
                if (z != z2) {
                    android.content.ContentResolver contentResolver = this.b.getContentResolver();
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.putNull("aggregated_contact_id");
                    contentResolver.update(h81.c.d(), contentValues, "contact_source=?", new java.lang.String[]{"256"});
                    return;
                }
                return;
        }
    }

    public h(android.content.Context context, j81.qux quxVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "repository");
        this.b = context;
        this.c = quxVar;
        this.d = new com.google.gson.Gson();
    }

    private final /* bridge */ void b() {
    }

    private final /* bridge */ void d() {
    }

    private final /* bridge */ void e(r5.g gVar) {
    }
}
