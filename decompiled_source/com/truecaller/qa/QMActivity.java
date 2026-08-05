package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public class QMActivity extends com.truecaller.qa.Hilt_QMActivity implements android.view.View.OnClickListener {
    public static final /* synthetic */ int B1 = 0;
    public xz1.q A0;
    public nd1.bar A1;
    public qw2.a0 B0;
    public u03.z C0;
    public com.truecaller.qa.x D0;
    public tf2.r E0;
    public k71.e F0;
    public hz1.d G0;
    public bw1.b H0;
    public hz1.c I0;
    public uw1.d J0;
    public u03.b K0;
    public s62.d L0;
    public u62.k M0;
    public up2.qux N0;
    public iy.bar O0;
    public e23.qux P0;
    public rk0.bar Q0;
    public f43.baz R0;
    public ah.f S0;
    public com.truecaller.messaging.notifications.z T0;
    public n11.l U0;
    public gy.qux V0;
    public ev0.baz W0;
    public com.google.firebase.messaging.q X0;
    public nt2.qux Y0;
    public o02.baz Z0;
    public m03.s a1;
    public ah.n b1;
    public w82.v c1;
    public android.view.ViewGroup d0;
    public t41.t d1;
    public mp1.bar e0;
    public xd0.qux e1;
    public o63.b f0;
    public qc3.bar f1;
    public o63.bar g0;
    public qc3.bar g1;
    public tx.v h0;
    public w82.q1 h1;
    public h93.baz i0;
    public w82.y1 i1;
    public kx2.bar j0;
    public i82.t j1;
    public ej0.baz k0;
    public u62.b k1;
    public ij0.e l0;
    public qw2.u l1;
    public q81.b m0;
    public op1.h m1;
    public hw0.a n0;
    public c62.q n1;
    public rz0.x o0;
    public qo1.r o1;
    public j01.n p0;
    public com.truecaller.data.country.g p1;
    public jq2.b q0;
    public dn2.u0 q1;
    public jq2.qux r0;
    public hb2.baz r1;
    public zd2.j s0;
    public i.d0 s1;
    public r31.bar t0;
    public dg0.qux t1;
    public q11.bar u0;
    public com.truecaller.remoteconfig.firebase.baz u1;
    public yh2.bar v0;
    public cd3.b v1;
    public qc3.bar w0;
    public q83.a w1;
    public n11.g x0;
    public dj0.baz x1;
    public c73.k0 y0;
    public cm0.qux y1;
    public vf2.bar z0;
    public s62.d z1;

    /* loaded from: /home/user/tc_decoded/classes7.dex */
    public static class bar extends com.truecaller.qa.b {
        public qz.n h;
        public final com.google.firebase.crashlytics.internal.concurrency.baz i = new com.google.firebase.crashlytics.internal.concurrency.baz(this, 14);

        public final void onCreate(android.os.Bundle bundle) {
            this.h.c(com.truecaller.analytics.common.acs.AcsAnalyticsContext.FACS, this.i);
            super.onCreate(bundle);
        }
    }

    public static com.truecaller.data.entity.Contact B0() {
        com.truecaller.data.entity.Contact contact = new com.truecaller.data.entity.Contact();
        contact.I = "John Doe";
        contact.c(com.truecaller.data.entity.Number.a("+46761234567", "+46761234567", "SE"));
        return contact;
    }

    public final cu0.c A0(int i, java.lang.String str) {
        com.truecaller.data.entity.Contact contact = new com.truecaller.data.entity.Contact();
        contact.I = "Sample contact";
        contact.c(new com.truecaller.data.entity.Number(str, (java.lang.String) null));
        return new cu0.c(3, i, this.m0.e(new java.lang.String[]{str}), 0, "", false, java.lang.System.currentTimeMillis(), new java.util.Random().nextLong(), contact, "", this.l0.f(str), true, false, false, 0L, false, false, false, (java.lang.String) null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C0() {
        try {
            java.io.File parentFile = getDatabasePath("test.db").getParentFile();
            java.lang.Class<?> cls = java.lang.Class.forName("android.os.FileUtils");
            java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
            java.lang.reflect.Method method = cls.getMethod("setPermissions", java.lang.String.class, cls2, cls2, cls2);
            java.util.TreeSet treeSet = new java.util.TreeSet();
            for (java.io.File file : parentFile.listFiles()) {
                try {
                    if (file.getName().endsWith(".db")) {
                        method.invoke(null, file.getAbsolutePath(), 420, -1, -1);
                        treeSet.add(file.getAbsolutePath());
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("File permissions changed for ");
                        sb.append(file);
                    }
                } catch (java.lang.Throwable th) {
                    th.printStackTrace();
                }
            }
            if (!treeSet.isEmpty()) {
                android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) ("Permissions changed for: " + android.text.TextUtils.join(",", treeSet)), 1).show();
            }
        } catch (java.lang.Throwable th3) {
            th3.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D0() {
        deleteDatabase("tc.db");
        ((su0.i) this.e1.a()).h();
        ((h61.bar) this.f1.get()).a(false);
        ((y12.v) ((xd0.qux) this.g1.get()).a()).Y(true);
        android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Provider has been reset, syncing call log and phone book", 0).show();
    }

    public final void E0() {
        kx2.bar barVar = this.j0;
        barVar.h.e0("spamListUpdatedTimestamp", 0L);
        kx2.b bVar = barVar.a;
        bVar.m("filter_topSpammersSyncLastUpdateTimestamp", 0L);
        bVar.n("filter_topSpammersEtag", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F0() {
        new i.d(this).setTitle("Set DMA Banner Page counter").l(2131560292).setPositiveButton(2132019051, new com.truecaller.qa.h(7, this)).setNegativeButton(2132019018, (android.content.DialogInterface.OnClickListener) null).m();
    }

    public final void G0(int i, com.truecaller.qa.QMActivity qMActivity) {
        android.view.View findViewById = findViewById(i);
        if (findViewById != null) {
            findViewById.setClickable(true);
            findViewById.setOnClickListener(qMActivity);
        }
    }

    public final void H0(int i, boolean z, android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        com.google.android.material.materialswitch.MaterialSwitch findViewById = findViewById(i);
        if (findViewById == null) {
            return;
        }
        findViewById.setChecked(z);
        findViewById.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I0() {
        new i.d(this).setTitle("Set Profile Views Counter").l(2131560298).setPositiveButton(2132019079, new com.truecaller.qa.h(3, this)).setNegativeButton(2132019018, (android.content.DialogInterface.OnClickListener) null).m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J0() {
        new i.d(this).setTitle("Set User Home Notifications Counter").l(2131560298).setPositiveButton(2132019079, new com.truecaller.qa.h(4, this)).setNegativeButton(2132019018, (android.content.DialogInterface.OnClickListener) null).m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K0() {
        i.e create = new i.d(this).setTitle("Enter verification sequence number").l(2131560296).setPositiveButton(2132019051, new com.truecaller.qa.h(0, this)).setNegativeButton(2132019018, (android.content.DialogInterface.OnClickListener) null).create();
        create.setOnShowListener(new az1.h(this, 1));
        create.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L0() {
        new i.d(this).setTitle("Set Who Searched For Me Counter").l(2131560298).setPositiveButton(2132019079, new com.truecaller.qa.h(9, this)).setNegativeButton(2132019018, (android.content.DialogInterface.OnClickListener) null).m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
        od.n k = od.n.k(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k, "getInstance(...)");
        fe0.m.C(k, str, this);
    }

    public final void X0() {
        this.O0.D(java.util.Collections.singletonList(new com.truecaller.commentfeedback.db.CommentFeedback(0L, 100L, "+460000000", false, "cool_feedback", com.truecaller.data.entity.FeedbackSource.BLOCK_FLOW.name(), "PENDING", true, com.truecaller.commentfeedback.db.PhoneNumberType.UNKNOWN_NUMBER_TYPE.name())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.List list;
        com.truecaller.data.country.CountryListDto.baz bazVar;
        r11.bar a = r11.bar.a();
        int id = view.getId();
        if (id == 2131364695) {
            com.appsflyer.internal.e.v(this.G0.a, "isCategorizerUpdatePopUpSeen", false);
            android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Categorizer update pop up state cleared", 0).show();
            return;
        }
        if (id == 2131363436) {
            new z62.bar(this, 0).a();
            ak2.qux.c(this);
            return;
        }
        if (id == 2131363435) {
            ak2.qux.c(this);
            return;
        }
        if (id == 2131363434) {
            ne0.baz.r("tagsPhonebookForcedUpload", true);
            ak2.qux.c(this);
            return;
        }
        if (id == 2131363391) {
            new com.truecaller.qa.p(this, this.V0).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
            return;
        }
        if (id == 2131363394) {
            co1.bar barVar = this.W0.a;
            android.content.ContentProviderOperation build = android.content.ContentProviderOperation.newDelete(h81.a.k()).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            android.content.ContentResolver contentResolver = barVar.a;
            android.net.Uri uri = h81.e.a;
            contentResolver.applyBatch("com.truecaller", kotlin.collections.y.f(new android.content.ContentProviderOperation[]{build}));
            android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Contacts settings reseted", 1).show();
            return;
        }
        if (id == 2131363321) {
            W0("CleverTapRefreshWorkAction");
            return;
        }
        if (id == 2131363309) {
            W0("CloudTelephonyWorkAction");
            return;
        }
        if (id == 2131363340) {
            W0("FirebaseRefreshWorkAction");
            return;
        }
        df3.bar barVar2 = null;
        if (id == 2131363027) {
            cm0.a aVar = this.y1;
            aVar.getClass();
            fg3.h0.P(new c62.a(aVar, (df3.bar) null, 10));
            return;
        }
        if (id == 2131363315) {
            new com.truecaller.qa.q(this).execute(new java.lang.Void[0]);
            return;
        }
        if (id == 2131363786) {
            y0();
            return;
        }
        if (id == 2131363398) {
            D0();
            return;
        }
        if (id == 2131363326) {
            getContentResolver().call(h81.e.a, "dump", (java.lang.String) null, (android.os.Bundle) null);
            return;
        }
        if (id == 2131363385) {
            C0();
            return;
        }
        if (id == 2131363392) {
            for (com.truecaller.service.AlarmReceiver.AlarmType alarmType : com.truecaller.service.AlarmReceiver.AlarmType.values()) {
                z62.d.n(0L, alarmType.name());
            }
            com.truecaller.service.AlarmReceiver.e(this, false);
            return;
        }
        if (id == 2131363302) {
            t0();
            return;
        }
        if (id == 2131363415) {
            F0();
            return;
        }
        if (id == 2131363314) {
            ((com.truecaller.network.advanced.edge.baz) this.w0.get()).b();
            android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Edge locations cleared", 0).show();
            return;
        }
        if (id == 2131363432) {
            W0("EdgeLocationsWorkAction");
            return;
        }
        if (id == 2131363389) {
            this.n0.m();
            return;
        }
        if (id == 2131363395) {
            this.I0.a();
            finish();
            return;
        }
        if (id == 2131363396) {
            this.G0.i(com.truecaller.insights.utils.HideTrxTempState.DEFAULT);
            this.G0.f();
            this.G0.j();
            this.G0.h();
            finish();
            return;
        }
        if (id == 2131363397) {
            this.G0.k();
            return;
        }
        if (id == 2131363304) {
            v0();
            return;
        }
        if (id == 2131363401) {
            E0();
            return;
        }
        if (id == 2131363038) {
            this.k0.h();
            return;
        }
        if (id == 2131363026) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
            od.n k = od.n.k(this);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k, "getInstance(...)");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("from_restore", "key");
            linkedHashMap.put("from_restore", java.lang.Boolean.FALSE);
            nd.g gVar = new nd.g(linkedHashMap);
            mf0.o.K(gVar);
            fe0.m.D(k, "CleanupFiltersWorkAction", this, (kotlin.Pair) null, gVar, 4);
            return;
        }
        if (id == 2131363431) {
            ne0.baz.v("tagsEntityTag", (java.lang.String) null);
            c42.baz.c(this);
            return;
        }
        if (id == 2131363339) {
            this.Y0.c();
            return;
        }
        if (id == 2131363338) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
            od.n k2 = od.n.k(this);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k2, "getInstance(...)");
            fe0.m.D(k2, "FetchSearchWarningsWorkAction", this, (kotlin.Pair) null, (nd.g) null, 12);
            return;
        }
        if (id == 2131363388) {
            f42.q0.c(this);
            return;
        }
        if (id == 2131363386) {
            sp1.baz.y();
            return;
        }
        if (id == 2131363305) {
            W0("AttestationWorkAction");
            return;
        }
        if (id == 2131363307) {
            W0("BackupLogWorker");
            return;
        }
        if (id == 2131363420) {
            cu0.b bVar = new cu0.b(this, this.q0, this.o1, this.C0, this.K0, this.x1, this.p0, this.A1, this.L0, this.M0);
            bVar.a(A0(java.lang.Math.random() > 0.5d ? 1 : 3, "+123456789"));
            if (java.lang.Math.random() > 0.5d) {
                bVar.a(A0(java.lang.Math.random() > 0.5d ? 1 : 3, "+198765432"));
            }
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("new", (java.lang.Integer) 1);
            contentValues.put("is_read", (java.lang.Integer) 0);
            getContentResolver().update(h81.c.b(), contentValues, "_id= (SELECT MAX(_id) FROM history WHERE type=3)", null);
            com.truecaller.service.MissedCallsNotificationWorker.i(this);
            com.truecaller.service.AlarmReceiver.AlarmType alarmType2 = com.truecaller.service.AlarmReceiver.AlarmType.TYPE_UPDATE_SPAM;
            android.app.Notification notification = alarmType2.getNotification(this);
            if (notification != null) {
                s62.f fVar = this.z1;
                int notificationId = alarmType2.getNotificationId();
                s62.f fVar2 = fVar;
                fVar2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "notification");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "notification");
                fg3.h0.J(fVar2.e, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s2.k(fVar2, notification, notificationId, (df3.bar) null), 3);
            }
            com.truecaller.service.AlarmReceiver.AlarmType alarmType3 = com.truecaller.service.AlarmReceiver.AlarmType.TYPE_20DAYS;
            android.app.Notification notification2 = alarmType3.getNotification(this);
            if (notification2 != null) {
                s62.f fVar3 = this.z1;
                int notificationId2 = alarmType3.getNotificationId();
                s62.f fVar4 = fVar3;
                fVar4.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification2, "notification");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification2, "notification");
                fg3.h0.J(fVar4.e, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s2.k(fVar4, notification2, notificationId2, (df3.bar) null), 3);
                return;
            }
            return;
        }
        if (id == 2131363383) {
            fe0.m.C(nd.j0.h(this), "PushIdRegistrationWorkAction", this);
            return;
        }
        if (id == 2131363382) {
            ((ev.a) this.u1.f.getValue()).b().continueWithTask(new com.truecaller.qa.g(this)).addOnCompleteListener(new com.truecaller.qa.g(this));
            return;
        }
        if (id == 2131363372) {
            android.app.Notification a2 = this.T0.a(com.truecaller.data.entity.messaging.Participant.f("+46763185096", this.d1, "-1"), this.L0.o("miscellaneous_channel"));
            if (a2 != null) {
                this.L0.v(2131365332, a2, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationIncomingMessagePromo");
                return;
            }
            return;
        }
        if (id == 2131363438) {
            J0();
            return;
        }
        if (id == 2131363346) {
            this.R0.q0();
            return;
        }
        if (id == 2131363439) {
            androidx.fragment.app.bar d = getSupportFragmentManager().d();
            d.b(new st2.e(), st2.e.class.getSimpleName());
            d.o();
            return;
        }
        if (id == 2131363371) {
            androidx.fragment.app.bar d2 = getSupportFragmentManager().d();
            d2.b(new st2.c(), st2.c.class.getSimpleName());
            d2.o();
            return;
        }
        if (id == 2131363384) {
            androidx.fragment.app.bar d3 = getSupportFragmentManager().d();
            d3.b(new com.truecaller.qa.QMActivity.bar(), com.truecaller.qa.QMActivity.bar.class.getSimpleName());
            d3.o();
            return;
        }
        if (id == 2131363423) {
            new az1.j().show(getSupportFragmentManager(), az1.j.class.getSimpleName());
            return;
        }
        if (id == 2131363440) {
            ((d13.qux) this.r0).d0("whatsNewDialogShownRevision", 0);
            ((cl2.m) this.r0).i0("whatsNewShownTimestamp");
            ((d13.qux) this.r0).d0("key_mdau_promo_shown_times", 0);
            ((cl2.m) this.r0).e0("key_mdau_promo_shown_timestamp", 0L);
            ((cl2.m) this.r0).i0("appUpdatedAfterRebranding2");
            return;
        }
        if (id == 2131363417) {
            new yf0.l().show(getSupportFragmentManager(), yf0.l.class.getSimpleName());
            return;
        }
        if (id == 2131363403) {
            ((cl2.m) this.r0).c0("backupOnboardingAvailable", true);
            ((cl2.m) this.r0).c0("backupOnboardingShown", false);
            this.t0.m("key_backup_fetched_timestamp", java.lang.System.currentTimeMillis());
            return;
        }
        if (id == 2131363341) {
            this.t0.p("key_backup_last_success");
            this.t1.getClass();
            dg0.qux.c();
            return;
        }
        if (id == 2131363347) {
            new dg.b0(this.D0).E(this);
            return;
        }
        if (id == 2131363418) {
            android.content.Intent m = y90.m6.m(this, com.truecaller.bottombar.BottomBarButtonType.CALLS, "clipboard");
            m.setFlags(268435456);
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(this, 2131366092, m, 67108864);
            f6.f0 f0Var = new f6.f0(this, this.L0.o("miscellaneous_channel"));
            f0Var.r();
            f0Var.g(g6.b.d(this));
            f0Var.q(0, 0, true);
            f0Var.p();
            f0Var.o();
            f0Var.f(true);
            f0Var.h(activity);
            f0Var.j(getString(2132017670, "+123456789"));
            f0Var.u(getString(2132017669, "+123456789"));
            android.app.Notification d4 = f0Var.d();
            s62.f fVar5 = this.L0;
            fVar5.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d4, "notification");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d4, "notification");
            fg3.h0.J(fVar5.e, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s2.k(fVar5, d4, 100, (df3.bar) null), 3);
            return;
        }
        if (id == 2131363419) {
            new com.truecaller.qa.m(this, "0731256247", "0761840301", "+911244130150").f();
            return;
        }
        if (id == 2131363416) {
            w0();
            return;
        }
        if (id == 2131363421) {
            startActivity(new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.util.background.qa.WorkActionStatusActivity.class));
            return;
        }
        if (id == 2131363345) {
            fq0.qux.c(this);
            nc0.l.h(this);
            return;
        }
        if (id == 2131363370) {
            W0("InstalledAppsHeartbeatWorkAction");
            return;
        }
        if (id == 2131363364) {
            com.truecaller.insights.workers.InsightsReSyncWorker.e();
            return;
        }
        if (id == 2131363369) {
            W0("InsightsSeedUpdateWorkAction");
            return;
        }
        if (id == 2131363363) {
            W0("InsightsReclassificationWorkAction");
            return;
        }
        if (id == 2131363355) {
            com.truecaller.insights.workers.InsightsOneOffEnrichmentWorker.e();
            return;
        }
        if (id == 2131363358) {
            W0("InsightsFeatureRegistryWorkAction");
            return;
        }
        if (id == 2131363368) {
            android.content.Intent intent = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.insights.ui.qa.view.InsightsQAActivity.class);
            intent.putExtra("qaPageToOpen", "TotalSmartCardsShownDialog");
            startActivity(intent);
            return;
        }
        if (id == 2131363350) {
            android.content.Intent intent2 = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.insights.ui.qa.view.InsightsQAActivity.class);
            intent2.putExtra("qaPageToOpen", "InsightsCategorizerSeedFetch");
            startActivity(intent2);
            return;
        }
        if (id == 2131363351) {
            android.content.Intent intent3 = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.insights.ui.qa.view.InsightsQAActivity.class);
            intent3.putExtra("qaPageToOpen", "InsightsUpdatesClassifierSeedFetch");
            startActivity(intent3);
            return;
        }
        if (id == 2131363362) {
            android.content.Intent intent4 = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.insights.ui.qa.view.InsightsQAActivity.class);
            intent4.putExtra("qaPageToOpen", "InsightsParserSeedFetch");
            startActivity(intent4);
            return;
        }
        if (id == 2131363365) {
            android.content.Intent intent5 = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.insights.ui.qa.view.InsightsQAActivity.class);
            intent5.putExtra("qaPageToOpen", "InsightRowFFTester");
            startActivity(intent5);
            return;
        }
        if (id == 2131363349) {
            android.content.Intent intent6 = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.insights.ui.qa.view.InsightsQAActivity.class);
            intent6.putExtra("qaPageToOpen", "InsightsBrandSearchTester");
            startActivity(intent6);
            return;
        }
        if (id == 2131363412) {
            android.content.Intent intent7 = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.insights.ui.qa.view.InsightsQAActivity.class);
            intent7.putExtra("qaPageToOpen", "SenderResolutionTester");
            startActivity(intent7);
            return;
        }
        if (id == 2131364696) {
            z0();
            return;
        }
        if (id == 2131363399) {
            this.t0.p("featureRegion1_qa");
            ((android.widget.Checkable) findViewById(2131363427)).setChecked(this.x0.h(true));
            this.t0.p("featureRegion1_qa");
            this.t0.p("ppolicy_accepted");
            this.u0.p("region_c_accepted");
            return;
        }
        if (id == 2131363393) {
            this.t0.p("ppolicy_accepted");
            this.u0.p("region_c_accepted");
            this.u0.p("region_za_policy_accepted");
            this.u0.p("region_br_policy_accepted");
            return;
        }
        if (id == 2131363410) {
            dx2.bar barVar3 = dx2.bar.a;
            java.util.List b = dx2.bar.b();
            java.lang.String[] strArr = new java.lang.String[b.size()];
            dx2.d a3 = dx2.bar.a();
            int i = 0;
            for (int i2 = 0; i2 < b.size(); i2++) {
                strArr[i2] = getString(((dx2.d) b.get(i2)).a());
                if (b.get(i2) == a3) {
                    i = i2;
                }
            }
            i.d dVar = new i.d(this);
            dVar.j(strArr, i, new com.truecaller.qa.i(0, this, b));
            dVar.m();
            return;
        }
        if (id == 2131363424) {
            new kf.b(this, new java.lang.String[]{"0731256247", "0761840301", "+911244130150"}).f();
            return;
        }
        if (id == 2131363310) {
            new com.truecaller.qa.n(this, "0735342770").f();
            return;
        }
        if (id == 2131363313) {
            getSharedPreferences("callMeBackNotifications", 0).edit().clear().apply();
            return;
        }
        if (id == 2131362890) {
            long D = ((cl2.m) this.r0).D("oncePerMonthPromoRandomTimeToShow", -1L);
            java.lang.String f = org.joda.time.format.bar.a("dd MMMM yyyy HH:mm:ss").f(new org.joda.time.DateTime(java.lang.Long.valueOf(D)));
            if (D == -1) {
                android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Random Date: Not Selected", 1).show();
                return;
            }
            android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) ("Random Date: " + f), 1).show();
            return;
        }
        if (id == 2131363317) {
            kj2.baz bazVar2 = (kj2.baz) this.v1.get();
            if (bazVar2 != null) {
                bazVar2.clear();
                return;
            }
            return;
        }
        if (id == 2131363336) {
            this.v0.x();
            return;
        }
        if (id == 2131363301) {
            new ux.d().show(getSupportFragmentManager(), "");
            return;
        }
        if (id == 2131363033) {
            this.s0.s();
            tf2.r rVar = this.E0;
            fg3.h0.J(rVar.j, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new sr0.bar(rVar, (df3.bar) null, 10), 3);
            return;
        }
        if (id == 2131363035) {
            z62.d.i("feature_pro_promo_popup_last_time");
            z62.d.i("promo_popup_last_shown_timestamp");
            ((cl2.m) this.r0).i0("feature_pro_promo_popup_last_time");
            this.h1.a();
            tf2.r rVar2 = this.E0;
            fg3.h0.J(rVar2.j, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new sr0.bar(rVar2, (df3.bar) null, 10), 3);
            this.i1.a();
            this.E0.a();
            this.r1.c();
            return;
        }
        if (id == 2131363034) {
            w82.k2 k2Var = this.E0.a;
            k2Var.getClass();
            fg3.h0.J(fg3.f1.a, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new uz.e(k2Var, (df3.bar) null, 15), 3);
            return;
        }
        if (id == 2131363032) {
            this.F0.a();
            return;
        }
        if (id == 2131363889) {
            W0("PremiumStatusWorkAction");
            return;
        }
        if (id == 2131363890) {
            W0("ContactsPremiumStatusFetchWorkAction");
            return;
        }
        if (id == 2131363118) {
            new k92.j(this.Z0, this.a1, this.K0).i();
            android.widget.Toast.makeText((android.content.Context) a, (java.lang.CharSequence) "Consumables consumed!", 0).show();
            return;
        }
        if (id == 2131366434) {
            android.widget.Toast.makeText((android.content.Context) a, (java.lang.CharSequence) ("Subscription RTDN status: " + this.i1.b()), 1).show();
            return;
        }
        if (id == 2131366432) {
            this.j1.c(this, i82.r.X8);
            return;
        }
        final java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) com.truecaller.premium.PremiumLaunchContext.Static.getEntries());
        if (id == 2131366422) {
            i.d dVar2 = new i.d(this);
            dVar2.setTitle("Choose a launch context");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((i82.r) it.next()).getName());
            }
            final int i3 = 1;
            dVar2.j((java.lang.CharSequence[]) arrayList2.toArray(new java.lang.String[0]), arrayList2.indexOf(i82.r.I7.getName()), new android.content.DialogInterface.OnClickListener(this) { // from class: com.truecaller.qa.d
                public final /* synthetic */ com.truecaller.qa.QMActivity b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r12v0, types: [com.truecaller.qa.QMActivity, android.content.Context, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v3, types: [com.truecaller.qa.QMActivity, android.content.Context, java.lang.Object] */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i4) {
                    int i5 = i3;
                    ?? r12 = this.b;
                    java.util.ArrayList arrayList3 = arrayList;
                    int i6 = 0;
                    switch (i5) {
                        case 0:
                            java.lang.String str = r12.p1.a((java.lang.String) arrayList3.get(i4)).c;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "countryName");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k3 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k3, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.whoviewedme.ReceiveProfileViewWorker.class, "workerClass");
                            f6.v0 v0Var = new f6.v0(com.truecaller.whoviewedme.ReceiveProfileViewWorker.class);
                            kotlin.Pair[] pairArr = {new kotlin.Pair("EXTRA_TC_ID", "8Nd7qSC1n758Eb0A5WFvXA=="), new kotlin.Pair("EXTRA_PROFILE_VIEW_EVENT_SOURCE", "CONTACT_DETAIL"), new kotlin.Pair("EXTRA_PROFILE_COUNTRY_ISO", str), new kotlin.Pair("EXTRA_IS_QA_NOTIFICATION", java.lang.Boolean.TRUE)};
                            nd.b0 b0Var = new nd.b0();
                            while (i6 < 4) {
                                kotlin.Pair pair = pairArr[i6];
                                b0Var.b((java.lang.String) pair.a, pair.b);
                                i6++;
                            }
                            k3.g("ReceiveProfileViewWorker", nd.l.a, v0Var.y(b0Var.a()).d());
                            dialogInterface.dismiss();
                            return;
                        case 1:
                            int i7 = com.truecaller.qa.QMActivity.B1;
                            r12.getClass();
                            android.content.Intent intent8 = new android.content.Intent((android.content.Context) r12, (java.lang.Class<?>) com.truecaller.premium.interstitial.QAEmbeddedButtonsTestingActivity.class);
                            intent8.putExtra("launchContextKey", ((com.truecaller.premium.PremiumLaunchContext.Static) arrayList3.get(i4)).getName());
                            r12.startActivity(intent8);
                            dialogInterface.dismiss();
                            return;
                        case 2:
                            ?? r6 = this.b;
                            i82.u uVar = r6.j1;
                            i82.r rVar3 = (i82.r) arrayList3.get(i4);
                            i82.u uVar2 = uVar;
                            uVar2.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r6, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar3, "launchContext");
                            com.truecaller.premium.interstitial.InterstitialAnimation interstitialAnimation = com.truecaller.premium.interstitial.InterstitialAnimation.SLIDE_VERTICALLY_ANIMATION;
                            android.content.Intent c = h8.s0.c(uVar2, (android.content.Context) r6, rVar3, (com.truecaller.premium.data.SubscriptionPromoEventMetaData) null, (com.truecaller.premium.data.feature.PremiumFeature) null, false, interstitialAnimation, 28);
                            c.addFlags(268435456);
                            i82.u.g((android.content.Context) r6, c, (g.baz) null, interstitialAnimation);
                            dialogInterface.dismiss();
                            return;
                        case 3:
                            int i8 = com.truecaller.qa.QMActivity.B1;
                            com.truecaller.network.notification.NotificationType valueOf = com.truecaller.network.notification.NotificationType.valueOf((java.lang.String) arrayList3.get(i4));
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueOf, "notificationType");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k4 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k4, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.familysharing.FamilySharingNotificationWorker.class, "workerClass");
                            f6.v0 v0Var2 = new f6.v0(com.truecaller.premium.familysharing.FamilySharingNotificationWorker.class);
                            kotlin.Pair[] pairArr2 = {new kotlin.Pair("EXTRA_TC_ID", ""), new kotlin.Pair("MEMBER_TC_ID", ""), new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(valueOf.value))};
                            nd.b0 b0Var2 = new nd.b0();
                            while (i6 < 3) {
                                kotlin.Pair pair2 = pairArr2[i6];
                                b0Var2.b((java.lang.String) pair2.a, pair2.b);
                                i6++;
                            }
                            k4.g("FamilySharingNotificationWorker", nd.l.a, v0Var2.y(b0Var2.a()).d());
                            dialogInterface.dismiss();
                            return;
                        default:
                            int i9 = com.truecaller.qa.QMActivity.B1;
                            com.truecaller.network.notification.NotificationType notificationType = (com.truecaller.network.notification.NotificationType) arrayList3.get(i4);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationType, "notificationType");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k5 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k5, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.contactrequest.ContactRequestNotificationWorker.class, "workerClass");
                            f6.v0 v0Var3 = new f6.v0(com.truecaller.premium.contactrequest.ContactRequestNotificationWorker.class);
                            kotlin.Pair[] pairArr3 = {new kotlin.Pair("EXTRA_MEMBER_TRANSACTION_ID", "TestTid"), new kotlin.Pair("EXTRA_PHONE_NUMBER", "+"), new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(notificationType.value)), new kotlin.Pair("EXTRA_IS_TEST_MODE", java.lang.Boolean.FALSE)};
                            nd.b0 b0Var3 = new nd.b0();
                            while (i6 < 4) {
                                kotlin.Pair pair3 = pairArr3[i6];
                                b0Var3.b((java.lang.String) pair3.a, pair3.b);
                                i6++;
                            }
                            k5.g("ContactRequestNotificationWorker", nd.l.a, v0Var3.y(b0Var3.a()).d());
                            dialogInterface.dismiss();
                            return;
                    }
                }
            });
            dVar2.m();
            return;
        }
        if (id == 2131366411) {
            i.d dVar3 = new i.d(this);
            dVar3.setTitle("Choose a launch context");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((i82.r) it3.next()).getName());
            }
            final int i4 = 2;
            dVar3.j((java.lang.CharSequence[]) arrayList3.toArray(new java.lang.String[0]), arrayList3.indexOf(i82.r.I7.getName()), new android.content.DialogInterface.OnClickListener(this) { // from class: com.truecaller.qa.d
                public final /* synthetic */ com.truecaller.qa.QMActivity b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r12v0, types: [com.truecaller.qa.QMActivity, android.content.Context, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v3, types: [com.truecaller.qa.QMActivity, android.content.Context, java.lang.Object] */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i42) {
                    int i5 = i4;
                    ?? r12 = this.b;
                    java.util.ArrayList arrayList32 = arrayList;
                    int i6 = 0;
                    switch (i5) {
                        case 0:
                            java.lang.String str = r12.p1.a((java.lang.String) arrayList32.get(i42)).c;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "countryName");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k3 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k3, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.whoviewedme.ReceiveProfileViewWorker.class, "workerClass");
                            f6.v0 v0Var = new f6.v0(com.truecaller.whoviewedme.ReceiveProfileViewWorker.class);
                            kotlin.Pair[] pairArr = {new kotlin.Pair("EXTRA_TC_ID", "8Nd7qSC1n758Eb0A5WFvXA=="), new kotlin.Pair("EXTRA_PROFILE_VIEW_EVENT_SOURCE", "CONTACT_DETAIL"), new kotlin.Pair("EXTRA_PROFILE_COUNTRY_ISO", str), new kotlin.Pair("EXTRA_IS_QA_NOTIFICATION", java.lang.Boolean.TRUE)};
                            nd.b0 b0Var = new nd.b0();
                            while (i6 < 4) {
                                kotlin.Pair pair = pairArr[i6];
                                b0Var.b((java.lang.String) pair.a, pair.b);
                                i6++;
                            }
                            k3.g("ReceiveProfileViewWorker", nd.l.a, v0Var.y(b0Var.a()).d());
                            dialogInterface.dismiss();
                            return;
                        case 1:
                            int i7 = com.truecaller.qa.QMActivity.B1;
                            r12.getClass();
                            android.content.Intent intent8 = new android.content.Intent((android.content.Context) r12, (java.lang.Class<?>) com.truecaller.premium.interstitial.QAEmbeddedButtonsTestingActivity.class);
                            intent8.putExtra("launchContextKey", ((com.truecaller.premium.PremiumLaunchContext.Static) arrayList32.get(i42)).getName());
                            r12.startActivity(intent8);
                            dialogInterface.dismiss();
                            return;
                        case 2:
                            ?? r6 = this.b;
                            i82.u uVar = r6.j1;
                            i82.r rVar3 = (i82.r) arrayList32.get(i42);
                            i82.u uVar2 = uVar;
                            uVar2.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r6, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar3, "launchContext");
                            com.truecaller.premium.interstitial.InterstitialAnimation interstitialAnimation = com.truecaller.premium.interstitial.InterstitialAnimation.SLIDE_VERTICALLY_ANIMATION;
                            android.content.Intent c = h8.s0.c(uVar2, (android.content.Context) r6, rVar3, (com.truecaller.premium.data.SubscriptionPromoEventMetaData) null, (com.truecaller.premium.data.feature.PremiumFeature) null, false, interstitialAnimation, 28);
                            c.addFlags(268435456);
                            i82.u.g((android.content.Context) r6, c, (g.baz) null, interstitialAnimation);
                            dialogInterface.dismiss();
                            return;
                        case 3:
                            int i8 = com.truecaller.qa.QMActivity.B1;
                            com.truecaller.network.notification.NotificationType valueOf = com.truecaller.network.notification.NotificationType.valueOf((java.lang.String) arrayList32.get(i42));
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueOf, "notificationType");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k4 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k4, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.familysharing.FamilySharingNotificationWorker.class, "workerClass");
                            f6.v0 v0Var2 = new f6.v0(com.truecaller.premium.familysharing.FamilySharingNotificationWorker.class);
                            kotlin.Pair[] pairArr2 = {new kotlin.Pair("EXTRA_TC_ID", ""), new kotlin.Pair("MEMBER_TC_ID", ""), new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(valueOf.value))};
                            nd.b0 b0Var2 = new nd.b0();
                            while (i6 < 3) {
                                kotlin.Pair pair2 = pairArr2[i6];
                                b0Var2.b((java.lang.String) pair2.a, pair2.b);
                                i6++;
                            }
                            k4.g("FamilySharingNotificationWorker", nd.l.a, v0Var2.y(b0Var2.a()).d());
                            dialogInterface.dismiss();
                            return;
                        default:
                            int i9 = com.truecaller.qa.QMActivity.B1;
                            com.truecaller.network.notification.NotificationType notificationType = (com.truecaller.network.notification.NotificationType) arrayList32.get(i42);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationType, "notificationType");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k5 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k5, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.contactrequest.ContactRequestNotificationWorker.class, "workerClass");
                            f6.v0 v0Var3 = new f6.v0(com.truecaller.premium.contactrequest.ContactRequestNotificationWorker.class);
                            kotlin.Pair[] pairArr3 = {new kotlin.Pair("EXTRA_MEMBER_TRANSACTION_ID", "TestTid"), new kotlin.Pair("EXTRA_PHONE_NUMBER", "+"), new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(notificationType.value)), new kotlin.Pair("EXTRA_IS_TEST_MODE", java.lang.Boolean.FALSE)};
                            nd.b0 b0Var3 = new nd.b0();
                            while (i6 < 4) {
                                kotlin.Pair pair3 = pairArr3[i6];
                                b0Var3.b((java.lang.String) pair3.a, pair3.b);
                                i6++;
                            }
                            k5.g("ContactRequestNotificationWorker", nd.l.a, v0Var3.y(b0Var3.a()).d());
                            dialogInterface.dismiss();
                            return;
                    }
                }
            });
            dVar3.m();
            return;
        }
        if (id == 2131363316) {
            ((c73.r0) this.y0).a();
            return;
        }
        if (id == 2131363381) {
            I0();
            return;
        }
        if (id == 2131367644) {
            ((cl2.m) this.r0).e0("whoViewedMeLastVisitTimestamp", 0L);
            return;
        }
        if (id == 2131367621) {
            this.z0.a();
            return;
        }
        if (id == 2131367645) {
            W0("WhoViewedMeWeeklySummaryWorkAction");
            return;
        }
        if (id == 2131367624) {
            W0("WhoSearchedForMeDailySummaryWorkAction");
            return;
        }
        if (id == 2131367622) {
            L0();
            return;
        }
        int i5 = 6;
        if (id == 2131363387) {
            this.L0.c(true);
            s62.f fVar6 = this.L0;
            fg3.h0.J(fVar6.e, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r23.d(fVar6, barVar2, i5), 3);
            android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Notification channels are recreated", 0).show();
            return;
        }
        if (id == 2131363322) {
            s62.f fVar7 = this.L0;
            fg3.h0.J(fVar7.e, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r23.d(fVar7, barVar2, i5), 3);
            android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Notification channels are created", 0).show();
            return;
        }
        if (id == 2131363312) {
            this.L0.c(false);
            android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Notification channels are cleaned up", 0).show();
            return;
        }
        if (id == 2131363390) {
            this.L0.c(true);
            android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "All notification channels are deleted!", 0).show();
            return;
        }
        if (id == 2131363377) {
            try {
                startActivity(ak.r0.a0(this, false));
                return;
            } catch (android.content.ActivityNotFoundException e) {
                o82.a.C(e);
                return;
            }
        }
        if (id == 2131363378) {
            this.k1.a(this, com.truecaller.premium.util.NotificationAccessSource.UNKNOWN, 2132023501);
            return;
        }
        if (id == 2131363414) {
            this.l1.c(new qm1.b(21));
            return;
        }
        if (id == 2131363413) {
            this.l1.b(new qm1.b(20), false);
            return;
        }
        if (id == 2131364915) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                startActivity(new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.qa.user_growth.QMRolePermissionsActivity.class));
                return;
            } else {
                android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "Available only for Android Q and above", 1).show();
                return;
            }
        }
        if (id == 2131363320) {
            W0("CleverTapRefreshWorkAction");
            return;
        }
        if (id == 2131363309) {
            W0("CloudTelephonyWorkAction");
            return;
        }
        if (id == 2131363319) {
            this.X0.b();
            return;
        }
        if (id == 2131363311) {
            x0(this);
            return;
        }
        if (id == 2131363400) {
            this.G0.a.edit().putInt("insightsReminderTime", 0).apply();
            return;
        }
        if (id == 2131363366) {
            androidx.fragment.app.bar d5 = getSupportFragmentManager().d();
            d5.b(new fi2.l(), fi2.l.class.getSimpleName());
            d5.m(true, true);
            return;
        }
        if (id == 2131363359) {
            androidx.fragment.app.bar d6 = getSupportFragmentManager().d();
            d6.b(new fi2.b(), fi2.b.class.getSimpleName());
            d6.m(true, true);
            return;
        }
        if (id == 2131363343) {
            androidx.fragment.app.bar d7 = getSupportFragmentManager().d();
            d7.b(new fi2.baz(), "FraudV2TestConfigFragment");
            d7.m(true, true);
            return;
        }
        if (id == 2131362868) {
            androidx.fragment.app.bar d8 = getSupportFragmentManager().d();
            d8.b(new fy2.baz(), fy2.baz.class.getSimpleName());
            d8.m(true, true);
            return;
        }
        if (id == 2131363361) {
            android.content.Intent intent8 = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.insights.ui.qa.view.InsightsQAActivity.class);
            intent8.putExtra("qaPageToOpen", "InsightsMalanaSeed");
            startActivity(intent8);
            return;
        }
        if (id == 2131363353) {
            this.J0.d();
            finish();
            return;
        }
        if (id == 2131363324) {
            this.G0.m();
            finish();
            return;
        }
        if (id == 2131363354) {
            this.J0.e(this);
            finish();
            return;
        }
        if (id == 2131363402) {
            this.t0.k("smart_notifications_clicked", false);
            finish();
            return;
        }
        if (id == 2131363433) {
            android.content.Intent intent9 = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.insights.ui.qa.view.InsightsQAActivity.class);
            intent9.putExtra("qaPageToOpen", "InsightsUpdatesClassifierTest");
            startActivity(intent9);
            return;
        }
        if (id == 2131363375) {
            android.content.Intent intent10 = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.insights.ui.qa.view.InsightsQAActivity.class);
            intent10.putExtra("qaPageToOpen", "ModelQAFragment");
            startActivity(intent10);
            return;
        }
        if (id == 2131363344) {
            android.content.Intent intent11 = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.insights.ui.qa.view.InsightsQAActivity.class);
            intent11.putExtra("qaPageToOpen", "FtsFragment");
            startActivity(intent11);
            return;
        }
        if (id == 2131363422) {
            android.content.Intent intent12 = new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.insights.ui.qa.view.InsightsQAActivity.class);
            intent12.putExtra("qaPageToOpen", "InsightsSmsFeatureFilterTester");
            startActivity(intent12);
            return;
        }
        if (id == 2131364270) {
            this.m1.o0();
            return;
        }
        if (id == 2131363318) {
            this.t0.p("core_isReturningUser");
            return;
        }
        if (id == 2131363037) {
            ((uv2.e) this.h0.get()).d.a();
            return;
        }
        if (id == 2131366423) {
            java.lang.String h = this.t0.h("premiumFriendUpgradedPhoneNumber");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            if (jj3.bar.k(h)) {
                for (java.lang.String str : h.split(",")) {
                    kotlin.Pair K = this.b1.K(str);
                    arrayList4.add(os0.bar.y(((com.truecaller.data.entity.Contact) K.d()).s(), " : ", ((com.truecaller.data.entity.Contact) K.d()).F().getLevel(), " : ", str));
                }
            }
            if (arrayList4.isEmpty()) {
                arrayList4.add("No contacts are present");
            }
            i.d dVar4 = new i.d(this);
            dVar4.c((java.lang.CharSequence[]) arrayList4.toArray(new java.lang.String[0]), (android.content.DialogInterface.OnClickListener) null);
            dVar4.m();
            return;
        }
        if (id == 2131366424) {
            this.c1.b();
            return;
        }
        if (id == 2131366425) {
            this.c1.a();
            return;
        }
        if (id == 2131362176) {
            new tf2.i().show(getSupportFragmentManager(), "");
            return;
        }
        if (id == 2131363594) {
            new tf2.d().show(getSupportFragmentManager(), "");
            return;
        }
        if (id == 2131364911) {
            i.d dVar5 = new i.d(this);
            dVar5.setTitle("Choose a Gold gift dialog");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add("goldGiftSender_dialog");
            arrayList5.add("goldGiftReceiver_dialog");
            dVar5.j((java.lang.CharSequence[]) arrayList5.toArray(new java.lang.String[0]), 0, new com.truecaller.qa.h(10, this));
            dVar5.m();
            return;
        }
        if (id == 2131364910) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
            startActivity(new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.ghost_call.GhostCallAlarmPermissionActivity.class));
            return;
        }
        if (id == 2131364907) {
            startActivity(com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogActivity.t0(this));
            return;
        }
        if (id == 2131364909) {
            startActivity(com.truecaller.premium.familysharing.confirmation.FamilySharingConfirmationDialogActivity.t0(this, com.truecaller.data.entity.messaging.Participant.G));
            return;
        }
        if (id == 2131364912) {
            i.d dVar6 = new i.d(this);
            dVar6.setTitle("Choose Giveaway Granted Dialogs");
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add("Grant Giveaway - Already Granted Screen");
            arrayList6.add("Grant Giveaway - Upgrade Failed Screen");
            dVar6.j((java.lang.CharSequence[]) arrayList6.toArray(new java.lang.String[0]), 0, new com.truecaller.qa.h(11, this));
            dVar6.m();
            return;
        }
        if (id == 2131364913) {
            i.d dVar7 = new i.d(this);
            dVar7.setTitle("Choose a Notification Type");
            final java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(com.truecaller.network.notification.NotificationType.NEW_FAMILY_MEMBER.name());
            arrayList7.add(com.truecaller.network.notification.NotificationType.FAMILY_BENEFIT_REVOKED.name());
            arrayList7.add(com.truecaller.network.notification.NotificationType.FAMILY_SHARING_STOPPED.name());
            final int i6 = 3;
            dVar7.j((java.lang.CharSequence[]) arrayList7.toArray(new java.lang.String[0]), 0, new android.content.DialogInterface.OnClickListener(this) { // from class: com.truecaller.qa.d
                public final /* synthetic */ com.truecaller.qa.QMActivity b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r12v0, types: [com.truecaller.qa.QMActivity, android.content.Context, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v3, types: [com.truecaller.qa.QMActivity, android.content.Context, java.lang.Object] */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i42) {
                    int i52 = i6;
                    ?? r12 = this.b;
                    java.util.ArrayList arrayList32 = arrayList7;
                    int i62 = 0;
                    switch (i52) {
                        case 0:
                            java.lang.String str2 = r12.p1.a((java.lang.String) arrayList32.get(i42)).c;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "countryName");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k3 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k3, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.whoviewedme.ReceiveProfileViewWorker.class, "workerClass");
                            f6.v0 v0Var = new f6.v0(com.truecaller.whoviewedme.ReceiveProfileViewWorker.class);
                            kotlin.Pair[] pairArr = {new kotlin.Pair("EXTRA_TC_ID", "8Nd7qSC1n758Eb0A5WFvXA=="), new kotlin.Pair("EXTRA_PROFILE_VIEW_EVENT_SOURCE", "CONTACT_DETAIL"), new kotlin.Pair("EXTRA_PROFILE_COUNTRY_ISO", str2), new kotlin.Pair("EXTRA_IS_QA_NOTIFICATION", java.lang.Boolean.TRUE)};
                            nd.b0 b0Var = new nd.b0();
                            while (i62 < 4) {
                                kotlin.Pair pair = pairArr[i62];
                                b0Var.b((java.lang.String) pair.a, pair.b);
                                i62++;
                            }
                            k3.g("ReceiveProfileViewWorker", nd.l.a, v0Var.y(b0Var.a()).d());
                            dialogInterface.dismiss();
                            return;
                        case 1:
                            int i7 = com.truecaller.qa.QMActivity.B1;
                            r12.getClass();
                            android.content.Intent intent82 = new android.content.Intent((android.content.Context) r12, (java.lang.Class<?>) com.truecaller.premium.interstitial.QAEmbeddedButtonsTestingActivity.class);
                            intent82.putExtra("launchContextKey", ((com.truecaller.premium.PremiumLaunchContext.Static) arrayList32.get(i42)).getName());
                            r12.startActivity(intent82);
                            dialogInterface.dismiss();
                            return;
                        case 2:
                            ?? r6 = this.b;
                            i82.u uVar = r6.j1;
                            i82.r rVar3 = (i82.r) arrayList32.get(i42);
                            i82.u uVar2 = uVar;
                            uVar2.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r6, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar3, "launchContext");
                            com.truecaller.premium.interstitial.InterstitialAnimation interstitialAnimation = com.truecaller.premium.interstitial.InterstitialAnimation.SLIDE_VERTICALLY_ANIMATION;
                            android.content.Intent c = h8.s0.c(uVar2, (android.content.Context) r6, rVar3, (com.truecaller.premium.data.SubscriptionPromoEventMetaData) null, (com.truecaller.premium.data.feature.PremiumFeature) null, false, interstitialAnimation, 28);
                            c.addFlags(268435456);
                            i82.u.g((android.content.Context) r6, c, (g.baz) null, interstitialAnimation);
                            dialogInterface.dismiss();
                            return;
                        case 3:
                            int i8 = com.truecaller.qa.QMActivity.B1;
                            com.truecaller.network.notification.NotificationType valueOf = com.truecaller.network.notification.NotificationType.valueOf((java.lang.String) arrayList32.get(i42));
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueOf, "notificationType");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k4 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k4, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.familysharing.FamilySharingNotificationWorker.class, "workerClass");
                            f6.v0 v0Var2 = new f6.v0(com.truecaller.premium.familysharing.FamilySharingNotificationWorker.class);
                            kotlin.Pair[] pairArr2 = {new kotlin.Pair("EXTRA_TC_ID", ""), new kotlin.Pair("MEMBER_TC_ID", ""), new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(valueOf.value))};
                            nd.b0 b0Var2 = new nd.b0();
                            while (i62 < 3) {
                                kotlin.Pair pair2 = pairArr2[i62];
                                b0Var2.b((java.lang.String) pair2.a, pair2.b);
                                i62++;
                            }
                            k4.g("FamilySharingNotificationWorker", nd.l.a, v0Var2.y(b0Var2.a()).d());
                            dialogInterface.dismiss();
                            return;
                        default:
                            int i9 = com.truecaller.qa.QMActivity.B1;
                            com.truecaller.network.notification.NotificationType notificationType = (com.truecaller.network.notification.NotificationType) arrayList32.get(i42);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationType, "notificationType");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k5 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k5, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.contactrequest.ContactRequestNotificationWorker.class, "workerClass");
                            f6.v0 v0Var3 = new f6.v0(com.truecaller.premium.contactrequest.ContactRequestNotificationWorker.class);
                            kotlin.Pair[] pairArr3 = {new kotlin.Pair("EXTRA_MEMBER_TRANSACTION_ID", "TestTid"), new kotlin.Pair("EXTRA_PHONE_NUMBER", "+"), new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(notificationType.value)), new kotlin.Pair("EXTRA_IS_TEST_MODE", java.lang.Boolean.FALSE)};
                            nd.b0 b0Var3 = new nd.b0();
                            while (i62 < 4) {
                                kotlin.Pair pair3 = pairArr3[i62];
                                b0Var3.b((java.lang.String) pair3.a, pair3.b);
                                i62++;
                            }
                            k5.g("ContactRequestNotificationWorker", nd.l.a, v0Var3.y(b0Var3.a()).d());
                            dialogInterface.dismiss();
                            return;
                    }
                }
            });
            dVar7.m();
            return;
        }
        if (id == 2131364908) {
            i.d dVar8 = new i.d(this);
            dVar8.setTitle("Choose a Notification Type");
            final java.util.ArrayList arrayList8 = new java.util.ArrayList();
            com.truecaller.network.notification.NotificationType notificationType = com.truecaller.network.notification.NotificationType.CONTACT_REQUEST_RECEIVED_V2;
            arrayList8.add(notificationType);
            com.truecaller.network.notification.NotificationType notificationType2 = com.truecaller.network.notification.NotificationType.CONTACT_REQUEST_ACCEPTED_V2;
            arrayList8.add(notificationType2);
            com.truecaller.network.notification.NotificationType notificationType3 = com.truecaller.network.notification.NotificationType.CONTACT_REQUEST_REJECTED_V2;
            arrayList8.add(notificationType3);
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(notificationType.name());
            arrayList9.add(notificationType2.name());
            arrayList9.add(notificationType3.name());
            java.lang.CharSequence[] charSequenceArr = (java.lang.CharSequence[]) arrayList9.toArray(new java.lang.String[0]);
            final int i7 = 4;
            dVar8.j(charSequenceArr, 0, new android.content.DialogInterface.OnClickListener(this) { // from class: com.truecaller.qa.d
                public final /* synthetic */ com.truecaller.qa.QMActivity b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r12v0, types: [com.truecaller.qa.QMActivity, android.content.Context, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v3, types: [com.truecaller.qa.QMActivity, android.content.Context, java.lang.Object] */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i42) {
                    int i52 = i7;
                    ?? r12 = this.b;
                    java.util.ArrayList arrayList32 = arrayList8;
                    int i62 = 0;
                    switch (i52) {
                        case 0:
                            java.lang.String str2 = r12.p1.a((java.lang.String) arrayList32.get(i42)).c;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "countryName");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k3 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k3, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.whoviewedme.ReceiveProfileViewWorker.class, "workerClass");
                            f6.v0 v0Var = new f6.v0(com.truecaller.whoviewedme.ReceiveProfileViewWorker.class);
                            kotlin.Pair[] pairArr = {new kotlin.Pair("EXTRA_TC_ID", "8Nd7qSC1n758Eb0A5WFvXA=="), new kotlin.Pair("EXTRA_PROFILE_VIEW_EVENT_SOURCE", "CONTACT_DETAIL"), new kotlin.Pair("EXTRA_PROFILE_COUNTRY_ISO", str2), new kotlin.Pair("EXTRA_IS_QA_NOTIFICATION", java.lang.Boolean.TRUE)};
                            nd.b0 b0Var = new nd.b0();
                            while (i62 < 4) {
                                kotlin.Pair pair = pairArr[i62];
                                b0Var.b((java.lang.String) pair.a, pair.b);
                                i62++;
                            }
                            k3.g("ReceiveProfileViewWorker", nd.l.a, v0Var.y(b0Var.a()).d());
                            dialogInterface.dismiss();
                            return;
                        case 1:
                            int i72 = com.truecaller.qa.QMActivity.B1;
                            r12.getClass();
                            android.content.Intent intent82 = new android.content.Intent((android.content.Context) r12, (java.lang.Class<?>) com.truecaller.premium.interstitial.QAEmbeddedButtonsTestingActivity.class);
                            intent82.putExtra("launchContextKey", ((com.truecaller.premium.PremiumLaunchContext.Static) arrayList32.get(i42)).getName());
                            r12.startActivity(intent82);
                            dialogInterface.dismiss();
                            return;
                        case 2:
                            ?? r6 = this.b;
                            i82.u uVar = r6.j1;
                            i82.r rVar3 = (i82.r) arrayList32.get(i42);
                            i82.u uVar2 = uVar;
                            uVar2.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r6, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar3, "launchContext");
                            com.truecaller.premium.interstitial.InterstitialAnimation interstitialAnimation = com.truecaller.premium.interstitial.InterstitialAnimation.SLIDE_VERTICALLY_ANIMATION;
                            android.content.Intent c = h8.s0.c(uVar2, (android.content.Context) r6, rVar3, (com.truecaller.premium.data.SubscriptionPromoEventMetaData) null, (com.truecaller.premium.data.feature.PremiumFeature) null, false, interstitialAnimation, 28);
                            c.addFlags(268435456);
                            i82.u.g((android.content.Context) r6, c, (g.baz) null, interstitialAnimation);
                            dialogInterface.dismiss();
                            return;
                        case 3:
                            int i8 = com.truecaller.qa.QMActivity.B1;
                            com.truecaller.network.notification.NotificationType valueOf = com.truecaller.network.notification.NotificationType.valueOf((java.lang.String) arrayList32.get(i42));
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueOf, "notificationType");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k4 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k4, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.familysharing.FamilySharingNotificationWorker.class, "workerClass");
                            f6.v0 v0Var2 = new f6.v0(com.truecaller.premium.familysharing.FamilySharingNotificationWorker.class);
                            kotlin.Pair[] pairArr2 = {new kotlin.Pair("EXTRA_TC_ID", ""), new kotlin.Pair("MEMBER_TC_ID", ""), new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(valueOf.value))};
                            nd.b0 b0Var2 = new nd.b0();
                            while (i62 < 3) {
                                kotlin.Pair pair2 = pairArr2[i62];
                                b0Var2.b((java.lang.String) pair2.a, pair2.b);
                                i62++;
                            }
                            k4.g("FamilySharingNotificationWorker", nd.l.a, v0Var2.y(b0Var2.a()).d());
                            dialogInterface.dismiss();
                            return;
                        default:
                            int i9 = com.truecaller.qa.QMActivity.B1;
                            com.truecaller.network.notification.NotificationType notificationType4 = (com.truecaller.network.notification.NotificationType) arrayList32.get(i42);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationType4, "notificationType");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k5 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k5, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.contactrequest.ContactRequestNotificationWorker.class, "workerClass");
                            f6.v0 v0Var3 = new f6.v0(com.truecaller.premium.contactrequest.ContactRequestNotificationWorker.class);
                            kotlin.Pair[] pairArr3 = {new kotlin.Pair("EXTRA_MEMBER_TRANSACTION_ID", "TestTid"), new kotlin.Pair("EXTRA_PHONE_NUMBER", "+"), new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(notificationType4.value)), new kotlin.Pair("EXTRA_IS_TEST_MODE", java.lang.Boolean.FALSE)};
                            nd.b0 b0Var3 = new nd.b0();
                            while (i62 < 4) {
                                kotlin.Pair pair3 = pairArr3[i62];
                                b0Var3.b((java.lang.String) pair3.a, pair3.b);
                                i62++;
                            }
                            k5.g("ContactRequestNotificationWorker", nd.l.a, v0Var3.y(b0Var3.a()).d());
                            dialogInterface.dismiss();
                            return;
                    }
                }
            });
            dVar8.m();
            return;
        }
        if (id == 2131364916) {
            i.d dVar9 = new i.d(this);
            dVar9.setTitle("Pick the country wanted for the notificaiton");
            final java.util.ArrayList arrayList10 = new java.util.ArrayList();
            com.truecaller.data.country.CountryListDto countryListDto = this.p1.c().a;
            if (countryListDto == null || (bazVar = countryListDto.countryList) == null || (list = bazVar.b) == null) {
                list = kotlin.collections.h0.a;
            }
            java.util.Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList10.add(((com.truecaller.data.country.CountryListDto.bar) it4.next()).b);
            }
            final int i8 = 0;
            dVar9.j((java.lang.CharSequence[]) arrayList10.toArray(new java.lang.String[0]), 0, new android.content.DialogInterface.OnClickListener(this) { // from class: com.truecaller.qa.d
                public final /* synthetic */ com.truecaller.qa.QMActivity b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r12v0, types: [com.truecaller.qa.QMActivity, android.content.Context, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r6v3, types: [com.truecaller.qa.QMActivity, android.content.Context, java.lang.Object] */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i42) {
                    int i52 = i8;
                    ?? r12 = this.b;
                    java.util.ArrayList arrayList32 = arrayList10;
                    int i62 = 0;
                    switch (i52) {
                        case 0:
                            java.lang.String str2 = r12.p1.a((java.lang.String) arrayList32.get(i42)).c;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "countryName");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k3 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k3, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.whoviewedme.ReceiveProfileViewWorker.class, "workerClass");
                            f6.v0 v0Var = new f6.v0(com.truecaller.whoviewedme.ReceiveProfileViewWorker.class);
                            kotlin.Pair[] pairArr = {new kotlin.Pair("EXTRA_TC_ID", "8Nd7qSC1n758Eb0A5WFvXA=="), new kotlin.Pair("EXTRA_PROFILE_VIEW_EVENT_SOURCE", "CONTACT_DETAIL"), new kotlin.Pair("EXTRA_PROFILE_COUNTRY_ISO", str2), new kotlin.Pair("EXTRA_IS_QA_NOTIFICATION", java.lang.Boolean.TRUE)};
                            nd.b0 b0Var = new nd.b0();
                            while (i62 < 4) {
                                kotlin.Pair pair = pairArr[i62];
                                b0Var.b((java.lang.String) pair.a, pair.b);
                                i62++;
                            }
                            k3.g("ReceiveProfileViewWorker", nd.l.a, v0Var.y(b0Var.a()).d());
                            dialogInterface.dismiss();
                            return;
                        case 1:
                            int i72 = com.truecaller.qa.QMActivity.B1;
                            r12.getClass();
                            android.content.Intent intent82 = new android.content.Intent((android.content.Context) r12, (java.lang.Class<?>) com.truecaller.premium.interstitial.QAEmbeddedButtonsTestingActivity.class);
                            intent82.putExtra("launchContextKey", ((com.truecaller.premium.PremiumLaunchContext.Static) arrayList32.get(i42)).getName());
                            r12.startActivity(intent82);
                            dialogInterface.dismiss();
                            return;
                        case 2:
                            ?? r6 = this.b;
                            i82.u uVar = r6.j1;
                            i82.r rVar3 = (i82.r) arrayList32.get(i42);
                            i82.u uVar2 = uVar;
                            uVar2.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r6, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar3, "launchContext");
                            com.truecaller.premium.interstitial.InterstitialAnimation interstitialAnimation = com.truecaller.premium.interstitial.InterstitialAnimation.SLIDE_VERTICALLY_ANIMATION;
                            android.content.Intent c = h8.s0.c(uVar2, (android.content.Context) r6, rVar3, (com.truecaller.premium.data.SubscriptionPromoEventMetaData) null, (com.truecaller.premium.data.feature.PremiumFeature) null, false, interstitialAnimation, 28);
                            c.addFlags(268435456);
                            i82.u.g((android.content.Context) r6, c, (g.baz) null, interstitialAnimation);
                            dialogInterface.dismiss();
                            return;
                        case 3:
                            int i82 = com.truecaller.qa.QMActivity.B1;
                            com.truecaller.network.notification.NotificationType valueOf = com.truecaller.network.notification.NotificationType.valueOf((java.lang.String) arrayList32.get(i42));
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueOf, "notificationType");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k4 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k4, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.familysharing.FamilySharingNotificationWorker.class, "workerClass");
                            f6.v0 v0Var2 = new f6.v0(com.truecaller.premium.familysharing.FamilySharingNotificationWorker.class);
                            kotlin.Pair[] pairArr2 = {new kotlin.Pair("EXTRA_TC_ID", ""), new kotlin.Pair("MEMBER_TC_ID", ""), new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(valueOf.value))};
                            nd.b0 b0Var2 = new nd.b0();
                            while (i62 < 3) {
                                kotlin.Pair pair2 = pairArr2[i62];
                                b0Var2.b((java.lang.String) pair2.a, pair2.b);
                                i62++;
                            }
                            k4.g("FamilySharingNotificationWorker", nd.l.a, v0Var2.y(b0Var2.a()).d());
                            dialogInterface.dismiss();
                            return;
                        default:
                            int i9 = com.truecaller.qa.QMActivity.B1;
                            com.truecaller.network.notification.NotificationType notificationType4 = (com.truecaller.network.notification.NotificationType) arrayList32.get(i42);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationType4, "notificationType");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r12, "context");
                            od.n k5 = od.n.k((android.content.Context) r12);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k5, "getInstance(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.premium.contactrequest.ContactRequestNotificationWorker.class, "workerClass");
                            f6.v0 v0Var3 = new f6.v0(com.truecaller.premium.contactrequest.ContactRequestNotificationWorker.class);
                            kotlin.Pair[] pairArr3 = {new kotlin.Pair("EXTRA_MEMBER_TRANSACTION_ID", "TestTid"), new kotlin.Pair("EXTRA_PHONE_NUMBER", "+"), new kotlin.Pair("EXTRA_NOTIFICATION_TYPE", java.lang.Integer.valueOf(notificationType4.value)), new kotlin.Pair("EXTRA_IS_TEST_MODE", java.lang.Boolean.FALSE)};
                            nd.b0 b0Var3 = new nd.b0();
                            while (i62 < 4) {
                                kotlin.Pair pair3 = pairArr3[i62];
                                b0Var3.b((java.lang.String) pair3.a, pair3.b);
                                i62++;
                            }
                            k5.g("ContactRequestNotificationWorker", nd.l.a, v0Var3.y(b0Var3.a()).d());
                            dialogInterface.dismiss();
                            return;
                    }
                }
            });
            dVar9.m();
            return;
        }
        if (id == 2131367368) {
            K0();
            return;
        }
        if (id == 2131363303) {
            u0();
            return;
        }
        if (id == 2131363411) {
            X0();
            return;
        }
        if (id == 2131366307) {
            startActivity(this.w1.b(this));
            return;
        }
        if (id == 2131366308) {
            new com.truecaller.qa.p(this, this.U0).execute(new java.lang.Void[0]);
            return;
        }
        if (id == 2131366413) {
            this.Q0.b(B0());
            return;
        }
        if (id == 2131366412) {
            this.Q0.c(getSupportFragmentManager());
            return;
        }
        if (id == 2131366437) {
            this.P0.b(getSupportFragmentManager());
            return;
        }
        if (id == 2131366431) {
            com.truecaller.qa.premium.QaPremiumReportDialog.k5(com.truecaller.qa.premium.QaPremiumReportDialog.Type.PREMIUM_REPORT).show(getSupportFragmentManager(), "qa-premium-report");
            return;
        }
        if (id == 2131366430) {
            com.truecaller.qa.premium.QaPremiumReportDialog.k5(com.truecaller.qa.premium.QaPremiumReportDialog.Type.PRODUCTS_REPORT).show(getSupportFragmentManager(), "qa-premium-report");
            return;
        }
        if (id == 2131366420) {
            com.truecaller.qa.premium.QaPremiumReportDialog.k5(com.truecaller.qa.premium.QaPremiumReportDialog.Type.DISCOUNT_STRINGS).show(getSupportFragmentManager(), "qa-premium-report");
            return;
        }
        if (id == 2131364914) {
            ki2.k.V4().show(getSupportFragmentManager(), "qa-purchase-any-sku");
            return;
        }
        if (id == 2131366438) {
            this.P0.a(getSupportFragmentManager());
            return;
        }
        if (id == 2131366439) {
            android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) ("WhatsApp CallerID notifications: " + this.g0.c.C("KEY_NOTIFICATIONS_SHOWN_COUNT", 0)), 0).show();
            return;
        }
        if (id == 2131367591) {
            this.f0.o0();
            return;
        }
        if (id == 2131363356) {
            W0("InsightsEventAggregationWorkAction");
            return;
        }
        if (id == 2131363357) {
            W0("InsightsEventClearWorkAction");
            return;
        }
        if (id == 2131363367) {
            W0("InsightsSenderResolutionWorkAction");
            return;
        }
        if (id == 2131363892) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
            od.n k3 = od.n.k(this);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k3, "getInstance(...)");
            fe0.m.D(k3, "FetchSurveysWorkAction", this, (kotlin.Pair) null, (nd.g) null, 12);
            return;
        }
        if (id == 2131364979) {
            startActivity(com.truecaller.survey.qa.SurveyListQaActivity.t0(this));
            return;
        }
        if (id == 2131364693) {
            startActivity(com.truecaller.survey.qa.SurveyEntryQaActivity.t0(this));
            return;
        }
        if (id == 2131366409) {
            startActivity(new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.acs.qa.AcsQaActivity.class));
            return;
        }
        if (id == 2131366419) {
            startActivity(new android.content.Intent((android.content.Context) this, (java.lang.Class<?>) com.truecaller.details_view.qa.DetailsViewQaActivity.class));
            return;
        }
        if (id == 2131365576) {
            new dj.qux(this.D0).l0(this);
            return;
        }
        if (id == 2131366433) {
            this.q1.r(this);
            return;
        }
        if (id == 2131363360) {
            androidx.fragment.app.bar d9 = getSupportFragmentManager().d();
            d9.b(new fi2.i(), fi2.i.class.getSimpleName());
            d9.m(true, true);
        } else if (id == 2131366421) {
            this.s1.D(this);
        } else if (id == 2131367582) {
            W0("WearableWorkAction");
        } else if (id == 2131366139) {
            this.o0.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.qa.Hilt_QMActivity
    public final void onCreate(android.os.Bundle bundle) {
        boolean z;
        boolean z2;
        java.lang.String str;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
        final int i = 3;
        yy.qux.C(this, 3);
        super.onCreate(bundle);
        setContentView(2131559030);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(2131366184);
        this.d0 = viewGroup;
        ak.r0.i(viewGroup, com.truecaller.common.ui.insets.InsetType.SystemBars);
        final int i2 = 1;
        final int i3 = 0;
        H0(2131363427, this.x0.h(true), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i3) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        final int i4 = 10;
        H0(2131363429, this.x0.i(), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i4) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        if (this.x0.b() == com.truecaller.common.account.Region.REGION_ZA) {
            z = true;
        } else {
            z = false;
        }
        final int i5 = 15;
        H0(2131363430, z, new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i5) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        if (this.x0.b() == com.truecaller.common.account.Region.REGION_BR) {
            z2 = true;
        } else {
            z2 = false;
        }
        final int i6 = 16;
        H0(2131363428, z2, new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i6) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        H0(2131363337, z62.d.g("qaReferralFakeSendSms"), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.f
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i2) {
                    case 0:
                        int i7 = com.truecaller.qa.QMActivity.B1;
                        z62.d.m("qaEnableInviteTab", z3);
                        return;
                    case 1:
                        int i8 = com.truecaller.qa.QMActivity.B1;
                        z62.d.m("qaReferralFakeSendSms", z3);
                        return;
                    default:
                        int i9 = com.truecaller.qa.QMActivity.B1;
                        z62.d.m("qaForceShowReferral", z3);
                        return;
                }
            }
        });
        final int i7 = 2;
        H0(2131363342, z62.d.g("qaForceShowReferral"), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.f
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i7) {
                    case 0:
                        int i72 = com.truecaller.qa.QMActivity.B1;
                        z62.d.m("qaEnableInviteTab", z3);
                        return;
                    case 1:
                        int i8 = com.truecaller.qa.QMActivity.B1;
                        z62.d.m("qaReferralFakeSendSms", z3);
                        return;
                    default:
                        int i9 = com.truecaller.qa.QMActivity.B1;
                        z62.d.m("qaForceShowReferral", z3);
                        return;
                }
            }
        });
        final int i8 = 17;
        H0(2131363331, this.D0.z("qaEnableDomainFronting", false), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i8) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        final int i9 = 18;
        H0(2131363306, this.t0.c("backupForceRootFolder"), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i9) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        final int i10 = 19;
        H0(2131363441, this.z0.c(), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i10) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        final int i11 = 20;
        H0(2131363329, this.t0.c("featureCleverTap"), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i11) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        H0(2131363330, this.t0.c("qaClevertapDebugLogsEnabled"), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i2) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        H0(2131363380, this.t0.c("forceRemoteGeocoding"), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i7) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        H0(2131363437, this.u0.c("useUkLogo"), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        H0(2131363333, z62.d.g("qaEnableInviteTab"), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.f
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i3) {
                    case 0:
                        int i72 = com.truecaller.qa.QMActivity.B1;
                        z62.d.m("qaEnableInviteTab", z3);
                        return;
                    case 1:
                        int i82 = com.truecaller.qa.QMActivity.B1;
                        z62.d.m("qaReferralFakeSendSms", z3);
                        return;
                    default:
                        int i92 = com.truecaller.qa.QMActivity.B1;
                        z62.d.m("qaForceShowReferral", z3);
                        return;
                }
            }
        });
        final int i12 = 4;
        H0(2131363334, this.G0.a.getBoolean("pdoViewerEnabled", false), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i12) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        final int i14 = 5;
        H0(2131363374, this.H0.f.getBoolean("isMidFocusable", false), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i14) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        bw1.b bVar = this.H0;
        final int i15 = 6;
        H0(2131363373, bVar.f.getBoolean("shouldShowMidFeedbackType", bVar.e.c()), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i15) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        final int i16 = 7;
        H0(2131363332, this.G0.a.getBoolean("isDebugLogEnabled", true), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i16) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        final int i17 = 8;
        H0(2131364698, z62.d.g("isInsightsLocalSenderFilterEnabled"), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i17) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        final int i18 = 9;
        H0(2131364697, z62.d.g("isInsightsLocalMalanaSeedEnabled"), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i18) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        final int i19 = 11;
        H0(2131362177, this.D0.y("qaAddSamplePremiumCards"), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i19) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        final int i20 = 12;
        H0(2131362178, this.D0.y("qaAddSampleSpotlightCards"), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i20) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        final int i21 = 13;
        H0(2131367353, this.D0.y("qaUseRazorPayLiveKey"), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i21) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        final int i22 = 14;
        H0(2131367369, this.i0.c("qa_skip_drop_call_rejection"), new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.truecaller.qa.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z3) {
                switch (i22) {
                    case 0:
                        this.u0.k("featureRegion1", z3);
                        return;
                    case 1:
                        this.t0.k("qaClevertapDebugLogsEnabled", z3);
                        return;
                    case 2:
                        this.t0.k("forceRemoteGeocoding", z3);
                        return;
                    case 3:
                        this.u0.k("useUkLogo", z3);
                        return;
                    case 4:
                        com.appsflyer.internal.e.v(this.G0.a, "pdoViewerEnabled", z3);
                        return;
                    case 5:
                        com.appsflyer.internal.e.v(this.H0.f, "isMidFocusable", z3);
                        return;
                    case 6:
                        com.appsflyer.internal.e.v(this.H0.f, "shouldShowMidFeedbackType", z3);
                        return;
                    case 7:
                        com.appsflyer.internal.e.v(this.G0.a, "isDebugLogEnabled", z3);
                        return;
                    case 8:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalSenderFilterEnabled", z3);
                        return;
                    case 9:
                        com.appsflyer.internal.e.v(this.G0.a, "isInsightsLocalMalanaSeedEnabled", z3);
                        return;
                    case 10:
                        this.u0.k("featureRegionC_qa", z3);
                        return;
                    case 11:
                        this.D0.c0("qaAddSamplePremiumCards", z3);
                        return;
                    case 12:
                        this.D0.c0("qaAddSampleSpotlightCards", z3);
                        return;
                    case 13:
                        this.D0.c0("qaUseRazorPayLiveKey", z3);
                        return;
                    case 14:
                        this.i0.k("qa_skip_drop_call_rejection", z3);
                        return;
                    case 15:
                        this.u0.k("featureRegionZa_qa", z3);
                        return;
                    case 16:
                        this.u0.k("featureRegionBr_qa", z3);
                        return;
                    case 17:
                        this.D0.c0("qaEnableDomainFronting", z3);
                        return;
                    case 18:
                        this.t0.k("backupForceRootFolder", z3);
                        return;
                    case 19:
                        this.z0.l(z3);
                        return;
                    default:
                        this.t0.k("featureCleverTap", z3);
                        return;
                }
            }
        });
        G0(2131364695, this);
        G0(2131363436, this);
        G0(2131363435, this);
        G0(2131363434, this);
        G0(2131363391, this);
        G0(2131363394, this);
        G0(2131363356, this);
        G0(2131363315, this);
        G0(2131363786, this);
        G0(2131363398, this);
        G0(2131363326, this);
        G0(2131363385, this);
        G0(2131363392, this);
        G0(2131363302, this);
        G0(2131363415, this);
        G0(2131363314, this);
        G0(2131363432, this);
        G0(2131363389, this);
        G0(2131363397, this);
        G0(2131363304, this);
        G0(2131363401, this);
        G0(2131363038, this);
        G0(2131363026, this);
        G0(2131363431, this);
        G0(2131363307, this);
        G0(2131363339, this);
        G0(2131363338, this);
        G0(2131363388, this);
        G0(2131363386, this);
        G0(2131363305, this);
        G0(2131363439, this);
        G0(2131363440, this);
        G0(2131363371, this);
        G0(2131363384, this);
        G0(2131363423, this);
        G0(2131363417, this);
        G0(2131363403, this);
        G0(2131363341, this);
        G0(2131363347, this);
        G0(2131363420, this);
        G0(2131363383, this);
        G0(2131363346, this);
        G0(2131363382, this);
        G0(2131363372, this);
        G0(2131363438, this);
        G0(2131363418, this);
        G0(2131363419, this);
        G0(2131363416, this);
        G0(2131363345, this);
        G0(2131363421, this);
        G0(2131363370, this);
        G0(2131363364, this);
        G0(2131363352, this);
        G0(2131363369, this);
        G0(2131363367, this);
        G0(2131363363, this);
        G0(2131363357, this);
        G0(2131363355, this);
        G0(2131363358, this);
        G0(2131363368, this);
        G0(2131363350, this);
        G0(2131363351, this);
        G0(2131363433, this);
        G0(2131363375, this);
        G0(2131363362, this);
        G0(2131363365, this);
        G0(2131363349, this);
        G0(2131363354, this);
        G0(2131364696, this);
        G0(2131363399, this);
        G0(2131363393, this);
        G0(2131363410, this);
        G0(2131363424, this);
        G0(2131363310, this);
        G0(2131363313, this);
        G0(2131362890, this);
        G0(2131363317, this);
        G0(2131363336, this);
        G0(2131363301, this);
        G0(2131363035, this);
        G0(2131363033, this);
        G0(2131363034, this);
        G0(2131363889, this);
        G0(2131363032, this);
        G0(2131363890, this);
        G0(2131363412, this);
        G0(2131363118, this);
        G0(2131366434, this);
        G0(2131366432, this);
        G0(2131366411, this);
        G0(2131366422, this);
        G0(2131363316, this);
        G0(2131363381, this);
        G0(2131367644, this);
        G0(2131367621, this);
        G0(2131367645, this);
        G0(2131367624, this);
        G0(2131367622, this);
        G0(2131363387, this);
        G0(2131363322, this);
        G0(2131363312, this);
        G0(2131363390, this);
        G0(2131363377, this);
        G0(2131363378, this);
        G0(2131363414, this);
        G0(2131363413, this);
        G0(2131364915, this);
        G0(2131363320, this);
        G0(2131363319, this);
        G0(2131363366, this);
        G0(2131363359, this);
        G0(2131363343, this);
        G0(2131362868, this);
        G0(2131363361, this);
        G0(2131363353, this);
        G0(2131363324, this);
        G0(2131363402, this);
        G0(2131363344, this);
        G0(2131363422, this);
        G0(2131363321, this);
        G0(2131363309, this);
        G0(2131363340, this);
        G0(2131363027, this);
        G0(2131364270, this);
        G0(2131363395, this);
        G0(2131363396, this);
        G0(2131363318, this);
        G0(2131363311, this);
        G0(2131363400, this);
        G0(2131363037, this);
        G0(2131366423, this);
        G0(2131366424, this);
        G0(2131366425, this);
        G0(2131366416, this);
        G0(2131366417, this);
        G0(2131362176, this);
        G0(2131363594, this);
        G0(2131364911, this);
        G0(2131364910, this);
        G0(2131364907, this);
        G0(2131364913, this);
        G0(2131364909, this);
        G0(2131364912, this);
        G0(2131364908, this);
        G0(2131364916, this);
        G0(2131363179, this);
        G0(2131363177, this);
        G0(2131363180, this);
        G0(2131363178, this);
        G0(2131367368, this);
        G0(2131363303, this);
        G0(2131363411, this);
        G0(2131366308, this);
        G0(2131366307, this);
        G0(2131366413, this);
        G0(2131366412, this);
        G0(2131366437, this);
        G0(2131366431, this);
        G0(2131366430, this);
        G0(2131366420, this);
        G0(2131364914, this);
        G0(2131366438, this);
        G0(2131366439, this);
        G0(2131367591, this);
        G0(2131363892, this);
        G0(2131364979, this);
        G0(2131364693, this);
        G0(2131366409, this);
        G0(2131366419, this);
        G0(2131365576, this);
        G0(2131366433, this);
        G0(2131363360, this);
        G0(2131366421, this);
        G0(2131367582, this);
        G0(2131366139, this);
        ((android.widget.TextView) findViewById(2131363495)).setText("Truecaller Release");
        if (m03.r.g(this) != null) {
            str = new java.text.SimpleDateFormat("HH:mm dd/MM/yyyy", java.util.Locale.US).format(new java.util.Date(((java.lang.Long) m03.r.g(this)).longValue()));
        } else {
            str = "Not Available";
        }
        java.lang.String i24 = ((u03.c) this.K0).i();
        java.lang.String G = this.A0.G("imPeerId");
        java.lang.StringBuilder E = ro0.f.E("Build time: ", str, "\nDevice: ", i24, "\nIM ID: ");
        E.append(G);
        ((android.widget.TextView) findViewById(2131363491)).setText(E.toString());
        ah.f fVar = this.S0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "contributor");
        java.util.List a = ((gi2.b) fg3.h0.O(kotlin.coroutines.d.a, new g03.bar(fVar, null, i17))).a(this);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById(2131363379);
        int i25 = 0;
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) a;
            if (i25 < arrayList.size()) {
                viewGroup2.addView((android.view.View) arrayList.get(i25), i25);
                i25++;
            } else {
                android.widget.TextView textView = (android.widget.TextView) findViewById(2131363495);
                com.truecaller.qa.o oVar = new com.truecaller.qa.o((android.view.ViewGroup) findViewById(2131363379));
                androidx.appcompat.widget.SearchView findViewById = findViewById(2131363405);
                findViewById.setOnSearchClickListener(new com.truecaller.qa.j(textView, 0));
                findViewById.setOnCloseListener(new a93.c(i8, oVar, textView));
                findViewById.setOnQueryTextListener(new com.truecaller.qa.l(oVar));
                findViewById(2131363404).setOnScrollChangeListener(new com.google.firebase.crashlytics.internal.concurrency.baz(findViewById, 13));
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        super/*androidx.fragment.app.FragmentActivity*/.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            if (iArr[0] == 0) {
                y0();
                return;
            } else {
                android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "We need media storage access for exporting DB Schema. Please try again and grant permission when android will ask about it", 1).show();
                return;
            }
        }
        if (i == 4) {
            if (iArr[0] == 0) {
                z0();
            } else {
                android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "We need media storage access for exporting logs. Please try again and grant permission when android will ask about it", 1).show();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0() {
        new i.d(this).setTitle("Add edge end-point").l(2131560293).setPositiveButton(2132019051, new com.truecaller.qa.h(6, this)).setNegativeButton(2132019018, (android.content.DialogInterface.OnClickListener) null).m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0() {
        new i.d(this).setTitle("Add search warning").l(2131560301).setPositiveButton(2132019079, new com.truecaller.qa.h(1, this)).setNegativeButton(2132019018, (android.content.DialogInterface.OnClickListener) null).m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0() {
        new i.d(this).setTitle("Add top spammer").l(2131560304).setPositiveButton(2132019079, new com.truecaller.qa.h(8, this)).setNegativeButton(2132019018, (android.content.DialogInterface.OnClickListener) null).m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w0() {
        new i.d(this).setTitle("Forced Update Scenario").c(new java.lang.String[]{"Just change the state", "Change state and show dialog", "Change state and show activity"}, new com.truecaller.qa.h(5, this)).m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x0(com.truecaller.qa.QMActivity qMActivity) {
        i.d dVar = new i.d(qMActivity);
        dVar.setTitle("Change Reminder Notif Time");
        dVar.c(new java.lang.String[]{"Default Time", "Immediate", "After 5 min", "After 1 hour"}, new com.truecaller.qa.h(2, this));
        dVar.create().show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0() {
        if (!((qw2.b0) this.B0).q()) {
            requestPermissions(new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
            return;
        }
        android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "App is exporting DB Schema...", 0).show();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
        ng3.b bVar = fg3.r0.a;
        fg3.h0.g(fg3.f1.a, lg3.k.a, (fg3.f0) null, new bt1.bar(this, (df3.bar) null, 1), 2).invokeOnCompletion(new com.truecaller.qa.c(0, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z0() {
        if (!((qw2.b0) this.B0).q()) {
            requestPermissions(new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
            return;
        }
        android.widget.Toast.makeText((android.content.Context) this, (java.lang.CharSequence) "App is exporting logs...", 0).show();
        java.text.SimpleDateFormat simpleDateFormat = bt1.baz.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "context");
        fg3.h0.g(bt1.baz.c, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new bt1.bar(this, (df3.bar) null, 0), 3).invokeOnCompletion(new com.truecaller.qa.c(1, this));
    }
}
