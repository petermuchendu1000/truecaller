package com.truecaller.messaging.defaultsms;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class e extends of0.baz {
    public final x12.bar d;
    public final u03.b e;
    public final nc0.bar f;
    public final xz1.q g;
    public final u03.z h;
    public final xz1.baz i;
    public final com.truecaller.messaging.defaultsms.c j;
    public final com.truecaller.clevertap.CleverTapManager k;
    public final a53.bar l;
    public final uk2.g m;
    public final a32.x n;
    public final f02.baz o;
    public java.lang.String p;
    public boolean q;
    public java.lang.String r;
    public boolean s;
    public java.lang.String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(x12.bar barVar, u03.b bVar, nc0.bar barVar2, xz1.q qVar, u03.z zVar, xz1.baz bazVar, com.truecaller.messaging.defaultsms.c cVar, com.truecaller.clevertap.CleverTapManager cleverTapManager, a53.bar barVar3, uk2.g gVar, a32.x xVar, f02.baz bazVar2, kotlin.coroutines.CoroutineContext coroutineContext) {
        super(coroutineContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "mSpamSearchTrigger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "mDeviceInfoUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "mSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zVar, "mPermissionUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "mDefaultSmsPackageCache");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "mDefaultSmsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cleverTapManager, "mCleverTapManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "mTamApiLoggingScheduler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "claimRewardProgramPointsUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xVar, "threeLevelSpamHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "businessHomeFeatureHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "baseContext");
        this.d = barVar;
        this.e = bVar;
        this.f = barVar2;
        this.g = qVar;
        this.h = zVar;
        this.i = bazVar;
        this.j = cVar;
        this.k = cleverTapManager;
        this.l = barVar3;
        this.m = gVar;
        this.n = xVar;
        this.o = bazVar2;
    }

    public final void c2() {
        this.q = true;
        this.e.getClass();
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            this.i.b();
        }
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.messaging.defaultsms.d(this, null, 0), 3);
    }

    public final void d2() {
        u03.c cVar = this.e;
        int i = 1;
        if (cVar.p()) {
            if (this.h.g(new java.lang.String[]{"android.permission.SEND_SMS"})) {
                this.q = true;
                fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.messaging.defaultsms.d(this, null, i), 3);
                return;
            }
            bd3.qux quxVar = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) this).a;
            if (quxVar != null) {
                bd3.qux quxVar2 = (com.truecaller.messaging.defaultsms.DefaultSmsActivity) quxVar;
                if (!if0.y1.Z(quxVar2, "android.permission.SEND_SMS")) {
                    if (if0.y1.G(quxVar2, "android.permission.SEND_SMS")) {
                        if0.y1.N(quxVar2);
                        return;
                    } else {
                        f6.baz.l(quxVar2, new java.lang.String[]{"android.permission.SEND_SMS"}, 0);
                        return;
                    }
                }
                return;
            }
            return;
        }
        cVar.getClass();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.activity.ComponentActivity componentActivity = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) this).a;
            if (componentActivity != null) {
                androidx.activity.ComponentActivity componentActivity2 = (com.truecaller.messaging.defaultsms.DefaultSmsActivity) componentActivity;
                try {
                    android.app.role.RoleManager d = com.huawei.hms.framework.common.bar.d(componentActivity2.getSystemService("role"));
                    if (d != null) {
                        componentActivity2.startActivityForResult(com.huawei.hms.framework.common.bar.e(d), 1);
                        return;
                    }
                    return;
                } catch (java.lang.RuntimeException e) {
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
                    com.truecaller.messaging.defaultsms.e eVar = componentActivity2.d0;
                    bd3.qux quxVar3 = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) eVar).a;
                    if (quxVar3 != null) {
                        android.widget.Toast.makeText((android.content.Context) quxVar3, 2132022085, 0).show();
                    }
                    bd3.qux quxVar4 = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) eVar).a;
                    if (quxVar4 != null) {
                        bd3.qux quxVar5 = (com.truecaller.messaging.defaultsms.DefaultSmsActivity) quxVar4;
                        quxVar5.setResult(0);
                        quxVar5.finish();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        com.truecaller.messaging.defaultsms.f fVar = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) this).a;
        if (fVar != null) {
            com.truecaller.messaging.defaultsms.DefaultSmsActivity defaultSmsActivity = (com.truecaller.messaging.defaultsms.DefaultSmsActivity) fVar;
            try {
                android.content.Intent intent = new android.content.Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
                intent.putExtra("package", defaultSmsActivity.e0.k());
                defaultSmsActivity.startActivityForResult(intent, 1);
            } catch (java.lang.RuntimeException e2) {
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e2);
                com.truecaller.messaging.defaultsms.e eVar2 = defaultSmsActivity.d0;
                bd3.qux quxVar6 = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) eVar2).a;
                if (quxVar6 != null) {
                    android.widget.Toast.makeText((android.content.Context) quxVar6, 2132022085, 0).show();
                }
                bd3.qux quxVar7 = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) eVar2).a;
                if (quxVar7 != null) {
                    bd3.qux quxVar8 = (com.truecaller.messaging.defaultsms.DefaultSmsActivity) quxVar7;
                    quxVar8.setResult(0);
                    quxVar8.finish();
                }
            }
        }
    }

    public final void m1() {
        super.m1();
        com.truecaller.messaging.defaultsms.c cVar = this.j;
        boolean z = this.q;
        synchronized (cVar) {
            try {
                com.truecaller.messaging.defaultsms.a aVar = cVar.e;
                if (aVar != null) {
                    aVar.invoke(java.lang.Boolean.valueOf(z));
                }
                cVar.e = null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.content.Context, com.truecaller.messaging.defaultsms.DefaultSmsActivity, java.lang.Object] */
    public final void u0(java.lang.Object obj) {
        com.truecaller.messaging.defaultsms.f fVar = (com.truecaller.messaging.defaultsms.f) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "presenterView");
        ((com.truecaller.sdk.bar) this).a = fVar;
        java.lang.String str = this.r;
        if (str != null) {
            final ?? r4 = (com.truecaller.messaging.defaultsms.DefaultSmsActivity) fVar;
            r4.getClass();
            i.d dVar = new i.d((android.content.Context) r4);
            i.a aVar = dVar.a;
            aVar.f = str;
            final int i = 0;
            aVar.m = false;
            final int i2 = 1;
            dVar.setPositiveButton(2132022086, new android.content.DialogInterface.OnClickListener() { // from class: com.truecaller.messaging.defaultsms.bar
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i3) {
                    switch (i) {
                        case 0:
                            r4.d0.d2();
                            return;
                        default:
                            bd3.qux quxVar = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) r4.d0).a;
                            if (quxVar != null) {
                                bd3.qux quxVar2 = (com.truecaller.messaging.defaultsms.DefaultSmsActivity) quxVar;
                                quxVar2.setResult(0);
                                quxVar2.finish();
                                return;
                            }
                            return;
                    }
                }
            }).setNegativeButton(2132022083, new android.content.DialogInterface.OnClickListener() { // from class: com.truecaller.messaging.defaultsms.bar
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i3) {
                    switch (i2) {
                        case 0:
                            r4.d0.d2();
                            return;
                        default:
                            bd3.qux quxVar = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) r4.d0).a;
                            if (quxVar != null) {
                                bd3.qux quxVar2 = (com.truecaller.messaging.defaultsms.DefaultSmsActivity) quxVar;
                                quxVar2.setResult(0);
                                quxVar2.finish();
                                return;
                            }
                            return;
                    }
                }
            }).create().show();
            return;
        }
        d2();
    }
}
