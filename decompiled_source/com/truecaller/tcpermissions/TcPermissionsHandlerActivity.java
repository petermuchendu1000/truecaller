package com.truecaller.tcpermissions;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/truecaller/tcpermissions/TcPermissionsHandlerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lqw2/y;", "<init>", "()V", "j0/b", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class TcPermissionsHandlerActivity extends com.truecaller.tcpermissions.Hilt_TcPermissionsHandlerActivity implements qw2.y {
    public static final /* synthetic */ int e0 = 0;
    public qw2.z d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qw2.y
    public final void finish() {
        super/*android.app.Activity*/.finish();
        overridePendingTransition(0, 0);
    }

    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        qw2.z t0 = t0();
        if (i == 5433) {
            t0.h = new qw2.j(t0.c2(), ((qw2.j) t0.h).b);
            qw2.y yVar = (qw2.y) t0.a;
            if (yVar != null) {
                yVar.finish();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.tcpermissions.Hilt_TcPermissionsHandlerActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.util.ArrayList<java.lang.String> arrayList;
        com.truecaller.tcpermissions.PermissionRequestOptions permissionRequestOptions;
        boolean z;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        getTheme().applyStyle(2132083915, false);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            arrayList = intent.getStringArrayListExtra("permissions");
        } else {
            arrayList = null;
        }
        android.content.Intent intent2 = getIntent();
        if (intent2 != null) {
            permissionRequestOptions = (com.truecaller.tcpermissions.PermissionRequestOptions) intent2.getParcelableExtra("options");
        } else {
            permissionRequestOptions = null;
        }
        t0().a = this;
        qw2.z t0 = t0();
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (qw2.y) t0.a;
        if (appCompatActivity != null) {
            if (arrayList == null) {
                appCompatActivity.finish();
                return;
            }
            t0.e = arrayList;
            if (permissionRequestOptions == null) {
                permissionRequestOptions = new com.truecaller.tcpermissions.PermissionRequestOptions(null, 7);
            }
            t0.f = permissionRequestOptions;
            arrayList.toString();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                java.lang.String str = (java.lang.String) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "permission");
                if (!f6.baz.m((com.truecaller.tcpermissions.TcPermissionsHandlerActivity) appCompatActivity, str)) {
                    arrayList2.add(obj);
                }
            }
            t0.g = kotlin.collections.CollectionsKt.K0(arrayList2);
            if (!z) {
                arrayList.toString();
                qw2.y yVar = (qw2.y) t0.a;
                if (yVar != null) {
                    yVar.requestPermissions((java.lang.String[]) arrayList.toArray(new java.lang.String[0]), 5432);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.tcpermissions.Hilt_TcPermissionsHandlerActivity
    public final void onDestroy() {
        if (isFinishing()) {
            qw2.z t0 = t0();
            qw2.d0 d0Var = (qw2.d0) t0.c;
            qw2.j jVar = (qw2.j) t0.h;
            d0Var.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "result");
            kotlin.jvm.functions.Function1 function1 = d0Var.j;
            if (function1 != null) {
                d0Var.j = null;
                function1.invoke(jVar);
            }
        }
        super.onDestroy();
    }

    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        androidx.appcompat.app.AppCompatActivity appCompatActivity;
        androidx.appcompat.app.AppCompatActivity appCompatActivity2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super/*androidx.fragment.app.FragmentActivity*/.onRequestPermissionsResult(i, strArr, iArr);
        qw2.z t0 = t0();
        u03.z zVar = (u03.z) t0.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "grantResults");
        if (i == 5432 && (appCompatActivity = (qw2.y) t0.a) != null) {
            boolean c2 = t0.c2();
            androidx.appcompat.app.AppCompatActivity appCompatActivity3 = (qw2.y) t0.a;
            boolean z = false;
            if (appCompatActivity3 != null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) t0.e;
                if (arrayList != null) {
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.String str = (java.lang.String) it.next();
                        if (!zVar.g(str)) {
                            java.util.Set set = (java.util.Set) t0.g;
                            if (set != null) {
                                if (set.contains(str)) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "permission");
                                    if (!f6.baz.m((com.truecaller.tcpermissions.TcPermissionsHandlerActivity) appCompatActivity3, str)) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("deniedPermissionCandidates");
                                throw null;
                            }
                        }
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.n("permissions");
                    throw null;
                }
            }
            t0.h = new qw2.j(c2, z);
            com.truecaller.tcpermissions.PermissionRequestOptions permissionRequestOptions = (com.truecaller.tcpermissions.PermissionRequestOptions) t0.f;
            if (permissionRequestOptions != null) {
                java.lang.Integer num = permissionRequestOptions.c;
                if (num != null) {
                    int intValue = num.intValue();
                    if (!zVar.g((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length)) && (appCompatActivity2 = (qw2.y) t0.a) != null) {
                        ak.r0.k0((com.truecaller.tcpermissions.TcPermissionsHandlerActivity) appCompatActivity2, intValue, (java.lang.String) null, 1, 2);
                    }
                }
                com.truecaller.tcpermissions.PermissionRequestOptions permissionRequestOptions2 = (com.truecaller.tcpermissions.PermissionRequestOptions) t0.f;
                if (permissionRequestOptions2 != null) {
                    if (permissionRequestOptions2.a && ((qw2.j) t0.h).b) {
                        androidx.appcompat.app.AppCompatActivity appCompatActivity4 = (com.truecaller.tcpermissions.TcPermissionsHandlerActivity) appCompatActivity;
                        try {
                            android.content.Intent data = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(android.net.Uri.fromParts("package", appCompatActivity4.getPackageName(), null));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                            appCompatActivity4.startActivityForResult(data, 5433);
                            return;
                        } catch (android.content.ActivityNotFoundException e) {
                            o82.a.B("App settings page couldn't be opened.", e);
                            qw2.y yVar = (qw2.y) t0.a;
                            if (yVar != null) {
                                yVar.finish();
                                return;
                            }
                            return;
                        }
                    }
                    qw2.y yVar2 = (qw2.y) t0.a;
                    if (yVar2 != null) {
                        yVar2.finish();
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("options");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("options");
            throw null;
        }
    }

    public final qw2.z t0() {
        qw2.z zVar = this.d0;
        if (zVar != null) {
            return zVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }
}
