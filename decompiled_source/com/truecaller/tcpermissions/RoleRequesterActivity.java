package com.truecaller.tcpermissions;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/truecaller/tcpermissions/RoleRequesterActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lqw2/n;", "<init>", "()V", "p7/baz", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RoleRequesterActivity extends com.truecaller.tcpermissions.Hilt_RoleRequesterActivity implements qw2.n {
    public static final p7.baz f0 = new java.lang.Object();
    public qw2.p d0;
    public nc0.l1 e0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qw2.n
    public final void finish() {
        super/*android.app.Activity*/.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [android.content.Context, java.lang.Object, com.truecaller.tcpermissions.RoleRequesterActivity] */
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        boolean z;
        boolean z2;
        androidx.appcompat.app.AppCompatActivity appCompatActivity;
        int i3;
        java.lang.String str;
        int i4;
        boolean m;
        java.lang.String str2;
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        qw2.p u0 = u0();
        if (i == 19018 || i == 19019) {
            final int i5 = 0;
            final int i6 = 1;
            if (i2 == -1) {
                z = true;
            } else {
                z = false;
            }
            u0.f = z;
            int i7 = 2;
            if (u0.i) {
                u03.b bVar = u0.c;
                com.truecaller.tcpermissions.Role role = u0.h;
                if (role == null) {
                    i3 = -1;
                } else {
                    i3 = qw2.o.a[role.ordinal()];
                }
                if (i3 != -1) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            str = "DialerApp";
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    } else {
                        str = "CallerIdApp";
                    }
                    com.truecaller.tcpermissions.Role role2 = u0.h;
                    if (role2 == null) {
                        i4 = -1;
                    } else {
                        i4 = qw2.o.a[role2.ordinal()];
                    }
                    if (i4 != -1) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                m = ((u03.c) bVar).o();
                            } else {
                                throw new java.lang.RuntimeException();
                            }
                        } else {
                            m = ((u03.c) bVar).m();
                        }
                        if (m) {
                            str2 = "Enabled";
                        } else {
                            str2 = "Disabled";
                        }
                        qx2.w7 h = qx2.bc.h();
                        h.i(str2);
                        h.j("notification");
                        h.l(str);
                        qx2.bc f = h.f();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "build(...)");
                        j71.g.K(f, u0.d);
                    }
                }
            }
            if (!u0.f && u0.g && u0.h == com.truecaller.tcpermissions.Role.ROLE_CALL_SCREENING && (appCompatActivity = (qw2.n) u0.a) != null && new android.content.Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS").resolveActivity(((com.truecaller.tcpermissions.RoleRequesterActivity) appCompatActivity).getPackageManager()) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                qw2.n nVar = (qw2.n) u0.a;
                if (nVar != null) {
                    final ?? r9 = (com.truecaller.tcpermissions.RoleRequesterActivity) nVar;
                    i.d dVar = new i.d((android.content.Context) r9, 2132083438);
                    android.view.LayoutInflater from = android.view.LayoutInflater.from(r9);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
                    android.view.View inflate = yy.qux.F(from, true).inflate(2131558990, (android.view.ViewGroup) null);
                    inflate.findViewById(2131361954).setOnClickListener(new android.view.View.OnClickListener(r9) { // from class: qw2.k
                        public final /* synthetic */ com.truecaller.tcpermissions.RoleRequesterActivity b;

                        {
                            this.b = r9;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            int i8 = i5;
                            com.truecaller.tcpermissions.RoleRequesterActivity roleRequesterActivity = this.b;
                            switch (i8) {
                                case 0:
                                    p7.baz bazVar = com.truecaller.tcpermissions.RoleRequesterActivity.f0;
                                    qw2.p u02 = roleRequesterActivity.u0();
                                    androidx.appcompat.app.AppCompatActivity appCompatActivity2 = (qw2.n) u02.a;
                                    if (appCompatActivity2 != null) {
                                        ((com.truecaller.tcpermissions.RoleRequesterActivity) appCompatActivity2).startActivity(new android.content.Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                                    }
                                    qw2.n nVar2 = (qw2.n) u02.a;
                                    if (nVar2 != null) {
                                        nVar2.finish();
                                        return;
                                    }
                                    return;
                                default:
                                    p7.baz bazVar2 = com.truecaller.tcpermissions.RoleRequesterActivity.f0;
                                    qw2.n nVar3 = (qw2.n) roleRequesterActivity.u0().a;
                                    if (nVar3 != null) {
                                        nVar3.finish();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    inflate.findViewById(2131361919).setOnClickListener(new android.view.View.OnClickListener(r9) { // from class: qw2.k
                        public final /* synthetic */ com.truecaller.tcpermissions.RoleRequesterActivity b;

                        {
                            this.b = r9;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            int i8 = i6;
                            com.truecaller.tcpermissions.RoleRequesterActivity roleRequesterActivity = this.b;
                            switch (i8) {
                                case 0:
                                    p7.baz bazVar = com.truecaller.tcpermissions.RoleRequesterActivity.f0;
                                    qw2.p u02 = roleRequesterActivity.u0();
                                    androidx.appcompat.app.AppCompatActivity appCompatActivity2 = (qw2.n) u02.a;
                                    if (appCompatActivity2 != null) {
                                        ((com.truecaller.tcpermissions.RoleRequesterActivity) appCompatActivity2).startActivity(new android.content.Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                                    }
                                    qw2.n nVar2 = (qw2.n) u02.a;
                                    if (nVar2 != null) {
                                        nVar2.finish();
                                        return;
                                    }
                                    return;
                                default:
                                    p7.baz bazVar2 = com.truecaller.tcpermissions.RoleRequesterActivity.f0;
                                    qw2.n nVar3 = (qw2.n) roleRequesterActivity.u0().a;
                                    if (nVar3 != null) {
                                        nVar3.finish();
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    dVar.setView(inflate);
                    dVar.a.n = new com.truecaller.ui.j(r9, i7);
                    dVar.m();
                    return;
                }
                return;
            }
            if (i == 19018) {
                u0.e.a(com.truecaller.tcpermissions.PermissionPoller$Permission.DRAW_OVERLAY);
            }
            qw2.n nVar2 = (qw2.n) u0.a;
            if (nVar2 != null) {
                nVar2.finish();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.tcpermissions.Hilt_RoleRequesterActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        android.content.res.Resources.Theme theme = getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        boolean z = false;
        yy.qux.n(theme, false);
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (bundle != null) {
            z = true;
        }
        t0(intent, z);
        v0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.tcpermissions.Hilt_RoleRequesterActivity
    public final void onDestroy() {
        if (isFinishing()) {
            qw2.p u0 = u0();
            qw2.u uVar = u0.b;
            boolean z = u0.f;
            kotlin.jvm.functions.Function1 function1 = uVar.g;
            if (function1 != null) {
                uVar.g = null;
                function1.invoke(java.lang.Boolean.valueOf(z));
            }
        }
        super.onDestroy();
    }

    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        v0();
        t0(intent, false);
    }

    public final void t0(android.content.Intent intent, boolean z) {
        android.content.Intent intent2;
        java.io.Serializable h = g6.b.h(intent, "request_role", com.truecaller.tcpermissions.Role.class);
        kotlin.jvm.internal.Intrinsics.d(h);
        com.truecaller.tcpermissions.Role role = (com.truecaller.tcpermissions.Role) h;
        boolean booleanExtra = intent.getBooleanExtra("open_system_settings_if_permission_revoked", false);
        boolean hasExtra = intent.hasExtra("LOG_ROLE_REQUEST_ANALYTICS_ON_RESULT");
        u0().a = this;
        qw2.p u0 = u0();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(role, "requestedRole");
        androidx.activity.ComponentActivity componentActivity = (qw2.n) u0.a;
        if (componentActivity == null || z) {
            return;
        }
        int i = qw2.o.a[role.ordinal()];
        if (i != 1) {
            if (i == 2) {
                androidx.activity.ComponentActivity componentActivity2 = (com.truecaller.tcpermissions.RoleRequesterActivity) componentActivity;
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    java.lang.Object systemService = componentActivity2.getSystemService("role");
                    kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.app.role.RoleManager");
                    intent2 = q3.bar.d(com.huawei.hms.framework.common.bar.d(systemService));
                } else {
                    intent2 = new android.content.Intent("android.telecom.action.CHANGE_DEFAULT_DIALER");
                    intent2.putExtra("android.telecom.extra.CHANGE_DEFAULT_DIALER_PACKAGE_NAME", componentActivity2.getPackageName());
                }
                kotlin.jvm.internal.Intrinsics.d(intent2);
                intent2.setFlags(1073741824);
                try {
                    componentActivity2.startActivityForResult(intent2, 19019);
                } catch (android.content.ActivityNotFoundException unused) {
                    qw2.p u02 = componentActivity2.u0();
                    u02.f = false;
                    qw2.n nVar = (qw2.n) u02.a;
                    if (nVar != null) {
                        nVar.finish();
                    }
                }
            } else {
                throw new java.lang.RuntimeException();
            }
        } else {
            androidx.activity.ComponentActivity componentActivity3 = (com.truecaller.tcpermissions.RoleRequesterActivity) componentActivity;
            java.lang.Object systemService2 = componentActivity3.getSystemService("role");
            kotlin.jvm.internal.Intrinsics.e(systemService2, "null cannot be cast to non-null type android.app.role.RoleManager");
            android.content.Intent q = q3.bar.q(com.huawei.hms.framework.common.bar.d(systemService2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(q, "createRequestRoleIntent(...)");
            q.setFlags(1073741824);
            try {
                componentActivity3.startActivityForResult(q, 19018);
            } catch (android.content.ActivityNotFoundException unused2) {
                qw2.p u04 = componentActivity3.u0();
                u04.f = false;
                qw2.n nVar2 = (qw2.n) u04.a;
                if (nVar2 != null) {
                    nVar2.finish();
                }
            }
        }
        u0.g = booleanExtra;
        u0.h = role;
        u0.i = hasExtra;
    }

    public final qw2.p u0() {
        qw2.p pVar = this.d0;
        if (pVar != null) {
            return pVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0() {
        java.lang.String str;
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        com.truecaller.tcpermissions.Role role = (com.truecaller.tcpermissions.Role) g6.b.h(intent, "request_role", com.truecaller.tcpermissions.Role.class);
        if (getIntent().hasExtra("LOG_ROLE_REQUEST_ANALYTICS_ON_OPEN") && role != null) {
            getIntent().removeExtra("LOG_ROLE_REQUEST_ANALYTICS_ON_OPEN");
            int i = qw2.l.a[role.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    str = "notificationCallerIDpermission";
                } else {
                    throw new java.lang.RuntimeException();
                }
            } else {
                str = "notificationUnableToBlockCall";
            }
            nc0.l1 l1Var = this.e0;
            if (l1Var != null) {
                l1Var.c(str, "Opened", new qx2.mi("", "Body"));
            } else {
                kotlin.jvm.internal.Intrinsics.n("searchAnalyticsManager");
                throw null;
            }
        }
    }
}
