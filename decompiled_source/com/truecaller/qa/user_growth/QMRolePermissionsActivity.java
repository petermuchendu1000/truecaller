package com.truecaller.qa.user_growth;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/qa/user_growth/QMRolePermissionsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class QMRolePermissionsActivity extends com.truecaller.qa.user_growth.Hilt_QMRolePermissionsActivity {
    public static final /* synthetic */ int j0 = 0;
    public g.baz d0;
    public qw2.a0 e0;
    public u03.z f0;
    public u03.b g0;
    public android.widget.TableLayout h0;
    public final kotlin.Lazy i0 = kotlin.LazyKt.lazy(new o93.k(this, 5));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.qa.user_growth.Hilt_QMRolePermissionsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        final int i = 2;
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        setContentView(2131560306);
        android.view.View findViewById = findViewById(2131366643);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.h0 = (android.widget.TableLayout) findViewById;
        final int i2 = 3;
        ((android.widget.Button) findViewById(2131366136)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: oi2.qux
            public final /* synthetic */ com.truecaller.qa.user_growth.QMRolePermissionsActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [com.truecaller.qa.user_growth.QMRolePermissionsActivity, android.content.Context, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                boolean isRoleAvailable;
                int i3 = i2;
                ?? r5 = this.b;
                switch (i3) {
                    case 0:
                        int i4 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        ak.r0.Y((android.content.Context) r5, true);
                        return;
                    case 1:
                        int i5 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        r5.startActivity(new android.content.Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                        return;
                    case 2:
                        int i6 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        android.content.Intent data = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(android.net.Uri.fromParts("package", r5.getPackageName(), null));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                        r5.startActivity(data);
                        return;
                    case 3:
                        int i7 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        java.util.List h0 = kotlin.collections.v.h0(((qw2.b0) r5.u0()).a());
                        com.truecaller.tcpermissions.PermissionRequestOptions permissionRequestOptions = new com.truecaller.tcpermissions.PermissionRequestOptions(null, 7);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRequestOptions, "options");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0, "permissions");
                        android.content.Intent intent = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.TcPermissionsHandlerActivity.class);
                        intent.setFlags(268435456);
                        intent.putStringArrayListExtra("permissions", new java.util.ArrayList<>(h0));
                        intent.putExtra("options", permissionRequestOptions);
                        r5.startActivity(intent);
                        return;
                    case 4:
                        int i8 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qw2.a.c, "analyticsConfig");
                        android.content.Intent intent2 = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.RoleRequesterActivity.class);
                        intent2.setFlags(268435456);
                        intent2.putExtra("request_role", com.truecaller.tcpermissions.Role.ROLE_DEFAULT_DIALER);
                        r5.startActivity(intent2);
                        return;
                    case 5:
                        int i9 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        isRoleAvailable = r5.v0().isRoleAvailable("android.app.role.SMS");
                        if (isRoleAvailable && !j5.bar.w(r5.v0())) {
                            android.content.Intent e = com.huawei.hms.framework.common.bar.e(r5.v0());
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "createRequestRoleIntent(...)");
                            g.baz bazVar = r5.d0;
                            if (bazVar != null) {
                                bazVar.a(e, (ea.c) null);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("requestRoleLauncher");
                                throw null;
                            }
                        }
                        return;
                    case 6:
                        int i10 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        p7.baz bazVar2 = com.truecaller.tcpermissions.RoleRequesterActivity.f0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        r5.startActivity(p7.baz.h(bazVar2, (android.content.Context) r5, true, 4));
                        return;
                    default:
                        int i11 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        try {
                            android.content.Intent data2 = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION").setFlags(268435456).setData(android.net.Uri.parse("package:" + r5.getPackageName()));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data2, "setData(...)");
                            r5.startActivity(data2);
                            return;
                        } catch (android.content.ActivityNotFoundException e2) {
                            o82.a.C(e2);
                            return;
                        }
                }
            }
        });
        final int i3 = 4;
        ((android.widget.Button) findViewById(2131363452)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: oi2.qux
            public final /* synthetic */ com.truecaller.qa.user_growth.QMRolePermissionsActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [com.truecaller.qa.user_growth.QMRolePermissionsActivity, android.content.Context, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                boolean isRoleAvailable;
                int i32 = i3;
                ?? r5 = this.b;
                switch (i32) {
                    case 0:
                        int i4 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        ak.r0.Y((android.content.Context) r5, true);
                        return;
                    case 1:
                        int i5 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        r5.startActivity(new android.content.Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                        return;
                    case 2:
                        int i6 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        android.content.Intent data = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(android.net.Uri.fromParts("package", r5.getPackageName(), null));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                        r5.startActivity(data);
                        return;
                    case 3:
                        int i7 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        java.util.List h0 = kotlin.collections.v.h0(((qw2.b0) r5.u0()).a());
                        com.truecaller.tcpermissions.PermissionRequestOptions permissionRequestOptions = new com.truecaller.tcpermissions.PermissionRequestOptions(null, 7);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRequestOptions, "options");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0, "permissions");
                        android.content.Intent intent = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.TcPermissionsHandlerActivity.class);
                        intent.setFlags(268435456);
                        intent.putStringArrayListExtra("permissions", new java.util.ArrayList<>(h0));
                        intent.putExtra("options", permissionRequestOptions);
                        r5.startActivity(intent);
                        return;
                    case 4:
                        int i8 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qw2.a.c, "analyticsConfig");
                        android.content.Intent intent2 = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.RoleRequesterActivity.class);
                        intent2.setFlags(268435456);
                        intent2.putExtra("request_role", com.truecaller.tcpermissions.Role.ROLE_DEFAULT_DIALER);
                        r5.startActivity(intent2);
                        return;
                    case 5:
                        int i9 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        isRoleAvailable = r5.v0().isRoleAvailable("android.app.role.SMS");
                        if (isRoleAvailable && !j5.bar.w(r5.v0())) {
                            android.content.Intent e = com.huawei.hms.framework.common.bar.e(r5.v0());
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "createRequestRoleIntent(...)");
                            g.baz bazVar = r5.d0;
                            if (bazVar != null) {
                                bazVar.a(e, (ea.c) null);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("requestRoleLauncher");
                                throw null;
                            }
                        }
                        return;
                    case 6:
                        int i10 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        p7.baz bazVar2 = com.truecaller.tcpermissions.RoleRequesterActivity.f0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        r5.startActivity(p7.baz.h(bazVar2, (android.content.Context) r5, true, 4));
                        return;
                    default:
                        int i11 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        try {
                            android.content.Intent data2 = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION").setFlags(268435456).setData(android.net.Uri.parse("package:" + r5.getPackageName()));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data2, "setData(...)");
                            r5.startActivity(data2);
                            return;
                        } catch (android.content.ActivityNotFoundException e2) {
                            o82.a.C(e2);
                            return;
                        }
                }
            }
        });
        final int i4 = 5;
        ((android.widget.Button) findViewById(2131363453)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: oi2.qux
            public final /* synthetic */ com.truecaller.qa.user_growth.QMRolePermissionsActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [com.truecaller.qa.user_growth.QMRolePermissionsActivity, android.content.Context, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                boolean isRoleAvailable;
                int i32 = i4;
                ?? r5 = this.b;
                switch (i32) {
                    case 0:
                        int i42 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        ak.r0.Y((android.content.Context) r5, true);
                        return;
                    case 1:
                        int i5 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        r5.startActivity(new android.content.Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                        return;
                    case 2:
                        int i6 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        android.content.Intent data = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(android.net.Uri.fromParts("package", r5.getPackageName(), null));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                        r5.startActivity(data);
                        return;
                    case 3:
                        int i7 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        java.util.List h0 = kotlin.collections.v.h0(((qw2.b0) r5.u0()).a());
                        com.truecaller.tcpermissions.PermissionRequestOptions permissionRequestOptions = new com.truecaller.tcpermissions.PermissionRequestOptions(null, 7);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRequestOptions, "options");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0, "permissions");
                        android.content.Intent intent = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.TcPermissionsHandlerActivity.class);
                        intent.setFlags(268435456);
                        intent.putStringArrayListExtra("permissions", new java.util.ArrayList<>(h0));
                        intent.putExtra("options", permissionRequestOptions);
                        r5.startActivity(intent);
                        return;
                    case 4:
                        int i8 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qw2.a.c, "analyticsConfig");
                        android.content.Intent intent2 = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.RoleRequesterActivity.class);
                        intent2.setFlags(268435456);
                        intent2.putExtra("request_role", com.truecaller.tcpermissions.Role.ROLE_DEFAULT_DIALER);
                        r5.startActivity(intent2);
                        return;
                    case 5:
                        int i9 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        isRoleAvailable = r5.v0().isRoleAvailable("android.app.role.SMS");
                        if (isRoleAvailable && !j5.bar.w(r5.v0())) {
                            android.content.Intent e = com.huawei.hms.framework.common.bar.e(r5.v0());
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "createRequestRoleIntent(...)");
                            g.baz bazVar = r5.d0;
                            if (bazVar != null) {
                                bazVar.a(e, (ea.c) null);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("requestRoleLauncher");
                                throw null;
                            }
                        }
                        return;
                    case 6:
                        int i10 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        p7.baz bazVar2 = com.truecaller.tcpermissions.RoleRequesterActivity.f0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        r5.startActivity(p7.baz.h(bazVar2, (android.content.Context) r5, true, 4));
                        return;
                    default:
                        int i11 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        try {
                            android.content.Intent data2 = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION").setFlags(268435456).setData(android.net.Uri.parse("package:" + r5.getPackageName()));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data2, "setData(...)");
                            r5.startActivity(data2);
                            return;
                        } catch (android.content.ActivityNotFoundException e2) {
                            o82.a.C(e2);
                            return;
                        }
                }
            }
        });
        final int i5 = 6;
        ((android.widget.Button) findViewById(2131363451)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: oi2.qux
            public final /* synthetic */ com.truecaller.qa.user_growth.QMRolePermissionsActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [com.truecaller.qa.user_growth.QMRolePermissionsActivity, android.content.Context, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                boolean isRoleAvailable;
                int i32 = i5;
                ?? r5 = this.b;
                switch (i32) {
                    case 0:
                        int i42 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        ak.r0.Y((android.content.Context) r5, true);
                        return;
                    case 1:
                        int i52 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        r5.startActivity(new android.content.Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                        return;
                    case 2:
                        int i6 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        android.content.Intent data = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(android.net.Uri.fromParts("package", r5.getPackageName(), null));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                        r5.startActivity(data);
                        return;
                    case 3:
                        int i7 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        java.util.List h0 = kotlin.collections.v.h0(((qw2.b0) r5.u0()).a());
                        com.truecaller.tcpermissions.PermissionRequestOptions permissionRequestOptions = new com.truecaller.tcpermissions.PermissionRequestOptions(null, 7);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRequestOptions, "options");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0, "permissions");
                        android.content.Intent intent = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.TcPermissionsHandlerActivity.class);
                        intent.setFlags(268435456);
                        intent.putStringArrayListExtra("permissions", new java.util.ArrayList<>(h0));
                        intent.putExtra("options", permissionRequestOptions);
                        r5.startActivity(intent);
                        return;
                    case 4:
                        int i8 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qw2.a.c, "analyticsConfig");
                        android.content.Intent intent2 = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.RoleRequesterActivity.class);
                        intent2.setFlags(268435456);
                        intent2.putExtra("request_role", com.truecaller.tcpermissions.Role.ROLE_DEFAULT_DIALER);
                        r5.startActivity(intent2);
                        return;
                    case 5:
                        int i9 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        isRoleAvailable = r5.v0().isRoleAvailable("android.app.role.SMS");
                        if (isRoleAvailable && !j5.bar.w(r5.v0())) {
                            android.content.Intent e = com.huawei.hms.framework.common.bar.e(r5.v0());
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "createRequestRoleIntent(...)");
                            g.baz bazVar = r5.d0;
                            if (bazVar != null) {
                                bazVar.a(e, (ea.c) null);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("requestRoleLauncher");
                                throw null;
                            }
                        }
                        return;
                    case 6:
                        int i10 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        p7.baz bazVar2 = com.truecaller.tcpermissions.RoleRequesterActivity.f0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        r5.startActivity(p7.baz.h(bazVar2, (android.content.Context) r5, true, 4));
                        return;
                    default:
                        int i11 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        try {
                            android.content.Intent data2 = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION").setFlags(268435456).setData(android.net.Uri.parse("package:" + r5.getPackageName()));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data2, "setData(...)");
                            r5.startActivity(data2);
                            return;
                        } catch (android.content.ActivityNotFoundException e2) {
                            o82.a.C(e2);
                            return;
                        }
                }
            }
        });
        final int i6 = 7;
        ((android.widget.Button) findViewById(2131363573)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: oi2.qux
            public final /* synthetic */ com.truecaller.qa.user_growth.QMRolePermissionsActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [com.truecaller.qa.user_growth.QMRolePermissionsActivity, android.content.Context, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                boolean isRoleAvailable;
                int i32 = i6;
                ?? r5 = this.b;
                switch (i32) {
                    case 0:
                        int i42 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        ak.r0.Y((android.content.Context) r5, true);
                        return;
                    case 1:
                        int i52 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        r5.startActivity(new android.content.Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                        return;
                    case 2:
                        int i62 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        android.content.Intent data = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(android.net.Uri.fromParts("package", r5.getPackageName(), null));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                        r5.startActivity(data);
                        return;
                    case 3:
                        int i7 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        java.util.List h0 = kotlin.collections.v.h0(((qw2.b0) r5.u0()).a());
                        com.truecaller.tcpermissions.PermissionRequestOptions permissionRequestOptions = new com.truecaller.tcpermissions.PermissionRequestOptions(null, 7);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRequestOptions, "options");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0, "permissions");
                        android.content.Intent intent = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.TcPermissionsHandlerActivity.class);
                        intent.setFlags(268435456);
                        intent.putStringArrayListExtra("permissions", new java.util.ArrayList<>(h0));
                        intent.putExtra("options", permissionRequestOptions);
                        r5.startActivity(intent);
                        return;
                    case 4:
                        int i8 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qw2.a.c, "analyticsConfig");
                        android.content.Intent intent2 = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.RoleRequesterActivity.class);
                        intent2.setFlags(268435456);
                        intent2.putExtra("request_role", com.truecaller.tcpermissions.Role.ROLE_DEFAULT_DIALER);
                        r5.startActivity(intent2);
                        return;
                    case 5:
                        int i9 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        isRoleAvailable = r5.v0().isRoleAvailable("android.app.role.SMS");
                        if (isRoleAvailable && !j5.bar.w(r5.v0())) {
                            android.content.Intent e = com.huawei.hms.framework.common.bar.e(r5.v0());
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "createRequestRoleIntent(...)");
                            g.baz bazVar = r5.d0;
                            if (bazVar != null) {
                                bazVar.a(e, (ea.c) null);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("requestRoleLauncher");
                                throw null;
                            }
                        }
                        return;
                    case 6:
                        int i10 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        p7.baz bazVar2 = com.truecaller.tcpermissions.RoleRequesterActivity.f0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        r5.startActivity(p7.baz.h(bazVar2, (android.content.Context) r5, true, 4));
                        return;
                    default:
                        int i11 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        try {
                            android.content.Intent data2 = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION").setFlags(268435456).setData(android.net.Uri.parse("package:" + r5.getPackageName()));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data2, "setData(...)");
                            r5.startActivity(data2);
                            return;
                        } catch (android.content.ActivityNotFoundException e2) {
                            o82.a.C(e2);
                            return;
                        }
                }
            }
        });
        final int i7 = 0;
        ((android.widget.Button) findViewById(2131362454)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: oi2.qux
            public final /* synthetic */ com.truecaller.qa.user_growth.QMRolePermissionsActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [com.truecaller.qa.user_growth.QMRolePermissionsActivity, android.content.Context, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                boolean isRoleAvailable;
                int i32 = i7;
                ?? r5 = this.b;
                switch (i32) {
                    case 0:
                        int i42 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        ak.r0.Y((android.content.Context) r5, true);
                        return;
                    case 1:
                        int i52 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        r5.startActivity(new android.content.Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                        return;
                    case 2:
                        int i62 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        android.content.Intent data = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(android.net.Uri.fromParts("package", r5.getPackageName(), null));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                        r5.startActivity(data);
                        return;
                    case 3:
                        int i72 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        java.util.List h0 = kotlin.collections.v.h0(((qw2.b0) r5.u0()).a());
                        com.truecaller.tcpermissions.PermissionRequestOptions permissionRequestOptions = new com.truecaller.tcpermissions.PermissionRequestOptions(null, 7);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRequestOptions, "options");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0, "permissions");
                        android.content.Intent intent = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.TcPermissionsHandlerActivity.class);
                        intent.setFlags(268435456);
                        intent.putStringArrayListExtra("permissions", new java.util.ArrayList<>(h0));
                        intent.putExtra("options", permissionRequestOptions);
                        r5.startActivity(intent);
                        return;
                    case 4:
                        int i8 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qw2.a.c, "analyticsConfig");
                        android.content.Intent intent2 = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.RoleRequesterActivity.class);
                        intent2.setFlags(268435456);
                        intent2.putExtra("request_role", com.truecaller.tcpermissions.Role.ROLE_DEFAULT_DIALER);
                        r5.startActivity(intent2);
                        return;
                    case 5:
                        int i9 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        isRoleAvailable = r5.v0().isRoleAvailable("android.app.role.SMS");
                        if (isRoleAvailable && !j5.bar.w(r5.v0())) {
                            android.content.Intent e = com.huawei.hms.framework.common.bar.e(r5.v0());
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "createRequestRoleIntent(...)");
                            g.baz bazVar = r5.d0;
                            if (bazVar != null) {
                                bazVar.a(e, (ea.c) null);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("requestRoleLauncher");
                                throw null;
                            }
                        }
                        return;
                    case 6:
                        int i10 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        p7.baz bazVar2 = com.truecaller.tcpermissions.RoleRequesterActivity.f0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        r5.startActivity(p7.baz.h(bazVar2, (android.content.Context) r5, true, 4));
                        return;
                    default:
                        int i11 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        try {
                            android.content.Intent data2 = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION").setFlags(268435456).setData(android.net.Uri.parse("package:" + r5.getPackageName()));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data2, "setData(...)");
                            r5.startActivity(data2);
                            return;
                        } catch (android.content.ActivityNotFoundException e2) {
                            o82.a.C(e2);
                            return;
                        }
                }
            }
        });
        final int i8 = 1;
        ((android.widget.Button) findViewById(2131365585)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: oi2.qux
            public final /* synthetic */ com.truecaller.qa.user_growth.QMRolePermissionsActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [com.truecaller.qa.user_growth.QMRolePermissionsActivity, android.content.Context, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                boolean isRoleAvailable;
                int i32 = i8;
                ?? r5 = this.b;
                switch (i32) {
                    case 0:
                        int i42 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        ak.r0.Y((android.content.Context) r5, true);
                        return;
                    case 1:
                        int i52 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        r5.startActivity(new android.content.Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                        return;
                    case 2:
                        int i62 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        android.content.Intent data = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(android.net.Uri.fromParts("package", r5.getPackageName(), null));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                        r5.startActivity(data);
                        return;
                    case 3:
                        int i72 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        java.util.List h0 = kotlin.collections.v.h0(((qw2.b0) r5.u0()).a());
                        com.truecaller.tcpermissions.PermissionRequestOptions permissionRequestOptions = new com.truecaller.tcpermissions.PermissionRequestOptions(null, 7);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRequestOptions, "options");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0, "permissions");
                        android.content.Intent intent = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.TcPermissionsHandlerActivity.class);
                        intent.setFlags(268435456);
                        intent.putStringArrayListExtra("permissions", new java.util.ArrayList<>(h0));
                        intent.putExtra("options", permissionRequestOptions);
                        r5.startActivity(intent);
                        return;
                    case 4:
                        int i82 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qw2.a.c, "analyticsConfig");
                        android.content.Intent intent2 = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.RoleRequesterActivity.class);
                        intent2.setFlags(268435456);
                        intent2.putExtra("request_role", com.truecaller.tcpermissions.Role.ROLE_DEFAULT_DIALER);
                        r5.startActivity(intent2);
                        return;
                    case 5:
                        int i9 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        isRoleAvailable = r5.v0().isRoleAvailable("android.app.role.SMS");
                        if (isRoleAvailable && !j5.bar.w(r5.v0())) {
                            android.content.Intent e = com.huawei.hms.framework.common.bar.e(r5.v0());
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "createRequestRoleIntent(...)");
                            g.baz bazVar = r5.d0;
                            if (bazVar != null) {
                                bazVar.a(e, (ea.c) null);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("requestRoleLauncher");
                                throw null;
                            }
                        }
                        return;
                    case 6:
                        int i10 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        p7.baz bazVar2 = com.truecaller.tcpermissions.RoleRequesterActivity.f0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        r5.startActivity(p7.baz.h(bazVar2, (android.content.Context) r5, true, 4));
                        return;
                    default:
                        int i11 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        try {
                            android.content.Intent data2 = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION").setFlags(268435456).setData(android.net.Uri.parse("package:" + r5.getPackageName()));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data2, "setData(...)");
                            r5.startActivity(data2);
                            return;
                        } catch (android.content.ActivityNotFoundException e2) {
                            o82.a.C(e2);
                            return;
                        }
                }
            }
        });
        ((android.widget.Button) findViewById(2131364917)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: oi2.qux
            public final /* synthetic */ com.truecaller.qa.user_growth.QMRolePermissionsActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [com.truecaller.qa.user_growth.QMRolePermissionsActivity, android.content.Context, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                boolean isRoleAvailable;
                int i32 = i;
                ?? r5 = this.b;
                switch (i32) {
                    case 0:
                        int i42 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        ak.r0.Y((android.content.Context) r5, true);
                        return;
                    case 1:
                        int i52 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        r5.startActivity(new android.content.Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS"));
                        return;
                    case 2:
                        int i62 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        android.content.Intent data = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(android.net.Uri.fromParts("package", r5.getPackageName(), null));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                        r5.startActivity(data);
                        return;
                    case 3:
                        int i72 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        java.util.List h0 = kotlin.collections.v.h0(((qw2.b0) r5.u0()).a());
                        com.truecaller.tcpermissions.PermissionRequestOptions permissionRequestOptions = new com.truecaller.tcpermissions.PermissionRequestOptions(null, 7);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionRequestOptions, "options");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h0, "permissions");
                        android.content.Intent intent = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.TcPermissionsHandlerActivity.class);
                        intent.setFlags(268435456);
                        intent.putStringArrayListExtra("permissions", new java.util.ArrayList<>(h0));
                        intent.putExtra("options", permissionRequestOptions);
                        r5.startActivity(intent);
                        return;
                    case 4:
                        int i82 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qw2.a.c, "analyticsConfig");
                        android.content.Intent intent2 = new android.content.Intent((android.content.Context) r5, (java.lang.Class<?>) com.truecaller.tcpermissions.RoleRequesterActivity.class);
                        intent2.setFlags(268435456);
                        intent2.putExtra("request_role", com.truecaller.tcpermissions.Role.ROLE_DEFAULT_DIALER);
                        r5.startActivity(intent2);
                        return;
                    case 5:
                        int i9 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        isRoleAvailable = r5.v0().isRoleAvailable("android.app.role.SMS");
                        if (isRoleAvailable && !j5.bar.w(r5.v0())) {
                            android.content.Intent e = com.huawei.hms.framework.common.bar.e(r5.v0());
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "createRequestRoleIntent(...)");
                            g.baz bazVar = r5.d0;
                            if (bazVar != null) {
                                bazVar.a(e, (ea.c) null);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("requestRoleLauncher");
                                throw null;
                            }
                        }
                        return;
                    case 6:
                        int i10 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        p7.baz bazVar2 = com.truecaller.tcpermissions.RoleRequesterActivity.f0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r5, "context");
                        r5.startActivity(p7.baz.h(bazVar2, (android.content.Context) r5, true, 4));
                        return;
                    default:
                        int i11 = com.truecaller.qa.user_growth.QMRolePermissionsActivity.j0;
                        r5.getClass();
                        try {
                            android.content.Intent data2 = new android.content.Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION").setFlags(268435456).setData(android.net.Uri.parse("package:" + r5.getPackageName()));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data2, "setData(...)");
                            r5.startActivity(data2);
                            return;
                        } catch (android.content.ActivityNotFoundException e2) {
                            o82.a.C(e2);
                            return;
                        }
                }
            }
        });
        this.d0 = registerForActivityResult(new androidx.fragment.app.a1(8), new nm.b(14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        int i;
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        boolean m = j5.bar.m(v0());
        boolean o = j5.bar.o(v0());
        boolean w = j5.bar.w(v0());
        java.util.List O = kotlin.collections.CollectionsKt.O(vf3.r.y(vf3.r.v(vf3.r.v(vf3.r.v(kotlin.collections.v.v(((qw2.b0) u0()).a()), ((qw2.b0) u0()).d()), ((qw2.b0) u0()).g()), (java.lang.String[]) kotlin.collections.t.r(new java.lang.String[]{"android.permission.READ_SMS", "android.permission.RECEIVE_SMS"}, ((qw2.b0) u0()).c()))));
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.z.q(O, 10));
        java.util.Iterator it = O.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            java.lang.String lowerCase = kotlin.text.y.s(str, "android.permission.", "", false).toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (g6.b.b(this, str) == 0) {
                z = true;
            }
            arrayList.add(new kotlin.Pair(lowerCase, java.lang.Boolean.valueOf(z)));
        }
        java.util.List G0 = kotlin.collections.CollectionsKt.G0(arrayList);
        fb3.bar barVar = new fb3.bar(10);
        barVar.a(new kotlin.Pair("Default Dialer", java.lang.Boolean.valueOf(m)));
        barVar.a(new kotlin.Pair("Default Messaging app", java.lang.Boolean.valueOf(w)));
        barVar.a(new kotlin.Pair("Default caller id", java.lang.Boolean.valueOf(o)));
        barVar.c(G0.toArray(new kotlin.Pair[0]));
        barVar.a(new kotlin.Pair("Draw on top", java.lang.Boolean.valueOf(t0().j())));
        barVar.a(new kotlin.Pair("Notification access", java.lang.Boolean.valueOf(t0().a())));
        barVar.a(new kotlin.Pair("Camera", java.lang.Boolean.valueOf(t0().g("android.permission.CAMERA"))));
        barVar.a(new kotlin.Pair("Microphone", java.lang.Boolean.valueOf(t0().g("android.permission.RECORD_AUDIO"))));
        barVar.a(new kotlin.Pair("Location", java.lang.Boolean.valueOf(t0().g("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"))));
        u03.b bVar = this.g0;
        if (bVar != null) {
            barVar.a(new kotlin.Pair("Battery opt disabled", java.lang.Boolean.valueOf(((u03.c) bVar).t())));
            java.util.ArrayList arrayList2 = barVar.a;
            java.util.Map i2 = kotlin.collections.r0.i((kotlin.Pair[]) arrayList2.toArray(new kotlin.Pair[arrayList2.size()]));
            android.widget.TableLayout tableLayout = this.h0;
            if (tableLayout != null) {
                tableLayout.removeAllViews();
                for (java.util.Map.Entry entry : i2.entrySet()) {
                    android.widget.TableRow tableRow = new android.widget.TableRow(this);
                    android.widget.TextView textView = new android.widget.TextView(this);
                    textView.setText((java.lang.CharSequence) entry.getKey());
                    android.widget.TextView textView2 = new android.widget.TextView(this);
                    textView2.setText("   " + entry.getValue());
                    java.lang.Integer num = -16711936;
                    java.lang.Boolean bool = (java.lang.Boolean) entry.getValue();
                    bool.getClass();
                    if (!bool.booleanValue()) {
                        num = null;
                    }
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -65536;
                    }
                    textView2.setTextColor(i);
                    tableRow.addView(textView);
                    tableRow.addView(new android.widget.Space(this));
                    tableRow.addView(textView2);
                    android.widget.TableLayout tableLayout2 = this.h0;
                    if (tableLayout2 != null) {
                        tableLayout2.addView(tableRow);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("statusView");
                        throw null;
                    }
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("statusView");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("deviceInfoUtil");
        throw null;
    }

    public final u03.z t0() {
        u03.z zVar = this.f0;
        if (zVar != null) {
            return zVar;
        }
        kotlin.jvm.internal.Intrinsics.n("permissionUtil");
        throw null;
    }

    public final qw2.a0 u0() {
        qw2.a0 a0Var = this.e0;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.Intrinsics.n("permissionsRequester");
        throw null;
    }

    public final android.app.role.RoleManager v0() {
        return com.huawei.hms.framework.common.bar.d(this.i0.getValue());
    }
}
