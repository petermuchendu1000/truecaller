package com.truecaller.push;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class d extends uf0.o {
    public final /* synthetic */ int b = 0;
    public final java.lang.String c;
    public final java.lang.Object d;

    public d(com.truecaller.push.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "pushIdManager");
        this.d = aVar;
        this.c = "PushIdRegistrationWorkAction";
    }

    public final nd.t a() {
        com.truecaller.messaging.data.types.BinaryEntity binaryEntity;
        int i = this.b;
        boolean z = false;
        java.lang.Object obj = this.d;
        switch (i) {
            case 0:
                boolean a = ((com.truecaller.push.a) obj).a(null);
                if (a) {
                    nd.s a2 = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                    return a2;
                }
                if (!a) {
                    return wi0.bar.u("failure(...)");
                }
                throw new java.lang.RuntimeException();
            case 1:
                f42.g gVar = (f42.g) obj;
                f42.o1 o1Var = gVar.d;
                xz1.r rVar = gVar.c;
                android.database.Cursor query = gVar.b.query(h81.c.a(), new java.lang.String[]{"DISTINCT(data1)"}, "data_type = ? AND data_phonebook_id NOT NULL AND data8 = ?", new java.lang.String[]{"4", "MOBILE"}, null);
                if (query != null) {
                    android.database.Cursor cursor = query;
                    try {
                        android.database.Cursor cursor2 = cursor;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (query.moveToNext()) {
                            arrayList.add(query.getString(0));
                        }
                        cursor.close();
                        if (!arrayList.isEmpty()) {
                            xz1.r rVar2 = rVar;
                            if (rVar2.D("imInitialSyncTimestamp", -1L) > 0) {
                                o1Var.e(arrayList);
                            } else {
                                java.lang.Boolean bool = (java.lang.Boolean) o1Var.f(arrayList).q();
                                if (bool != null) {
                                    z = bool.booleanValue();
                                }
                                if (z) {
                                    m03.p pVar = gVar.a;
                                    pVar.getClass();
                                    rVar2.e0("imInitialSyncTimestamp", java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(pVar.m().i()));
                                }
                            }
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            throw th;
                        } catch (java.lang.Throwable th3) {
                            i71.g.r(cursor, th);
                            throw th3;
                        }
                    }
                }
                nd.s a3 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "success(...)");
                return a3;
            case 2:
                g42.bar barVar = (g42.bar) obj;
                if (barVar.b()) {
                    y12.d b = barVar.c.b(barVar.b.query(h81.a.v(), null, "\n            type != ?\n            AND message_id IN (\n                SELECT _id\n                FROM msg_messages\n                WHERE transport = 2 AND \n                (status & 1) = \n                1\n            )\n        ", new java.lang.String[]{"text/plain"}, null));
                    if (b != null) {
                        while (b.moveToNext()) {
                            try {
                                com.truecaller.messaging.data.types.BinaryEntity d = b.d();
                                if (d instanceof com.truecaller.messaging.data.types.BinaryEntity) {
                                    binaryEntity = d;
                                } else {
                                    binaryEntity = null;
                                }
                                if (binaryEntity != null && binaryEntity.i.getPathSegments().contains("im-media")) {
                                    barVar.a(binaryEntity);
                                }
                            } catch (java.lang.Throwable th4) {
                                try {
                                    throw th4;
                                } catch (java.lang.Throwable th5) {
                                    i71.g.r(b, th4);
                                    throw th5;
                                }
                            }
                        }
                        kotlin.Unit unit = kotlin.Unit.a;
                        b.close();
                    }
                    barVar.e.c0("isImAttachmentFileMigrationPending", false);
                }
                nd.s a4 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a4, "success(...)");
                return a4;
            case 3:
                h42.bar barVar2 = (h42.bar) obj;
                if (barVar2.c()) {
                    h42.baz a5 = barVar2.a(false);
                    h42.baz a6 = barVar2.a(true);
                    java.io.File file = new java.io.File(android.os.Environment.getExternalStorageDirectory(), "Truecaller");
                    java.io.File[] listFiles = file.listFiles((java.io.FilenameFilter) new com.google.firebase.crashlytics.internal.persistence.bar(3));
                    if (listFiles != null) {
                        for (java.io.File file2 : listFiles) {
                            java.io.File[] listFiles2 = file2.listFiles();
                            if (listFiles2 == null) {
                                listFiles2 = new java.io.File[0];
                            }
                            if (listFiles2.length <= 1) {
                                com.bumptech.glide.qux.K(new java.io.File(file2, ".nomedia"));
                                com.bumptech.glide.qux.K(file2);
                            }
                        }
                    }
                    com.bumptech.glide.qux.K(file);
                    barVar2.d.c0("isImAttachmentMigrationPending", false);
                    h42.baz[] bazVarArr = {a5, a6};
                    int i2 = 0;
                    for (int i3 = 0; i3 < 2; i3++) {
                        i2 += bazVarArr[i3].a;
                    }
                    for (int i4 = 0; i4 < 2; i4++) {
                        int i5 = bazVarArr[i4].b;
                    }
                    java.lang.Math.pow(10.0d, java.lang.Math.floor(java.lang.Math.log10(i2)));
                }
                nd.s a7 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a7, "success(...)");
                return a7;
            case 4:
                ((kz1.baz) obj).H();
                nd.s a8 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a8, "success(...)");
                return a8;
            case 5:
                ga1.e eVar = (ga1.e) obj;
                eVar.o();
                ((r31.bar) eVar.e).m("notificationAccessLastShown", ((t41.r0) eVar.d).c());
                nd.s a9 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a9, "success(...)");
                return a9;
            case 6:
                java.lang.Object O = fg3.h0.O(kotlin.coroutines.d.a, new uz.e(this, (df3.bar) null, 13));
                kotlin.jvm.internal.Intrinsics.d(O);
                return (nd.t) O;
            default:
                ((wy.bar) obj).b();
                nd.s a10 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a10, "success(...)");
                return a10;
        }
    }

    public final boolean b() {
        boolean b;
        switch (this.b) {
            case 0:
                return ((n11.l) ((com.truecaller.push.a) this.d).a.get()).j();
            case 1:
                f42.g gVar = (f42.g) this.d;
                if (gVar.e.j()) {
                    gVar.f.getClass();
                    if (z62.d.g("initialContactsSyncComplete")) {
                        return true;
                    }
                }
                return false;
            case 2:
                return ((g42.bar) this.d).b();
            case 3:
                return ((h42.bar) this.d).c();
            case 4:
                return ((kz1.baz) this.d).d.i.a.a("featureInsightsPermissionsSnapshot", com.truecaller.featuretoggles.FeatureState.ENABLED);
            case 5:
                ga1.e eVar = (ga1.e) this.d;
                if (((qo1.r) eVar.f).b.a("featureMessagingAppsCallerId", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                    oo1.f fVar = (oo1.f) eVar.g;
                    int d = fVar.g1.n(fVar, oo1.f.i1[114]).d(30);
                    long f = ((r31.bar) eVar.e).f("notificationAccessLastShown", 0L);
                    if (f == 0) {
                        b = true;
                    } else {
                        b = ((t41.r0) eVar.d).b(f, java.util.concurrent.TimeUnit.DAYS.toMillis(d));
                    }
                    if (b && !((u62.g) eVar.c).a.a()) {
                        u03.b bVar = (u03.b) eVar.k;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "deviceInfoUtil");
                        if (((u03.c) bVar).u("com.whatsapp")) {
                            return true;
                        }
                    }
                }
                return false;
            case 6:
                y.n0 n0Var = (y.n0) this.d;
                m03.s sVar = (m03.s) n0Var.b;
                if (!((vj2.a) n0Var.e).c("featureFriendsUpgraded_24757", false) || !sVar.b() || !z62.d.g("initialContactsSyncComplete")) {
                    return false;
                }
                return true;
            default:
                return ((wy.bar) this.d).a();
        }
    }

    public final java.lang.String getName() {
        switch (this.b) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            case 2:
                return this.c;
            case 3:
                return this.c;
            case 4:
                return this.c;
            case 5:
                return this.c;
            case 6:
                return this.c;
            default:
                return this.c;
        }
    }

    public d(f42.g gVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "imContactFetcher");
        this.d = gVar;
        this.c = "FetchImContactsWorkAction";
    }

    public d(g42.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "migrator");
        this.d = barVar;
        this.c = "ImAttachmentFileMigratorWorker";
    }

    public d(ga1.e eVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "manager");
        this.d = eVar;
        this.c = "IdentifyWhatsAppNotificationWorkAction";
    }

    public d(h42.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "migrator");
        this.d = barVar;
        this.c = "ImAttachmentMigratorWorker";
    }

    public d(wy.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "accountSuspensionNotificationHelper");
        this.d = barVar;
        this.c = "AccountSuspendedNotificationWorkAction";
    }

    public d(kz1.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "snapshotCompanion");
        this.d = bazVar;
        this.c = "InsightsPermissionsSnapshotWorkAction";
    }

    public d(y.n0 n0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n0Var, "contactsPremiumStatusManager");
        this.d = n0Var;
        this.c = "ContactsPremiumStatusFetchWorkAction";
    }
}
